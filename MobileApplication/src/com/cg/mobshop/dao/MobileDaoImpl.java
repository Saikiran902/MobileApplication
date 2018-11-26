package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mobshop.dto.Mobiles;
@Repository("dao")
public class MobileDaoImpl implements MobileDao {
    @PersistenceContext
    EntityManager manager;
	
    @Override
	public List<Mobiles> getAllMobiles() {
		// TODO Auto-generated method stub
    	String str="select mobile from Mobiles mobile";
    	TypedQuery<Mobiles> query = manager.createQuery(str,Mobiles.class);
		return query.getResultList();
	}

	@Override
	public Mobiles getMobileDetails(int mobid) {
		// TODO Auto-generated method stub
		Mobiles mobile = manager.find(Mobiles.class, mobid);
		return mobile;
	}

	@Override
	public int updateMobile(Mobiles mob) {
		// TODO Auto-generated method stub
		manager.merge(mob);
		return mob.getMobileId();
	}

	@Override
	public List<Mobiles> deleteMobile(int mobid) {
		// TODO Auto-generated method stub
		Mobiles mobile = getMobileDetails(mobid);
		manager.remove(mobile);
		return getAllMobiles();
	}

	@Override
	public Mobiles insert(Mobiles mobile) {
		// TODO Auto-generated method stub
		manager.persist(mobile);
		manager.flush();
		return mobile;
		

		
	}

	@Override
	public Mobiles fetch(int mobid) {
		// TODO Auto-generated method stub
		Mobiles m = manager.find(Mobiles.class, mobid);
		return m;
	}

}
