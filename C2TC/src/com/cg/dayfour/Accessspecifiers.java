package com.cg.dayfour;

public class Accessspecifiers {
	//PRIVATE CLASS
	//class Privateclass{  
	//private int data=40;  
	//private void display(){
//		System.out.println("Hello java");
//		}  
	//}  
	//PUBLIC CLASS
	class Publicclass{  
		public int data1=40;  
		public void display1(){
			System.out.println("Hello java");
			}  
		}  
	//DEFAULT CLASS
	class Defaultclass{  
		 int data2=40;  
		 void display2(){
			System.out.println("Hello javascript");
			}  
		} 
	//PROTECTED CLASS
	//protected class Proclass{  
//		 protected int data3=40;  
//		 void display3(){
//			System.out.println("Hello hi");
//			}  
	//}  

	  
	 
	public class Accessspecifier {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			Privateclass p=new Privateclass();  
			Publicclass p1=new Publicclass();
			Defaultclass d=new Defaultclass();
//			Proclass pro=new Proclass();
			d.display2();
//			   p.display();//Compile Time Error 
			   p1.display1();
			   //pro.display3();//compile time error
		}

		
			
	}

}
