package au.id.wolfe.am.server.dao.jpa;

import au.id.wolfe.am.server.dao.AgentDao;
import au.id.wolfe.am.server.domain.Agent;
import org.springframework.stereotype.Repository;

/**
 * The implementation of AgentDao using JPA.
 */
@Repository
public class AgentDaoImpl extends GenericDaoImpl<Agent, Long> implements
        AgentDao {

    public AgentDaoImpl() {
        super(Agent.class);
    }
}
