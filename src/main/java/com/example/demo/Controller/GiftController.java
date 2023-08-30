package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.GiftEntity;
import com.example.demo.Service.GiftService;

@RestController
public class GiftController {

	@Autowired
	GiftService gs;
	
	@GetMapping("show")
	public List<GiftEntity> getinfo()
	{
		return gs.showInfo();
	}
	
	@PostMapping("post")
	public List<GiftEntity> showinfo(@RequestBody List<GiftEntity> ge)
	{
		return gs.saveInfo(ge);
	}
	
	@GetMapping("show/{id}")
	public Optional<GiftEntity> showbyid(@PathVariable int id)
	{
		return gs.getById(id);
	}
	
	@PutMapping("update")
	public GiftEntity update(@RequestBody GiftEntity ge)
	{
		return gs.putinfo(ge);
	}
	
	@DeleteMapping("delete")
	public String deletegif(@RequestBody GiftEntity ge)
	{
		gs.deleteinfo(ge);
		return "deleted Successfully";
	}
	
	@DeleteMapping("delete/{id}")
	public String deletegifid(@PathVariable int id)
	{
		gs.deleteid(id);
		return "id :"+id+" is deleted successfully";
	}
	
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<GiftEntity> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return gs.getbypage(pageno, pagesize);
	}
	@GetMapping("sort/{name}")
    public List<GiftEntity> getsortinfo(@PathVariable String name)
    {
   	 return gs.sortinfo(name);
    }
	@GetMapping("/hightolow/gprice/{gprice}")
	public List<GiftEntity> getgprice(@PathVariable("gprice") String s)
	{
		return gs.getbygprice(s);
	}
	@GetMapping("/lowtohigh/gprice/{gprice}")
	public List<GiftEntity> getgpriceh(@PathVariable("gprice") String s)
	{
		return gs.getbygpriceh(s);
	}

}
