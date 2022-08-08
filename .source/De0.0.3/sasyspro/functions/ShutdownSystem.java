package sasyspro.functions;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.3B
 */
public final class ShutdownSystem {
	public final void shutdownNow(int status) {
		try {
			System.exit(status);
		} catch (Exception e) {
			System.out.println("Error! The status code isn't right");
		}
	}
}
