package c40;

import b1.k;
import d1.a3;
import d1.h0;
import d1.i;
import d1.i0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.j;
import f3.m;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.v;
import p036e4.l;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.i1;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf3/m;", "modifier", "Lc40/a;", "data", "Loq/i0;", "i", "(Lf3/m;Lc40/a;Lm2/r;II)V", "Ld1/p3;", "g", "(Ld1/p3;Lc40/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void g(final p3 p3Var, final DocumentRowData documentRowData, r rVar, final int i15) {
        int i16;
        String str;
        String str2;
        r rVarH = rVar.h(1903955058);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(p3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(documentRowData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1903955058, i16, -1, "pl.gov.coi.common.ui.ds.custom.documentrow.SingleCardClickableContent (SingleCardDocumentRow.kt:92)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            m.Companion companion2 = m.INSTANCE;
            m mVarC = p3.c(p3Var, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
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
            i1.d(l4.g.b(t3.d.INSTANCE, documentRowData.getIconResId(), rVarH, 6), "", null, null, l.INSTANCE.a(), 0.0f, null, rVarH, 24624, 108);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing50());
            m mVarC2 = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(fVarR, companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarC2);
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
            i0 i0Var = i0.f39176a;
            String testTag = documentRowData.getTestTag();
            if (testTag != null) {
                str = testTag + "TitleText";
            } else {
                str = null;
            }
            j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), str, documentRowData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVarH, 6, 0, 0, 33030136);
            rVarH = rVarH;
            Label description = documentRowData.getDescription();
            if (description == null) {
                rVarH.X(2025981579);
            } else {
                rVarH.X(2025981580);
                String testTag2 = documentRowData.getTestTag();
                if (testTag2 != null) {
                    str2 = testTag2 + "DescriptionText";
                } else {
                    str2 = null;
                }
                j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), str2, description, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 6, 0, 0, 33030136);
                rVarH = rVarH;
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            rVarH.R();
            r50.a.WithIcon badgeData = documentRowData.getBadgeData();
            if (badgeData == null) {
                rVarH.X(2026265322);
            } else {
                rVarH.X(2026265323);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing25()), rVarH, 0);
                r50.e.f(badgeData, false, null, false, rVarH, 0, 14);
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVarH.R();
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
            d5VarM.a(new p() { // from class: c40.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.h(p3Var, documentRowData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(p3 p3Var, DocumentRowData documentRowData, int i15, r rVar, int i16) {
        g(p3Var, documentRowData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(m mVar, final DocumentRowData documentRowData, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        r rVarH = rVar.h(-1332744609);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(documentRowData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1332744609, i17, -1, "pl.gov.coi.common.ui.ds.custom.documentrow.SingleCardDocumentRow (SingleCardDocumentRow.kt:48)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            b1.l lVar = (b1.l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            y2 radius200 = aVar2.e(rVarH, i19).getRadius200();
            int i25 = i17 & 112;
            boolean z15 = i25 == 32;
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: c40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.j(documentRowData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarA = k3.f.a(s.w(v.d(mVar3, false, (er.l) objE3, 1, null), f6VarA, aVar2.b(rVarH, i19).getSpacing200(), 0.0f, 4, null), radius200);
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            boolean zG = rVarH.G(aVar) | (i25 == 32);
            Object objE4 = rVarH.E();
            if (zG || objE4 == companion.a()) {
                objE4 = new er.a() { // from class: c40.c
                    @Override // er.a
                    public final Object a() {
                        return h.k(aVar, documentRowData);
                    }
                };
                rVarH.v(objE4);
            }
            m mVar4 = mVar3;
            c2.c(androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, false, null, null, (er.a) objE4, 28, null), radius200, y1.f58315a.b(aVar2.a(rVarH, i19).getSurface().a(), 0L, 0L, 0L, rVarH, y1.f58316b << 12, 14), null, null, y2.m.d(-1500731475, true, new q() { // from class: c40.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.m(documentRowData, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 24);
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar4;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: c40.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.n(mVar2, documentRowData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(DocumentRowData documentRowData, n4.i0 i0Var) {
        String testTag = documentRowData.getTestTag();
        if (testTag == null) {
            testTag = documentRowData.getTitle().getTag();
        }
        f0.y0(i0Var, testTag);
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(cx.a aVar, final DocumentRowData documentRowData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: c40.f
            @Override // er.a
            public final Object a() {
                return h.l(documentRowData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(DocumentRowData documentRowData) {
        documentRowData.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(DocumentRowData documentRowData, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1500731475, i15, -1, "pl.gov.coi.common.ui.ds.custom.documentrow.SingleCardDocumentRow.<anonymous> (SingleCardDocumentRow.kt:72)");
            }
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.b(companion, 0.0f, n50.h0.a0(), 1, null), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarN = a3.n(mVarH, aVar.b(rVar, i16).getSpacing250());
            w0 w0VarB = m3.b(i.f39152a.j(), interfaceC1317cI, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            g(q3.f39261a, documentRowData, rVar, 6);
            d40.h.f(a3.r(companion, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), documentRowData.getTrailingIcon(), false, rVar, 0, 4);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(m mVar, DocumentRowData documentRowData, int i15, int i16, r rVar, int i17) {
        i(mVar, documentRowData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
