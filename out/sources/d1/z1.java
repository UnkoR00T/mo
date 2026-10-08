package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Ld1/z1;", "Ld1/e2;", "Ld1/c2;", "height", "", "enforceIncoming", "<init>", "(Ld1/c2;Z)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "o3", "(Le4/y0;Le4/v0;J)J", "Le4/w;", "Le4/v;", "", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Le4/w;Le4/v;I)I", "O", "r", "Ld1/c2;", "getHeight", "()Ld1/c2;", "s3", "(Ld1/c2;)V", "s", "Z", "p3", "()Z", "r3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z1 extends e2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private c2 height;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public z1(c2 c2Var, boolean z15) {
        this.height = c2Var;
        this.enforceIncoming = z15;
    }

    @Override // d1.e2, g4.z
    public int H(p036e4.w wVar, p036e4.v vVar, int i15) {
        return this.height == c2.Min ? vVar.U(i15) : vVar.n(i15);
    }

    @Override // d1.e2, g4.z
    public int O(p036e4.w wVar, p036e4.v vVar, int i15) {
        return this.height == c2.Min ? vVar.U(i15) : vVar.n(i15);
    }

    @Override // d1.e2
    public long o3(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        int iU = this.height == c2.Min ? v0Var.U(c5.b.l(j15)) : v0Var.n(c5.b.l(j15));
        if (iU < 0) {
            iU = 0;
        }
        return c5.b.INSTANCE.d(iU);
    }

    @Override // d1.e2
    /* JADX INFO: renamed from: p3, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void r3(boolean z15) {
        this.enforceIncoming = z15;
    }

    public final void s3(c2 c2Var) {
        this.height = c2Var;
    }
}
