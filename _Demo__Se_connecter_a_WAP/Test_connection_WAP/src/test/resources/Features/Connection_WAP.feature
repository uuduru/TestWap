Feature: Se connecter � WAP

  Scenario: Se connecter WAP
    Given Que le navigateur est ouvert
    And Je cherche URL de WAP
    And Je rentre le "<nom_utilisateur>" et son mot de passe
    Then Je clique sur le bouton sign in

    Examples:
			| nom_utilisateur 							 |
			| fake_people_manager@yopmail.com|
			| fake.user@yopmail.com					 |
    