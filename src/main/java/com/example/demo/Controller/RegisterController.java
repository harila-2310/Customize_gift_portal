package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.RegisterEntity;
import com.example.demo.Service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	RegisterService rs;
	
	@GetMapping("users")
	public List<RegisterEntity> show()
	{
		return rs.showinfo();
	}
	
	@PostMapping("register")
	public List<RegisterEntity> put(@RequestBody List<RegisterEntity> re)
	{
		return rs.postinfo(re);
	}
	@PutMapping("update/{id}")
	public String modify(@PathVariable int id,@RequestBody RegisterEntity re)
	{
		return rs.updateinfobyid(id, re);
	}
}
