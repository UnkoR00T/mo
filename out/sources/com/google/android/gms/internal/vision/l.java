package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends l2<l, a> implements w3 {
    private static final l zzl;
    private static volatile g4<l> zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    public static final class a extends l2.b<l, a> implements w3 {
        private a() {
            super(l.zzl);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    public enum b implements o2 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final r2<b> f31120f = new z();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31122a;

        b(int i15) {
            this.f31122a = i15;
        }

        public static b b(int i15) {
            if (i15 == 0) {
                return REASON_UNKNOWN;
            }
            if (i15 == 1) {
                return REASON_MISSING;
            }
            if (i15 == 2) {
                return REASON_UPGRADE;
            }
            if (i15 != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        public static q2 e() {
            return a0.f30954a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31122a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31122a;
        }
    }

    static {
        l lVar = new l();
        zzl = lVar;
        l2.s(l.class, lVar);
    }

    private l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.l>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new l();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.e(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                g4<l> g4Var = zzm;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (l.class) {
                    try {
                        g4<l> g4Var2 = zzm;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzl);
                            zzm = aVar;
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
