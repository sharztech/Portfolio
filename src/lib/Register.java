package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * An aggregation class : Register, consisting of an array that can hold a
 * collection of names, and also holds the capacity of the register.
 * 
 * Methods such as: remove, add, get and set are included.
 * 
 * This example shows how a Register will aggregate Name objects.
 * 
 * @author P2765365
 */

public class Register implements Iterable<Name> {

	// Fields
	private ArrayList<Name> list; // Creates an array referred to as 'list'
	private int RoomCapacity = 0;

	// Constructors
	/**
	 * Creates a new instance of Register, initialising an empty list and sets the
	 * room capacity to 20.
	 */
	public Register() {
		list = new ArrayList<>();
		RoomCapacity = 20;
	}

	/**
	 * Creates a new instance of Register, initialising an empty list and sets the
	 * room capacity to the provided value upon initialisation.
	 * 
	 * @param RoomCapacity the maximum capacity of the register.
	 */
	public Register(int RoomCapacity) {
		list = new ArrayList<>();
		this.RoomCapacity = RoomCapacity;

	}

	// Methods

	/**
	 * Returns the room capacity of the register.
	 * 
	 * @return The room capacity of the register.
	 */
	public int getRoomCapacity() {
		return RoomCapacity;
	}

	/**
	 * Adds a name to the register if the room capacity has not been reached.
	 * 
	 * @param name The name that's to be added to the register.
	 */

	public void addName(Name name) {
		if (list.size() < getRoomCapacity()) {
			list.add(name);
		} else {

		}

	}

	/**
	 * Adds names to the array list:'Name' by iterating through the names in the
	 * array and only adding a name if the room capacity, set when constructing the
	 * register, has not been reached.
	 * 
	 * @param names an array list of names that are added to the register.
	 */

	public void addNames(ArrayList<Name> names) {
		for (Name name : names) {
			if (list.size() < getRoomCapacity()) {
				list.add(name);
			} else {
				break;

			}

		}
	}

	/**
	 * Removes the name at the specified position.
	 * 
	 * @param pos the position of the name that is to be removed.
	 * @return the removed name in the array 'list' or otherwise, return nothing
	 *         (null).
	 */
	public Name removeName(int pos) {
		if (pos >= 0 && pos < list.size()) {
			return list.remove(pos);

		} else {
			return null;
		}
	}

	/**
	 * Retrieves the name at the specified position.
	 * 
	 * @param pos the position of the name that is to be retrieved.
	 * @return the retrieved name in the array 'list'.
	 */

	public Name getName(int pos) { // Returns the name at the specified position
		return list.get(pos);
	}

	/**
	 * Retrieves all of the names in the register as an array list.
	 * 
	 * @return an array list that includes all of the names in the register.
	 */
	public ArrayList<Name> getNames() { // Returns the names in the array
		return new ArrayList<>(list);
	}

	/**
	 * Returns the amount of names in the register.
	 * 
	 * @return the number of names in the register.
	 */
	public int sizeOfRegister() {
		return list.size();
	}

	/**
	 * Removes the all of the names in the register.
	 */

	public void clearRegister() {
		list.clear();
	}

	/**
	 * Checks to see if the register is empty.
	 * 
	 * @return true if the register is empty, otherwise it returns false.
	 */

	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}

	/**
	 * Sort the names in the register in their natural order.
	 */
	public void sortRegister() {

		Collections.sort(list);

	}

	/**
	 * Returns a string representation of the Register, which includes room capacity
	 * and, a list of names.
	 * 
	 * @return a string representation of the register.
	 */

	public String toString() {
		return "Register:[Room Capacity=" + RoomCapacity + ", list=" + list + "]";
	}

	/**
	 * Checks to see if the initial of the first name exists in the register by
	 * iterating though the first names until it finds a match.
	 * 
	 * @param initial the first name initial that is being searched for.
	 * @return true if a match is found in the register, otherwise false is
	 *         returned.
	 */

	public boolean searchRegisterByFirstNameInitial(char initial) {
		for (Name name : list) {
			if (name.getFirstName().charAt(0) == Character.toUpperCase(initial)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Counts the number of instances that the same first name is found in the
	 * register.
	 * 
	 * @param nameMatch the name that is being matched against the names in the
	 *                  register.
	 * @return the number of instances that the name is included within the list.
	 */

	public int countFirstNameOccurrences(String nameMatch) {
		int count = 0;
		for (Name name : list) {
			if (name.getFirstName().equalsIgnoreCase(nameMatch)) {

				count++;
			}
		}
		return count;
	}

	/**
	 * Iterates over the elements in the register. Used alongside the iterable
	 * interface.
	 * 
	 * @return an iterator over the elements in the register.
	 */

	@Override
	public Iterator<Name> iterator() {

		return list.iterator();
	}

}
