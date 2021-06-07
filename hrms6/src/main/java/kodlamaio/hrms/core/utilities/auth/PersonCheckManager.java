package kodlamaio.hrms.core.utilities.auth;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.User;

@Service
public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
