package edu.oop.guild.notification;

import edu.oop.guild.model.DeliveryPlan;


public class OwlScrollNotificationAdapter implements NotificationChannel {
	
	private LegacyOwlScroll owlScroll;

    public OwlScrollNotificationAdapter(LegacyOwlScroll owlScroll) 
    {

        if (owlScroll == null) 
        {
            throw new NullPointerException("owlScroll cannot be null");
        }

        this.owlScroll = owlScroll;
    }

    @Override
    public String send(DeliveryPlan plan) 
    {

        if (plan == null) 
        {
            throw new NullPointerException("plan can't be null");
        }

        String recipient = plan.getRequest().getRealm().getLabel();
        String creatureName = plan.getCreature().getName();
        String sealText = plan.getSeal();
        int cost = plan.getCost();

        String message = creatureName + " delivers " + sealText + " for " + cost + " coins";
        String result = owlScroll.dispatchScroll(recipient, message);
        return result;
    }
}
