package p046f2;

import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.x;
import er.a;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h2.r0;
import k3.f;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;

/* JADX INFO: renamed from: f2.wc, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a_\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClick", "Lf3/m;", "modifier", "", "enabled", "Lf2/sc;", "colors", "Lb1/l;", "interactionSource", "Ln3/y2;", "shape", "content", "c", "(Ler/a;Lf3/m;ZLf2/sc;Lb1/l;Ln3/y2;Ler/p;Lm2/r;II)V", "e", "(Lf3/m;Ler/a;ZLn3/y2;Lf2/sc;Lb1/l;Ler/p;Lm2/r;I)V", "pressed", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6461wc {
    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0113  */
    /* JADX WARN: Code duplicated, block: B:104:0x011d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0102  */
    public static final void c(final a<i0> aVar, m mVar, boolean z15, sc scVar, l lVar, y2 y2Var, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z16;
        int i19;
        sc scVarC;
        int i25;
        l lVar2;
        int i26;
        y2 y2VarB;
        boolean z17;
        r rVar2;
        final m mVar3;
        final boolean z18;
        final sc scVar2;
        final l lVar3;
        final y2 y2Var2;
        d5 d5VarM;
        m mVar4;
        m mVar5;
        int i27;
        int i28;
        r rVarH = rVar.h(1413012038);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        scVarC = scVar;
                        int i35 = rVarH.W(scVarC) ? 2048 : 1024;
                        i17 |= i35;
                    } else {
                        scVarC = scVar;
                    }
                    i17 |= i35;
                } else {
                    scVarC = scVar;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar2 = lVar;
                        if (rVarH.W(lVar2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((196608 & i15) == 0) {
                        if ((i16 & 32) == 0) {
                            y2VarB = y2Var;
                            if (rVarH.W(y2VarB)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            }
                            i17 |= i28;
                        } else {
                            y2VarB = y2Var;
                        }
                        i28 = PKIFailureInfo.notAuthorized;
                        i17 |= i28;
                    } else {
                        y2VarB = y2Var;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(pVar)) {
                            i27 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i27;
                    }
                    if ((599187 & i17) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i29 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                scVarC = tc.f57829a.c(rVarH, 6);
                            }
                            if (i25 != 0) {
                                lVar2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                                mVar5 = mVar4;
                                y2VarB = tc.f57829a.b(rVarH, 6);
                            } else {
                                mVar5 = mVar4;
                            }
                        } else {
                            rVarH.O();
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                            }
                            if ((i16 & 32) != 0) {
                                i17 &= -458753;
                            }
                            mVar5 = mVar2;
                        }
                        sc scVar3 = scVarC;
                        l lVar4 = lVar2;
                        boolean z19 = z16;
                        rVarH.y();
                        if (t.k()) {
                            t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                        }
                        int i36 = i17 << 3;
                        rVar2 = rVarH;
                        e(mVar5, aVar, z19, y2VarB, scVar3, lVar4, pVar, rVar2, ((i17 >> 3) & 14) | (i36 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i36) | (i36 & 458752) | (i17 & 3670016));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar5;
                        z18 = z19;
                        scVar2 = scVar3;
                        lVar3 = lVar4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        scVar2 = scVarC;
                        lVar3 = lVar2;
                    }
                    y2Var2 = y2VarB;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.uc
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                lVar2 = lVar;
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        y2VarB = y2Var;
                        if (rVarH.W(y2VarB)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i28;
                    } else {
                        y2VarB = y2Var;
                    }
                    i28 = PKIFailureInfo.notAuthorized;
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((599187 & i17) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    }
                    sc scVar4 = scVarC;
                    l lVar5 = lVar2;
                    boolean z110 = z16;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                    }
                    int i37 = i17 << 3;
                    rVar2 = rVarH;
                    e(mVar5, aVar, z110, y2VarB, scVar4, lVar5, pVar, rVar2, ((i17 >> 3) & 14) | (i37 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i37) | (i37 & 458752) | (i17 & 3670016));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    z18 = z110;
                    scVar2 = scVar4;
                    lVar3 = lVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    scVar2 = scVarC;
                    lVar3 = lVar2;
                }
                y2Var2 = y2VarB;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.uc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    scVarC = scVar;
                    if (rVarH.W(scVarC)) {
                    }
                    i17 |= i35;
                } else {
                    scVarC = scVar;
                }
                i17 |= i35;
            } else {
                scVarC = scVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        y2VarB = y2Var;
                        if (rVarH.W(y2VarB)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i28;
                    } else {
                        y2VarB = y2Var;
                    }
                    i28 = PKIFailureInfo.notAuthorized;
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((599187 & i17) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    }
                    sc scVar5 = scVarC;
                    l lVar6 = lVar2;
                    boolean z111 = z16;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                    }
                    int i38 = i17 << 3;
                    rVar2 = rVarH;
                    e(mVar5, aVar, z111, y2VarB, scVar5, lVar6, pVar, rVar2, ((i17 >> 3) & 14) | (i38 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i38) | (i38 & 458752) | (i17 & 3670016));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    z18 = z111;
                    scVar2 = scVar5;
                    lVar3 = lVar6;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    scVar2 = scVarC;
                    lVar3 = lVar2;
                }
                y2Var2 = y2VarB;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.uc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    y2VarB = y2Var;
                    if (rVarH.W(y2VarB)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                i28 = PKIFailureInfo.notAuthorized;
                i17 |= i28;
            } else {
                y2VarB = y2Var;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((599187 & i17) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                }
                sc scVar6 = scVarC;
                l lVar7 = lVar2;
                boolean z112 = z16;
                rVarH.y();
                if (t.k()) {
                    t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                }
                int i39 = i17 << 3;
                rVar2 = rVarH;
                e(mVar5, aVar, z112, y2VarB, scVar6, lVar7, pVar, rVar2, ((i17 >> 3) & 14) | (i39 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i39) | (i39 & 458752) | (i17 & 3670016));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                z18 = z112;
                scVar2 = scVar6;
                lVar3 = lVar7;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                z18 = z16;
                scVar2 = scVarC;
                lVar3 = lVar2;
            }
            y2Var2 = y2VarB;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.uc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    scVarC = scVar;
                    if (rVarH.W(scVarC)) {
                    }
                    i17 |= i35;
                } else {
                    scVarC = scVar;
                }
                i17 |= i35;
            } else {
                scVarC = scVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        y2VarB = y2Var;
                        if (rVarH.W(y2VarB)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i28;
                    } else {
                        y2VarB = y2Var;
                    }
                    i28 = PKIFailureInfo.notAuthorized;
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((599187 & i17) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            scVarC = tc.f57829a.c(rVarH, 6);
                        }
                        if (i25 != 0) {
                            lVar2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                            mVar5 = mVar4;
                            y2VarB = tc.f57829a.b(rVarH, 6);
                        } else {
                            mVar5 = mVar4;
                        }
                    }
                    sc scVar7 = scVarC;
                    l lVar8 = lVar2;
                    boolean z113 = z16;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                    }
                    int i310 = i17 << 3;
                    rVar2 = rVarH;
                    e(mVar5, aVar, z113, y2VarB, scVar7, lVar8, pVar, rVar2, ((i17 >> 3) & 14) | (i310 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i310) | (i310 & 458752) | (i17 & 3670016));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    z18 = z113;
                    scVar2 = scVar7;
                    lVar3 = lVar8;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    scVar2 = scVarC;
                    lVar3 = lVar2;
                }
                y2Var2 = y2VarB;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.uc
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    y2VarB = y2Var;
                    if (rVarH.W(y2VarB)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                i28 = PKIFailureInfo.notAuthorized;
                i17 |= i28;
            } else {
                y2VarB = y2Var;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((599187 & i17) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                }
                sc scVar8 = scVarC;
                l lVar9 = lVar2;
                boolean z114 = z16;
                rVarH.y();
                if (t.k()) {
                    t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                }
                int i311 = i17 << 3;
                rVar2 = rVarH;
                e(mVar5, aVar, z114, y2VarB, scVar8, lVar9, pVar, rVar2, ((i17 >> 3) & 14) | (i311 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i311) | (i311 & 458752) | (i17 & 3670016));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                z18 = z114;
                scVar2 = scVar8;
                lVar3 = lVar9;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                z18 = z16;
                scVar2 = scVarC;
                lVar3 = lVar2;
            }
            y2Var2 = y2VarB;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.uc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                scVarC = scVar;
                if (rVarH.W(scVarC)) {
                }
                i17 |= i35;
            } else {
                scVarC = scVar;
            }
            i17 |= i35;
        } else {
            scVarC = scVar;
        }
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    y2VarB = y2Var;
                    if (rVarH.W(y2VarB)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    y2VarB = y2Var;
                }
                i28 = PKIFailureInfo.notAuthorized;
                i17 |= i28;
            } else {
                y2VarB = y2Var;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((599187 & i17) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                } else {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        scVarC = tc.f57829a.c(rVarH, 6);
                    }
                    if (i25 != 0) {
                        lVar2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                        mVar5 = mVar4;
                        y2VarB = tc.f57829a.b(rVarH, 6);
                    } else {
                        mVar5 = mVar4;
                    }
                }
                sc scVar9 = scVarC;
                l lVar10 = lVar2;
                boolean z115 = z16;
                rVarH.y();
                if (t.k()) {
                    t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
                }
                int i312 = i17 << 3;
                rVar2 = rVarH;
                e(mVar5, aVar, z115, y2VarB, scVar9, lVar10, pVar, rVar2, ((i17 >> 3) & 14) | (i312 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i312) | (i312 & 458752) | (i17 & 3670016));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                z18 = z115;
                scVar2 = scVar9;
                lVar3 = lVar10;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                z18 = z16;
                scVar2 = scVarC;
                lVar3 = lVar2;
            }
            y2Var2 = y2VarB;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.uc
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        lVar2 = lVar;
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                y2VarB = y2Var;
                if (rVarH.W(y2VarB)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i28;
            } else {
                y2VarB = y2Var;
            }
            i28 = PKIFailureInfo.notAuthorized;
            i17 |= i28;
        } else {
            y2VarB = y2Var;
        }
        if ((1572864 & i15) == 0) {
            if (rVarH.G(pVar)) {
                i27 = PKIFailureInfo.badCertTemplate;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        }
        if ((599187 & i17) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    scVarC = tc.f57829a.c(rVarH, 6);
                }
                if (i25 != 0) {
                    lVar2 = null;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    mVar5 = mVar4;
                    y2VarB = tc.f57829a.b(rVarH, 6);
                } else {
                    mVar5 = mVar4;
                }
            } else {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    scVarC = tc.f57829a.c(rVarH, 6);
                }
                if (i25 != 0) {
                    lVar2 = null;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                    mVar5 = mVar4;
                    y2VarB = tc.f57829a.b(rVarH, 6);
                } else {
                    mVar5 = mVar4;
                }
            }
            sc scVar10 = scVarC;
            l lVar11 = lVar2;
            boolean z116 = z16;
            rVarH.y();
            if (t.k()) {
                t.o(1413012038, i17, -1, "androidx.compose.material3.IconButton (IconButton.kt:164)");
            }
            int i313 = i17 << 3;
            rVar2 = rVarH;
            e(mVar5, aVar, z116, y2VarB, scVar10, lVar11, pVar, rVar2, ((i17 >> 3) & 14) | (i313 & 112) | (i17 & 896) | ((i17 >> 6) & 7168) | (57344 & i313) | (i313 & 458752) | (i17 & 3670016));
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
            z18 = z116;
            scVar2 = scVar10;
            lVar3 = lVar11;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            z18 = z16;
            scVar2 = scVarC;
            lVar3 = lVar2;
        }
        y2Var2 = y2VarB;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.uc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6461wc.d(aVar, mVar3, z18, scVar2, lVar3, y2Var2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(a aVar, m mVar, boolean z15, sc scVar, l lVar, y2 y2Var, p pVar, int i15, int i16, r rVar, int i17) {
        c(aVar, mVar, z15, scVar, lVar, y2Var, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void e(final m mVar, final a<i0> aVar, final boolean z15, final y2 y2Var, sc scVar, final l lVar, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        m mVar2;
        int i16;
        p<? super r, ? super Integer, i0> pVar2;
        r rVar2;
        l lVar2;
        sc scVar2 = scVar;
        r rVarH = rVar.h(-1134296466);
        if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i16 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(y2Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(scVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(lVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(pVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((599187 & i16) != 599186, i16 & 1)) {
            if (t.k()) {
                t.o(-1134296466, i16, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:238)");
            }
            if (lVar == null) {
                rVarH.X(976976045);
                Object objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                rVarH.R();
                lVar2 = (l) objE;
            } else {
                rVarH.X(862798698);
                rVarH.R();
                lVar2 = lVar;
            }
            int i17 = i16;
            pVar2 = pVar;
            rVar2 = rVarH;
            m mVarC = r0.c(b.l(i.c(f.a(d.u(hd.i(mVar2), tc.e(tc.f57829a, 0, 1, null)), y2Var), scVar2.a(z15), y2Var), lVar2, androidx.compose.material3.i.h(false, 0.0f, 0L, y2Var, false, false, false, false, 247, null), z15, null, n4.l.j(n4.l.INSTANCE.a()), aVar, 8, null), null, 1, null);
            w0 w0VarI = d1.r.i(c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            m mVarE = j.e(rVar2, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            scVar2 = scVar;
            d0.c(h4.a().d(Color.m0boximpl(scVar2.b(z15))), pVar2, rVar2, c4.f122821i | ((i17 >> 15) & 112));
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            pVar2 = pVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final p<? super r, ? super Integer, i0> pVar3 = pVar2;
            final sc scVar3 = scVar2;
            d5VarM.a(new p() { // from class: f2.vc
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6461wc.f(mVar, aVar, z15, y2Var, scVar3, lVar, pVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(m mVar, a aVar, boolean z15, y2 y2Var, sc scVar, l lVar, p pVar, int i15, r rVar, int i16) {
        e(mVar, aVar, z15, y2Var, scVar, lVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
