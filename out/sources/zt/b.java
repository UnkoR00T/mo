package zt;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public final g a(vr.z zVar) {
        for (h hVar : b()) {
            if (hVar.b(zVar)) {
                return hVar.a(zVar);
            }
        }
        return g.a.f237214b;
    }

    public abstract List<h> b();
}
