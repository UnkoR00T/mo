package p046f2;

import androidx.compose.material3.d;
import c5.b;
import c5.h;
import c5.t;
import d1.c4;
import d1.d3;
import d1.f4;
import d1.g4;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import h2.s1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.p2;
import p036e4.s2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Lf2/cc;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Ld1/c4;", "contentWindowInsets", "Lkotlin/Function1;", "Ld1/d3;", "content", "l", "(Lf3/m;Ler/p;Ler/p;Ler/p;Ler/p;IJJLd1/c4;Ler/q;Lm2/r;II)V", "fabPosition", "snackbar", "fab", "m", "(ILer/p;Ler/q;Ler/p;Ler/p;Ld1/c4;Ler/p;Lm2/r;I)V", "Lc5/h;", "a", "F", "FabSpacing", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f55623a = h.n(16);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bR+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"f2/di$a", "Ld1/d3;", "Lc5/t;", "layoutDirection", "Lc5/h;", "c", "(Lc5/t;)F", "d", "()F", "b", "a", "<set-?>", "Lm2/a3;", "e", "()Ld1/d3;", "f", "(Ld1/d3;)V", "paddingHolder", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a3 paddingHolder = c6.e(d1.a3.e(h.n(0)), null, 2, null);

        a() {
        }

        @Override // d1.d3
        /* JADX INFO: renamed from: a */
        public float getBottom() {
            return e().getBottom();
        }

        @Override // d1.d3
        public float b(t layoutDirection) {
            return e().b(layoutDirection);
        }

        @Override // d1.d3
        public float c(t layoutDirection) {
            return e().c(layoutDirection);
        }

        @Override // d1.d3
        /* JADX INFO: renamed from: d */
        public float getTop() {
            return e().getTop();
        }

        public final d3 e() {
            return (d3) this.paddingHolder.getValue();
        }

        public final void f(d3 d3Var) {
            this.paddingHolder.setValue(d3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x019f  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01df  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:160:0x0204  */
    /* JADX WARN: Code duplicated, block: B:163:0x020f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0222  */
    /* JADX WARN: Code duplicated, block: B:173:0x022a  */
    /* JADX WARN: Code duplicated, block: B:176:0x023e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0244  */
    /* JADX WARN: Code duplicated, block: B:184:0x0253  */
    /* JADX WARN: Code duplicated, block: B:186:0x025b  */
    /* JADX WARN: Code duplicated, block: B:189:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    public static final void l(m mVar, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, i0> pVar2, p<? super r, ? super Integer, i0> pVar3, p<? super r, ? super Integer, i0> pVar4, int i15, long j15, long j16, c4 c4Var, final q<? super d3, ? super r, ? super Integer, i0> qVar, r rVar, final int i16, final int i17) {
        int i18;
        p<? super r, ? super Integer, i0> pVar5;
        int i19;
        p<? super r, ? super Integer, i0> pVar6;
        int i25;
        int i26;
        p<? super r, ? super Integer, i0> pVar7;
        int i27;
        int i28;
        p<? super r, ? super Integer, i0> pVar8;
        int i29;
        int i35;
        int i36;
        boolean z15;
        r rVar2;
        final m mVar2;
        final c4 c4Var2;
        final p<? super r, ? super Integer, i0> pVar9;
        final p<? super r, ? super Integer, i0> pVar10;
        final p<? super r, ? super Integer, i0> pVar11;
        final p<? super r, ? super Integer, i0> pVar12;
        final int i37;
        final long j17;
        final long j18;
        d5 d5VarM;
        m mVar3;
        p<? super r, ? super Integer, i0> pVarF;
        p<? super r, ? super Integer, i0> pVarG;
        p<? super r, ? super Integer, i0> pVarH;
        p<? super r, ? super Integer, i0> pVarE;
        int iA;
        long background;
        long jE;
        final c4 c4VarA;
        long j19;
        boolean z16;
        Object objE;
        final s1 s1Var;
        boolean zW;
        Object objE2;
        int i38;
        int i39;
        int i45;
        r rVarH = rVar.h(-1211482744);
        int i46 = i17 & 1;
        if (i46 != 0) {
            i18 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i47 = i17 & 2;
        if (i47 == 0) {
            if ((i16 & 48) == 0) {
                pVar5 = pVar;
                i18 |= rVarH.G(pVar5) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    pVar6 = pVar2;
                    if (rVarH.G(pVar6)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 8;
                if (i26 != 0) {
                    if ((i16 & 3072) == 0) {
                        pVar7 = pVar3;
                        if (rVarH.G(pVar7)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i18 |= i27;
                    }
                    i28 = i17 & 16;
                    if (i28 != 0) {
                        if ((i16 & 24576) == 0) {
                            pVar8 = pVar4;
                            if (rVarH.G(pVar8)) {
                                i29 = 16384;
                            } else {
                                i29 = PKIFailureInfo.certRevoked;
                            }
                            i18 |= i29;
                        }
                        i35 = i17 & 32;
                        if (i35 != 0) {
                            i18 |= 196608;
                        } else if ((i16 & 196608) == 0) {
                            if (rVarH.c(i15)) {
                                i36 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i36 = PKIFailureInfo.notAuthorized;
                            }
                            i18 |= i36;
                        }
                        if ((i16 & 1572864) != 0) {
                            if ((i17 & 64) == 0 || !rVarH.d(j15)) {
                                i45 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i45 = PKIFailureInfo.badCertTemplate;
                            }
                            i18 |= i45;
                        }
                        if ((i16 & 12582912) != 0) {
                            if ((i17 & 128) == 0 || !rVarH.d(j16)) {
                                i39 = 4194304;
                            } else {
                                i39 = 8388608;
                            }
                            i18 |= i39;
                        }
                        if ((i16 & 100663296) != 0) {
                            i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                        }
                        if ((i16 & 805306368) == 0) {
                            if (rVarH.G(qVar)) {
                                i38 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i38 = 268435456;
                            }
                            i18 |= i38;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i18 & 1)) {
                            rVarH.I();
                            if ((i16 & 1) != 0 || rVarH.Q()) {
                                if (i46 != 0) {
                                    mVar3 = m.INSTANCE;
                                } else {
                                    mVar3 = mVar;
                                }
                                if (i47 != 0) {
                                    pVarF = t3.f57779a.f();
                                } else {
                                    pVarF = pVar5;
                                }
                                if (i19 != 0) {
                                    pVarG = t3.f57779a.g();
                                } else {
                                    pVarG = pVar6;
                                }
                                if (i26 != 0) {
                                    pVarH = t3.f57779a.h();
                                } else {
                                    pVarH = pVar7;
                                }
                                if (i28 != 0) {
                                    pVarE = t3.f57779a.e();
                                } else {
                                    pVarE = pVar8;
                                }
                                if (i35 != 0) {
                                    iA = cc.INSTANCE.a();
                                } else {
                                    iA = i15;
                                }
                                if ((i17 & 64) != 0) {
                                    i18 &= -3670017;
                                    background = d.f9816a.a(rVarH, 6).getBackground();
                                } else {
                                    background = j15;
                                }
                                if ((i17 & 128) != 0) {
                                    jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                    i18 &= -29360129;
                                } else {
                                    jE = j16;
                                }
                                if ((i17 & 256) != 0) {
                                    c4VarA = rh.f57581a.a(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    c4VarA = c4Var;
                                }
                                j19 = jE;
                            } else {
                                rVarH.O();
                                if ((i17 & 64) != 0) {
                                    i18 &= -3670017;
                                }
                                if ((i17 & 128) != 0) {
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    i18 &= -234881025;
                                }
                                mVar3 = mVar;
                                iA = i15;
                                background = j15;
                                pVarF = pVar5;
                                pVarG = pVar6;
                                pVarH = pVar7;
                                pVarE = pVar8;
                                j19 = j16;
                                c4VarA = c4Var;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i48 = (234881024 & i18) ^ r19;
                            z16 = (i48 <= 67108864 && rVarH.W(c4VarA)) || (i18 & r19) == 67108864;
                            objE = rVarH.E();
                            if (z16 || objE == r.INSTANCE.a()) {
                                objE = new s1(c4VarA);
                                rVarH.v(objE);
                            }
                            s1Var = (s1) objE;
                            long j25 = background;
                            zW = rVarH.W(s1Var) | ((i48 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                            objE2 = rVarH.E();
                            if (zW || objE2 == r.INSTANCE.a()) {
                                objE2 = new l() { // from class: f2.sh
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return di.v(s1Var, c4VarA, (c4) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            final p<? super r, ? super Integer, i0> pVar13 = pVarF;
                            final p<? super r, ? super Integer, i0> pVar14 = pVarG;
                            final p<? super r, ? super Integer, i0> pVar15 = pVarH;
                            final p<? super r, ? super Integer, i0> pVar16 = pVarE;
                            final int i49 = iA;
                            int i55 = i18 >> 12;
                            rVar2 = rVarH;
                            androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j25, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return di.w(i49, pVar13, qVar, pVar15, pVar16, s1Var, pVar14, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVar2, (i55 & 896) | 12582912 | (i55 & 7168), 114);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar2 = mVar3;
                            pVar9 = pVarF;
                            pVar10 = pVarG;
                            pVar11 = pVarH;
                            pVar12 = pVarE;
                            i37 = iA;
                            c4Var2 = c4VarA;
                            j17 = j25;
                            j18 = j19;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            mVar2 = mVar;
                            c4Var2 = c4Var;
                            pVar9 = pVar5;
                            pVar10 = pVar6;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            i37 = i15;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.vh
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 24576;
                    pVar8 = pVar4;
                    i35 = i17 & 32;
                    if (i35 != 0) {
                        i18 |= 196608;
                    } else if ((i16 & 196608) == 0) {
                        if (rVarH.c(i15)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i36;
                    }
                    if ((i16 & 1572864) != 0) {
                        if ((i17 & 64) == 0) {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i45;
                    }
                    if ((i16 & 12582912) != 0) {
                        if ((i17 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                    if ((i16 & 100663296) != 0) {
                        i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                    }
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i38 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i38 = 268435456;
                        }
                        i18 |= i38;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        } else {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i410 = (234881024 & i18) ^ r19;
                        if (i410 <= 67108864) {
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        } else {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        }
                        s1Var = (s1) objE;
                        long j26 = background;
                        zW = rVarH.W(s1Var) | ((i410 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                        objE2 = rVarH.E();
                        if (zW) {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        final p pVar17 = pVarF;
                        final p pVar18 = pVarG;
                        final p pVar19 = pVarH;
                        final p pVar110 = pVarE;
                        final int i411 = iA;
                        int i56 = i18 >> 12;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j26, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.w(i411, pVar17, qVar, pVar19, pVar110, s1Var, pVar18, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, (i56 & 896) | 12582912 | (i56 & 7168), 114);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar2 = mVar3;
                        pVar9 = pVarF;
                        pVar10 = pVarG;
                        pVar11 = pVarH;
                        pVar12 = pVarE;
                        i37 = iA;
                        c4Var2 = c4VarA;
                        j17 = j26;
                        j18 = j19;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        c4Var2 = c4Var;
                        pVar9 = pVar5;
                        pVar10 = pVar6;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        i37 = i15;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.vh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 3072;
                pVar7 = pVar3;
                i28 = i17 & 16;
                if (i28 != 0) {
                    if ((i16 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (rVarH.G(pVar8)) {
                            i29 = 16384;
                        } else {
                            i29 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i29;
                    }
                    i35 = i17 & 32;
                    if (i35 != 0) {
                        i18 |= 196608;
                    } else if ((i16 & 196608) == 0) {
                        if (rVarH.c(i15)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i36;
                    }
                    if ((i16 & 1572864) != 0) {
                        if ((i17 & 64) == 0) {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i45;
                    }
                    if ((i16 & 12582912) != 0) {
                        if ((i17 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                    if ((i16 & 100663296) != 0) {
                        i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                    }
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i38 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i38 = 268435456;
                        }
                        i18 |= i38;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        } else {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i412 = (234881024 & i18) ^ r19;
                        if (i412 <= 67108864) {
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        } else {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        }
                        s1Var = (s1) objE;
                        long j27 = background;
                        zW = rVarH.W(s1Var) | ((i412 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                        objE2 = rVarH.E();
                        if (zW) {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        final p pVar111 = pVarF;
                        final p pVar112 = pVarG;
                        final p pVar113 = pVarH;
                        final p pVar114 = pVarE;
                        final int i413 = iA;
                        int i57 = i18 >> 12;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j27, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.w(i413, pVar111, qVar, pVar113, pVar114, s1Var, pVar112, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, (i57 & 896) | 12582912 | (i57 & 7168), 114);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar2 = mVar3;
                        pVar9 = pVarF;
                        pVar10 = pVarG;
                        pVar11 = pVarH;
                        pVar12 = pVarE;
                        i37 = iA;
                        c4Var2 = c4VarA;
                        j17 = j27;
                        j18 = j19;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        c4Var2 = c4Var;
                        pVar9 = pVar5;
                        pVar10 = pVar6;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        i37 = i15;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.vh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                pVar8 = pVar4;
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i414 = (234881024 & i18) ^ r19;
                    if (i414 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j28 = background;
                    zW = rVarH.W(s1Var) | ((i414 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar115 = pVarF;
                    final p pVar116 = pVarG;
                    final p pVar117 = pVarH;
                    final p pVar118 = pVarE;
                    final int i415 = iA;
                    int i58 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j28, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i415, pVar115, qVar, pVar117, pVar118, s1Var, pVar116, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i58 & 896) | 12582912 | (i58 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j28;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= MLKEMEngine.KyberPolyBytes;
            pVar6 = pVar2;
            i26 = i17 & 8;
            if (i26 != 0) {
                if ((i16 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (rVarH.G(pVar7)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 16;
                if (i28 != 0) {
                    if ((i16 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (rVarH.G(pVar8)) {
                            i29 = 16384;
                        } else {
                            i29 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i29;
                    }
                    i35 = i17 & 32;
                    if (i35 != 0) {
                        i18 |= 196608;
                    } else if ((i16 & 196608) == 0) {
                        if (rVarH.c(i15)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i36;
                    }
                    if ((i16 & 1572864) != 0) {
                        if ((i17 & 64) == 0) {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i45;
                    }
                    if ((i16 & 12582912) != 0) {
                        if ((i17 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                    if ((i16 & 100663296) != 0) {
                        i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                    }
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i38 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i38 = 268435456;
                        }
                        i18 |= i38;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        } else {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i416 = (234881024 & i18) ^ r19;
                        if (i416 <= 67108864) {
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        } else {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        }
                        s1Var = (s1) objE;
                        long j29 = background;
                        zW = rVarH.W(s1Var) | ((i416 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                        objE2 = rVarH.E();
                        if (zW) {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        final p pVar119 = pVarF;
                        final p pVar1110 = pVarG;
                        final p pVar1111 = pVarH;
                        final p pVar1112 = pVarE;
                        final int i417 = iA;
                        int i59 = i18 >> 12;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j29, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.w(i417, pVar119, qVar, pVar1111, pVar1112, s1Var, pVar1110, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, (i59 & 896) | 12582912 | (i59 & 7168), 114);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar2 = mVar3;
                        pVar9 = pVarF;
                        pVar10 = pVarG;
                        pVar11 = pVarH;
                        pVar12 = pVarE;
                        i37 = iA;
                        c4Var2 = c4VarA;
                        j17 = j29;
                        j18 = j19;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        c4Var2 = c4Var;
                        pVar9 = pVar5;
                        pVar10 = pVar6;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        i37 = i15;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.vh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                pVar8 = pVar4;
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i418 = (234881024 & i18) ^ r19;
                    if (i418 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j210 = background;
                    zW = rVarH.W(s1Var) | ((i418 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar1113 = pVarF;
                    final p pVar1114 = pVarG;
                    final p pVar1115 = pVarH;
                    final p pVar1116 = pVarE;
                    final int i419 = iA;
                    int i510 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j210, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i419, pVar1113, qVar, pVar1115, pVar1116, s1Var, pVar1114, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i510 & 896) | 12582912 | (i510 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j210;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            pVar7 = pVar3;
            i28 = i17 & 16;
            if (i28 != 0) {
                if ((i16 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (rVarH.G(pVar8)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i29;
                }
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i4110 = (234881024 & i18) ^ r19;
                    if (i4110 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j211 = background;
                    zW = rVarH.W(s1Var) | ((i4110 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar1117 = pVarF;
                    final p pVar1118 = pVarG;
                    final p pVar1119 = pVarH;
                    final p pVar11110 = pVarE;
                    final int i4111 = iA;
                    int i511 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j211, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i4111, pVar1117, qVar, pVar1119, pVar11110, s1Var, pVar1118, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i511 & 896) | 12582912 | (i511 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j211;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            pVar8 = pVar4;
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (rVarH.c(i15)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i36;
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            }
            if ((i16 & 12582912) != 0) {
                if ((i17 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i16 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i38 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i38 = 268435456;
                }
                i18 |= i38;
            }
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                } else {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i4112 = (234881024 & i18) ^ r19;
                if (i4112 <= 67108864) {
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                } else {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                }
                s1Var = (s1) objE;
                long j212 = background;
                zW = rVarH.W(s1Var) | ((i4112 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                final p pVar11111 = pVarF;
                final p pVar11112 = pVarG;
                final p pVar11113 = pVarH;
                final p pVar11114 = pVarE;
                final int i4113 = iA;
                int i512 = i18 >> 12;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j212, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.w(i4113, pVar11111, qVar, pVar11113, pVar11114, s1Var, pVar11112, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i512 & 896) | 12582912 | (i512 & 7168), 114);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar2 = mVar3;
                pVar9 = pVarF;
                pVar10 = pVarG;
                pVar11 = pVarH;
                pVar12 = pVarE;
                i37 = iA;
                c4Var2 = c4VarA;
                j17 = j212;
                j18 = j19;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                c4Var2 = c4Var;
                pVar9 = pVar5;
                pVar10 = pVar6;
                pVar11 = pVar7;
                pVar12 = pVar8;
                i37 = i15;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.vh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        pVar5 = pVar;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                pVar6 = pVar2;
                if (rVarH.G(pVar6)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i18 |= i25;
            }
            i26 = i17 & 8;
            if (i26 != 0) {
                if ((i16 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (rVarH.G(pVar7)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 16;
                if (i28 != 0) {
                    if ((i16 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (rVarH.G(pVar8)) {
                            i29 = 16384;
                        } else {
                            i29 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i29;
                    }
                    i35 = i17 & 32;
                    if (i35 != 0) {
                        i18 |= 196608;
                    } else if ((i16 & 196608) == 0) {
                        if (rVarH.c(i15)) {
                            i36 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i36 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i36;
                    }
                    if ((i16 & 1572864) != 0) {
                        if ((i17 & 64) == 0) {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i45;
                    }
                    if ((i16 & 12582912) != 0) {
                        if ((i17 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                    if ((i16 & 100663296) != 0) {
                        i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                    }
                    if ((i16 & 805306368) == 0) {
                        if (rVarH.G(qVar)) {
                            i38 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i38 = 268435456;
                        }
                        i18 |= i38;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0) {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        } else {
                            if (i46 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i47 != 0) {
                                pVarF = t3.f57779a.f();
                            } else {
                                pVarF = pVar5;
                            }
                            if (i19 != 0) {
                                pVarG = t3.f57779a.g();
                            } else {
                                pVarG = pVar6;
                            }
                            if (i26 != 0) {
                                pVarH = t3.f57779a.h();
                            } else {
                                pVarH = pVar7;
                            }
                            if (i28 != 0) {
                                pVarE = t3.f57779a.e();
                            } else {
                                pVarE = pVar8;
                            }
                            if (i35 != 0) {
                                iA = cc.INSTANCE.a();
                            } else {
                                iA = i15;
                            }
                            if ((i17 & 64) != 0) {
                                i18 &= -3670017;
                                background = d.f9816a.a(rVarH, 6).getBackground();
                            } else {
                                background = j15;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if ((i17 & 256) != 0) {
                                c4VarA = rh.f57581a.a(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                c4VarA = c4Var;
                            }
                            j19 = jE;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i4114 = (234881024 & i18) ^ r19;
                        if (i4114 <= 67108864) {
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        } else {
                            objE = new s1(c4VarA);
                            rVarH.v(objE);
                        }
                        s1Var = (s1) objE;
                        long j213 = background;
                        zW = rVarH.W(s1Var) | ((i4114 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                        objE2 = rVarH.E();
                        if (zW) {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.sh
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return di.v(s1Var, c4VarA, (c4) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        final p pVar11115 = pVarF;
                        final p pVar11116 = pVarG;
                        final p pVar11117 = pVarH;
                        final p pVar11118 = pVarE;
                        final int i4115 = iA;
                        int i513 = i18 >> 12;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j213, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.w(i4115, pVar11115, qVar, pVar11117, pVar11118, s1Var, pVar11116, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, (i513 & 896) | 12582912 | (i513 & 7168), 114);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar2 = mVar3;
                        pVar9 = pVarF;
                        pVar10 = pVarG;
                        pVar11 = pVarH;
                        pVar12 = pVarE;
                        i37 = iA;
                        c4Var2 = c4VarA;
                        j17 = j213;
                        j18 = j19;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        c4Var2 = c4Var;
                        pVar9 = pVar5;
                        pVar10 = pVar6;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        i37 = i15;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.vh
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                pVar8 = pVar4;
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i4116 = (234881024 & i18) ^ r19;
                    if (i4116 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j214 = background;
                    zW = rVarH.W(s1Var) | ((i4116 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar11119 = pVarF;
                    final p pVar111110 = pVarG;
                    final p pVar111111 = pVarH;
                    final p pVar111112 = pVarE;
                    final int i4117 = iA;
                    int i514 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j214, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i4117, pVar11119, qVar, pVar111111, pVar111112, s1Var, pVar111110, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i514 & 896) | 12582912 | (i514 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j214;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            pVar7 = pVar3;
            i28 = i17 & 16;
            if (i28 != 0) {
                if ((i16 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (rVarH.G(pVar8)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i29;
                }
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i4118 = (234881024 & i18) ^ r19;
                    if (i4118 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j215 = background;
                    zW = rVarH.W(s1Var) | ((i4118 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar111113 = pVarF;
                    final p pVar111114 = pVarG;
                    final p pVar111115 = pVarH;
                    final p pVar111116 = pVarE;
                    final int i4119 = iA;
                    int i515 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j215, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i4119, pVar111113, qVar, pVar111115, pVar111116, s1Var, pVar111114, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i515 & 896) | 12582912 | (i515 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j215;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            pVar8 = pVar4;
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (rVarH.c(i15)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i36;
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            }
            if ((i16 & 12582912) != 0) {
                if ((i17 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i16 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i38 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i38 = 268435456;
                }
                i18 |= i38;
            }
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                } else {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i41110 = (234881024 & i18) ^ r19;
                if (i41110 <= 67108864) {
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                } else {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                }
                s1Var = (s1) objE;
                long j216 = background;
                zW = rVarH.W(s1Var) | ((i41110 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                final p pVar111117 = pVarF;
                final p pVar111118 = pVarG;
                final p pVar111119 = pVarH;
                final p pVar1111110 = pVarE;
                final int i41111 = iA;
                int i516 = i18 >> 12;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j216, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.w(i41111, pVar111117, qVar, pVar111119, pVar1111110, s1Var, pVar111118, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i516 & 896) | 12582912 | (i516 & 7168), 114);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar2 = mVar3;
                pVar9 = pVarF;
                pVar10 = pVarG;
                pVar11 = pVarH;
                pVar12 = pVarE;
                i37 = iA;
                c4Var2 = c4VarA;
                j17 = j216;
                j18 = j19;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                c4Var2 = c4Var;
                pVar9 = pVar5;
                pVar10 = pVar6;
                pVar11 = pVar7;
                pVar12 = pVar8;
                i37 = i15;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.vh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        pVar6 = pVar2;
        i26 = i17 & 8;
        if (i26 != 0) {
            if ((i16 & 3072) == 0) {
                pVar7 = pVar3;
                if (rVarH.G(pVar7)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i18 |= i27;
            }
            i28 = i17 & 16;
            if (i28 != 0) {
                if ((i16 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (rVarH.G(pVar8)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i29;
                }
                i35 = i17 & 32;
                if (i35 != 0) {
                    i18 |= 196608;
                } else if ((i16 & 196608) == 0) {
                    if (rVarH.c(i15)) {
                        i36 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i36 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i36;
                }
                if ((i16 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i45;
                }
                if ((i16 & 12582912) != 0) {
                    if ((i17 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i16 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) == 0) {
                    if (rVarH.G(qVar)) {
                        i38 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i38 = 268435456;
                    }
                    i18 |= i38;
                }
                if ((i18 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    } else {
                        if (i46 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i47 != 0) {
                            pVarF = t3.f57779a.f();
                        } else {
                            pVarF = pVar5;
                        }
                        if (i19 != 0) {
                            pVarG = t3.f57779a.g();
                        } else {
                            pVarG = pVar6;
                        }
                        if (i26 != 0) {
                            pVarH = t3.f57779a.h();
                        } else {
                            pVarH = pVar7;
                        }
                        if (i28 != 0) {
                            pVarE = t3.f57779a.e();
                        } else {
                            pVarE = pVar8;
                        }
                        if (i35 != 0) {
                            iA = cc.INSTANCE.a();
                        } else {
                            iA = i15;
                        }
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                            background = d.f9816a.a(rVarH, 6).getBackground();
                        } else {
                            background = j15;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if ((i17 & 256) != 0) {
                            c4VarA = rh.f57581a.a(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            c4VarA = c4Var;
                        }
                        j19 = jE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i41112 = (234881024 & i18) ^ r19;
                    if (i41112 <= 67108864) {
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    } else {
                        objE = new s1(c4VarA);
                        rVarH.v(objE);
                    }
                    s1Var = (s1) objE;
                    long j217 = background;
                    zW = rVarH.W(s1Var) | ((i41112 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.sh
                            @Override // er.l
                            public final Object b(Object obj) {
                                return di.v(s1Var, c4VarA, (c4) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    final p pVar1111111 = pVarF;
                    final p pVar1111112 = pVarG;
                    final p pVar1111113 = pVarH;
                    final p pVar1111114 = pVarE;
                    final int i41113 = iA;
                    int i517 = i18 >> 12;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j217, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.w(i41113, pVar1111111, qVar, pVar1111113, pVar1111114, s1Var, pVar1111112, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i517 & 896) | 12582912 | (i517 & 7168), 114);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar2 = mVar3;
                    pVar9 = pVarF;
                    pVar10 = pVarG;
                    pVar11 = pVarH;
                    pVar12 = pVarE;
                    i37 = iA;
                    c4Var2 = c4VarA;
                    j17 = j217;
                    j18 = j19;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    c4Var2 = c4Var;
                    pVar9 = pVar5;
                    pVar10 = pVar6;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    i37 = i15;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.vh
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            pVar8 = pVar4;
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (rVarH.c(i15)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i36;
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            }
            if ((i16 & 12582912) != 0) {
                if ((i17 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i16 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i38 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i38 = 268435456;
                }
                i18 |= i38;
            }
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                } else {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i41114 = (234881024 & i18) ^ r19;
                if (i41114 <= 67108864) {
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                } else {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                }
                s1Var = (s1) objE;
                long j218 = background;
                zW = rVarH.W(s1Var) | ((i41114 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                final p pVar1111115 = pVarF;
                final p pVar1111116 = pVarG;
                final p pVar1111117 = pVarH;
                final p pVar1111118 = pVarE;
                final int i41115 = iA;
                int i518 = i18 >> 12;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j218, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.w(i41115, pVar1111115, qVar, pVar1111117, pVar1111118, s1Var, pVar1111116, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i518 & 896) | 12582912 | (i518 & 7168), 114);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar2 = mVar3;
                pVar9 = pVarF;
                pVar10 = pVarG;
                pVar11 = pVarH;
                pVar12 = pVarE;
                i37 = iA;
                c4Var2 = c4VarA;
                j17 = j218;
                j18 = j19;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                c4Var2 = c4Var;
                pVar9 = pVar5;
                pVar10 = pVar6;
                pVar11 = pVar7;
                pVar12 = pVar8;
                i37 = i15;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.vh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        pVar7 = pVar3;
        i28 = i17 & 16;
        if (i28 != 0) {
            if ((i16 & 24576) == 0) {
                pVar8 = pVar4;
                if (rVarH.G(pVar8)) {
                    i29 = 16384;
                } else {
                    i29 = PKIFailureInfo.certRevoked;
                }
                i18 |= i29;
            }
            i35 = i17 & 32;
            if (i35 != 0) {
                i18 |= 196608;
            } else if ((i16 & 196608) == 0) {
                if (rVarH.c(i15)) {
                    i36 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i36 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i36;
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            }
            if ((i16 & 12582912) != 0) {
                if ((i17 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i16 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) == 0) {
                if (rVarH.G(qVar)) {
                    i38 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i38 = 268435456;
                }
                i18 |= i38;
            }
            if ((i18 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                } else {
                    if (i46 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i47 != 0) {
                        pVarF = t3.f57779a.f();
                    } else {
                        pVarF = pVar5;
                    }
                    if (i19 != 0) {
                        pVarG = t3.f57779a.g();
                    } else {
                        pVarG = pVar6;
                    }
                    if (i26 != 0) {
                        pVarH = t3.f57779a.h();
                    } else {
                        pVarH = pVar7;
                    }
                    if (i28 != 0) {
                        pVarE = t3.f57779a.e();
                    } else {
                        pVarE = pVar8;
                    }
                    if (i35 != 0) {
                        iA = cc.INSTANCE.a();
                    } else {
                        iA = i15;
                    }
                    if ((i17 & 64) != 0) {
                        i18 &= -3670017;
                        background = d.f9816a.a(rVarH, 6).getBackground();
                    } else {
                        background = j15;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if ((i17 & 256) != 0) {
                        c4VarA = rh.f57581a.a(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        c4VarA = c4Var;
                    }
                    j19 = jE;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i41116 = (234881024 & i18) ^ r19;
                if (i41116 <= 67108864) {
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                } else {
                    objE = new s1(c4VarA);
                    rVarH.v(objE);
                }
                s1Var = (s1) objE;
                long j219 = background;
                zW = rVarH.W(s1Var) | ((i41116 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.sh
                        @Override // er.l
                        public final Object b(Object obj) {
                            return di.v(s1Var, c4VarA, (c4) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                final p pVar1111119 = pVarF;
                final p pVar11111110 = pVarG;
                final p pVar11111111 = pVarH;
                final p pVar11111112 = pVarE;
                final int i41117 = iA;
                int i519 = i18 >> 12;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j219, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.w(i41117, pVar1111119, qVar, pVar11111111, pVar11111112, s1Var, pVar11111110, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i519 & 896) | 12582912 | (i519 & 7168), 114);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar2 = mVar3;
                pVar9 = pVarF;
                pVar10 = pVarG;
                pVar11 = pVarH;
                pVar12 = pVarE;
                i37 = iA;
                c4Var2 = c4VarA;
                j17 = j219;
                j18 = j19;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                c4Var2 = c4Var;
                pVar9 = pVar5;
                pVar10 = pVar6;
                pVar11 = pVar7;
                pVar12 = pVar8;
                i37 = i15;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.vh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        pVar8 = pVar4;
        i35 = i17 & 32;
        if (i35 != 0) {
            i18 |= 196608;
        } else if ((i16 & 196608) == 0) {
            if (rVarH.c(i15)) {
                i36 = PKIFailureInfo.unsupportedVersion;
            } else {
                i36 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i36;
        }
        if ((i16 & 1572864) != 0) {
            if ((i17 & 64) == 0) {
                i45 = PKIFailureInfo.signerNotTrusted;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i45;
        }
        if ((i16 & 12582912) != 0) {
            if ((i17 & 128) == 0) {
                i39 = 4194304;
            } else {
                i39 = 4194304;
            }
            i18 |= i39;
        }
        if ((i16 & 100663296) != 0) {
            i18 |= ((i17 & 256) == 0 || !rVarH.W(c4Var)) ? 33554432 : 67108864;
        }
        if ((i16 & 805306368) == 0) {
            if (rVarH.G(qVar)) {
                i38 = PKIFailureInfo.duplicateCertReq;
            } else {
                i38 = 268435456;
            }
            i18 |= i38;
        }
        if ((i18 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i46 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i47 != 0) {
                    pVarF = t3.f57779a.f();
                } else {
                    pVarF = pVar5;
                }
                if (i19 != 0) {
                    pVarG = t3.f57779a.g();
                } else {
                    pVarG = pVar6;
                }
                if (i26 != 0) {
                    pVarH = t3.f57779a.h();
                } else {
                    pVarH = pVar7;
                }
                if (i28 != 0) {
                    pVarE = t3.f57779a.e();
                } else {
                    pVarE = pVar8;
                }
                if (i35 != 0) {
                    iA = cc.INSTANCE.a();
                } else {
                    iA = i15;
                }
                if ((i17 & 64) != 0) {
                    i18 &= -3670017;
                    background = d.f9816a.a(rVarH, 6).getBackground();
                } else {
                    background = j15;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jE = j16;
                }
                if ((i17 & 256) != 0) {
                    c4VarA = rh.f57581a.a(rVarH, 6);
                    i18 &= -234881025;
                } else {
                    c4VarA = c4Var;
                }
                j19 = jE;
            } else {
                if (i46 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i47 != 0) {
                    pVarF = t3.f57779a.f();
                } else {
                    pVarF = pVar5;
                }
                if (i19 != 0) {
                    pVarG = t3.f57779a.g();
                } else {
                    pVarG = pVar6;
                }
                if (i26 != 0) {
                    pVarH = t3.f57779a.h();
                } else {
                    pVarH = pVar7;
                }
                if (i28 != 0) {
                    pVarE = t3.f57779a.e();
                } else {
                    pVarE = pVar8;
                }
                if (i35 != 0) {
                    iA = cc.INSTANCE.a();
                } else {
                    iA = i15;
                }
                if ((i17 & 64) != 0) {
                    i18 &= -3670017;
                    background = d.f9816a.a(rVarH, 6).getBackground();
                } else {
                    background = j15;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(background, rVarH, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jE = j16;
                }
                if ((i17 & 256) != 0) {
                    c4VarA = rh.f57581a.a(rVarH, 6);
                    i18 &= -234881025;
                } else {
                    c4VarA = c4Var;
                }
                j19 = jE;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-1211482744, i18, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            int i41118 = (234881024 & i18) ^ r19;
            if (i41118 <= 67108864) {
            }
            objE = rVarH.E();
            if (z16) {
                objE = new s1(c4VarA);
                rVarH.v(objE);
            } else {
                objE = new s1(c4VarA);
                rVarH.v(objE);
            }
            s1Var = (s1) objE;
            long j2110 = background;
            zW = rVarH.W(s1Var) | ((i41118 <= 67108864 && rVarH.W(c4VarA)) || (i18 & 100663296) == 67108864);
            objE2 = rVarH.E();
            if (zW) {
                objE2 = new l() { // from class: f2.sh
                    @Override // er.l
                    public final Object b(Object obj) {
                        return di.v(s1Var, c4VarA, (c4) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new l() { // from class: f2.sh
                    @Override // er.l
                    public final Object b(Object obj) {
                        return di.v(s1Var, c4VarA, (c4) obj);
                    }
                };
                rVarH.v(objE2);
            }
            final p pVar11111113 = pVarF;
            final p pVar11111114 = pVarG;
            final p pVar11111115 = pVarH;
            final p pVar11111116 = pVarE;
            final int i41119 = iA;
            int i5110 = i18 >> 12;
            rVar2 = rVarH;
            androidx.compose.material3.l.g(g4.b(mVar3, (l) objE2), null, j2110, j19, 0.0f, 0.0f, null, y2.m.d(848889571, true, new p() { // from class: f2.uh
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return di.w(i41119, pVar11111113, qVar, pVar11111115, pVar11111116, s1Var, pVar11111114, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i5110 & 896) | 12582912 | (i5110 & 7168), 114);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar3;
            pVar9 = pVarF;
            pVar10 = pVarG;
            pVar11 = pVarH;
            pVar12 = pVarE;
            i37 = iA;
            c4Var2 = c4VarA;
            j17 = j2110;
            j18 = j19;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar2 = mVar;
            c4Var2 = c4Var;
            pVar9 = pVar5;
            pVar10 = pVar6;
            pVar11 = pVar7;
            pVar12 = pVar8;
            i37 = i15;
            j17 = j15;
            j18 = j16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.vh
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return di.x(mVar2, pVar9, pVar10, pVar11, pVar12, i37, j17, j18, c4Var2, qVar, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void m(final int i15, final p<? super r, ? super Integer, i0> pVar, final q<? super d3, ? super r, ? super Integer, i0> qVar, final p<? super r, ? super Integer, i0> pVar2, final p<? super r, ? super Integer, i0> pVar3, final c4 c4Var, final p<? super r, ? super Integer, i0> pVar4, r rVar, final int i16) {
        int i17;
        int i18;
        int i19;
        r rVarH = rVar.h(-280287501);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(qVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.G(pVar2) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= rVarH.G(pVar3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i16) == 0) {
            i17 |= rVarH.W(c4Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i17 |= rVarH.G(pVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((i17 & 599187) != 599186, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-280287501, i17, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new a();
                rVarH.v(objE);
            }
            final a aVar = (a) objE;
            boolean z15 = (i17 & 112) == 32;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = y2.m.b(605195056, true, new p() { // from class: f2.wh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.n(pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                });
                rVarH.v(objE2);
            }
            final p pVar5 = (p) objE2;
            boolean z16 = (i17 & 7168) == 2048;
            Object objE3 = rVarH.E();
            if (z16 || objE3 == companion.a()) {
                objE3 = y2.m.b(418899191, true, new p() { // from class: f2.xh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.o(pVar2, (r) obj, ((Integer) obj2).intValue());
                    }
                });
                rVarH.v(objE3);
            }
            final p pVar6 = (p) objE3;
            boolean z17 = (57344 & i17) == 16384;
            Object objE4 = rVarH.E();
            if (z17 || objE4 == companion.a()) {
                objE4 = y2.m.b(338600263, true, new p() { // from class: f2.yh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.p(pVar3, (r) obj, ((Integer) obj2).intValue());
                    }
                });
                rVarH.v(objE4);
            }
            final p pVar7 = (p) objE4;
            boolean z18 = (i17 & 896) == 256;
            Object objE5 = rVarH.E();
            if (z18 || objE5 == companion.a()) {
                objE5 = y2.m.b(-1776388365, true, new p() { // from class: f2.zh
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.q(qVar, aVar, (r) obj, ((Integer) obj2).intValue());
                    }
                });
                rVarH.v(objE5);
            }
            final p pVar8 = (p) objE5;
            boolean z19 = (3670016 & i17) == 1048576;
            Object objE6 = rVarH.E();
            if (z19 || objE6 == companion.a()) {
                objE6 = y2.m.b(-1731662488, true, new p() { // from class: f2.ai
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.r(pVar4, (r) obj, ((Integer) obj2).intValue());
                    }
                });
                rVarH.v(objE6);
            }
            final p pVar9 = (p) objE6;
            boolean zW = ((458752 & i17) == 131072) | rVarH.W(pVar5) | rVarH.W(pVar6) | rVarH.W(pVar7) | ((i17 & 14) == 4) | rVarH.W(pVar9) | rVarH.W(pVar8);
            Object objE7 = rVarH.E();
            if (zW || objE7 == companion.a()) {
                i18 = 1;
                i19 = 0;
                p pVar10 = new p() { // from class: f2.bi
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return di.s(c4Var, pVar5, pVar6, pVar7, i15, pVar9, aVar, pVar8, (s2) obj, (b) obj2);
                    }
                };
                rVarH.v(pVar10);
                objE7 = pVar10;
            } else {
                i19 = 0;
                i18 = 1;
            }
            p2.b(null, (p) objE7, rVarH, i19, i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ci
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return di.u(i15, pVar, qVar, pVar2, pVar3, c4Var, pVar4, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(605195056, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(418899191, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(338600263, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:161)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(q qVar, a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1776388365, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            qVar.w(aVar, rVar, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1731662488, i15, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:164)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 s(final c4 c4Var, p pVar, p pVar2, p pVar3, int i15, p pVar4, a aVar, p pVar5, final s2 s2Var, b bVar) {
        int iX0;
        int iX1;
        int i16;
        bc bcVar;
        Integer numValueOf;
        int iIntValue;
        int height;
        int iA;
        final int iL = b.l(bVar.getValue());
        final int iK = b.k(bVar.getValue());
        long jD = b.d(bVar.getValue(), 0, 0, 0, 0, 10, null);
        int iC = c4Var.c(s2Var, s2Var.getLayoutDirection());
        int iD = c4Var.d(s2Var, s2Var.getLayoutDirection());
        int iA2 = c4Var.a(s2Var);
        final a2 a2VarO0 = ((v0) v.l0(s2Var.g0(ei.TopBar, pVar))).o0(jD);
        int i17 = (-iC) - iD;
        int i18 = -iA2;
        final a2 a2VarO1 = ((v0) v.l0(s2Var.g0(ei.Snackbar, pVar2))).o0(c5.c.i(jD, i17, i18));
        final a2 a2VarO2 = ((v0) v.l0(s2Var.g0(ei.Fab, pVar3))).o0(c5.c.i(jD, i17, i18));
        if (a2VarO2.getWidth() == 0 && a2VarO2.getHeight() == 0) {
            bcVar = null;
        } else {
            int width = a2VarO2.getWidth();
            int height2 = a2VarO2.getHeight();
            cc.Companion companion = cc.INSTANCE;
            if (cc.e(i15, companion.c())) {
                if (s2Var.getLayoutDirection() == t.Ltr) {
                    iX0 = s2Var.X0(f55623a);
                    i16 = iX0 + iC;
                } else {
                    iX1 = s2Var.X0(f55623a);
                    i16 = ((iL - iX1) - width) - iD;
                }
            } else if (!cc.e(i15, companion.a()) && !cc.e(i15, companion.b())) {
                i16 = (((iL - width) + iC) - iD) / 2;
            } else if (s2Var.getLayoutDirection() == t.Ltr) {
                iX1 = s2Var.X0(f55623a);
                i16 = ((iL - iX1) - width) - iD;
            } else {
                iX0 = s2Var.X0(f55623a);
                i16 = iX0 + iC;
            }
            bcVar = new bc(i16, width, height2);
        }
        final a2 a2VarO3 = ((v0) v.l0(s2Var.g0(ei.BottomBar, pVar4))).o0(jD);
        int i19 = 0;
        boolean z15 = a2VarO3.getWidth() == 0 && a2VarO3.getHeight() == 0;
        if (bcVar != null) {
            if (z15 || cc.e(i15, cc.INSTANCE.b())) {
                height = bcVar.getHeight() + s2Var.X0(f55623a);
                iA = c4Var.a(s2Var);
            } else {
                height = a2VarO3.getHeight() + bcVar.getHeight();
                iA = s2Var.X0(f55623a);
            }
            numValueOf = Integer.valueOf(height + iA);
        } else {
            numValueOf = null;
        }
        int height3 = a2VarO1.getHeight();
        if (height3 != 0) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                Integer numValueOf2 = Integer.valueOf(a2VarO3.getHeight());
                if (z15) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : c4Var.a(s2Var);
            }
            i19 = iIntValue + height3;
        }
        d3 d3VarE = f4.e(c4Var, s2Var);
        final Integer num = numValueOf;
        final bc bcVar2 = bcVar;
        aVar.f(d1.a3.h(d1.a3.k(d3VarE, s2Var.getLayoutDirection()), (a2VarO0.getWidth() == 0 && a2VarO0.getHeight() == 0) ? d3VarE.getTop() : s2Var.b2(a2VarO0.getHeight()), d1.a3.j(d3VarE, s2Var.getLayoutDirection()), z15 ? d3VarE.getBottom() : s2Var.b2(a2VarO3.getHeight())));
        final a2 a2VarO4 = ((v0) v.l0(s2Var.g0(ei.MainContent, pVar5))).o0(jD);
        final int i25 = i19;
        return y0.j2(s2Var, iL, iK, null, new l() { // from class: f2.th
            @Override // er.l
            public final Object b(Object obj) {
                return di.t(a2VarO4, a2VarO0, a2VarO1, iL, c4Var, s2Var, iK, i25, a2VarO3, bcVar2, a2VarO2, num, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(a2 a2Var, a2 a2Var2, a2 a2Var3, int i15, c4 c4Var, s2 s2Var, int i16, int i17, a2 a2Var4, bc bcVar, a2 a2Var5, Integer num, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        a2.a.E(aVar, a2Var2, 0, 0, 0.0f, 4, null);
        a2.a.E(aVar, a2Var3, (((i15 - a2Var3.getWidth()) + c4Var.c(s2Var, s2Var.getLayoutDirection())) - c4Var.d(s2Var, s2Var.getLayoutDirection())) / 2, i16 - i17, 0.0f, 4, null);
        a2.a.E(aVar, a2Var4, 0, i16 - a2Var4.getHeight(), 0.0f, 4, null);
        if (bcVar != null) {
            a2.a.E(aVar, a2Var5, bcVar.getLeft(), i16 - num.intValue(), 0.0f, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(int i15, p pVar, q qVar, p pVar2, p pVar3, c4 c4Var, p pVar4, int i16, r rVar, int i17) {
        m(i15, pVar, qVar, pVar2, pVar3, c4Var, pVar4, rVar, p076m2.g4.a(i16 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(s1 s1Var, c4 c4Var, c4 c4Var2) {
        s1Var.f(f4.g(c4Var, c4Var2));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(int i15, p pVar, q qVar, p pVar2, p pVar3, s1 s1Var, p pVar4, r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(848889571, i16, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            m(i15, pVar, qVar, pVar2, pVar3, s1Var, pVar4, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(m mVar, p pVar, p pVar2, p pVar3, p pVar4, int i15, long j15, long j16, c4 c4Var, q qVar, int i16, int i17, r rVar, int i18) {
        l(mVar, pVar, pVar2, pVar3, pVar4, i15, j15, j16, c4Var, qVar, rVar, p076m2.g4.a(i16 | 1), i17);
        return i0.f148189a;
    }
}
