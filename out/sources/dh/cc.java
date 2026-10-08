package dh;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cc implements pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.b f41636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.b f41637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rb f41638c;

    public cc(Context context, rb rbVar) {
        this.f41638c = rbVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f28861g;
        af.t.f(context);
        final ye.i iVarG = af.t.c().g(aVar);
        if (aVar.a().contains(ye.c.b("json"))) {
            this.f41636a = new yk.w(new kl.b() { // from class: dh.zb
                @Override // kl.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("json"), new ye.g() { // from class: dh.bc
                        @Override // ye.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f41637b = new yk.w(new kl.b() { // from class: dh.ac
            @Override // kl.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("proto"), new ye.g() { // from class: dh.yb
                    @Override // ye.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ye.d b(rb rbVar, ob obVar) {
        return ye.d.g(obVar.d(rbVar.a(), false));
    }

    @Override // dh.pb
    public final void a(ob obVar) {
        if (this.f41638c.a() != 0) {
            ((ye.h) this.f41637b.get()).a(b(this.f41638c, obVar));
            return;
        }
        kl.b bVar = this.f41636a;
        if (bVar != null) {
            ((ye.h) bVar.get()).a(b(this.f41638c, obVar));
        }
    }
}
