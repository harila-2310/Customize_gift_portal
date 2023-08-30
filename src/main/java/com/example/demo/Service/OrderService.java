package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.RegisterEntity;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.Repository.RegisterRepo;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

	@Autowired
	OrderRepo or;
	@Autowired
	RegisterRepo rr;
	
	public List<OrderEntity> showinfo()
	{
		return or.findAll();
	}
	
	public List<OrderEntity> postinfo(List<OrderEntity> oe)
	{
		return or.saveAll(oe);
	}
	public void deletebyid(int id)
	{
		or.deleteById(id);
	}
	
	public Integer deletedetails(int id)
	{
		return or.deleteOrder(id);
	}
	@Transactional
	public void fillname()
	{
		List<OrderEntity> oe=or.findAll();
		List<RegisterEntity> re=rr.findAll();
		for(OrderEntity h:oe) {
			 for(RegisterEntity per:re) {
				 if(offersmatch(per.getUser_id(),h.getCust_id())) {
					 h.setName(per.getName());
					 h.setAddress(per.getAddress());;
					 break;
				 }
			 }
		 }
	 
	}
	private boolean offersmatch(int i,int j) {
		 if(i==(j)) {
			 return true;
		 }
		 return false;
	 }
		
		}

