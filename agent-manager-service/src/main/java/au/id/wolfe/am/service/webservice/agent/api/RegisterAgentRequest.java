package au.id.wolfe.am.service.webservice.agent.api;

import au.id.wolfe.am.service.webservice.agent.Agent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Request wrapper for register agent operation.
 */
@XmlRootElement(namespace = AgentWebService.AGENT_NAMESPACE)
public class RegisterAgentRequest implements Serializable{

    @XmlElement
    public Agent agent;

}
