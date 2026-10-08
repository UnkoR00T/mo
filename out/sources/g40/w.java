package g40;

import d1.a3;
import java.time.LocalDate;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.a5;
import p046f2.h5;
import p046f2.i8;
import p046f2.j8;
import p046f2.n8;
import p046f2.ob;
import p046f2.pi;
import p046f2.w4;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmx/a;", "title", "Ljava/time/LocalDate;", "initialDate", "Lf2/pi;", "selectableDates", "Lf2/w4;", "colors", "Lkotlin/Function1;", "Loq/i0;", "onSave", "Lkotlin/Function0;", "onClose", "f", "(Lmx/a;Ljava/time/LocalDate;Lf2/pi;Lf2/w4;Ler/l;Ler/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void f(final Label label, final LocalDate localDate, final pi piVar, final w4 w4Var, final er.l<? super LocalDate, i0> lVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        er.a<i0> aVar2;
        p076m2.r rVarH = rVar.h(1667944522);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(localDate) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(piVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(w4Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(lVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            aVar2 = aVar;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1667944522, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.SingleDatePickerDialog (SingleDatePickerDialog.kt:27)");
            }
            final j8 j8VarG = n8.g(localDate, null, null, ob.INSTANCE.b(), piVar, rVarH, ((i16 >> 3) & 14) | ((i16 << 6) & 57344), 6);
            boolean z15 = j8VarG.j() != null;
            boolean zW = rVarH.W(j8VarG) | ((57344 & i16) == 16384);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: g40.r
                    @Override // er.a
                    public final Object a() {
                        return w.g(j8VarG, lVar);
                    }
                };
                rVarH.v(objE);
            }
            int i17 = i16 >> 9;
            int i18 = (i17 & 896) | (i17 & 14) | 24576;
            o.e(w4Var, z15, aVar2, (er.a) objE, y2.m.d(282692181, true, new er.p() { // from class: g40.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.h(j8VarG, w4Var, label, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g40.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.k(label, localDate, piVar, w4Var, lVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(j8 j8Var, er.l lVar) {
        LocalDate localDateC = n8.c(j8Var);
        if (localDateC != null) {
            lVar.b(localDateC);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final j8 j8Var, w4 w4Var, final Label label, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(282692181, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.SingleDatePickerDialog.<anonymous> (SingleDatePickerDialog.kt:40)");
            }
            i8.E0(j8Var, null, null, w4Var, y2.m.d(469544712, true, new er.p() { // from class: g40.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.i(label, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(-910240601, true, new er.p() { // from class: g40.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.j(j8Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), true, null, rVar, 1794048, 134);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Label label, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(469544712, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.SingleDatePickerDialog.<anonymous>.<anonymous> (SingleDatePickerDialog.kt:44)");
            }
            q.b(label, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(j8 j8Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-910240601, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.SingleDatePickerDialog.<anonymous>.<anonymous> (SingleDatePickerDialog.kt:46)");
            }
            a5 a5Var = a5.f55133a;
            Long lJ = j8Var.j();
            int iE = j8Var.e();
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = a5.l(a5Var, null, null, null, 7, null);
                rVar.v(objE);
            }
            h5 h5Var = (h5) objE;
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            a5Var.d(lJ, iE, h5Var, a3.q(companion, aVar.b(rVar, i16).getSpacing300(), aVar.b(rVar, i16).getZero(), aVar.b(rVar, i16).getSpacing150(), aVar.b(rVar, i16).getSpacing100()), 0L, rVar, 196608, 16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(Label label, LocalDate localDate, pi piVar, w4 w4Var, er.l lVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        f(label, localDate, piVar, w4Var, lVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
