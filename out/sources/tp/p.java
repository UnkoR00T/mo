package tp;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class p implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bp.b f191382a;

    public p(bp.b bVar) {
        this.f191382a = bVar;
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f191382a;
    }

    public q a() {
        if (c()) {
            return new q((bp.o) this.f191382a);
        }
        throw new IllegalStateException("This entry is not an appearance stream");
    }

    public Map<bp.i, q> b() {
        if (!d()) {
            throw new IllegalStateException("This entry is not an appearance subdictionary");
        }
        bp.d dVar = (bp.d) this.f191382a;
        HashMap map = new HashMap();
        for (bp.i iVar : dVar.O4()) {
            bp.b bVarP4 = dVar.p4(iVar);
            if (bVarP4 instanceof bp.o) {
                map.put(iVar, new q((bp.o) bVarP4));
            }
        }
        return new hp.b(map, dVar);
    }

    public boolean c() {
        return this.f191382a instanceof bp.o;
    }

    public boolean d() {
        return !(this.f191382a instanceof bp.o);
    }
}
