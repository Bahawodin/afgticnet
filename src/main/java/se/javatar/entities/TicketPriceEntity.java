package se.javatar.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
// TODO Document @JsonIgnoreProperties
@JsonIgnoreProperties("showEntity")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "section_entity_id", "show_entity_id", "ticket_category_entity_id" }))
public class TicketPriceEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private ShowEntity showEntity;

    @ManyToOne
    @NotNull
    private SectionEntity sectionEntity;

    @ManyToOne
    @NotNull
    private TicketCategoryEntity ticketCategoryEntity;

    /**
     * The price for this category of ticket.
     */
    private float price;

    public TicketPriceEntity() {
    }

    public TicketPriceEntity(ShowEntity showEntity, SectionEntity sectionEntity, TicketCategoryEntity ticketCategoryEntity, float price) {
        this.showEntity = showEntity;
        this.sectionEntity = sectionEntity;
        this.ticketCategoryEntity = ticketCategoryEntity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public ShowEntity getShowEntity() {
        return showEntity;
    }

    public void setShowEntity(ShowEntity showEntity) {
        this.showEntity = showEntity;
    }

    public SectionEntity getSectionEntity() {
        return sectionEntity;
    }

    public void setSectionEntity(SectionEntity sectionEntity) {
        this.sectionEntity = sectionEntity;
    }

    public TicketCategoryEntity getTicketCategoryEntity() {
        return ticketCategoryEntity;
    }

    public void setTicketCategoryEntity(TicketCategoryEntity ticketCategoryEntity) {
        this.ticketCategoryEntity = ticketCategoryEntity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketPriceEntity{" +
                "id=" + id +
                ", showEntity=" + showEntity +
                ", sectionEntity=" + sectionEntity +
                ", ticketCategoryEntity=" + ticketCategoryEntity +
                ", price=" + price +
                '}';
    }
}
