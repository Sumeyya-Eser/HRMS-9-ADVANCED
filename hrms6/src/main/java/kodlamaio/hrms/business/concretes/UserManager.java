package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service 
public class UserManager implements UserService{
	
	private UserDao userDao;
	
    @Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll()+ "All users were listed");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("Adding was successfull");
	}

}
