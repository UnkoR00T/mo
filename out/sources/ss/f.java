package ss;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static final a0 a(us.o oVar, ws.d dVar, ws.h hVar, boolean z15, boolean z16, boolean z17) {
        xs.a.d dVar2 = (xs.a.d) ws.f.a(oVar, xs.a.f220666d);
        if (dVar2 == null) {
            return null;
        }
        if (z15) {
            ys.d.a aVarC = ys.h.f229107a.c(oVar, dVar, hVar, z17);
            if (aVarC == null) {
                return null;
            }
            return a0.f183823b.b(aVarC);
        }
        if (z16 && dVar2.M()) {
            return a0.f183823b.c(dVar, dVar2.H());
        }
        return null;
    }

    public static /* synthetic */ a0 b(us.o oVar, ws.d dVar, ws.h hVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        if ((i15 & 16) != 0) {
            z16 = false;
        }
        if ((i15 & 32) != 0) {
            z17 = true;
        }
        return a(oVar, dVar, hVar, z15, z16, z17);
    }
}
