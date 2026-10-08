package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends l2<q, b> implements w3 {
    private static final q zzi;
    private static volatile g4<q> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public enum a implements o2 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final r2<a> f31238f = new k0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31240a;

        a(int i15) {
            this.f31240a = i15;
        }

        public static a b(int i15) {
            if (i15 == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i15 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i15 == 2) {
                return FORMAT_RGB8;
            }
            if (i15 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        public static q2 e() {
            return j0.f31101a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31240a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31240a;
        }
    }

    public static final class b extends l2.b<q, b> implements w3 {
        private b() {
            super(q.zzi);
        }

        public final b v(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((q) this.f31127b).y(j15);
            return this;
        }

        public final b w(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((q) this.f31127b).B(j15);
            return this;
        }

        public final b x(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((q) this.f31127b).D(j15);
            return this;
        }

        public final b y(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((q) this.f31127b).F(j15);
            return this;
        }

        /* synthetic */ b(x xVar) {
            this();
        }
    }

    static {
        q qVar = new q();
        zzi = qVar;
        l2.s(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j15) {
        this.zzc |= 4;
        this.zzf = j15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(long j15) {
        this.zzc |= 8;
        this.zzg = j15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j15) {
        this.zzc |= 16;
        this.zzh = j15;
    }

    public static b x() {
        return zzi.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j15) {
        this.zzc |= 2;
        this.zze = j15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.q>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new q();
            case 2:
                return new b(xVar);
            case 3:
                return l2.p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.e(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                g4<q> g4Var = zzj;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (q.class) {
                    try {
                        g4<q> g4Var2 = zzj;
                        obj3 = g4Var2;
                        if (g4Var2 == null) {
                            ?? aVar = new l2.a(zzi);
                            zzj = aVar;
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
