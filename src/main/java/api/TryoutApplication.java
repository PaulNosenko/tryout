package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import api.entity.Car;
import api.entity.User;
import api.repo.CarRepo;
import api.repo.UserRepo;

@SpringBootApplication
public class TryoutApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TryoutApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CarRepo carRepo;
	
	@Override
	public void run(String... strings) throws Exception {

		userRepo.save(new User("a@gmail.com", "name1", null));
		userRepo.save(new User("b@gmail.com", "name2", null));
		userRepo.save(new User("c@gmail.com", "name3", null));
		
		carRepo.save(new Car("MERCEDES", userRepo.findByEmail("a@gmail.com")));
		carRepo.save(new Car("LR", userRepo.findByEmail("a@gmail.com")));
		carRepo.save(new Car("jaguar", userRepo.findByEmail("c@gmail.com")));
		
	}

}

