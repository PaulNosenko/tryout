package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import api.entity.Car;
import api.entity.User;
import api.repo.CarRepo;
import api.repo.UserRepo;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CarRepo carRepo;
	
	@GetMapping(path = "/users")
	public List<User> users(){
		return userRepo.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public User usersById(@PathVariable long id){
		return userRepo.findOne(id);
	}
	
	@GetMapping(path = "/cars")
	public List<Car> cars(){
		return carRepo.findAll();
	}
	
	@GetMapping(path = "/cars/{id}")
	public Car carsById(@PathVariable long id){
		return carRepo.findOne(id);
	}
	
	
}
