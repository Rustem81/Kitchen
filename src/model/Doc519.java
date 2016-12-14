package model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * �����-������ ��� ����� (Doc519).
 */
public class Doc519 {
	
//	private final ObjectProperty<LocalDate> Date; //����

    private final StringProperty PeopelKassa; //������
  /*  private final StringProperty PeopelEconomist; //���������
    
    private final IntegerProperty SumRUR; //����� RUR
    private final IntegerProperty SumUSD; //����� USD
    private final IntegerProperty SumEUR; //����� EUR
    
    private final IntegerProperty Cash_blank_Write; //���.���. ������ (��������.) 50�.
    private final IntegerProperty Cash_blank_Empty; //���. ���. ������ (������) 50�.
    
    private final IntegerProperty Case_key_box; //����� � ����.��., ����.����.��. ����
    private final IntegerProperty Case_key_TU; //����� � ����������� ������ �� ��
    
    private final IntegerProperty Case_GOLD_IBS; //����� � ���������� �������� �� ���
    private final IntegerProperty Service_card_ATM; //��������� ����� ��������� ���������
    
    
    private final IntegerProperty Card_Person; //������������. ����.����� (�������)
    
    private final IntegerProperty Card_prepar_TU; //���������� �����, ������� �� ��
    
    private final IntegerProperty Veksel_noWrite; //������ �������� (��������.)
    private final IntegerProperty Veksel_Write; //������ �������� (����.�����.)*/
    
    
    public Doc519() {
        this(null);
    }
     
    public Doc519(String peopelKassa/*, String PeopelEconomist, Integer SumRUR, Integer SumUSD, Integer SumEUR, Integer Cash_blank_Write, Integer Cash_blank_Empty, 
    		Integer Case_key_box,  Integer Card_Person, Integer Card_prepar_TU, Integer Veksel_noWrite, Integer Case_key_TU,  Integer Service_card_ATM, Integer Case_GOLD_IBS,
    		Integer Veksel_Write*/){
    	
  //  	this.Date = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
     	this.PeopelKassa = new SimpleStringProperty(peopelKassa);
 /*    	this.PeopelEconomist = new SimpleStringProperty(PeopelEconomist);
    	this.SumRUR = new SimpleIntegerProperty(SumRUR);
    	this.SumUSD = new SimpleIntegerProperty(SumUSD);
    	this.SumEUR = new SimpleIntegerProperty(SumEUR);
    	
    	this.Cash_blank_Write = new SimpleIntegerProperty(Cash_blank_Write);
    	this.Cash_blank_Empty = new SimpleIntegerProperty(Cash_blank_Empty);
    	this.Case_key_box = new SimpleIntegerProperty(Case_key_box);
    	
    	this.Case_key_TU = new SimpleIntegerProperty(Case_key_TU);
    	this.Case_GOLD_IBS = new SimpleIntegerProperty(Case_GOLD_IBS);
    	this.Service_card_ATM = new SimpleIntegerProperty(Service_card_ATM);
    	
    	this.Card_Person = new SimpleIntegerProperty(Card_Person);
    	this.Card_prepar_TU = new SimpleIntegerProperty(Card_prepar_TU);
    	this.Veksel_noWrite = new SimpleIntegerProperty(Veksel_noWrite);
    	this.Veksel_Write = new SimpleIntegerProperty(Veksel_Write);*/
    	}
    
    
//������   
    public String getPeopelKassa() {
        return PeopelKassa.get();
    }

    public void setPeopelKassa(String firstName) {
        this.PeopelKassa.set(firstName);
    }

