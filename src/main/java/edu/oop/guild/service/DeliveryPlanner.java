package edu.oop.guild.service;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.strategy.DeliveryCostStrategy;


public class DeliveryPlanner {
	private RealmFactory factory;
    private DeliveryCostStrategy strategy;
    private GuildLog log;

    public DeliveryPlanner(RealmFactory factory,DeliveryCostStrategy strategy,GuildLog log) 
    {

        if (factory == null) 
        {
            throw new NullPointerException("factory is null");
        }

        if (strategy == null) 
        {
            throw new NullPointerException("strategy is null");
        }

        if (log == null) 
        {
            throw new NullPointerException("log is null");
        }

        this.factory = factory;
        this.strategy = strategy;
        this.log = log;
    }

    public DeliveryPlan plan(DeliveryRequest request) 
    {

        if (request == null) 
        {
            throw new NullPointerException("request is null");
        }

        if (request.getRealm() != factory.getRealmType()) 
        {
            throw new IllegalStateException("wrong realm");
        }

        Creature courier = factory.createCourier();

        String seal = factory.createSeal().sealLabel(request.getPackageType().getLabel(),request.getRealm().getLabel());

        int price = strategy.calculatePrice(
                request.getDistance(),
                request.isFragile()
        );

        DeliveryPlan plan = new DeliveryPlan(request,courier,seal,price);
        String logMessage =courier.getName()+ " delivers "+ seal+ " for "+ price+ " coins";
        log.record(logMessage);

        return plan;
    }

}
