package s1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R$\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ls1/l0;", "Landroidx/compose/ui/window/t;", "popupPositionProvider", "<init>", "(Landroidx/compose/ui/window/t;)V", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "Lc5/t;", "layoutDirection", "popupContentSize", "Lc5/n;", "a", "(Lc5/p;JLc5/t;J)J", "Landroidx/compose/ui/window/t;", "getPopupPositionProvider", "()Landroidx/compose/ui/window/t;", "b", "Lc5/r;", "getPreviousWindowSize-bOM6tXw", "()Lc5/r;", "setPreviousWindowSize-fhxjrPA", "(Lc5/r;)V", "previousWindowSize", "c", "Lc5/t;", "getPreviousLayoutDirection", "()Lc5/t;", "setPreviousLayoutDirection", "(Lc5/t;)V", "previousLayoutDirection", "d", "getPreviousPopupContentSize-bOM6tXw", "setPreviousPopupContentSize-fhxjrPA", "previousPopupContentSize", "e", "Lc5/n;", "getPreviousPosition-JyOPPKE", "()Lc5/n;", "setPreviousPosition-fg0MpWk", "(Lc5/n;)V", "previousPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l0 implements androidx.compose.ui.window.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.window.t popupPositionProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c5.r previousWindowSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c5.t previousLayoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private c5.r previousPopupContentSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private c5.n previousPosition;

    public l0(androidx.compose.ui.window.t tVar) {
        this.popupPositionProvider = tVar;
    }

    @Override // androidx.compose.ui.window.t
    public long a(c5.p anchorBounds, long windowSize, c5.t layoutDirection, long popupContentSize) {
        c5.n nVar = this.previousPosition;
        if (nVar != null) {
            c5.r rVar = this.previousWindowSize;
            if ((rVar == null ? false : c5.r.e(rVar.getPackedValue(), windowSize)) && this.previousLayoutDirection == layoutDirection) {
                c5.r rVar2 = this.previousPopupContentSize;
                if (rVar2 != null ? c5.r.e(rVar2.getPackedValue(), popupContentSize) : false) {
                    return nVar.getPackedValue();
                }
            }
        }
        long jA = this.popupPositionProvider.a(anchorBounds, windowSize, layoutDirection, popupContentSize);
        this.previousWindowSize = c5.r.b(windowSize);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = c5.r.b(popupContentSize);
        this.previousPosition = c5.n.c(jA);
        return jA;
    }
}
