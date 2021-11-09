package com.xwork.inheritance.tester;

import com.xworkz.woodshop.design.ComputerTable;
import com.xworkz.woodshop.design.Furniture;
import com.xworkz.woodshop.sel.DinerTable;

public class FurnitureStarter {

	public static void main(String[] args) {

		ComputerTable computerTable = new ComputerTable();
		System.out.println(computerTable.color);

		DinerTable dinerTable = new DinerTable();
		System.out.println(dinerTable.color);

	}

}
