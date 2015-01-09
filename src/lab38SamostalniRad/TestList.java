package lab38SamostalniRad;

public class TestList {

	public static void main(String[] args) {
		LinkedListInt linkList = new LinkedListInt();
		for (int i=0; i<5; i++)
		{
			linkList.add(i+1);
		}
		System.out.println("Linked list: ");
		System.out.println(linkList.toString());
		linkList.removeAt(2);
		System.out.println(linkList.toString());
		ArrayListInt arrayList = new ArrayListInt();
		System.out.println("Array list: ");
		for (int i=0; i<5; i++)
		{
			arrayList.add(i+5);
		}
		System.out.println(arrayList.toString());
		arrayList.removeAt(2);
		System.out.println(arrayList.toString());
	}

}
