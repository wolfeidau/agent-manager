package au.id.wolfe.am.service.restservice.agent;

import au.id.wolfe.am.service.restservice.agent.api.AgentRestService;
import au.id.wolfe.am.service.webservice.agent.api.RegisterAgentRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

/**
 *
 */
public class DefaultAgentRestService implements AgentRestService {

    private final Logger log = LoggerFactory.getLogger(DefaultAgentRestService.class);

    public Response registerAgent(final RegisterAgentRequest registerAgentRequest) {
        log.info("Register agent request - businessName = " + registerAgentRequest.agent.businessName);

        return Response.ok().build();
    }
}
