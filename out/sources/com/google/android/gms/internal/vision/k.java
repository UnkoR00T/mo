package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends l2<k, a> implements w3 {
    private static final k zzd;
    private static volatile g4<k> zze;
    private v2<t> zzc = l2.w();

    public static final class a extends l2.b<k, a> implements w3 {
        private a() {
            super(k.zzd);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        k kVar = new k();
        zzd = kVar;
        l2.s(k.class, kVar);
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.k>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new k();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", t.class});
            case 4:
                return zzd;
            case 5:
                g4<k> g4Var = zze;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (k.class) {
                    try {
                        g4<k> g4Var2 = zze;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzd);
                            zze = aVar;
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
