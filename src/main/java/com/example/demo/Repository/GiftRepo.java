package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.GiftEntity;

public interface GiftRepo extends JpaRepository<GiftEntity, Integer> {

	@Query(value="select * from gift_table where gprice<=:s",nativeQuery = true)
	public List<GiftEntity> sortgprice(@Param("s") String gprice);
	
	@Query(value="select * from gift_table where gprice>=:s",nativeQuery = true)
	public List<GiftEntity> sortgpricehigh(@Param("s") String gprice);
}
