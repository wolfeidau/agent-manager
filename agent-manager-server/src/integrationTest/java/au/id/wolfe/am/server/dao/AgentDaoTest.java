package au.id.wolfe.am.server.dao;

import au.id.wolfe.am.server.domain.Agent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.Assert.assertNotNull;

/**
 * Integration test for the Agent data access object.
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/agent-manager-server-config.xml"})
public class AgentDaoTest {

    private final Logger log = LoggerFactory.getLogger(AgentDaoTest.class);

    @Autowired
    AgentDao agentDao;

    @Test
    public void testShouldCreateNewRecordWithCompleteSetOfAttributes() {

        Agent newAgent = agentDao.save(createValidAgent());

        log.info("Saved - " + newAgent.toString());

        assertNotNull(newAgent);
    }

    private Agent createValidAgent() {
        Agent agent = new Agent();

        agent.setAgentKey("123LL34EI");
        agent.setBusinessName("Kmart Burwood");
        agent.setLocation("Burwood, Victoria, Australia");

        return agent;
    }
}
