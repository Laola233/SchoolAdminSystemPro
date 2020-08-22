package sasyspro.functions;

import java.util.ArrayList;

import sasyspro.template.*;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class BindRelationShip_Parents_Students {
	public void doBindOperation(Parent par, Student stu) {
		stu.setBind(par);
		par.setBindStu(stu);
	}

	/**
	 * @deprecated
	 * @param par
	 * @param stu
	 */
	public void doBindOperation(Parent par, Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			if(stu[i] !=null) {
				par.setBindStu(stu[i]);
				stu[i].setBind(par);
			}else {
				break;
			}
		}
	}
	/**
	 * @deprecated
	 * @param par
	 * @param stu
	 */
	public void doBindOperation(Parent par, ArrayList<Student> stu) {
		for(int i=0;i<stu.size();i++) {
			if(stu.get(i) !=null) {
				par.setBindStu(stu.get(i));
				stu.get(i).setBind(par);
			}else {
				break;
			}
		}
	}
}
