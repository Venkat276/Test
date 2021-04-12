package com.harsh.dcassignment;

/**
 * Distributes system process.
 * 
 * @author Harsh Tak
 *
 */
public class Process {

	private int id;

	private int value;

	public Process(int processId, int value) {
		this.id = processId;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
