package au.id.wolfe.am.service.webservice.agent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

/**
 * Agent DTO for the webservice API.
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Agent implements Serializable{

    public Long Id;
    public String agentKey;
    public String location;
    public String businessName;

}
