package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant persistentRestaurant=restaurantRepository.save(restaurant);
		return persistentRestaurant;
	}
	@GetMapping("/getAll")
	public List<Restaurant> getAll(){
		List<Restaurant> listofrestaurants=restaurantRepository.findAll();
		return listofrestaurants;
	}
}
/*	@PostMapping("/restaurant/create")
	public Restaurant createRestaurant(@RequestBody Restaurant user)
	{
		System.out.println(user.toString());
		return user;
	}
	@GetMapping("/restaurant/getall")
	public List <Restaurant> listallRestaurants()
	{
		List<Restaurant> users=new ArrayList<>();
		Restaurant usr1,usr2,usr3;
		usr1=new Restaurant("Arya","abc123",5,94326,"yahoo.com");
		usr2=new Restaurant("Joey","xyz122",4,96523,"google.com");
		usr3=new Restaurant("Chandler","woopah",3,96532,"wikipedia.com");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
	}
	@PostMapping("/restaurant/additems")
	public Items addItems(@RequestBody Items user)
	{
		System.out.println(user.toString());
		return user;
	}
}
*/
