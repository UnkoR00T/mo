package p079n1;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.c;
import c5.h;
import c5.i;
import er.l;
import er.p;
import er.q;
import f3.m;
import fr.k;
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
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.z3;
import v4.ImeOptions;
import v4.TextFieldValue;
import v4.e1;
import w1.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a×\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a×\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020 2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061²\u0006\f\u0010+\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "Lf3/m;", "modifier", "", "enabled", "readOnly", "Lq4/b4;", "textStyle", "Ln1/m3;", "keyboardOptions", "Ln1/l3;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lv4/e1;", "visualTransformation", "Lq4/t3;", "onTextLayout", "Lb1/l;", "interactionSource", "Landroidx/compose/ui/graphics/c;", "cursorBrush", "Lkotlin/Function0;", "decorationBox", "h", "(Ljava/lang/String;Ler/l;Lf3/m;ZZLq4/b4;Ln1/m3;Ln1/l3;ZIILv4/e1;Ler/l;Lb1/l;Landroidx/compose/ui/graphics/c;Ler/q;Lm2/r;III)V", "Lv4/t0;", "i", "(Lv4/t0;Ler/l;Lf3/m;ZZLq4/b4;Ln1/m3;Ln1/l3;ZIILv4/e1;Ler/l;Lb1/l;Landroidx/compose/ui/graphics/c;Ler/q;Lm2/r;III)V", "Lw1/a;", "a", "Lw1/a;", "DefaultTextFieldDecorator", "Lc5/k;", "b", "J", "MinTouchTargetSizeForHandles", "cursorHandleVisible", "", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f130459a = Function0.f130461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f130460b;

    /* JADX INFO: renamed from: n1.u$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "it", "<anonymous>", "(Ler/a;)V"}, k = 3, mv = {2, 1, 0})
    static final class Function0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Function0 f130461a = new Function0();

        Function0() {
        }
    }

    static {
        float f15 = 40;
        f130460b = i.a(h.n(f15), h.n(f15));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x0208  */
    /* JADX WARN: Code duplicated, block: B:172:0x0214  */
    /* JADX WARN: Code duplicated, block: B:175:0x021e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0225  */
    /* JADX WARN: Code duplicated, block: B:184:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0253  */
    /* JADX WARN: Code duplicated, block: B:187:0x0258  */
    /* JADX WARN: Code duplicated, block: B:189:0x025c  */
    /* JADX WARN: Code duplicated, block: B:191:0x025f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0268  */
    /* JADX WARN: Code duplicated, block: B:195:0x0271  */
    /* JADX WARN: Code duplicated, block: B:196:0x0278  */
    /* JADX WARN: Code duplicated, block: B:198:0x027b  */
    /* JADX WARN: Code duplicated, block: B:199:0x027d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0288  */
    /* JADX WARN: Code duplicated, block: B:206:0x0290  */
    /* JADX WARN: Code duplicated, block: B:208:0x0294  */
    /* JADX WARN: Code duplicated, block: B:209:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x029b  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02be  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:225:0x02db  */
    /* JADX WARN: Code duplicated, block: B:227:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:229:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:232:0x030c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0317  */
    /* JADX WARN: Code duplicated, block: B:236:0x0327  */
    /* JADX WARN: Code duplicated, block: B:237:0x034c  */
    /* JADX WARN: Code duplicated, block: B:240:0x037b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0381  */
    /* JADX WARN: Code duplicated, block: B:245:0x0394  */
    /* JADX WARN: Code duplicated, block: B:246:0x0397  */
    /* JADX WARN: Code duplicated, block: B:249:0x039e  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:255:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:258:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:266:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:271:0x0436  */
    /* JADX WARN: Code duplicated, block: B:274:0x044f  */
    /* JADX WARN: Code duplicated, block: B:277:0x046e  */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e A[ADDED_TO_REGION] */
    public static final void h(final String str, final l<? super String, i0> lVar, m mVar, boolean z15, boolean z16, TextStyle textStyle, KeyboardOptions keyboardOptions, l3 l3Var, boolean z17, int i15, int i16, e1 e1Var, l<? super TextLayoutResult, i0> lVar2, b1.l lVar3, c cVar, q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar, r rVar, final int i17, final int i18, final int i19) {
        int i25;
        m mVar2;
        int i26;
        boolean z18;
        int i27;
        int i28;
        int i29;
        boolean z19;
        int i35;
        int i36;
        int i37;
        TextStyle textStyleA;
        int i38;
        int i39;
        KeyboardOptions keyboardOptionsA;
        int i45;
        int i46;
        final l3 l3Var2;
        int i47;
        int i48;
        int i49;
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
        boolean z25;
        r rVar2;
        final boolean z26;
        final q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar2;
        final boolean z27;
        final KeyboardOptions keyboardOptions2;
        final boolean z28;
        final TextStyle textStyle2;
        final m mVar3;
        final e1 e1Var2;
        final l<? super TextLayoutResult, i0> lVar4;
        final b1.l lVar5;
        final c cVar2;
        final int i86;
        final int i87;
        d5 d5VarM;
        l3 l3VarA;
        boolean z29;
        int i88;
        int i89;
        e1 e1VarC;
        l<? super TextLayoutResult, i0> lVar6;
        b1.l lVar7;
        l3 l3Var3;
        c solidColor;
        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVarF;
        boolean z35;
        boolean z36;
        TextStyle textStyle3;
        m mVar4;
        e1 e1Var3;
        c cVar3;
        int i95;
        KeyboardOptions keyboardOptions3;
        l<? super TextLayoutResult, i0> lVar8;
        b1.l lVar9;
        Object objE;
        Object objE2;
        r.Companion companion;
        final a3 a3Var;
        final TextFieldValue textFieldValueH;
        boolean zW;
        Object objE3;
        boolean z37;
        Object objE4;
        final a3 a3Var2;
        int i96;
        int i97;
        boolean zW2;
        Object objE5;
        r rVarH = rVar.h(2026950908);
        if ((i17 & 6) == 0) {
            i25 = (rVarH.W(str) ? 4 : 2) | i17;
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i98 = i19 & 4;
        if (i98 == 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i25 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i26 = i19 & 8;
            if (i26 != 0) {
                if ((i17 & 3072) == 0) {
                    z18 = z15;
                    if (rVarH.a(z18)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i19 & 16;
                i29 = PKIFailureInfo.certRevoked;
                if (i28 != 0) {
                    if ((i17 & 24576) == 0) {
                        z19 = z16;
                        if (rVarH.a(z19)) {
                            i35 = 16384;
                        } else {
                            i35 = 8192;
                        }
                        i25 |= i35;
                    }
                    i36 = i19 & 32;
                    i37 = PKIFailureInfo.unsupportedVersion;
                    if (i36 != 0) {
                        i25 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.W(textStyleA)) {
                                i38 = 131072;
                            } else {
                                i38 = PKIFailureInfo.notAuthorized;
                            }
                            i25 |= i38;
                        }
                    }
                    i39 = i19 & 64;
                    if (i39 != 0) {
                        i25 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i17 & 1572864) == 0) {
                            if (rVarH.W(keyboardOptionsA)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i45 = PKIFailureInfo.signerNotTrusted;
                            }
                            i25 |= i45;
                        }
                    }
                    i46 = i19 & 128;
                    if (i46 != 0) {
                        i25 |= 12582912;
                        l3Var2 = l3Var;
                    } else {
                        l3Var2 = l3Var;
                        if ((i17 & 12582912) == 0) {
                            if (rVarH.W(l3Var2)) {
                                i47 = 8388608;
                            } else {
                                i47 = 4194304;
                            }
                            i25 |= i47;
                        }
                    }
                    i48 = i19 & 256;
                    if (i48 != 0) {
                        i25 |= 100663296;
                    } else if ((i17 & 100663296) == 0) {
                        if (rVarH.a(z17)) {
                            i49 = 67108864;
                        } else {
                            i49 = 33554432;
                        }
                        i25 |= i49;
                    }
                    if ((i17 & 805306368) != 0) {
                        i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    i55 = i19 & 1024;
                    if (i55 != 0) {
                        i56 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i18 | i57;
                    } else {
                        i56 = i18;
                    }
                    i58 = i19 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i18 & 48) != 0) {
                        if (rVarH.W(e1Var)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i19 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i67 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.G(lVar2)) {
                            i68 = 256;
                        } else {
                            i68 = 128;
                        }
                        i67 = i65 | i68;
                    } else {
                        i67 = i65;
                    }
                    i69 = i19 & PKIFailureInfo.certRevoked;
                    if (i69 != 0) {
                        i76 = i67 | 3072;
                    } else {
                        i75 = i67;
                        if ((i18 & 3072) == 0) {
                            i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                        } else {
                            i76 = i75;
                        }
                    }
                    i77 = i19 & 16384;
                    if (i77 != 0) {
                        i78 = i76;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.W(cVar)) {
                                i29 = 16384;
                            }
                            i78 |= i29;
                        }
                        i79 = i19 & 32768;
                        if (i79 != 0) {
                            i78 |= 196608;
                        } else if ((i18 & 196608) == 0) {
                            if (!rVarH.G(qVar)) {
                                i37 = PKIFailureInfo.notAuthorized;
                            }
                            i78 |= i37;
                        }
                        i85 = i78;
                        if ((i25 & 306783379) == 306783378 || (74899 & i85) != 74898) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (rVarH.r(z25, i25 & 1)) {
                            rVarH.I();
                            if ((i17 & 1) != 0 || rVarH.Q()) {
                                if (i98 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i26 != 0) {
                                    z18 = true;
                                }
                                if (i28 != 0) {
                                    z19 = false;
                                }
                                if (i36 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i39 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i46 != 0) {
                                    l3VarA = l3.INSTANCE.a();
                                } else {
                                    l3VarA = l3Var2;
                                }
                                if (i48 != 0) {
                                    z29 = false;
                                } else {
                                    z29 = z17;
                                }
                                if ((i19 & 512) != 0) {
                                    if (z29) {
                                        i88 = 1;
                                    } else {
                                        i88 = Integer.MAX_VALUE;
                                    }
                                    i25 &= -1879048193;
                                } else {
                                    i88 = i15;
                                }
                                if (i55 != 0) {
                                    i89 = 1;
                                } else {
                                    i89 = i16;
                                }
                                if (i58 != 0) {
                                    e1VarC = e1.INSTANCE.c();
                                } else {
                                    e1VarC = e1Var;
                                }
                                if (i66 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new l() { // from class: n1.q
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return u.j((TextLayoutResult) obj);
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    lVar6 = (l) objE;
                                } else {
                                    lVar6 = lVar2;
                                }
                                if (i69 != 0) {
                                    lVar7 = null;
                                } else {
                                    lVar7 = lVar3;
                                }
                                l3Var3 = l3VarA;
                                if (i77 != 0) {
                                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                                } else {
                                    solidColor = cVar;
                                }
                                if (i79 != 0) {
                                    qVarF = e1.f130009a.f();
                                } else {
                                    qVarF = qVar;
                                }
                                z35 = z29;
                                i15 = i88;
                                i16 = i89;
                                z36 = z19;
                                textStyle3 = textStyleA;
                                mVar4 = mVar2;
                                e1Var3 = e1VarC;
                                cVar3 = solidColor;
                                i95 = i25;
                                keyboardOptions3 = keyboardOptionsA;
                                lVar8 = lVar6;
                                lVar9 = lVar7;
                            } else {
                                rVarH.O();
                                if ((i19 & 512) != 0) {
                                    i25 &= -1879048193;
                                }
                                z35 = z17;
                                i15 = i15;
                                i16 = i16;
                                e1Var3 = e1Var;
                                qVarF = qVar;
                                l3Var3 = l3Var2;
                                keyboardOptions3 = keyboardOptionsA;
                                z36 = z19;
                                textStyle3 = textStyleA;
                                mVar4 = mVar2;
                                lVar9 = lVar3;
                                cVar3 = cVar;
                                i95 = i25;
                                lVar8 = lVar2;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                            }
                            objE2 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE2 == companion.a()) {
                                a3 a3VarE = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                                rVarH.v(a3VarE);
                                objE2 = a3VarE;
                            }
                            a3Var = (a3) objE2;
                            textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                            zW = rVarH.W(textFieldValueH);
                            l<? super TextLayoutResult, i0> lVar10 = lVar8;
                            objE3 = rVarH.E();
                            m mVar5 = mVar4;
                            if (zW || objE3 == companion.a()) {
                                objE3 = new er.a() { // from class: n1.r
                                    @Override // er.a
                                    public final Object a() {
                                        return u.m(textFieldValueH, a3Var);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            p076m2.Function0.g((er.a) objE3, rVarH, 0);
                            if ((i95 & 14) == 4) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objE4 = rVarH.E();
                            if (z37 || objE4 == companion.a()) {
                                objE4 = c6.e(str, null, 2, null);
                                rVarH.v(objE4);
                            }
                            a3Var2 = (a3) objE4;
                            ImeOptions imeOptionsG = keyboardOptions3.g(z35);
                            boolean z38 = !z35;
                            if (z35) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if (z35) {
                                i97 = 1;
                            } else {
                                i97 = i15;
                            }
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                            objE5 = rVarH.E();
                            if (zW2 || objE5 == companion.a()) {
                                objE5 = new l() { // from class: n1.s
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            int i99 = i85 << 9;
                            rVar2 = rVarH;
                            boolean z39 = z18;
                            j2.w(textFieldValueH, (l) objE5, mVar5, textStyle3, e1Var3, lVar10, lVar9, cVar3, z38, i97, i96, imeOptionsG, l3Var3, z39, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i99) | (458752 & i99) | (3670016 & i99) | (i99 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                            if (t.k()) {
                                t.n();
                            }
                            textStyle2 = textStyle3;
                            lVar5 = lVar9;
                            cVar2 = cVar3;
                            z27 = z39;
                            z28 = z36;
                            qVar2 = qVarF;
                            keyboardOptions2 = keyboardOptions4;
                            z26 = z35;
                            mVar3 = mVar5;
                            e1Var2 = e1Var3;
                            lVar4 = lVar10;
                            l3Var2 = l3Var3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            z26 = z17;
                            qVar2 = qVar;
                            z27 = z18;
                            keyboardOptions2 = keyboardOptionsA;
                            z28 = z19;
                            textStyle2 = textStyleA;
                            mVar3 = mVar2;
                            e1Var2 = e1Var;
                            lVar4 = lVar2;
                            lVar5 = lVar3;
                            cVar2 = cVar;
                        }
                        i86 = i15;
                        i87 = i16;
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: n1.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i78 = i76 | 24576;
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        } else {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            a3 a3VarE2 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                            rVarH.v(a3VarE2);
                            objE2 = a3VarE2;
                        }
                        a3Var = (a3) objE2;
                        textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                        zW = rVarH.W(textFieldValueH);
                        l<? super TextLayoutResult, i0> lVar11 = lVar8;
                        objE3 = rVarH.E();
                        m mVar6 = mVar4;
                        if (zW) {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        p076m2.Function0.g((er.a) objE3, rVarH, 0);
                        if ((i95 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objE4 = rVarH.E();
                        if (z37) {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        } else {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        }
                        a3Var2 = (a3) objE4;
                        ImeOptions imeOptionsG2 = keyboardOptions3.g(z35);
                        boolean z310 = !z35;
                        if (z35) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if (z35) {
                            i97 = 1;
                        } else {
                            i97 = i15;
                        }
                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                        zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                        objE5 = rVarH.E();
                        if (zW2) {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        int i910 = i85 << 9;
                        rVar2 = rVarH;
                        boolean z311 = z18;
                        j2.w(textFieldValueH, (l) objE5, mVar6, textStyle3, e1Var3, lVar11, lVar9, cVar3, z310, i97, i96, imeOptionsG2, l3Var3, z311, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i910) | (458752 & i910) | (3670016 & i910) | (i910 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        textStyle2 = textStyle3;
                        lVar5 = lVar9;
                        cVar2 = cVar3;
                        z27 = z311;
                        z28 = z36;
                        qVar2 = qVarF;
                        keyboardOptions2 = keyboardOptions5;
                        z26 = z35;
                        mVar3 = mVar6;
                        e1Var2 = e1Var3;
                        lVar4 = lVar11;
                        l3Var2 = l3Var3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z26 = z17;
                        qVar2 = qVar;
                        z27 = z18;
                        keyboardOptions2 = keyboardOptionsA;
                        z28 = z19;
                        textStyle2 = textStyleA;
                        mVar3 = mVar2;
                        e1Var2 = e1Var;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    i86 = i15;
                    i87 = i16;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 24576;
                z19 = z16;
                i36 = i19 & 32;
                i37 = PKIFailureInfo.unsupportedVersion;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        } else {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            a3 a3VarE3 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                            rVarH.v(a3VarE3);
                            objE2 = a3VarE3;
                        }
                        a3Var = (a3) objE2;
                        textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                        zW = rVarH.W(textFieldValueH);
                        l<? super TextLayoutResult, i0> lVar12 = lVar8;
                        objE3 = rVarH.E();
                        m mVar7 = mVar4;
                        if (zW) {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        p076m2.Function0.g((er.a) objE3, rVarH, 0);
                        if ((i95 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objE4 = rVarH.E();
                        if (z37) {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        } else {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        }
                        a3Var2 = (a3) objE4;
                        ImeOptions imeOptionsG3 = keyboardOptions3.g(z35);
                        boolean z312 = !z35;
                        if (z35) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if (z35) {
                            i97 = 1;
                        } else {
                            i97 = i15;
                        }
                        KeyboardOptions keyboardOptions6 = keyboardOptions3;
                        zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                        objE5 = rVarH.E();
                        if (zW2) {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        int i911 = i85 << 9;
                        rVar2 = rVarH;
                        boolean z313 = z18;
                        j2.w(textFieldValueH, (l) objE5, mVar7, textStyle3, e1Var3, lVar12, lVar9, cVar3, z312, i97, i96, imeOptionsG3, l3Var3, z313, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i911) | (458752 & i911) | (3670016 & i911) | (i911 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        textStyle2 = textStyle3;
                        lVar5 = lVar9;
                        cVar2 = cVar3;
                        z27 = z313;
                        z28 = z36;
                        qVar2 = qVarF;
                        keyboardOptions2 = keyboardOptions6;
                        z26 = z35;
                        mVar3 = mVar7;
                        e1Var2 = e1Var3;
                        lVar4 = lVar12;
                        l3Var2 = l3Var3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z26 = z17;
                        qVar2 = qVar;
                        z27 = z18;
                        keyboardOptions2 = keyboardOptionsA;
                        z28 = z19;
                        textStyle2 = textStyleA;
                        mVar3 = mVar2;
                        e1Var2 = e1Var;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    i86 = i15;
                    i87 = i16;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE4 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE4);
                        objE2 = a3VarE4;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar13 = lVar8;
                    objE3 = rVarH.E();
                    m mVar8 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG4 = keyboardOptions3.g(z35);
                    boolean z314 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions7 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i912 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z315 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar8, textStyle3, e1Var3, lVar13, lVar9, cVar3, z314, i97, i96, imeOptionsG4, l3Var3, z315, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i912) | (458752 & i912) | (3670016 & i912) | (i912 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z315;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions7;
                    z26 = z35;
                    mVar3 = mVar8;
                    e1Var2 = e1Var3;
                    lVar4 = lVar13;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 3072;
            z18 = z15;
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    z19 = z16;
                    if (rVarH.a(z19)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                i37 = PKIFailureInfo.unsupportedVersion;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        } else {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            a3 a3VarE5 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                            rVarH.v(a3VarE5);
                            objE2 = a3VarE5;
                        }
                        a3Var = (a3) objE2;
                        textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                        zW = rVarH.W(textFieldValueH);
                        l<? super TextLayoutResult, i0> lVar14 = lVar8;
                        objE3 = rVarH.E();
                        m mVar9 = mVar4;
                        if (zW) {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        p076m2.Function0.g((er.a) objE3, rVarH, 0);
                        if ((i95 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objE4 = rVarH.E();
                        if (z37) {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        } else {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        }
                        a3Var2 = (a3) objE4;
                        ImeOptions imeOptionsG5 = keyboardOptions3.g(z35);
                        boolean z316 = !z35;
                        if (z35) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if (z35) {
                            i97 = 1;
                        } else {
                            i97 = i15;
                        }
                        KeyboardOptions keyboardOptions8 = keyboardOptions3;
                        zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                        objE5 = rVarH.E();
                        if (zW2) {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        int i913 = i85 << 9;
                        rVar2 = rVarH;
                        boolean z317 = z18;
                        j2.w(textFieldValueH, (l) objE5, mVar9, textStyle3, e1Var3, lVar14, lVar9, cVar3, z316, i97, i96, imeOptionsG5, l3Var3, z317, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i913) | (458752 & i913) | (3670016 & i913) | (i913 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        textStyle2 = textStyle3;
                        lVar5 = lVar9;
                        cVar2 = cVar3;
                        z27 = z317;
                        z28 = z36;
                        qVar2 = qVarF;
                        keyboardOptions2 = keyboardOptions8;
                        z26 = z35;
                        mVar3 = mVar9;
                        e1Var2 = e1Var3;
                        lVar4 = lVar14;
                        l3Var2 = l3Var3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z26 = z17;
                        qVar2 = qVar;
                        z27 = z18;
                        keyboardOptions2 = keyboardOptionsA;
                        z28 = z19;
                        textStyle2 = textStyleA;
                        mVar3 = mVar2;
                        e1Var2 = e1Var;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    i86 = i15;
                    i87 = i16;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE6 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE6);
                        objE2 = a3VarE6;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar15 = lVar8;
                    objE3 = rVarH.E();
                    m mVar10 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG6 = keyboardOptions3.g(z35);
                    boolean z318 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions9 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i914 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z319 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar10, textStyle3, e1Var3, lVar15, lVar9, cVar3, z318, i97, i96, imeOptionsG6, l3Var3, z319, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i914) | (458752 & i914) | (3670016 & i914) | (i914 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z319;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions9;
                    z26 = z35;
                    mVar3 = mVar10;
                    e1Var2 = e1Var3;
                    lVar4 = lVar15;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            z19 = z16;
            i36 = i19 & 32;
            i37 = PKIFailureInfo.unsupportedVersion;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE7 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE7);
                        objE2 = a3VarE7;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar16 = lVar8;
                    objE3 = rVarH.E();
                    m mVar11 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG7 = keyboardOptions3.g(z35);
                    boolean z3110 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions10 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i915 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z3111 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar11, textStyle3, e1Var3, lVar16, lVar9, cVar3, z3110, i97, i96, imeOptionsG7, l3Var3, z3111, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i915) | (458752 & i915) | (3670016 & i915) | (i915 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z3111;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions10;
                    z26 = z35;
                    mVar3 = mVar11;
                    e1Var2 = e1Var3;
                    lVar4 = lVar16;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                } else {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    a3 a3VarE8 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                    rVarH.v(a3VarE8);
                    objE2 = a3VarE8;
                }
                a3Var = (a3) objE2;
                textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                zW = rVarH.W(textFieldValueH);
                l<? super TextLayoutResult, i0> lVar17 = lVar8;
                objE3 = rVarH.E();
                m mVar12 = mVar4;
                if (zW) {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                }
                p076m2.Function0.g((er.a) objE3, rVarH, 0);
                if ((i95 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objE4 = rVarH.E();
                if (z37) {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                } else {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                }
                a3Var2 = (a3) objE4;
                ImeOptions imeOptionsG8 = keyboardOptions3.g(z35);
                boolean z3112 = !z35;
                if (z35) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if (z35) {
                    i97 = 1;
                } else {
                    i97 = i15;
                }
                KeyboardOptions keyboardOptions11 = keyboardOptions3;
                zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                objE5 = rVarH.E();
                if (zW2) {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                int i916 = i85 << 9;
                rVar2 = rVarH;
                boolean z3113 = z18;
                j2.w(textFieldValueH, (l) objE5, mVar12, textStyle3, e1Var3, lVar17, lVar9, cVar3, z3112, i97, i96, imeOptionsG8, l3Var3, z3113, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i916) | (458752 & i916) | (3670016 & i916) | (i916 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                textStyle2 = textStyle3;
                lVar5 = lVar9;
                cVar2 = cVar3;
                z27 = z3113;
                z28 = z36;
                qVar2 = qVarF;
                keyboardOptions2 = keyboardOptions11;
                z26 = z35;
                mVar3 = mVar12;
                e1Var2 = e1Var3;
                lVar4 = lVar17;
                l3Var2 = l3Var3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z26 = z17;
                qVar2 = qVar;
                z27 = z18;
                keyboardOptions2 = keyboardOptionsA;
                z28 = z19;
                textStyle2 = textStyleA;
                mVar3 = mVar2;
                e1Var2 = e1Var;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            i86 = i15;
            i87 = i16;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i26 = i19 & 8;
        if (i26 != 0) {
            if ((i17 & 3072) == 0) {
                z18 = z15;
                if (rVarH.a(z18)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i25 |= i27;
            }
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    z19 = z16;
                    if (rVarH.a(z19)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                i37 = PKIFailureInfo.unsupportedVersion;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (!rVarH.G(qVar)) {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        } else {
                            if (i98 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.q
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.j((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l3Var3 = l3VarA;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                qVarF = e1.f130009a.f();
                            } else {
                                qVarF = qVar;
                            }
                            z35 = z29;
                            i15 = i88;
                            i16 = i89;
                            z36 = z19;
                            textStyle3 = textStyleA;
                            mVar4 = mVar2;
                            e1Var3 = e1VarC;
                            cVar3 = solidColor;
                            i95 = i25;
                            keyboardOptions3 = keyboardOptionsA;
                            lVar8 = lVar6;
                            lVar9 = lVar7;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            a3 a3VarE9 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                            rVarH.v(a3VarE9);
                            objE2 = a3VarE9;
                        }
                        a3Var = (a3) objE2;
                        textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                        zW = rVarH.W(textFieldValueH);
                        l<? super TextLayoutResult, i0> lVar18 = lVar8;
                        objE3 = rVarH.E();
                        m mVar13 = mVar4;
                        if (zW) {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: n1.r
                                @Override // er.a
                                public final Object a() {
                                    return u.m(textFieldValueH, a3Var);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        p076m2.Function0.g((er.a) objE3, rVarH, 0);
                        if ((i95 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objE4 = rVarH.E();
                        if (z37) {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        } else {
                            objE4 = c6.e(str, null, 2, null);
                            rVarH.v(objE4);
                        }
                        a3Var2 = (a3) objE4;
                        ImeOptions imeOptionsG9 = keyboardOptions3.g(z35);
                        boolean z3114 = !z35;
                        if (z35) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if (z35) {
                            i97 = 1;
                        } else {
                            i97 = i15;
                        }
                        KeyboardOptions keyboardOptions12 = keyboardOptions3;
                        zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                        objE5 = rVarH.E();
                        if (zW2) {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new l() { // from class: n1.s
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        int i917 = i85 << 9;
                        rVar2 = rVarH;
                        boolean z3115 = z18;
                        j2.w(textFieldValueH, (l) objE5, mVar13, textStyle3, e1Var3, lVar18, lVar9, cVar3, z3114, i97, i96, imeOptionsG9, l3Var3, z3115, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i917) | (458752 & i917) | (3670016 & i917) | (i917 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        textStyle2 = textStyle3;
                        lVar5 = lVar9;
                        cVar2 = cVar3;
                        z27 = z3115;
                        z28 = z36;
                        qVar2 = qVarF;
                        keyboardOptions2 = keyboardOptions12;
                        z26 = z35;
                        mVar3 = mVar13;
                        e1Var2 = e1Var3;
                        lVar4 = lVar18;
                        l3Var2 = l3Var3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        z26 = z17;
                        qVar2 = qVar;
                        z27 = z18;
                        keyboardOptions2 = keyboardOptionsA;
                        z28 = z19;
                        textStyle2 = textStyleA;
                        mVar3 = mVar2;
                        e1Var2 = e1Var;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    i86 = i15;
                    i87 = i16;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE10 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE10);
                        objE2 = a3VarE10;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar19 = lVar8;
                    objE3 = rVarH.E();
                    m mVar14 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG10 = keyboardOptions3.g(z35);
                    boolean z3116 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions13 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i918 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z3117 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar14, textStyle3, e1Var3, lVar19, lVar9, cVar3, z3116, i97, i96, imeOptionsG10, l3Var3, z3117, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i918) | (458752 & i918) | (3670016 & i918) | (i918 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z3117;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions13;
                    z26 = z35;
                    mVar3 = mVar14;
                    e1Var2 = e1Var3;
                    lVar4 = lVar19;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            z19 = z16;
            i36 = i19 & 32;
            i37 = PKIFailureInfo.unsupportedVersion;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE11 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE11);
                        objE2 = a3VarE11;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar110 = lVar8;
                    objE3 = rVarH.E();
                    m mVar15 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG11 = keyboardOptions3.g(z35);
                    boolean z3118 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions14 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i919 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z3119 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar15, textStyle3, e1Var3, lVar110, lVar9, cVar3, z3118, i97, i96, imeOptionsG11, l3Var3, z3119, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i919) | (458752 & i919) | (3670016 & i919) | (i919 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z3119;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions14;
                    z26 = z35;
                    mVar3 = mVar15;
                    e1Var2 = e1Var3;
                    lVar4 = lVar110;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                } else {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    a3 a3VarE12 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                    rVarH.v(a3VarE12);
                    objE2 = a3VarE12;
                }
                a3Var = (a3) objE2;
                textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                zW = rVarH.W(textFieldValueH);
                l<? super TextLayoutResult, i0> lVar111 = lVar8;
                objE3 = rVarH.E();
                m mVar16 = mVar4;
                if (zW) {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                }
                p076m2.Function0.g((er.a) objE3, rVarH, 0);
                if ((i95 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objE4 = rVarH.E();
                if (z37) {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                } else {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                }
                a3Var2 = (a3) objE4;
                ImeOptions imeOptionsG12 = keyboardOptions3.g(z35);
                boolean z31110 = !z35;
                if (z35) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if (z35) {
                    i97 = 1;
                } else {
                    i97 = i15;
                }
                KeyboardOptions keyboardOptions15 = keyboardOptions3;
                zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                objE5 = rVarH.E();
                if (zW2) {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                int i9110 = i85 << 9;
                rVar2 = rVarH;
                boolean z31111 = z18;
                j2.w(textFieldValueH, (l) objE5, mVar16, textStyle3, e1Var3, lVar111, lVar9, cVar3, z31110, i97, i96, imeOptionsG12, l3Var3, z31111, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i9110) | (458752 & i9110) | (3670016 & i9110) | (i9110 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                textStyle2 = textStyle3;
                lVar5 = lVar9;
                cVar2 = cVar3;
                z27 = z31111;
                z28 = z36;
                qVar2 = qVarF;
                keyboardOptions2 = keyboardOptions15;
                z26 = z35;
                mVar3 = mVar16;
                e1Var2 = e1Var3;
                lVar4 = lVar111;
                l3Var2 = l3Var3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z26 = z17;
                qVar2 = qVar;
                z27 = z18;
                keyboardOptions2 = keyboardOptionsA;
                z28 = z19;
                textStyle2 = textStyleA;
                mVar3 = mVar2;
                e1Var2 = e1Var;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            i86 = i15;
            i87 = i16;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 3072;
        z18 = z15;
        i28 = i19 & 16;
        i29 = PKIFailureInfo.certRevoked;
        if (i28 != 0) {
            if ((i17 & 24576) == 0) {
                z19 = z16;
                if (rVarH.a(z19)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i25 |= i35;
            }
            i36 = i19 & 32;
            i37 = PKIFailureInfo.unsupportedVersion;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (!rVarH.G(qVar)) {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    } else {
                        if (i98 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.j((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l3Var3 = l3VarA;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            qVarF = e1.f130009a.f();
                        } else {
                            qVarF = qVar;
                        }
                        z35 = z29;
                        i15 = i88;
                        i16 = i89;
                        z36 = z19;
                        textStyle3 = textStyleA;
                        mVar4 = mVar2;
                        e1Var3 = e1VarC;
                        cVar3 = solidColor;
                        i95 = i25;
                        keyboardOptions3 = keyboardOptionsA;
                        lVar8 = lVar6;
                        lVar9 = lVar7;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        a3 a3VarE13 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                        rVarH.v(a3VarE13);
                        objE2 = a3VarE13;
                    }
                    a3Var = (a3) objE2;
                    textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                    zW = rVarH.W(textFieldValueH);
                    l<? super TextLayoutResult, i0> lVar112 = lVar8;
                    objE3 = rVarH.E();
                    m mVar17 = mVar4;
                    if (zW) {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: n1.r
                            @Override // er.a
                            public final Object a() {
                                return u.m(textFieldValueH, a3Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    p076m2.Function0.g((er.a) objE3, rVarH, 0);
                    if ((i95 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objE4 = rVarH.E();
                    if (z37) {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    } else {
                        objE4 = c6.e(str, null, 2, null);
                        rVarH.v(objE4);
                    }
                    a3Var2 = (a3) objE4;
                    ImeOptions imeOptionsG13 = keyboardOptions3.g(z35);
                    boolean z31112 = !z35;
                    if (z35) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if (z35) {
                        i97 = 1;
                    } else {
                        i97 = i15;
                    }
                    KeyboardOptions keyboardOptions16 = keyboardOptions3;
                    zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                    objE5 = rVarH.E();
                    if (zW2) {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new l() { // from class: n1.s
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    int i9111 = i85 << 9;
                    rVar2 = rVarH;
                    boolean z31113 = z18;
                    j2.w(textFieldValueH, (l) objE5, mVar17, textStyle3, e1Var3, lVar112, lVar9, cVar3, z31112, i97, i96, imeOptionsG13, l3Var3, z31113, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i9111) | (458752 & i9111) | (3670016 & i9111) | (i9111 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    textStyle2 = textStyle3;
                    lVar5 = lVar9;
                    cVar2 = cVar3;
                    z27 = z31113;
                    z28 = z36;
                    qVar2 = qVarF;
                    keyboardOptions2 = keyboardOptions16;
                    z26 = z35;
                    mVar3 = mVar17;
                    e1Var2 = e1Var3;
                    lVar4 = lVar112;
                    l3Var2 = l3Var3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    z26 = z17;
                    qVar2 = qVar;
                    z27 = z18;
                    keyboardOptions2 = keyboardOptionsA;
                    z28 = z19;
                    textStyle2 = textStyleA;
                    mVar3 = mVar2;
                    e1Var2 = e1Var;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                i86 = i15;
                i87 = i16;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                } else {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    a3 a3VarE14 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                    rVarH.v(a3VarE14);
                    objE2 = a3VarE14;
                }
                a3Var = (a3) objE2;
                textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                zW = rVarH.W(textFieldValueH);
                l<? super TextLayoutResult, i0> lVar113 = lVar8;
                objE3 = rVarH.E();
                m mVar18 = mVar4;
                if (zW) {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                }
                p076m2.Function0.g((er.a) objE3, rVarH, 0);
                if ((i95 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objE4 = rVarH.E();
                if (z37) {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                } else {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                }
                a3Var2 = (a3) objE4;
                ImeOptions imeOptionsG14 = keyboardOptions3.g(z35);
                boolean z31114 = !z35;
                if (z35) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if (z35) {
                    i97 = 1;
                } else {
                    i97 = i15;
                }
                KeyboardOptions keyboardOptions17 = keyboardOptions3;
                zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                objE5 = rVarH.E();
                if (zW2) {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                int i9112 = i85 << 9;
                rVar2 = rVarH;
                boolean z31115 = z18;
                j2.w(textFieldValueH, (l) objE5, mVar18, textStyle3, e1Var3, lVar113, lVar9, cVar3, z31114, i97, i96, imeOptionsG14, l3Var3, z31115, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i9112) | (458752 & i9112) | (3670016 & i9112) | (i9112 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                textStyle2 = textStyle3;
                lVar5 = lVar9;
                cVar2 = cVar3;
                z27 = z31115;
                z28 = z36;
                qVar2 = qVarF;
                keyboardOptions2 = keyboardOptions17;
                z26 = z35;
                mVar3 = mVar18;
                e1Var2 = e1Var3;
                lVar4 = lVar113;
                l3Var2 = l3Var3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z26 = z17;
                qVar2 = qVar;
                z27 = z18;
                keyboardOptions2 = keyboardOptionsA;
                z28 = z19;
                textStyle2 = textStyleA;
                mVar3 = mVar2;
                e1Var2 = e1Var;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            i86 = i15;
            i87 = i16;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 24576;
        z19 = z16;
        i36 = i19 & 32;
        i37 = PKIFailureInfo.unsupportedVersion;
        if (i36 != 0) {
            i25 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i17 & 196608) == 0) {
                if (rVarH.W(textStyleA)) {
                    i38 = 131072;
                } else {
                    i38 = PKIFailureInfo.notAuthorized;
                }
                i25 |= i38;
            }
        }
        i39 = i19 & 64;
        if (i39 != 0) {
            i25 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i17 & 1572864) == 0) {
                if (rVarH.W(keyboardOptionsA)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i25 |= i45;
            }
        }
        i46 = i19 & 128;
        if (i46 != 0) {
            i25 |= 12582912;
            l3Var2 = l3Var;
        } else {
            l3Var2 = l3Var;
            if ((i17 & 12582912) == 0) {
                if (rVarH.W(l3Var2)) {
                    i47 = 8388608;
                } else {
                    i47 = 4194304;
                }
                i25 |= i47;
            }
        }
        i48 = i19 & 256;
        if (i48 != 0) {
            i25 |= 100663296;
        } else if ((i17 & 100663296) == 0) {
            if (rVarH.a(z17)) {
                i49 = 67108864;
            } else {
                i49 = 33554432;
            }
            i25 |= i49;
        }
        if ((i17 & 805306368) != 0) {
            i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        i55 = i19 & 1024;
        if (i55 != 0) {
            i56 = i18 | 6;
        } else if ((i18 & 6) == 0) {
            if (rVarH.c(i16)) {
                i57 = 4;
            } else {
                i57 = 2;
            }
            i56 = i18 | i57;
        } else {
            i56 = i18;
        }
        i58 = i19 & 2048;
        if (i58 != 0) {
            i56 |= 48;
        } else if ((i18 & 48) != 0) {
            if (rVarH.W(e1Var)) {
                i59 = 32;
            } else {
                i59 = 16;
            }
            i56 |= i59;
        }
        i65 = i56;
        i66 = i19 & PKIFailureInfo.certConfirmed;
        if (i66 != 0) {
            i67 = i65 | MLKEMEngine.KyberPolyBytes;
        } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(lVar2)) {
                i68 = 256;
            } else {
                i68 = 128;
            }
            i67 = i65 | i68;
        } else {
            i67 = i65;
        }
        i69 = i19 & PKIFailureInfo.certRevoked;
        if (i69 != 0) {
            i76 = i67 | 3072;
        } else {
            i75 = i67;
            if ((i18 & 3072) == 0) {
                i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
            } else {
                i76 = i75;
            }
        }
        i77 = i19 & 16384;
        if (i77 != 0) {
            i78 = i76;
            if ((i18 & 24576) == 0) {
                if (rVarH.W(cVar)) {
                    i29 = 16384;
                }
                i78 |= i29;
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (!rVarH.G(qVar)) {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                } else {
                    if (i98 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.q
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.j((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l3Var3 = l3VarA;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        qVarF = e1.f130009a.f();
                    } else {
                        qVarF = qVar;
                    }
                    z35 = z29;
                    i15 = i88;
                    i16 = i89;
                    z36 = z19;
                    textStyle3 = textStyleA;
                    mVar4 = mVar2;
                    e1Var3 = e1VarC;
                    cVar3 = solidColor;
                    i95 = i25;
                    keyboardOptions3 = keyboardOptionsA;
                    lVar8 = lVar6;
                    lVar9 = lVar7;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    a3 a3VarE15 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                    rVarH.v(a3VarE15);
                    objE2 = a3VarE15;
                }
                a3Var = (a3) objE2;
                textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
                zW = rVarH.W(textFieldValueH);
                l<? super TextLayoutResult, i0> lVar114 = lVar8;
                objE3 = rVarH.E();
                m mVar19 = mVar4;
                if (zW) {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: n1.r
                        @Override // er.a
                        public final Object a() {
                            return u.m(textFieldValueH, a3Var);
                        }
                    };
                    rVarH.v(objE3);
                }
                p076m2.Function0.g((er.a) objE3, rVarH, 0);
                if ((i95 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objE4 = rVarH.E();
                if (z37) {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                } else {
                    objE4 = c6.e(str, null, 2, null);
                    rVarH.v(objE4);
                }
                a3Var2 = (a3) objE4;
                ImeOptions imeOptionsG15 = keyboardOptions3.g(z35);
                boolean z31116 = !z35;
                if (z35) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if (z35) {
                    i97 = 1;
                } else {
                    i97 = i15;
                }
                KeyboardOptions keyboardOptions18 = keyboardOptions3;
                zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
                objE5 = rVarH.E();
                if (zW2) {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new l() { // from class: n1.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                int i9113 = i85 << 9;
                rVar2 = rVarH;
                boolean z31117 = z18;
                j2.w(textFieldValueH, (l) objE5, mVar19, textStyle3, e1Var3, lVar114, lVar9, cVar3, z31116, i97, i96, imeOptionsG15, l3Var3, z31117, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i9113) | (458752 & i9113) | (3670016 & i9113) | (i9113 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                textStyle2 = textStyle3;
                lVar5 = lVar9;
                cVar2 = cVar3;
                z27 = z31117;
                z28 = z36;
                qVar2 = qVarF;
                keyboardOptions2 = keyboardOptions18;
                z26 = z35;
                mVar3 = mVar19;
                e1Var2 = e1Var3;
                lVar4 = lVar114;
                l3Var2 = l3Var3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z26 = z17;
                qVar2 = qVar;
                z27 = z18;
                keyboardOptions2 = keyboardOptionsA;
                z28 = z19;
                textStyle2 = textStyleA;
                mVar3 = mVar2;
                e1Var2 = e1Var;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            i86 = i15;
            i87 = i16;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i78 = i76 | 24576;
        i79 = i19 & 32768;
        if (i79 != 0) {
            i78 |= 196608;
        } else if ((i18 & 196608) == 0) {
            if (!rVarH.G(qVar)) {
                i37 = PKIFailureInfo.notAuthorized;
            }
            i78 |= i37;
        }
        i85 = i78;
        if ((i25 & 306783379) == 306783378) {
            z25 = true;
        } else {
            z25 = true;
        }
        if (rVarH.r(z25, i25 & 1)) {
            rVarH.I();
            if ((i17 & 1) != 0) {
                if (i98 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i36 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i39 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i46 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var2;
                }
                if (i48 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if ((i19 & 512) != 0) {
                    if (z29) {
                        i88 = 1;
                    } else {
                        i88 = Integer.MAX_VALUE;
                    }
                    i25 &= -1879048193;
                } else {
                    i88 = i15;
                }
                if (i55 != 0) {
                    i89 = 1;
                } else {
                    i89 = i16;
                }
                if (i58 != 0) {
                    e1VarC = e1.INSTANCE.c();
                } else {
                    e1VarC = e1Var;
                }
                if (i66 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.q
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.j((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar6 = (l) objE;
                } else {
                    lVar6 = lVar2;
                }
                if (i69 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                l3Var3 = l3VarA;
                if (i77 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                } else {
                    solidColor = cVar;
                }
                if (i79 != 0) {
                    qVarF = e1.f130009a.f();
                } else {
                    qVarF = qVar;
                }
                z35 = z29;
                i15 = i88;
                i16 = i89;
                z36 = z19;
                textStyle3 = textStyleA;
                mVar4 = mVar2;
                e1Var3 = e1VarC;
                cVar3 = solidColor;
                i95 = i25;
                keyboardOptions3 = keyboardOptionsA;
                lVar8 = lVar6;
                lVar9 = lVar7;
            } else {
                if (i98 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i36 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i39 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i46 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var2;
                }
                if (i48 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if ((i19 & 512) != 0) {
                    if (z29) {
                        i88 = 1;
                    } else {
                        i88 = Integer.MAX_VALUE;
                    }
                    i25 &= -1879048193;
                } else {
                    i88 = i15;
                }
                if (i55 != 0) {
                    i89 = 1;
                } else {
                    i89 = i16;
                }
                if (i58 != 0) {
                    e1VarC = e1.INSTANCE.c();
                } else {
                    e1VarC = e1Var;
                }
                if (i66 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.q
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.j((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar6 = (l) objE;
                } else {
                    lVar6 = lVar2;
                }
                if (i69 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                l3Var3 = l3VarA;
                if (i77 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                } else {
                    solidColor = cVar;
                }
                if (i79 != 0) {
                    qVarF = e1.f130009a.f();
                } else {
                    qVarF = qVar;
                }
                z35 = z29;
                i15 = i88;
                i16 = i89;
                z36 = z19;
                textStyle3 = textStyleA;
                mVar4 = mVar2;
                e1Var3 = e1VarC;
                cVar3 = solidColor;
                i95 = i25;
                keyboardOptions3 = keyboardOptionsA;
                lVar8 = lVar6;
                lVar9 = lVar7;
            }
            rVarH.y();
            if (t.k()) {
                t.o(2026950908, i95, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:777)");
            }
            objE2 = rVarH.E();
            companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                a3 a3VarE16 = c6.e(new TextFieldValue(str, 0L, (z3) null, 6, (k) null), null, 2, null);
                rVarH.v(a3VarE16);
                objE2 = a3VarE16;
            }
            a3Var = (a3) objE2;
            textFieldValueH = TextFieldValue.h(k(a3Var), str, 0L, null, 6, null);
            zW = rVarH.W(textFieldValueH);
            l<? super TextLayoutResult, i0> lVar115 = lVar8;
            objE3 = rVarH.E();
            m mVar110 = mVar4;
            if (zW) {
                objE3 = new er.a() { // from class: n1.r
                    @Override // er.a
                    public final Object a() {
                        return u.m(textFieldValueH, a3Var);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: n1.r
                    @Override // er.a
                    public final Object a() {
                        return u.m(textFieldValueH, a3Var);
                    }
                };
                rVarH.v(objE3);
            }
            p076m2.Function0.g((er.a) objE3, rVarH, 0);
            if ((i95 & 14) == 4) {
                z37 = true;
            } else {
                z37 = false;
            }
            objE4 = rVarH.E();
            if (z37) {
                objE4 = c6.e(str, null, 2, null);
                rVarH.v(objE4);
            } else {
                objE4 = c6.e(str, null, 2, null);
                rVarH.v(objE4);
            }
            a3Var2 = (a3) objE4;
            ImeOptions imeOptionsG16 = keyboardOptions3.g(z35);
            boolean z31118 = !z35;
            if (z35) {
                i96 = 1;
            } else {
                i96 = i16;
            }
            if (z35) {
                i97 = 1;
            } else {
                i97 = i15;
            }
            KeyboardOptions keyboardOptions19 = keyboardOptions3;
            zW2 = rVarH.W(a3Var2) | ((i95 & 112) == 32);
            objE5 = rVarH.E();
            if (zW2) {
                objE5 = new l() { // from class: n1.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                    }
                };
                rVarH.v(objE5);
            } else {
                objE5 = new l() { // from class: n1.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.p(lVar, a3Var, a3Var2, (TextFieldValue) obj);
                    }
                };
                rVarH.v(objE5);
            }
            int i9114 = i85 << 9;
            rVar2 = rVarH;
            boolean z31119 = z18;
            j2.w(textFieldValueH, (l) objE5, mVar110, textStyle3, e1Var3, lVar115, lVar9, cVar3, z31118, i97, i96, imeOptionsG16, l3Var3, z31119, z36, qVarF, null, rVar2, (i95 & 896) | ((i95 >> 6) & 7168) | (57344 & i9114) | (458752 & i9114) | (3670016 & i9114) | (i9114 & 29360128), ((i95 >> 15) & 896) | (i95 & 7168) | (57344 & i95) | (i85 & 458752), PKIFailureInfo.notAuthorized);
            if (t.k()) {
                t.n();
            }
            textStyle2 = textStyle3;
            lVar5 = lVar9;
            cVar2 = cVar3;
            z27 = z31119;
            z28 = z36;
            qVar2 = qVarF;
            keyboardOptions2 = keyboardOptions19;
            z26 = z35;
            mVar3 = mVar110;
            e1Var2 = e1Var3;
            lVar4 = lVar115;
            l3Var2 = l3Var3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            z26 = z17;
            qVar2 = qVar;
            z27 = z18;
            keyboardOptions2 = keyboardOptionsA;
            z28 = z19;
            textStyle2 = textStyleA;
            mVar3 = mVar2;
            e1Var2 = e1Var;
            lVar4 = lVar2;
            lVar5 = lVar3;
            cVar2 = cVar;
        }
        i86 = i15;
        i87 = i16;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.q(str, lVar, mVar3, z27, z28, textStyle2, keyboardOptions2, l3Var2, z26, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x0222  */
    /* JADX WARN: Code duplicated, block: B:176:0x0229  */
    /* JADX WARN: Code duplicated, block: B:183:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0256  */
    /* JADX WARN: Code duplicated, block: B:186:0x025b  */
    /* JADX WARN: Code duplicated, block: B:188:0x025f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0263  */
    /* JADX WARN: Code duplicated, block: B:192:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0275  */
    /* JADX WARN: Code duplicated, block: B:195:0x027c  */
    /* JADX WARN: Code duplicated, block: B:197:0x027f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0282  */
    /* JADX WARN: Code duplicated, block: B:201:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x028a  */
    /* JADX WARN: Code duplicated, block: B:203:0x028d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0295  */
    /* JADX WARN: Code duplicated, block: B:207:0x0299  */
    /* JADX WARN: Code duplicated, block: B:208:0x029c  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:229:0x030b  */
    /* JADX WARN: Code duplicated, block: B:232:0x032b  */
    /* JADX WARN: Code duplicated, block: B:234:0x033a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0346  */
    /* JADX WARN: Code duplicated, block: B:238:0x0349  */
    /* JADX WARN: Code duplicated, block: B:241:0x034f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0352  */
    /* JADX WARN: Code duplicated, block: B:245:0x035d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0360  */
    /* JADX WARN: Code duplicated, block: B:249:0x036a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0374  */
    /* JADX WARN: Code duplicated, block: B:254:0x037c  */
    /* JADX WARN: Code duplicated, block: B:257:0x03df  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:262:0x0417  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120 A[ADDED_TO_REGION] */
    public static final void i(final TextFieldValue textFieldValue, final l<? super TextFieldValue, i0> lVar, m mVar, boolean z15, boolean z16, TextStyle textStyle, KeyboardOptions keyboardOptions, l3 l3Var, boolean z17, int i15, int i16, e1 e1Var, l<? super TextLayoutResult, i0> lVar2, b1.l lVar3, c cVar, q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar, r rVar, final int i17, final int i18, final int i19) {
        int i25;
        m mVar2;
        int i26;
        boolean z18;
        int i27;
        int i28;
        int i29;
        boolean z19;
        int i35;
        int i36;
        int i37;
        TextStyle textStyleA;
        int i38;
        int i39;
        KeyboardOptions keyboardOptionsA;
        int i45;
        int i46;
        l3 l3Var2;
        int i47;
        int i48;
        int i49;
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
        boolean z25;
        r rVar2;
        final int i86;
        final e1 e1Var2;
        final q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar2;
        final boolean z26;
        final l3 l3Var3;
        final boolean z27;
        final TextStyle textStyle2;
        final KeyboardOptions keyboardOptions2;
        final m mVar3;
        final boolean z28;
        final int i87;
        final l<? super TextLayoutResult, i0> lVar4;
        final b1.l lVar5;
        final c cVar2;
        d5 d5VarM;
        l3 l3VarA;
        boolean z29;
        int i88;
        int i89;
        e1 e1VarC;
        l3 l3Var4;
        l<? super TextLayoutResult, i0> lVar6;
        b1.l lVar7;
        c solidColor;
        boolean z35;
        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVarE;
        boolean z36;
        l<? super TextLayoutResult, i0> lVar8;
        Object objE;
        int i95;
        int i96;
        boolean z37;
        boolean z38;
        Object objE2;
        r rVarH = rVar.h(-971111025);
        if ((i17 & 6) == 0) {
            i25 = (rVarH.W(textFieldValue) ? 4 : 2) | i17;
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i97 = i19 & 4;
        if (i97 == 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i25 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i26 = i19 & 8;
            if (i26 != 0) {
                if ((i17 & 3072) == 0) {
                    z18 = z15;
                    if (rVarH.a(z18)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i19 & 16;
                i29 = PKIFailureInfo.certRevoked;
                if (i28 != 0) {
                    if ((i17 & 24576) == 0) {
                        z19 = z16;
                        if (rVarH.a(z19)) {
                            i35 = 16384;
                        } else {
                            i35 = 8192;
                        }
                        i25 |= i35;
                    }
                    i36 = i19 & 32;
                    i37 = PKIFailureInfo.notAuthorized;
                    if (i36 != 0) {
                        i25 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.W(textStyleA)) {
                                i38 = 131072;
                            } else {
                                i38 = 65536;
                            }
                            i25 |= i38;
                        }
                    }
                    i39 = i19 & 64;
                    if (i39 != 0) {
                        i25 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i17 & 1572864) == 0) {
                            if (rVarH.W(keyboardOptionsA)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i45 = PKIFailureInfo.signerNotTrusted;
                            }
                            i25 |= i45;
                        }
                    }
                    i46 = i19 & 128;
                    if (i46 != 0) {
                        i25 |= 12582912;
                        l3Var2 = l3Var;
                    } else {
                        l3Var2 = l3Var;
                        if ((i17 & 12582912) == 0) {
                            if (rVarH.W(l3Var2)) {
                                i47 = 8388608;
                            } else {
                                i47 = 4194304;
                            }
                            i25 |= i47;
                        }
                    }
                    i48 = i19 & 256;
                    if (i48 != 0) {
                        i25 |= 100663296;
                    } else if ((i17 & 100663296) == 0) {
                        if (rVarH.a(z17)) {
                            i49 = 67108864;
                        } else {
                            i49 = 33554432;
                        }
                        i25 |= i49;
                    }
                    if ((i17 & 805306368) != 0) {
                        i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    i55 = i19 & 1024;
                    if (i55 != 0) {
                        i56 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i18 | i57;
                    } else {
                        i56 = i18;
                    }
                    i58 = i19 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i18 & 48) != 0) {
                        if (rVarH.W(e1Var)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    i66 = i19 & PKIFailureInfo.certConfirmed;
                    if (i66 != 0) {
                        i67 = i65 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.G(lVar2)) {
                            i68 = 256;
                        } else {
                            i68 = 128;
                        }
                        i67 = i65 | i68;
                    } else {
                        i67 = i65;
                    }
                    i69 = i19 & PKIFailureInfo.certRevoked;
                    if (i69 != 0) {
                        i76 = i67 | 3072;
                    } else {
                        i75 = i67;
                        if ((i18 & 3072) == 0) {
                            i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                        } else {
                            i76 = i75;
                        }
                    }
                    i77 = i19 & 16384;
                    if (i77 != 0) {
                        i78 = i76;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.W(cVar)) {
                                i29 = 16384;
                            }
                            i78 |= i29;
                        }
                        i79 = i19 & 32768;
                        if (i79 != 0) {
                            i78 |= 196608;
                        } else if ((i18 & 196608) == 0) {
                            if (rVarH.G(qVar)) {
                                i37 = 131072;
                            }
                            i78 |= i37;
                        }
                        i85 = i78;
                        if ((i25 & 306783379) == 306783378 || (74899 & i85) != 74898) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (rVarH.r(z25, i25 & 1)) {
                            rVarH.I();
                            if ((i17 & 1) != 0 || rVarH.Q()) {
                                if (i97 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i26 != 0) {
                                    z18 = true;
                                }
                                if (i28 != 0) {
                                    z19 = false;
                                }
                                if (i36 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i39 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i46 != 0) {
                                    l3VarA = l3.INSTANCE.a();
                                } else {
                                    l3VarA = l3Var2;
                                }
                                if (i48 != 0) {
                                    z29 = false;
                                } else {
                                    z29 = z17;
                                }
                                if ((i19 & 512) != 0) {
                                    if (z29) {
                                        i88 = 1;
                                    } else {
                                        i88 = Integer.MAX_VALUE;
                                    }
                                    i25 &= -1879048193;
                                } else {
                                    i88 = i15;
                                }
                                if (i55 != 0) {
                                    i89 = 1;
                                } else {
                                    i89 = i16;
                                }
                                if (i58 != 0) {
                                    e1VarC = e1.INSTANCE.c();
                                } else {
                                    e1VarC = e1Var;
                                }
                                l3Var4 = l3VarA;
                                if (i66 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new l() { // from class: n1.n
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return u.r((TextLayoutResult) obj);
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    lVar6 = (l) objE;
                                } else {
                                    lVar6 = lVar2;
                                }
                                if (i69 != 0) {
                                    lVar7 = null;
                                } else {
                                    lVar7 = lVar3;
                                }
                                l<? super TextLayoutResult, i0> lVar9 = lVar6;
                                if (i77 != 0) {
                                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                                } else {
                                    solidColor = cVar;
                                }
                                if (i79 != 0) {
                                    boolean z39 = z19;
                                    qVarE = e1.f130009a.e();
                                    z35 = z39;
                                } else {
                                    z35 = z19;
                                    qVarE = qVar;
                                }
                                z36 = z18;
                                lVar8 = lVar9;
                            } else {
                                rVarH.O();
                                if ((i19 & 512) != 0) {
                                    i25 &= -1879048193;
                                }
                                z29 = z17;
                                i88 = i15;
                                i89 = i16;
                                solidColor = cVar;
                                i25 = i25;
                                l3Var4 = l3Var2;
                                textStyleA = textStyleA;
                                keyboardOptionsA = keyboardOptionsA;
                                e1VarC = e1Var;
                                lVar7 = lVar3;
                                z36 = z18;
                                z35 = z19;
                                lVar8 = lVar2;
                                qVarE = qVar;
                            }
                            rVarH.y();
                            e1 e1Var3 = e1VarC;
                            if (t.k()) {
                                t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                            }
                            m mVar4 = mVar2;
                            q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar3 = qVarE;
                            ImeOptions imeOptionsG = keyboardOptionsA.g(z29);
                            boolean z45 = !z29;
                            c cVar3 = solidColor;
                            if (z29) {
                                i95 = 1;
                            } else {
                                i95 = i89;
                            }
                            b1.l lVar10 = lVar7;
                            if (z29) {
                                i96 = 1;
                            } else {
                                i96 = i88;
                            }
                            KeyboardOptions keyboardOptions3 = keyboardOptionsA;
                            if ((i25 & 14) == 4) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z37 | ((i25 & 112) == 32);
                            objE2 = rVarH.E();
                            if (z38 || objE2 == r.INSTANCE.a()) {
                                objE2 = new l() { // from class: n1.o
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            int i98 = i85 << 9;
                            int i99 = ((i25 >> 6) & 7168) | (i25 & 910) | (i98 & 57344) | (i98 & 458752) | (i98 & 3670016) | (i98 & 29360128);
                            int i100 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                            rVar2 = rVarH;
                            TextStyle textStyle3 = textStyleA;
                            boolean z46 = z29;
                            l<? super TextLayoutResult, i0> lVar11 = lVar8;
                            j2.w(textFieldValue, (l) objE2, mVar4, textStyle3, e1Var3, lVar11, lVar10, cVar3, z45, i96, i95, imeOptionsG, l3Var4, z36, z35, qVar3, null, rVar2, i99, i100, PKIFailureInfo.notAuthorized);
                            if (t.k()) {
                                t.n();
                            }
                            l3Var3 = l3Var4;
                            qVar2 = qVar3;
                            i86 = i88;
                            i87 = i89;
                            z28 = z46;
                            e1Var2 = e1Var3;
                            cVar2 = cVar3;
                            z26 = z36;
                            keyboardOptions2 = keyboardOptions3;
                            lVar4 = lVar11;
                            z27 = z35;
                            lVar5 = lVar10;
                            textStyle2 = textStyle3;
                            mVar3 = mVar4;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            i86 = i15;
                            e1Var2 = e1Var;
                            qVar2 = qVar;
                            z26 = z18;
                            l3Var3 = l3Var2;
                            z27 = z19;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            mVar3 = mVar2;
                            z28 = z17;
                            i87 = i16;
                            lVar4 = lVar2;
                            lVar5 = lVar3;
                            cVar2 = cVar;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: n1.p
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i78 = i76 | 24576;
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i37 = 131072;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar12 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z310 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z310;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar12;
                        } else {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar13 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z311 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z311;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar13;
                        }
                        rVarH.y();
                        e1 e1Var4 = e1VarC;
                        if (t.k()) {
                            t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                        }
                        m mVar5 = mVar2;
                        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar4 = qVarE;
                        ImeOptions imeOptionsG2 = keyboardOptionsA.g(z29);
                        boolean z47 = !z29;
                        c cVar4 = solidColor;
                        if (z29) {
                            i95 = 1;
                        } else {
                            i95 = i89;
                        }
                        b1.l lVar14 = lVar7;
                        if (z29) {
                            i96 = 1;
                        } else {
                            i96 = i88;
                        }
                        KeyboardOptions keyboardOptions4 = keyboardOptionsA;
                        if ((i25 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z37 | ((i25 & 112) == 32);
                        objE2 = rVarH.E();
                        if (z38) {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        int i910 = i85 << 9;
                        int i911 = ((i25 >> 6) & 7168) | (i25 & 910) | (i910 & 57344) | (i910 & 458752) | (i910 & 3670016) | (i910 & 29360128);
                        int i101 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                        rVar2 = rVarH;
                        TextStyle textStyle4 = textStyleA;
                        boolean z48 = z29;
                        l<? super TextLayoutResult, i0> lVar15 = lVar8;
                        j2.w(textFieldValue, (l) objE2, mVar5, textStyle4, e1Var4, lVar15, lVar14, cVar4, z47, i96, i95, imeOptionsG2, l3Var4, z36, z35, qVar4, null, rVar2, i911, i101, PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        l3Var3 = l3Var4;
                        qVar2 = qVar4;
                        i86 = i88;
                        i87 = i89;
                        z28 = z48;
                        e1Var2 = e1Var4;
                        cVar2 = cVar4;
                        z26 = z36;
                        keyboardOptions2 = keyboardOptions4;
                        lVar4 = lVar15;
                        z27 = z35;
                        lVar5 = lVar14;
                        textStyle2 = textStyle4;
                        mVar3 = mVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        i86 = i15;
                        e1Var2 = e1Var;
                        qVar2 = qVar;
                        z26 = z18;
                        l3Var3 = l3Var2;
                        z27 = z19;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        mVar3 = mVar2;
                        z28 = z17;
                        i87 = i16;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 24576;
                z19 = z16;
                i36 = i19 & 32;
                i37 = PKIFailureInfo.notAuthorized;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = 65536;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i37 = 131072;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar16 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z312 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z312;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar16;
                        } else {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar17 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z313 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z313;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar17;
                        }
                        rVarH.y();
                        e1 e1Var5 = e1VarC;
                        if (t.k()) {
                            t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                        }
                        m mVar6 = mVar2;
                        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar5 = qVarE;
                        ImeOptions imeOptionsG3 = keyboardOptionsA.g(z29);
                        boolean z49 = !z29;
                        c cVar5 = solidColor;
                        if (z29) {
                            i95 = 1;
                        } else {
                            i95 = i89;
                        }
                        b1.l lVar18 = lVar7;
                        if (z29) {
                            i96 = 1;
                        } else {
                            i96 = i88;
                        }
                        KeyboardOptions keyboardOptions5 = keyboardOptionsA;
                        if ((i25 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z37 | ((i25 & 112) == 32);
                        objE2 = rVarH.E();
                        if (z38) {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        int i912 = i85 << 9;
                        int i913 = ((i25 >> 6) & 7168) | (i25 & 910) | (i912 & 57344) | (i912 & 458752) | (i912 & 3670016) | (i912 & 29360128);
                        int i102 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                        rVar2 = rVarH;
                        TextStyle textStyle5 = textStyleA;
                        boolean z410 = z29;
                        l<? super TextLayoutResult, i0> lVar19 = lVar8;
                        j2.w(textFieldValue, (l) objE2, mVar6, textStyle5, e1Var5, lVar19, lVar18, cVar5, z49, i96, i95, imeOptionsG3, l3Var4, z36, z35, qVar5, null, rVar2, i913, i102, PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        l3Var3 = l3Var4;
                        qVar2 = qVar5;
                        i86 = i88;
                        i87 = i89;
                        z28 = z410;
                        e1Var2 = e1Var5;
                        cVar2 = cVar5;
                        z26 = z36;
                        keyboardOptions2 = keyboardOptions5;
                        lVar4 = lVar19;
                        z27 = z35;
                        lVar5 = lVar18;
                        textStyle2 = textStyle5;
                        mVar3 = mVar6;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        i86 = i15;
                        e1Var2 = e1Var;
                        qVar2 = qVar;
                        z26 = z18;
                        l3Var3 = l3Var2;
                        z27 = z19;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        mVar3 = mVar2;
                        z28 = z17;
                        i87 = i16;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar110 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z314 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z314;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar110;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar111 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z315 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z315;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar111;
                    }
                    rVarH.y();
                    e1 e1Var6 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar7 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar6 = qVarE;
                    ImeOptions imeOptionsG4 = keyboardOptionsA.g(z29);
                    boolean z411 = !z29;
                    c cVar6 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar112 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions6 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i914 = i85 << 9;
                    int i915 = ((i25 >> 6) & 7168) | (i25 & 910) | (i914 & 57344) | (i914 & 458752) | (i914 & 3670016) | (i914 & 29360128);
                    int i103 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle6 = textStyleA;
                    boolean z412 = z29;
                    l<? super TextLayoutResult, i0> lVar113 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar7, textStyle6, e1Var6, lVar113, lVar112, cVar6, z411, i96, i95, imeOptionsG4, l3Var4, z36, z35, qVar6, null, rVar2, i915, i103, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar6;
                    i86 = i88;
                    i87 = i89;
                    z28 = z412;
                    e1Var2 = e1Var6;
                    cVar2 = cVar6;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions6;
                    lVar4 = lVar113;
                    z27 = z35;
                    lVar5 = lVar112;
                    textStyle2 = textStyle6;
                    mVar3 = mVar7;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 3072;
            z18 = z15;
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    z19 = z16;
                    if (rVarH.a(z19)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                i37 = PKIFailureInfo.notAuthorized;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = 65536;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i37 = 131072;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar114 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z316 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z316;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar114;
                        } else {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar115 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z317 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z317;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar115;
                        }
                        rVarH.y();
                        e1 e1Var7 = e1VarC;
                        if (t.k()) {
                            t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                        }
                        m mVar8 = mVar2;
                        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar7 = qVarE;
                        ImeOptions imeOptionsG5 = keyboardOptionsA.g(z29);
                        boolean z413 = !z29;
                        c cVar7 = solidColor;
                        if (z29) {
                            i95 = 1;
                        } else {
                            i95 = i89;
                        }
                        b1.l lVar116 = lVar7;
                        if (z29) {
                            i96 = 1;
                        } else {
                            i96 = i88;
                        }
                        KeyboardOptions keyboardOptions7 = keyboardOptionsA;
                        if ((i25 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z37 | ((i25 & 112) == 32);
                        objE2 = rVarH.E();
                        if (z38) {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        int i916 = i85 << 9;
                        int i917 = ((i25 >> 6) & 7168) | (i25 & 910) | (i916 & 57344) | (i916 & 458752) | (i916 & 3670016) | (i916 & 29360128);
                        int i104 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                        rVar2 = rVarH;
                        TextStyle textStyle7 = textStyleA;
                        boolean z414 = z29;
                        l<? super TextLayoutResult, i0> lVar117 = lVar8;
                        j2.w(textFieldValue, (l) objE2, mVar8, textStyle7, e1Var7, lVar117, lVar116, cVar7, z413, i96, i95, imeOptionsG5, l3Var4, z36, z35, qVar7, null, rVar2, i917, i104, PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        l3Var3 = l3Var4;
                        qVar2 = qVar7;
                        i86 = i88;
                        i87 = i89;
                        z28 = z414;
                        e1Var2 = e1Var7;
                        cVar2 = cVar7;
                        z26 = z36;
                        keyboardOptions2 = keyboardOptions7;
                        lVar4 = lVar117;
                        z27 = z35;
                        lVar5 = lVar116;
                        textStyle2 = textStyle7;
                        mVar3 = mVar8;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        i86 = i15;
                        e1Var2 = e1Var;
                        qVar2 = qVar;
                        z26 = z18;
                        l3Var3 = l3Var2;
                        z27 = z19;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        mVar3 = mVar2;
                        z28 = z17;
                        i87 = i16;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar118 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z318 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z318;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar118;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar119 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z319 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z319;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar119;
                    }
                    rVarH.y();
                    e1 e1Var8 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar9 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar8 = qVarE;
                    ImeOptions imeOptionsG6 = keyboardOptionsA.g(z29);
                    boolean z415 = !z29;
                    c cVar8 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar1110 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions8 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i918 = i85 << 9;
                    int i919 = ((i25 >> 6) & 7168) | (i25 & 910) | (i918 & 57344) | (i918 & 458752) | (i918 & 3670016) | (i918 & 29360128);
                    int i105 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle8 = textStyleA;
                    boolean z416 = z29;
                    l<? super TextLayoutResult, i0> lVar1111 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar9, textStyle8, e1Var8, lVar1111, lVar1110, cVar8, z415, i96, i95, imeOptionsG6, l3Var4, z36, z35, qVar8, null, rVar2, i919, i105, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar8;
                    i86 = i88;
                    i87 = i89;
                    z28 = z416;
                    e1Var2 = e1Var8;
                    cVar2 = cVar8;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions8;
                    lVar4 = lVar1111;
                    z27 = z35;
                    lVar5 = lVar1110;
                    textStyle2 = textStyle8;
                    mVar3 = mVar9;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            z19 = z16;
            i36 = i19 & 32;
            i37 = PKIFailureInfo.notAuthorized;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = 65536;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar1112 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3110 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3110;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar1112;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar1113 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3111 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3111;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar1113;
                    }
                    rVarH.y();
                    e1 e1Var9 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar10 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar9 = qVarE;
                    ImeOptions imeOptionsG7 = keyboardOptionsA.g(z29);
                    boolean z417 = !z29;
                    c cVar9 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar1114 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions9 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i9110 = i85 << 9;
                    int i9111 = ((i25 >> 6) & 7168) | (i25 & 910) | (i9110 & 57344) | (i9110 & 458752) | (i9110 & 3670016) | (i9110 & 29360128);
                    int i106 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle9 = textStyleA;
                    boolean z418 = z29;
                    l<? super TextLayoutResult, i0> lVar1115 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar10, textStyle9, e1Var9, lVar1115, lVar1114, cVar9, z417, i96, i95, imeOptionsG7, l3Var4, z36, z35, qVar9, null, rVar2, i9111, i106, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar9;
                    i86 = i88;
                    i87 = i89;
                    z28 = z418;
                    e1Var2 = e1Var9;
                    cVar2 = cVar9;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions9;
                    lVar4 = lVar1115;
                    z27 = z35;
                    lVar5 = lVar1114;
                    textStyle2 = textStyle9;
                    mVar3 = mVar10;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 131072;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1116 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z3112 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z3112;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1116;
                } else {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1117 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z3113 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z3113;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1117;
                }
                rVarH.y();
                e1 e1Var10 = e1VarC;
                if (t.k()) {
                    t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                }
                m mVar11 = mVar2;
                q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar10 = qVarE;
                ImeOptions imeOptionsG8 = keyboardOptionsA.g(z29);
                boolean z419 = !z29;
                c cVar10 = solidColor;
                if (z29) {
                    i95 = 1;
                } else {
                    i95 = i89;
                }
                b1.l lVar1118 = lVar7;
                if (z29) {
                    i96 = 1;
                } else {
                    i96 = i88;
                }
                KeyboardOptions keyboardOptions10 = keyboardOptionsA;
                if ((i25 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z37 | ((i25 & 112) == 32);
                objE2 = rVarH.E();
                if (z38) {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                int i9112 = i85 << 9;
                int i9113 = ((i25 >> 6) & 7168) | (i25 & 910) | (i9112 & 57344) | (i9112 & 458752) | (i9112 & 3670016) | (i9112 & 29360128);
                int i107 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                rVar2 = rVarH;
                TextStyle textStyle10 = textStyleA;
                boolean z4110 = z29;
                l<? super TextLayoutResult, i0> lVar1119 = lVar8;
                j2.w(textFieldValue, (l) objE2, mVar11, textStyle10, e1Var10, lVar1119, lVar1118, cVar10, z419, i96, i95, imeOptionsG8, l3Var4, z36, z35, qVar10, null, rVar2, i9113, i107, PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                l3Var3 = l3Var4;
                qVar2 = qVar10;
                i86 = i88;
                i87 = i89;
                z28 = z4110;
                e1Var2 = e1Var10;
                cVar2 = cVar10;
                z26 = z36;
                keyboardOptions2 = keyboardOptions10;
                lVar4 = lVar1119;
                z27 = z35;
                lVar5 = lVar1118;
                textStyle2 = textStyle10;
                mVar3 = mVar11;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                i86 = i15;
                e1Var2 = e1Var;
                qVar2 = qVar;
                z26 = z18;
                l3Var3 = l3Var2;
                z27 = z19;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                mVar3 = mVar2;
                z28 = z17;
                i87 = i16;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i26 = i19 & 8;
        if (i26 != 0) {
            if ((i17 & 3072) == 0) {
                z18 = z15;
                if (rVarH.a(z18)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i25 |= i27;
            }
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    z19 = z16;
                    if (rVarH.a(z19)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                i37 = PKIFailureInfo.notAuthorized;
                if (i36 != 0) {
                    i25 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.W(textStyleA)) {
                            i38 = 131072;
                        } else {
                            i38 = 65536;
                        }
                        i25 |= i38;
                    }
                }
                i39 = i19 & 64;
                if (i39 != 0) {
                    i25 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(keyboardOptionsA)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i45;
                    }
                }
                i46 = i19 & 128;
                if (i46 != 0) {
                    i25 |= 12582912;
                    l3Var2 = l3Var;
                } else {
                    l3Var2 = l3Var;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(l3Var2)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i25 |= i47;
                    }
                }
                i48 = i19 & 256;
                if (i48 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z17)) {
                        i49 = 67108864;
                    } else {
                        i49 = 33554432;
                    }
                    i25 |= i49;
                }
                if ((i17 & 805306368) != 0) {
                    i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i55 = i19 & 1024;
                if (i55 != 0) {
                    i56 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i18 | i57;
                } else {
                    i56 = i18;
                }
                i58 = i19 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i18 & 48) != 0) {
                    if (rVarH.W(e1Var)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                i66 = i19 & PKIFailureInfo.certConfirmed;
                if (i66 != 0) {
                    i67 = i65 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(lVar2)) {
                        i68 = 256;
                    } else {
                        i68 = 128;
                    }
                    i67 = i65 | i68;
                } else {
                    i67 = i65;
                }
                i69 = i19 & PKIFailureInfo.certRevoked;
                if (i69 != 0) {
                    i76 = i67 | 3072;
                } else {
                    i75 = i67;
                    if ((i18 & 3072) == 0) {
                        i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                    } else {
                        i76 = i75;
                    }
                }
                i77 = i19 & 16384;
                if (i77 != 0) {
                    i78 = i76;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.W(cVar)) {
                            i29 = 16384;
                        }
                        i78 |= i29;
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i37 = 131072;
                        }
                        i78 |= i37;
                    }
                    i85 = i78;
                    if ((i25 & 306783379) == 306783378) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if (rVarH.r(z25, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar11110 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z3114 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z3114;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar11110;
                        } else {
                            if (i97 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i36 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i39 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i46 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var2;
                            }
                            if (i48 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if ((i19 & 512) != 0) {
                                if (z29) {
                                    i88 = 1;
                                } else {
                                    i88 = Integer.MAX_VALUE;
                                }
                                i25 &= -1879048193;
                            } else {
                                i88 = i15;
                            }
                            if (i55 != 0) {
                                i89 = 1;
                            } else {
                                i89 = i16;
                            }
                            if (i58 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            } else {
                                e1VarC = e1Var;
                            }
                            l3Var4 = l3VarA;
                            if (i66 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.n
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return u.r((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar6 = (l) objE;
                            } else {
                                lVar6 = lVar2;
                            }
                            if (i69 != 0) {
                                lVar7 = null;
                            } else {
                                lVar7 = lVar3;
                            }
                            l<? super TextLayoutResult, i0> lVar11111 = lVar6;
                            if (i77 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.a(), null);
                            } else {
                                solidColor = cVar;
                            }
                            if (i79 != 0) {
                                boolean z3115 = z19;
                                qVarE = e1.f130009a.e();
                                z35 = z3115;
                            } else {
                                z35 = z19;
                                qVarE = qVar;
                            }
                            z36 = z18;
                            lVar8 = lVar11111;
                        }
                        rVarH.y();
                        e1 e1Var11 = e1VarC;
                        if (t.k()) {
                            t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                        }
                        m mVar12 = mVar2;
                        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar11 = qVarE;
                        ImeOptions imeOptionsG9 = keyboardOptionsA.g(z29);
                        boolean z4111 = !z29;
                        c cVar11 = solidColor;
                        if (z29) {
                            i95 = 1;
                        } else {
                            i95 = i89;
                        }
                        b1.l lVar11112 = lVar7;
                        if (z29) {
                            i96 = 1;
                        } else {
                            i96 = i88;
                        }
                        KeyboardOptions keyboardOptions11 = keyboardOptionsA;
                        if ((i25 & 14) == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z37 | ((i25 & 112) == 32);
                        objE2 = rVarH.E();
                        if (z38) {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: n1.o
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        int i9114 = i85 << 9;
                        int i9115 = ((i25 >> 6) & 7168) | (i25 & 910) | (i9114 & 57344) | (i9114 & 458752) | (i9114 & 3670016) | (i9114 & 29360128);
                        int i108 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                        rVar2 = rVarH;
                        TextStyle textStyle11 = textStyleA;
                        boolean z4112 = z29;
                        l<? super TextLayoutResult, i0> lVar11113 = lVar8;
                        j2.w(textFieldValue, (l) objE2, mVar12, textStyle11, e1Var11, lVar11113, lVar11112, cVar11, z4111, i96, i95, imeOptionsG9, l3Var4, z36, z35, qVar11, null, rVar2, i9115, i108, PKIFailureInfo.notAuthorized);
                        if (t.k()) {
                            t.n();
                        }
                        l3Var3 = l3Var4;
                        qVar2 = qVar11;
                        i86 = i88;
                        i87 = i89;
                        z28 = z4112;
                        e1Var2 = e1Var11;
                        cVar2 = cVar11;
                        z26 = z36;
                        keyboardOptions2 = keyboardOptions11;
                        lVar4 = lVar11113;
                        z27 = z35;
                        lVar5 = lVar11112;
                        textStyle2 = textStyle11;
                        mVar3 = mVar12;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        i86 = i15;
                        e1Var2 = e1Var;
                        qVar2 = qVar;
                        z26 = z18;
                        l3Var3 = l3Var2;
                        z27 = z19;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        mVar3 = mVar2;
                        z28 = z17;
                        i87 = i16;
                        lVar4 = lVar2;
                        lVar5 = lVar3;
                        cVar2 = cVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i78 = i76 | 24576;
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar11114 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3116 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3116;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar11114;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar11115 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3117 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3117;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar11115;
                    }
                    rVarH.y();
                    e1 e1Var12 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar13 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar12 = qVarE;
                    ImeOptions imeOptionsG10 = keyboardOptionsA.g(z29);
                    boolean z4113 = !z29;
                    c cVar12 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar11116 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions12 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i9116 = i85 << 9;
                    int i9117 = ((i25 >> 6) & 7168) | (i25 & 910) | (i9116 & 57344) | (i9116 & 458752) | (i9116 & 3670016) | (i9116 & 29360128);
                    int i109 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle12 = textStyleA;
                    boolean z4114 = z29;
                    l<? super TextLayoutResult, i0> lVar11117 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar13, textStyle12, e1Var12, lVar11117, lVar11116, cVar12, z4113, i96, i95, imeOptionsG10, l3Var4, z36, z35, qVar12, null, rVar2, i9117, i109, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar12;
                    i86 = i88;
                    i87 = i89;
                    z28 = z4114;
                    e1Var2 = e1Var12;
                    cVar2 = cVar12;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions12;
                    lVar4 = lVar11117;
                    z27 = z35;
                    lVar5 = lVar11116;
                    textStyle2 = textStyle12;
                    mVar3 = mVar13;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            z19 = z16;
            i36 = i19 & 32;
            i37 = PKIFailureInfo.notAuthorized;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = 65536;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar11118 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3118 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3118;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar11118;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar11119 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z3119 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z3119;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar11119;
                    }
                    rVarH.y();
                    e1 e1Var13 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar14 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar13 = qVarE;
                    ImeOptions imeOptionsG11 = keyboardOptionsA.g(z29);
                    boolean z4115 = !z29;
                    c cVar13 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar111110 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions13 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i9118 = i85 << 9;
                    int i9119 = ((i25 >> 6) & 7168) | (i25 & 910) | (i9118 & 57344) | (i9118 & 458752) | (i9118 & 3670016) | (i9118 & 29360128);
                    int i1010 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle13 = textStyleA;
                    boolean z4116 = z29;
                    l<? super TextLayoutResult, i0> lVar111111 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar14, textStyle13, e1Var13, lVar111111, lVar111110, cVar13, z4115, i96, i95, imeOptionsG11, l3Var4, z36, z35, qVar13, null, rVar2, i9119, i1010, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar13;
                    i86 = i88;
                    i87 = i89;
                    z28 = z4116;
                    e1Var2 = e1Var13;
                    cVar2 = cVar13;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions13;
                    lVar4 = lVar111111;
                    z27 = z35;
                    lVar5 = lVar111110;
                    textStyle2 = textStyle13;
                    mVar3 = mVar14;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 131072;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar111112 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31110 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31110;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar111112;
                } else {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar111113 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31111 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31111;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar111113;
                }
                rVarH.y();
                e1 e1Var14 = e1VarC;
                if (t.k()) {
                    t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                }
                m mVar15 = mVar2;
                q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar14 = qVarE;
                ImeOptions imeOptionsG12 = keyboardOptionsA.g(z29);
                boolean z4117 = !z29;
                c cVar14 = solidColor;
                if (z29) {
                    i95 = 1;
                } else {
                    i95 = i89;
                }
                b1.l lVar111114 = lVar7;
                if (z29) {
                    i96 = 1;
                } else {
                    i96 = i88;
                }
                KeyboardOptions keyboardOptions14 = keyboardOptionsA;
                if ((i25 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z37 | ((i25 & 112) == 32);
                objE2 = rVarH.E();
                if (z38) {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                int i91110 = i85 << 9;
                int i91111 = ((i25 >> 6) & 7168) | (i25 & 910) | (i91110 & 57344) | (i91110 & 458752) | (i91110 & 3670016) | (i91110 & 29360128);
                int i1011 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                rVar2 = rVarH;
                TextStyle textStyle14 = textStyleA;
                boolean z4118 = z29;
                l<? super TextLayoutResult, i0> lVar111115 = lVar8;
                j2.w(textFieldValue, (l) objE2, mVar15, textStyle14, e1Var14, lVar111115, lVar111114, cVar14, z4117, i96, i95, imeOptionsG12, l3Var4, z36, z35, qVar14, null, rVar2, i91111, i1011, PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                l3Var3 = l3Var4;
                qVar2 = qVar14;
                i86 = i88;
                i87 = i89;
                z28 = z4118;
                e1Var2 = e1Var14;
                cVar2 = cVar14;
                z26 = z36;
                keyboardOptions2 = keyboardOptions14;
                lVar4 = lVar111115;
                z27 = z35;
                lVar5 = lVar111114;
                textStyle2 = textStyle14;
                mVar3 = mVar15;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                i86 = i15;
                e1Var2 = e1Var;
                qVar2 = qVar;
                z26 = z18;
                l3Var3 = l3Var2;
                z27 = z19;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                mVar3 = mVar2;
                z28 = z17;
                i87 = i16;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 3072;
        z18 = z15;
        i28 = i19 & 16;
        i29 = PKIFailureInfo.certRevoked;
        if (i28 != 0) {
            if ((i17 & 24576) == 0) {
                z19 = z16;
                if (rVarH.a(z19)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i25 |= i35;
            }
            i36 = i19 & 32;
            i37 = PKIFailureInfo.notAuthorized;
            if (i36 != 0) {
                i25 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i17 & 196608) == 0) {
                    if (rVarH.W(textStyleA)) {
                        i38 = 131072;
                    } else {
                        i38 = 65536;
                    }
                    i25 |= i38;
                }
            }
            i39 = i19 & 64;
            if (i39 != 0) {
                i25 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(keyboardOptionsA)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i45;
                }
            }
            i46 = i19 & 128;
            if (i46 != 0) {
                i25 |= 12582912;
                l3Var2 = l3Var;
            } else {
                l3Var2 = l3Var;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(l3Var2)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i25 |= i47;
                }
            }
            i48 = i19 & 256;
            if (i48 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z17)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i25 |= i49;
            }
            if ((i17 & 805306368) != 0) {
                i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i55 = i19 & 1024;
            if (i55 != 0) {
                i56 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i18 | i57;
            } else {
                i56 = i18;
            }
            i58 = i19 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i18 & 48) != 0) {
                if (rVarH.W(e1Var)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            i66 = i19 & PKIFailureInfo.certConfirmed;
            if (i66 != 0) {
                i67 = i65 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(lVar2)) {
                    i68 = 256;
                } else {
                    i68 = 128;
                }
                i67 = i65 | i68;
            } else {
                i67 = i65;
            }
            i69 = i19 & PKIFailureInfo.certRevoked;
            if (i69 != 0) {
                i76 = i67 | 3072;
            } else {
                i75 = i67;
                if ((i18 & 3072) == 0) {
                    i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
                } else {
                    i76 = i75;
                }
            }
            i77 = i19 & 16384;
            if (i77 != 0) {
                i78 = i76;
                if ((i18 & 24576) == 0) {
                    if (rVarH.W(cVar)) {
                        i29 = 16384;
                    }
                    i78 |= i29;
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 131072;
                    }
                    i78 |= i37;
                }
                i85 = i78;
                if ((i25 & 306783379) == 306783378) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (rVarH.r(z25, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar111116 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z31112 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z31112;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar111116;
                    } else {
                        if (i97 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i36 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i39 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i46 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var2;
                        }
                        if (i48 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if ((i19 & 512) != 0) {
                            if (z29) {
                                i88 = 1;
                            } else {
                                i88 = Integer.MAX_VALUE;
                            }
                            i25 &= -1879048193;
                        } else {
                            i88 = i15;
                        }
                        if (i55 != 0) {
                            i89 = 1;
                        } else {
                            i89 = i16;
                        }
                        if (i58 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        } else {
                            e1VarC = e1Var;
                        }
                        l3Var4 = l3VarA;
                        if (i66 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.n
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return u.r((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar6 = (l) objE;
                        } else {
                            lVar6 = lVar2;
                        }
                        if (i69 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar3;
                        }
                        l<? super TextLayoutResult, i0> lVar111117 = lVar6;
                        if (i77 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.a(), null);
                        } else {
                            solidColor = cVar;
                        }
                        if (i79 != 0) {
                            boolean z31113 = z19;
                            qVarE = e1.f130009a.e();
                            z35 = z31113;
                        } else {
                            z35 = z19;
                            qVarE = qVar;
                        }
                        z36 = z18;
                        lVar8 = lVar111117;
                    }
                    rVarH.y();
                    e1 e1Var15 = e1VarC;
                    if (t.k()) {
                        t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                    }
                    m mVar16 = mVar2;
                    q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar15 = qVarE;
                    ImeOptions imeOptionsG13 = keyboardOptionsA.g(z29);
                    boolean z4119 = !z29;
                    c cVar15 = solidColor;
                    if (z29) {
                        i95 = 1;
                    } else {
                        i95 = i89;
                    }
                    b1.l lVar111118 = lVar7;
                    if (z29) {
                        i96 = 1;
                    } else {
                        i96 = i88;
                    }
                    KeyboardOptions keyboardOptions15 = keyboardOptionsA;
                    if ((i25 & 14) == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z37 | ((i25 & 112) == 32);
                    objE2 = rVarH.E();
                    if (z38) {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: n1.o
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    int i91112 = i85 << 9;
                    int i91113 = ((i25 >> 6) & 7168) | (i25 & 910) | (i91112 & 57344) | (i91112 & 458752) | (i91112 & 3670016) | (i91112 & 29360128);
                    int i1012 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                    rVar2 = rVarH;
                    TextStyle textStyle15 = textStyleA;
                    boolean z41110 = z29;
                    l<? super TextLayoutResult, i0> lVar111119 = lVar8;
                    j2.w(textFieldValue, (l) objE2, mVar16, textStyle15, e1Var15, lVar111119, lVar111118, cVar15, z4119, i96, i95, imeOptionsG13, l3Var4, z36, z35, qVar15, null, rVar2, i91113, i1012, PKIFailureInfo.notAuthorized);
                    if (t.k()) {
                        t.n();
                    }
                    l3Var3 = l3Var4;
                    qVar2 = qVar15;
                    i86 = i88;
                    i87 = i89;
                    z28 = z41110;
                    e1Var2 = e1Var15;
                    cVar2 = cVar15;
                    z26 = z36;
                    keyboardOptions2 = keyboardOptions15;
                    lVar4 = lVar111119;
                    z27 = z35;
                    lVar5 = lVar111118;
                    textStyle2 = textStyle15;
                    mVar3 = mVar16;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    i86 = i15;
                    e1Var2 = e1Var;
                    qVar2 = qVar;
                    z26 = z18;
                    l3Var3 = l3Var2;
                    z27 = z19;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    mVar3 = mVar2;
                    z28 = z17;
                    i87 = i16;
                    lVar4 = lVar2;
                    lVar5 = lVar3;
                    cVar2 = cVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i78 = i76 | 24576;
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 131072;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1111110 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31114 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31114;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1111110;
                } else {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1111111 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31115 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31115;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1111111;
                }
                rVarH.y();
                e1 e1Var16 = e1VarC;
                if (t.k()) {
                    t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                }
                m mVar17 = mVar2;
                q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar16 = qVarE;
                ImeOptions imeOptionsG14 = keyboardOptionsA.g(z29);
                boolean z41111 = !z29;
                c cVar16 = solidColor;
                if (z29) {
                    i95 = 1;
                } else {
                    i95 = i89;
                }
                b1.l lVar1111112 = lVar7;
                if (z29) {
                    i96 = 1;
                } else {
                    i96 = i88;
                }
                KeyboardOptions keyboardOptions16 = keyboardOptionsA;
                if ((i25 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z37 | ((i25 & 112) == 32);
                objE2 = rVarH.E();
                if (z38) {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                int i91114 = i85 << 9;
                int i91115 = ((i25 >> 6) & 7168) | (i25 & 910) | (i91114 & 57344) | (i91114 & 458752) | (i91114 & 3670016) | (i91114 & 29360128);
                int i1013 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                rVar2 = rVarH;
                TextStyle textStyle16 = textStyleA;
                boolean z41112 = z29;
                l<? super TextLayoutResult, i0> lVar1111113 = lVar8;
                j2.w(textFieldValue, (l) objE2, mVar17, textStyle16, e1Var16, lVar1111113, lVar1111112, cVar16, z41111, i96, i95, imeOptionsG14, l3Var4, z36, z35, qVar16, null, rVar2, i91115, i1013, PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                l3Var3 = l3Var4;
                qVar2 = qVar16;
                i86 = i88;
                i87 = i89;
                z28 = z41112;
                e1Var2 = e1Var16;
                cVar2 = cVar16;
                z26 = z36;
                keyboardOptions2 = keyboardOptions16;
                lVar4 = lVar1111113;
                z27 = z35;
                lVar5 = lVar1111112;
                textStyle2 = textStyle16;
                mVar3 = mVar17;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                i86 = i15;
                e1Var2 = e1Var;
                qVar2 = qVar;
                z26 = z18;
                l3Var3 = l3Var2;
                z27 = z19;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                mVar3 = mVar2;
                z28 = z17;
                i87 = i16;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 24576;
        z19 = z16;
        i36 = i19 & 32;
        i37 = PKIFailureInfo.notAuthorized;
        if (i36 != 0) {
            i25 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i17 & 196608) == 0) {
                if (rVarH.W(textStyleA)) {
                    i38 = 131072;
                } else {
                    i38 = 65536;
                }
                i25 |= i38;
            }
        }
        i39 = i19 & 64;
        if (i39 != 0) {
            i25 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i17 & 1572864) == 0) {
                if (rVarH.W(keyboardOptionsA)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i25 |= i45;
            }
        }
        i46 = i19 & 128;
        if (i46 != 0) {
            i25 |= 12582912;
            l3Var2 = l3Var;
        } else {
            l3Var2 = l3Var;
            if ((i17 & 12582912) == 0) {
                if (rVarH.W(l3Var2)) {
                    i47 = 8388608;
                } else {
                    i47 = 4194304;
                }
                i25 |= i47;
            }
        }
        i48 = i19 & 256;
        if (i48 != 0) {
            i25 |= 100663296;
        } else if ((i17 & 100663296) == 0) {
            if (rVarH.a(z17)) {
                i49 = 67108864;
            } else {
                i49 = 33554432;
            }
            i25 |= i49;
        }
        if ((i17 & 805306368) != 0) {
            i25 |= ((i19 & 512) == 0 || !rVarH.c(i15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        i55 = i19 & 1024;
        if (i55 != 0) {
            i56 = i18 | 6;
        } else if ((i18 & 6) == 0) {
            if (rVarH.c(i16)) {
                i57 = 4;
            } else {
                i57 = 2;
            }
            i56 = i18 | i57;
        } else {
            i56 = i18;
        }
        i58 = i19 & 2048;
        if (i58 != 0) {
            i56 |= 48;
        } else if ((i18 & 48) != 0) {
            if (rVarH.W(e1Var)) {
                i59 = 32;
            } else {
                i59 = 16;
            }
            i56 |= i59;
        }
        i65 = i56;
        i66 = i19 & PKIFailureInfo.certConfirmed;
        if (i66 != 0) {
            i67 = i65 | MLKEMEngine.KyberPolyBytes;
        } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(lVar2)) {
                i68 = 256;
            } else {
                i68 = 128;
            }
            i67 = i65 | i68;
        } else {
            i67 = i65;
        }
        i69 = i19 & PKIFailureInfo.certRevoked;
        if (i69 != 0) {
            i76 = i67 | 3072;
        } else {
            i75 = i67;
            if ((i18 & 3072) == 0) {
                i76 = i75 | (rVarH.W(lVar3) ? 2048 : 1024);
            } else {
                i76 = i75;
            }
        }
        i77 = i19 & 16384;
        if (i77 != 0) {
            i78 = i76;
            if ((i18 & 24576) == 0) {
                if (rVarH.W(cVar)) {
                    i29 = 16384;
                }
                i78 |= i29;
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 131072;
                }
                i78 |= i37;
            }
            i85 = i78;
            if ((i25 & 306783379) == 306783378) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (rVarH.r(z25, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1111114 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31116 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31116;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1111114;
                } else {
                    if (i97 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i36 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i39 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i46 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var2;
                    }
                    if (i48 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if ((i19 & 512) != 0) {
                        if (z29) {
                            i88 = 1;
                        } else {
                            i88 = Integer.MAX_VALUE;
                        }
                        i25 &= -1879048193;
                    } else {
                        i88 = i15;
                    }
                    if (i55 != 0) {
                        i89 = 1;
                    } else {
                        i89 = i16;
                    }
                    if (i58 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    } else {
                        e1VarC = e1Var;
                    }
                    l3Var4 = l3VarA;
                    if (i66 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.n
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.r((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar6 = (l) objE;
                    } else {
                        lVar6 = lVar2;
                    }
                    if (i69 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar3;
                    }
                    l<? super TextLayoutResult, i0> lVar1111115 = lVar6;
                    if (i77 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.a(), null);
                    } else {
                        solidColor = cVar;
                    }
                    if (i79 != 0) {
                        boolean z31117 = z19;
                        qVarE = e1.f130009a.e();
                        z35 = z31117;
                    } else {
                        z35 = z19;
                        qVarE = qVar;
                    }
                    z36 = z18;
                    lVar8 = lVar1111115;
                }
                rVarH.y();
                e1 e1Var17 = e1VarC;
                if (t.k()) {
                    t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
                }
                m mVar18 = mVar2;
                q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar17 = qVarE;
                ImeOptions imeOptionsG15 = keyboardOptionsA.g(z29);
                boolean z41113 = !z29;
                c cVar17 = solidColor;
                if (z29) {
                    i95 = 1;
                } else {
                    i95 = i89;
                }
                b1.l lVar1111116 = lVar7;
                if (z29) {
                    i96 = 1;
                } else {
                    i96 = i88;
                }
                KeyboardOptions keyboardOptions17 = keyboardOptionsA;
                if ((i25 & 14) == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z37 | ((i25 & 112) == 32);
                objE2 = rVarH.E();
                if (z38) {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: n1.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                int i91116 = i85 << 9;
                int i91117 = ((i25 >> 6) & 7168) | (i25 & 910) | (i91116 & 57344) | (i91116 & 458752) | (i91116 & 3670016) | (i91116 & 29360128);
                int i1014 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
                rVar2 = rVarH;
                TextStyle textStyle17 = textStyleA;
                boolean z41114 = z29;
                l<? super TextLayoutResult, i0> lVar1111117 = lVar8;
                j2.w(textFieldValue, (l) objE2, mVar18, textStyle17, e1Var17, lVar1111117, lVar1111116, cVar17, z41113, i96, i95, imeOptionsG15, l3Var4, z36, z35, qVar17, null, rVar2, i91117, i1014, PKIFailureInfo.notAuthorized);
                if (t.k()) {
                    t.n();
                }
                l3Var3 = l3Var4;
                qVar2 = qVar17;
                i86 = i88;
                i87 = i89;
                z28 = z41114;
                e1Var2 = e1Var17;
                cVar2 = cVar17;
                z26 = z36;
                keyboardOptions2 = keyboardOptions17;
                lVar4 = lVar1111117;
                z27 = z35;
                lVar5 = lVar1111116;
                textStyle2 = textStyle17;
                mVar3 = mVar18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                i86 = i15;
                e1Var2 = e1Var;
                qVar2 = qVar;
                z26 = z18;
                l3Var3 = l3Var2;
                z27 = z19;
                textStyle2 = textStyleA;
                keyboardOptions2 = keyboardOptionsA;
                mVar3 = mVar2;
                z28 = z17;
                i87 = i16;
                lVar4 = lVar2;
                lVar5 = lVar3;
                cVar2 = cVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i78 = i76 | 24576;
        i79 = i19 & 32768;
        if (i79 != 0) {
            i78 |= 196608;
        } else if ((i18 & 196608) == 0) {
            if (rVarH.G(qVar)) {
                i37 = 131072;
            }
            i78 |= i37;
        }
        i85 = i78;
        if ((i25 & 306783379) == 306783378) {
            z25 = true;
        } else {
            z25 = true;
        }
        if (rVarH.r(z25, i25 & 1)) {
            rVarH.I();
            if ((i17 & 1) != 0) {
                if (i97 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i36 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i39 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i46 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var2;
                }
                if (i48 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if ((i19 & 512) != 0) {
                    if (z29) {
                        i88 = 1;
                    } else {
                        i88 = Integer.MAX_VALUE;
                    }
                    i25 &= -1879048193;
                } else {
                    i88 = i15;
                }
                if (i55 != 0) {
                    i89 = 1;
                } else {
                    i89 = i16;
                }
                if (i58 != 0) {
                    e1VarC = e1.INSTANCE.c();
                } else {
                    e1VarC = e1Var;
                }
                l3Var4 = l3VarA;
                if (i66 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.n
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.r((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar6 = (l) objE;
                } else {
                    lVar6 = lVar2;
                }
                if (i69 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                l<? super TextLayoutResult, i0> lVar1111118 = lVar6;
                if (i77 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                } else {
                    solidColor = cVar;
                }
                if (i79 != 0) {
                    boolean z31118 = z19;
                    qVarE = e1.f130009a.e();
                    z35 = z31118;
                } else {
                    z35 = z19;
                    qVarE = qVar;
                }
                z36 = z18;
                lVar8 = lVar1111118;
            } else {
                if (i97 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i36 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i39 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i46 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var2;
                }
                if (i48 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if ((i19 & 512) != 0) {
                    if (z29) {
                        i88 = 1;
                    } else {
                        i88 = Integer.MAX_VALUE;
                    }
                    i25 &= -1879048193;
                } else {
                    i88 = i15;
                }
                if (i55 != 0) {
                    i89 = 1;
                } else {
                    i89 = i16;
                }
                if (i58 != 0) {
                    e1VarC = e1.INSTANCE.c();
                } else {
                    e1VarC = e1Var;
                }
                l3Var4 = l3VarA;
                if (i66 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.n
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.r((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar6 = (l) objE;
                } else {
                    lVar6 = lVar2;
                }
                if (i69 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar3;
                }
                l<? super TextLayoutResult, i0> lVar1111119 = lVar6;
                if (i77 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.a(), null);
                } else {
                    solidColor = cVar;
                }
                if (i79 != 0) {
                    boolean z31119 = z19;
                    qVarE = e1.f130009a.e();
                    z35 = z31119;
                } else {
                    z35 = z19;
                    qVarE = qVar;
                }
                z36 = z18;
                lVar8 = lVar1111119;
            }
            rVarH.y();
            e1 e1Var18 = e1VarC;
            if (t.k()) {
                t.o(-971111025, i25, i85, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:934)");
            }
            m mVar19 = mVar2;
            q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar18 = qVarE;
            ImeOptions imeOptionsG16 = keyboardOptionsA.g(z29);
            boolean z41115 = !z29;
            c cVar18 = solidColor;
            if (z29) {
                i95 = 1;
            } else {
                i95 = i89;
            }
            b1.l lVar11111110 = lVar7;
            if (z29) {
                i96 = 1;
            } else {
                i96 = i88;
            }
            KeyboardOptions keyboardOptions18 = keyboardOptionsA;
            if ((i25 & 14) == 4) {
                z37 = true;
            } else {
                z37 = false;
            }
            z38 = z37 | ((i25 & 112) == 32);
            objE2 = rVarH.E();
            if (z38) {
                objE2 = new l() { // from class: n1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new l() { // from class: n1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.s(textFieldValue, lVar, (TextFieldValue) obj);
                    }
                };
                rVarH.v(objE2);
            }
            int i91118 = i85 << 9;
            int i91119 = ((i25 >> 6) & 7168) | (i25 & 910) | (i91118 & 57344) | (i91118 & 458752) | (i91118 & 3670016) | (i91118 & 29360128);
            int i1015 = (i25 & 7168) | ((i25 >> 15) & 896) | (57344 & i25) | (i85 & 458752);
            rVar2 = rVarH;
            TextStyle textStyle18 = textStyleA;
            boolean z41116 = z29;
            l<? super TextLayoutResult, i0> lVar11111111 = lVar8;
            j2.w(textFieldValue, (l) objE2, mVar19, textStyle18, e1Var18, lVar11111111, lVar11111110, cVar18, z41115, i96, i95, imeOptionsG16, l3Var4, z36, z35, qVar18, null, rVar2, i91119, i1015, PKIFailureInfo.notAuthorized);
            if (t.k()) {
                t.n();
            }
            l3Var3 = l3Var4;
            qVar2 = qVar18;
            i86 = i88;
            i87 = i89;
            z28 = z41116;
            e1Var2 = e1Var18;
            cVar2 = cVar18;
            z26 = z36;
            keyboardOptions2 = keyboardOptions18;
            lVar4 = lVar11111111;
            z27 = z35;
            lVar5 = lVar11111110;
            textStyle2 = textStyle18;
            mVar3 = mVar19;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            i86 = i15;
            e1Var2 = e1Var;
            qVar2 = qVar;
            z26 = z18;
            l3Var3 = l3Var2;
            z27 = z19;
            textStyle2 = textStyleA;
            keyboardOptions2 = keyboardOptionsA;
            mVar3 = mVar2;
            z28 = z17;
            i87 = i16;
            lVar4 = lVar2;
            lVar5 = lVar3;
            cVar2 = cVar;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(textFieldValue, lVar, mVar3, z26, z27, textStyle2, keyboardOptions2, l3Var3, z28, i86, i87, e1Var2, lVar4, lVar5, cVar2, qVar2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    private static final TextFieldValue k(a3<TextFieldValue> a3Var) {
        return a3Var.getValue();
    }

    private static final void l(a3<TextFieldValue> a3Var, TextFieldValue textFieldValue) {
        a3Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(TextFieldValue textFieldValue, a3 a3Var) {
        if (!z3.g(textFieldValue.getSelection(), k(a3Var).getSelection()) || !fr.t.c(textFieldValue.getComposition(), k(a3Var).getComposition())) {
            l(a3Var, textFieldValue);
        }
        return i0.f148189a;
    }

    private static final String n(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void o(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(l lVar, a3 a3Var, a3 a3Var2, TextFieldValue textFieldValue) {
        l(a3Var, textFieldValue);
        boolean zC = fr.t.c(n(a3Var2), textFieldValue.m());
        o(a3Var2, textFieldValue.m());
        if (!zC) {
            lVar.b(textFieldValue.m());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(String str, l lVar, m mVar, boolean z15, boolean z16, TextStyle textStyle, KeyboardOptions keyboardOptions, l3 l3Var, boolean z17, int i15, int i16, e1 e1Var, l lVar2, b1.l lVar3, c cVar, q qVar, int i17, int i18, int i19, r rVar, int i25) {
        h(str, lVar, mVar, z15, z16, textStyle, keyboardOptions, l3Var, z17, i15, i16, e1Var, lVar2, lVar3, cVar, qVar, rVar, g4.a(i17 | 1), g4.a(i18), i19);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(TextFieldValue textFieldValue, l lVar, TextFieldValue textFieldValue2) {
        if (!fr.t.c(textFieldValue, textFieldValue2)) {
            lVar.b(textFieldValue2);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(TextFieldValue textFieldValue, l lVar, m mVar, boolean z15, boolean z16, TextStyle textStyle, KeyboardOptions keyboardOptions, l3 l3Var, boolean z17, int i15, int i16, e1 e1Var, l lVar2, b1.l lVar3, c cVar, q qVar, int i17, int i18, int i19, r rVar, int i25) {
        i(textFieldValue, lVar, mVar, z15, z16, textStyle, keyboardOptions, l3Var, z17, i15, i16, e1Var, lVar2, lVar3, cVar, qVar, rVar, g4.a(i17 | 1), g4.a(i18), i19);
        return i0.f148189a;
    }
}
