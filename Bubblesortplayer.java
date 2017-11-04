//This class contains height of the players and return the number of players
class Playerheight
{
	private int[] a;
	private num;

//constructor of the class
	public Playerheight(int size)
	{
		a=new int[size];
		num=0;
	}

//Inserts the newly created player heights into the array

	public void insertplayer(int height)
	{
		a[num++]=height;
	}

//Displaying the height of the players
	public void displayplayer()
	{
		for(int i=0;i<num;i++)
		System.out.println(a[i]+" ");
	}

//Implementing bubble sort to sort the height of the players
	public void playerbubblesort()
	{
		int out,in,tmp;
		for(out=n-1;out>1;out--)
		{
			for(in=0;in<out;in++)
			{
				if(a[in]>a[in+1])
				{
					tmp=a[in];
					a[in]=a[in+1];
					a[in+1]=tmp;
				}
			}
		}
	}
}

//Point of execution of the program
class Bubblesortplayer
{
	public static vod main(String[] args)
	{
		int size=10;
		Playerheight pl;
		pl=new Playerheight(size);
		pl.inserplayer(77); //creating objects manually as this is a practise program to implement bubble sort algorithm
		pl.inserplayer(11);
		pl.inserplayer(70);
		pl.inserplayer(66);
		pl.inserplayer(89);
		pl.displayplayer(); // displays the actual order of heights of the players taken on input
		pl.playerbubblesort(); //bubblesort function of the class Playerheight is called 
		pl.displayplayer(); //displacy function of Playerheight class is called to display the sorted heights of the player
	}
}
