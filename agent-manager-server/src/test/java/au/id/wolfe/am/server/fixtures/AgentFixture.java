package au.id.wolfe.am.server.fixtures;

import au.id.wolfe.am.server.domain.Agent;

/**
 *
 */
public final class AgentFixture {

    public static Agent createAgent(){
        Agent agent = new Agent();

        agent.setAgentKey("123LL34EI");
        agent.setBusinessName("Kmart Burwood");
        agent.setLocation("Burwood, Victoria, Australia");

        return agent;
    }
}
