package b8;

import ak.h2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements b8.b, c2.a {
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17311a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2 f17313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlaybackSession f17314d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f17320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f17321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17322l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private t7.y f17325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f17326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f17327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f17328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t7.p f17329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t7.p f17330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private t7.p f17331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17336z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f17312b = w7.a.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t7.e0.c f17316f = new t7.e0.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t7.e0.b f17317g = new t7.e0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap<String, Long> f17319i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f17318h = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f17315e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17323m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17324n = 0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17338b;

        public a(int i15, int i16) {
            this.f17337a = i15;
            this.f17338b = i16;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.p f17339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17341c;

        public b(t7.p pVar, int i15, String str) {
            this.f17339a = pVar;
            this.f17340b = i15;
            this.f17341c = str;
        }
    }

    private b2(Context context, PlaybackSession playbackSession) {
        this.f17311a = context.getApplicationContext();
        this.f17314d = playbackSession;
        o1 o1Var = new o1();
        this.f17313c = o1Var;
        o1Var.d(this);
    }

    private boolean A0(b bVar) {
        return bVar != null && bVar.f17341c.equals(this.f17313c.a());
    }

    public static b2 B0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = v1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new b2(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void C0() {
        PlaybackMetrics.Builder builder = this.f17321k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f17321k.setVideoFramesDropped(this.f17335y);
            this.f17321k.setVideoFramesPlayed(this.f17336z);
            Long l15 = this.f17318h.get(this.f17320j);
            this.f17321k.setNetworkTransferDurationMillis(l15 == null ? 0L : l15.longValue());
            Long l16 = this.f17319i.get(this.f17320j);
            this.f17321k.setNetworkBytesRead(l16 == null ? 0L : l16.longValue());
            this.f17321k.setStreamSource((l16 == null || l16.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f17321k.build();
            this.f17312b.execute(new Runnable() { // from class: b8.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17501a.f17314d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f17321k = null;
        this.f17320j = null;
        this.A = 0;
        this.f17335y = 0;
        this.f17336z = 0;
        this.f17329s = null;
        this.f17330t = null;
        this.f17331u = null;
        this.B = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int D0(int i15) {
        switch (w7.o0.V(i15)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static t7.l E0(ak.n0<t7.i0.a> n0Var) {
        t7.l lVar;
        h2<t7.i0.a> it = n0Var.iterator();
        while (it.hasNext()) {
            t7.i0.a next = it.next();
            for (int i15 = 0; i15 < next.f188299a; i15++) {
                if (next.d(i15) && (lVar = next.a(i15).f188385t) != null) {
                    return lVar;
                }
            }
        }
        return null;
    }

    private static int F0(t7.l lVar) {
        for (int i15 = 0; i15 < lVar.f188323d; i15++) {
            UUID uuid = lVar.c(i15).f188325b;
            if (uuid.equals(t7.f.f188173e)) {
                return 3;
            }
            if (uuid.equals(t7.f.f188174f)) {
                return 2;
            }
            if (uuid.equals(t7.f.f188172d)) {
                return 6;
            }
        }
        return 1;
    }

    private static a G0(t7.y yVar, Context context, boolean z15) {
        int i15;
        boolean z16;
        if (yVar.f188657a == 1001) {
            return new a(20, 0);
        }
        if (yVar instanceof a8.w) {
            a8.w wVar = (a8.w) yVar;
            z16 = wVar.f4669k == 1;
            i15 = wVar.f4673p;
        } else {
            i15 = 0;
            z16 = false;
        }
        Throwable th4 = (Throwable) zj.p.q(yVar.getCause());
        if (!(th4 instanceof IOException)) {
            if (z16 && (i15 == 0 || i15 == 1)) {
                return new a(35, 0);
            }
            if (z16 && i15 == 3) {
                return new a(15, 0);
            }
            if (z16 && i15 == 2) {
                return new a(23, 0);
            }
            if (th4 instanceof f8.v.c) {
                return new a(13, w7.o0.W(((f8.v.c) th4).f60067d));
            }
            if (th4 instanceof f8.o) {
                return new a(14, ((f8.o) th4).f60018c);
            }
            if (th4 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th4 instanceof c8.a0.c) {
                return new a(17, ((c8.a0.c) th4).f24104a);
            }
            if (th4 instanceof c8.a0.f) {
                return new a(18, ((c8.a0.f) th4).f24109a);
            }
            if (!(th4 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th4).getErrorCode();
            return new a(D0(errorCode), errorCode);
        }
        if (th4 instanceof y7.s) {
            return new a(5, ((y7.s) th4).f224933d);
        }
        if ((th4 instanceof y7.r) || (th4 instanceof t7.x)) {
            return new a(z15 ? 10 : 11, 0);
        }
        boolean z17 = th4 instanceof y7.q;
        if (z17 || (th4 instanceof y7.y.a)) {
            if (w7.y.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th4.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return (z17 && ((y7.q) th4).f224931c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (yVar.f188657a == 1002) {
            return new a(21, 0);
        }
        if (!(th4 instanceof d8.m.a)) {
            if (!(th4 instanceof y7.o.a) || !(th4.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) zj.p.q(th4.getCause())).getCause();
            return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th5 = (Throwable) zj.p.q(th4.getCause());
        if (th5 instanceof MediaDrm.MediaDrmStateException) {
            int iW = w7.o0.W(((MediaDrm.MediaDrmStateException) th5).getDiagnosticInfo());
            return new a(D0(iW), iW);
        }
        if (th5 instanceof MediaDrmResetException) {
            return new a(27, 0);
        }
        if (th5 instanceof NotProvisionedException) {
            return new a(24, 0);
        }
        if (th5 instanceof DeniedByServerException) {
            return new a(29, 0);
        }
        if (th5 instanceof d8.l0) {
            return new a(23, 0);
        }
        return th5 instanceof d8.h.e ? new a(28, 0) : new a(30, 0);
    }

    private static Pair<String, String> H0(String str) {
        String[] strArrZ0 = w7.o0.Z0(str, "-");
        return Pair.create(strArrZ0[0], strArrZ0.length >= 2 ? strArrZ0[1] : null);
    }

    private static int J0(Context context) {
        switch (w7.y.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int K0(t7.s sVar) {
        t7.s.h hVar = sVar.f188433b;
        if (hVar == null) {
            return 0;
        }
        int iS0 = w7.o0.s0(hVar.f188528a, hVar.f188529b);
        if (iS0 == 0) {
            return 3;
        }
        if (iS0 != 1) {
            return iS0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int L0(int i15) {
        if (i15 == 1) {
            return 2;
        }
        if (i15 != 2) {
            return i15 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void M0(b8.b.C0423b c0423b) {
        for (int i15 = 0; i15 < c0423b.d(); i15++) {
            int iB = c0423b.b(i15);
            b8.b.a aVarC = c0423b.c(iB);
            if (iB == 0) {
                this.f17313c.c(aVarC);
            } else if (iB == 11) {
                this.f17313c.b(aVarC, this.f17322l);
            } else {
                this.f17313c.e(aVarC);
            }
        }
    }

    private void N0(long j15) {
        int iJ0 = J0(this.f17311a);
        if (iJ0 != this.f17324n) {
            this.f17324n = iJ0;
            final NetworkEvent networkEventBuild = q1.a().setNetworkType(iJ0).setTimeSinceCreatedMillis(j15 - this.f17315e).build();
            this.f17312b.execute(new Runnable() { // from class: b8.z1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17522a.f17314d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void O0(long j15) {
        t7.y yVar = this.f17325o;
        if (yVar == null) {
            return;
        }
        a aVarG0 = G0(yVar, this.f17311a, this.f17333w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = s1.a().setTimeSinceCreatedMillis(j15 - this.f17315e).setErrorCode(aVarG0.f17337a).setSubErrorCode(aVarG0.f17338b).setException(yVar).build();
        this.f17312b.execute(new Runnable() { // from class: b8.a2
            @Override // java.lang.Runnable
            public final void run() {
                this.f17291a.f17314d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.B = true;
        this.f17325o = null;
    }

    private void P0(t7.a0 a0Var, b8.b.C0423b c0423b, long j15) {
        if (a0Var.B() != 2) {
            this.f17332v = false;
        }
        if (a0Var.j() == null) {
            this.f17334x = false;
        } else if (c0423b.a(10)) {
            this.f17334x = true;
        }
        int iX0 = X0(a0Var);
        if (this.f17323m != iX0) {
            this.f17323m = iX0;
            this.B = true;
            final PlaybackStateEvent playbackStateEventBuild = t1.a().setState(this.f17323m).setTimeSinceCreatedMillis(j15 - this.f17315e).build();
            this.f17312b.execute(new Runnable() { // from class: b8.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17508a.f17314d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void Q0(t7.a0 a0Var, b8.b.C0423b c0423b, long j15) {
        if (c0423b.a(2)) {
            t7.i0 i0VarM = a0Var.m();
            boolean zB = i0VarM.b(2);
            boolean zB2 = i0VarM.b(1);
            boolean zB3 = i0VarM.b(3);
            if (zB || zB2 || zB3) {
                if (!zB) {
                    V0(j15, null, 0);
                }
                if (!zB2) {
                    R0(j15, null, 0);
                }
                if (!zB3) {
                    T0(j15, null, 0);
                }
            }
        }
        if (A0(this.f17326p)) {
            b bVar = this.f17326p;
            t7.p pVar = bVar.f17339a;
            if (pVar.f188389x != -1) {
                V0(j15, pVar, bVar.f17340b);
                this.f17326p = null;
            }
        }
        if (A0(this.f17327q)) {
            b bVar2 = this.f17327q;
            R0(j15, bVar2.f17339a, bVar2.f17340b);
            this.f17327q = null;
        }
        if (A0(this.f17328r)) {
            b bVar3 = this.f17328r;
            T0(j15, bVar3.f17339a, bVar3.f17340b);
            this.f17328r = null;
        }
    }

    private void R0(long j15, t7.p pVar, int i15) {
        if (Objects.equals(this.f17330t, pVar)) {
            return;
        }
        if (this.f17330t == null && i15 == 0) {
            i15 = 1;
        }
        this.f17330t = pVar;
        W0(0, j15, pVar, i15);
    }

    private void S0(t7.a0 a0Var, b8.b.C0423b c0423b) {
        t7.l lVarE0;
        if (c0423b.a(0)) {
            b8.b.a aVarC = c0423b.c(0);
            if (this.f17321k != null) {
                U0(aVarC.f17294b, aVarC.f17296d);
            }
        }
        if (c0423b.a(2) && this.f17321k != null && (lVarE0 = E0(a0Var.m().a())) != null) {
            u1.a(w7.o0.h(this.f17321k)).setDrmType(F0(lVarE0));
        }
        if (c0423b.a(1011)) {
            this.A++;
        }
    }

    private void T0(long j15, t7.p pVar, int i15) {
        if (Objects.equals(this.f17331u, pVar)) {
            return;
        }
        if (this.f17331u == null && i15 == 0) {
            i15 = 1;
        }
        this.f17331u = pVar;
        W0(2, j15, pVar, i15);
    }

    private void U0(t7.e0 e0Var, h8.c0.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f17321k;
        if (bVar == null || (iB = e0Var.b(bVar.f81468a)) == -1) {
            return;
        }
        e0Var.f(iB, this.f17317g);
        e0Var.n(this.f17317g.f188138c, this.f17316f);
        builder.setStreamType(K0(this.f17316f.f188155c));
        t7.e0.c cVar = this.f17316f;
        if (cVar.f188165m != -9223372036854775807L && !cVar.f188163k && !cVar.f188161i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f17316f.d());
        }
        builder.setPlaybackType(this.f17316f.f() ? 2 : 1);
        this.B = true;
    }

    private void V0(long j15, t7.p pVar, int i15) {
        if (Objects.equals(this.f17329s, pVar)) {
            return;
        }
        if (this.f17329s == null && i15 == 0) {
            i15 = 1;
        }
        this.f17329s = pVar;
        W0(1, j15, pVar, i15);
    }

    private void W0(int i15, long j15, t7.p pVar, int i16) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = p1.a(i15).setTimeSinceCreatedMillis(j15 - this.f17315e);
        if (pVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(L0(i16));
            String str = pVar.f188380o;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = pVar.f188381p;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = pVar.f188376k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i17 = pVar.f188375j;
            if (i17 != -1) {
                timeSinceCreatedMillis.setBitrate(i17);
            }
            int i18 = pVar.f188388w;
            if (i18 != -1) {
                timeSinceCreatedMillis.setWidth(i18);
            }
            int i19 = pVar.f188389x;
            if (i19 != -1) {
                timeSinceCreatedMillis.setHeight(i19);
            }
            int i25 = pVar.H;
            if (i25 != -1) {
                timeSinceCreatedMillis.setChannelCount(i25);
            }
            int i26 = pVar.I;
            if (i26 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i26);
            }
            String str4 = pVar.f188369d;
            if (str4 != null) {
                Pair<String, String> pairH0 = H0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairH0.first);
                Object obj = pairH0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f15 = pVar.A;
            if (f15 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f15);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f17312b.execute(new Runnable() { // from class: b8.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f17516a.f17314d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int X0(t7.a0 a0Var) {
        int iB = a0Var.B();
        if (this.f17332v) {
            return 5;
        }
        if (this.f17334x) {
            return 13;
        }
        if (iB == 4) {
            return 11;
        }
        if (iB == 2) {
            int i15 = this.f17323m;
            if (i15 == 0 || i15 == 2 || i15 == 12) {
                return 2;
            }
            if (a0Var.u()) {
                return a0Var.q() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iB == 3) {
            if (a0Var.u()) {
                return a0Var.q() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iB != 1 || this.f17323m == 0) {
            return this.f17323m;
        }
        return 12;
    }

    @Override // b8.c2.a
    public void I(b8.b.a aVar, String str, boolean z15) {
        h8.c0.b bVar = aVar.f17296d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f17320j)) {
            C0();
        }
        this.f17318h.remove(str);
        this.f17319i.remove(str);
    }

    public LogSessionId I0() {
        return this.f17314d.getSessionId();
    }

    @Override // b8.b
    public void L(b8.b.a aVar, t7.y yVar) {
        this.f17325o = yVar;
    }

    @Override // b8.b
    public void P(b8.b.a aVar, t7.a0.e eVar, t7.a0.e eVar2, int i15) {
        if (i15 == 1) {
            this.f17332v = true;
        }
        this.f17322l = i15;
    }

    @Override // b8.c2.a
    public void Y(b8.b.a aVar, String str, String str2) {
    }

    @Override // b8.b
    public void a0(b8.b.a aVar, h8.a0 a0Var) {
        if (aVar.f17296d == null) {
            return;
        }
        b bVar = new b((t7.p) zj.p.q(a0Var.f81456c), a0Var.f81457d, this.f17313c.g(aVar.f17294b, (h8.c0.b) zj.p.q(aVar.f17296d)));
        int i15 = a0Var.f81455b;
        if (i15 != 0) {
            if (i15 == 1) {
                this.f17327q = bVar;
                return;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    return;
                }
                this.f17328r = bVar;
                return;
            }
        }
        this.f17326p = bVar;
    }

    @Override // b8.c2.a
    public void b(b8.b.a aVar, String str) {
    }

    @Override // b8.b
    public void d(b8.b.a aVar, t7.m0 m0Var) {
        b bVar = this.f17326p;
        if (bVar != null) {
            t7.p pVar = bVar.f17339a;
            if (pVar.f188389x == -1) {
                this.f17326p = new b(pVar.b().F0(m0Var.f188333a).i0(m0Var.f188334b).Q(), bVar.f17340b, bVar.f17341c);
            }
        }
    }

    @Override // b8.c2.a
    public void h0(b8.b.a aVar, String str) {
        h8.c0.b bVar = aVar.f17296d;
        if (bVar == null || !bVar.b()) {
            C0();
            this.f17320j = str;
            this.f17321k = r1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
            U0(aVar.f17294b, aVar.f17296d);
        }
    }

    @Override // b8.b
    public void l0(b8.b.a aVar, int i15, long j15, long j16) {
        h8.c0.b bVar = aVar.f17296d;
        if (bVar != null) {
            String strG = this.f17313c.g(aVar.f17294b, (h8.c0.b) zj.p.q(bVar));
            Long l15 = this.f17319i.get(strG);
            Long l16 = this.f17318h.get(strG);
            this.f17319i.put(strG, Long.valueOf((l15 == null ? 0L : l15.longValue()) + j15));
            this.f17318h.put(strG, Long.valueOf((l16 != null ? l16.longValue() : 0L) + ((long) i15)));
        }
    }

    @Override // b8.b
    public void n(t7.a0 a0Var, b8.b.C0423b c0423b) {
        if (c0423b.d() == 0) {
            return;
        }
        M0(c0423b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        S0(a0Var, c0423b);
        O0(jElapsedRealtime);
        Q0(a0Var, c0423b, jElapsedRealtime);
        N0(jElapsedRealtime);
        P0(a0Var, c0423b, jElapsedRealtime);
        if (c0423b.a(1028)) {
            this.f17313c.f(c0423b.c(1028));
        }
    }

    @Override // b8.b
    public void p0(b8.b.a aVar, h8.x xVar, h8.a0 a0Var, IOException iOException, boolean z15) {
        this.f17333w = a0Var.f81454a;
    }

    @Override // b8.b
    public void w(b8.b.a aVar, a8.e eVar) {
        this.f17335y += eVar.f4362g;
        this.f17336z += eVar.f4360e;
    }
}
