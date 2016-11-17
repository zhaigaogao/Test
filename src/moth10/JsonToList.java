package moth10;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;



public class JsonToList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "{'people':[{'name':'test1','sex':'男','age':'24'},{'name':'test1','sex':'男','age':'24'}]}";
		
		Map params = JSONObject.parseObject(json, Map.class);
		System.out.println(params);
		List<Map<String, String>> list=new ArrayList<>();
		list.add(params);
		System.out.println(list);
		
		Person person=(Person)JSONObject.parseObject(json,Person.class);
		System.out.println(person.getName());
	}

}
