package g1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Lg1/n0;", "", "", "index", "", "Lg1/l0;", "items", "Lg1/v0;", "slots", "", "Lg1/c;", "spans", "", "isVertical", "mainAxisSpacing", "<init>", "(I[Lg1/l0;Lg1/v0;Ljava/util/List;ZI)V", "e", "()Z", "offset", "layoutWidth", "layoutHeight", "f", "(III)[Lg1/l0;", "a", "I", "()I", "b", "[Lg1/l0;", "()[Lg1/l0;", "c", "Lg1/v0;", "d", "Ljava/util/List;", "Z", "g", "mainAxisSize", "h", "mainAxisSizeWithSpacings", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0[] items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v0 slots;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<c> spans;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    public n0(int i15, l0[] l0VarArr, v0 v0Var, List<c> list, boolean z15, int i16) {
        this.index = i15;
        this.items = l0VarArr;
        this.slots = v0Var;
        this.spans = list;
        this.isVertical = z15;
        this.mainAxisSpacing = i16;
        int iMax = 0;
        for (l0 l0Var : l0VarArr) {
            iMax = Math.max(iMax, l0Var.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = lr.m.e(iMax + this.mainAxisSpacing, 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l0[] getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    public final l0[] f(int offset, int layoutWidth, int layoutHeight) {
        l0[] l0VarArr = this.items;
        int length = l0VarArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            l0 l0Var = l0VarArr[i15];
            int i18 = i16 + 1;
            int iD = c.d(this.spans.get(i16).getPackedValue());
            int i19 = this.slots.getPositions()[i17];
            boolean z15 = this.isVertical;
            l0Var.u(offset, i19, layoutWidth, layoutHeight, z15 ? this.index : i17, z15 ? i17 : this.index);
            oq.i0 i0Var = oq.i0.f148189a;
            i17 += iD;
            i15++;
            i16 = i18;
        }
        return this.items;
    }
}
