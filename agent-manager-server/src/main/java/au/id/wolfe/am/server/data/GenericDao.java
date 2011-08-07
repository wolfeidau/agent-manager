package au.id.wolfe.am.server.data;

import java.io.Serializable;
import java.util.Set;

/**
 * Generic data access object for Entities.
 */
public interface GenericDao<T, PK extends Serializable> {

    /**
     * Update an existing entity.
     *
     * @param entity Existing Entity to update.
     * @return The entity updated.
     */
    T update(T entity);

    /**
     * Save a newly created entity.
     *
     * @param entity New Entity
     * @return The new saved entity.
     */
    T save(T entity);

    /**
     * Remove an Entity by it's id.
     *
     * @param entityId The id of the entity to remove.
     */
    void removeById(PK entityId);

    /**
     * Locate an Entity by it's id field.
     *
     * @param entityId The id of the entity to search for.
     * @return The entity found.
     */
    T findById(PK entityId);

    /**
     * Find all Entities.
     *
     * @return A set containing all Entities.
     */
    Set<T> findAll();
}
