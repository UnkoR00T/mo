package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Ld1/q2;", "Lg4/z;", "Lf3/m$c;", "Lc5/h;", "x", "y", "", "rtlAware", "<init>", "(FFZLfr/k;)V", "Loq/i0;", "p3", "(FFZ)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "F", "getX-D9Ej5fM", "()F", "setX-0680j_4", "(F)V", "s", "getY-D9Ej5fM", "setY-0680j_4", "t", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "v", "R2", "shouldAutoInvalidate", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q2 extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public /* synthetic */ q2(float f15, float f16, boolean z15, fr.k kVar) {
        this(f15, f16, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o3(q2 q2Var, p036e4.a2 a2Var, e4.a2.a aVar) {
        if (q2Var.rtlAware) {
            e4.a2.a.I(aVar, a2Var, aVar.X0(q2Var.x), aVar.X0(q2Var.y), 0.0f, 4, null);
        } else {
            e4.a2.a.E(aVar, a2Var, aVar.X0(q2Var.x), aVar.X0(q2Var.y), 0.0f, 4, null);
        }
        return oq.i0.f148189a;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        final p036e4.a2 a2VarO0 = v0Var.o0(j15);
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: d1.p2
            @Override // er.l
            public final Object b(Object obj) {
                return q2.o3(this.f39250a, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(float x15, float y15, boolean rtlAware) {
        if (!c5.h.p(this.x, x15) || !c5.h.p(this.y, y15) || this.rtlAware != rtlAware) {
            g4.b0.c(this);
        }
        this.x = x15;
        this.y = y15;
        this.rtlAware = rtlAware;
    }

    private q2(float f15, float f16, boolean z15) {
        this.x = f15;
        this.y = f16;
        this.rtlAware = z15;
    }
}
