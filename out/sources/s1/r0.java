package s1;

import p036e4.l1;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "content", "m", "(Lf3/m;Ler/p;Lm2/r;II)V", "f", "(Lf3/m;Ler/p;Lm2/r;I)V", "Le4/b0;", "layoutCoordinates", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    private static final void f(final f3.m mVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(790527681);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(790527681, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders (PlatformDefaultTextContextMenuProviders.android.kt:58)");
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
                objE2 = new er.a() { // from class: s1.n0
                    @Override // er.a
                    public final Object a() {
                        return r0.i(a3Var);
                    }
                };
                rVarH.v(objE2);
            }
            final er.a aVar = (er.a) objE2;
            final u1.c cVarD = j0.D(rVarH, 0);
            p076m2.d0.d(new c4[]{u1.n.f().d(t.p(aVar, null, rVarH, 6, 2)), u1.n.e().d(cVarD)}, y2.m.d(1070596993, true, new er.p() { // from class: s1.o0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r0.j(mVar, a3Var, pVar, cVarD, aVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.p0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r0.l(mVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p036e4.b0 g(a3<p036e4.b0> a3Var) {
        return a3Var.getValue();
    }

    private static final void h(a3<p036e4.b0> a3Var, p036e4.b0 b0Var) {
        a3Var.setValue(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.b0 i(a3 a3Var) {
        p036e4.b0 b0VarG = g(a3Var);
        if (b0VarG != null) {
            return b0VarG;
        }
        c1.e.d("Required value was null.");
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(f3.m mVar, final a3 a3Var, er.p pVar, u1.c cVar, er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1070596993, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
            }
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: s1.q0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r0.k(a3Var, (p036e4.b0) obj);
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
            cVar.d(aVar, rVar, 6);
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
    public static final oq.i0 k(a3 a3Var, p036e4.b0 b0Var) {
        h(a3Var, b0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(f3.m mVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        f(mVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final f3.m mVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(155925518);
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
                p076m2.t.o(155925518, i17, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultPlatformTextContextMenuProviders (PlatformDefaultTextContextMenuProviders.android.kt:37)");
            }
            boolean z15 = rVarH.N(u1.n.e()) != null;
            boolean z16 = rVarH.N(u1.n.f()) != null;
            if (z15 && z16) {
                rVarH.X(-1977187922);
                p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVar);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.x xVar = d1.x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i17 >> 3) & 14));
                rVarH.x();
                rVarH.R();
            } else if (z15) {
                rVarH.X(-1976997706);
                t.h(mVar, pVar, rVarH, i17 & 126, 0);
                rVarH.R();
            } else if (z16) {
                rVarH.X(-1976846922);
                j0.z(mVar, pVar, rVarH, i17 & 126);
                rVarH.R();
            } else {
                rVarH.X(-1976716505);
                f(mVar, pVar, rVarH, i17 & 126);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.m0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r0.n(mVar, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(f3.m mVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        m(mVar, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
