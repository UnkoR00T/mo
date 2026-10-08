package h60;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.x;
import er.l;
import er.p;
import f3.j;
import f3.m;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.ad;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;
import t70.y;
import w0.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf3/m;", "modifier", "", "testTag", "", "iconResId", "Lh60/g;", "iconSize", "Landroidx/compose/ui/graphics/Color;", "iconColor", "", "iconOpacity", "Lh60/a;", "iconBackgroundShape", "iconBackgroundSize", "iconBackgroundColor", "iconBackgroundOpacity", "iconBackgroundCornerRadius", "contentDescription", "Loq/i0;", "e", "(Lf3/m;Ljava/lang/String;Ljava/lang/Integer;Lh60/g;JFLh60/a;Lh60/g;JFFLjava/lang/String;Lm2/r;III)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81254a;

        static {
            int[] iArr = new int[h60.a.values().length];
            try {
                iArr[h60.a.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h60.a.Square.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81254a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:135:0x018c  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01be  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01da  */
    /* JADX WARN: Code duplicated, block: B:165:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:176:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:180:0x0205  */
    /* JADX WARN: Code duplicated, block: B:183:0x0225  */
    /* JADX WARN: Code duplicated, block: B:186:0x023e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0240  */
    /* JADX WARN: Code duplicated, block: B:190:0x0247  */
    /* JADX WARN: Code duplicated, block: B:191:0x0249  */
    /* JADX WARN: Code duplicated, block: B:194:0x0256  */
    /* JADX WARN: Code duplicated, block: B:196:0x025c  */
    /* JADX WARN: Code duplicated, block: B:199:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:203:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:208:0x030d  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0317  */
    /* JADX WARN: Code duplicated, block: B:213:0x0319  */
    /* JADX WARN: Code duplicated, block: B:216:0x0322  */
    /* JADX WARN: Code duplicated, block: B:217:0x0324  */
    /* JADX WARN: Code duplicated, block: B:220:0x032b  */
    /* JADX WARN: Code duplicated, block: B:221:0x032e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0338  */
    /* JADX WARN: Code duplicated, block: B:228:0x0345  */
    /* JADX WARN: Code duplicated, block: B:231:0x0369  */
    /* JADX WARN: Code duplicated, block: B:233:0x0377  */
    /* JADX WARN: Code duplicated, block: B:235:0x0381  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:240:0x03de  */
    /* JADX WARN: Code duplicated, block: B:243:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void e(m mVar, String str, Integer num, g gVar, long j15, float f15, h60.a aVar, g gVar2, long j16, float f16, float f17, String str2, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        final String str3;
        int i19;
        final Integer num2;
        int i25;
        int i26;
        int iOrdinal;
        int i27;
        int i28;
        final long jH;
        int i29;
        int i35;
        float f18;
        int i36;
        int i37;
        int iOrdinal2;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        boolean z15;
        final m mVar2;
        final g gVar3;
        final h60.a aVar2;
        final float f19;
        final float f25;
        final float f26;
        final String str4;
        final Integer num3;
        final g gVar4;
        final long j17;
        final String str5;
        d5 d5VarM;
        m mVar3;
        g gVar5;
        h60.a aVar3;
        g gVar6;
        long jH2;
        float f27;
        float f28;
        String str6;
        final Context context;
        Object objE;
        r.Companion companion;
        long j18;
        boolean z16;
        boolean z17;
        boolean zG;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB;
        float f29;
        float f35;
        h60.a aVar4;
        boolean z18;
        boolean z19;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objE3;
        r rVarH = rVar.h(1521711741);
        int i66 = i17 & 1;
        if (i66 != 0) {
            i18 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i67 = i17 & 2;
        if (i67 == 0) {
            if ((i15 & 48) == 0) {
                str3 = str;
                i18 |= rVarH.W(str3) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    num2 = num;
                    if (rVarH.W(num2)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 8;
                if (i26 != 0) {
                    i18 |= 3072;
                } else if ((i15 & 3072) == 0) {
                    if (gVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = gVar.ordinal();
                    }
                    if (rVarH.c(iOrdinal)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 16;
                if (i28 != 0) {
                    i18 |= 24576;
                    jH = j15;
                } else {
                    jH = j15;
                    if ((i15 & 24576) == 0) {
                        if (rVarH.d(jH)) {
                            i29 = 16384;
                        } else {
                            i29 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i29;
                    }
                }
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                    f18 = f15;
                } else {
                    f18 = f15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.b(f18)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i36;
                    }
                }
                i37 = i17 & 64;
                if (i37 != 0) {
                    i18 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (aVar == null) {
                        iOrdinal2 = -1;
                    } else {
                        iOrdinal2 = aVar.ordinal();
                    }
                    if (rVarH.c(iOrdinal2)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i38;
                }
                i39 = i17 & 128;
                if (i39 != 0) {
                    i18 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.c(gVar2 != null ? gVar2.ordinal() : -1)) {
                        i45 = 8388608;
                    } else {
                        i45 = 4194304;
                    }
                    i18 |= i45;
                }
                i46 = i17 & 256;
                if (i46 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.d(j16)) {
                            i47 = 67108864;
                        } else {
                            i47 = 33554432;
                        }
                        i18 |= i47;
                    }
                    i48 = i17 & 512;
                    if (i48 != 0) {
                        i18 |= 805306368;
                    } else if ((i15 & 805306368) == 0) {
                        if (rVarH.b(f16)) {
                            i49 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i49 = 268435456;
                        }
                        i18 |= i49;
                    }
                    i55 = i17 & 1024;
                    if (i55 != 0) {
                        i56 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.b(f17)) {
                            i57 = 4;
                        } else {
                            i57 = 2;
                        }
                        i56 = i16 | i57;
                    } else {
                        i56 = i16;
                    }
                    i58 = i17 & 2048;
                    if (i58 != 0) {
                        i56 |= 48;
                    } else if ((i16 & 48) == 0) {
                        if (rVarH.W(str2)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i56 |= i59;
                    }
                    i65 = i56;
                    if ((i18 & 306783379) == 306783378 || (i65 & 19) != 18) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        if (i66 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i67 != 0) {
                            str3 = null;
                        }
                        if (i19 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            gVar5 = g.Medium;
                        } else {
                            gVar5 = gVar;
                        }
                        if (i28 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if (i35 != 0) {
                            f18 = 1.0f;
                        }
                        if (i37 != 0) {
                            aVar3 = h60.a.None;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i39 != 0) {
                            gVar6 = g.Big;
                        } else {
                            gVar6 = gVar2;
                        }
                        if (i46 != 0) {
                            jH2 = Color.INSTANCE.h();
                        } else {
                            jH2 = j16;
                        }
                        if (i48 != 0) {
                            f27 = 1.0f;
                        } else {
                            f27 = f16;
                        }
                        if (i55 != 0) {
                            f28 = 0.0f;
                        } else {
                            f28 = f17;
                        }
                        if (i58 != 0) {
                            str6 = null;
                        } else {
                            str6 = str2;
                        }
                        if (t.k()) {
                            t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                        }
                        context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new l() { // from class: h60.b
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.f((i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        j18 = jH;
                        m mVarD = v.d(mVar3, false, (l) objE, 1, null);
                        if ((i18 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i18 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zG = z16 | z17 | rVarH.G(context);
                        objE2 = rVarH.E();
                        if (zG || objE2 == companion.a()) {
                            objE2 = new l() { // from class: h60.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.g(str3, num2, context, (i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        String str7 = str6;
                        m mVarO = i.O(v.d(mVarD, false, (l) objE2, 1, null), str7, false, null, rVarH, i65 & 112, 6);
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT = rVarH.t();
                        m mVarE = j.e(rVarH, mVarO);
                        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                        m mVar4 = mVar3;
                        aVarB = companion2.b();
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
                        n6.i(rVarC, w0VarI, companion2.d());
                        n6.i(rVarC, e0VarT, companion2.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                        n6.g(rVarC, companion2.a());
                        n6.i(rVarC, mVarE, companion2.e());
                        x xVar = x.f39368a;
                        if (aVar3 != h60.a.None) {
                            rVarH.X(-1654598786);
                            m mVarT = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                            if ((3670016 & i18) == 1048576) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if ((234881024 & i18) == 67108864) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z28 = z19 | z18;
                            if ((1879048192 & i18) == 536870912) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z29 = z28 | z25;
                            if ((i65 & 14) == 4) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z29 | z26;
                            objE3 = rVarH.E();
                            if (!z27 || objE3 == companion.a()) {
                                final float f36 = f27;
                                final h60.a aVar5 = aVar3;
                                final float f37 = f28;
                                final long j19 = jH2;
                                objE3 = new l() { // from class: h60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return f.h(aVar5, j19, f36, f37, (p3.f) obj);
                                    }
                                };
                                aVar4 = aVar5;
                                f29 = f36;
                                f35 = f37;
                                rVarH.v(objE3);
                            } else {
                                f29 = f27;
                                f35 = f28;
                                aVar4 = aVar3;
                            }
                            z.b(mVarT, (l) objE3, rVarH, 0);
                        } else {
                            f29 = f27;
                            f35 = f28;
                            aVar4 = aVar3;
                            rVarH.X(-1656830817);
                        }
                        rVarH.R();
                        if (num2 == null) {
                            rVarH.X(-1653990288);
                        } else {
                            rVarH.X(-1653990287);
                            ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                            oq.i0 i0Var = oq.i0.f148189a;
                        }
                        rVarH.R();
                        rVarH.x();
                        if (t.k()) {
                            t.n();
                        }
                        f19 = f29;
                        f26 = f18;
                        str4 = str3;
                        gVar4 = gVar6;
                        num3 = num2;
                        j17 = jH2;
                        mVar2 = mVar4;
                        str5 = str7;
                        f25 = f35;
                        gVar3 = gVar5;
                        aVar2 = aVar4;
                        jH = j18;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        gVar3 = gVar;
                        aVar2 = aVar;
                        f19 = f16;
                        f25 = f17;
                        f26 = f18;
                        str4 = str3;
                        num3 = num2;
                        gVar4 = gVar2;
                        j17 = j16;
                        str5 = str2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: h60.e
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 100663296;
                i48 = i17 & 512;
                if (i48 != 0) {
                    i18 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i18 |= i49;
                }
                i55 = i17 & 1024;
                if (i55 != 0) {
                    i56 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f17)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i16 | i57;
                } else {
                    i56 = i16;
                }
                i58 = i17 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i16 & 48) == 0) {
                    if (rVarH.W(str2)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                if ((i18 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    if (i66 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i67 != 0) {
                        str3 = null;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        gVar5 = g.Medium;
                    } else {
                        gVar5 = gVar;
                    }
                    if (i28 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i35 != 0) {
                        f18 = 1.0f;
                    }
                    if (i37 != 0) {
                        aVar3 = h60.a.None;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i39 != 0) {
                        gVar6 = g.Big;
                    } else {
                        gVar6 = gVar2;
                    }
                    if (i46 != 0) {
                        jH2 = Color.INSTANCE.h();
                    } else {
                        jH2 = j16;
                    }
                    if (i48 != 0) {
                        f27 = 1.0f;
                    } else {
                        f27 = f16;
                    }
                    if (i55 != 0) {
                        f28 = 0.0f;
                    } else {
                        f28 = f17;
                    }
                    if (i58 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (t.k()) {
                        t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                    }
                    context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new l() { // from class: h60.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.f((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    j18 = jH;
                    m mVarD2 = v.d(mVar3, false, (l) objE, 1, null);
                    if ((i18 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i18 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zG = z16 | z17 | rVarH.G(context);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    String str8 = str6;
                    m mVarO2 = i.O(v.d(mVarD2, false, (l) objE2, 1, null), str8, false, null, rVarH, i65 & 112, 6);
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = j.e(rVarH, mVarO2);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    m mVar5 = mVar3;
                    aVarB = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    x xVar2 = x.f39368a;
                    if (aVar3 != h60.a.None) {
                        rVarH.X(-1654598786);
                        m mVarT2 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                        if ((3670016 & i18) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((234881024 & i18) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z210 = z19 | z18;
                        if ((1879048192 & i18) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z211 = z210 | z25;
                        if ((i65 & 14) == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z211 | z26;
                        objE3 = rVarH.E();
                        if (z27) {
                            final float f38 = f27;
                            final h60.a aVar6 = aVar3;
                            final float f39 = f28;
                            final long j110 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar6, j110, f38, f39, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar6;
                            f29 = f38;
                            f35 = f39;
                            rVarH.v(objE3);
                        } else {
                            final float f310 = f27;
                            final h60.a aVar7 = aVar3;
                            final float f311 = f28;
                            final long j111 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar7, j111, f310, f311, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar7;
                            f29 = f310;
                            f35 = f311;
                            rVarH.v(objE3);
                        }
                        z.b(mVarT2, (l) objE3, rVarH, 0);
                    } else {
                        f29 = f27;
                        f35 = f28;
                        aVar4 = aVar3;
                        rVarH.X(-1656830817);
                    }
                    rVarH.R();
                    if (num2 == null) {
                        rVarH.X(-1653990288);
                    } else {
                        rVarH.X(-1653990287);
                        ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                        oq.i0 i0Var2 = oq.i0.f148189a;
                    }
                    rVarH.R();
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    f19 = f29;
                    f26 = f18;
                    str4 = str3;
                    gVar4 = gVar6;
                    num3 = num2;
                    j17 = jH2;
                    mVar2 = mVar5;
                    str5 = str8;
                    f25 = f35;
                    gVar3 = gVar5;
                    aVar2 = aVar4;
                    jH = j18;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    gVar3 = gVar;
                    aVar2 = aVar;
                    f19 = f16;
                    f25 = f17;
                    f26 = f18;
                    str4 = str3;
                    num3 = num2;
                    gVar4 = gVar2;
                    j17 = j16;
                    str5 = str2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: h60.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= MLKEMEngine.KyberPolyBytes;
            num2 = num;
            i26 = i17 & 8;
            if (i26 != 0) {
                i18 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if (gVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = gVar.ordinal();
                }
                if (rVarH.c(iOrdinal)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i18 |= i27;
            }
            i28 = i17 & 16;
            if (i28 != 0) {
                i18 |= 24576;
                jH = j15;
            } else {
                jH = j15;
                if ((i15 & 24576) == 0) {
                    if (rVarH.d(jH)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i29;
                }
            }
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
                f18 = f15;
            } else {
                f18 = f15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.b(f18)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
            }
            i37 = i17 & 64;
            if (i37 != 0) {
                i18 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (aVar == null) {
                    iOrdinal2 = -1;
                } else {
                    iOrdinal2 = aVar.ordinal();
                }
                if (rVarH.c(iOrdinal2)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i38;
            }
            i39 = i17 & 128;
            if (i39 != 0) {
                i18 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.c(gVar2 != null ? gVar2.ordinal() : -1)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i18 |= i45;
            }
            i46 = i17 & 256;
            if (i46 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.d(j16)) {
                        i47 = 67108864;
                    } else {
                        i47 = 33554432;
                    }
                    i18 |= i47;
                }
                i48 = i17 & 512;
                if (i48 != 0) {
                    i18 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i18 |= i49;
                }
                i55 = i17 & 1024;
                if (i55 != 0) {
                    i56 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f17)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i16 | i57;
                } else {
                    i56 = i16;
                }
                i58 = i17 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i16 & 48) == 0) {
                    if (rVarH.W(str2)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                if ((i18 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    if (i66 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i67 != 0) {
                        str3 = null;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        gVar5 = g.Medium;
                    } else {
                        gVar5 = gVar;
                    }
                    if (i28 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i35 != 0) {
                        f18 = 1.0f;
                    }
                    if (i37 != 0) {
                        aVar3 = h60.a.None;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i39 != 0) {
                        gVar6 = g.Big;
                    } else {
                        gVar6 = gVar2;
                    }
                    if (i46 != 0) {
                        jH2 = Color.INSTANCE.h();
                    } else {
                        jH2 = j16;
                    }
                    if (i48 != 0) {
                        f27 = 1.0f;
                    } else {
                        f27 = f16;
                    }
                    if (i55 != 0) {
                        f28 = 0.0f;
                    } else {
                        f28 = f17;
                    }
                    if (i58 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (t.k()) {
                        t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                    }
                    context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new l() { // from class: h60.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.f((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    j18 = jH;
                    m mVarD3 = v.d(mVar3, false, (l) objE, 1, null);
                    if ((i18 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i18 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zG = z16 | z17 | rVarH.G(context);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    String str9 = str6;
                    m mVarO3 = i.O(v.d(mVarD3, false, (l) objE2, 1, null), str9, false, null, rVarH, i65 & 112, 6);
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVarO3);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                    m mVar6 = mVar3;
                    aVarB = companion4.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarI3, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    x xVar3 = x.f39368a;
                    if (aVar3 != h60.a.None) {
                        rVarH.X(-1654598786);
                        m mVarT3 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                        if ((3670016 & i18) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((234881024 & i18) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z212 = z19 | z18;
                        if ((1879048192 & i18) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z213 = z212 | z25;
                        if ((i65 & 14) == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z213 | z26;
                        objE3 = rVarH.E();
                        if (z27) {
                            final float f312 = f27;
                            final h60.a aVar8 = aVar3;
                            final float f313 = f28;
                            final long j112 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar8, j112, f312, f313, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar8;
                            f29 = f312;
                            f35 = f313;
                            rVarH.v(objE3);
                        } else {
                            final float f314 = f27;
                            final h60.a aVar9 = aVar3;
                            final float f315 = f28;
                            final long j113 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar9, j113, f314, f315, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar9;
                            f29 = f314;
                            f35 = f315;
                            rVarH.v(objE3);
                        }
                        z.b(mVarT3, (l) objE3, rVarH, 0);
                    } else {
                        f29 = f27;
                        f35 = f28;
                        aVar4 = aVar3;
                        rVarH.X(-1656830817);
                    }
                    rVarH.R();
                    if (num2 == null) {
                        rVarH.X(-1653990288);
                    } else {
                        rVarH.X(-1653990287);
                        ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                        oq.i0 i0Var3 = oq.i0.f148189a;
                    }
                    rVarH.R();
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    f19 = f29;
                    f26 = f18;
                    str4 = str3;
                    gVar4 = gVar6;
                    num3 = num2;
                    j17 = jH2;
                    mVar2 = mVar6;
                    str5 = str9;
                    f25 = f35;
                    gVar3 = gVar5;
                    aVar2 = aVar4;
                    jH = j18;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    gVar3 = gVar;
                    aVar2 = aVar;
                    f19 = f16;
                    f25 = f17;
                    f26 = f18;
                    str4 = str3;
                    num3 = num2;
                    gVar4 = gVar2;
                    j17 = j16;
                    str5 = str2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: h60.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            i48 = i17 & 512;
            if (i48 != 0) {
                i18 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f16)) {
                    i49 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i49 = 268435456;
                }
                i18 |= i49;
            }
            i55 = i17 & 1024;
            if (i55 != 0) {
                i56 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f17)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i16 | i57;
            } else {
                i56 = i16;
            }
            i58 = i17 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i16 & 48) == 0) {
                if (rVarH.W(str2)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i66 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i67 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    num2 = null;
                }
                if (i26 != 0) {
                    gVar5 = g.Medium;
                } else {
                    gVar5 = gVar;
                }
                if (i28 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if (i35 != 0) {
                    f18 = 1.0f;
                }
                if (i37 != 0) {
                    aVar3 = h60.a.None;
                } else {
                    aVar3 = aVar;
                }
                if (i39 != 0) {
                    gVar6 = g.Big;
                } else {
                    gVar6 = gVar2;
                }
                if (i46 != 0) {
                    jH2 = Color.INSTANCE.h();
                } else {
                    jH2 = j16;
                }
                if (i48 != 0) {
                    f27 = 1.0f;
                } else {
                    f27 = f16;
                }
                if (i55 != 0) {
                    f28 = 0.0f;
                } else {
                    f28 = f17;
                }
                if (i58 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (t.k()) {
                    t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new l() { // from class: h60.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                j18 = jH;
                m mVarD4 = v.d(mVar3, false, (l) objE, 1, null);
                if ((i18 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i18 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zG = z16 | z17 | rVarH.G(context);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                String str10 = str6;
                m mVarO4 = i.O(v.d(mVarD4, false, (l) objE2, 1, null), str10, false, null, rVarH, i65 & 112, 6);
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = j.e(rVarH, mVarO4);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                m mVar7 = mVar3;
                aVarB = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion5.d());
                n6.i(rVarC4, e0VarT4, companion5.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                n6.g(rVarC4, companion5.a());
                n6.i(rVarC4, mVarE4, companion5.e());
                x xVar4 = x.f39368a;
                if (aVar3 != h60.a.None) {
                    rVarH.X(-1654598786);
                    m mVarT4 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                    if ((3670016 & i18) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((234881024 & i18) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z214 = z19 | z18;
                    if ((1879048192 & i18) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z215 = z214 | z25;
                    if ((i65 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z215 | z26;
                    objE3 = rVarH.E();
                    if (z27) {
                        final float f316 = f27;
                        final h60.a aVar10 = aVar3;
                        final float f317 = f28;
                        final long j114 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar10, j114, f316, f317, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar10;
                        f29 = f316;
                        f35 = f317;
                        rVarH.v(objE3);
                    } else {
                        final float f318 = f27;
                        final h60.a aVar11 = aVar3;
                        final float f319 = f28;
                        final long j115 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar11, j115, f318, f319, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar11;
                        f29 = f318;
                        f35 = f319;
                        rVarH.v(objE3);
                    }
                    z.b(mVarT4, (l) objE3, rVarH, 0);
                } else {
                    f29 = f27;
                    f35 = f28;
                    aVar4 = aVar3;
                    rVarH.X(-1656830817);
                }
                rVarH.R();
                if (num2 == null) {
                    rVarH.X(-1653990288);
                } else {
                    rVarH.X(-1653990287);
                    ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                    oq.i0 i0Var4 = oq.i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                f19 = f29;
                f26 = f18;
                str4 = str3;
                gVar4 = gVar6;
                num3 = num2;
                j17 = jH2;
                mVar2 = mVar7;
                str5 = str10;
                f25 = f35;
                gVar3 = gVar5;
                aVar2 = aVar4;
                jH = j18;
            } else {
                rVarH.O();
                mVar2 = mVar;
                gVar3 = gVar;
                aVar2 = aVar;
                f19 = f16;
                f25 = f17;
                f26 = f18;
                str4 = str3;
                num3 = num2;
                gVar4 = gVar2;
                j17 = j16;
                str5 = str2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: h60.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        str3 = str;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                num2 = num;
                if (rVarH.W(num2)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i18 |= i25;
            }
            i26 = i17 & 8;
            if (i26 != 0) {
                i18 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if (gVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = gVar.ordinal();
                }
                if (rVarH.c(iOrdinal)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i18 |= i27;
            }
            i28 = i17 & 16;
            if (i28 != 0) {
                i18 |= 24576;
                jH = j15;
            } else {
                jH = j15;
                if ((i15 & 24576) == 0) {
                    if (rVarH.d(jH)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i29;
                }
            }
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
                f18 = f15;
            } else {
                f18 = f15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.b(f18)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
            }
            i37 = i17 & 64;
            if (i37 != 0) {
                i18 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (aVar == null) {
                    iOrdinal2 = -1;
                } else {
                    iOrdinal2 = aVar.ordinal();
                }
                if (rVarH.c(iOrdinal2)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i38;
            }
            i39 = i17 & 128;
            if (i39 != 0) {
                i18 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.c(gVar2 != null ? gVar2.ordinal() : -1)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i18 |= i45;
            }
            i46 = i17 & 256;
            if (i46 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.d(j16)) {
                        i47 = 67108864;
                    } else {
                        i47 = 33554432;
                    }
                    i18 |= i47;
                }
                i48 = i17 & 512;
                if (i48 != 0) {
                    i18 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i49 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i49 = 268435456;
                    }
                    i18 |= i49;
                }
                i55 = i17 & 1024;
                if (i55 != 0) {
                    i56 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f17)) {
                        i57 = 4;
                    } else {
                        i57 = 2;
                    }
                    i56 = i16 | i57;
                } else {
                    i56 = i16;
                }
                i58 = i17 & 2048;
                if (i58 != 0) {
                    i56 |= 48;
                } else if ((i16 & 48) == 0) {
                    if (rVarH.W(str2)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i56 |= i59;
                }
                i65 = i56;
                if ((i18 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    if (i66 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i67 != 0) {
                        str3 = null;
                    }
                    if (i19 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        gVar5 = g.Medium;
                    } else {
                        gVar5 = gVar;
                    }
                    if (i28 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if (i35 != 0) {
                        f18 = 1.0f;
                    }
                    if (i37 != 0) {
                        aVar3 = h60.a.None;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i39 != 0) {
                        gVar6 = g.Big;
                    } else {
                        gVar6 = gVar2;
                    }
                    if (i46 != 0) {
                        jH2 = Color.INSTANCE.h();
                    } else {
                        jH2 = j16;
                    }
                    if (i48 != 0) {
                        f27 = 1.0f;
                    } else {
                        f27 = f16;
                    }
                    if (i55 != 0) {
                        f28 = 0.0f;
                    } else {
                        f28 = f17;
                    }
                    if (i58 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    if (t.k()) {
                        t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                    }
                    context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new l() { // from class: h60.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.f((i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    j18 = jH;
                    m mVarD5 = v.d(mVar3, false, (l) objE, 1, null);
                    if ((i18 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i18 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zG = z16 | z17 | rVarH.G(context);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: h60.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.g(str3, num2, context, (i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    String str11 = str6;
                    m mVarO5 = i.O(v.d(mVarD5, false, (l) objE2, 1, null), str11, false, null, rVarH, i65 & 112, 6);
                    w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT5 = rVarH.t();
                    m mVarE5 = j.e(rVarH, mVarO5);
                    androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                    m mVar8 = mVar3;
                    aVarB = companion6.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC5 = n6.c(rVarH);
                    n6.i(rVarC5, w0VarI5, companion6.d());
                    n6.i(rVarC5, e0VarT5, companion6.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion6.c());
                    n6.g(rVarC5, companion6.a());
                    n6.i(rVarC5, mVarE5, companion6.e());
                    x xVar5 = x.f39368a;
                    if (aVar3 != h60.a.None) {
                        rVarH.X(-1654598786);
                        m mVarT5 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                        if ((3670016 & i18) == 1048576) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((234881024 & i18) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z216 = z19 | z18;
                        if ((1879048192 & i18) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z217 = z216 | z25;
                        if ((i65 & 14) == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z217 | z26;
                        objE3 = rVarH.E();
                        if (z27) {
                            final float f3110 = f27;
                            final h60.a aVar12 = aVar3;
                            final float f3111 = f28;
                            final long j116 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar12, j116, f3110, f3111, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar12;
                            f29 = f3110;
                            f35 = f3111;
                            rVarH.v(objE3);
                        } else {
                            final float f3112 = f27;
                            final h60.a aVar13 = aVar3;
                            final float f3113 = f28;
                            final long j117 = jH2;
                            objE3 = new l() { // from class: h60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return f.h(aVar13, j117, f3112, f3113, (p3.f) obj);
                                }
                            };
                            aVar4 = aVar13;
                            f29 = f3112;
                            f35 = f3113;
                            rVarH.v(objE3);
                        }
                        z.b(mVarT5, (l) objE3, rVarH, 0);
                    } else {
                        f29 = f27;
                        f35 = f28;
                        aVar4 = aVar3;
                        rVarH.X(-1656830817);
                    }
                    rVarH.R();
                    if (num2 == null) {
                        rVarH.X(-1653990288);
                    } else {
                        rVarH.X(-1653990287);
                        ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                        oq.i0 i0Var5 = oq.i0.f148189a;
                    }
                    rVarH.R();
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    f19 = f29;
                    f26 = f18;
                    str4 = str3;
                    gVar4 = gVar6;
                    num3 = num2;
                    j17 = jH2;
                    mVar2 = mVar8;
                    str5 = str11;
                    f25 = f35;
                    gVar3 = gVar5;
                    aVar2 = aVar4;
                    jH = j18;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    gVar3 = gVar;
                    aVar2 = aVar;
                    f19 = f16;
                    f25 = f17;
                    f26 = f18;
                    str4 = str3;
                    num3 = num2;
                    gVar4 = gVar2;
                    j17 = j16;
                    str5 = str2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: h60.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 100663296;
            i48 = i17 & 512;
            if (i48 != 0) {
                i18 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f16)) {
                    i49 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i49 = 268435456;
                }
                i18 |= i49;
            }
            i55 = i17 & 1024;
            if (i55 != 0) {
                i56 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f17)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i16 | i57;
            } else {
                i56 = i16;
            }
            i58 = i17 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i16 & 48) == 0) {
                if (rVarH.W(str2)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i66 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i67 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    num2 = null;
                }
                if (i26 != 0) {
                    gVar5 = g.Medium;
                } else {
                    gVar5 = gVar;
                }
                if (i28 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if (i35 != 0) {
                    f18 = 1.0f;
                }
                if (i37 != 0) {
                    aVar3 = h60.a.None;
                } else {
                    aVar3 = aVar;
                }
                if (i39 != 0) {
                    gVar6 = g.Big;
                } else {
                    gVar6 = gVar2;
                }
                if (i46 != 0) {
                    jH2 = Color.INSTANCE.h();
                } else {
                    jH2 = j16;
                }
                if (i48 != 0) {
                    f27 = 1.0f;
                } else {
                    f27 = f16;
                }
                if (i55 != 0) {
                    f28 = 0.0f;
                } else {
                    f28 = f17;
                }
                if (i58 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (t.k()) {
                    t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new l() { // from class: h60.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                j18 = jH;
                m mVarD6 = v.d(mVar3, false, (l) objE, 1, null);
                if ((i18 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i18 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zG = z16 | z17 | rVarH.G(context);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                String str12 = str6;
                m mVarO6 = i.O(v.d(mVarD6, false, (l) objE2, 1, null), str12, false, null, rVarH, i65 & 112, 6);
                w0 w0VarI6 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVarO6);
                androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                m mVar9 = mVar3;
                aVarB = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI6, companion7.d());
                n6.i(rVarC6, e0VarT6, companion7.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion7.c());
                n6.g(rVarC6, companion7.a());
                n6.i(rVarC6, mVarE6, companion7.e());
                x xVar6 = x.f39368a;
                if (aVar3 != h60.a.None) {
                    rVarH.X(-1654598786);
                    m mVarT6 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                    if ((3670016 & i18) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((234881024 & i18) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z218 = z19 | z18;
                    if ((1879048192 & i18) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z219 = z218 | z25;
                    if ((i65 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z219 | z26;
                    objE3 = rVarH.E();
                    if (z27) {
                        final float f3114 = f27;
                        final h60.a aVar14 = aVar3;
                        final float f3115 = f28;
                        final long j118 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar14, j118, f3114, f3115, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar14;
                        f29 = f3114;
                        f35 = f3115;
                        rVarH.v(objE3);
                    } else {
                        final float f3116 = f27;
                        final h60.a aVar15 = aVar3;
                        final float f3117 = f28;
                        final long j119 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar15, j119, f3116, f3117, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar15;
                        f29 = f3116;
                        f35 = f3117;
                        rVarH.v(objE3);
                    }
                    z.b(mVarT6, (l) objE3, rVarH, 0);
                } else {
                    f29 = f27;
                    f35 = f28;
                    aVar4 = aVar3;
                    rVarH.X(-1656830817);
                }
                rVarH.R();
                if (num2 == null) {
                    rVarH.X(-1653990288);
                } else {
                    rVarH.X(-1653990287);
                    ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                    oq.i0 i0Var6 = oq.i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                f19 = f29;
                f26 = f18;
                str4 = str3;
                gVar4 = gVar6;
                num3 = num2;
                j17 = jH2;
                mVar2 = mVar9;
                str5 = str12;
                f25 = f35;
                gVar3 = gVar5;
                aVar2 = aVar4;
                jH = j18;
            } else {
                rVarH.O();
                mVar2 = mVar;
                gVar3 = gVar;
                aVar2 = aVar;
                f19 = f16;
                f25 = f17;
                f26 = f18;
                str4 = str3;
                num3 = num2;
                gVar4 = gVar2;
                j17 = j16;
                str5 = str2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: h60.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        num2 = num;
        i26 = i17 & 8;
        if (i26 != 0) {
            i18 |= 3072;
        } else if ((i15 & 3072) == 0) {
            if (gVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = gVar.ordinal();
            }
            if (rVarH.c(iOrdinal)) {
                i27 = 2048;
            } else {
                i27 = 1024;
            }
            i18 |= i27;
        }
        i28 = i17 & 16;
        if (i28 != 0) {
            i18 |= 24576;
            jH = j15;
        } else {
            jH = j15;
            if ((i15 & 24576) == 0) {
                if (rVarH.d(jH)) {
                    i29 = 16384;
                } else {
                    i29 = PKIFailureInfo.certRevoked;
                }
                i18 |= i29;
            }
        }
        i35 = i17 & 32;
        if (i35 != 0) {
            i18 |= 196608;
            f18 = f15;
        } else {
            f18 = f15;
            if ((i15 & 196608) == 0) {
                if (rVarH.b(f18)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i36;
            }
        }
        i37 = i17 & 64;
        if (i37 != 0) {
            i18 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (aVar == null) {
                iOrdinal2 = -1;
            } else {
                iOrdinal2 = aVar.ordinal();
            }
            if (rVarH.c(iOrdinal2)) {
                i38 = PKIFailureInfo.badCertTemplate;
            } else {
                i38 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i38;
        }
        i39 = i17 & 128;
        if (i39 != 0) {
            i18 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.c(gVar2 != null ? gVar2.ordinal() : -1)) {
                i45 = 8388608;
            } else {
                i45 = 4194304;
            }
            i18 |= i45;
        }
        i46 = i17 & 256;
        if (i46 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.d(j16)) {
                    i47 = 67108864;
                } else {
                    i47 = 33554432;
                }
                i18 |= i47;
            }
            i48 = i17 & 512;
            if (i48 != 0) {
                i18 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f16)) {
                    i49 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i49 = 268435456;
                }
                i18 |= i49;
            }
            i55 = i17 & 1024;
            if (i55 != 0) {
                i56 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f17)) {
                    i57 = 4;
                } else {
                    i57 = 2;
                }
                i56 = i16 | i57;
            } else {
                i56 = i16;
            }
            i58 = i17 & 2048;
            if (i58 != 0) {
                i56 |= 48;
            } else if ((i16 & 48) == 0) {
                if (rVarH.W(str2)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i56 |= i59;
            }
            i65 = i56;
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i66 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i67 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    num2 = null;
                }
                if (i26 != 0) {
                    gVar5 = g.Medium;
                } else {
                    gVar5 = gVar;
                }
                if (i28 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if (i35 != 0) {
                    f18 = 1.0f;
                }
                if (i37 != 0) {
                    aVar3 = h60.a.None;
                } else {
                    aVar3 = aVar;
                }
                if (i39 != 0) {
                    gVar6 = g.Big;
                } else {
                    gVar6 = gVar2;
                }
                if (i46 != 0) {
                    jH2 = Color.INSTANCE.h();
                } else {
                    jH2 = j16;
                }
                if (i48 != 0) {
                    f27 = 1.0f;
                } else {
                    f27 = f16;
                }
                if (i55 != 0) {
                    f28 = 0.0f;
                } else {
                    f28 = f17;
                }
                if (i58 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                if (t.k()) {
                    t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new l() { // from class: h60.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.f((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                j18 = jH;
                m mVarD7 = v.d(mVar3, false, (l) objE, 1, null);
                if ((i18 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i18 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zG = z16 | z17 | rVarH.G(context);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: h60.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.g(str3, num2, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                String str13 = str6;
                m mVarO7 = i.O(v.d(mVarD7, false, (l) objE2, 1, null), str13, false, null, rVarH, i65 & 112, 6);
                w0 w0VarI7 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = j.e(rVarH, mVarO7);
                androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
                m mVar10 = mVar3;
                aVarB = companion8.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarI7, companion8.d());
                n6.i(rVarC7, e0VarT7, companion8.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion8.c());
                n6.g(rVarC7, companion8.a());
                n6.i(rVarC7, mVarE7, companion8.e());
                x xVar7 = x.f39368a;
                if (aVar3 != h60.a.None) {
                    rVarH.X(-1654598786);
                    m mVarT7 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                    if ((3670016 & i18) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((234881024 & i18) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z2110 = z19 | z18;
                    if ((1879048192 & i18) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2111 = z2110 | z25;
                    if ((i65 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z2111 | z26;
                    objE3 = rVarH.E();
                    if (z27) {
                        final float f3118 = f27;
                        final h60.a aVar16 = aVar3;
                        final float f3119 = f28;
                        final long j1110 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar16, j1110, f3118, f3119, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar16;
                        f29 = f3118;
                        f35 = f3119;
                        rVarH.v(objE3);
                    } else {
                        final float f31110 = f27;
                        final h60.a aVar17 = aVar3;
                        final float f31111 = f28;
                        final long j1111 = jH2;
                        objE3 = new l() { // from class: h60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return f.h(aVar17, j1111, f31110, f31111, (p3.f) obj);
                            }
                        };
                        aVar4 = aVar17;
                        f29 = f31110;
                        f35 = f31111;
                        rVarH.v(objE3);
                    }
                    z.b(mVarT7, (l) objE3, rVarH, 0);
                } else {
                    f29 = f27;
                    f35 = f28;
                    aVar4 = aVar3;
                    rVarH.X(-1656830817);
                }
                rVarH.R();
                if (num2 == null) {
                    rVarH.X(-1653990288);
                } else {
                    rVarH.X(-1653990287);
                    ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                    oq.i0 i0Var7 = oq.i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                f19 = f29;
                f26 = f18;
                str4 = str3;
                gVar4 = gVar6;
                num3 = num2;
                j17 = jH2;
                mVar2 = mVar10;
                str5 = str13;
                f25 = f35;
                gVar3 = gVar5;
                aVar2 = aVar4;
                jH = j18;
            } else {
                rVarH.O();
                mVar2 = mVar;
                gVar3 = gVar;
                aVar2 = aVar;
                f19 = f16;
                f25 = f17;
                f26 = f18;
                str4 = str3;
                num3 = num2;
                gVar4 = gVar2;
                j17 = j16;
                str5 = str2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: h60.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 100663296;
        i48 = i17 & 512;
        if (i48 != 0) {
            i18 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            if (rVarH.b(f16)) {
                i49 = PKIFailureInfo.duplicateCertReq;
            } else {
                i49 = 268435456;
            }
            i18 |= i49;
        }
        i55 = i17 & 1024;
        if (i55 != 0) {
            i56 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.b(f17)) {
                i57 = 4;
            } else {
                i57 = 2;
            }
            i56 = i16 | i57;
        } else {
            i56 = i16;
        }
        i58 = i17 & 2048;
        if (i58 != 0) {
            i56 |= 48;
        } else if ((i16 & 48) == 0) {
            if (rVarH.W(str2)) {
                i59 = 32;
            } else {
                i59 = 16;
            }
            i56 |= i59;
        }
        i65 = i56;
        if ((i18 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i66 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar;
            }
            if (i67 != 0) {
                str3 = null;
            }
            if (i19 != 0) {
                num2 = null;
            }
            if (i26 != 0) {
                gVar5 = g.Medium;
            } else {
                gVar5 = gVar;
            }
            if (i28 != 0) {
                jH = Color.INSTANCE.h();
            }
            if (i35 != 0) {
                f18 = 1.0f;
            }
            if (i37 != 0) {
                aVar3 = h60.a.None;
            } else {
                aVar3 = aVar;
            }
            if (i39 != 0) {
                gVar6 = g.Big;
            } else {
                gVar6 = gVar2;
            }
            if (i46 != 0) {
                jH2 = Color.INSTANCE.h();
            } else {
                jH2 = j16;
            }
            if (i48 != 0) {
                f27 = 1.0f;
            } else {
                f27 = f16;
            }
            if (i55 != 0) {
                f28 = 0.0f;
            } else {
                f28 = f17;
            }
            if (i58 != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            if (t.k()) {
                t.o(1521711741, i18, i65, "pl.gov.coi.common.ui.icon.CustomIcon (IconCustom.kt:59)");
            }
            context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l() { // from class: h60.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.f((i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            j18 = jH;
            m mVarD8 = v.d(mVar3, false, (l) objE, 1, null);
            if ((i18 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i18 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            zG = z16 | z17 | rVarH.G(context);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new l() { // from class: h60.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.g(str3, num2, context, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new l() { // from class: h60.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.g(str3, num2, context, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            String str14 = str6;
            m mVarO8 = i.O(v.d(mVarD8, false, (l) objE2, 1, null), str14, false, null, rVarH, i65 & 112, 6);
            w0 w0VarI8 = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT8 = rVarH.t();
            m mVarE8 = j.e(rVarH, mVarO8);
            androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
            m mVar11 = mVar3;
            aVarB = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarI8, companion9.d());
            n6.i(rVarC8, e0VarT8, companion9.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion9.c());
            n6.g(rVarC8, companion9.a());
            n6.i(rVarC8, mVarE8, companion9.e());
            x xVar8 = x.f39368a;
            if (aVar3 != h60.a.None) {
                rVarH.X(-1654598786);
                m mVarT8 = androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar6.getDimension());
                if ((3670016 & i18) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((234881024 & i18) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z2112 = z19 | z18;
                if ((1879048192 & i18) == 536870912) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2113 = z2112 | z25;
                if ((i65 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z2113 | z26;
                objE3 = rVarH.E();
                if (z27) {
                    final float f31112 = f27;
                    final h60.a aVar18 = aVar3;
                    final float f31113 = f28;
                    final long j1112 = jH2;
                    objE3 = new l() { // from class: h60.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h(aVar18, j1112, f31112, f31113, (p3.f) obj);
                        }
                    };
                    aVar4 = aVar18;
                    f29 = f31112;
                    f35 = f31113;
                    rVarH.v(objE3);
                } else {
                    final float f31114 = f27;
                    final h60.a aVar19 = aVar3;
                    final float f31115 = f28;
                    final long j1113 = jH2;
                    objE3 = new l() { // from class: h60.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h(aVar19, j1113, f31114, f31115, (p3.f) obj);
                        }
                    };
                    aVar4 = aVar19;
                    f29 = f31114;
                    f35 = f31115;
                    rVarH.v(objE3);
                }
                z.b(mVarT8, (l) objE3, rVarH, 0);
            } else {
                f29 = f27;
                f35 = f28;
                aVar4 = aVar3;
                rVarH.X(-1656830817);
            }
            rVarH.R();
            if (num2 == null) {
                rVarH.X(-1653990288);
            } else {
                rVarH.X(-1653990287);
                ad.d(l4.c.c(num2.intValue(), rVarH, (i18 >> 6) & 14), null, k3.a.a(androidx.compose.foundation.layout.d.t(m.INSTANCE, gVar5.getDimension()), f18), j18, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | ((i18 >> 3) & 7168), 0);
                oq.i0 i0Var8 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            f19 = f29;
            f26 = f18;
            str4 = str3;
            gVar4 = gVar6;
            num3 = num2;
            j17 = jH2;
            mVar2 = mVar11;
            str5 = str14;
            f25 = f35;
            gVar3 = gVar5;
            aVar2 = aVar4;
            jH = j18;
        } else {
            rVarH.O();
            mVar2 = mVar;
            gVar3 = gVar;
            aVar2 = aVar;
            f19 = f16;
            f25 = f17;
            f26 = f18;
            str4 = str3;
            num3 = num2;
            gVar4 = gVar2;
            j17 = j16;
            str5 = str2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h60.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(mVar2, str4, num3, gVar3, jH, f26, aVar2, gVar4, j17, f19, f25, str5, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(String str, Integer num, Context context, i0 i0Var) {
        if (str == null) {
            str = "icon" + y.a(num, context);
        }
        f0.y0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(h60.a aVar, long j15, float f15, float f16, p3.f fVar) {
        int i15 = a.f81254a[aVar.ordinal()];
        if (i15 == 1) {
            p3.f.x2(fVar, j15, 0.0f, 0L, f15, null, null, 0, 118, null);
        } else if (i15 == 2) {
            p3.f.w2(fVar, j15, 0L, 0L, m3.a.b((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax)), null, f15, null, 0, 214, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(m mVar, String str, Integer num, g gVar, long j15, float f15, h60.a aVar, g gVar2, long j16, float f16, float f17, String str2, int i15, int i16, int i17, r rVar, int i18) {
        e(mVar, str, num, gVar, j15, f15, aVar, gVar2, j16, f16, f17, str2, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return oq.i0.f148189a;
    }
}
