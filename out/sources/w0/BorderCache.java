package w0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: w0.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lw0/l;", "", "Ln3/b2;", "imageBitmap", "Ln3/h1;", "canvas", "Lp3/a;", "canvasDrawScope", "Ln3/m2;", "borderPath", "<init>", "(Ln3/b2;Ln3/h1;Lp3/a;Ln3/m2;)V", "g", "()Ln3/m2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln3/b2;", "b", "Ln3/h1;", "c", "Lp3/a;", "d", "Ln3/m2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BorderCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private n3.b2 imageBitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private n3.h1 canvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private p3.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private n3.m2 borderPath;

    public BorderCache(n3.b2 b2Var, n3.h1 h1Var, p3.a aVar, n3.m2 m2Var) {
        this.imageBitmap = b2Var;
        this.canvas = h1Var;
        this.canvasDrawScope = aVar;
        this.borderPath = m2Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return fr.t.c(this.imageBitmap, borderCache.imageBitmap) && fr.t.c(this.canvas, borderCache.canvas) && fr.t.c(this.canvasDrawScope, borderCache.canvasDrawScope) && fr.t.c(this.borderPath, borderCache.borderPath);
    }

    public final n3.m2 g() {
        n3.m2 m2Var = this.borderPath;
        if (m2Var != null) {
            return m2Var;
        }
        n3.m2 m2VarA = n3.u0.a();
        this.borderPath = m2VarA;
        return m2VarA;
    }

    public int hashCode() {
        n3.b2 b2Var = this.imageBitmap;
        int iHashCode = (b2Var == null ? 0 : b2Var.hashCode()) * 31;
        n3.h1 h1Var = this.canvas;
        int iHashCode2 = (iHashCode + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        p3.a aVar = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        n3.m2 m2Var = this.borderPath;
        return iHashCode3 + (m2Var != null ? m2Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public /* synthetic */ BorderCache(n3.b2 b2Var, n3.h1 h1Var, p3.a aVar, n3.m2 m2Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : b2Var, (i15 & 2) != 0 ? null : h1Var, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? null : m2Var);
    }
}
