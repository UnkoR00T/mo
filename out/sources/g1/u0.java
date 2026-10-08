package g1;

import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lg1/u0;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "Loq/i0;", "g", "Lg1/k0;", "measureResult", "h", "(Lg1/k0;)V", "i", "(I)V", "d", "Lg1/o;", "itemProvider", "j", "(Lg1/o;I)I", "<set-?>", "a", "Lm2/y2;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lh1/f1;", "Lh1/f1;", "()Lh1/f1;", "nearestRangeState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2 index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y2 scrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p056h1.f1 nearestRangeState;

    public u0(int i15, int i16) {
        this.index = m5.a(i15);
        this.scrollOffset = m5.a(i16);
        this.nearestRangeState = new p056h1.f1(i15, 90, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    }

    private final void e(int i15) {
        this.index.g(i15);
    }

    private final void f(int i15) {
        this.scrollOffset.g(i15);
    }

    private final void g(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            c1.e.a("Index should be non-negative");
        }
        e(index);
        this.nearestRangeState.t(index);
        f(scrollOffset);
    }

    public final int a() {
        return this.index.d();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p056h1.f1 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.d();
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void h(k0 measureResult) {
        l0[] items;
        l0 l0Var;
        l0[] items2;
        l0 l0Var2;
        n0 firstVisibleLine = measureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (l0Var2 = (l0) pq.n.p0(items2)) == null) ? null : l0Var2.getKey();
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = measureResult.getFirstVisibleLineScrollOffset();
            int index = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                c1.e.c("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')');
            }
            n0 firstVisibleLine2 = measureResult.getFirstVisibleLine();
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (l0Var = (l0) pq.n.p0(items)) != null) {
                index = l0Var.getIndex();
            }
            g(index, firstVisibleLineScrollOffset);
        }
    }

    public final void i(int scrollOffset) {
        if (!(((float) scrollOffset) >= 0.0f)) {
            c1.e.c("scrollOffset should be non-negative");
        }
        f(scrollOffset);
    }

    public final int j(o itemProvider, int index) {
        int iA = p056h1.p0.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iA) {
            e(iA);
            this.nearestRangeState.t(index);
        }
        return iA;
    }
}
