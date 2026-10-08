package p046f2;

import c5.h;
import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import er.a;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h2.DateInputFormat;
import h2.a2;
import h2.b2;
import h2.l0;
import java.util.Locale;
import l3.d0;
import lr.i;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0012\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"", "selectedStartDateMillis", "selectedEndDateMillis", "Lkotlin/Function2;", "Loq/i0;", "onDatesSelectionChange", "Lh2/l0;", "calendarModel", "Llr/i;", "yearRange", "Lf2/h5;", "dateFormatter", "Lf2/pi;", "selectableDates", "Lf2/w4;", "colors", "Ll3/d0;", "focusRequester", "l", "(Ljava/lang/Long;Ljava/lang/Long;Ler/p;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Ll3/d0;Lm2/r;I)V", "Lc5/h;", "a", "F", "TextFieldSpacing", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f58471a = h.n(8);

    public static final void l(final Long l15, final Long l16, final p<? super Long, ? super Long, i0> pVar, final l0 l0Var, final i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, final d0 d0Var, r rVar, final int i15) {
        int i16;
        i iVar2;
        final p<? super Long, ? super Long, i0> pVar2;
        r rVar2;
        Object u4Var;
        r rVarH = rVar.h(1372713366);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(l15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(l16) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(l0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            iVar2 = iVar;
            i16 |= rVarH.G(iVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            iVar2 = iVar;
        }
        if ((196608 & i15) == 0) {
            i16 |= (i15 & PKIFailureInfo.transactionIdInUse) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(piVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= rVarH.W(w4Var) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i16 |= rVarH.W(d0Var) ? 67108864 : 33554432;
        }
        if (rVarH.r((i16 & 38347923) != 38347922, i16 & 1)) {
            if (t.k()) {
                t.o(1372713366, i16, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:44)");
            }
            boolean zW = rVarH.W(l0Var.getLocale());
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = l0Var.c(l0Var.getLocale());
                rVarH.v(objE);
            }
            DateInputFormat dateInputFormat = (DateInputFormat) objE;
            a2.Companion companion = a2.INSTANCE;
            String strB = b2.b(a2.a(ih.f56318h), rVarH, 0);
            String strB2 = b2.b(a2.a(ih.f56320j), rVarH, 0);
            String strB3 = b2.b(a2.a(ih.f56319i), rVarH, 0);
            String strB4 = b2.b(a2.a(ih.A), rVarH, 0);
            boolean zW2 = rVarH.W(dateInputFormat) | ((i16 & 458752) == 131072 || ((i16 & PKIFailureInfo.transactionIdInUse) != 0 && rVarH.W(h5Var)));
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                u4Var = new u4(iVar2, piVar, dateInputFormat, h5Var, strB, strB2, strB3, strB4);
                dateInputFormat = dateInputFormat;
                rVarH.v(u4Var);
            } else {
                u4Var = objE2;
            }
            u4 u4Var2 = (u4) u4Var;
            u4Var2.b(l15);
            u4Var2.a(l16);
            m.Companion companion2 = m.INSTANCE;
            m mVarL = a3.l(companion2, t4.B());
            w0 w0VarB = m3.b(d1.i.f39152a.r(f58471a), c.INSTANCE.l(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            final String strB5 = b2.b(a2.a(ih.G), rVarH, 0);
            m mVarC = p3.c(q3Var, companion2, 0.5f, false, 2, null);
            ed.Companion companion4 = ed.INSTANCE;
            int iC = companion4.c();
            Locale locale = l0Var.getLocale();
            int i17 = i16 & 896;
            int i18 = i16 & 112;
            boolean z15 = (i18 == 32) | (i17 == 256);
            Object objE3 = rVarH.E();
            if (z15 || objE3 == r.INSTANCE.a()) {
                objE3 = new l() { // from class: f2.o8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.m(pVar, l16, (Long) obj);
                    }
                };
                rVarH.v(objE3);
            }
            int i19 = i16 & 7168;
            int i25 = i16 >> 21;
            int i26 = i25 & 14;
            int i27 = i16;
            rVar2 = rVarH;
            boolean z16 = false;
            t4.r(mVarC, l15, (l) objE3, l0Var, y2.m.d(1740538748, true, new p() { // from class: f2.q8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z8.n(strB5, upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1229526589, true, new p() { // from class: f2.r8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z8.p(upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), iC, u4Var2, dateInputFormat, locale, w4Var, d0Var, rVar2, ((i16 << 3) & 112) | 1794048 | i19, i25 & 126);
            final String strB6 = b2.b(a2.a(ih.D), rVar2, 0);
            m mVarC2 = p3.c(q3Var, companion2, 0.5f, false, 2, null);
            int iA = companion4.a();
            Locale locale2 = l0Var.getLocale();
            boolean z17 = i17 == 256;
            if ((i27 & 14) == 4) {
                z16 = true;
            }
            boolean z18 = z17 | z16;
            Object objE4 = rVar2.E();
            if (z18 || objE4 == r.INSTANCE.a()) {
                pVar2 = pVar;
                objE4 = new l() { // from class: f2.s8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.r(pVar2, l15, (Long) obj);
                    }
                };
                rVar2.v(objE4);
            } else {
                pVar2 = pVar;
            }
            t4.r(mVarC2, l16, (l) objE4, l0Var, y2.m.d(-882370893, true, new p() { // from class: f2.t8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z8.s(strB6, upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), y2.m.d(1956183348, true, new p() { // from class: f2.u8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z8.u(upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), iA, u4Var2, dateInputFormat, locale2, w4Var, null, rVar2, i18 | 1794048 | i19, i26 | 48);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            pVar2 = pVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final p<? super Long, ? super Long, i0> pVar3 = pVar2;
            d5VarM.a(new p() { // from class: f2.v8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z8.w(l15, l16, pVar3, l0Var, iVar, h5Var, piVar, w4Var, d0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(p pVar, Long l15, Long l16) {
        pVar.B(l16, l15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final String str, final String str2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1740538748, i15, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:80)");
            }
            m.Companion companion = m.INSTANCE;
            boolean zW = rVar.W(str) | rVar.W(str2);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.y8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.o(str, str2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.d(companion, false, (l) objE, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(String str, String str2, n4.i0 i0Var) {
        f0.c0(i0Var, str + ", " + str2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1229526589, i15, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:86)");
            }
            m.Companion companion = m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.w8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.q((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.a(companion, (l) objE), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p pVar, Long l15, Long l16) {
        pVar.B(l15, l16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final String str, final String str2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-882370893, i15, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:104)");
            }
            m.Companion companion = m.INSTANCE;
            boolean zW = rVar.W(str) | rVar.W(str2);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.x8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.t(str, str2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.d(companion, false, (l) objE, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(String str, String str2, n4.i0 i0Var) {
        f0.c0(i0Var, str + ", " + str2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1956183348, i15, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:109)");
            }
            m.Companion companion = m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.p8
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z8.v((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.a(companion, (l) objE), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(Long l15, Long l16, p pVar, l0 l0Var, i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, int i15, r rVar, int i16) {
        l(l15, l16, pVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
