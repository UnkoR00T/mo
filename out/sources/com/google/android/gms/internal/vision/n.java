package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends l2<n, a> implements w3 {
    private static final n zzj;
    private static volatile g4<n> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    public static final class a extends l2.b<n, a> implements w3 {
        private a() {
            super(n.zzj);
        }

        /* synthetic */ a(x xVar) {
            this();
        }
    }

    public enum b implements o2 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final r2<b> f31160e = new d0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31162a;

        b(int i15) {
            this.f31162a = i15;
        }

        public static b b(int i15) {
            if (i15 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i15 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i15 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        public static q2 e() {
            return e0.f30997a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31162a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31162a;
        }
    }

    public enum c implements o2 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final r2<c> f31167f = new g0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31169a;

        c(int i15) {
            this.f31169a = i15;
        }

        public static c b(int i15) {
            if (i15 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i15 == 1) {
                return LANDMARK_NONE;
            }
            if (i15 == 2) {
                return LANDMARK_ALL;
            }
            if (i15 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        public static q2 e() {
            return f0.f31010a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31169a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31169a;
        }
    }

    public enum d implements o2 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final r2<d> f31174f = new h0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31176a;

        d(int i15) {
            this.f31176a = i15;
        }

        public static d b(int i15) {
            if (i15 == 0) {
                return MODE_UNKNOWN;
            }
            if (i15 == 1) {
                return MODE_ACCURATE;
            }
            if (i15 == 2) {
                return MODE_FAST;
            }
            if (i15 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        public static q2 e() {
            return i0.f31068a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31176a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31176a;
        }
    }

    static {
        n nVar = new n();
        zzj = nVar;
        l2.s(n.class, nVar);
    }

    private n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.n>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new n();
            case 2:
                return new a(xVar);
            case 3:
                return l2.p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.e(), "zze", c.e(), "zzf", b.e(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                g4<n> g4Var = zzk;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (n.class) {
                    try {
                        g4<n> g4Var2 = zzk;
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
