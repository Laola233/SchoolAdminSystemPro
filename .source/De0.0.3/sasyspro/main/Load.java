package sasyspro.main;

import java.util.ArrayList;

import sasyspro.ConfigurationReader;
import sasyspro.Settings;
import sasyspro.template.Administrator;
import sasyspro.template.Parent;
import sasyspro.template.Student;
import sasyspro.template.Teacher;

public class Load {

	public static void main(String[] args) throws Exception {
		if(!Settings.toBoolean(ConfigurationReader.getProperty("System_enabled"))){
			System.out.println("System is disabled,program will exit...");
			System.exit(0);
		}
		System.out.println("Loading SASYSPRO(SchoolAdminSystemPro)......");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Main a = new Main();
		a.StartArea();
	}
}
