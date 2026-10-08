package z1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz1/t;", "Landroidx/compose/ui/window/t;", "Lf3/c;", "handleReferencePoint", "Lz1/w;", "positionProvider", "<init>", "(Lf3/c;Lz1/w;)V", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "Lc5/t;", "layoutDirection", "popupContentSize", "Lc5/n;", "a", "(Lc5/p;JLc5/t;J)J", "Lf3/c;", "b", "Lz1/w;", "Lm3/e;", "c", "J", "prevPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements androidx.compose.ui.window.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f3.c handleReferencePoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w positionProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long prevPosition = m3.e.INSTANCE.c();

    public t(f3.c cVar, w wVar) {
        this.handleReferencePoint = cVar;
        this.positionProvider = wVar;
    }

    @Override // androidx.compose.ui.window.t
    public long a(c5.p anchorBounds, long windowSize, c5.t layoutDirection, long popupContentSize) {
        long jA = this.positionProvider.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.prevPosition;
        }
        this.prevPosition = jA;
        return c5.n.m(c5.n.m(anchorBounds.j(), c5.o.d(jA)), this.handleReferencePoint.a(popupContentSize, c5.r.INSTANCE.a(), layoutDirection));
    }
}
