package h40;

import d1.a3;
import d1.m3;
import d1.q3;
import er.p;
import f3.m;
import g40.o;
import g40.q;
import java.time.LocalDate;
import mx.Label;
import n4.f0;
import n4.i0;
import n4.v;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.ia;
import p046f2.ja;
import p046f2.n8;
import p046f2.ob;
import p046f2.pi;
import p046f2.w4;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ae\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lmx/a;", "title", "Lfz/e$a;", "initialDateRange", "Lfz/b$i;", "initialDisplayedYearMonth", "Lf2/pi;", "selectableDates", "Lf2/w4;", "colors", "Lh40/k;", "headlineFormatter", "Lkotlin/Function1;", "Loq/i0;", "onSave", "Lkotlin/Function0;", "onClose", "n", "(Lmx/a;Lfz/e$a;Lfz/b$i;Lf2/pi;Lf2/w4;Lh40/k;Ler/l;Ler/a;Lm2/r;I)V", "Lf3/m;", "modifier", "Ljava/time/LocalDate;", "start", "end", "i", "(Lf3/m;Ljava/time/LocalDate;Ljava/time/LocalDate;Lh40/k;Lm2/r;II)V", AnnotatedPrivateKey.LABEL, "", "enabled", "l", "(Lmx/a;ZLm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void i(m mVar, final LocalDate localDate, final LocalDate localDate2, final k kVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        m mVar3;
        r rVarH = rVar.h(-1037144021);
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
            i17 |= rVarH.G(localDate) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(localDate2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1037144021, i17, -1, "pl.gov.coi.common.ui.ds.datepicker.range.Headline (RangeDatePickerDialog.kt:84)");
            }
            boolean zW = rVarH.W(localDate) | rVarH.W(localDate2);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = kVar.a(localDate, localDate2);
                rVarH.v(objE);
            }
            final FormattedRangePickerHeadline formattedRangePickerHeadline = (FormattedRangePickerHeadline) objE;
            boolean zW2 = rVarH.W(formattedRangePickerHeadline);
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: h40.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.j(formattedRangePickerHeadline, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarA = v.a(mVar3, (er.l) objE2);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarR = a3.r(mVarA, aVar.b(rVarH, i19).getSpacing300(), 0.0f, aVar.b(rVarH, i19).getSpacing150(), aVar.b(rVarH, i19).getSpacing100(), 2, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarR);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            l(formattedRangePickerHeadline.getStart(), localDate != null, rVarH, 0);
            l(formattedRangePickerHeadline.getSeparator(), localDate2 != null, rVarH, 0);
            l(formattedRangePickerHeadline.getEnd(), localDate2 != null, rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar4 = mVar3;
            d5VarM.a(new p() { // from class: h40.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(mVar4, localDate, localDate2, kVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(FormattedRangePickerHeadline formattedRangePickerHeadline, i0 i0Var) {
        f0.l0(i0Var, n4.i.INSTANCE.b());
        f0.c0(i0Var, formattedRangePickerHeadline.getContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(m mVar, LocalDate localDate, LocalDate localDate2, k kVar, int i15, int i16, r rVar, int i17) {
        i(mVar, localDate, localDate2, kVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void l(final Label label, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVar2;
        long jD;
        r rVarH = rVar.h(-1696085342);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1696085342, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.range.HeadlineText (RangeDatePickerDialog.kt:121)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleN = aVar.f(rVarH, i17).n();
            if (z15) {
                rVarH.X(-2145402420);
                jD = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            } else {
                rVarH.X(-2145401140);
                jD = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
            }
            rVarH.R();
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleN, null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030107);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h40.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(label, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Label label, boolean z15, int i15, r rVar, int i16) {
        l(label, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final Label label, final fz.e.LocalDate localDate, final fz.b.YearMonth yearMonth, final pi piVar, final w4 w4Var, final k kVar, final er.l<? super fz.e.LocalDate, oq.i0> lVar, final er.a<oq.i0> aVar, r rVar, final int i15) {
        int i16;
        pi piVar2;
        er.a<oq.i0> aVar2;
        r rVarH = rVar.h(675932841);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(localDate) : rVarH.G(localDate) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(yearMonth) : rVarH.G(yearMonth) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            piVar2 = piVar;
            i16 |= rVarH.W(piVar2) ? 2048 : 1024;
        } else {
            piVar2 = piVar;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(w4Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= (262144 & i15) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(lVar) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? 8388608 : 4194304;
        } else {
            aVar2 = aVar;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (t.k()) {
                t.o(675932841, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.range.RangeDatePickerDialog (RangeDatePickerDialog.kt:40)");
            }
            final ja jaVarH = n8.h(localDate != null ? localDate.getStart() : null, localDate != null ? localDate.getEnd() : null, yearMonth != null ? yearMonth.getYearMonth() : null, null, ob.INSTANCE.b(), piVar2, rVarH, (i16 << 6) & 458752, 8);
            boolean z15 = (jaVarH.k() == null || jaVarH.h() == null) ? false : true;
            boolean zW = rVarH.W(jaVarH) | ((3670016 & i16) == 1048576);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: h40.b
                    @Override // er.a
                    public final Object a() {
                        return j.o(jaVarH, lVar);
                    }
                };
                rVarH.v(objE);
            }
            boolean z16 = z15;
            o.e(w4Var, z16, aVar2, (er.a) objE, y2.m.d(-959219778, true, new p() { // from class: h40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(jaVarH, w4Var, label, kVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 12) & 14) | 24576 | ((i16 >> 15) & 896));
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.s(label, localDate, yearMonth, piVar, w4Var, kVar, lVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(ja jaVar, er.l lVar) {
        LocalDate localDateE = n8.e(jaVar);
        LocalDate localDateD = n8.d(jaVar);
        if (localDateE != null && localDateD != null) {
            lVar.b(new fz.e.LocalDate(localDateE, localDateD));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(final ja jaVar, w4 w4Var, final Label label, final k kVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-959219778, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.range.RangeDatePickerDialog.<anonymous> (RangeDatePickerDialog.kt:61)");
            }
            ia.A(jaVar, null, null, w4Var, y2.m.d(-1825482580, true, new p() { // from class: h40.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.q(label, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(-1901321141, true, new p() { // from class: h40.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.r(jaVar, kVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), true, null, rVar, 1794048, 134);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(Label label, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1825482580, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.range.RangeDatePickerDialog.<anonymous>.<anonymous> (RangeDatePickerDialog.kt:65)");
            }
            q.b(label, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(ja jaVar, k kVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1901321141, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.range.RangeDatePickerDialog.<anonymous>.<anonymous> (RangeDatePickerDialog.kt:67)");
            }
            i(null, n8.e(jaVar), n8.d(jaVar), kVar, rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Label label, fz.e.LocalDate localDate, fz.b.YearMonth yearMonth, pi piVar, w4 w4Var, k kVar, er.l lVar, er.a aVar, int i15, r rVar, int i16) {
        n(label, localDate, yearMonth, piVar, w4Var, kVar, lVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
