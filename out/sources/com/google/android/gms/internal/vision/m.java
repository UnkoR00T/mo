package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends l2<m, b> implements w3 {
    private static final m zzl;
    private static volatile g4<m> zzm;
    private int zzc;
    private int zzg;
    private long zzi;
    private long zzj;
    private String zzd = "";
    private String zze = "";
    private v2<String> zzf = l2.w();
    private String zzh = "";
    private v2<u> zzk = l2.w();

    public enum a implements o2 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final r2<a> f31149f = new c0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31151a;

        a(int i15) {
            this.f31151a = i15;
        }

        public static a b(int i15) {
            if (i15 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i15 == 1) {
                return RESULT_SUCCESS;
            }
            if (i15 == 2) {
                return RESULT_FAIL;
            }
            if (i15 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        public static q2 e() {
            return b0.f30969a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31151a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.o2
        public final int zza() {
            return this.f31151a;
        }
    }

    public static final class b extends l2.b<m, b> implements w3 {
        private b() {
            super(m.zzl);
        }

        public final b v(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((m) this.f31127b).y(j15);
            return this;
        }

        public final b w(Iterable<? extends u> iterable) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((m) this.f31127b).C(iterable);
            return this;
        }

        public final b x(String str) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((m) this.f31127b).D(str);
            return this;
        }

        public final b y(long j15) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            ((m) this.f31127b).F(j15);
            return this;
        }

        /* synthetic */ b(x xVar) {
            this();
        }
    }

    static {
        m mVar = new m();
        zzl = mVar;
        l2.s(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Iterable<? extends u> iterable) {
        v2<u> v2Var = this.zzk;
        if (!v2Var.zza()) {
            this.zzk = l2.n(v2Var);
        }
        u0.a(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j15) {
        this.zzc |= 32;
        this.zzj = j15;
    }

    public static b x() {
        return zzl.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j15) {
        this.zzc |= 16;
        this.zzi = j15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.internal.vision.g4<com.google.android.gms.internal.vision.m>, com.google.android.gms.internal.vision.l2$a] */
    @Override // com.google.android.gms.internal.vision.l2
    protected final Object o(int i15, Object obj, Object obj2) {
        Object obj3;
        x xVar = null;
        switch (x.f31323a[i15 - 1]) {
            case 1:
                return new m();
            case 2:
                return new b(xVar);
            case 3:
                return l2.p(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.e(), "zzh", "zzi", "zzj", "zzk", u.class});
            case 4:
                return zzl;
            case 5:
                g4<m> g4Var = zzm;
                if (g4Var != null) {
                    return g4Var;
                }
                synchronized (m.class) {
                    try {
                        g4<m> g4Var2 = zzm;
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
