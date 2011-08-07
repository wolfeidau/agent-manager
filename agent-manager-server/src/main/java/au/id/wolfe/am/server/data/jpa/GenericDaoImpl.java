package au.id.wolfe.am.server.data.jpa;

import au.id.wolfe.am.server.data.GenericDao;
import com.google.common.collect.Sets;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.Set;

/**
 * Implementation of the generic data access object which uses JPA.
 */
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    @PersistenceContext
    private EntityManager entityManager;

    private Class<T> type;

    public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

    /**
     * @param entityManager the entityManager to set
     */
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T update(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public void removeById(PK entityId) {
        entityManager
                .createQuery(
                        "DELETE FROM " + type.getName()
                                + " e WHERE e.id = :entityId")
                .setParameter("entityId", entityId).executeUpdate();

    }

    @Override
    @SuppressWarnings("unchecked")
    public T findById(PK entityId) {
        return (T) entityManager
                .createQuery(
                        "SELECT e FROM " + type.getName()
                                + " e WHERE e.id = :entityId")
                .setParameter("entityId", entityId).getSingleResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Set<T> findAll() {
        return Sets.newLinkedHashSet(entityManager.createQuery(
                "SELECT e FROM " + type.getName() + " e").getResultList());
    }
}
