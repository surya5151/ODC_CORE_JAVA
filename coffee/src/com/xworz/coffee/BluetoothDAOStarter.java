package com.xworz.coffee;

import com.xworkz.coffee.dao.BluetoothDAO;
import com.xworkz.coffee.dto.BluetoothDTO;

public class BluetoothDAOStarter {

	public static void main(String[] args) {

		BluetoothDAO dao = new BluetoothDAO();
		dao.add(null);

		BluetoothDTO bluetoothDTO = new BluetoothDTO("Nokia", "Block", 200, 40);

		dao.add(bluetoothDTO);

		BluetoothDTO bluetoothDTO2 = new BluetoothDTO("vivo", "white", 100, 10);

		dao.add(bluetoothDTO2);

		BluetoothDTO BluetoothDTO3 = new BluetoothDTO("oppo", "white", 400, 40);
		dao.add(BluetoothDTO3);
		dao.add(BluetoothDTO3);
		dao.add(BluetoothDTO3);
		
		dao.delete(2);
	}

}
