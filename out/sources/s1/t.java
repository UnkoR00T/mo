package s1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.l1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "content", "h", "(Lf3/m;Ler/p;Lm2/r;II)V", "Lkotlin/Function1;", "Ls1/s0;", "callbackInjector", "g", "(Lf3/m;Ler/l;Ler/p;Lm2/r;II)V", "Le4/b0;", "coordinatesProvider", "Lu1/k;", "p", "(Ler/a;Ler/l;Lm2/r;II)Lu1/k;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"s1/t$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f177377a;

        public a(k kVar) {
            this.f177377a = kVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f177377a.w();
        }
    }

    public static final void g(final f3.m mVar, final er.l<? super s0, ? extends s0> lVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(771959668);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(771959668, i17, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:84)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = x5.i(null, x5.k());
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: s1.p
                    @Override // er.a
                    public final Object a() {
                        return t.l(a3Var);
                    }
                };
                rVarH.v(objE2);
            }
            p076m2.d0.c(u1.n.f().d(p((er.a) objE2, lVar, rVarH, (i17 & 112) | 6, 0)), y2.m.d(-291176396, true, new er.p() { // from class: s1.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.m(mVar, a3Var, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        final f3.m mVar2 = mVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.o(mVar2, lVar, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void h(final f3.m mVar, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2;
        p076m2.r rVarH = rVar.h(2064964257);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2064964257, i17, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:67)");
            }
            int i19 = (i17 & 14) | 48 | ((i17 << 3) & 896);
            f3.m mVar2 = mVar;
            pVar2 = pVar;
            g(mVar2, null, pVar2, rVarH, i19, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar = mVar2;
        } else {
            pVar2 = pVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.i(mVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(f3.m mVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        h(mVar, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final p036e4.b0 j(a3<p036e4.b0> a3Var) {
        return a3Var.getValue();
    }

    private static final void k(a3<p036e4.b0> a3Var, p036e4.b0 b0Var) {
        a3Var.setValue(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.b0 l(a3 a3Var) {
        p036e4.b0 b0VarJ = j(a3Var);
        if (b0VarJ != null) {
            return b0VarJ;
        }
        c1.e.d("Required value was null.");
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f3.m mVar, final a3 a3Var, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-291176396, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar.<anonymous> (AndroidTextContextMenuToolbarProvider.android.kt:98)");
            }
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: s1.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.n(a3Var, (p036e4.b0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = l1.a(mVar, (er.l) objE);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(a3 a3Var, p036e4.b0 b0Var) {
        k(a3Var, b0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(f3.m mVar, er.l lVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        g(mVar, lVar, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final u1.k p(er.a<? extends p036e4.b0> aVar, er.l<? super s0, ? extends s0> lVar, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(549805508, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.platformTextContextMenuToolbarProvider (AndroidTextContextMenuToolbarProvider.android.kt:111)");
        }
        View view = (View) rVar.N(AndroidCompositionLocals_androidKt.g());
        boolean zW = rVar.W(view);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new k(view, lVar, aVar);
            rVar.v(objE);
        }
        final k kVar = (k) objE;
        boolean zG = rVar.G(kVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: s1.o
                @Override // er.l
                public final Object b(Object obj) {
                    return t.q(kVar, (p076m2.s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(kVar, (er.l) objE2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 q(k kVar, p076m2.s0 s0Var) {
        kVar.H();
        return new a(kVar);
    }
}
