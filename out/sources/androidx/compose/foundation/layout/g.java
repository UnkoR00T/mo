package androidx.compose.foundation.layout;

import g4.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/g;", "Lg4/l0;", "Landroidx/compose/foundation/layout/i;", "Lc5/h;", "minWidth", "minHeight", "<init>", "(FFLfr/k;)V", "a", "()Landroidx/compose/foundation/layout/i;", "node", "Loq/i0;", "l", "(Landroidx/compose/foundation/layout/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "getMinWidth-D9Ej5fM", "()F", "e", "getMinHeight-D9Ej5fM", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g extends l0<i> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    public /* synthetic */ g(float f15, float f16, fr.k kVar) {
        this(f15, f16);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.minWidth, this.minHeight, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return c5.h.p(this.minWidth, gVar.minWidth) && c5.h.p(this.minHeight, gVar.minHeight);
    }

    public int hashCode() {
        return (c5.h.q(this.minWidth) * 31) + c5.h.q(this.minHeight);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(i node) {
        node.q3(this.minWidth);
        node.p3(this.minHeight);
    }

    private g(float f15, float f16) {
        this.minWidth = f15;
        this.minHeight = f16;
    }
}
