package p036e4;

import fu.r;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import r0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Le4/q2;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lr0/o;", "operations", "", "slotId", "", "cause", "<init>", "(Lr0/o;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "a", "()Ljava/util/List;", "Lr0/o;", "b", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q2 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o operations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object slotId;

    public q2(o oVar, Object obj, Throwable th4) {
        super(th4);
        this.operations = oVar;
        this.slotId = obj;
    }

    private final List<String> a() {
        String str;
        List listC = v.c();
        for (int i15 = this.operations._size - 1; i15 >= 0; i15 += -1) {
            int iE = this.operations.e(i15);
            int iS = l2.s(iE);
            l2.Companion companion = l2.INSTANCE;
            if (l2.t(iS, companion.b())) {
                str = "CancelPausedPrecomposition";
            } else if (l2.t(iS, companion.h())) {
                str = "ReuseForceSyncDeactivation";
            } else if (l2.t(iS, companion.i())) {
                str = "ReuseScheduleOutOfFrameDeactivation";
            } else if (l2.t(iS, companion.j())) {
                str = "ReuseSyncDeactivation";
            } else if (l2.t(iS, companion.g())) {
                str = "ReuseDeactivationViaHost";
            } else if (l2.t(iS, companion.r())) {
                str = "TookFromPrecomposeMap";
            } else if (l2.t(iS, companion.n())) {
                str = "Subcompose";
            } else if (l2.t(iS, companion.p())) {
                str = "SubcomposeNew";
            } else if (l2.t(iS, companion.q())) {
                str = "SubcomposePausable";
            } else if (l2.t(iS, companion.o())) {
                str = "SubcomposeForceReuse";
            } else if (l2.t(iS, companion.c())) {
                str = "DeactivateOutOfFrame";
            } else if (l2.t(iS, companion.d())) {
                str = "DeactivateOutOfFrameCancelled";
            } else if (l2.t(iS, companion.l())) {
                str = "SlotToReusedFromOnDeactivate";
            } else if (l2.t(iS, companion.m())) {
                str = "SlotToReusedFromOnReuse";
            } else if (l2.t(iS, companion.k())) {
                str = "Reused";
            } else if (l2.t(iS, companion.f())) {
                str = "ResumePaused";
            } else if (l2.t(iS, companion.e())) {
                str = "PausePaused";
            } else if (l2.t(iS, companion.a())) {
                str = "ApplyPaused";
            } else {
                str = "Unexpected " + iE;
            }
            listC.add(i15 + ": " + str);
        }
        return v.a(listC);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return r.p("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + v.v0(a(), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
