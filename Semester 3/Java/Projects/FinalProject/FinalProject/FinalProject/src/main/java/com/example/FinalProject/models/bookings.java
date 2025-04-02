package com.example.FinalProject.models;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class bookings {

    public int BookingId;

    public String Name;

    public String Email;

    public Date VisitDate;

    public Time VisitTime;

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date visitDate) {
        VisitDate = visitDate;
    }

    public Time getVisitTime() {
        return VisitTime;
    }

    public void setVisitTime(Time visitTime) {
        VisitTime = visitTime;
    }
}
