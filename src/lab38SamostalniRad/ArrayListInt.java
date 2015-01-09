package lab38SamostalniRad;

public class ArrayListInt {
	
	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;
	
	public ArrayListInt(){
		this.size = 0;
		this.array = new int[DEFAULT_SIZE];
	}
	
	public void add(int value)
	{
		if (size == array.length)
		{
			resize();
		}
		array[size+1] = value;
		size++;
	}

	private void resize() {
		int[] newArray = new int[array.length*2];
		for (int i=0; i<size; i++)
		{
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	public void removeAt(int index)
	{
		if (index<0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index is not valid!");
		}
		for (int i=index+1; i<size; i++)
		{
			array[i] = array[i+1];
		}
		size--;
	}
	
	public String toString()
	{
		String str = "";
		for (int i=0; i<size; i++)
		{
			str += array[i+1] + " ";
		}
		return str;
	}
	
	public int getSize()
	{
		return size;
	}
}
