package p70;

import b5.TextGeometricTransform;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.x;
import er.p;
import i30.ButtonIconData;
import mx.Label;
import n3.Shadow;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p012a2.q;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.SpanStyle;
import q4.j0;
import u4.FontWeight;
import u4.y;
import u4.z;
import w0.i1;
import x4.LocaleList;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf3/m;", "modifier", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lq70/b;", "titleSpanData", "", "iconTitleResId", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Li30/a;", "menuButtonData", "mainButtonData", "Loq/i0;", "g", "(Lf3/m;Ljava/lang/String;Lmx/a;Lq70/b;Ljava/lang/Integer;JLi30/a;Li30/a;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    /* JADX WARN: Code duplicated, block: B:103:0x012c A[PHI: r0 r5 r6 r8 r9 r12 r13 r14
      0x012c: PHI (r0v14 f3.m) = (r0v11 f3.m), (r0v17 f3.m) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r5v8 java.lang.String) = (r5v4 java.lang.String), (r5v9 java.lang.String) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r6v17 long) = (r6v3 long), (r6v1 long) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r8v12 i30.a) = (r8v9 i30.a), (r8v13 i30.a) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r9v9 java.lang.Integer) = (r9v5 java.lang.Integer), (r9v2 java.lang.Integer) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r12v9 mx.a) = (r12v4 mx.a), (r12v2 mx.a) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r13v8 int) = (r13v5 int), (r13v9 int) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r14v7 q70.b) = (r14v3 q70.b), (r14v2 q70.b) binds: [B:123:0x0162, B:102:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x0149  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0229  */
    /* JADX WARN: Code duplicated, block: B:148:0x0232  */
    /* JADX WARN: Code duplicated, block: B:151:0x0248  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    public static final void g(f3.m mVar, String str, Label label, q70.b bVar, Integer num, long j15, ButtonIconData buttonIconData, ButtonIconData buttonIconData2, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        final Label label2;
        int i19;
        int i25;
        q70.b bVar2;
        int i26;
        int i27;
        Integer num2;
        int i28;
        final long jA;
        int i29;
        int i35;
        int i36;
        int i37;
        boolean z15;
        r rVar2;
        final f3.m mVar2;
        final String str2;
        final ButtonIconData buttonIconData3;
        final Integer num3;
        final Label label3;
        final q70.b bVar3;
        final ButtonIconData buttonIconData4;
        d5 d5VarM;
        f3.m mVar3;
        final String str3;
        int i38;
        ButtonIconData buttonIconData5;
        Object objE;
        r.Companion companion;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objE2;
        int i39;
        r rVarH = rVar.h(-1474465708);
        int i45 = i16 & 1;
        if (i45 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i46 = i16 & 2;
        if (i46 == 0) {
            if ((i15 & 48) == 0) {
                i17 |= rVarH.W(str) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    label2 = label;
                    if (rVarH.W(label2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        bVar2 = bVar;
                        if (rVarH.G(bVar2)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((i15 & 24576) == 0) {
                            num2 = num;
                            if (rVarH.W(num2)) {
                                i28 = 16384;
                            } else {
                                i28 = PKIFailureInfo.certRevoked;
                            }
                            i17 |= i28;
                        }
                        if ((i15 & 196608) == 0) {
                            jA = j15;
                            if ((i16 & 32) == 0 || !rVarH.d(jA)) {
                                i39 = PKIFailureInfo.notAuthorized;
                            } else {
                                i39 = PKIFailureInfo.unsupportedVersion;
                            }
                            i17 |= i39;
                        } else {
                            jA = j15;
                        }
                        i29 = i16 & 64;
                        if (i29 != 0) {
                            i17 |= 1572864;
                        } else if ((i15 & 1572864) == 0) {
                            if (rVarH.G(buttonIconData)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & 128;
                        if (i36 != 0) {
                            if ((i15 & 12582912) == 0) {
                                if (rVarH.G(buttonIconData2)) {
                                    i37 = 8388608;
                                } else {
                                    i37 = 4194304;
                                }
                                i17 |= i37;
                            }
                            if ((i17 & 4793491) != 4793490) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (rVarH.r(z15, i17 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0 || rVarH.Q()) {
                                    if (i45 != 0) {
                                        mVar3 = f3.m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i46 != 0) {
                                        str3 = null;
                                    } else {
                                        str3 = str;
                                    }
                                    if (i18 != 0) {
                                        label2 = null;
                                    }
                                    if (i25 != 0) {
                                        bVar2 = null;
                                    }
                                    if (i27 != 0) {
                                        num2 = null;
                                    }
                                    if ((i16 & 32) != 0) {
                                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                        i17 &= -458753;
                                    }
                                    if (i29 != 0) {
                                        buttonIconData3 = null;
                                    } else {
                                        buttonIconData3 = buttonIconData;
                                    }
                                    i38 = i17;
                                    if (i36 != 0) {
                                        buttonIconData5 = null;
                                    }
                                    rVarH.y();
                                    if (t.k()) {
                                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                                    }
                                    f3.m.Companion companion2 = f3.m.INSTANCE;
                                    objE = rVarH.E();
                                    companion = r.INSTANCE;
                                    final ButtonIconData buttonIconData6 = buttonIconData5;
                                    if (objE == companion.a()) {
                                        objE = new er.l() { // from class: p70.h
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return n.h((i0) obj);
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    long j16 = jA;
                                    f3.m mVarD = v.d(companion2, false, (er.l) objE, 1, null);
                                    if ((i38 & 112) == 32) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if ((i38 & 896) == 256) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    z18 = z16 | z17;
                                    objE2 = rVarH.E();
                                    if (z18 || objE2 == companion.a()) {
                                        objE2 = new er.l() { // from class: p70.i
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return n.i(str3, label2, (i0) obj);
                                            }
                                        };
                                        rVarH.v(objE2);
                                    }
                                    f3.m mVarU = v.d(mVarD, false, (er.l) objE2, 1, null).u(mVar3);
                                    k70.a aVar = k70.a.f108864a;
                                    int i47 = k70.a.f108865b;
                                    float level0 = aVar.c(rVarH, i47).getLevel0();
                                    d3 d3VarF = a3.f(aVar.b(rVarH, i47).getSpacing100(), aVar.b(rVarH, i47).getSpacing50());
                                    final String str4 = str3;
                                    final ButtonIconData buttonIconData7 = buttonIconData3;
                                    final Integer num4 = num2;
                                    final Label label4 = label2;
                                    final q70.b bVar4 = bVar2;
                                    label3 = label4;
                                    bVar3 = bVar4;
                                    rVar2 = rVarH;
                                    q.i(mVarU, j16, 0L, level0, d3VarF, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return n.j(label4, str4, bVar4, num4, buttonIconData6, buttonIconData7, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                                    if (t.k()) {
                                        t.n();
                                    }
                                    mVar2 = mVar3;
                                    str2 = str3;
                                    num3 = num2;
                                    buttonIconData4 = buttonIconData6;
                                    jA = j16;
                                } else {
                                    rVarH.O();
                                    if ((i16 & 32) != 0) {
                                        i17 &= -458753;
                                    }
                                    mVar3 = mVar;
                                    str3 = str;
                                    buttonIconData3 = buttonIconData;
                                    i38 = i17;
                                }
                                buttonIconData5 = buttonIconData2;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                                }
                                f3.m.Companion companion3 = f3.m.INSTANCE;
                                objE = rVarH.E();
                                companion = r.INSTANCE;
                                final ButtonIconData buttonIconData8 = buttonIconData5;
                                if (objE == companion.a()) {
                                    objE = new er.l() { // from class: p70.h
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return n.h((i0) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                long j17 = jA;
                                f3.m mVarD2 = v.d(companion3, false, (er.l) objE, 1, null);
                                if ((i38 & 112) == 32) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if ((i38 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z16 | z17;
                                objE2 = rVarH.E();
                                if (z18) {
                                    objE2 = new er.l() { // from class: p70.i
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return n.i(str3, label2, (i0) obj);
                                        }
                                    };
                                    rVarH.v(objE2);
                                } else {
                                    objE2 = new er.l() { // from class: p70.i
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return n.i(str3, label2, (i0) obj);
                                        }
                                    };
                                    rVarH.v(objE2);
                                }
                                f3.m mVarU2 = v.d(mVarD2, false, (er.l) objE2, 1, null).u(mVar3);
                                k70.a aVar2 = k70.a.f108864a;
                                int i48 = k70.a.f108865b;
                                float level1 = aVar2.c(rVarH, i48).getLevel0();
                                d3 d3VarF2 = a3.f(aVar2.b(rVarH, i48).getSpacing100(), aVar2.b(rVarH, i48).getSpacing50());
                                final String str5 = str3;
                                final ButtonIconData buttonIconData9 = buttonIconData3;
                                final Integer num5 = num2;
                                final Label label5 = label2;
                                final q70.b bVar5 = bVar2;
                                label3 = label5;
                                bVar3 = bVar5;
                                rVar2 = rVarH;
                                q.i(mVarU2, j17, 0L, level1, d3VarF2, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return n.j(label5, str5, bVar5, num5, buttonIconData8, buttonIconData9, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar2 = mVar3;
                                str2 = str3;
                                num3 = num2;
                                buttonIconData4 = buttonIconData8;
                                jA = j17;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                str2 = str;
                                buttonIconData3 = buttonIconData;
                                num3 = num2;
                                label3 = label2;
                                bVar3 = bVar2;
                                buttonIconData4 = buttonIconData2;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: p70.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 12582912;
                        if ((i17 & 4793491) != 4793490) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            } else {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                            }
                            f3.m.Companion companion4 = f3.m.INSTANCE;
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            final ButtonIconData buttonIconData10 = buttonIconData5;
                            if (objE == companion.a()) {
                                objE = new er.l() { // from class: p70.h
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.h((i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            long j18 = jA;
                            f3.m mVarD3 = v.d(companion4, false, (er.l) objE, 1, null);
                            if ((i38 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objE2 = rVarH.E();
                            if (z18) {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            f3.m mVarU3 = v.d(mVarD3, false, (er.l) objE2, 1, null).u(mVar3);
                            k70.a aVar3 = k70.a.f108864a;
                            int i49 = k70.a.f108865b;
                            float level2 = aVar3.c(rVarH, i49).getLevel0();
                            d3 d3VarF3 = a3.f(aVar3.b(rVarH, i49).getSpacing100(), aVar3.b(rVarH, i49).getSpacing50());
                            final String str6 = str3;
                            final ButtonIconData buttonIconData11 = buttonIconData3;
                            final Integer num6 = num2;
                            final Label label6 = label2;
                            final q70.b bVar6 = bVar2;
                            label3 = label6;
                            bVar3 = bVar6;
                            rVar2 = rVarH;
                            q.i(mVarU3, j18, 0L, level2, d3VarF3, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return n.j(label6, str6, bVar6, num6, buttonIconData10, buttonIconData11, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                            if (t.k()) {
                                t.n();
                            }
                            mVar2 = mVar3;
                            str2 = str3;
                            num3 = num2;
                            buttonIconData4 = buttonIconData10;
                            jA = j18;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            str2 = str;
                            buttonIconData3 = buttonIconData;
                            num3 = num2;
                            label3 = label2;
                            bVar3 = bVar2;
                            buttonIconData4 = buttonIconData2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: p70.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 24576;
                    num2 = num;
                    if ((i15 & 196608) == 0) {
                        jA = j15;
                        if ((i16 & 32) == 0) {
                            i39 = PKIFailureInfo.notAuthorized;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i39;
                    } else {
                        jA = j15;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(buttonIconData)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 128;
                    if (i36 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.G(buttonIconData2)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i17 |= i37;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            } else {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                            }
                            f3.m.Companion companion5 = f3.m.INSTANCE;
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            final ButtonIconData buttonIconData12 = buttonIconData5;
                            if (objE == companion.a()) {
                                objE = new er.l() { // from class: p70.h
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.h((i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            long j19 = jA;
                            f3.m mVarD4 = v.d(companion5, false, (er.l) objE, 1, null);
                            if ((i38 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objE2 = rVarH.E();
                            if (z18) {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            f3.m mVarU4 = v.d(mVarD4, false, (er.l) objE2, 1, null).u(mVar3);
                            k70.a aVar4 = k70.a.f108864a;
                            int i410 = k70.a.f108865b;
                            float level3 = aVar4.c(rVarH, i410).getLevel0();
                            d3 d3VarF4 = a3.f(aVar4.b(rVarH, i410).getSpacing100(), aVar4.b(rVarH, i410).getSpacing50());
                            final String str7 = str3;
                            final ButtonIconData buttonIconData13 = buttonIconData3;
                            final Integer num7 = num2;
                            final Label label7 = label2;
                            final q70.b bVar7 = bVar2;
                            label3 = label7;
                            bVar3 = bVar7;
                            rVar2 = rVarH;
                            q.i(mVarU4, j19, 0L, level3, d3VarF4, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return n.j(label7, str7, bVar7, num7, buttonIconData12, buttonIconData13, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                            if (t.k()) {
                                t.n();
                            }
                            mVar2 = mVar3;
                            str2 = str3;
                            num3 = num2;
                            buttonIconData4 = buttonIconData12;
                            jA = j19;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            str2 = str;
                            buttonIconData3 = buttonIconData;
                            num3 = num2;
                            label3 = label2;
                            bVar3 = bVar2;
                            buttonIconData4 = buttonIconData2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: p70.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion6 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData14 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j110 = jA;
                        f3.m mVarD5 = v.d(companion6, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU5 = v.d(mVarD5, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar5 = k70.a.f108864a;
                        int i411 = k70.a.f108865b;
                        float level4 = aVar5.c(rVarH, i411).getLevel0();
                        d3 d3VarF5 = a3.f(aVar5.b(rVarH, i411).getSpacing100(), aVar5.b(rVarH, i411).getSpacing50());
                        final String str8 = str3;
                        final ButtonIconData buttonIconData15 = buttonIconData3;
                        final Integer num8 = num2;
                        final Label label8 = label2;
                        final q70.b bVar8 = bVar2;
                        label3 = label8;
                        bVar3 = bVar8;
                        rVar2 = rVarH;
                        q.i(mVarU5, j110, 0L, level4, d3VarF5, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label8, str8, bVar8, num8, buttonIconData14, buttonIconData15, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData14;
                        jA = j110;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                bVar2 = bVar;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        num2 = num;
                        if (rVarH.W(num2)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 196608) == 0) {
                        jA = j15;
                        if ((i16 & 32) == 0) {
                            i39 = PKIFailureInfo.notAuthorized;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i39;
                    } else {
                        jA = j15;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(buttonIconData)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 128;
                    if (i36 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.G(buttonIconData2)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i17 |= i37;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            } else {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                            }
                            f3.m.Companion companion7 = f3.m.INSTANCE;
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            final ButtonIconData buttonIconData16 = buttonIconData5;
                            if (objE == companion.a()) {
                                objE = new er.l() { // from class: p70.h
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.h((i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            long j111 = jA;
                            f3.m mVarD6 = v.d(companion7, false, (er.l) objE, 1, null);
                            if ((i38 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objE2 = rVarH.E();
                            if (z18) {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            f3.m mVarU6 = v.d(mVarD6, false, (er.l) objE2, 1, null).u(mVar3);
                            k70.a aVar6 = k70.a.f108864a;
                            int i412 = k70.a.f108865b;
                            float level5 = aVar6.c(rVarH, i412).getLevel0();
                            d3 d3VarF6 = a3.f(aVar6.b(rVarH, i412).getSpacing100(), aVar6.b(rVarH, i412).getSpacing50());
                            final String str9 = str3;
                            final ButtonIconData buttonIconData17 = buttonIconData3;
                            final Integer num9 = num2;
                            final Label label9 = label2;
                            final q70.b bVar9 = bVar2;
                            label3 = label9;
                            bVar3 = bVar9;
                            rVar2 = rVarH;
                            q.i(mVarU6, j111, 0L, level5, d3VarF6, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return n.j(label9, str9, bVar9, num9, buttonIconData16, buttonIconData17, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                            if (t.k()) {
                                t.n();
                            }
                            mVar2 = mVar3;
                            str2 = str3;
                            num3 = num2;
                            buttonIconData4 = buttonIconData16;
                            jA = j111;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            str2 = str;
                            buttonIconData3 = buttonIconData;
                            num3 = num2;
                            label3 = label2;
                            bVar3 = bVar2;
                            buttonIconData4 = buttonIconData2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: p70.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion8 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData18 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j112 = jA;
                        f3.m mVarD7 = v.d(companion8, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU7 = v.d(mVarD7, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar7 = k70.a.f108864a;
                        int i413 = k70.a.f108865b;
                        float level6 = aVar7.c(rVarH, i413).getLevel0();
                        d3 d3VarF7 = a3.f(aVar7.b(rVarH, i413).getSpacing100(), aVar7.b(rVarH, i413).getSpacing50());
                        final String str10 = str3;
                        final ButtonIconData buttonIconData19 = buttonIconData3;
                        final Integer num10 = num2;
                        final Label label10 = label2;
                        final q70.b bVar10 = bVar2;
                        label3 = label10;
                        bVar3 = bVar10;
                        rVar2 = rVarH;
                        q.i(mVarU7, j112, 0L, level6, d3VarF7, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label10, str10, bVar10, num10, buttonIconData18, buttonIconData19, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData18;
                        jA = j112;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                num2 = num;
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion9 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData110 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j113 = jA;
                        f3.m mVarD8 = v.d(companion9, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU8 = v.d(mVarD8, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar8 = k70.a.f108864a;
                        int i414 = k70.a.f108865b;
                        float level7 = aVar8.c(rVarH, i414).getLevel0();
                        d3 d3VarF8 = a3.f(aVar8.b(rVarH, i414).getSpacing100(), aVar8.b(rVarH, i414).getSpacing50());
                        final String str11 = str3;
                        final ButtonIconData buttonIconData111 = buttonIconData3;
                        final Integer num11 = num2;
                        final Label label11 = label2;
                        final q70.b bVar11 = bVar2;
                        label3 = label11;
                        bVar3 = bVar11;
                        rVar2 = rVarH;
                        q.i(mVarU8, j113, 0L, level7, d3VarF8, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label11, str11, bVar11, num11, buttonIconData110, buttonIconData111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData110;
                        jA = j113;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion10 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData112 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j114 = jA;
                    f3.m mVarD9 = v.d(companion10, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU9 = v.d(mVarD9, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar9 = k70.a.f108864a;
                    int i415 = k70.a.f108865b;
                    float level8 = aVar9.c(rVarH, i415).getLevel0();
                    d3 d3VarF9 = a3.f(aVar9.b(rVarH, i415).getSpacing100(), aVar9.b(rVarH, i415).getSpacing50());
                    final String str12 = str3;
                    final ButtonIconData buttonIconData113 = buttonIconData3;
                    final Integer num12 = num2;
                    final Label label12 = label2;
                    final q70.b bVar12 = bVar2;
                    label3 = label12;
                    bVar3 = bVar12;
                    rVar2 = rVarH;
                    q.i(mVarU9, j114, 0L, level8, d3VarF9, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label12, str12, bVar12, num12, buttonIconData112, buttonIconData113, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData112;
                    jA = j114;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            label2 = label;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    bVar2 = bVar;
                    if (rVarH.G(bVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        num2 = num;
                        if (rVarH.W(num2)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 196608) == 0) {
                        jA = j15;
                        if ((i16 & 32) == 0) {
                            i39 = PKIFailureInfo.notAuthorized;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i39;
                    } else {
                        jA = j15;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(buttonIconData)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 128;
                    if (i36 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.G(buttonIconData2)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i17 |= i37;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            } else {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                            }
                            f3.m.Companion companion11 = f3.m.INSTANCE;
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            final ButtonIconData buttonIconData114 = buttonIconData5;
                            if (objE == companion.a()) {
                                objE = new er.l() { // from class: p70.h
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.h((i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            long j115 = jA;
                            f3.m mVarD10 = v.d(companion11, false, (er.l) objE, 1, null);
                            if ((i38 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objE2 = rVarH.E();
                            if (z18) {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            f3.m mVarU10 = v.d(mVarD10, false, (er.l) objE2, 1, null).u(mVar3);
                            k70.a aVar10 = k70.a.f108864a;
                            int i416 = k70.a.f108865b;
                            float level9 = aVar10.c(rVarH, i416).getLevel0();
                            d3 d3VarF10 = a3.f(aVar10.b(rVarH, i416).getSpacing100(), aVar10.b(rVarH, i416).getSpacing50());
                            final String str13 = str3;
                            final ButtonIconData buttonIconData115 = buttonIconData3;
                            final Integer num13 = num2;
                            final Label label13 = label2;
                            final q70.b bVar13 = bVar2;
                            label3 = label13;
                            bVar3 = bVar13;
                            rVar2 = rVarH;
                            q.i(mVarU10, j115, 0L, level9, d3VarF10, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return n.j(label13, str13, bVar13, num13, buttonIconData114, buttonIconData115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                            if (t.k()) {
                                t.n();
                            }
                            mVar2 = mVar3;
                            str2 = str3;
                            num3 = num2;
                            buttonIconData4 = buttonIconData114;
                            jA = j115;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            str2 = str;
                            buttonIconData3 = buttonIconData;
                            num3 = num2;
                            label3 = label2;
                            bVar3 = bVar2;
                            buttonIconData4 = buttonIconData2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: p70.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion12 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData116 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j116 = jA;
                        f3.m mVarD11 = v.d(companion12, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU11 = v.d(mVarD11, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar11 = k70.a.f108864a;
                        int i417 = k70.a.f108865b;
                        float level10 = aVar11.c(rVarH, i417).getLevel0();
                        d3 d3VarF11 = a3.f(aVar11.b(rVarH, i417).getSpacing100(), aVar11.b(rVarH, i417).getSpacing50());
                        final String str14 = str3;
                        final ButtonIconData buttonIconData117 = buttonIconData3;
                        final Integer num14 = num2;
                        final Label label14 = label2;
                        final q70.b bVar14 = bVar2;
                        label3 = label14;
                        bVar3 = bVar14;
                        rVar2 = rVarH;
                        q.i(mVarU11, j116, 0L, level10, d3VarF11, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label14, str14, bVar14, num14, buttonIconData116, buttonIconData117, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData116;
                        jA = j116;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                num2 = num;
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion13 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData118 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j117 = jA;
                        f3.m mVarD12 = v.d(companion13, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU12 = v.d(mVarD12, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar12 = k70.a.f108864a;
                        int i418 = k70.a.f108865b;
                        float level11 = aVar12.c(rVarH, i418).getLevel0();
                        d3 d3VarF12 = a3.f(aVar12.b(rVarH, i418).getSpacing100(), aVar12.b(rVarH, i418).getSpacing50());
                        final String str15 = str3;
                        final ButtonIconData buttonIconData119 = buttonIconData3;
                        final Integer num15 = num2;
                        final Label label15 = label2;
                        final q70.b bVar15 = bVar2;
                        label3 = label15;
                        bVar3 = bVar15;
                        rVar2 = rVarH;
                        q.i(mVarU12, j117, 0L, level11, d3VarF12, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label15, str15, bVar15, num15, buttonIconData118, buttonIconData119, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData118;
                        jA = j117;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion14 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData1110 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j118 = jA;
                    f3.m mVarD13 = v.d(companion14, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU13 = v.d(mVarD13, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar13 = k70.a.f108864a;
                    int i419 = k70.a.f108865b;
                    float level12 = aVar13.c(rVarH, i419).getLevel0();
                    d3 d3VarF13 = a3.f(aVar13.b(rVarH, i419).getSpacing100(), aVar13.b(rVarH, i419).getSpacing50());
                    final String str16 = str3;
                    final ButtonIconData buttonIconData1111 = buttonIconData3;
                    final Integer num16 = num2;
                    final Label label16 = label2;
                    final q70.b bVar16 = bVar2;
                    label3 = label16;
                    bVar3 = bVar16;
                    rVar2 = rVarH;
                    q.i(mVarU13, j118, 0L, level12, d3VarF13, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label16, str16, bVar16, num16, buttonIconData1110, buttonIconData1111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData1110;
                    jA = j118;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            bVar2 = bVar;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    num2 = num;
                    if (rVarH.W(num2)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion15 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData1112 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j119 = jA;
                        f3.m mVarD14 = v.d(companion15, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU14 = v.d(mVarD14, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar14 = k70.a.f108864a;
                        int i4110 = k70.a.f108865b;
                        float level13 = aVar14.c(rVarH, i4110).getLevel0();
                        d3 d3VarF14 = a3.f(aVar14.b(rVarH, i4110).getSpacing100(), aVar14.b(rVarH, i4110).getSpacing50());
                        final String str17 = str3;
                        final ButtonIconData buttonIconData1113 = buttonIconData3;
                        final Integer num17 = num2;
                        final Label label17 = label2;
                        final q70.b bVar17 = bVar2;
                        label3 = label17;
                        bVar3 = bVar17;
                        rVar2 = rVarH;
                        q.i(mVarU14, j119, 0L, level13, d3VarF14, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label17, str17, bVar17, num17, buttonIconData1112, buttonIconData1113, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData1112;
                        jA = j119;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion16 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData1114 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j1110 = jA;
                    f3.m mVarD15 = v.d(companion16, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU15 = v.d(mVarD15, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar15 = k70.a.f108864a;
                    int i4111 = k70.a.f108865b;
                    float level14 = aVar15.c(rVarH, i4111).getLevel0();
                    d3 d3VarF15 = a3.f(aVar15.b(rVarH, i4111).getSpacing100(), aVar15.b(rVarH, i4111).getSpacing50());
                    final String str18 = str3;
                    final ButtonIconData buttonIconData1115 = buttonIconData3;
                    final Integer num18 = num2;
                    final Label label18 = label2;
                    final q70.b bVar18 = bVar2;
                    label3 = label18;
                    bVar3 = bVar18;
                    rVar2 = rVarH;
                    q.i(mVarU15, j1110, 0L, level14, d3VarF15, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label18, str18, bVar18, num18, buttonIconData1114, buttonIconData1115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData1114;
                    jA = j1110;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            num2 = num;
            if ((i15 & 196608) == 0) {
                jA = j15;
                if ((i16 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i39;
            } else {
                jA = j15;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(buttonIconData)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(buttonIconData2)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion17 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData1116 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j1111 = jA;
                    f3.m mVarD16 = v.d(companion17, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU16 = v.d(mVarD16, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar16 = k70.a.f108864a;
                    int i4112 = k70.a.f108865b;
                    float level15 = aVar16.c(rVarH, i4112).getLevel0();
                    d3 d3VarF16 = a3.f(aVar16.b(rVarH, i4112).getSpacing100(), aVar16.b(rVarH, i4112).getSpacing50());
                    final String str19 = str3;
                    final ButtonIconData buttonIconData1117 = buttonIconData3;
                    final Integer num19 = num2;
                    final Label label19 = label2;
                    final q70.b bVar19 = bVar2;
                    label3 = label19;
                    bVar3 = bVar19;
                    rVar2 = rVarH;
                    q.i(mVarU16, j1111, 0L, level15, d3VarF16, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label19, str19, bVar19, num19, buttonIconData1116, buttonIconData1117, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData1116;
                    jA = j1111;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                } else {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                }
                f3.m.Companion companion18 = f3.m.INSTANCE;
                objE = rVarH.E();
                companion = r.INSTANCE;
                final ButtonIconData buttonIconData1118 = buttonIconData5;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: p70.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.h((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                long j1112 = jA;
                f3.m mVarD17 = v.d(companion18, false, (er.l) objE, 1, null);
                if ((i38 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarU17 = v.d(mVarD17, false, (er.l) objE2, 1, null).u(mVar3);
                k70.a aVar17 = k70.a.f108864a;
                int i4113 = k70.a.f108865b;
                float level16 = aVar17.c(rVarH, i4113).getLevel0();
                d3 d3VarF17 = a3.f(aVar17.b(rVarH, i4113).getSpacing100(), aVar17.b(rVarH, i4113).getSpacing50());
                final String str110 = str3;
                final ButtonIconData buttonIconData1119 = buttonIconData3;
                final Integer num110 = num2;
                final Label label110 = label2;
                final q70.b bVar110 = bVar2;
                label3 = label110;
                bVar3 = bVar110;
                rVar2 = rVarH;
                q.i(mVarU17, j1112, 0L, level16, d3VarF17, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.j(label110, str110, bVar110, num110, buttonIconData1118, buttonIconData1119, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar3;
                str2 = str3;
                num3 = num2;
                buttonIconData4 = buttonIconData1118;
                jA = j1112;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                str2 = str;
                buttonIconData3 = buttonIconData;
                num3 = num2;
                label3 = label2;
                bVar3 = bVar2;
                buttonIconData4 = buttonIconData2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p70.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                label2 = label;
                if (rVarH.W(label2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    bVar2 = bVar;
                    if (rVarH.G(bVar2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        num2 = num;
                        if (rVarH.W(num2)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 196608) == 0) {
                        jA = j15;
                        if ((i16 & 32) == 0) {
                            i39 = PKIFailureInfo.notAuthorized;
                        } else {
                            i39 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i39;
                    } else {
                        jA = j15;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(buttonIconData)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 128;
                    if (i36 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.G(buttonIconData2)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i17 |= i37;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            } else {
                                if (i45 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i46 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i18 != 0) {
                                    label2 = null;
                                }
                                if (i25 != 0) {
                                    bVar2 = null;
                                }
                                if (i27 != 0) {
                                    num2 = null;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                    i17 &= -458753;
                                }
                                if (i29 != 0) {
                                    buttonIconData3 = null;
                                } else {
                                    buttonIconData3 = buttonIconData;
                                }
                                i38 = i17;
                                if (i36 != 0) {
                                    buttonIconData5 = null;
                                } else {
                                    buttonIconData5 = buttonIconData2;
                                }
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                            }
                            f3.m.Companion companion19 = f3.m.INSTANCE;
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            final ButtonIconData buttonIconData11110 = buttonIconData5;
                            if (objE == companion.a()) {
                                objE = new er.l() { // from class: p70.h
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.h((i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            long j1113 = jA;
                            f3.m mVarD18 = v.d(companion19, false, (er.l) objE, 1, null);
                            if ((i38 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objE2 = rVarH.E();
                            if (z18) {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: p70.i
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return n.i(str3, label2, (i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            f3.m mVarU18 = v.d(mVarD18, false, (er.l) objE2, 1, null).u(mVar3);
                            k70.a aVar18 = k70.a.f108864a;
                            int i4114 = k70.a.f108865b;
                            float level17 = aVar18.c(rVarH, i4114).getLevel0();
                            d3 d3VarF18 = a3.f(aVar18.b(rVarH, i4114).getSpacing100(), aVar18.b(rVarH, i4114).getSpacing50());
                            final String str111 = str3;
                            final ButtonIconData buttonIconData11111 = buttonIconData3;
                            final Integer num111 = num2;
                            final Label label111 = label2;
                            final q70.b bVar111 = bVar2;
                            label3 = label111;
                            bVar3 = bVar111;
                            rVar2 = rVarH;
                            q.i(mVarU18, j1113, 0L, level17, d3VarF18, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return n.j(label111, str111, bVar111, num111, buttonIconData11110, buttonIconData11111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                            if (t.k()) {
                                t.n();
                            }
                            mVar2 = mVar3;
                            str2 = str3;
                            num3 = num2;
                            buttonIconData4 = buttonIconData11110;
                            jA = j1113;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            str2 = str;
                            buttonIconData3 = buttonIconData;
                            num3 = num2;
                            label3 = label2;
                            bVar3 = bVar2;
                            buttonIconData4 = buttonIconData2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: p70.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion110 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData11112 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j1114 = jA;
                        f3.m mVarD19 = v.d(companion110, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU19 = v.d(mVarD19, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar19 = k70.a.f108864a;
                        int i4115 = k70.a.f108865b;
                        float level18 = aVar19.c(rVarH, i4115).getLevel0();
                        d3 d3VarF19 = a3.f(aVar19.b(rVarH, i4115).getSpacing100(), aVar19.b(rVarH, i4115).getSpacing50());
                        final String str112 = str3;
                        final ButtonIconData buttonIconData11113 = buttonIconData3;
                        final Integer num112 = num2;
                        final Label label112 = label2;
                        final q70.b bVar112 = bVar2;
                        label3 = label112;
                        bVar3 = bVar112;
                        rVar2 = rVarH;
                        q.i(mVarU19, j1114, 0L, level18, d3VarF19, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label112, str112, bVar112, num112, buttonIconData11112, buttonIconData11113, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData11112;
                        jA = j1114;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                num2 = num;
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion111 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData11114 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j1115 = jA;
                        f3.m mVarD110 = v.d(companion111, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU110 = v.d(mVarD110, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar110 = k70.a.f108864a;
                        int i4116 = k70.a.f108865b;
                        float level19 = aVar110.c(rVarH, i4116).getLevel0();
                        d3 d3VarF110 = a3.f(aVar110.b(rVarH, i4116).getSpacing100(), aVar110.b(rVarH, i4116).getSpacing50());
                        final String str113 = str3;
                        final ButtonIconData buttonIconData11115 = buttonIconData3;
                        final Integer num113 = num2;
                        final Label label113 = label2;
                        final q70.b bVar113 = bVar2;
                        label3 = label113;
                        bVar3 = bVar113;
                        rVar2 = rVarH;
                        q.i(mVarU110, j1115, 0L, level19, d3VarF110, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label113, str113, bVar113, num113, buttonIconData11114, buttonIconData11115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData11114;
                        jA = j1115;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion112 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData11116 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j1116 = jA;
                    f3.m mVarD111 = v.d(companion112, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU111 = v.d(mVarD111, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar111 = k70.a.f108864a;
                    int i4117 = k70.a.f108865b;
                    float level110 = aVar111.c(rVarH, i4117).getLevel0();
                    d3 d3VarF111 = a3.f(aVar111.b(rVarH, i4117).getSpacing100(), aVar111.b(rVarH, i4117).getSpacing50());
                    final String str114 = str3;
                    final ButtonIconData buttonIconData11117 = buttonIconData3;
                    final Integer num114 = num2;
                    final Label label114 = label2;
                    final q70.b bVar114 = bVar2;
                    label3 = label114;
                    bVar3 = bVar114;
                    rVar2 = rVarH;
                    q.i(mVarU111, j1116, 0L, level110, d3VarF111, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label114, str114, bVar114, num114, buttonIconData11116, buttonIconData11117, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData11116;
                    jA = j1116;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            bVar2 = bVar;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    num2 = num;
                    if (rVarH.W(num2)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion113 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData11118 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j1117 = jA;
                        f3.m mVarD112 = v.d(companion113, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU112 = v.d(mVarD112, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar112 = k70.a.f108864a;
                        int i4118 = k70.a.f108865b;
                        float level111 = aVar112.c(rVarH, i4118).getLevel0();
                        d3 d3VarF112 = a3.f(aVar112.b(rVarH, i4118).getSpacing100(), aVar112.b(rVarH, i4118).getSpacing50());
                        final String str115 = str3;
                        final ButtonIconData buttonIconData11119 = buttonIconData3;
                        final Integer num115 = num2;
                        final Label label115 = label2;
                        final q70.b bVar115 = bVar2;
                        label3 = label115;
                        bVar3 = bVar115;
                        rVar2 = rVarH;
                        q.i(mVarU112, j1117, 0L, level111, d3VarF112, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label115, str115, bVar115, num115, buttonIconData11118, buttonIconData11119, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData11118;
                        jA = j1117;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion114 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData111110 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j1118 = jA;
                    f3.m mVarD113 = v.d(companion114, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU113 = v.d(mVarD113, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar113 = k70.a.f108864a;
                    int i4119 = k70.a.f108865b;
                    float level112 = aVar113.c(rVarH, i4119).getLevel0();
                    d3 d3VarF113 = a3.f(aVar113.b(rVarH, i4119).getSpacing100(), aVar113.b(rVarH, i4119).getSpacing50());
                    final String str116 = str3;
                    final ButtonIconData buttonIconData111111 = buttonIconData3;
                    final Integer num116 = num2;
                    final Label label116 = label2;
                    final q70.b bVar116 = bVar2;
                    label3 = label116;
                    bVar3 = bVar116;
                    rVar2 = rVarH;
                    q.i(mVarU113, j1118, 0L, level112, d3VarF113, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label116, str116, bVar116, num116, buttonIconData111110, buttonIconData111111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData111110;
                    jA = j1118;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            num2 = num;
            if ((i15 & 196608) == 0) {
                jA = j15;
                if ((i16 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i39;
            } else {
                jA = j15;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(buttonIconData)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(buttonIconData2)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion115 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData111112 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j1119 = jA;
                    f3.m mVarD114 = v.d(companion115, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU114 = v.d(mVarD114, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar114 = k70.a.f108864a;
                    int i41110 = k70.a.f108865b;
                    float level113 = aVar114.c(rVarH, i41110).getLevel0();
                    d3 d3VarF114 = a3.f(aVar114.b(rVarH, i41110).getSpacing100(), aVar114.b(rVarH, i41110).getSpacing50());
                    final String str117 = str3;
                    final ButtonIconData buttonIconData111113 = buttonIconData3;
                    final Integer num117 = num2;
                    final Label label117 = label2;
                    final q70.b bVar117 = bVar2;
                    label3 = label117;
                    bVar3 = bVar117;
                    rVar2 = rVarH;
                    q.i(mVarU114, j1119, 0L, level113, d3VarF114, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label117, str117, bVar117, num117, buttonIconData111112, buttonIconData111113, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData111112;
                    jA = j1119;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                } else {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                }
                f3.m.Companion companion116 = f3.m.INSTANCE;
                objE = rVarH.E();
                companion = r.INSTANCE;
                final ButtonIconData buttonIconData111114 = buttonIconData5;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: p70.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.h((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                long j11110 = jA;
                f3.m mVarD115 = v.d(companion116, false, (er.l) objE, 1, null);
                if ((i38 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarU115 = v.d(mVarD115, false, (er.l) objE2, 1, null).u(mVar3);
                k70.a aVar115 = k70.a.f108864a;
                int i41111 = k70.a.f108865b;
                float level114 = aVar115.c(rVarH, i41111).getLevel0();
                d3 d3VarF115 = a3.f(aVar115.b(rVarH, i41111).getSpacing100(), aVar115.b(rVarH, i41111).getSpacing50());
                final String str118 = str3;
                final ButtonIconData buttonIconData111115 = buttonIconData3;
                final Integer num118 = num2;
                final Label label118 = label2;
                final q70.b bVar118 = bVar2;
                label3 = label118;
                bVar3 = bVar118;
                rVar2 = rVarH;
                q.i(mVarU115, j11110, 0L, level114, d3VarF115, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.j(label118, str118, bVar118, num118, buttonIconData111114, buttonIconData111115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar3;
                str2 = str3;
                num3 = num2;
                buttonIconData4 = buttonIconData111114;
                jA = j11110;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                str2 = str;
                buttonIconData3 = buttonIconData;
                num3 = num2;
                label3 = label2;
                bVar3 = bVar2;
                buttonIconData4 = buttonIconData2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p70.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        label2 = label;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                bVar2 = bVar;
                if (rVarH.G(bVar2)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    num2 = num;
                    if (rVarH.W(num2)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i15 & 196608) == 0) {
                    jA = j15;
                    if ((i16 & 32) == 0) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i39;
                } else {
                    jA = j15;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(buttonIconData)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(buttonIconData2)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        } else {
                            if (i45 != 0) {
                                mVar3 = f3.m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i46 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i18 != 0) {
                                label2 = null;
                            }
                            if (i25 != 0) {
                                bVar2 = null;
                            }
                            if (i27 != 0) {
                                num2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                                i17 &= -458753;
                            }
                            if (i29 != 0) {
                                buttonIconData3 = null;
                            } else {
                                buttonIconData3 = buttonIconData;
                            }
                            i38 = i17;
                            if (i36 != 0) {
                                buttonIconData5 = null;
                            } else {
                                buttonIconData5 = buttonIconData2;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                        }
                        f3.m.Companion companion117 = f3.m.INSTANCE;
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        final ButtonIconData buttonIconData111116 = buttonIconData5;
                        if (objE == companion.a()) {
                            objE = new er.l() { // from class: p70.h
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.h((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        long j11111 = jA;
                        f3.m mVarD116 = v.d(companion117, false, (er.l) objE, 1, null);
                        if ((i38 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: p70.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return n.i(str3, label2, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        f3.m mVarU116 = v.d(mVarD116, false, (er.l) objE2, 1, null).u(mVar3);
                        k70.a aVar116 = k70.a.f108864a;
                        int i41112 = k70.a.f108865b;
                        float level115 = aVar116.c(rVarH, i41112).getLevel0();
                        d3 d3VarF116 = a3.f(aVar116.b(rVarH, i41112).getSpacing100(), aVar116.b(rVarH, i41112).getSpacing50());
                        final String str119 = str3;
                        final ButtonIconData buttonIconData111117 = buttonIconData3;
                        final Integer num119 = num2;
                        final Label label119 = label2;
                        final q70.b bVar119 = bVar2;
                        label3 = label119;
                        bVar3 = bVar119;
                        rVar2 = rVarH;
                        q.i(mVarU116, j11111, 0L, level115, d3VarF116, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return n.j(label119, str119, bVar119, num119, buttonIconData111116, buttonIconData111117, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar3;
                        str2 = str3;
                        num3 = num2;
                        buttonIconData4 = buttonIconData111116;
                        jA = j11111;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        str2 = str;
                        buttonIconData3 = buttonIconData;
                        num3 = num2;
                        label3 = label2;
                        bVar3 = bVar2;
                        buttonIconData4 = buttonIconData2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: p70.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion118 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData111118 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j11112 = jA;
                    f3.m mVarD117 = v.d(companion118, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU117 = v.d(mVarD117, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar117 = k70.a.f108864a;
                    int i41113 = k70.a.f108865b;
                    float level116 = aVar117.c(rVarH, i41113).getLevel0();
                    d3 d3VarF117 = a3.f(aVar117.b(rVarH, i41113).getSpacing100(), aVar117.b(rVarH, i41113).getSpacing50());
                    final String str1110 = str3;
                    final ButtonIconData buttonIconData111119 = buttonIconData3;
                    final Integer num1110 = num2;
                    final Label label1110 = label2;
                    final q70.b bVar1110 = bVar2;
                    label3 = label1110;
                    bVar3 = bVar1110;
                    rVar2 = rVarH;
                    q.i(mVarU117, j11112, 0L, level116, d3VarF117, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label1110, str1110, bVar1110, num1110, buttonIconData111118, buttonIconData111119, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData111118;
                    jA = j11112;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            num2 = num;
            if ((i15 & 196608) == 0) {
                jA = j15;
                if ((i16 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i39;
            } else {
                jA = j15;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(buttonIconData)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(buttonIconData2)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion119 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData1111110 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j11113 = jA;
                    f3.m mVarD118 = v.d(companion119, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU118 = v.d(mVarD118, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar118 = k70.a.f108864a;
                    int i41114 = k70.a.f108865b;
                    float level117 = aVar118.c(rVarH, i41114).getLevel0();
                    d3 d3VarF118 = a3.f(aVar118.b(rVarH, i41114).getSpacing100(), aVar118.b(rVarH, i41114).getSpacing50());
                    final String str1111 = str3;
                    final ButtonIconData buttonIconData1111111 = buttonIconData3;
                    final Integer num1111 = num2;
                    final Label label1111 = label2;
                    final q70.b bVar1111 = bVar2;
                    label3 = label1111;
                    bVar3 = bVar1111;
                    rVar2 = rVarH;
                    q.i(mVarU118, j11113, 0L, level117, d3VarF118, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label1111, str1111, bVar1111, num1111, buttonIconData1111110, buttonIconData1111111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData1111110;
                    jA = j11113;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                } else {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                }
                f3.m.Companion companion1110 = f3.m.INSTANCE;
                objE = rVarH.E();
                companion = r.INSTANCE;
                final ButtonIconData buttonIconData1111112 = buttonIconData5;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: p70.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.h((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                long j11114 = jA;
                f3.m mVarD119 = v.d(companion1110, false, (er.l) objE, 1, null);
                if ((i38 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarU119 = v.d(mVarD119, false, (er.l) objE2, 1, null).u(mVar3);
                k70.a aVar119 = k70.a.f108864a;
                int i41115 = k70.a.f108865b;
                float level118 = aVar119.c(rVarH, i41115).getLevel0();
                d3 d3VarF119 = a3.f(aVar119.b(rVarH, i41115).getSpacing100(), aVar119.b(rVarH, i41115).getSpacing50());
                final String str1112 = str3;
                final ButtonIconData buttonIconData1111113 = buttonIconData3;
                final Integer num1112 = num2;
                final Label label1112 = label2;
                final q70.b bVar1112 = bVar2;
                label3 = label1112;
                bVar3 = bVar1112;
                rVar2 = rVarH;
                q.i(mVarU119, j11114, 0L, level118, d3VarF119, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.j(label1112, str1112, bVar1112, num1112, buttonIconData1111112, buttonIconData1111113, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar3;
                str2 = str3;
                num3 = num2;
                buttonIconData4 = buttonIconData1111112;
                jA = j11114;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                str2 = str;
                buttonIconData3 = buttonIconData;
                num3 = num2;
                label3 = label2;
                bVar3 = bVar2;
                buttonIconData4 = buttonIconData2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p70.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        bVar2 = bVar;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((i15 & 24576) == 0) {
                num2 = num;
                if (rVarH.W(num2)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((i15 & 196608) == 0) {
                jA = j15;
                if ((i16 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i39;
            } else {
                jA = j15;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(buttonIconData)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(buttonIconData2)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    } else {
                        if (i45 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i46 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            label2 = null;
                        }
                        if (i25 != 0) {
                            bVar2 = null;
                        }
                        if (i27 != 0) {
                            num2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                            i17 &= -458753;
                        }
                        if (i29 != 0) {
                            buttonIconData3 = null;
                        } else {
                            buttonIconData3 = buttonIconData;
                        }
                        i38 = i17;
                        if (i36 != 0) {
                            buttonIconData5 = null;
                        } else {
                            buttonIconData5 = buttonIconData2;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                    }
                    f3.m.Companion companion1111 = f3.m.INSTANCE;
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    final ButtonIconData buttonIconData1111114 = buttonIconData5;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: p70.h
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.h((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    long j11115 = jA;
                    f3.m mVarD1110 = v.d(companion1111, false, (er.l) objE, 1, null);
                    if ((i38 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z16 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: p70.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return n.i(str3, label2, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarU1110 = v.d(mVarD1110, false, (er.l) objE2, 1, null).u(mVar3);
                    k70.a aVar1110 = k70.a.f108864a;
                    int i41116 = k70.a.f108865b;
                    float level119 = aVar1110.c(rVarH, i41116).getLevel0();
                    d3 d3VarF1110 = a3.f(aVar1110.b(rVarH, i41116).getSpacing100(), aVar1110.b(rVarH, i41116).getSpacing50());
                    final String str1113 = str3;
                    final ButtonIconData buttonIconData1111115 = buttonIconData3;
                    final Integer num1113 = num2;
                    final Label label1113 = label2;
                    final q70.b bVar1113 = bVar2;
                    label3 = label1113;
                    bVar3 = bVar1113;
                    rVar2 = rVarH;
                    q.i(mVarU1110, j11115, 0L, level119, d3VarF1110, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return n.j(label1113, str1113, bVar1113, num1113, buttonIconData1111114, buttonIconData1111115, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar3;
                    str2 = str3;
                    num3 = num2;
                    buttonIconData4 = buttonIconData1111114;
                    jA = j11115;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    str2 = str;
                    buttonIconData3 = buttonIconData;
                    num3 = num2;
                    label3 = label2;
                    bVar3 = bVar2;
                    buttonIconData4 = buttonIconData2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: p70.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                } else {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                }
                f3.m.Companion companion1112 = f3.m.INSTANCE;
                objE = rVarH.E();
                companion = r.INSTANCE;
                final ButtonIconData buttonIconData1111116 = buttonIconData5;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: p70.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.h((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                long j11116 = jA;
                f3.m mVarD1111 = v.d(companion1112, false, (er.l) objE, 1, null);
                if ((i38 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarU1111 = v.d(mVarD1111, false, (er.l) objE2, 1, null).u(mVar3);
                k70.a aVar1111 = k70.a.f108864a;
                int i41117 = k70.a.f108865b;
                float level1110 = aVar1111.c(rVarH, i41117).getLevel0();
                d3 d3VarF1111 = a3.f(aVar1111.b(rVarH, i41117).getSpacing100(), aVar1111.b(rVarH, i41117).getSpacing50());
                final String str1114 = str3;
                final ButtonIconData buttonIconData1111117 = buttonIconData3;
                final Integer num1114 = num2;
                final Label label1114 = label2;
                final q70.b bVar1114 = bVar2;
                label3 = label1114;
                bVar3 = bVar1114;
                rVar2 = rVarH;
                q.i(mVarU1111, j11116, 0L, level1110, d3VarF1111, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.j(label1114, str1114, bVar1114, num1114, buttonIconData1111116, buttonIconData1111117, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar3;
                str2 = str3;
                num3 = num2;
                buttonIconData4 = buttonIconData1111116;
                jA = j11116;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                str2 = str;
                buttonIconData3 = buttonIconData;
                num3 = num2;
                label3 = label2;
                bVar3 = bVar2;
                buttonIconData4 = buttonIconData2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p70.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        num2 = num;
        if ((i15 & 196608) == 0) {
            jA = j15;
            if ((i16 & 32) == 0) {
                i39 = PKIFailureInfo.notAuthorized;
            } else {
                i39 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i39;
        } else {
            jA = j15;
        }
        i29 = i16 & 64;
        if (i29 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.G(buttonIconData)) {
                i35 = PKIFailureInfo.badCertTemplate;
            } else {
                i35 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i35;
        }
        i36 = i16 & 128;
        if (i36 != 0) {
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(buttonIconData2)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i17 |= i37;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                } else {
                    if (i45 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i46 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        label2 = null;
                    }
                    if (i25 != 0) {
                        bVar2 = null;
                    }
                    if (i27 != 0) {
                        num2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                        i17 &= -458753;
                    }
                    if (i29 != 0) {
                        buttonIconData3 = null;
                    } else {
                        buttonIconData3 = buttonIconData;
                    }
                    i38 = i17;
                    if (i36 != 0) {
                        buttonIconData5 = null;
                    } else {
                        buttonIconData5 = buttonIconData2;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
                }
                f3.m.Companion companion1113 = f3.m.INSTANCE;
                objE = rVarH.E();
                companion = r.INSTANCE;
                final ButtonIconData buttonIconData1111118 = buttonIconData5;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: p70.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.h((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                long j11117 = jA;
                f3.m mVarD1112 = v.d(companion1113, false, (er.l) objE, 1, null);
                if ((i38 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z16 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: p70.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.i(str3, label2, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarU1112 = v.d(mVarD1112, false, (er.l) objE2, 1, null).u(mVar3);
                k70.a aVar1112 = k70.a.f108864a;
                int i41118 = k70.a.f108865b;
                float level1111 = aVar1112.c(rVarH, i41118).getLevel0();
                d3 d3VarF1112 = a3.f(aVar1112.b(rVarH, i41118).getSpacing100(), aVar1112.b(rVarH, i41118).getSpacing50());
                final String str1115 = str3;
                final ButtonIconData buttonIconData1111119 = buttonIconData3;
                final Integer num1115 = num2;
                final Label label1115 = label2;
                final q70.b bVar1115 = bVar2;
                label3 = label1115;
                bVar3 = bVar1115;
                rVar2 = rVarH;
                q.i(mVarU1112, j11117, 0L, level1111, d3VarF1112, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.j(label1115, str1115, bVar1115, num1115, buttonIconData1111118, buttonIconData1111119, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar3;
                str2 = str3;
                num3 = num2;
                buttonIconData4 = buttonIconData1111118;
                jA = j11117;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                str2 = str;
                buttonIconData3 = buttonIconData;
                num3 = num2;
                label3 = label2;
                bVar3 = bVar2;
                buttonIconData4 = buttonIconData2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p70.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 12582912;
        if ((i17 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i45 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i46 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i18 != 0) {
                    label2 = null;
                }
                if (i25 != 0) {
                    bVar2 = null;
                }
                if (i27 != 0) {
                    num2 = null;
                }
                if ((i16 & 32) != 0) {
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                    i17 &= -458753;
                }
                if (i29 != 0) {
                    buttonIconData3 = null;
                } else {
                    buttonIconData3 = buttonIconData;
                }
                i38 = i17;
                if (i36 != 0) {
                    buttonIconData5 = null;
                } else {
                    buttonIconData5 = buttonIconData2;
                }
            } else {
                if (i45 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i46 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i18 != 0) {
                    label2 = null;
                }
                if (i25 != 0) {
                    bVar2 = null;
                }
                if (i27 != 0) {
                    num2 = null;
                }
                if ((i16 & 32) != 0) {
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a();
                    i17 &= -458753;
                }
                if (i29 != 0) {
                    buttonIconData3 = null;
                } else {
                    buttonIconData3 = buttonIconData;
                }
                i38 = i17;
                if (i36 != 0) {
                    buttonIconData5 = null;
                } else {
                    buttonIconData5 = buttonIconData2;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1474465708, i38, -1, "pl.gov.coi.common.ui.topMenu.TopMenu (TopMenu.kt:48)");
            }
            f3.m.Companion companion1114 = f3.m.INSTANCE;
            objE = rVarH.E();
            companion = r.INSTANCE;
            final ButtonIconData buttonIconData11111110 = buttonIconData5;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: p70.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.h((i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            long j11118 = jA;
            f3.m mVarD1113 = v.d(companion1114, false, (er.l) objE, 1, null);
            if ((i38 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i38 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z16 | z17;
            objE2 = rVarH.E();
            if (z18) {
                objE2 = new er.l() { // from class: p70.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.i(str3, label2, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.l() { // from class: p70.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.i(str3, label2, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarU1113 = v.d(mVarD1113, false, (er.l) objE2, 1, null).u(mVar3);
            k70.a aVar1113 = k70.a.f108864a;
            int i41119 = k70.a.f108865b;
            float level1112 = aVar1113.c(rVarH, i41119).getLevel0();
            d3 d3VarF1113 = a3.f(aVar1113.b(rVarH, i41119).getSpacing100(), aVar1113.b(rVarH, i41119).getSpacing50());
            final String str1116 = str3;
            final ButtonIconData buttonIconData11111111 = buttonIconData3;
            final Integer num1116 = num2;
            final Label label1116 = label2;
            final q70.b bVar1116 = bVar2;
            label3 = label1116;
            bVar3 = bVar1116;
            rVar2 = rVarH;
            q.i(mVarU1113, j11118, 0L, level1112, d3VarF1113, y2.m.d(1489133381, true, new er.q() { // from class: p70.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.j(label1116, str1116, bVar1116, num1116, buttonIconData11111110, buttonIconData11111111, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, ((i38 >> 12) & 112) | 196608, 4);
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar3;
            str2 = str3;
            num3 = num2;
            buttonIconData4 = buttonIconData11111110;
            jA = j11118;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar2 = mVar;
            str2 = str;
            buttonIconData3 = buttonIconData;
            num3 = num2;
            label3 = label2;
            bVar3 = bVar2;
            buttonIconData4 = buttonIconData2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p70.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(mVar2, str2, label3, bVar3, num3, jA, buttonIconData3, buttonIconData4, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(String str, Label label, i0 i0Var) {
        String tag;
        if (str == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("topmenu");
            if (label == null || (tag = label.getTag()) == null) {
                tag = "Undefined";
            }
            sb5.append(tag);
            str = sb5.toString();
        }
        f0.y0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x024e  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    public static final oq.i0 j(final Label label, final String str, q70.b bVar, Integer num, ButtonIconData buttonIconData, ButtonIconData buttonIconData2, p3 p3Var, r rVar, int i15) {
        f3.m.Companion companion;
        boolean z15;
        ?? r15;
        q4.e eVar;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1489133381, i15, -1, "pl.gov.coi.common.ui.topMenu.TopMenu.<anonymous> (TopMenu.kt:61)");
            }
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            f3.m.Companion companion3 = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion3, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), interfaceC1317cI, rVar2, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarH);
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
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            q3 q3Var = q3.f39261a;
            float f15 = 48;
            f3.m mVarT = androidx.compose.foundation.layout.d.t(companion3, c5.h.n(f15));
            w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarT);
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
            if (buttonIconData == null) {
                rVar2.X(-1998449289);
            } else {
                rVar2.X(-1998449288);
                i30.g.f(buttonIconData, false, false, rVar, 0, 6);
                rVar2 = rVar;
                oq.i0 i0Var = oq.i0.f148189a;
            }
            rVar2.R();
            rVar2.x();
            if (label == null || !label.l()) {
                rVar2.X(-1047129609);
                if (num != null) {
                    rVar2.X(-1047082117);
                    k70.a aVar = k70.a.f108864a;
                    int i16 = k70.a.f108865b;
                    companion = companion3;
                    z15 = false;
                    i1.c(l4.c.c(num.intValue(), rVar2, 0), null, p3.c(q3Var, a3.r(companion, aVar.b(rVar2, i16).getSpacing100(), 0.0f, aVar.b(rVar2, i16).getSpacing100(), 0.0f, 10, null), 1.0f, false, 2, null), null, null, 0.0f, null, rVar2, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
                } else {
                    companion = companion3;
                    z15 = false;
                    rVar2.X(-1051158431);
                }
                rVar2.R();
                rVar2.R();
                r15 = z15;
            } else {
                rVar2.X(-1048365362);
                String text = label.getText();
                k70.a aVar2 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarC = p3.c(q3Var, a3.r(companion3, aVar2.b(rVar2, i17).getSpacing100(), 0.0f, aVar2.b(rVar2, i17).getSpacing100(), 0.0f, 10, null), 1.0f, false, 2, null);
                Object objE = rVar2.E();
                r.Companion companion5 = r.INSTANCE;
                if (objE == companion5.a()) {
                    objE = new er.l() { // from class: p70.l
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.k((i0) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f3.m mVarD = v.d(mVarC, false, (er.l) objE, 1, null);
                boolean zW = rVar2.W(str) | rVar2.W(label);
                Object objE2 = rVar2.E();
                if (zW || objE2 == companion5.a()) {
                    objE2 = new er.l() { // from class: p70.m
                        @Override // er.l
                        public final Object b(Object obj) {
                            return n.l(str, label, (i0) obj);
                        }
                    };
                    rVar2.v(objE2);
                }
                f3.m mVarD2 = v.d(mVarD, false, (er.l) objE2, 1, null);
                if (bVar != null) {
                    q4.e.b bVar2 = new q4.e.b(0, 1, null);
                    if (bVar.getRange().getLast() >= text.length() || bVar.getRange().isEmpty()) {
                        bVar2.f(text);
                    } else {
                        bVar2.f(text.substring(0, bVar.getRange().getFirst()));
                        int iO = bVar2.o(new SpanStyle(bVar.getColor(), 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65534, (fr.k) null));
                        try {
                            bVar2.append(fu.r.a1(text, bVar.getRange()));
                            bVar2.l(iO);
                            if (bVar.getRange().getLast() + 1 < text.length()) {
                                bVar2.f(text.substring(bVar.getRange().getLast() + 1));
                            }
                        } catch (Throwable th4) {
                            bVar2.l(iO);
                            throw th4;
                        }
                    }
                    eVar = bVar2.p();
                    if (eVar == null) {
                        eVar = new q4.e(text, null, 2, null);
                    }
                } else {
                    eVar = new q4.e(text, null, 2, null);
                }
                j70.h.g(mVarD2, null, null, null, eVar, aVar2.a(rVar2, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar2.f(rVar2, i17).p(), null, null, false, false, null, rVar, 0, 1597440, 0, 32944078);
                rVar2 = rVar;
                rVar2.R();
                companion = companion3;
                r15 = 0;
            }
            f3.m mVarT2 = androidx.compose.foundation.layout.d.t(companion, c5.h.n(f15));
            w0 w0VarI2 = d1.r.i(companion2.e(), r15);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, r15));
            e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarT2);
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
            n6.i(rVarC3, w0VarI2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            if (buttonIconData2 == null) {
                rVar2.X(-1114737367);
                rVar2.R();
            } else {
                rVar2.X(-1114737366);
                i30.g.f(buttonIconData2, false, false, rVar2, 0, 6);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar.R();
            }
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:5:0x0015  */
    public static final oq.i0 l(String str, Label label, i0 i0Var) {
        String tag;
        if (str != null) {
            tag = str + "Text";
            if (tag == null) {
                tag = label.getTag();
            }
        } else {
            tag = label.getTag();
        }
        f0.y0(i0Var, tag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f3.m mVar, String str, Label label, q70.b bVar, Integer num, long j15, ButtonIconData buttonIconData, ButtonIconData buttonIconData2, int i15, int i16, r rVar, int i17) {
        g(mVar, str, label, bVar, num, j15, buttonIconData, buttonIconData2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
