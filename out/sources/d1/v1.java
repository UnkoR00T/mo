package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ld1/v1;", "Ld1/r1;", "Lg4/z;", "Ld1/c4;", "insets", "<init>", "(Ld1/c4;)V", "ancestorConsumedInsets", "p3", "(Ld1/c4;)Ld1/c4;", "Loq/i0;", "s3", "()V", "z3", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "t", "Ld1/c4;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class v1 extends r1 implements g4.z {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private c4 insets;

    public v1(c4 c4Var) {
        this.insets = c4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y3(p036e4.a2 a2Var, int i15, int i16, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, i15, i16, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        final int iC = getConsumedInsets().c(y0Var, y0Var.getLayoutDirection()) - getAncestorConsumedInsets().c(y0Var, y0Var.getLayoutDirection());
        final int iB = getConsumedInsets().b(y0Var) - getAncestorConsumedInsets().b(y0Var);
        int iD = (getConsumedInsets().d(y0Var, y0Var.getLayoutDirection()) - getAncestorConsumedInsets().d(y0Var, y0Var.getLayoutDirection())) + iC;
        int iA = (getConsumedInsets().a(y0Var) - getAncestorConsumedInsets().a(y0Var)) + iB;
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.i(j15, -iD, -iA));
        return p036e4.y0.j2(y0Var, c5.c.g(j15, a2VarO0.getWidth() + iD), c5.c.f(j15, a2VarO0.getHeight() + iA), null, new er.l() { // from class: d1.u1
            @Override // er.l
            public final Object b(Object obj) {
                return v1.y3(a2VarO0, iC, iB, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    @Override // d1.r1
    public c4 p3(c4 ancestorConsumedInsets) {
        return f4.i(ancestorConsumedInsets, this.insets);
    }

    @Override // d1.r1
    public void s3() {
        super.s3();
        g4.b0.b(this);
    }

    public final void z3(c4 insets) {
        if (fr.t.c(insets, this.insets)) {
            return;
        }
        this.insets = insets;
        s3();
    }
}
