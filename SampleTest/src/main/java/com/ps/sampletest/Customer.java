package com.ps.sampletest;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CUSTOMER_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "CUSTOMER_ID_GENERATOR", sequenceName = "CUSTOMER_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Address")
   private java.lang.String address;

   @org.kie.api.definition.type.Label("Age")
   private java.lang.Integer age;

   @org.kie.api.definition.type.Label("Credit Score")
   private Integer creditScore;

   public Customer()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getAddress()
   {
      return this.address;
   }

   public void setAddress(java.lang.String address)
   {
      this.address = address;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public Customer(java.lang.Long id, java.lang.String name,
         java.lang.String address, java.lang.Integer age,
         java.lang.Integer creditScore)
   {
      this.id = id;
      this.name = name;
      this.address = address;
      this.age = age;
      this.creditScore = creditScore;
   }

}