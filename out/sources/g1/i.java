package g1;

import d1.a3;
import d1.d3;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p143z0.k2;
import w0.g2;
import w0.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lg1/b;", "columns", "Lf3/m;", "modifier", "Lg1/e1;", "state", "Ld1/d3;", "contentPadding", "", "reverseLayout", "Ld1/i$n;", "verticalArrangement", "Ld1/i$e;", "horizontalArrangement", "Lz0/e1;", "flingBehavior", "userScrollEnabled", "Lw0/g2;", "overscrollEffect", "Lkotlin/Function1;", "Lg1/t0;", "Loq/i0;", "content", "c", "(Lg1/b;Lf3/m;Lg1/e1;Ld1/d3;ZLd1/i$n;Ld1/i$e;Lz0/e1;ZLw0/g2;Ler/l;Lm2/r;III)V", "Lg1/w0;", "g", "(Lg1/b;Ld1/i$e;Lm2/r;I)Lg1/w0;", "", "gridSize", "slotCount", "spacing", "", "f", "(III)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:111:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0132  */
    /* JADX WARN: Code duplicated, block: B:114:0x0139  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01da  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0201  */
    /* JADX WARN: Code duplicated, block: B:176:0x021c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0229  */
    /* JADX WARN: Code duplicated, block: B:182:0x027b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0290  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
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
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    public static final void c(final b bVar, f3.m mVar, e1 e1Var, d3 d3Var, boolean z15, d1.i.n nVar, d1.i.e eVar, p143z0.e1 e1Var2, boolean z16, g2 g2Var, final er.l<? super t0, oq.i0> lVar, p076m2.r rVar, final int i15, final int i16, final int i17) {
        int i18;
        f3.m mVar2;
        e1 e1Var3;
        int i19;
        d3 d3Var2;
        int i25;
        int i26;
        boolean z17;
        int i27;
        int i28;
        d1.i.e eVar2;
        int i29;
        int i35;
        int i36;
        int i37;
        boolean z18;
        p076m2.r rVar2;
        final d1.i.n nVar2;
        final boolean z19;
        final f3.m mVar3;
        final e1 e1Var4;
        final d3 d3Var3;
        final boolean z25;
        final d1.i.e eVar3;
        final p143z0.e1 e1Var5;
        final g2 g2Var2;
        d5 d5VarM;
        f3.m mVar4;
        e1 e1VarG;
        d3 d3VarE;
        d1.i.n nVarD;
        d1.i.e eVarJ;
        p143z0.e1 e1VarA;
        g2 g2VarD;
        e1 e1Var6;
        d3 d3Var4;
        d1.i.n nVar3;
        p143z0.e1 e1Var7;
        boolean z26;
        boolean z27;
        int i38;
        d1.i iVar;
        int i39;
        int i45;
        p076m2.r rVarH = rVar.h(-2072102870);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.W(bVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i46 = i17 & 2;
        if (i46 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    e1Var3 = e1Var;
                    int i47 = rVarH.W(e1Var3) ? 256 : 128;
                    i18 |= i47;
                } else {
                    e1Var3 = e1Var;
                }
                i18 |= i47;
            } else {
                e1Var3 = e1Var;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    d3Var2 = d3Var;
                    if (rVarH.W(d3Var2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        z17 = z15;
                        if (rVarH.a(z17)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i27;
                    }
                    if ((i15 & 196608) != 0) {
                        if ((i17 & 32) == 0 || !rVarH.W(nVar)) {
                            i45 = PKIFailureInfo.notAuthorized;
                        } else {
                            i45 = PKIFailureInfo.unsupportedVersion;
                        }
                        i18 |= i45;
                    }
                    i28 = i17 & 64;
                    if (i28 != 0) {
                        if ((i15 & 1572864) == 0) {
                            eVar2 = eVar;
                            if (rVarH.W(eVar2)) {
                                i29 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i29 = PKIFailureInfo.signerNotTrusted;
                            }
                            i18 |= i29;
                        }
                        if ((i15 & 12582912) != 0) {
                            i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                        }
                        i35 = i17 & 256;
                        if (i35 != 0) {
                            i18 |= 100663296;
                        } else if ((i15 & 100663296) == 0) {
                            if (rVarH.a(z16)) {
                                i36 = 67108864;
                            } else {
                                i36 = 33554432;
                            }
                            i18 |= i36;
                        }
                        if ((i15 & 805306368) != 0) {
                            i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                        }
                        if ((i16 & 6) == 0) {
                            if (rVarH.G(lVar)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i37 = i16 | i39;
                        } else {
                            i37 = i16;
                        }
                        if ((i18 & 306783379) == 306783378 || (i37 & 3) != 2) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i46 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 4) != 0) {
                                    e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                    i18 &= -897;
                                } else {
                                    e1VarG = e1Var3;
                                }
                                if (i19 != 0) {
                                    d3VarE = a3.e(c5.h.n(0));
                                } else {
                                    d3VarE = d3Var2;
                                }
                                if (i26 != 0) {
                                    z17 = false;
                                }
                                if ((i17 & 32) != 0) {
                                    iVar = d1.i.f39152a;
                                    if (z17) {
                                        nVarD = iVar.d();
                                    } else {
                                        nVarD = iVar.k();
                                    }
                                    i18 &= -458753;
                                } else {
                                    nVarD = nVar;
                                }
                                if (i28 != 0) {
                                    eVarJ = d1.i.f39152a.j();
                                } else {
                                    eVarJ = eVar2;
                                }
                                if ((i17 & 128) != 0) {
                                    e1VarA = k2.f231404a.a(rVarH, 6);
                                    i18 &= -29360129;
                                } else {
                                    e1VarA = e1Var2;
                                }
                                boolean z28 = i35 == 0 ? z16 : true;
                                if ((i17 & 512) != 0) {
                                    i18 &= -1879048193;
                                    g2VarD = j2.d(rVarH, 0);
                                } else {
                                    g2VarD = g2Var;
                                }
                                e1Var6 = e1VarG;
                                d3Var4 = d3VarE;
                                nVar3 = nVarD;
                                e1Var7 = e1VarA;
                                z26 = z17;
                                z27 = z28;
                                i38 = -2072102870;
                            } else {
                                rVarH.O();
                                if ((i17 & 4) != 0) {
                                    i18 &= -897;
                                }
                                if ((i17 & 32) != 0) {
                                    i18 &= -458753;
                                }
                                if ((i17 & 128) != 0) {
                                    i18 &= -29360129;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 &= -1879048193;
                                }
                                nVar3 = nVar;
                                e1Var7 = e1Var2;
                                z27 = z16;
                                g2VarD = g2Var;
                                e1Var6 = e1Var3;
                                d3Var4 = d3Var2;
                                z26 = z17;
                                eVarJ = eVar2;
                                i38 = -2072102870;
                                mVar4 = mVar2;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                            }
                            int i48 = i18 >> 3;
                            rVar2 = rVarH;
                            d1.i.e eVar4 = eVarJ;
                            c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar4, lVar, rVar2, (i48 & 234881024) | (i48 & 14) | 196608 | (i48 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i48) | (29360128 & i48) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar4;
                            e1Var4 = e1Var6;
                            d3Var3 = d3Var4;
                            z25 = z26;
                            e1Var5 = e1Var7;
                            z19 = z27;
                            g2Var2 = g2VarD;
                            nVar2 = nVar3;
                            eVar3 = eVar4;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            nVar2 = nVar;
                            z19 = z16;
                            mVar3 = mVar2;
                            e1Var4 = e1Var3;
                            d3Var3 = d3Var2;
                            z25 = z17;
                            eVar3 = eVar2;
                            e1Var5 = e1Var2;
                            g2Var2 = g2Var;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: g1.g
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 1572864;
                    eVar2 = eVar;
                    if ((i15 & 12582912) != 0) {
                        i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                    }
                    i35 = i17 & 256;
                    if (i35 != 0) {
                        i18 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (rVarH.a(z16)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i18 |= i36;
                    }
                    if ((i15 & 805306368) != 0) {
                        i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i16 & 6) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i37 = i16 | i39;
                    } else {
                        i37 = i16;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        } else {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i49 = i18 >> 3;
                        rVar2 = rVarH;
                        d1.i.e eVar5 = eVarJ;
                        c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar5, lVar, rVar2, (i49 & 234881024) | (i49 & 14) | 196608 | (i49 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i49) | (29360128 & i49) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                        e1Var4 = e1Var6;
                        d3Var3 = d3Var4;
                        z25 = z26;
                        e1Var5 = e1Var7;
                        z19 = z27;
                        g2Var2 = g2VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar5;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        nVar2 = nVar;
                        z19 = z16;
                        mVar3 = mVar2;
                        e1Var4 = e1Var3;
                        d3Var3 = d3Var2;
                        z25 = z17;
                        eVar3 = eVar2;
                        e1Var5 = e1Var2;
                        g2Var2 = g2Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g1.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                z17 = z15;
                if ((i15 & 196608) != 0) {
                    if ((i17 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i45;
                }
                i28 = i17 & 64;
                if (i28 != 0) {
                    if ((i15 & 1572864) == 0) {
                        eVar2 = eVar;
                        if (rVarH.W(eVar2)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i29;
                    }
                    if ((i15 & 12582912) != 0) {
                        i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                    }
                    i35 = i17 & 256;
                    if (i35 != 0) {
                        i18 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (rVarH.a(z16)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i18 |= i36;
                    }
                    if ((i15 & 805306368) != 0) {
                        i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i16 & 6) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i37 = i16 | i39;
                    } else {
                        i37 = i16;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        } else {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i410 = i18 >> 3;
                        rVar2 = rVarH;
                        d1.i.e eVar6 = eVarJ;
                        c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar6, lVar, rVar2, (i410 & 234881024) | (i410 & 14) | 196608 | (i410 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i410) | (29360128 & i410) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                        e1Var4 = e1Var6;
                        d3Var3 = d3Var4;
                        z25 = z26;
                        e1Var5 = e1Var7;
                        z19 = z27;
                        g2Var2 = g2VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar6;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        nVar2 = nVar;
                        z19 = z16;
                        mVar3 = mVar2;
                        e1Var4 = e1Var3;
                        d3Var3 = d3Var2;
                        z25 = z17;
                        eVar3 = eVar2;
                        e1Var5 = e1Var2;
                        g2Var2 = g2Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g1.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 1572864;
                eVar2 = eVar;
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i411 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar7 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar7, lVar, rVar2, (i411 & 234881024) | (i411 & 14) | 196608 | (i411 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i411) | (29360128 & i411) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar7;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            d3Var2 = d3Var;
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z17 = z15;
                    if (rVarH.a(z17)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                if ((i15 & 196608) != 0) {
                    if ((i17 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i45;
                }
                i28 = i17 & 64;
                if (i28 != 0) {
                    if ((i15 & 1572864) == 0) {
                        eVar2 = eVar;
                        if (rVarH.W(eVar2)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i29;
                    }
                    if ((i15 & 12582912) != 0) {
                        i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                    }
                    i35 = i17 & 256;
                    if (i35 != 0) {
                        i18 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (rVarH.a(z16)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i18 |= i36;
                    }
                    if ((i15 & 805306368) != 0) {
                        i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i16 & 6) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i37 = i16 | i39;
                    } else {
                        i37 = i16;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        } else {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i412 = i18 >> 3;
                        rVar2 = rVarH;
                        d1.i.e eVar8 = eVarJ;
                        c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar8, lVar, rVar2, (i412 & 234881024) | (i412 & 14) | 196608 | (i412 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i412) | (29360128 & i412) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                        e1Var4 = e1Var6;
                        d3Var3 = d3Var4;
                        z25 = z26;
                        e1Var5 = e1Var7;
                        z19 = z27;
                        g2Var2 = g2VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar8;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        nVar2 = nVar;
                        z19 = z16;
                        mVar3 = mVar2;
                        e1Var4 = e1Var3;
                        d3Var3 = d3Var2;
                        z25 = z17;
                        eVar3 = eVar2;
                        e1Var5 = e1Var2;
                        g2Var2 = g2Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g1.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 1572864;
                eVar2 = eVar;
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i413 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar9 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar9, lVar, rVar2, (i413 & 234881024) | (i413 & 14) | 196608 | (i413 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i413) | (29360128 & i413) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar9;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z17 = z15;
            if ((i15 & 196608) != 0) {
                if ((i17 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i45;
            }
            i28 = i17 & 64;
            if (i28 != 0) {
                if ((i15 & 1572864) == 0) {
                    eVar2 = eVar;
                    if (rVarH.W(eVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i414 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar10 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar10, lVar, rVar2, (i414 & 234881024) | (i414 & 14) | 196608 | (i414 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i414) | (29360128 & i414) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar10;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 1572864;
            eVar2 = eVar;
            if ((i15 & 12582912) != 0) {
                i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
            }
            i35 = i17 & 256;
            if (i35 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.a(z16)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i18 |= i36;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i37 = i16 | i39;
            } else {
                i37 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i415 = i18 >> 3;
                rVar2 = rVarH;
                d1.i.e eVar11 = eVarJ;
                c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar11, lVar, rVar2, (i415 & 234881024) | (i415 & 14) | 196608 | (i415 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i415) | (29360128 & i415) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                e1Var4 = e1Var6;
                d3Var3 = d3Var4;
                z25 = z26;
                e1Var5 = e1Var7;
                z19 = z27;
                g2Var2 = g2VarD;
                nVar2 = nVar3;
                eVar3 = eVar11;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                nVar2 = nVar;
                z19 = z16;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
                d3Var3 = d3Var2;
                z25 = z17;
                eVar3 = eVar2;
                e1Var5 = e1Var2;
                g2Var2 = g2Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                e1Var3 = e1Var;
                if (rVarH.W(e1Var3)) {
                }
                i18 |= i47;
            } else {
                e1Var3 = e1Var;
            }
            i18 |= i47;
        } else {
            e1Var3 = e1Var;
        }
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                d3Var2 = d3Var;
                if (rVarH.W(d3Var2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i18 |= i25;
            }
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z17 = z15;
                    if (rVarH.a(z17)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                if ((i15 & 196608) != 0) {
                    if ((i17 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i45;
                }
                i28 = i17 & 64;
                if (i28 != 0) {
                    if ((i15 & 1572864) == 0) {
                        eVar2 = eVar;
                        if (rVarH.W(eVar2)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i29;
                    }
                    if ((i15 & 12582912) != 0) {
                        i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                    }
                    i35 = i17 & 256;
                    if (i35 != 0) {
                        i18 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (rVarH.a(z16)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i18 |= i36;
                    }
                    if ((i15 & 805306368) != 0) {
                        i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i16 & 6) == 0) {
                        if (rVarH.G(lVar)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i37 = i16 | i39;
                    } else {
                        i37 = i16;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        } else {
                            if (i46 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 4) != 0) {
                                e1VarG = j1.g(0, 0, rVarH, 0, 3);
                                i18 &= -897;
                            } else {
                                e1VarG = e1Var3;
                            }
                            if (i19 != 0) {
                                d3VarE = a3.e(c5.h.n(0));
                            } else {
                                d3VarE = d3Var2;
                            }
                            if (i26 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                iVar = d1.i.f39152a;
                                if (z17) {
                                    nVarD = iVar.k();
                                } else {
                                    nVarD = iVar.d();
                                }
                                i18 &= -458753;
                            } else {
                                nVarD = nVar;
                            }
                            if (i28 != 0) {
                                eVarJ = d1.i.f39152a.j();
                            } else {
                                eVarJ = eVar2;
                            }
                            if ((i17 & 128) != 0) {
                                e1VarA = k2.f231404a.a(rVarH, 6);
                                i18 &= -29360129;
                            } else {
                                e1VarA = e1Var2;
                            }
                            if (i35 == 0) {
                            }
                            if ((i17 & 512) != 0) {
                                i18 &= -1879048193;
                                g2VarD = j2.d(rVarH, 0);
                            } else {
                                g2VarD = g2Var;
                            }
                            e1Var6 = e1VarG;
                            d3Var4 = d3VarE;
                            nVar3 = nVarD;
                            e1Var7 = e1VarA;
                            z26 = z17;
                            z27 = z28;
                            i38 = -2072102870;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i416 = i18 >> 3;
                        rVar2 = rVarH;
                        d1.i.e eVar12 = eVarJ;
                        c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar12, lVar, rVar2, (i416 & 234881024) | (i416 & 14) | 196608 | (i416 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i416) | (29360128 & i416) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                        e1Var4 = e1Var6;
                        d3Var3 = d3Var4;
                        z25 = z26;
                        e1Var5 = e1Var7;
                        z19 = z27;
                        g2Var2 = g2VarD;
                        nVar2 = nVar3;
                        eVar3 = eVar12;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        nVar2 = nVar;
                        z19 = z16;
                        mVar3 = mVar2;
                        e1Var4 = e1Var3;
                        d3Var3 = d3Var2;
                        z25 = z17;
                        eVar3 = eVar2;
                        e1Var5 = e1Var2;
                        g2Var2 = g2Var;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g1.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 1572864;
                eVar2 = eVar;
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i417 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar13 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar13, lVar, rVar2, (i417 & 234881024) | (i417 & 14) | 196608 | (i417 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i417) | (29360128 & i417) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar13;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z17 = z15;
            if ((i15 & 196608) != 0) {
                if ((i17 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i45;
            }
            i28 = i17 & 64;
            if (i28 != 0) {
                if ((i15 & 1572864) == 0) {
                    eVar2 = eVar;
                    if (rVarH.W(eVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i418 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar14 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar14, lVar, rVar2, (i418 & 234881024) | (i418 & 14) | 196608 | (i418 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i418) | (29360128 & i418) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar14;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 1572864;
            eVar2 = eVar;
            if ((i15 & 12582912) != 0) {
                i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
            }
            i35 = i17 & 256;
            if (i35 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.a(z16)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i18 |= i36;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i37 = i16 | i39;
            } else {
                i37 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i419 = i18 >> 3;
                rVar2 = rVarH;
                d1.i.e eVar15 = eVarJ;
                c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar15, lVar, rVar2, (i419 & 234881024) | (i419 & 14) | 196608 | (i419 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i419) | (29360128 & i419) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                e1Var4 = e1Var6;
                d3Var3 = d3Var4;
                z25 = z26;
                e1Var5 = e1Var7;
                z19 = z27;
                g2Var2 = g2VarD;
                nVar2 = nVar3;
                eVar3 = eVar15;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                nVar2 = nVar;
                z19 = z16;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
                d3Var3 = d3Var2;
                z25 = z17;
                eVar3 = eVar2;
                e1Var5 = e1Var2;
                g2Var2 = g2Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        d3Var2 = d3Var;
        i26 = i17 & 16;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                z17 = z15;
                if (rVarH.a(z17)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i18 |= i27;
            }
            if ((i15 & 196608) != 0) {
                if ((i17 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i45;
            }
            i28 = i17 & 64;
            if (i28 != 0) {
                if ((i15 & 1572864) == 0) {
                    eVar2 = eVar;
                    if (rVarH.W(eVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i15 & 12582912) != 0) {
                    i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
                }
                i35 = i17 & 256;
                if (i35 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.a(z16)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i18 |= i36;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.G(lVar)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i37 = i16 | i39;
                } else {
                    i37 = i16;
                }
                if ((i18 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    } else {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 4) != 0) {
                            e1VarG = j1.g(0, 0, rVarH, 0, 3);
                            i18 &= -897;
                        } else {
                            e1VarG = e1Var3;
                        }
                        if (i19 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        } else {
                            d3VarE = d3Var2;
                        }
                        if (i26 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            iVar = d1.i.f39152a;
                            if (z17) {
                                nVarD = iVar.k();
                            } else {
                                nVarD = iVar.d();
                            }
                            i18 &= -458753;
                        } else {
                            nVarD = nVar;
                        }
                        if (i28 != 0) {
                            eVarJ = d1.i.f39152a.j();
                        } else {
                            eVarJ = eVar2;
                        }
                        if ((i17 & 128) != 0) {
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i18 &= -29360129;
                        } else {
                            e1VarA = e1Var2;
                        }
                        if (i35 == 0) {
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                            g2VarD = j2.d(rVarH, 0);
                        } else {
                            g2VarD = g2Var;
                        }
                        e1Var6 = e1VarG;
                        d3Var4 = d3VarE;
                        nVar3 = nVarD;
                        e1Var7 = e1VarA;
                        z26 = z17;
                        z27 = z28;
                        i38 = -2072102870;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i4110 = i18 >> 3;
                    rVar2 = rVarH;
                    d1.i.e eVar16 = eVarJ;
                    c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar16, lVar, rVar2, (i4110 & 234881024) | (i4110 & 14) | 196608 | (i4110 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i4110) | (29360128 & i4110) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    e1Var4 = e1Var6;
                    d3Var3 = d3Var4;
                    z25 = z26;
                    e1Var5 = e1Var7;
                    z19 = z27;
                    g2Var2 = g2VarD;
                    nVar2 = nVar3;
                    eVar3 = eVar16;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    nVar2 = nVar;
                    z19 = z16;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                    d3Var3 = d3Var2;
                    z25 = z17;
                    eVar3 = eVar2;
                    e1Var5 = e1Var2;
                    g2Var2 = g2Var;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 1572864;
            eVar2 = eVar;
            if ((i15 & 12582912) != 0) {
                i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
            }
            i35 = i17 & 256;
            if (i35 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.a(z16)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i18 |= i36;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i37 = i16 | i39;
            } else {
                i37 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i4111 = i18 >> 3;
                rVar2 = rVarH;
                d1.i.e eVar17 = eVarJ;
                c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar17, lVar, rVar2, (i4111 & 234881024) | (i4111 & 14) | 196608 | (i4111 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i4111) | (29360128 & i4111) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                e1Var4 = e1Var6;
                d3Var3 = d3Var4;
                z25 = z26;
                e1Var5 = e1Var7;
                z19 = z27;
                g2Var2 = g2VarD;
                nVar2 = nVar3;
                eVar3 = eVar17;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                nVar2 = nVar;
                z19 = z16;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
                d3Var3 = d3Var2;
                z25 = z17;
                eVar3 = eVar2;
                e1Var5 = e1Var2;
                g2Var2 = g2Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        z17 = z15;
        if ((i15 & 196608) != 0) {
            if ((i17 & 32) == 0) {
                i45 = PKIFailureInfo.notAuthorized;
            } else {
                i45 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i45;
        }
        i28 = i17 & 64;
        if (i28 != 0) {
            if ((i15 & 1572864) == 0) {
                eVar2 = eVar;
                if (rVarH.W(eVar2)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i29;
            }
            if ((i15 & 12582912) != 0) {
                i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
            }
            i35 = i17 & 256;
            if (i35 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.a(z16)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i18 |= i36;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.G(lVar)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i37 = i16 | i39;
            } else {
                i37 = i16;
            }
            if ((i18 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 4) != 0) {
                        e1VarG = j1.g(0, 0, rVarH, 0, 3);
                        i18 &= -897;
                    } else {
                        e1VarG = e1Var3;
                    }
                    if (i19 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    } else {
                        d3VarE = d3Var2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        iVar = d1.i.f39152a;
                        if (z17) {
                            nVarD = iVar.k();
                        } else {
                            nVarD = iVar.d();
                        }
                        i18 &= -458753;
                    } else {
                        nVarD = nVar;
                    }
                    if (i28 != 0) {
                        eVarJ = d1.i.f39152a.j();
                    } else {
                        eVarJ = eVar2;
                    }
                    if ((i17 & 128) != 0) {
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i18 &= -29360129;
                    } else {
                        e1VarA = e1Var2;
                    }
                    if (i35 == 0) {
                    }
                    if ((i17 & 512) != 0) {
                        i18 &= -1879048193;
                        g2VarD = j2.d(rVarH, 0);
                    } else {
                        g2VarD = g2Var;
                    }
                    e1Var6 = e1VarG;
                    d3Var4 = d3VarE;
                    nVar3 = nVarD;
                    e1Var7 = e1VarA;
                    z26 = z17;
                    z27 = z28;
                    i38 = -2072102870;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                }
                int i4112 = i18 >> 3;
                rVar2 = rVarH;
                d1.i.e eVar18 = eVarJ;
                c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar18, lVar, rVar2, (i4112 & 234881024) | (i4112 & 14) | 196608 | (i4112 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i4112) | (29360128 & i4112) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                e1Var4 = e1Var6;
                d3Var3 = d3Var4;
                z25 = z26;
                e1Var5 = e1Var7;
                z19 = z27;
                g2Var2 = g2VarD;
                nVar2 = nVar3;
                eVar3 = eVar18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                nVar2 = nVar;
                z19 = z16;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
                d3Var3 = d3Var2;
                z25 = z17;
                eVar3 = eVar2;
                e1Var5 = e1Var2;
                g2Var2 = g2Var;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 1572864;
        eVar2 = eVar;
        if ((i15 & 12582912) != 0) {
            i18 |= ((i17 & 128) == 0 || !rVarH.W(e1Var2)) ? 4194304 : 8388608;
        }
        i35 = i17 & 256;
        if (i35 != 0) {
            i18 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (rVarH.a(z16)) {
                i36 = 67108864;
            } else {
                i36 = 33554432;
            }
            i18 |= i36;
        }
        if ((i15 & 805306368) != 0) {
            i18 |= ((i17 & 512) == 0 || !rVarH.W(g2Var)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i16 & 6) == 0) {
            if (rVarH.G(lVar)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i37 = i16 | i39;
        } else {
            i37 = i16;
        }
        if ((i18 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (rVarH.r(z18, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i46 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    e1VarG = j1.g(0, 0, rVarH, 0, 3);
                    i18 &= -897;
                } else {
                    e1VarG = e1Var3;
                }
                if (i19 != 0) {
                    d3VarE = a3.e(c5.h.n(0));
                } else {
                    d3VarE = d3Var2;
                }
                if (i26 != 0) {
                    z17 = false;
                }
                if ((i17 & 32) != 0) {
                    iVar = d1.i.f39152a;
                    if (z17) {
                        nVarD = iVar.k();
                    } else {
                        nVarD = iVar.d();
                    }
                    i18 &= -458753;
                } else {
                    nVarD = nVar;
                }
                if (i28 != 0) {
                    eVarJ = d1.i.f39152a.j();
                } else {
                    eVarJ = eVar2;
                }
                if ((i17 & 128) != 0) {
                    e1VarA = k2.f231404a.a(rVarH, 6);
                    i18 &= -29360129;
                } else {
                    e1VarA = e1Var2;
                }
                if (i35 == 0) {
                }
                if ((i17 & 512) != 0) {
                    i18 &= -1879048193;
                    g2VarD = j2.d(rVarH, 0);
                } else {
                    g2VarD = g2Var;
                }
                e1Var6 = e1VarG;
                d3Var4 = d3VarE;
                nVar3 = nVarD;
                e1Var7 = e1VarA;
                z26 = z17;
                z27 = z28;
                i38 = -2072102870;
            } else {
                if (i46 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 4) != 0) {
                    e1VarG = j1.g(0, 0, rVarH, 0, 3);
                    i18 &= -897;
                } else {
                    e1VarG = e1Var3;
                }
                if (i19 != 0) {
                    d3VarE = a3.e(c5.h.n(0));
                } else {
                    d3VarE = d3Var2;
                }
                if (i26 != 0) {
                    z17 = false;
                }
                if ((i17 & 32) != 0) {
                    iVar = d1.i.f39152a;
                    if (z17) {
                        nVarD = iVar.k();
                    } else {
                        nVarD = iVar.d();
                    }
                    i18 &= -458753;
                } else {
                    nVarD = nVar;
                }
                if (i28 != 0) {
                    eVarJ = d1.i.f39152a.j();
                } else {
                    eVarJ = eVar2;
                }
                if ((i17 & 128) != 0) {
                    e1VarA = k2.f231404a.a(rVarH, 6);
                    i18 &= -29360129;
                } else {
                    e1VarA = e1Var2;
                }
                if (i35 == 0) {
                }
                if ((i17 & 512) != 0) {
                    i18 &= -1879048193;
                    g2VarD = j2.d(rVarH, 0);
                } else {
                    g2VarD = g2Var;
                }
                e1Var6 = e1VarG;
                d3Var4 = d3VarE;
                nVar3 = nVarD;
                e1Var7 = e1VarA;
                z26 = z17;
                z27 = z28;
                i38 = -2072102870;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(i38, i18, i37, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
            }
            int i4113 = i18 >> 3;
            rVar2 = rVarH;
            d1.i.e eVar19 = eVarJ;
            c0.b(mVar4, e1Var6, g(bVar, eVarJ, rVarH, (i18 & 14) | ((i18 >> 15) & 112)), d3Var4, z26, true, e1Var7, z27, g2VarD, nVar3, eVar19, lVar, rVar2, (i4113 & 234881024) | (i4113 & 14) | 196608 | (i4113 & 112) | (i18 & 7168) | (57344 & i18) | (3670016 & i4113) | (29360128 & i4113) | ((i18 << 12) & 1879048192), ((i18 >> 18) & 14) | ((i37 << 3) & 112), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar4;
            e1Var4 = e1Var6;
            d3Var3 = d3Var4;
            z25 = z26;
            e1Var5 = e1Var7;
            z19 = z27;
            g2Var2 = g2VarD;
            nVar2 = nVar3;
            eVar3 = eVar19;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            nVar2 = nVar;
            z19 = z16;
            mVar3 = mVar2;
            e1Var4 = e1Var3;
            d3Var3 = d3Var2;
            z25 = z17;
            eVar3 = eVar2;
            e1Var5 = e1Var2;
            g2Var2 = g2Var;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.d(bVar, mVar3, e1Var4, d3Var3, z25, nVar2, eVar3, e1Var5, z19, g2Var2, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(b bVar, f3.m mVar, e1 e1Var, d3 d3Var, boolean z15, d1.i.n nVar, d1.i.e eVar, p143z0.e1 e1Var2, boolean z16, g2 g2Var, er.l lVar, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        c(bVar, mVar, e1Var, d3Var, z15, nVar, eVar, e1Var2, z16, g2Var, lVar, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> f(int i15, int i16, int i17) {
        int i18 = i15 - (i17 * (i16 - 1));
        int i19 = i18 / i16;
        int i25 = i18 % i16;
        ArrayList arrayList = new ArrayList(i16);
        int i26 = 0;
        while (i26 < i16) {
            arrayList.add(Integer.valueOf((i26 < i25 ? 1 : 0) + i19));
            i26++;
        }
        return arrayList;
    }

    private static final w0 g(final b bVar, final d1.i.e eVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-76500289, i15, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.W(bVar)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.W(eVar)) || (i15 & 48) == 32);
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new d(new er.p() { // from class: g1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(bVar, eVar, (c5.d) obj, (c5.b) obj2);
                }
            });
            rVar.v(objE);
        }
        w0 w0Var = (w0) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return w0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 h(b bVar, d1.i.e eVar, c5.d dVar, c5.b bVar2) {
        if (!(c5.b.l(bVar2.getValue()) != Integer.MAX_VALUE)) {
            c1.e.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iL = c5.b.l(bVar2.getValue());
        int[] iArrE1 = pq.v.e1(bVar.a(dVar, iL, dVar.X0(eVar.getSpacing())));
        int[] iArr = new int[iArrE1.length];
        eVar.b(dVar, iL, iArrE1, c5.t.Ltr, iArr);
        return new v0(iArrE1, iArr);
    }
}
