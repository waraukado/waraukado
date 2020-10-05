public class Book extends TangibleAsset{
    String isbn;
    public String getIsbn(){
        return this.isbn;
    }
    
    public Book(String name,int price,String color,String isbn){
        super(name,price,color);
        this.isbn = isbn;
    }
    
}