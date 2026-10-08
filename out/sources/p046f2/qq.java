package p046f2;

import c5.d;
import c5.t;
import n3.g2;
import n3.i2;
import n3.m2;
import n3.q2;
import n3.u0;
import n3.y2;
import oq.p;
import p071kotlin.Metadata;
import p076m2.a3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\"\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lf2/qq;", "Ln3/y2;", "Lm2/a3;", "Ln3/g2;", "transformationMatrix", "tooltipShape", "caretShape", "<init>", "(Lm2/a3;Ln3/y2;Ln3/y2;)V", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2;", "a", "(JLc5/t;Lc5/d;)Ln3/i2;", "b", "Lm2/a3;", "c", "Ln3/y2;", "d", "Ln3/m2;", "e", "Ln3/m2;", "getTooltipPath", "()Ln3/m2;", "tooltipPath", "f", "getCombinedPath", "combinedPath", "g", "getCaretPath", "caretPath", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qq implements y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3<g2> transformationMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y2 tooltipShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y2 caretShape;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m2 tooltipPath = u0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m2 combinedPath = u0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m2 caretPath = u0.a();

    public qq(a3<g2> a3Var, y2 y2Var, y2 y2Var2) {
        this.transformationMatrix = a3Var;
        this.tooltipShape = y2Var;
        this.caretShape = y2Var2;
    }

    @Override // n3.y2
    public i2 a(long size, t layoutDirection, d density) {
        this.tooltipPath.reset();
        this.combinedPath.reset();
        this.caretPath.reset();
        i2 i2VarA = this.tooltipShape.a(size, layoutDirection, density);
        i2 i2VarA2 = this.caretShape.a(size, layoutDirection, density);
        if (i2VarA instanceof i2.a) {
            m2.g(this.tooltipPath, ((i2.a) i2VarA).getPath(), 0L, 2, null);
        } else if (i2VarA instanceof i2.c) {
            m2.o(this.tooltipPath, ((i2.c) i2VarA).getRoundRect(), null, 2, null);
        } else {
            if (!(i2VarA instanceof i2.b)) {
                throw new p();
            }
            m2.r(this.tooltipPath, ((i2.b) i2VarA).b(), null, 2, null);
        }
        if (i2VarA2 instanceof i2.a) {
            m2.g(this.caretPath, ((i2.a) i2VarA2).getPath(), 0L, 2, null);
        } else if (i2VarA2 instanceof i2.c) {
            m2.o(this.caretPath, ((i2.c) i2VarA2).getRoundRect(), null, 2, null);
        } else {
            if (!(i2VarA2 instanceof i2.b)) {
                throw new p();
            }
            m2.r(this.caretPath, ((i2.b) i2VarA2).b(), null, 2, null);
        }
        this.caretPath.b(this.transformationMatrix.getValue().getValues());
        this.combinedPath.e(this.tooltipPath, this.caretPath, q2.INSTANCE.d());
        return new i2.a(this.combinedPath);
    }
}
