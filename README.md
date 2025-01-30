# 📌 Gestion de ToDoList

Un script interactif permettant de gérer une liste de tâches avec une base de données MySQL.

## 🚀 Fonctionnalités
- 📋 **Lister les todos à faire**
- ✅ **Lister les todos terminées**
- ➕ **Créer une todo**
- ✏️ **Modifier une todo**
- 🗑️ **Supprimer une todo**
- 🚪 **Quitter l'application**

## 🔍 Fonctionnement
### 📜 Menu interactif
L'utilisateur peut choisir parmi les actions suivantes :

1️⃣ **Lister les todos à faire** : Affiche les tâches non terminées sous la forme `<ID>: <TITLE>`

2️⃣ **Lister les todos terminées** : Affiche les tâches complétées sous la forme `<ID>: <TITLE>`

3️⃣ **Créer une tâche** : 
   - Saisie du titre de la tâche
   - Saisie du statut (terminée ou non)
   - Confirmation de l'insertion dans la base de données
   - Message de confirmation

4️⃣ **Modifier une tâche** : 
   - Saisie de l'ID de la tâche à modifier
   - Saisie du nouveau titre
   - Saisie du nouveau statut
   - Confirmation de la modification
   - Message de validation

5️⃣ **Supprimer une tâche** : 
   - Saisie de l'ID de la tâche à supprimer
   - Confirmation avant suppression
   - Suppression effective dans la base de données

6️⃣ **Quitter l'application** : 
   - Affichage du message "👋 A la prochaine !"
   - Fermeture du programme

⚠️ **Si une action invalide est sélectionnée (autre que 1-6), un message d'erreur s'affiche :**
```
❌ Votre action n’est pas autorisée
```
Le menu principal est alors réaffiché.

⚠️ **Gestion des erreurs de base de données**
Si une erreur survient lors d'une requête SQL, le message suivant est affiché :
```
❌ Votre action est impossible car <MESSAGE DE L’EXCEPTION>
```
Le menu principal est alors réaffiché.

## 📌 Critères d’évaluation
✅ **Réutilisabilité du code** (éviter les répétitions)  
✅ **Abstractions adéquates**  
✅ **Lisibilité et clarté du code**  
✅ **Noms de méthodes/classes/variables explicites**  
✅ **Structuration optimisée du projet (entities, factories, …)**  
✅ **Respect des consignes**  
✅ **Gestion des erreurs appropriée**  

## 📅 Remise
L’étudiant devra soumettre son projet avant le **12/02/2025** sous l'une des deux formes suivantes :
- Un **lien GitHub** vers le repository contenant le projet.
- Un **fichier ZIP** contenant l'intégralité du code.

## ⚙️ Setup Initial
1️⃣ **Utiliser le template GitHub :** [openjdk template](https://github.com/henrotaym/openjdk)  
2️⃣ **Démarrer le projet dans un conteneur**  
3️⃣ **Configurer la connexion à la base de données (MySQL/TablePlus) :**  
   - Host : `localhost` ou `127.0.0.1`
   - Port : `3306`
   - Username : `user`
   - Password : `password`
   - Database : `app`
4️⃣ **Importer le fichier SQL `todos.sql`** (disponible dans le devoir sur Itslearning)  

🚀 **Si vous rencontrez un problème, contactez-moi au plus vite !**
