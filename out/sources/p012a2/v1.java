package p012a2;

import c5.b;
import c5.r;
import er.l;
import er.p;
import f3.m;
import g4.z;
import hr.a;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRF\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"La2/v1;", "T", "Lf3/m$c;", "Lg4/z;", "La2/i;", "state", "Lkotlin/Function2;", "Lc5/r;", "Lc5/b;", "Loq/r;", "La2/r1;", "anchors", "Lz0/a2;", "orientation", "<init>", "(La2/i;Ler/p;Lz0/a2;)V", "Loq/i0;", "X2", "()V", "Le4/y0;", "Le4/v0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "La2/i;", "getState", "()La2/i;", "r3", "(La2/i;)V", "s", "Ler/p;", "getAnchors", "()Ler/p;", "p3", "(Ler/p;)V", "t", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "q3", "(Lz0/a2;)V", "", "v", "Z", "didLookahead", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class v1<T> extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private i<T> state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super b, ? extends oq.r<? extends r1<T>, ? extends T>> anchors;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean didLookahead;

    public v1(i<T> iVar, p<? super r, ? super b, ? extends oq.r<? extends r1<T>, ? extends T>> pVar, a2 a2Var) {
        this.state = iVar;
        this.anchors = pVar;
        this.orientation = a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(y0 y0Var, v1 v1Var, p036e4.a2 a2Var, e4.a2.a aVar) {
        float fC = y0Var.J0() ? v1Var.state.p().c(v1Var.state.y()) : v1Var.state.C();
        a2 a2Var2 = v1Var.orientation;
        float f15 = a2Var2 == a2.Horizontal ? fC : 0.0f;
        if (a2Var2 != a2.Vertical) {
            fC = 0.0f;
        }
        e4.a2.a.E(aVar, a2Var, a.d(f15), a.d(fC), 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // f3.m.c
    public void X2() {
        this.didLookahead = false;
    }

    @Override // g4.z
    public x0 c(final y0 y0Var, v0 v0Var, long j15) {
        final p036e4.a2 a2VarO0 = v0Var.o0(j15);
        if (!y0Var.J0() || !this.didLookahead) {
            oq.r<? extends r1<T>, ? extends T> rVarB = this.anchors.B(r.b(r.c((((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax) | (((long) a2VarO0.getWidth()) << 32))), b.a(j15));
            this.state.M(rVarB.c(), rVarB.d());
        }
        this.didLookahead = y0Var.J0() || this.didLookahead;
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new l() { // from class: a2.u1
            @Override // er.l
            public final Object b(Object obj) {
                return v1.o3(y0Var, this, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void p3(p<? super r, ? super b, ? extends oq.r<? extends r1<T>, ? extends T>> pVar) {
        this.anchors = pVar;
    }

    public final void q3(a2 a2Var) {
        this.orientation = a2Var;
    }

    public final void r3(i<T> iVar) {
        this.state = iVar;
    }
}
