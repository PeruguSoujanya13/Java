package cam;

public class camera {
		 private int id;
		    private String brand;
		    private String model;
		    private double price;
		    private String status;

		    public camera(int id, String brand, String model, double price, String status) {
		        this.id = id;
		        this.brand = brand;
		        this.model = model;
		        this.price = price;
		        this.status = status;
		    }

			public int getId() {
		        return id;
		    }

		    public String getBrand() {
		        return brand;
		    }

		    public String getModel() {
		        return model;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public String getStatus() {
		        return status;
		    }

		    public void setStatus(String status) {
		        this.status = status;
		    }
		    
		    class Wallet {
		        private double balance;

		        public Wallet() {
		            this.balance = 0.0;
		        }

		        public double getBalance() {
		            return balance;
		        }

		        public void deposit(double amount) {
		            balance += amount;
		        }

		        public boolean withdraw(double amount) {
		            if (amount <= balance) {
		                balance -= amount;
		                return true;
		            }
		            return false;
		        }
		    }
		    
		    class Wallet1 {
		        private double balance;

		        public void Wallet() {
		            this.balance = 0.0;
		        }

		        public double getBalance() {
		            return balance;
		        }

		        public void deposit(double amount) {
		            balance += amount;
		        }

		        public boolean withdraw(double amount) {
		            if (amount <= balance) {
		                balance -= amount;
		                return true;
		            }
		            return false;
		        }
		    }


		    @Override
		    public String toString() {
		        return String.format("%-10s%-15s%-15s%-20.2f%-15s", id, brand, model, price, status);
		    }

	}



