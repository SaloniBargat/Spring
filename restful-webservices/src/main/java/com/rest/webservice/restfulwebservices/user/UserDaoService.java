package com.rest.webservice.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static Long usersCount = 0;
	static {
		users.add(new User(++usersCount,"Shruti",LocalDate.now().minusYears(21)));
		users.add(new User(++usersCount,"Dipika",LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount,"Saloni",LocalDate.now().minusYears(31)));
		users.add(new User(++usersCount,"Kalyani",LocalDate.now().minusYears(12)));
		
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(Long id) {
		Predicate<? super User> predicate = user ->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
	
	

}
