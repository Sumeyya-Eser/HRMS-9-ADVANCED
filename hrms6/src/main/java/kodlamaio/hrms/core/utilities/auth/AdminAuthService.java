package kodlamaio.hrms.core.utilities.auth;

import kodlamaio.hrms.entities.concretes.User;

public interface AdminAuthService {
	boolean adminCheckUser(User user);

}
