package controller;
import java.service.UserBalance;
import java.service.UserBalance;
import java.service.UserBalanceImpl;
import java.service.UserService;
import java.service.UserServiceImpl;

public class BalanceController {

    private UserBalance balanceController = new UserBalanceImpl();

    public void creditBalance(int index, int money){
        balanceController.creditBalance(index, money);
    }
    public int debitBalance(int index, int money){
        return balanceController.debitBalance(index, money);
    }

    public int getBalance(int index){
        return balanceController.getBalance(index);
    }

}