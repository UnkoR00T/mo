package s7;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import io.sentry.android.core.c2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
abstract class c<Params, Progress, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f178571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f178572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f178573h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static f f178574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile Executor f178575k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<Params, Result> f178576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask<Result> f178577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile g f178578c = g.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f178579d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f178580e = new AtomicBoolean();

    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f178581a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f178581a.getAndIncrement());
        }
    }

    class b extends h<Params, Result> {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f178580e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f178591a);
                Binder.flushPendingCommands();
                c.this.l(result);
                return result;
            } catch (Throwable th4) {
                try {
                    c.this.f178579d.set(true);
                    throw th4;
                } catch (Throwable th5) {
                    c.this.l(result);
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s7.c$c, reason: collision with other inner class name */
    class C4580c extends FutureTask<Result> {
        C4580c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e15) {
                c2.i("AsyncTask", e15);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e16) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e16.getCause());
            } catch (Throwable th4) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th4);
            }
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f178584a;

        static {
            int[] iArr = new int[g.values().length];
            f178584a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f178584a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f178585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Data[] f178586b;

        e(c cVar, Data... dataArr) {
            this.f178585a = cVar;
            this.f178586b = dataArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i15 = message.what;
            if (i15 == 1) {
                eVar.f178585a.d(eVar.f178586b[0]);
            } else {
                if (i15 != 2) {
                    return;
                }
                eVar.f178585a.k(eVar.f178586b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Params[] f178591a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f178571f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f178572g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f178573h = threadPoolExecutor;
        f178575k = threadPoolExecutor;
    }

    c() {
        b bVar = new b();
        this.f178576a = bVar;
        this.f178577b = new C4580c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            try {
                if (f178574j == null) {
                    f178574j = new f();
                }
                fVar = f178574j;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z15) {
        this.f178579d.set(true);
        return this.f178577b.cancel(z15);
    }

    protected abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f178578c == g.PENDING) {
            this.f178578c = g.RUNNING;
            j();
            this.f178576a.f178591a = paramsArr;
            executor.execute(this.f178577b);
            return this;
        }
        int i15 = d.f178584a[this.f178578c.ordinal()];
        if (i15 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i15 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f178578c = g.FINISHED;
    }

    public final boolean f() {
        return this.f178579d.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f178580e.get()) {
            return;
        }
        l(result);
    }
}
