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

alias mettreEnLigne='$PROJECTPATH/checkers/commands/push.sh'
alias recupererMisÀjour='$PROJECTPATH/checkers/commands/pull.sh'
alias allerDansProjet='$PROJECTPATH/checkers/commands/toProject.sh'
```
Fermez ce fichier et sur le terminal, saisissez les commandes suivantes : 

```bash
source ~/.bash_profile 
mkdir $PROJECTPATH
cd $PROJECTPATH
sudo apt install git
git clone https://github.com/dickoma/checkers.git #cloning git projet
cd checkers
```
Configuration terminée ! 



