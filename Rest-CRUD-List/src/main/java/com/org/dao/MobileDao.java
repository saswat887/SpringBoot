package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.org.dto.Mobile;
import com.org.dto.Mobile;


@Component
public class MobileDao {
	private static ArrayList<Mobile> list=new ArrayList<>();
	 static {
		 list.add(new Mobile(1, "Samsung", "S24", 100000) );
		 list.add(new Mobile(2, "Apple", "Iphone 16", 100000) );
		 list.add(new Mobile(3, "One Plus", "9T", 100000) );
		 list.add(new Mobile(4, "Google", "Pixel 7", 100000) );
		 list.add(new Mobile(5, "Xiomi", "10", 100000) );
	 }
	public String saveMobile(Mobile mobile)
	{
		list.add(mobile);
		return "Data Stored Successfully";
	}
	public Mobile fetchMobileById(int id)
	{
		for (Mobile mobile : list) {
			if(mobile.getId()==id)
				return mobile;
		}
		return null;
	}
	public List<Mobile> fetchAllMobile(){
		return list;
	}
	public boolean deleteMobileById(int id) {
		Mobile mobile=null;
		for (Mobile mobile2 : list) {
			if(mobile2.getId()==id)
				mobile=mobile2;
		}
		if(mobile!=null)
		{
			list.remove(mobile);
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
