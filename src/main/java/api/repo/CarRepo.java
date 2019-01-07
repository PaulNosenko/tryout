package api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long>{

}
