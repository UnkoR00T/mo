package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.material3.l;
import c5.b;
import c5.h;
import er.p;
import er.q;
import f3.m;
import fr.n0;
import java.util.ArrayList;
import java.util.List;
import k1.c;
import oq.a;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.p2;
import p036e4.s2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u001a\b\u0002\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "", "Lf2/sm;", "Loq/i0;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "i", "(Lf3/m;JJLer/q;Ler/p;Ler/p;Lm2/r;I)V", "", "selectedTabIndex", "h", "(ILf3/m;JJLer/q;Ler/p;Ler/p;Lm2/r;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class en {
    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
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
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    @a
    public static final void h(final int i15, m mVar, long j15, long j16, q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVar, p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i16, final int i17) {
        int i18;
        long jF;
        long j17;
        int i19;
        q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVar2;
        int i25;
        int i26;
        p<? super r, ? super Integer, i0> pVar3;
        int i27;
        boolean z15;
        r rVar2;
        final m mVar2;
        final long j18;
        final long j19;
        final q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVar3;
        final p<? super r, ? super Integer, i0> pVar4;
        d5 d5VarM;
        m mVar3;
        long jG;
        q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVarD;
        m mVar4;
        long j25;
        q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVar4;
        p<? super r, ? super Integer, i0> pVarJ;
        int i28;
        long j26;
        int i29;
        r rVarH = rVar.h(1445190381);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i35 = i17 & 2;
        if (i35 == 0) {
            if ((i16 & 48) == 0) {
                i18 |= rVarH.W(mVar) ? 32 : 16;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    jF = j15;
                    int i36 = rVarH.d(jF) ? 256 : 128;
                    i18 |= i36;
                } else {
                    jF = j15;
                }
                i18 |= i36;
            } else {
                jF = j15;
            }
            if ((i16 & 3072) == 0) {
                if ((i17 & 8) == 0) {
                    j17 = j16;
                    int i37 = rVarH.d(j17) ? 2048 : 1024;
                    i18 |= i37;
                } else {
                    j17 = j16;
                }
                i18 |= i37;
            } else {
                j17 = j16;
            }
            i19 = i17 & 16;
            if (i19 != 0) {
                if ((i16 & 24576) == 0) {
                    qVar2 = qVar;
                    if (rVarH.G(qVar2)) {
                        i25 = 16384;
                    } else {
                        i25 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 32;
                if (i26 != 0) {
                    if ((196608 & i16) == 0) {
                        pVar3 = pVar;
                        if (rVarH.G(pVar3)) {
                            i27 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i27 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i27;
                    }
                    if ((1572864 & i16) != 0) {
                        if (rVarH.G(pVar2)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i29;
                    }
                    if ((i18 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i18 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0 || rVarH.Q()) {
                            if (i35 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if ((i17 & 4) != 0) {
                                jF = wm.f58234a.f(rVarH, 6);
                                i18 &= -897;
                            }
                            if ((i17 & 8) != 0) {
                                jG = wm.f58234a.g(rVarH, 6);
                                i18 &= -7169;
                            } else {
                                jG = j17;
                            }
                            if (i19 != 0) {
                                qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            } else {
                                qVarD = qVar2;
                            }
                            if (i26 != 0) {
                                mVar4 = mVar3;
                                j26 = jG;
                                j25 = jF;
                                qVar4 = qVarD;
                                pVarJ = f4.f55817a.j();
                                i28 = 1445190381;
                            } else {
                                mVar4 = mVar3;
                                j25 = jF;
                                qVar4 = qVarD;
                                pVarJ = pVar3;
                                i28 = 1445190381;
                                j26 = jG;
                            }
                        } else {
                            rVarH.O();
                            if ((i17 & 4) != 0) {
                                i18 &= -897;
                            }
                            if ((i17 & 8) != 0) {
                                i18 &= -7169;
                            }
                            mVar4 = mVar;
                            qVar4 = qVar2;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j25 = jF;
                            j26 = j17;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                        }
                        rVar2 = rVarH;
                        i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                        if (t.k()) {
                            t.n();
                        }
                        mVar2 = mVar4;
                        j18 = j25;
                        j19 = j26;
                        qVar3 = qVar4;
                        pVar4 = pVarJ;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar2 = mVar;
                        j18 = jF;
                        j19 = j17;
                        qVar3 = qVar2;
                        pVar4 = pVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.ym
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 196608;
                pVar3 = pVar;
                if ((1572864 & i16) != 0) {
                    if (rVarH.G(pVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i18 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                    }
                    rVar2 = rVarH;
                    i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar4;
                    j18 = j25;
                    j19 = j26;
                    qVar3 = qVar4;
                    pVar4 = pVarJ;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    j18 = jF;
                    j19 = j17;
                    qVar3 = qVar2;
                    pVar4 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.ym
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            qVar2 = qVar;
            i26 = i17 & 32;
            if (i26 != 0) {
                if ((196608 & i16) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i27;
                }
                if ((1572864 & i16) != 0) {
                    if (rVarH.G(pVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i18 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                    }
                    rVar2 = rVarH;
                    i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar4;
                    j18 = j25;
                    j19 = j26;
                    qVar3 = qVar4;
                    pVar4 = pVarJ;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    j18 = jF;
                    j19 = j17;
                    qVar3 = qVar2;
                    pVar4 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.ym
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 196608;
            pVar3 = pVar;
            if ((1572864 & i16) != 0) {
                if (rVarH.G(pVar2)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i29;
            }
            if ((i18 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                } else {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                }
                rVar2 = rVarH;
                i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar4;
                j18 = j25;
                j19 = j26;
                qVar3 = qVar4;
                pVar4 = pVarJ;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                j18 = jF;
                j19 = j17;
                qVar3 = qVar2;
                pVar4 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.ym
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                jF = j15;
                if (rVarH.d(jF)) {
                }
                i18 |= i36;
            } else {
                jF = j15;
            }
            i18 |= i36;
        } else {
            jF = j15;
        }
        if ((i16 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                j17 = j16;
                if (rVarH.d(j17)) {
                }
                i18 |= i37;
            } else {
                j17 = j16;
            }
            i18 |= i37;
        } else {
            j17 = j16;
        }
        i19 = i17 & 16;
        if (i19 != 0) {
            if ((i16 & 24576) == 0) {
                qVar2 = qVar;
                if (rVarH.G(qVar2)) {
                    i25 = 16384;
                } else {
                    i25 = PKIFailureInfo.certRevoked;
                }
                i18 |= i25;
            }
            i26 = i17 & 32;
            if (i26 != 0) {
                if ((196608 & i16) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i27;
                }
                if ((1572864 & i16) != 0) {
                    if (rVarH.G(pVar2)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i29;
                }
                if ((i18 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if ((i17 & 4) != 0) {
                            jF = wm.f58234a.f(rVarH, 6);
                            i18 &= -897;
                        }
                        if ((i17 & 8) != 0) {
                            jG = wm.f58234a.g(rVarH, 6);
                            i18 &= -7169;
                        } else {
                            jG = j17;
                        }
                        if (i19 != 0) {
                            qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        } else {
                            qVarD = qVar2;
                        }
                        if (i26 != 0) {
                            mVar4 = mVar3;
                            j26 = jG;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = f4.f55817a.j();
                            i28 = 1445190381;
                        } else {
                            mVar4 = mVar3;
                            j25 = jF;
                            qVar4 = qVarD;
                            pVarJ = pVar3;
                            i28 = 1445190381;
                            j26 = jG;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                    }
                    rVar2 = rVarH;
                    i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                    if (t.k()) {
                        t.n();
                    }
                    mVar2 = mVar4;
                    j18 = j25;
                    j19 = j26;
                    qVar3 = qVar4;
                    pVar4 = pVarJ;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    j18 = jF;
                    j19 = j17;
                    qVar3 = qVar2;
                    pVar4 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.ym
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 196608;
            pVar3 = pVar;
            if ((1572864 & i16) != 0) {
                if (rVarH.G(pVar2)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i29;
            }
            if ((i18 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                } else {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                }
                rVar2 = rVarH;
                i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar4;
                j18 = j25;
                j19 = j26;
                qVar3 = qVar4;
                pVar4 = pVarJ;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                j18 = jF;
                j19 = j17;
                qVar3 = qVar2;
                pVar4 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.ym
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        qVar2 = qVar;
        i26 = i17 & 32;
        if (i26 != 0) {
            if ((196608 & i16) == 0) {
                pVar3 = pVar;
                if (rVarH.G(pVar3)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i27;
            }
            if ((1572864 & i16) != 0) {
                if (rVarH.G(pVar2)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i29;
            }
            if ((i18 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                } else {
                    if (i35 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if ((i17 & 4) != 0) {
                        jF = wm.f58234a.f(rVarH, 6);
                        i18 &= -897;
                    }
                    if ((i17 & 8) != 0) {
                        jG = wm.f58234a.g(rVarH, 6);
                        i18 &= -7169;
                    } else {
                        jG = j17;
                    }
                    if (i19 != 0) {
                        qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        qVarD = qVar2;
                    }
                    if (i26 != 0) {
                        mVar4 = mVar3;
                        j26 = jG;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = f4.f55817a.j();
                        i28 = 1445190381;
                    } else {
                        mVar4 = mVar3;
                        j25 = jF;
                        qVar4 = qVarD;
                        pVarJ = pVar3;
                        i28 = 1445190381;
                        j26 = jG;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
                }
                rVar2 = rVarH;
                i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
                if (t.k()) {
                    t.n();
                }
                mVar2 = mVar4;
                j18 = j25;
                j19 = j26;
                qVar3 = qVar4;
                pVar4 = pVarJ;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                j18 = jF;
                j19 = j17;
                qVar3 = qVar2;
                pVar4 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.ym
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 196608;
        pVar3 = pVar;
        if ((1572864 & i16) != 0) {
            if (rVarH.G(pVar2)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i29;
        }
        if ((i18 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i35 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if ((i17 & 4) != 0) {
                    jF = wm.f58234a.f(rVarH, 6);
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    jG = wm.f58234a.g(rVarH, 6);
                    i18 &= -7169;
                } else {
                    jG = j17;
                }
                if (i19 != 0) {
                    qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD = qVar2;
                }
                if (i26 != 0) {
                    mVar4 = mVar3;
                    j26 = jG;
                    j25 = jF;
                    qVar4 = qVarD;
                    pVarJ = f4.f55817a.j();
                    i28 = 1445190381;
                } else {
                    mVar4 = mVar3;
                    j25 = jF;
                    qVar4 = qVarD;
                    pVarJ = pVar3;
                    i28 = 1445190381;
                    j26 = jG;
                }
            } else {
                if (i35 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if ((i17 & 4) != 0) {
                    jF = wm.f58234a.f(rVarH, 6);
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    jG = wm.f58234a.g(rVarH, 6);
                    i18 &= -7169;
                } else {
                    jG = j17;
                }
                if (i19 != 0) {
                    qVarD = y2.m.d(906699528, true, new q() { // from class: f2.xm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return en.o(i15, (List) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    qVarD = qVar2;
                }
                if (i26 != 0) {
                    mVar4 = mVar3;
                    j26 = jG;
                    j25 = jF;
                    qVar4 = qVarD;
                    pVarJ = f4.f55817a.j();
                    i28 = 1445190381;
                } else {
                    mVar4 = mVar3;
                    j25 = jF;
                    qVar4 = qVarD;
                    pVarJ = pVar3;
                    i28 = 1445190381;
                    j26 = jG;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(i28, i18, -1, "androidx.compose.material3.TabRow (TabRow.kt:1350)");
            }
            rVar2 = rVarH;
            i(mVar4, j25, j26, qVar4, pVarJ, pVar2, rVar2, (i18 >> 3) & 524286);
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar4;
            j18 = j25;
            j19 = j26;
            qVar3 = qVar4;
            pVar4 = pVarJ;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar2 = mVar;
            j18 = jF;
            j19 = j17;
            qVar3 = qVar2;
            pVar4 = pVar3;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ym
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return en.p(i15, mVar2, j18, j19, qVar3, pVar4, pVar2, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void i(m mVar, final long j15, final long j16, final q<? super List<TabPosition>, ? super r, ? super Integer, i0> qVar, final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15) {
        m mVar2;
        int i16;
        r rVar2;
        r rVarH = rVar.h(148841506);
        if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i16 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.d(j15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.d(j16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(pVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(pVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(148841506, i16, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:763)");
            }
            int i17 = i16 << 3;
            rVar2 = rVarH;
            l.g(c.b(mVar2), null, j15, j16, 0.0f, 0.0f, null, y2.m.d(-1815327065, true, new p() { // from class: f2.zm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return en.j(pVar2, pVar, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i17 & 896) | 12582912 | (i17 & 7168), 114);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final m mVar3 = mVar2;
            d5VarM.a(new p() { // from class: f2.an
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return en.n(mVar3, j15, j16, qVar, pVar, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final p pVar, final p pVar2, final q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1815327065, i15, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:769)");
            }
            m mVarH = d.h(m.INSTANCE, 0.0f, 1, null);
            boolean zW = rVar.W(pVar) | rVar.W(pVar2) | rVar.W(qVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new p() { // from class: f2.bn
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return en.k(pVar, pVar2, qVar, (s2) obj, (b) obj2);
                    }
                };
                rVar.v(objE);
            }
            p2.b(mVarH, (p) objE, rVar, 6, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 k(p pVar, final p pVar2, final q qVar, final s2 s2Var, final b bVar) {
        final int iL = b.l(bVar.getValue());
        List<v0> listG0 = s2Var.g0(fn.Tabs, pVar);
        int size = listG0.size();
        final n0 n0Var = new n0();
        if (size > 0) {
            n0Var.f66407a = iL / size;
        }
        Integer numValueOf = 0;
        List<v0> list = listG0;
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            numValueOf = Integer.valueOf(Math.max(listG0.get(i15).n(n0Var.f66407a), numValueOf.intValue()));
        }
        final int iIntValue = numValueOf.intValue();
        final ArrayList arrayList = new ArrayList(listG0.size());
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            v0 v0Var = listG0.get(i16);
            long value = bVar.getValue();
            int i17 = n0Var.f66407a;
            arrayList.add(v0Var.o0(b.c(value, i17, i17, iIntValue, iIntValue)));
        }
        final ArrayList arrayList2 = new ArrayList(size);
        for (int i18 = 0; i18 < size; i18++) {
            arrayList2.add(new TabPosition(h.n(s2Var.b2(n0Var.f66407a) * i18), s2Var.b2(n0Var.f66407a), ((h) sq.a.k(h.j(h.n(s2Var.b2(Math.min(listG0.get(i18).m0(iIntValue), n0Var.f66407a)) - h.n(rm.A() * 2))), h.j(h.n(24)))).getValue(), null));
        }
        return y0.j2(s2Var, iL, iIntValue, null, new er.l() { // from class: f2.cn
            @Override // er.l
            public final Object b(Object obj) {
                return en.l(arrayList, s2Var, pVar2, n0Var, bVar, iIntValue, qVar, arrayList2, iL, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(List list, s2 s2Var, p pVar, n0 n0Var, b bVar, int i15, final q qVar, final List list2, int i16, a2.a aVar) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            a2.a.I(aVar, (a2) list.get(i17), i17 * n0Var.f66407a, 0, 0.0f, 4, null);
        }
        List<v0> listG0 = s2Var.g0(fn.Divider, pVar);
        int size2 = listG0.size();
        for (int i18 = 0; i18 < size2; i18++) {
            a2 a2VarO0 = listG0.get(i18).o0(b.d(bVar.getValue(), 0, 0, 0, 0, 11, null));
            a2.a.I(aVar, a2VarO0, 0, i15 - a2VarO0.getHeight(), 0.0f, 4, null);
        }
        List<v0> listG1 = s2Var.g0(fn.Indicator, y2.m.b(1918742627, true, new p() { // from class: f2.dn
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return en.m(qVar, list2, (r) obj, ((Integer) obj2).intValue());
            }
        }));
        int size3 = listG1.size();
        for (int i19 = 0; i19 < size3; i19++) {
            a2.a.I(aVar, listG1.get(i19).o0(b.INSTANCE.c(i16, i15)), 0, 0, 0.0f, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(q qVar, List list, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1918742627, i15, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:815)");
            }
            qVar.w(list, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(m mVar, long j15, long j16, q qVar, p pVar, p pVar2, int i15, r rVar, int i16) {
        i(mVar, j15, j16, qVar, pVar, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(int i15, List list, r rVar, int i16) {
        if (t.k()) {
            t.o(906699528, i16, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:1342)");
        }
        if (i15 < list.size()) {
            rVar.X(436390614);
            wm wmVar = wm.f58234a;
            wmVar.d(wmVar.h(m.INSTANCE, (TabPosition) list.get(i15)), 0.0f, 0L, rVar, 3072, 6);
            rVar.R();
        } else {
            rVar.X(436548218);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(int i15, m mVar, long j15, long j16, q qVar, p pVar, p pVar2, int i16, int i17, r rVar, int i18) {
        h(i15, mVar, j15, j16, qVar, pVar, pVar2, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }
}
