package service;
import java.model.User;

public interface UserBalance {
    void creditBalance(int index, int money);

    int debitBalance(int index, int money);

    int getBalance(int index);
}