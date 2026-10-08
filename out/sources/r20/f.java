package r20;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.a3;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.m;
import n3.y2;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p046f2.c2;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import s20.DocumentIconWithStatusData;
import s20.DocumentRefreshCardData;
import t70.s;
import w0.i1;
import w0.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Ls20/b;", "documentRefreshCardData", "Loq/i0;", "d", "(Lf3/m;Ls20/b;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void d(m mVar, final DocumentRefreshCardData documentRefreshCardData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        r rVarH = rVar.h(-1636221447);
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
            i17 |= (i15 & 64) == 0 ? rVarH.W(documentRefreshCardData) : rVarH.G(documentRefreshCardData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1636221447, i17, -1, "pl.gov.coi.common.ui.document.documentsrefresh.DocumentsRefreshCardBig (DocumentsRefreshCardBig.kt:53)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar = (l) objE;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            long jM20unboximpl = documentRefreshCardData.getDocumentRefreshCardResources().b().B(rVarH, 0).m20unboximpl();
            m mVarB = d1.k.b(androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null), 1.5384616f, false, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarP = androidx.compose.foundation.b.p(s.w(mVarB, f6VarA, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 4, null), lVar, null, false, null, null, null, null, documentRefreshCardData.g(), false, documentRefreshCardData.f(), 380, null);
            boolean z15 = (i17 & 112) == 32 || ((i17 & 64) != 0 && rVarH.G(documentRefreshCardData));
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: r20.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.e(documentRefreshCardData, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarD = v.d(mVarP, false, (er.l) objE2, 1, null);
            y2 radius200 = aVar.e(rVarH, i19).getRadius200();
            float fN = c5.h.n((float) 0.5d);
            Color colorM0boximpl = Color.m0boximpl(jM20unboximpl);
            Color color = Color.m12getAlphaimpl(colorM0boximpl.m20unboximpl()) < 0.8f ? colorM0boximpl : null;
            c2.c(mVarD, radius200, null, null, x.a(fN, color != null ? color.m20unboximpl() : Color.m9copywmQWz5c$default(jM20unboximpl, 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), y2.m.d(-497084249, true, new q() { // from class: r20.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.f(documentRefreshCardData, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 12);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: r20.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(mVar3, documentRefreshCardData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(DocumentRefreshCardData documentRefreshCardData, i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, documentRefreshCardData.getTestTag());
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(DocumentRefreshCardData documentRefreshCardData, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-497084249, i15, -1, "pl.gov.coi.common.ui.document.documentsrefresh.DocumentsRefreshCardBig.<anonymous>.<anonymous> (DocumentsRefreshCardBig.kt:83)");
            }
            m.Companion companion = m.INSTANCE;
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            i1.c(l4.c.c(documentRefreshCardData.getDocumentRefreshCardResources().getBackgroundBigResId(), rVar, 0), null, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, p036e4.l.INSTANCE.b(), 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 25008, 104);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarB = androidx.compose.foundation.layout.d.b(a3.q(companion, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing150(), aVar.b(rVar, i16).getSpacing200()), 0.0f, c5.h.n(48), 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), companion2.i(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(p3.c(q3.f39261a, companion, 1.0f, false, 2, null), null, documentRefreshCardData.getTitle(), null, null, documentRefreshCardData.j().B(rVar, 0).m20unboximpl(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 2, 0, null, aVar.f(rVar, i16).p(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948186);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            b.b(new DocumentIconWithStatusData(documentRefreshCardData.getDocumentRefreshCardResources().getCardLogoResId(), documentRefreshCardData.getLogoContentDescription(), documentRefreshCardData.getDocumentStatusIconData()), rVar, 0);
            rVar.x();
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
    public static final oq.i0 g(m mVar, DocumentRefreshCardData documentRefreshCardData, int i15, int i16, r rVar, int i17) {
        d(mVar, documentRefreshCardData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
