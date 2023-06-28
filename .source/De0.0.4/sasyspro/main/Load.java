package sasyspro.main;

import sasyspro.functions.GetNowTime;

public class Load {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
		/*if(!true){
			System.out.println("System is disabled,program will exit...");
			System.exit(0);
		}*/
        System.out.println("Loading SASYSPRO(SchoolAdminSystemPro)......");
        System.out.println("Now Time is " + GetNowTime.Date());
        System.out.println("Step1 - Loading Config....");
        System.out.println("Step2 - Loading Permission System....");
        System.out.println("Step3 - Starting System....");
        main.StartArea();
    }
}
