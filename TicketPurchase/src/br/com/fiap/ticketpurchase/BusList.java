package br.com.fiap.ticketpurchase;

import java.util.ArrayList;
import java.util.List;

public class BusList {
	public static void main(String[] args) {

		List<Bus> busRoutes = new ArrayList<>();

        busRoutes.add(new Bus(1, "São Paulo", "Águia Branca"));
        busRoutes.add(new Bus(2, "Rio de Janeiro", "Águia Branca"));
       
	}
}

