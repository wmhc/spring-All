package service;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserDaoImpll;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUserDao() {
        userDao.getUser();
    }
}
