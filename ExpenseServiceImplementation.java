package serviceimpls;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Expense;
import models.User;
import repos.ExpenseRepository;
import services.ExpenseService;

@Service
public class ExpenseServiceImplementation implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public Expense saveExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	@Override
	public List<Expense> filterExpenseBetween(String startDate, String endDate) {
		return this.expenseRepository.findByCreatedAtBetween(startDate, endDate);
	}

	@Override
	public List<Expense> filterUserExpenseBetween(User user,String startDate, String endDate) {
		return this.expenseRepository.findByUserAndCreatedAtBetween(user, startDate, endDate);
	}

	@Override
	@Transactional
	public void deleteByUserAndID(User user, long id) {
		this.expenseRepository.deleteByUserAndId(user, id);
	}

	
}