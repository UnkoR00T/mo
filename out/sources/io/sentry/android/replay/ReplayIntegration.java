package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.a1;
import io.sentry.a4;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.f1;
import io.sentry.g1;
import io.sentry.h4;
import io.sentry.p0;
import io.sentry.q2;
import io.sentry.q7;
import io.sentry.r1;
import io.sentry.z3;
import io.sentry.z6;
import java.io.Closeable;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003VKYBA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u0019J\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010\u0019J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00172\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020\u00172\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010XR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\b^\u0010lR\u001b\u0010r\u001a\u00020n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010qR#\u0010w\u001a\n t*\u0004\u0018\u00010s0s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010k\u001a\u0004\bu\u0010vR\u001a\u0010}\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001a\u0010\u007f\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010z\u001a\u0004\b~\u0010|R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010\u0084\u0001R&\u0010\u0086\u0001\u001a\u0011\u0012\u0004\u0012\u00020)\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\\R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010ZR\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0095\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/r1;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/t;", "Lio/sentry/android/replay/gestures/c;", "Lio/sentry/a4;", "Lio/sentry/p0$b;", "Lio/sentry/transport/a0$b;", "Lio/sentry/android/replay/w;", "Landroid/content/Context;", "context", "Lio/sentry/transport/p;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/f;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/p;Ler/a;Ler/l;)V", "(Landroid/content/Context;Lio/sentry/transport/p;)V", "Loq/i0;", "C0", "()V", "t0", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "u0", "O0", "", "unfinishedReplayId", "M", "(Ljava/lang/String;)V", "O", "Lio/sentry/c1;", "scopes", "Lio/sentry/q7;", "options", "m", "(Lio/sentry/c1;Lio/sentry/q7;)V", "", "d0", "()Z", "start", "s", "isTerminating", "u", "(Ljava/lang/Boolean;)V", "b0", "()Lio/sentry/protocol/v;", "Lio/sentry/z3;", "converter", "H0", "(Lio/sentry/z3;)V", "E", "()Lio/sentry/z3;", "g", "C", "stop", "Landroid/graphics/Bitmap;", "bitmap", "r", "(Landroid/graphics/Bitmap;)V", "close", "Lio/sentry/p0$a;", "status", "h", "(Lio/sentry/p0$a;)V", "Lio/sentry/transport/a0;", "rateLimiter", "y", "(Lio/sentry/transport/a0;)V", "Landroid/view/MotionEvent;", "event", "b", "(Landroid/view/MotionEvent;)V", "", "width", "height", "p", "(II)V", "Lio/sentry/android/replay/u;", "config", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "a", "Landroid/content/Context;", "Lio/sentry/transport/p;", "c", "Ler/a;", "d", "Ler/l;", "e", "Z", "debugMaskingEnabled", "f", "Lio/sentry/q7;", "Lio/sentry/c1;", "Lio/sentry/android/replay/f;", "recorder", "Lio/sentry/android/replay/gestures/a;", "j", "Lio/sentry/android/replay/gestures/a;", "gestureRecorder", "Lio/sentry/util/z;", "k", "Loq/k;", "()Lio/sentry/util/z;", "random", "Lio/sentry/android/replay/o;", "l", "c0", "()Lio/sentry/android/replay/o;", "rootViewsSpy", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "a0", "()Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "isManualPause$sentry_android_replay_release", "isManualPause", "Lio/sentry/android/replay/capture/h;", "q", "Lio/sentry/android/replay/capture/h;", "captureStrategy", "Lio/sentry/z3;", "replayBreadcrumbConverter", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/i;", "t", "Lio/sentry/android/replay/util/i;", "mainLooperHandler", "v", "gestureRecorderProvider", "Lio/sentry/util/a;", "w", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/android/replay/l;", "x", "Lio/sentry/android/replay/l;", "lifecycle", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements r1, Closeable, t, io.sentry.android.replay.gestures.c, a4, p0.b, io.sentry.transport.a0.b, w {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f94244y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f94245z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.transport.p dateProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<io.sentry.android.replay.f> recorderProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<io.sentry.protocol.v, io.sentry.android.replay.h> replayCacheProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean debugMaskingEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private q7 options;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c1 scopes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.f recorder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.gestures.a gestureRecorder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k random;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k rootViewsSpy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k replayExecutor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEnabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isManualPause;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.capture.h captureStrategy;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private z3 replayBreadcrumbConverter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private er.l<? super Boolean, ? extends io.sentry.android.replay.capture.h> replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.util.i mainLooperHandler;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.a<io.sentry.android.replay.gestures.a> gestureRecorderProvider;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lifecycleLock;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final l lifecycle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$a;", "", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$b;", "Lio/sentry/hints/c;", "<init>", "()V", "", "a", "()Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean a() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$c;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "", "a", "I", "cnt", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SentryReplayIntegration-");
            int i15 = this.cnt;
            this.cnt = i15 + 1;
            sb5.append(i15);
            Thread thread = new Thread(r15, sb5.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "newTimestamp", "Loq/i0;", "c", "(Ljava/util/Date;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends fr.w implements er.l<Date, i0> {
        d() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Date date) {
            c(date);
            return i0.f148189a;
        }

        public final void c(Date date) {
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.captureStrategy;
                hVar.d((hVar2 != null ? Integer.valueOf(hVar2.e()) : null).intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.captureStrategy;
            if (hVar3 == null) {
                return;
            }
            hVar3.k(date);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/h;", "", "frameTimeStamp", "Loq/i0;", "c", "(Lio/sentry/android/replay/h;J)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends fr.w implements er.p<io.sentry.android.replay.h, Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f94269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fr.p0<String> f94270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReplayIntegration f94271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, fr.p0<String> p0Var, ReplayIntegration replayIntegration) {
            super(2);
            this.f94269b = bitmap;
            this.f94270c = p0Var;
            this.f94271d = replayIntegration;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(io.sentry.android.replay.h hVar, Long l15) throws Exception {
            c(hVar, l15.longValue());
            return i0.f148189a;
        }

        public final void c(io.sentry.android.replay.h hVar, long j15) throws Exception {
            hVar.u(this.f94269b, j15, this.f94270c.f66410a);
            this.f94271d.L();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/util/z;", "c", "()Lio/sentry/util/z;"}, k = 3, mv = {1, 9, 0})
    static final class f extends fr.w implements er.a<io.sentry.util.z> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f94272b = new f();

        f() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final io.sentry.util.z a() {
            return new io.sentry.util.z();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ScheduledExecutorService;"}, k = 3, mv = {1, 9, 0})
    static final class g extends fr.w implements er.a<ScheduledExecutorService> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f94273b = new g();

        g() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(new c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/replay/o;", "c", "()Lio/sentry/android/replay/o;"}, k = 3, mv = {1, 9, 0})
    static final class h extends fr.w implements er.a<o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f94274b = new h();

        h() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final o a() {
            return o.INSTANCE.b();
        }
    }

    static {
        z6.d().b("maven:io.sentry:sentry-android-replay", "8.22.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(Context context, io.sentry.transport.p pVar, er.a<? extends io.sentry.android.replay.f> aVar, er.l<? super io.sentry.protocol.v, io.sentry.android.replay.h> lVar) {
        this.context = context;
        this.dateProvider = pVar;
        this.recorderProvider = aVar;
        this.replayCacheProvider = lVar;
        this.random = oq.l.a(f.f94272b);
        this.rootViewsSpy = oq.l.a(h.f94274b);
        this.replayExecutor = oq.l.a(g.f94273b);
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        this.replayBreadcrumbConverter = q2.b();
        this.mainLooperHandler = new io.sentry.android.replay.util.i(null, 1, null);
        this.lifecycleLock = new io.sentry.util.a();
        this.lifecycle = new l();
    }

    private final void C0() throws Exception {
        c1 c1Var;
        c1 c1Var2;
        io.sentry.transport.a0 a0VarF;
        io.sentry.transport.a0 a0VarF2;
        g1 g1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.RESUMED;
                if (lVar.b(mVar)) {
                    if (!this.isManualPause.get()) {
                        q7 q7Var = this.options;
                        if (q7Var == null) {
                            q7Var = null;
                        }
                        if (q7Var.getConnectionStatusProvider().w1() != p0.a.DISCONNECTED && (((c1Var = this.scopes) == null || (a0VarF2 = c1Var.F()) == null || !a0VarF2.E(io.sentry.l.All)) && ((c1Var2 = this.scopes) == null || (a0VarF = c1Var2.F()) == null || !a0VarF.E(io.sentry.l.Replay)))) {
                            this.lifecycle.d(mVar);
                            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                            if (hVar != null) {
                                hVar.s();
                            }
                            io.sentry.android.replay.f fVar = this.recorder;
                            if (fVar != null) {
                                fVar.s();
                                i0 i0Var = i0.f148189a;
                            }
                            cr.a.a(g1VarA, null);
                            return;
                        }
                    }
                    cr.a.a(g1VarA, null);
                    return;
                }
            }
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() throws Exception {
        c1 c1Var;
        c1 c1Var2;
        io.sentry.transport.a0 a0VarF;
        io.sentry.transport.a0 a0VarF2;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            q7 q7Var = this.options;
            if (q7Var == null) {
                q7Var = null;
            }
            if (q7Var.getConnectionStatusProvider().w1() == p0.a.DISCONNECTED || !(((c1Var = this.scopes) == null || (a0VarF2 = c1Var.F()) == null || !a0VarF2.E(io.sentry.l.All)) && ((c1Var2 = this.scopes) == null || (a0VarF = c1Var2.F()) == null || !a0VarF.E(io.sentry.l.Replay)))) {
                t0();
            }
        }
    }

    private final void M(String unfinishedReplayId) {
        File[] fileArrListFiles;
        q7 q7Var = this.options;
        if (q7Var == null) {
            q7Var = null;
        }
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (fu.r.V(name, "replay_", false, 2, null) && !fu.r.d0(name, b0().toString(), false, 2, null) && (fu.r.t0(unfinishedReplayId) || !fu.r.d0(name, unfinishedReplayId, false, 2, null))) {
                io.sentry.util.h.a(file);
            }
        }
    }

    static /* synthetic */ void N(ReplayIntegration replayIntegration, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "";
        }
        replayIntegration.M(str);
    }

    private final void O() {
        q7 q7Var = this.options;
        if (q7Var == null) {
            q7Var = null;
        }
        f1 executorService = q7Var.getExecutorService();
        q7 q7Var2 = this.options;
        io.sentry.android.replay.util.g.d(executorService, q7Var2 != null ? q7Var2 : null, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.j
            @Override // java.lang.Runnable
            public final void run() {
                ReplayIntegration.V(this.f94466a);
            }
        });
    }

    private final void O0() {
        if (this.recorder instanceof io.sentry.android.replay.d) {
            c0().p().remove((io.sentry.android.replay.d) this.recorder);
        }
        c0().p().remove(this.gestureRecorder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ReplayIntegration replayIntegration) {
        q7 q7Var = replayIntegration.options;
        if (q7Var == null) {
            q7Var = null;
        }
        io.sentry.cache.r rVarFindPersistingScopeObserver = q7Var.findPersistingScopeObserver();
        if (rVarFindPersistingScopeObserver != null) {
            q7 q7Var2 = replayIntegration.options;
            if (q7Var2 == null) {
                q7Var2 = null;
            }
            String str = (String) rVarFindPersistingScopeObserver.u(q7Var2, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.v vVar = new io.sentry.protocol.v(str);
                if (fr.t.c(vVar, io.sentry.protocol.v.f95495b)) {
                    N(replayIntegration, null, 1, null);
                    return;
                }
                io.sentry.android.replay.h.Companion companion = io.sentry.android.replay.h.INSTANCE;
                q7 q7Var3 = replayIntegration.options;
                if (q7Var3 == null) {
                    q7Var3 = null;
                }
                LastSegmentData lastSegmentDataC = companion.c(q7Var3, vVar, replayIntegration.replayCacheProvider);
                if (lastSegmentDataC == null) {
                    N(replayIntegration, null, 1, null);
                    return;
                }
                q7 q7Var4 = replayIntegration.options;
                if (q7Var4 == null) {
                    q7Var4 = null;
                }
                Object objU = rVarFindPersistingScopeObserver.u(q7Var4, "breadcrumbs.json", List.class);
                List<io.sentry.f> list = objU instanceof List ? (List) objU : null;
                io.sentry.android.replay.capture.h.Companion companion2 = io.sentry.android.replay.capture.h.INSTANCE;
                c1 c1Var = replayIntegration.scopes;
                q7 q7Var5 = replayIntegration.options;
                io.sentry.android.replay.capture.h.c cVarC = companion2.c(c1Var, q7Var5 == null ? null : q7Var5, lastSegmentDataC.getDuration(), lastSegmentDataC.getTimestamp(), vVar, lastSegmentDataC.getId(), lastSegmentDataC.getRecorderConfig().getRecordingHeight(), lastSegmentDataC.getRecorderConfig().getRecordingWidth(), lastSegmentDataC.getReplayType(), lastSegmentDataC.getCache(), lastSegmentDataC.getRecorderConfig().getFrameRate(), lastSegmentDataC.getRecorderConfig().getBitRate(), lastSegmentDataC.getScreenAtStart(), list, new LinkedList(lastSegmentDataC.c()));
                if (cVarC instanceof io.sentry.android.replay.capture.h.c.Created) {
                    ((io.sentry.android.replay.capture.h.c.Created) cVarC).a(replayIntegration.scopes, io.sentry.util.m.e(new b()));
                }
                replayIntegration.M(str);
                return;
            }
        }
        N(replayIntegration, null, 1, null);
    }

    private final io.sentry.util.z Z() {
        return (io.sentry.util.z) this.random.getValue();
    }

    private final ScheduledExecutorService a0() {
        return (ScheduledExecutorService) this.replayExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void n0(fr.p0 p0Var, a1 a1Var) {
        String strE = a1Var.E();
        p0Var.f66410a = strE != null ? fu.r.j1(strE, '.', null, 2, null) : 0;
    }

    private final void t0() throws Exception {
        g1 g1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.PAUSED;
                if (lVar.b(mVar)) {
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.g();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.g();
                    }
                    this.lifecycle.d(mVar);
                    i0 i0Var = i0.f148189a;
                    cr.a.a(g1VarA, null);
                    return;
                }
            }
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    private final void u0() {
        if (this.recorder instanceof io.sentry.android.replay.d) {
            c0().p().add((io.sentry.android.replay.d) this.recorder);
        }
        c0().p().add(this.gestureRecorder);
    }

    @Override // io.sentry.a4
    /* JADX INFO: renamed from: C, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    @Override // io.sentry.a4
    /* JADX INFO: renamed from: E, reason: from getter */
    public z3 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public void H0(z3 converter) {
        this.replayBreadcrumbConverter = converter;
    }

    public final void P(ScreenshotRecorderConfig config) {
        io.sentry.android.replay.f fVar;
        if (this.isEnabled.get() && d0()) {
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                hVar.P(config);
            }
            io.sentry.android.replay.f fVar2 = this.recorder;
            if (fVar2 != null) {
                fVar2.P(config);
            }
            if (this.lifecycle.getCurrentState() != m.PAUSED || (fVar = this.recorder) == null) {
                return;
            }
            fVar.g();
        }
    }

    @Override // io.sentry.android.replay.gestures.c
    public void b(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        if (this.isEnabled.get() && this.lifecycle.c() && (hVar = this.captureStrategy) != null) {
            hVar.b(event);
        }
    }

    public io.sentry.protocol.v b0() {
        io.sentry.protocol.v vVarC;
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        return (hVar == null || (vVarC = hVar.c()) == null) ? io.sentry.protocol.v.f95495b : vVarC;
    }

    public final o c0() {
        return (o) this.rootViewsSpy.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        io.sentry.transport.a0 a0VarF;
        g1 g1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.CLOSED;
                if (lVar.b(mVar)) {
                    q7 q7Var = this.options;
                    if (q7Var == null) {
                        q7Var = null;
                    }
                    q7Var.getConnectionStatusProvider().M3(this);
                    c1 c1Var = this.scopes;
                    if (c1Var != null && (a0VarF = c1Var.F()) != null) {
                        a0VarF.M(this);
                    }
                    stop();
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.close();
                    }
                    this.recorder = null;
                    c0().close();
                    ScheduledExecutorService scheduledExecutorServiceA0 = a0();
                    q7 q7Var2 = this.options;
                    if (q7Var2 == null) {
                        q7Var2 = null;
                    }
                    io.sentry.android.replay.util.g.c(scheduledExecutorServiceA0, q7Var2);
                    this.lifecycle.d(mVar);
                    i0 i0Var = i0.f148189a;
                    cr.a.a(g1VarA, null);
                    return;
                }
            }
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    public boolean d0() {
        return this.lifecycle.getCurrentState().compareTo(m.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(m.STOPPED) < 0;
    }

    @Override // io.sentry.a4
    public void g() throws Exception {
        this.isManualPause.set(true);
        t0();
    }

    @Override // io.sentry.p0.b
    public void h(p0.a status) throws Exception {
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (status == p0.a.DISCONNECTED) {
                t0();
            } else {
                C0();
            }
        }
    }

    @Override // io.sentry.r1
    public void m(c1 scopes, q7 options) {
        ReplayIntegration replayIntegration;
        q7 q7Var;
        io.sentry.android.replay.f yVar;
        io.sentry.android.replay.gestures.a aVar;
        this.options = options;
        if (!options.getSessionReplay().p() && !options.getSessionReplay().q()) {
            options.getLogger().c(b7.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        er.a<io.sentry.android.replay.f> aVar2 = this.recorderProvider;
        if (aVar2 == null || (yVar = aVar2.a()) == null) {
            replayIntegration = this;
            q7Var = options;
            yVar = new y(q7Var, replayIntegration, this, this.mainLooperHandler, a0());
        } else {
            replayIntegration = this;
            q7Var = options;
        }
        replayIntegration.recorder = yVar;
        er.a<io.sentry.android.replay.gestures.a> aVar3 = replayIntegration.gestureRecorderProvider;
        if (aVar3 == null || (aVar = aVar3.a()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(q7Var, this);
        }
        replayIntegration.gestureRecorder = aVar;
        replayIntegration.isEnabled.set(true);
        q7Var.getConnectionStatusProvider().w3(this);
        io.sentry.transport.a0 a0VarF = scopes.F();
        if (a0VarF != null) {
            a0VarF.r(this);
        }
        io.sentry.util.p.a("Replay");
        O();
    }

    @Override // io.sentry.android.replay.w
    public void p(int width, int height) {
        if (this.isEnabled.get() && d0()) {
            q7 q7Var = this.options;
            if (q7Var == null) {
                q7Var = null;
            }
            if (q7Var.getSessionReplay().r()) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                q7 q7Var2 = this.options;
                P(companion.b(context, (q7Var2 != null ? q7Var2 : null).getSessionReplay(), width, height));
            }
        }
    }

    @Override // io.sentry.android.replay.t
    public void r(Bitmap bitmap) {
        final fr.p0 p0Var = new fr.p0();
        c1 c1Var = this.scopes;
        if (c1Var != null) {
            c1Var.J(new h4() { // from class: io.sentry.android.replay.k
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    ReplayIntegration.n0(p0Var, a1Var);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null) {
            hVar.f(bitmap, new e(bitmap, p0Var, this));
        }
    }

    @Override // io.sentry.a4
    public void s() throws Exception {
        this.isManualPause.set(false);
        C0();
    }

    @Override // io.sentry.a4
    public void start() throws Exception {
        io.sentry.android.replay.capture.h fVar;
        g1 g1VarA = this.lifecycleLock.a();
        try {
            if (!this.isEnabled.get()) {
                cr.a.a(g1VarA, null);
                return;
            }
            l lVar = this.lifecycle;
            m mVar = m.STARTED;
            if (!lVar.b(mVar)) {
                q7 q7Var = this.options;
                if (q7Var == null) {
                    q7Var = null;
                }
                q7Var.getLogger().c(b7.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                cr.a.a(g1VarA, null);
                return;
            }
            io.sentry.util.z zVarZ = Z();
            q7 q7Var2 = this.options;
            if (q7Var2 == null) {
                q7Var2 = null;
            }
            boolean zA = io.sentry.android.replay.util.k.a(zVarZ, q7Var2.getSessionReplay().k());
            if (!zA) {
                q7 q7Var3 = this.options;
                if (q7Var3 == null) {
                    q7Var3 = null;
                }
                if (!q7Var3.getSessionReplay().q()) {
                    q7 q7Var4 = this.options;
                    if (q7Var4 == null) {
                        q7Var4 = null;
                    }
                    q7Var4.getLogger().c(b7.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    cr.a.a(g1VarA, null);
                    return;
                }
            }
            this.lifecycle.d(mVar);
            er.l<? super Boolean, ? extends io.sentry.android.replay.capture.h> lVar2 = this.replayCaptureStrategyProvider;
            if (lVar2 == null || (fVar = lVar2.b(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    q7 q7Var5 = this.options;
                    fVar = new io.sentry.android.replay.capture.m(q7Var5 == null ? null : q7Var5, this.scopes, this.dateProvider, a0(), this.replayCacheProvider);
                } else {
                    q7 q7Var6 = this.options;
                    fVar = new io.sentry.android.replay.capture.f(q7Var6 == null ? null : q7Var6, this.scopes, this.dateProvider, Z(), a0(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = fVar;
            io.sentry.android.replay.f fVar2 = this.recorder;
            if (fVar2 != null) {
                fVar2.start();
            }
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h.b.a(hVar, 0, null, null, 7, null);
            }
            u0();
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    @Override // io.sentry.a4
    public void stop() throws Exception {
        g1 g1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.STOPPED;
                if (lVar.b(mVar)) {
                    O0();
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.reset();
                    }
                    io.sentry.android.replay.f fVar2 = this.recorder;
                    if (fVar2 != null) {
                        fVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.gestureRecorder;
                    if (aVar != null) {
                        aVar.c();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.d(mVar);
                    i0 i0Var = i0.f148189a;
                    cr.a.a(g1VarA, null);
                    return;
                }
            }
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    @Override // io.sentry.a4
    public void u(Boolean isTerminating) {
        if (this.isEnabled.get() && d0()) {
            io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (vVar.equals(hVar != null ? hVar.c() : null)) {
                q7 q7Var = this.options;
                (q7Var != null ? q7Var : null).getLogger().c(b7.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.captureStrategy;
            if (hVar2 != null) {
                hVar2.h(fr.t.c(isTerminating, Boolean.TRUE), new d());
            }
            io.sentry.android.replay.capture.h hVar3 = this.captureStrategy;
            this.captureStrategy = hVar3 != null ? hVar3.i() : null;
        }
    }

    @Override // io.sentry.transport.a0.b
    public void y(io.sentry.transport.a0 rateLimiter) throws Exception {
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.E(io.sentry.l.All) || rateLimiter.E(io.sentry.l.Replay)) {
                t0();
            } else {
                C0();
            }
        }
    }

    public ReplayIntegration(Context context, io.sentry.transport.p pVar) {
        this(io.sentry.android.replay.util.c.a(context), pVar, null, null);
    }
}
