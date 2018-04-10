package nl.ferenc.harvest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Income {
    private @Id @GeneratedValue Long id;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getRecurring() {
        return recurring;
    }

    public void setRecurring(Integer recurring) {
        this.recurring = recurring;
    }

    private Long amount;
    private Integer recurring;

    private Income() {}

    public Income(Long amount, Integer recurring) {
        this.amount = amount;
        this.recurring = recurring;
    }
}
