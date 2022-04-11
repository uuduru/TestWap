# Automation priority: null
# Test case importance: Low
# language: en
Feature: Créer d'une activité dans l'onglet collaborateur avec Type d'activité ‘Billable ferme’ ou ‘Billable prévisionnel’ ou ‘chargeable’ ou ‘B&P et interne’

	Scenario: Créer d'une activité dans l'onglet collaborateur avec Type d'activité ‘Billable ferme’ ou ‘Billable prévisionnel’ ou ‘chargeable’ ou ‘B&P et interne’
		Given Je clique sur l'onglet "Collaborateur"
		And Je coche la <case> devant le collaborateur
		And Je clique sur le panneau "Modifier Planning"
		And Je clique sur le bouton "+ Nouvelle activité"
		And Je choisis le "Type d’activité"
		Given "Type d'activité" = ‘Billable ferme’ ou ‘Billable prévisionnel’ ou ‘chargeable’ ou ‘B&P et interne’
		Then Choisir un client au hasard dans la liste déroulante "Client"
		And Cocher la case "Staffing 50%" puis la décocher
			#Permet de vérifier que le bouton "Staffing 50%" fonctionne bien
			#
		And Décocher tous les jours de la semaine puis les re-cocher
			#Permet de vérifier le fonctionnement de l'ensemble des cases des jours
			#
		And Choisir un projet dans la liste déroulante "Projet"
		When "Projet" = 'Je ne trouve pas le projet'
		Then Cliquer sur toutes les cases dans "Type contrat" puis revenir à la case "Rouge"
		Then "Nom du projet" = 'abcd_Test' puis cliquer sur "Ajouter" pour ajouter le projet
		Then Cliquer sur "Ajouter" pour finaliser l'activité
		But "Projet" != 'Je ne trouve pas le projet'
		Then Cliquer sur "Ajouter" pour finaliser l'activité