package hw1;

public class hw1 {
  public static void main(String[] args) {
	 // 請設計一隻Java程式,計算12,6這兩個數值的和與積
	  
	  int num = 12 , num1 = 6;
	  int total1 = num + num1;
	  double total2 = num * num1;
	  System.out.println("12+6="+total1);
	  System.out.println("12*6="+total2);
	  System.out.println("-------------------");
	  
	// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	  
	 int egg = 200, hit = 12;
	 int n1 = egg / hit;
	 int n2 = egg % hit;
	 System.out.println("200顆蛋是="+n1+"打餘"+n2+"顆蛋"); 
	 System.out.println("-------------------");
	 
	// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	 
	 int Totalsec = 256559,dayhr = 24,hrm = 60,mins = 60;
	 int daysec = dayhr*hrm*mins;
	 int hrsec = hrm*mins;
	 int day = Totalsec / daysec;  //剩幾天
	 int hrleft = Totalsec%daysec; //剩幾天的餘小時
	 int minleft = hrleft%hrsec;   //剩幾小時的餘分鐘
	 int secleft = minleft%mins;   //剩幾分鐘的餘秒
	 System.out.println("256559秒是:"+day+"天"
	                   +(hrleft/hrsec)+"小時"
	                    +(minleft/mins)+"分"
	                      +secleft+"秒");
	 System.out.println("-------------------");
	 
	// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	 final double PI = 3.1415;
	 int r = 5;
	 double o = (r*r*PI);
	 double o1= (r*2*PI);
	 System.out.println("圓面積為 "+o);
     System.out.println("圓周長為 "+o1);
     System.out.println("-------------------");
     
   // 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
   // 金加利息共有多少錢 
   // 複利公式 : 末期金額=初期金額 * (1 + 利率)的 N 次方
     int money = 1500000;
     double x = 0.02;  //利率2%=2/100=0.02
     int n = 10;
     double m1= money*Math.pow(1+x,10); 
     
     System.out.printf("十年本金加利息共有%.2f元 \n ",m1);
     System.out.println("-------------------");
     
     
  //   請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
  //  	 5 + 5
  //  	 5 + ‘5’
  //  	 5 + “5”
     
     System.out.println(5+5);   //int型態整數 5 + 整數5為得整數 10
     System.out.println(5+'5'); //'5'為char型態 依照unicode表為'uoo35'十進制為53,所以5+53=58
     System.out.println(5+"5"); //int型態整數 5 + String字串型態 5 得 55
     System.out.println("-------------------");
   
	 }
}
