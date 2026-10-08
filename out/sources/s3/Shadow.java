package s3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import fr.k;
import fr.t;
import lr.m;
import n3.a1;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s3.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b(\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006-"}, d2 = {"Ls3/g;", "", "Lc5/h;", "radius", "spread", "Lc5/j;", "offset", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "Ln3/a1;", "blendMode", "<init>", "(FFJJLandroidx/compose/ui/graphics/c;FILfr/k;)V", "(FJFJFILfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "()Ls3/g;", "i", "F", "g", "()F", "b", "h", "c", "J", "f", "()J", "d", "I", "e", "Landroidx/compose/ui/graphics/c;", "()Landroidx/compose/ui/graphics/c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float radius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spread;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int blendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.c brush;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    public /* synthetic */ Shadow(float f15, float f16, long j15, long j16, androidx.compose.ui.graphics.c cVar, float f17, int i15, k kVar) {
        this(f15, f16, j15, j16, cVar, f17, i15);
    }

    public final Shadow a() {
        return new Shadow(this.radius, this.spread, c5.j.INSTANCE.a(), this.color, this.brush, this.alpha, this.blendMode, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.compose.ui.graphics.c getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return c5.h.p(this.radius, shadow.radius) && c5.h.p(this.spread, shadow.spread) && c5.j.e(this.offset, shadow.offset) && this.alpha == shadow.alpha && a1.E(this.blendMode, shadow.blendMode) && Color.m11equalsimpl0(this.color, shadow.color) && t.c(this.brush, shadow.brush);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSpread() {
        return this.spread;
    }

    public int hashCode() {
        int iQ = ((((((((((c5.h.q(this.radius) * 31) + c5.h.q(this.spread)) * 31) + c5.j.h(this.offset)) * 31) + Float.hashCode(this.alpha)) * 31) + a1.F(this.blendMode)) * 31) + Color.m17hashCodeimpl(this.color)) * 31;
        androidx.compose.ui.graphics.c cVar = this.brush;
        return iQ + (cVar != null ? cVar.hashCode() : 0);
    }

    public final Shadow i() {
        return new Shadow(this.radius, Color.INSTANCE.g(), this.spread, this.offset, this.alpha, this.blendMode, (k) null);
    }

    public String toString() {
        return "Shadow(radius=" + ((Object) c5.h.r(this.radius)) + ", spread=" + ((Object) c5.h.r(this.spread)) + ", offset=" + ((Object) c5.j.i(this.offset)) + ", alpha=" + this.alpha + ", blendMode=" + ((Object) a1.G(this.blendMode)) + ", color=" + ((Object) Color.m18toStringimpl(this.color)) + ", brush=" + this.brush + ')';
    }

    public /* synthetic */ Shadow(float f15, long j15, float f16, long j16, float f17, int i15, k kVar) {
        this(f15, j15, f16, j16, f17, i15);
    }

    private Shadow(float f15, float f16, long j15, long j16, androidx.compose.ui.graphics.c cVar, float f17, int i15) {
        this.radius = f15;
        this.spread = f16;
        this.offset = j15;
        this.blendMode = i15;
        if (cVar instanceof SolidColor) {
            this.color = ((SolidColor) cVar).getValue();
            this.brush = null;
        } else {
            this.color = j16;
            this.brush = cVar;
        }
        this.alpha = m.m(f17, 0.0f, 1.0f);
    }

    private Shadow(float f15, long j15, float f16, long j16, float f17, int i15) {
        this(f15, f16, j16, j15 != 16 ? j15 : Color.INSTANCE.a(), null, f17, i15, null);
    }
}
