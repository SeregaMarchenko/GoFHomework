package main.java.prototype;

public class ConcretePrototype implements Prototype {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    private ConcretePrototype(ConcretePrototype prototype) {
        this.property = prototype.property;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void printProperty() {
        System.out.println("Property: " + property);
    }
}
