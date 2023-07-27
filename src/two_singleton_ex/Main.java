package two_singleton_ex;

public class Main {

	public static void main(String[] args) {
		// 
		Config config = Config.getConfig();
		System.out.println(config.getName());
		System.out.println(config.getPassword());
		System.out.println(config.getConfig());


	}

}
