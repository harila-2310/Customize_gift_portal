package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.RegisterEntity;
import com.example.demo.Repository.RegisterRepo;

@Service
public class RegisterService {

	@Autowired
	RegisterRepo rr;
	
	public List<RegisterEntity> showinfo()
	{
		return rr.findAll();
	}
	
	public List<RegisterEntity> postinfo(List<RegisterEntity> re)
	{
		return rr.saveAll(re);
	}
	public String updateinfobyid(int id,RegisterEntity re)
	{
		rr.saveAndFlush(re);
		if(rr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Not Updated";
		}
	}
}
