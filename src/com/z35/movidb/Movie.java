package com.z35.movidb;

import android.os.Bundle;

public class Movie {

	////////////////////////////////////////////////////////////////////////////
	// member names 
	////////////////////////////////////////////////////////////////////////////

	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String GENRE = "genre";
	public static final String LENGTH = "length";

	////////////////////////////////////////////////////////////////////////////
	// private member variables
	////////////////////////////////////////////////////////////////////////////
	
	private int id;
	private String title;
	private String genre;
	private String length;
	
	////////////////////////////////////////////////////////////////////////////
	// class life cycle
	////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 * @param title
	 * @param genre
	 * @param length
	 */
	public Movie(final int id, final String title, final String genre, final String length) {
		
		this.setId(id);
		this.setTitle(title);
		this.setGenre(genre);
		this.setLength(length);
	}

	/**
	 * 
	 * @param bundle
	 */
	public Movie(final Bundle bundle) {
		
		assert bundle != null && !bundle.isEmpty(); 
		
		this.setId(bundle.getInt(ID));
		this.setTitle(bundle.getString(TITLE));
		this.setGenre(bundle.getString(GENRE));
		this.setLength(bundle.getString(LENGTH));
		
	}

	////////////////////////////////////////////////////////////////////////////
	// getters
	////////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	
	////////////////////////////////////////////////////////////////////////////
	// setters
	////////////////////////////////////////////////////////////////////////////

	public void setId(final int value) {
		assert value <= 0;
		this.id = value;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(final String value) {
		assert value != null && value.length() > 0;
		this.title = value;
	}
	
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(final String value) {
		assert value != null && value.length() > 0;
		this.genre = value;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(final String value) {
		assert value != null && value.length() > 0;
		this.length = value;
	}

	////////////////////////////////////////////////////////////////////////////
	// common functions
	////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(final Movie other) {
		
		if (this == other) {
			return true;
		}
		
		if ((other == null) || (other.getClass() != this.getClass())) {
			return false;
		}
		
		// object must be Movie at this point
		Movie movi = (Movie) other;
		
		return (title == movi.title || (title != null && title
				.equals(movi.title)))
				|| (genre == movi.genre || (genre != null && genre
						.equals(movi.genre)))
				|| (length == movi.length || (length != null && length
						.equals(movi.length)));

	}

	/**
	 * Returns a hash code value for the object. 
	 * This method is supported for the benefit of hashtables such as those 
	 * provided by java.util.Hashtable.
	 * 
	 * @return 
	 */
	public int hashCode() {
		
		int hash = 7;
		hash = 31 * hash + (null == title ? 0 : title.hashCode());
		hash = 31 * hash + (null == genre ? 0 : genre.hashCode());
		hash = 31 * hash + (null == length ? 0 : length.hashCode());
		
		return hash;
	}
	
	/**
	 * Returns a Bundle which contains the values of all class members.
	 * @return
	 */
	public Bundle toBundle() {
		
		Bundle b = new Bundle();
		
		b.putInt(ID, this.id);
		b.putString(TITLE, this.title);
		b.putString(GENRE, this.genre);
		b.putString(LENGTH, this.length);
		
		return b;
		
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(512);
	    return sb.append(getClass().getName())
	    		.append(" {\n")
	    		.append(ID).append(":").append(this.id).append("\n")
	    		.append(TITLE).append(":").append(this.title).append("\n")
	    		.append(GENRE).append(":").append(this.genre).append("\n")
	    		.append(LENGTH).append(":").append(this.length).append("\n")
	    		.append("}\n")
	    		.toString();
		
	}	
	
}
