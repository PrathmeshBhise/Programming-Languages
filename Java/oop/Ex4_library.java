class library{
    String[] Books;
    int no_of_books;
    library(){
        this.Books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String name){
        this.Books[no_of_books]=name;
        no_of_books++;
    }
    void showBooks(){
        System.out.println("Available books are...");
        for (String book : Books) {
            if( book == null ){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book){
        for (String b : Books) {
            for(int i=0 ; i<Books.length; i++){
                if(Books[i].equals(b)){
                    System.out.println("Book Issued !");
                    this.Books[i]=null;
                    return;
                }
                
                
            }
        }
        System.out.println("Book Not Found !");
    }
    void returnBook(String name){
        this.Books[no_of_books]=name;
    }

}


public class Ex4_library {
    public static void main(String[] args) {
        library lib = new library();
        lib.addBook("Java MAster");
        lib.showBooks();
        lib.issueBook("Java MAster");
        lib.showBooks();
        lib.returnBook("Java MAster");
        lib.showBooks();
    }
}
