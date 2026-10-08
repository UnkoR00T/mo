package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 extends f1<a5, a> implements n2 {
    private static volatile v2<a5> zzbg;
    private static final a5 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    public static final class a extends f1.a<a5, a> implements n2 {
        private a() {
            super(a5.zztx);
        }

        /* synthetic */ a(d5 d5Var) {
            this();
        }
    }

    static {
        a5 a5Var = new a5();
        zztx = a5Var;
        f1.n(a5.class, a5Var);
    }

    private a5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.clearcut.f1$b, com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.a5>] */
    @Override // com.google.android.gms.internal.clearcut.f1
    protected final Object h(int i15, Object obj, Object obj2) {
        Object obj3;
        d5 d5Var = null;
        switch (d5.f29294a[i15 - 1]) {
            case 1:
                return new a5();
            case 2:
                return new a(d5Var);
            case 3:
                return f1.k(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                v2<a5> v2Var = zzbg;
                if (v2Var != null) {
                    return v2Var;
                }
                synchronized (a5.class) {
                    try {
                        v2<a5> v2Var2 = zzbg;
                        obj3 = v2Var2;
                        if (v2Var2 == null) {
                            ?? bVar = new f1.b(zztx);
                            zzbg = bVar;
                            obj3 = bVar;
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
