package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import cc.i0;
import cc.j0;
import cc.p;
import cc.t1;
import cc.y;
import fc.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import ub.w;
import vb.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "m", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public c.a m() {
        e1 e1VarP = e1.p(b());
        WorkDatabase workDatabaseU = e1VarP.u();
        j0 j0VarE0 = workDatabaseU.e0();
        y yVarC0 = workDatabaseU.c0();
        t1 t1VarF0 = workDatabaseU.f0();
        p pVarB0 = workDatabaseU.b0();
        List<i0> listC = j0VarE0.c(e1VarP.n().getClock().a() - TimeUnit.DAYS.toMillis(1L));
        List<i0> listU = j0VarE0.u();
        List<i0> listL = j0VarE0.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        if (!listC.isEmpty()) {
            w.e().f(a.f61085a, "Recently completed work:\n\n");
            w.e().f(a.f61085a, a.d(yVarC0, t1VarF0, pVarB0, listC));
        }
        if (!listU.isEmpty()) {
            w.e().f(a.f61085a, "Running work:\n\n");
            w.e().f(a.f61085a, a.d(yVarC0, t1VarF0, pVarB0, listU));
        }
        if (!listL.isEmpty()) {
            w.e().f(a.f61085a, "Enqueued work:\n\n");
            w.e().f(a.f61085a, a.d(yVarC0, t1VarF0, pVarB0, listL));
        }
        return c.a.b();
    }
}
