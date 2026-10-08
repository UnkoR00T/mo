package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends l2<r, a> implements w3 {
    private static final r zzj;
    private static volatile g4<r> zzk;
    private int zzc;
    private long zze;
    private h zzf;
    private n zzh;
    private i zzi;
    private String zzd = "";
    private String zzg = "";

    public static final class a extends l2.b<r, a> implements w3 {
        private a() {
            super(r.zzj);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        r rVar = new r();
        zzj = rVar;
        l2.s(r.class, rVar);
    }

    private r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.r>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                g4<r> g4Var = zzk;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (r.class) {
                    try {
                        g4<r> g4Var2 = zzk;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzj);
                            zzk = aVar;
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
