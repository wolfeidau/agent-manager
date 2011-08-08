package au.id.wolfe.am.server.service.api;

import java.io.Serializable;

/**
 * Agent data transfer object for service layer.
 */
public class AgentData implements Serializable{

    public Long agentId;
    public String agentKey;
    public String location;
    public String businessName;

    public AgentData() {
    }

    public AgentData(Long agentId, String agentKey, String location, String businessName) {
        this.agentId = agentId;
        this.agentKey = agentKey;
        this.location = location;
        this.businessName = businessName;
    }
}
