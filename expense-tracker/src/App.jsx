import { useState } from "react";
import "./App.css";

function App() {
  const [expenses, setExpenses] = useState([]);
  const [title, setTitle] = useState("");
  const [amount, setAmount] = useState("");

  const addExpense = () => {
    if (title.trim() === "" || amount === "" || Number(amount) <= 0) {
      alert("Please enter a valid expense name and amount!");
      return;
    }

    const newExpense = {
      id: Date.now(),
      title: title,
      amount: Number(amount),
    };

    setExpenses([...expenses, newExpense]);
    setTitle("");
    setAmount("");
  };

  const deleteExpense = (id) => {
    setExpenses(expenses.filter((expense) => expense.id !== id));
  };

  const total = expenses.reduce(
    (sum, expense) => sum + expense.amount,
    0
  );

  return (
    <div className="app">
      <div className="container">
        <h1>💰 Expense Tracker</h1>
        <p className="subtitle">Track your daily expenses easily</p>

        <div className="total-card">
          <h3>Total Expenses</h3>
          <h2>₹{total.toFixed(2)}</h2>
        </div>

        <div className="form">
          <input
            type="text"
            placeholder="Enter expense name"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />

          <input
            type="number"
            placeholder="Enter amount"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />

          <button onClick={addExpense}>+ Add Expense</button>
        </div>

        <div className="expense-list">
          <h2>Your Expenses</h2>

          {expenses.length === 0 ? (
            <p className="empty">No expenses added yet.</p>
          ) : (
            expenses.map((expense) => (
              <div className="expense-item" key={expense.id}>
                <div>
                  <strong>{expense.title}</strong>
                  <p>₹{expense.amount.toFixed(2)}</p>
                </div>

                <button
                  className="delete-btn"
                  onClick={() => deleteExpense(expense.id)}
                >
                  Delete
                </button>
              </div>
            ))
          )}
        </div>
      </div>
    </div>
  );
}

export default App;