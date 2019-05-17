package com.rma.brownbag;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Main
{

	public static void main(String[] args)
	{
		Logger.getLogger(Main.class.getName()).info("Hello World!");
		Iterate iterate = new Iterate(new ArrayList<String>());
		iterate.printFirst();
	}
}
