package bh;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.b f19468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.b f19469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f19470c;

    public r0(Context context, i0 i0Var) {
        this.f19470c = i0Var;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f28861g;
        af.t.f(context);
        final ye.i iVarG = af.t.c().g(aVar);
        if (aVar.a().contains(ye.c.b("json"))) {
            this.f19468a = new yk.w(new kl.b() { // from class: bh.o0
                @Override // kl.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("json"), new ye.g() { // from class: bh.q0
                        @Override // ye.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f19469b = new yk.w(new kl.b() { // from class: bh.p0
            @Override // kl.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, ye.c.b("proto"), new ye.g() { // from class: bh.n0
                    @Override // ye.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
