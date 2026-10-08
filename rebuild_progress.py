import os, glob
frags = glob.glob('notes/_status/*.txt')
over = {}
for f in frags:
    for line in open(f):
        line = line.strip()
        if not line: continue
        pkg = line.split(' | ')[0]
        over[pkg] = line
lines = open('md/INDEX.md').read().splitlines()
out = []
import re
for l in lines:
    m = re.match(r'^\| (\d+)_(\w+)\.md \|', l)
    if not m: continue
    pkg = m.group(1)+'_'+m.group(2)+'.md'
    out.append(over.get(pkg, pkg + ' | TODO'))
open('PROGRESS.md','w').write('\n'.join(out)+'\n')
done = sum(1 for l in out if 'DONE' in l)
skip = sum(1 for l in out if 'SKIPPED' in l)
print(f'pakiety: {len(out)}  DONE: {done}  SKIPPED: {skip}  TODO: {len(out)-done-skip}')
