package a70;

import c5.w;
import d1.a3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import u4.FontWeight;
import w0.q0;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"La70/j;", "data", "Loq/i0;", "g", "(La70/j;Lm2/r;I)V", "Lc5/v;", "a", "J", "codeFontSize", "b", "letterSpacing", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f3992a = w.g(40);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f3993b = w.g(8);

    public static final void g(final ShowQrcodeData showQrcodeData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(432862931);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(showQrcodeData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(432862931, i16, -1, "pl.gov.coi.common.ui.qrcode.QrCodeVerificationContent (QrCodeVerificationContent.kt:38)");
            }
            x30.c.c(null, 0.0f, m.d(-1735007372, true, new p() { // from class: a70.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(showQrcodeData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(showQrcodeData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final ShowQrcodeData showQrcodeData, r rVar, int i15) {
        k70.a aVar;
        f3.m.Companion companion;
        int i16;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1735007372, i15, -1, "pl.gov.coi.common.ui.qrcode.QrCodeVerificationContent.<anonymous> (QrCodeVerificationContent.kt:40)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(a3.n(companion2, aVar2.b(rVar2, i17).getSpacing200()), 0.0f, 1, null), null, false, 3, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarC);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarI = d1.r.i(companion3.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, companion2);
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
            r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            x xVar = x.f39368a;
            m20.c.c(showQrcodeData.getQrCodeBitmap(), rVar2, 0);
            rVar2.x();
            Label codeLabel = showQrcodeData.getCodeLabel();
            if (codeLabel == null) {
                rVar2.X(1271526749);
                rVar2.R();
                companion = companion2;
                aVar = aVar2;
                i16 = i17;
            } else {
                rVar2.X(1271526750);
                Label labelB = mx.b.b(c70.a.f23835a.a().t0().getText() + ": " + codeLabel.getText(), "");
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i17).getSpacing400()), rVar2, 0);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
                Object objE = rVar2.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: a70.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.i((n4.i0) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f3.m mVarD = v.d(mVarH, false, (l) objE, 1, null);
                int iA = b5.j.INSTANCE.a();
                long j15 = f3993b;
                TextStyle textStyleB = aVar2.f(rVar2, i17).b();
                long j16 = f3992a;
                aVar = aVar2;
                companion = companion2;
                j70.h.g(mVarD, null, codeLabel, labelB, null, 0L, j16, null, null, null, j15, null, b5.j.h(iA), j16, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVar, 1572864, 3078, 0, 33016754);
                rVar2 = rVar;
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
                i16 = i17;
            }
            f3.m.Companion companion5 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            f3.m mVarC2 = q0.c(androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null), false, null, 2, null);
            Object objE2 = rVar2.E();
            r.Companion companion6 = r.INSTANCE;
            if (objE2 == companion6.a()) {
                objE2 = new l() { // from class: a70.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.j((n4.i0) obj);
                    }
                };
                rVar2.v(objE2);
            }
            f3.m mVarD2 = v.d(mVarC2, false, (l) objE2, 1, null);
            boolean zG = rVar2.G(showQrcodeData);
            Object objE3 = rVar2.E();
            if (zG || objE3 == companion6.a()) {
                objE3 = new er.a() { // from class: a70.g
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(i.k(showQrcodeData));
                    }
                };
                rVar2.v(objE3);
            }
            k60.c.c(mVarD2, (er.a) objE3, 0, 0L, rVar2, 0, 12);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null);
            Object objE4 = rVar2.E();
            if (objE4 == companion6.a()) {
                objE4 = new l() { // from class: a70.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.l((n4.i0) obj);
                    }
                };
                rVar2.v(objE4);
            }
            f3.m mVarC3 = v.c(mVarH2, true, (l) objE4);
            w0 w0VarB = m3.b(iVar.e(), companion3.l(), rVar2, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarC3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarB, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            q3 q3Var = q3.f39261a;
            int i18 = i16;
            j70.h.g(null, null, showQrcodeData.getQrcodeTimerLabel(), showQrcodeData.getQrcodeTimerLabel(), null, aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i16).d(), null, null, false, false, null, rVar, 0, 0, MLKEMEngine.KyberPolyBytes, 28835795);
            j70.h.g(a3.r(companion5, aVar.b(rVar, i18).getSpacing25(), 0.0f, 0.0f, 0.0f, 14, null), null, showQrcodeData.getQrCodeTimeLeftLabel(), showQrcodeData.getQrCodeTimeLeftLabel(), null, 0L, 0L, null, FontWeight.INSTANCE.a(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).d(), null, null, false, false, null, rVar, 100663296, 0, MLKEMEngine.KyberPolyBytes, 28835570);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        f0.I0(i0Var, 4.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(ShowQrcodeData showQrcodeData) {
        return showQrcodeData.getTimerProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(n4.i0 i0Var) {
        f0.I0(i0Var, 1.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ShowQrcodeData showQrcodeData, int i15, r rVar, int i16) {
        g(showQrcodeData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
