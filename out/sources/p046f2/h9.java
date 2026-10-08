package p046f2;

import c5.h;
import d1.i;
import d1.m3;
import d1.q3;
import er.a;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h2.a2;
import h2.b2;
import java.util.Locale;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0089\u0001\u0010\u001a\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\u001e\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lf2/h9;", "", "<init>", "()V", "", "selectedStartDateMillis", "selectedEndDateMillis", "Lf2/ob;", "displayMode", "Lf2/h5;", "dateFormatter", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "startDateText", "endDateText", "Lkotlin/Function0;", "Loq/i0;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "h", "(Ljava/lang/Long;Ljava/lang/Long;ILf2/h5;Lf3/m;JLjava/lang/String;Ljava/lang/String;Ler/p;Ler/p;Ler/p;Ljava/util/Locale;Lm2/r;II)V", "p", "(ILf3/m;JLm2/r;II)V", "i", "(Ljava/lang/Long;Ljava/lang/Long;ILf2/h5;Lf3/m;JLm2/r;II)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h9 f56070a = new h9();

    private h9() {
    }

    private final void h(Long l15, final Long l16, final int i15, final h5 h5Var, final m mVar, final long j15, final String str, final String str2, final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, final p<? super r, ? super Integer, i0> pVar3, final Locale locale, r rVar, final int i16, final int i17) {
        int i18;
        int i19;
        Long l17;
        r rVar2;
        r rVarH = rVar.h(1381313200);
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.W(l15) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.W(l16) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.c(i15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= (i16 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= rVarH.W(mVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i16) == 0) {
            i18 |= rVarH.d(j15) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= rVarH.W(str) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i18 |= rVarH.W(str2) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i18 |= rVarH.G(pVar) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i18 |= rVarH.G(pVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i25 = i18;
        if ((i17 & 6) == 0) {
            i19 = i17 | (rVarH.G(pVar3) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= rVarH.W(locale) ? 32 : 16;
        }
        if (rVarH.r(((i25 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true, i25 & 1)) {
            if (t.k()) {
                t.o(1381313200, i25, i19, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:468)");
            }
            int i26 = i19;
            String strC = h5.c(h5Var, l15, locale, false, 4, null);
            l17 = l15;
            String strC2 = h5.c(h5Var, l16, locale, false, 4, null);
            String strB = h5Var.b(l17, locale, true);
            String strB2 = "";
            if (strB == null) {
                rVarH.X(620868087);
                ob.Companion companion = ob.INSTANCE;
                if (ob.f(i15, companion.b())) {
                    rVarH.X(297124483);
                    a2.Companion companion2 = a2.INSTANCE;
                    String strB3 = b2.b(a2.a(ih.f56327q), rVarH, 0);
                    rVarH.R();
                    strB = strB3;
                } else if (ob.f(i15, companion.a())) {
                    rVarH.X(297127454);
                    a2.Companion companion3 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56322l), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(621089518);
                    rVarH.R();
                    strB = "";
                }
                rVarH.R();
            } else {
                rVarH.X(297116715);
                rVarH.R();
            }
            String strB4 = h5Var.b(l16, locale, true);
            if (strB4 == null) {
                rVarH.X(621359127);
                ob.Companion companion4 = ob.INSTANCE;
                if (ob.f(i15, companion4.b())) {
                    rVarH.X(297140323);
                    a2.Companion companion5 = a2.INSTANCE;
                    strB2 = b2.b(a2.a(ih.f56327q), rVarH, 0);
                    rVarH.R();
                } else if (ob.f(i15, companion4.a())) {
                    rVarH.X(297143294);
                    a2.Companion companion6 = a2.INSTANCE;
                    strB2 = b2.b(a2.a(ih.f56322l), rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(621580558);
                    rVarH.R();
                }
                rVarH.R();
                strB4 = strB2;
            } else {
                rVarH.X(297132617);
                rVarH.R();
            }
            final String str3 = str + ": " + strB;
            final String str4 = str2 + ": " + strB4;
            boolean zW = rVarH.W(str3) | rVarH.W(str4);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.f9
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h9.j(str3, str4, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarA = v.a(mVar, (l) objE);
            w0 w0VarB = m3.b(i.f39152a.r(h.n(4)), c.INSTANCE.i(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarA);
            androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion7.b();
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
            n6.i(rVarC, w0VarB, companion7.d());
            n6.i(rVarC, e0VarT, companion7.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion7.c());
            n6.g(rVarC, companion7.a());
            n6.i(rVarC, mVarE, companion7.e());
            q3 q3Var = q3.f39261a;
            if (strC != null) {
                rVarH.X(-177386503);
                oo.j(strC, null, j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, (i25 >> 9) & 896, 0, 262138);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVar2 = rVarH;
                rVar2.X(-177297192);
                pVar.B(rVar2, Integer.valueOf((i25 >> 24) & 14));
                rVar2.R();
            }
            pVar3.B(rVar2, Integer.valueOf(i26 & 14));
            if (strC2 != 0) {
                rVar2.X(-177171301);
                oo.j(strC2, null, j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, (i25 >> 9) & 896, 0, 262138);
                rVar2.R();
            } else {
                rVar2.X(-177083974);
                pVar2.B(rVar2, Integer.valueOf((i25 >> 27) & 14));
                rVar2.R();
            }
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            l17 = l15;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final Long l18 = l17;
            d5VarM.a(new p() { // from class: f2.g9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.k(this.f55920a, l18, l16, i15, h5Var, mVar, j15, str, str2, pVar, pVar2, pVar3, locale, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(String str, String str2, n4.i0 i0Var) {
        f0.l0(i0Var, n4.i.INSTANCE.b());
        f0.c0(i0Var, str + ", " + str2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h9 h9Var, Long l15, Long l16, int i15, h5 h5Var, m mVar, long j15, String str, String str2, p pVar, p pVar2, p pVar3, Locale locale, int i16, int i17, r rVar, int i18) {
        h9Var.h(l15, l16, i15, h5Var, mVar, j15, str, str2, pVar, pVar2, pVar3, locale, rVar, g4.a(i16 | 1), g4.a(i17));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(String str, long j15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(850203865, i15, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:421)");
            }
            oo.j(str, null, j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262138);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(String str, long j15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(282231642, i15, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:422)");
            }
            oo.j(str, null, j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262138);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(long j15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-320655704, i15, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:423)");
            }
            oo.j("-", null, j15, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 6, 0, 262138);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(h9 h9Var, Long l15, Long l16, int i15, h5 h5Var, m mVar, long j15, int i16, int i17, r rVar, int i18) {
        h9Var.i(l15, l16, i15, h5Var, mVar, j15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(h9 h9Var, int i15, m mVar, long j15, int i16, int i17, r rVar, int i18) {
        h9Var.p(i15, mVar, j15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final void i(final Long l15, final Long l16, final int i15, final h5 h5Var, m mVar, long j15, r rVar, final int i16, final int i17) {
        Long l17;
        int i18;
        Long l18;
        int i19;
        m mVar2;
        final long headlineContentColor;
        h9 h9Var;
        boolean z15;
        final m mVar3;
        final long j16;
        d5 d5VarM;
        m mVar4;
        int i25;
        int i26;
        r rVarH = rVar.h(1655228151);
        if ((i16 & 6) == 0) {
            l17 = l15;
            i18 = (rVarH.W(l17) ? 4 : 2) | i16;
        } else {
            l17 = l15;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            l18 = l16;
            i18 |= rVarH.W(l18) ? 32 : 16;
        } else {
            l18 = l16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 = i15;
            i18 |= rVarH.c(i19) ? 256 : 128;
        } else {
            i19 = i15;
        }
        if ((i16 & 3072) == 0) {
            i18 |= (i16 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 2048 : 1024;
        }
        int i27 = i17 & 16;
        if (i27 == 0) {
            if ((i16 & 24576) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i16) == 0) {
                if ((i17 & 32) == 0) {
                    headlineContentColor = j15;
                    if (rVarH.d(headlineContentColor)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    }
                    i18 |= i26;
                } else {
                    headlineContentColor = j15;
                }
                i26 = PKIFailureInfo.notAuthorized;
                i18 |= i26;
            } else {
                headlineContentColor = j15;
            }
            if ((1572864 & i16) == 0) {
                h9Var = this;
                if (rVarH.W(h9Var)) {
                    i25 = PKIFailureInfo.badCertTemplate;
                } else {
                    i25 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i25;
            } else {
                h9Var = this;
            }
            if ((599187 & i18) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0 || rVarH.Q()) {
                    if (i27 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 32) != 0) {
                        i18 &= -458753;
                        headlineContentColor = a5.f55133a.i(rVarH, 6).getHeadlineContentColor();
                    }
                } else {
                    rVarH.O();
                    if ((i17 & 32) != 0) {
                        i18 &= -458753;
                    }
                    mVar4 = mVar2;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1655228151, i18, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
                }
                a2.Companion companion = a2.INSTANCE;
                final String strB = b2.b(a2.a(ih.G), rVarH, 0);
                final String strB2 = b2.b(a2.a(ih.D), rVarH, 0);
                int i28 = (458752 & i18) | (i18 & 14) | 905969664 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18);
                int i29 = ((i18 >> 12) & 896) | 6;
                int i35 = i19;
                m mVar5 = mVar4;
                long j17 = headlineContentColor;
                h9Var.h(l17, l18, i35, h5Var, mVar5, j17, strB, strB2, y2.m.d(850203865, true, new p() { // from class: f2.b9
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h9.l(strB, headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(282231642, true, new p() { // from class: f2.c9
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h9.m(strB2, headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(-320655704, true, new p() { // from class: f2.d9
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h9.n(headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), v1.a(rVarH, 0), rVarH, i28, i29);
                if (t.k()) {
                    t.n();
                }
                j16 = j17;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j16 = headlineContentColor;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.e9
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h9.o(this.f55730a, l15, l16, i15, h5Var, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        mVar2 = mVar;
        if ((196608 & i16) == 0) {
            if ((i17 & 32) == 0) {
                headlineContentColor = j15;
                if (rVarH.d(headlineContentColor)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                }
                i18 |= i26;
            } else {
                headlineContentColor = j15;
            }
            i26 = PKIFailureInfo.notAuthorized;
            i18 |= i26;
        } else {
            headlineContentColor = j15;
        }
        if ((1572864 & i16) == 0) {
            h9Var = this;
            if (rVarH.W(h9Var)) {
                i25 = PKIFailureInfo.badCertTemplate;
            } else {
                i25 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i25;
        } else {
            h9Var = this;
        }
        if ((599187 & i18) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 32) != 0) {
                    i18 &= -458753;
                    headlineContentColor = a5.f55133a.i(rVarH, 6).getHeadlineContentColor();
                }
            } else {
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 32) != 0) {
                    i18 &= -458753;
                    headlineContentColor = a5.f55133a.i(rVarH, 6).getHeadlineContentColor();
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1655228151, i18, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:409)");
            }
            a2.Companion companion2 = a2.INSTANCE;
            final String strB3 = b2.b(a2.a(ih.G), rVarH, 0);
            final String strB4 = b2.b(a2.a(ih.D), rVarH, 0);
            int i210 = (458752 & i18) | (i18 & 14) | 905969664 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18);
            int i211 = ((i18 >> 12) & 896) | 6;
            int i36 = i19;
            m mVar6 = mVar4;
            long j18 = headlineContentColor;
            h9Var.h(l17, l18, i36, h5Var, mVar6, j18, strB3, strB4, y2.m.d(850203865, true, new p() { // from class: f2.b9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.l(strB3, headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(282231642, true, new p() { // from class: f2.c9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.m(strB4, headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-320655704, true, new p() { // from class: f2.d9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.n(headlineContentColor, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), v1.a(rVarH, 0), rVarH, i210, i211);
            if (t.k()) {
                t.n();
            }
            j16 = j18;
            mVar3 = mVar6;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            j16 = headlineContentColor;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.e9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.o(this.f55730a, l15, l16, i15, h5Var, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public final void p(final int i15, m mVar, long j15, r rVar, final int i16, final int i17) {
        int i18;
        m mVar2;
        long titleContentColor;
        boolean z15;
        final m mVar3;
        final long j16;
        d5 d5VarM;
        m mVar4;
        long j17;
        m mVar5;
        ob.Companion companion;
        r rVarH = rVar.h(694693107);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i19 = i17 & 2;
        if (i19 == 0) {
            if ((i16 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    titleContentColor = j15;
                    int i25 = rVarH.d(titleContentColor) ? 256 : 128;
                    i18 |= i25;
                } else {
                    titleContentColor = j15;
                }
                i18 |= i25;
            } else {
                titleContentColor = j15;
            }
            if ((i18 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        titleContentColor = a5.f55133a.i(rVarH, 6).getTitleContentColor();
                        i18 &= -897;
                    }
                    j17 = titleContentColor;
                    mVar5 = mVar4;
                } else {
                    rVarH.O();
                    if ((i17 & 4) != 0) {
                        i18 &= -897;
                    }
                    j17 = titleContentColor;
                    mVar5 = mVar2;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(694693107, i18, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
                }
                companion = ob.INSTANCE;
                if (ob.f(i15, companion.b())) {
                    rVarH.X(1880153539);
                    a2.Companion companion2 = a2.INSTANCE;
                    oo.j(b2.b(a2.a(ih.H), rVarH, 0), mVar5, j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                    rVarH.R();
                } else if (ob.f(i15, companion.a())) {
                    rVarH.X(1880160770);
                    a2.Companion companion3 = a2.INSTANCE;
                    oo.j(b2.b(a2.a(ih.B), rVarH, 0), mVar5, j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                    rVarH.R();
                } else {
                    rVarH.X(-1844380177);
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                j16 = j17;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j16 = titleContentColor;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.a9
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h9.q(this.f55141a, i15, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                titleContentColor = j15;
                if (rVarH.d(titleContentColor)) {
                }
                i18 |= i25;
            } else {
                titleContentColor = j15;
            }
            i18 |= i25;
        } else {
            titleContentColor = j15;
        }
        if ((i18 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    titleContentColor = a5.f55133a.i(rVarH, 6).getTitleContentColor();
                    i18 &= -897;
                }
                j17 = titleContentColor;
                mVar5 = mVar4;
            } else {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    titleContentColor = a5.f55133a.i(rVarH, 6).getTitleContentColor();
                    i18 &= -897;
                }
                j17 = titleContentColor;
                mVar5 = mVar4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(694693107, i18, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:371)");
            }
            companion = ob.INSTANCE;
            if (ob.f(i15, companion.b())) {
                rVarH.X(1880153539);
                a2.Companion companion4 = a2.INSTANCE;
                oo.j(b2.b(a2.a(ih.H), rVarH, 0), mVar5, j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                rVarH.R();
            } else if (ob.f(i15, companion.a())) {
                rVarH.X(1880160770);
                a2.Companion companion5 = a2.INSTANCE;
                oo.j(b2.b(a2.a(ih.B), rVarH, 0), mVar5, j17, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVarH, i18 & 1008, 0, 262136);
                rVarH.R();
            } else {
                rVarH.X(-1844380177);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
            j16 = j17;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            j16 = titleContentColor;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.a9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h9.q(this.f55141a, i15, mVar3, j16, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
