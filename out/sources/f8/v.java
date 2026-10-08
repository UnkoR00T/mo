package f8;

import a8.y1;
import a8.z2;
import ak.h2;
import ak.u0;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import b8.e2;
import c8.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import w7.j0;
import w7.l0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends a8.b {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final byte[] f60037k1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final z7.f A;
    private boolean A0;
    private final z7.f B;
    private boolean B0;
    private final z7.f C;
    private long C0;
    private final i D;
    private boolean D0;
    private final MediaCodec.BufferInfo E;
    private long E0;
    private final ArrayDeque<e> F;
    private int F0;
    private final b1 G;
    private int G0;
    private final AtomicInteger H;
    private ByteBuffer H0;
    private t7.p I;
    private boolean I0;
    private boolean J0;
    private t7.p K;
    private boolean K0;
    private d8.m L;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private d8.m O;
    private int O0;
    private z2.a P;
    private int P0;
    private int Q0;
    private MediaCrypto R;
    private boolean R0;
    private boolean S0;
    private long T;
    private boolean T0;
    private long U0;
    private boolean V0;
    private boolean W0;
    private float X;
    private boolean X0;
    private float Y;
    private boolean Y0;
    private m Z;
    private a8.w Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    protected a8.e f60038a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private e f60039b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private long f60040c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f60041d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f60042e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f60043f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private long f60044g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private t7.p f60045h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private a8.c f60046h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private a8.c f60047i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private u0<String> f60048j1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private MediaFormat f60049q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f60050r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f60051s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private ArrayDeque<p> f60052t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private c f60053u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f60054v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private p f60055v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final m.b f60056w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f60057w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final y f60058x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f60059x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f60060y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f60061y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f60062z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f60063z0;

    private static final class b {
        public static void a(m.a aVar, e2 e2Var) {
            LogSessionId logSessionIdA = e2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f60010b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class d implements m.c {
        private d() {
        }

        @Override // f8.m.c
        public void a() {
            if (v.this.P != null) {
                v.this.P.b();
            }
        }

        @Override // f8.m.c
        public void b() {
            if (v.this.P != null) {
                v.this.P.b();
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f60070f = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f60072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f60073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j0<t7.p> f60074d = new j0<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f60075e = -9223372036854775807L;

        public e(long j15, long j16, long j17) {
            this.f60071a = j15;
            this.f60072b = j16;
            this.f60073c = j17;
        }
    }

    public v(Context context, int i15, m.b bVar, y yVar, boolean z15, float f15) {
        super(i15);
        this.f60054v = context.getApplicationContext();
        this.f60056w = bVar;
        this.f60058x = (y) zj.p.q(yVar);
        this.f60060y = z15;
        this.f60062z = f15;
        this.H = new AtomicInteger();
        this.A = z7.f.A();
        this.B = new z7.f(0);
        this.C = new z7.f(2);
        i iVar = new i();
        this.D = iVar;
        this.E = new MediaCodec.BufferInfo();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.T = -9223372036854775807L;
        this.F = new ArrayDeque<>();
        this.f60039b1 = e.f60070f;
        iVar.x(0);
        iVar.f233228d.order(ByteOrder.nativeOrder());
        this.G = new b1();
        this.f60051s0 = -1.0f;
        this.f60057w0 = 0;
        this.O0 = 0;
        this.F0 = -1;
        this.G0 = -1;
        this.E0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.f60040c1 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.P0 = 0;
        this.Q0 = 0;
        this.f60038a1 = new a8.e();
        this.f60043f1 = false;
        this.f60044g1 = 0L;
        this.f60048j1 = u0.C();
        a8.c cVar = a8.c.f4259b;
        this.f60046h1 = cVar;
        this.f60047i1 = cVar;
    }

    private void B0(MediaFormat mediaFormat) {
        if (this.f60048j1.isEmpty()) {
            return;
        }
        a8.c cVarA = a8.c.d(mediaFormat, this.f60048j1).a();
        if (cVarA.equals(this.f60047i1)) {
            return;
        }
        this.f60047i1 = cVarA;
        B1(cVarA);
    }

    private int C0(String str) {
        return 0;
    }

    private static boolean D0(String str) {
        return false;
    }

    private static boolean E0(p pVar) {
        String str = pVar.f60019a;
        if (Build.VERSION.SDK_INT > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && pVar.f60025g;
        }
        return true;
    }

    private static boolean F0(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void H0() {
        this.K0 = false;
        Q1();
    }

    private boolean I0() {
        if (this.R0) {
            this.P0 = 1;
            if (this.f60061y0) {
                this.Q0 = 3;
                return false;
            }
            this.Q0 = 1;
        }
        return true;
    }

    private void J0() throws a8.w {
        if (!this.R0) {
            N1();
        } else {
            this.P0 = 1;
            this.Q0 = 3;
        }
    }

    private void J1() throws a8.w {
        int i15 = this.Q0;
        if (i15 == 1) {
            P0();
            return;
        }
        if (i15 == 2) {
            P0();
            o2();
        } else if (i15 == 3) {
            N1();
        } else {
            this.W0 = true;
            P1();
        }
    }

    private boolean K0() throws a8.w {
        if (this.R0) {
            this.P0 = 1;
            if (this.f60061y0) {
                this.Q0 = 3;
                return false;
            }
            this.Q0 = 2;
        } else {
            o2();
        }
        return true;
    }

    private boolean L0(long j15, long j16) throws a8.w {
        m mVar = (m) zj.p.q(this.Z);
        if (!m1()) {
            int iQ = mVar.q(this.E);
            if (iQ < 0) {
                if (iQ == -2) {
                    L1();
                    return true;
                }
                if (this.B0 && (this.V0 || this.P0 == 2)) {
                    J1();
                }
                long j17 = this.C0;
                if (j17 != -9223372036854775807L && j17 + 100 < W().a()) {
                    J1();
                }
                return false;
            }
            MediaCodec.BufferInfo bufferInfo = this.E;
            bufferInfo.presentationTimeUs -= this.f60044g1;
            if (this.A0) {
                this.A0 = false;
                mVar.s(iQ, false);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                J1();
                return false;
            }
            this.G0 = iQ;
            ByteBuffer byteBufferT = mVar.t(iQ);
            this.H0 = byteBufferT;
            if (byteBufferT != null) {
                byteBufferT.position(this.E.offset);
                ByteBuffer byteBuffer = this.H0;
                MediaCodec.BufferInfo bufferInfo2 = this.E;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            p2(this.E.presentationTimeUs);
        }
        boolean z15 = this.f60043f1 || this.E.presentationTimeUs < a0();
        this.I0 = z15;
        long j18 = this.f60039b1.f60075e;
        boolean z16 = j18 != -9223372036854775807L && j18 <= this.E.presentationTimeUs;
        this.J0 = z16;
        ByteBuffer byteBuffer2 = this.H0;
        int i15 = this.G0;
        MediaCodec.BufferInfo bufferInfo3 = this.E;
        if (K1(j15, j16, mVar, byteBuffer2, i15, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, z15, z16, (t7.p) zj.p.q(this.K))) {
            G1(this.E.presentationTimeUs);
            boolean z17 = (this.E.flags & 4) != 0;
            if (!z17 && this.S0 && this.J0) {
                this.C0 = W().a();
            }
            V1();
            if (!z17) {
                return true;
            }
            J1();
        }
        return false;
    }

    private void L1() {
        this.T0 = true;
        MediaFormat mediaFormatG = ((m) zj.p.q(this.Z)).g();
        if (this.f60057w0 != 0 && mediaFormatG.getInteger("width") == 32 && mediaFormatG.getInteger("height") == 32) {
            this.A0 = true;
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            B0(mediaFormatG);
        }
        this.f60049q0 = mediaFormatG;
        this.f60050r0 = true;
    }

    private boolean M0(p pVar, t7.p pVar2, d8.m mVar, d8.m mVar2) {
        z7.b bVarD;
        z7.b bVarD2;
        if (mVar == mVar2) {
            return false;
        }
        if (mVar2 != null && mVar != null && (bVarD = mVar2.d()) != null && (bVarD2 = mVar.d()) != null && bVarD.getClass().equals(bVarD2.getClass())) {
            if (!(bVarD instanceof d8.b0)) {
                return false;
            }
            if (!mVar2.a().equals(mVar.a())) {
                return true;
            }
            UUID uuid = t7.f.f188174f;
            if (!uuid.equals(mVar.a()) && !uuid.equals(mVar2.a())) {
                return !pVar.f60025g && (mVar2.getState() == 2 || ((mVar2.getState() == 3 || mVar2.getState() == 4) && mVar2.i((String) zj.p.q(pVar2.f188381p))));
            }
        }
        return true;
    }

    private boolean M1(int i15) throws a8.w {
        y1 y1VarY = Y();
        this.A.l();
        int iS0 = s0(y1VarY, this.A, i15 | 4);
        if (iS0 == -5) {
            D1(y1VarY);
            return true;
        }
        if (iS0 != -4 || !this.A.p()) {
            return false;
        }
        this.V0 = true;
        J1();
        return false;
    }

    private void N1() throws a8.w {
        O1();
        w1();
    }

    private boolean O0() throws a8.w {
        int i15;
        if (this.Z == null || (i15 = this.P0) == 2 || this.V0) {
            return false;
        }
        if (i15 == 0 && f2()) {
            J0();
        }
        m mVar = (m) zj.p.q(this.Z);
        if (this.F0 < 0) {
            int iP = mVar.p();
            this.F0 = iP;
            if (iP < 0) {
                return false;
            }
            this.B.f233228d = mVar.k(iP);
            this.B.l();
        }
        if (this.P0 == 1) {
            if (!this.B0) {
                this.S0 = true;
                mVar.a(this.F0, 0, 0, 0L, 4);
                U1();
            }
            this.P0 = 2;
            return false;
        }
        if (this.f60063z0) {
            this.f60063z0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) zj.p.q(this.B.f233228d);
            byte[] bArr = f60037k1;
            byteBuffer.put(bArr);
            mVar.a(this.F0, 0, bArr.length, 0L, 0);
            U1();
            this.R0 = true;
            return true;
        }
        if (this.O0 == 1) {
            for (int i16 = 0; i16 < ((t7.p) zj.p.q(this.f60045h0)).f188384s.size(); i16++) {
                ((ByteBuffer) zj.p.q(this.B.f233228d)).put(this.f60045h0.f188384s.get(i16));
            }
            this.O0 = 2;
        }
        int iPosition = ((ByteBuffer) zj.p.q(this.B.f233228d)).position();
        final y1 y1VarY = Y();
        try {
            mVar.n(new Runnable() { // from class: f8.u
                @Override // java.lang.Runnable
                public final void run() {
                    v vVar = this.f60035a;
                    vVar.H.set(vVar.s0(y1VarY, vVar.B, 0));
                }
            });
            int i17 = this.H.get();
            if (i17 == -3) {
                if (n()) {
                    d1().f60075e = this.U0;
                }
                return false;
            }
            if (i17 == -5) {
                if (this.O0 == 2) {
                    this.B.l();
                    this.O0 = 1;
                }
                D1(y1VarY);
                return true;
            }
            if (this.B.p()) {
                d1().f60075e = this.U0;
                if (this.O0 == 2) {
                    this.B.l();
                    this.O0 = 1;
                }
                this.V0 = true;
                if (!this.R0) {
                    J1();
                    return false;
                }
                if (!this.B0) {
                    this.S0 = true;
                    mVar.a(this.F0, 0, 0, 0L, 4);
                    U1();
                }
                return false;
            }
            if (!this.R0 && !this.B.r()) {
                this.B.l();
                if (this.O0 == 2) {
                    this.O0 = 1;
                }
                return true;
            }
            z7.f fVar = this.B;
            long j15 = fVar.f233230f;
            if (c2(fVar)) {
                return true;
            }
            boolean z15 = this.B.z();
            if (z15) {
                this.B.f233227c.b(iPosition);
            }
            if (this.X0) {
                d1().f60074d.a(j15, (t7.p) zj.p.q(this.I));
                this.X0 = false;
            }
            this.U0 = Math.max(this.U0, j15);
            if (n() || this.B.s()) {
                d1().f60075e = this.U0;
            }
            this.B.y();
            if (this.B.o()) {
                l1(this.B);
            }
            if (this.f60043f1) {
                long j16 = this.U0;
                if (j15 <= j16) {
                    this.f60044g1 += (j16 - j15) + 1;
                }
                this.U0 = j15;
                this.f60043f1 = false;
            }
            I1(this.B);
            int iU0 = U0(this.B);
            long j17 = j15 + this.f60044g1;
            if (z15) {
                ((m) zj.p.q(mVar)).c(this.F0, 0, this.B.f233227c, j17, iU0);
            } else {
                ((m) zj.p.q(mVar)).a(this.F0, 0, ((ByteBuffer) zj.p.q(this.B.f233228d)).limit(), j17, iU0);
            }
            U1();
            this.R0 = true;
            this.O0 = 0;
            this.f60038a1.f4358c++;
            return true;
        } catch (z7.f.a e15) {
            z1(e15);
            M1(0);
            P0();
            return true;
        }
    }

    private void P0() {
        try {
            ((m) zj.p.q(this.Z)).flush();
        } finally {
            R1();
        }
    }

    private void Q1() {
        T1();
        this.M0 = false;
        this.D.l();
        this.C.l();
        this.L0 = false;
        this.G.d();
    }

    private boolean R0() {
        if (this.Z == null) {
            return false;
        }
        if (g2()) {
            O1();
            return true;
        }
        if (d2()) {
            P0();
        } else {
            this.f60043f1 = true;
        }
        return false;
    }

    private List<p> S0(boolean z15) {
        t7.p pVar = (t7.p) zj.p.q(this.I);
        List<p> listZ0 = Z0(this.f60058x, pVar, z15);
        if (!listZ0.isEmpty() || !z15) {
            return listZ0;
        }
        List<p> listZ1 = Z0(this.f60058x, pVar, false);
        if (!listZ1.isEmpty()) {
            w7.t.h("MediaCodecRenderer", "Drm session requires secure decoder for " + pVar.f188381p + ", but no secure decoder available. Trying to proceed with " + listZ1 + ".");
        }
        return listZ1;
    }

    private void T1() {
        this.U0 = -9223372036854775807L;
        d1().f60075e = -9223372036854775807L;
        this.f60040c1 = -9223372036854775807L;
    }

    private void U1() {
        this.F0 = -1;
        this.B.f233228d = null;
    }

    private void V1() {
        this.G0 = -1;
        this.H0 = null;
    }

    private void W1(d8.m mVar) {
        d8.m.g(this.L, mVar);
        this.L = mVar;
    }

    private void X1(e eVar) {
        this.f60039b1 = eVar;
        long j15 = eVar.f60073c;
        if (j15 != -9223372036854775807L) {
            this.f60041d1 = true;
            F1(j15);
        }
    }

    private void a2(d8.m mVar) {
        d8.m.g(this.O, mVar);
        this.O = mVar;
    }

    private boolean b2(long j15) {
        return this.T == -9223372036854775807L || W().b() - j15 < this.T;
    }

    private e d1() {
        return !this.F.isEmpty() ? this.F.getLast() : this.f60039b1;
    }

    protected static boolean k2(t7.p pVar) {
        int i15 = pVar.Q;
        return i15 == 0 || i15 == 2;
    }

    private boolean m1() {
        return this.G0 >= 0;
    }

    private boolean m2(t7.p pVar) throws a8.w {
        if (this.Z != null && this.Q0 != 3 && getState() != 0) {
            float fX0 = X0(this.Y, (t7.p) zj.p.q(pVar), d0());
            float f15 = this.f60051s0;
            if (f15 == fX0) {
                return true;
            }
            if (fX0 == -1.0f) {
                J0();
                return false;
            }
            if (f15 == -1.0f && fX0 <= this.f60062z) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fX0);
            ((m) zj.p.q(this.Z)).d(bundle);
            this.f60051s0 = fX0;
        }
        return true;
    }

    private boolean n1() {
        if (!this.D.J()) {
            return true;
        }
        long jA0 = a0();
        return t1(jA0, this.D.H()) == t1(jA0, this.C.f233230f);
    }

    private void n2(u0<String> u0Var) {
        if (this.f60048j1.equals(u0Var)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = new HashSet(u0Var);
            HashSet hashSet2 = new HashSet();
            h2<String> it = this.f60048j1.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!hashSet.remove(next)) {
                    hashSet2.add(next);
                }
            }
            m mVarT0 = T0();
            if (mVarT0 != null) {
                if (!hashSet2.isEmpty()) {
                    mVarT0.i(new ArrayList(hashSet2));
                }
                if (!hashSet.isEmpty()) {
                    mVarT0.e(new ArrayList(hashSet));
                }
            }
        }
        this.f60048j1 = u0Var;
    }

    private void o1(t7.p pVar) {
        H0();
        String str = pVar.f188381p;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.D.K(32);
        } else {
            this.D.K(1);
        }
        this.K0 = true;
    }

    private void o2() throws a8.w {
        z7.b bVarD = ((d8.m) zj.p.q(this.O)).d();
        if (bVarD instanceof d8.b0) {
            try {
                ((MediaCrypto) zj.p.q(this.R)).setMediaDrmSession(((d8.b0) bVarD).f40193b);
            } catch (MediaCryptoException e15) {
                throw U(e15, this.I, 6006);
            }
        }
        W1(this.O);
        this.P0 = 0;
        this.Q0 = 0;
    }

    private void p1(p pVar, MediaCrypto mediaCrypto) {
        this.f60055v0 = pVar;
        t7.p pVar2 = (t7.p) zj.p.q(this.I);
        String str = pVar.f60019a;
        float fX0 = X0(this.Y, pVar2, d0());
        if (fX0 <= this.f60062z) {
            fX0 = -1.0f;
        }
        long jB = W().b();
        m.a aVarF1 = f1(pVar, pVar2, mediaCrypto, fX0);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            b.a(aVarF1, c0());
        }
        try {
            l0.a("createCodec:" + str);
            m mVarA = this.f60056w.a(aVarF1);
            this.Z = mVarA;
            this.D0 = mVarA.r(new d());
            l0.b();
            long jB2 = W().b();
            if (!pVar.q(this.f60054v, pVar2)) {
                w7.t.h("MediaCodecRenderer", o0.F("Format exceeds selected codec's capabilities [%s, %s]", t7.p.h(pVar2), str));
            }
            this.f60051s0 = fX0;
            this.f60045h0 = pVar2;
            this.f60057w0 = C0(str);
            this.f60059x0 = F0(str);
            this.f60061y0 = D0(str);
            this.B0 = E0(pVar);
            if (((m) zj.p.q(this.Z)).m()) {
                this.N0 = true;
                this.O0 = 1;
                this.f60063z0 = this.f60057w0 != 0;
            }
            if (getState() == 2) {
                this.E0 = W().b() + 1000;
            }
            this.f60038a1.f4356a++;
            long j15 = jB2 - jB;
            if (i15 >= 31 && !this.f60048j1.isEmpty()) {
                ((m) zj.p.q(T0())).e(new ArrayList(this.f60048j1));
            }
            A1(str, aVarF1, jB2, j15);
        } catch (Throwable th4) {
            l0.b();
            throw th4;
        }
    }

    private boolean q1() throws a8.w {
        zj.p.w(this.R == null);
        d8.m mVar = this.L;
        z7.b bVarD = mVar.d();
        if (d8.b0.f40191d && (bVarD instanceof d8.b0)) {
            int state = mVar.getState();
            if (state == 1) {
                d8.m.a aVar = (d8.m.a) zj.p.q(mVar.c());
                throw U(aVar, this.I, aVar.f40306a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarD == null) {
            return mVar.c() != null;
        }
        if (bVarD instanceof d8.b0) {
            d8.b0 b0Var = (d8.b0) bVarD;
            try {
                this.R = new MediaCrypto(b0Var.f40192a, b0Var.f40193b);
            } catch (MediaCryptoException e15) {
                throw U(e15, this.I, 6006);
            }
        }
        return true;
    }

    private boolean t1(long j15, long j16) {
        if (j16 >= j15) {
            return false;
        }
        t7.p pVar = this.K;
        return (pVar != null && Objects.equals(pVar.f188381p, "audio/opus") && x7.i.g(j15, j16)) ? false : true;
    }

    private static boolean u1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void x1(MediaCrypto mediaCrypto, boolean z15) throws c {
        t7.p pVar = (t7.p) zj.p.q(this.I);
        if (this.f60052t0 == null) {
            try {
                List<p> listS0 = S0(z15);
                ArrayDeque<p> arrayDeque = new ArrayDeque<>();
                this.f60052t0 = arrayDeque;
                if (this.f60060y) {
                    arrayDeque.addAll(listS0);
                } else if (!listS0.isEmpty()) {
                    this.f60052t0.add(listS0.get(0));
                }
                this.f60053u0 = null;
            } catch (d0.c e15) {
                throw new c(pVar, e15, z15, -49998);
            }
        }
        if (this.f60052t0.isEmpty()) {
            throw new c(pVar, (Throwable) null, z15, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) zj.p.q(this.f60052t0);
        while (this.Z == null) {
            p pVar2 = (p) zj.p.q((p) arrayDeque2.peekFirst());
            if (!y1(pVar) || !e2(pVar2)) {
                return;
            }
            try {
                p1(pVar2, mediaCrypto);
            } catch (Exception e16) {
                w7.t.i("MediaCodecRenderer", "Failed to initialize decoder: " + pVar2, e16);
                arrayDeque2.removeFirst();
                c cVar = new c(pVar, e16, z15, pVar2);
                z1(cVar);
                if (this.f60053u0 == null) {
                    this.f60053u0 = cVar;
                } else {
                    this.f60053u0 = this.f60053u0.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f60053u0;
                }
            }
        }
        this.f60052t0 = null;
    }

    private void y0() throws a8.w {
        zj.p.w(!this.V0);
        y1 y1VarY = Y();
        this.C.l();
        do {
            this.C.l();
            int iS0 = s0(y1VarY, this.C, 0);
            if (iS0 == -5) {
                D1(y1VarY);
                return;
            }
            if (iS0 == -4) {
                if (!this.C.p()) {
                    this.U0 = Math.max(this.U0, this.C.f233230f);
                    if (n() || this.B.s()) {
                        d1().f60075e = this.U0;
                    }
                    if (this.X0) {
                        t7.p pVar = (t7.p) zj.p.q(this.I);
                        this.K = pVar;
                        if (Objects.equals(pVar.f188381p, "audio/opus") && !this.K.f188384s.isEmpty()) {
                            this.K = this.K.b().e0(x7.i.f(this.K.f188384s.get(0))).Q();
                        }
                        E1(this.K, null);
                        this.X0 = false;
                    }
                    this.C.y();
                    t7.p pVar2 = this.K;
                    if (pVar2 != null && Objects.equals(pVar2.f188381p, "audio/opus")) {
                        if (this.C.o()) {
                            z7.f fVar = this.C;
                            fVar.f233226b = this.K;
                            l1(fVar);
                        }
                        if (x7.i.g(a0(), this.C.f233230f)) {
                            this.G.a(this.C, this.K.f188384s);
                        }
                    }
                    if (!n1()) {
                        break;
                    }
                } else {
                    this.V0 = true;
                    d1().f60075e = this.U0;
                    return;
                }
            } else {
                if (iS0 != -3) {
                    throw new IllegalStateException();
                }
                if (n()) {
                    d1().f60075e = this.U0;
                    return;
                }
                return;
            }
        } while (this.D.D(this.C));
        this.L0 = true;
    }

    private boolean z0(long j15, long j16) throws a8.w {
        boolean z15;
        zj.p.w(!this.W0);
        if (this.D.J()) {
            i iVar = this.D;
            z15 = false;
            if (!K1(j15, j16, null, iVar.f233228d, this.G0, 0, iVar.I(), this.D.G(), t1(a0(), this.D.H()), this.D.p(), (t7.p) zj.p.q(this.K))) {
                return false;
            }
            G1(this.D.H());
            this.D.l();
        } else {
            z15 = false;
        }
        if (this.V0) {
            this.W0 = true;
            return z15;
        }
        if (this.L0) {
            zj.p.w(this.D.D(this.C));
            this.L0 = z15;
        }
        if (this.M0) {
            if (this.D.J()) {
                return true;
            }
            H0();
            this.M0 = z15;
            w1();
            if (!this.K0) {
                return z15;
            }
        }
        y0();
        if (this.D.J()) {
            this.D.y();
        }
        if (this.D.J() || this.V0 || this.M0) {
            return true;
        }
        return z15;
    }

    @Override // a8.b, a8.x2.b
    public void A(int i15, Object obj) {
        if (i15 == 11) {
            this.P = (z2.a) zj.p.q((z2.a) obj);
            return;
        }
        if (i15 != 21) {
            if (i15 != 22) {
                super.A(i15, obj);
                return;
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    n2((u0) zj.p.q(obj));
                    return;
                }
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60046h1 = (a8.c) zj.p.q(obj);
            m mVarT0 = T0();
            if (mVarT0 != null) {
                mVarT0.d(this.f60046h1.f());
            }
        }
    }

    protected abstract a8.f A0(p pVar, t7.p pVar2, t7.p pVar3);

    protected abstract void A1(String str, m.a aVar, long j15, long j16);

    protected abstract void B1(a8.c cVar);

    protected abstract void C1(String str);

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    protected a8.f D1(y1 y1Var) throws a8.w {
        int i15;
        boolean z15 = true;
        this.X0 = true;
        t7.p pVarQ = (t7.p) zj.p.q(y1Var.f4794b);
        String str = pVarQ.f188381p;
        if (str == null) {
            throw U(new IllegalArgumentException("Sample MIME type is null."), pVarQ, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(pVarQ.f188381p, "video/x-vnd.on2.vp9") || (Objects.equals(pVarQ.f188381p, "video/dolby-vision") && Objects.equals(d0.g(pVarQ), "video/av01"))) && !pVarQ.f188384s.isEmpty()) {
            pVarQ = pVarQ.b().l0(null).Q();
        }
        t7.p pVar = pVarQ;
        a2(y1Var.f4793a);
        this.I = pVar;
        if (this.K0) {
            this.M0 = true;
            return null;
        }
        m mVar = this.Z;
        if (mVar == null) {
            this.f60052t0 = null;
            w1();
            return null;
        }
        p pVar2 = (p) zj.p.q(this.f60055v0);
        t7.p pVar3 = (t7.p) zj.p.q(this.f60045h0);
        if (M0(pVar2, pVar, this.L, this.O)) {
            J0();
            return new a8.f(pVar2.f60019a, pVar3, pVar, 0, 128);
        }
        boolean z16 = this.O != this.L;
        a8.f fVarA0 = A0(pVar2, pVar3, pVar);
        int i16 = fVarA0.f4402d;
        if (i16 != 0) {
            i15 = 2;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m2(pVar)) {
                        this.f60045h0 = pVar;
                        if (!z16 || K0()) {
                        }
                    } else {
                        i15 = 16;
                    }
                } else if (m2(pVar)) {
                    this.N0 = true;
                    this.O0 = 1;
                    int i17 = this.f60057w0;
                    if (i17 != 2 && (i17 != 1 || pVar.f188388w != pVar3.f188388w || pVar.f188389x != pVar3.f188389x)) {
                        z15 = false;
                    }
                    this.f60063z0 = z15;
                    this.f60045h0 = pVar;
                    if (!z16 || K0()) {
                    }
                } else {
                    i15 = 16;
                }
            } else if (m2(pVar)) {
                this.f60045h0 = pVar;
                if (!z16 ? I0() : K0()) {
                }
            } else {
                i15 = 16;
            }
            return (fVarA0.f4402d != 0 || (this.Z == mVar && this.Q0 != 3)) ? fVarA0 : new a8.f(pVar2.f60019a, pVar3, pVar, 0, i15);
        }
        J0();
        i15 = 0;
        if (fVarA0.f4402d != 0) {
        }
    }

    protected abstract void E1(t7.p pVar, MediaFormat mediaFormat);

    protected void F1(long j15) {
    }

    protected o G0(Throwable th4, p pVar) {
        return new o(th4, pVar);
    }

    protected void G1(long j15) {
        this.f60040c1 = j15;
        while (!this.F.isEmpty() && j15 >= this.F.peek().f60071a) {
            X1((e) zj.p.q(this.F.poll()));
            H1();
        }
    }

    protected void H1() {
    }

    protected void I1(z7.f fVar) {
    }

    @Override // a8.z2
    public final long J(long j15, long j16) {
        return a1(j15, j16, this.D0);
    }

    protected abstract boolean K1(long j15, long j16, m mVar, ByteBuffer byteBuffer, int i15, int i16, int i17, long j17, boolean z15, boolean z16, t7.p pVar);

    @Override // a8.z2
    public void N(float f15, float f16) throws a8.w {
        this.X = f15;
        this.Y = f16;
        m2(this.f60045h0);
    }

    public void N0() {
        this.f60042e1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void O1() {
        try {
            m mVar = this.Z;
            if (mVar != null) {
                mVar.b();
                this.f60038a1.f4357b++;
                C1(((p) zj.p.q(this.f60055v0)).f60019a);
            }
            this.Z = null;
            try {
                MediaCrypto mediaCrypto = this.R;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.R = null;
                W1(null);
                S1();
            }
        } catch (Throwable th4) {
            this.Z = null;
            try {
                MediaCrypto mediaCrypto2 = this.R;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th4;
            } finally {
                this.R = null;
                W1(null);
                S1();
            }
        }
    }

    protected abstract void P1();

    @Override // a8.b, a8.a3
    public final int Q() {
        return 8;
    }

    protected final boolean Q0() throws a8.w {
        boolean zR0 = R0();
        if (zR0) {
            w1();
        }
        return zR0;
    }

    protected void R1() {
        U1();
        V1();
        T1();
        this.E0 = -9223372036854775807L;
        this.S0 = false;
        this.C0 = -9223372036854775807L;
        this.R0 = false;
        this.f60063z0 = false;
        this.A0 = false;
        this.I0 = false;
        this.J0 = false;
        this.P0 = 0;
        this.Q0 = 0;
        this.O0 = this.N0 ? 1 : 0;
        this.f60043f1 = false;
        this.f60044g1 = 0L;
    }

    protected void S1() {
        R1();
        this.Z0 = null;
        this.f60052t0 = null;
        this.f60055v0 = null;
        this.f60045h0 = null;
        this.f60049q0 = null;
        this.f60050r0 = false;
        this.T0 = false;
        this.f60051s0 = -1.0f;
        this.f60057w0 = 0;
        this.f60059x0 = false;
        this.f60061y0 = false;
        this.B0 = false;
        this.D0 = false;
        this.N0 = false;
        this.O0 = 0;
    }

    protected final m T0() {
        return this.Z;
    }

    protected int U0(z7.f fVar) {
        return 0;
    }

    protected final p V0() {
        return this.f60055v0;
    }

    protected final t7.p W0() {
        return this.f60045h0;
    }

    protected abstract float X0(float f15, t7.p pVar, t7.p[] pVarArr);

    protected final MediaFormat Y0() {
        return this.f60049q0;
    }

    protected final void Y1() {
        this.Y0 = true;
    }

    protected abstract List<p> Z0(y yVar, t7.p pVar, boolean z15);

    protected final void Z1(a8.w wVar) {
        this.Z0 = wVar;
    }

    @Override // a8.a3
    public final int a(t7.p pVar) throws a8.w {
        try {
            return j2(this.f60058x, pVar);
        } catch (d0.c e15) {
            throw U(e15, pVar, 4002);
        }
    }

    protected long a1(long j15, long j16, boolean z15) {
        return super.J(j15, j16);
    }

    protected long b1() {
        return this.U0;
    }

    protected long c1() {
        return this.f60039b1.f60075e;
    }

    protected boolean c2(z7.f fVar) {
        if (!h2(fVar)) {
            return false;
        }
        fVar.l();
        this.f60038a1.f4359d++;
        return true;
    }

    protected boolean d2() {
        return true;
    }

    @Override // a8.z2
    public boolean e() {
        return this.W0;
    }

    protected final long e1() {
        return this.f60040c1;
    }

    protected boolean e2(p pVar) {
        return true;
    }

    protected abstract m.a f1(p pVar, t7.p pVar2, MediaCrypto mediaCrypto, float f15);

    protected boolean f2() {
        return false;
    }

    protected final long g1() {
        return this.f60039b1.f60073c;
    }

    protected boolean g2() {
        int i15 = this.Q0;
        if (i15 == 3 || ((this.f60059x0 && !this.T0) || (this.f60061y0 && this.S0))) {
            return true;
        }
        if (i15 != 2) {
            return false;
        }
        try {
            o2();
            return false;
        } catch (a8.w e15) {
            w7.t.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e15);
            return true;
        }
    }

    @Override // a8.z2
    public void h(long j15, long j16) throws a8.w {
        boolean z15 = false;
        if (this.Y0) {
            this.Y0 = false;
            J1();
        }
        a8.w wVar = this.Z0;
        if (wVar != null) {
            this.Z0 = null;
            throw wVar;
        }
        try {
            if (this.W0) {
                P1();
                return;
            }
            if (this.I != null || M1(2)) {
                w1();
                if (this.K0) {
                    l0.a("bypassRender");
                    while (z0(j15, j16)) {
                    }
                    l0.b();
                } else if (this.Z != null) {
                    long jB = W().b();
                    l0.a("drainAndFeed");
                    while (L0(j15, j16) && b2(jB)) {
                    }
                    while (O0() && b2(jB)) {
                    }
                    l0.b();
                } else {
                    this.f60038a1.f4359d += u0(j15);
                    M1(1);
                }
                this.f60038a1.c();
            }
        } catch (MediaCodec.CryptoException e15) {
            throw U(e15, this.I, o0.V(e15.getErrorCode()));
        } catch (IllegalStateException e16) {
            if (!u1(e16)) {
                throw e16;
            }
            z1(e16);
            if ((e16 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e16).isRecoverable()) {
                z15 = true;
            }
            if (z15) {
                O1();
            }
            o oVarG0 = G0(e16, V0());
            throw V(oVarG0, this.I, z15, oVarG0.f60018c == 1101 ? 4006 : 4003);
        }
    }

    @Override // a8.b
    protected void h0() {
        this.I = null;
        X1(e.f60070f);
        this.F.clear();
        if (this.K0) {
            H0();
        } else {
            R0();
        }
    }

    protected final long h1() {
        return this.f60039b1.f60072b;
    }

    protected boolean h2(z7.f fVar) {
        return false;
    }

    @Override // a8.b
    protected void i0(boolean z15, boolean z16) {
        this.f60038a1 = new a8.e();
    }

    protected float i1() {
        return this.X;
    }

    protected boolean i2(t7.p pVar) {
        return false;
    }

    protected long j1() {
        return this.f60044g1;
    }

    protected abstract int j2(y yVar, t7.p pVar);

    @Override // a8.b
    protected void k0(long j15, boolean z15, boolean z16) throws a8.w {
        if (!this.F.isEmpty()) {
            this.f60039b1 = this.F.getLast();
        }
        this.F.clear();
        if (z16) {
            this.V0 = false;
            this.W0 = false;
            this.Y0 = false;
            if (this.K0) {
                Q1();
            } else {
                Q0();
            }
            if (this.f60039b1.f60074d.k() > 0) {
                this.X0 = true;
            }
            this.f60039b1.f60074d.c();
        }
    }

    protected final z2.a k1() {
        return this.P;
    }

    protected abstract void l1(z7.f fVar);

    protected final boolean l2() {
        return m2(this.f60045h0);
    }

    @Override // a8.b
    protected void n0() {
        try {
            H0();
            O1();
        } finally {
            a2(null);
        }
    }

    @Override // a8.b
    protected void o0() {
    }

    @Override // a8.b
    protected void p0() {
    }

    protected final void p2(long j15) {
        t7.p pVarI = this.f60039b1.f60074d.i(j15);
        if (pVarI == null && this.f60041d1 && this.f60049q0 != null) {
            pVarI = this.f60039b1.f60074d.h();
        }
        if (pVarI != null) {
            this.K = pVarI;
        } else if (!this.f60050r0 || this.K == null) {
            return;
        }
        E1((t7.p) zj.p.q(this.K), this.f60049q0);
        this.f60050r0 = false;
        this.f60041d1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // a8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void q0(t7.p[] r12, long r13, long r15, h8.c0.b r17) {
        /*
            r11 = this;
            f8.v$e r12 = r11.f60039b1
            long r0 = r12.f60073c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            f8.v$e r4 = new f8.v$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.X1(r4)
            boolean r12 = r11.f60042e1
            if (r12 == 0) goto L56
            r11.H1()
            return
        L24:
            java.util.ArrayDeque<f8.v$e> r12 = r11.F
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.U0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f60040c1
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            f8.v$e r4 = new f8.v$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.X1(r4)
            f8.v$e r12 = r11.f60039b1
            long r12 = r12.f60073c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.H1()
        L56:
            return
        L57:
            java.util.ArrayDeque<f8.v$e> r12 = r11.F
            f8.v$e r0 = new f8.v$e
            long r1 = r11.U0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.v.q0(t7.p[], long, long, h8.c0$b):void");
    }

    protected final boolean r1() {
        return this.K0;
    }

    protected final boolean s1(t7.p pVar) {
        return this.O == null && i2(pVar);
    }

    protected final boolean v1() {
        if (this.I == null) {
            return false;
        }
        if (g0() || m1()) {
            return true;
        }
        return this.E0 != -9223372036854775807L && W().b() < this.E0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    protected final void w1() throws a8.w {
        t7.p pVar;
        boolean z15;
        if (this.Z != null || this.K0 || (pVar = this.I) == null) {
            return;
        }
        if (s1(pVar)) {
            o1(pVar);
            return;
        }
        W1(this.O);
        if (this.L == null || q1()) {
            try {
                d8.m mVar = this.L;
                if (mVar == null || !(mVar.getState() == 3 || this.L.getState() == 4)) {
                    z15 = false;
                } else if (this.L.i((String) zj.p.q(pVar.f188381p))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                x1(this.R, z15);
            } catch (c e15) {
                throw U(e15, pVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.R;
        if (mediaCrypto == null || this.Z != null) {
            return;
        }
        mediaCrypto.release();
        this.R = null;
    }

    protected final void x0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f60046h1.b(mediaFormat);
        }
    }

    protected boolean y1(t7.p pVar) {
        return true;
    }

    protected abstract void z1(Exception exc);

    public static class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f60066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f60067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f60068e;

        public c(t7.p pVar, Throwable th4, boolean z15, int i15) {
            this("Decoder init failed: [" + i15 + "], " + pVar, th4, pVar.f188381p, z15, null, b(i15), null);
        }

        private static String b(int i15) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i15 < 0 ? "neg_" : "") + Math.abs(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.f60064a, this.f60065b, this.f60066c, this.f60067d, cVar);
        }

        public c(t7.p pVar, Throwable th4, boolean z15, p pVar2) {
            this("Decoder init failed: " + pVar2.f60019a + ", " + pVar, th4, pVar.f188381p, z15, pVar2, th4 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th4).getDiagnosticInfo() : null, null);
        }

        private c(String str, Throwable th4, String str2, boolean z15, p pVar, String str3, c cVar) {
            super(str, th4);
            this.f60064a = str2;
            this.f60065b = z15;
            this.f60066c = pVar;
            this.f60067d = str3;
            this.f60068e = cVar;
        }
    }
}
