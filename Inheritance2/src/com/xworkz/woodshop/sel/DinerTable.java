package com.xworkz.woodshop.sel;

import com.xworkz.woodshop.design.Furniture;

public class DinerTable extends Furniture {

	public String color = "White";
	protected String shopName = "KTM";

	public DinerTable() {

		System.out.println("invoked no-org cons from dinerTable");
		System.out.println(super.shopName);

	}

}
