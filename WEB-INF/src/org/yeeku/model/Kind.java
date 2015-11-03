package org.yeeku.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class Kind implements Serializable
{
	//��ʶ���ԣ���Ӧ���ݱ���߼�����
	private Integer id;
	//������
	private String kindName;
	//��������
	private String kindDesc;
	//�������µ�������Ʒ
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
    public String getKindDesc() {
        return kindDesc;
    }
    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }
    public String getKindName() {
        return kindName;
    }
    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

}
