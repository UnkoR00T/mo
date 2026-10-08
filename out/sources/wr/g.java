package wr;

import oq.y;
import pq.v;
import pq.v0;
import st.p2;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zs.f f214537a = zs.f.l("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.f f214538b = zs.f.l("replaceWith");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zs.f f214539c = zs.f.l("level");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zs.f f214540d = zs.f.l("expression");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zs.f f214541e = zs.f.l("imports");

    public static final c b(sr.j jVar, String str, String str2, String str3, boolean z15) {
        return new l(jVar, sr.p.a.f183677y, v0.l(y.a(f214537a, new ft.y(str)), y.a(f214538b, new ft.a(new l(jVar, sr.p.a.B, v0.l(y.a(f214540d, new ft.y(str2)), y.a(f214541e, new ft.b(v.n(), new f(jVar)))), false, 8, null))), y.a(f214539c, new ft.k(zs.b.f236634d.c(sr.p.a.A), zs.f.l(str3)))), z15);
    }

    public static /* synthetic */ c c(sr.j jVar, String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = "";
        }
        if ((i15 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        return b(jVar, str, str2, str3, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 d(sr.j jVar, i0 i0Var) {
        return i0Var.i().m(p2.INVARIANT, jVar.X());
    }
}
