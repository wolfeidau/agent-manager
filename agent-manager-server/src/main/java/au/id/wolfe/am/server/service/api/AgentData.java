package au.id.wolfe.am.server.service.api;

import java.io.Serializable;

/**
 * Agent data transfer object for service layer.
 */
public class AgentData implements Serializable{

    public Long Id;
    public String agentKey;
    public String location;
    public String businessName;

    public AgentData(Long id, String agentKey, String location, String businessName) {
        Id = id;
        this.agentKey = agentKey;
        this.location = location;
        this.businessName = businessName;
    }
}
