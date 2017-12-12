package se.javatar.domain.objects;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public enum EventCategory {

    CONSERT("Consert"),
    SHOW("Show"),
    BUFFE("Buffe");

    private String name;

    EventCategory() {
    }

    EventCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
