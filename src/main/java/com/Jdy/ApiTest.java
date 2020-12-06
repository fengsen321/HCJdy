/**
 * 
 */
package com.Jdy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import cn.hutool.http.HttpRequest;

/**
 * @author 冯森
 *Git 第一次更新
 */
public class ApiTest {


	  public static String userNameON = null;
	  public static String userNameOFF = null;
	  public static ApiTest JSONObjectToJSONString() {
		HashMap<String, Object> paramMap = new HashMap<>();

		String result = HttpRequest.post(
				"https://api.jiandaoyun.com/api/v1/app/5f3206c56d5a6d0006abda85/entry/5f9fc5a4874e330006317e2c/data")
				.header("Authorization", "Bearer 3vGDXkgt0rzz9dsvzlhPKjynJgIBSb5E").form(paramMap).timeout(2000)
				.execute().body();

		Map mapType = JSON.parseObject(result);

		Object data = mapType.get("data");

		JSONArray array = null;


		if (data instanceof JSONArray) {
			array = (JSONArray) data;

			List<JsonTest> list = JSONObject.parseArray(array.toJSONString(), JsonTest.class);
			
		//	System.out.println(list.toString());
			
			userNameON = list.get(0).get_widget_1604306342560();//开电车间	
			userNameOFF = list.get(0).get_widget_1605066457240();//观电车间
	
		}
		ApiTest res = new ApiTest();//通过类，返回多个数据userNameON，userNameOFF

		return res;

	}

}
