/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpatterndemo;

/**
 *
 * @author Global Computer
 */
public class ObserverPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Subject subject=new Subject();
ConcreteObserver observer1=new ConcreteObserver(subject);
subject.detach(observer1);
    }
    
}
