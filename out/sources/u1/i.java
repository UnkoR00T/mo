package u1;

import d1.x;
import er.p;
import er.s;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.b0;
import p036e4.l1;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0010\u001a\u00020\u000f2$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "modifier", "Lm2/b4;", "Lu1/k;", "providableCompositionLocal", "Lkotlin/Function3;", "Lq1/g;", "Lu1/j;", "Lkotlin/Function0;", "Le4/b0;", "Loq/i0;", "contextMenu", "content", "f", "(Lf3/m;Lm2/b4;Ler/s;Ler/p;Lm2/r;I)V", "Lu1/c;", "m", "(Ler/s;Lm2/r;I)Lu1/c;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u1/i$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f194101a;

        public a(c cVar) {
            this.f194101a = cVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f194101a.h();
        }
    }

    public static final void f(final f3.m mVar, final b4<k> b4Var, final s<? super q1.g, ? super j, ? super er.a<? extends b0>, ? super r, ? super Integer, i0> sVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-714464401);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(b4Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(sVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-714464401, i16, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = x5.i(null, x5.k());
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            final c cVarM = m(sVar, rVarH, (i16 >> 6) & 14);
            d0.c(b4Var.d(cVarM), y2.m.d(274270255, true, new p() { // from class: u1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(mVar, a3Var, pVar, cVarM, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: u1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(mVar, b4Var, sVar, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final b0 g(a3<b0> a3Var) {
        return a3Var.getValue();
    }

    private static final void h(a3<b0> a3Var, b0 b0Var) {
        a3Var.setValue(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f3.m mVar, final a3 a3Var, p pVar, c cVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(274270255, i15, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
            }
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: u1.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.j(a3Var, (b0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = l1.a(mVar, (er.l) objE);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: u1.h
                    @Override // er.a
                    public final Object a() {
                        return i.k(a3Var);
                    }
                };
                rVar.v(objE2);
            }
            cVar.d((er.a) objE2, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a3 a3Var, b0 b0Var) {
        h(a3Var, b0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 k(a3 a3Var) {
        b0 b0VarG = g(a3Var);
        if (b0VarG != null) {
            return b0VarG;
        }
        c1.e.d("Required value was null.");
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f3.m mVar, b4 b4Var, s sVar, p pVar, int i15, r rVar, int i16) {
        f(mVar, b4Var, sVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final c m(s<? super q1.g, ? super j, ? super er.a<? extends b0>, ? super r, ? super Integer, i0> sVar, r rVar, int i15) {
        if (t.k()) {
            t.o(100861460, i15, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(sVar)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            objE = new c(sVar);
            rVar.v(objE);
        }
        final c cVar = (c) objE;
        boolean zW = rVar.W(cVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: u1.d
                @Override // er.l
                public final Object b(Object obj) {
                    return i.n(cVar, (s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(cVar, (er.l) objE2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 n(c cVar, s0 s0Var) {
        return new a(cVar);
    }
}
