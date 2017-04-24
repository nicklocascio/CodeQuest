//2015

import java.util.*;
import java.io.*;

public class Ship
	{
	private String name;
	private String type;
	private int x;
	private int y;
	
	public Ship(String n, String t, int x1, int y1)
		{
		name = n;
		type = t;
		x = x1;
		y = y1;
		}
	
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public String getType()
		{
		return type;
		}
	public void setType(String type)
		{
		this.type = type;
		}
	public int getX()
		{
		return x;
		}
	public void setX(int x)
		{
		this.x = x;
		}
	public int getY()
		{
		return y;
		}
	public void setY(int y)
		{
		this.y = y;
		}

	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("prob7.txt"));
		int testCase = file.nextInt();
		file.nextLine();
		for(int i = 0; i < testCase; i++)
			{
			int shipNum = Integer.parseInt(file.nextLine());
			ArrayList <Ship> ships = new ArrayList <Ship>();
			ArrayList <Ship> destroyedShips = new ArrayList <Ship>();
			for(int j = 0; j < shipNum; j++)
				{
				String line = file.nextLine();
				int name = line.indexOf("_");
				int type = line.indexOf(":");
				int x = line.indexOf(",");
				ships.add(new Ship(line.substring(0, name), line.substring(name+1, type), Integer.parseInt(line.substring(type+1, x)), Integer.parseInt(line.substring(x+1))));
				}
			for(int j = 0; j < shipNum; j++)
				{
				Ship closest = ships.get(0);
				for(int k = 1; k < ships.size(); k++)
					{
					if(closest.getX() == ships.get(k).getX())
						{
						if(closest.getY() < ships.get(k).getY())
							closest = ships.get(k);
						}
					else if(closest.getX() > ships.get(k).getX())
						closest = ships.get(k);
					}
				destroyedShips.add(closest);
				ships.remove(closest);
				for(int k = 0; k < ships.size(); k++)
					{
					if(ships.get(k).getType().equals("A"))
						ships.get(k).setX(ships.get(k).getX()-10);
					else if(ships.get(k).getType().equals("B"))
						ships.get(k).setX(ships.get(k).getX()-20);
					else if(ships.get(k).getType().equals("C"))
						ships.get(k).setX(ships.get(k).getX()-30);
					}
				}
			for(Ship hi : destroyedShips)
				{
				System.out.print("Destroyed Ship: ");
				System.out.print(hi.getName());
				System.out.print(" xLoc: ");
				System.out.println(hi.getX());
				}
			}
		}	
	}
