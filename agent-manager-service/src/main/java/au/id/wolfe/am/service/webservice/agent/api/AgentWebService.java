package au.id.wolfe.am.service.webservice.agent.api;

import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Agent Web Service Interface
 */
@Transactional(readOnly = true)
@WebService(serviceName = "agentService", targetNamespace = AgentWebService.AGENT_NAMESPACE)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AgentWebService {

    public static final String AGENT_NAMESPACE = "http://wolfe.id.au/am/service/agent";

    @WebMethod
    public RegisterAgentResponse registerAgent(final RegisterAgentRequest registerAgentRequest);
}
