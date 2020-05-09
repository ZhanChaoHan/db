package com.java.db;


import org.mybatis.generator.api.ShellRunner;

public class MybatisGeneratorApp {
	public static void main(String[] args) {
		args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator\\generatorConfig.xml", "-overwrite" };
		ShellRunner.main(args);
	}
}
