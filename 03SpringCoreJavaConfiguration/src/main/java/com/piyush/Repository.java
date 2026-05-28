package com.piyush;

public class Repository {

	private int pathToStore;
	private String r;

	public Repository() {
		super();
	}
	public int getPathToStore() {
		return pathToStore;
	}
	public void setPathTotStore(int pathToStore) {
		this.pathToStore = pathToStore;
	}
	public String getR() {
		return r;

	}
	@Override
	public String toString() {
		return "Repository [pathToStore=" + pathToStore + ", r=" + r + "]";
	}
	public void setR(String r) {
		this.r = r;

	}
}
