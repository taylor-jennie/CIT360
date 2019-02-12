package CIT360;

import java.util.*;



public class CIT360 {

	public static void main(String[] args) throws InterruptedException {
		//ArrayList is a dynamic array that is ordered, allows duplicates, integer is the index, not synchronized
		System.out.println("ARRAY LIST");
		List<String> myFamArrayList = new ArrayList<>();
		myFamArrayList.add("Todd");
		myFamArrayList.add("Matt");
		myFamArrayList.add("Jennie");
		myFamArrayList.add("Sean");
		myFamArrayList.add("Scott");
		myFamArrayList.add("Beverly");
		System.out.println(myFamArrayList);
		int findBeverly = myFamArrayList.indexOf("Beverly");
		System.out.println("I searched for the index of Beverly in the ArrayList and the index is: "+findBeverly);
		System.out.println("ArrayLists can be added to dynamically, so I will add my youngest brother and then sort the list");
		myFamArrayList.add("Stewart");
		Collections.sort(myFamArrayList);
		System.out.println("Sorted array list: "+myFamArrayList);
		findBeverly = myFamArrayList.indexOf("Beverly");
		System.out.println("The new index of Beverly: "+findBeverly);
		System.out.println();
		System.out.println("TREESET");
		SortedMap<String, String> familyTree = new TreeMap<>();
		familyTree.put("B1","Todd");
		familyTree.put("B2","Matt");
		familyTree.put("B3","Jennie");
		familyTree.put("B4","Sean");
		familyTree.put("B5","Stewart");
		familyTree.put("A1","Beverly");
		familyTree.put("A1","Scott");
		System.out.println(familyTree);
		System.out.println("This shows there cannot be duplicates. I added Beverly, but it doesn't exist in the treemap");
		familyTree.put("A2","Beverly");
		System.out.println(familyTree);
		System.out.println();
		System.out.println("LINKEDLIST");
		LinkedList<String> familyLink = new LinkedList<>();
		familyLink.add("Todd");
		familyLink.add("Matt");
		familyLink.add("Jennie");
		familyLink.add("Sean");
		familyLink.add("Stewart");
		familyLink.add("Stewart");
		familyLink.add("Beverly");
		System.out.println("LinkedList: "+familyLink);
		System.out.println("As you can see a linkedlist allows for duplicates and is not sorted. If I add another Jennie...");
		familyLink.add("Jennie");
		System.out.println("LinkedList: "+familyLink);
		familyLink.remove("Jennie");
		System.out.println("LinkedList after remove a Jennie: "+familyLink);
		System.out.println("See how it knows which Jennie to remove, because it uses FIFO");
		System.out.println();
		System.out.println("HASHMAP");
		HashMap<Integer, String> peckingHash = new HashMap<Integer, String>();
		peckingHash.put(3,"Jennie");
		peckingHash.put(2,"Matt");
		peckingHash.put(1,"Todd");
		peckingHash.put(5,"Stewart");
		peckingHash.put(4,"Sean");
		System.out.println(peckingHash);
		String number4 = peckingHash.get(4);
		System.out.println("Who is fourth in the pecking order? ");
		System.out.println(number4);
		System.out.println();
		System.out.println("TREEMAP");
		TreeMap<String, String> familyTreeMap = new TreeMap<>();
		familyTreeMap.put("A","Beverly");
		familyTreeMap.put("A","Scott");
		familyTreeMap.put("B","Todd");
		familyTreeMap.put("B","Matt");
		familyTreeMap.put("B","Jennie");
		System.out.println(familyTreeMap);
		System.out.println("A TreeMap does not allow for duplicate index values");
		familyTreeMap.put("A","Beverly");
		familyTreeMap.put("B","Scott");
		familyTreeMap.put("C","Todd");
		familyTreeMap.put("E","Jennie");
		familyTreeMap.put("D","Matt");
		System.out.println(familyTreeMap);
		System.out.println("TreeMaps sort by key and give you navigational methods");
		System.out.println(familyTreeMap.higherKey("B"));
		System.out.println(familyTreeMap.lowerKey("B"));
	}
}