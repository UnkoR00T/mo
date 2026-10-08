package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends l2<s, a> implements w3 {
    private static final s zzf;
    private static volatile g4<s> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    public static final class a extends l2.b<s, a> implements w3 {
        private a() {
            super(s.zzf);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    static {
        s sVar = new s();
        zzf = sVar;
        l2.s(s.class, sVar);
    }

    private s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.s>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new s();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                g4<s> g4Var = zzg;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (s.class) {
                    try {
                        g4<s> g4Var2 = zzg;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzf);
                            zzg = aVar;
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
