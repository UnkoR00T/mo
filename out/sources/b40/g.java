package b40;

import androidx.compose.ui.platform.g1;
import b5.v;
import er.l;
import er.p;
import f3.m;
import l3.o;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p079n1.t0;
import q4.TextLayoutResult;
import q4.TextStyle;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001as\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq4/e;", "annotatedText", "Lq4/b4;", "style", "", "softWrap", "Lb5/v;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lb40/i;", "semanticsData", "", "onClick", "g", "(Lq4/e;Lq4/b4;ZIILer/l;Lb40/i;Ler/l;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x017e  */
    /* JADX WARN: Code duplicated, block: B:122:0x019d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:131:0x0206  */
    /* JADX WARN: Code duplicated, block: B:132:0x0209  */
    /* JADX WARN: Code duplicated, block: B:135:0x0212  */
    /* JADX WARN: Code duplicated, block: B:136:0x0215  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:144:0x0260  */
    /* JADX WARN: Code duplicated, block: B:147:0x0267  */
    /* JADX WARN: Code duplicated, block: B:150:0x0279  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @oq.a
    public static final void g(final q4.e eVar, TextStyle textStyle, boolean z15, int i15, int i16, l<? super TextLayoutResult, i0> lVar, SemanticsData semanticsData, final l<? super String, i0> lVar2, r rVar, final int i17, final int i18) {
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        l<? super TextLayoutResult, i0> lVar3;
        int i39;
        boolean z16;
        final TextStyle textStyle2;
        final boolean z17;
        final SemanticsData semanticsData2;
        final int i45;
        final int i46;
        final l<? super TextLayoutResult, i0> lVar4;
        d5 d5VarM;
        TextStyle textStyleA;
        boolean z18;
        int iA;
        int i47;
        SemanticsData semanticsData3;
        l<? super TextLayoutResult, i0> lVar5;
        boolean z19;
        Object objE;
        final o oVar;
        Object objE2;
        r.Companion companion;
        final cx.a aVar;
        Object objE3;
        int i48;
        String semanticsContentDescription;
        int i49;
        boolean z25;
        boolean z26;
        boolean zG;
        Object objE4;
        int i55;
        int i56;
        r rVarH = rVar.h(-4951533);
        if ((i17 & 6) == 0) {
            i19 = (rVarH.W(eVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i57 = i18 & 2;
        if (i57 == 0) {
            if ((i17 & 48) == 0) {
                i19 |= rVarH.W(textStyle) ? 32 : 16;
            }
            i25 = i18 & 4;
            if (i25 != 0) {
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.a(z15)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i19 |= i26;
                }
                i27 = i18 & 8;
                if (i27 != 0) {
                    if ((i17 & 3072) == 0) {
                        i28 = i15;
                        if (rVarH.c(i28)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i19 |= i29;
                    }
                    i35 = i18 & 16;
                    if (i35 != 0) {
                        if ((i17 & 24576) == 0) {
                            i36 = i16;
                            if (rVarH.c(i36)) {
                                i37 = 16384;
                            } else {
                                i37 = PKIFailureInfo.certRevoked;
                            }
                            i19 |= i37;
                        }
                        i38 = i18 & 32;
                        if (i38 != 0) {
                            i19 |= 196608;
                            lVar3 = lVar;
                        } else {
                            lVar3 = lVar;
                            if ((i17 & 196608) == 0) {
                                if (rVarH.G(lVar3)) {
                                    i39 = PKIFailureInfo.unsupportedVersion;
                                } else {
                                    i39 = PKIFailureInfo.notAuthorized;
                                }
                                i19 |= i39;
                            }
                        }
                        if ((i17 & 1572864) != 0) {
                            if ((i18 & 64) == 0 || !rVarH.W(semanticsData)) {
                                i56 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i56 = PKIFailureInfo.badCertTemplate;
                            }
                            i19 |= i56;
                        }
                        if ((i17 & 12582912) == 0) {
                            if (rVarH.G(lVar2)) {
                                i55 = 8388608;
                            } else {
                                i55 = 4194304;
                            }
                            i19 |= i55;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (rVarH.r(z16, i19 & 1)) {
                            rVarH.I();
                            if ((i17 & 1) != 0 || rVarH.Q()) {
                                if (i57 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle;
                                }
                                if (i25 != 0) {
                                    z18 = true;
                                } else {
                                    z18 = z15;
                                }
                                if (i27 != 0) {
                                    iA = v.INSTANCE.a();
                                } else {
                                    iA = i28;
                                }
                                if (i35 != 0) {
                                    i47 = Integer.MAX_VALUE;
                                } else {
                                    i47 = i36;
                                }
                                if (i38 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new l() { // from class: b40.a
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return g.h((TextLayoutResult) obj);
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    lVar3 = (l) objE;
                                }
                                if ((i18 & 64) != 0) {
                                    i19 &= -3670017;
                                    i36 = i47;
                                    semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                    i28 = iA;
                                    lVar5 = lVar3;
                                    z19 = z18;
                                } else {
                                    semanticsData3 = semanticsData;
                                    lVar5 = lVar3;
                                    i36 = i47;
                                    z19 = z18;
                                    i28 = iA;
                                }
                            } else {
                                rVarH.O();
                                if ((i18 & 64) != 0) {
                                    i19 &= -3670017;
                                }
                                textStyleA = textStyle;
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                z19 = z15;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                            }
                            oVar = (o) rVarH.N(g1.g());
                            objE2 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = s.I();
                                rVarH.v(objE2);
                            }
                            aVar = (cx.a) objE2;
                            m.Companion companion2 = m.INSTANCE;
                            objE3 = rVarH.E();
                            if (objE3 == companion.a()) {
                                objE3 = new l() { // from class: b40.b
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.i((n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            TextStyle textStyle3 = textStyleA;
                            i48 = i19;
                            m mVarC = n4.v.c(n4.v.d(companion2, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                            semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                            if (semanticsContentDescription == null) {
                                semanticsContentDescription = eVar.getText();
                            }
                            boolean z27 = z19;
                            int i58 = i28;
                            m mVarO = t70.i.O(mVarC, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                            boolean zG2 = rVarH.G(aVar);
                            i49 = i48 & 14;
                            if (i49 == 4) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z28 = zG2 | z25;
                            if ((i48 & 29360128) == 8388608) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            zG = z28 | z26 | rVarH.G(oVar);
                            objE4 = rVarH.E();
                            if (zG || objE4 == companion.a()) {
                                objE4 = new l() { // from class: b40.c
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            l lVar6 = (l) objE4;
                            int i59 = i48 << 3;
                            int i65 = (i59 & 896) | i49 | (i59 & 7168) | (57344 & i59) | (458752 & i59) | (i59 & 3670016);
                            z17 = z27;
                            i45 = i58;
                            l<? super TextLayoutResult, i0> lVar7 = lVar5;
                            i46 = i36;
                            textStyle2 = textStyle3;
                            t0.d(eVar, mVarO, textStyle2, z17, i45, i46, lVar7, lVar6, rVarH, i65, 0);
                            lVar3 = lVar7;
                            rVarH = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            semanticsData2 = semanticsData3;
                        } else {
                            rVarH.O();
                            textStyle2 = textStyle;
                            z17 = z15;
                            semanticsData2 = semanticsData;
                            i45 = i28;
                            i46 = i36;
                        }
                        r rVar2 = rVarH;
                        lVar4 = lVar3;
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: b40.d
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 24576;
                    i36 = i16;
                    i38 = i18 & 32;
                    if (i38 != 0) {
                        i19 |= 196608;
                        lVar3 = lVar;
                    } else {
                        lVar3 = lVar;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.G(lVar3)) {
                                i39 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i39 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i39;
                        }
                    }
                    if ((i17 & 1572864) != 0) {
                        if ((i18 & 64) == 0) {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i56;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i55 = 8388608;
                        } else {
                            i55 = 4194304;
                        }
                        i19 |= i55;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        } else {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                        }
                        oVar = (o) rVarH.N(g1.g());
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = s.I();
                            rVarH.v(objE2);
                        }
                        aVar = (cx.a) objE2;
                        m.Companion companion3 = m.INSTANCE;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new l() { // from class: b40.b
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.i((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        TextStyle textStyle4 = textStyleA;
                        i48 = i19;
                        m mVarC2 = n4.v.c(n4.v.d(companion3, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                        semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                        if (semanticsContentDescription == null) {
                            semanticsContentDescription = eVar.getText();
                        }
                        boolean z29 = z19;
                        int i510 = i28;
                        m mVarO2 = t70.i.O(mVarC2, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                        boolean zG3 = rVarH.G(aVar);
                        i49 = i48 & 14;
                        if (i49 == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z210 = zG3 | z25;
                        if ((i48 & 29360128) == 8388608) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zG = z210 | z26 | rVarH.G(oVar);
                        objE4 = rVarH.E();
                        if (zG) {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        }
                        l lVar8 = (l) objE4;
                        int i511 = i48 << 3;
                        int i66 = (i511 & 896) | i49 | (i511 & 7168) | (57344 & i511) | (458752 & i511) | (i511 & 3670016);
                        z17 = z29;
                        i45 = i510;
                        l<? super TextLayoutResult, i0> lVar9 = lVar5;
                        i46 = i36;
                        textStyle2 = textStyle4;
                        t0.d(eVar, mVarO2, textStyle2, z17, i45, i46, lVar9, lVar8, rVarH, i66, 0);
                        lVar3 = lVar9;
                        rVarH = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        semanticsData2 = semanticsData3;
                    } else {
                        rVarH.O();
                        textStyle2 = textStyle;
                        z17 = z15;
                        semanticsData2 = semanticsData;
                        i45 = i28;
                        i46 = i36;
                    }
                    r rVar3 = rVarH;
                    lVar4 = lVar3;
                    d5VarM = rVar3.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: b40.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 3072;
                i28 = i15;
                i35 = i18 & 16;
                if (i35 != 0) {
                    if ((i17 & 24576) == 0) {
                        i36 = i16;
                        if (rVarH.c(i36)) {
                            i37 = 16384;
                        } else {
                            i37 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 32;
                    if (i38 != 0) {
                        i19 |= 196608;
                        lVar3 = lVar;
                    } else {
                        lVar3 = lVar;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.G(lVar3)) {
                                i39 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i39 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i39;
                        }
                    }
                    if ((i17 & 1572864) != 0) {
                        if ((i18 & 64) == 0) {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i56;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i55 = 8388608;
                        } else {
                            i55 = 4194304;
                        }
                        i19 |= i55;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        } else {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                        }
                        oVar = (o) rVarH.N(g1.g());
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = s.I();
                            rVarH.v(objE2);
                        }
                        aVar = (cx.a) objE2;
                        m.Companion companion4 = m.INSTANCE;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new l() { // from class: b40.b
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.i((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        TextStyle textStyle5 = textStyleA;
                        i48 = i19;
                        m mVarC3 = n4.v.c(n4.v.d(companion4, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                        semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                        if (semanticsContentDescription == null) {
                            semanticsContentDescription = eVar.getText();
                        }
                        boolean z211 = z19;
                        int i512 = i28;
                        m mVarO3 = t70.i.O(mVarC3, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                        boolean zG4 = rVarH.G(aVar);
                        i49 = i48 & 14;
                        if (i49 == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z212 = zG4 | z25;
                        if ((i48 & 29360128) == 8388608) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zG = z212 | z26 | rVarH.G(oVar);
                        objE4 = rVarH.E();
                        if (zG) {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        }
                        l lVar10 = (l) objE4;
                        int i513 = i48 << 3;
                        int i67 = (i513 & 896) | i49 | (i513 & 7168) | (57344 & i513) | (458752 & i513) | (i513 & 3670016);
                        z17 = z211;
                        i45 = i512;
                        l<? super TextLayoutResult, i0> lVar11 = lVar5;
                        i46 = i36;
                        textStyle2 = textStyle5;
                        t0.d(eVar, mVarO3, textStyle2, z17, i45, i46, lVar11, lVar10, rVarH, i67, 0);
                        lVar3 = lVar11;
                        rVarH = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        semanticsData2 = semanticsData3;
                    } else {
                        rVarH.O();
                        textStyle2 = textStyle;
                        z17 = z15;
                        semanticsData2 = semanticsData;
                        i45 = i28;
                        i46 = i36;
                    }
                    r rVar4 = rVarH;
                    lVar4 = lVar3;
                    d5VarM = rVar4.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: b40.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                i36 = i16;
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion5 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle6 = textStyleA;
                    i48 = i19;
                    m mVarC4 = n4.v.c(n4.v.d(companion5, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z213 = z19;
                    int i514 = i28;
                    m mVarO4 = t70.i.O(mVarC4, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG5 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z214 = zG5 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z214 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar12 = (l) objE4;
                    int i515 = i48 << 3;
                    int i68 = (i515 & 896) | i49 | (i515 & 7168) | (57344 & i515) | (458752 & i515) | (i515 & 3670016);
                    z17 = z213;
                    i45 = i514;
                    l<? super TextLayoutResult, i0> lVar13 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle6;
                    t0.d(eVar, mVarO4, textStyle2, z17, i45, i46, lVar13, lVar12, rVarH, i68, 0);
                    lVar3 = lVar13;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar5 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar5.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= MLKEMEngine.KyberPolyBytes;
            i27 = i18 & 8;
            if (i27 != 0) {
                if ((i17 & 3072) == 0) {
                    i28 = i15;
                    if (rVarH.c(i28)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i19 |= i29;
                }
                i35 = i18 & 16;
                if (i35 != 0) {
                    if ((i17 & 24576) == 0) {
                        i36 = i16;
                        if (rVarH.c(i36)) {
                            i37 = 16384;
                        } else {
                            i37 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 32;
                    if (i38 != 0) {
                        i19 |= 196608;
                        lVar3 = lVar;
                    } else {
                        lVar3 = lVar;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.G(lVar3)) {
                                i39 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i39 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i39;
                        }
                    }
                    if ((i17 & 1572864) != 0) {
                        if ((i18 & 64) == 0) {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i56;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i55 = 8388608;
                        } else {
                            i55 = 4194304;
                        }
                        i19 |= i55;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        } else {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                        }
                        oVar = (o) rVarH.N(g1.g());
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = s.I();
                            rVarH.v(objE2);
                        }
                        aVar = (cx.a) objE2;
                        m.Companion companion6 = m.INSTANCE;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new l() { // from class: b40.b
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.i((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        TextStyle textStyle7 = textStyleA;
                        i48 = i19;
                        m mVarC5 = n4.v.c(n4.v.d(companion6, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                        semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                        if (semanticsContentDescription == null) {
                            semanticsContentDescription = eVar.getText();
                        }
                        boolean z215 = z19;
                        int i516 = i28;
                        m mVarO5 = t70.i.O(mVarC5, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                        boolean zG6 = rVarH.G(aVar);
                        i49 = i48 & 14;
                        if (i49 == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z216 = zG6 | z25;
                        if ((i48 & 29360128) == 8388608) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zG = z216 | z26 | rVarH.G(oVar);
                        objE4 = rVarH.E();
                        if (zG) {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        }
                        l lVar14 = (l) objE4;
                        int i517 = i48 << 3;
                        int i69 = (i517 & 896) | i49 | (i517 & 7168) | (57344 & i517) | (458752 & i517) | (i517 & 3670016);
                        z17 = z215;
                        i45 = i516;
                        l<? super TextLayoutResult, i0> lVar15 = lVar5;
                        i46 = i36;
                        textStyle2 = textStyle7;
                        t0.d(eVar, mVarO5, textStyle2, z17, i45, i46, lVar15, lVar14, rVarH, i69, 0);
                        lVar3 = lVar15;
                        rVarH = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        semanticsData2 = semanticsData3;
                    } else {
                        rVarH.O();
                        textStyle2 = textStyle;
                        z17 = z15;
                        semanticsData2 = semanticsData;
                        i45 = i28;
                        i46 = i36;
                    }
                    r rVar6 = rVarH;
                    lVar4 = lVar3;
                    d5VarM = rVar6.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: b40.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                i36 = i16;
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion7 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle8 = textStyleA;
                    i48 = i19;
                    m mVarC6 = n4.v.c(n4.v.d(companion7, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z217 = z19;
                    int i518 = i28;
                    m mVarO6 = t70.i.O(mVarC6, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG7 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z218 = zG7 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z218 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar16 = (l) objE4;
                    int i519 = i48 << 3;
                    int i610 = (i519 & 896) | i49 | (i519 & 7168) | (57344 & i519) | (458752 & i519) | (i519 & 3670016);
                    z17 = z217;
                    i45 = i518;
                    l<? super TextLayoutResult, i0> lVar17 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle8;
                    t0.d(eVar, mVarO6, textStyle2, z17, i45, i46, lVar17, lVar16, rVarH, i610, 0);
                    lVar3 = lVar17;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar7 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar7.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            i28 = i15;
            i35 = i18 & 16;
            if (i35 != 0) {
                if ((i17 & 24576) == 0) {
                    i36 = i16;
                    if (rVarH.c(i36)) {
                        i37 = 16384;
                    } else {
                        i37 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion8 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle9 = textStyleA;
                    i48 = i19;
                    m mVarC7 = n4.v.c(n4.v.d(companion8, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z219 = z19;
                    int i5110 = i28;
                    m mVarO7 = t70.i.O(mVarC7, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG8 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2110 = zG8 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z2110 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar18 = (l) objE4;
                    int i5111 = i48 << 3;
                    int i611 = (i5111 & 896) | i49 | (i5111 & 7168) | (57344 & i5111) | (458752 & i5111) | (i5111 & 3670016);
                    z17 = z219;
                    i45 = i5110;
                    l<? super TextLayoutResult, i0> lVar19 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle9;
                    t0.d(eVar, mVarO7, textStyle2, z17, i45, i46, lVar19, lVar18, rVarH, i611, 0);
                    lVar3 = lVar19;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar8 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar8.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            i36 = i16;
            i38 = i18 & 32;
            if (i38 != 0) {
                i19 |= 196608;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar3)) {
                        i39 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i39;
                }
            }
            if ((i17 & 1572864) != 0) {
                if ((i18 & 64) == 0) {
                    i56 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i56 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i56;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i19 |= i55;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                } else {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                }
                oVar = (o) rVarH.N(g1.g());
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                m.Companion companion9 = m.INSTANCE;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new l() { // from class: b40.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.i((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                TextStyle textStyle10 = textStyleA;
                i48 = i19;
                m mVarC8 = n4.v.c(n4.v.d(companion9, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                if (semanticsContentDescription == null) {
                    semanticsContentDescription = eVar.getText();
                }
                boolean z2111 = z19;
                int i5112 = i28;
                m mVarO8 = t70.i.O(mVarC8, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                boolean zG9 = rVarH.G(aVar);
                i49 = i48 & 14;
                if (i49 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2112 = zG9 | z25;
                if ((i48 & 29360128) == 8388608) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = z2112 | z26 | rVarH.G(oVar);
                objE4 = rVarH.E();
                if (zG) {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                }
                l lVar110 = (l) objE4;
                int i5113 = i48 << 3;
                int i612 = (i5113 & 896) | i49 | (i5113 & 7168) | (57344 & i5113) | (458752 & i5113) | (i5113 & 3670016);
                z17 = z2111;
                i45 = i5112;
                l<? super TextLayoutResult, i0> lVar111 = lVar5;
                i46 = i36;
                textStyle2 = textStyle10;
                t0.d(eVar, mVarO8, textStyle2, z17, i45, i46, lVar111, lVar110, rVarH, i612, 0);
                lVar3 = lVar111;
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                semanticsData2 = semanticsData3;
            } else {
                rVarH.O();
                textStyle2 = textStyle;
                z17 = z15;
                semanticsData2 = semanticsData;
                i45 = i28;
                i46 = i36;
            }
            r rVar9 = rVarH;
            lVar4 = lVar3;
            d5VarM = rVar9.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b40.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 48;
        i25 = i18 & 4;
        if (i25 != 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.a(z15)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i19 |= i26;
            }
            i27 = i18 & 8;
            if (i27 != 0) {
                if ((i17 & 3072) == 0) {
                    i28 = i15;
                    if (rVarH.c(i28)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i19 |= i29;
                }
                i35 = i18 & 16;
                if (i35 != 0) {
                    if ((i17 & 24576) == 0) {
                        i36 = i16;
                        if (rVarH.c(i36)) {
                            i37 = 16384;
                        } else {
                            i37 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 32;
                    if (i38 != 0) {
                        i19 |= 196608;
                        lVar3 = lVar;
                    } else {
                        lVar3 = lVar;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.G(lVar3)) {
                                i39 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i39 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i39;
                        }
                    }
                    if ((i17 & 1572864) != 0) {
                        if ((i18 & 64) == 0) {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i56 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i56;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i55 = 8388608;
                        } else {
                            i55 = 4194304;
                        }
                        i19 |= i55;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        } else {
                            if (i57 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i27 != 0) {
                                iA = v.INSTANCE.a();
                            } else {
                                iA = i28;
                            }
                            if (i35 != 0) {
                                i47 = Integer.MAX_VALUE;
                            } else {
                                i47 = i36;
                            }
                            if (i38 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: b40.a
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return g.h((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar3 = (l) objE;
                            }
                            if ((i18 & 64) != 0) {
                                i19 &= -3670017;
                                i36 = i47;
                                semanticsData3 = new SemanticsData(false, null, null, 7, null);
                                i28 = iA;
                                lVar5 = lVar3;
                                z19 = z18;
                            } else {
                                semanticsData3 = semanticsData;
                                lVar5 = lVar3;
                                i36 = i47;
                                z19 = z18;
                                i28 = iA;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                        }
                        oVar = (o) rVarH.N(g1.g());
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = s.I();
                            rVarH.v(objE2);
                        }
                        aVar = (cx.a) objE2;
                        m.Companion companion10 = m.INSTANCE;
                        objE3 = rVarH.E();
                        if (objE3 == companion.a()) {
                            objE3 = new l() { // from class: b40.b
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.i((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        TextStyle textStyle11 = textStyleA;
                        i48 = i19;
                        m mVarC9 = n4.v.c(n4.v.d(companion10, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                        semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                        if (semanticsContentDescription == null) {
                            semanticsContentDescription = eVar.getText();
                        }
                        boolean z2113 = z19;
                        int i5114 = i28;
                        m mVarO9 = t70.i.O(mVarC9, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                        boolean zG10 = rVarH.G(aVar);
                        i49 = i48 & 14;
                        if (i49 == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z2114 = zG10 | z25;
                        if ((i48 & 29360128) == 8388608) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zG = z2114 | z26 | rVarH.G(oVar);
                        objE4 = rVarH.E();
                        if (zG) {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: b40.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                                }
                            };
                            rVarH.v(objE4);
                        }
                        l lVar112 = (l) objE4;
                        int i5115 = i48 << 3;
                        int i613 = (i5115 & 896) | i49 | (i5115 & 7168) | (57344 & i5115) | (458752 & i5115) | (i5115 & 3670016);
                        z17 = z2113;
                        i45 = i5114;
                        l<? super TextLayoutResult, i0> lVar113 = lVar5;
                        i46 = i36;
                        textStyle2 = textStyle11;
                        t0.d(eVar, mVarO9, textStyle2, z17, i45, i46, lVar113, lVar112, rVarH, i613, 0);
                        lVar3 = lVar113;
                        rVarH = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        semanticsData2 = semanticsData3;
                    } else {
                        rVarH.O();
                        textStyle2 = textStyle;
                        z17 = z15;
                        semanticsData2 = semanticsData;
                        i45 = i28;
                        i46 = i36;
                    }
                    r rVar10 = rVarH;
                    lVar4 = lVar3;
                    d5VarM = rVar10.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: b40.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                i36 = i16;
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion11 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle12 = textStyleA;
                    i48 = i19;
                    m mVarC10 = n4.v.c(n4.v.d(companion11, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z2115 = z19;
                    int i5116 = i28;
                    m mVarO10 = t70.i.O(mVarC10, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG11 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2116 = zG11 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z2116 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar114 = (l) objE4;
                    int i5117 = i48 << 3;
                    int i614 = (i5117 & 896) | i49 | (i5117 & 7168) | (57344 & i5117) | (458752 & i5117) | (i5117 & 3670016);
                    z17 = z2115;
                    i45 = i5116;
                    l<? super TextLayoutResult, i0> lVar115 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle12;
                    t0.d(eVar, mVarO10, textStyle2, z17, i45, i46, lVar115, lVar114, rVarH, i614, 0);
                    lVar3 = lVar115;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar11 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar11.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            i28 = i15;
            i35 = i18 & 16;
            if (i35 != 0) {
                if ((i17 & 24576) == 0) {
                    i36 = i16;
                    if (rVarH.c(i36)) {
                        i37 = 16384;
                    } else {
                        i37 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion12 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle13 = textStyleA;
                    i48 = i19;
                    m mVarC11 = n4.v.c(n4.v.d(companion12, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z2117 = z19;
                    int i5118 = i28;
                    m mVarO11 = t70.i.O(mVarC11, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG12 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2118 = zG12 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z2118 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar116 = (l) objE4;
                    int i5119 = i48 << 3;
                    int i615 = (i5119 & 896) | i49 | (i5119 & 7168) | (57344 & i5119) | (458752 & i5119) | (i5119 & 3670016);
                    z17 = z2117;
                    i45 = i5118;
                    l<? super TextLayoutResult, i0> lVar117 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle13;
                    t0.d(eVar, mVarO11, textStyle2, z17, i45, i46, lVar117, lVar116, rVarH, i615, 0);
                    lVar3 = lVar117;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar12 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar12.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            i36 = i16;
            i38 = i18 & 32;
            if (i38 != 0) {
                i19 |= 196608;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar3)) {
                        i39 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i39;
                }
            }
            if ((i17 & 1572864) != 0) {
                if ((i18 & 64) == 0) {
                    i56 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i56 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i56;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i19 |= i55;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                } else {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                }
                oVar = (o) rVarH.N(g1.g());
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                m.Companion companion13 = m.INSTANCE;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new l() { // from class: b40.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.i((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                TextStyle textStyle14 = textStyleA;
                i48 = i19;
                m mVarC12 = n4.v.c(n4.v.d(companion13, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                if (semanticsContentDescription == null) {
                    semanticsContentDescription = eVar.getText();
                }
                boolean z2119 = z19;
                int i51110 = i28;
                m mVarO12 = t70.i.O(mVarC12, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                boolean zG13 = rVarH.G(aVar);
                i49 = i48 & 14;
                if (i49 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z21110 = zG13 | z25;
                if ((i48 & 29360128) == 8388608) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = z21110 | z26 | rVarH.G(oVar);
                objE4 = rVarH.E();
                if (zG) {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                }
                l lVar118 = (l) objE4;
                int i51111 = i48 << 3;
                int i616 = (i51111 & 896) | i49 | (i51111 & 7168) | (57344 & i51111) | (458752 & i51111) | (i51111 & 3670016);
                z17 = z2119;
                i45 = i51110;
                l<? super TextLayoutResult, i0> lVar119 = lVar5;
                i46 = i36;
                textStyle2 = textStyle14;
                t0.d(eVar, mVarO12, textStyle2, z17, i45, i46, lVar119, lVar118, rVarH, i616, 0);
                lVar3 = lVar119;
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                semanticsData2 = semanticsData3;
            } else {
                rVarH.O();
                textStyle2 = textStyle;
                z17 = z15;
                semanticsData2 = semanticsData;
                i45 = i28;
                i46 = i36;
            }
            r rVar13 = rVarH;
            lVar4 = lVar3;
            d5VarM = rVar13.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b40.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        i27 = i18 & 8;
        if (i27 != 0) {
            if ((i17 & 3072) == 0) {
                i28 = i15;
                if (rVarH.c(i28)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i19 |= i29;
            }
            i35 = i18 & 16;
            if (i35 != 0) {
                if ((i17 & 24576) == 0) {
                    i36 = i16;
                    if (rVarH.c(i36)) {
                        i37 = 16384;
                    } else {
                        i37 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 32;
                if (i38 != 0) {
                    i19 |= 196608;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar3)) {
                            i39 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i39;
                    }
                }
                if ((i17 & 1572864) != 0) {
                    if ((i18 & 64) == 0) {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i56 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i56;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i55 = 8388608;
                    } else {
                        i55 = 4194304;
                    }
                    i19 |= i55;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    } else {
                        if (i57 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i27 != 0) {
                            iA = v.INSTANCE.a();
                        } else {
                            iA = i28;
                        }
                        if (i35 != 0) {
                            i47 = Integer.MAX_VALUE;
                        } else {
                            i47 = i36;
                        }
                        if (i38 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: b40.a
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return g.h((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar3 = (l) objE;
                        }
                        if ((i18 & 64) != 0) {
                            i19 &= -3670017;
                            i36 = i47;
                            semanticsData3 = new SemanticsData(false, null, null, 7, null);
                            i28 = iA;
                            lVar5 = lVar3;
                            z19 = z18;
                        } else {
                            semanticsData3 = semanticsData;
                            lVar5 = lVar3;
                            i36 = i47;
                            z19 = z18;
                            i28 = iA;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                    }
                    oVar = (o) rVarH.N(g1.g());
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = s.I();
                        rVarH.v(objE2);
                    }
                    aVar = (cx.a) objE2;
                    m.Companion companion14 = m.INSTANCE;
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = new l() { // from class: b40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.i((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    TextStyle textStyle15 = textStyleA;
                    i48 = i19;
                    m mVarC13 = n4.v.c(n4.v.d(companion14, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                    semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                    if (semanticsContentDescription == null) {
                        semanticsContentDescription = eVar.getText();
                    }
                    boolean z21111 = z19;
                    int i51112 = i28;
                    m mVarO13 = t70.i.O(mVarC13, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                    boolean zG14 = rVarH.G(aVar);
                    i49 = i48 & 14;
                    if (i49 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z21112 = zG14 | z25;
                    if ((i48 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z21112 | z26 | rVarH.G(oVar);
                    objE4 = rVarH.E();
                    if (zG) {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: b40.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                            }
                        };
                        rVarH.v(objE4);
                    }
                    l lVar1110 = (l) objE4;
                    int i51113 = i48 << 3;
                    int i617 = (i51113 & 896) | i49 | (i51113 & 7168) | (57344 & i51113) | (458752 & i51113) | (i51113 & 3670016);
                    z17 = z21111;
                    i45 = i51112;
                    l<? super TextLayoutResult, i0> lVar1111 = lVar5;
                    i46 = i36;
                    textStyle2 = textStyle15;
                    t0.d(eVar, mVarO13, textStyle2, z17, i45, i46, lVar1111, lVar1110, rVarH, i617, 0);
                    lVar3 = lVar1111;
                    rVarH = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    semanticsData2 = semanticsData3;
                } else {
                    rVarH.O();
                    textStyle2 = textStyle;
                    z17 = z15;
                    semanticsData2 = semanticsData;
                    i45 = i28;
                    i46 = i36;
                }
                r rVar14 = rVarH;
                lVar4 = lVar3;
                d5VarM = rVar14.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: b40.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            i36 = i16;
            i38 = i18 & 32;
            if (i38 != 0) {
                i19 |= 196608;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar3)) {
                        i39 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i39;
                }
            }
            if ((i17 & 1572864) != 0) {
                if ((i18 & 64) == 0) {
                    i56 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i56 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i56;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i19 |= i55;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                } else {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                }
                oVar = (o) rVarH.N(g1.g());
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                m.Companion companion15 = m.INSTANCE;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new l() { // from class: b40.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.i((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                TextStyle textStyle16 = textStyleA;
                i48 = i19;
                m mVarC14 = n4.v.c(n4.v.d(companion15, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                if (semanticsContentDescription == null) {
                    semanticsContentDescription = eVar.getText();
                }
                boolean z21113 = z19;
                int i51114 = i28;
                m mVarO14 = t70.i.O(mVarC14, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                boolean zG15 = rVarH.G(aVar);
                i49 = i48 & 14;
                if (i49 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z21114 = zG15 | z25;
                if ((i48 & 29360128) == 8388608) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = z21114 | z26 | rVarH.G(oVar);
                objE4 = rVarH.E();
                if (zG) {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                }
                l lVar1112 = (l) objE4;
                int i51115 = i48 << 3;
                int i618 = (i51115 & 896) | i49 | (i51115 & 7168) | (57344 & i51115) | (458752 & i51115) | (i51115 & 3670016);
                z17 = z21113;
                i45 = i51114;
                l<? super TextLayoutResult, i0> lVar1113 = lVar5;
                i46 = i36;
                textStyle2 = textStyle16;
                t0.d(eVar, mVarO14, textStyle2, z17, i45, i46, lVar1113, lVar1112, rVarH, i618, 0);
                lVar3 = lVar1113;
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                semanticsData2 = semanticsData3;
            } else {
                rVarH.O();
                textStyle2 = textStyle;
                z17 = z15;
                semanticsData2 = semanticsData;
                i45 = i28;
                i46 = i36;
            }
            r rVar15 = rVarH;
            lVar4 = lVar3;
            d5VarM = rVar15.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b40.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 3072;
        i28 = i15;
        i35 = i18 & 16;
        if (i35 != 0) {
            if ((i17 & 24576) == 0) {
                i36 = i16;
                if (rVarH.c(i36)) {
                    i37 = 16384;
                } else {
                    i37 = PKIFailureInfo.certRevoked;
                }
                i19 |= i37;
            }
            i38 = i18 & 32;
            if (i38 != 0) {
                i19 |= 196608;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar3)) {
                        i39 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i39;
                }
            }
            if ((i17 & 1572864) != 0) {
                if ((i18 & 64) == 0) {
                    i56 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i56 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i56;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i19 |= i55;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                } else {
                    if (i57 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i27 != 0) {
                        iA = v.INSTANCE.a();
                    } else {
                        iA = i28;
                    }
                    if (i35 != 0) {
                        i47 = Integer.MAX_VALUE;
                    } else {
                        i47 = i36;
                    }
                    if (i38 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: b40.a
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return g.h((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar3 = (l) objE;
                    }
                    if ((i18 & 64) != 0) {
                        i19 &= -3670017;
                        i36 = i47;
                        semanticsData3 = new SemanticsData(false, null, null, 7, null);
                        i28 = iA;
                        lVar5 = lVar3;
                        z19 = z18;
                    } else {
                        semanticsData3 = semanticsData;
                        lVar5 = lVar3;
                        i36 = i47;
                        z19 = z18;
                        i28 = iA;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
                }
                oVar = (o) rVarH.N(g1.g());
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = s.I();
                    rVarH.v(objE2);
                }
                aVar = (cx.a) objE2;
                m.Companion companion16 = m.INSTANCE;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new l() { // from class: b40.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.i((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                TextStyle textStyle17 = textStyleA;
                i48 = i19;
                m mVarC15 = n4.v.c(n4.v.d(companion16, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
                semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
                if (semanticsContentDescription == null) {
                    semanticsContentDescription = eVar.getText();
                }
                boolean z21115 = z19;
                int i51116 = i28;
                m mVarO15 = t70.i.O(mVarC15, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
                boolean zG16 = rVarH.G(aVar);
                i49 = i48 & 14;
                if (i49 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z21116 = zG16 | z25;
                if ((i48 & 29360128) == 8388608) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = z21116 | z26 | rVarH.G(oVar);
                objE4 = rVarH.E();
                if (zG) {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new l() { // from class: b40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                        }
                    };
                    rVarH.v(objE4);
                }
                l lVar1114 = (l) objE4;
                int i51117 = i48 << 3;
                int i619 = (i51117 & 896) | i49 | (i51117 & 7168) | (57344 & i51117) | (458752 & i51117) | (i51117 & 3670016);
                z17 = z21115;
                i45 = i51116;
                l<? super TextLayoutResult, i0> lVar1115 = lVar5;
                i46 = i36;
                textStyle2 = textStyle17;
                t0.d(eVar, mVarO15, textStyle2, z17, i45, i46, lVar1115, lVar1114, rVarH, i619, 0);
                lVar3 = lVar1115;
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                semanticsData2 = semanticsData3;
            } else {
                rVarH.O();
                textStyle2 = textStyle;
                z17 = z15;
                semanticsData2 = semanticsData;
                i45 = i28;
                i46 = i36;
            }
            r rVar16 = rVarH;
            lVar4 = lVar3;
            d5VarM = rVar16.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: b40.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 24576;
        i36 = i16;
        i38 = i18 & 32;
        if (i38 != 0) {
            i19 |= 196608;
            lVar3 = lVar;
        } else {
            lVar3 = lVar;
            if ((i17 & 196608) == 0) {
                if (rVarH.G(lVar3)) {
                    i39 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i39;
            }
        }
        if ((i17 & 1572864) != 0) {
            if ((i18 & 64) == 0) {
                i56 = PKIFailureInfo.signerNotTrusted;
            } else {
                i56 = PKIFailureInfo.signerNotTrusted;
            }
            i19 |= i56;
        }
        if ((i17 & 12582912) == 0) {
            if (rVarH.G(lVar2)) {
                i55 = 8388608;
            } else {
                i55 = 4194304;
            }
            i19 |= i55;
        }
        if ((i19 & 4793491) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i19 & 1)) {
            rVarH.I();
            if ((i17 & 1) != 0) {
                if (i57 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i25 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i27 != 0) {
                    iA = v.INSTANCE.a();
                } else {
                    iA = i28;
                }
                if (i35 != 0) {
                    i47 = Integer.MAX_VALUE;
                } else {
                    i47 = i36;
                }
                if (i38 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: b40.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar3 = (l) objE;
                }
                if ((i18 & 64) != 0) {
                    i19 &= -3670017;
                    i36 = i47;
                    semanticsData3 = new SemanticsData(false, null, null, 7, null);
                    i28 = iA;
                    lVar5 = lVar3;
                    z19 = z18;
                } else {
                    semanticsData3 = semanticsData;
                    lVar5 = lVar3;
                    i36 = i47;
                    z19 = z18;
                    i28 = iA;
                }
            } else {
                if (i57 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle;
                }
                if (i25 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i27 != 0) {
                    iA = v.INSTANCE.a();
                } else {
                    iA = i28;
                }
                if (i35 != 0) {
                    i47 = Integer.MAX_VALUE;
                } else {
                    i47 = i36;
                }
                if (i38 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: b40.a
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.h((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar3 = (l) objE;
                }
                if ((i18 & 64) != 0) {
                    i19 &= -3670017;
                    i36 = i47;
                    semanticsData3 = new SemanticsData(false, null, null, 7, null);
                    i28 = iA;
                    lVar5 = lVar3;
                    z19 = z18;
                } else {
                    semanticsData3 = semanticsData;
                    lVar5 = lVar3;
                    i36 = i47;
                    z19 = z18;
                    i28 = iA;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-4951533, i19, -1, "pl.gov.coi.common.ui.ds.custom.clickabletext.CustomClickableText (CustomClickableText.kt:30)");
            }
            oVar = (o) rVarH.N(g1.g());
            objE2 = rVarH.E();
            companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = s.I();
                rVarH.v(objE2);
            }
            aVar = (cx.a) objE2;
            m.Companion companion17 = m.INSTANCE;
            objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new l() { // from class: b40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.i((n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            TextStyle textStyle18 = textStyleA;
            i48 = i19;
            m mVarC16 = n4.v.c(n4.v.d(companion17, false, (l) objE3, 1, null), semanticsData3.getMergeDescendants(), semanticsData3.e());
            semanticsContentDescription = semanticsData3.getSemanticsContentDescription();
            if (semanticsContentDescription == null) {
                semanticsContentDescription = eVar.getText();
            }
            boolean z21117 = z19;
            int i51118 = i28;
            m mVarO16 = t70.i.O(mVarC16, semanticsContentDescription, true, null, rVarH, MLKEMEngine.KyberPolyBytes, 4);
            boolean zG17 = rVarH.G(aVar);
            i49 = i48 & 14;
            if (i49 == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z21118 = zG17 | z25;
            if ((i48 & 29360128) == 8388608) {
                z26 = true;
            } else {
                z26 = false;
            }
            zG = z21118 | z26 | rVarH.G(oVar);
            objE4 = rVarH.E();
            if (zG) {
                objE4 = new l() { // from class: b40.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                    }
                };
                rVarH.v(objE4);
            } else {
                objE4 = new l() { // from class: b40.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.k(aVar, eVar, oVar, lVar2, ((Integer) obj).intValue());
                    }
                };
                rVarH.v(objE4);
            }
            l lVar1116 = (l) objE4;
            int i51119 = i48 << 3;
            int i6110 = (i51119 & 896) | i49 | (i51119 & 7168) | (57344 & i51119) | (458752 & i51119) | (i51119 & 3670016);
            z17 = z21117;
            i45 = i51118;
            l<? super TextLayoutResult, i0> lVar1117 = lVar5;
            i46 = i36;
            textStyle2 = textStyle18;
            t0.d(eVar, mVarO16, textStyle2, z17, i45, i46, lVar1117, lVar1116, rVarH, i6110, 0);
            lVar3 = lVar1117;
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
            semanticsData2 = semanticsData3;
        } else {
            rVarH.O();
            textStyle2 = textStyle;
            z17 = z15;
            semanticsData2 = semanticsData;
            i45 = i28;
            i46 = i36;
        }
        r rVar17 = rVarH;
        lVar4 = lVar3;
        d5VarM = rVar17.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.m(eVar, textStyle2, z17, i45, i46, lVar4, semanticsData2, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.y(i0Var, null, new er.a() { // from class: b40.f
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(g.j());
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(cx.a aVar, final q4.e eVar, final o oVar, final l lVar, final int i15) {
        cx.a.a(aVar, 0L, new er.a() { // from class: b40.e
            @Override // er.a
            public final Object a() {
                return g.l(eVar, i15, oVar, lVar);
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(q4.e eVar, int i15, o oVar, l lVar) {
        q4.e.Range range = (q4.e.Range) pq.v.n0(eVar.i(i15, i15));
        if (range != null) {
            lVar.b(range.g());
        }
        oVar.B(true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(q4.e eVar, TextStyle textStyle, boolean z15, int i15, int i16, l lVar, SemanticsData semanticsData, l lVar2, int i17, int i18, r rVar, int i19) {
        g(eVar, textStyle, z15, i15, i16, lVar, semanticsData, lVar2, rVar, g4.a(i17 | 1), i18);
        return i0.f148189a;
    }
}
