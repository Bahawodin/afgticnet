package se.javatar.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
// TODO Document @JsonIgnoreProperties
@JsonIgnoreProperties("show")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "section_id", "show_id", /*"ticketCategory_id"*/ }))
public class TicketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private Show show;

    @ManyToOne
    @NotNull
    private Section section;

    @ManyToOne
    @NotNull
    private TicketCategory ticketCategory;

    /**
     * The price for this category of ticket.
     */
    private float price;

    public TicketPrice() {
    }

    public TicketPrice(Show show, Section section, TicketCategory ticketCategory, float price) {
        this.show = show;
        this.section = section;
        this.ticketCategory = ticketCategory;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketPrice{" +
                "id=" + id +
                ", show=" + show +
                ", section=" + section +
                ", ticketCategory=" + ticketCategory +
                ", price=" + price +
                '}';
    }
}
