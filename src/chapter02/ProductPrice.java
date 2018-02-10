package chapter02;

public class ProductPrice {
	public static void main(String[] args) {
		float money=1206;
		float rebate=0f;
		if(money>200){
			int grade=(int)money/200;
			switch(grade){
			case 1:
				rebate=0.95f;
				break;
			case 2:
				rebate=0.9f;
				break;
			case 3:
				rebate=0.85f;
				break;
			case 4:
				rebate=0.8f;
				break;
			case 5:
				rebate=0.75f;
				break;
			case 6:
				rebate=0.7f;
				break;
			case 7:
				rebate=0.65f;
				break;
			case 8:
				rebate=0.5f;
				break;
			default:
				rebate=0.45f;
			}
			System.out.println("您的累计消费金额为:"+money);
			System.out.println("您将享受"+rebate+"折扣惠");
			System.out.println(-4%2);
		}
	}
}
