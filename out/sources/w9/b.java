package w9;

import android.util.Pair;
import o8.k0;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.u;
import o8.x0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;
import t7.x;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f211096h = new u() { // from class: w9.a
        @Override // o8.u
        public final p[] f() {
            return b.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f211097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f211098b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5547b f211101e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f211099c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f211100d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f211102f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f211103g = -1;

    private static final class a implements InterfaceC5547b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f211104m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f211105n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f211106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f211107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w9.c f211108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f211109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f211110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c0 f211111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f211112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final t7.p f211113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f211114i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f211115j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f211116k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f211117l;

        public a(r rVar, s0 s0Var, w9.c cVar) throws x {
            this.f211106a = rVar;
            this.f211107b = s0Var;
            this.f211108c = cVar;
            int iMax = Math.max(1, cVar.f211128c / 10);
            this.f211112g = iMax;
            c0 c0Var = new c0(cVar.f211132g);
            c0Var.I();
            int I = c0Var.I();
            this.f211109d = I;
            int i15 = cVar.f211127b;
            int i16 = (((cVar.f211130e - (i15 * 4)) * 8) / (cVar.f211131f * i15)) + 1;
            if (I == i16) {
                int iJ = o0.j(iMax, I);
                this.f211110e = new byte[cVar.f211130e * iJ];
                this.f211111f = new c0(iJ * h(I, i15));
                int i17 = ((cVar.f211128c * cVar.f211130e) * 8) / I;
                this.f211113h = new t7.p.b().A0("audio/raw").T(i17).u0(i17).p0(h(iMax, i15)).U(cVar.f211127b).B0(cVar.f211128c).t0(2).Q();
                return;
            }
            throw x.a("Expected frames per block: " + i16 + "; got: " + I, null);
        }

        private void d(byte[] bArr, int i15, c0 c0Var) {
            for (int i16 = 0; i16 < i15; i16++) {
                for (int i17 = 0; i17 < this.f211108c.f211127b; i17++) {
                    e(bArr, i16, i17, c0Var.f());
                }
            }
            int iG = g(this.f211109d * i15);
            c0Var.f0(0);
            c0Var.e0(iG);
        }

        private void e(byte[] bArr, int i15, int i16, byte[] bArr2) {
            w9.c cVar = this.f211108c;
            int i17 = cVar.f211130e;
            int i18 = cVar.f211127b;
            int i19 = (i15 * i17) + (i16 * 4);
            int i25 = (i18 * 4) + i19;
            int i26 = (i17 / i18) - 4;
            int iO = (short) (((bArr[i19 + 1] & 255) << 8) | (bArr[i19] & 255));
            int iMin = Math.min(bArr[i19 + 2] & 255, 88);
            int i27 = f211105n[iMin];
            int i28 = ((i15 * this.f211109d * i18) + i16) * 2;
            bArr2[i28] = (byte) (iO & GF2Field.MASK);
            bArr2[i28 + 1] = (byte) (iO >> 8);
            for (int i29 = 0; i29 < i26 * 2; i29++) {
                byte b15 = bArr[((i29 / 8) * i18 * 4) + i25 + ((i29 / 2) % 4)];
                int i35 = i29 % 2 == 0 ? b15 & 15 : (b15 & 255) >> 4;
                int i36 = ((((i35 & 7) * 2) + 1) * i27) >> 3;
                if ((i35 & 8) != 0) {
                    i36 = -i36;
                }
                iO = o0.o(iO + i36, -32768, 32767);
                i28 += i18 * 2;
                bArr2[i28] = (byte) (iO & GF2Field.MASK);
                bArr2[i28 + 1] = (byte) (iO >> 8);
                int i37 = iMin + f211104m[i35];
                int[] iArr = f211105n;
                iMin = o0.o(i37, 0, iArr.length - 1);
                i27 = iArr[iMin];
            }
        }

        private int f(int i15) {
            return i15 / (this.f211108c.f211127b * 2);
        }

        private int g(int i15) {
            return h(i15, this.f211108c.f211127b);
        }

        private static int h(int i15, int i16) {
            return i15 * 2 * i16;
        }

        private void i(int i15) {
            long jU0 = this.f211115j + o0.U0(this.f211117l, 1000000L, this.f211108c.f211128c);
            int iG = g(i15);
            this.f211107b.c(jU0, 1, iG, this.f211116k - iG, null);
            this.f211117l += (long) i15;
            this.f211116k -= iG;
        }

        @Override // w9.b.InterfaceC5547b
        public void a(int i15, long j15) {
            e eVar = new e(this.f211108c, this.f211109d, i15, j15);
            this.f211106a.f(eVar);
            this.f211107b.e(this.f211113h);
            this.f211107b.d(eVar.h());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // w9.b.InterfaceC5547b
        public boolean b(o8.q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f211112g
                int r1 = r6.f211116k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f211109d
                int r0 = w7.o0.j(r0, r1)
                w9.c r1 = r6.f211108c
                int r1 = r1.f211130e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f211114i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f211110e
                int r5 = r6.f211114i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f211114i
                int r4 = r4 + r3
                r6.f211114i = r4
                goto L1e
            L3e:
                int r7 = r6.f211114i
                w9.c r8 = r6.f211108c
                int r8 = r8.f211130e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f211110e
                w7.c0 r9 = r6.f211111f
                r6.d(r8, r7, r9)
                int r8 = r6.f211114i
                w9.c r9 = r6.f211108c
                int r9 = r9.f211130e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f211114i = r8
                w7.c0 r7 = r6.f211111f
                int r7 = r7.j()
                o8.s0 r8 = r6.f211107b
                w7.c0 r9 = r6.f211111f
                r8.a(r9, r7)
                int r8 = r6.f211116k
                int r8 = r8 + r7
                r6.f211116k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f211112g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f211116k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: w9.b.a.b(o8.q, long):boolean");
        }

        @Override // w9.b.InterfaceC5547b
        public void c(long j15) {
            this.f211114i = 0;
            this.f211115j = j15;
            this.f211116k = 0;
            this.f211117l = 0L;
        }
    }

    /* JADX INFO: renamed from: w9.b$b, reason: collision with other inner class name */
    private interface InterfaceC5547b {
        void a(int i15, long j15);

        boolean b(q qVar, long j15);

        void c(long j15);
    }

    private static final class c implements InterfaceC5547b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f211118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f211119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w9.c f211120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t7.p f211121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f211122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f211123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f211124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f211125h;

        public c(r rVar, s0 s0Var, w9.c cVar, String str, int i15) throws x {
            this.f211118a = rVar;
            this.f211119b = s0Var;
            this.f211120c = cVar;
            int i16 = (cVar.f211127b * cVar.f211131f) / 8;
            if (cVar.f211130e == i16) {
                int i17 = cVar.f211128c;
                int i18 = i17 * i16 * 8;
                int iMax = Math.max(i16, (i17 * i16) / 10);
                this.f211122e = iMax;
                this.f211121d = new t7.p.b().X("audio/wav").A0(str).T(i18).u0(i18).p0(iMax).U(cVar.f211127b).B0(cVar.f211128c).t0(i15).Q();
                return;
            }
            throw x.a("Expected block size: " + i16 + "; got: " + cVar.f211130e, null);
        }

        @Override // w9.b.InterfaceC5547b
        public void a(int i15, long j15) {
            e eVar = new e(this.f211120c, 1, i15, j15);
            this.f211118a.f(eVar);
            this.f211119b.e(this.f211121d);
            this.f211119b.d(eVar.h());
        }

        @Override // w9.b.InterfaceC5547b
        public boolean b(q qVar, long j15) {
            int i15;
            int i16;
            long j16 = j15;
            while (j16 > 0 && (i15 = this.f211124g) < (i16 = this.f211122e)) {
                int iF = this.f211119b.f(qVar, (int) Math.min(i16 - i15, j16), true);
                if (iF == -1) {
                    j16 = 0;
                } else {
                    this.f211124g += iF;
                    j16 -= (long) iF;
                }
            }
            w9.c cVar = this.f211120c;
            int i17 = cVar.f211130e;
            int i18 = this.f211124g / i17;
            if (i18 > 0) {
                long jU0 = this.f211123f + o0.U0(this.f211125h, 1000000L, cVar.f211128c);
                int i19 = i18 * i17;
                int i25 = this.f211124g - i19;
                this.f211119b.c(jU0, 1, i19, i25, null);
                this.f211125h += (long) i18;
                this.f211124g = i25;
            }
            return j16 <= 0;
        }

        @Override // w9.b.InterfaceC5547b
        public void c(long j15) {
            this.f211123f = j15;
            this.f211124g = 0;
            this.f211125h = 0L;
        }
    }

    public static /* synthetic */ p[] h() {
        return new p[]{new b()};
    }

    private void i() {
        zj.p.q(this.f211098b);
        o0.h(this.f211097a);
    }

    private void j(q qVar) throws x {
        zj.p.w(qVar.getPosition() == 0);
        int i15 = this.f211102f;
        if (i15 != -1) {
            qVar.n(i15);
            this.f211099c = 4;
        } else {
            if (!d.a(qVar)) {
                throw x.a("Unsupported or unrecognized wav file type.", null);
            }
            qVar.n((int) (qVar.j() - qVar.getPosition()));
            this.f211099c = 1;
        }
    }

    private void k(q qVar) throws x {
        w9.c cVarB = d.b(qVar);
        int i15 = cVarB.f211126a;
        if (i15 == 17) {
            this.f211101e = new a(this.f211097a, this.f211098b, cVarB);
        } else if (i15 == 6) {
            this.f211101e = new c(this.f211097a, this.f211098b, cVarB, "audio/g711-alaw", -1);
        } else if (i15 == 7) {
            this.f211101e = new c(this.f211097a, this.f211098b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = x0.a(i15, cVarB.f211131f);
            if (iA == 0) {
                throw x.c("Unsupported WAV format type: " + cVarB.f211126a);
            }
            this.f211101e = new c(this.f211097a, this.f211098b, cVarB, "audio/raw", iA);
        }
        this.f211099c = 3;
    }

    private void l(q qVar) {
        this.f211100d = d.c(qVar);
        this.f211099c = 2;
    }

    private int m(q qVar) {
        zj.p.w(this.f211103g != -1);
        return ((InterfaceC5547b) zj.p.q(this.f211101e)).b(qVar, this.f211103g - qVar.getPosition()) ? -1 : 0;
    }

    private void n(q qVar) throws x {
        Pair<Long, Long> pairE = d.e(qVar);
        this.f211102f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j15 = this.f211100d;
        if (j15 != -1 && jLongValue == BodyPartID.bodyIdMax) {
            jLongValue = j15;
        }
        this.f211103g = ((long) this.f211102f) + jLongValue;
        long jA = qVar.a();
        if (jA != -1 && this.f211103g > jA) {
            t.h("WavExtractor", "Data exceeds input length: " + this.f211103g + ", " + jA);
            this.f211103g = jA;
        }
        ((InterfaceC5547b) zj.p.q(this.f211101e)).a(this.f211102f, this.f211103g);
        this.f211099c = 4;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f211099c = j15 == 0 ? 0 : 4;
        InterfaceC5547b interfaceC5547b = this.f211101e;
        if (interfaceC5547b != null) {
            interfaceC5547b.c(j16);
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return d.a(qVar);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f211097a = rVar;
        this.f211098b = rVar.v(0, 1);
        rVar.s();
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws x {
        i();
        int i15 = this.f211099c;
        if (i15 == 0) {
            j(qVar);
            return 0;
        }
        if (i15 == 1) {
            l(qVar);
            return 0;
        }
        if (i15 == 2) {
            k(qVar);
            return 0;
        }
        if (i15 == 3) {
            n(qVar);
            return 0;
        }
        if (i15 == 4) {
            return m(qVar);
        }
        throw new IllegalStateException();
    }
}
