package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends l2<j, a> implements w3 {
    private static final j zzg;
    private static volatile g4<j> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    public static final class a extends l2.b<j, a> implements w3 {
        private a() {
            super(j.zzg);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        j jVar = new j();
        zzg = jVar;
        l2.s(j.class, jVar);
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.j>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new j();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", n0.e(), "zze", p0.e(), "zzf"});
            case 4:
                return zzg;
            case 5:
                g4<j> g4Var = zzh;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (j.class) {
                    try {
                        g4<j> g4Var2 = zzh;
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
