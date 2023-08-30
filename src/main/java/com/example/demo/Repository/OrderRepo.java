package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.OrderEntity;

import jakarta.transaction.Transactional;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

	@Modifying
	@Transactional
	@Query(value="delete from order_entity where o_id=:s",nativeQuery=true)
	public 	Integer deleteOrder (@Param("s") int id);
}
