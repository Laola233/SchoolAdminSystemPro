package sasyspro;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.2B
 * {@code @Description} A CORE SETTINGS CLASS
 */
public class Settings {
	@SuppressWarnings("unused")
	public enum settings_name {
		enabledadministrator, enabledadministratormanage, enabledmanage, enabledparent, enabledparentmanage,
		enabledpermission, enabledstudent, enabledstudentmanage, enabledsystem, enabledteacher, enabledteachermanage,
		enabledusercontrol, ignorepermissionsettings
	}
	public static List<Boolean> plist= new ArrayList<>();
	static void identifySettingsProper() {
		if (!plist.get(2)) {
			plist.set(8,false);
			plist.set(9,false);
			plist.set(10,false);
			plist.set(11,false);
		}
		if (plist.get(12)) {
			plist.set(1,false);
		}
		if (plist.get(1)) {
			plist.set(12,false);
		}
		if (!plist.get(3)) {
			plist.set(4,false);
			plist.set(5,false);
			plist.set(6,false);
			plist.set(7,false);
		}
	}

	@SuppressWarnings("unused")
	public static void set(List<Boolean> list) {
		plist = list;
		identifySettingsProper();
	}

	public static boolean toBoolean(String string){
		return string.equals("true");
	}

	@SuppressWarnings("rawtypes")
	public void loadSystemModulesEnabled() throws Exception {
		List alist = ConfigurationReader.getAllProperty();
		List<Boolean> blist = new ArrayList<>();
		for(int i=0;i<alist.size();i++){
			if(alist.get(i).equals("true")){
				blist.add(true);
			}else{
				blist.add(false);
			}
		}
		plist = blist;
	}
}
