package src.com.bankaccontapp;

public interface IBaseRate{

    default double getBaseRate()
    {
        return 2.5;
    }
}
