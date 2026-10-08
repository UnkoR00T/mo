package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Ld1/d;", "Lg4/z;", "Lf3/m$c;", "Le4/a;", "alignmentLine", "Lc5/h;", "before", "after", "<init>", "(Le4/a;FFLfr/k;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Le4/a;", "getAlignmentLine", "()Le4/a;", "o3", "(Le4/a;)V", "s", "F", "getBefore-D9Ej5fM", "()F", "p3", "(F)V", "t", "getAfter-D9Ej5fM", "n3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private p036e4.a alignmentLine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float before;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float after;

    public /* synthetic */ d(p036e4.a aVar, float f15, float f16, fr.k kVar) {
        this(aVar, f15, f16);
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        return b.c(y0Var, this.alignmentLine, this.before, this.after, v0Var, j15);
    }

    public final void n3(float f15) {
        this.after = f15;
    }

    public final void o3(p036e4.a aVar) {
        this.alignmentLine = aVar;
    }

    public final void p3(float f15) {
        this.before = f15;
    }

    private d(p036e4.a aVar, float f15, float f16) {
        this.alignmentLine = aVar;
        this.before = f15;
        this.after = f16;
    }
}
