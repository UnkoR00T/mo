package gw2;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.u2;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\b\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lgw2/p;", "viewModel", "Loq/i0;", "o", "(Lgw2/p;Lm2/r;I)V", "Lgw2/p$a;", "data", "j", "(Lgw2/p$a;Lm2/r;I)V", "", "Lz30/a;", "r", "(Ljava/util/List;Lm2/r;I)V", "v", "Lgw2/p$b;", "t", "(Lgw2/p$b;Lm2/r;I)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p.FilePickerSectionData f77970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f77971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p.FilePickerSectionData filePickerSectionData, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f77970f = filePickerSectionData;
            this.f77971g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77969e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f77970f.getBringIntoViewRequest()) {
                    j1.a aVar = this.f77971g;
                    this.f77969e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f77970f.c().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f77970f, this.f77971g, eVar);
        }
    }

    private static final void j(final p.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(818795272);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(818795272, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.AdditionalAttachmentsContent (AdditionalAttachmentsScreen.kt:43)");
            }
            g30.t.f(data.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-2124931057, true, new er.p() { // from class: gw2.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.k(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1742766510, true, new er.p() { // from class: gw2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.l(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gw2.u
                    @Override // er.a
                    public final Object a() {
                        return a0.m(data);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw2.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.n(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(p.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2124931057, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.AdditionalAttachmentsContent.<anonymous> (AdditionalAttachmentsScreen.kt:46)");
            }
            r(data.a(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(p.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1742766510, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.AdditionalAttachmentsContent.<anonymous> (AdditionalAttachmentsScreen.kt:47)");
            }
            v(data, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(p.Data data) {
        data.f().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(p.Data data, int i15, p076m2.r rVar, int i16) {
        j(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2008224217);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2008224217, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.AdditionalAttachmentsScreen (AdditionalAttachmentsScreen.kt:37)");
            }
            j(p(m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.q(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.Data p(f6<p.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(p pVar, int i15, p076m2.r rVar, int i16) {
        o(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final List<FileBottomSheetItemData> list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-496942570);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-496942570, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.BottomContent (AdditionalAttachmentsScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(452608940);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                z30.e.d(list.get(i17), rVarH, FileBottomSheetItemData.f232760e);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw2.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.s(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(List list, int i15, p076m2.r rVar, int i16) {
        r(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final p.FilePickerSectionData filePickerSectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1131400164);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(filePickerSectionData) : rVarH.G(filePickerSectionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1131400164, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.FileSection (AdditionalAttachmentsScreen.kt:96)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(filePickerSectionData.getBringIntoViewRequest());
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(filePickerSectionData))) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(filePickerSectionData, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarB = j1.e.b(companion2, aVar);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = filePickerSectionData.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, filePickerSectionData.getDescription(), null, null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            m40.c.c(null, filePickerSectionData.getPickerData(), rVarH, FilePickerData.f131319k << 3, 1);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw2.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.u(filePickerSectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(p.FilePickerSectionData filePickerSectionData, int i15, p076m2.r rVar, int i16) {
        t(filePickerSectionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void v(final p.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1739807963);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1739807963, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.InnerContent (AdditionalAttachmentsScreen.kt:60)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1288885518, true, new er.q() { // from class: gw2.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return a0.w(f3VarB, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: gw2.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.x(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(f3 f3Var, p.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1288885518, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.additionalattachments.InnerContent.<anonymous> (AdditionalAttachmentsScreen.kt:64)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), f3Var, rVar, 0, 0), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            p.FilePickerSectionData coveringFaceSection = data.getCoveringFaceSection();
            if (coveringFaceSection == null) {
                rVar.X(-1502532540);
            } else {
                rVar.X(-1502532539);
                t(coveringFaceSection, rVar, FilePickerData.f131319k);
                if (data.getGlassesSection() == null) {
                    rVar.X(682910764);
                    rVar.R();
                } else {
                    rVar.X(682910765);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
                    rVar.R();
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            }
            rVar.R();
            p.FilePickerSectionData glassesSection = data.getGlassesSection();
            if (glassesSection == null) {
                rVar.X(-1502320407);
            } else {
                rVar.X(-1502320406);
                t(glassesSection, rVar, FilePickerData.f131319k);
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getButtonData(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
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
    public static final oq.i0 x(p.Data data, int i15, p076m2.r rVar, int i16) {
        v(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
