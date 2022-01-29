package services;

import java.util.List;

import models.Expense;
import models.User;

public interface ExpenseService {
	public Expense saveExpense(Expense expense);
	public List<Expense> filterExpenseBetween(String startDate,String endDate);
	public List<Expense> filterUserExpenseBetween(User user,String startDate,String endDate);
	public void deleteByUserAndID(User user,long id);
}