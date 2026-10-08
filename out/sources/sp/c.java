package sp;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static a a(bp.d dVar) {
        if (dVar == null) {
            return null;
        }
        String strH4 = dVar.H4(bp.i.J7);
        if ("JavaScript".equals(strH4)) {
            return new g(dVar);
        }
        if ("GoTo".equals(strH4)) {
            return new d(dVar);
        }
        if ("Launch".equals(strH4)) {
            return new h(dVar);
        }
        if ("GoToR".equals(strH4)) {
            return new k(dVar);
        }
        if ("URI".equals(strH4)) {
            return new p(dVar);
        }
        if ("Named".equals(strH4)) {
            return new j(dVar);
        }
        if ("Sound".equals(strH4)) {
            return new m(dVar);
        }
        if ("Movie".equals(strH4)) {
            return new i(dVar);
        }
        if ("ImportData".equals(strH4)) {
            return new f(dVar);
        }
        if ("ResetForm".equals(strH4)) {
            return new l(dVar);
        }
        if ("Hide".equals(strH4)) {
            return new e(dVar);
        }
        if ("SubmitForm".equals(strH4)) {
            return new n(dVar);
        }
        if ("Thread".equals(strH4)) {
            return new o(dVar);
        }
        if ("GoToE".equals(strH4)) {
            return new b(dVar);
        }
        return null;
    }
}
