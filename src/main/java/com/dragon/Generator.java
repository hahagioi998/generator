package com.dragon;

import com.dragon.utils.MybatisGeneratorUtil;
import com.dragon.utils.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>Title: Generator</p>  
 * <p>Description: 代码生成类</p>  
 * @author Dragon.Wen
 * @date Oct 17, 2018
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "generator";
	private static String DATABASE = "dragon_blog";
	private static String TABLE_PREFIX = "blog_";
	private static String PACKAGE_NAME = "com.dragon.blog";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	static {
//		LAST_INSERT_ID_TABLES.put("upms_user", "user_id");
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
	}
}
