package n4;

import g4.i1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Ln4/f;", "Lf3/m$c;", "Lg4/i1;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Ln4/i0;", "Loq/i0;", "properties", "<init>", "(ZZLer/l;)V", "E2", "(Ln4/i0;)V", "r", "Z", "getMergeDescendants", "()Z", "n3", "(Z)V", "s", "setClearingSemantics", "t", "Ler/l;", "getProperties", "()Ler/l;", "o3", "(Ler/l;)V", "w0", "shouldClearDescendantSemantics", "F2", "shouldMergeDescendantSemantics", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f3.m.c implements i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mergeDescendants;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.l<? super i0, oq.i0> properties;

    public f(boolean z15, boolean z16, er.l<? super i0, oq.i0> lVar) {
        this.mergeDescendants = z15;
        this.isClearingSemantics = z16;
        this.properties = lVar;
    }

    @Override // g4.i1
    public void E2(i0 i0Var) {
        this.properties.b(i0Var);
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: F2, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final void n3(boolean z15) {
        this.mergeDescendants = z15;
    }

    public final void o3(er.l<? super i0, oq.i0> lVar) {
        this.properties = lVar;
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: w0, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }
}
