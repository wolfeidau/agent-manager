package au.id.wolfe.am.service.webservice.agent.api;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Response wrapper for register agent operation.
 */
@XmlRootElement(namespace = AgentWebService.AGENT_NAMESPACE)
public class RegisterAgentResponse implements Serializable {
}
