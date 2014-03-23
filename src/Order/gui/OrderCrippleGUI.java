
package Order.gui;

import Order.FunctionalityServer;
import Order.OrderPrioritableAbstract;

/**
 * Polecenie wydawane przez gui
 * @author Maciej Majewski
 */
public class OrderCrippleGUI extends OrderPrioritableAbstract<FunctionalityServer>{

    private final boolean cripple;

    /**
     * @param cripple true jeśli przesyłanie rozkazów od zkm ma być ignorowane
     */
    public OrderCrippleGUI(boolean cripple) {
        this.cripple = cripple;
    }
    
    
    
    @Override
    public void execute(FunctionalityServer subject) {
        subject.crippleGUI(cripple);
    }
    
}