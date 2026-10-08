package io.sentry.android.replay.capture;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import fr.b0;
import fr.q0;
import fr.t;
import fr.w;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.protocol.v;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001a\b!\u0018\u0000 \u00182\u00020\u0001:\u0002y6BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0093\u0001\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00108R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010E\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010C\u001a\u0004\bD\u0010@R\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010$\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR/\u00101\u001a\u0004\u0018\u0001002\b\u0010U\u001a\u0004\u0018\u0001008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u00103R/\u0010_\u001a\u0004\u0018\u00010\u001e2\b\u0010U\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010]\"\u0004\bV\u0010^R\u001a\u0010d\u001a\u00020`8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010a\u001a\u0004\bb\u0010cR/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010U\u001a\u0004\u0018\u00010%8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010W\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR+\u0010m\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010W\u001a\u0004\b9\u0010j\"\u0004\bk\u0010lR+\u0010q\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010W\u001a\u0004\b=\u0010o\"\u0004\b;\u0010pR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00138V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010W\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR \u0010x\u001a\b\u0012\u0004\u0012\u00020+0*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010v\u001a\u0004\bn\u0010w¨\u0006z"}, d2 = {"Lio/sentry/android/replay/capture/a;", "Lio/sentry/android/replay/capture/h;", "Lio/sentry/q7;", "options", "Lio/sentry/c1;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/c1;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Ler/l;)V", "", "segmentId", "replayId", "Lio/sentry/r7$b;", "replayType", "Loq/i0;", "j", "(ILio/sentry/protocol/v;Lio/sentry/r7$b;)V", "s", "()V", "g", "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", "frameRate", "bitRate", "cache", "", "screenAtStart", "", "Lio/sentry/f;", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/h$c;", "m", "(JLjava/util/Date;Lio/sentry/protocol/v;IIIIILio/sentry/r7$b;Lio/sentry/android/replay/h;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/android/replay/u;", "recorderConfig", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "Landroid/view/MotionEvent;", "event", "b", "(Landroid/view/MotionEvent;)V", "Lio/sentry/q7;", "c", "Lio/sentry/c1;", "d", "Lio/sentry/transport/p;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "t", "()Ljava/util/concurrent/ScheduledExecutorService;", "f", "Ler/l;", "Loq/k;", "q", "persistingExecutor", "Lio/sentry/android/replay/gestures/b;", "h", "Lio/sentry/android/replay/gestures/b;", "gestureConverter", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "y", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Lio/sentry/android/replay/h;", "o", "()Lio/sentry/android/replay/h;", "setCache", "(Lio/sentry/android/replay/h;)V", "<set-?>", "k", "Lir/e;", "r", "()Lio/sentry/android/replay/u;", "A", "l", "x", "()Ljava/util/Date;", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "u", "()Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "n", "w", "()Ljava/lang/String;", "C", "(Ljava/lang/String;)V", "()Lio/sentry/protocol/v;", "z", "(Lio/sentry/protocol/v;)V", "currentReplayId", "p", "()I", "(I)V", "currentSegment", "v", "()Lio/sentry/r7$b;", "B", "(Lio/sentry/r7$b;)V", "Ljava/util/Deque;", "()Ljava/util/Deque;", "currentEvents", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService replayExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final er.l<v, io.sentry.android.replay.h> replayCacheProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.gestures.b gestureConverter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.h cache;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f94294t = {q0.f(new b0(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), q0.f(new b0(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), q0.f(new b0(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), q0.f(new b0(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), q0.f(new b0(a.class, "currentSegment", "getCurrentSegment()I", 0)), q0.f(new b0(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f94295u = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k persistingExecutor = oq.l.a(c.f94314b);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isTerminating = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ir.e recorderConfig = new g(null, this, "", this);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ir.e segmentTimestamp = new h(null, this, "segment.timestamp", this);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong replayStartTimestamp = new AtomicLong();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ir.e screenAtStart = new i(null, this, "replay.screen-at-start", this, "replay.screen-at-start");

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ir.e currentReplayId = new d(v.f95495b, this, "replay.id", this, "replay.id");

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ir.e currentSegment = new e(-1, this, "segment.id", this, "segment.id");

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ir.e replayType = new f(null, this, "replay.type", this, "replay.type");

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Deque<io.sentry.rrweb.b> currentEvents = new ConcurrentLinkedDeque();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/capture/a$b;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "", "a", "I", "cnt", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SentryReplayPersister-");
            int i15 = this.cnt;
            this.cnt = i15 + 1;
            sb5.append(i15);
            Thread thread = new Thread(r15, sb5.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ScheduledExecutorService;"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.a<ScheduledExecutorService> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f94314b = new c();

        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(new b());
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$d", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements ir.e<Object, v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<v> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f94319e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2217a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94320a;

            public RunnableC2217a(er.a aVar) {
                this.f94320a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94320a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94322c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94323d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94324e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94325f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f94321b = str;
                this.f94322c = obj;
                this.f94323d = obj2;
                this.f94324e = aVar;
                this.f94325f = str2;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94323d;
                io.sentry.android.replay.h cache = this.f94324e.getCache();
                if (cache != null) {
                    cache.M(this.f94325f, String.valueOf(obj));
                }
            }
        }

        public d(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f94316b = aVar;
            this.f94317c = str;
            this.f94318d = aVar2;
            this.f94319e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94316b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94316b.q(), this.f94316b.options, "CaptureStrategy.runInBackground", new RunnableC2217a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94316b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public v a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, v value) {
            v andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94317c, andSet, value, this.f94318d, this.f94319e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$e", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements ir.e<Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<Integer> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f94330e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2218a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94331a;

            public RunnableC2218a(er.a aVar) {
                this.f94331a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94331a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94333c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94334d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94336f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f94332b = str;
                this.f94333c = obj;
                this.f94334d = obj2;
                this.f94335e = aVar;
                this.f94336f = str2;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94334d;
                io.sentry.android.replay.h cache = this.f94335e.getCache();
                if (cache != null) {
                    cache.M(this.f94336f, String.valueOf(obj));
                }
            }
        }

        public e(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f94327b = aVar;
            this.f94328c = str;
            this.f94329d = aVar2;
            this.f94330e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94327b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94327b.q(), this.f94327b.options, "CaptureStrategy.runInBackground", new RunnableC2218a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94327b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public Integer a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, Integer value) {
            Integer andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94328c, andSet, value, this.f94329d, this.f94330e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$f", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements ir.e<Object, r7.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<r7.b> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f94341e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2219a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94342a;

            public RunnableC2219a(er.a aVar) {
                this.f94342a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94342a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94344c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94345d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94346e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94347f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f94343b = str;
                this.f94344c = obj;
                this.f94345d = obj2;
                this.f94346e = aVar;
                this.f94347f = str2;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94345d;
                io.sentry.android.replay.h cache = this.f94346e.getCache();
                if (cache != null) {
                    cache.M(this.f94347f, String.valueOf(obj));
                }
            }
        }

        public f(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f94338b = aVar;
            this.f94339c = str;
            this.f94340d = aVar2;
            this.f94341e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94338b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94338b.q(), this.f94338b.options, "CaptureStrategy.runInBackground", new RunnableC2219a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94338b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public r7.b a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, r7.b value) {
            r7.b andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94339c, andSet, value, this.f94340d, this.f94341e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$g", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements ir.e<Object, ScreenshotRecorderConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<ScreenshotRecorderConfig> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94351d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2220a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94352a;

            public RunnableC2220a(er.a aVar) {
                this.f94352a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94352a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94354c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94355d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94356e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f94353b = str;
                this.f94354c = obj;
                this.f94355d = obj2;
                this.f94356e = aVar;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94354c;
                ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.f94355d;
                if (screenshotRecorderConfig == null) {
                    return;
                }
                io.sentry.android.replay.h cache = this.f94356e.getCache();
                if (cache != null) {
                    cache.M("config.height", String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                }
                io.sentry.android.replay.h cache2 = this.f94356e.getCache();
                if (cache2 != null) {
                    cache2.M("config.width", String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                }
                io.sentry.android.replay.h cache3 = this.f94356e.getCache();
                if (cache3 != null) {
                    cache3.M("config.frame-rate", String.valueOf(screenshotRecorderConfig.getFrameRate()));
                }
                io.sentry.android.replay.h cache4 = this.f94356e.getCache();
                if (cache4 != null) {
                    cache4.M("config.bit-rate", String.valueOf(screenshotRecorderConfig.getBitRate()));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2) {
            this.f94349b = aVar;
            this.f94350c = str;
            this.f94351d = aVar2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94349b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94349b.q(), this.f94349b.options, "CaptureStrategy.runInBackground", new RunnableC2220a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94349b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public ScreenshotRecorderConfig a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, ScreenshotRecorderConfig value) {
            ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94350c, andSet, value, this.f94351d));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$h", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements ir.e<Object, Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<Date> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94360d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2221a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94361a;

            public RunnableC2221a(er.a aVar) {
                this.f94361a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94361a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94362b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94363c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94364d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94365e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f94362b = str;
                this.f94363c = obj;
                this.f94364d = obj2;
                this.f94365e = aVar;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94363c;
                Date date = (Date) this.f94364d;
                io.sentry.android.replay.h cache = this.f94365e.getCache();
                if (cache != null) {
                    cache.M("segment.timestamp", date == null ? null : io.sentry.m.h(date));
                }
            }
        }

        public h(Object obj, a aVar, String str, a aVar2) {
            this.f94358b = aVar;
            this.f94359c = str;
            this.f94360d = aVar2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94358b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94358b.q(), this.f94358b.options, "CaptureStrategy.runInBackground", new RunnableC2221a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94358b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public Date a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, Date value) {
            Date andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94359c, andSet, value, this.f94360d));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$i", "Lir/e;", "", "Lkotlin/Function0;", "Loq/i0;", "task", "c", "(Ler/a;)V", "thisRef", "Lmr/l;", "property", "a", "(Ljava/lang/Object;Lmr/l;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lmr/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements ir.e<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<String> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f94367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f94369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f94370e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC2222a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ er.a f94371a;

            public RunnableC2222a(er.a aVar) {
                this.f94371a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f94371a.a();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends w implements er.a<i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f94372b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f94373c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f94374d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f94375e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94376f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f94372b = str;
                this.f94373c = obj;
                this.f94374d = obj2;
                this.f94375e = aVar;
                this.f94376f = str2;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() throws Exception {
                c();
                return i0.f148189a;
            }

            public final void c() throws Exception {
                Object obj = this.f94374d;
                io.sentry.android.replay.h cache = this.f94375e.getCache();
                if (cache != null) {
                    cache.M(this.f94376f, String.valueOf(obj));
                }
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f94367b = aVar;
            this.f94368c = str;
            this.f94369d = aVar2;
            this.f94370e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void c(er.a<i0> task) {
            if (this.f94367b.options.getThreadChecker().a()) {
                io.sentry.android.replay.util.g.e(this.f94367b.q(), this.f94367b.options, "CaptureStrategy.runInBackground", new RunnableC2222a(task));
                return;
            }
            try {
                task.a();
            } catch (Throwable th4) {
                this.f94367b.options.getLogger().b(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th4);
            }
        }

        @Override // ir.e, ir.d
        public String a(Object thisRef, mr.l<?> property) {
            return this.value.get();
        }

        @Override // ir.e
        public void b(Object thisRef, mr.l<?> property, String value) {
            String andSet = this.value.getAndSet(value);
            if (t.c(andSet, value)) {
                return;
            }
            c(new b(this.f94368c, andSet, value, this.f94369d, this.f94370e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q7 q7Var, c1 c1Var, p pVar, ScheduledExecutorService scheduledExecutorService, er.l<? super v, io.sentry.android.replay.h> lVar) {
        this.options = q7Var;
        this.scopes = c1Var;
        this.dateProvider = pVar;
        this.replayExecutor = scheduledExecutorService;
        this.replayCacheProvider = lVar;
        this.gestureConverter = new io.sentry.android.replay.gestures.b(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.sentry.android.replay.capture.h.c n(a aVar, long j15, Date date, v vVar, int i15, int i16, int i17, int i18, int i19, r7.b bVar, io.sentry.android.replay.h hVar, String str, List list, Deque deque, int i25, Object obj) {
        if (obj == null) {
            return aVar.m(j15, date, vVar, i15, i16, i17, i18, i19, (i25 & 256) != 0 ? aVar.v() : bVar, (i25 & 512) != 0 ? aVar.cache : hVar, (i25 & 1024) != 0 ? aVar.w() : str, (i25 & 2048) != 0 ? null : list, (i25 & PKIFailureInfo.certConfirmed) != 0 ? aVar.currentEvents : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService q() {
        return (ScheduledExecutorService) this.persistingExecutor.getValue();
    }

    public final void A(ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig.b(this, f94294t[0], screenshotRecorderConfig);
    }

    public void B(r7.b bVar) {
        this.replayType.b(this, f94294t[5], bVar);
    }

    protected final void C(String str) {
        this.screenAtStart.b(this, f94294t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void P(ScreenshotRecorderConfig recorderConfig) {
        A(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        List<io.sentry.rrweb.d> listA;
        ScreenshotRecorderConfig screenshotRecorderConfigR = r();
        if (screenshotRecorderConfigR == null || (listA = this.gestureConverter.a(event, screenshotRecorderConfigR)) == null) {
            return;
        }
        pq.v.D(this.currentEvents, listA);
    }

    @Override // io.sentry.android.replay.capture.h
    public v c() {
        return (v) this.currentReplayId.a(this, f94294t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void d(int i15) {
        this.currentSegment.b(this, f94294t[4], Integer.valueOf(i15));
    }

    @Override // io.sentry.android.replay.capture.h
    public int e() {
        return ((Number) this.currentSegment.a(this, f94294t[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void g() {
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(int segmentId, v replayId, r7.b replayType) {
        io.sentry.android.replay.h hVar;
        er.l<v, io.sentry.android.replay.h> lVar = this.replayCacheProvider;
        if (lVar == null || (hVar = lVar.b(replayId)) == null) {
            hVar = new io.sentry.android.replay.h(this.options, replayId);
        }
        this.cache = hVar;
        z(replayId);
        d(segmentId);
        if (replayType == null) {
            replayType = this instanceof m ? r7.b.SESSION : r7.b.BUFFER;
        }
        B(replayType);
        k(io.sentry.m.d());
        this.replayStartTimestamp.set(this.dateProvider.a());
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(Date date) {
        this.segmentTimestamp.b(this, f94294t[1], date);
    }

    protected final io.sentry.android.replay.capture.h.c m(long duration, Date currentSegmentTimestamp, v replayId, int segmentId, int height, int width, int frameRate, int bitRate, r7.b replayType, io.sentry.android.replay.h cache, String screenAtStart, List<io.sentry.f> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
        return io.sentry.android.replay.capture.h.INSTANCE.c(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    protected final io.sentry.android.replay.h getCache() {
        return this.cache;
    }

    protected final Deque<io.sentry.rrweb.b> p() {
        return this.currentEvents;
    }

    public final ScreenshotRecorderConfig r() {
        return (ScreenshotRecorderConfig) this.recorderConfig.a(this, f94294t[0]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void s() {
        k(io.sentry.m.d());
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVar = this.cache;
        if (hVar != null) {
            hVar.close();
        }
        this.replayStartTimestamp.set(0L);
        k(null);
        z(v.f95495b);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    protected final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    protected final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    public r7.b v() {
        return (r7.b) this.replayType.a(this, f94294t[5]);
    }

    protected final String w() {
        return (String) this.screenAtStart.a(this, f94294t[2]);
    }

    public Date x() {
        return (Date) this.segmentTimestamp.a(this, f94294t[1]);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    protected final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    public void z(v vVar) {
        this.currentReplayId.b(this, f94294t[3], vVar);
    }
}
