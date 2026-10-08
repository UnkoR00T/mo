package f1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lf1/f1;", "Lg4/z;", "Lf3/m$c;", "", "fraction", "Lm2/f6;", "", "widthState", "heightState", "<init>", "(FLm2/f6;Lm2/f6;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "F", "getFraction", "()F", "p3", "(F)V", "s", "Lm2/f6;", "getWidthState", "()Lm2/f6;", "r3", "(Lm2/f6;)V", "t", "getHeightState", "q3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f1 extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f6<Integer> widthState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private f6<Integer> heightState;

    public f1(float f15, f6<Integer> f6Var, f6<Integer> f6Var2) {
        this.fraction = f15;
        this.widthState = f6Var;
        this.heightState = f6Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o3(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    @Override // g4.z
    public p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        f6<Integer> f6Var = this.widthState;
        int iRound = (f6Var == null || f6Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(f6Var.getValue().floatValue() * this.fraction);
        f6<Integer> f6Var2 = this.heightState;
        int iRound2 = (f6Var2 == null || f6Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(f6Var2.getValue().floatValue() * this.fraction);
        int iN = iRound != Integer.MAX_VALUE ? iRound : c5.b.n(j15);
        int iM = iRound2 != Integer.MAX_VALUE ? iRound2 : c5.b.m(j15);
        if (iRound == Integer.MAX_VALUE) {
            iRound = c5.b.l(j15);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = c5.b.k(j15);
        }
        final a2 a2VarO0 = v0Var.o0(c5.c.a(iN, iRound, iM, iRound2));
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: f1.e1
            @Override // er.l
            public final Object b(Object obj) {
                return f1.o3(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(float f15) {
        this.fraction = f15;
    }

    public final void q3(f6<Integer> f6Var) {
        this.heightState = f6Var;
    }

    public final void r3(f6<Integer> f6Var) {
        this.widthState = f6Var;
    }
}
