package service;
import java.model.User;
import java.repository.UserRepository;

public class UserBalanceImpl implements UserBalance{

    private UserRepository userRepository = new UserRepository();

    @Override
    public void creditBalance(int index, int money) {
        UserRepository.creditBalance(index, money);
    }
    @Override
    public int debitBalance(int index, int money) {
        return UserRepository.debitBalance(index, money);
    }
    @Override
    public int getBalance(int index) {
        return UserRepository.getBalance(index);
    }
}