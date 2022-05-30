package _1_InversionOfControl;

public class BookAtomicHabits implements Book{

    @Override
    public int getBookNumberOfPages() {
        return 320;
    }

    @Override
    public String getBookTitle() {
        return "Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones";
    }

    @Override
    public double getBookPrice() {
        return 30;
    }

}
