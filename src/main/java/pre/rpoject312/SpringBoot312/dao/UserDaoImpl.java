package pre.rpoject312.SpringBoot312.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pre.rpoject312.SpringBoot312.model.User;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {

        return entityManager.createQuery("FROM User ", User.class).getResultList();
    }

    @Override
    public User getUser(int id) {

        return entityManager.find(User.class, id);
    }

    @Override
    public void edit(int id, User user) {
        entityManager.merge(user);
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getUser(id));
    }
}
