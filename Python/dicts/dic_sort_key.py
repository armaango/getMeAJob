
fname = "phones.txt"
fileHandle = open(fname)
map = {}
for line in fileHandle:
    token = line.strip().split(',')
    if token[3] not in map:
        map[token[3]] = int(token[2])
for items in reversed(sorted(map.items())):
    print items