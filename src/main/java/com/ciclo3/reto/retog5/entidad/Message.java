package com.ciclo3.reto.retog5.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMessage;
    private String messageText;
    @ManyToOne
    @JoinColumn(name = "message_idMessage_room")
    @JsonIgnoreProperties("messages")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "message_idMessage_client")
    @JsonIgnoreProperties("messages")
    private Client client;



}
