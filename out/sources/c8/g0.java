package c8;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import b8.e2;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f24199r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ScheduledExecutorService f24200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f24201t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f24202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k.g f24203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f24205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f24206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0 f24207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f24210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w7.s<j.a> f24211j = new w7.s<>(Thread.currentThread());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f24214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f24215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f24216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f24217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24218q;

    interface b {
        void a();

        void b(AudioDeviceInfo audioDeviceInfo);
    }

    public static final class c extends RuntimeException {
        private c(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f24219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f24220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f24221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f24222d;

        public static /* synthetic */ void b(final d dVar, AudioRouting audioRouting) {
            dVar.getClass();
            final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                dVar.f24221c.post(new Runnable() { // from class: c8.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.d.c(this.f24248a, routedDevice);
                    }
                });
            }
        }

        public static /* synthetic */ void c(d dVar, AudioDeviceInfo audioDeviceInfo) {
            if (dVar.f24222d == null) {
                return;
            }
            dVar.f24220b.b(audioDeviceInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final AudioRouting audioRouting) {
            if (this.f24222d == null) {
                return;
            }
            w7.a.a().execute(new Runnable() { // from class: c8.i0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.d.b(this.f24244a, audioRouting);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            this.f24219a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) zj.p.q(this.f24222d));
            this.f24222d = null;
        }

        private d(AudioTrack audioTrack, b bVar) {
            this.f24219a = audioTrack;
            this.f24220b = bVar;
            Handler handlerZ = w7.o0.z();
            this.f24221c = handlerZ;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: c8.h0
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    this.f24236a.e(audioRouting);
                }
            };
            this.f24222d = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e implements r0.a {
        private e() {
        }

        @Override // c8.r0.a
        public void a(final long j15) {
            if (g0.this.f24211j.g()) {
                g0.this.f24211j.l(new w7.s.a() { // from class: c8.k0
                    @Override // w7.s.a
                    public final void b(Object obj) {
                        ((j.a) obj).a(j15);
                    }
                });
            }
        }

        @Override // c8.r0.a
        public void b(long j15) {
            w7.t.h("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + j15);
        }

        @Override // c8.r0.a
        public void c(long j15, long j16, long j17, long j18) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j15 + ", " + j16 + ", " + j17 + ", " + j18 + ", " + g0.this.A();
            if (q0.f24318m) {
                throw new c(str);
            }
            w7.t.h("AudioTrackAudioOutput", str);
        }

        @Override // c8.r0.a
        public void d(long j15, long j16, long j17, long j18) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j15 + ", " + j16 + ", " + j17 + ", " + j18 + ", " + g0.this.A();
            if (q0.f24318m) {
                throw new c(str);
            }
            w7.t.h("AudioTrackAudioOutput", str);
        }
    }

    private final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f24224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f24225b;

        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g0 f24227a;

            a(g0 g0Var) {
                this.f24227a = g0Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i15) {
                g0.this.f24211j.l(new m0());
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                g0.this.f24211j.l(new w7.s.a() { // from class: c8.n0
                    @Override // w7.s.a
                    public final void b(Object obj) {
                        ((j.a) obj).d();
                    }
                });
            }

            public void onTearDown(AudioTrack audioTrack) {
                g0.this.f24211j.l(new m0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            g0.this.f24202a.unregisterStreamEventCallback(this.f24225b);
            this.f24224a.removeCallbacksAndMessages(null);
        }

        private f() {
            Handler handlerZ = w7.o0.z();
            this.f24224a = handlerZ;
            a aVar = new a(g0.this);
            this.f24225b = aVar;
            AudioTrack audioTrack = g0.this.f24202a;
            Objects.requireNonNull(handlerZ);
            audioTrack.registerStreamEventCallback(new l0(handlerZ), aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(AudioTrack audioTrack, k.g gVar, b bVar, float f15, w7.h hVar) {
        this.f24202a = audioTrack;
        this.f24203b = gVar;
        this.f24204c = f15;
        this.f24205d = bVar;
        boolean zY0 = w7.o0.y0(gVar.f24279a);
        this.f24208g = zY0;
        if (zY0) {
            this.f24209h = w7.o0.g0(gVar.f24279a, Integer.bitCount(gVar.f24281c));
        } else {
            this.f24209h = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.f24207f = new r0(new e(), hVar, audioTrack, gVar.f24279a, this.f24209h, gVar.f24284f);
        if (bVar != null) {
            this.f24206e = new d(audioTrack, bVar);
        }
        this.f24210i = v() ? new f() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A() {
        return this.f24208g ? w7.o0.k(this.f24213l, this.f24209h) : this.f24214m;
    }

    private boolean B(long j15) {
        int iZ = z(j15);
        boolean z15 = iZ > this.f24218q;
        this.f24218q = iZ;
        return z15;
    }

    private static boolean C(int i15) {
        return i15 == -6 || i15 == -32;
    }

    private void D() {
        if (this.f24211j.g() && B(A())) {
            this.f24211j.l(new w7.s.a() { // from class: c8.c0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((j.a) obj).e();
                }
            });
        }
    }

    private static void E(final AudioTrack audioTrack, final w7.s<j.a> sVar) {
        final Handler handlerZ = w7.o0.z();
        synchronized (f24199r) {
            try {
                if (f24200s == null) {
                    f24200s = w7.o0.L0("ExoPlayer:AudioTrackReleaseThread");
                }
                f24201t++;
                f24200s.schedule(new Runnable() { // from class: c8.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.a(audioTrack, handlerZ, sVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private int F(AudioTrack audioTrack, ByteBuffer byteBuffer, long j15) {
        return audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j15 * 1000);
    }

    public static /* synthetic */ void a(AudioTrack audioTrack, Handler handler, final w7.s sVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: c8.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.c(sVar);
                    }
                });
            }
            synchronized (f24199r) {
                try {
                    int i15 = f24201t - 1;
                    f24201t = i15;
                    if (i15 == 0) {
                        ((ScheduledExecutorService) zj.p.q(f24200s)).shutdown();
                        f24200s = null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: c8.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.c(sVar);
                    }
                });
            }
            synchronized (f24199r) {
                try {
                    int i16 = f24201t - 1;
                    f24201t = i16;
                    if (i16 == 0) {
                        ((ScheduledExecutorService) zj.p.q(f24200s)).shutdown();
                        f24200s = null;
                    }
                    throw th5;
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
    }

    public static /* synthetic */ void c(w7.s sVar) {
        if (sVar.g()) {
            sVar.l(new w7.s.a() { // from class: c8.f0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((j.a) obj).b();
                }
            });
        }
    }

    private int z(long j15) {
        return this.f24202a.getUnderrunCount();
    }

    @Override // c8.j
    public void b() {
        if (this.f24207f.h()) {
            this.f24202a.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && v()) {
            ((f) zj.p.q(this.f24210i)).b();
        }
        d dVar = this.f24206e;
        if (dVar != null) {
            dVar.f();
            this.f24206e = null;
        }
        E(this.f24202a, this.f24211j);
    }

    @Override // c8.j
    public t7.z d() {
        PlaybackParams playbackParams = this.f24202a.getPlaybackParams();
        return new t7.z(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    @Override // c8.j
    public void g() {
        this.f24207f.m();
        if (!this.f24212k || v()) {
            this.f24202a.pause();
        }
    }

    @Override // c8.j
    public void h() {
        this.f24207f.p();
        if (!this.f24212k || v()) {
            this.f24202a.play();
        }
    }

    @Override // c8.j
    public void i(t7.z zVar) {
        try {
            this.f24202a.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(w7.o0.n(zVar.f188663a, 0.1f, this.f24204c)).setPitch(w7.o0.n(zVar.f188664b, 0.1f, 8.0f)).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e15) {
            w7.t.i("AudioTrackAudioOutput", "Failed to set playback params", e15);
        }
        this.f24207f.o(this.f24202a.getPlaybackParams().getSpeed());
    }

    @Override // c8.j
    public void j(e2 e2Var) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdA = e2Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f24202a.setLogSessionId(logSessionIdA);
    }

    @Override // c8.j
    public void k(int i15, int i16) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f24202a.setOffloadDelayPadding(i15, i16);
    }

    @Override // c8.j
    public void l(float f15) {
        this.f24202a.setVolume(f15);
    }

    @Override // c8.j
    public long m() {
        return this.f24207f.b();
    }

    @Override // c8.j
    public boolean o() {
        return this.f24207f.i(A());
    }

    @Override // c8.j
    public int p() {
        return this.f24202a.getSampleRate();
    }

    @Override // c8.j
    public void q(int i15) {
        this.f24202a.attachAuxEffect(i15);
    }

    @Override // c8.j
    public void r() {
        if (Build.VERSION.SDK_INT >= 29 && this.f24202a.getPlayState() == 3) {
            this.f24202a.setOffloadEndOfStream();
            this.f24207f.a();
        }
    }

    @Override // c8.j
    public boolean s(ByteBuffer byteBuffer, int i15, long j15) throws j.b {
        int iWrite;
        b bVar;
        if (!this.f24208g && this.f24217p == 0) {
            this.f24217p = w0.c0(this.f24203b.f24279a, byteBuffer);
        }
        D();
        int iRemaining = byteBuffer.remaining();
        if (this.f24203b.f24282d) {
            if (j15 == Long.MIN_VALUE) {
                j15 = this.f24215n;
            } else {
                this.f24215n = j15;
            }
            iWrite = F(this.f24202a, byteBuffer, j15);
        } else {
            iWrite = this.f24202a.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite < 0) {
            boolean zC = C(iWrite);
            if (zC && (bVar = this.f24205d) != null) {
                bVar.a();
            }
            throw new j.b(iWrite, zC);
        }
        boolean z15 = iWrite == iRemaining;
        if (this.f24208g) {
            this.f24213l += (long) iWrite;
            return z15;
        }
        if (z15) {
            this.f24214m += ((long) this.f24217p) * ((long) i15);
        }
        return z15;
    }

    @Override // c8.j
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f24202a.setPreferredDevice(audioDeviceInfo);
    }

    @Override // c8.j
    public void stop() {
        if (this.f24212k) {
            return;
        }
        this.f24212k = true;
        this.f24207f.g(A());
        this.f24202a.stop();
        this.f24216o = 0;
    }

    @Override // c8.j
    public void t(j.a aVar) {
        this.f24211j.c(aVar);
    }

    @Override // c8.j
    public void u(float f15) {
        this.f24202a.setAuxEffectSendLevel(f15);
    }

    @Override // c8.j
    public boolean v() {
        return Build.VERSION.SDK_INT >= 29 && this.f24202a.isOffloadedPlayback();
    }

    @Override // c8.j
    public long w() {
        return this.f24202a.getBufferSizeInFrames();
    }

    @Override // c8.j
    public int x() {
        return this.f24202a.getAudioSessionId();
    }
}
