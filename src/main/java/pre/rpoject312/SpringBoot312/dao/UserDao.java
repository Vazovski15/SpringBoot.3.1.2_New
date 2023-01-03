package pre.rpoject312.SpringBoot312.dao;



import pre.rpoject312.SpringBoot312.model.User;

import java.util.List;

public interface UserDao {
    User getUser(int id);

    List<User> getAllUsers();

    void edit(int id, User user);

    void add(User user);

    void delete(int id);
}
