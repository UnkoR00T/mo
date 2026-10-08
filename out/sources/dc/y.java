package dc;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldc/y;", "Ljava/lang/Runnable;", "Lvb/s;", "processor", "Lvb/x;", "token", "", "stopInForeground", "", "reason", "<init>", "(Lvb/s;Lvb/x;ZI)V", "Loq/i0;", "run", "()V", "a", "Lvb/s;", "b", "Lvb/x;", "c", "Z", "d", "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vb.s processor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vb.x token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean stopInForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public y(vb.s sVar, vb.x xVar, boolean z15, int i15) {
        this.processor = sVar;
        this.token = xVar;
        this.stopInForeground = z15;
        this.reason = i15;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR = this.stopInForeground ? this.processor.r(this.token, this.reason) : this.processor.s(this.token, this.reason);
        ub.w.e().a(ub.w.i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zR);
    }
}
