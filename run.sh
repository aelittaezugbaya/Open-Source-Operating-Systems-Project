#!/bin/bash

numMaze=$1
i=0
while [ $i -lt $numMaze ]
do
	python maze-creator.py > maze.txt
	java -cp ./lab05_1/src lab05/Lab05 maze.txt
	i=$((i+1))
done
