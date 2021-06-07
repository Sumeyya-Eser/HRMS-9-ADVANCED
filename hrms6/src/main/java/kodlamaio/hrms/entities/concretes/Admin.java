package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;


@Table(name="admins")
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Admin extends User {
	
	public Admin(int id, String email, String password) {
		super(id, email, password);
	}

	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String name;
	
	@Column(name="surname")
	private String surname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

	

}
