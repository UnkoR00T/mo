package w0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: w0.v, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lw0/v;", "Lg4/l0;", "Lw0/u;", "Lc5/h;", "width", "Landroidx/compose/ui/graphics/c;", "brush", "Ln3/y2;", "shape", "<init>", "(FLandroidx/compose/ui/graphics/c;Ln3/y2;Lfr/k;)V", "a", "()Lw0/u;", "node", "Loq/i0;", "l", "(Lw0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "F", "getWidth-D9Ej5fM", "()F", "e", "Landroidx/compose/ui/graphics/c;", "getBrush", "()Landroidx/compose/ui/graphics/c;", "f", "Ln3/y2;", "getShape", "()Ln3/y2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends g4.l0<u> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.c brush;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final n3.y2 shape;

    public /* synthetic */ BorderModifierNodeElement(float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var, fr.k kVar) {
        this(f15, cVar, y2Var);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u create() {
        return new u(this.width, this.brush, this.shape, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return c5.h.p(this.width, borderModifierNodeElement.width) && fr.t.c(this.brush, borderModifierNodeElement.brush) && fr.t.c(this.shape, borderModifierNodeElement.shape);
    }

    public int hashCode() {
        return (((c5.h.q(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(u node) {
        node.G3(this.width);
        node.F3(this.brush);
        node.k0(this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) c5.h.r(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var) {
        this.width = f15;
        this.brush = cVar;
        this.shape = y2Var;
    }
}
