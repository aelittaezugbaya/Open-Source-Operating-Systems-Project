import random

nodeCount = 10
min= (nodeCount-1)*2
max= (nodeCount * (nodeCount - 1) ) / 2

vertexCount = random.randint(min, max)

def calculateVertices(list):
	vertices = 0
	for x in list:
	    vertices+=len(x)
	return vertices

vertices = []

for x in range(0, nodeCount):
    vertices.append([])

currentVertexCount = 0;

while currentVertexCount < vertexCount:
    x = random.randint (0, nodeCount-1)
    y = random.randint (0, nodeCount-1)
    if x == y: continue
    #comment the following line if the graph is directed
    if y < x: x, y = y, x
    if(vertices[x].count(y) == 0):
    	vertices[x].append(y)
        vertices[y].append(x)
    else: continue
    currentVertexCount = calculateVertices(vertices)

for index, x in enumerate(vertices):
    print('{} {}'.format(index, ' '.join(str(y) for y in x) ) )

