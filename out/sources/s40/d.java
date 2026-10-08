package s40;

import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d40.h;
import er.l;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt40/a$b;", "data", "Loq/i0;", "f", "(Lt40/a$b;Lm2/r;I)V", "Lt40/a$a;", "d", "(Lt40/a$a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final t40.a.C4874a c4874a, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1475154621);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(c4874a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1475154621, i16, -1, "pl.gov.coi.common.ui.ds.inforow.BulletInfoRow (InfoRow.kt:53)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            h.f(null, c4874a.getIcon(), false, rVarH, 0, 5);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, c4874a.getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: s40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(c4874a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(t40.a.C4874a c4874a, int i15, r rVar, int i16) {
        d(c4874a, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final t40.a.b bVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1251165087);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(bVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1251165087, i16, -1, "pl.gov.coi.common.ui.ds.inforow.DefaultInfoRow (InfoRow.kt:21)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: s40.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.g(bVar, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarC = v.c(mVarH, true, (l) objE);
            i iVar = i.f39152a;
            i.e eVarJ = iVar.j();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(eVarJ, companion2.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            h.f(null, bVar.getIcon(), false, rVarH, 0, 5);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, companion);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            j70.h.g(null, null, bVar.getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, true, null, rVar2, 0, 0, 3072, 24641499);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing50()), rVar2, 0);
            j70.h.g(null, null, bVar.getDescription(), bVar.getDescription(), null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, true, null, rVar2, 0, 0, 3072, 24641491);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: s40.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(bVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(t40.a.b bVar, n4.i0 i0Var) {
        f0.c0(i0Var, bVar.getTitle().getText() + Label.INSTANCE.d().getText() + bVar.getDescription().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(t40.a.b bVar, int i15, r rVar, int i16) {
        f(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
