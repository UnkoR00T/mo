package p084np1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.r3;
import er.a;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import f30.BottomNavigationData;
import f30.BottomNavigationItem;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.g;
import pq.v;
import w0.i;

/* JADX INFO: renamed from: np1.i, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "i", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void i(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(353644237);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(353644237, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.bottomnavigation.DeveloperBottomNavigationScreen (DeveloperBottomNavigationScreen.kt:23)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            g.f153260a.o(b.b("DS5 Bottom Navigation (1.1)", ""), aVar, rVarH, ((i16 << 3) & 112) | (g.f153262c << 6));
            c.b bVarK = companion2.k();
            m mVarS = t70.i.S(a3.p(d.f(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
            a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            h.g(null, null, b.b("Bottom navigation", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            h.g(null, null, b.b("Komponent używany do realizacji nawigacji za pomocą dolnej belki.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("Bottom navigation z pięcioma elementami:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB = b.b("Start", "");
            int i18 = jz.a.R;
            int i19 = jz.a.f106869t1;
            Object objE = rVarH.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new a() { // from class: np1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.j();
                    }
                };
                rVarH.v(objE);
            }
            BottomNavigationItem bottomNavigationItem = new BottomNavigationItem(null, labelB, i18, i19, (a) objE, 1, null);
            Label labelB2 = b.b("Dokumenty", "");
            int i25 = jz.a.H0;
            int i26 = jz.a.f106876u1;
            Object objE2 = rVarH.E();
            if (objE2 == companion4.a()) {
                objE2 = new a() { // from class: np1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.k();
                    }
                };
                rVarH.v(objE2);
            }
            BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem(null, labelB2, i25, i26, (a) objE2, 1, null);
            Label labelB3 = b.b("Usługi", "");
            int i27 = jz.a.f106833o0;
            int i28 = jz.a.f106890w1;
            Object objE3 = rVarH.E();
            if (objE3 == companion4.a()) {
                objE3 = new a() { // from class: np1.c
                    @Override // er.a
                    public final Object a() {
                        return Function0.l();
                    }
                };
                rVarH.v(objE3);
            }
            BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem(null, labelB3, i27, i28, (a) objE3, 1, null);
            Label labelB4 = b.b("Kod QR", "");
            int i29 = jz.a.f106777g1;
            int i35 = jz.a.f106883v1;
            Object objE4 = rVarH.E();
            if (objE4 == companion4.a()) {
                objE4 = new a() { // from class: np1.d
                    @Override // er.a
                    public final Object a() {
                        return Function0.m();
                    }
                };
                rVarH.v(objE4);
            }
            BottomNavigationItem bottomNavigationItem4 = new BottomNavigationItem(null, labelB4, i29, i35, (a) objE4, 1, null);
            Label labelB5 = b.b("Więcej", "");
            int i36 = jz.a.Z;
            int i37 = jz.a.f106897x1;
            Object objE5 = rVarH.E();
            if (objE5 == companion4.a()) {
                objE5 = new a() { // from class: np1.e
                    @Override // er.a
                    public final Object a() {
                        return Function0.n();
                    }
                };
                rVarH.v(objE5);
            }
            BottomNavigationData bottomNavigationData = new BottomNavigationData(v.q(bottomNavigationItem, bottomNavigationItem2, bottomNavigationItem3, bottomNavigationItem4, new BottomNavigationItem(null, labelB5, i36, i37, (a) objE5, 1, null)), 0);
            int i38 = BottomNavigationData.f58833c;
            f30.j.h(bottomNavigationData, null, rVarH, i38, 2);
            h.g(null, null, b.b("Bottom navigation z dwoma elementami:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB6 = b.b("Start", "");
            int i39 = jz.a.R;
            int i45 = jz.a.f106869t1;
            Object objE6 = rVarH.E();
            if (objE6 == companion4.a()) {
                objE6 = new a() { // from class: np1.f
                    @Override // er.a
                    public final Object a() {
                        return Function0.o();
                    }
                };
                rVarH.v(objE6);
            }
            BottomNavigationItem bottomNavigationItem5 = new BottomNavigationItem(null, labelB6, i39, i45, (a) objE6, 1, null);
            Label labelB7 = b.b("Więcej", "");
            int i46 = jz.a.Z;
            int i47 = jz.a.f106897x1;
            Object objE7 = rVarH.E();
            if (objE7 == companion4.a()) {
                objE7 = new a() { // from class: np1.g
                    @Override // er.a
                    public final Object a() {
                        return Function0.p();
                    }
                };
                rVarH.v(objE7);
            }
            f30.j.h(new BottomNavigationData(v.q(bottomNavigationItem5, new BottomNavigationItem(null, labelB7, i46, i47, (a) objE7, 1, null)), 0), null, rVarH, i38, 2);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: np1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, int i15, r rVar, int i16) {
        i(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
