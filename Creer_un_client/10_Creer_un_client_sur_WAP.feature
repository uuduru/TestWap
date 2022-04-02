# Automation priority: null
# Test case importance: High
# language: en
Feature: Créer un client sur WAP

	Scenario: Créer un client sur WAP
		Given Que je clique sur l'onglet <Administration>
		And Que je Clique sur le bouton "+ Ajouter" du panneau Liste des clients de l’onglet Administration.
		And Que je renseigne le nom du client dans le champ prévu
		And Que je clique sur le bouton <Ajouter>
		Then Je vérifie que le client a bien été créé