package u50;

import androidx.compose.ui.platform.g1;
import d1.r3;
import j30.ButtonTextData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p030d20.Function0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv50/c;", "data", "Ld60/c;", "focusHost", "Loq/i0;", "g", "(Lv50/c;Ld60/c;Lm2/r;II)V", "k", "(Lv50/c;Ld60/c;Lm2/r;I)V", "Lhz/b;", "first", "second", "o", "(Lhz/b;Lhz/b;)Lhz/b;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v0 {
    public static final void g(final v50.c cVar, final d60.c cVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-103605809);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.W(cVar2)) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                cVar2 = d60.e.b(false, cVar.m(), rVarH, 0, 1);
                i17 &= -113;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-103605809, i17, -1, "pl.gov.coi.common.ui.ds.textinput.TextInput (TextInput.kt:35)");
            }
            d60.m.c(cVar.getFieldIndex(), y2.m.d(-325846973, true, new er.p() { // from class: u50.p0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.h(cVar, cVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.q0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.j(cVar, cVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(final v50.c cVar, final d60.c cVar2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-325846973, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextInput.<anonymous> (TextInput.kt:37)");
            }
            Function0.c(y2.m.d(-762840213, true, new er.p() { // from class: u50.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.i(cVar, cVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(v50.c cVar, d60.c cVar2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-762840213, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextInput.<anonymous>.<anonymous> (TextInput.kt:38)");
            }
            k(cVar, cVar2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(v50.c cVar, d60.c cVar2, int i15, int i16, p076m2.r rVar, int i17) {
        g(cVar, cVar2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0249  */
    /* JADX WARN: Code duplicated, block: B:59:0x024d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0251  */
    /* JADX WARN: Code duplicated, block: B:62:0x0256  */
    /* JADX WARN: Code duplicated, block: B:65:0x0264  */
    /* JADX WARN: Code duplicated, block: B:67:0x0283  */
    /* JADX WARN: Code duplicated, block: B:68:0x0295  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x02be  */
    /* JADX WARN: Code duplicated, block: B:75:0x02da  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x0304  */
    /* JADX WARN: Code duplicated, block: B:83:0x030e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0338  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0283, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x02da, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    private static final void k(final v50.c cVar, final d60.c cVar2, p076m2.r rVar, final int i15) {
        int i16;
        String str;
        long jD;
        hz.b bVar;
        p076m2.r rVar2;
        int i17;
        f3.m.Companion companion;
        v50.c.PhoneNumber phoneNumber;
        hz.b countryCodeValidationState;
        hz.b bVarO;
        Label helperText;
        String testTag;
        String str2;
        ButtonTextData infoButtonData;
        String testTag2;
        String str3;
        p076m2.r rVarH = rVar.h(1755804178);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1755804178, i16, -1, "pl.gov.coi.common.ui.ds.textinput.TextInputInternal (TextInput.kt:50)");
            }
            final l3.o oVar = (l3.o) rVarH.N(g1.g());
            d60.c.Companion companion2 = d60.c.INSTANCE;
            f3.m.Companion companion3 = f3.m.INSTANCE;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u50.s0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v0.l((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = androidx.compose.foundation.layout.d.C(companion2.d(n4.v.d(companion3, false, (er.l) objE, 1, null), cVar2), null, false, 3, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label label = cVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String();
            if (label == null) {
                rVarH.X(-299618462);
                rVarH.R();
                rVar2 = rVarH;
                bVar = null;
            } else {
                rVarH.X(-299618461);
                String testTag3 = cVar.getTestTag();
                if (testTag3 != null) {
                    str = testTag3 + "Text";
                } else {
                    str = null;
                }
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                TextStyle textStyleD = aVar.f(rVarH, i18).d();
                if (cVar.getEnabled()) {
                    rVarH.X(-680578345);
                    jD = aVar.a(rVarH, i18).getNeutral().b();
                    rVarH.R();
                } else {
                    rVarH.X(-680576649);
                    jD = aVar.a(rVarH, i18).getNeutral().d();
                    rVarH.R();
                }
                bVar = null;
                j70.h.g(null, str, label, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, true, null, rVarH, 0, 0, 3072, 24641497);
                rVar2 = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i18).getSpacing50()), rVar2, 0);
                rVar2.R();
            }
            if (cVar instanceof v50.c.Pin) {
                rVar2.X(-1395122742);
                o0.l((v50.c.Pin) cVar, cVar2, oVar, rVar2, i16 & 126);
                rVar2.R();
            } else {
                if (cVar instanceof v50.c.PhoneNumber) {
                    rVar2.X(-1395117934);
                    f0.d((v50.c.PhoneNumber) cVar, cVar2, oVar, rVar2, i16 & 126);
                    rVar2.R();
                } else {
                    rVar2.X(-1395113469);
                    i17 = 0;
                    p076m2.r rVar3 = rVar2;
                    companion = companion3;
                    rVarH = rVar3;
                    p030d20.d.d(cVar2, 0, 0, cVar.getEnabled(), y2.m.d(1390680296, true, new er.q() { // from class: u50.t0
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return v0.m(cVar, cVar2, oVar, (er.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVar2, 54), rVarH, ((i16 >> 3) & 14) | 24576, 6);
                    rVarH.R();
                }
                if (cVar instanceof v50.c.PhoneNumber) {
                    phoneNumber = (v50.c.PhoneNumber) cVar;
                } else {
                    phoneNumber = bVar;
                }
                if (phoneNumber != null) {
                    countryCodeValidationState = phoneNumber.getCountryCodeValidationState();
                } else {
                    countryCodeValidationState = bVar;
                }
                bVarO = o(countryCodeValidationState, cVar.getValidationState());
                if (bVarO instanceof hz.b.Invalid) {
                    rVarH.X(-298276006);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i17);
                    testTag2 = cVar.getTestTag();
                    if (testTag2 != null) {
                        str3 = testTag2 + "ErrorText";
                    } else {
                        str3 = bVar;
                    }
                    l40.d.d(str3, ((hz.b.Invalid) bVarO).getMessage(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-297977135);
                    helperText = cVar.getHelperText();
                    if (helperText == null) {
                        rVarH.X(-297977136);
                        rVarH.R();
                    } else {
                        rVarH.X(-297977135);
                        r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i17);
                        testTag = cVar.getTestTag();
                        if (testTag != null) {
                            str2 = testTag + "HelperText";
                        } else {
                            str2 = bVar;
                        }
                        p40.b.b(str2, helperText, true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                        rVarH.R();
                        oq.i0 i0Var2 = oq.i0.f148189a;
                    }
                    rVarH.R();
                }
                infoButtonData = cVar.getInfoButtonData();
                if (infoButtonData == null) {
                    rVarH.X(-297673801);
                } else {
                    rVarH.X(-297673800);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i17);
                    j30.f.e(null, infoButtonData, false, rVarH, 0, 5);
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            i17 = 0;
            rVarH = rVar2;
            companion = companion3;
            if (cVar instanceof v50.c.PhoneNumber) {
                phoneNumber = (v50.c.PhoneNumber) cVar;
            } else {
                phoneNumber = bVar;
            }
            if (phoneNumber != null) {
                countryCodeValidationState = phoneNumber.getCountryCodeValidationState();
            } else {
                countryCodeValidationState = bVar;
            }
            bVarO = o(countryCodeValidationState, cVar.getValidationState());
            if (bVarO instanceof hz.b.Invalid) {
                rVarH.X(-298276006);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i17);
                testTag2 = cVar.getTestTag();
                if (testTag2 != null) {
                    str3 = testTag2 + "ErrorText";
                } else {
                    str3 = bVar;
                }
                l40.d.d(str3, ((hz.b.Invalid) bVarO).getMessage(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                rVarH.R();
            } else {
                rVarH.X(-297977135);
                helperText = cVar.getHelperText();
                if (helperText == null) {
                    rVarH.X(-297977136);
                    rVarH.R();
                } else {
                    rVarH.X(-297977135);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i17);
                    testTag = cVar.getTestTag();
                    if (testTag != null) {
                        str2 = testTag + "HelperText";
                    } else {
                        str2 = bVar;
                    }
                    p40.b.b(str2, helperText, true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                    rVarH.R();
                    oq.i0 i0Var3 = oq.i0.f148189a;
                }
                rVarH.R();
            }
            infoButtonData = cVar.getInfoButtonData();
            if (infoButtonData == null) {
                rVarH.X(-297673801);
            } else {
                rVarH.X(-297673800);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i17);
                j30.f.e(null, infoButtonData, false, rVarH, 0, 5);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.u0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v0.n(cVar, cVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(v50.c cVar, d60.c cVar2, l3.o oVar, er.l lVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.G(lVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1390680296, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextInputInternal.<anonymous>.<anonymous> (TextInput.kt:93)");
            }
            b0.X(cVar, cVar2, oVar, lVar, rVar, (i15 << 9) & 7168, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(v50.c cVar, d60.c cVar2, int i15, p076m2.r rVar, int i16) {
        k(cVar, cVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final hz.b o(hz.b bVar, hz.b bVar2) {
        boolean z15 = bVar instanceof hz.b.Invalid;
        if (z15 && (bVar2 instanceof hz.b.Invalid)) {
            return new hz.b.Invalid(((hz.b.Invalid) bVar).getMessage().o(Label.INSTANCE.d()).o(((hz.b.Invalid) bVar2).getMessage()));
        }
        if (z15) {
            return bVar;
        }
        return bVar2 instanceof hz.b.Invalid ? bVar2 : hz.b.d.f86848c;
    }
}
