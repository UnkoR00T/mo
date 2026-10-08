import sys, re
pkg, status = sys.argv[1], sys.argv[2]
p = 'PROGRESS.md'
lines = open(p).read().splitlines()
found = False
for i, l in enumerate(lines):
    if l.split(' | ')[0] == pkg:
        lines[i] = f"{pkg} | {status}"; found = True
if not found:
    sys.exit(f"NOT FOUND: {pkg}")
open(p, 'w').write('\n'.join(lines) + '\n')
print(f"{pkg} -> {status}")
