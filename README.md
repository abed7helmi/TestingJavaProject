# 💡 Interfaces Fonctionnelles Java — Résumé et Exemples

Ce projet illustre les **principales interfaces fonctionnelles** introduites avec **Java 17** dans le package `java.util.function`.

Ces interfaces permettent d’écrire du **code plus concis, expressif et fonctionnel** grâce aux **expressions lambda** et aux **méthodes de Stream**.

---

## 🧩 1️⃣ Predicate<T>

### ➤ Description
Un **Predicate** représente une **fonction qui teste une condition** sur un objet de type `T`.  
→ Elle retourne toujours un **boolean** (`true` ou `false`).

### ➤ Signature
```java
boolean test(T t);


## ⚙️ 2️⃣ Function<T, R>

### ➤ Description
Une **Function** représente une **fonction de transformation** qui prend une valeur d’entrée de type `T`  
et retourne une **valeur de sortie** de type `R`.

Elle est très utilisée dans les **Streams** pour appliquer une transformation sur chaque élément  
(par exemple : convertir un `String` en sa longueur, ou un objet en un autre type).

### ➤ Signature
```java
R apply(T t);

## 🧩 3️⃣ Consumer<T>

### ➤ Description
Un **Consumer** représente une **opération qui consomme une donnée** sans rien retourner.  
Autrement dit, il **prend une valeur** de type `T` et **n’a pas de valeur de retour** (`void`).

Il est souvent utilisé pour **afficher**, **enregistrer**, **modifier** ou **collecter** des données,  
par exemple avec `forEach()` dans les Streams.

### ➤ Signature
```java
void accept(T t);

## 🧩 4️⃣ Supplier<T>

### ➤ Description
Un **Supplier** représente une **fonction qui ne prend aucun argument**,  
mais **fournit (ou génère)** une valeur de type `T`.

→ C’est l’inverse d’un `Consumer` :  
le `Consumer` **reçoit** une valeur,  
le `Supplier` **produit** une valeur.

Il est souvent utilisé pour :
- générer des valeurs aléatoires,
- créer des objets à la demande,
- initialiser des données dans un Stream (`Stream.generate`).

---

### ➤ Signature
```java
T get();


## 🧩 5️⃣ UnaryOperator<T>

### ➤ Description
Un **UnaryOperator** est une **fonction spécialisée** de type `Function<T, T>`.  
→ Il prend **une valeur de type T** en entrée et retourne **une valeur du même type T**.  

Il est utile pour **appliquer une transformation simple** sur un élément sans changer son type,  
par exemple doubler un nombre, inverser un texte, ou calculer le carré d’un nombre.

---

### ➤ Signature
```java
T apply(T t);

## 🧩 6️⃣ BinaryOperator<T>

### ➤ Description
Un **BinaryOperator** est une **fonction spécialisée** de type `BiFunction<T, T, T>`.  
→ Il prend **deux valeurs du même type T** en entrée et retourne **une valeur du même type T**.  

Il est utile pour **combiner ou fusionner deux éléments** de même type,  
par exemple additionner deux nombres, concaténer deux chaînes, ou calculer le maximum.

---

### ➤ Signature
```java
T apply(T t1, T t2);
