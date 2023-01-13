import java.util.Scanner;

class WrongAgeException extends Exception{
    public String toString(){
        return ("Entered age is negative ");
    }
}

class AgeException extends Exception{
    public String toString(){
        return ("Age entered of the son is greater than that of the father");
    }
}

class Father{
    int father_age;
    Father(int x) throws WrongAgeException{
        father_age=x;
        if(father_age<0){
            throw new WrongAgeException();
        }
        
    }
}

class Son extends Father{
    int son_age;
    Son(int x,int y) throws AgeException, WrongAgeException{
        super(x);
        son_age=y;
        if(son_age<0){
            throw new WrongAgeException();
        }
        if(son_age>=father_age){
            throw new AgeException();
        }
    }
}

class userexcept{
    public static void main(String[] args) {
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter father's and son's ages");
            int x=s.nextInt();
            int y=s.nextInt();
            Son so=new Son(x,y);
            System.out.println("Father is  "+so.father_age+" "+"years old and son is  "+so.son_age+""+" years old");
        } catch (WrongAgeException wa) {
         System.out.println(wa);   
        }
        catch (AgeException a){
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("Enter valid values");
        }
    }
}