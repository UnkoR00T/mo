package m8;

import a8.a3;
import a8.e3;
import a8.y1;
import a8.z2;
import ak.n0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import t7.m0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class k extends f8.v implements u.b {

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final int[] f124317h2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static boolean f124318i2;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static boolean f124319j2;
    private boolean A1;
    private l0 B1;
    private boolean C1;
    private int D1;
    private List<Object> E1;
    private Surface F1;
    private l G1;
    private w7.d0 H1;
    private boolean I1;
    private int J1;
    private int K1;
    private long L1;
    private int M1;
    private int N1;
    private int O1;
    private e3 P1;
    private long Q1;
    private boolean R1;
    private long S1;
    private int T1;
    private long U1;
    private m0 V1;
    private m0 W1;
    private int X1;
    private boolean Y1;
    private int Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    f f124320a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private t f124321b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private long f124322c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private long f124323d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private boolean f124324e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private int f124325f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private long f124326g2;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private final Context f124327l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private final boolean f124328m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final k0.a f124329n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final int f124330o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final boolean f124331p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private final u f124332q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private final u.a f124333r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private final m8.a f124334s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final long f124335t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private final v f124336u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private final PriorityQueue<Long> f124337v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private final boolean f124338w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private final boolean f124339x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private e f124340y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private boolean f124341z1;

    class a implements l0.a {
        a() {
        }

        @Override // m8.l0.a
        public void a(m0 m0Var) {
        }

        @Override // m8.l0.a
        public void b() {
            z2.a aVarK1 = k.this.k1();
            if (aVarK1 != null) {
                aVarK1.b();
            }
        }

        @Override // m8.l0.a
        public void d() {
            if (k.this.F1 != null) {
                k.this.c3();
            }
        }

        @Override // m8.l0.a
        public void g() {
            if (k.this.F1 != null) {
                k.this.x3(0, 1);
            }
        }
    }

    class b implements l0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f8.m f124343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f124344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f124345c;

        b(f8.m mVar, int i15, long j15) {
            this.f124343a = mVar;
            this.f124344b = i15;
            this.f124345c = j15;
        }

        @Override // m8.l0.b
        public void a() {
            k.this.E2(this.f124343a, this.f124344b, this.f124345c);
        }

        @Override // m8.l0.b
        public void b(long j15) {
            k.this.h3(this.f124343a, this.f124344b, this.f124345c, j15);
        }
    }

    private static final class c {
        public static boolean a(Context context) {
            Display.HdrCapabilities hdrCapabilities;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i15 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i15 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f124347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f124348b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f8.m.b f124350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f124351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f124352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Handler f124353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private k0 f124354h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f124355i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private l0 f124357k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f124360n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f124361o;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f8.y f124349c = f8.y.f60076a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f124356j = 30.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f124358l = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f124359m = 15000;

        public d(Context context) {
            this.f124347a = context;
            this.f124350d = f8.m.b.b(context);
        }

        public k o() {
            zj.p.w(!this.f124348b);
            Handler handler = this.f124353g;
            zj.p.w((handler == null && this.f124354h == null) || !(handler == null || this.f124354h == null));
            this.f124348b = true;
            return new k(this);
        }

        public d p(boolean z15) {
            this.f124360n = z15;
            return this;
        }

        public d q(long j15) {
            this.f124359m = j15;
            return this;
        }

        public d r(boolean z15) {
            this.f124358l = z15;
            return this;
        }

        public d s(long j15) {
            this.f124351e = j15;
            return this;
        }

        public d t(f8.m.b bVar) {
            this.f124350d = bVar;
            return this;
        }

        public d u(boolean z15) {
            this.f124352f = z15;
            return this;
        }

        public d v(boolean z15) {
            this.f124361o = z15;
            return this;
        }

        public d w(Handler handler) {
            this.f124353g = handler;
            return this;
        }

        public d x(k0 k0Var) {
            this.f124354h = k0Var;
            return this;
        }

        public d y(int i15) {
            this.f124355i = i15;
            return this;
        }

        public d z(f8.y yVar) {
            this.f124349c = yVar;
            return this;
        }
    }

    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f124362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f124363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f124364c;

        public e(int i15, int i16, int i17) {
            this.f124362a = i15;
            this.f124363b = i16;
            this.f124364c = i17;
        }
    }

    private final class f implements f8.m.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f124365a;

        public f(f8.m mVar) {
            Handler handlerA = o0.A(this);
            this.f124365a = handlerA;
            mVar.f(this, handlerA);
        }

        private void b(long j15) {
            k kVar = k.this;
            if (this != kVar.f124320a2 || kVar.T0() == null) {
                return;
            }
            if (j15 == Long.MAX_VALUE) {
                k.this.e3();
                return;
            }
            try {
                k.this.d3(j15);
            } catch (a8.w e15) {
                k.this.Z1(e15);
            }
        }

        @Override // f8.m.d
        public void a(f8.m mVar, long j15, long j16) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j15);
            } else {
                this.f124365a.sendMessageAtFrontOfQueue(Message.obtain(this.f124365a, 0, (int) (j15 >> 32), (int) j15));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(o0.e1(message.arg1, message.arg2));
            return true;
        }
    }

    protected k(d dVar) {
        super(dVar.f124347a.getApplicationContext(), 2, dVar.f124350d, dVar.f124349c, dVar.f124352f, dVar.f124356j);
        Context applicationContext = dVar.f124347a.getApplicationContext();
        this.f124327l1 = applicationContext;
        this.f124330o1 = dVar.f124355i;
        this.B1 = dVar.f124357k;
        this.f124329n1 = new k0.a(dVar.f124353g, dVar.f124354h);
        this.f124328m1 = this.B1 == null;
        this.f124332q1 = new u(applicationContext, this, dVar.f124351e);
        this.f124333r1 = new u.a();
        this.f124331p1 = D2();
        this.H1 = w7.d0.f210624c;
        this.J1 = 1;
        this.K1 = 0;
        this.V1 = m0.f188329e;
        this.Z1 = 0;
        this.W1 = null;
        this.X1 = -1000;
        this.f124322c2 = -9223372036854775807L;
        this.f124323d2 = -9223372036854775807L;
        this.f124334s1 = dVar.f124358l ? new m8.a() : null;
        this.f124337v1 = new PriorityQueue<>();
        if (dVar.f124359m != -9223372036854775807L) {
            this.f124335t1 = -dVar.f124359m;
            this.f124336u1 = new v(1.0f);
        } else {
            this.f124335t1 = -9223372036854775807L;
            this.f124336u1 = null;
        }
        this.f124338w1 = dVar.f124360n;
        this.f124339x1 = dVar.f124361o;
        this.f124326g2 = -9223372036854775807L;
        this.P1 = null;
    }

    private void A2() {
        this.B1.i(new a(), com.google.common.util.concurrent.u.a());
        t tVar = this.f124321b2;
        if (tVar != null) {
            this.B1.s(tVar);
        }
        if (this.F1 != null && !this.H1.equals(w7.d0.f210624c)) {
            this.B1.x(this.F1, this.H1);
        }
        this.B1.u(this.K1);
        this.B1.v(i1());
        List<Object> list = this.E1;
        if (list != null) {
            this.B1.n(list);
        }
    }

    private static boolean D2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean F2() {
        int i15 = Build.VERSION.SDK_INT;
        byte b15 = 7;
        if (i15 <= 28) {
            String str = Build.DEVICE;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i15 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i15 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b15 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b15 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b15 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b15 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b15 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b15 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b15 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b15 = -1;
                            }
                            break;
                        case -1936688066:
                            b15 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b15 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b15 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b15 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b15 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b15 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b15 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b15 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b15 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b15 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b15 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b15 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b15 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b15 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b15 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b15 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b15 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b15 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b15 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b15 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b15 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b15 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b15 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b15 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b15 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b15 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b15 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b15 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b15 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b15 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b15 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b15 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b15 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b15 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b15 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b15 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b15 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b15 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b15 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b15 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b15 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b15 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b15 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b15 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b15 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b15 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b15 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b15 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b15 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b15 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b15 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b15 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b15 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b15 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b15 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b15 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b15 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b15 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b15 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b15 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b15 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b15 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b15 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b15 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b15 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b15 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b15 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b15 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b15 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b15 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b15 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b15 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b15 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b15 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b15 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b15 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b15 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b15 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b15 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b15 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b15 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b15 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b15 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b15 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b15 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b15 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b15 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b15 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b15 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b15 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b15 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b15 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b15 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b15 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b15 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b15 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b15 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b15 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b15 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b15 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b15 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b15 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b15 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b15 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b15 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b15 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b15 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b15 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b15 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b15 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b15 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b15 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b15 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b15 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b15 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b15 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b15 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b15 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b15 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b15 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b15 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b15 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b15 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b15 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b15 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b15 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b15 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b15 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b15 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b15 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b15 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b15 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b15 = -1;
                            break;
                    }
                    switch (b15) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case EACTags.TRANSACTION_DATE /* 51 */:
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        case 53:
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                        case 55:
                        case 56:
                        case 57:
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                        case EACTags.DISPLAY_IMAGE /* 69 */:
                        case 70:
                        case EACTags.MESSAGE_REFERENCE /* 71 */:
                        case 72:
                        case 73:
                        case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                        case EACTags.DEPRECATED /* 75 */:
                        case 76:
                        case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                        case 78:
                        case 79:
                        case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                        case EACTags.ANSWER_TO_RESET /* 81 */:
                        case EACTags.HISTORICAL_BYTES /* 82 */:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case CertificateBody.profileType /* 127 */:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static int H2(f8.p pVar, t7.p pVar2) {
        int i15 = pVar2.f188388w;
        int i16 = pVar2.f188389x;
        if (i15 == -1 || i16 == -1) {
            return -1;
        }
        String str = (String) zj.p.q(pVar2.f188381p);
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairT = w7.i.t(pVar2);
            if (pairT == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairT.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return M2(i15 * i16, 2);
            case "video/hevc":
                return Math.max(PKIFailureInfo.badSenderNonce, M2(i15 * i16, 2));
            case "video/avc":
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && pVar.f60025g)))) {
                    return -1;
                }
                return M2(o0.j(i15, 16) * o0.j(i16, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return M2(i15 * i16, 4);
            default:
                return -1;
        }
    }

    private static Point I2(f8.p pVar, t7.p pVar2) {
        int i15 = pVar2.f188389x;
        int i16 = pVar2.f188388w;
        boolean z15 = i15 > i16;
        int i17 = z15 ? i15 : i16;
        if (z15) {
            i15 = i16;
        }
        float f15 = i15 / i17;
        for (int i18 : f124317h2) {
            int i19 = (int) (i18 * f15);
            if (i18 <= i17 || i19 <= i15) {
                break;
            }
            int i25 = z15 ? i19 : i18;
            if (!z15) {
                i18 = i19;
            }
            Point pointC = pVar.c(i25, i18);
            float f16 = pVar2.A;
            if (pointC != null && pVar.w(pointC.x, pointC.y, f16)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<f8.p> K2(Context context, f8.y yVar, t7.p pVar, boolean z15, boolean z16) {
        String str = pVar.f188381p;
        if (str == null) {
            return n0.C();
        }
        if ("video/dolby-vision".equals(str) && !c.a(context)) {
            List<f8.p> listH = f8.d0.h(yVar, pVar, z15, z16);
            if (!listH.isEmpty()) {
                return listH;
            }
        }
        return f8.d0.m(yVar, pVar, z15, z16);
    }

    protected static int L2(f8.p pVar, t7.p pVar2) {
        if (pVar2.f188382q == -1) {
            return H2(pVar, pVar2);
        }
        int size = pVar2.f188384s.size();
        int length = 0;
        for (int i15 = 0; i15 < size; i15++) {
            length += pVar2.f188384s.get(i15).length;
        }
        return pVar2.f188382q + length;
    }

    private static int M2(int i15, int i16) {
        return (i15 * 3) / (i16 * 2);
    }

    private Surface O2(f8.p pVar) {
        l0 l0Var = this.B1;
        if (l0Var != null) {
            return l0Var.getInputSurface();
        }
        Surface surface = this.F1;
        if (surface != null) {
            return surface;
        }
        if (s3(pVar)) {
            return null;
        }
        zj.p.w(t3(pVar));
        l lVar = this.G1;
        if (lVar != null && lVar.f124371a != pVar.f60025g) {
            g3();
        }
        if (this.G1 == null) {
            this.G1 = l.c(this.f124327l1, pVar.f60025g);
        }
        return this.G1;
    }

    private boolean P2(f8.p pVar) {
        if (this.B1 != null) {
            return true;
        }
        Surface surface = this.F1;
        return (surface != null && surface.isValid()) || s3(pVar) || t3(pVar);
    }

    private boolean Q2(z7.f fVar) {
        return fVar.f233230f < a0();
    }

    private boolean R2(z7.f fVar) {
        if (n() || fVar.s() || this.f124323d2 == -9223372036854775807L) {
            return true;
        }
        return this.f124323d2 - (fVar.f233230f - g1()) <= 100000;
    }

    private void T2() {
        if (this.M1 > 0) {
            long jB = W().b();
            this.f124329n1.o(this.M1, jB - this.L1);
            this.M1 = 0;
            this.L1 = jB;
        }
    }

    private void U2() {
        if (!this.f124332q1.g() || this.F1 == null) {
            return;
        }
        c3();
    }

    private void V2() {
        int i15 = this.T1;
        if (i15 != 0) {
            this.f124329n1.s(this.S1, i15);
            this.S1 = 0L;
            this.T1 = 0;
        }
    }

    private void W2(m0 m0Var) {
        if (m0Var.equals(m0.f188329e) || m0Var.equals(this.W1)) {
            return;
        }
        this.W1 = m0Var;
        this.f124329n1.v(m0Var);
    }

    private void X2() {
        Surface surface = this.F1;
        if (surface == null || !this.I1) {
            return;
        }
        this.f124329n1.r(surface);
    }

    private void Y2() {
        m0 m0Var = this.W1;
        if (m0Var != null) {
            this.f124329n1.v(m0Var);
        }
    }

    private void Z2(MediaFormat mediaFormat) {
        if (this.B1 == null || o0.z0(this.f124327l1)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void a3() {
        f8.m mVarT0;
        if (this.Y1 && (mVarT0 = T0()) != null) {
            this.f124320a2 = new f(mVarT0);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                mVarT0.d(bundle);
            }
        }
    }

    private void b3(long j15, long j16, t7.p pVar) {
        t tVar = this.f124321b2;
        if (tVar != null) {
            tVar.d(j15, j16, pVar, Y0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        this.f124329n1.r(this.F1);
        this.I1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        Y1();
    }

    private void f3(f8.m mVar, int i15, long j15, t7.p pVar) {
        k kVar;
        long jG = this.f124333r1.g();
        long jF = this.f124333r1.f();
        if (r3() && jG == this.U1) {
            u3(mVar, i15, j15);
            kVar = this;
        } else {
            kVar = this;
            kVar.b3(j15, jG, pVar);
            kVar.i3(mVar, i15, j15, jG);
            jG = jG;
        }
        A3(jF);
        kVar.U1 = jG;
    }

    private void g3() {
        l lVar = this.G1;
        if (lVar != null) {
            lVar.release();
            this.G1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(f8.m mVar, int i15, long j15, long j16) {
        i3(mVar, i15, j15, j16);
    }

    private static void j3(f8.m mVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mVar.d(bundle);
    }

    private void k3(Object obj) throws a8.w {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.F1 == surface) {
            if (surface != null) {
                Y2();
                X2();
                return;
            }
            return;
        }
        this.F1 = surface;
        if (this.B1 == null) {
            this.f124332q1.o(surface);
        }
        this.I1 = false;
        int state = getState();
        f8.m mVarT0 = T0();
        if (mVarT0 != null && this.B1 == null) {
            f8.p pVar = (f8.p) zj.p.q(V0());
            if (!P2(pVar) || this.f124341z1) {
                O1();
                w1();
            } else {
                l3(mVarT0, O2(pVar));
            }
        }
        if (surface != null) {
            Y2();
        } else {
            this.W1 = null;
            l0 l0Var = this.B1;
            if (l0Var != null) {
                l0Var.w();
            }
        }
        if (state == 2) {
            l0 l0Var2 = this.B1;
            if (l0Var2 != null) {
                l0Var2.z(true);
            } else {
                this.f124332q1.e(true);
            }
        }
        a3();
    }

    private void l3(f8.m mVar, Surface surface) {
        if (surface != null) {
            m3(mVar, surface);
        } else {
            if (Build.VERSION.SDK_INT < 35) {
                throw new IllegalStateException();
            }
            C2(mVar);
        }
    }

    private static int v3(Context context, f8.y yVar, t7.p pVar) {
        boolean z15;
        int i15 = 0;
        if (!t7.w.k(pVar.f188381p)) {
            return a3.y(0);
        }
        boolean z16 = pVar.f188385t != null;
        List<f8.p> listK2 = K2(context, yVar, pVar, z16, false);
        if (z16 && listK2.isEmpty()) {
            listK2 = K2(context, yVar, pVar, false, false);
        }
        if (listK2.isEmpty()) {
            return a3.y(1);
        }
        if (!f8.v.k2(pVar)) {
            return a3.y(2);
        }
        f8.p pVar2 = listK2.get(0);
        boolean zQ = pVar2.q(context, pVar);
        if (!zQ) {
            int i16 = 1;
            while (true) {
                if (i16 >= listK2.size()) {
                    z15 = true;
                    break;
                }
                f8.p pVar3 = listK2.get(i16);
                if (pVar3.q(context, pVar)) {
                    z15 = false;
                    zQ = true;
                    pVar2 = pVar3;
                    break;
                }
                i16++;
            }
        } else {
            z15 = true;
            break;
        }
        int i17 = zQ ? 4 : 3;
        int i18 = pVar2.t(pVar) ? 16 : 8;
        int i19 = pVar2.f60026h ? 64 : 0;
        int i25 = z15 ? 128 : 0;
        if ("video/dolby-vision".equals(pVar.f188381p) && !c.a(context)) {
            i25 = 256;
        }
        if (zQ) {
            List<f8.p> listK3 = K2(context, yVar, pVar, z16, true);
            if (!listK3.isEmpty()) {
                f8.p pVar4 = f8.d0.n(context, listK3, pVar).get(0);
                if (pVar4.q(context, pVar) && pVar4.t(pVar)) {
                    i15 = 32;
                }
            }
        }
        return a3.t(i17, i18, i15, i19, i25);
    }

    private void w3() {
        f8.m mVarT0 = T0();
        if (mVarT0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.X1));
            mVarT0.d(bundle);
        }
    }

    private static boolean x2() {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30) {
            return i15 == 30 && Build.MODEL.startsWith("MiTV");
        }
        return true;
    }

    private void y3(long j15) {
        int i15 = 0;
        while (true) {
            Long lPeek = this.f124337v1.peek();
            if (lPeek == null || lPeek.longValue() >= j15) {
                break;
            }
            i15++;
            this.f124337v1.poll();
        }
        x3(i15, 0);
    }

    private void z3(h8.c0.b bVar) {
        t7.e0 e0VarF0 = f0();
        if (e0VarF0.q()) {
            this.f124323d2 = -9223372036854775807L;
            return;
        }
        int iB = e0VarF0.b(bVar.f81468a);
        if (iB == -1) {
            this.f124323d2 = -9223372036854775807L;
        } else {
            this.f124323d2 = e0VarF0.f(iB, new t7.e0.b()).k();
        }
    }

    @Override // f8.v, a8.b, a8.x2.b
    public void A(int i15, Object obj) throws a8.w {
        if (i15 == 1) {
            k3(obj);
            return;
        }
        if (i15 == 7) {
            t tVar = (t) zj.p.q(obj);
            this.f124321b2 = tVar;
            l0 l0Var = this.B1;
            if (l0Var != null) {
                l0Var.s(tVar);
                return;
            }
            return;
        }
        if (i15 == 10) {
            int iIntValue = ((Integer) zj.p.q(obj)).intValue();
            if (this.Z1 != iIntValue) {
                this.Z1 = iIntValue;
                if (this.Y1) {
                    O1();
                    return;
                }
                return;
            }
            return;
        }
        if (i15 == 4) {
            this.J1 = ((Integer) zj.p.q(obj)).intValue();
            f8.m mVarT0 = T0();
            if (mVarT0 != null) {
                mVarT0.j(this.J1);
                return;
            }
            return;
        }
        if (i15 == 5) {
            int iIntValue2 = ((Integer) zj.p.q(obj)).intValue();
            this.K1 = iIntValue2;
            l0 l0Var2 = this.B1;
            if (l0Var2 != null) {
                l0Var2.u(iIntValue2);
                return;
            } else {
                this.f124332q1.l(iIntValue2);
                return;
            }
        }
        if (i15 == 13) {
            n3((List) zj.p.q(obj));
            return;
        }
        if (i15 == 14) {
            w7.d0 d0Var = (w7.d0) zj.p.q(obj);
            if (d0Var.b() == 0 || d0Var.a() == 0) {
                return;
            }
            this.H1 = d0Var;
            l0 l0Var3 = this.B1;
            if (l0Var3 != null) {
                l0Var3.x((Surface) zj.p.q(this.F1), d0Var);
                return;
            }
            return;
        }
        switch (i15) {
            case 16:
                this.X1 = ((Integer) zj.p.q(obj)).intValue();
                w3();
                break;
            case 17:
                Surface surface = this.F1;
                k3(null);
                ((k) zj.p.q(obj)).A(1, surface);
                break;
            case 18:
                e3 e3Var = this.P1;
                boolean z15 = e3Var != null && e3Var.f4385d;
                e3 e3Var2 = (e3) obj;
                this.P1 = e3Var2;
                if (z15 != (e3Var2 != null && e3Var2.f4385d)) {
                    l2();
                }
                break;
            default:
                super.A(i15, obj);
                break;
        }
    }

    @Override // f8.v
    protected a8.f A0(f8.p pVar, t7.p pVar2, t7.p pVar3) {
        a8.f fVarE = pVar.e(pVar2, pVar3);
        int i15 = fVarE.f4403e;
        e eVar = (e) zj.p.q(this.f124340y1);
        if (pVar3.f188388w > eVar.f124362a || pVar3.f188389x > eVar.f124363b) {
            i15 |= 256;
        }
        if (L2(pVar, pVar3) > eVar.f124364c) {
            i15 |= 64;
        }
        if (this.K1 != Integer.MIN_VALUE) {
            float f15 = pVar2.A;
            if (f15 != -1.0f) {
                float f16 = pVar3.A;
                if (f16 != -1.0f && Math.abs(f16 - f15) > 1.0f && x2()) {
                    i15 |= PKIFailureInfo.notAuthorized;
                }
            }
        }
        int i16 = i15;
        return new a8.f(pVar.f60019a, pVar2, pVar3, i16 != 0 ? 0 : fVarE.f4402d, i16);
    }

    @Override // f8.v
    protected void A1(String str, f8.m.a aVar, long j15, long j16) {
        this.f124329n1.l(str, j15, j16);
        this.f124341z1 = z2(str);
        this.A1 = ((f8.p) zj.p.q(V0())).r();
        a3();
    }

    protected void A3(long j15) {
        this.f60038a1.a(j15);
        this.S1 += j15;
        this.T1++;
    }

    @Override // f8.v
    protected void B1(a8.c cVar) {
        this.f124329n1.u(cVar);
    }

    protected o B2(Context context, u uVar) {
        o.b bVarK = new o.b(context, uVar).k(true);
        long j15 = this.f124335t1;
        return bVarK.i(j15 != -9223372036854775807L ? -j15 : -9223372036854775807L).j(W()).h();
    }

    @Override // f8.v
    protected void C1(String str) {
        this.f124329n1.m(str);
    }

    protected void C2(f8.m mVar) {
        mVar.h();
    }

    @Override // m8.u.b
    public boolean D(long j15, long j16) {
        return q3(j15, j16);
    }

    @Override // f8.v
    protected a8.f D1(y1 y1Var) throws a8.w {
        a8.f fVarD1 = super.D1(y1Var);
        this.f124329n1.q((t7.p) zj.p.q(y1Var.f4794b), fVarD1);
        v vVar = this.f124336u1;
        if (vVar != null) {
            vVar.d();
        }
        return fVarD1;
    }

    @Override // f8.v
    protected void E1(t7.p pVar, MediaFormat mediaFormat) {
        int integer;
        int i15;
        f8.m mVarT0 = T0();
        if (mVarT0 != null) {
            mVarT0.j(this.J1);
        }
        if (this.Y1) {
            i15 = pVar.f188388w;
            integer = pVar.f188389x;
        } else {
            zj.p.q(mediaFormat);
            boolean z15 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z15 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z15 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i15 = integer2;
        }
        float f15 = pVar.C;
        int i16 = pVar.B;
        if (i16 == 90 || i16 == 270) {
            f15 = 1.0f / f15;
            int i17 = integer;
            integer = i15;
            i15 = i17;
        }
        this.V1 = new m0(i15, integer, f15);
        l0 l0Var = this.B1;
        if (l0Var == null || !this.f124324e2) {
            this.f124332q1.n(pVar.A);
        } else {
            y2(l0Var, 1, pVar.b().F0(i15).i0(integer).v0(f15).Q(), this.D1);
            this.D1 = 2;
        }
        this.f124324e2 = false;
    }

    protected void E2(f8.m mVar, int i15, long j15) {
        w7.l0.a("dropVideoBuffer");
        mVar.s(i15, false);
        w7.l0.b();
        x3(0, 1);
    }

    @Override // a8.z2
    public boolean F(long j15) {
        if (b1() == -9223372036854775807L || j15 < this.Q1) {
            return false;
        }
        long jE1 = e1();
        return jE1 == -9223372036854775807L || j15 > jE1;
    }

    @Override // f8.v
    protected f8.o G0(Throwable th4, f8.p pVar) {
        return new j(th4, pVar, this.F1);
    }

    @Override // f8.v
    protected void G1(long j15) {
        super.G1(j15);
        if (this.Y1) {
            return;
        }
        this.O1--;
    }

    protected long G2() {
        return -this.f124322c2;
    }

    @Override // m8.u.b
    public boolean H(long j15, long j16, long j17, boolean z15, boolean z16) {
        if (this.B1 != null && this.f124328m1) {
            j16 -= G2();
        }
        return o3(j15, j17, z15) && S2(j16, z16);
    }

    @Override // f8.v
    protected void H1() {
        super.H1();
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.l();
            if (this.f124322c2 == -9223372036854775807L) {
                this.f124322c2 = h1();
            }
            this.B1.k(G2());
        } else {
            this.f124332q1.j(2);
        }
        this.f124324e2 = true;
        a3();
    }

    @Override // f8.v
    protected void I1(z7.f fVar) {
        ByteBuffer byteBuffer;
        if (this.f124334s1 != null && ((f8.p) zj.p.q(V0())).f60020b.equals("video/av01") && fVar.r() && (byteBuffer = fVar.f233228d) != null) {
            this.f124334s1.c(byteBuffer);
        }
        this.f124325f2 = 0;
        int iU0 = U0(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (iU0 & 32) == 0) && !this.Y1) {
            this.O1++;
        }
    }

    protected e J2(f8.p pVar, t7.p pVar2, t7.p[] pVarArr) {
        int iH2;
        int iMax = pVar2.f188388w;
        int iMax2 = pVar2.f188389x;
        int iL2 = L2(pVar, pVar2);
        if (pVarArr.length == 1) {
            if (iL2 != -1 && (iH2 = H2(pVar, pVar2)) != -1) {
                iL2 = Math.min((int) (iL2 * 1.5f), iH2);
            }
            return new e(iMax, iMax2, iL2);
        }
        int length = pVarArr.length;
        boolean z15 = false;
        for (int i15 = 0; i15 < length; i15++) {
            t7.p pVarQ = pVarArr[i15];
            if (pVar2.F != null && pVarQ.F == null) {
                pVarQ = pVarQ.b().W(pVar2.F).Q();
            }
            if (pVar.e(pVar2, pVarQ).f4402d != 0) {
                int i16 = pVarQ.f188388w;
                z15 |= i16 == -1 || pVarQ.f188389x == -1;
                iMax = Math.max(iMax, i16);
                iMax2 = Math.max(iMax2, pVarQ.f188389x);
                iL2 = Math.max(iL2, L2(pVar, pVarQ));
            }
        }
        if (z15) {
            w7.t.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointI2 = I2(pVar, pVar2);
            if (pointI2 != null) {
                iMax = Math.max(iMax, pointI2.x);
                iMax2 = Math.max(iMax2, pointI2.y);
                iL2 = Math.max(iL2, H2(pVar, pVar2.b().F0(iMax).i0(iMax2).Q()));
                w7.t.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iL2);
    }

    @Override // f8.v
    protected boolean K1(long j15, long j16, f8.m mVar, ByteBuffer byteBuffer, int i15, int i16, int i17, long j17, boolean z15, boolean z16, t7.p pVar) {
        zj.p.q(mVar);
        long jG1 = j17 - g1();
        y3(j17);
        l0 l0Var = this.B1;
        if (l0Var != null) {
            if (!z15 || z16) {
                return l0Var.m(j17, new b(mVar, i15, jG1));
            }
            u3(mVar, i15, jG1);
            return true;
        }
        long j18 = j17;
        int iC = this.f124332q1.c(j18, j15, j16, h1(), z15, z16, this.f124333r1);
        v vVar = this.f124336u1;
        if (vVar != null && iC != 5 && iC != 4) {
            vVar.b(j18, this.f124333r1.f());
        }
        if (iC != 5) {
            j18 = -9223372036854775807L;
        }
        this.f124326g2 = j18;
        if (iC == 0) {
            long jC = W().c();
            b3(jG1, jC, pVar);
            h3(mVar, i15, jG1, jC);
            A3(this.f124333r1.f());
            return true;
        }
        if (iC == 1) {
            f3((f8.m) zj.p.q(mVar), i15, jG1, pVar);
            return true;
        }
        if (iC == 2) {
            E2(mVar, i15, jG1);
            A3(this.f124333r1.f());
            return true;
        }
        if (iC == 3) {
            u3(mVar, i15, jG1);
            A3(this.f124333r1.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @Override // f8.v, a8.z2
    public void N(float f15, float f16) throws a8.w {
        super.N(f15, f16);
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.v(f15);
        } else {
            this.f124332q1.p(f15);
        }
        v vVar = this.f124336u1;
        if (vVar != null) {
            vVar.e(f15);
        }
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat N2(t7.p pVar, String str, e eVar, float f15, boolean z15, int i15) {
        Pair<Integer, Integer> pairT;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", pVar.f188388w);
        mediaFormat.setInteger("height", pVar.f188389x);
        w7.w.e(mediaFormat, pVar.f188384s);
        w7.w.c(mediaFormat, "frame-rate", pVar.A);
        w7.w.d(mediaFormat, "rotation-degrees", pVar.B);
        w7.w.b(mediaFormat, pVar.F);
        if ("video/dolby-vision".equals(pVar.f188381p) && (pairT = w7.i.t(pVar)) != null) {
            w7.w.d(mediaFormat, "profile", ((Integer) pairT.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f124362a);
        mediaFormat.setInteger("max-height", eVar.f124363b);
        w7.w.d(mediaFormat, "max-input-size", eVar.f124364c);
        mediaFormat.setInteger("priority", 0);
        if (f15 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f15);
        }
        if (z15) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.X1));
        }
        x0(mediaFormat);
        return mediaFormat;
    }

    @Override // m8.u.b
    public boolean O(long j15, long j16, boolean z15) {
        return p3(j15, j16, z15);
    }

    @Override // f8.v
    protected void P1() {
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.l();
        } else if (c1() != -9223372036854775807L) {
            this.f124326g2 = c1();
        }
    }

    @Override // f8.v
    protected void R1() {
        super.R1();
        this.f124337v1.clear();
        this.O1 = 0;
        this.f124325f2 = 0;
        this.R1 = false;
        this.f124326g2 = -9223372036854775807L;
        m8.a aVar = this.f124334s1;
        if (aVar != null) {
            aVar.d();
        }
    }

    protected boolean S2(long j15, boolean z15) throws a8.w {
        int iU0 = u0(j15);
        if (iU0 == 0) {
            return false;
        }
        this.Q1 = j15;
        if (z15) {
            a8.e eVar = this.f60038a1;
            int i15 = eVar.f4359d + iU0;
            eVar.f4359d = i15;
            eVar.f4361f += this.O1;
            eVar.f4359d = i15 + this.f124337v1.size();
        } else {
            this.f60038a1.f4365j++;
            x3(iU0 + this.f124337v1.size(), this.O1);
        }
        Q0();
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.y(false);
        }
        return true;
    }

    @Override // f8.v
    protected int U0(z7.f fVar) {
        e3 e3Var;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f124338w1 || (((e3Var = this.P1) != null && e3Var.f4389h) || this.Y1)) && Q2(fVar) && !R2(fVar)) ? 32 : 0;
        }
        return 0;
    }

    @Override // f8.v
    protected float X0(float f15, t7.p pVar, t7.p[] pVarArr) {
        f8.p pVarV0;
        float fMax = -1.0f;
        for (t7.p pVar2 : pVarArr) {
            float f16 = pVar2.A;
            if (f16 != -1.0f) {
                fMax = Math.max(fMax, f16);
            }
        }
        float f17 = fMax == -1.0f ? -1.0f : fMax * f15;
        if (this.P1 == null || (pVarV0 = V0()) == null) {
            return f17;
        }
        float fH = pVarV0.h(pVar.f188388w, pVar.f188389x);
        return f17 != -1.0f ? Math.max(f17, fH) : fH;
    }

    @Override // f8.v
    protected List<f8.p> Z0(f8.y yVar, t7.p pVar, boolean z15) {
        Context context = this.f124327l1;
        return f8.d0.n(context, K2(context, yVar, pVar, z15, this.Y1), pVar);
    }

    @Override // f8.v
    protected long a1(long j15, long j16, boolean z15) {
        if (!this.f124339x1 || !z15) {
            return super.a1(j15, j16, z15);
        }
        if (getState() != 2) {
            return (f() || e()) ? 1000000L : 10000L;
        }
        if (this.f124326g2 != -9223372036854775807L && this.B1 == null) {
            if (e()) {
                return Math.max(10000L, (long) (((this.f124326g2 - j15) / i1()) / 2.0f));
            }
            try {
                if (this.f124332q1.c(this.f124326g2, j15, j16, h1(), false, false, this.f124333r1) != 5) {
                    return 0L;
                }
                return Math.max(0L, (this.f124333r1.f() + (o0.J0(W().b()) - j16)) - 25000);
            } catch (a8.w unused) {
                w7.t.h("MediaCodecVideoRenderer", "Error while evaluating frame release action");
            }
        }
        return 10000L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    @Override // f8.v
    protected boolean c2(z7.f fVar) {
        boolean z15;
        ByteBuffer byteBuffer;
        boolean z16 = false;
        if (R2(fVar)) {
            return false;
        }
        boolean zQ2 = Q2(fVar);
        v vVar = this.f124336u1;
        if (vVar != null) {
            long jC = vVar.c(fVar.f233230f);
            if (jC == -9223372036854775807L || jC >= this.f124335t1) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        if ((!zQ2 && !z15) || fVar.o()) {
            return false;
        }
        if (!fVar.t()) {
            if (this.f124334s1 != null && ((f8.p) zj.p.q(V0())).f60020b.equals("video/av01") && (byteBuffer = fVar.f233228d) != null) {
                boolean z17 = zQ2 || this.f124325f2 <= 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.flip();
                int iE = this.f124334s1.e(byteBufferAsReadOnlyBuffer, z17);
                if (iE == 0) {
                    fVar.l();
                } else if (iE != byteBufferAsReadOnlyBuffer.limit() && ((e) zj.p.q(this.f124340y1)).f124364c + iE < byteBufferAsReadOnlyBuffer.capacity() && !fVar.z()) {
                    ((ByteBuffer) zj.p.q(fVar.f233228d)).position(iE);
                }
            }
            if (z16) {
                if (zQ2) {
                    this.f60038a1.f4359d++;
                    return z16;
                }
                this.f124337v1.add(Long.valueOf(fVar.f233230f));
                this.f124325f2++;
            }
            return z16;
        }
        fVar.l();
        z16 = true;
        if (z16) {
            if (zQ2) {
                this.f60038a1.f4359d++;
                return z16;
            }
            this.f124337v1.add(Long.valueOf(fVar.f233230f));
            this.f124325f2++;
        }
        return z16;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // f8.v
    protected final boolean d2() {
        boolean z15;
        t7.p pVarW0 = W0();
        long j15 = this.f124323d2;
        if (j15 != -9223372036854775807L) {
            if (j1() + j15 + 1 > Long.MAX_VALUE - (g1() + this.f124323d2)) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = true;
        }
        e3 e3Var = this.P1;
        if (e3Var == null) {
            return super.d2();
        }
        return !e3Var.f4387f || this.R1 || this.Y1 || (pVarW0 != null && pVarW0.f188383r > 0) || z15 || c1() != -9223372036854775807L;
    }

    protected void d3(long j15) {
        p2(j15);
        W2(this.V1);
        this.f60038a1.f4360e++;
        U2();
        G1(j15);
    }

    @Override // f8.v, a8.z2
    public boolean e() {
        if (!super.e()) {
            return false;
        }
        l0 l0Var = this.B1;
        return l0Var == null || l0Var.e();
    }

    @Override // f8.v
    protected boolean e2(f8.p pVar) {
        return P2(pVar);
    }

    @Override // a8.z2
    public boolean f() {
        boolean zV1 = v1();
        l0 l0Var = this.B1;
        if (l0Var != null) {
            return l0Var.o(zV1);
        }
        if (zV1 && (T0() == null || this.Y1)) {
            return true;
        }
        return this.f124332q1.d(zV1);
    }

    @Override // f8.v
    protected f8.m.a f1(f8.p pVar, t7.p pVar2, MediaCrypto mediaCrypto, float f15) {
        String str = pVar.f60021c;
        e eVarJ2 = J2(pVar, pVar2, d0());
        this.f124340y1 = eVarJ2;
        MediaFormat mediaFormatN2 = N2(pVar2, str, eVarJ2, f15, this.f124331p1, this.Y1 ? this.Z1 : 0);
        Surface surfaceO2 = O2(pVar);
        Z2(mediaFormatN2);
        return f8.m.a.b(pVar, mediaFormatN2, pVar2, surfaceO2, mediaCrypto);
    }

    @Override // f8.v
    protected final boolean g2() {
        f8.p pVarV0 = V0();
        if (this.B1 == null || pVarV0 == null || !(pVarV0.f60019a.equals("c2.mtk.avc.decoder") || pVarV0.f60019a.equals("c2.mtk.hevc.decoder"))) {
            return super.g2();
        }
        return true;
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // f8.v, a8.z2
    public void h(long j15, long j16) throws a8.w {
        l0 l0Var = this.B1;
        if (l0Var != null) {
            try {
                l0Var.h(j15, j16);
            } catch (l0.c e15) {
                throw U(e15, e15.f124380a, 7001);
            }
        }
        super.h(j15, j16);
    }

    @Override // f8.v, a8.b
    protected void h0() {
        this.W1 = null;
        this.f124323d2 = -9223372036854775807L;
        a3();
        this.I1 = false;
        this.f124320a2 = null;
        this.R1 = true;
        this.f124326g2 = -9223372036854775807L;
        try {
            super.h0();
        } finally {
            this.f124329n1.n(this.f60038a1);
            this.f124329n1.v(m0.f188329e);
        }
    }

    @Override // f8.v, a8.b
    protected void i0(boolean z15, boolean z16) {
        super.i0(z15, z16);
        boolean z17 = X().f4258b;
        zj.p.w((z17 && this.Z1 == 0) ? false : true);
        if (this.Y1 != z17) {
            this.Y1 = z17;
            O1();
        }
        this.f124329n1.p(this.f60038a1);
        if (!this.C1) {
            if (this.E1 != null && this.B1 == null) {
                o oVarB2 = B2(this.f124327l1, this.f124332q1);
                oVarB2.U(1);
                this.B1 = oVarB2.H(0);
            }
            this.C1 = true;
        }
        if (this.B1 == null) {
            this.f124332q1.m(W());
            this.f124332q1.j(!z16 ? 1 : 0);
        } else {
            A2();
            this.D1 = !z16 ? 1 : 0;
            N0();
        }
    }

    protected void i3(f8.m mVar, int i15, long j15, long j16) {
        w7.l0.a("releaseOutputBuffer");
        mVar.o(i15, j16);
        w7.l0.b();
        this.f60038a1.f4360e++;
        this.N1 = 0;
        if (this.B1 == null) {
            W2(this.V1);
            U2();
        }
    }

    @Override // a8.b
    protected void j0() {
        super.j0();
    }

    @Override // f8.v
    protected int j2(f8.y yVar, t7.p pVar) {
        return v3(this.f124327l1, yVar, pVar);
    }

    @Override // f8.v, a8.b
    protected void k0(long j15, boolean z15, boolean z16) throws a8.w {
        l0 l0Var = this.B1;
        if (l0Var != null && !z15) {
            l0Var.y(true);
        }
        if (z16) {
            this.Q1 = j15;
        }
        super.k0(j15, z15, z16);
        if (this.B1 == null) {
            this.f124332q1.k();
        }
        v vVar = this.f124336u1;
        if (vVar != null) {
            vVar.d();
        }
        if (z15) {
            l0 l0Var2 = this.B1;
            if (l0Var2 != null) {
                l0Var2.z(false);
            } else {
                this.f124332q1.e(false);
            }
        }
        a3();
        this.N1 = 0;
        this.f124326g2 = -9223372036854775807L;
    }

    @Override // a8.b
    protected void l0() {
        super.l0();
        l0 l0Var = this.B1;
        if (l0Var == null || !this.f124328m1) {
            return;
        }
        l0Var.b();
    }

    @Override // f8.v
    @TargetApi(29)
    protected void l1(z7.f fVar) {
        if (this.A1) {
            ByteBuffer byteBuffer = (ByteBuffer) zj.p.q(fVar.f233231g);
            if (byteBuffer.remaining() >= 7) {
                byte b15 = byteBuffer.get();
                short s15 = byteBuffer.getShort();
                short s16 = byteBuffer.getShort();
                byte b16 = byteBuffer.get();
                byte b17 = byteBuffer.get();
                byteBuffer.position(0);
                if (b15 == -75 && s15 == 60 && s16 == 1 && b16 == 4) {
                    if (b17 == 0 || b17 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        j3((f8.m) zj.p.q(T0()), bArr);
                    }
                }
            }
        }
    }

    protected void m3(f8.m mVar, Surface surface) {
        mVar.l(surface);
    }

    @Override // f8.v, a8.b
    protected void n0() {
        try {
            super.n0();
        } finally {
            this.C1 = false;
            this.f124322c2 = -9223372036854775807L;
            this.f124326g2 = -9223372036854775807L;
            g3();
        }
    }

    public void n3(List<Object> list) {
        if (list.equals(t7.k0.f188319a)) {
            l0 l0Var = this.B1;
            if (l0Var == null || !l0Var.c()) {
                return;
            }
            this.B1.f();
            return;
        }
        this.E1 = list;
        l0 l0Var2 = this.B1;
        if (l0Var2 != null) {
            l0Var2.n(list);
        }
    }

    @Override // f8.v, a8.b
    protected void o0() {
        super.o0();
        this.M1 = 0;
        this.L1 = W().b();
        this.S1 = 0L;
        this.T1 = 0;
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.t();
        } else {
            this.f124332q1.h();
        }
    }

    protected boolean o3(long j15, long j16, boolean z15) {
        return j15 < -500000 && !z15;
    }

    @Override // f8.v, a8.b
    protected void p0() {
        T2();
        V2();
        l0 l0Var = this.B1;
        if (l0Var != null) {
            l0Var.r();
        } else {
            this.f124332q1.i();
        }
        v vVar = this.f124336u1;
        if (vVar != null) {
            vVar.d();
        }
        super.p0();
    }

    protected boolean p3(long j15, long j16, boolean z15) {
        return j15 < -30000 && !z15;
    }

    @Override // f8.v, a8.b
    protected void q0(t7.p[] pVarArr, long j15, long j16, h8.c0.b bVar) {
        super.q0(pVarArr, j15, j16, bVar);
        z3(bVar);
        v vVar = this.f124336u1;
        if (vVar != null) {
            vVar.d();
        }
    }

    protected boolean q3(long j15, long j16) {
        return j15 < -30000 && j16 > 100000;
    }

    @Override // a8.z2
    public void r() {
        l0 l0Var = this.B1;
        if (l0Var == null) {
            this.f124332q1.a();
            return;
        }
        int i15 = this.D1;
        if (i15 == 0 || i15 == 1) {
            this.D1 = 0;
        } else {
            l0Var.q();
        }
    }

    @Override // a8.b
    protected void r0(t7.e0 e0Var) {
        super.r0(e0Var);
        h8.c0.b bVarB0 = b0();
        if (bVarB0 != null) {
            z3(bVarB0);
        }
    }

    protected boolean r3() {
        return true;
    }

    protected boolean s3(f8.p pVar) {
        return Build.VERSION.SDK_INT >= 35 && pVar.f60029k;
    }

    protected boolean t3(f8.p pVar) {
        if (this.Y1 || z2(pVar.f60019a)) {
            return false;
        }
        return !pVar.f60025g || l.b(this.f124327l1);
    }

    protected void u3(f8.m mVar, int i15, long j15) {
        w7.l0.a("skipVideoBuffer");
        mVar.s(i15, false);
        w7.l0.b();
        this.f60038a1.f4361f++;
    }

    protected void x3(int i15, int i16) {
        a8.e eVar = this.f60038a1;
        eVar.f4363h += i15;
        int i17 = i15 + i16;
        eVar.f4362g += i17;
        this.M1 += i17;
        int i18 = this.N1 + i17;
        this.N1 = i18;
        eVar.f4364i = Math.max(i18, eVar.f4364i);
        int i19 = this.f124330o1;
        if (i19 <= 0 || this.M1 < i19) {
            return;
        }
        T2();
    }

    @Override // f8.v
    protected boolean y1(t7.p pVar) throws a8.w {
        l0 l0Var = this.B1;
        if (l0Var == null || l0Var.c()) {
            return true;
        }
        try {
            return this.B1.p(pVar);
        } catch (l0.c e15) {
            throw U(e15, pVar, 7000);
        }
    }

    protected void y2(l0 l0Var, int i15, t7.p pVar, int i16) {
        List<Object> listC = this.E1;
        if (listC == null) {
            listC = n0.C();
        }
        l0Var.j(i15, pVar, h1(), i16, listC);
    }

    @Override // f8.v
    protected void z1(Exception exc) {
        w7.t.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f124329n1.t(exc);
    }

    protected boolean z2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f124318i2) {
                    f124319j2 = F2();
                    f124318i2 = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f124319j2;
    }
}
