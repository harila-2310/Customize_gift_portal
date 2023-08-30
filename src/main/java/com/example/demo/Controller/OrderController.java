package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Service.OrderService;


@RestController
public class OrderController {

	@Autowired
	OrderService os;
	
	@GetMapping("fillname")
	public String fill()
	{
		os.fillname();
		return "updated";
	}
	@GetMapping("orders")
	public List<OrderEntity> showord()
	{
		return os.showinfo();
	}
	
	@PostMapping("neworder")
	public List<OrderEntity> postord(@RequestBody List<OrderEntity> oe)
	{
		return os.postinfo(oe);
	}
	
	@DeleteMapping("deleteorder/{id}")
	public String deleteord(@PathVariable int id)
	{
		os.deletebyid(id);
		return "order_id : "+id+" is cancelled SuccesFully";
	}
	
	@DeleteMapping("deleteorderby/{id}")
	public String deleteinfo(@PathVariable("id") int s)
	{
		return os.deletedetails(s)+"Deleted";
	}
	
	
}
