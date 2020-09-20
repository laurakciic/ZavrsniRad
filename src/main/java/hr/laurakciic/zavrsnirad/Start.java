/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad;

import hr.laurakciic.zavrsnirad.utility.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author Laura
 */
public class Start {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}
