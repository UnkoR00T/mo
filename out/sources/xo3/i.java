package xo3;

import a70.ShowQrcodeData;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import g60.a0;
import i50.BaseScaffoldData;
import mx.Label;
import n4.f0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lxo3/z;", "viewModel", "Loq/i0;", "i", "(Lxo3/z;Lm2/r;I)V", "Lxo3/z$a$b;", "state", "Loz/j;", "lifecycleConnector", "l", "(Lxo3/z$a$b;Loz/j;Lm2/r;I)V", "Lxo3/z$a;", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void i(final z zVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-629793208);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(zVar) : rVarH.G(zVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-629793208, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.qr.QrScreen (QrScreen.kt:49)");
            }
            oz.p.j((Context) rVarH.N(AndroidCompositionLocals_androidKt.c()), 0, rVarH, 0, 1);
            z.a aVarJ = j(m7.b.c(zVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarJ, z.a.C5887a.f220405a)) {
                rVarH.X(359123321);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof z.a.Initialized)) {
                    rVarH.X(359121377);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(359125558);
                l((z.a.Initialized) aVarJ, zVar.getLifecycleConnector(), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: xo3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(zVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final z.a j(f6<? extends z.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(z zVar, int i15, p076m2.r rVar, int i16) {
        i(zVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    private static final void l(final z.a.Initialized initialized, final oz.j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1715032290);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(jVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1715032290, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.qr.QrScreenContentInitialized (QrScreen.kt:67)");
            }
            oz.l.b(jVar, rVarH, (i16 >> 3) & 14);
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(537452555, true, new er.q() { // from class: xo3.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xo3.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.s(initialized, jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final z.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(537452555, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.qr.QrScreenContentInitialized.<anonymous> (QrScreen.kt:73)");
            }
            final float fN = c5.h.n(64);
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: xo3.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(n4.v.d(companion, false, (er.l) objE, 1, null), d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            Label description = initialized.getDescription();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleB = aVar.f(rVar, i17).b();
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            Object objE2 = rVar.E();
            if (objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: xo3.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.o((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            j70.h.g(n4.v.d(mVarH, false, (er.l) objE2, 1, null), null, description, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            a70.i.g(initialized.getShowQrcodeData(), rVar, ShowQrcodeData.f3994f);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-43101092, true, new er.p() { // from class: xo3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.p(fN, initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(n4.i0 i0Var) {
        f0.I0(i0Var, 3.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(float f15, z.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-43101092, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.qr.QrScreenContentInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QrScreen.kt:103)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.i(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarV = androidx.compose.foundation.layout.d.v(companion, c5.h.n(55), c5.h.n(36));
            Object objE = rVar.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE == companion3.a()) {
                objE = new er.l() { // from class: xo3.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.q((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            i1.c(l4.c.c(un3.a.f199390a, rVar, 0), c70.a.f23835a.a().O().getText(), n4.v.d(mVarV, false, (er.l) objE, 1, null), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g, 120);
            r3.a(androidx.compose.foundation.layout.d.y(companion, f15), rVar, 6);
            Object objE2 = rVar.E();
            if (objE2 == companion3.a()) {
                objE2 = new er.l() { // from class: xo3.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.r((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            g60.z.q(n4.v.d(companion, false, (er.l) objE2, 1, null), a0.XSMALL, initialized.d(), false, rVar, 48, 8);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(n4.i0 i0Var) {
        f0.I0(i0Var, 5.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(n4.i0 i0Var) {
        f0.I0(i0Var, 6.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(z.a.Initialized initialized, oz.j jVar, int i15, p076m2.r rVar, int i16) {
        l(initialized, jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
