package n4;

import java.util.concurrent.atomic.AtomicInteger;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00060\u000ej\u0002`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "b", "()I", "Lf3/m;", "", "mergeDescendants", "Lkotlin/Function1;", "Ln4/i0;", "Loq/i0;", "properties", "c", "(Lf3/m;ZLer/l;)Lf3/m;", "a", "(Lf3/m;Ler/l;)Lf3/m;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastIdentifier", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f131307a = new AtomicInteger(0);

    public static final f3.m a(f3.m mVar, er.l<? super i0, oq.i0> lVar) {
        return mVar.u(new c(lVar));
    }

    public static final int b() {
        return f131307a.addAndGet(1);
    }

    public static final f3.m c(f3.m mVar, boolean z15, er.l<? super i0, oq.i0> lVar) {
        return mVar.u(new b(z15, lVar));
    }

    public static /* synthetic */ f3.m d(f3.m mVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return c(mVar, z15, lVar);
    }
}
