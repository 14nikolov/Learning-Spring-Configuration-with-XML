package _2_DependencyInjection;

public class BookThe15Commitments implements Book {

    @Override
    public int getBookNumberOfPages() {
        return 462;
    }

    @Override
    public String getBookTitle() {
        return "The 15 Commitments of Conscious Leadership: A New Paradigm for Sustainable Success";
    }

    @Override
    public double getBookPrice() {
        return 26.80;
    }

}
