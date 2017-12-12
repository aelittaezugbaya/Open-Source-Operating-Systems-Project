#!/bin/bash
echo "Result of execution(s)" > result.txt
numMaze=$1
i=0
while [ $i -lt $numMaze ]
do
	j=$((i+1))
	echo "Maze number: "$j >> result.txt
	python maze-creator.py > maze.txt
	java -cp ./lab05_1/src lab05/Lab05 maze.txt >> result.txt
	echo " " >> result.txt
	i=$((i+1))
done
