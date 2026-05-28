package com.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface IEmpService{

	 void checklogic();
	
}

@Component
public class EmpService implements IEmpService {
	
	IEmpDao dao;

    @Override
    public void checklogic() {
        System.out.println("Service");
    }
}
