package vb;

import androidx.work.WorkerParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvb/c1;", "Lvb/a1;", "Lvb/s;", "processor", "Lec/b;", "workTaskExecutor", "<init>", "(Lvb/s;Lec/b;)V", "Lvb/x;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Loq/i0;", "c", "(Lvb/x;Landroidx/work/WorkerParameters$a;)V", "", "reason", "a", "(Lvb/x;I)V", "Lvb/s;", "getProcessor", "()Lvb/s;", "b", "Lec/b;", "getWorkTaskExecutor", "()Lec/b;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s processor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ec.b workTaskExecutor;

    public c1(s sVar, ec.b bVar) {
        this.processor = sVar;
        this.workTaskExecutor = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(c1 c1Var, x xVar, WorkerParameters.a aVar) throws Throwable {
        c1Var.processor.o(xVar, aVar);
    }

    @Override // vb.a1
    public void a(x workSpecId, int reason) {
        this.workTaskExecutor.d(new dc.y(this.processor, workSpecId, false, reason));
    }

    @Override // vb.a1
    public void c(final x workSpecId, final WorkerParameters.a runtimeExtras) {
        this.workTaskExecutor.d(new Runnable() { // from class: vb.b1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                c1.g(this.f205738a, workSpecId, runtimeExtras);
            }
        });
    }
}
