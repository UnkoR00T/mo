package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends l2<i, a> implements w3 {
    private static final s2<Integer, n0> zzd = new y();
    private static final i zze;
    private static volatile g4<i> zzf;
    private t2 zzc = l2.v();

    public static final class a extends l2.b<i, a> implements w3 {
        private a() {
            super(i.zze);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.s2<java.lang.Integer, com.google.android.gms.internal.vision.n0>, com.google.android.gms.internal.vision.y] */
    static {
        i iVar = new i();
        zze = iVar;
        l2.s(i.class, iVar);
    }

    private i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.i>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new i();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", n0.e()});
            case 4:
                return zze;
            case 5:
                g4<i> g4Var = zzf;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (i.class) {
                    try {
                        g4<i> g4Var2 = zzf;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zze);
                            zzf = aVar;
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
