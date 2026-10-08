package wb;

import fr.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;
import ub.j0;
import vb.a1;
import vb.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lwb/d;", "", "Lub/j0;", "runnableScheduler", "Lvb/a1;", "launcher", "", "timeoutMs", "<init>", "(Lub/j0;Lvb/a1;J)V", "Lvb/x;", "token", "Loq/i0;", "c", "(Lvb/x;)V", "b", "a", "Lub/j0;", "Lvb/a1;", "J", "d", "Ljava/lang/Object;", "lock", "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 runnableScheduler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a1 launcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<x, Runnable> tracked;

    public d(j0 j0Var, a1 a1Var) {
        this(j0Var, a1Var, 0L, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d dVar, x xVar) {
        dVar.launcher.a(xVar, 3);
    }

    public final void b(x token) {
        Runnable runnableRemove;
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.a(runnableRemove);
        }
    }

    public final void c(final x token) {
        Runnable runnable = new Runnable() { // from class: wb.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d(this.f211798a, token);
            }
        };
        synchronized (this.lock) {
            this.tracked.put(token, runnable);
        }
        this.runnableScheduler.b(this.timeoutMs, runnable);
    }

    public d(j0 j0Var, a1 a1Var, long j15) {
        this.runnableScheduler = j0Var;
        this.launcher = a1Var;
        this.timeoutMs = j15;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    public /* synthetic */ d(j0 j0Var, a1 a1Var, long j15, int i15, k kVar) {
        this(j0Var, a1Var, (i15 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j15);
    }
}
