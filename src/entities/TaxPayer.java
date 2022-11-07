package entities;

public class TaxPayer {

	private double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthsPending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpeding() {
		return educationSpending;
	}

	public void setEducationSpeding(double educationSpeding) {
		this.educationSpending = educationSpeding;
	}

	public double salaryTax() {
		if (salaryIncome / 12 < 3000) {
			return salaryIncome;
		} else if (salaryIncome / 12 < 5000) {
			return salaryIncome * 0.10;
		} else {
			return salaryIncome * 0.20;
		}
	}

	public double servicesTax() {
		return servicesIncome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.20;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		if (educationSpending + healthSpending >= grossTax() * 0.30) { // taxa de desconto
			return grossTax() * 0.30;
		} else {
			return educationSpending + healthSpending;
		}
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

	public String toString() {
		return 	"\nImposto bruto total: " + String.format("%.2f", grossTax())
				+ "\nAbatimento: " + String.format("%.2f", taxRebate()) 
				+ "\nImposto devido: " + String.format("%.2f", netTax());
	}

}