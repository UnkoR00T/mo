package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends l2<u, a> implements w3 {
    private static final u zzh;
    private static volatile g4<u> zzi;
    private int zzc;
    private k zzd;
    private int zze;
    private o zzf;
    private j zzg;

    public static final class a extends l2.b<u, a> implements w3 {
        private a() {
            super(u.zzh);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        u uVar = new u();
        zzh = uVar;
        l2.s(u.class, uVar);
    }

    private u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.u>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new u();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                g4<u> g4Var = zzi;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (u.class) {
                    try {
                        g4<u> g4Var2 = zzi;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzh);
                            zzi = aVar;
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
