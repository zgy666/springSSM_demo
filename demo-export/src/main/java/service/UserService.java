package service;


import com.demo.domain.User;

public interface UserService {

    ExecuteResult<User> getUserById(Long id);

}
