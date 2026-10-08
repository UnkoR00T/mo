package u50;

import d1.m3;
import d1.q3;
import d1.r3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lv50/c$d;", "data", "Ld60/c;", "focusHost", "Ll3/o;", "focusManager", "Loq/i0;", "d", "(Lv50/c$d;Ld60/c;Ll3/o;Lm2/r;I)V", "Lc5/h;", "a", "F", "COUNTRY_CODE_MIN_WIDTH", "b", "COUNTRY_CODE_MAX_WIDTH", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f195395a = c5.h.n(70);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f195396b = c5.h.n(110);

    public static final void d(final v50.c.PhoneNumber phoneNumber, final d60.c cVar, final l3.o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-212322212);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(phoneNumber) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(oVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-212322212, i16, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPhoneNumber (TextFieldPhoneNumber.kt:29)");
            }
            final d60.c cVarB = d60.e.b(false, phoneNumber.C(), rVarH, 0, 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i.e eVarJ = d1.i.f39152a.j();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(eVarJ, companion2.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            f3.m mVarZ = androidx.compose.foundation.layout.d.z(companion, f195395a, f195396b);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarZ);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            l3.g.Companion companion4 = l3.g.INSTANCE;
            p030d20.d.d(cVarB, companion4.g(), 0, false, y2.m.d(-1343252158, true, new er.q() { // from class: u50.c0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.e(phoneNumber, cVarB, oVar, (er.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 24576, 12);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, companion);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            rVar2 = rVarH;
            p030d20.d.d(cVar, 0, companion4.d(), false, y2.m.d(-1818057607, true, new er.q() { // from class: u50.d0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.f(phoneNumber, cVar, oVar, (er.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, ((i16 >> 3) & 14) | 24576, 10);
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.g(phoneNumber, cVar, oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(v50.c.PhoneNumber phoneNumber, d60.c cVar, l3.o oVar, er.l lVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(lVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1343252158, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPhoneNumber.<anonymous>.<anonymous>.<anonymous> (TextFieldPhoneNumber.kt:39)");
            }
            b0.X(phoneNumber.getCountryCodeNumber(), cVar, oVar, lVar, rVar, (i15 << 9) & 7168, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(v50.c.PhoneNumber phoneNumber, d60.c cVar, l3.o oVar, er.l lVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(lVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1818057607, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPhoneNumber.<anonymous>.<anonymous>.<anonymous> (TextFieldPhoneNumber.kt:54)");
            }
            b0.X(phoneNumber, cVar, oVar, lVar, rVar, (i15 << 9) & 7168, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(v50.c.PhoneNumber phoneNumber, d60.c cVar, l3.o oVar, int i15, p076m2.r rVar, int i16) {
        d(phoneNumber, cVar, oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
