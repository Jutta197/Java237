package two_practice5;

public enum Season {
	//定数（列挙子）
		SPRING("haru"),SUMMER("natu"),AUTUMN("aki"),WINTER("fuyu");
		//日本語名を格納する変数
		private String japanese;
	    //コンストラクタ
		private Season(String japanese) {
			this.japanese = japanese;
		}
		//ゲッター
		public String getJapanese() {
			return japanese;
		}
		//セッター
		public void setJapanese(String japanese) {
			this.japanese = japanese;
		}

	}
	