/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttrip.service;

import besttrip.entity.Evenement;
import besttrip.entity.Participant;
import besttrip.entity.Reservation;
 
/**
 *
 * @author Dhouha
 * @param <T>
 */
import java.util.List;
import javafx.collections.ObservableList;

public interface ReservationService {
    void ajouterReservation(Reservation reservation,String Tel);
    void modifierReservation(Reservation reservation);
    void supprimerReservation(int id);
    Reservation obtenirReservationParId(int id);
    Evenement obtenirEvenementParId(int id);
    Participant obtenirParticipantParId(int id) ;
    ObservableList<Reservation> obtenirToutesReservations();
}