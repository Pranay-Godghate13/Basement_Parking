package com.idealparkinglot.idealparkinglot.entrance;

import com.idealparkinglot.idealparkinglot.ticket.CreateTicket;
import com.idealparkinglot.idealparkinglot.ticket.Ticket;

public class TicketManager{
    EntranceGateManager entranceGateManager;
    Ticket ticket;
    public TicketManager(EntranceGateManager entranceGateManager)
    {
        this.entranceGateManager=entranceGateManager;
    }
    public void createTicket()
    {
        int spot=entranceGateManager.findParkingSpace();
        if(spot==-1)
        System.out.println("Sorry parking is full. Do visit again.");
        else
        {
            ticket=new CreateTicket("RHB", spot, entranceGateManager.getVehicle());
            ticket.createTicket("RHB", spot, entranceGateManager.getVehicle());
        }
    }
}
