package p046f2;

import androidx.compose.ui.window.t;
import c5.n;
import c5.p;
import fr.k;
import lr.m;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J%\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0014J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0014J-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lf2/ir;", "Landroidx/compose/ui/window/t;", "Lf2/pq;", "type", "", "tooltipAnchorSpacing", "Lc5/r;", "windowContainerSize", "<init>", "(IIJLfr/k;)V", "Lc5/p;", "anchorBounds", "windowSize", "Lc5/t;", "layoutDirection", "popupContentSize", "Lc5/n;", "a", "(Lc5/p;JLc5/t;J)J", "f", "(Lc5/p;JJ)J", "g", "b", "c", "h", "(Lc5/t;Lc5/p;JJ)J", "d", "I", "e", "()I", "getTooltipAnchorSpacing", "J", "getWindowContainerSize-YbymL2g", "()J", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ir implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int tooltipAnchorSpacing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long windowContainerSize;

    public /* synthetic */ ir(int i15, int i16, long j15, k kVar) {
        this(i15, i16, j15);
    }

    @Override // androidx.compose.ui.window.t
    public long a(p anchorBounds, long windowSize, c5.t layoutDirection, long popupContentSize) {
        int i15 = this.type;
        pq.Companion companion = pq.INSTANCE;
        if (pq.h(i15, companion.d())) {
            return f(anchorBounds, popupContentSize, this.windowContainerSize);
        }
        if (pq.h(i15, companion.e())) {
            return g(anchorBounds, popupContentSize, this.windowContainerSize);
        }
        if (pq.h(i15, companion.a())) {
            return b(anchorBounds, popupContentSize, this.windowContainerSize);
        }
        if (pq.h(i15, companion.b())) {
            return c(anchorBounds, popupContentSize, this.windowContainerSize);
        }
        if (pq.h(i15, companion.f())) {
            return h(layoutDirection, anchorBounds, popupContentSize, this.windowContainerSize);
        }
        return pq.h(i15, companion.c()) ? d(layoutDirection, anchorBounds, popupContentSize, this.windowContainerSize) : b(anchorBounds, popupContentSize, this.windowContainerSize);
    }

    public final long b(p anchorBounds, long popupContentSize, long windowSize) {
        int i15 = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.k() - i15) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft() - m.e((anchorBounds.getLeft() + i15) - ((int) (windowSize >> 32)), 0);
        } else if (left + i15 > ((int) (windowSize >> 32))) {
            left = m.e(anchorBounds.getRight() - i15, 0);
        }
        int top = (anchorBounds.getTop() - ((int) (popupContentSize & BodyPartID.bodyIdMax))) - this.tooltipAnchorSpacing;
        if (top < 0) {
            top = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        }
        return n.d((((long) left) << 32) | (((long) top) & BodyPartID.bodyIdMax));
    }

    public final long c(p anchorBounds, long popupContentSize, long windowSize) {
        int i15 = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.k() - i15) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft() - m.e((anchorBounds.getLeft() + i15) - ((int) (windowSize >> 32)), 0);
        } else if (left + i15 > ((int) (windowSize >> 32))) {
            left = m.e(anchorBounds.getRight() - i15, 0);
        }
        int bottom = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        int i16 = (int) (popupContentSize & BodyPartID.bodyIdMax);
        if (bottom + i16 > ((int) (windowSize & BodyPartID.bodyIdMax))) {
            bottom = (anchorBounds.getTop() - i16) - this.tooltipAnchorSpacing;
        }
        return n.d((((long) left) << 32) | (((long) bottom) & BodyPartID.bodyIdMax));
    }

    public final long d(c5.t layoutDirection, p anchorBounds, long popupContentSize, long windowSize) {
        return layoutDirection == c5.t.Ltr ? g(anchorBounds, popupContentSize, windowSize) : f(anchorBounds, popupContentSize, windowSize);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final long f(p anchorBounds, long popupContentSize, long windowSize) {
        int i15 = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() - (this.tooltipAnchorSpacing + i15);
        if (left < 0) {
            left = (anchorBounds.getRight() + this.tooltipAnchorSpacing) - m.e(((anchorBounds.getRight() + this.tooltipAnchorSpacing) + i15) - ((int) (windowSize >> 32)), 0);
        }
        return n.d((((long) left) << 32) | (((long) (((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & BodyPartID.bodyIdMax))) / 2)) & BodyPartID.bodyIdMax));
    }

    public final long g(p anchorBounds, long popupContentSize, long windowSize) {
        int right = anchorBounds.getRight() + this.tooltipAnchorSpacing;
        int i15 = (int) (popupContentSize >> 32);
        if (right + i15 > ((int) (windowSize >> 32))) {
            right = m.e(anchorBounds.getLeft() - (i15 + this.tooltipAnchorSpacing), 0);
        }
        return n.d((((long) right) << 32) | (((long) (((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & BodyPartID.bodyIdMax))) / 2)) & BodyPartID.bodyIdMax));
    }

    public final long h(c5.t layoutDirection, p anchorBounds, long popupContentSize, long windowSize) {
        return layoutDirection == c5.t.Ltr ? f(anchorBounds, popupContentSize, windowSize) : g(anchorBounds, popupContentSize, windowSize);
    }

    private ir(int i15, int i16, long j15) {
        this.type = i15;
        this.tooltipAnchorSpacing = i16;
        this.windowContainerSize = j15;
    }
}
