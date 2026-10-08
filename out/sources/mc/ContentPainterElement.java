package mc;

import coil3.compose.AsyncImagePainter;
import fr.t;
import g4.b0;
import g4.j1;
import g4.l0;
import g4.r;
import kc.s;
import n3.n1;
import n3.v1;
import oq.i0;
import p071kotlin.Metadata;
import zc.ImageRequest;

/* JADX INFO: renamed from: mc.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lmc/d;", "Lg4/l0;", "Lmc/e;", "Lzc/f;", "request", "Lkc/s;", "imageLoader", "Llc/b;", "modelEqualityDelegate", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$State;", "transform", "Loq/i0;", "onState", "Ln3/v1;", "filterQuality", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "", "clipToBounds", "Lcoil3/compose/c;", "previewHandler", "", "contentDescription", "<init>", "(Lzc/f;Lkc/s;Llc/b;Ler/l;Ler/l;ILf3/c;Le4/l;FLn3/n1;ZLcoil3/compose/c;Ljava/lang/String;Lfr/k;)V", "a", "()Lmc/e;", "node", "l", "(Lmc/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lzc/f;", "e", "Lkc/s;", "f", "Llc/b;", "g", "Ler/l;", "h", "i", "I", "j", "Lf3/c;", "k", "Le4/l;", "F", "m", "Ln3/n1;", "n", "Z", "o", "Lcoil3/compose/c;", "p", "Ljava/lang/String;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContentPainterElement extends l0<e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImageRequest request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s imageLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.b modelEqualityDelegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<AsyncImagePainter.State, AsyncImagePainter.State> transform;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<AsyncImagePainter.State, i0> onState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int filterQuality;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.c alignment;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final p036e4.l contentScale;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final n1 colorFilter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clipToBounds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final coil3.compose.c previewHandler;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contentDescription;

    public /* synthetic */ ContentPainterElement(ImageRequest imageRequest, s sVar, lc.b bVar, er.l lVar, er.l lVar2, int i15, f3.c cVar, p036e4.l lVar3, float f15, n1 n1Var, boolean z15, coil3.compose.c cVar2, String str, fr.k kVar) {
        this(imageRequest, sVar, bVar, lVar, lVar2, i15, cVar, lVar3, f15, n1Var, z15, cVar2, str);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e create() {
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(input);
        asyncImagePainter.L(this.transform);
        asyncImagePainter.G(this.onState);
        asyncImagePainter.D(this.contentScale);
        asyncImagePainter.F(this.filterQuality);
        asyncImagePainter.I(this.previewHandler);
        asyncImagePainter.M(input);
        ad.i sizeResolver = this.request.getSizeResolver();
        return new e(asyncImagePainter, this.alignment, this.contentScale, this.alpha, this.colorFilter, this.clipToBounds, this.contentDescription, sizeResolver instanceof lc.e ? (lc.e) sizeResolver : null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) other;
        return t.c(this.request, contentPainterElement.request) && t.c(this.imageLoader, contentPainterElement.imageLoader) && t.c(this.modelEqualityDelegate, contentPainterElement.modelEqualityDelegate) && t.c(this.transform, contentPainterElement.transform) && t.c(this.onState, contentPainterElement.onState) && v1.d(this.filterQuality, contentPainterElement.filterQuality) && t.c(this.alignment, contentPainterElement.alignment) && t.c(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && t.c(this.colorFilter, contentPainterElement.colorFilter) && this.clipToBounds == contentPainterElement.clipToBounds && t.c(this.previewHandler, contentPainterElement.previewHandler) && t.c(this.contentDescription, contentPainterElement.contentDescription);
    }

    public int hashCode() {
        int iHashCode = ((((((this.request.hashCode() * 31) + this.imageLoader.hashCode()) * 31) + this.modelEqualityDelegate.hashCode()) * 31) + this.transform.hashCode()) * 31;
        er.l<AsyncImagePainter.State, i0> lVar = this.onState;
        int iHashCode2 = (((((((((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + v1.e(this.filterQuality)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        n1 n1Var = this.colorFilter;
        int iHashCode3 = (((iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31) + Boolean.hashCode(this.clipToBounds)) * 31;
        coil3.compose.c cVar = this.previewHandler;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.contentDescription;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(e node) {
        long intrinsicSize = node.r3().getIntrinsicSize();
        lc.e constraintSizeResolver = node.getConstraintSizeResolver();
        AsyncImagePainter.Input input = new AsyncImagePainter.Input(this.imageLoader, this.request, this.modelEqualityDelegate);
        AsyncImagePainter asyncImagePainterR3 = node.r3();
        asyncImagePainterR3.L(this.transform);
        asyncImagePainterR3.G(this.onState);
        asyncImagePainterR3.D(this.contentScale);
        asyncImagePainterR3.F(this.filterQuality);
        asyncImagePainterR3.I(this.previewHandler);
        asyncImagePainterR3.M(input);
        boolean zF = m3.k.f(intrinsicSize, asyncImagePainterR3.getIntrinsicSize());
        node.u3(this.alignment);
        ad.i sizeResolver = this.request.getSizeResolver();
        node.w3(sizeResolver instanceof lc.e ? (lc.e) sizeResolver : null);
        node.y3(this.contentScale);
        node.g(this.alpha);
        node.d(this.colorFilter);
        node.v3(this.clipToBounds);
        if (!t.c(node.getContentDescription(), this.contentDescription)) {
            node.x3(this.contentDescription);
            j1.d(node);
        }
        boolean zC = t.c(constraintSizeResolver, node.getConstraintSizeResolver());
        if (!zF || !zC) {
            b0.b(node);
        }
        r.a(node);
    }

    public String toString() {
        return "ContentPainterElement(request=" + this.request + ", imageLoader=" + this.imageLoader + ", modelEqualityDelegate=" + this.modelEqualityDelegate + ", transform=" + this.transform + ", onState=" + this.onState + ", filterQuality=" + v1.f(this.filterQuality) + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ", previewHandler=" + this.previewHandler + ", contentDescription=" + this.contentDescription + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ContentPainterElement(ImageRequest imageRequest, s sVar, lc.b bVar, er.l<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> lVar, er.l<? super AsyncImagePainter.State, i0> lVar2, int i15, f3.c cVar, p036e4.l lVar3, float f15, n1 n1Var, boolean z15, coil3.compose.c cVar2, String str) {
        this.request = imageRequest;
        this.imageLoader = sVar;
        this.modelEqualityDelegate = bVar;
        this.transform = lVar;
        this.onState = lVar2;
        this.filterQuality = i15;
        this.alignment = cVar;
        this.contentScale = lVar3;
        this.alpha = f15;
        this.colorFilter = n1Var;
        this.clipToBounds = z15;
        this.previewHandler = cVar2;
        this.contentDescription = str;
    }
}
