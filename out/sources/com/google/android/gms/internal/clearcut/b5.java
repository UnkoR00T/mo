package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 extends f1<b5, a> implements n2 {
    private static final b5 zzbfc;
    private static volatile v2<b5> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    public static final class a extends f1.a<b5, a> implements n2 {
        private a() {
            super(b5.zzbfc);
        }

        /* synthetic */ a(d5 d5Var) {
            this();
        }
    }

    public enum b implements i1 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final j1<b> f29239z = new e5();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29240a;

        b(int i15) {
            this.f29240a = i15;
        }

        public static b b(int i15) {
            if (i15 == 100) {
                return COMBINED;
            }
            switch (i15) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static j1<b> e() {
            return f29239z;
        }

        @Override // com.google.android.gms.internal.clearcut.i1
        public final int a() {
            return this.f29240a;
        }
    }

    public enum c implements i1 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);


        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final j1<c> f29260x = new f5();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29262a;

        c(int i15) {
            this.f29262a = i15;
        }

        public static c b(int i15) {
            switch (i15) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static j1<c> e() {
            return f29260x;
        }

        @Override // com.google.android.gms.internal.clearcut.i1
        public final int a() {
            return this.f29262a;
        }
    }

    static {
        b5 b5Var = new b5();
        zzbfc = b5Var;
        f1.n(b5.class, b5Var);
    }

    private b5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.clearcut.f1$b, com.google.android.gms.internal.clearcut.v2<com.google.android.gms.internal.clearcut.b5>] */
    @Override // com.google.android.gms.internal.clearcut.f1
    protected final Object h(int i15, Object obj, Object obj2) {
        Object obj3;
        d5 d5Var = null;
        switch (d5.f29294a[i15 - 1]) {
            case 1:
                return new b5();
            case 2:
                return new a(d5Var);
            case 3:
                return f1.k(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", c.e(), "zzbfb", b.e()});
            case 4:
                return zzbfc;
            case 5:
                v2<b5> v2Var = zzbg;
                if (v2Var != null) {
                    return v2Var;
                }
                synchronized (b5.class) {
                    try {
                        v2<b5> v2Var2 = zzbg;
                        obj3 = v2Var2;
                        if (v2Var2 == null) {
                            ?? bVar = new f1.b(zzbfc);
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
