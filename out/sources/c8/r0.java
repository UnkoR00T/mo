package c8;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes3.dex */
final class r0 {
    private boolean A;
    private long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.h f24341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f24342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioTrack f24343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f24347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f24348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f24349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Method f24352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f24353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f24354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f24355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f24356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f24357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f24360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f24361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f24362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f24363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f24364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f24365z;

    public interface a {
        void a(long j15);

        void b(long j15);

        void c(long j15, long j16, long j17, long j18);

        void d(long j15, long j16, long j17, long j18);
    }

    public r0(a aVar, w7.h hVar, AudioTrack audioTrack, int i15, int i16, int i17) {
        this.f24340a = (a) zj.p.q(aVar);
        this.f24341b = hVar;
        this.f24343d = audioTrack;
        try {
            this.f24352m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f24342c = new long[10];
        this.f24365z = -9223372036854775807L;
        this.f24364y = -9223372036854775807L;
        this.f24347h = new b0(audioTrack, aVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f24344e = sampleRate;
        boolean zY0 = w7.o0.y0(i15);
        this.f24346g = zY0;
        this.f24345f = zY0 ? w7.o0.T0(i17 / i16, sampleRate) : -9223372036854775807L;
        this.f24356q = 0L;
        this.f24357r = 0L;
        this.A = false;
        this.B = 0L;
        this.f24360u = -9223372036854775807L;
        this.f24361v = -9223372036854775807L;
        this.f24354o = 0L;
        this.f24353n = 0L;
        this.f24348i = 1.0f;
        this.f24349j = -9223372036854775807L;
    }

    private long c() {
        if (this.f24360u != -9223372036854775807L) {
            return Math.min(this.f24363x, f());
        }
        long jB = this.f24341b.b();
        if (jB - this.f24355p >= 5) {
            q(jB);
            this.f24355p = jB;
        }
        return this.f24356q + this.B + (this.f24357r << 32);
    }

    private long d(long j15) {
        long jB0;
        if (this.f24359t == 0) {
            jB0 = this.f24360u != -9223372036854775807L ? w7.o0.T0(f(), this.f24344e) : e();
        } else {
            jB0 = w7.o0.b0(j15 + this.f24350k, this.f24348i);
        }
        long jMax = Math.max(0L, jB0 - this.f24353n);
        return this.f24360u != -9223372036854775807L ? Math.min(w7.o0.T0(this.f24363x, this.f24344e), jMax) : jMax;
    }

    private long e() {
        return w7.o0.T0(c(), this.f24344e);
    }

    private long f() {
        if (((AudioTrack) zj.p.q(this.f24343d)).getPlayState() == 2) {
            return this.f24362w;
        }
        return this.f24362w + w7.o0.E(w7.o0.b0(w7.o0.J0(this.f24341b.b()) - this.f24360u, this.f24348i), this.f24344e);
    }

    private void j() {
        long jC = this.f24341b.c() / 1000;
        if (jC - this.f24351l >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f24342c[this.f24358s] = w7.o0.h0(jE, this.f24348i) - jC;
                this.f24358s = (this.f24358s + 1) % 10;
                int i15 = this.f24359t;
                if (i15 < 10) {
                    this.f24359t = i15 + 1;
                }
                this.f24351l = jC;
                this.f24350k = 0L;
                int i16 = 0;
                while (true) {
                    int i17 = this.f24359t;
                    if (i16 >= i17) {
                        break;
                    }
                    this.f24350k += this.f24342c[i16] / ((long) i17);
                    i16++;
                }
            } else {
                return;
            }
        }
        this.f24347h.i(jC, this.f24348i, d(jC), l(jC));
    }

    private void k(long j15) {
        long j16 = this.f24349j;
        if (j16 == -9223372036854775807L || j15 < j16) {
            return;
        }
        long jA = this.f24341b.a() - w7.o0.g1(w7.o0.h0(j15 - j16, this.f24348i));
        this.f24349j = -9223372036854775807L;
        this.f24340a.a(jA);
    }

    private boolean l(long j15) {
        Method method;
        long j16 = this.f24353n;
        if (this.f24346g && (method = this.f24352m) != null && j15 - this.f24354o >= 500000) {
            try {
                long jIntValue = (((long) ((Integer) w7.o0.h((Integer) method.invoke(zj.p.q(this.f24343d), null))).intValue()) * 1000) - this.f24345f;
                this.f24353n = jIntValue;
                long jMax = Math.max(jIntValue, 0L);
                this.f24353n = jMax;
                if (jMax > 10000000) {
                    this.f24340a.b(jMax);
                    this.f24353n = 0L;
                }
            } catch (Exception unused) {
                this.f24352m = null;
            }
            this.f24354o = j15;
        }
        return j16 != this.f24353n;
    }

    private void n() {
        this.f24350k = 0L;
        this.f24359t = 0;
        this.f24358s = 0;
        this.f24351l = 0L;
        this.f24364y = -9223372036854775807L;
        this.f24365z = -9223372036854775807L;
    }

    private void q(long j15) {
        AudioTrack audioTrack = (AudioTrack) zj.p.q(this.f24343d);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & BodyPartID.bodyIdMax;
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f24356q > 0 && playState == 3) {
                if (this.f24361v == -9223372036854775807L) {
                    this.f24361v = j15;
                    return;
                }
                return;
            }
            this.f24361v = -9223372036854775807L;
        }
        long j16 = this.f24356q;
        if (j16 > playbackHeadPosition) {
            if (this.A) {
                this.B += j16;
                this.A = false;
            } else {
                this.f24357r++;
            }
        }
        this.f24356q = playbackHeadPosition;
    }

    public void a() {
        this.A = true;
        this.f24347h.d();
    }

    public long b() {
        AudioTrack audioTrack = (AudioTrack) zj.p.q(this.f24343d);
        if (audioTrack.getPlayState() == 3) {
            j();
        }
        long jC = this.f24341b.c() / 1000;
        boolean zF = this.f24347h.f();
        long jE = zF ? this.f24347h.e(jC, this.f24348i) : d(jC);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                k(jE);
            }
            return jE;
        }
        if (zF || !this.f24347h.h()) {
            k(jE);
        }
        long j15 = this.f24365z;
        if (j15 != -9223372036854775807L) {
            long j16 = jE - this.f24364y;
            long jB0 = w7.o0.b0(jC - j15, this.f24348i);
            long j17 = this.f24364y + jB0;
            long jAbs = Math.abs(j17 - jE);
            if (j16 != 0 && jAbs < 1000000) {
                long j18 = (jB0 * 10) / 100;
                jE = w7.o0.p(jE, j17 - j18, j17 + j18);
            }
        }
        this.f24365z = jC;
        this.f24364y = jE;
        return jE;
    }

    public void g(long j15) {
        this.f24362w = c();
        this.f24360u = w7.o0.J0(this.f24341b.b());
        this.f24363x = j15;
    }

    public boolean h() {
        return ((AudioTrack) zj.p.q(this.f24343d)).getPlayState() == 3;
    }

    public boolean i(long j15) {
        return this.f24361v != -9223372036854775807L && j15 > 0 && this.f24341b.b() - this.f24361v >= 200;
    }

    public void m() {
        n();
        if (this.f24360u == -9223372036854775807L) {
            this.f24347h.j();
        }
        this.f24362w = c();
    }

    public void o(float f15) {
        this.f24348i = f15;
        this.f24347h.j();
        n();
    }

    public void p() {
        if (this.f24360u != -9223372036854775807L) {
            this.f24360u = w7.o0.J0(this.f24341b.b());
        }
        this.f24349j = e();
        this.f24347h.j();
    }
}
