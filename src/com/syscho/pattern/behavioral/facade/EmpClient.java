package com.syscho.pattern.behavioral.facade;

class EmpDao {

    public void add(Object emp) {
        //add logic
    }

}

//Service /Controller work life facade
class EmpFace {

    void insert(Object emp) {
        EmpDao empDao = new EmpDao();
        empDao.add(emp);
    }

}

public class EmpClient {
    public static void main(String[] args) {
        EmpFace empFace = new EmpFace();
        empFace.insert(null);
    }
}
