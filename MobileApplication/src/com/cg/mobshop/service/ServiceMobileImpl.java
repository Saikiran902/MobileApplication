package com.cg.mobshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mobshop.dao.MobileDao;
import com.cg.mobshop.dto.Mobiles;
@Service("service")
@Transactional
public class ServiceMobileImpl implements MobileService {
    
	@Autowired
    MobileDao dao;
	@Override
	public List<Mobiles> getAllMobiles() {
		// TODO Auto-generated method stub
		return dao.getAllMobiles();
	}
	@Override
	public Mobiles getMobileDetails(int mobid) {
		// TODO Auto-generated method stub
		return dao.getMobileDetails(mobid);
	}
	@Override
	public int updateMobiles(Mobiles mob) {
		// TODO Auto-generated method stub
		return dao.updateMobile(mob);
	}
	@Override
	public List<Mobiles> deleteMobile(int mobid) {
		// TODO Auto-generated method stub
		return dao.deleteMobile(mobid);
	}
	@Override
	public Mobiles insert(Mobiles mobile) {
		// TODO Auto-generated method stub
		return dao.insert(mobile);
	}
	@Override
	public Mobiles fetch(int mobid) {
		// TODO Auto-generated method stub
		return dao.fetch(mobid);
	}

}
