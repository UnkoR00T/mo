package cp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f37223b = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<bp.i, l> f37224a;

    private m() {
        HashMap map = new HashMap();
        this.f37224a = map;
        n nVar = new n();
        i iVar = new i();
        g gVar = new g();
        q qVar = new q();
        d dVar = new d();
        a aVar = new a();
        t tVar = new t();
        h hVar = new h();
        p pVar = new p();
        map.put(bp.i.E3, nVar);
        map.put(bp.i.F3, nVar);
        map.put(bp.i.f20687a2, iVar);
        map.put(bp.i.f20696b2, iVar);
        map.put(bp.i.f20686a1, gVar);
        map.put(bp.i.f20695b1, gVar);
        map.put(bp.i.f20818n5, qVar);
        map.put(bp.i.f20827o5, qVar);
        map.put(bp.i.T, dVar);
        map.put(bp.i.X, dVar);
        map.put(bp.i.Y, aVar);
        map.put(bp.i.Z, aVar);
        map.put(bp.i.G7, tVar);
        map.put(bp.i.H7, tVar);
        map.put(bp.i.U1, hVar);
        map.put(bp.i.L4, pVar);
    }

    public l a(bp.i iVar) throws IOException {
        l lVar = this.f37224a.get(iVar);
        if (lVar != null) {
            return lVar;
        }
        throw new IOException("Invalid filter: " + iVar);
    }
}
