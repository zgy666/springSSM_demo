package service;


import com.demo.common.ExecuteResult;
import com.demo.domain.User;

public interface UserService {

    ExecuteResult<User> getUserById(Long id);

}
