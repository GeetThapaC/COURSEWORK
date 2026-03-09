package module;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel {
    private int promptsRemaining;

    public PersonalPlan(String modelName, double price, int parameterCount, String contextWindow, int promptsRemaining) {
        super(modelName, price, parameterCount, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    public int getPromptsRemaining() { return promptsRemaining; }

    public void addPrompts(int newPrompts) {
        if (newPrompts > 0) {
            this.promptsRemaining += newPrompts;
        } else {
            System.out.println("Error: Please enter a positive value or upgrade to Pro Plan.");
        }
    }

    @Override
    public String display() {
        return super.display() + ", Prompts Remaining: " + promptsRemaining;
    }
}