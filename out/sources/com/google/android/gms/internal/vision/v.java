package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends l2<v, a> implements w3 {
    private static final v zzi;
    private static volatile g4<v> zzj;
    private int zzc;
    private l zzd;
    private r zze;
    private p zzf;
    private int zzg;
    private boolean zzh;

    public static final class a extends l2.b<v, a> implements w3 {
        private a() {
            super(v.zzi);
        }

        public final a v(p pVar) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((v) this.f31127b).y(pVar);
            return this;
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        v vVar = new v();
        zzi = vVar;
        l2.s(v.class, vVar);
    }

    private v() {
    }

    public static a x() {
        return zzi.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(p pVar) {
        pVar.getClass();
        this.zzf = pVar;
        this.zzc |= 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.v>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new v();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                g4<v> g4Var = zzj;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (v.class) {
                    try {
                        g4<v> g4Var2 = zzj;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzi);
                            zzj = aVar;
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
