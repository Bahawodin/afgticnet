package se.javatar.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
public class TicketCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    //@NotEmpty
    private String description;

    public TicketCategory() {
    }

    public TicketCategory(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String
    toString() {
        return "TicketCategory{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
