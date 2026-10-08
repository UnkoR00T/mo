package p046f2;

import androidx.compose.material3.l;
import d1.e0;
import d1.h0;
import d1.i;
import er.a;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.BorderStroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf3/m;", "modifier", "Ln3/y2;", "shape", "Lf2/x1;", "colors", "Lf2/z1;", "elevation", "Lw0/w;", "border", "Lkotlin/Function1;", "Ld1/h0;", "Loq/i0;", "content", "c", "(Lf3/m;Ln3/y2;Lf2/x1;Lf2/z1;Lw0/w;Ler/q;Lm2/r;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c2 {
    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:109:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public static final void c(m mVar, y2 y2Var, x1 x1Var, z1 z1Var, BorderStroke borderStroke, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        y2 y2Var2;
        x1 x1Var2;
        z1 z1VarC;
        BorderStroke borderStroke2;
        boolean z15;
        final m mVar3;
        final y2 y2Var3;
        final x1 x1Var3;
        final z1 z1Var2;
        final BorderStroke borderStroke3;
        d5 d5VarM;
        m mVar4;
        y2 y2VarE;
        x1 x1VarA;
        boolean z16;
        m mVar5;
        z1 z1Var3;
        BorderStroke borderStroke4;
        y2 y2Var4;
        int i18;
        r rVarH = rVar.h(1359693790);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                y2Var2 = y2Var;
                int i25 = rVarH.W(y2Var2) ? 32 : 16;
                i17 |= i25;
            } else {
                y2Var2 = y2Var;
            }
            i17 |= i25;
        } else {
            y2Var2 = y2Var;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                x1Var2 = x1Var;
                int i26 = rVarH.W(x1Var2) ? 256 : 128;
                i17 |= i26;
            } else {
                x1Var2 = x1Var;
            }
            i17 |= i26;
        } else {
            x1Var2 = x1Var;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                z1VarC = z1Var;
                int i27 = rVarH.W(z1VarC) ? 2048 : 1024;
                i17 |= i27;
            } else {
                z1VarC = z1Var;
            }
            i17 |= i27;
        } else {
            z1VarC = z1Var;
        }
        int i28 = i16 & 16;
        if (i28 == 0) {
            if ((i15 & 24576) == 0) {
                borderStroke2 = borderStroke;
                i17 |= rVarH.W(borderStroke2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i18 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i18 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i18;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 2) != 0) {
                        y2VarE = y1.f58315a.e(rVarH, 6);
                        i17 &= -113;
                    } else {
                        y2VarE = y2Var2;
                    }
                    if ((i16 & 4) != 0) {
                        x1VarA = y1.f58315a.a(rVarH, 6);
                        i17 &= -897;
                    } else {
                        x1VarA = x1Var2;
                    }
                    if ((i16 & 8) != 0) {
                        z16 = true;
                        z1VarC = y1.f58315a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 1572864, 63);
                        i17 &= -7169;
                    } else {
                        z16 = true;
                    }
                    z1 z1Var4 = z1VarC;
                    mVar5 = mVar4;
                    z1Var3 = z1Var4;
                    if (i28 != 0) {
                        y2Var4 = y2VarE;
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                        y2Var4 = y2VarE;
                    }
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    z1Var3 = z1VarC;
                    borderStroke4 = borderStroke2;
                    mVar5 = mVar2;
                    y2Var4 = y2Var2;
                    x1VarA = x1Var2;
                    z16 = true;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1359693790, i17, -1, "androidx.compose.material3.Card (Card.kt:86)");
                }
                l.g(mVar5, y2Var4, x1VarA.a(z16), x1VarA.b(z16), 0.0f, z1Var3.f(z16, null, rVarH, ((i17 >> 3) & 896) | 54).getValue().getValue(), borderStroke4, y2.m.d(-97109725, z16, new p() { // from class: f2.a2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c2.d(qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i17 & 14) | 12582912 | (i17 & 112) | (3670016 & (i17 << 6)), 16);
                rVarH = rVarH;
                if (t.k()) {
                    t.n();
                }
                x1Var3 = x1VarA;
                y2Var3 = y2Var4;
                borderStroke3 = borderStroke4;
                z1Var2 = z1Var3;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                y2Var3 = y2Var2;
                x1Var3 = x1Var2;
                z1Var2 = z1VarC;
                borderStroke3 = borderStroke;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.b2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c2.e(mVar3, y2Var3, x1Var3, z1Var2, borderStroke3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        borderStroke2 = borderStroke;
        if ((196608 & i15) == 0) {
            if (rVarH.G(qVar)) {
                i18 = PKIFailureInfo.unsupportedVersion;
            } else {
                i18 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i18;
        }
        if ((74899 & i17) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 2) != 0) {
                    y2VarE = y1.f58315a.e(rVarH, 6);
                    i17 &= -113;
                } else {
                    y2VarE = y2Var2;
                }
                if ((i16 & 4) != 0) {
                    x1VarA = y1.f58315a.a(rVarH, 6);
                    i17 &= -897;
                } else {
                    x1VarA = x1Var2;
                }
                if ((i16 & 8) != 0) {
                    z16 = true;
                    z1VarC = y1.f58315a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 1572864, 63);
                    i17 &= -7169;
                } else {
                    z16 = true;
                }
                z1 z1Var5 = z1VarC;
                mVar5 = mVar4;
                z1Var3 = z1Var5;
                if (i28 != 0) {
                    y2Var4 = y2VarE;
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                    y2Var4 = y2VarE;
                }
            } else {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 2) != 0) {
                    y2VarE = y1.f58315a.e(rVarH, 6);
                    i17 &= -113;
                } else {
                    y2VarE = y2Var2;
                }
                if ((i16 & 4) != 0) {
                    x1VarA = y1.f58315a.a(rVarH, 6);
                    i17 &= -897;
                } else {
                    x1VarA = x1Var2;
                }
                if ((i16 & 8) != 0) {
                    z16 = true;
                    z1VarC = y1.f58315a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, 1572864, 63);
                    i17 &= -7169;
                } else {
                    z16 = true;
                }
                z1 z1Var6 = z1VarC;
                mVar5 = mVar4;
                z1Var3 = z1Var6;
                if (i28 != 0) {
                    y2Var4 = y2VarE;
                    borderStroke4 = null;
                } else {
                    borderStroke4 = borderStroke;
                    y2Var4 = y2VarE;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1359693790, i17, -1, "androidx.compose.material3.Card (Card.kt:86)");
            }
            l.g(mVar5, y2Var4, x1VarA.a(z16), x1VarA.b(z16), 0.0f, z1Var3.f(z16, null, rVarH, ((i17 >> 3) & 896) | 54).getValue().getValue(), borderStroke4, y2.m.d(-97109725, z16, new p() { // from class: f2.a2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c2.d(qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | 12582912 | (i17 & 112) | (3670016 & (i17 << 6)), 16);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
            x1Var3 = x1VarA;
            y2Var3 = y2Var4;
            borderStroke3 = borderStroke4;
            z1Var2 = z1Var3;
            mVar3 = mVar5;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            y2Var3 = y2Var2;
            x1Var3 = x1Var2;
            z1Var2 = z1VarC;
            borderStroke3 = borderStroke;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.b2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c2.e(mVar3, y2Var3, x1Var3, z1Var2, borderStroke3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-97109725, i15, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            qVar.w(d1.i0.f39176a, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(m mVar, y2 y2Var, x1 x1Var, z1 z1Var, BorderStroke borderStroke, q qVar, int i15, int i16, r rVar, int i17) {
        c(mVar, y2Var, x1Var, z1Var, borderStroke, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
