package ph;

import android.util.Patterns;
import androidx.compose.ui.platform.t2;
import b5.TextGeometricTransform;
import com.google.android.gms.internal.oss_licenses.j4;
import d1.d3;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.Shadow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.C6457hh;
import p046f2.C6461wc;
import p046f2.di;
import p046f2.oo;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import q4.SpanStyle;
import q4.TextStyle;
import q4.u3;
import u4.FontWeight;
import w0.u2;
import x4.LocaleList;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {
    public static final void a(final int i15, final e0 e0Var, final er.a aVar, p076m2.r rVar, final int i16, int i17) {
        int i18;
        p076m2.r rVar2;
        List listA;
        int i19 = i16 & 6;
        p076m2.r rVarH = rVar.h(-158631053);
        if (i19 == 0) {
            i18 = (true != rVarH.c(i15) ? 2 : 4) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= true != rVarH.G(e0Var) ? 16 : 32;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= true != rVarH.G(aVar) ? 128 : 256;
        }
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-158631053, i18, -1, "com.google.android.gms.oss.licenses.v2.LicenseDetailScreen (LicenseDetailScreen.kt:57)");
            }
            final f6 f6VarB = x5.b(e0Var.a9(), null, rVarH, 0, 1);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(null, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            z zVarD = d(f6VarB);
            w wVar = zVarD instanceof w ? (w) zVarD : null;
            final j4 j4Var = (wVar == null || (listA = wVar.a()) == null) ? null : (j4) pq.v.o0(listA, i15);
            boolean zG = rVarH.G(j4Var) | rVarH.G(e0Var);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new i0(j4Var, e0Var, a3Var, null);
                rVarH.v(objE2);
            }
            Function0.d(j4Var, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            di.l(null, y2.m.d(-2027192017, true, new er.p() { // from class: ph.o0
                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    p076m2.r rVar3 = (p076m2.r) obj;
                    if (rVar3.r((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(-2027192017, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.LicenseDetailScreen.<anonymous> (LicenseDetailScreen.kt:70)");
                        }
                        final j4 j4Var2 = j4Var;
                        final er.a aVar2 = aVar;
                        p046f2.Function0.y(y2.m.d(2104559859, true, new er.p() { // from class: ph.m0
                            @Override // er.p
                            public final /* synthetic */ Object B(Object obj3, Object obj4) {
                                String strE;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                p076m2.r rVar4 = (p076m2.r) obj3;
                                if (rVar4.r((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (p076m2.t.k()) {
                                        p076m2.t.o(2104559859, iIntValue2, -1, "com.google.android.gms.oss.licenses.v2.LicenseDetailScreen.<anonymous>.<anonymous> (LicenseDetailScreen.kt:71)");
                                    }
                                    j4 j4Var3 = j4Var2;
                                    if (j4Var3 == null || (strE = j4Var3.e()) == null) {
                                        strE = "";
                                    }
                                    oo.j(strE, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 262142);
                                    if (p076m2.t.k()) {
                                        p076m2.t.n();
                                    }
                                } else {
                                    rVar4.O();
                                }
                                return oq.i0.f148189a;
                            }
                        }, rVar3, 54), null, y2.m.d(23976181, true, new er.p() { // from class: ph.n0
                            @Override // er.p
                            public final /* synthetic */ Object B(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                p076m2.r rVar4 = (p076m2.r) obj3;
                                if (rVar4.r((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (p076m2.t.k()) {
                                        p076m2.t.o(23976181, iIntValue2, -1, "com.google.android.gms.oss.licenses.v2.LicenseDetailScreen.<anonymous>.<anonymous> (LicenseDetailScreen.kt:73)");
                                    }
                                    C6461wc.c(aVar2, t2.a(f3.m.INSTANCE, "LicenseDetailNavigationIcon"), false, null, null, null, x.a(), rVar4, 1572912, 60);
                                    if (p076m2.t.k()) {
                                        p076m2.t.n();
                                    }
                                } else {
                                    rVar4.O();
                                }
                                return oq.i0.f148189a;
                            }
                        }, rVar3, 54), null, 0.0f, null, null, null, null, rVar3, 390, 506);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar3.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54), null, null, null, 0, 0L, 0L, null, y2.m.d(-148690620, true, new er.q() { // from class: ph.j0
                @Override // er.q
                public final /* synthetic */ Object w(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return p0.c(j4Var, f6VarB, a3Var, (d3) obj, (p076m2.r) obj2, iIntValue);
                }
            }, rVarH, 54), rVar2, 805306416, 509);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final int i25 = 0;
            d5VarM.a(new er.p(i15, e0Var, aVar, i16, i25) { // from class: ph.k0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ int f157585a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ e0 f157586b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ er.a f157587c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final /* synthetic */ int f157588d;

                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p0.a(this.f157585a, this.f157586b, this.f157587c, (p076m2.r) obj, g4.a(this.f157588d | 1), 0);
                    return oq.i0.f148189a;
                }
            });
        }
    }

    public static final void b(final String str, final f3.m mVar, p076m2.r rVar, final int i15, int i16) {
        int i17;
        p076m2.r rVar2;
        int i18 = i15 & 6;
        p076m2.r rVarH = rVar.h(-757578467);
        if (i18 == 0) {
            i17 = i15 | (true != rVarH.W(str) ? 2 : 4);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= true != rVarH.W(mVar) ? 16 : 32;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-757578467, i17, -1, "com.google.android.gms.oss.licenses.v2.AutoLinkText (LicenseDetailScreen.kt:122)");
            }
            TextStyle textStyle = (TextStyle) rVarH.N(oo.q());
            long primary = androidx.compose.material3.d.f9816a.a(rVarH, androidx.compose.material3.d.f9817b).getPrimary();
            boolean z15 = (i17 & 14) == 4;
            Pattern pattern = Patterns.WEB_URL;
            boolean zD = z15 | rVarH.d(primary);
            Object objE = rVarH.E();
            if (zD || objE == p076m2.r.INSTANCE.a()) {
                q4.e.b bVar = new q4.e.b(0, 1, null);
                Matcher matcher = pattern.matcher(str);
                int iEnd = 0;
                while (matcher.find()) {
                    bVar.f(str.substring(iEnd, matcher.start()));
                    String strGroup = matcher.group();
                    long j15 = primary;
                    int iM = bVar.m(new q4.m.b(strGroup, new u3(new SpanStyle(j15, 0L, (FontWeight) null, (u4.y) null, (u4.z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, b5.k.INSTANCE.d(), (Shadow) null, (q4.j0) null, (p3.g) null, 61438, (fr.k) null), null, null, null, 14, null), null, 4, null));
                    try {
                        bVar.f(strGroup);
                        oq.i0 i0Var = oq.i0.f148189a;
                        bVar.l(iM);
                        iEnd = matcher.end();
                        primary = j15;
                    } catch (Throwable th4) {
                        bVar.l(iM);
                        throw th4;
                    }
                }
                bVar.f(str.substring(iEnd));
                objE = bVar.p();
                rVarH.v(objE);
            }
            rVar2 = rVarH;
            oo.k((q4.e) objE, mVar, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle, rVar2, i17 & 112, 0, 262140);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final int i19 = 0;
            d5VarM.a(new er.p(str, mVar, i15, i19) { // from class: ph.l0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ String f157590a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ f3.m f157591b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ int f157592c;

                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p0.b(this.f157590a, this.f157591b, (p076m2.r) obj, g4.a(this.f157592c | 1), 0);
                    return oq.i0.f148189a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ oq.i0 c(j4 j4Var, f6 f6Var, a3 a3Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (true != rVar2.W(d3Var) ? 2 : 4);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-148690620, i16, -1, "com.google.android.gms.oss.licenses.v2.LicenseDetailScreen.<anonymous> (LicenseDetailScreen.kt:86)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(d1.a3.l(companion, d3Var), 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarF);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.e(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            if (j4Var == null) {
                rVar2.X(1930657343);
                if (d(f6Var) instanceof y) {
                    rVar2.X(1930817148);
                    C6457hh.j(xVar.d(companion, companion2.e()), 0L, 0.0f, 0L, 0, 0.0f, rVar2, 0, 62);
                    rVar2.R();
                } else {
                    rVar2.X(1930916565);
                    oo.j(l4.f.a(oh.d.f145732b, rVar2, 0), xVar.d(companion, companion2.e()), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
                    rVar2 = rVar;
                    rVar2.R();
                }
                rVar2.R();
            } else {
                rVar2.X(1931097543);
                String str = (String) a3Var.getValue();
                if (str == null) {
                    rVar2.X(1931148476);
                    C6457hh.j(xVar.d(companion, companion2.e()), 0L, 0.0f, 0L, 0, 0.0f, rVar2, 0, 62);
                    rVar2.R();
                } else {
                    rVar2.X(1931248172);
                    b(str, d1.a3.n(u2.g(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), u2.b(0, rVar2, 0, 1), false, null, false, 14, null), c5.h.n(16.0f)), rVar2, 0, 0);
                    rVar2.R();
                }
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    private static final z d(f6 f6Var) {
        return (z) f6Var.getValue();
    }
}
