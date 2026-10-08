package r61;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import n40.FilePickerData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\f\u0010\u0006\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lr61/c;", "viewModel", "Loq/i0;", "t", "(Lr61/c;Lm2/r;I)V", "Lr61/c$a$c;", "screenData", "k", "(Lr61/c$a$c;Lm2/r;I)V", "o", "Lmx/a;", "headerLabel", "messageLabel", "Ln40/c;", "filePickerData", "r", "(Lmx/a;Lmx/a;Ln40/c;Lm2/r;I)V", "Ls61/d;", "data", "i", "(Ls61/d;Lm2/r;I)V", "Lr61/c$a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void i(final s61.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(29092567);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(29092567, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.BottomSheetContent (ChildPassportApplicationPhotoAttachmentsScreen.kt:123)");
            }
            if (!(dVar instanceof s61.d.File)) {
                rVarH.X(-2106812275);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-2106810698);
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
            rVarH.X(1472884033);
            Iterator<T> it = ((s61.d.File) dVar).a().iterator();
            while (it.hasNext()) {
                z30.e.d((FileBottomSheetItemData) it.next(), rVarH, FileBottomSheetItemData.f232760e);
            }
            rVarH.R();
            rVarH.x();
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r61.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(s61.d dVar, int i15, p076m2.r rVar, int i16) {
        i(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2025330935);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2025330935, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsContent (ChildPassportApplicationPhotoAttachmentsScreen.kt:45)");
            }
            g30.t.f(initialized.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(14899670, true, new er.p() { // from class: r61.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(148486581, true, new er.p() { // from class: r61.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r61.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(14899670, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsContent.<anonymous>.<anonymous> (ChildPassportApplicationPhotoAttachmentsScreen.kt:48)");
            }
            s61.d bottomSheetContentData = initialized.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(1494475644);
            } else {
                rVar.X(1494475645);
                i(bottomSheetContentData, rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(148486581, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsContent.<anonymous>.<anonymous> (ChildPassportApplicationPhotoAttachmentsScreen.kt:49)");
            }
            int i16 = BaseScaffoldData.f89350g;
            int i17 = FilePickerData.f131319k;
            o(initialized, rVar, i16 | i17 | i17 | ModalBottomSheetData.f70192e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1889732253);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1889732253, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsInnerContent (ChildPassportApplicationPhotoAttachmentsScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2003032054, true, new er.q() { // from class: r61.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.p(initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: r61.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c.a.Initialized initialized, c.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2003032054, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsInnerContent.<anonymous>.<anonymous> (ChildPassportApplicationPhotoAttachmentsScreen.kt:56)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
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
            c.a.Initialized.ContentData faceCoverContent = initialized.getFaceCoverContent();
            if (faceCoverContent == null) {
                rVar.X(-968404934);
            } else {
                rVar.X(-968404933);
                r(faceCoverContent.getHeaderLabel(), faceCoverContent.getMessageLabel(), faceCoverContent.getFilePickerData(), rVar, FilePickerData.f131319k << 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            }
            rVar.R();
            c.a.Initialized.ContentData glassesContent = initialized.getGlassesContent();
            if (glassesContent == null) {
                rVar.X(-968037584);
            } else {
                rVar.X(-968037583);
                r(glassesContent.getHeaderLabel(), glassesContent.getMessageLabel(), glassesContent.getFilePickerData(), rVar, FilePickerData.f131319k << 6);
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
            h30.q.p(initialized2.getNextButton(), false, null, rVar, 0, 6);
            rVar.x();
            q0.g(false, initialized.g(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        o(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final Label label, Label label2, FilePickerData filePickerData, p076m2.r rVar, final int i15) {
        int i16;
        final FilePickerData filePickerData2;
        p076m2.r rVar2;
        final Label label3 = label2;
        p076m2.r rVarH = rVar.h(666538922);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label3) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(filePickerData) : rVarH.G(filePickerData) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(666538922, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsPartialAddAttachmentView (ChildPassportApplicationPhotoAttachmentsScreen.kt:105)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            int i18 = i16;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, label2, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, (i18 << 3) & 896, 0, 0, 33030107);
            label3 = label2;
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            filePickerData2 = filePickerData;
            m40.c.c(null, filePickerData2, rVar2, (FilePickerData.f131319k << 3) | ((i18 >> 3) & 112), 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            filePickerData2 = filePickerData;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r61.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(label, label3, filePickerData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Label label, Label label2, FilePickerData filePickerData, int i15, p076m2.r rVar, int i16) {
        r(label, label2, filePickerData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1136292886);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1136292886, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphotoattachments.ChildPassportApplicationPhotoAttachmentsScreen (ChildPassportApplicationPhotoAttachmentsScreen.kt:35)");
            }
            c.a aVarU = u(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarU instanceof c.a.b) {
                rVarH.X(-1055763941);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarU instanceof c.a.Initialized) {
                rVarH.X(-1055762452);
                k((c.a.Initialized) aVarU, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarU instanceof c.a.Error)) {
                    rVarH.X(-1055765473);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1055759246);
                ((c.a.Error) aVarU).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: r61.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.v(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a u(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(c cVar, int i15, p076m2.r rVar, int i16) {
        t(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
