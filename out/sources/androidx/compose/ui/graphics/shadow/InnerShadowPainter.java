package androidx.compose.ui.graphics.shadow;

import c5.t;
import lr.m;
import m3.k;
import n3.n1;
import n3.y2;
import p071kotlin.Metadata;
import p3.f;
import s3.Shadow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Landroidx/compose/ui/graphics/painter/a;", "Ln3/y2;", "shape", "Ls3/g;", "shadow", "Landroidx/compose/ui/graphics/shadow/b;", "renderCreator", "<init>", "(Ln3/y2;Ls3/g;Landroidx/compose/ui/graphics/shadow/b;)V", "(Ln3/y2;Ls3/g;)V", "Lp3/f;", "Loq/i0;", "n", "(Lp3/f;)V", "", "alpha", "", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "Lc5/t;", "layoutDirection", "f", "(Lc5/t;)Z", "h", "Ln3/y2;", "j", "Ls3/g;", "k", "Landroidx/compose/ui/graphics/shadow/b;", "l", "F", "m", "Lc5/t;", "Ln3/n1;", "Lm3/k;", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InnerShadowPainter extends androidx.compose.ui.graphics.painter.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y2 shape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final b renderCreator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    public InnerShadowPainter(y2 y2Var, Shadow gVar, b bVar) {
        this.shape = y2Var;
        this.shadow = gVar;
        this.renderCreator = bVar;
        this.alpha = 1.0f;
        this.layoutDirection = t.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean f(t layoutDirection) {
        this.layoutDirection = layoutDirection;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        return k.INSTANCE.a();
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        this.renderCreator.c(this.shape, fVar.a(), fVar.getLayoutDirection(), fVar, this.shadow).b(fVar, this.colorFilter, fVar.a(), this.shadow.getColor(), this.shadow.getBrush(), m.m(this.alpha * this.shadow.getAlpha(), 0.0f, 1.0f), this.shadow.getBlendMode());
    }

    public InnerShadowPainter(y2 y2Var, Shadow gVar) {
        this(y2Var, gVar, b.INSTANCE.a());
    }
}
