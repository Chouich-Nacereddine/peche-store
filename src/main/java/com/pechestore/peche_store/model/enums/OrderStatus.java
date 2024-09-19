package com.pechestore.peche_store.model.enums;

public enum OrderStatus {
    PENDING, // La commande a été passée mais n'a pas encore été traitée
    PROCESSING, // La commande est en cours de traitement
    SHIPPED, // La commande a été expédiée au client
    DELIVERED, // La commande a été livrée au client
    CANCELED, // La commande a été annulée par le client ou l'administrateur
    RETURNED // Le client a retourné la commande
}