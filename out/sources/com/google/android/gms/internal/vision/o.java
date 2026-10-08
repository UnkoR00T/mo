package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends l2<o, a> implements w3 {
    private static final o zzj;
    private static volatile g4<o> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    public static final class a extends l2.b<o, a> implements w3 {
        private a() {
            super(o.zzj);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        o oVar = new o();
        zzj = oVar;
        l2.s(o.class, oVar);
    }

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.o>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new o();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                g4<o> g4Var = zzk;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (o.class) {
                    try {
                        g4<o> g4Var2 = zzk;
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
