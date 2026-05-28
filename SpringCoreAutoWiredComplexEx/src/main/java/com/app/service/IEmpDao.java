package com.app.service;

import org.springframework.stereotype.Component;

interface IEmpDao{

	 void save();
	
}

@Component
public class EmpService implements IEmpService {
	
	IEmpDao dao;

    @Override
    public void checklogic() {
        System.out.println("Service");
    }
}
