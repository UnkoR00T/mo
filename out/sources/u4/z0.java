package u4;

import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu4/z0;", "", "<init>", "()V", "Lu4/x0;", "typefaceRequest", "Lkotlin/Function1;", "Lu4/a1;", "Loq/i0;", "resolveTypeface", "Lm2/f6;", "b", "(Lu4/x0;Ler/l;)Lm2/f6;", "Ly4/t;", "a", "Ly4/t;", "getLock$ui_text", "()Ly4/t;", "lock", "Lr0/c0;", "Lr0/c0;", "resultCache", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y4.t lock = new y4.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0.c0<TypefaceRequest, a1> resultCache = new r0.c0<>(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(z0 z0Var, TypefaceRequest typefaceRequest, a1 a1Var) {
        synchronized (z0Var.lock) {
            try {
                if (a1Var.getCacheable()) {
                    z0Var.resultCache.e(typefaceRequest, a1Var);
                } else {
                    z0Var.resultCache.f(typefaceRequest);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return oq.i0.f148189a;
    }

    public final f6<Object> b(final TypefaceRequest typefaceRequest, er.l<? super er.l<? super a1, oq.i0>, ? extends a1> resolveTypeface) {
        synchronized (this.lock) {
            a1 a1VarD = this.resultCache.d(typefaceRequest);
            if (a1VarD != null) {
                if (a1VarD.getCacheable()) {
                    return a1VarD;
                }
                this.resultCache.f(typefaceRequest);
            }
            try {
                a1 a1VarB = resolveTypeface.b(new er.l() { // from class: u4.y0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z0.c(this.f195312a, typefaceRequest, (a1) obj);
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.d(typefaceRequest) == null && a1VarB.getCacheable()) {
                            this.resultCache.e(typefaceRequest, a1VarB);
                        }
                        oq.i0 i0Var = oq.i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return a1VarB;
            } catch (Exception e15) {
                throw new IllegalStateException("Could not load font", e15);
            }
        }
    }
}
