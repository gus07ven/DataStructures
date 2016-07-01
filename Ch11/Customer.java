/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch11;

import java.util.List;

/**
 *
 * @author dawit.gebremichael
 */
public class Customer {
	
	private int id;
    private String name;
    List<Meat> meat;
    List<Veggi> veggi;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Meat> getMeat() {
		return meat;
	}
	public void setMeat(List<Meat> meat) {
		this.meat = meat;
	}
	public List<Veggi> getVeggi() {
		return veggi;
	}
	public void setVeggi(List<Veggi> veggi) {
		this.veggi = veggi;
	}    
}
