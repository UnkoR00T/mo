package m4;

import c5.p;
import n4.w;
import p036e4.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m4.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lm4/i;", "", "Ln4/w;", "node", "", "depth", "Lc5/p;", "viewportBoundsInWindow", "Le4/b0;", "coordinates", "<init>", "(Ln4/w;ILc5/p;Le4/b0;)V", "", "toString", "()Ljava/lang/String;", "a", "Ln4/w;", "c", "()Ln4/w;", "b", "I", "()I", "Lc5/p;", "d", "()Lc5/p;", "Le4/b0;", "()Le4/b0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final w node;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int depth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p viewportBoundsInWindow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 coordinates;

    public ScrollCaptureCandidate(w wVar, int i15, p pVar, b0 b0Var) {
        this.node = wVar;
        this.depth = i15;
        this.viewportBoundsInWindow = pVar;
        this.coordinates = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final w getNode() {
        return this.node;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
