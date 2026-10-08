package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Ld1/t2;", "Lg4/z;", "Lf3/m$c;", "Lkotlin/Function1;", "Lc5/d;", "Lc5/n;", "offset", "", "rtlAware", "<init>", "(Ler/l;Z)V", "Loq/i0;", "p3", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Ler/l;", "getOffset", "()Ler/l;", "setOffset", "(Ler/l;)V", "s", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "t", "R2", "shouldAutoInvalidate", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t2 extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c5.d, c5.n> offset;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public t2(er.l<? super c5.d, c5.n> lVar, boolean z15) {
        this.offset = lVar;
        this.rtlAware = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o3(t2 t2Var, p036e4.a2 a2Var, e4.a2.a aVar) {
        long packedValue = t2Var.offset.b(aVar).getPackedValue();
        if (t2Var.rtlAware) {
            e4.a2.a.R(aVar, a2Var, c5.n.i(packedValue), c5.n.j(packedValue), 0.0f, null, 12, null);
        } else {
            e4.a2.a.d0(aVar, a2Var, c5.n.i(packedValue), c5.n.j(packedValue), 0.0f, null, 12, null);
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
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: d1.s2
            @Override // er.l
            public final Object b(Object obj) {
                return t2.o3(this.f39288a, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(er.l<? super c5.d, c5.n> offset, boolean rtlAware) {
        if (this.offset != offset || this.rtlAware != rtlAware) {
            g4.b0.c(this);
        }
        this.offset = offset;
        this.rtlAware = rtlAware;
    }
}
