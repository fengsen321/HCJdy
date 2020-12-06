/**
 * 
 */
package com.Jdy;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;

/**
 * @author 冯森
 *
 */


  
  public class ModbusConfig  {
	  


		/*
		 * private String strip= "192.168.3.20";
		 * 
		 * private int port = 502;
		 */
  
	  
		/*
		 * 写单线圈
		 */
	 
	 public  void writesinglecoil(int startingAddress_WriteSiCoil,boolean value_WriteSiCoil) throws Exception, SocketException, ModbusException, IOException {
		  
	
		  ModbusClient modbusClient = new ModbusClient("192.168.3.20",502);//构造函数–创建对象时执行
		  modbusClient.Connect();//连接到Modbus-TCP服务器或Modbus-RTU从站

			
		modbusClient.WriteSingleCoil(startingAddress_WriteSiCoil, value_WriteSiCoil);	
		  
		/*
		 *   关闭连接
		 */
		
		modbusClient.Disconnect();
		
	
		
	}

		/*
		 * 
		 * 读线圈
		 */

	 public void readcoils(int startingAddress_ReadCo,int number_ReadCo) throws UnknownHostException, SocketException, ModbusException, IOException {
		 
		boolean[] recoils = new boolean[100];
		 
		 
		 ModbusClient modbusClient = new ModbusClient("192.168.3.20",502);
		 modbusClient.Connect();
		 recoils = modbusClient.ReadCoils(startingAddress_ReadCo, number_ReadCo);
		  
		  System.out.println("readcoils================");
		  
		  for(int i = 0;i<recoils.length;i++) {
			  
			  System.out.println(recoils[i]);
		  }
		  
		  
		  
			/*
			 *   关闭连接
			 */
			
			modbusClient.Disconnect();
		}
	 
	
	 /*
	   * 读保持寄存器
	   */
	 
	public void readholdingregisters(int startingAddress_ReadHorers,int number_ReadHorers) throws Exception, SocketException, ModbusException, IOException {
		 ModbusClient modbusClient = new ModbusClient("192.168.3.20",502);
		 modbusClient.Connect();
		 modbusClient.ReadHoldingRegisters(startingAddress_ReadHorers, number_ReadHorers);
		 
			/*
			 *   关闭连接
			 */
			
		modbusClient.Disconnect();
	}
	
	
	/*
	 * public static void MobusRun() throws SocketException, ModbusException,
	 * IOException, Exception { ModbusConfig modbusConfig = new ModbusConfig();
	 * 
	 * modbusConfig.writesinglecoil(0,false);//写单线圈
	 * 
	 * modbusConfig.readcoils(0,10);//读线圈
	 * 
	 * modbusConfig.readholdingregisters(1,2);//读保持寄存器
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	

}
