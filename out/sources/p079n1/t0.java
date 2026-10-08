package p079n1;

import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.v;
import er.l;
import er.p;
import f3.m;
import m3.e;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p143z0.b3;
import q4.TextLayoutResult;
import q4.TextStyle;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lq4/e;", "text", "Lf3/m;", "modifier", "Lq4/b4;", "style", "", "softWrap", "Lb5/v;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "onClick", "d", "(Lq4/e;Lf3/m;Lq4/b4;ZIILer/l;Ler/l;Lm2/r;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3<TextLayoutResult> f130442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Integer, i0> f130443b;

        /* JADX WARN: Multi-variable type inference failed */
        a(a3<TextLayoutResult> a3Var, l<? super Integer, i0> lVar) {
            this.f130442a = a3Var;
            this.f130443b = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a3 a3Var, l lVar, e eVar) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) a3Var.getValue();
            if (textLayoutResult != null) {
                lVar.b(Integer.valueOf(textLayoutResult.x(eVar.getPackedValue())));
            }
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            final a3<TextLayoutResult> a3Var = this.f130442a;
            final l<Integer, i0> lVar = this.f130443b;
            Object objI = b3.i(k0Var, null, null, null, new l() { // from class: n1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return t0.a.b(a3Var, lVar, (e) obj);
                }
            }, eVar, 7, null);
            return objI == b.e() ? objI : i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0170  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x017b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x019b  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01da  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    @oq.a
    public static final void d(final q4.e eVar, m mVar, TextStyle textStyle, boolean z15, int i15, int i16, l<? super TextLayoutResult, i0> lVar, final l<? super Integer, i0> lVar2, r rVar, final int i17, final int i18) {
        int i19;
        m mVar2;
        int i25;
        TextStyle textStyle2;
        int i26;
        int i27;
        int i28;
        int i29;
        int iA;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z16;
        r rVar2;
        final boolean z17;
        final int i45;
        final TextStyle textStyle3;
        final l<? super TextLayoutResult, i0> lVar3;
        final m mVar3;
        final int i46;
        d5 d5VarM;
        TextStyle textStyleA;
        boolean z18;
        int i47;
        int i48;
        final l<? super TextLayoutResult, i0> lVar4;
        Object objE;
        r.Companion companion;
        final a3 a3Var;
        boolean z19;
        Object objE2;
        boolean z25;
        Object objE3;
        Object objE4;
        int i49;
        r rVarH = rVar.h(-246609449);
        if ((i17 & 6) == 0) {
            i19 = (rVarH.W(eVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i55 = i18 & 2;
        if (i55 == 0) {
            if ((i17 & 48) == 0) {
                mVar2 = mVar;
                i19 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i25 = i18 & 4;
            if (i25 != 0) {
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                    textStyle2 = textStyle;
                    if (rVarH.W(textStyle2)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i19 |= i26;
                }
                i27 = i18 & 8;
                if (i27 != 0) {
                    if ((i17 & 3072) == 0) {
                        if (rVarH.a(z15)) {
                            i28 = 2048;
                        } else {
                            i28 = 1024;
                        }
                        i19 |= i28;
                    }
                    i29 = i18 & 16;
                    if (i29 != 0) {
                        if ((i17 & 24576) == 0) {
                            iA = i15;
                            if (rVarH.c(iA)) {
                                i35 = 16384;
                            } else {
                                i35 = PKIFailureInfo.certRevoked;
                            }
                            i19 |= i35;
                        }
                        i36 = i18 & 32;
                        if (i36 != 0) {
                            i19 |= 196608;
                        } else if ((i17 & 196608) == 0) {
                            if (rVarH.c(i16)) {
                                i37 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i37 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i37;
                        }
                        i38 = i18 & 64;
                        if (i38 != 0) {
                            i19 |= 1572864;
                        } else if ((i17 & 1572864) == 0) {
                            if (rVarH.G(lVar)) {
                                i39 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i39 = PKIFailureInfo.signerNotTrusted;
                            }
                            i19 |= i39;
                        }
                        if ((i17 & 12582912) == 0) {
                            if (rVarH.G(lVar2)) {
                                i49 = 8388608;
                            } else {
                                i49 = 4194304;
                            }
                            i19 |= i49;
                        }
                        if ((i19 & 4793491) != 4793490) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (rVarH.r(z16, i19 & 1)) {
                            if (i55 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i25 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i27 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i29 != 0) {
                                iA = v.INSTANCE.a();
                            }
                            if (i36 != 0) {
                                i48 = Integer.MAX_VALUE;
                                i47 = i38;
                            } else {
                                i47 = i38;
                                i48 = i16;
                            }
                            if (i47 != 0) {
                                objE4 = rVarH.E();
                                if (objE4 == r.INSTANCE.a()) {
                                    objE4 = new l() { // from class: n1.p0
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return t0.e((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE4);
                                }
                                lVar4 = (l) objE4;
                            } else {
                                lVar4 = lVar;
                            }
                            if (t.k()) {
                                t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = c6.e(null, null, 2, null);
                                rVarH.v(objE);
                            }
                            a3Var = (a3) objE;
                            m.Companion companion2 = m.INSTANCE;
                            if ((29360128 & i19) == 8388608) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objE2 = rVarH.E();
                            if (z19 || objE2 == companion.a()) {
                                objE2 = new a(a3Var, lVar2);
                                rVarH.v(objE2);
                            }
                            m mVarU = mVar2.u(w0.c(companion2, lVar2, (PointerInputEventHandler) objE2));
                            z25 = (i19 & 3670016) == 1048576;
                            objE3 = rVarH.E();
                            if (z25 || objE3 == companion.a()) {
                                objE3 = new l() { // from class: n1.q0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            rVar2 = rVarH;
                            k0.p(eVar, mVarU, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                            if (t.k()) {
                                t.n();
                            }
                            lVar3 = lVar4;
                            textStyle3 = textStyleA;
                            z17 = z18;
                            i45 = i48;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            z17 = z15;
                            i45 = i16;
                            textStyle3 = textStyle2;
                            lVar3 = lVar;
                        }
                        mVar3 = mVar2;
                        i46 = iA;
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: n1.r0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i19 |= 24576;
                    iA = i15;
                    i36 = i18 & 32;
                    if (i36 != 0) {
                        i19 |= 196608;
                    } else if ((i17 & 196608) == 0) {
                        if (rVarH.c(i16)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 64;
                    if (i38 != 0) {
                        i19 |= 1572864;
                    } else if ((i17 & 1572864) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i39;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i49 = 8388608;
                        } else {
                            i49 = 4194304;
                        }
                        i19 |= i49;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        if (i55 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i25 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i27 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i29 != 0) {
                            iA = v.INSTANCE.a();
                        }
                        if (i36 != 0) {
                            i48 = Integer.MAX_VALUE;
                            i47 = i38;
                        } else {
                            i47 = i38;
                            i48 = i16;
                        }
                        if (i47 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = new l() { // from class: n1.p0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return t0.e((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar4 = (l) objE4;
                        } else {
                            lVar4 = lVar;
                        }
                        if (t.k()) {
                            t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(null, null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (a3) objE;
                        m.Companion companion3 = m.INSTANCE;
                        if ((29360128 & i19) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        }
                        m mVarU2 = mVar2.u(w0.c(companion3, lVar2, (PointerInputEventHandler) objE2));
                        if ((i19 & 3670016) == 1048576) {
                        }
                        objE3 = rVarH.E();
                        if (z25) {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        rVar2 = rVarH;
                        k0.p(eVar, mVarU2, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                        if (t.k()) {
                            t.n();
                        }
                        lVar3 = lVar4;
                        textStyle3 = textStyleA;
                        z17 = z18;
                        i45 = i48;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z17 = z15;
                        i45 = i16;
                        textStyle3 = textStyle2;
                        lVar3 = lVar;
                    }
                    mVar3 = mVar2;
                    i46 = iA;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.r0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 3072;
                i29 = i18 & 16;
                if (i29 != 0) {
                    if ((i17 & 24576) == 0) {
                        iA = i15;
                        if (rVarH.c(iA)) {
                            i35 = 16384;
                        } else {
                            i35 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i35;
                    }
                    i36 = i18 & 32;
                    if (i36 != 0) {
                        i19 |= 196608;
                    } else if ((i17 & 196608) == 0) {
                        if (rVarH.c(i16)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 64;
                    if (i38 != 0) {
                        i19 |= 1572864;
                    } else if ((i17 & 1572864) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i39;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i49 = 8388608;
                        } else {
                            i49 = 4194304;
                        }
                        i19 |= i49;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        if (i55 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i25 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i27 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i29 != 0) {
                            iA = v.INSTANCE.a();
                        }
                        if (i36 != 0) {
                            i48 = Integer.MAX_VALUE;
                            i47 = i38;
                        } else {
                            i47 = i38;
                            i48 = i16;
                        }
                        if (i47 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = new l() { // from class: n1.p0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return t0.e((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar4 = (l) objE4;
                        } else {
                            lVar4 = lVar;
                        }
                        if (t.k()) {
                            t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(null, null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (a3) objE;
                        m.Companion companion4 = m.INSTANCE;
                        if ((29360128 & i19) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        }
                        m mVarU3 = mVar2.u(w0.c(companion4, lVar2, (PointerInputEventHandler) objE2));
                        if ((i19 & 3670016) == 1048576) {
                        }
                        objE3 = rVarH.E();
                        if (z25) {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        rVar2 = rVarH;
                        k0.p(eVar, mVarU3, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                        if (t.k()) {
                            t.n();
                        }
                        lVar3 = lVar4;
                        textStyle3 = textStyleA;
                        z17 = z18;
                        i45 = i48;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z17 = z15;
                        i45 = i16;
                        textStyle3 = textStyle2;
                        lVar3 = lVar;
                    }
                    mVar3 = mVar2;
                    i46 = iA;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.r0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                iA = i15;
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion5 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU4 = mVar2.u(w0.c(companion5, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU4, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= MLKEMEngine.KyberPolyBytes;
            textStyle2 = textStyle;
            i27 = i18 & 8;
            if (i27 != 0) {
                if ((i17 & 3072) == 0) {
                    if (rVarH.a(z15)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i19 |= i28;
                }
                i29 = i18 & 16;
                if (i29 != 0) {
                    if ((i17 & 24576) == 0) {
                        iA = i15;
                        if (rVarH.c(iA)) {
                            i35 = 16384;
                        } else {
                            i35 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i35;
                    }
                    i36 = i18 & 32;
                    if (i36 != 0) {
                        i19 |= 196608;
                    } else if ((i17 & 196608) == 0) {
                        if (rVarH.c(i16)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 64;
                    if (i38 != 0) {
                        i19 |= 1572864;
                    } else if ((i17 & 1572864) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i39;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i49 = 8388608;
                        } else {
                            i49 = 4194304;
                        }
                        i19 |= i49;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        if (i55 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i25 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i27 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i29 != 0) {
                            iA = v.INSTANCE.a();
                        }
                        if (i36 != 0) {
                            i48 = Integer.MAX_VALUE;
                            i47 = i38;
                        } else {
                            i47 = i38;
                            i48 = i16;
                        }
                        if (i47 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = new l() { // from class: n1.p0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return t0.e((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar4 = (l) objE4;
                        } else {
                            lVar4 = lVar;
                        }
                        if (t.k()) {
                            t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(null, null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (a3) objE;
                        m.Companion companion6 = m.INSTANCE;
                        if ((29360128 & i19) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        }
                        m mVarU5 = mVar2.u(w0.c(companion6, lVar2, (PointerInputEventHandler) objE2));
                        if ((i19 & 3670016) == 1048576) {
                        }
                        objE3 = rVarH.E();
                        if (z25) {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        rVar2 = rVarH;
                        k0.p(eVar, mVarU5, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                        if (t.k()) {
                            t.n();
                        }
                        lVar3 = lVar4;
                        textStyle3 = textStyleA;
                        z17 = z18;
                        i45 = i48;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z17 = z15;
                        i45 = i16;
                        textStyle3 = textStyle2;
                        lVar3 = lVar;
                    }
                    mVar3 = mVar2;
                    i46 = iA;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.r0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                iA = i15;
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion7 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU6 = mVar2.u(w0.c(companion7, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU6, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            i29 = i18 & 16;
            if (i29 != 0) {
                if ((i17 & 24576) == 0) {
                    iA = i15;
                    if (rVarH.c(iA)) {
                        i35 = 16384;
                    } else {
                        i35 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i35;
                }
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion8 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU7 = mVar2.u(w0.c(companion8, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU7, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            iA = i15;
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
            } else if ((i17 & 196608) == 0) {
                if (rVarH.c(i16)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i37;
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
            } else if ((i17 & 1572864) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = PKIFailureInfo.badCertTemplate;
                } else {
                    i39 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i39;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i49 = 8388608;
                } else {
                    i49 = 4194304;
                }
                i19 |= i49;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                if (i55 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i25 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i29 != 0) {
                    iA = v.INSTANCE.a();
                }
                if (i36 != 0) {
                    i48 = Integer.MAX_VALUE;
                    i47 = i38;
                } else {
                    i47 = i38;
                    i48 = i16;
                }
                if (i47 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new l() { // from class: n1.p0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.e((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar4 = (l) objE4;
                } else {
                    lVar4 = lVar;
                }
                if (t.k()) {
                    t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(null, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                m.Companion companion9 = m.INSTANCE;
                if ((29360128 & i19) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                }
                m mVarU8 = mVar2.u(w0.c(companion9, lVar2, (PointerInputEventHandler) objE2));
                if ((i19 & 3670016) == 1048576) {
                }
                objE3 = rVarH.E();
                if (z25) {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                rVar2 = rVarH;
                k0.p(eVar, mVarU8, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                if (t.k()) {
                    t.n();
                }
                lVar3 = lVar4;
                textStyle3 = textStyleA;
                z17 = z18;
                i45 = i48;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z17 = z15;
                i45 = i16;
                textStyle3 = textStyle2;
                lVar3 = lVar;
            }
            mVar3 = mVar2;
            i46 = iA;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.r0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 48;
        mVar2 = mVar;
        i25 = i18 & 4;
        if (i25 != 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                textStyle2 = textStyle;
                if (rVarH.W(textStyle2)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i19 |= i26;
            }
            i27 = i18 & 8;
            if (i27 != 0) {
                if ((i17 & 3072) == 0) {
                    if (rVarH.a(z15)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i19 |= i28;
                }
                i29 = i18 & 16;
                if (i29 != 0) {
                    if ((i17 & 24576) == 0) {
                        iA = i15;
                        if (rVarH.c(iA)) {
                            i35 = 16384;
                        } else {
                            i35 = PKIFailureInfo.certRevoked;
                        }
                        i19 |= i35;
                    }
                    i36 = i18 & 32;
                    if (i36 != 0) {
                        i19 |= 196608;
                    } else if ((i17 & 196608) == 0) {
                        if (rVarH.c(i16)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                    i38 = i18 & 64;
                    if (i38 != 0) {
                        i19 |= 1572864;
                    } else if ((i17 & 1572864) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i39;
                    }
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.G(lVar2)) {
                            i49 = 8388608;
                        } else {
                            i49 = 4194304;
                        }
                        i19 |= i49;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i19 & 1)) {
                        if (i55 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i25 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i27 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i29 != 0) {
                            iA = v.INSTANCE.a();
                        }
                        if (i36 != 0) {
                            i48 = Integer.MAX_VALUE;
                            i47 = i38;
                        } else {
                            i47 = i38;
                            i48 = i16;
                        }
                        if (i47 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = new l() { // from class: n1.p0
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return t0.e((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar4 = (l) objE4;
                        } else {
                            lVar4 = lVar;
                        }
                        if (t.k()) {
                            t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(null, null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (a3) objE;
                        m.Companion companion10 = m.INSTANCE;
                        if ((29360128 & i19) == 8388608) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new a(a3Var, lVar2);
                            rVarH.v(objE2);
                        }
                        m mVarU9 = mVar2.u(w0.c(companion10, lVar2, (PointerInputEventHandler) objE2));
                        if ((i19 & 3670016) == 1048576) {
                        }
                        objE3 = rVarH.E();
                        if (z25) {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new l() { // from class: n1.q0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        rVar2 = rVarH;
                        k0.p(eVar, mVarU9, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                        if (t.k()) {
                            t.n();
                        }
                        lVar3 = lVar4;
                        textStyle3 = textStyleA;
                        z17 = z18;
                        i45 = i48;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z17 = z15;
                        i45 = i16;
                        textStyle3 = textStyle2;
                        lVar3 = lVar;
                    }
                    mVar3 = mVar2;
                    i46 = iA;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.r0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                iA = i15;
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion11 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU10 = mVar2.u(w0.c(companion11, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU10, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            i29 = i18 & 16;
            if (i29 != 0) {
                if ((i17 & 24576) == 0) {
                    iA = i15;
                    if (rVarH.c(iA)) {
                        i35 = 16384;
                    } else {
                        i35 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i35;
                }
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion12 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU11 = mVar2.u(w0.c(companion12, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU11, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            iA = i15;
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
            } else if ((i17 & 196608) == 0) {
                if (rVarH.c(i16)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i37;
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
            } else if ((i17 & 1572864) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = PKIFailureInfo.badCertTemplate;
                } else {
                    i39 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i39;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i49 = 8388608;
                } else {
                    i49 = 4194304;
                }
                i19 |= i49;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                if (i55 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i25 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i29 != 0) {
                    iA = v.INSTANCE.a();
                }
                if (i36 != 0) {
                    i48 = Integer.MAX_VALUE;
                    i47 = i38;
                } else {
                    i47 = i38;
                    i48 = i16;
                }
                if (i47 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new l() { // from class: n1.p0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.e((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar4 = (l) objE4;
                } else {
                    lVar4 = lVar;
                }
                if (t.k()) {
                    t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(null, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                m.Companion companion13 = m.INSTANCE;
                if ((29360128 & i19) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                }
                m mVarU12 = mVar2.u(w0.c(companion13, lVar2, (PointerInputEventHandler) objE2));
                if ((i19 & 3670016) == 1048576) {
                }
                objE3 = rVarH.E();
                if (z25) {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                rVar2 = rVarH;
                k0.p(eVar, mVarU12, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                if (t.k()) {
                    t.n();
                }
                lVar3 = lVar4;
                textStyle3 = textStyleA;
                z17 = z18;
                i45 = i48;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z17 = z15;
                i45 = i16;
                textStyle3 = textStyle2;
                lVar3 = lVar;
            }
            mVar3 = mVar2;
            i46 = iA;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.r0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        textStyle2 = textStyle;
        i27 = i18 & 8;
        if (i27 != 0) {
            if ((i17 & 3072) == 0) {
                if (rVarH.a(z15)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i19 |= i28;
            }
            i29 = i18 & 16;
            if (i29 != 0) {
                if ((i17 & 24576) == 0) {
                    iA = i15;
                    if (rVarH.c(iA)) {
                        i35 = 16384;
                    } else {
                        i35 = PKIFailureInfo.certRevoked;
                    }
                    i19 |= i35;
                }
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                } else if ((i17 & 196608) == 0) {
                    if (rVarH.c(i16)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                } else if ((i17 & 1572864) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i39;
                }
                if ((i17 & 12582912) == 0) {
                    if (rVarH.G(lVar2)) {
                        i49 = 8388608;
                    } else {
                        i49 = 4194304;
                    }
                    i19 |= i49;
                }
                if ((i19 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i19 & 1)) {
                    if (i55 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i25 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i29 != 0) {
                        iA = v.INSTANCE.a();
                    }
                    if (i36 != 0) {
                        i48 = Integer.MAX_VALUE;
                        i47 = i38;
                    } else {
                        i47 = i38;
                        i48 = i16;
                    }
                    if (i47 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new l() { // from class: n1.p0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return t0.e((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar4 = (l) objE4;
                    } else {
                        lVar4 = lVar;
                    }
                    if (t.k()) {
                        t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(null, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    m.Companion companion14 = m.INSTANCE;
                    if ((29360128 & i19) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(a3Var, lVar2);
                        rVarH.v(objE2);
                    }
                    m mVarU13 = mVar2.u(w0.c(companion14, lVar2, (PointerInputEventHandler) objE2));
                    if ((i19 & 3670016) == 1048576) {
                    }
                    objE3 = rVarH.E();
                    if (z25) {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new l() { // from class: n1.q0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    rVar2 = rVarH;
                    k0.p(eVar, mVarU13, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                    if (t.k()) {
                        t.n();
                    }
                    lVar3 = lVar4;
                    textStyle3 = textStyleA;
                    z17 = z18;
                    i45 = i48;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z17 = z15;
                    i45 = i16;
                    textStyle3 = textStyle2;
                    lVar3 = lVar;
                }
                mVar3 = mVar2;
                i46 = iA;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.r0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            iA = i15;
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
            } else if ((i17 & 196608) == 0) {
                if (rVarH.c(i16)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i37;
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
            } else if ((i17 & 1572864) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = PKIFailureInfo.badCertTemplate;
                } else {
                    i39 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i39;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i49 = 8388608;
                } else {
                    i49 = 4194304;
                }
                i19 |= i49;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                if (i55 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i25 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i29 != 0) {
                    iA = v.INSTANCE.a();
                }
                if (i36 != 0) {
                    i48 = Integer.MAX_VALUE;
                    i47 = i38;
                } else {
                    i47 = i38;
                    i48 = i16;
                }
                if (i47 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new l() { // from class: n1.p0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.e((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar4 = (l) objE4;
                } else {
                    lVar4 = lVar;
                }
                if (t.k()) {
                    t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(null, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                m.Companion companion15 = m.INSTANCE;
                if ((29360128 & i19) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                }
                m mVarU14 = mVar2.u(w0.c(companion15, lVar2, (PointerInputEventHandler) objE2));
                if ((i19 & 3670016) == 1048576) {
                }
                objE3 = rVarH.E();
                if (z25) {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                rVar2 = rVarH;
                k0.p(eVar, mVarU14, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                if (t.k()) {
                    t.n();
                }
                lVar3 = lVar4;
                textStyle3 = textStyleA;
                z17 = z18;
                i45 = i48;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z17 = z15;
                i45 = i16;
                textStyle3 = textStyle2;
                lVar3 = lVar;
            }
            mVar3 = mVar2;
            i46 = iA;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.r0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 3072;
        i29 = i18 & 16;
        if (i29 != 0) {
            if ((i17 & 24576) == 0) {
                iA = i15;
                if (rVarH.c(iA)) {
                    i35 = 16384;
                } else {
                    i35 = PKIFailureInfo.certRevoked;
                }
                i19 |= i35;
            }
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
            } else if ((i17 & 196608) == 0) {
                if (rVarH.c(i16)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i37;
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
            } else if ((i17 & 1572864) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = PKIFailureInfo.badCertTemplate;
                } else {
                    i39 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i39;
            }
            if ((i17 & 12582912) == 0) {
                if (rVarH.G(lVar2)) {
                    i49 = 8388608;
                } else {
                    i49 = 4194304;
                }
                i19 |= i49;
            }
            if ((i19 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i19 & 1)) {
                if (i55 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i25 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i29 != 0) {
                    iA = v.INSTANCE.a();
                }
                if (i36 != 0) {
                    i48 = Integer.MAX_VALUE;
                    i47 = i38;
                } else {
                    i47 = i38;
                    i48 = i16;
                }
                if (i47 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new l() { // from class: n1.p0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return t0.e((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar4 = (l) objE4;
                } else {
                    lVar4 = lVar;
                }
                if (t.k()) {
                    t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(null, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                m.Companion companion16 = m.INSTANCE;
                if ((29360128 & i19) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(a3Var, lVar2);
                    rVarH.v(objE2);
                }
                m mVarU15 = mVar2.u(w0.c(companion16, lVar2, (PointerInputEventHandler) objE2));
                if ((i19 & 3670016) == 1048576) {
                }
                objE3 = rVarH.E();
                if (z25) {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: n1.q0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                rVar2 = rVarH;
                k0.p(eVar, mVarU15, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
                if (t.k()) {
                    t.n();
                }
                lVar3 = lVar4;
                textStyle3 = textStyleA;
                z17 = z18;
                i45 = i48;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z17 = z15;
                i45 = i16;
                textStyle3 = textStyle2;
                lVar3 = lVar;
            }
            mVar3 = mVar2;
            i46 = iA;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.r0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 24576;
        iA = i15;
        i36 = i18 & 32;
        if (i36 != 0) {
            i19 |= 196608;
        } else if ((i17 & 196608) == 0) {
            if (rVarH.c(i16)) {
                i37 = PKIFailureInfo.unsupportedVersion;
            } else {
                i37 = PKIFailureInfo.notAuthorized;
            }
            i19 |= i37;
        }
        i38 = i18 & 64;
        if (i38 != 0) {
            i19 |= 1572864;
        } else if ((i17 & 1572864) == 0) {
            if (rVarH.G(lVar)) {
                i39 = PKIFailureInfo.badCertTemplate;
            } else {
                i39 = PKIFailureInfo.signerNotTrusted;
            }
            i19 |= i39;
        }
        if ((i17 & 12582912) == 0) {
            if (rVarH.G(lVar2)) {
                i49 = 8388608;
            } else {
                i49 = 4194304;
            }
            i19 |= i49;
        }
        if ((i19 & 4793491) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i19 & 1)) {
            if (i55 != 0) {
                mVar2 = m.INSTANCE;
            }
            if (i25 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i27 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            if (i29 != 0) {
                iA = v.INSTANCE.a();
            }
            if (i36 != 0) {
                i48 = Integer.MAX_VALUE;
                i47 = i38;
            } else {
                i47 = i38;
                i48 = i16;
            }
            if (i47 != 0) {
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = new l() { // from class: n1.p0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t0.e((TextLayoutResult) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                lVar4 = (l) objE4;
            } else {
                lVar4 = lVar;
            }
            if (t.k()) {
                t.o(-246609449, i19, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(null, null, 2, null);
                rVarH.v(objE);
            }
            a3Var = (a3) objE;
            m.Companion companion17 = m.INSTANCE;
            if ((29360128 & i19) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            objE2 = rVarH.E();
            if (z19) {
                objE2 = new a(a3Var, lVar2);
                rVarH.v(objE2);
            } else {
                objE2 = new a(a3Var, lVar2);
                rVarH.v(objE2);
            }
            m mVarU16 = mVar2.u(w0.c(companion17, lVar2, (PointerInputEventHandler) objE2));
            if ((i19 & 3670016) == 1048576) {
            }
            objE3 = rVarH.E();
            if (z25) {
                objE3 = new l() { // from class: n1.q0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new l() { // from class: n1.q0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t0.f(a3Var, lVar4, (TextLayoutResult) obj);
                    }
                };
                rVarH.v(objE3);
            }
            rVar2 = rVarH;
            k0.p(eVar, mVarU16, textStyleA, (l) objE3, iA, z18, i48, 0, null, null, null, rVar2, (58254 & i19) | (458752 & (i19 << 6)) | ((i19 << 3) & 3670016), 0, 1920);
            if (t.k()) {
                t.n();
            }
            lVar3 = lVar4;
            textStyle3 = textStyleA;
            z17 = z18;
            i45 = i48;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            z17 = z15;
            i45 = i16;
            textStyle3 = textStyle2;
            lVar3 = lVar;
        }
        mVar3 = mVar2;
        i46 = iA;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.r0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t0.g(eVar, mVar3, textStyle3, z17, i46, i45, lVar3, lVar2, i17, i18, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a3 a3Var, l lVar, TextLayoutResult textLayoutResult) {
        a3Var.setValue(textLayoutResult);
        lVar.b(textLayoutResult);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(q4.e eVar, m mVar, TextStyle textStyle, boolean z15, int i15, int i16, l lVar, l lVar2, int i17, int i18, r rVar, int i19) {
        d(eVar, mVar, textStyle, z15, i15, i16, lVar, lVar2, rVar, g4.a(i17 | 1), i18);
        return i0.f148189a;
    }
}
