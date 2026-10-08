package n4;

import android.graphics.Region;
import n3.s2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln4/o;", "Ln4/j0;", "<init>", "()V", "Lc5/p;", "rect", "Loq/i0;", "b", "(Lc5/p;)V", "region", "", "a", "(Ln4/j0;)Z", "c", "(Lc5/p;)Z", "Landroid/graphics/Region;", "Landroid/graphics/Region;", "getRegion", "()Landroid/graphics/Region;", "getBounds", "()Lc5/p;", "bounds", "isEmpty", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Region region = new Region();

    @Override // n4.j0
    public boolean a(j0 region) {
        return this.region.op(((o) region).region, Region.Op.INTERSECT);
    }

    @Override // n4.j0
    public void b(c5.p rect) {
        this.region.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @Override // n4.j0
    public boolean c(c5.p rect) {
        return this.region.op(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), Region.Op.DIFFERENCE);
    }

    @Override // n4.j0
    public c5.p getBounds() {
        return s2.d(this.region.getBounds());
    }

    @Override // n4.j0
    public boolean isEmpty() {
        return this.region.isEmpty();
    }
}
