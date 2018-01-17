package com.example.maciek.rejestracjawizyt;

/**
 * Created by Maciek on 17.01.2018.
 */

public class Lekarz {

    private String name;
    private String specialist;

    public Lekarz(String nazwa, String special)
    {

        name=nazwa;
        specialist=special;

    }

    public String getName()
    {
        return  name;
    }
    public String getSpecialist()
    {
        return  specialist;
    }
    public void setName(String nam)
    {
        name=nam;
    }
    public void setSpecialist(String special)
    {
        specialist=special;
    }
}
