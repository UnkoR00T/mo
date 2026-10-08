package t3;

import androidx.compose.ui.graphics.Color;
import c5.s;
import c5.t;
import n3.a1;
import n3.b2;
import n3.c2;
import n3.d2;
import n3.h1;
import n3.j1;
import n3.n1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lt3/a;", "", "<init>", "()V", "Lp3/f;", "Loq/i0;", "a", "(Lp3/f;)V", "Ln3/c2;", "config", "Lc5/r;", "size", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lkotlin/Function1;", "block", "b", "(IJLc5/d;Lc5/t;Ler/l;)V", "target", "", "alpha", "Ln3/n1;", "colorFilter", "c", "(Lp3/f;FLn3/n1;)V", "Ln3/b2;", "Ln3/b2;", "d", "()Ln3/b2;", "setMCachedImage", "(Ln3/b2;)V", "getMCachedImage$annotations", "mCachedImage", "Ln3/h1;", "Ln3/h1;", "cachedCanvas", "Lc5/d;", "scopeDensity", "Lc5/t;", "e", "J", "f", "I", "Lp3/a;", "g", "Lp3/a;", "cacheScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b2 mCachedImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private h1 cachedCanvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c5.d scopeDensity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long size = c5.r.INSTANCE.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int config = c2.INSTANCE.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p3.a cacheScope = new p3.a();

    private final void a(p3.f fVar) {
        p3.f.c2(fVar, Color.INSTANCE.a(), 0L, 0L, 0.0f, null, null, a1.INSTANCE.a(), 62, null);
    }

    public final void b(int config, long size, c5.d density, t layoutDirection, er.l<? super p3.f, i0> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        b2 b2VarB = this.mCachedImage;
        h1 h1VarA = this.cachedCanvas;
        if (b2VarB == null || h1VarA == null || ((int) (size >> 32)) > b2VarB.l() || ((int) (size & BodyPartID.bodyIdMax)) > b2VarB.getHeight() || !c2.i(this.config, config)) {
            b2VarB = d2.b((int) (size >> 32), (int) (BodyPartID.bodyIdMax & size), config, false, null, 24, null);
            h1VarA = j1.a(b2VarB);
            this.mCachedImage = b2VarB;
            this.cachedCanvas = h1VarA;
            this.config = config;
        }
        this.size = size;
        p3.a aVar = this.cacheScope;
        long jE = s.e(size);
        p3.a.DrawParams drawParams = aVar.getDrawParams();
        c5.d density2 = drawParams.getDensity();
        t layoutDirection2 = drawParams.getLayoutDirection();
        h1 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        p3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(density);
        drawParams2.k(layoutDirection);
        drawParams2.i(h1VarA);
        drawParams2.l(jE);
        h1VarA.q();
        a(aVar);
        block.b(aVar);
        h1VarA.j();
        p3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density2);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size2);
        b2VarB.a();
    }

    public final void c(p3.f target, float alpha, n1 colorFilter) {
        b2 b2Var = this.mCachedImage;
        if (!(b2Var != null)) {
            d4.a.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        p3.f.f0(target, b2Var, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b2 getMCachedImage() {
        return this.mCachedImage;
    }
}
