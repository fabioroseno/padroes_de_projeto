package br.com.exercicios.questao_12.abstractfactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pizzaria {

	public Pizzaiolo getPizzaiolo(String strDate) throws Exception {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = new Date(format.parse(strDate).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		if (Calendar.DAY_OF_WEEK == Calendar.SUNDAY)
			throw new Exception("Pizzaria Fechada...");
		else if (Calendar.DAY_OF_WEEK == Calendar.MONDAY
				|| Calendar.DAY_OF_WEEK == Calendar.WEDNESDAY
				|| Calendar.DAY_OF_WEEK == Calendar.FRIDAY)
			return new PizzaioloA();
		else
			return new PizzaioloB();

	}

}
