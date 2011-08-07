package au.id.wolfe.am.server.domain;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * This entity which represents a agent for an online service. Each time the agent performs an action the agent id
 * is required this enables trace back to this organisation/individual.
 */
@Entity(name = "AGENT")
public class Agent {

    @Id
    @GeneratedValue
    private Long Id;

    @NotNull(message = "may not be null")
    private String agentKey;

    @NotNull(message = "may not be null")
    private String location;

    @NotNull(message = "may not be null")
    private String businessName;

    public Agent() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAgentKey() {
        return agentKey;
    }

    public void setAgentKey(String agentKey) {
        this.agentKey = agentKey;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("Id", Id).
                append("agentKey", agentKey).
                append("location", location).
                append("businessName", businessName).
                toString();
    }
}
