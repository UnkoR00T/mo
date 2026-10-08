package ax3;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o50.SmallCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.i1;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lax3/f;", "viewModel", "Loq/i0;", "w", "(Lax3/f;Lm2/r;I)V", "", "Lz30/a;", "items", "l", "(Ljava/util/List;Lm2/r;I)V", "Lax3/f$a$b;", "data", "s", "(Lax3/f$a$b;Lm2/r;I)V", "Lax3/f$a$b$c;", "n", "(Lax3/f$a$b$c;Lm2/r;I)V", "Lax3/f$a$b$d;", "p", "(Lax3/f$a$b$d;Lm2/r;I)V", "Lc5/h;", "a", "F", "IMAGE_WIDTH", "Lax3/f$a;", "state", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15169a = c5.h.n(123);

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(f.a aVar) {
        ((f.a.Initialized) aVar).e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(f fVar, int i15, p076m2.r rVar, int i16) {
        w(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final List<FileBottomSheetItemData> list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(2127953047);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2127953047, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.BottomSheetContent (VerificationScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            rVarH.X(794923745);
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
            d5VarM.a(new er.p() { // from class: ax3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.m(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(List list, int i15, p076m2.r rVar, int i16) {
        l(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final f.a.Initialized.PictureData pictureData, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(65570176);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(pictureData) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(65570176, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.PictureRow (VerificationScreen.kt:109)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            i1.g(n3.l0.c(pictureData.getImage()), null, k3.f.a(d1.k.b(androidx.compose.foundation.layout.d.y(companion, f15169a), 0.7777778f, false, 2, null), l1.h.f(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150())), null, pictureData.getScaleType(), 0.0f, null, 0, rVarH, 48, 232);
            f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
            p036e4.w0 w0VarB2 = m3.b(iVar.e(), companion2.l(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
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
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVarH.X(148151999);
            List<SmallCardData> listA = pictureData.a();
            int size = listA.size();
            for (int i17 = 0; i17 < size; i17++) {
                o50.e.d(listA.get(i17), false, rVarH, SmallCardData.f142457h, 2);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ax3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.o(pictureData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(f.a.Initialized.PictureData pictureData, int i15, p076m2.r rVar, int i16) {
        n(pictureData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final f.a.Initialized.UnfulfilledRequirementsData unfulfilledRequirementsData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1795601622);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(unfulfilledRequirementsData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1795601622, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.UnfulfilledRequirements (VerificationScreen.kt:135)");
            }
            x30.c.c(null, 0.0f, y2.m.d(1441787945, true, new er.p() { // from class: ax3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.q(unfulfilledRequirementsData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ax3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.r(unfulfilledRequirementsData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f.a.Initialized.UnfulfilledRequirementsData unfulfilledRequirementsData, p076m2.r rVar, int i15) {
        int i16;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1441787945, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.UnfulfilledRequirements.<anonymous> (VerificationScreen.kt:137)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label header = unfulfilledRequirementsData.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            int i18 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            rVar2.X(940560655);
            List<f.a.Initialized.UnfulfilledRequirementsData.Item> listB = unfulfilledRequirementsData.b();
            int size = listB.size();
            int i19 = 0;
            while (i19 < size) {
                f.a.Initialized.UnfulfilledRequirementsData.Item item = listB.get(i19);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar2, i18);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, i18));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, companion3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
                n6.i(rVarC2, w0VarB, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                q3 q3Var = q3.f39261a;
                d40.h.f(null, item.getIconData(), false, rVar2, d40.b.f39676g << 3, 5);
                k70.a aVar2 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar2.b(rVar2, i25).getSpacing100()), rVar2, i18);
                List<f.a.Initialized.UnfulfilledRequirementsData.Item> list = listB;
                int i26 = size;
                int i27 = i19;
                j70.h.g(null, null, item.getLabel(), null, null, aVar2.a(rVar2, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i25).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.x();
                if (i27 != pq.v.p(unfulfilledRequirementsData.b())) {
                    rVar2.X(-1213340402);
                    i16 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i25).getSpacing100()), rVar2, 0);
                } else {
                    i16 = 0;
                    rVar2.X(-1219337073);
                }
                rVar2.R();
                i19 = i27 + 1;
                i18 = i16;
                listB = list;
                size = i26;
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(f.a.Initialized.UnfulfilledRequirementsData unfulfilledRequirementsData, int i15, p076m2.r rVar, int i16) {
        p(unfulfilledRequirementsData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1027219858);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1027219858, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.VerificationContent (VerificationScreen.kt:74)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1308250015, true, new er.q() { // from class: ax3.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.t(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ax3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.v(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1308250015, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.VerificationContent.<anonymous> (VerificationScreen.kt:76)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarL, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ax3.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.u((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarP, false, (er.l) objE, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            n(initialized.getPictureData(), rVar, 0);
            f.a.Initialized.UnfulfilledRequirementsData unfulfilledRequirementsData = initialized.getUnfulfilledRequirementsData();
            if (unfulfilledRequirementsData == null) {
                rVar.X(515200432);
            } else {
                rVar.X(515200433);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                p(unfulfilledRequirementsData, rVar, 0);
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(initialized.getButtonsData().getPrimary(), false, null, rVar, 0, 6);
            ButtonData secondary = initialized.getButtonsData().getSecondary();
            if (secondary == null) {
                rVar.X(961694341);
                rVar.R();
            } else {
                rVar.X(961694342);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing150()), rVar, 0);
                h30.q.p(secondary, false, null, rVar, 0, 6);
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
    public static final oq.i0 u(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        s(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void w(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-184078215);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-184078215, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.VerificationScreen (VerificationScreen.kt:48)");
            }
            final f.a aVarX = x(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarX, f.a.c.f14979a)) {
                rVarH.X(-805499318);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarX instanceof f.a.Initialized) {
                rVarH.X(799401428);
                f.a.Initialized initialized = (f.a.Initialized) aVarX;
                g30.t.f(initialized.getBottomSheetData().getData(), 0.0f, false, null, null, y2.m.d(972038195, true, new er.p() { // from class: ax3.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return r.y(aVarX, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(981808756, true, new er.p() { // from class: ax3.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return r.z(aVarX, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
                cb4.i dialogAdapter = initialized.getDialogAdapter();
                if (dialogAdapter == null) {
                    rVarH = rVarH;
                    rVarH.X(799644064);
                } else {
                    rVarH = rVarH;
                    rVarH.X(-805489023);
                    dialogAdapter.b(rVarH, 0);
                }
                rVarH.R();
                boolean zG = rVarH.G(aVarX);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: ax3.m
                        @Override // er.a
                        public final Object a() {
                            return r.A(aVarX);
                        }
                    };
                    rVarH.v(objE);
                }
                p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
                rVarH.R();
            } else {
                if (!(aVarX instanceof f.a.Error)) {
                    rVarH.X(-805501023);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-805485279);
                ((f.a.Error) aVarX).getVmsAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ax3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.B(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a x(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(f.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(972038195, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.VerificationScreen.<anonymous> (VerificationScreen.kt:55)");
            }
            l(((f.a.Initialized) aVar).getBottomSheetData().a(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(f.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(981808756, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.VerificationScreen.<anonymous> (VerificationScreen.kt:56)");
            }
            s((f.a.Initialized) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
