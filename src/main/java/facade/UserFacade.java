package facade;

import entities.User;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by sergy on 15-Feb-17.
 */

@Stateless
public class UserFacade {

    @PersistenceContext(name = "PU")
    private EntityManager entityManager;

    public User getUser(Long id) {
       return entityManager.find(User.class, id);
    }

    public List<User> findAllUsers() {
        CriteriaQuery criteriaQuery = entityManager
                .getCriteriaBuilder()
                .createQuery();
        criteriaQuery.select(criteriaQuery.from(User.class));

        return entityManager.createQuery(criteriaQuery).getResultList();


    }

}
