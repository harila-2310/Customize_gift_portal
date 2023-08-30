package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.GiftEntity;
import com.example.demo.Repository.GiftRepo;

@Service
public class GiftService {
     @Autowired
     GiftRepo gr;
     
     public List<GiftEntity> showInfo()
     {
    	 return gr.findAll();
     }
     
     public List<GiftEntity> saveInfo(List<GiftEntity> ge)
     {
    	 return gr.saveAll(ge);
     }
     public Optional<GiftEntity> getById(int id)
     {
    	 return gr.findById(id);
     }
     public GiftEntity putinfo(GiftEntity ge)
     {
    	 return gr.saveAndFlush(ge);
     }
     
     public void deleteinfo(GiftEntity ge)
     {
    	 gr.delete(ge);
     }
     public void deleteid(int id)
     {
    	 gr.deleteById(id);
     }
     public List<GiftEntity> getbypage(int pgno,int pgsize)
 	{
 		Page<GiftEntity> p=gr.findAll(PageRequest.of(pgno, pgsize));
 		return p.getContent();
 	}
     public List<GiftEntity> sortinfo(String s)
 	{
 		return gr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
 	}
    public List<GiftEntity> getbygprice(String s)
    {
    	return gr.sortgprice(s);
    }
    public List<GiftEntity> getbygpriceh(String s)
    {
    	return gr.sortgpricehigh(s);
    }
}
