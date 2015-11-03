package org.yeeku.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class State implements Serializable
{
	//��Ʒ��״̬ID
	private Integer id;
	//��Ʒ��״̬��
	private String stateName;
	//��״̬�µ�������Ʒ
	private Set<Item> items = new HashSet<Item>();
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Set<Item> getItems() {
        return items;
    }
    public void setItems(Set<Item> items) {
        this.items = items;
    }
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
