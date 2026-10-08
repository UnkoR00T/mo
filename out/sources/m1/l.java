package m1;

import g4.r1;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lm1/l;", "Lf3/m$c;", "Lg4/z;", "<init>", "()V", "Lm1/d;", "o3", "()Lm1/d;", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Loq/i0;", "W2", "Lm1/t;", "r", "Lm1/t;", "getOuterNode", "()Lm1/t;", "setOuterNode", "(Lm1/t;)V", "outerNode", "", "R2", "()Z", "shouldAutoInvalidate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private t outerNode;

    private final d o3() {
        return t.Y3(this.outerNode, 1, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p3(a2 a2Var, float f15, float f16, a2.a aVar) {
        a2.a.E(aVar, a2Var, Math.round(f15), Math.round(f16), 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // f3.m.c
    public void W2() {
        t tVar = (t) r1.a(this, "StyleOuterNode");
        tVar.g4(this);
        this.outerNode = tVar;
        tVar.b4(true);
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        d dVarO3 = o3();
        final float contentPaddingStart = dVarO3.getContentPaddingStart() + dVarO3.getBorderWidth();
        float contentPaddingEnd = dVarO3.getContentPaddingEnd() + dVarO3.getBorderWidth();
        final float contentPaddingTop = dVarO3.getContentPaddingTop() + dVarO3.getBorderWidth();
        float contentPaddingBottom = dVarO3.getContentPaddingBottom() + dVarO3.getBorderWidth();
        int iRound = Math.round(contentPaddingEnd + contentPaddingStart);
        int iRound2 = Math.round(contentPaddingBottom + contentPaddingTop);
        final a2 a2VarO0 = v0Var.o0(c5.c.i(j15, -iRound, -iRound2));
        return y0.j2(y0Var, c5.c.g(j15, a2VarO0.getWidth() + iRound), c5.c.f(j15, a2VarO0.getHeight() + iRound2), null, new er.l() { // from class: m1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.p3(a2VarO0, contentPaddingStart, contentPaddingTop, (a2.a) obj);
            }
        }, 4, null);
    }
}