    public StringProperty PeopelKassaProperty() {
        return PeopelKassa;
    }
/*
//����    
    public LocalDate getDate() {
        return Date.get();
    }

    public void setDate(LocalDate Date) {
        this.Date.set(Date);
    }

    public ObjectProperty<LocalDate> DateProperty() {
        return Date;
    }

//���������
    public String getPeopelEconomist() {
        return PeopelEconomist.get();
    }

    public void setPeopelEconomist(String PeopelEconomist) {
        this.PeopelEconomist.set(PeopelEconomist);
    }

    public StringProperty PeopelEconomistProperty() {
        return PeopelEconomist;
    }
//����� RUR 
    public int getSumRUR() {
        return SumRUR.get();
    }

    public void setSumRUR(int SumRUR) {
        this.SumRUR.set(SumRUR);
    }

    public IntegerProperty SumRUR() {
        return SumRUR;
    }
//����� USD    
    public int getSumUSD() {
        return SumRUR.get();
    }

    public void setSumUSD(int SumUSD) {
        this.SumUSD.set(SumUSD);
    }

    public IntegerProperty SumUSD() {
        return SumRUR;
    }
//����� EUR
    public int getSumEUR() {
        return SumEUR.get();
    }
    public void setSumEUR(int SumEUR) {
        this.SumEUR.set(SumEUR);
    }
    public IntegerProperty SumEUR() {
        return SumEUR;
    }
    
//���.���. ������ (��������.) 50�.    
    public int getCash_blank_Write() {
        return Cash_blank_Write.get();
    }
    public void setCash_blank_Write(int Cash_blank_Write) {
        this.Cash_blank_Write.set(Cash_blank_Write);
    }
    public IntegerProperty Cash_blank_Write() {
        return Cash_blank_Write;
    }
//���. ���. ������ (������) 50�.   
    public int getCash_blank_Empty() {
        return Cash_blank_Empty.get();
    }
    public void setCash_blank_Empty(int Cash_blank_Empty) {
        this.Cash_blank_Empty.set(Cash_blank_Empty);
    }
    public IntegerProperty Cash_blank_Empty() {
        return Cash_blank_Empty;
    }
//����� � ����.��., ����.����.��. ���� 
    public int getCase_key_box() {
        return Case_key_box.get();
    }
    public void setCase_key_box(int Case_key_box) {
        this.Case_key_box.set(Case_key_box);
    }
    public IntegerProperty Case_key_box() {
        return Case_key_box;
    }
//����� � ����������� ������ �� ��    
    public int getCase_key_TU() {
        return Case_key_TU.get();
    }
    public void setCase_key_TU(int Case_key_TU) {
        this.Case_key_TU.set(Case_key_TU);
    }
    public IntegerProperty Case_key_TU() {
        return Case_key_TU;
    }
//����� � ���������� �������� �� ���   
    public int getCase_GOLD_IBS() {
        return Case_GOLD_IBS.get();
    }
    public void setCase_GOLD_IBS(int Case_GOLD_IBS) {
        this.Case_GOLD_IBS.set(Case_GOLD_IBS);
    }
    public IntegerProperty Case_GOLD_IBS() {
        return Case_GOLD_IBS;
    }
//��������� ����� ��������� ��������� 
    public int getService_card_ATM() {
        return Service_card_ATM.get();
    }
    public void setService_card_ATM(int Service_card_ATM) {
        this.Service_card_ATM.set(Service_card_ATM);
    }
    public IntegerProperty Service_card_ATM() {
        return Service_card_ATM;
    }
//������������. ����.����� (�������)
    public int getCard_Person() {
        return Card_Person.get();
    }
    public void setCard_Person(int Card_Person) {
        this.Card_Person.set(Card_Person);
    }
    public IntegerProperty Card_Person() {
        return Card_Person;
    }
//���������� �����, ������� �� ��     
    public int getCard_prepar_TU () {
        return Card_Person.get();
    }
    public void setCard_prepar_TU (int Card_prepar_TU ) {
        this.Card_prepar_TU .set(Card_prepar_TU );
    }
    public IntegerProperty Card_prepar_TU () {
        return Card_prepar_TU;
    }
//������ �������� (��������.)    
    public int getVeksel_noWrite () {
        return Veksel_noWrite.get();
    }
    public void setVeksel_noWrite (int Veksel_noWrite ) {
        this.Veksel_noWrite .set(Veksel_noWrite );
    }
    public IntegerProperty Veksel_noWrite () {
        return Veksel_noWrite;
    }
//������ �������� (����.�����.)   
    public int getVeksel_Write () {
        return Veksel_Write.get();
    }
    public void setVeksel_Write (int Veksel_Write ) {
        this.Veksel_Write .set(Veksel_Write );
    }
    public IntegerProperty Veksel_Write () {
        return Veksel_Write;
    }    
*/    
    
     
    
}
