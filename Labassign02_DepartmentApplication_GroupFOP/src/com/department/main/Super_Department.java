package com.department.main;

import com.department.tech.*;
import com.department.admin.Admin_Department;
import com.department.hr.Hr_Department;

public class Super_Department {

	
	public static String departmentName() {
		
	return("Super Department");
		
	}
	
	public static String getTodaysWork() {
		
		return(" No Work as of now ");
			
		}
	
	public static String getWorkDeadline() {
		
		return("Nil");
			
		}
	
	public static String isTodayAHoliday() {
		
		return("Today is not a Holiday");
			
		}
	public static void main(String[] args) {
		
		Admin_Department a = new Admin_Department();
		System.out.println("\n"+a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday()+"\n");
		
		Hr_Department h = new Hr_Department();
		System.out.println(h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday()+"\n");
		
		Tech_Department t = new Tech_Department();
		System.out.println(t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.doActivity());
		System.out.println(t.isTodayAHoliday()+"\n");
		
		
		
	}

}
