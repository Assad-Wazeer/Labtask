/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpatterndemo.EventManager;

/**
 *
 * @author Global Computer
 */
import static javax.management.Query.gt;
import observerpatterndemo.Observer;
import observerpatterndemo.Subject;
public class SMSSupportListener extends Observer {
    private String phoneNumber;
    private String defaultSMS;

    public SMSSupportListener(Subject subject, String phoneNumber, String defaultSMS) {
        this.subject = subject;
        this.subject.attach(this);
        this.phoneNumber = phoneNumber;
        this.defaultSMS = defaultSMS;
    }

    @Override
    public void update() {
        int gt;
        if (defaultSMS.length() &gt; 160) {
            System.out.println("Warning: Define a valid default SMS. The current SMS length is more than 160 characters.");
        } else {
            sendSMS(phoneNumber, defaultSMS);
        }
    }

    private void sendSMS(String phoneNumber, String message) {
        // Simulate sending SMS
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}

