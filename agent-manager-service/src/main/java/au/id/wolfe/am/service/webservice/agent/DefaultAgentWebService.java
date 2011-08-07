package au.id.wolfe.am.service.webservice.agent;

import au.id.wolfe.am.service.webservice.agent.api.AgentWebService;
import au.id.wolfe.am.service.webservice.agent.api.RegisterAgentRequest;
import au.id.wolfe.am.service.webservice.agent.api.RegisterAgentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of the Agent Web Service.
 */
public class DefaultAgentWebService implements AgentWebService {

    private final Logger log = LoggerFactory.getLogger(DefaultAgentWebService.class);

    public RegisterAgentResponse registerAgent(final RegisterAgentRequest registerAgentRequest) {
        log.info("Register agent request - businessName = " + registerAgentRequest.agent.businessName);

        return new RegisterAgentResponse();
    }

}
