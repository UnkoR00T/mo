package p036e4;

import androidx.compose.ui.node.Owner;
import c5.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Le4/w1;", "Le4/a2$a;", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "b", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "", "n", "()I", "parentWidth", "Lc5/t;", "k", "()Lc5/t;", "parentLayoutDirection", "Le4/b0;", "m", "()Le4/b0;", "coordinates", "", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w1 extends a2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    public w1(Owner owner) {
        this.owner = owner;
    }

    @Override // e4.a2.a, c5.d
    public float getDensity() {
        return this.owner.getDensity().getDensity();
    }

    @Override // e4.a2.a, c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.owner.getDensity().getFontScale();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: k */
    public t getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    @Override // e4.a2.a
    public b0 m() {
        return this.owner.getRoot().y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: n */
    public int getParentWidth() {
        return this.owner.getRoot().I0();
    }
}
