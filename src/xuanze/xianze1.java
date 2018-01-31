package xuanze;

public class xianze1{
	 private String name;
	 private int age;
	 private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void method() {
		System.out.println(name+"正在走猫步");
	}
	public void add(int a, int b) {
		 int c=a+b;
		 System.out.println(c);
		 
	}
	public int add( String b,int a) {
		return a;
	}
}




/*public class xianze1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] a= {15,50,30,20,1,8,9};
           for(int i=0;i<a.length-1;i++) {
        	 for(int j=i+1;j<a.length;j++) {
        		if(a[j]<a[i]){
        			int tem=a[j];
        			a[j]=a[i];
        			a[i]=tem;
        		} 
  
        	 } 
        	  for(int o:a){
        	   System.out.print(o+",");
        	   }
        	  System.out.println();
           }
           
          
	}

}*/
