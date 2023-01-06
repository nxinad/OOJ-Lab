class MyException extends Exception {
private int num;

MyException(int a) {
num = a;
}

 public String toString() {
return "MyException[" + num +"user defined Exception" + "]";
}                        

}


class ExceptionDemo {

static void compute(int a) throws MyException 
{

System.out.println("Called compute(" + a + ") ");

if(a > 10)
throw new MyException(a);

System.out.println("Normal exit");
}

public static void main(String args[]) {

try {

compute(1);

compute(20);

}
 catch (MyException e) {

System.out.println("Caught "+e);

}

}//end of main
} // end of class