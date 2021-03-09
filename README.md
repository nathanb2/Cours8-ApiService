# Cours8-ApiService
ApiService et Repository


Objectif: Separer la gestion et le maintient des donnees de l'activity qui ne doit avoir qu'a demander ce dont elle a besoin ou indiquer ce qu'elle veut effectuer mais pas manipuler les data directement.

Composants:

- Activity : affiche les donnees ou indique que une modification doit etre apporte aux donnees

- UserRepository : Se charge de ramener les donnees de la ou elles se trouvent (FakeApiService), l'activity ne connait que le repository a qui elle peut demander les datas ou de les odifier, le repository lui se charge de demander a la class gestionnaire des datas d'effectuer l'operation ou de retourner les datas

- UserApiService : Interface ou l'on declare les differentes actions realisables sur les datas (la class qui manipule reelement les datas devra implementer cettte interface et rendre compte de ses fonctions)

- FakeUserApiService : Class qui contient les datas (ici dans une simple list users) et implemente les fonctiosn de UserApiService et en rend compte CAD permet par exemple d'ajouter un nouveau user a la list de users

ressources: slide:  https://docs.google.com/presentation/d/1nxbfVW6fEbdUoGfyjv6QuVtOTlN7Mew2zRYBFpMGO6o/edit?usp=sharing
