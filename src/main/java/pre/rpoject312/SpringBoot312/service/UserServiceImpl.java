package pre.rpoject312.SpringBoot312.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pre.rpoject312.SpringBoot312.dao.UserDao;
import pre.rpoject312.SpringBoot312.model.User;


import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //@Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.getAllUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void edit(int id, User user) {
        userDao.edit(id, user);
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
