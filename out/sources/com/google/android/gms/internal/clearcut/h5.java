package com.google.android.gms.internal.clearcut;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 extends f1<h5, a> implements n2 {
    private static volatile v2<h5> zzbg;
    private static final h5 zzbir;
    private k1<b> zzbiq = f1.p();

    public static final class a extends f1.a<h5, a> implements n2 {
        private a() {
            super(h5.zzbir);
        }

        /* synthetic */ a(i5 i5Var) {
            this();
        }
    }

    public static final class b extends f1<b, a> implements n2 {
        private static volatile v2<b> zzbg;
        private static final b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends f1.a<b, a> implements n2 {
            private a() {
                super(b.zzbiv);
            }

            public final a t(String str) {
                p();
                ((b) this.f29315b).B(str);
                return this;
            }

            public final a v(long j15) {
                p();
                ((b) this.f29315b).C(j15);
                return this;
            }

            public final a w(long j15) {
                p();
                ((b) this.f29315b).D(j15);
                return this;
            }

            /* synthetic */ a(i5 i5Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            f1.n(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(long j15) {
            this.zzbb |= 4;
            this.zzbit = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(long j15) {
            this.zzbb |= 8;
            this.zzbiu = j15;
        }

        public static a z() {
            return (a) ((f1.a) zzbiv.h(f1.e.f29324e, null, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.clearcut.f1$b, com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.h5$b>] */
        @Override // com.google.android.gms.internal.clearcut.f1
        protected final Object h(int i15, Object obj, Object obj2) {
            Object obj3;
            i5 i5Var = null;
            switch (i5.f29363a[i15 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(i5Var);
                case 3:
                    return f1.k(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    v2<b> v2Var = zzbg;
                    if (v2Var != null) {
                        return v2Var;
                    }
                    synchronized (b.class) {
                        try {
                            v2<b> v2Var2 = zzbg;
                            obj3 = v2Var2;
                            if (v2Var2 == null) {
                                ?? bVar = new f1.b(zzbiv);
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

        public final int r() {
            return this.zzya;
        }

        public final boolean v() {
            return (this.zzbb & 1) == 1;
        }

        public final String w() {
            return this.zzbis;
        }

        public final long x() {
            return this.zzbit;
        }

        public final long y() {
            return this.zzbiu;
        }
    }

    static {
        h5 h5Var = new h5();
        zzbir = h5Var;
        f1.n(h5.class, h5Var);
    }

    private h5() {
    }

    public static h5 s() {
        return zzbir;
    }

    public static h5 u(byte[] bArr) {
        return (h5) f1.o(zzbir, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.clearcut.f1$b, com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.h5>] */
    @Override // com.google.android.gms.internal.clearcut.f1
    protected final Object h(int i15, Object obj, Object obj2) {
        Object obj3;
        i5 i5Var = null;
        switch (i5.f29363a[i15 - 1]) {
            case 1:
                return new h5();
            case 2:
                return new a(i5Var);
            case 3:
                return f1.k(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                v2<h5> v2Var = zzbg;
                if (v2Var != null) {
                    return v2Var;
                }
                synchronized (h5.class) {
                    try {
                        v2<h5> v2Var2 = zzbg;
                        obj3 = v2Var2;
                        if (v2Var2 == null) {
                            ?? bVar = new f1.b(zzbir);
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

    public final List<b> r() {
        return this.zzbiq;
    }
}
