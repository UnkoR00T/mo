package androidx.p016lifecycle;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/s0;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/g;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/g;)V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "a", "Landroidx/lifecycle/g;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g generatedAdapter;

    public s0(g gVar) {
        this.generatedAdapter = gVar;
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        this.generatedAdapter.a(source, event, false, null);
        this.generatedAdapter.a(source, event, true, null);
    }
}
