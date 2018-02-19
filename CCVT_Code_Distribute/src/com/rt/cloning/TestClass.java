package com.rt.cloning;

public class TestClass {
//changes done
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	Department d1=new Department(5, "MD"); // Change from 7 to 5 and HR to MD
	Employee e1=new Employee(3, "Sham",d1); // 1 to 3 from Ram to Sham
	Employee e2= e1.clone();
	

	
	System.out.println(e1);
	System.out.println(e2);
	e2.setEid(3);
	e2.setEname("Harry"); // Shyam to Harry
	e2.getDep().setDid(8);
	e2.getDep().setDname("Math"); // Acc to Math
	System.out.println(e1);
	System.out.println(e2);

	System.out.println(e1 instanceof Cloneable);

	}

}
