package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {
    public TaxPayingHealthcareWorker(HealthcareWorker worker){
        super(worker);
        System.out.println("Decorate " + worker.getName() + " with TaxPaying.");
    }

    public double getPrice(){
        return 1.1*super.getPrice();
    }
}
