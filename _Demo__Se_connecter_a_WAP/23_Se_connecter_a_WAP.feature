# Automation priority: null
# Test case importance: Low
# language: en
Feature: Se connecter à WAP

	Scenario Outline: Se connecter à WAP
		Given Que le navigateur est ouvert
		And Je cherche URL de WAP
		And Je rentre <mon_email> et mon mot de passe
		And Je clique sur le bouton sign in
		Then Je verifie que j'ai réussi à me connecter

		@Données1
		Examples:
		| mon_email |
		| "fake_people_manager@yopmail.com" |

		@Données2
		Examples:
		| mon_email |
		| "fake.user@yopmail.com" |