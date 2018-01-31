package rui;

public class runnian1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
     int year=2018;
     
     if((year%4==0&&year%100!=0)||year%400==0) {
    	System.out.println("只是瑞年");
    	 
     }else {
    	 System.out.println("这是平年");
     }
			
	}

}
