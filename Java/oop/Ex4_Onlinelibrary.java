import java.util.Scanner;

class Library{
    public String [] books=new String[10];
    public String [] issuedBooks=new String[10];
    public Scanner sc;

    Library(){
        sc= new Scanner(System.in);
        books[0]="Maths";
        books[1]="Science";
        books[2]="History";
        books[3]="Geography";

    }
    public void addBook(){
        System.out.println("Enter Book Name :");
        String bName=sc.nextLine();
        boolean bookadded=false;
        for(int i=0 ;i<(books.length);i++){
            if (books[i]!=null && books[i].equals(bName)){
                System.out.println("Already in Library...");
                return;
            }
            if(books[i]==null){
                books[i]=bName;
                System.out.println("Books Added Successfully :");
                bookadded=true;
                break;
            }
        
        }
        if(!bookadded){
            System.out.println("Library is Full");
        }
    }
    public void issueBook(){
        while (true) { 
            showBooks();
            System.out.println("");
            System.out.println("Choose Book Number to Issue that Book or 0 to exit :");
            int bookNo=sc.nextInt();
            sc.nextLine();

            if(bookNo==0){
                break;//To exit
            }
            if( bookNo<1|| bookNo>books.length ||books[bookNo-1]==null ){
                System.out.println("Invalid Choice..!");
            }
            else if(issuedBooks[bookNo-1] !=null) {
                System.out.println("Book is Already Issued");
            }
            else{
                System.out.printf("Successfully issued %s",books[bookNo-1]);
                System.out.println("");
                issuedBooks[bookNo-1]=books[bookNo-1];
                break;
            }
        }

    }
    public void  returnBook(){
        while (true) { 
            System.out.println("Issued Books");
            boolean bookfound=false;
            for(int i=0 ;i<(issuedBooks.length);i++){
                if(issuedBooks[i]!=null){
                System.out.print((i+1)+". "+issuedBooks[i]+"  ");
                bookfound=true;
                }
            }
            if(!bookfound){
                System.out.println("No books have issued :");
                break;
            }
           
            System.out.println("\nEnter the book no you want to return or 0 to Exit :");
            int returnNo=sc.nextInt();
            sc.nextLine();

            if(returnNo==0){
                break;//To exit
            }
            if (returnNo < 1 || returnNo > issuedBooks.length) {
                System.out.println("Invalid Choice. Please try again.");
            }
            if(issuedBooks[returnNo-1]==null){
                System.out.println("Book wasn't Issued !");
            }
            else{
                issuedBooks[returnNo-1]=null;
                System.out.println("Successfully returned Book !");    
            }
            
        }
    }
    public void showBooks(){
        for(int i=0 ;i<(books.length);i++){
            if(books[i]!=null){
             System.out.print((i+1)+". "+books[i]+"  ");
            }
        }
        System.out.println(" ");

    }
    public boolean userinput(){
        while (true) { 
            System.out.println("");
            System.out.println("---------------&&-------------");
            System.out.println("--Menu--");
            System.out.println("1 -> Add New Book :");
            System.out.println("2 -> Issue New Book :");
            System.out.println("3 -> Return Book :");
            System.out.println("4 -> Show Available Books : :");
            System.out.println("5 -> Exit : :");
            System.out.print("Enter Your Choice :");
            int m=sc.nextInt();
            sc.nextLine();
            switch(m){
                case 1 -> addBook();
                case 2 -> issueBook();
                case 3 -> returnBook();
                case 4 -> showBooks();
                case 5 -> {
                    return false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        
        }
    }

}


public class Ex4_Onlinelibrary {
    public static void main(String[] args) {
        Library obj= new Library();
        System.out.println("--Welcome To Online Library--");
        obj.userinput();


    }
}
