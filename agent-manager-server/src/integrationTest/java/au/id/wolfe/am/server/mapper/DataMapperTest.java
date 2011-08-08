package au.id.wolfe.am.server.mapper;

import au.id.wolfe.am.server.domain.Agent;
import au.id.wolfe.am.server.service.api.AgentData;
import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class DataMapperTest {

    Mapper dataObjectMapper;

    final Long agentId = 123l;
    final String agentKey = "123LL34EI";
    final String businessName = "Kmart Burwood";
    final String location = "Burwood";

    @Before
    public void setup() {
        dataObjectMapper = new DozerBeanMapper(Lists.newArrayList("config/agent-manager-object-mapping.xml"));
    }

    @Test
    public void shouldBeAbleToMapAgentDataToAgentWithoutAgentId() {
        AgentData agentData = dataObjectMapper.map(createValidAgent(), AgentData.class);

        assertEquals(agentId, agentData.agentId);
        assertEquals(agentKey, agentData.agentKey);
        assertEquals(businessName, agentData.businessName);
        assertEquals(location, agentData.location);
    }

    private Agent createValidAgent() {
        Agent agent = new Agent();
        agent.setId(agentId);
        agent.setAgentKey(agentKey);
        agent.setBusinessName(businessName);
        agent.setLocation(location);

        return agent;
    }
}
