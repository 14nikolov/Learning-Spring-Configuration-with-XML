package xmlConfiguration_DependencyInjection;

public class George implements Person{

    // Book Dependency
    private Book book;

    // Constructor Dependency Injection
    public George(Book injectedBook){
        this.book = injectedBook;
    }

    @Override
    public String getPersonName() {
        return "George Hollow";
    }

    @Override
    public int getPersonAge() {
        return 31;
    }

    // A Method, that calls the Method of the Dependency
    // and returns the result
    @Override
    public String getPersonFavoriteBookTitle() {
        String favoriteBookTitle = book.getBookTitle();
        return favoriteBookTitle;
    }
}
