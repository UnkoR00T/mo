package vb;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import cc.WorkGenerationalId;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.h2;
import ju.v1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002/)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u001d\u0010 \u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010\rR\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010UR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010[R\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\bW\u0010^¨\u0006`"}, d2 = {"Lvb/p1;", "", "Lvb/p1$a;", "builder", "<init>", "(Lvb/p1$a;)V", "Lvb/p1$b;", "x", "(Ltq/e;)Ljava/lang/Object;", "Landroidx/work/c$a;", "result", "", "t", "(Landroidx/work/c$a;)Z", "s", "", "stopReason", "w", "(I)Z", "o", "C", "()Z", "", "workSpecId", "Loq/i0;", "q", "(Ljava/lang/String;)V", "u", "v", "B", "", "tags", "l", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/google/common/util/concurrent/q;", "r", "()Lcom/google/common/util/concurrent/q;", "p", "(I)V", "A", "Lcc/i0;", "a", "Lcc/i0;", "n", "()Lcc/i0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "d", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/c;", "e", "Landroidx/work/c;", "builderWorker", "Lec/b;", "f", "Lec/b;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Lub/b;", "h", "Lub/b;", "clock", "Lbc/a;", "i", "Lbc/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lcc/j0;", "k", "Lcc/j0;", "workSpecDao", "Lcc/b;", "Lcc/b;", "dependencyDao", "m", "Ljava/util/List;", "workDescription", "Lju/a0;", "Lju/a0;", "workerJob", "Lcc/w;", "()Lcc/w;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cc.i0 workSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String workSpecId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters.a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.c builderWorker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ec.b workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.a configuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ub.b clock;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final bc.a foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final cc.j0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cc.b dependencyDao;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<String> tags;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String workDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ju.a0 workerJob;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lvb/p1$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lec/b;", "workTaskExecutor", "Lbc/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lcc/i0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Lec/b;Lbc/a;Landroidx/work/impl/WorkDatabase;Lcc/i0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Lvb/p1$a;", "Lvb/p1;", "a", "()Lvb/p1;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "Lec/b;", "i", "()Lec/b;", "Lbc/a;", "d", "()Lbc/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Lcc/i0;", "h", "()Lcc/i0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/c;", "Landroidx/work/c;", "j", "()Landroidx/work/c;", "setWorker", "(Landroidx/work/c;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.work.a configuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ec.b workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final bc.a foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final cc.i0 workSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<String> tags;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Context appContext;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private androidx.work.c worker;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private WorkerParameters.a runtimeExtras = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.a aVar, ec.b bVar, bc.a aVar2, WorkDatabase workDatabase, cc.i0 i0Var, List<String> list) {
            this.configuration = aVar;
            this.workTaskExecutor = bVar;
            this.foregroundProcessor = aVar2;
            this.workDatabase = workDatabase;
            this.workSpec = i0Var;
            this.tags = list;
            this.appContext = context.getApplicationContext();
        }

        public final p1 a() {
            return new p1(this);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.work.a getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final bc.a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final List<String> f() {
            return this.tags;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final cc.i0 getWorkSpec() {
            return this.workSpec;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ec.b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final androidx.work.c getWorker() {
            return this.worker;
        }

        public final a k(WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lvb/p1$b;", "", "<init>", "()V", "c", "a", "b", "Lvb/p1$b$a;", "Lvb/p1$b$b;", "Lvb/p1$b$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvb/p1$b$a;", "Lvb/p1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final androidx.work.c.a result;

            public a(androidx.work.c.a aVar) {
                super(null);
                this.result = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.c.a getResult() {
                return this.result;
            }

            public /* synthetic */ a(androidx.work.c.a aVar, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? new androidx.work.c.a.C0295a() : aVar);
            }
        }

        /* JADX INFO: renamed from: vb.p1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvb/p1$b$b;", "Lvb/p1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C5376b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final androidx.work.c.a result;

            public C5376b(androidx.work.c.a aVar) {
                super(null);
                this.result = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.c.a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvb/p1$b$c;", "Lvb/p1$b;", "", "reason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int reason;

            public c(int i15) {
                super(null);
                this.reason = i15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public /* synthetic */ c(int i15, int i16, fr.k kVar) {
                this((i16 & 1) != 0 ? -256 : i15);
            }
        }

        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205848e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvb/p1$b;", "<anonymous>", "(Lju/p0;)Lvb/p1$b;"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super b>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f205850e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p1 f205851f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p1 p1Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f205851f = p1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f205850e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                p1 p1Var = this.f205851f;
                this.f205850e = 1;
                Object objX = p1Var.x(this);
                return objX == objE ? objE : objX;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super b> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f205851f, eVar);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean O(b bVar, p1 p1Var) {
            boolean zW;
            if (bVar instanceof b.C5376b) {
                zW = p1Var.t(((b.C5376b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                zW = p1Var.s(((b.a) bVar).getResult());
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new oq.p();
                }
                zW = p1Var.w(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(zW);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final b aVar;
            Object objE = uq.b.e();
            int i15 = this.f205848e;
            int i16 = 1;
            androidx.work.c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.a0 a0Var = p1.this.workerJob;
                    a aVar3 = new a(p1.this, null);
                    this.f205848e = 1;
                    obj = ju.i.g(a0Var, aVar3, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                aVar = (b) obj;
            } catch (g1 e15) {
                aVar = new b.c(e15.getReason());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i16, objArr3 == true ? 1 : 0);
            } catch (Throwable th4) {
                ub.w.e().d(r1.f205868a, "Unexpected error in WorkerWrapper", th4);
                aVar = new b.a(objArr2 == true ? 1 : 0, i16, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = p1.this.workDatabase;
            final p1 p1Var = p1.this;
            return workDatabase.S(new Callable() { // from class: vb.q1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return p1.c.O(aVar, p1Var);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p1.this.new c(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f205852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f205853e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f205855g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f205853e = obj;
            this.f205855g |= PKIFailureInfo.systemUnavail;
            return p1.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205856e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f205858g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ub.l f205859h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.work.c cVar, ub.l lVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f205858g = cVar;
            this.f205859h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e eVar;
            Object objE = uq.b.e();
            int i15 = this.f205856e;
            if (i15 == 0) {
                oq.u.b(obj);
                Context context = p1.this.appContext;
                cc.i0 workSpec = p1.this.getWorkSpec();
                androidx.work.c cVar = this.f205858g;
                ub.l lVar = this.f205859h;
                ec.b bVar = p1.this.workTaskExecutor;
                this.f205856e = 1;
                eVar = this;
                if (dc.b0.b(context, workSpec, cVar, lVar, bVar, eVar) != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            eVar = this;
            String str = r1.f205868a;
            p1 p1Var = p1.this;
            ub.w.e().a(str, "Starting work for " + p1Var.getWorkSpec().workerClassName);
            com.google.common.util.concurrent.q<androidx.work.c.a> qVarI = eVar.f205858g.i();
            androidx.work.c cVar2 = eVar.f205858g;
            eVar.f205856e = 2;
            Object objD = r1.d(qVarI, cVar2, this);
            return objD == objE ? objE : objD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super androidx.work.c.a> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p1.this.new e(this.f205858g, this.f205859h, eVar);
        }
    }

    public p1(a aVar) {
        cc.i0 workSpec = aVar.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = aVar.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = aVar.getRuntimeExtras();
        this.builderWorker = aVar.getWorker();
        this.workTaskExecutor = aVar.getWorkTaskExecutor();
        androidx.work.a configuration = aVar.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = aVar.getForegroundProcessor();
        WorkDatabase workDatabase = aVar.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.e0();
        this.dependencyDao = workDatabase.Z();
        List<String> listF = aVar.f();
        this.tags = listF;
        this.workDescription = l(listF);
        this.workerJob = h2.b(null, 1, null);
    }

    private final boolean B(androidx.work.c.a result) {
        this.workSpecDao.w(ub.o0.c.SUCCEEDED, this.workSpecId);
        this.workSpecDao.s(this.workSpecId, ((androidx.work.c.a.C0296c) result).c());
        long jA = this.clock.a();
        for (String str : this.dependencyDao.a(this.workSpecId)) {
            if (this.workSpecDao.h(str) == ub.o0.c.BLOCKED && this.dependencyDao.b(str)) {
                String str2 = r1.f205868a;
                ub.w.e().f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.w(ub.o0.c.ENQUEUED, str);
                this.workSpecDao.t(str, jA);
            }
        }
        return false;
    }

    private final boolean C() {
        return ((Boolean) this.workDatabase.S(new Callable() { // from class: vb.o1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p1.D(this.f205817a);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean D(p1 p1Var) {
        boolean z15;
        if (p1Var.workSpecDao.h(p1Var.workSpecId) == ub.o0.c.ENQUEUED) {
            p1Var.workSpecDao.w(ub.o0.c.RUNNING, p1Var.workSpecId);
            p1Var.workSpecDao.A(p1Var.workSpecId);
            p1Var.workSpecDao.d(p1Var.workSpecId, -256);
            z15 = true;
        } else {
            z15 = false;
        }
        return Boolean.valueOf(z15);
    }

    private final String l(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + pq.v.v0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean o(androidx.work.c.a result) {
        if (result instanceof androidx.work.c.a.C0296c) {
            String str = r1.f205868a;
            ub.w.e().f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.o() ? v() : B(result);
        }
        if (result instanceof androidx.work.c.a.b) {
            String str2 = r1.f205868a;
            ub.w.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return u(-256);
        }
        String str3 = r1.f205868a;
        ub.w.e().f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            return v();
        }
        if (result == null) {
            result = new androidx.work.c.a.C0295a();
        }
        return A(result);
    }

    private final void q(String workSpecId) {
        List listT = pq.v.t(workSpecId);
        while (!listT.isEmpty()) {
            String str = (String) pq.v.M(listT);
            if (this.workSpecDao.h(str) != ub.o0.c.CANCELLED) {
                this.workSpecDao.w(ub.o0.c.FAILED, str);
            }
            listT.addAll(this.dependencyDao.a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(androidx.work.c.a result) {
        String str = r1.f205868a;
        ub.w.e().f(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            v();
            return false;
        }
        A(result);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(androidx.work.c.a result) {
        ub.o0.c cVarH = this.workSpecDao.h(this.workSpecId);
        this.workDatabase.d0().a(this.workSpecId);
        if (cVarH == null) {
            return false;
        }
        if (cVarH == ub.o0.c.RUNNING) {
            return o(result);
        }
        if (cVarH.e()) {
            return false;
        }
        return u(-512);
    }

    private final boolean u(int stopReason) {
        this.workSpecDao.w(ub.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.t(this.workSpecId, this.clock.a());
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.o(this.workSpecId, -1L);
        this.workSpecDao.d(this.workSpecId, stopReason);
        return true;
    }

    private final boolean v() {
        this.workSpecDao.t(this.workSpecId, this.clock.a());
        this.workSpecDao.w(ub.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.x(this.workSpecId);
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.b(this.workSpecId);
        this.workSpecDao.o(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(int stopReason) {
        if (fr.t.c(this.workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            String str = r1.f205868a;
            ub.w.e().a(str, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            u(stopReason);
            return true;
        }
        ub.o0.c cVarH = this.workSpecDao.h(this.workSpecId);
        if (cVarH == null || cVarH.e()) {
            String str2 = r1.f205868a;
            ub.w.e().a(str2, "Status for " + this.workSpecId + " is " + cVarH + " ; not doing any work");
            return false;
        }
        String str3 = r1.f205868a;
        ub.w.e().a(str3, "Status for " + this.workSpecId + " is " + cVarH + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.w(ub.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.d(this.workSpecId, stopReason);
        this.workSpecDao.o(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(tq.e<? super b> eVar) throws Throwable {
        d dVar;
        androidx.work.b bVarA;
        WorkerParameters workerParameters;
        i6.a<ub.t0> aVarP;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f205855g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f205855g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objG = dVar.f205853e;
        Object objE = uq.b.e();
        int i16 = dVar.f205855g;
        int i17 = 1;
        fr.k kVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            if (i16 == 0) {
                oq.u.b(objG);
                final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
                final String traceTag = this.workSpec.getTraceTag();
                if (zIsEnabled && traceTag != null) {
                    this.configuration.getTracer().c(traceTag, this.workSpec.hashCode());
                }
                int i18 = 0;
                if (((Boolean) this.workDatabase.S(new Callable() { // from class: vb.m1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return p1.y(this.f205809a);
                    }
                })).booleanValue()) {
                    return new b.c(i18, i17, kVar);
                }
                if (this.workSpec.o()) {
                    bVarA = this.workSpec.input;
                } else {
                    ub.m mVarB = this.configuration.getInputMergerFactory().b(this.workSpec.inputMergerClassName);
                    if (mVarB == null) {
                        String str = r1.f205868a;
                        ub.w.e().c(str, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                        return new b.a(objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0);
                    }
                    bVarA = mVarB.a(pq.v.L0(pq.v.e(this.workSpec.input), this.workSpecDao.k(this.workSpecId)));
                }
                androidx.work.b bVar = bVarA;
                UUID uuidFromString = UUID.fromString(this.workSpecId);
                List<String> list = this.tags;
                WorkerParameters.a aVar = this.runtimeExtras;
                cc.i0 i0Var = this.workSpec;
                WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, bVar, list, aVar, i0Var.runAttemptCount, i0Var.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new dc.e0(this.workDatabase, this.workTaskExecutor), new dc.d0(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
                final androidx.work.c cVarB = this.builderWorker;
                if (cVarB == null) {
                    try {
                        cVarB = this.configuration.getWorkerFactory().b(this.appContext, this.workSpec.workerClassName, workerParameters2);
                    } catch (Throwable th4) {
                        String str2 = r1.f205868a;
                        ub.w.e().c(str2, "Could not create Worker " + this.workSpec.workerClassName);
                        i6.a<ub.t0> aVarR = this.configuration.r();
                        if (aVarR != null) {
                            dc.f0.a(aVarR, new ub.t0(this.workSpec.workerClassName, workerParameters2, th4), r1.f205868a);
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                }
                cVarB.h();
                d2 d2Var = (d2) dVar.getContext().m(d2.INSTANCE);
                d2Var.C0(new er.l() { // from class: vb.n1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p1.z(cVarB, zIsEnabled, traceTag, this, (Throwable) obj);
                    }
                });
                if (!C()) {
                    return new b.c(0, 1, null);
                }
                int i19 = 0;
                int i25 = 1;
                fr.k kVar2 = null;
                if (d2Var.isCancelled()) {
                    return new b.c(i19, i25, kVar2);
                }
                ub.l lVarB = workerParameters2.b();
                ju.l0 l0VarB = v1.b(this.workTaskExecutor.a());
                try {
                    e eVar2 = new e(cVarB, lVarB, null);
                    dVar.f205852d = workerParameters2;
                    dVar.f205855g = 1;
                    objG = ju.i.g(l0VarB, eVar2, dVar);
                    if (objG == objE) {
                        return objE;
                    }
                    workerParameters = workerParameters2;
                } catch (Throwable th5) {
                    th = th5;
                    workerParameters = workerParameters2;
                    String str3 = r1.f205868a;
                    ub.w.e().d(str3, this.workDescription + " failed because it threw an exception/error", th);
                    aVarP = this.configuration.p();
                    if (aVarP != null) {
                        dc.f0.a(aVarP, new ub.t0(this.workSpec.workerClassName, workerParameters, th), r1.f205868a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workerParameters = (WorkerParameters) dVar.f205852d;
                try {
                    oq.u.b(objG);
                } catch (Throwable th6) {
                    th = th6;
                    String str4 = r1.f205868a;
                    ub.w.e().d(str4, this.workDescription + " failed because it threw an exception/error", th);
                    aVarP = this.configuration.p();
                    if (aVarP != null) {
                        dc.f0.a(aVarP, new ub.t0(this.workSpec.workerClassName, workerParameters, th), r1.f205868a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            return new b.C5376b((androidx.work.c.a) objG);
        } catch (CancellationException e15) {
            String str5 = r1.f205868a;
            ub.w.e().g(str5, this.workDescription + " was cancelled", e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean y(p1 p1Var) {
        cc.i0 i0Var = p1Var.workSpec;
        if (i0Var.state != ub.o0.c.ENQUEUED) {
            String str = r1.f205868a;
            ub.w.e().a(str, p1Var.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!i0Var.o() && !p1Var.workSpec.n()) || p1Var.clock.a() >= p1Var.workSpec.c()) {
            return Boolean.FALSE;
        }
        ub.w.e().a(r1.f205868a, "Delaying execution for " + p1Var.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(androidx.work.c cVar, boolean z15, String str, p1 p1Var, Throwable th4) {
        if (th4 instanceof g1) {
            cVar.j(((g1) th4).getReason());
        }
        if (z15 && str != null) {
            p1Var.configuration.getTracer().b(str, p1Var.workSpec.hashCode());
        }
        return oq.i0.f148189a;
    }

    public final boolean A(androidx.work.c.a result) {
        q(this.workSpecId);
        androidx.work.b bVarC = ((androidx.work.c.a.C0295a) result).c();
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.s(this.workSpecId, bVarC);
        return false;
    }

    public final WorkGenerationalId m() {
        return cc.r1.a(this.workSpec);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final cc.i0 getWorkSpec() {
        return this.workSpec;
    }

    public final void p(int stopReason) {
        this.workerJob.u(new g1(stopReason));
    }

    public final com.google.common.util.concurrent.q<Boolean> r() {
        return ub.u.k(this.workTaskExecutor.b().n0(h2.b(null, 1, null)), null, new c(null), 2, null);
    }
}
