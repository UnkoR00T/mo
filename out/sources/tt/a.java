package tt;

import st.w1;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final w1 a(boolean z15, boolean z16, b bVar, f fVar, g gVar) {
        return new w1(z15, z16, false, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ w1 b(boolean z15, boolean z16, b bVar, f fVar, g gVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        if ((i15 & 4) != 0) {
            bVar = u.f192145a;
        }
        if ((i15 & 8) != 0) {
            fVar = f.a.f192118a;
        }
        if ((i15 & 16) != 0) {
            gVar = g.a.f192119a;
        }
        return a(z15, z16, bVar, fVar, gVar);
    }
}
