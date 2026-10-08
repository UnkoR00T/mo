package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ld1/c3;", "Lg4/z;", "Lf3/m$c;", "Lc5/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLfr/k;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "F", "getStart-D9Ej5fM", "()F", "s3", "(F)V", "s", "getTop-D9Ej5fM", "t3", "t", "getEnd-D9Ej5fM", "q3", "v", "getBottom-D9Ej5fM", "p3", "w", "Z", "getRtlAware", "()Z", "r3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c3 extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    public /* synthetic */ c3(float f15, float f16, float f17, float f18, boolean z15, fr.k kVar) {
        this(f15, f16, f17, f18, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o3(c3 c3Var, p036e4.a2 a2Var, e4.a2.a aVar) {
        if (c3Var.rtlAware) {
            e4.a2.a.I(aVar, a2Var, aVar.X0(c3Var.start), aVar.X0(c3Var.top), 0.0f, 4, null);
        } else {
            e4.a2.a.E(aVar, a2Var, aVar.X0(c3Var.start), aVar.X0(c3Var.top), 0.0f, 4, null);
        }
        return oq.i0.f148189a;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        int iX0 = y0Var.X0(this.start) + y0Var.X0(this.end);
        int iX1 = y0Var.X0(this.top) + y0Var.X0(this.bottom);
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.i(j15, -iX0, -iX1));
        return p036e4.y0.j2(y0Var, c5.c.g(j15, a2VarO0.getWidth() + iX0), c5.c.f(j15, a2VarO0.getHeight() + iX1), null, new er.l() { // from class: d1.b3
            @Override // er.l
            public final Object b(Object obj) {
                return c3.o3(this.f39029a, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(float f15) {
        this.bottom = f15;
    }

    public final void q3(float f15) {
        this.end = f15;
    }

    public final void r3(boolean z15) {
        this.rtlAware = z15;
    }

    public final void s3(float f15) {
        this.start = f15;
    }

    public final void t3(float f15) {
        this.top = f15;
    }

    private c3(float f15, float f16, float f17, float f18, boolean z15) {
        this.start = f15;
        this.top = f16;
        this.end = f17;
        this.bottom = f18;
        this.rtlAware = z15;
    }
}
