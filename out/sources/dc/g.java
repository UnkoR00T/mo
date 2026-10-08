package dc;

import androidx.work.impl.WorkDatabase;
import cc.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import ub.q0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "Lvb/e0;", "continuation", "Loq/i0;", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Lvb/e0;)V", "Lcc/i0;", "workSpec", "b", "(Lcc/i0;)Lcc/i0;", "", "Lvb/u;", "schedulers", "c", "(Ljava/util/List;Lcc/i0;)Lcc/i0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final void a(WorkDatabase workDatabase, androidx.work.a aVar, vb.e0 e0Var) {
        int i15;
        List listT = pq.v.t(e0Var);
        int i16 = 0;
        while (!listT.isEmpty()) {
            vb.e0 e0Var2 = (vb.e0) pq.v.M(listT);
            List<? extends q0> listG = e0Var2.g();
            if ((listG instanceof Collection) && listG.isEmpty()) {
                i15 = 0;
            } else {
                Iterator<T> it = listG.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    if (((q0) it.next()).getWorkSpec().org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.g() && (i15 = i15 + 1) < 0) {
                        pq.v.w();
                    }
                }
            }
            i16 += i15;
            List<vb.e0> listF = e0Var2.f();
            if (listF != null) {
                listT.addAll(listF);
            }
        }
        if (i16 == 0) {
            return;
        }
        int iB = workDatabase.e0().B();
        int contentUriTriggerWorkersLimit = aVar.getContentUriTriggerWorkersLimit();
        if (iB + i16 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iB + ";\ncurrent enqueue operation count: " + i16 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final i0 b(i0 i0Var) {
        boolean zD = i0Var.input.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zD2 = i0Var.input.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zD3 = i0Var.input.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zD || !zD2 || !zD3) {
            return i0Var;
        }
        return i0.e(i0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new androidx.work.b.a().c(i0Var.input).f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", i0Var.workerClassName).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final i0 c(List<? extends vb.u> list, i0 i0Var) {
        return b(i0Var);
    }
}
