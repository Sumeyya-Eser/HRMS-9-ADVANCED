package kodlamaio.hrms.core.utilities.auth;

import kodlamaio.hrms.entities.concretes.User;

public interface PersonCheckService {

	 boolean CheckIfRealPerson(User user);
}
