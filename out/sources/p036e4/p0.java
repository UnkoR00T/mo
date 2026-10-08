package p036e4;

import androidx.compose.ui.node.j;
import c5.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Le4/p0;", "Le4/a2$a;", "Landroidx/compose/ui/node/j;", "within", "<init>", "(Landroidx/compose/ui/node/j;)V", "Le4/i2;", "", "defaultValue", "i", "(Le4/i2;F)F", "b", "Landroidx/compose/ui/node/j;", "", "n", "()I", "parentWidth", "Lc5/t;", "k", "()Lc5/t;", "parentLayoutDirection", "Le4/b0;", "m", "()Le4/b0;", "coordinates", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p0 extends a2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j within;

    public p0(j jVar) {
        this.within = jVar;
    }

    @Override // e4.a2.a, c5.d
    public float getDensity() {
        return this.within.getDensity();
    }

    @Override // e4.a2.a
    public float i(i2 i2Var, float f15) {
        return i2Var.b() != null ? i2Var.b().B(this, Float.valueOf(f15)).floatValue() : this.within.C1(i2Var, f15);
    }

    @Override // e4.a2.a, c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.within.getFontScale();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: k */
    public t getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    @Override // e4.a2.a
    public b0 m() {
        b0 b0VarM = this.within.getIsPlacingForAlignment() ? null : this.within.m();
        if (b0VarM == null) {
            this.within.getLayoutNode().getLayoutDelegate().H();
        }
        return b0VarM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: n */
    public int getParentWidth() {
        return this.within.P0();
    }
}
