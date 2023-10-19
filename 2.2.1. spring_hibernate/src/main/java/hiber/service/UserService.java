package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    User getUserByCar(String model, Integer series);
    void add(User user, Car car);
    List<User> listUsers();
}
