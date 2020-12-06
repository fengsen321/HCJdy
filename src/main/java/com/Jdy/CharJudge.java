/**
 * 
 */
package com.Jdy;

import java.io.IOException;
import de.re.easymodbus.exceptions.ModbusException;


interface OnStatus{
	void onst() throws Exception, ModbusException, IOException, Exception;
}

interface OffStatus{
	void offst() throws Exception, ModbusException, IOException, Exception;
}

class OnS implements OnStatus{
	
	 public void onst() throws Exception, ModbusException, IOException, Exception {
		 ApiTest apiTest = new ApiTest();
		 
		 apiTest.JSONObjectToJSONString();
		 
		
		if(ApiTest.userNameON.contains("TY-1302ÏòÔ¶·å")){
			
			ModbusConfig modbusConfig = new ModbusConfig();
			
			modbusConfig.writesinglecoil(70, true);
		}
		 
		if(ApiTest.userNameON.contains("TY-1401ÁÎ´óÍþ")){
			
			ModbusConfig modbusConfig = new ModbusConfig();
			
			modbusConfig.writesinglecoil(71, true);
		}
	}
	 
}
class OffS implements OffStatus{
	
	public void offst() throws Exception, ModbusException, IOException, Exception {
		 ApiTest apiTest = new ApiTest();
		 
		 apiTest.JSONObjectToJSONString();
		 
		
		if(ApiTest.userNameOFF.contains("TY-1302ÏòÔ¶·å")){
			
			ModbusConfig modbusConfig = new ModbusConfig();
			
			modbusConfig.writesinglecoil(70, false);
		}
		 
		if(ApiTest.userNameOFF.contains("TY-1401ÁÎ´óÍþ")){
			
			ModbusConfig modbusConfig = new ModbusConfig();
			
			modbusConfig.writesinglecoil(71, false);
		}
		
	}
}



