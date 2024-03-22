package programs;
public class ClassA 
{
	void show()
	   {  
		 System.out.println("Implementing Lambda Expressions"+"\n");
		 //InterfaceA x=()->System.out.println("Hello world !!!");
		 //x.meth1();
		 //InterfaceA y=(int p ,int q)->System.out.println("Addition:"+(p+q));
		 //y.meth1(99,1);
		 InterfaceA z=(int S,int t)->
	      {
		     if(S>=100)  
		     {         
		       System.out.println("If block executed");
	           return S+1000;
		      }
		      else
		      {
			   System.out.println("else block executed");
			   return t+5000;
			   }
		    };
		    
		    int result=z.meth1(50,100);
		    System.out.println("Result:"+result);
	      }
		  public static void main (String[]args)
		  {
		    ClassA aobj=new ClassA();
		    aobj.show();
		  } 
}	