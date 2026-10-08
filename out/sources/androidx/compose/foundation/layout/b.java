package androidx.compose.foundation.layout;

import d1.n0;
import f3.m;
import g4.z;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/b;", "Lg4/z;", "Lf3/m$c;", "Ld1/n0;", "direction", "", "fraction", "<init>", "(Ld1/n0;F)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Ld1/n0;", "getDirection", "()Ld1/n0;", "p3", "(Ld1/n0;)V", "s", "F", "getFraction", "()F", "q3", "(F)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private n0 direction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    public b(n0 n0Var, float f15) {
        this.direction = n0Var;
        this.fraction = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!c5.b.h(j15) || this.direction == n0.Vertical) {
            iN = c5.b.n(j15);
            iL = c5.b.l(j15);
        } else {
            int iRound = Math.round(c5.b.l(j15) * this.fraction);
            int iN2 = c5.b.n(j15);
            iN = c5.b.l(j15);
            if (iRound < iN2) {
                iRound = iN2;
            }
            if (iRound <= iN) {
                iN = iRound;
            }
            iL = iN;
        }
        if (!c5.b.g(j15) || this.direction == n0.Horizontal) {
            int iM = c5.b.m(j15);
            iK = c5.b.k(j15);
            iK2 = iM;
        } else {
            int iRound2 = Math.round(c5.b.k(j15) * this.fraction);
            int iM2 = c5.b.m(j15);
            iK2 = c5.b.k(j15);
            if (iRound2 < iM2) {
                iRound2 = iM2;
            }
            if (iRound2 <= iK2) {
                iK2 = iRound2;
            }
            iK = iK2;
        }
        final a2 a2VarO0 = v0Var.o0(c5.c.a(iN, iL, iK2, iK));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: androidx.compose.foundation.layout.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.o3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(n0 n0Var) {
        this.direction = n0Var;
    }

    public final void q3(float f15) {
        this.fraction = f15;
    }
}
