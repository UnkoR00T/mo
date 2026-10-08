package vb;

import cc.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvb/z;", "Lvb/y;", "<init>", "()V", "Lcc/w;", "id", "Lvb/x;", "f", "(Lcc/w;)Lvb/x;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lcc/w;)Z", "", "b", "Ljava/util/Map;", "runs", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<WorkGenerationalId, x> runs = new LinkedHashMap();

    @Override // vb.y
    public x c(WorkGenerationalId id5) {
        return this.runs.remove(id5);
    }

    @Override // vb.y
    public boolean e(WorkGenerationalId id5) {
        return this.runs.containsKey(id5);
    }

    @Override // vb.y
    public x f(WorkGenerationalId id5) {
        Map<WorkGenerationalId, x> map = this.runs;
        x xVar = map.get(id5);
        if (xVar == null) {
            xVar = new x(id5);
            map.put(id5, xVar);
        }
        return xVar;
    }

    @Override // vb.y
    public List<x> remove(String workSpecId) {
        Map<WorkGenerationalId, x> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, x> entry : map.entrySet()) {
            if (fr.t.c(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return pq.v.f1(linkedHashMap.values());
    }
}
