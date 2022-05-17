# Automation priority: null
# Test case importance: Low
# language: en
Feature: Se connecter à WAP

	Scenario: Se connecter à WAP
		Given Que le navigateur est ouvert
		And Je cherche URL de WAP
		And Je rentre le nom utilisateur et son mot de passe
		And Je clique sur le bouton sign in