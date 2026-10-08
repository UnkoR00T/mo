package io.sentry.android.replay.capture;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import fr.l0;
import fr.w;
import io.sentry.a1;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.h4;
import io.sentry.protocol.v;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import io.sentry.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001KBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140\fH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010&J+\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00140\fH\u0016¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001400H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lio/sentry/android/replay/capture/f;", "Lio/sentry/android/replay/capture/a;", "Lio/sentry/q7;", "options", "Lio/sentry/c1;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/util/z;", "random", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/c1;Lio/sentry/transport/p;Lio/sentry/util/z;Ljava/util/concurrent/ScheduledExecutorService;Ler/l;)V", "Ljava/io/File;", "file", "Loq/i0;", "Q", "(Ljava/io/File;)V", "", "Lio/sentry/android/replay/capture/h$c$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/util/List;)V", "", "bufferLimit", ip.a.f96137b, "(Ljava/util/List;J)V", "", "taskName", "Lio/sentry/android/replay/capture/h$c;", "onSegmentCreated", "N", "(Ljava/lang/String;Ler/l;)V", "g", "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "h", "(ZLer/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "store", "f", "(Landroid/graphics/Bitmap;Ler/p;)V", "Lio/sentry/android/replay/u;", "recorderConfig", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "Lio/sentry/android/replay/capture/h;", "i", "()Lio/sentry/android/replay/capture/h;", "Landroid/view/MotionEvent;", "event", "b", "(Landroid/view/MotionEvent;)V", "v", "Lio/sentry/q7;", "w", "Lio/sentry/c1;", "x", "Lio/sentry/transport/p;", "y", "Lio/sentry/util/z;", "z", "Ljava/util/List;", "bufferedSegments", "A", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class f extends a {
    public static final int B = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final z random;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final List<h.c.Created> bufferedSegments;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Loq/i0;", "c", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.l<h.c, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<Date, i0> f94395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super Date, i0> lVar) {
            super(1);
            this.f94395c = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(h.c cVar) throws InterruptedException {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(h.c cVar) throws InterruptedException {
            f fVar = f.this;
            fVar.L(fVar.bufferedSegments);
            if (cVar instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) cVar;
                h.c.Created.b(created, f.this.scopes, null, 2, null);
                this.f94395c.b(created.getReplay().g0());
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
                f.this.bufferedSegments.add(cVar);
                f fVar = f.this;
                fVar.d(fVar.e() + 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Loq/i0;", "c", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.l<h.c, i0> {
        d() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(h.c cVar) {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(h.c cVar) {
            if (cVar instanceof h.c.Created) {
                f.this.bufferedSegments.add(cVar);
                f fVar = f.this;
                fVar.d(fVar.e() + 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c$a;", "it", "", "c", "(Lio/sentry/android/replay/capture/h$c$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends w implements er.l<h.c.Created, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f94398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f94399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f94400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j15, f fVar, l0 l0Var) {
            super(1);
            this.f94398b = j15;
            this.f94399c = fVar;
            this.f94400d = l0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(h.c.Created created) {
            if (created.getReplay().g0().getTime() >= this.f94398b) {
                return Boolean.FALSE;
            }
            f fVar = this.f94399c;
            fVar.d(fVar.e() - 1);
            this.f94399c.Q(created.getReplay().h0());
            this.f94400d.f66404a = true;
            return Boolean.TRUE;
        }
    }

    public f(q7 q7Var, c1 c1Var, p pVar, z zVar, ScheduledExecutorService scheduledExecutorService, er.l<? super v, io.sentry.android.replay.h> lVar) {
        super(q7Var, c1Var, pVar, scheduledExecutorService, lVar);
        this.options = q7Var;
        this.scopes = c1Var;
        this.dateProvider = pVar;
        this.random = zVar;
        this.bufferedSegments = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(List<h.c.Created> list) throws InterruptedException {
        h.c.Created created = (h.c.Created) pq.v.L(list);
        while (created != null) {
            h.c.Created.b(created, this.scopes, null, 2, null);
            created = (h.c.Created) pq.v.L(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(f fVar, a1 a1Var) {
        a1Var.w(fVar.c());
    }

    private final void N(String taskName, final er.l<? super h.c, i0> onSegmentCreated) {
        final Date dateE;
        Long lI;
        final ScreenshotRecorderConfig screenshotRecorderConfigR = r();
        if (screenshotRecorderConfigR == null) {
            this.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long jC = this.options.getSessionReplay().c();
        long jA = this.dateProvider.a();
        io.sentry.android.replay.h cache = getCache();
        if (cache == null || (lI = cache.I()) == null || (dateE = io.sentry.m.e(lI.longValue())) == null) {
            dateE = io.sentry.m.e(jA - jC);
        }
        final long time = jA - dateE.getTime();
        final v vVarC = c();
        io.sentry.android.replay.util.g.e(getReplayExecutor(), this.options, "BufferCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.O(this.f94377a, time, dateE, vVarC, screenshotRecorderConfigR, onSegmentCreated);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(f fVar, long j15, Date date, v vVar, ScreenshotRecorderConfig screenshotRecorderConfig, er.l lVar) {
        lVar.b(a.n(fVar, j15, date, vVar, fVar.e(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(b7.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th4) {
            this.options.getLogger().a(b7.ERROR, th4, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(f fVar, er.p pVar, long j15) {
        io.sentry.android.replay.h cache = fVar.getCache();
        if (cache != null) {
            pVar.B(cache, Long.valueOf(j15));
        }
        long jA = fVar.dateProvider.a() - fVar.options.getSessionReplay().c();
        io.sentry.android.replay.h cache2 = fVar.getCache();
        fVar.C(cache2 != null ? cache2.N(jA) : null);
        fVar.S(fVar.bufferedSegments, jA);
    }

    private final void S(List<h.c.Created> list, long j15) {
        l0 l0Var = new l0();
        pq.v.J(list, new e(j15, this, l0Var));
        if (l0Var.f66404a) {
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    pq.v.x();
                }
                ((h.c.Created) obj).d(i15);
                i15 = i16;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(File file, f fVar) {
        io.sentry.util.h.a(file);
        fVar.d(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void P(ScreenshotRecorderConfig recorderConfig) {
        N("configuration_changed", new c());
        super.P(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        super.b(event);
        h.Companion.h(h.INSTANCE, p(), this.dateProvider.a() - this.options.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final er.p<? super io.sentry.android.replay.h, ? super Long, i0> store) {
        final long jA = this.dateProvider.a();
        io.sentry.android.replay.util.g.e(getReplayExecutor(), this.options, "BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.R(this.f94386a, store, jA);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void g() {
        N("pause", new d());
        super.g();
    }

    @Override // io.sentry.android.replay.capture.h
    public void h(boolean isTerminating, er.l<? super Date, i0> onSegmentSent) {
        if (!io.sentry.android.replay.util.k.a(this.random, this.options.getSessionReplay().g())) {
            this.options.getLogger().c(b7.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        c1 c1Var = this.scopes;
        if (c1Var != null) {
            c1Var.J(new h4() { // from class: io.sentry.android.replay.capture.d
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    f.M(this.f94385a, a1Var);
                }
            });
        }
        if (!isTerminating) {
            N("capture_replay", new b(onSegmentSent));
        } else {
            getIsTerminating().set(true);
            this.options.getLogger().c(b7.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public h i() {
        if (getIsTerminating().get()) {
            this.options.getLogger().c(b7.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.options, this.scopes, this.dateProvider, getReplayExecutor(), null, 16, null);
        mVar.A(r());
        mVar.j(e(), c(), r7.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h cache = getCache();
        final File fileL = cache != null ? cache.L() : null;
        io.sentry.android.replay.util.g.e(getReplayExecutor(), this.options, "BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.c
            @Override // java.lang.Runnable
            public final void run() {
                f.T(fileL, this);
            }
        });
        super.stop();
    }
}
