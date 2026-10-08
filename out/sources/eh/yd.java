package eh;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class yd implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.b f51309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.b f51310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gd f51311c;

    public yd(Context context, gd gdVar) {
        this.f51311c = gdVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f28861g;
        af.t.f(context);
        final ye.i iVarG = af.t.c().g(aVar);
        if (aVar.a().contains(ye.c.b("json"))) {
            this.f51309a = new yk.w(new kl.b() { // from class: eh.vd
                @Override // kl.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("json"), new ye.g() { // from class: eh.xd
                        @Override // ye.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f51310b = new yk.w(new kl.b() { // from class: eh.wd
            @Override // kl.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("proto"), new ye.g() { // from class: eh.ud
                    @Override // ye.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ye.d b(gd gdVar, ed edVar) {
        int iA = gdVar.a();
        return edVar.zza() != 0 ? ye.d.e(edVar.d(iA, false)) : ye.d.g(edVar.d(iA, false));
    }

    @Override // eh.pd
    public final void a(ed edVar) {
        if (this.f51311c.a() != 0) {
            ((ye.h) this.f51310b.get()).a(b(this.f51311c, edVar));
            return;
        }
        kl.b bVar = this.f51309a;
        if (bVar != null) {
            ((ye.h) bVar.get()).a(b(this.f51311c, edVar));
        }
    }
}
