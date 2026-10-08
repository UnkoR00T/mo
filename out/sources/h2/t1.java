package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lh2/t1;", "Lf3/m$c;", "Lg4/q1;", "Lg4/i1;", "Lkotlin/Function1;", "Ln4/i0;", "Loq/i0;", "properties", "<init>", "(Ler/l;)V", "E2", "(Ln4/i0;)V", "n3", "o3", "()V", "r", "Ler/l;", "getProperties", "()Ler/l;", "p3", "", "s", "Z", "semanticsConsumed", "", "t", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "traverseKey", "F2", "()Z", "shouldMergeDescendantSemantics", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t1 extends f3.m.c implements g4.q1, g4.i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super n4.i0, oq.i0> properties;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean semanticsConsumed;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = v1.f79999a;

    public t1(er.l<? super n4.i0, oq.i0> lVar) {
        this.properties = lVar;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        if (this.semanticsConsumed) {
            return;
        }
        this.properties.b(i0Var);
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: F2 */
    public boolean getMergeDescendants() {
        return true;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void n3(n4.i0 i0Var) {
        this.semanticsConsumed = true;
        this.properties.b(i0Var);
        g4.j1.d(this);
    }

    public final void o3() {
        this.semanticsConsumed = false;
        g4.j1.d(this);
    }

    public final void p3(er.l<? super n4.i0, oq.i0> lVar) {
        this.properties = lVar;
    }
}
