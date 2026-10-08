package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld1/o;", "Lg4/d1;", "Lf3/m$c;", "Lf3/c;", "alignment", "", "matchParentSize", "<init>", "(Lf3/c;Z)V", "Lc5/d;", "", "parentData", "p3", "(Lc5/d;Ljava/lang/Object;)Ld1/o;", "r", "Lf3/c;", "n3", "()Lf3/c;", "q3", "(Lf3/c;)V", "s", "Z", "o3", "()Z", "r3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o extends f3.m.c implements g4.d1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private f3.c alignment;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean matchParentSize;

    public o(f3.c cVar, boolean z15) {
        this.alignment = cVar;
        this.matchParentSize = z15;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final f3.c getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // g4.d1
    /* JADX INFO: renamed from: p3, reason: merged with bridge method [inline-methods] */
    public o n(c5.d dVar, Object obj) {
        return this;
    }

    public final void q3(f3.c cVar) {
        this.alignment = cVar;
    }

    public final void r3(boolean z15) {
        this.matchParentSize = z15;
    }
}
