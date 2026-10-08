package dc;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import cc.i0;
import cc.j0;
import cc.r1;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class d0 implements ub.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f40752d = ub.w.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec.b f40753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final bc.a f40754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j0 f40755c;

    @SuppressLint({"LambdaLast"})
    public d0(WorkDatabase workDatabase, bc.a aVar, ec.b bVar) {
        this.f40754b = aVar;
        this.f40753a = bVar;
        this.f40755c = workDatabase.e0();
    }

    public static /* synthetic */ Void b(d0 d0Var, UUID uuid, ub.k kVar, Context context) {
        d0Var.getClass();
        String string = uuid.toString();
        i0 i0VarI = d0Var.f40755c.i(string);
        if (i0VarI == null || i0VarI.state.e()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        d0Var.f40754b.a(string, kVar);
        context.startService(androidx.work.impl.foreground.a.e(context, r1.a(i0VarI), kVar));
        return null;
    }

    @Override // ub.l
    public com.google.common.util.concurrent.q<Void> a(final Context context, final UUID uuid, final ub.k kVar) {
        return ub.u.f(this.f40753a.c(), "setForegroundAsync", new er.a() { // from class: dc.c0
            @Override // er.a
            public final Object a() {
                return d0.b(this.f40746a, uuid, kVar, context);
            }
        });
    }
}
