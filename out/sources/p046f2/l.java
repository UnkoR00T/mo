package p046f2;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.window.b;
import androidx.compose.ui.window.u;
import c5.d;
import c5.h;
import c5.j;
import d1.h0;
import er.a;
import er.p;
import er.q;
import f3.m;
import h2.DropdownMenuPositionProvider;
import n3.d3;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import u0.d1;
import w0.BorderStroke;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0095\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010&\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'\"\u001a\u0010,\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lf3/m;", "modifier", "Lc5/j;", "offset", "Lw0/f3;", "scrollState", "Landroidx/compose/ui/window/u;", "properties", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Lc5/h;", "tonalElevation", "shadowElevation", "Lw0/w;", "border", "Lkotlin/Function1;", "Ld1/h0;", "content", "e", "(ZLer/a;Lf3/m;JLw0/f3;Landroidx/compose/ui/window/u;Ln3/y2;JFFLw0/w;Ler/q;Lm2/r;III)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Lf2/ae;", "colors", "Ld1/d3;", "contentPadding", "Lb1/l;", "interactionSource", "f", "(Ler/p;Ler/a;Lf3/m;Ler/p;Ler/p;ZLf2/ae;Ld1/d3;Lb1/l;Lm2/r;II)V", "a", "Landroidx/compose/ui/window/u;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/u;", "DefaultMenuProperties", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f56626a = new u(true, false, false, false, false, 30, null);

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:160:0x0205  */
    /* JADX WARN: Code duplicated, block: B:161:0x020e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0213  */
    /* JADX WARN: Code duplicated, block: B:165:0x021f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0223  */
    /* JADX WARN: Code duplicated, block: B:168:0x022a  */
    /* JADX WARN: Code duplicated, block: B:170:0x022e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0235  */
    /* JADX WARN: Code duplicated, block: B:173:0x0239  */
    /* JADX WARN: Code duplicated, block: B:174:0x0248  */
    /* JADX WARN: Code duplicated, block: B:177:0x025f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0273  */
    /* JADX WARN: Code duplicated, block: B:183:0x0292  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x0361  */
    /* JADX WARN: Code duplicated, block: B:205:0x0374  */
    /* JADX WARN: Code duplicated, block: B:208:0x038c  */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void e(final boolean z15, final a<i0> aVar, m mVar, long j15, f3 f3Var, u uVar, y2 y2Var, long j16, float f15, float f16, BorderStroke borderStroke, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        a<i0> aVar2;
        m mVar2;
        int i19;
        int i25;
        int i26;
        f3 f3VarB;
        int i27;
        u uVar2;
        int i28;
        y2 y2Var2;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        boolean z16;
        r rVar2;
        final long jC;
        final float f17;
        final f3 f3Var2;
        final u uVar3;
        final m mVar3;
        final y2 y2Var3;
        final long j17;
        final float f18;
        final BorderStroke borderStroke2;
        d5 d5VarM;
        m mVar4;
        boolean z17;
        y2 y2VarE;
        long jA;
        float f19;
        float fD;
        final BorderStroke borderStroke3;
        final m mVar5;
        final f3 f3Var3;
        final y2 y2Var4;
        final long j18;
        final float f25;
        final float f26;
        Object objE;
        r.Companion companion;
        final d1 d1Var;
        Object objE2;
        final a3 a3Var;
        d dVar;
        boolean zW;
        Object objE3;
        final a3 a3Var2;
        int i47;
        int i48;
        int i49;
        r rVarH = rVar.h(1725609375);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar2 = aVar;
            i18 |= rVarH.G(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        int i55 = i17 & 4;
        if (i55 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    int i56 = i18;
                    if (rVarH.d(j15)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i26 = i56 | i25;
                }
                if ((i15 & 24576) == 0) {
                    if ((i17 & 16) == 0) {
                        f3VarB = f3Var;
                        if (rVarH.W(f3VarB)) {
                            i49 = 16384;
                        }
                        i26 |= i49;
                    } else {
                        f3VarB = f3Var;
                    }
                    i49 = PKIFailureInfo.certRevoked;
                    i26 |= i49;
                } else {
                    f3VarB = f3Var;
                }
                i27 = i17 & 32;
                if (i27 != 0) {
                    i26 |= 196608;
                    uVar2 = uVar;
                } else {
                    uVar2 = uVar;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.W(uVar2)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i26 |= i28;
                    }
                }
                if ((i15 & 1572864) == 0) {
                    y2Var2 = y2Var;
                    if ((i17 & 64) == 0 || !rVarH.W(y2Var2)) {
                        i48 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i48 = PKIFailureInfo.badCertTemplate;
                    }
                    i26 |= i48;
                } else {
                    y2Var2 = y2Var;
                }
                if ((i15 & 12582912) != 0) {
                    i26 |= ((i17 & 128) == 0 || !rVarH.d(j16)) ? 4194304 : 8388608;
                }
                i29 = i17 & 256;
                if (i29 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.b(f15)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i26 |= i35;
                    }
                    i36 = i17 & 512;
                    if (i36 != 0) {
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.b(f16)) {
                                i37 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i37 = 268435456;
                            }
                            i26 |= i37;
                        }
                        i38 = i17 & 1024;
                        if (i38 != 0) {
                            i39 = i16 | 6;
                        } else if ((i16 & 6) == 0) {
                            if (rVarH.W(borderStroke)) {
                                i45 = 4;
                            } else {
                                i45 = 2;
                            }
                            i39 = i16 | i45;
                        } else {
                            i39 = i16;
                        }
                        if ((i16 & 48) == 0) {
                            if (rVarH.G(qVar)) {
                                i47 = 32;
                            } else {
                                i47 = 16;
                            }
                            i39 |= i47;
                        }
                        i46 = i39;
                        if ((i26 & 306783379) == 306783378 || (i46 & 19) != 18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (rVarH.r(z16, i26 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i55 != 0) {
                                    mVar4 = m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if (i19 != 0) {
                                    float f27 = 0;
                                    jC = j.c((((long) Float.floatToRawIntBits(h.n(f27))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f27))) << 32));
                                } else {
                                    jC = j15;
                                }
                                if ((i17 & 16) != 0) {
                                    z17 = false;
                                    f3VarB = u2.b(0, rVarH, 0, 1);
                                    i26 &= -57345;
                                } else {
                                    z17 = false;
                                }
                                if (i27 != 0) {
                                    uVar2 = f56626a;
                                }
                                if ((i17 & 64) != 0) {
                                    y2VarE = zd.f58497a.e(rVarH, 6);
                                    i26 &= -3670017;
                                } else {
                                    y2VarE = y2Var2;
                                }
                                if ((i17 & 128) != 0) {
                                    jA = zd.f58497a.a(rVarH, 6);
                                    i26 &= -29360129;
                                } else {
                                    jA = j16;
                                }
                                if (i29 != 0) {
                                    f19 = zd.f58497a.f();
                                } else {
                                    f19 = f15;
                                }
                                if (i36 != 0) {
                                    fD = zd.f58497a.d();
                                } else {
                                    fD = f16;
                                }
                                if (i38 != 0) {
                                    mVar5 = mVar4;
                                    f3Var3 = f3VarB;
                                    y2Var4 = y2VarE;
                                    j18 = jA;
                                    f25 = f19;
                                    f26 = fD;
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                    mVar5 = mVar4;
                                    f3Var3 = f3VarB;
                                    y2Var4 = y2VarE;
                                    j18 = jA;
                                    f25 = f19;
                                    f26 = fD;
                                }
                            } else {
                                rVarH.O();
                                if ((i17 & 16) != 0) {
                                    i26 &= -57345;
                                }
                                if ((i17 & 64) != 0) {
                                    i26 &= -3670017;
                                }
                                if ((i17 & 128) != 0) {
                                    i26 &= -29360129;
                                }
                                j18 = j16;
                                f25 = f15;
                                f26 = f16;
                                borderStroke3 = borderStroke;
                                z17 = false;
                                f3Var3 = f3VarB;
                                mVar5 = mVar2;
                                y2Var4 = y2Var2;
                                jC = j15;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                            }
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = new d1(Boolean.FALSE);
                                rVarH.v(objE);
                            }
                            d1Var = (d1) objE;
                            d1Var.h(Boolean.valueOf(z15));
                            if (!((Boolean) d1Var.a()).booleanValue() || ((Boolean) d1Var.b()).booleanValue()) {
                                rVarH.X(1165893498);
                                objE2 = rVarH.E();
                                if (objE2 == companion.a()) {
                                    objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                    rVarH.v(objE2);
                                }
                                a3Var = (a3) objE2;
                                dVar = (d) rVarH.N(g1.f());
                                if ((i26 & 7168) == 2048) {
                                    z17 = true;
                                }
                                zW = z17 | rVarH.W(dVar);
                                objE3 = rVarH.E();
                                if (!zW || objE3 == companion.a()) {
                                    objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                        }
                                    }, 16, null);
                                    a3Var2 = a3Var;
                                    rVarH.v(objE3);
                                } else {
                                    a3Var2 = a3Var;
                                }
                                b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                                rVar2 = rVarH;
                                rVar2.R();
                            } else {
                                rVarH.X(1167162979);
                                rVarH.R();
                                rVar2 = rVarH;
                            }
                            if (t.k()) {
                                t.n();
                            }
                            uVar3 = uVar2;
                            mVar3 = mVar5;
                            f3Var2 = f3Var3;
                            y2Var3 = y2Var4;
                            j17 = j18;
                            f18 = f25;
                            f17 = f26;
                            borderStroke2 = borderStroke3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            jC = j15;
                            f17 = f16;
                            f3Var2 = f3VarB;
                            uVar3 = uVar2;
                            mVar3 = mVar2;
                            y2Var3 = y2Var2;
                            j17 = j16;
                            f18 = f15;
                            borderStroke2 = borderStroke;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.j
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i26 |= 805306368;
                    i38 = i17 & 1024;
                    if (i38 != 0) {
                        i39 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i39 = i16 | i45;
                    } else {
                        i39 = i16;
                    }
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(qVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    i46 = i39;
                    if ((i26 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (rVarH.r(z16, i26 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f28 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f28))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f28))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        } else {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f29 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f29))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f29))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new d1(Boolean.FALSE);
                            rVarH.v(objE);
                        }
                        d1Var = (d1) objE;
                        d1Var.h(Boolean.valueOf(z15));
                        if (((Boolean) d1Var.a()).booleanValue()) {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        } else {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        uVar3 = uVar2;
                        mVar3 = mVar5;
                        f3Var2 = f3Var3;
                        y2Var3 = y2Var4;
                        j17 = j18;
                        f18 = f25;
                        f17 = f26;
                        borderStroke2 = borderStroke3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        jC = j15;
                        f17 = f16;
                        f3Var2 = f3VarB;
                        uVar3 = uVar2;
                        mVar3 = mVar2;
                        y2Var3 = y2Var2;
                        j17 = j16;
                        f18 = f15;
                        borderStroke2 = borderStroke;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i26 |= 100663296;
                i36 = i17 & 512;
                if (i36 != 0) {
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.b(f16)) {
                            i37 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i37 = 268435456;
                        }
                        i26 |= i37;
                    }
                    i38 = i17 & 1024;
                    if (i38 != 0) {
                        i39 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i39 = i16 | i45;
                    } else {
                        i39 = i16;
                    }
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(qVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    i46 = i39;
                    if ((i26 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (rVarH.r(z16, i26 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f210 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f210))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f210))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        } else {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f211 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f211))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f211))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new d1(Boolean.FALSE);
                            rVarH.v(objE);
                        }
                        d1Var = (d1) objE;
                        d1Var.h(Boolean.valueOf(z15));
                        if (((Boolean) d1Var.a()).booleanValue()) {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        } else {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        uVar3 = uVar2;
                        mVar3 = mVar5;
                        f3Var2 = f3Var3;
                        y2Var3 = y2Var4;
                        j17 = j18;
                        f18 = f25;
                        f17 = f26;
                        borderStroke2 = borderStroke3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        jC = j15;
                        f17 = f16;
                        f3Var2 = f3VarB;
                        uVar3 = uVar2;
                        mVar3 = mVar2;
                        y2Var3 = y2Var2;
                        j17 = j16;
                        f18 = f15;
                        borderStroke2 = borderStroke;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i26 |= 805306368;
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f212 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f212))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f212))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f213 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f213))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f213))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            i26 = i18;
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    f3VarB = f3Var;
                    if (rVarH.W(f3VarB)) {
                        i49 = 16384;
                    }
                    i26 |= i49;
                } else {
                    f3VarB = f3Var;
                }
                i49 = PKIFailureInfo.certRevoked;
                i26 |= i49;
            } else {
                f3VarB = f3Var;
            }
            i27 = i17 & 32;
            if (i27 != 0) {
                i26 |= 196608;
                uVar2 = uVar;
            } else {
                uVar2 = uVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(uVar2)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i26 |= i28;
                }
            }
            if ((i15 & 1572864) == 0) {
                y2Var2 = y2Var;
                if ((i17 & 64) == 0) {
                    i48 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i48 = PKIFailureInfo.signerNotTrusted;
                }
                i26 |= i48;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 12582912) != 0) {
                i26 |= ((i17 & 128) == 0 || !rVarH.d(j16)) ? 4194304 : 8388608;
            }
            i29 = i17 & 256;
            if (i29 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f15)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i26 |= i35;
                }
                i36 = i17 & 512;
                if (i36 != 0) {
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.b(f16)) {
                            i37 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i37 = 268435456;
                        }
                        i26 |= i37;
                    }
                    i38 = i17 & 1024;
                    if (i38 != 0) {
                        i39 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i39 = i16 | i45;
                    } else {
                        i39 = i16;
                    }
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(qVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    i46 = i39;
                    if ((i26 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (rVarH.r(z16, i26 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f214 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f214))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f214))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        } else {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f215 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f215))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f215))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new d1(Boolean.FALSE);
                            rVarH.v(objE);
                        }
                        d1Var = (d1) objE;
                        d1Var.h(Boolean.valueOf(z15));
                        if (((Boolean) d1Var.a()).booleanValue()) {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        } else {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        uVar3 = uVar2;
                        mVar3 = mVar5;
                        f3Var2 = f3Var3;
                        y2Var3 = y2Var4;
                        j17 = j18;
                        f18 = f25;
                        f17 = f26;
                        borderStroke2 = borderStroke3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        jC = j15;
                        f17 = f16;
                        f3Var2 = f3VarB;
                        uVar3 = uVar2;
                        mVar3 = mVar2;
                        y2Var3 = y2Var2;
                        j17 = j16;
                        f18 = f15;
                        borderStroke2 = borderStroke;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i26 |= 805306368;
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f216 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f216))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f216))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f217 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f217))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f217))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i26 |= 100663296;
            i36 = i17 & 512;
            if (i36 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i26 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f218 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f218))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f218))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f219 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f219))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f219))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i26 |= 805306368;
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.W(borderStroke)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(qVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i39 |= i47;
            }
            i46 = i39;
            if ((i26 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (rVarH.r(z16, i26 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f2110 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f2110))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2110))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                } else {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f2111 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f2111))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2111))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new d1(Boolean.FALSE);
                    rVarH.v(objE);
                }
                d1Var = (d1) objE;
                d1Var.h(Boolean.valueOf(z15));
                if (((Boolean) d1Var.a()).booleanValue()) {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                } else {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                uVar3 = uVar2;
                mVar3 = mVar5;
                f3Var2 = f3Var3;
                y2Var3 = y2Var4;
                j17 = j18;
                f18 = f25;
                f17 = f26;
                borderStroke2 = borderStroke3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                jC = j15;
                f17 = f16;
                f3Var2 = f3VarB;
                uVar3 = uVar2;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = j16;
                f18 = f15;
                borderStroke2 = borderStroke;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                int i57 = i18;
                if (rVarH.d(j15)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i26 = i57 | i25;
            }
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    f3VarB = f3Var;
                    if (rVarH.W(f3VarB)) {
                        i49 = 16384;
                    }
                    i26 |= i49;
                } else {
                    f3VarB = f3Var;
                }
                i49 = PKIFailureInfo.certRevoked;
                i26 |= i49;
            } else {
                f3VarB = f3Var;
            }
            i27 = i17 & 32;
            if (i27 != 0) {
                i26 |= 196608;
                uVar2 = uVar;
            } else {
                uVar2 = uVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(uVar2)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i26 |= i28;
                }
            }
            if ((i15 & 1572864) == 0) {
                y2Var2 = y2Var;
                if ((i17 & 64) == 0) {
                    i48 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i48 = PKIFailureInfo.signerNotTrusted;
                }
                i26 |= i48;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 12582912) != 0) {
                i26 |= ((i17 & 128) == 0 || !rVarH.d(j16)) ? 4194304 : 8388608;
            }
            i29 = i17 & 256;
            if (i29 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f15)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i26 |= i35;
                }
                i36 = i17 & 512;
                if (i36 != 0) {
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.b(f16)) {
                            i37 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i37 = 268435456;
                        }
                        i26 |= i37;
                    }
                    i38 = i17 & 1024;
                    if (i38 != 0) {
                        i39 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i39 = i16 | i45;
                    } else {
                        i39 = i16;
                    }
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(qVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    i46 = i39;
                    if ((i26 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (rVarH.r(z16, i26 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f2112 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f2112))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2112))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        } else {
                            if (i55 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i19 != 0) {
                                float f2113 = 0;
                                jC = j.c((((long) Float.floatToRawIntBits(h.n(f2113))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2113))) << 32));
                            } else {
                                jC = j15;
                            }
                            if ((i17 & 16) != 0) {
                                z17 = false;
                                f3VarB = u2.b(0, rVarH, 0, 1);
                                i26 &= -57345;
                            } else {
                                z17 = false;
                            }
                            if (i27 != 0) {
                                uVar2 = f56626a;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarE = zd.f58497a.e(rVarH, 6);
                                i26 &= -3670017;
                            } else {
                                y2VarE = y2Var2;
                            }
                            if ((i17 & 128) != 0) {
                                jA = zd.f58497a.a(rVarH, 6);
                                i26 &= -29360129;
                            } else {
                                jA = j16;
                            }
                            if (i29 != 0) {
                                f19 = zd.f58497a.f();
                            } else {
                                f19 = f15;
                            }
                            if (i36 != 0) {
                                fD = zd.f58497a.d();
                            } else {
                                fD = f16;
                            }
                            if (i38 != 0) {
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                mVar5 = mVar4;
                                f3Var3 = f3VarB;
                                y2Var4 = y2VarE;
                                j18 = jA;
                                f25 = f19;
                                f26 = fD;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new d1(Boolean.FALSE);
                            rVarH.v(objE);
                        }
                        d1Var = (d1) objE;
                        d1Var.h(Boolean.valueOf(z15));
                        if (((Boolean) d1Var.a()).booleanValue()) {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        } else {
                            rVarH.X(1165893498);
                            objE2 = rVarH.E();
                            if (objE2 == companion.a()) {
                                objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                                rVarH.v(objE2);
                            }
                            a3Var = (a3) objE2;
                            dVar = (d) rVarH.N(g1.f());
                            if ((i26 & 7168) == 2048) {
                                z17 = true;
                            }
                            zW = z17 | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                    }
                                }, 16, null);
                                a3Var2 = a3Var;
                                rVarH.v(objE3);
                            }
                            b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                            rVar2 = rVarH;
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        uVar3 = uVar2;
                        mVar3 = mVar5;
                        f3Var2 = f3Var3;
                        y2Var3 = y2Var4;
                        j17 = j18;
                        f18 = f25;
                        f17 = f26;
                        borderStroke2 = borderStroke3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        jC = j15;
                        f17 = f16;
                        f3Var2 = f3VarB;
                        uVar3 = uVar2;
                        mVar3 = mVar2;
                        y2Var3 = y2Var2;
                        j17 = j16;
                        f18 = f15;
                        borderStroke2 = borderStroke;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i26 |= 805306368;
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f2114 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f2114))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2114))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f2115 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f2115))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2115))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i26 |= 100663296;
            i36 = i17 & 512;
            if (i36 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i26 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f2116 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f2116))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2116))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f2117 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f2117))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2117))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i26 |= 805306368;
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.W(borderStroke)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(qVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i39 |= i47;
            }
            i46 = i39;
            if ((i26 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (rVarH.r(z16, i26 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f2118 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f2118))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2118))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                } else {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f2119 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f2119))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f2119))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new d1(Boolean.FALSE);
                    rVarH.v(objE);
                }
                d1Var = (d1) objE;
                d1Var.h(Boolean.valueOf(z15));
                if (((Boolean) d1Var.a()).booleanValue()) {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                } else {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                uVar3 = uVar2;
                mVar3 = mVar5;
                f3Var2 = f3Var3;
                y2Var3 = y2Var4;
                j17 = j18;
                f18 = f25;
                f17 = f26;
                borderStroke2 = borderStroke3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                jC = j15;
                f17 = f16;
                f3Var2 = f3VarB;
                uVar3 = uVar2;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = j16;
                f18 = f15;
                borderStroke2 = borderStroke;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        i26 = i18;
        if ((i15 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                f3VarB = f3Var;
                if (rVarH.W(f3VarB)) {
                    i49 = 16384;
                }
                i26 |= i49;
            } else {
                f3VarB = f3Var;
            }
            i49 = PKIFailureInfo.certRevoked;
            i26 |= i49;
        } else {
            f3VarB = f3Var;
        }
        i27 = i17 & 32;
        if (i27 != 0) {
            i26 |= 196608;
            uVar2 = uVar;
        } else {
            uVar2 = uVar;
            if ((i15 & 196608) == 0) {
                if (rVarH.W(uVar2)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i26 |= i28;
            }
        }
        if ((i15 & 1572864) == 0) {
            y2Var2 = y2Var;
            if ((i17 & 64) == 0) {
                i48 = PKIFailureInfo.signerNotTrusted;
            } else {
                i48 = PKIFailureInfo.signerNotTrusted;
            }
            i26 |= i48;
        } else {
            y2Var2 = y2Var;
        }
        if ((i15 & 12582912) != 0) {
            i26 |= ((i17 & 128) == 0 || !rVarH.d(j16)) ? 4194304 : 8388608;
        }
        i29 = i17 & 256;
        if (i29 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.b(f15)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i26 |= i35;
            }
            i36 = i17 & 512;
            if (i36 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i26 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(qVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                i46 = i39;
                if ((i26 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (rVarH.r(z16, i26 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f21110 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f21110))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21110))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    } else {
                        if (i55 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            float f21111 = 0;
                            jC = j.c((((long) Float.floatToRawIntBits(h.n(f21111))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21111))) << 32));
                        } else {
                            jC = j15;
                        }
                        if ((i17 & 16) != 0) {
                            z17 = false;
                            f3VarB = u2.b(0, rVarH, 0, 1);
                            i26 &= -57345;
                        } else {
                            z17 = false;
                        }
                        if (i27 != 0) {
                            uVar2 = f56626a;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarE = zd.f58497a.e(rVarH, 6);
                            i26 &= -3670017;
                        } else {
                            y2VarE = y2Var2;
                        }
                        if ((i17 & 128) != 0) {
                            jA = zd.f58497a.a(rVarH, 6);
                            i26 &= -29360129;
                        } else {
                            jA = j16;
                        }
                        if (i29 != 0) {
                            f19 = zd.f58497a.f();
                        } else {
                            f19 = f15;
                        }
                        if (i36 != 0) {
                            fD = zd.f58497a.d();
                        } else {
                            fD = f16;
                        }
                        if (i38 != 0) {
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                            mVar5 = mVar4;
                            f3Var3 = f3VarB;
                            y2Var4 = y2VarE;
                            j18 = jA;
                            f25 = f19;
                            f26 = fD;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new d1(Boolean.FALSE);
                        rVarH.v(objE);
                    }
                    d1Var = (d1) objE;
                    d1Var.h(Boolean.valueOf(z15));
                    if (((Boolean) d1Var.a()).booleanValue()) {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    } else {
                        rVarH.X(1165893498);
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                            rVarH.v(objE2);
                        }
                        a3Var = (a3) objE2;
                        dVar = (d) rVarH.N(g1.f());
                        if ((i26 & 7168) == 2048) {
                            z17 = true;
                        }
                        zW = z17 | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                                }
                            }, 16, null);
                            a3Var2 = a3Var;
                            rVarH.v(objE3);
                        }
                        b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                        rVar2 = rVarH;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    uVar3 = uVar2;
                    mVar3 = mVar5;
                    f3Var2 = f3Var3;
                    y2Var3 = y2Var4;
                    j17 = j18;
                    f18 = f25;
                    f17 = f26;
                    borderStroke2 = borderStroke3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    jC = j15;
                    f17 = f16;
                    f3Var2 = f3VarB;
                    uVar3 = uVar2;
                    mVar3 = mVar2;
                    y2Var3 = y2Var2;
                    j17 = j16;
                    f18 = f15;
                    borderStroke2 = borderStroke;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i26 |= 805306368;
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.W(borderStroke)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(qVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i39 |= i47;
            }
            i46 = i39;
            if ((i26 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (rVarH.r(z16, i26 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f21112 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f21112))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21112))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                } else {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f21113 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f21113))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21113))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new d1(Boolean.FALSE);
                    rVarH.v(objE);
                }
                d1Var = (d1) objE;
                d1Var.h(Boolean.valueOf(z15));
                if (((Boolean) d1Var.a()).booleanValue()) {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                } else {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                uVar3 = uVar2;
                mVar3 = mVar5;
                f3Var2 = f3Var3;
                y2Var3 = y2Var4;
                j17 = j18;
                f18 = f25;
                f17 = f26;
                borderStroke2 = borderStroke3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                jC = j15;
                f17 = f16;
                f3Var2 = f3VarB;
                uVar3 = uVar2;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = j16;
                f18 = f15;
                borderStroke2 = borderStroke;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i26 |= 100663296;
        i36 = i17 & 512;
        if (i36 != 0) {
            if ((i15 & 805306368) == 0) {
                if (rVarH.b(f16)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i26 |= i37;
            }
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.W(borderStroke)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(qVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i39 |= i47;
            }
            i46 = i39;
            if ((i26 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (rVarH.r(z16, i26 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f21114 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f21114))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21114))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                } else {
                    if (i55 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        float f21115 = 0;
                        jC = j.c((((long) Float.floatToRawIntBits(h.n(f21115))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21115))) << 32));
                    } else {
                        jC = j15;
                    }
                    if ((i17 & 16) != 0) {
                        z17 = false;
                        f3VarB = u2.b(0, rVarH, 0, 1);
                        i26 &= -57345;
                    } else {
                        z17 = false;
                    }
                    if (i27 != 0) {
                        uVar2 = f56626a;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarE = zd.f58497a.e(rVarH, 6);
                        i26 &= -3670017;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i17 & 128) != 0) {
                        jA = zd.f58497a.a(rVarH, 6);
                        i26 &= -29360129;
                    } else {
                        jA = j16;
                    }
                    if (i29 != 0) {
                        f19 = zd.f58497a.f();
                    } else {
                        f19 = f15;
                    }
                    if (i36 != 0) {
                        fD = zd.f58497a.d();
                    } else {
                        fD = f16;
                    }
                    if (i38 != 0) {
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                        mVar5 = mVar4;
                        f3Var3 = f3VarB;
                        y2Var4 = y2VarE;
                        j18 = jA;
                        f25 = f19;
                        f26 = fD;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new d1(Boolean.FALSE);
                    rVarH.v(objE);
                }
                d1Var = (d1) objE;
                d1Var.h(Boolean.valueOf(z15));
                if (((Boolean) d1Var.a()).booleanValue()) {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                } else {
                    rVarH.X(1165893498);
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                        rVarH.v(objE2);
                    }
                    a3Var = (a3) objE2;
                    dVar = (d) rVarH.N(g1.f());
                    if ((i26 & 7168) == 2048) {
                        z17 = true;
                    }
                    zW = z17 | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                            }
                        }, 16, null);
                        a3Var2 = a3Var;
                        rVarH.v(objE3);
                    }
                    b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                    rVar2 = rVarH;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                uVar3 = uVar2;
                mVar3 = mVar5;
                f3Var2 = f3Var3;
                y2Var3 = y2Var4;
                j17 = j18;
                f18 = f25;
                f17 = f26;
                borderStroke2 = borderStroke3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                jC = j15;
                f17 = f16;
                f3Var2 = f3VarB;
                uVar3 = uVar2;
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                j17 = j16;
                f18 = f15;
                borderStroke2 = borderStroke;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i26 |= 805306368;
        i38 = i17 & 1024;
        if (i38 != 0) {
            i39 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.W(borderStroke)) {
                i45 = 4;
            } else {
                i45 = 2;
            }
            i39 = i16 | i45;
        } else {
            i39 = i16;
        }
        if ((i16 & 48) == 0) {
            if (rVarH.G(qVar)) {
                i47 = 32;
            } else {
                i47 = 16;
            }
            i39 |= i47;
        }
        i46 = i39;
        if ((i26 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (rVarH.r(z16, i26 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i55 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i19 != 0) {
                    float f21116 = 0;
                    jC = j.c((((long) Float.floatToRawIntBits(h.n(f21116))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21116))) << 32));
                } else {
                    jC = j15;
                }
                if ((i17 & 16) != 0) {
                    z17 = false;
                    f3VarB = u2.b(0, rVarH, 0, 1);
                    i26 &= -57345;
                } else {
                    z17 = false;
                }
                if (i27 != 0) {
                    uVar2 = f56626a;
                }
                if ((i17 & 64) != 0) {
                    y2VarE = zd.f58497a.e(rVarH, 6);
                    i26 &= -3670017;
                } else {
                    y2VarE = y2Var2;
                }
                if ((i17 & 128) != 0) {
                    jA = zd.f58497a.a(rVarH, 6);
                    i26 &= -29360129;
                } else {
                    jA = j16;
                }
                if (i29 != 0) {
                    f19 = zd.f58497a.f();
                } else {
                    f19 = f15;
                }
                if (i36 != 0) {
                    fD = zd.f58497a.d();
                } else {
                    fD = f16;
                }
                if (i38 != 0) {
                    mVar5 = mVar4;
                    f3Var3 = f3VarB;
                    y2Var4 = y2VarE;
                    j18 = jA;
                    f25 = f19;
                    f26 = fD;
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                    mVar5 = mVar4;
                    f3Var3 = f3VarB;
                    y2Var4 = y2VarE;
                    j18 = jA;
                    f25 = f19;
                    f26 = fD;
                }
            } else {
                if (i55 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i19 != 0) {
                    float f21117 = 0;
                    jC = j.c((((long) Float.floatToRawIntBits(h.n(f21117))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(h.n(f21117))) << 32));
                } else {
                    jC = j15;
                }
                if ((i17 & 16) != 0) {
                    z17 = false;
                    f3VarB = u2.b(0, rVarH, 0, 1);
                    i26 &= -57345;
                } else {
                    z17 = false;
                }
                if (i27 != 0) {
                    uVar2 = f56626a;
                }
                if ((i17 & 64) != 0) {
                    y2VarE = zd.f58497a.e(rVarH, 6);
                    i26 &= -3670017;
                } else {
                    y2VarE = y2Var2;
                }
                if ((i17 & 128) != 0) {
                    jA = zd.f58497a.a(rVarH, 6);
                    i26 &= -29360129;
                } else {
                    jA = j16;
                }
                if (i29 != 0) {
                    f19 = zd.f58497a.f();
                } else {
                    f19 = f15;
                }
                if (i36 != 0) {
                    fD = zd.f58497a.d();
                } else {
                    fD = f16;
                }
                if (i38 != 0) {
                    mVar5 = mVar4;
                    f3Var3 = f3VarB;
                    y2Var4 = y2VarE;
                    j18 = jA;
                    f25 = f19;
                    f26 = fD;
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                    mVar5 = mVar4;
                    f3Var3 = f3VarB;
                    y2Var4 = y2VarE;
                    j18 = jA;
                    f25 = f19;
                    f26 = fD;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1725609375, i26, i46, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:56)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new d1(Boolean.FALSE);
                rVarH.v(objE);
            }
            d1Var = (d1) objE;
            d1Var.h(Boolean.valueOf(z15));
            if (((Boolean) d1Var.a()).booleanValue()) {
                rVarH.X(1165893498);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                    rVarH.v(objE2);
                }
                a3Var = (a3) objE2;
                dVar = (d) rVarH.N(g1.f());
                if ((i26 & 7168) == 2048) {
                    z17 = true;
                }
                zW = z17 | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                        }
                    }, 16, null);
                    a3Var2 = a3Var;
                    rVarH.v(objE3);
                } else {
                    objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                        }
                    }, 16, null);
                    a3Var2 = a3Var;
                    rVarH.v(objE3);
                }
                b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVarH.X(1165893498);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = c6.e(d3.b(d3.INSTANCE.a()), null, 2, null);
                    rVarH.v(objE2);
                }
                a3Var = (a3) objE2;
                dVar = (d) rVarH.N(g1.f());
                if ((i26 & 7168) == 2048) {
                    z17 = true;
                }
                zW = z17 | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                        }
                    }, 16, null);
                    a3Var2 = a3Var;
                    rVarH.v(objE3);
                } else {
                    objE3 = new DropdownMenuPositionProvider(a3Var, jC, dVar, yd.a.f58347a, 0, 0, new p() { // from class: f2.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.h(a3Var, (c5.p) obj, (c5.p) obj2);
                        }
                    }, 16, null);
                    a3Var2 = a3Var;
                    rVarH.v(objE3);
                }
                b.a((DropdownMenuPositionProvider) objE3, aVar2, uVar2, y2.m.d(-917492520, true, new p() { // from class: f2.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.i(mVar5, d1Var, a3Var2, f3Var3, y2Var4, j18, f25, f26, borderStroke3, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                rVar2 = rVarH;
                rVar2.R();
            }
            if (t.k()) {
                t.n();
            }
            uVar3 = uVar2;
            mVar3 = mVar5;
            f3Var2 = f3Var3;
            y2Var3 = y2Var4;
            j17 = j18;
            f18 = f25;
            f17 = f26;
            borderStroke2 = borderStroke3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            jC = j15;
            f17 = f16;
            f3Var2 = f3VarB;
            uVar3 = uVar2;
            mVar3 = mVar2;
            y2Var3 = y2Var2;
            j17 = j16;
            f18 = f15;
            borderStroke2 = borderStroke;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(z15, aVar, mVar3, jC, f3Var2, uVar3, y2Var3, j17, f18, f17, borderStroke2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    public static final void f(final p<? super r, ? super Integer, i0> pVar, final a<i0> aVar, m mVar, p<? super r, ? super Integer, i0> pVar2, p<? super r, ? super Integer, i0> pVar3, boolean z15, ae aeVar, d1.d3 d3Var, b1.l lVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        p<? super r, ? super Integer, i0> pVar4;
        int i19;
        int i25;
        p<? super r, ? super Integer, i0> pVar5;
        int i26;
        int i27;
        boolean z16;
        int i28;
        ae aeVarG;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z17;
        r rVar2;
        final b1.l lVar2;
        final m mVar3;
        final p<? super r, ? super Integer, i0> pVar6;
        final p<? super r, ? super Integer, i0> pVar7;
        final boolean z18;
        final ae aeVar2;
        final d1.d3 d3Var2;
        d5 d5VarM;
        int i39;
        d1.d3 d3VarC;
        b1.l lVar3;
        d1.d3 d3Var3;
        int i45;
        r rVarH = rVar.h(-532959117);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i46 = i16 & 4;
        if (i46 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        pVar5 = pVar3;
                        if (rVarH.G(pVar5)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((1572864 & i15) == 0) {
                            if ((i16 & 64) == 0) {
                                aeVarG = aeVar;
                                if (rVarH.W(aeVarG)) {
                                    i45 = PKIFailureInfo.badCertTemplate;
                                }
                                i17 |= i45;
                            } else {
                                aeVarG = aeVar;
                            }
                            i45 = PKIFailureInfo.signerNotTrusted;
                            i17 |= i45;
                        } else {
                            aeVarG = aeVar;
                        }
                        i29 = i16 & 128;
                        if (i29 != 0) {
                            if ((i15 & 12582912) == 0) {
                                if (rVarH.W(d3Var)) {
                                    i35 = 8388608;
                                } else {
                                    i35 = 4194304;
                                }
                                i17 |= i35;
                            }
                            i36 = i16 & 256;
                            if (i36 != 0) {
                                if ((i15 & 100663296) == 0) {
                                    if (rVarH.W(lVar)) {
                                        i37 = 67108864;
                                    } else {
                                        i37 = 33554432;
                                    }
                                    i17 |= i37;
                                }
                                i38 = i17;
                                if ((i17 & 38347923) != 38347922) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (rVarH.r(z17, i38 & 1)) {
                                    rVarH.I();
                                    if ((i15 & 1) != 0 || rVarH.Q()) {
                                        if (i46 != 0) {
                                            mVar2 = m.INSTANCE;
                                        }
                                        if (i18 != 0) {
                                            pVar4 = null;
                                        }
                                        if (i25 != 0) {
                                            pVar5 = null;
                                        }
                                        if (i27 != 0) {
                                            z16 = true;
                                        }
                                        if ((i16 & 64) != 0) {
                                            i39 = i38 & (-3670017);
                                            aeVarG = zd.f58497a.g(rVarH, 6);
                                        } else {
                                            i39 = i38;
                                        }
                                        if (i29 != 0) {
                                            d3VarC = zd.f58497a.c();
                                        } else {
                                            d3VarC = d3Var;
                                        }
                                        if (i36 != 0) {
                                            lVar3 = null;
                                        } else {
                                            lVar3 = lVar;
                                        }
                                        d3Var3 = d3VarC;
                                    } else {
                                        rVarH.O();
                                        if ((i16 & 64) != 0) {
                                            i39 = i38 & (-3670017);
                                            d3Var3 = d3Var;
                                            lVar3 = lVar;
                                        } else {
                                            d3Var3 = d3Var;
                                            lVar3 = lVar;
                                            i39 = i38;
                                        }
                                    }
                                    p<? super r, ? super Integer, i0> pVar8 = pVar5;
                                    boolean z19 = z16;
                                    ae aeVar3 = aeVarG;
                                    m mVar4 = mVar2;
                                    p<? super r, ? super Integer, i0> pVar9 = pVar4;
                                    rVarH.y();
                                    if (t.k()) {
                                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                    }
                                    rVar2 = rVarH;
                                    le.s(pVar, aVar, mVar4, pVar9, pVar8, z19, aeVar3, d3Var3, lVar3, rVar2, i39 & 268435454);
                                    if (t.k()) {
                                        t.n();
                                    }
                                    mVar3 = mVar4;
                                    pVar6 = pVar9;
                                    pVar7 = pVar8;
                                    z18 = z19;
                                    aeVar2 = aeVar3;
                                    d3Var2 = d3Var3;
                                    lVar2 = lVar3;
                                } else {
                                    rVar2 = rVarH;
                                    rVar2.O();
                                    lVar2 = lVar;
                                    mVar3 = mVar2;
                                    pVar6 = pVar4;
                                    pVar7 = pVar5;
                                    z18 = z16;
                                    aeVar2 = aeVarG;
                                    d3Var2 = d3Var;
                                }
                                d5VarM = rVar2.m();
                                if (d5VarM != null) {
                                    d5VarM.a(new p() { // from class: f2.k
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                            i17 |= 100663296;
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar10 = pVar5;
                                boolean z110 = z16;
                                ae aeVar4 = aeVarG;
                                m mVar5 = mVar2;
                                p<? super r, ? super Integer, i0> pVar11 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar5, pVar11, pVar10, z110, aeVar4, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar5;
                                pVar6 = pVar11;
                                pVar7 = pVar10;
                                z18 = z110;
                                aeVar2 = aeVar4;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 12582912;
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i17 |= i37;
                            }
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar12 = pVar5;
                                boolean z111 = z16;
                                ae aeVar5 = aeVarG;
                                m mVar6 = mVar2;
                                p<? super r, ? super Integer, i0> pVar13 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar6, pVar13, pVar12, z111, aeVar5, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar6;
                                pVar6 = pVar13;
                                pVar7 = pVar12;
                                z18 = z111;
                                aeVar2 = aeVar5;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 100663296;
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar14 = pVar5;
                            boolean z112 = z16;
                            ae aeVar6 = aeVarG;
                            m mVar7 = mVar2;
                            p<? super r, ? super Integer, i0> pVar15 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar7, pVar15, pVar14, z112, aeVar6, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar7;
                            pVar6 = pVar15;
                            pVar7 = pVar14;
                            z18 = z112;
                            aeVar2 = aeVar6;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 196608;
                    z16 = z15;
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            aeVarG = aeVar;
                            if (rVarH.W(aeVarG)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            }
                            i17 |= i45;
                        } else {
                            aeVarG = aeVar;
                        }
                        i45 = PKIFailureInfo.signerNotTrusted;
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d3Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i17 |= i37;
                            }
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar16 = pVar5;
                                boolean z113 = z16;
                                ae aeVar7 = aeVarG;
                                m mVar8 = mVar2;
                                p<? super r, ? super Integer, i0> pVar17 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar8, pVar17, pVar16, z113, aeVar7, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar8;
                                pVar6 = pVar17;
                                pVar7 = pVar16;
                                z18 = z113;
                                aeVar2 = aeVar7;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 100663296;
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar18 = pVar5;
                            boolean z114 = z16;
                            ae aeVar8 = aeVarG;
                            m mVar9 = mVar2;
                            p<? super r, ? super Integer, i0> pVar19 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar9, pVar19, pVar18, z114, aeVar8, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar9;
                            pVar6 = pVar19;
                            pVar7 = pVar18;
                            z18 = z114;
                            aeVar2 = aeVar8;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar110 = pVar5;
                            boolean z115 = z16;
                            ae aeVar9 = aeVarG;
                            m mVar10 = mVar2;
                            p<? super r, ? super Integer, i0> pVar111 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar10, pVar111, pVar110, z115, aeVar9, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar10;
                            pVar6 = pVar111;
                            pVar7 = pVar110;
                            z18 = z115;
                            aeVar2 = aeVar9;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar112 = pVar5;
                        boolean z116 = z16;
                        ae aeVar10 = aeVarG;
                        m mVar11 = mVar2;
                        p<? super r, ? super Integer, i0> pVar113 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11, pVar113, pVar112, z116, aeVar10, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11;
                        pVar6 = pVar113;
                        pVar7 = pVar112;
                        z18 = z116;
                        aeVar2 = aeVar10;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                pVar5 = pVar3;
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            aeVarG = aeVar;
                            if (rVarH.W(aeVarG)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            }
                            i17 |= i45;
                        } else {
                            aeVarG = aeVar;
                        }
                        i45 = PKIFailureInfo.signerNotTrusted;
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d3Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i17 |= i37;
                            }
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar114 = pVar5;
                                boolean z117 = z16;
                                ae aeVar11 = aeVarG;
                                m mVar12 = mVar2;
                                p<? super r, ? super Integer, i0> pVar115 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar12, pVar115, pVar114, z117, aeVar11, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar12;
                                pVar6 = pVar115;
                                pVar7 = pVar114;
                                z18 = z117;
                                aeVar2 = aeVar11;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 100663296;
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar116 = pVar5;
                            boolean z118 = z16;
                            ae aeVar12 = aeVarG;
                            m mVar13 = mVar2;
                            p<? super r, ? super Integer, i0> pVar117 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar13, pVar117, pVar116, z118, aeVar12, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar13;
                            pVar6 = pVar117;
                            pVar7 = pVar116;
                            z18 = z118;
                            aeVar2 = aeVar12;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar118 = pVar5;
                            boolean z119 = z16;
                            ae aeVar13 = aeVarG;
                            m mVar14 = mVar2;
                            p<? super r, ? super Integer, i0> pVar119 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar14, pVar119, pVar118, z119, aeVar13, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar14;
                            pVar6 = pVar119;
                            pVar7 = pVar118;
                            z18 = z119;
                            aeVar2 = aeVar13;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1110 = pVar5;
                        boolean z1110 = z16;
                        ae aeVar14 = aeVarG;
                        m mVar15 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar15, pVar1111, pVar1110, z1110, aeVar14, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar15;
                        pVar6 = pVar1111;
                        pVar7 = pVar1110;
                        z18 = z1110;
                        aeVar2 = aeVar14;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                z16 = z15;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar1112 = pVar5;
                            boolean z1111 = z16;
                            ae aeVar15 = aeVarG;
                            m mVar16 = mVar2;
                            p<? super r, ? super Integer, i0> pVar1113 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar16, pVar1113, pVar1112, z1111, aeVar15, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar16;
                            pVar6 = pVar1113;
                            pVar7 = pVar1112;
                            z18 = z1111;
                            aeVar2 = aeVar15;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1114 = pVar5;
                        boolean z1112 = z16;
                        ae aeVar16 = aeVarG;
                        m mVar17 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1115 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar17, pVar1115, pVar1114, z1112, aeVar16, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar17;
                        pVar6 = pVar1115;
                        pVar7 = pVar1114;
                        z18 = z1112;
                        aeVar2 = aeVar16;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1116 = pVar5;
                        boolean z1113 = z16;
                        ae aeVar17 = aeVarG;
                        m mVar18 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1117 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar18, pVar1117, pVar1116, z1113, aeVar17, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar18;
                        pVar6 = pVar1117;
                        pVar7 = pVar1116;
                        z18 = z1113;
                        aeVar2 = aeVar17;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1118 = pVar5;
                    boolean z1114 = z16;
                    ae aeVar18 = aeVarG;
                    m mVar19 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1119 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar19, pVar1119, pVar1118, z1114, aeVar18, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar19;
                    pVar6 = pVar1119;
                    pVar7 = pVar1118;
                    z18 = z1114;
                    aeVar2 = aeVar18;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            pVar4 = pVar2;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    pVar5 = pVar3;
                    if (rVarH.G(pVar5)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            aeVarG = aeVar;
                            if (rVarH.W(aeVarG)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            }
                            i17 |= i45;
                        } else {
                            aeVarG = aeVar;
                        }
                        i45 = PKIFailureInfo.signerNotTrusted;
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d3Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i17 |= i37;
                            }
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar11110 = pVar5;
                                boolean z1115 = z16;
                                ae aeVar19 = aeVarG;
                                m mVar110 = mVar2;
                                p<? super r, ? super Integer, i0> pVar11111 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar110, pVar11111, pVar11110, z1115, aeVar19, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar110;
                                pVar6 = pVar11111;
                                pVar7 = pVar11110;
                                z18 = z1115;
                                aeVar2 = aeVar19;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 100663296;
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11112 = pVar5;
                            boolean z1116 = z16;
                            ae aeVar110 = aeVarG;
                            m mVar111 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11113 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar111, pVar11113, pVar11112, z1116, aeVar110, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar111;
                            pVar6 = pVar11113;
                            pVar7 = pVar11112;
                            z18 = z1116;
                            aeVar2 = aeVar110;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11114 = pVar5;
                            boolean z1117 = z16;
                            ae aeVar111 = aeVarG;
                            m mVar112 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11115 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar112, pVar11115, pVar11114, z1117, aeVar111, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar112;
                            pVar6 = pVar11115;
                            pVar7 = pVar11114;
                            z18 = z1117;
                            aeVar2 = aeVar111;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar11116 = pVar5;
                        boolean z1118 = z16;
                        ae aeVar112 = aeVarG;
                        m mVar113 = mVar2;
                        p<? super r, ? super Integer, i0> pVar11117 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar113, pVar11117, pVar11116, z1118, aeVar112, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar113;
                        pVar6 = pVar11117;
                        pVar7 = pVar11116;
                        z18 = z1118;
                        aeVar2 = aeVar112;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                z16 = z15;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11118 = pVar5;
                            boolean z1119 = z16;
                            ae aeVar113 = aeVarG;
                            m mVar114 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11119 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar114, pVar11119, pVar11118, z1119, aeVar113, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar114;
                            pVar6 = pVar11119;
                            pVar7 = pVar11118;
                            z18 = z1119;
                            aeVar2 = aeVar113;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111110 = pVar5;
                        boolean z11110 = z16;
                        ae aeVar114 = aeVarG;
                        m mVar115 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111111 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar115, pVar111111, pVar111110, z11110, aeVar114, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar115;
                        pVar6 = pVar111111;
                        pVar7 = pVar111110;
                        z18 = z11110;
                        aeVar2 = aeVar114;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111112 = pVar5;
                        boolean z11111 = z16;
                        ae aeVar115 = aeVarG;
                        m mVar116 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111113 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar116, pVar111113, pVar111112, z11111, aeVar115, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar116;
                        pVar6 = pVar111113;
                        pVar7 = pVar111112;
                        z18 = z11111;
                        aeVar2 = aeVar115;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar111114 = pVar5;
                    boolean z11112 = z16;
                    ae aeVar116 = aeVarG;
                    m mVar117 = mVar2;
                    p<? super r, ? super Integer, i0> pVar111115 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar117, pVar111115, pVar111114, z11112, aeVar116, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar117;
                    pVar6 = pVar111115;
                    pVar7 = pVar111114;
                    z18 = z11112;
                    aeVar2 = aeVar116;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVar5 = pVar3;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar111116 = pVar5;
                            boolean z11113 = z16;
                            ae aeVar117 = aeVarG;
                            m mVar118 = mVar2;
                            p<? super r, ? super Integer, i0> pVar111117 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar118, pVar111117, pVar111116, z11113, aeVar117, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar118;
                            pVar6 = pVar111117;
                            pVar7 = pVar111116;
                            z18 = z11113;
                            aeVar2 = aeVar117;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111118 = pVar5;
                        boolean z11114 = z16;
                        ae aeVar118 = aeVarG;
                        m mVar119 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111119 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar119, pVar111119, pVar111118, z11114, aeVar118, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar119;
                        pVar6 = pVar111119;
                        pVar7 = pVar111118;
                        z18 = z11114;
                        aeVar2 = aeVar118;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111110 = pVar5;
                        boolean z11115 = z16;
                        ae aeVar119 = aeVarG;
                        m mVar1110 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111111 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar1110, pVar1111111, pVar1111110, z11115, aeVar119, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar1110;
                        pVar6 = pVar1111111;
                        pVar7 = pVar1111110;
                        z18 = z11115;
                        aeVar2 = aeVar119;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111112 = pVar5;
                    boolean z11116 = z16;
                    ae aeVar1110 = aeVarG;
                    m mVar1111 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111113 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1111, pVar1111113, pVar1111112, z11116, aeVar1110, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1111;
                    pVar6 = pVar1111113;
                    pVar7 = pVar1111112;
                    z18 = z11116;
                    aeVar2 = aeVar1110;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            z16 = z15;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    aeVarG = aeVar;
                    if (rVarH.W(aeVarG)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i45 = PKIFailureInfo.signerNotTrusted;
                i17 |= i45;
            } else {
                aeVarG = aeVar;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111114 = pVar5;
                        boolean z11117 = z16;
                        ae aeVar1111 = aeVarG;
                        m mVar1112 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111115 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar1112, pVar1111115, pVar1111114, z11117, aeVar1111, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar1112;
                        pVar6 = pVar1111115;
                        pVar7 = pVar1111114;
                        z18 = z11117;
                        aeVar2 = aeVar1111;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111116 = pVar5;
                    boolean z11118 = z16;
                    ae aeVar1112 = aeVarG;
                    m mVar1113 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111117 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1113, pVar1111117, pVar1111116, z11118, aeVar1112, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1113;
                    pVar6 = pVar1111117;
                    pVar7 = pVar1111116;
                    z18 = z11118;
                    aeVar2 = aeVar1112;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111118 = pVar5;
                    boolean z11119 = z16;
                    ae aeVar1113 = aeVarG;
                    m mVar1114 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111119 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1114, pVar1111119, pVar1111118, z11119, aeVar1113, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1114;
                    pVar6 = pVar1111119;
                    pVar7 = pVar1111118;
                    z18 = z11119;
                    aeVar2 = aeVar1113;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar11111110 = pVar5;
                boolean z111110 = z16;
                ae aeVar1114 = aeVarG;
                m mVar1115 = mVar2;
                p<? super r, ? super Integer, i0> pVar11111111 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar1115, pVar11111111, pVar11111110, z111110, aeVar1114, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1115;
                pVar6 = pVar11111111;
                pVar7 = pVar11111110;
                z18 = z111110;
                aeVar2 = aeVar1114;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    pVar5 = pVar3;
                    if (rVarH.G(pVar5)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            aeVarG = aeVar;
                            if (rVarH.W(aeVarG)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            }
                            i17 |= i45;
                        } else {
                            aeVarG = aeVar;
                        }
                        i45 = PKIFailureInfo.signerNotTrusted;
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d3Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i17 |= i37;
                            }
                            i38 = i17;
                            if ((i17 & 38347923) != 38347922) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i38 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0) {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                } else {
                                    if (i46 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        pVar4 = null;
                                    }
                                    if (i25 != 0) {
                                        pVar5 = null;
                                    }
                                    if (i27 != 0) {
                                        z16 = true;
                                    }
                                    if ((i16 & 64) != 0) {
                                        i39 = i38 & (-3670017);
                                        aeVarG = zd.f58497a.g(rVarH, 6);
                                    } else {
                                        i39 = i38;
                                    }
                                    if (i29 != 0) {
                                        d3VarC = zd.f58497a.c();
                                    } else {
                                        d3VarC = d3Var;
                                    }
                                    if (i36 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    d3Var3 = d3VarC;
                                }
                                p<? super r, ? super Integer, i0> pVar11111112 = pVar5;
                                boolean z111111 = z16;
                                ae aeVar1115 = aeVarG;
                                m mVar1116 = mVar2;
                                p<? super r, ? super Integer, i0> pVar11111113 = pVar4;
                                rVarH.y();
                                if (t.k()) {
                                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                                }
                                rVar2 = rVarH;
                                le.s(pVar, aVar, mVar1116, pVar11111113, pVar11111112, z111111, aeVar1115, d3Var3, lVar3, rVar2, i39 & 268435454);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar1116;
                                pVar6 = pVar11111113;
                                pVar7 = pVar11111112;
                                z18 = z111111;
                                aeVar2 = aeVar1115;
                                d3Var2 = d3Var3;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                z18 = z16;
                                aeVar2 = aeVarG;
                                d3Var2 = d3Var;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.k
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i17 |= 100663296;
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11111114 = pVar5;
                            boolean z111112 = z16;
                            ae aeVar1116 = aeVarG;
                            m mVar1117 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11111115 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar1117, pVar11111115, pVar11111114, z111112, aeVar1116, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar1117;
                            pVar6 = pVar11111115;
                            pVar7 = pVar11111114;
                            z18 = z111112;
                            aeVar2 = aeVar1116;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11111116 = pVar5;
                            boolean z111113 = z16;
                            ae aeVar1117 = aeVarG;
                            m mVar1118 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11111117 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar1118, pVar11111117, pVar11111116, z111113, aeVar1117, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar1118;
                            pVar6 = pVar11111117;
                            pVar7 = pVar11111116;
                            z18 = z111113;
                            aeVar2 = aeVar1117;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar11111118 = pVar5;
                        boolean z111114 = z16;
                        ae aeVar1118 = aeVarG;
                        m mVar1119 = mVar2;
                        p<? super r, ? super Integer, i0> pVar11111119 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar1119, pVar11111119, pVar11111118, z111114, aeVar1118, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar1119;
                        pVar6 = pVar11111119;
                        pVar7 = pVar11111118;
                        z18 = z111114;
                        aeVar2 = aeVar1118;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                z16 = z15;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar111111110 = pVar5;
                            boolean z111115 = z16;
                            ae aeVar1119 = aeVarG;
                            m mVar11110 = mVar2;
                            p<? super r, ? super Integer, i0> pVar111111111 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar11110, pVar111111111, pVar111111110, z111115, aeVar1119, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar11110;
                            pVar6 = pVar111111111;
                            pVar7 = pVar111111110;
                            z18 = z111115;
                            aeVar2 = aeVar1119;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111111112 = pVar5;
                        boolean z111116 = z16;
                        ae aeVar11110 = aeVarG;
                        m mVar11111 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111111113 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11111, pVar111111113, pVar111111112, z111116, aeVar11110, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11111;
                        pVar6 = pVar111111113;
                        pVar7 = pVar111111112;
                        z18 = z111116;
                        aeVar2 = aeVar11110;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111111114 = pVar5;
                        boolean z111117 = z16;
                        ae aeVar11111 = aeVarG;
                        m mVar11112 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111111115 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11112, pVar111111115, pVar111111114, z111117, aeVar11111, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11112;
                        pVar6 = pVar111111115;
                        pVar7 = pVar111111114;
                        z18 = z111117;
                        aeVar2 = aeVar11111;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar111111116 = pVar5;
                    boolean z111118 = z16;
                    ae aeVar11112 = aeVarG;
                    m mVar11113 = mVar2;
                    p<? super r, ? super Integer, i0> pVar111111117 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar11113, pVar111111117, pVar111111116, z111118, aeVar11112, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar11113;
                    pVar6 = pVar111111117;
                    pVar7 = pVar111111116;
                    z18 = z111118;
                    aeVar2 = aeVar11112;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVar5 = pVar3;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar111111118 = pVar5;
                            boolean z111119 = z16;
                            ae aeVar11113 = aeVarG;
                            m mVar11114 = mVar2;
                            p<? super r, ? super Integer, i0> pVar111111119 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar11114, pVar111111119, pVar111111118, z111119, aeVar11113, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar11114;
                            pVar6 = pVar111111119;
                            pVar7 = pVar111111118;
                            z18 = z111119;
                            aeVar2 = aeVar11113;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111111110 = pVar5;
                        boolean z1111110 = z16;
                        ae aeVar11114 = aeVarG;
                        m mVar11115 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111111111 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11115, pVar1111111111, pVar1111111110, z1111110, aeVar11114, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11115;
                        pVar6 = pVar1111111111;
                        pVar7 = pVar1111111110;
                        z18 = z1111110;
                        aeVar2 = aeVar11114;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111111112 = pVar5;
                        boolean z1111111 = z16;
                        ae aeVar11115 = aeVarG;
                        m mVar11116 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111111113 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11116, pVar1111111113, pVar1111111112, z1111111, aeVar11115, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11116;
                        pVar6 = pVar1111111113;
                        pVar7 = pVar1111111112;
                        z18 = z1111111;
                        aeVar2 = aeVar11115;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111111114 = pVar5;
                    boolean z1111112 = z16;
                    ae aeVar11116 = aeVarG;
                    m mVar11117 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111111115 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar11117, pVar1111111115, pVar1111111114, z1111112, aeVar11116, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar11117;
                    pVar6 = pVar1111111115;
                    pVar7 = pVar1111111114;
                    z18 = z1111112;
                    aeVar2 = aeVar11116;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            z16 = z15;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    aeVarG = aeVar;
                    if (rVarH.W(aeVarG)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i45 = PKIFailureInfo.signerNotTrusted;
                i17 |= i45;
            } else {
                aeVarG = aeVar;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111111116 = pVar5;
                        boolean z1111113 = z16;
                        ae aeVar11117 = aeVarG;
                        m mVar11118 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111111117 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar11118, pVar1111111117, pVar1111111116, z1111113, aeVar11117, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11118;
                        pVar6 = pVar1111111117;
                        pVar7 = pVar1111111116;
                        z18 = z1111113;
                        aeVar2 = aeVar11117;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111111118 = pVar5;
                    boolean z1111114 = z16;
                    ae aeVar11118 = aeVarG;
                    m mVar11119 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111111119 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar11119, pVar1111111119, pVar1111111118, z1111114, aeVar11118, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar11119;
                    pVar6 = pVar1111111119;
                    pVar7 = pVar1111111118;
                    z18 = z1111114;
                    aeVar2 = aeVar11118;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar11111111110 = pVar5;
                    boolean z1111115 = z16;
                    ae aeVar11119 = aeVarG;
                    m mVar111110 = mVar2;
                    p<? super r, ? super Integer, i0> pVar11111111111 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar111110, pVar11111111111, pVar11111111110, z1111115, aeVar11119, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar111110;
                    pVar6 = pVar11111111111;
                    pVar7 = pVar11111111110;
                    z18 = z1111115;
                    aeVar2 = aeVar11119;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar11111111112 = pVar5;
                boolean z1111116 = z16;
                ae aeVar111110 = aeVarG;
                m mVar111111 = mVar2;
                p<? super r, ? super Integer, i0> pVar11111111113 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar111111, pVar11111111113, pVar11111111112, z1111116, aeVar111110, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar111111;
                pVar6 = pVar11111111113;
                pVar7 = pVar11111111112;
                z18 = z1111116;
                aeVar2 = aeVar111110;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        pVar4 = pVar2;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                pVar5 = pVar3;
                if (rVarH.G(pVar5)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        aeVarG = aeVar;
                        if (rVarH.W(aeVarG)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    } else {
                        aeVarG = aeVar;
                    }
                    i45 = PKIFailureInfo.signerNotTrusted;
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d3Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i17 |= i37;
                        }
                        i38 = i17;
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i38 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            } else {
                                if (i46 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    pVar4 = null;
                                }
                                if (i25 != 0) {
                                    pVar5 = null;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if ((i16 & 64) != 0) {
                                    i39 = i38 & (-3670017);
                                    aeVarG = zd.f58497a.g(rVarH, 6);
                                } else {
                                    i39 = i38;
                                }
                                if (i29 != 0) {
                                    d3VarC = zd.f58497a.c();
                                } else {
                                    d3VarC = d3Var;
                                }
                                if (i36 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                d3Var3 = d3VarC;
                            }
                            p<? super r, ? super Integer, i0> pVar11111111114 = pVar5;
                            boolean z1111117 = z16;
                            ae aeVar111111 = aeVarG;
                            m mVar111112 = mVar2;
                            p<? super r, ? super Integer, i0> pVar11111111115 = pVar4;
                            rVarH.y();
                            if (t.k()) {
                                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                            }
                            rVar2 = rVarH;
                            le.s(pVar, aVar, mVar111112, pVar11111111115, pVar11111111114, z1111117, aeVar111111, d3Var3, lVar3, rVar2, i39 & 268435454);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar111112;
                            pVar6 = pVar11111111115;
                            pVar7 = pVar11111111114;
                            z18 = z1111117;
                            aeVar2 = aeVar111111;
                            d3Var2 = d3Var3;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            z18 = z16;
                            aeVar2 = aeVarG;
                            d3Var2 = d3Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.k
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar11111111116 = pVar5;
                        boolean z1111118 = z16;
                        ae aeVar111112 = aeVarG;
                        m mVar111113 = mVar2;
                        p<? super r, ? super Integer, i0> pVar11111111117 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar111113, pVar11111111117, pVar11111111116, z1111118, aeVar111112, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar111113;
                        pVar6 = pVar11111111117;
                        pVar7 = pVar11111111116;
                        z18 = z1111118;
                        aeVar2 = aeVar111112;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar11111111118 = pVar5;
                        boolean z1111119 = z16;
                        ae aeVar111113 = aeVarG;
                        m mVar111114 = mVar2;
                        p<? super r, ? super Integer, i0> pVar11111111119 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar111114, pVar11111111119, pVar11111111118, z1111119, aeVar111113, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar111114;
                        pVar6 = pVar11111111119;
                        pVar7 = pVar11111111118;
                        z18 = z1111119;
                        aeVar2 = aeVar111113;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar111111111110 = pVar5;
                    boolean z11111110 = z16;
                    ae aeVar111114 = aeVarG;
                    m mVar111115 = mVar2;
                    p<? super r, ? super Integer, i0> pVar111111111111 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar111115, pVar111111111111, pVar111111111110, z11111110, aeVar111114, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar111115;
                    pVar6 = pVar111111111111;
                    pVar7 = pVar111111111110;
                    z18 = z11111110;
                    aeVar2 = aeVar111114;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            z16 = z15;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    aeVarG = aeVar;
                    if (rVarH.W(aeVarG)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i45 = PKIFailureInfo.signerNotTrusted;
                i17 |= i45;
            } else {
                aeVarG = aeVar;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar111111111112 = pVar5;
                        boolean z11111111 = z16;
                        ae aeVar111115 = aeVarG;
                        m mVar111116 = mVar2;
                        p<? super r, ? super Integer, i0> pVar111111111113 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar111116, pVar111111111113, pVar111111111112, z11111111, aeVar111115, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar111116;
                        pVar6 = pVar111111111113;
                        pVar7 = pVar111111111112;
                        z18 = z11111111;
                        aeVar2 = aeVar111115;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar111111111114 = pVar5;
                    boolean z11111112 = z16;
                    ae aeVar111116 = aeVarG;
                    m mVar111117 = mVar2;
                    p<? super r, ? super Integer, i0> pVar111111111115 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar111117, pVar111111111115, pVar111111111114, z11111112, aeVar111116, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar111117;
                    pVar6 = pVar111111111115;
                    pVar7 = pVar111111111114;
                    z18 = z11111112;
                    aeVar2 = aeVar111116;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar111111111116 = pVar5;
                    boolean z11111113 = z16;
                    ae aeVar111117 = aeVarG;
                    m mVar111118 = mVar2;
                    p<? super r, ? super Integer, i0> pVar111111111117 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar111118, pVar111111111117, pVar111111111116, z11111113, aeVar111117, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar111118;
                    pVar6 = pVar111111111117;
                    pVar7 = pVar111111111116;
                    z18 = z11111113;
                    aeVar2 = aeVar111117;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar111111111118 = pVar5;
                boolean z11111114 = z16;
                ae aeVar111118 = aeVarG;
                m mVar111119 = mVar2;
                p<? super r, ? super Integer, i0> pVar111111111119 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar111119, pVar111111111119, pVar111111111118, z11111114, aeVar111118, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar111119;
                pVar6 = pVar111111111119;
                pVar7 = pVar111111111118;
                z18 = z11111114;
                aeVar2 = aeVar111118;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        pVar5 = pVar3;
        i27 = i16 & 32;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    aeVarG = aeVar;
                    if (rVarH.W(aeVarG)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i45;
                } else {
                    aeVarG = aeVar;
                }
                i45 = PKIFailureInfo.signerNotTrusted;
                i17 |= i45;
            } else {
                aeVarG = aeVar;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d3Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i17 |= i37;
                    }
                    i38 = i17;
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i38 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        } else {
                            if (i46 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                pVar4 = null;
                            }
                            if (i25 != 0) {
                                pVar5 = null;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 64) != 0) {
                                i39 = i38 & (-3670017);
                                aeVarG = zd.f58497a.g(rVarH, 6);
                            } else {
                                i39 = i38;
                            }
                            if (i29 != 0) {
                                d3VarC = zd.f58497a.c();
                            } else {
                                d3VarC = d3Var;
                            }
                            if (i36 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            d3Var3 = d3VarC;
                        }
                        p<? super r, ? super Integer, i0> pVar1111111111110 = pVar5;
                        boolean z11111115 = z16;
                        ae aeVar111119 = aeVarG;
                        m mVar1111110 = mVar2;
                        p<? super r, ? super Integer, i0> pVar1111111111111 = pVar4;
                        rVarH.y();
                        if (t.k()) {
                            t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                        }
                        rVar2 = rVarH;
                        le.s(pVar, aVar, mVar1111110, pVar1111111111111, pVar1111111111110, z11111115, aeVar111119, d3Var3, lVar3, rVar2, i39 & 268435454);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar1111110;
                        pVar6 = pVar1111111111111;
                        pVar7 = pVar1111111111110;
                        z18 = z11111115;
                        aeVar2 = aeVar111119;
                        d3Var2 = d3Var3;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        z18 = z16;
                        aeVar2 = aeVarG;
                        d3Var2 = d3Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.k
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111111111112 = pVar5;
                    boolean z11111116 = z16;
                    ae aeVar1111110 = aeVarG;
                    m mVar1111111 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111111111113 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1111111, pVar1111111111113, pVar1111111111112, z11111116, aeVar1111110, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1111111;
                    pVar6 = pVar1111111111113;
                    pVar7 = pVar1111111111112;
                    z18 = z11111116;
                    aeVar2 = aeVar1111110;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111111111114 = pVar5;
                    boolean z11111117 = z16;
                    ae aeVar1111111 = aeVarG;
                    m mVar1111112 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111111111115 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1111112, pVar1111111111115, pVar1111111111114, z11111117, aeVar1111111, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1111112;
                    pVar6 = pVar1111111111115;
                    pVar7 = pVar1111111111114;
                    z18 = z11111117;
                    aeVar2 = aeVar1111111;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar1111111111116 = pVar5;
                boolean z11111118 = z16;
                ae aeVar1111112 = aeVarG;
                m mVar1111113 = mVar2;
                p<? super r, ? super Integer, i0> pVar1111111111117 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar1111113, pVar1111111111117, pVar1111111111116, z11111118, aeVar1111112, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1111113;
                pVar6 = pVar1111111111117;
                pVar7 = pVar1111111111116;
                z18 = z11111118;
                aeVar2 = aeVar1111112;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        z16 = z15;
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                aeVarG = aeVar;
                if (rVarH.W(aeVarG)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                }
                i17 |= i45;
            } else {
                aeVarG = aeVar;
            }
            i45 = PKIFailureInfo.signerNotTrusted;
            i17 |= i45;
        } else {
            aeVarG = aeVar;
        }
        i29 = i16 & 128;
        if (i29 != 0) {
            if ((i15 & 12582912) == 0) {
                if (rVarH.W(d3Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                i38 = i17;
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i38 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    } else {
                        if (i46 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i25 != 0) {
                            pVar5 = null;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 64) != 0) {
                            i39 = i38 & (-3670017);
                            aeVarG = zd.f58497a.g(rVarH, 6);
                        } else {
                            i39 = i38;
                        }
                        if (i29 != 0) {
                            d3VarC = zd.f58497a.c();
                        } else {
                            d3VarC = d3Var;
                        }
                        if (i36 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        d3Var3 = d3VarC;
                    }
                    p<? super r, ? super Integer, i0> pVar1111111111118 = pVar5;
                    boolean z11111119 = z16;
                    ae aeVar1111113 = aeVarG;
                    m mVar1111114 = mVar2;
                    p<? super r, ? super Integer, i0> pVar1111111111119 = pVar4;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                    }
                    rVar2 = rVarH;
                    le.s(pVar, aVar, mVar1111114, pVar1111111111119, pVar1111111111118, z11111119, aeVar1111113, d3Var3, lVar3, rVar2, i39 & 268435454);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1111114;
                    pVar6 = pVar1111111111119;
                    pVar7 = pVar1111111111118;
                    z18 = z11111119;
                    aeVar2 = aeVar1111113;
                    d3Var2 = d3Var3;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    z18 = z16;
                    aeVar2 = aeVarG;
                    d3Var2 = d3Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.k
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar11111111111110 = pVar5;
                boolean z111111110 = z16;
                ae aeVar1111114 = aeVarG;
                m mVar1111115 = mVar2;
                p<? super r, ? super Integer, i0> pVar11111111111111 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar1111115, pVar11111111111111, pVar11111111111110, z111111110, aeVar1111114, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1111115;
                pVar6 = pVar11111111111111;
                pVar7 = pVar11111111111110;
                z18 = z111111110;
                aeVar2 = aeVar1111114;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 12582912;
        i36 = i16 & 256;
        if (i36 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(lVar)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i17 |= i37;
            }
            i38 = i17;
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i38 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                } else {
                    if (i46 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    }
                    if (i25 != 0) {
                        pVar5 = null;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 64) != 0) {
                        i39 = i38 & (-3670017);
                        aeVarG = zd.f58497a.g(rVarH, 6);
                    } else {
                        i39 = i38;
                    }
                    if (i29 != 0) {
                        d3VarC = zd.f58497a.c();
                    } else {
                        d3VarC = d3Var;
                    }
                    if (i36 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    d3Var3 = d3VarC;
                }
                p<? super r, ? super Integer, i0> pVar11111111111112 = pVar5;
                boolean z111111111 = z16;
                ae aeVar1111115 = aeVarG;
                m mVar1111116 = mVar2;
                p<? super r, ? super Integer, i0> pVar11111111111113 = pVar4;
                rVarH.y();
                if (t.k()) {
                    t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
                }
                rVar2 = rVarH;
                le.s(pVar, aVar, mVar1111116, pVar11111111111113, pVar11111111111112, z111111111, aeVar1111115, d3Var3, lVar3, rVar2, i39 & 268435454);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1111116;
                pVar6 = pVar11111111111113;
                pVar7 = pVar11111111111112;
                z18 = z111111111;
                aeVar2 = aeVar1111115;
                d3Var2 = d3Var3;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                pVar6 = pVar4;
                pVar7 = pVar5;
                z18 = z16;
                aeVar2 = aeVarG;
                d3Var2 = d3Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 100663296;
        i38 = i17;
        if ((i17 & 38347923) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i38 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i46 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    pVar4 = null;
                }
                if (i25 != 0) {
                    pVar5 = null;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if ((i16 & 64) != 0) {
                    i39 = i38 & (-3670017);
                    aeVarG = zd.f58497a.g(rVarH, 6);
                } else {
                    i39 = i38;
                }
                if (i29 != 0) {
                    d3VarC = zd.f58497a.c();
                } else {
                    d3VarC = d3Var;
                }
                if (i36 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                d3Var3 = d3VarC;
            } else {
                if (i46 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    pVar4 = null;
                }
                if (i25 != 0) {
                    pVar5 = null;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if ((i16 & 64) != 0) {
                    i39 = i38 & (-3670017);
                    aeVarG = zd.f58497a.g(rVarH, 6);
                } else {
                    i39 = i38;
                }
                if (i29 != 0) {
                    d3VarC = zd.f58497a.c();
                } else {
                    d3VarC = d3Var;
                }
                if (i36 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                d3Var3 = d3VarC;
            }
            p<? super r, ? super Integer, i0> pVar11111111111114 = pVar5;
            boolean z111111112 = z16;
            ae aeVar1111116 = aeVarG;
            m mVar1111117 = mVar2;
            p<? super r, ? super Integer, i0> pVar11111111111115 = pVar4;
            rVarH.y();
            if (t.k()) {
                t.o(-532959117, i39, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:212)");
            }
            rVar2 = rVarH;
            le.s(pVar, aVar, mVar1111117, pVar11111111111115, pVar11111111111114, z111111112, aeVar1111116, d3Var3, lVar3, rVar2, i39 & 268435454);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar1111117;
            pVar6 = pVar11111111111115;
            pVar7 = pVar11111111111114;
            z18 = z111111112;
            aeVar2 = aeVar1111116;
            d3Var2 = d3Var3;
            lVar2 = lVar3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            lVar2 = lVar;
            mVar3 = mVar2;
            pVar6 = pVar4;
            pVar7 = pVar5;
            z18 = z16;
            aeVar2 = aeVarG;
            d3Var2 = d3Var;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.g(pVar, aVar, mVar3, pVar6, pVar7, z18, aeVar2, d3Var2, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(p pVar, a aVar, m mVar, p pVar2, p pVar3, boolean z15, ae aeVar, d1.d3 d3Var, b1.l lVar, int i15, int i16, r rVar, int i17) {
        f(pVar, aVar, mVar, pVar2, pVar3, z15, aeVar, d3Var, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a3 a3Var, c5.p pVar, c5.p pVar2) {
        a3Var.setValue(d3.b(le.y(pVar, pVar2)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(m mVar, d1 d1Var, a3 a3Var, f3 f3Var, y2 y2Var, long j15, float f15, float f16, BorderStroke borderStroke, q qVar, r rVar, int i15) throws Throwable {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-917492520, i15, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:81)");
            }
            le.k(mVar, d1Var, a3Var, f3Var, y2Var, j15, f15, f16, borderStroke, qVar, rVar, (d1.f193575d << 3) | MLKEMEngine.KyberPolyBytes);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(boolean z15, a aVar, m mVar, long j15, f3 f3Var, u uVar, y2 y2Var, long j16, float f15, float f16, BorderStroke borderStroke, q qVar, int i15, int i16, int i17, r rVar, int i18) {
        e(z15, aVar, mVar, j15, f3Var, uVar, y2Var, j16, f15, f16, borderStroke, qVar, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return i0.f148189a;
    }
}
