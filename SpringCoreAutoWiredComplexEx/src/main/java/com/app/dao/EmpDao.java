package com.app.dao;

import org.springframework.stereotype.Component;

interface IEmpDao{
	
	void save();
	
}

@Component
public class EmpDao implements IEmpDao {

    @Override
    public void save() {
        System.out.println("Dao");
    }
}
