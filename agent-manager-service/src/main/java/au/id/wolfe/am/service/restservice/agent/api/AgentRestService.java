package au.id.wolfe.am.service.restservice.agent.api;

import au.id.wolfe.am.service.webservice.agent.api.RegisterAgentRequest;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Agent REST Service Interface
 */
@Transactional(readOnly = true)
@Path("/agent")
public interface AgentRestService{

    @POST
    public Response registerAgent(final RegisterAgentRequest registerAgentRequest);

}
