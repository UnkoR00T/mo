package fh;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fk implements mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.b f63044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.b f63045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oj f63046c;

    public fk(Context context, oj ojVar) {
        this.f63046c = ojVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f28861g;
        af.t.f(context);
        final ye.i iVarG = af.t.c().g(aVar);
        if (aVar.a().contains(ye.c.b("json"))) {
            this.f63044a = new yk.w(new kl.b() { // from class: fh.ck
                @Override // kl.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("json"), new ye.g() { // from class: fh.ek
                        @Override // ye.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f63045b = new yk.w(new kl.b() { // from class: fh.dk
            @Override // kl.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("proto"), new ye.g() { // from class: fh.bk
                    @Override // ye.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ye.d b(oj ojVar, lj ljVar) {
        int iA = ojVar.a();
        return ljVar.zza() != 0 ? ye.d.e(ljVar.d(iA, false)) : ye.d.g(ljVar.d(iA, false));
    }

    @Override // fh.mj
    public final void a(lj ljVar) {
        if (this.f63046c.a() != 0) {
            ((ye.h) this.f63045b.get()).a(b(this.f63046c, ljVar));
            return;
        }
        kl.b bVar = this.f63044a;
        if (bVar != null) {
            ((ye.h) bVar.get()).a(b(this.f63046c, ljVar));
        }
    }
}
