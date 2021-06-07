package kodlamaio.hrms.core.utilities.auth;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.User;

@Service
public class AdminAuthManager implements AdminAuthService {

	@Override
	public boolean adminCheckUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
