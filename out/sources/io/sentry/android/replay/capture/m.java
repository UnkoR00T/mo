package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import fr.w;
import fu.r;
import io.sentry.a1;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.h4;
import io.sentry.protocol.v;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u001fJ+\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00130\nH\u0016¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lio/sentry/android/replay/capture/m;", "Lio/sentry/android/replay/capture/a;", "Lio/sentry/q7;", "options", "Lio/sentry/c1;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/c1;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Ler/l;)V", "", "taskName", "Lio/sentry/android/replay/capture/h$c;", "Loq/i0;", "onSegmentCreated", "I", "(Ljava/lang/String;Ler/l;)V", "", "segmentId", "replayId", "Lio/sentry/r7$b;", "replayType", "j", "(ILio/sentry/protocol/v;Lio/sentry/r7$b;)V", "g", "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "h", "(ZLer/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "", "store", "f", "(Landroid/graphics/Bitmap;Ler/p;)V", "Lio/sentry/android/replay/u;", "recorderConfig", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "Lio/sentry/android/replay/capture/h;", "i", "()Lio/sentry/android/replay/capture/h;", "v", "Lio/sentry/q7;", "w", "Lio/sentry/c1;", "x", "Lio/sentry/transport/p;", "y", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m extends a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f94421z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Loq/i0;", "c", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.l<h.c, i0> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(h.c cVar) {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(h.c cVar) {
            if (cVar instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) cVar;
                h.c.Created.b(created, m.this.scopes, null, 2, null);
                m mVar = m.this;
                mVar.d(mVar.e() + 1);
                m.this.k(created.getReplay().g0());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Loq/i0;", "c", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.l<h.c, i0> {
        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(h.c cVar) {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(h.c cVar) {
            if (cVar instanceof h.c.Created) {
                h.c.Created.b((h.c.Created) cVar, m.this.scopes, null, 2, null);
                m mVar = m.this;
                mVar.d(mVar.e() + 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Loq/i0;", "c", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.l<h.c, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f94428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f94428c = file;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(h.c cVar) {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(h.c cVar) {
            if (cVar instanceof h.c.Created) {
                h.c.Created.b((h.c.Created) cVar, m.this.scopes, null, 2, null);
            }
            m.this.d(-1);
            io.sentry.util.h.a(this.f94428c);
        }
    }

    public /* synthetic */ m(q7 q7Var, c1 c1Var, p pVar, ScheduledExecutorService scheduledExecutorService, er.l lVar, int i15, fr.k kVar) {
        this(q7Var, c1Var, pVar, scheduledExecutorService, (i15 & 16) != 0 ? null : lVar);
    }

    private final void I(String taskName, final er.l<? super h.c, i0> onSegmentCreated) {
        final ScreenshotRecorderConfig screenshotRecorderConfigR = r();
        if (screenshotRecorderConfigR == null) {
            this.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long jA = this.dateProvider.a();
        final Date dateX = x();
        if (dateX == null) {
            return;
        }
        final long time = jA - dateX.getTime();
        final v vVarC = c();
        io.sentry.android.replay.util.g.e(getReplayExecutor(), this.options, "SessionCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.J(this.f94409a, time, dateX, vVarC, screenshotRecorderConfigR, onSegmentCreated);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(m mVar, long j15, Date date, v vVar, ScreenshotRecorderConfig screenshotRecorderConfig, er.l lVar) {
        lVar.b(a.n(mVar, j15, date, vVar, mVar.e(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(m mVar, er.p pVar, long j15, ScreenshotRecorderConfig screenshotRecorderConfig) {
        io.sentry.android.replay.h cache = mVar.getCache();
        if (cache != null) {
            pVar.B(cache, Long.valueOf(j15));
        }
        Date dateX = mVar.x();
        if (dateX == null) {
            mVar.options.getLogger().c(b7.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.getIsTerminating().get()) {
            mVar.options.getLogger().c(b7.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            mVar.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long jA = mVar.dateProvider.a();
        if (jA - dateX.getTime() >= mVar.options.getSessionReplay().l()) {
            h.c cVarN = a.n(mVar, mVar.options.getSessionReplay().l(), dateX, mVar.c(), mVar.e(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (cVarN instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) cVarN;
                h.c.Created.b(created, mVar.scopes, null, 2, null);
                mVar.d(mVar.e() + 1);
                mVar.k(created.getReplay().g0());
            }
        }
        if (jA - mVar.getReplayStartTimestamp().get() >= mVar.options.getSessionReplay().j()) {
            mVar.options.getReplayController().stop();
            mVar.options.getLogger().c(b7.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(m mVar, a1 a1Var) {
        a1Var.w(mVar.c());
        String strE = a1Var.E();
        mVar.C(strE != null ? r.j1(strE, '.', null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(a1 a1Var) {
        a1Var.w(v.f95495b);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void P(ScreenshotRecorderConfig recorderConfig) {
        I("onConfigurationChanged", new b());
        super.P(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final er.p<? super io.sentry.android.replay.h, ? super Long, i0> store) {
        final ScreenshotRecorderConfig screenshotRecorderConfigR = r();
        final long jA = this.dateProvider.a();
        io.sentry.android.replay.util.g.e(getReplayExecutor(), this.options, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.K(this.f94416a, store, jA, screenshotRecorderConfigR);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void g() {
        I("pause", new c());
        super.g();
    }

    @Override // io.sentry.android.replay.capture.h
    public void h(boolean isTerminating, er.l<? super Date, i0> onSegmentSent) {
        if (this.options.getSessionReplay().o()) {
            this.options.getLogger().c(b7.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        getIsTerminating().set(isTerminating);
    }

    @Override // io.sentry.android.replay.capture.h
    public h i() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void j(int segmentId, v replayId, r7.b replayType) {
        super.j(segmentId, replayId, replayType);
        c1 c1Var = this.scopes;
        if (c1Var != null) {
            c1Var.J(new h4() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    m.L(this.f94415a, a1Var);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h cache = getCache();
        I("stop", new d(cache != null ? cache.L() : null));
        c1 c1Var = this.scopes;
        if (c1Var != null) {
            c1Var.J(new h4() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    m.M(a1Var);
                }
            });
        }
        super.stop();
    }

    public m(q7 q7Var, c1 c1Var, p pVar, ScheduledExecutorService scheduledExecutorService, er.l<? super v, io.sentry.android.replay.h> lVar) {
        super(q7Var, c1Var, pVar, scheduledExecutorService, lVar);
        this.options = q7Var;
        this.scopes = c1Var;
        this.dateProvider = pVar;
    }
}
