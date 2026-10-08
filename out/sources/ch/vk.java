package ch;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class vk implements dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.b f26433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.b f26434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fk f26435c;

    public vk(Context context, fk fkVar) {
        this.f26435c = fkVar;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f28861g;
        af.t.f(context);
        final ye.i iVarG = af.t.c().g(aVar);
        if (aVar.a().contains(ye.c.b("json"))) {
            this.f26433a = new yk.w(new kl.b() { // from class: ch.sk
                @Override // kl.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("json"), new ye.g() { // from class: ch.uk
                        @Override // ye.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f26434b = new yk.w(new kl.b() { // from class: ch.tk
            @Override // kl.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("proto"), new ye.g() { // from class: ch.rk
                    @Override // ye.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ye.d b(fk fkVar, ck ckVar) {
        int iA = fkVar.a();
        return ckVar.zza() != 0 ? ye.d.e(ckVar.d(iA, false)) : ye.d.g(ckVar.d(iA, false));
    }

    @Override // ch.dk
    public final void a(ck ckVar) {
        if (this.f26435c.a() != 0) {
            ((ye.h) this.f26434b.get()).a(b(this.f26435c, ckVar));
            return;
        }
        kl.b bVar = this.f26433a;
        if (bVar != null) {
            ((ye.h) bVar.get()).a(b(this.f26435c, ckVar));
        }
    }
}
