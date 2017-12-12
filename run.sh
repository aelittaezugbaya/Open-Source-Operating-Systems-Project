#!/bin/bash

numMaze=$1

python maze-creator.py > maze.txt
java -cp ./lab05_1/src lab05/Lab05
