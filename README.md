# Kata Shame-on-it

## :family: Introduction

J'ai appris à utiliser les freins de mon vélo en descente, et à ne pas utiliser seulement le frein
avant dans ces conditions pour éviter me faire catapulter. J'ai appris à ne pas énerver une personne
qui tient un chat dans ses bras. J'ai appris à me positionner dans un lit pliable de façon à ne pas
laisser le lit se replier sur moi. J'ai même appris à ne pas manger les limaces.

Vous allez me dire "Heureusement que t'as appris tout ça !", et vous avez raison. Et j'ai eu la
chance de grandir dans une famille assez grande pour laisser mes frères et soeurs faire toutes ces
erreurs, et pour en tirer l'enseignement nécessaire afin ne pas les copier.

J'aime me dire que c'est aussi une des façons de progresser dans l'art du développement. Au lieu de
sauter à la gorger de mes collègues adorés, je préfère me nourrir de leurs erreurs. Dans ce Kata
nous verons un condensé de ce que vous pouvez rencontrer dans n'importe quel projet.

L'idée général est de repartir avec plein de bonnes idées à mettre en place dès demain.

**Nous allons regarder du code d'un autre développeur et essayer d'en tirer des enseignements.**

Gardez à l'esprit que le développeur n'a (sûrement) pas fait exprès d'écrire du code sous forme
d'énigmes. Il a produit du code à un moment donné, dans des circonstances précises, avec
l'expérience qui était la sienne à ce moment-là. Il fera mieux la prochaine fois, c'est certain.

Bref, on peut critiquer vivement un code tout en restant dans le respect de celui qui l'a écrit (coeurs sur lui).

## :information_source: Organisation d'une session

### :books: Mise en place (10 minutes)

Former des groupes de 2 ou 3 développeurs.

L'organisateur distribue à chaque groupe de participants un (ou plusieurs) bout(s) de code à
analyser ([snippets](/kotlin/snippets/)). L'idée est que chaque groupe ait des snippets
différents.

Idée : _Imprimer les snippets sur des feuilles A5 voire A6._

### :mag_right: Déroulement du kata (10-15 minutes par snippets)

Un fois les snippets distribués, chaque groupe peut commencer son analyse. L'analyse doit porter
sur la "propreté" du code. La notion de propreté est plutôt relative à chacun, il faut donc se
mettre d'accord entre participants du même groupe sur les choses qui clochent.

Une fois les saletés identifiées, il faut proposer 1, 2 ou 3 alternatives différentes dont au moins
une meilleure que le snippet d'origine.

### :mega: Mise en commun (5 minutes par snippets)

Après quelques minutes le groupe doit présenter le résultat de son travail à tous les participants.
Le compte-rendu doit contenir :
- l'analyse de ce qui cloche;
- les alternatives proposées.

Après restitution de chaque snippets, on peut prendre quelques minutes pour débattre des solutions
proposées.

## :memo: Aide pour les plus débutants

Pour détecter un code qui mériterait d'être retravaillé il y a quelques questions qui peuvent
orienter la recherche :
- Est-ce qu'il y a du code dupliqué ? Ou une structure de code dupliquée ?
- Est-ce qu'il y a un bout de code qui nécessite d'être relu plusieurs fois pour être compris ?
- Est-ce que toucher à un bout de code me semble risqué ?
- Est-ce qu'un bout de code me chagrine ?

Il ne s'agit pas là d'une liste exaustive, il y a bien d'autres questions à se poser. Toutefois
je pense qu'elles vous aideront à débusquer les premiers pièges.