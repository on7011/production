package com.example.demo;

/**
 * DemoUtilsクラス。
 * 
 * @author oohashinao
 */
public class DemoUtils {

	private String productName;
	private int price;
	
	DemoUtils(String productName, int price){
		this.productName = productName;
		this.price = price;
	}
	
	

	static double tax = 1.1;

	/**
	 * sayhelloクラス。
	 * 
	 * @param bb アルファベットの入力を行う
	 * @return Hello!(Bb)を返す
	 */
	public static String sayhello(String bb) {

		return "Hello!" + bb.substring(0, 1).toUpperCase() + bb.substring(1).toLowerCase();

	}

	/**
	 * @param cc アルファベットの入力を行う
	 * @return Bye!(cC)を返す
	 */
	public static String saybye(String cc) {

		return "Bye!" + cc.substring(0, cc.length() - 1).toLowerCase() + cc.substring(cc.length() - 1).toUpperCase();

	}

	public static int shop100(String[] aa, int age) {

		int total = 0;
		boolean dfy = true;

		for (String item : aa) {
			switch (item) {
			case "ダッフィー":
				if (dfy) {
					total = total + 300;
					dfy = false;
				} else {
					System.out.println(item + "はお一人様1点までです。");
				}
				break;
			case "お酒", "タバコ":
				if (age >= 20) {
					total = total + 100;
				} else {
					System.out.println(item + "は20歳から。");
				}
				break;
			default:
				total = total + 100;
				break;
			}

		}

		return (int) (total * tax);
	}

	public static int shop100(String[] aa, int age, int coupon) {

		int abc = shop100(aa, age);

//		int total = 0;
		abc = (int) (abc * (100 - coupon) / 100);

		return (abc);
	}

}

//int total = 0;
//for (String item : aa) {
//	if (total >= 600) {
//		total = (int) (total * 0.1);
//		System.out.println(total + "円");
//	} else if(total >= 900){
//		total = (int) (total * 0.1);
//	}
//}
