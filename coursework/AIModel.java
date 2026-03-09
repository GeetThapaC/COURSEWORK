package module;


/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel {
    private String modelName;
    private double price;
    private int parameterCount;
    private String contextWindow;

    public AIModel(String modelName, double price, int parameterCount, String contextWindow) {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindow = contextWindow;
    }

    // Accessor Methods
    public String getModelName() { return modelName; }
    public double getPrice() { return price; }
    public int getParameterCount() { return parameterCount; }
    public String getContextWindow() { return contextWindow; }

    public String display() {
        return "Model:" + modelName + ", Price: NPR " + price + 
               " per 1L tokens, Parameters: " + parameterCount + "B, Context: " + contextWindow;
    }
}