package com.cg.mobshop.dao;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;

public interface MobileDao {
	public List<Mobiles> getAllMobiles();
	public Mobiles getMobileDetails(int mobid);
	public int updateMobile(Mobiles mob);
	public List<Mobiles> deleteMobile(int mobid);
	public Mobiles insert(Mobiles mobile);
	public Mobiles fetch(int mobid);
}
