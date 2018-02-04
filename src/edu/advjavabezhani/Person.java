package edu.advjavabezhani;

/*
Person Class is designed to hold/store
a designated designated name given by
the user.
 */

public abstract class Person
{
    private String name; //holds the name of the person

    public Person(String name)
    {
        this.name = name;  //The Name string is what the person will be called.
                           //(This) works as a reference to the current
                           //Object whose Method or constructor is being invoked.
    }


    ////////////////////////////////////////////////////////////////
    //  Appropriate setters and getters for the name string below.//
    ////////////////////////////////////////////////////////////////

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}