package androidx.work;

import java.util.concurrent.Executor;
import ju.g1;
import ju.v1;
import p071kotlin.Metadata;
import tq.i;
import ub.g;
import ub.j0;
import ub.k0;
import ub.l0;
import ub.n;
import ub.t0;
import ub.u0;
import ub.y;
import vb.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0003\n\u0015\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u001f\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u001f\u00109\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00101R\u001f\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b:\u00101R\u0019\u0010?\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b\u0015\u0010>R\u001a\u0010D\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020E8G¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b7\u0010HR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\b3\u0010HR\u0017\u0010K\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b(\u0010HR\u0017\u0010L\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u001f\u0010G\u001a\u0004\b\u0010\u0010HR\u0017\u0010M\u001a\u00020E8G¢\u0006\f\n\u0004\b8\u0010G\u001a\u0004\b/\u0010HR\u0017\u0010O\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010\bR\u001a\u0010S\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u0010N\u0012\u0004\bQ\u0010RR\u0017\u0010X\u001a\u00020T8G¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bF\u0010W¨\u0006Z"}, d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "", "s", "()Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Ltq/i;", "b", "Ltq/i;", "o", "()Ltq/i;", "workerCoroutineContext", "c", "m", "taskExecutor", "Lub/b;", "Lub/b;", "()Lub/b;", "clock", "Lub/u0;", "e", "Lub/u0;", "q", "()Lub/u0;", "workerFactory", "Lub/n;", "f", "Lub/n;", "()Lub/n;", "inputMergerFactory", "Lub/j0;", "g", "Lub/j0;", "k", "()Lub/j0;", "runnableScheduler", "Li6/a;", "", "h", "Li6/a;", "()Li6/a;", "initializationExceptionHandler", "i", "l", "schedulingExceptionHandler", "Lub/t0;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "J", "getRemoteSessionTimeoutMillis", "()J", "remoteSessionTimeoutMillis", "", "n", "I", "()I", "minimumLoggingLevel", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "Z", "isUsingDefaultTaskExecutor", "t", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Lub/l0;", "u", "Lub/l0;", "()Lub/l0;", "tracer", "v", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i workerCoroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor taskExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ub.b clock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u0 workerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n inputMergerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j0 runnableScheduler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i6.a<Throwable> initializationExceptionHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final i6.a<Throwable> schedulingExceptionHandler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i6.a<t0> workerInitializationExceptionHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i6.a<t0> workerExecutionExceptionHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String defaultProcessName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long remoteSessionTimeoutMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int minimumLoggingLevel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int minJobSchedulerId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int maxJobSchedulerId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int contentUriTriggerWorkersLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int maxSchedulerLimit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isUsingDefaultTaskExecutor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean isMarkingJobsAsImportantWhileForeground;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final l0 tracer;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R$\u00105\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b\u0017\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010D\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b0\u0010A\"\u0004\bB\u0010CR*\u0010H\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR*\u0010M\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010A\"\u0004\bL\u0010CR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010A\"\u0004\bP\u0010CR$\u0010X\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\b%\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\\"\u0004\b]\u0010^R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010`\u001a\u0004\b?\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010`\u001a\u0004\bS\u0010a\"\u0004\bd\u0010cR\"\u0010g\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010`\u001a\u0004\bJ\u0010a\"\u0004\bf\u0010cR\"\u0010j\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010`\u001a\u0004\bN\u0010a\"\u0004\bi\u0010cR\"\u0010l\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010`\u001a\u0004\b\u001e\u0010a\"\u0004\bk\u0010cR\"\u0010r\u001a\u00020m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010n\u001a\u0004\bE\u0010o\"\u0004\bp\u0010qR$\u0010x\u001a\u0004\u0018\u00010s8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010t\u001a\u0004\bh\u0010u\"\u0004\bv\u0010w¨\u0006y"}, d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "Lub/u0;", "workerFactory", "w", "(Lub/u0;)Landroidx/work/a$a;", "", "loggingLevel", "v", "(I)Landroidx/work/a$a;", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Ltq/i;", "b", "Ltq/i;", "r", "()Ltq/i;", "setWorkerContext$work_runtime_release", "(Ltq/i;)V", "workerContext", "c", "Lub/u0;", "t", "()Lub/u0;", "setWorkerFactory$work_runtime_release", "(Lub/u0;)V", "Lub/n;", "d", "Lub/n;", "g", "()Lub/n;", "setInputMergerFactory$work_runtime_release", "(Lub/n;)V", "inputMergerFactory", "p", "setTaskExecutor$work_runtime_release", "taskExecutor", "Lub/b;", "f", "Lub/b;", "()Lub/b;", "setClock$work_runtime_release", "(Lub/b;)V", "clock", "Lub/j0;", "Lub/j0;", "n", "()Lub/j0;", "setRunnableScheduler$work_runtime_release", "(Lub/j0;)V", "runnableScheduler", "Li6/a;", "", "h", "Li6/a;", "()Li6/a;", "setInitializationExceptionHandler$work_runtime_release", "(Li6/a;)V", "initializationExceptionHandler", "i", "o", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Lub/t0;", "j", "u", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "s", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "m", "J", "()J", "setRemoteSessionTimeoutMillis$work_runtime_release", "(J)V", "remoteSessionTimeoutMillis", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "q", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Lub/l0;", "Lub/l0;", "()Lub/l0;", "setTracer$work_runtime_release", "(Lub/l0;)V", "tracer", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Executor executor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private i workerContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private u0 workerFactory;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private n inputMergerFactory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Executor taskExecutor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private ub.b clock;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private j0 runnableScheduler;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private i6.a<Throwable> initializationExceptionHandler;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private i6.a<Throwable> schedulingExceptionHandler;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private i6.a<t0> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private i6.a<t0> workerExecutionExceptionHandler;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String defaultProcessName;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int minJobSchedulerId;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private l0 tracer;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long remoteSessionTimeoutMillis = 600000;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int loggingLevel = 4;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private int maxJobSchedulerId = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private int maxSchedulerLimit = 20;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private int contentUriTriggerWorkersLimit = 8;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean markJobsAsImportantWhileForeground = true;

        public final a a() {
            return new a(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ub.b getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        public final i6.a<Throwable> f() {
            return this.initializationExceptionHandler;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final n getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final long getRemoteSessionTimeoutMillis() {
            return this.remoteSessionTimeoutMillis;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final j0 getRunnableScheduler() {
            return this.runnableScheduler;
        }

        public final i6.a<Throwable> o() {
            return this.schedulingExceptionHandler;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final l0 getTracer() {
            return this.tracer;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final i getWorkerContext() {
            return this.workerContext;
        }

        public final i6.a<t0> s() {
            return this.workerExecutionExceptionHandler;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final u0 getWorkerFactory() {
            return this.workerFactory;
        }

        public final i6.a<t0> u() {
            return this.workerInitializationExceptionHandler;
        }

        public final C0293a v(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public final C0293a w(u0 workerFactory) {
            this.workerFactory = workerFactory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/a$c;", "", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        a a();
    }

    public a(C0293a c0293a) {
        i workerContext = c0293a.getWorkerContext();
        Executor executor = c0293a.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? ub.c.d(workerContext) : null;
            if (executor == null) {
                executor = ub.c.e(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = c0293a.getExecutor() != null ? v1.b(executor) : g1.a();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = c0293a.getTaskExecutor() == null;
        Executor taskExecutor = c0293a.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? ub.c.e(true) : taskExecutor;
        ub.b clock = c0293a.getClock();
        this.clock = clock == null ? new k0() : clock;
        u0 workerFactory = c0293a.getWorkerFactory();
        this.workerFactory = workerFactory == null ? g.f197106a : workerFactory;
        n inputMergerFactory = c0293a.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? y.f197202a : inputMergerFactory;
        j0 runnableScheduler = c0293a.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new d() : runnableScheduler;
        this.minimumLoggingLevel = c0293a.getLoggingLevel();
        this.minJobSchedulerId = c0293a.getMinJobSchedulerId();
        this.maxJobSchedulerId = c0293a.getMaxJobSchedulerId();
        this.maxSchedulerLimit = c0293a.getMaxSchedulerLimit();
        this.initializationExceptionHandler = c0293a.f();
        this.schedulingExceptionHandler = c0293a.o();
        this.workerInitializationExceptionHandler = c0293a.u();
        this.workerExecutionExceptionHandler = c0293a.s();
        this.defaultProcessName = c0293a.getDefaultProcessName();
        this.remoteSessionTimeoutMillis = c0293a.getRemoteSessionTimeoutMillis();
        this.contentUriTriggerWorkersLimit = c0293a.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = c0293a.getMarkJobsAsImportantWhileForeground();
        l0 tracer = c0293a.getTracer();
        this.tracer = tracer == null ? ub.c.f() : tracer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ub.b getClock() {
        return this.clock;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    public final i6.a<Throwable> e() {
        return this.initializationExceptionHandler;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final j0 getRunnableScheduler() {
        return this.runnableScheduler;
    }

    public final i6.a<Throwable> l() {
        return this.schedulingExceptionHandler;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final l0 getTracer() {
        return this.tracer;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final i getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    public final i6.a<t0> p() {
        return this.workerExecutionExceptionHandler;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final u0 getWorkerFactory() {
        return this.workerFactory;
    }

    public final i6.a<t0> r() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
