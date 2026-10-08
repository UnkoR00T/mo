package p076m2;

import p071kotlin.Metadata;
import r2.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lm2/j2;", "Lm2/v4;", "Lm2/u4;", "wrapped", "Lr2/i;", "after", "<init>", "(Lm2/u4;Lr2/i;)V", "a", "Lm2/u4;", "n", "()Lm2/u4;", "setWrapped", "(Lm2/u4;)V", "b", "Lr2/i;", "()Lr2/i;", "(Lr2/i;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j2 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private u4 wrapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i after;

    public j2(u4 u4Var, i iVar) {
        this.wrapped = u4Var;
        this.after = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getAfter() {
        return this.after;
    }

    public final void b(i iVar) {
        this.after = iVar;
    }

    @Override // p076m2.v4
    /* JADX INFO: renamed from: n, reason: from getter */
    public u4 getWrapped() {
        return this.wrapped;
    }
}
