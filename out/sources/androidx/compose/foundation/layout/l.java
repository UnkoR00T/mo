package androidx.compose.foundation.layout;

import c5.n;
import c5.r;
import c5.t;
import d1.n0;
import er.p;
import f3.m;
import g4.z;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/l;", "Lg4/z;", "Lf3/m$c;", "Ld1/n0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lc5/r;", "Lc5/t;", "Lc5/n;", "alignmentCallback", "<init>", "(Ld1/n0;ZLer/p;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Ld1/n0;", "getDirection", "()Ld1/n0;", "q3", "(Ld1/n0;)V", "s", "Z", "getUnbounded", "()Z", "r3", "(Z)V", "t", "Ler/p;", "getAlignmentCallback", "()Ler/p;", "p3", "(Ler/p;)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private n0 direction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean unbounded;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super t, n> alignmentCallback;

    public l(n0 n0Var, boolean z15, p<? super r, ? super t, n> pVar) {
        this.direction = n0Var;
        this.unbounded = z15;
        this.alignmentCallback = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(l lVar, int i15, a2 a2Var, int i16, y0 y0Var, a2.a aVar) {
        a2.a.G(aVar, a2Var, lVar.alignmentCallback.B(r.b(r.c((((long) (i15 - a2Var.getWidth())) << 32) | (((long) (i16 - a2Var.getHeight())) & BodyPartID.bodyIdMax))), y0Var.getLayoutDirection()).getPackedValue(), 0.0f, 2, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public x0 c(final y0 y0Var, v0 v0Var, long j15) {
        n0 n0Var = this.direction;
        n0 n0Var2 = n0.Vertical;
        int iN = n0Var != n0Var2 ? 0 : c5.b.n(j15);
        n0 n0Var3 = this.direction;
        n0 n0Var4 = n0.Horizontal;
        final a2 a2VarO0 = v0Var.o0(c5.c.a(iN, (this.direction == n0Var2 || !this.unbounded) ? c5.b.l(j15) : Integer.MAX_VALUE, n0Var3 == n0Var4 ? c5.b.m(j15) : 0, (this.direction == n0Var4 || !this.unbounded) ? c5.b.k(j15) : Integer.MAX_VALUE));
        final int iN2 = lr.m.n(a2VarO0.getWidth(), c5.b.n(j15), c5.b.l(j15));
        final int iN3 = lr.m.n(a2VarO0.getHeight(), c5.b.m(j15), c5.b.k(j15));
        return y0.j2(y0Var, iN2, iN3, null, new er.l() { // from class: androidx.compose.foundation.layout.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o3(this.f9693a, iN2, a2VarO0, iN3, y0Var, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(p<? super r, ? super t, n> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void q3(n0 n0Var) {
        this.direction = n0Var;
    }

    public final void r3(boolean z15) {
        this.unbounded = z15;
    }
}
