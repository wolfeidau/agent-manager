package au.id.wolfe.am.server.service;

import au.id.wolfe.am.server.dao.AgentDao;
import au.id.wolfe.am.server.domain.Agent;
import au.id.wolfe.am.server.service.api.AgentData;
import au.id.wolfe.am.server.service.api.AgentService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;


/**
 * Agent Service layer.
 */
@Service
public class DefaultAgentService implements AgentService {

    @Autowired
    public AgentDao agentDao;

    @Autowired
    private Mapper dataObjectMapper;

    @Override
    public AgentData registerAgent(AgentData agentData) {

        Agent createdAgent = dataObjectMapper.map(agentData, Agent.class);

        createdAgent = agentDao.save(createdAgent);

        return dataObjectMapper.map(createdAgent, AgentData.class);
    }
}
