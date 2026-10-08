package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends l2<p, a> implements w3 {
    private static final p zzg;
    private static volatile g4<p> zzh;
    private int zzc;
    private q zzd;
    private s zze;
    private v2<m> zzf = l2.w();

    public static final class a extends l2.b<p, a> implements w3 {
        private a() {
            super(p.zzg);
        }

        public final a v(q qVar) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((p) this.f31127b).A(qVar);
            return this;
        }

        public final a w(Iterable<? extends m> iterable) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((p) this.f31127b).B(iterable);
            return this;
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        p pVar = new p();
        zzg = pVar;
        l2.s(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(q qVar) {
        qVar.getClass();
        this.zzd = qVar;
        this.zzc |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Iterable<? extends m> iterable) {
        D();
        u0.a(iterable, this.zzf);
    }

    private final void D() {
        v2<m> v2Var = this.zzf;
        if (v2Var.zza()) {
            return;
        }
        this.zzf = l2.n(v2Var);
    }

    public static a x() {
        return zzg.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.p>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new p();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", m.class});
            case 4:
                return zzg;
            case 5:
                g4<p> g4Var = zzh;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (p.class) {
                    try {
                        g4<p> g4Var2 = zzh;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzg);
                            zzh = aVar;
                            obj3 = aVar;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return obj3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
