package dc;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class u implements ec.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f40775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f40776c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f40774a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f40777d = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u f40778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f40779b;

        a(u uVar, Runnable runnable) {
            this.f40778a = uVar;
            this.f40779b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f40779b.run();
                synchronized (this.f40778a.f40777d) {
                    this.f40778a.a();
                }
            } catch (Throwable th4) {
                synchronized (this.f40778a.f40777d) {
                    this.f40778a.a();
                    throw th4;
                }
            }
        }
    }

    public u(Executor executor) {
        this.f40775b = executor;
    }

    void a() {
        a aVarPoll = this.f40774a.poll();
        this.f40776c = aVarPoll;
        if (aVarPoll != null) {
            this.f40775b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f40777d) {
            try {
                this.f40774a.add(new a(this, runnable));
                if (this.f40776c == null) {
                    a();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
