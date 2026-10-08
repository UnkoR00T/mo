package w0;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lw0/h;", "Lg4/l0;", "Lw0/k;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "Ln3/y2;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "<init>", "(JLandroidx/compose/ui/graphics/c;FLn3/y2;Ler/l;Lfr/k;)V", "a", "()Lw0/k;", "node", "l", "(Lw0/k;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "J", "e", "Landroidx/compose/ui/graphics/c;", "f", "F", "g", "Ln3/y2;", "h", "Ler/l;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends g4.l0<k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.c brush;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n3.y2 shape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final er.l<androidx.compose.ui.platform.v1, oq.i0> inspectorInfo;

    public /* synthetic */ h(long j15, androidx.compose.ui.graphics.c cVar, float f15, n3.y2 y2Var, er.l lVar, fr.k kVar) {
        this(j15, cVar, f15, y2Var, lVar);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k create() {
        return new k(this.color, this.brush, this.alpha, this.shape, null);
    }

    public boolean equals(Object other) {
        h hVar = other instanceof h ? (h) other : null;
        return hVar != null && Color.m11equalsimpl0(this.color, hVar.color) && fr.t.c(this.brush, hVar.brush) && this.alpha == hVar.alpha && fr.t.c(this.shape, hVar.shape);
    }

    public int hashCode() {
        int iM17hashCodeimpl = Color.m17hashCodeimpl(this.color) * 31;
        androidx.compose.ui.graphics.c cVar = this.brush;
        return ((((iM17hashCodeimpl + (cVar != null ? cVar.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(k node) {
        node.u3(this.color);
        node.t3(this.brush);
        node.g(this.alpha);
        if (!fr.t.c(node.getShape(), this.shape)) {
            node.k0(this.shape);
            g4.j1.d(node);
        }
        g4.r.a(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(long j15, androidx.compose.ui.graphics.c cVar, float f15, n3.y2 y2Var, er.l<? super androidx.compose.ui.platform.v1, oq.i0> lVar) {
        this.color = j15;
        this.brush = cVar;
        this.alpha = f15;
        this.shape = y2Var;
        this.inspectorInfo = lVar;
    }

    public /* synthetic */ h(long j15, androidx.compose.ui.graphics.c cVar, float f15, n3.y2 y2Var, er.l lVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? Color.INSTANCE.h() : j15, (i15 & 2) != 0 ? null : cVar, f15, y2Var, lVar, null);
    }
}
