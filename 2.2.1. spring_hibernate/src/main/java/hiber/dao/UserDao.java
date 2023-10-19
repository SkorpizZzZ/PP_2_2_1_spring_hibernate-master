package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {

   User getUserByCar(String model, Integer series);

   void add(User user, Car car);
   List<User> listUsers();
}
