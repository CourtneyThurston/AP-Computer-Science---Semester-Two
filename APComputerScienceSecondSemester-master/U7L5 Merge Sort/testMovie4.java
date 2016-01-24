/**
 * The TestMovie class tests and utilizes the methods found within the Movie class!
 * 
 * @author C. Thurston
 * @version 5/8/2014
 */

import java.util.*;
public class testMovie4
{
	public static void printMovies(ArrayList<Movie> list)
	{
		for(Movie current : list)
		{
			System.out.println(current.toString());
		}
	}
	
	public static void sortYears(ArrayList<Movie> list, int low, int high)
	{
		if( low == high)
		return;
		
		int mid = ( low + high) / 2;
		
		sortYears(list, low, mid);
		sortYears(list, mid+1, high);
		
		mergeYears(list, low, mid, high);
	}
	
	public static void mergeYears(ArrayList<Movie> list, int low, int mid, int high)
	{
		ArrayList<Movie> temp = new ArrayList<Movie>();
		
		int i = low, j = mid + 1, n = 0;
		temp.clear();
		while(i <= mid || j <= high)
		{
			if(i > mid)
			{
			     
				
				temp.add(n, list.get(j));
				j++;
			}
			else if (j > high)
			{
			     
				
				temp.add(n, list.get(i));
				i++;
			}
			else if ( list.get(i).year > list.get(j).year)
			{
			     
				
				temp.add(n, list.get(i));
			}
			else
			{
			     
				
				temp.add(n, list.get(j));
			}
			n++;
		}
		
		for(int k = low; k <= high; k++)
		{
			list.remove(k);
			list.add(k, temp.get(k - low));
		}
		temp.clear();
	}
		
	public static void sortTitles(ArrayList<Movie> list, int low, int high)
	{
		if( low == high)
		return;
		
		int mid = ( low + high) / 2;
		
		sortTitles(list, low, mid);
		sortTitles(list, mid+1, high);
		
		mergeTitles(list, low, mid, high);
	}
	
	public static void mergeTitles(ArrayList<Movie> list, int low, int mid, int high)
	{
		ArrayList<Movie> temp = new ArrayList<Movie>();
		
		int i = low, j = mid + 1, n = 0;
		temp.clear();
		while(i <= mid || j <= high)
		{
			if(i > mid)
			{
			     
				
				temp.add(n, list.get(j));
				j++;
			}
			else if (j > high)
			{
			     
				
				temp.add(n, list.get(i));
				i++;
			}
			else if ( list.get(i).title.compareTo(list.get(j).title) < 0)
			{
				temp.add(n, list.get(i));
			}
			else
			{
				temp.add(n, list.get(j));
			}
			n++;
		}
		
		for(int k = low; k <= high; k++)
		{
			list.remove(k);
			list.add(k, temp.get(k - low));
		}
		
	}
	
	public static void sortStudio(ArrayList<Movie> list, int low, int high)
	{
		if( low == high)
		return;
		
		int mid = ( low + high) / 2;
		
		sortStudio(list, low, mid);
		sortStudio(list, mid+1, high);
		
		mergeStudio(list, low, mid, high);
	}
	
	public static void mergeStudio(ArrayList<Movie> list, int low, int mid, int high)
	{
		ArrayList<Movie> temp = new ArrayList<Movie>();
		
		int i = low, j = mid + 1, n = 0;
		temp.clear();
		while(i <= mid || j <= high)
		{
			if(i > mid)
			{
			     
				
				temp.add(n, list.get(j));
				j++;
			}
			else if (j > high)
			{
			     
				
				temp.add(n, list.get(i));
				i++;
			}
			else if ( list.get(i).studio.compareTo(list.get(j).studio) < 0)
			{
			     
				
				temp.add(n, list.get(i));
			}
			else
			{
			     
				
				temp.add(n, list.get(j));
			}
			n++;
		}
		
		for(int k = low; k <= high; k++)
		{
			list.remove(k);
			list.add(k, temp.get(k - low));
		}
		temp.clear();
	}
		
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Brave", 2012, "Pixar"));
		list.add(new Movie("The Avengers", 2012, "Marvel"));
		list.add(new Movie("The Amazing Spiderman", 2012, "Sony"));
		list.add(new Movie("Iron Man 2", 2010, "Marvel"));
		list.add(new Movie("X-Men: First Class", 2012, "Sony"));
		list.add(new Movie("Toy Story 3", 2010, "Pixar"));
		list.add(new Movie("Drive", 2011, "Bold"));
		list.add(new Movie("Men in Black", 1997, "Columbia"));
		list.add(new Movie("Bunraku", 2010, "Snoot"));
		list.add(new Movie("Pulp Fiction", 1994, "Miramax"));
		
		int size = list.size();
		
		System.out.println("Before sorting:");
		printMovies(list);
		System.out.println();
		
		System.out.println("Sorting by title ascending:");
		sortTitles(list, 0, size);
		printMovies(list);
		System.out.println();
		
		System.out.println("Sorting by year descending:");
		sortYears(list, 0, size);
		printMovies(list);
		System.out.println();
		
		System.out.println("Sorting by studio ascending:");
		sortStudio(list, 0, size);
		printMovies(list);
		System.out.println();
		
	}
}