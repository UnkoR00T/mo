package ha4;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k40.EmptyStateData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lha4/e;", "viewModel", "Loq/i0;", "I", "(Lha4/e;Lm2/r;I)V", "Lha4/e$a;", "data", "w", "(Lha4/e$a;Lm2/r;I)V", "G", "(Lm2/r;I)V", "Lha4/e$a$a;", "y", "(Lha4/e$a$a;Lm2/r;I)V", "", "Lha4/b;", "items", "p", "(Ljava/util/List;Lm2/r;I)V", "Lha4/e$a$e;", "s", "(Lha4/e$a$e;Lm2/r;I)V", "Lha4/e$a$b;", ip.a.f96138c, "(Lha4/e$a$b;Lm2/r;I)V", "Lha4/e$a$c;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lha4/e$a$c;Lm2/r;I)V", "state", "schoolgrades_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f82739a;

        public a(List list) {
            this.f82739a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f82739a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f82740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f82741b;

        public b(List list, List list2) {
            this.f82740a = list;
            this.f82741b = list2;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            SemesterSheetItemData semesterSheetItemData = (SemesterSheetItemData) this.f82740a.get(i15);
            rVar.X(-755063648);
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarN = androidx.compose.foundation.b.n(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), false, null, null, null, semesterSheetItemData.a(), 15, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(a3.p(mVarN, 0.0f, aVar.b(rVar, i18).getSpacing300(), 1, null), null, semesterSheetItemData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            if (i15 != this.f82741b.size() - 1) {
                rVar.X(755666073);
                vb.h(null, aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 1);
            } else {
                rVar.X(750767453);
            }
            rVar.R();
            rVar.x();
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(final e.a.DisplayingSubjectList displayingSubjectList, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1466244998, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListDisplaying.<anonymous> (SubjectListScreen.kt:73)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            ButtonTextData changeSemesterButtonData = displayingSubjectList.getChangeSemesterButtonData();
            if (changeSemesterButtonData == null) {
                rVar2.X(-153875182);
                rVar2.R();
                i17 = 0;
            } else {
                rVar2.X(-153875181);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing100()), rVar2, 0);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                w0 w0VarB = m3.b(iVar.h(), companion2.i(), rVar2, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, mVarH);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                j70.h.g(p3.c(q3.f39261a, companion, 1.0f, false, 2, null), null, mx.b.b(displayingSubjectList.getData().d().getTitle(), "subjectList_semesterTitle"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVar2, i18).m(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948218);
                rVar2 = rVar;
                j30.f.e(null, changeSemesterButtonData, false, rVar2, ButtonTextData.f99099f << 3, 5);
                rVar2.x();
                companion = companion;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, i17);
            if (displayingSubjectList.getEmptyStateData() != null) {
                rVar2.X(-153038243);
                x30.c.c(null, 0.0f, y2.m.d(75670984, true, new er.p() { // from class: ha4.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.B(displayingSubjectList, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            } else {
                rVar2.X(-152937059);
                m30.i.d(displayingSubjectList.getSubjectListData(), null, null, rVar2, 0, 6);
                rVar.R();
            }
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
    public static final oq.i0 B(e.a.DisplayingSubjectList displayingSubjectList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(75670984, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListDisplaying.<anonymous>.<anonymous>.<anonymous> (SubjectListScreen.kt:101)");
            }
            k40.d.c(null, displayingSubjectList.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(e.a.DisplayingSubjectList displayingSubjectList, int i15, p076m2.r rVar, int i16) {
        y(displayingSubjectList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(final e.a.ErrorLoadingInitialData errorLoadingInitialData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(880264829);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(errorLoadingInitialData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(880264829, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListInitialError (SubjectListScreen.kt:163)");
            }
            errorLoadingInitialData.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ha4.s
                    @Override // er.a
                    public final Object a() {
                        return u.E();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.F(errorLoadingInitialData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(e.a.ErrorLoadingInitialData errorLoadingInitialData, int i15, p076m2.r rVar, int i16) {
        D(errorLoadingInitialData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void G(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-2089493881);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2089493881, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListLoading (SubjectListScreen.kt:60)");
            }
            c60.b.b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.H(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(int i15, p076m2.r rVar, int i16) {
        G(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void I(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-981038645);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-981038645, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListScreen (SubjectListScreen.kt:41)");
            }
            w(J(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.K(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a J(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(e eVar, int i15, p076m2.r rVar, int i16) {
        I(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final e.a.ErrorLoadingSemesterDetails errorLoadingSemesterDetails, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-761922867);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(errorLoadingSemesterDetails) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-761922867, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListSemesterError (SubjectListScreen.kt:173)");
            }
            errorLoadingSemesterDetails.getErrorVMS().b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.M(errorLoadingSemesterDetails, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(e.a.ErrorLoadingSemesterDetails errorLoadingSemesterDetails, int i15, p076m2.r rVar, int i16) {
        L(errorLoadingSemesterDetails, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final List<SemesterSheetItemData> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1829972052);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1829972052, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SemesterBottomSheetContent (SubjectListScreen.kt:115)");
            }
            boolean zG = rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ha4.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.q(list, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 511);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.r(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(List list, f1.q0 q0Var) {
        q0Var.j(list.size(), null, new a(list), y2.m.b(2039820996, true, new b(list, list)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(List list, int i15, p076m2.r rVar, int i16) {
        p(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final e.a.SubjectListEmptyState subjectListEmptyState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2047684327);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(subjectListEmptyState) : rVarH.G(subjectListEmptyState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2047684327, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectEmptyState (SubjectListScreen.kt:143)");
            }
            rVar2 = rVarH;
            i50.s.r(subjectListEmptyState.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1315869414, true, new er.q() { // from class: ha4.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.t(subjectListEmptyState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.v(subjectListEmptyState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(final e.a.SubjectListEmptyState subjectListEmptyState, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1315869414, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectEmptyState.<anonymous> (SubjectListScreen.kt:145)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(345100835, true, new er.p() { // from class: ha4.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.u(subjectListEmptyState, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final oq.i0 u(e.a.SubjectListEmptyState subjectListEmptyState, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(345100835, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectEmptyState.<anonymous>.<anonymous>.<anonymous> (SubjectListScreen.kt:154)");
            }
            k40.d.c(null, subjectListEmptyState.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(e.a.SubjectListEmptyState subjectListEmptyState, int i15, p076m2.r rVar, int i16) {
        s(subjectListEmptyState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void w(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-115479110);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-115479110, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListContent (SubjectListScreen.kt:49)");
            }
            if (aVar instanceof e.a.d) {
                rVarH.X(693729358);
                G(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.SubjectListEmptyState) {
                rVarH.X(693731928);
                s((e.a.SubjectListEmptyState) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof e.a.DisplayingSubjectList) {
                rVarH.X(693734812);
                y((e.a.DisplayingSubjectList) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof e.a.ErrorLoadingInitialData) {
                rVarH.X(693737886);
                D((e.a.ErrorLoadingInitialData) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.ErrorLoadingSemesterDetails)) {
                    rVarH.X(693727577);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(693741151);
                L((e.a.ErrorLoadingSemesterDetails) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ha4.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.x(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(e.a aVar, int i15, p076m2.r rVar, int i16) {
        w(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void y(final e.a.DisplayingSubjectList displayingSubjectList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2064391503);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayingSubjectList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2064391503, i16, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListDisplaying (SubjectListScreen.kt:67)");
            }
            g30.m.j(displayingSubjectList.getBottomSheetData(), displayingSubjectList.getScaffoldData(), 0.0f, null, null, null, y2.m.d(405394614, true, new er.p() { // from class: ha4.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.z(displayingSubjectList, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1466244998, true, new er.q() { // from class: ha4.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.A(displayingSubjectList, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 60);
            p088nul.q0.g(false, displayingSubjectList.e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ha4.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.C(displayingSubjectList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(e.a.DisplayingSubjectList displayingSubjectList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(405394614, i15, -1, "pl.gov.coi.shared.feature.schoolgrades.presentation.screens.subjectlist.SubjectListDisplaying.<anonymous> (SubjectListScreen.kt:71)");
            }
            p(displayingSubjectList.g(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
