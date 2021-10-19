package edu.parinya.softarchdesign.structural;

import java.util.Set;
import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new LinkedHashSet<HealthcareServiceable>();
    public void addMember (HealthcareServiceable member){
        members.add(member);
    }
    public void removeMember (HealthcareServiceable member){
        members.remove(member);
    }

    @Override
    public void service (){
        for (HealthcareServiceable member : members){
            member.service();
        }

    }
    @Override
    public double getPrice (){
        double totalPrice = 0;
            for (HealthcareServiceable priceMember : members){
                totalPrice+=priceMember.getPrice();
            }
            return totalPrice;
    }

}
