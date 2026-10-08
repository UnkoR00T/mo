package androidx.work;

import android.content.Context;
import androidx.work.Worker;
import com.google.common.util.concurrent.q;
import p071kotlin.Metadata;
import ub.k;
import ub.z0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/c;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "m", "()Landroidx/work/c$a;", "Lcom/google/common/util/concurrent/q;", "i", "()Lcom/google/common/util/concurrent/q;", "Lub/k;", "d", "n", "()Lub/k;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends c {
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k o(Worker worker) {
        return worker.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c.a p(Worker worker) {
        return worker.m();
    }

    @Override // androidx.work.c
    public q<k> d() {
        return z0.e(c(), new er.a() { // from class: ub.s0
            @Override // er.a
            public final Object a() {
                return Worker.o(this.f197175a);
            }
        });
    }

    @Override // androidx.work.c
    public final q<c.a> i() {
        return z0.e(c(), new er.a() { // from class: ub.r0
            @Override // er.a
            public final Object a() {
                return Worker.p(this.f197173a);
            }
        });
    }

    public abstract c.a m();

    public k n() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}
