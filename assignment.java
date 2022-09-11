import java.util.Scanner;
import java.io.*;
class assignment{
static Scanner sc=new Scanner(System.in);
//========================================================================	
	static void qs1(){
	System.out.print("enter the length :");
	int a=sc.nextInt();
	System.out.print("enter the breadth :");
	int b=sc.nextInt();
	if(a==b){
		System.out.println("It is square");
	}else{
		System.out.println("It is not the square");
		}
	}
//========================================================================	
	static void qs2(){
	System.out.print("enter First Value :");
	int num1=sc.nextInt();
	System.out.print("enter Second value :");
	int num2=sc.nextInt();
	if (num1 == num2)
       System.out.println ("both are equal");
     else if (num1 > num2)
         System.out.println (num1 + " is greater");

     else
         System.out.println (num2 + " is greater");
		
	}
//========================================================================	
	static void qs3(){
		System.out.println("Enter the quantity: ");
		double n = sc.nextDouble();
		if (n>1000) {
			System.out.println("The total cost = "+(n-(n/100*10)));
		}
		else{
			System.out.println("The total cost = "+n);
		}
	}
//========================================================================	
	static void qs4(){
		int year;
		int sal;
		double d;
		System.out.print("Enter total Years of services : ");
		year=sc.nextInt();
 
		if(year>5){
				System.out.print("Congrats..YES..! your total year of services more than 5 years\n\nPlease Enter your salary..> ");
				sal=sc.nextInt();
				System.out.println("YOUR SALARY IS : "+sal);
				System.out.println("YOUR 5% BONUS  IS :"+sal*0.05);
				System.out.println("YOUR NET BONUS WITH SALARY IS :"+(sal+(sal*0.05)));
		}
		else{
			System.out.println("NO BONUS..");
 }
	}
//========================================================================
	static void qs5(){
	System.out.print("Enter your marks : ");
    int x = sc.nextInt();
    if(x<25){
      System.out.println("F");
    }
    else if((x>=25)&&(x<45)){
      System.out.println("E");
    }
    else if((x>=45)&&(x<50)){
      System.out.println("D");
    }
    else if((x>=50)&&(x<60)){
      System.out.println("C");
    }
    else if((x>=60)&&(x<80)){
      System.out.println("B");
    }
    else if((x>=80)&&(x<=100)){
      System.out.println("A");
    }
    else{
      System.out.println("Not correct marks");
    }
	}
//========================================================================
static void qs6(){
	 int age1,age2,age3,max,min;
		System.out.print("Enter the age of First Person:  ");
		age1=sc.nextInt();
		System.out.print("Enter the age of Second Person:  ");
		age2=sc.nextInt();
		System.out.print("Enter the age of Third Person:   ");
		age3=sc.nextInt();
		if(age1>age2 && age1>age3){
			System.out.println("First Person is the Oldest.");
		}else if(age2>age1 && age2>age3){
			System.out.println("Second Person is the Oldest.");
		}else if(age3>age1 && age3>age2){
			System.out.println("Third Person is the Oldest.");
		}else{
			System.out.println("All have equal ages.");
		//   System.exit(0);
		}
		if(age1<age2 && age1<age3){
			System.out.println("First Person is the Youngest.");
		}else if(age2<age1 && age2<age3){
			System.out.println("Second Person is the Youngest.");
		}else if(age3<age1 && age3<age2){
			System.out.println("Third Person is the Youngest.");
		}
}
//========================================================================
static void qs7(){
	System.out.print("Enter Value : ");
	int x=sc.nextInt();
    System.out.printf( "Absolute Value of x : " + Math.abs(x) );
}
//========================================================================
static void qs8(){
	System.out.print("Number of classes held : ");
	int x=sc.nextInt();
	System.out.print("Number of classes attended : ");
	int y=sc.nextInt();
	int pf=y*100/x;
	System.out.println(pf);
	if(pf>=75){
	System.out.println("The student is allowed to sit in the exam hall : "+pf);
	}else{ 
	System.out.println("The student is not allowed to sit in the exam hall : "+pf);
	}
}
//========================================================================
static void qs9(){
	System.out.print("Medical cause or not ( 'Y' or 'N' ) : ");
	String z=sc.nextLine();
	System.out.print("Number of classes held : ");
	int x=sc.nextInt();
	System.out.print("Number of classes attended : ");
	int y=sc.nextInt();
	int pf=y*100/x;
	if(pf>=75 && z.equals("y")){
	System.out.println("The student is allowed to sit in the exam hall : "+pf);
	}else if(pf>=75 && z.equals("n")){
	System.out.println("The student is allowed to sit in the exam hall : "+pf);
	}
	else{ 
	System.out.println("The student is not allowed to sit in the exam hall : "+pf);
	}
}
//========================================================================
static void qs10(){
		 int x=2;
		 int y=5;
		 int z=0;
		 System.out.println(x==2);
		 System.out.println(x!=5);
		 System.out.println(x!=5 && y>=5);
		 System.out.println(!(y<10));
}
//========================================================================
static void qs11(){
	  char ch;
		System.out.print("Enter the character  ");
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is an upper case letter ");
		}
		else if(ch>='a' && ch<='z'){
			System.out.println(ch+" is a lower case letter ");
		}
		else{
			System.out.println(ch+" is not a Alphabets ");
		}
}
//========================================================================
static void qs12(){
	
		System.out.print("Enter an Year : ");
		int year= sc.nextInt();

      if (year % 4 == 0 && year % 100!= 0 || year%400 == 0){
         System.out.println("Specified year is a leap year");
      }else{
         System.out.println("Specified year is not a leap year");
   }
}
//========================================================================static void qs13(){
	System.out.print("Enter age :");
		int age = sc.nextInt();
		
		System.out.print("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		if(sex == 'F') {
			System.out.println("You will work only in urban areas");
		}
		
		if(sex == 'M') {
			if((age >= 20) && (age < 40)) {
				System.out.println("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			else {
				System.out.println("ERROR");
			}
		}
}

//========================================================================
static void qs14(){
	int reverse = 0;  
	System.out.print("Enter Number : ");
	int num=sc.nextInt();
	while(num != 0){  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
	}  
		System.out.println("The reverse of the given number is: " + reverse); 
}
//========================================================================
public static void main(String arg[]){
	 qs14(); 
	 
}
}