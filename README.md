# Jeu de dames

Ce projet a pour but de réaliser un jeu de dames ... 

# Configuration : 

```bash
gedit ~/.bash_profile # gedit can be changed to another editor 
```
Cette commande ouvrira le fichier .bash_profile en lecture et écriture (munissez vous du droit si nécessaire).

Copiez-y les commandes ci-dessous : 

```bash
export PROJECTPATH='chemin_absolu_du_projet'
alias mettreEnLigne='$PROJECTPATH/push.sh'
alias recupererMisÀjour='$PROJECTPATH/pull.sh'
```
Fermez ce fichier et sur le terminal, saisissez les commandes suivantes : 

```bash
source ~/.bash_profile 
mkdir $PROJECTPATH
cd $PROJECTPATH
git clone https://github.com/dickoma/checkers.git #cloning git projet
```
