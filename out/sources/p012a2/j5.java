package p012a2;

import androidx.compose.ui.graphics.Color;
import b5.e;
import b5.f;
import b5.j;
import b5.k;
import c5.v;
import er.p;
import f3.m;
import n3.p1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p079n1.k0;
import q4.TextLayoutResult;
import q4.TextStyle;
import u4.FontWeight;
import u4.l;
import u4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÏ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"\u001a%\u0010&\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0007¢\u0006\u0004\b&\u0010'\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"", "text", "Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Lc5/v;", "fontSize", "Lu4/y;", "fontStyle", "Lu4/d0;", "fontWeight", "Lu4/l;", "fontFamily", "letterSpacing", "Lb5/k;", "textDecoration", "Lb5/j;", "textAlign", "lineHeight", "Lb5/v;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Lq4/t3;", "Loq/i0;", "onTextLayout", "Lq4/b4;", "style", "g", "(Ljava/lang/String;Lf3/m;JJLu4/y;Lu4/d0;Lu4/l;JLb5/k;Lb5/j;JIZIILer/l;Lq4/b4;Lm2/r;III)V", "value", "Lkotlin/Function0;", "content", "e", "(Lq4/b4;Ler/p;Lm2/r;I)V", "Lm2/b4;", "a", "Lm2/b4;", "getLocalTextStyle", "()Lm2/b4;", "LocalTextStyle", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<TextStyle> f1730a = d0.g(x5.r(), new er.a() { // from class: a2.g5
        @Override // er.a
        public final Object a() {
            return j5.d();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1731a;

        a(long j15) {
            this.f1731a = j15;
        }

        @Override // n3.p1
        public final long a() {
            return this.f1731a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle d() {
        return m5.d();
    }

    public static final void e(final TextStyle textStyle, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-13499697);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(textStyle) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-13499697, i16, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:409)");
            }
            b4<TextStyle> b4Var = f1730a;
            d0.c(b4Var.d(((TextStyle) rVarH.N(b4Var)).L(textStyle)), pVar, rVarH, (i16 & 112) | c4.f122821i);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.i5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j5.f(textStyle, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(TextStyle textStyle, p pVar, int i15, r rVar, int i16) {
        e(textStyle, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0206  */
    /* JADX WARN: Code duplicated, block: B:173:0x020e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0214  */
    /* JADX WARN: Code duplicated, block: B:178:0x021d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:183:0x0230  */
    /* JADX WARN: Code duplicated, block: B:187:0x023c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0246  */
    /* JADX WARN: Code duplicated, block: B:192:0x024d  */
    /* JADX WARN: Code duplicated, block: B:199:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x027f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0282  */
    /* JADX WARN: Code duplicated, block: B:203:0x0286  */
    /* JADX WARN: Code duplicated, block: B:205:0x028e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0297  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:212:0x029d  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:218:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02be  */
    /* JADX WARN: Code duplicated, block: B:226:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:235:0x02da  */
    /* JADX WARN: Code duplicated, block: B:238:0x02df  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:241:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:243:0x0303  */
    /* JADX WARN: Code duplicated, block: B:246:0x030f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0339  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:250:0x033b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0345  */
    /* JADX WARN: Code duplicated, block: B:253:0x034a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0365  */
    /* JADX WARN: Code duplicated, block: B:257:0x036c  */
    /* JADX WARN: Code duplicated, block: B:260:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:265:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:267:0x0418  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:270:0x043d  */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static final void g(final String str, m mVar, long j15, long j16, y yVar, FontWeight fontWeight, l lVar, long j17, k kVar, j jVar, long j18, int i15, boolean z15, int i16, int i17, er.l<? super TextLayoutResult, i0> lVar2, TextStyle textStyle, r rVar, final int i18, final int i19, final int i25) {
        int i26;
        int i27;
        int i28;
        long jH;
        int i29;
        int i35;
        int i36;
        long jA;
        int i37;
        int i38;
        int i39;
        y yVar2;
        int i45;
        int i46;
        int i47;
        FontWeight fontWeight2;
        int i48;
        int i49;
        l lVar3;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i85;
        boolean z16;
        int i86;
        int i87;
        int i88;
        int i89;
        int i95;
        int i96;
        boolean z17;
        r rVar2;
        final m mVar2;
        final j jVar2;
        final int iA;
        final int i97;
        final int i98;
        final er.l<? super TextLayoutResult, i0> lVar4;
        final TextStyle textStyle2;
        final boolean z18;
        final long j19;
        final y yVar3;
        final long j25;
        final FontWeight fontWeight3;
        final l lVar5;
        final long j26;
        final k kVar2;
        final long j27;
        d5 d5VarM;
        m mVar3;
        long jA2;
        k kVar3;
        long jA3;
        int i99;
        int i100;
        er.l<? super TextLayoutResult, i0> lVar6;
        TextStyle textStyle3;
        k kVar4;
        y yVar4;
        long j28;
        FontWeight fontWeight4;
        l lVar7;
        long j29;
        long j35;
        long jM20unboximpl;
        float fFloatValue;
        long jM9copywmQWz5c$default;
        int iG;
        boolean zD;
        Object objE;
        int i101;
        r rVarH = rVar.h(1028090691);
        if ((i18 & 6) == 0) {
            i26 = (rVarH.W(str) ? 4 : 2) | i18;
        } else {
            i26 = i18;
        }
        int i102 = i25 & 2;
        if (i102 == 0) {
            if ((i18 & 48) == 0) {
                i26 |= rVarH.W(mVar) ? 32 : 16;
            }
            i27 = i25 & 4;
            if (i27 != 0) {
                i29 = i26 | MLKEMEngine.KyberPolyBytes;
                jH = j15;
            } else {
                i28 = i26;
                jH = j15;
                if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.d(jH)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i28 |= i35;
                }
                i29 = i28;
            }
            i36 = i25 & 8;
            if (i36 != 0) {
                i29 |= 3072;
                jA = j16;
            } else {
                jA = j16;
                if ((i18 & 3072) == 0) {
                    if (rVarH.d(jA)) {
                        i37 = 2048;
                    } else {
                        i37 = 1024;
                    }
                    i29 |= i37;
                }
            }
            i38 = i25 & 16;
            i39 = PKIFailureInfo.certRevoked;
            if (i38 != 0) {
                if ((i18 & 24576) == 0) {
                    yVar2 = yVar;
                    if (rVarH.W(yVar2)) {
                        i45 = 16384;
                    } else {
                        i45 = 8192;
                    }
                    i29 |= i45;
                }
                i46 = i25 & 32;
                i47 = PKIFailureInfo.unsupportedVersion;
                if (i46 != 0) {
                    i29 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i18 & 196608) == 0) {
                        if (rVarH.W(fontWeight2)) {
                            i48 = 131072;
                        } else {
                            i48 = 65536;
                        }
                        i29 |= i48;
                    }
                }
                i49 = i25 & 64;
                if (i49 != 0) {
                    i29 |= 1572864;
                    lVar3 = lVar;
                } else {
                    lVar3 = lVar;
                    if ((i18 & 1572864) == 0) {
                        if (rVarH.W(lVar3)) {
                            i55 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i55 = PKIFailureInfo.signerNotTrusted;
                        }
                        i29 |= i55;
                    }
                }
                i56 = i25 & 128;
                if (i56 != 0) {
                    if ((i18 & 12582912) == 0) {
                        int i103 = i29;
                        if (rVarH.d(j17)) {
                            i57 = 8388608;
                        } else {
                            i57 = 4194304;
                        }
                        i58 = i103 | i57;
                    }
                    i59 = i25 & 256;
                    if (i59 != 0) {
                        if ((i18 & 100663296) == 0) {
                            if (rVarH.W(kVar)) {
                                i65 = 67108864;
                            } else {
                                i65 = 33554432;
                            }
                            i58 |= i65;
                        }
                        i66 = i25 & 512;
                        if (i66 != 0) {
                            i58 |= 805306368;
                        } else if ((i18 & 805306368) != 0) {
                            if (rVarH.W(jVar)) {
                                i67 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i67 = 268435456;
                            }
                            i58 |= i67;
                        }
                        i68 = i58;
                        i69 = i25 & 1024;
                        if (i69 != 0) {
                            i75 = i19 | 6;
                        } else if ((i19 & 6) == 0) {
                            if (rVarH.d(j18)) {
                                i76 = 4;
                            } else {
                                i76 = 2;
                            }
                            i75 = i19 | i76;
                        } else {
                            i75 = i19;
                        }
                        i77 = i25 & 2048;
                        if (i77 != 0) {
                            i75 |= 48;
                        } else if ((i19 & 48) != 0) {
                            if (rVarH.c(i15)) {
                                i78 = 32;
                            } else {
                                i78 = 16;
                            }
                            i75 |= i78;
                        }
                        i79 = i75;
                        i85 = i25 & PKIFailureInfo.certConfirmed;
                        if (i85 != 0) {
                            if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                                z16 = z15;
                                if (rVarH.a(z16)) {
                                    i86 = 256;
                                } else {
                                    i86 = 128;
                                }
                                i79 |= i86;
                            }
                            i87 = i25 & PKIFailureInfo.certRevoked;
                            if (i87 != 0) {
                                i89 = i79 | 3072;
                            } else {
                                i88 = i79;
                                if ((i19 & 3072) == 0) {
                                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                                } else {
                                    i89 = i88;
                                }
                            }
                            i95 = i25 & 16384;
                            if (i95 != 0) {
                                if ((i19 & 24576) == 0) {
                                    if (rVarH.c(i17)) {
                                        i39 = 16384;
                                    }
                                    i89 |= i39;
                                }
                                i96 = i25 & 32768;
                                if (i96 != 0) {
                                    i89 |= 196608;
                                } else if ((i19 & 196608) == 0) {
                                    if (!rVarH.G(lVar2)) {
                                        i47 = 65536;
                                    }
                                    i89 |= i47;
                                }
                                if ((i19 & 1572864) != 0) {
                                    if ((i25 & PKIFailureInfo.notAuthorized) == 0 || !rVarH.W(textStyle)) {
                                        i101 = PKIFailureInfo.signerNotTrusted;
                                    } else {
                                        i101 = PKIFailureInfo.badCertTemplate;
                                    }
                                    i89 |= i101;
                                }
                                if ((i68 & 306783379) == 306783378 || (599187 & i89) != 599186) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (rVarH.r(z17, i68 & 1)) {
                                    rVarH.I();
                                    if ((i18 & 1) != 0 || rVarH.Q()) {
                                        if (i102 != 0) {
                                            mVar3 = m.INSTANCE;
                                        } else {
                                            mVar3 = mVar;
                                        }
                                        if (i27 != 0) {
                                            jH = Color.INSTANCE.h();
                                        }
                                        if (i36 != 0) {
                                            jA = v.INSTANCE.a();
                                        }
                                        if (i38 != 0) {
                                            yVar2 = null;
                                        }
                                        if (i46 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i49 != 0) {
                                            lVar3 = null;
                                        }
                                        if (i56 != 0) {
                                            jA2 = v.INSTANCE.a();
                                        } else {
                                            jA2 = j17;
                                        }
                                        if (i59 != 0) {
                                            kVar3 = null;
                                        } else {
                                            kVar3 = kVar;
                                        }
                                        if (i66 != 0) {
                                            jVar2 = null;
                                        } else {
                                            jVar2 = jVar;
                                        }
                                        if (i69 != 0) {
                                            jA3 = v.INSTANCE.a();
                                        } else {
                                            jA3 = j18;
                                        }
                                        if (i77 != 0) {
                                            iA = b5.v.INSTANCE.a();
                                        } else {
                                            iA = i15;
                                        }
                                        if (i85 != 0) {
                                            z16 = true;
                                        }
                                        if (i87 != 0) {
                                            i99 = Integer.MAX_VALUE;
                                        } else {
                                            i99 = i16;
                                        }
                                        i100 = i95 == 0 ? i17 : 1;
                                        lVar6 = i96 == 0 ? lVar2 : null;
                                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                            i89 &= -3670017;
                                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        kVar4 = kVar3;
                                        yVar4 = yVar2;
                                        j28 = jA;
                                        fontWeight4 = fontWeight2;
                                        lVar7 = lVar3;
                                        j29 = jA2;
                                        j35 = jA3;
                                    } else {
                                        rVarH.O();
                                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                            i89 &= -3670017;
                                        }
                                        mVar3 = mVar;
                                        j29 = j17;
                                        kVar4 = kVar;
                                        jVar2 = jVar;
                                        j35 = j18;
                                        iA = i15;
                                        i99 = i16;
                                        i100 = i17;
                                        lVar6 = lVar2;
                                        textStyle3 = textStyle;
                                        yVar4 = yVar2;
                                        j28 = jA;
                                        fontWeight4 = fontWeight2;
                                        lVar7 = lVar3;
                                    }
                                    rVarH.y();
                                    if (t.k()) {
                                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                    }
                                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                    if (jH != 16) {
                                        jM9copywmQWz5c$default = jH;
                                    } else if (textStyle3.j() != 16) {
                                        jM9copywmQWz5c$default = textStyle3.j();
                                    } else {
                                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    if (jVar2 != null) {
                                        iG = jVar2.getValue();
                                    } else {
                                        iG = j.INSTANCE.g();
                                    }
                                    TextStyle textStyleM = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                    zD = rVarH.d(jM9copywmQWz5c$default);
                                    objE = rVarH.E();
                                    if (zD || objE == r.INSTANCE.a()) {
                                        objE = new a(jM9copywmQWz5c$default);
                                        rVarH.v(objE);
                                    }
                                    int i104 = (i68 & 126) | ((i89 >> 6) & 7168);
                                    int i105 = i89 << 9;
                                    k0.q(str, mVar3, textStyleM, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i104 | (57344 & i105) | (458752 & i105) | (3670016 & i105) | (i105 & 29360128), 512);
                                    rVar2 = rVarH;
                                    if (t.k()) {
                                        t.n();
                                    }
                                    j19 = jH;
                                    i97 = i99;
                                    i98 = i100;
                                    textStyle2 = textStyle3;
                                    fontWeight3 = fontWeight4;
                                    yVar3 = yVar4;
                                    lVar5 = lVar7;
                                    j26 = j29;
                                    kVar2 = kVar4;
                                    j27 = j35;
                                    lVar4 = lVar6;
                                    z18 = z16;
                                    j25 = j28;
                                    mVar2 = mVar3;
                                } else {
                                    rVar2 = rVarH;
                                    rVar2.O();
                                    mVar2 = mVar;
                                    jVar2 = jVar;
                                    iA = i15;
                                    i97 = i16;
                                    i98 = i17;
                                    lVar4 = lVar2;
                                    textStyle2 = textStyle;
                                    z18 = z16;
                                    j19 = jH;
                                    yVar3 = yVar2;
                                    j25 = jA;
                                    fontWeight3 = fontWeight2;
                                    lVar5 = lVar3;
                                    j26 = j17;
                                    kVar2 = kVar;
                                    j27 = j18;
                                }
                                d5VarM = rVar2.m();
                                if (d5VarM != null) {
                                    d5VarM.a(new p() { // from class: a2.h5
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i89 |= 24576;
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM2 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i106 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i107 = i89 << 9;
                                k0.q(str, mVar3, textStyleM2, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i106 | (57344 & i107) | (458752 & i107) | (3670016 & i107) | (i107 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i79 |= MLKEMEngine.KyberPolyBytes;
                        z16 = z15;
                        i87 = i25 & PKIFailureInfo.certRevoked;
                        if (i87 != 0) {
                            i89 = i79 | 3072;
                        } else {
                            i88 = i79;
                            if ((i19 & 3072) == 0) {
                                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                            } else {
                                i89 = i88;
                            }
                        }
                        i95 = i25 & 16384;
                        if (i95 != 0) {
                            if ((i19 & 24576) == 0) {
                                if (rVarH.c(i17)) {
                                    i39 = 16384;
                                }
                                i89 |= i39;
                            }
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM3 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i108 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i109 = i89 << 9;
                                k0.q(str, mVar3, textStyleM3, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i108 | (57344 & i109) | (458752 & i109) | (3670016 & i109) | (i109 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i89 |= 24576;
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM4 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1010 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011 = i89 << 9;
                            k0.q(str, mVar3, textStyleM4, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1010 | (57344 & i1011) | (458752 & i1011) | (3670016 & i1011) | (i1011 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i58 |= 100663296;
                    i66 = i25 & 512;
                    if (i66 != 0) {
                        i58 |= 805306368;
                    } else if ((i18 & 805306368) != 0) {
                        if (rVarH.W(jVar)) {
                            i67 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i67 = 268435456;
                        }
                        i58 |= i67;
                    }
                    i68 = i58;
                    i69 = i25 & 1024;
                    if (i69 != 0) {
                        i75 = i19 | 6;
                    } else if ((i19 & 6) == 0) {
                        if (rVarH.d(j18)) {
                            i76 = 4;
                        } else {
                            i76 = 2;
                        }
                        i75 = i19 | i76;
                    } else {
                        i75 = i19;
                    }
                    i77 = i25 & 2048;
                    if (i77 != 0) {
                        i75 |= 48;
                    } else if ((i19 & 48) != 0) {
                        if (rVarH.c(i15)) {
                            i78 = 32;
                        } else {
                            i78 = 16;
                        }
                        i75 |= i78;
                    }
                    i79 = i75;
                    i85 = i25 & PKIFailureInfo.certConfirmed;
                    if (i85 != 0) {
                        if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i86 = 256;
                            } else {
                                i86 = 128;
                            }
                            i79 |= i86;
                        }
                        i87 = i25 & PKIFailureInfo.certRevoked;
                        if (i87 != 0) {
                            i89 = i79 | 3072;
                        } else {
                            i88 = i79;
                            if ((i19 & 3072) == 0) {
                                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                            } else {
                                i89 = i88;
                            }
                        }
                        i95 = i25 & 16384;
                        if (i95 != 0) {
                            if ((i19 & 24576) == 0) {
                                if (rVarH.c(i17)) {
                                    i39 = 16384;
                                }
                                i89 |= i39;
                            }
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM5 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i1012 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i1013 = i89 << 9;
                                k0.q(str, mVar3, textStyleM5, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1012 | (57344 & i1013) | (458752 & i1013) | (3670016 & i1013) | (i1013 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i89 |= 24576;
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM6 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1014 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1015 = i89 << 9;
                            k0.q(str, mVar3, textStyleM6, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1014 | (57344 & i1015) | (458752 & i1015) | (3670016 & i1015) | (i1015 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 |= MLKEMEngine.KyberPolyBytes;
                    z16 = z15;
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM7 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1016 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1017 = i89 << 9;
                            k0.q(str, mVar3, textStyleM7, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1016 | (57344 & i1017) | (458752 & i1017) | (3670016 & i1017) | (i1017 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM8 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1018 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1019 = i89 << 9;
                        k0.q(str, mVar3, textStyleM8, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1018 | (57344 & i1019) | (458752 & i1019) | (3670016 & i1019) | (i1019 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 12582912;
                i58 = i29;
                i59 = i25 & 256;
                if (i59 != 0) {
                    if ((i18 & 100663296) == 0) {
                        if (rVarH.W(kVar)) {
                            i65 = 67108864;
                        } else {
                            i65 = 33554432;
                        }
                        i58 |= i65;
                    }
                    i66 = i25 & 512;
                    if (i66 != 0) {
                        i58 |= 805306368;
                    } else if ((i18 & 805306368) != 0) {
                        if (rVarH.W(jVar)) {
                            i67 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i67 = 268435456;
                        }
                        i58 |= i67;
                    }
                    i68 = i58;
                    i69 = i25 & 1024;
                    if (i69 != 0) {
                        i75 = i19 | 6;
                    } else if ((i19 & 6) == 0) {
                        if (rVarH.d(j18)) {
                            i76 = 4;
                        } else {
                            i76 = 2;
                        }
                        i75 = i19 | i76;
                    } else {
                        i75 = i19;
                    }
                    i77 = i25 & 2048;
                    if (i77 != 0) {
                        i75 |= 48;
                    } else if ((i19 & 48) != 0) {
                        if (rVarH.c(i15)) {
                            i78 = 32;
                        } else {
                            i78 = 16;
                        }
                        i75 |= i78;
                    }
                    i79 = i75;
                    i85 = i25 & PKIFailureInfo.certConfirmed;
                    if (i85 != 0) {
                        if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i86 = 256;
                            } else {
                                i86 = 128;
                            }
                            i79 |= i86;
                        }
                        i87 = i25 & PKIFailureInfo.certRevoked;
                        if (i87 != 0) {
                            i89 = i79 | 3072;
                        } else {
                            i88 = i79;
                            if ((i19 & 3072) == 0) {
                                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                            } else {
                                i89 = i88;
                            }
                        }
                        i95 = i25 & 16384;
                        if (i95 != 0) {
                            if ((i19 & 24576) == 0) {
                                if (rVarH.c(i17)) {
                                    i39 = 16384;
                                }
                                i89 |= i39;
                            }
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM9 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i10110 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i10111 = i89 << 9;
                                k0.q(str, mVar3, textStyleM9, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10110 | (57344 & i10111) | (458752 & i10111) | (3670016 & i10111) | (i10111 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i89 |= 24576;
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM10 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i10112 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i10113 = i89 << 9;
                            k0.q(str, mVar3, textStyleM10, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10112 | (57344 & i10113) | (458752 & i10113) | (3670016 & i10113) | (i10113 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 |= MLKEMEngine.KyberPolyBytes;
                    z16 = z15;
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM11 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i10114 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i10115 = i89 << 9;
                            k0.q(str, mVar3, textStyleM11, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10114 | (57344 & i10115) | (458752 & i10115) | (3670016 & i10115) | (i10115 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM12 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10116 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10117 = i89 << 9;
                        k0.q(str, mVar3, textStyleM12, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10116 | (57344 & i10117) | (458752 & i10117) | (3670016 & i10117) | (i10117 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i58 |= 100663296;
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM13 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i10118 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i10119 = i89 << 9;
                            k0.q(str, mVar3, textStyleM13, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10118 | (57344 & i10119) | (458752 & i10119) | (3670016 & i10119) | (i10119 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM14 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i101110 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i101111 = i89 << 9;
                        k0.q(str, mVar3, textStyleM14, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101110 | (57344 & i101111) | (458752 & i101111) | (3670016 & i101111) | (i101111 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM15 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i101112 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i101113 = i89 << 9;
                        k0.q(str, mVar3, textStyleM15, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101112 | (57344 & i101113) | (458752 & i101113) | (3670016 & i101113) | (i101113 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM16 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101114 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101115 = i89 << 9;
                    k0.q(str, mVar3, textStyleM16, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101114 | (57344 & i101115) | (458752 & i101115) | (3670016 & i101115) | (i101115 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 24576;
            yVar2 = yVar;
            i46 = i25 & 32;
            i47 = PKIFailureInfo.unsupportedVersion;
            if (i46 != 0) {
                i29 |= 196608;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i18 & 196608) == 0) {
                    if (rVarH.W(fontWeight2)) {
                        i48 = 131072;
                    } else {
                        i48 = 65536;
                    }
                    i29 |= i48;
                }
            }
            i49 = i25 & 64;
            if (i49 != 0) {
                i29 |= 1572864;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i18 & 1572864) == 0) {
                    if (rVarH.W(lVar3)) {
                        i55 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i55 = PKIFailureInfo.signerNotTrusted;
                    }
                    i29 |= i55;
                }
            }
            i56 = i25 & 128;
            if (i56 != 0) {
                if ((i18 & 12582912) == 0) {
                    int i1020 = i29;
                    if (rVarH.d(j17)) {
                        i57 = 8388608;
                    } else {
                        i57 = 4194304;
                    }
                    i58 = i1020 | i57;
                }
                i59 = i25 & 256;
                if (i59 != 0) {
                    if ((i18 & 100663296) == 0) {
                        if (rVarH.W(kVar)) {
                            i65 = 67108864;
                        } else {
                            i65 = 33554432;
                        }
                        i58 |= i65;
                    }
                    i66 = i25 & 512;
                    if (i66 != 0) {
                        i58 |= 805306368;
                    } else if ((i18 & 805306368) != 0) {
                        if (rVarH.W(jVar)) {
                            i67 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i67 = 268435456;
                        }
                        i58 |= i67;
                    }
                    i68 = i58;
                    i69 = i25 & 1024;
                    if (i69 != 0) {
                        i75 = i19 | 6;
                    } else if ((i19 & 6) == 0) {
                        if (rVarH.d(j18)) {
                            i76 = 4;
                        } else {
                            i76 = 2;
                        }
                        i75 = i19 | i76;
                    } else {
                        i75 = i19;
                    }
                    i77 = i25 & 2048;
                    if (i77 != 0) {
                        i75 |= 48;
                    } else if ((i19 & 48) != 0) {
                        if (rVarH.c(i15)) {
                            i78 = 32;
                        } else {
                            i78 = 16;
                        }
                        i75 |= i78;
                    }
                    i79 = i75;
                    i85 = i25 & PKIFailureInfo.certConfirmed;
                    if (i85 != 0) {
                        if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i86 = 256;
                            } else {
                                i86 = 128;
                            }
                            i79 |= i86;
                        }
                        i87 = i25 & PKIFailureInfo.certRevoked;
                        if (i87 != 0) {
                            i89 = i79 | 3072;
                        } else {
                            i88 = i79;
                            if ((i19 & 3072) == 0) {
                                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                            } else {
                                i89 = i88;
                            }
                        }
                        i95 = i25 & 16384;
                        if (i95 != 0) {
                            if ((i19 & 24576) == 0) {
                                if (rVarH.c(i17)) {
                                    i39 = 16384;
                                }
                                i89 |= i39;
                            }
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM17 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i101116 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i101117 = i89 << 9;
                                k0.q(str, mVar3, textStyleM17, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101116 | (57344 & i101117) | (458752 & i101117) | (3670016 & i101117) | (i101117 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i89 |= 24576;
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM18 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i101118 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i101119 = i89 << 9;
                            k0.q(str, mVar3, textStyleM18, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101118 | (57344 & i101119) | (458752 & i101119) | (3670016 & i101119) | (i101119 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 |= MLKEMEngine.KyberPolyBytes;
                    z16 = z15;
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM19 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011110 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011111 = i89 << 9;
                            k0.q(str, mVar3, textStyleM19, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011110 | (57344 & i1011111) | (458752 & i1011111) | (3670016 & i1011111) | (i1011111 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM110 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011112 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011113 = i89 << 9;
                        k0.q(str, mVar3, textStyleM110, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011112 | (57344 & i1011113) | (458752 & i1011113) | (3670016 & i1011113) | (i1011113 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i58 |= 100663296;
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM111 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011114 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011115 = i89 << 9;
                            k0.q(str, mVar3, textStyleM111, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011114 | (57344 & i1011115) | (458752 & i1011115) | (3670016 & i1011115) | (i1011115 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM112 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011116 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011117 = i89 << 9;
                        k0.q(str, mVar3, textStyleM112, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011116 | (57344 & i1011117) | (458752 & i1011117) | (3670016 & i1011117) | (i1011117 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM113 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011118 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011119 = i89 << 9;
                        k0.q(str, mVar3, textStyleM113, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011118 | (57344 & i1011119) | (458752 & i1011119) | (3670016 & i1011119) | (i1011119 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM114 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111111 = i89 << 9;
                    k0.q(str, mVar3, textStyleM114, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111110 | (57344 & i10111111) | (458752 & i10111111) | (3670016 & i10111111) | (i10111111 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 12582912;
            i58 = i29;
            i59 = i25 & 256;
            if (i59 != 0) {
                if ((i18 & 100663296) == 0) {
                    if (rVarH.W(kVar)) {
                        i65 = 67108864;
                    } else {
                        i65 = 33554432;
                    }
                    i58 |= i65;
                }
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM115 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i10111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i10111113 = i89 << 9;
                            k0.q(str, mVar3, textStyleM115, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111112 | (57344 & i10111113) | (458752 & i10111113) | (3670016 & i10111113) | (i10111113 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM116 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111115 = i89 << 9;
                        k0.q(str, mVar3, textStyleM116, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111114 | (57344 & i10111115) | (458752 & i10111115) | (3670016 & i10111115) | (i10111115 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM117 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111117 = i89 << 9;
                        k0.q(str, mVar3, textStyleM117, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111116 | (57344 & i10111117) | (458752 & i10111117) | (3670016 & i10111117) | (i10111117 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM118 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111119 = i89 << 9;
                    k0.q(str, mVar3, textStyleM118, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111118 | (57344 & i10111119) | (458752 & i10111119) | (3670016 & i10111119) | (i10111119 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i58 |= 100663296;
            i66 = i25 & 512;
            if (i66 != 0) {
                i58 |= 805306368;
            } else if ((i18 & 805306368) != 0) {
                if (rVarH.W(jVar)) {
                    i67 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i67 = 268435456;
                }
                i58 |= i67;
            }
            i68 = i58;
            i69 = i25 & 1024;
            if (i69 != 0) {
                i75 = i19 | 6;
            } else if ((i19 & 6) == 0) {
                if (rVarH.d(j18)) {
                    i76 = 4;
                } else {
                    i76 = 2;
                }
                i75 = i19 | i76;
            } else {
                i75 = i19;
            }
            i77 = i25 & 2048;
            if (i77 != 0) {
                i75 |= 48;
            } else if ((i19 & 48) != 0) {
                if (rVarH.c(i15)) {
                    i78 = 32;
                } else {
                    i78 = 16;
                }
                i75 |= i78;
            }
            i79 = i75;
            i85 = i25 & PKIFailureInfo.certConfirmed;
            if (i85 != 0) {
                if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i86 = 256;
                    } else {
                        i86 = 128;
                    }
                    i79 |= i86;
                }
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM119 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i101111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i101111111 = i89 << 9;
                        k0.q(str, mVar3, textStyleM119, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111110 | (57344 & i101111111) | (458752 & i101111111) | (3670016 & i101111111) | (i101111111 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM1110 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111113 = i89 << 9;
                    k0.q(str, mVar3, textStyleM1110, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111112 | (57344 & i101111113) | (458752 & i101111113) | (3670016 & i101111113) | (i101111113 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i87 = i25 & PKIFailureInfo.certRevoked;
            if (i87 != 0) {
                i89 = i79 | 3072;
            } else {
                i88 = i79;
                if ((i19 & 3072) == 0) {
                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                } else {
                    i89 = i88;
                }
            }
            i95 = i25 & 16384;
            if (i95 != 0) {
                if ((i19 & 24576) == 0) {
                    if (rVarH.c(i17)) {
                        i39 = 16384;
                    }
                    i89 |= i39;
                }
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM1111 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111115 = i89 << 9;
                    k0.q(str, mVar3, textStyleM1111, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111114 | (57344 & i101111115) | (458752 & i101111115) | (3670016 & i101111115) | (i101111115 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i89 |= 24576;
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM1112 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i101111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i101111117 = i89 << 9;
                k0.q(str, mVar3, textStyleM1112, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111116 | (57344 & i101111117) | (458752 & i101111117) | (3670016 & i101111117) | (i101111117 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i26 |= 48;
        i27 = i25 & 4;
        if (i27 != 0) {
            i29 = i26 | MLKEMEngine.KyberPolyBytes;
            jH = j15;
        } else {
            i28 = i26;
            jH = j15;
            if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.d(jH)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i28 |= i35;
            }
            i29 = i28;
        }
        i36 = i25 & 8;
        if (i36 != 0) {
            i29 |= 3072;
            jA = j16;
        } else {
            jA = j16;
            if ((i18 & 3072) == 0) {
                if (rVarH.d(jA)) {
                    i37 = 2048;
                } else {
                    i37 = 1024;
                }
                i29 |= i37;
            }
        }
        i38 = i25 & 16;
        i39 = PKIFailureInfo.certRevoked;
        if (i38 != 0) {
            if ((i18 & 24576) == 0) {
                yVar2 = yVar;
                if (rVarH.W(yVar2)) {
                    i45 = 16384;
                } else {
                    i45 = 8192;
                }
                i29 |= i45;
            }
            i46 = i25 & 32;
            i47 = PKIFailureInfo.unsupportedVersion;
            if (i46 != 0) {
                i29 |= 196608;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i18 & 196608) == 0) {
                    if (rVarH.W(fontWeight2)) {
                        i48 = 131072;
                    } else {
                        i48 = 65536;
                    }
                    i29 |= i48;
                }
            }
            i49 = i25 & 64;
            if (i49 != 0) {
                i29 |= 1572864;
                lVar3 = lVar;
            } else {
                lVar3 = lVar;
                if ((i18 & 1572864) == 0) {
                    if (rVarH.W(lVar3)) {
                        i55 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i55 = PKIFailureInfo.signerNotTrusted;
                    }
                    i29 |= i55;
                }
            }
            i56 = i25 & 128;
            if (i56 != 0) {
                if ((i18 & 12582912) == 0) {
                    int i1021 = i29;
                    if (rVarH.d(j17)) {
                        i57 = 8388608;
                    } else {
                        i57 = 4194304;
                    }
                    i58 = i1021 | i57;
                }
                i59 = i25 & 256;
                if (i59 != 0) {
                    if ((i18 & 100663296) == 0) {
                        if (rVarH.W(kVar)) {
                            i65 = 67108864;
                        } else {
                            i65 = 33554432;
                        }
                        i58 |= i65;
                    }
                    i66 = i25 & 512;
                    if (i66 != 0) {
                        i58 |= 805306368;
                    } else if ((i18 & 805306368) != 0) {
                        if (rVarH.W(jVar)) {
                            i67 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i67 = 268435456;
                        }
                        i58 |= i67;
                    }
                    i68 = i58;
                    i69 = i25 & 1024;
                    if (i69 != 0) {
                        i75 = i19 | 6;
                    } else if ((i19 & 6) == 0) {
                        if (rVarH.d(j18)) {
                            i76 = 4;
                        } else {
                            i76 = 2;
                        }
                        i75 = i19 | i76;
                    } else {
                        i75 = i19;
                    }
                    i77 = i25 & 2048;
                    if (i77 != 0) {
                        i75 |= 48;
                    } else if ((i19 & 48) != 0) {
                        if (rVarH.c(i15)) {
                            i78 = 32;
                        } else {
                            i78 = 16;
                        }
                        i75 |= i78;
                    }
                    i79 = i75;
                    i85 = i25 & PKIFailureInfo.certConfirmed;
                    if (i85 != 0) {
                        if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i86 = 256;
                            } else {
                                i86 = 128;
                            }
                            i79 |= i86;
                        }
                        i87 = i25 & PKIFailureInfo.certRevoked;
                        if (i87 != 0) {
                            i89 = i79 | 3072;
                        } else {
                            i88 = i79;
                            if ((i19 & 3072) == 0) {
                                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                            } else {
                                i89 = i88;
                            }
                        }
                        i95 = i25 & 16384;
                        if (i95 != 0) {
                            if ((i19 & 24576) == 0) {
                                if (rVarH.c(i17)) {
                                    i39 = 16384;
                                }
                                i89 |= i39;
                            }
                            i96 = i25 & 32768;
                            if (i96 != 0) {
                                i89 |= 196608;
                            } else if ((i19 & 196608) == 0) {
                                if (!rVarH.G(lVar2)) {
                                    i47 = 65536;
                                }
                                i89 |= i47;
                            }
                            if ((i19 & 1572864) != 0) {
                                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                } else {
                                    i101 = PKIFailureInfo.signerNotTrusted;
                                }
                                i89 |= i101;
                            }
                            if ((i68 & 306783379) == 306783378) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (rVarH.r(z17, i68 & 1)) {
                                rVarH.I();
                                if ((i18 & 1) != 0) {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                } else {
                                    if (i102 != 0) {
                                        mVar3 = m.INSTANCE;
                                    } else {
                                        mVar3 = mVar;
                                    }
                                    if (i27 != 0) {
                                        jH = Color.INSTANCE.h();
                                    }
                                    if (i36 != 0) {
                                        jA = v.INSTANCE.a();
                                    }
                                    if (i38 != 0) {
                                        yVar2 = null;
                                    }
                                    if (i46 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i49 != 0) {
                                        lVar3 = null;
                                    }
                                    if (i56 != 0) {
                                        jA2 = v.INSTANCE.a();
                                    } else {
                                        jA2 = j17;
                                    }
                                    if (i59 != 0) {
                                        kVar3 = null;
                                    } else {
                                        kVar3 = kVar;
                                    }
                                    if (i66 != 0) {
                                        jVar2 = null;
                                    } else {
                                        jVar2 = jVar;
                                    }
                                    if (i69 != 0) {
                                        jA3 = v.INSTANCE.a();
                                    } else {
                                        jA3 = j18;
                                    }
                                    if (i77 != 0) {
                                        iA = b5.v.INSTANCE.a();
                                    } else {
                                        iA = i15;
                                    }
                                    if (i85 != 0) {
                                        z16 = true;
                                    }
                                    if (i87 != 0) {
                                        i99 = Integer.MAX_VALUE;
                                    } else {
                                        i99 = i16;
                                    }
                                    if (i95 == 0) {
                                    }
                                    if (i96 == 0) {
                                    }
                                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                        i89 &= -3670017;
                                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    kVar4 = kVar3;
                                    yVar4 = yVar2;
                                    j28 = jA;
                                    fontWeight4 = fontWeight2;
                                    lVar7 = lVar3;
                                    j29 = jA2;
                                    j35 = jA3;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                                }
                                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                                if (jH != 16) {
                                    jM9copywmQWz5c$default = jH;
                                } else if (textStyle3.j() != 16) {
                                    jM9copywmQWz5c$default = textStyle3.j();
                                } else {
                                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                if (jVar2 != null) {
                                    iG = jVar2.getValue();
                                } else {
                                    iG = j.INSTANCE.g();
                                }
                                TextStyle textStyleM1113 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                                zD = rVarH.d(jM9copywmQWz5c$default);
                                objE = rVarH.E();
                                if (zD) {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                } else {
                                    objE = new a(jM9copywmQWz5c$default);
                                    rVarH.v(objE);
                                }
                                int i101111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                                int i101111119 = i89 << 9;
                                k0.q(str, mVar3, textStyleM1113, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111118 | (57344 & i101111119) | (458752 & i101111119) | (3670016 & i101111119) | (i101111119 & 29360128), 512);
                                rVar2 = rVarH;
                                if (t.k()) {
                                    t.n();
                                }
                                j19 = jH;
                                i97 = i99;
                                i98 = i100;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                yVar3 = yVar4;
                                lVar5 = lVar7;
                                j26 = j29;
                                kVar2 = kVar4;
                                j27 = j35;
                                lVar4 = lVar6;
                                z18 = z16;
                                j25 = j28;
                                mVar2 = mVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                mVar2 = mVar;
                                jVar2 = jVar;
                                iA = i15;
                                i97 = i16;
                                i98 = i17;
                                lVar4 = lVar2;
                                textStyle2 = textStyle;
                                z18 = z16;
                                j19 = jH;
                                yVar3 = yVar2;
                                j25 = jA;
                                fontWeight3 = fontWeight2;
                                lVar5 = lVar3;
                                j26 = j17;
                                kVar2 = kVar;
                                j27 = j18;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.h5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i89 |= 24576;
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM1114 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011111111 = i89 << 9;
                            k0.q(str, mVar3, textStyleM1114, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111110 | (57344 & i1011111111) | (458752 & i1011111111) | (3670016 & i1011111111) | (i1011111111 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i79 |= MLKEMEngine.KyberPolyBytes;
                    z16 = z15;
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM1115 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011111113 = i89 << 9;
                            k0.q(str, mVar3, textStyleM1115, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111112 | (57344 & i1011111113) | (458752 & i1011111113) | (3670016 & i1011111113) | (i1011111113 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM1116 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011111115 = i89 << 9;
                        k0.q(str, mVar3, textStyleM1116, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111114 | (57344 & i1011111115) | (458752 & i1011111115) | (3670016 & i1011111115) | (i1011111115 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i58 |= 100663296;
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM1117 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011111117 = i89 << 9;
                            k0.q(str, mVar3, textStyleM1117, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111116 | (57344 & i1011111117) | (458752 & i1011111117) | (3670016 & i1011111117) | (i1011111117 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM1118 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011111119 = i89 << 9;
                        k0.q(str, mVar3, textStyleM1118, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111118 | (57344 & i1011111119) | (458752 & i1011111119) | (3670016 & i1011111119) | (i1011111119 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM1119 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111111111 = i89 << 9;
                        k0.q(str, mVar3, textStyleM1119, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111110 | (57344 & i10111111111) | (458752 & i10111111111) | (3670016 & i10111111111) | (i10111111111 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM11110 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111111113 = i89 << 9;
                    k0.q(str, mVar3, textStyleM11110, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111112 | (57344 & i10111111113) | (458752 & i10111111113) | (3670016 & i10111111113) | (i10111111113 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 12582912;
            i58 = i29;
            i59 = i25 & 256;
            if (i59 != 0) {
                if ((i18 & 100663296) == 0) {
                    if (rVarH.W(kVar)) {
                        i65 = 67108864;
                    } else {
                        i65 = 33554432;
                    }
                    i58 |= i65;
                }
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM11111 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i10111111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i10111111115 = i89 << 9;
                            k0.q(str, mVar3, textStyleM11111, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111114 | (57344 & i10111111115) | (458752 & i10111111115) | (3670016 & i10111111115) | (i10111111115 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM11112 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111111117 = i89 << 9;
                        k0.q(str, mVar3, textStyleM11112, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111116 | (57344 & i10111111117) | (458752 & i10111111117) | (3670016 & i10111111117) | (i10111111117 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM11113 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111111119 = i89 << 9;
                        k0.q(str, mVar3, textStyleM11113, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111118 | (57344 & i10111111119) | (458752 & i10111111119) | (3670016 & i10111111119) | (i10111111119 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM11114 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111111111 = i89 << 9;
                    k0.q(str, mVar3, textStyleM11114, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111110 | (57344 & i101111111111) | (458752 & i101111111111) | (3670016 & i101111111111) | (i101111111111 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i58 |= 100663296;
            i66 = i25 & 512;
            if (i66 != 0) {
                i58 |= 805306368;
            } else if ((i18 & 805306368) != 0) {
                if (rVarH.W(jVar)) {
                    i67 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i67 = 268435456;
                }
                i58 |= i67;
            }
            i68 = i58;
            i69 = i25 & 1024;
            if (i69 != 0) {
                i75 = i19 | 6;
            } else if ((i19 & 6) == 0) {
                if (rVarH.d(j18)) {
                    i76 = 4;
                } else {
                    i76 = 2;
                }
                i75 = i19 | i76;
            } else {
                i75 = i19;
            }
            i77 = i25 & 2048;
            if (i77 != 0) {
                i75 |= 48;
            } else if ((i19 & 48) != 0) {
                if (rVarH.c(i15)) {
                    i78 = 32;
                } else {
                    i78 = 16;
                }
                i75 |= i78;
            }
            i79 = i75;
            i85 = i25 & PKIFailureInfo.certConfirmed;
            if (i85 != 0) {
                if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i86 = 256;
                    } else {
                        i86 = 128;
                    }
                    i79 |= i86;
                }
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM11115 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i101111111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i101111111113 = i89 << 9;
                        k0.q(str, mVar3, textStyleM11115, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111112 | (57344 & i101111111113) | (458752 & i101111111113) | (3670016 & i101111111113) | (i101111111113 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM11116 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111111115 = i89 << 9;
                    k0.q(str, mVar3, textStyleM11116, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111114 | (57344 & i101111111115) | (458752 & i101111111115) | (3670016 & i101111111115) | (i101111111115 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i87 = i25 & PKIFailureInfo.certRevoked;
            if (i87 != 0) {
                i89 = i79 | 3072;
            } else {
                i88 = i79;
                if ((i19 & 3072) == 0) {
                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                } else {
                    i89 = i88;
                }
            }
            i95 = i25 & 16384;
            if (i95 != 0) {
                if ((i19 & 24576) == 0) {
                    if (rVarH.c(i17)) {
                        i39 = 16384;
                    }
                    i89 |= i39;
                }
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM11117 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111111117 = i89 << 9;
                    k0.q(str, mVar3, textStyleM11117, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111116 | (57344 & i101111111117) | (458752 & i101111111117) | (3670016 & i101111111117) | (i101111111117 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i89 |= 24576;
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM11118 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i101111111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i101111111119 = i89 << 9;
                k0.q(str, mVar3, textStyleM11118, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111118 | (57344 & i101111111119) | (458752 & i101111111119) | (3670016 & i101111111119) | (i101111111119 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i29 |= 24576;
        yVar2 = yVar;
        i46 = i25 & 32;
        i47 = PKIFailureInfo.unsupportedVersion;
        if (i46 != 0) {
            i29 |= 196608;
            fontWeight2 = fontWeight;
        } else {
            fontWeight2 = fontWeight;
            if ((i18 & 196608) == 0) {
                if (rVarH.W(fontWeight2)) {
                    i48 = 131072;
                } else {
                    i48 = 65536;
                }
                i29 |= i48;
            }
        }
        i49 = i25 & 64;
        if (i49 != 0) {
            i29 |= 1572864;
            lVar3 = lVar;
        } else {
            lVar3 = lVar;
            if ((i18 & 1572864) == 0) {
                if (rVarH.W(lVar3)) {
                    i55 = PKIFailureInfo.badCertTemplate;
                } else {
                    i55 = PKIFailureInfo.signerNotTrusted;
                }
                i29 |= i55;
            }
        }
        i56 = i25 & 128;
        if (i56 != 0) {
            if ((i18 & 12582912) == 0) {
                int i1022 = i29;
                if (rVarH.d(j17)) {
                    i57 = 8388608;
                } else {
                    i57 = 4194304;
                }
                i58 = i1022 | i57;
            }
            i59 = i25 & 256;
            if (i59 != 0) {
                if ((i18 & 100663296) == 0) {
                    if (rVarH.W(kVar)) {
                        i65 = 67108864;
                    } else {
                        i65 = 33554432;
                    }
                    i58 |= i65;
                }
                i66 = i25 & 512;
                if (i66 != 0) {
                    i58 |= 805306368;
                } else if ((i18 & 805306368) != 0) {
                    if (rVarH.W(jVar)) {
                        i67 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i67 = 268435456;
                    }
                    i58 |= i67;
                }
                i68 = i58;
                i69 = i25 & 1024;
                if (i69 != 0) {
                    i75 = i19 | 6;
                } else if ((i19 & 6) == 0) {
                    if (rVarH.d(j18)) {
                        i76 = 4;
                    } else {
                        i76 = 2;
                    }
                    i75 = i19 | i76;
                } else {
                    i75 = i19;
                }
                i77 = i25 & 2048;
                if (i77 != 0) {
                    i75 |= 48;
                } else if ((i19 & 48) != 0) {
                    if (rVarH.c(i15)) {
                        i78 = 32;
                    } else {
                        i78 = 16;
                    }
                    i75 |= i78;
                }
                i79 = i75;
                i85 = i25 & PKIFailureInfo.certConfirmed;
                if (i85 != 0) {
                    if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i86 = 256;
                        } else {
                            i86 = 128;
                        }
                        i79 |= i86;
                    }
                    i87 = i25 & PKIFailureInfo.certRevoked;
                    if (i87 != 0) {
                        i89 = i79 | 3072;
                    } else {
                        i88 = i79;
                        if ((i19 & 3072) == 0) {
                            i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                        } else {
                            i89 = i88;
                        }
                    }
                    i95 = i25 & 16384;
                    if (i95 != 0) {
                        if ((i19 & 24576) == 0) {
                            if (rVarH.c(i17)) {
                                i39 = 16384;
                            }
                            i89 |= i39;
                        }
                        i96 = i25 & 32768;
                        if (i96 != 0) {
                            i89 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            if (!rVarH.G(lVar2)) {
                                i47 = 65536;
                            }
                            i89 |= i47;
                        }
                        if ((i19 & 1572864) != 0) {
                            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i101 = PKIFailureInfo.signerNotTrusted;
                            }
                            i89 |= i101;
                        }
                        if ((i68 & 306783379) == 306783378) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (rVarH.r(z17, i68 & 1)) {
                            rVarH.I();
                            if ((i18 & 1) != 0) {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            } else {
                                if (i102 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i27 != 0) {
                                    jH = Color.INSTANCE.h();
                                }
                                if (i36 != 0) {
                                    jA = v.INSTANCE.a();
                                }
                                if (i38 != 0) {
                                    yVar2 = null;
                                }
                                if (i46 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i49 != 0) {
                                    lVar3 = null;
                                }
                                if (i56 != 0) {
                                    jA2 = v.INSTANCE.a();
                                } else {
                                    jA2 = j17;
                                }
                                if (i59 != 0) {
                                    kVar3 = null;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i66 != 0) {
                                    jVar2 = null;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i69 != 0) {
                                    jA3 = v.INSTANCE.a();
                                } else {
                                    jA3 = j18;
                                }
                                if (i77 != 0) {
                                    iA = b5.v.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if (i85 != 0) {
                                    z16 = true;
                                }
                                if (i87 != 0) {
                                    i99 = Integer.MAX_VALUE;
                                } else {
                                    i99 = i16;
                                }
                                if (i95 == 0) {
                                }
                                if (i96 == 0) {
                                }
                                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                    i89 &= -3670017;
                                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                                } else {
                                    textStyle3 = textStyle;
                                }
                                kVar4 = kVar3;
                                yVar4 = yVar2;
                                j28 = jA;
                                fontWeight4 = fontWeight2;
                                lVar7 = lVar3;
                                j29 = jA2;
                                j35 = jA3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                            }
                            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                            if (jH != 16) {
                                jM9copywmQWz5c$default = jH;
                            } else if (textStyle3.j() != 16) {
                                jM9copywmQWz5c$default = textStyle3.j();
                            } else {
                                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            if (jVar2 != null) {
                                iG = jVar2.getValue();
                            } else {
                                iG = j.INSTANCE.g();
                            }
                            TextStyle textStyleM11119 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                            zD = rVarH.d(jM9copywmQWz5c$default);
                            objE = rVarH.E();
                            if (zD) {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            } else {
                                objE = new a(jM9copywmQWz5c$default);
                                rVarH.v(objE);
                            }
                            int i1011111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                            int i1011111111111 = i89 << 9;
                            k0.q(str, mVar3, textStyleM11119, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111110 | (57344 & i1011111111111) | (458752 & i1011111111111) | (3670016 & i1011111111111) | (i1011111111111 & 29360128), 512);
                            rVar2 = rVarH;
                            if (t.k()) {
                                t.n();
                            }
                            j19 = jH;
                            i97 = i99;
                            i98 = i100;
                            textStyle2 = textStyle3;
                            fontWeight3 = fontWeight4;
                            yVar3 = yVar4;
                            lVar5 = lVar7;
                            j26 = j29;
                            kVar2 = kVar4;
                            j27 = j35;
                            lVar4 = lVar6;
                            z18 = z16;
                            j25 = j28;
                            mVar2 = mVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            jVar2 = jVar;
                            iA = i15;
                            i97 = i16;
                            i98 = i17;
                            lVar4 = lVar2;
                            textStyle2 = textStyle;
                            z18 = z16;
                            j19 = jH;
                            yVar3 = yVar2;
                            j25 = jA;
                            fontWeight3 = fontWeight2;
                            lVar5 = lVar3;
                            j26 = j17;
                            kVar2 = kVar;
                            j27 = j18;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.h5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i89 |= 24576;
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM111110 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011111111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011111111113 = i89 << 9;
                        k0.q(str, mVar3, textStyleM111110, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111112 | (57344 & i1011111111113) | (458752 & i1011111111113) | (3670016 & i1011111111113) | (i1011111111113 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i79 |= MLKEMEngine.KyberPolyBytes;
                z16 = z15;
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM111111 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011111111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011111111115 = i89 << 9;
                        k0.q(str, mVar3, textStyleM111111, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111114 | (57344 & i1011111111115) | (458752 & i1011111111115) | (3670016 & i1011111111115) | (i1011111111115 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM111112 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i1011111111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i1011111111117 = i89 << 9;
                    k0.q(str, mVar3, textStyleM111112, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111116 | (57344 & i1011111111117) | (458752 & i1011111111117) | (3670016 & i1011111111117) | (i1011111111117 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i58 |= 100663296;
            i66 = i25 & 512;
            if (i66 != 0) {
                i58 |= 805306368;
            } else if ((i18 & 805306368) != 0) {
                if (rVarH.W(jVar)) {
                    i67 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i67 = 268435456;
                }
                i58 |= i67;
            }
            i68 = i58;
            i69 = i25 & 1024;
            if (i69 != 0) {
                i75 = i19 | 6;
            } else if ((i19 & 6) == 0) {
                if (rVarH.d(j18)) {
                    i76 = 4;
                } else {
                    i76 = 2;
                }
                i75 = i19 | i76;
            } else {
                i75 = i19;
            }
            i77 = i25 & 2048;
            if (i77 != 0) {
                i75 |= 48;
            } else if ((i19 & 48) != 0) {
                if (rVarH.c(i15)) {
                    i78 = 32;
                } else {
                    i78 = 16;
                }
                i75 |= i78;
            }
            i79 = i75;
            i85 = i25 & PKIFailureInfo.certConfirmed;
            if (i85 != 0) {
                if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i86 = 256;
                    } else {
                        i86 = 128;
                    }
                    i79 |= i86;
                }
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM111113 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i1011111111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i1011111111119 = i89 << 9;
                        k0.q(str, mVar3, textStyleM111113, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111118 | (57344 & i1011111111119) | (458752 & i1011111111119) | (3670016 & i1011111111119) | (i1011111111119 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM111114 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111111111111 = i89 << 9;
                    k0.q(str, mVar3, textStyleM111114, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111111110 | (57344 & i10111111111111) | (458752 & i10111111111111) | (3670016 & i10111111111111) | (i10111111111111 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i87 = i25 & PKIFailureInfo.certRevoked;
            if (i87 != 0) {
                i89 = i79 | 3072;
            } else {
                i88 = i79;
                if ((i19 & 3072) == 0) {
                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                } else {
                    i89 = i88;
                }
            }
            i95 = i25 & 16384;
            if (i95 != 0) {
                if ((i19 & 24576) == 0) {
                    if (rVarH.c(i17)) {
                        i39 = 16384;
                    }
                    i89 |= i39;
                }
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM111115 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111111111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111111111113 = i89 << 9;
                    k0.q(str, mVar3, textStyleM111115, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111111112 | (57344 & i10111111111113) | (458752 & i10111111111113) | (3670016 & i10111111111113) | (i10111111111113 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i89 |= 24576;
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM111116 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i10111111111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i10111111111115 = i89 << 9;
                k0.q(str, mVar3, textStyleM111116, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111111114 | (57344 & i10111111111115) | (458752 & i10111111111115) | (3670016 & i10111111111115) | (i10111111111115 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i29 |= 12582912;
        i58 = i29;
        i59 = i25 & 256;
        if (i59 != 0) {
            if ((i18 & 100663296) == 0) {
                if (rVarH.W(kVar)) {
                    i65 = 67108864;
                } else {
                    i65 = 33554432;
                }
                i58 |= i65;
            }
            i66 = i25 & 512;
            if (i66 != 0) {
                i58 |= 805306368;
            } else if ((i18 & 805306368) != 0) {
                if (rVarH.W(jVar)) {
                    i67 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i67 = 268435456;
                }
                i58 |= i67;
            }
            i68 = i58;
            i69 = i25 & 1024;
            if (i69 != 0) {
                i75 = i19 | 6;
            } else if ((i19 & 6) == 0) {
                if (rVarH.d(j18)) {
                    i76 = 4;
                } else {
                    i76 = 2;
                }
                i75 = i19 | i76;
            } else {
                i75 = i19;
            }
            i77 = i25 & 2048;
            if (i77 != 0) {
                i75 |= 48;
            } else if ((i19 & 48) != 0) {
                if (rVarH.c(i15)) {
                    i78 = 32;
                } else {
                    i78 = 16;
                }
                i75 |= i78;
            }
            i79 = i75;
            i85 = i25 & PKIFailureInfo.certConfirmed;
            if (i85 != 0) {
                if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i86 = 256;
                    } else {
                        i86 = 128;
                    }
                    i79 |= i86;
                }
                i87 = i25 & PKIFailureInfo.certRevoked;
                if (i87 != 0) {
                    i89 = i79 | 3072;
                } else {
                    i88 = i79;
                    if ((i19 & 3072) == 0) {
                        i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                    } else {
                        i89 = i88;
                    }
                }
                i95 = i25 & 16384;
                if (i95 != 0) {
                    if ((i19 & 24576) == 0) {
                        if (rVarH.c(i17)) {
                            i39 = 16384;
                        }
                        i89 |= i39;
                    }
                    i96 = i25 & 32768;
                    if (i96 != 0) {
                        i89 |= 196608;
                    } else if ((i19 & 196608) == 0) {
                        if (!rVarH.G(lVar2)) {
                            i47 = 65536;
                        }
                        i89 |= i47;
                    }
                    if ((i19 & 1572864) != 0) {
                        if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i101 = PKIFailureInfo.signerNotTrusted;
                        }
                        i89 |= i101;
                    }
                    if ((i68 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i68 & 1)) {
                        rVarH.I();
                        if ((i18 & 1) != 0) {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        } else {
                            if (i102 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i27 != 0) {
                                jH = Color.INSTANCE.h();
                            }
                            if (i36 != 0) {
                                jA = v.INSTANCE.a();
                            }
                            if (i38 != 0) {
                                yVar2 = null;
                            }
                            if (i46 != 0) {
                                fontWeight2 = null;
                            }
                            if (i49 != 0) {
                                lVar3 = null;
                            }
                            if (i56 != 0) {
                                jA2 = v.INSTANCE.a();
                            } else {
                                jA2 = j17;
                            }
                            if (i59 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i66 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i69 != 0) {
                                jA3 = v.INSTANCE.a();
                            } else {
                                jA3 = j18;
                            }
                            if (i77 != 0) {
                                iA = b5.v.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if (i85 != 0) {
                                z16 = true;
                            }
                            if (i87 != 0) {
                                i99 = Integer.MAX_VALUE;
                            } else {
                                i99 = i16;
                            }
                            if (i95 == 0) {
                            }
                            if (i96 == 0) {
                            }
                            if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                                i89 &= -3670017;
                                textStyle3 = (TextStyle) rVarH.N(f1730a);
                            } else {
                                textStyle3 = textStyle;
                            }
                            kVar4 = kVar3;
                            yVar4 = yVar2;
                            j28 = jA;
                            fontWeight4 = fontWeight2;
                            lVar7 = lVar3;
                            j29 = jA2;
                            j35 = jA3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                        }
                        jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                        fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                        if (jH != 16) {
                            jM9copywmQWz5c$default = jH;
                        } else if (textStyle3.j() != 16) {
                            jM9copywmQWz5c$default = textStyle3.j();
                        } else {
                            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        if (jVar2 != null) {
                            iG = jVar2.getValue();
                        } else {
                            iG = j.INSTANCE.g();
                        }
                        TextStyle textStyleM111117 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                        zD = rVarH.d(jM9copywmQWz5c$default);
                        objE = rVarH.E();
                        if (zD) {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        } else {
                            objE = new a(jM9copywmQWz5c$default);
                            rVarH.v(objE);
                        }
                        int i10111111111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                        int i10111111111117 = i89 << 9;
                        k0.q(str, mVar3, textStyleM111117, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111111116 | (57344 & i10111111111117) | (458752 & i10111111111117) | (3670016 & i10111111111117) | (i10111111111117 & 29360128), 512);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        j19 = jH;
                        i97 = i99;
                        i98 = i100;
                        textStyle2 = textStyle3;
                        fontWeight3 = fontWeight4;
                        yVar3 = yVar4;
                        lVar5 = lVar7;
                        j26 = j29;
                        kVar2 = kVar4;
                        j27 = j35;
                        lVar4 = lVar6;
                        z18 = z16;
                        j25 = j28;
                        mVar2 = mVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        jVar2 = jVar;
                        iA = i15;
                        i97 = i16;
                        i98 = i17;
                        lVar4 = lVar2;
                        textStyle2 = textStyle;
                        z18 = z16;
                        j19 = jH;
                        yVar3 = yVar2;
                        j25 = jA;
                        fontWeight3 = fontWeight2;
                        lVar5 = lVar3;
                        j26 = j17;
                        kVar2 = kVar;
                        j27 = j18;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.h5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i89 |= 24576;
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM111118 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i10111111111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i10111111111119 = i89 << 9;
                    k0.q(str, mVar3, textStyleM111118, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i10111111111118 | (57344 & i10111111111119) | (458752 & i10111111111119) | (3670016 & i10111111111119) | (i10111111111119 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i79 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i87 = i25 & PKIFailureInfo.certRevoked;
            if (i87 != 0) {
                i89 = i79 | 3072;
            } else {
                i88 = i79;
                if ((i19 & 3072) == 0) {
                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                } else {
                    i89 = i88;
                }
            }
            i95 = i25 & 16384;
            if (i95 != 0) {
                if ((i19 & 24576) == 0) {
                    if (rVarH.c(i17)) {
                        i39 = 16384;
                    }
                    i89 |= i39;
                }
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM111119 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111111111111 = i89 << 9;
                    k0.q(str, mVar3, textStyleM111119, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111111110 | (57344 & i101111111111111) | (458752 & i101111111111111) | (3670016 & i101111111111111) | (i101111111111111 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i89 |= 24576;
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM1111110 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i101111111111112 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i101111111111113 = i89 << 9;
                k0.q(str, mVar3, textStyleM1111110, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111111112 | (57344 & i101111111111113) | (458752 & i101111111111113) | (3670016 & i101111111111113) | (i101111111111113 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i58 |= 100663296;
        i66 = i25 & 512;
        if (i66 != 0) {
            i58 |= 805306368;
        } else if ((i18 & 805306368) != 0) {
            if (rVarH.W(jVar)) {
                i67 = PKIFailureInfo.duplicateCertReq;
            } else {
                i67 = 268435456;
            }
            i58 |= i67;
        }
        i68 = i58;
        i69 = i25 & 1024;
        if (i69 != 0) {
            i75 = i19 | 6;
        } else if ((i19 & 6) == 0) {
            if (rVarH.d(j18)) {
                i76 = 4;
            } else {
                i76 = 2;
            }
            i75 = i19 | i76;
        } else {
            i75 = i19;
        }
        i77 = i25 & 2048;
        if (i77 != 0) {
            i75 |= 48;
        } else if ((i19 & 48) != 0) {
            if (rVarH.c(i15)) {
                i78 = 32;
            } else {
                i78 = 16;
            }
            i75 |= i78;
        }
        i79 = i75;
        i85 = i25 & PKIFailureInfo.certConfirmed;
        if (i85 != 0) {
            if ((i19 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i86 = 256;
                } else {
                    i86 = 128;
                }
                i79 |= i86;
            }
            i87 = i25 & PKIFailureInfo.certRevoked;
            if (i87 != 0) {
                i89 = i79 | 3072;
            } else {
                i88 = i79;
                if ((i19 & 3072) == 0) {
                    i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
                } else {
                    i89 = i88;
                }
            }
            i95 = i25 & 16384;
            if (i95 != 0) {
                if ((i19 & 24576) == 0) {
                    if (rVarH.c(i17)) {
                        i39 = 16384;
                    }
                    i89 |= i39;
                }
                i96 = i25 & 32768;
                if (i96 != 0) {
                    i89 |= 196608;
                } else if ((i19 & 196608) == 0) {
                    if (!rVarH.G(lVar2)) {
                        i47 = 65536;
                    }
                    i89 |= i47;
                }
                if ((i19 & 1572864) != 0) {
                    if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i101 = PKIFailureInfo.signerNotTrusted;
                    }
                    i89 |= i101;
                }
                if ((i68 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i68 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0) {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    } else {
                        if (i102 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i27 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i36 != 0) {
                            jA = v.INSTANCE.a();
                        }
                        if (i38 != 0) {
                            yVar2 = null;
                        }
                        if (i46 != 0) {
                            fontWeight2 = null;
                        }
                        if (i49 != 0) {
                            lVar3 = null;
                        }
                        if (i56 != 0) {
                            jA2 = v.INSTANCE.a();
                        } else {
                            jA2 = j17;
                        }
                        if (i59 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i66 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i69 != 0) {
                            jA3 = v.INSTANCE.a();
                        } else {
                            jA3 = j18;
                        }
                        if (i77 != 0) {
                            iA = b5.v.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if (i85 != 0) {
                            z16 = true;
                        }
                        if (i87 != 0) {
                            i99 = Integer.MAX_VALUE;
                        } else {
                            i99 = i16;
                        }
                        if (i95 == 0) {
                        }
                        if (i96 == 0) {
                        }
                        if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                            i89 &= -3670017;
                            textStyle3 = (TextStyle) rVarH.N(f1730a);
                        } else {
                            textStyle3 = textStyle;
                        }
                        kVar4 = kVar3;
                        yVar4 = yVar2;
                        j28 = jA;
                        fontWeight4 = fontWeight2;
                        lVar7 = lVar3;
                        j29 = jA2;
                        j35 = jA3;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                    }
                    jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                    fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                    if (jH != 16) {
                        jM9copywmQWz5c$default = jH;
                    } else if (textStyle3.j() != 16) {
                        jM9copywmQWz5c$default = textStyle3.j();
                    } else {
                        jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (jVar2 != null) {
                        iG = jVar2.getValue();
                    } else {
                        iG = j.INSTANCE.g();
                    }
                    TextStyle textStyleM1111111 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                    zD = rVarH.d(jM9copywmQWz5c$default);
                    objE = rVarH.E();
                    if (zD) {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    } else {
                        objE = new a(jM9copywmQWz5c$default);
                        rVarH.v(objE);
                    }
                    int i101111111111114 = (i68 & 126) | ((i89 >> 6) & 7168);
                    int i101111111111115 = i89 << 9;
                    k0.q(str, mVar3, textStyleM1111111, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111111114 | (57344 & i101111111111115) | (458752 & i101111111111115) | (3670016 & i101111111111115) | (i101111111111115 & 29360128), 512);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    j19 = jH;
                    i97 = i99;
                    i98 = i100;
                    textStyle2 = textStyle3;
                    fontWeight3 = fontWeight4;
                    yVar3 = yVar4;
                    lVar5 = lVar7;
                    j26 = j29;
                    kVar2 = kVar4;
                    j27 = j35;
                    lVar4 = lVar6;
                    z18 = z16;
                    j25 = j28;
                    mVar2 = mVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    jVar2 = jVar;
                    iA = i15;
                    i97 = i16;
                    i98 = i17;
                    lVar4 = lVar2;
                    textStyle2 = textStyle;
                    z18 = z16;
                    j19 = jH;
                    yVar3 = yVar2;
                    j25 = jA;
                    fontWeight3 = fontWeight2;
                    lVar5 = lVar3;
                    j26 = j17;
                    kVar2 = kVar;
                    j27 = j18;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.h5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i89 |= 24576;
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM1111112 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i101111111111116 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i101111111111117 = i89 << 9;
                k0.q(str, mVar3, textStyleM1111112, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111111116 | (57344 & i101111111111117) | (458752 & i101111111111117) | (3670016 & i101111111111117) | (i101111111111117 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i79 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        i87 = i25 & PKIFailureInfo.certRevoked;
        if (i87 != 0) {
            i89 = i79 | 3072;
        } else {
            i88 = i79;
            if ((i19 & 3072) == 0) {
                i89 = i88 | (rVarH.c(i16) ? 2048 : 1024);
            } else {
                i89 = i88;
            }
        }
        i95 = i25 & 16384;
        if (i95 != 0) {
            if ((i19 & 24576) == 0) {
                if (rVarH.c(i17)) {
                    i39 = 16384;
                }
                i89 |= i39;
            }
            i96 = i25 & 32768;
            if (i96 != 0) {
                i89 |= 196608;
            } else if ((i19 & 196608) == 0) {
                if (!rVarH.G(lVar2)) {
                    i47 = 65536;
                }
                i89 |= i47;
            }
            if ((i19 & 1572864) != 0) {
                if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                    i101 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i101 = PKIFailureInfo.signerNotTrusted;
                }
                i89 |= i101;
            }
            if ((i68 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i68 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                } else {
                    if (i102 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i27 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i36 != 0) {
                        jA = v.INSTANCE.a();
                    }
                    if (i38 != 0) {
                        yVar2 = null;
                    }
                    if (i46 != 0) {
                        fontWeight2 = null;
                    }
                    if (i49 != 0) {
                        lVar3 = null;
                    }
                    if (i56 != 0) {
                        jA2 = v.INSTANCE.a();
                    } else {
                        jA2 = j17;
                    }
                    if (i59 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i66 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i69 != 0) {
                        jA3 = v.INSTANCE.a();
                    } else {
                        jA3 = j18;
                    }
                    if (i77 != 0) {
                        iA = b5.v.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if (i85 != 0) {
                        z16 = true;
                    }
                    if (i87 != 0) {
                        i99 = Integer.MAX_VALUE;
                    } else {
                        i99 = i16;
                    }
                    if (i95 == 0) {
                    }
                    if (i96 == 0) {
                    }
                    if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                        i89 &= -3670017;
                        textStyle3 = (TextStyle) rVarH.N(f1730a);
                    } else {
                        textStyle3 = textStyle;
                    }
                    kVar4 = kVar3;
                    yVar4 = yVar2;
                    j28 = jA;
                    fontWeight4 = fontWeight2;
                    lVar7 = lVar3;
                    j29 = jA2;
                    j35 = jA3;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
                }
                jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
                fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
                if (jH != 16) {
                    jM9copywmQWz5c$default = jH;
                } else if (textStyle3.j() != 16) {
                    jM9copywmQWz5c$default = textStyle3.j();
                } else {
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (jVar2 != null) {
                    iG = jVar2.getValue();
                } else {
                    iG = j.INSTANCE.g();
                }
                TextStyle textStyleM1111113 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
                zD = rVarH.d(jM9copywmQWz5c$default);
                objE = rVarH.E();
                if (zD) {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                } else {
                    objE = new a(jM9copywmQWz5c$default);
                    rVarH.v(objE);
                }
                int i101111111111118 = (i68 & 126) | ((i89 >> 6) & 7168);
                int i101111111111119 = i89 << 9;
                k0.q(str, mVar3, textStyleM1111113, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i101111111111118 | (57344 & i101111111111119) | (458752 & i101111111111119) | (3670016 & i101111111111119) | (i101111111111119 & 29360128), 512);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                j19 = jH;
                i97 = i99;
                i98 = i100;
                textStyle2 = textStyle3;
                fontWeight3 = fontWeight4;
                yVar3 = yVar4;
                lVar5 = lVar7;
                j26 = j29;
                kVar2 = kVar4;
                j27 = j35;
                lVar4 = lVar6;
                z18 = z16;
                j25 = j28;
                mVar2 = mVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                jVar2 = jVar;
                iA = i15;
                i97 = i16;
                i98 = i17;
                lVar4 = lVar2;
                textStyle2 = textStyle;
                z18 = z16;
                j19 = jH;
                yVar3 = yVar2;
                j25 = jA;
                fontWeight3 = fontWeight2;
                lVar5 = lVar3;
                j26 = j17;
                kVar2 = kVar;
                j27 = j18;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.h5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i89 |= 24576;
        i96 = i25 & 32768;
        if (i96 != 0) {
            i89 |= 196608;
        } else if ((i19 & 196608) == 0) {
            if (!rVarH.G(lVar2)) {
                i47 = 65536;
            }
            i89 |= i47;
        }
        if ((i19 & 1572864) != 0) {
            if ((i25 & PKIFailureInfo.notAuthorized) == 0) {
                i101 = PKIFailureInfo.signerNotTrusted;
            } else {
                i101 = PKIFailureInfo.signerNotTrusted;
            }
            i89 |= i101;
        }
        if ((i68 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i68 & 1)) {
            rVarH.I();
            if ((i18 & 1) != 0) {
                if (i102 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i27 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if (i36 != 0) {
                    jA = v.INSTANCE.a();
                }
                if (i38 != 0) {
                    yVar2 = null;
                }
                if (i46 != 0) {
                    fontWeight2 = null;
                }
                if (i49 != 0) {
                    lVar3 = null;
                }
                if (i56 != 0) {
                    jA2 = v.INSTANCE.a();
                } else {
                    jA2 = j17;
                }
                if (i59 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                if (i66 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i69 != 0) {
                    jA3 = v.INSTANCE.a();
                } else {
                    jA3 = j18;
                }
                if (i77 != 0) {
                    iA = b5.v.INSTANCE.a();
                } else {
                    iA = i15;
                }
                if (i85 != 0) {
                    z16 = true;
                }
                if (i87 != 0) {
                    i99 = Integer.MAX_VALUE;
                } else {
                    i99 = i16;
                }
                if (i95 == 0) {
                }
                if (i96 == 0) {
                }
                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                    i89 &= -3670017;
                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                } else {
                    textStyle3 = textStyle;
                }
                kVar4 = kVar3;
                yVar4 = yVar2;
                j28 = jA;
                fontWeight4 = fontWeight2;
                lVar7 = lVar3;
                j29 = jA2;
                j35 = jA3;
            } else {
                if (i102 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i27 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if (i36 != 0) {
                    jA = v.INSTANCE.a();
                }
                if (i38 != 0) {
                    yVar2 = null;
                }
                if (i46 != 0) {
                    fontWeight2 = null;
                }
                if (i49 != 0) {
                    lVar3 = null;
                }
                if (i56 != 0) {
                    jA2 = v.INSTANCE.a();
                } else {
                    jA2 = j17;
                }
                if (i59 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                if (i66 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i69 != 0) {
                    jA3 = v.INSTANCE.a();
                } else {
                    jA3 = j18;
                }
                if (i77 != 0) {
                    iA = b5.v.INSTANCE.a();
                } else {
                    iA = i15;
                }
                if (i85 != 0) {
                    z16 = true;
                }
                if (i87 != 0) {
                    i99 = Integer.MAX_VALUE;
                } else {
                    i99 = i16;
                }
                if (i95 == 0) {
                }
                if (i96 == 0) {
                }
                if ((i25 & PKIFailureInfo.notAuthorized) != 0) {
                    i89 &= -3670017;
                    textStyle3 = (TextStyle) rVarH.N(f1730a);
                } else {
                    textStyle3 = textStyle;
                }
                kVar4 = kVar3;
                yVar4 = yVar2;
                j28 = jA;
                fontWeight4 = fontWeight2;
                lVar7 = lVar3;
                j29 = jA2;
                j35 = jA3;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1028090691, i68, i89, "androidx.compose.material.Text (Text.kt:115)");
            }
            jM20unboximpl = ((Color) rVarH.N(m1.a())).m20unboximpl();
            fFloatValue = ((Number) rVarH.N(l1.c())).floatValue();
            if (jH != 16) {
                jM9copywmQWz5c$default = jH;
            } else if (textStyle3.j() != 16) {
                jM9copywmQWz5c$default = textStyle3.j();
            } else {
                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(jM20unboximpl, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            }
            if (jVar2 != null) {
                iG = jVar2.getValue();
            } else {
                iG = j.INSTANCE.g();
            }
            TextStyle textStyleM1111114 = textStyle3.M((16777214 & 1) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & 2) != 0 ? v.INSTANCE.a() : j28, (16777214 & 4) != 0 ? null : fontWeight4, (16777214 & 8) != 0 ? null : yVar4, (16777214 & 16) != 0 ? null : null, (16777214 & 32) != 0 ? null : lVar7, (16777214 & 64) != 0 ? null : null, (16777214 & 128) != 0 ? v.INSTANCE.a() : j29, (16777214 & 256) != 0 ? null : null, (16777214 & 512) != 0 ? null : null, (16777214 & 1024) != 0 ? null : null, (16777214 & 2048) != 0 ? Color.INSTANCE.h() : 0L, (16777214 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar4, (16777214 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16777214 & 16384) != 0 ? null : null, (16777214 & 32768) != 0 ? j.INSTANCE.g() : iG, (16777214 & PKIFailureInfo.notAuthorized) != 0 ? b5.l.INSTANCE.f() : 0, (16777214 & PKIFailureInfo.unsupportedVersion) != 0 ? v.INSTANCE.a() : j35, (16777214 & PKIFailureInfo.transactionIdInUse) != 0 ? null : null, (16777214 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16777214 & PKIFailureInfo.badCertTemplate) != 0 ? f.INSTANCE.b() : 0, (16777214 & PKIFailureInfo.badSenderNonce) != 0 ? e.INSTANCE.c() : 0, (16777214 & 4194304) != 0 ? null : null, (16777214 & 8388608) != 0 ? null : null);
            zD = rVarH.d(jM9copywmQWz5c$default);
            objE = rVarH.E();
            if (zD) {
                objE = new a(jM9copywmQWz5c$default);
                rVarH.v(objE);
            } else {
                objE = new a(jM9copywmQWz5c$default);
                rVarH.v(objE);
            }
            int i1011111111111110 = (i68 & 126) | ((i89 >> 6) & 7168);
            int i1011111111111111 = i89 << 9;
            k0.q(str, mVar3, textStyleM1111114, lVar6, iA, z16, i99, i100, (p1) objE, null, rVarH, i1011111111111110 | (57344 & i1011111111111111) | (458752 & i1011111111111111) | (3670016 & i1011111111111111) | (i1011111111111111 & 29360128), 512);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
            j19 = jH;
            i97 = i99;
            i98 = i100;
            textStyle2 = textStyle3;
            fontWeight3 = fontWeight4;
            yVar3 = yVar4;
            lVar5 = lVar7;
            j26 = j29;
            kVar2 = kVar4;
            j27 = j35;
            lVar4 = lVar6;
            z18 = z16;
            j25 = j28;
            mVar2 = mVar3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar2 = mVar;
            jVar2 = jVar;
            iA = i15;
            i97 = i16;
            i98 = i17;
            lVar4 = lVar2;
            textStyle2 = textStyle;
            z18 = z16;
            j19 = jH;
            yVar3 = yVar2;
            j25 = jA;
            fontWeight3 = fontWeight2;
            lVar5 = lVar3;
            j26 = j17;
            kVar2 = kVar;
            j27 = j18;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.h5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j5.h(str, mVar2, j19, j25, yVar3, fontWeight3, lVar5, j26, kVar2, jVar2, j27, iA, z18, i97, i98, lVar4, textStyle2, i18, i19, i25, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(String str, m mVar, long j15, long j16, y yVar, FontWeight fontWeight, l lVar, long j17, k kVar, j jVar, long j18, int i15, boolean z15, int i16, int i17, er.l lVar2, TextStyle textStyle, int i18, int i19, int i25, r rVar, int i26) {
        g(str, mVar, j15, j16, yVar, fontWeight, lVar, j17, kVar, jVar, j18, i15, z15, i16, i17, lVar2, textStyle, rVar, g4.a(i18 | 1), g4.a(i19), i25);
        return i0.f148189a;
    }
}
