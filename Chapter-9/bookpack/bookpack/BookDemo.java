package bookpack;

public class BookDemo {
  public static void main(String args[]) {
      Book books[] = new Book[1];

      books[0] = new Book("Java: A Beginner's Guide",
                          "Schildt", 2019);
    
      for(int i=0; i < books.length; i++) books[i].show();
  }    
}
