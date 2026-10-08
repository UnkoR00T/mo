package m40;

import androidx.compose.foundation.layout.d;
import d1.e0;
import d1.i;
import d1.i0;
import d1.r3;
import er.p;
import er.q;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import n30.CardListData;
import n40.FilePickerData;
import n50.h0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.k;
import p114t0.l;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Ln40/c;", "data", "Loq/i0;", "c", "(Lf3/m;Ln40/c;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(m mVar, final FilePickerData filePickerData, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        r rVar2;
        final m mVar3;
        int i18;
        r rVarH = rVar.h(-1689675776);
        int i19 = i16 & 1;
        if (i19 != 0) {
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
            i17 |= rVarH.G(filePickerData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            mVar3 = i19 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1689675776, i17, -1, "pl.gov.coi.common.ui.ds.filepicker.FilePicker (FilePicker.kt:28)");
            }
            m mVarC = d.C(d.h(mVar3, 0.0f, 1, null), null, false, 3, null);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            if (filePickerData.g().isEmpty()) {
                rVar2 = rVarH;
                i18 = 1669766220;
                rVar2.X(1669766220);
            } else {
                rVarH.X(1671141473);
                rVar2 = rVarH;
                i18 = 1669766220;
                m30.i.d(new CardListData(filePickerData.e(), null, false, null, null, 30, null), null, null, rVar2, 0, 6);
            }
            rVar2.R();
            if (n40.d.c(filePickerData)) {
                rVar2.X(1671298581);
                if (filePickerData.g().isEmpty()) {
                    rVar2.X(i18);
                } else {
                    rVar2.X(1671313647);
                    r3.a(d.i(m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                }
                rVar2.R();
                h0.v(filePickerData.getAddFileCardData(), null, rVar2, 0, 2);
                r rVar3 = rVar2;
                k.e(i0Var, n40.d.d(filePickerData), null, null, null, null, y2.m.d(338433568, true, new q() { // from class: m40.a
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return c.d(filePickerData, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar2, 54), rVar3, 1572870, 30);
                m.Companion companion2 = m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                r3.a(d.i(companion2, aVar.b(rVar3, i25).getSpacing100()), rVar3, 0);
                h.g(null, null, filePickerData.getRequirementsLabel(), null, null, aVar.a(rVar3, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i25).d(), null, null, false, true, null, rVar3, 0, 0, 3072, 24641499);
                rVar2 = rVar3;
            } else {
                rVar2.X(i18);
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: m40.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(mVar3, filePickerData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(FilePickerData filePickerData, l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(338433568, i15, -1, "pl.gov.coi.common.ui.ds.filepicker.FilePicker.<anonymous>.<anonymous> (FilePicker.kt:49)");
        }
        Label errorLabel = filePickerData.getErrorLabel();
        if (errorLabel == null) {
            rVar.X(1986213995);
            rVar.R();
        } else {
            rVar.X(1986213996);
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            r3.a(d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            l40.d.d(null, errorLabel, true, rVar, MLKEMEngine.KyberPolyBytes, 1);
            rVar.x();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m mVar, FilePickerData filePickerData, int i15, int i16, r rVar, int i17) {
        c(mVar, filePickerData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
