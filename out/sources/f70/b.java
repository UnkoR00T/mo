package f70;

import c30.e;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import i20.h;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import sz.d;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf70/c;", "data", "Lsz/d;", "connector", "", "isPreview", "Loq/i0;", "b", "(Lf70/c;Lsz/d;ZLm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:61:0x0190  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void b(final QrScannerData qrScannerData, final d dVar, boolean z15, r rVar, final int i15, final int i16) {
        int i17;
        boolean z16;
        boolean z17;
        final boolean z18;
        d5 d5VarM;
        boolean z19;
        m.Companion companion;
        k70.a aVar;
        int i18;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        c30.b alertData;
        r rVarH = rVar.h(-2038614059);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(qrScannerData) : rVarH.G(qrScannerData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(dVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-2038614059, i17, -1, "pl.gov.coi.common.ui.scanner.qr.QrScannerContent (QrScannerContent.kt:23)");
                }
                companion = m.INSTANCE;
                aVar = k70.a.f108864a;
                i18 = k70.a.f108865b;
                m mVarD = i.d(companion, aVar.a(rVarH, i18).getBase().a(), null, 2, null);
                d1.i.n nVarK = d1.i.f39152a.k();
                f3.c.Companion companion2 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarD);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
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
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                m mVarB = h0.b(i0.f39176a, companion, 1.0f, false, 2, null);
                w0 w0VarI = d1.r.i(companion2.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarB);
                aVarB2 = companion3.b();
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
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                x xVar = x.f39368a;
                h.h(null, qrScannerData.getScannerViewData(), z19, dVar, rVarH, (i17 & 896) | ((i17 << 6) & 7168), 1);
                alertData = qrScannerData.getAlertData();
                if (alertData == null) {
                    rVarH.X(-1559542889);
                } else {
                    rVarH.X(-1559542888);
                    e.c(a3.n(companion, aVar.b(rVarH, i18).getSpacing150()), alertData, rVarH, c30.b.f22944i << 3, 0);
                }
                rVarH.R();
                rVarH.x();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f70.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b.c(qrScannerData, dVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i19 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-2038614059, i17, -1, "pl.gov.coi.common.ui.scanner.qr.QrScannerContent (QrScannerContent.kt:23)");
            }
            companion = m.INSTANCE;
            aVar = k70.a.f108864a;
            i18 = k70.a.f108865b;
            m mVarD2 = i.d(companion, aVar.a(rVarH, i18).getBase().a(), null, 2, null);
            d1.i.n nVarK2 = d1.i.f39152a.k();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion4.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarD2);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            m mVarB2 = h0.b(i0.f39176a, companion, 1.0f, false, 2, null);
            w0 w0VarI2 = d1.r.i(companion4.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            m mVarE4 = j.e(rVarH, mVarB2);
            aVarB2 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI2, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            x xVar2 = x.f39368a;
            h.h(null, qrScannerData.getScannerViewData(), z19, dVar, rVarH, (i17 & 896) | ((i17 << 6) & 7168), 1);
            alertData = qrScannerData.getAlertData();
            if (alertData == null) {
                rVarH.X(-1559542889);
            } else {
                rVarH.X(-1559542888);
                e.c(a3.n(companion, aVar.b(rVarH, i18).getSpacing150()), alertData, rVarH, c30.b.f22944i << 3, 0);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z18 = z19;
        } else {
            rVarH.O();
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f70.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(qrScannerData, dVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(QrScannerData qrScannerData, d dVar, boolean z15, int i15, int i16, r rVar, int i17) {
        b(qrScannerData, dVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
