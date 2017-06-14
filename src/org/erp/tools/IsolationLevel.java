package org.erp.tools;

public enum IsolationLevel {
	NONE(0),
	READ_UNCOMMITTED(1),
	READ_COMMITTED(2),
	REPEATABLE_READ(4),
	SERIALIZABLE(8),
	DEFAULT(-1) ;
	
	private int level ;
	
	private IsolationLevel( int level ){
		this.level = level ;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
