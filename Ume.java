
class Ume{
static byte a[]={65,66,68};
static byte b[]={66,66,66};
	
	public static void main(String args[]){


	System.out.println("a="+new String(a)); 
	System.out.println("b="+new String(b)); 
	System.arraycopy(a,0,b,0,a.length);
	System.out.println("a="+new String(a)); 
	System.out.println("b="+new String(b)); 

     
      		
	}
}