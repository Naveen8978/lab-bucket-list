package service;
public class ListOperations{
	List<TouristPlace> list=new ArrayList<TouristPlace>();
	public List add(TouristPlace places)
	{

		list.add(places);
		return list;


	}
	public List remove(TouristPlace places)
	