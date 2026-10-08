package c8;

import a8.a3;
import a8.c2;
import a8.y1;
import a8.z2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends f8.v implements c2 {
    private boolean A1;
    private long B1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private final Context f24112l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private final z.a f24113m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final a0 f24114n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final f8.k f24115o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f24116p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private boolean f24117q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private boolean f24118r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private t7.p f24119s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private t7.p f24120t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private long f24121u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private boolean f24122v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private boolean f24123w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f24124x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private boolean f24125y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private int f24126z1;

    private final class b implements a0.d {
        private b() {
        }

        @Override // c8.a0.d
        public void a(long j15) {
            a1.this.f24125y1 = true;
            a1.this.f24113m1.z(j15);
        }

        @Override // c8.a0.d
        public void b() {
            a1.this.f24124x1 = true;
        }

        @Override // c8.a0.d
        public void c(int i15) {
            if (Build.VERSION.SDK_INT >= 35 && a1.this.f24115o1 != null) {
                a1.this.f24115o1.e(i15);
            }
            a1.this.f24113m1.q(i15);
        }

        @Override // c8.a0.d
        public void d(boolean z15) {
            a1.this.f24113m1.A(z15);
        }

        @Override // c8.a0.d
        public void e(Exception exc) {
            w7.t.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            a1.this.f24113m1.r(exc);
        }

        @Override // c8.a0.d
        public void f(a0.a aVar) {
            a1.this.f24113m1.t(aVar);
        }

        @Override // c8.a0.d
        public void g(a0.a aVar) {
            a1.this.f24113m1.s(aVar);
        }

        @Override // c8.a0.d
        public void h() {
            z2.a aVarK1 = a1.this.k1();
            if (aVarK1 != null) {
                aVarK1.a();
            }
        }

        @Override // c8.a0.d
        public void i(int i15, long j15, long j16) {
            a1.this.f24113m1.B(i15, j15, j16);
        }

        @Override // c8.a0.d
        public void j() {
            a1.this.m0();
        }

        @Override // c8.a0.d
        public void k() {
            a1.this.F2();
        }

        @Override // c8.a0.d
        public void l() {
            z2.a aVarK1 = a1.this.k1();
            if (aVarK1 != null) {
                aVarK1.b();
            }
        }
    }

    public a1(Context context, f8.m.b bVar, f8.y yVar, boolean z15, Handler handler, z zVar, a0 a0Var) {
        this(context, bVar, yVar, z15, handler, zVar, a0Var, Build.VERSION.SDK_INT >= 35 ? new f8.k() : null);
    }

    private int A2(t7.p pVar) {
        i iVarT = this.f24114n1.t(pVar);
        if (!iVarT.f24238a) {
            return 0;
        }
        int i15 = iVarT.f24239b ? 1536 : 512;
        return iVarT.f24240c ? i15 | 2048 : i15;
    }

    private int B2(f8.p pVar, t7.p pVar2) {
        "OMX.google.raw.decoder".equals(pVar.f60019a);
        return pVar2.f188382q;
    }

    private static List<f8.p> D2(f8.y yVar, t7.p pVar, boolean z15, a0 a0Var) {
        f8.p pVarP;
        if (pVar.f188381p == null) {
            return ak.n0.C();
        }
        return (!a0Var.a(pVar) || (pVarP = f8.d0.p()) == null) ? f8.d0.m(yVar, pVar, z15, false) : ak.n0.E(pVarP);
    }

    private void G2(int i15) {
        f8.k kVar;
        this.f24114n1.n(i15);
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.f24115o1) == null) {
            return;
        }
        kVar.e(i15);
    }

    private void H2() {
        f8.m mVarT0 = T0();
        if (mVarT0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f24126z1));
            mVarT0.d(bundle);
        }
    }

    private void I2() {
        long jA = this.f24114n1.A(e());
        if (jA != Long.MIN_VALUE) {
            if (!this.f24122v1) {
                jA = Math.max(this.f24121u1, jA);
            }
            this.f24121u1 = jA;
            this.f24122v1 = false;
        }
    }

    private static boolean x2(String str) {
        return false;
    }

    private static boolean y2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean z2() {
        return false;
    }

    @Override // f8.v, a8.b, a8.x2.b
    public void A(int i15, Object obj) {
        if (i15 == 2) {
            this.f24114n1.l(((Float) zj.p.q(obj)).floatValue());
            return;
        }
        if (i15 == 3) {
            this.f24114n1.x((t7.b) zj.p.q((t7.b) obj));
            return;
        }
        if (i15 == 6) {
            this.f24114n1.z((t7.c) zj.p.q((t7.c) obj));
            return;
        }
        if (i15 == 12) {
            this.f24114n1.setPreferredDevice((AudioDeviceInfo) obj);
            return;
        }
        if (i15 == 16) {
            this.f24126z1 = ((Integer) zj.p.q(obj)).intValue();
            H2();
            return;
        }
        if (i15 == 9) {
            this.f24114n1.F(((Boolean) zj.p.q(obj)).booleanValue());
            return;
        }
        if (i15 == 10) {
            G2(((Integer) zj.p.q(obj)).intValue());
            return;
        }
        if (i15 == 19) {
            this.f24114n1.s(((Integer) zj.p.q(obj)).intValue());
        } else if (i15 != 20) {
            super.A(i15, obj);
        } else {
            this.f24114n1.w((k) zj.p.q(obj));
        }
    }

    @Override // f8.v
    protected a8.f A0(f8.p pVar, t7.p pVar2, t7.p pVar3) {
        a8.f fVarE = pVar.e(pVar2, pVar3);
        int i15 = fVarE.f4403e;
        if (s1(pVar3)) {
            i15 |= 32768;
        }
        if (B2(pVar, pVar3) > this.f24116p1) {
            i15 |= 64;
        }
        int i16 = i15;
        return new a8.f(pVar.f60019a, pVar2, pVar3, i16 != 0 ? 0 : fVarE.f4402d, i16);
    }

    @Override // f8.v
    protected void A1(String str, f8.m.a aVar, long j15, long j16) {
        this.f24113m1.u(str, j15, j16);
    }

    @Override // f8.v
    protected void B1(a8.c cVar) {
        this.f24113m1.p(cVar);
    }

    @Override // f8.v
    protected void C1(String str) {
        this.f24113m1.v(str);
    }

    protected int C2(f8.p pVar, t7.p pVar2, t7.p[] pVarArr) {
        int iB2 = B2(pVar, pVar2);
        if (pVarArr.length == 1) {
            return iB2;
        }
        for (t7.p pVar3 : pVarArr) {
            if (pVar.e(pVar2, pVar3).f4402d != 0) {
                iB2 = Math.max(iB2, B2(pVar, pVar3));
            }
        }
        return iB2;
    }

    @Override // f8.v
    protected a8.f D1(y1 y1Var) throws a8.w {
        t7.p pVar = (t7.p) zj.p.q(y1Var.f4794b);
        this.f24119s1 = pVar;
        a8.f fVarD1 = super.D1(y1Var);
        this.f24113m1.y(pVar, fVarD1);
        return fVarD1;
    }

    @Override // f8.v
    protected void E1(t7.p pVar, MediaFormat mediaFormat) throws a8.w {
        int iD0;
        int i15;
        t7.p pVar2 = this.f24120t1;
        int[] iArrA = null;
        if (pVar2 != null) {
            pVar = pVar2;
        } else if (T0() != null) {
            zj.p.q(mediaFormat);
            if ("audio/raw".equals(pVar.f188381p)) {
                iD0 = pVar.J;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iD0 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iD0 = mediaFormat.containsKey("v-bits-per-sample") ? w7.o0.d0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            t7.p pVarQ = new t7.p.b().A0("audio/raw").t0(iD0).e0(pVar.K).f0(pVar.L).s0(pVar.f188377l).a0(pVar.f188378m).k0(pVar.f188366a).m0(pVar.f188367b).n0(pVar.f188368c).o0(pVar.f188369d).C0(pVar.f188370e).y0(pVar.f188371f).U(mediaFormat.getInteger("channel-count")).B0(mediaFormat.getInteger("sample-rate")).Q();
            if (this.f24117q1 && pVarQ.H == 6 && (i15 = pVar.H) < 6) {
                iArrA = new int[i15];
                for (int i16 = 0; i16 < pVar.H; i16++) {
                    iArrA[i16] = i16;
                }
            } else if (this.f24118r1) {
                iArrA = o8.v0.a(pVarQ.H);
            }
            pVar = pVarQ;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!r1() || X().f4257a == 0) {
                    this.f24114n1.p(0);
                } else {
                    this.f24114n1.p(X().f4257a);
                }
            }
            this.f24114n1.r(pVar, 0, iArrA);
        } catch (a0.b e15) {
            throw U(e15, e15.f24103a, 5001);
        }
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat E2(t7.p pVar, String str, int i15, float f15) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", pVar.H);
        mediaFormat.setInteger("sample-rate", pVar.I);
        w7.w.e(mediaFormat, pVar.f188384s);
        w7.w.d(mediaFormat, "max-input-size", i15);
        mediaFormat.setInteger("priority", 0);
        if (f15 != -1.0f && !z2()) {
            mediaFormat.setFloat("operating-rate", f15);
        }
        if ("audio/ac4".equals(pVar.f188381p)) {
            Pair<Integer, Integer> pairT = w7.i.t(pVar);
            if (pairT != null) {
                w7.w.d(mediaFormat, "profile", ((Integer) pairT.first).intValue());
                w7.w.d(mediaFormat, "level", ((Integer) pairT.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (this.f24114n1.m(w7.o0.f0(4, pVar.H, pVar.I)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i16 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i16 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f24126z1));
        }
        if (Objects.equals(pVar.f188381p, "audio/iamf")) {
            c8.b bVarE = this.f24114n1.E();
            if (bVarE == null) {
                w7.t.h("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iB = z0.b(bVarE);
                int iBitCount = Integer.bitCount(iB);
                mediaFormat.setInteger("channel-mask", iB);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        x0(mediaFormat);
        return mediaFormat;
    }

    @Override // f8.v
    protected void F1(long j15) {
        this.f24114n1.B(j15);
    }

    protected void F2() {
        this.f24122v1 = true;
    }

    @Override // f8.v
    protected void H1() {
        super.H1();
        this.f24114n1.C();
    }

    @Override // f8.v
    protected boolean K1(long j15, long j16, f8.m mVar, ByteBuffer byteBuffer, int i15, int i16, int i17, long j17, boolean z15, boolean z16, t7.p pVar) throws a8.w {
        zj.p.q(byteBuffer);
        this.B1 = -9223372036854775807L;
        if (this.f24120t1 != null && (i16 & 2) != 0) {
            ((f8.m) zj.p.q(mVar)).s(i15, false);
            return true;
        }
        if (z15) {
            if (mVar != null) {
                mVar.s(i15, false);
            }
            this.f60038a1.f4361f += i17;
            this.f24114n1.C();
            return true;
        }
        try {
            if (!this.f24114n1.v(byteBuffer, j17, i17)) {
                this.B1 = j17;
                return false;
            }
            if (mVar != null) {
                mVar.s(i15, false);
            }
            this.f60038a1.f4360e += i17;
            return true;
        } catch (a0.c e15) {
            throw V(e15, this.f24119s1, e15.f24105b, (!r1() || X().f4257a == 0) ? 5001 : 5004);
        } catch (a0.f e16) {
            throw V(e16, pVar, e16.f24110b, (!r1() || X().f4257a == 0) ? 5002 : 5003);
        }
    }

    @Override // f8.v
    protected void P1() throws a8.w {
        try {
            this.f24114n1.y();
            if (c1() != -9223372036854775807L) {
                this.B1 = c1();
            }
        } catch (a0.f e15) {
            throw V(e15, e15.f24111c, e15.f24110b, r1() ? 5003 : 5002);
        }
    }

    @Override // a8.b, a8.z2
    public c2 S() {
        return this;
    }

    @Override // f8.v
    protected float X0(float f15, t7.p pVar, t7.p[] pVarArr) {
        int iMax = -1;
        for (t7.p pVar2 : pVarArr) {
            int i15 = pVar2.I;
            if (i15 != -1) {
                iMax = Math.max(iMax, i15);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f15;
    }

    @Override // f8.v
    protected List<f8.p> Z0(f8.y yVar, t7.p pVar, boolean z15) {
        return f8.d0.n(this.f24112l1, D2(yVar, pVar, z15, this.f24114n1), pVar);
    }

    @Override // f8.v
    protected long a1(long j15, long j16, boolean z15) {
        boolean z16 = this.f24114n1.f() && this.B1 != -9223372036854775807L;
        if (!this.A1) {
            return (z16 || super.e()) ? 1000000L : 10000L;
        }
        long jO = this.f24114n1.o();
        if (this.f24125y1 && z16 && jO != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jO, this.B1 - j15) / (d() != null ? d().f188663a : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // a8.c2
    public t7.z d() {
        return this.f24114n1.d();
    }

    @Override // f8.v, a8.z2
    public boolean e() {
        return super.e() && this.f24114n1.e();
    }

    @Override // a8.z2
    public boolean f() {
        return this.f24114n1.f();
    }

    @Override // f8.v
    protected f8.m.a f1(f8.p pVar, t7.p pVar2, MediaCrypto mediaCrypto, float f15) {
        this.f24116p1 = C2(pVar, pVar2, d0());
        this.f24117q1 = x2(pVar.f60019a);
        this.f24118r1 = y2(pVar.f60019a);
        MediaFormat mediaFormatE2 = E2(pVar2, pVar.f60021c, this.f24116p1, f15);
        this.f24120t1 = (!"audio/raw".equals(pVar.f60020b) || "audio/raw".equals(pVar2.f188381p)) ? null : pVar2;
        return f8.m.a.a(pVar, mediaFormatE2, pVar2, mediaCrypto, this.f24115o1);
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // f8.v, a8.b
    protected void h0() {
        this.f24123w1 = true;
        this.f24119s1 = null;
        this.B1 = -9223372036854775807L;
        this.f24125y1 = false;
        try {
            this.f24114n1.flush();
            try {
                super.h0();
            } finally {
                this.f24113m1.w(this.f60038a1);
            }
        } catch (Throwable th4) {
            try {
                super.h0();
                throw th4;
            } finally {
                this.f24113m1.w(this.f60038a1);
            }
        }
    }

    @Override // a8.c2
    public void i(t7.z zVar) {
        this.f24114n1.i(zVar);
    }

    @Override // f8.v, a8.b
    protected void i0(boolean z15, boolean z16) {
        super.i0(z15, z16);
        this.f24113m1.x(this.f60038a1);
        if (X().f4258b) {
            this.f24114n1.D();
        } else {
            this.f24114n1.q();
        }
        this.f24114n1.j(c0());
        this.f24114n1.c(W());
    }

    @Override // f8.v
    protected boolean i2(t7.p pVar) {
        if (X().f4257a != 0) {
            int iA2 = A2(pVar);
            if ((iA2 & 512) != 0) {
                if (X().f4257a == 2 || (iA2 & 1024) != 0) {
                    return true;
                }
                if (pVar.K == 0 && pVar.L == 0) {
                    return true;
                }
            }
        }
        return this.f24114n1.a(pVar);
    }

    @Override // f8.v
    protected int j2(f8.y yVar, t7.p pVar) {
        int iA2;
        boolean z15;
        if (!t7.w.h(pVar.f188381p)) {
            return a3.y(0);
        }
        boolean z16 = true;
        boolean z17 = pVar.Q != 0;
        boolean zK2 = f8.v.k2(pVar);
        int i15 = 8;
        if (!zK2 || (z17 && f8.d0.p() == null)) {
            iA2 = 0;
        } else {
            iA2 = A2(pVar);
            if (this.f24114n1.a(pVar)) {
                return a3.v(4, 8, 32, iA2);
            }
        }
        if ((!"audio/raw".equals(pVar.f188381p) || this.f24114n1.a(pVar)) && this.f24114n1.a(w7.o0.f0(2, pVar.H, pVar.I))) {
            List<f8.p> listD2 = D2(yVar, pVar, false, this.f24114n1);
            if (listD2.isEmpty()) {
                return a3.y(1);
            }
            if (!zK2) {
                return a3.y(2);
            }
            f8.p pVar2 = listD2.get(0);
            boolean zQ = pVar2.q(this.f24112l1, pVar);
            if (!zQ) {
                int i16 = 1;
                while (true) {
                    if (i16 >= listD2.size()) {
                        z15 = true;
                        z16 = zQ;
                        break;
                    }
                    f8.p pVar3 = listD2.get(i16);
                    if (pVar3.q(this.f24112l1, pVar)) {
                        z15 = false;
                        pVar2 = pVar3;
                        break;
                    }
                    i16++;
                }
            } else {
                z15 = true;
                z16 = zQ;
                break;
            }
            int i17 = z16 ? 4 : 3;
            if (z16 && pVar2.t(pVar)) {
                i15 = 16;
            }
            return a3.I(i17, i15, 32, pVar2.f60026h ? 64 : 0, z15 ? 128 : 0, iA2);
        }
        return a3.y(1);
    }

    @Override // f8.v, a8.b
    protected void k0(long j15, boolean z15, boolean z16) throws a8.w {
        super.k0(j15, z15, z16);
        this.f24114n1.flush();
        this.f24121u1 = j15;
        this.B1 = -9223372036854775807L;
        this.f24124x1 = false;
        this.f24125y1 = false;
        this.f24122v1 = true;
    }

    @Override // a8.b
    protected void l0() {
        f8.k kVar;
        this.f24114n1.b();
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.f24115o1) == null) {
            return;
        }
        kVar.c();
    }

    @Override // f8.v
    protected void l1(z7.f fVar) {
        t7.p pVar;
        if (Build.VERSION.SDK_INT < 29 || (pVar = fVar.f233226b) == null || !Objects.equals(pVar.f188381p, "audio/opus") || !r1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) zj.p.q(fVar.f233231g);
        int i15 = ((t7.p) zj.p.q(fVar.f233226b)).K;
        if (byteBuffer.remaining() == 8) {
            this.f24114n1.k(i15, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // a8.c2
    public long m() {
        if (getState() == 2) {
            I2();
        }
        return this.f24121u1;
    }

    @Override // f8.v, a8.b
    protected void n0() {
        this.f24124x1 = false;
        this.f24125y1 = false;
        this.B1 = -9223372036854775807L;
        try {
            super.n0();
        } finally {
            if (this.f24123w1) {
                this.f24123w1 = false;
                this.f24114n1.reset();
            }
        }
    }

    @Override // f8.v, a8.b
    protected void o0() {
        super.o0();
        this.f24114n1.h();
        this.A1 = true;
    }

    @Override // f8.v, a8.b
    protected void p0() {
        I2();
        this.A1 = false;
        this.f24114n1.g();
        super.p0();
        this.f24125y1 = false;
    }

    @Override // a8.c2
    public boolean z() {
        boolean z15 = this.f24124x1;
        this.f24124x1 = false;
        return z15;
    }

    @Override // f8.v
    protected void z1(Exception exc) {
        w7.t.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f24113m1.o(exc);
    }

    public a1(Context context, f8.m.b bVar, f8.y yVar, boolean z15, Handler handler, z zVar, a0 a0Var, f8.k kVar) {
        super(context.getApplicationContext(), 1, bVar, yVar, z15, 44100.0f);
        this.f24112l1 = context.getApplicationContext();
        this.f24114n1 = a0Var;
        this.f24115o1 = kVar;
        this.f24126z1 = -1000;
        this.f24113m1 = new z.a(handler, zVar);
        this.B1 = -9223372036854775807L;
        a0Var.u(new b());
    }
}
