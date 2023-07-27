package two_singleton_ex;

public class Config {
// 棚の名前
	private String name;
	// パスポート
	private String password;
	
	private static Config config = new Config();

	private Config() {
		this.name = "11";
		this.password = "22";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Config getConfig() {
		return config;
	}

	public static void setConfig(Config config) {
		Config.config = config;
	}
	
	
	

	

	

	

	

	
	
}
