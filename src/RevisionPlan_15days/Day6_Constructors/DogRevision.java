package RevisionPlan_15days.Day6_Constructors;

public class DogRevision {
    String breed;
    String colour;
    boolean isitbark;
    // Default Constructor
    public DogRevision() {
        this.breed = "unknown";
        this.colour = "unknown";
        this.isitbark = false;

    }
    // Parameterized Constructor (2 parameters)
    public DogRevision(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }
    // Parameterized Constructor (3 parameters)
    public DogRevision(String breed, String colour, boolean isitbark) {
        this.breed = breed;
        this.colour = colour;
        this.isitbark = isitbark;
    }
    // Display Method (Fix: Proper formatting)
    public void display(){
        System.out.println("1st one : This is Default Construction");
        System.out.println("2nd one : This is parameterised Construction with 2 parameters" + "Breed: " + breed + ", Colour: " + colour);
        System.out.println("3rd one : This is parameterised Construction with 3 parameters" + "Breed: " + breed + ", Colour: " + colour + ", Barks: " + isitbark);
    }

    // Copy Constructor (Fix: Properly copying attributes)
    public DogRevision(DogRevision PC2) {
        this.breed = PC2.breed;
        this.colour = PC2.colour;
        this.isitbark = PC2.isitbark;
    }

    public static void main(String[] args) {
        DogRevision DC = new DogRevision();
        DC.display();

        DogRevision PC1 = new DogRevision("Julie", "white");
        PC1.display();

        DogRevision PC2= new DogRevision("bulldog", "brown",true);
        PC2.display();

        DogRevision PC3 = new DogRevision(PC2);
        PC3.display();
    }
}
