package module;


/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel {
    private int teamSlots;

    public ProPlan(String modelName, double price, int parameterCount, String contextWindow, int teamSlots) {
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

    public void addTeamMember(String name) {
        if (teamSlots > 0) {
            teamSlots--;
            System.out.println("Member " + name + " added. Slots left: " + teamSlots);
        } else {
            System.out.println("Error: No available slots remaining.");
        }
    }

    @Override
    public String display() {
        return super.display() + ", Available Team Slots: " + teamSlots;
    }
}