

import java.util.Scanner;
class Book{
	String name;
	String author;
	float price;
	int num_pages;

	Book(String n, String a, float p, int np){
		name = n;
		author = a;
		price = p;
		num_pages = np;
	}

	void getDetails(){
			System.out.println(name.toString());
			System.out.println(author.toString());
			System.out.println(price);
			System.out.println(num_pages);
		}
}

class Bookprogram{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			String name,author;
			float price;
			int num_pages, i;
			Book[] books = new Book[3];
			for(i=0;i<3;i++){
				System.out.println("Enter name, author, price, no of pages for book "+(i+1)+" in order");
				name = sc.next();
				author = sc.next();
				price = sc.nextFloat();
				num_pages = sc.nextInt();
				books[i]= new Book(name.toString(), author.toString(), price, num_pages);
					

			}
	
			for(i=0;i<3;i++){
				System.out.println("the details of book "+(i+1)+" are");
				books[i].getDetails();
		
		}
	}
}