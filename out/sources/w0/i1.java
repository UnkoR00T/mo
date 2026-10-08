package w0;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln3/b2;", "bitmap", "", "contentDescription", "Lf3/m;", "modifier", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "Ln3/v1;", "filterQuality", "Loq/i0;", "g", "(Ln3/b2;Ljava/lang/String;Lf3/m;Lf3/c;Le4/l;FLn3/n1;ILm2/r;II)V", "Lt3/d;", "imageVector", "d", "(Lt3/d;Ljava/lang/String;Lf3/m;Lf3/c;Le4/l;FLn3/n1;Lm2/r;II)V", "Landroidx/compose/ui/graphics/painter/a;", "painter", "c", "(Landroidx/compose/ui/graphics/painter/a;Ljava/lang/String;Lf3/m;Lf3/c;Le4/l;FLn3/n1;Lm2/r;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p036e4.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f208956a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 b(e4.a2.a aVar) {
            return oq.i0.f148189a;
        }

        @Override // p036e4.w0
        public final p036e4.x0 e(p036e4.y0 y0Var, List<? extends p036e4.v0> list, long j15) {
            return p036e4.y0.j2(y0Var, c5.b.n(j15), c5.b.m(j15), null, new er.l() { // from class: w0.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return i1.a.b((e4.a2.a) obj);
                }
            }, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0175  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void c(final androidx.compose.ui.graphics.painter.a aVar, final String str, f3.m mVar, f3.c cVar, p036e4.l lVar, float f15, n3.n1 n1Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        int i19;
        int i25;
        p036e4.l lVar2;
        int i26;
        int i27;
        float f16;
        int i28;
        int i29;
        int i35;
        boolean z15;
        final f3.c cVar2;
        final n3.n1 n1Var2;
        final f3.m mVar3;
        final p036e4.l lVar3;
        final float f17;
        d5 d5VarM;
        f3.m mVar4;
        f3.c cVarE;
        p036e4.l lVarE;
        float f18;
        n3.n1 n1Var3;
        int i36;
        f3.m mVarD;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z16;
        Object objE2;
        p076m2.r rVarH = rVar.h(1142754848);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(str) ? 32 : 16;
        }
        int i37 = i16 & 4;
        if (i37 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.W(cVar)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
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
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            f16 = f15;
                            if (rVarH.b(f16)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        i29 = i16 & 64;
                        if (i29 != 0) {
                            i17 |= 1572864;
                        } else if ((i15 & 1572864) == 0) {
                            if (rVarH.W(n1Var)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                cVarE = f3.c.INSTANCE.e();
                            } else {
                                cVarE = cVar;
                            }
                            if (i25 != 0) {
                                lVarE = p036e4.l.INSTANCE.e();
                            } else {
                                lVarE = lVar2;
                            }
                            if (i27 != 0) {
                                f18 = 1.0f;
                            } else {
                                f18 = f16;
                            }
                            if (i29 != 0) {
                                n1Var3 = null;
                            } else {
                                n1Var3 = n1Var;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            if (str != null) {
                                rVarH.X(1899222916);
                                f3.m.Companion companion = f3.m.INSTANCE;
                                if ((i17 & 112) == 32) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objE2 = rVarH.E();
                                if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                                    objE2 = new er.l() { // from class: w0.f1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return i1.e(str, (n4.i0) obj);
                                        }
                                    };
                                    rVarH.v(objE2);
                                }
                                i36 = 0;
                                mVarD = n4.v.d(companion, false, (er.l) objE2, 1, null);
                                rVarH.R();
                            } else {
                                i36 = 0;
                                rVarH.X(1899381698);
                                rVarH.R();
                                mVarD = f3.m.INSTANCE;
                            }
                            int i38 = i36;
                            f3.m mVar5 = mVar4;
                            f3.m mVarB = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = a.f208956a;
                                rVarH.v(objE);
                            }
                            p036e4.w0 w0Var = (p036e4.w0) objE;
                            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, i38));
                            f3.m mVarE = f3.j.e(rVarH, mVarB);
                            p076m2.e0 e0VarT = rVarH.t();
                            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
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
                            p076m2.r rVarC = n6.c(rVarH);
                            n6.i(rVarC, w0Var, companion2.d());
                            n6.i(rVarC, e0VarT, companion2.f());
                            n6.g(rVarC, companion2.a());
                            n6.i(rVarC, mVarE, companion2.e());
                            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                            rVarH.x();
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            n1Var2 = n1Var3;
                            f17 = f18;
                            lVar3 = lVarE;
                            cVar2 = cVarE;
                            mVar3 = mVar5;
                        } else {
                            rVarH.O();
                            cVar2 = cVar;
                            n1Var2 = n1Var;
                            mVar3 = mVar2;
                            lVar3 = lVar2;
                            f17 = f16;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: w0.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 196608;
                    f16 = f15;
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(n1Var)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            cVarE = f3.c.INSTANCE.e();
                        } else {
                            cVarE = cVar;
                        }
                        if (i25 != 0) {
                            lVarE = p036e4.l.INSTANCE.e();
                        } else {
                            lVarE = lVar2;
                        }
                        if (i27 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = f16;
                        }
                        if (i29 != 0) {
                            n1Var3 = null;
                        } else {
                            n1Var3 = n1Var;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            rVarH.X(1899222916);
                            f3.m.Companion companion3 = f3.m.INSTANCE;
                            if ((i17 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            i36 = 0;
                            mVarD = n4.v.d(companion3, false, (er.l) objE2, 1, null);
                            rVarH.R();
                        } else {
                            i36 = 0;
                            rVarH.X(1899381698);
                            rVarH.R();
                            mVarD = f3.m.INSTANCE;
                        }
                        int i39 = i36;
                        f3.m mVar6 = mVar4;
                        f3.m mVarB2 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = a.f208956a;
                            rVarH.v(objE);
                        }
                        p036e4.w0 w0Var2 = (p036e4.w0) objE;
                        int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i39));
                        f3.m mVarE2 = f3.j.e(rVarH, mVarB2);
                        p076m2.e0 e0VarT2 = rVarH.t();
                        androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
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
                        p076m2.r rVarC2 = n6.c(rVarH);
                        n6.i(rVarC2, w0Var2, companion4.d());
                        n6.i(rVarC2, e0VarT2, companion4.f());
                        n6.g(rVarC2, companion4.a());
                        n6.i(rVarC2, mVarE2, companion4.e());
                        n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        n1Var2 = n1Var3;
                        f17 = f18;
                        lVar3 = lVarE;
                        cVar2 = cVarE;
                        mVar3 = mVar6;
                    } else {
                        rVarH.O();
                        cVar2 = cVar;
                        n1Var2 = n1Var;
                        mVar3 = mVar2;
                        lVar3 = lVar2;
                        f17 = f16;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: w0.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                lVar2 = lVar;
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        f16 = f15;
                        if (rVarH.b(f16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(n1Var)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            cVarE = f3.c.INSTANCE.e();
                        } else {
                            cVarE = cVar;
                        }
                        if (i25 != 0) {
                            lVarE = p036e4.l.INSTANCE.e();
                        } else {
                            lVarE = lVar2;
                        }
                        if (i27 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = f16;
                        }
                        if (i29 != 0) {
                            n1Var3 = null;
                        } else {
                            n1Var3 = n1Var;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            rVarH.X(1899222916);
                            f3.m.Companion companion5 = f3.m.INSTANCE;
                            if ((i17 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            i36 = 0;
                            mVarD = n4.v.d(companion5, false, (er.l) objE2, 1, null);
                            rVarH.R();
                        } else {
                            i36 = 0;
                            rVarH.X(1899381698);
                            rVarH.R();
                            mVarD = f3.m.INSTANCE;
                        }
                        int i310 = i36;
                        f3.m mVar7 = mVar4;
                        f3.m mVarB3 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = a.f208956a;
                            rVarH.v(objE);
                        }
                        p036e4.w0 w0Var3 = (p036e4.w0) objE;
                        int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, i310));
                        f3.m mVarE3 = f3.j.e(rVarH, mVarB3);
                        p076m2.e0 e0VarT3 = rVarH.t();
                        androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
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
                        p076m2.r rVarC3 = n6.c(rVarH);
                        n6.i(rVarC3, w0Var3, companion6.d());
                        n6.i(rVarC3, e0VarT3, companion6.f());
                        n6.g(rVarC3, companion6.a());
                        n6.i(rVarC3, mVarE3, companion6.e());
                        n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        n1Var2 = n1Var3;
                        f17 = f18;
                        lVar3 = lVarE;
                        cVar2 = cVarE;
                        mVar3 = mVar7;
                    } else {
                        rVarH.O();
                        cVar2 = cVar;
                        n1Var2 = n1Var;
                        mVar3 = mVar2;
                        lVar3 = lVar2;
                        f17 = f16;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: w0.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                f16 = f15;
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion7 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion7, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i311 = i36;
                    f3.m mVar8 = mVar4;
                    f3.m mVarB4 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var4 = (p036e4.w0) objE;
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, i311));
                    f3.m mVarE4 = f3.j.e(rVarH, mVarB4);
                    p076m2.e0 e0VarT4 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
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
                    p076m2.r rVarC4 = n6.c(rVarH);
                    n6.i(rVarC4, w0Var4, companion8.d());
                    n6.i(rVarC4, e0VarT4, companion8.f());
                    n6.g(rVarC4, companion8.a());
                    n6.i(rVarC4, mVarE4, companion8.e());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion8.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar8;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
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
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        f16 = f15;
                        if (rVarH.b(f16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(n1Var)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            cVarE = f3.c.INSTANCE.e();
                        } else {
                            cVarE = cVar;
                        }
                        if (i25 != 0) {
                            lVarE = p036e4.l.INSTANCE.e();
                        } else {
                            lVarE = lVar2;
                        }
                        if (i27 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = f16;
                        }
                        if (i29 != 0) {
                            n1Var3 = null;
                        } else {
                            n1Var3 = n1Var;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            rVarH.X(1899222916);
                            f3.m.Companion companion9 = f3.m.INSTANCE;
                            if ((i17 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            i36 = 0;
                            mVarD = n4.v.d(companion9, false, (er.l) objE2, 1, null);
                            rVarH.R();
                        } else {
                            i36 = 0;
                            rVarH.X(1899381698);
                            rVarH.R();
                            mVarD = f3.m.INSTANCE;
                        }
                        int i312 = i36;
                        f3.m mVar9 = mVar4;
                        f3.m mVarB5 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = a.f208956a;
                            rVarH.v(objE);
                        }
                        p036e4.w0 w0Var5 = (p036e4.w0) objE;
                        int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, i312));
                        f3.m mVarE5 = f3.j.e(rVarH, mVarB5);
                        p076m2.e0 e0VarT5 = rVarH.t();
                        androidx.compose.ui.node.c.Companion companion10 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion10.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC5 = n6.c(rVarH);
                        n6.i(rVarC5, w0Var5, companion10.d());
                        n6.i(rVarC5, e0VarT5, companion10.f());
                        n6.g(rVarC5, companion10.a());
                        n6.i(rVarC5, mVarE5, companion10.e());
                        n6.i(rVarC5, Integer.valueOf(iHashCode5), companion10.c());
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        n1Var2 = n1Var3;
                        f17 = f18;
                        lVar3 = lVarE;
                        cVar2 = cVarE;
                        mVar3 = mVar9;
                    } else {
                        rVarH.O();
                        cVar2 = cVar;
                        n1Var2 = n1Var;
                        mVar3 = mVar2;
                        lVar3 = lVar2;
                        f17 = f16;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: w0.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                f16 = f15;
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion11 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion11, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i313 = i36;
                    f3.m mVar10 = mVar4;
                    f3.m mVarB6 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var6 = (p036e4.w0) objE;
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, i313));
                    f3.m mVarE6 = f3.j.e(rVarH, mVarB6);
                    p076m2.e0 e0VarT6 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion12 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion12.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC6 = n6.c(rVarH);
                    n6.i(rVarC6, w0Var6, companion12.d());
                    n6.i(rVarC6, e0VarT6, companion12.f());
                    n6.g(rVarC6, companion12.a());
                    n6.i(rVarC6, mVarE6, companion12.e());
                    n6.i(rVarC6, Integer.valueOf(iHashCode6), companion12.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar10;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion13 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion13, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i314 = i36;
                    f3.m mVar11 = mVar4;
                    f3.m mVarB7 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var7 = (p036e4.w0) objE;
                    int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, i314));
                    f3.m mVarE7 = f3.j.e(rVarH, mVarB7);
                    p076m2.e0 e0VarT7 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion14 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion14.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC7 = n6.c(rVarH);
                    n6.i(rVarC7, w0Var7, companion14.d());
                    n6.i(rVarC7, e0VarT7, companion14.f());
                    n6.g(rVarC7, companion14.a());
                    n6.i(rVarC7, mVarE7, companion14.e());
                    n6.i(rVarC7, Integer.valueOf(iHashCode7), companion14.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar11;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            f16 = f15;
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(n1Var)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    cVarE = f3.c.INSTANCE.e();
                } else {
                    cVarE = cVar;
                }
                if (i25 != 0) {
                    lVarE = p036e4.l.INSTANCE.e();
                } else {
                    lVarE = lVar2;
                }
                if (i27 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (i29 != 0) {
                    n1Var3 = null;
                } else {
                    n1Var3 = n1Var;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    rVarH.X(1899222916);
                    f3.m.Companion companion15 = f3.m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    i36 = 0;
                    mVarD = n4.v.d(companion15, false, (er.l) objE2, 1, null);
                    rVarH.R();
                } else {
                    i36 = 0;
                    rVarH.X(1899381698);
                    rVarH.R();
                    mVarD = f3.m.INSTANCE;
                }
                int i315 = i36;
                f3.m mVar12 = mVar4;
                f3.m mVarB8 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = a.f208956a;
                    rVarH.v(objE);
                }
                p036e4.w0 w0Var8 = (p036e4.w0) objE;
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, i315));
                f3.m mVarE8 = f3.j.e(rVarH, mVarB8);
                p076m2.e0 e0VarT8 = rVarH.t();
                androidx.compose.ui.node.c.Companion companion16 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion16.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC8 = n6.c(rVarH);
                n6.i(rVarC8, w0Var8, companion16.d());
                n6.i(rVarC8, e0VarT8, companion16.f());
                n6.g(rVarC8, companion16.a());
                n6.i(rVarC8, mVarE8, companion16.e());
                n6.i(rVarC8, Integer.valueOf(iHashCode8), companion16.c());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                n1Var2 = n1Var3;
                f17 = f18;
                lVar3 = lVarE;
                cVar2 = cVarE;
                mVar3 = mVar12;
            } else {
                rVarH.O();
                cVar2 = cVar;
                n1Var2 = n1Var;
                mVar3 = mVar2;
                lVar3 = lVar2;
                f17 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: w0.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                if (rVarH.W(cVar)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
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
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        f16 = f15;
                        if (rVarH.b(f16)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(n1Var)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            cVarE = f3.c.INSTANCE.e();
                        } else {
                            cVarE = cVar;
                        }
                        if (i25 != 0) {
                            lVarE = p036e4.l.INSTANCE.e();
                        } else {
                            lVarE = lVar2;
                        }
                        if (i27 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = f16;
                        }
                        if (i29 != 0) {
                            n1Var3 = null;
                        } else {
                            n1Var3 = n1Var;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            rVarH.X(1899222916);
                            f3.m.Companion companion17 = f3.m.INSTANCE;
                            if ((i17 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.l() { // from class: w0.f1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i1.e(str, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            i36 = 0;
                            mVarD = n4.v.d(companion17, false, (er.l) objE2, 1, null);
                            rVarH.R();
                        } else {
                            i36 = 0;
                            rVarH.X(1899381698);
                            rVarH.R();
                            mVarD = f3.m.INSTANCE;
                        }
                        int i316 = i36;
                        f3.m mVar13 = mVar4;
                        f3.m mVarB9 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = a.f208956a;
                            rVarH.v(objE);
                        }
                        p036e4.w0 w0Var9 = (p036e4.w0) objE;
                        int iHashCode9 = Long.hashCode(p076m2.m.b(rVarH, i316));
                        f3.m mVarE9 = f3.j.e(rVarH, mVarB9);
                        p076m2.e0 e0VarT9 = rVarH.t();
                        androidx.compose.ui.node.c.Companion companion18 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion18.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC9 = n6.c(rVarH);
                        n6.i(rVarC9, w0Var9, companion18.d());
                        n6.i(rVarC9, e0VarT9, companion18.f());
                        n6.g(rVarC9, companion18.a());
                        n6.i(rVarC9, mVarE9, companion18.e());
                        n6.i(rVarC9, Integer.valueOf(iHashCode9), companion18.c());
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        n1Var2 = n1Var3;
                        f17 = f18;
                        lVar3 = lVarE;
                        cVar2 = cVarE;
                        mVar3 = mVar13;
                    } else {
                        rVarH.O();
                        cVar2 = cVar;
                        n1Var2 = n1Var;
                        mVar3 = mVar2;
                        lVar3 = lVar2;
                        f17 = f16;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: w0.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                f16 = f15;
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion19 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion19, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i317 = i36;
                    f3.m mVar14 = mVar4;
                    f3.m mVarB10 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var10 = (p036e4.w0) objE;
                    int iHashCode10 = Long.hashCode(p076m2.m.b(rVarH, i317));
                    f3.m mVarE10 = f3.j.e(rVarH, mVarB10);
                    p076m2.e0 e0VarT10 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion110 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion110.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC10 = n6.c(rVarH);
                    n6.i(rVarC10, w0Var10, companion110.d());
                    n6.i(rVarC10, e0VarT10, companion110.f());
                    n6.g(rVarC10, companion110.a());
                    n6.i(rVarC10, mVarE10, companion110.e());
                    n6.i(rVarC10, Integer.valueOf(iHashCode10), companion110.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar14;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar2 = lVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion111 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion111, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i318 = i36;
                    f3.m mVar15 = mVar4;
                    f3.m mVarB11 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var11 = (p036e4.w0) objE;
                    int iHashCode11 = Long.hashCode(p076m2.m.b(rVarH, i318));
                    f3.m mVarE11 = f3.j.e(rVarH, mVarB11);
                    p076m2.e0 e0VarT11 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion112 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion112.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC11 = n6.c(rVarH);
                    n6.i(rVarC11, w0Var11, companion112.d());
                    n6.i(rVarC11, e0VarT11, companion112.f());
                    n6.g(rVarC11, companion112.a());
                    n6.i(rVarC11, mVarE11, companion112.e());
                    n6.i(rVarC11, Integer.valueOf(iHashCode11), companion112.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar15;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            f16 = f15;
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(n1Var)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    cVarE = f3.c.INSTANCE.e();
                } else {
                    cVarE = cVar;
                }
                if (i25 != 0) {
                    lVarE = p036e4.l.INSTANCE.e();
                } else {
                    lVarE = lVar2;
                }
                if (i27 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (i29 != 0) {
                    n1Var3 = null;
                } else {
                    n1Var3 = n1Var;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    rVarH.X(1899222916);
                    f3.m.Companion companion113 = f3.m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    i36 = 0;
                    mVarD = n4.v.d(companion113, false, (er.l) objE2, 1, null);
                    rVarH.R();
                } else {
                    i36 = 0;
                    rVarH.X(1899381698);
                    rVarH.R();
                    mVarD = f3.m.INSTANCE;
                }
                int i319 = i36;
                f3.m mVar16 = mVar4;
                f3.m mVarB12 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = a.f208956a;
                    rVarH.v(objE);
                }
                p036e4.w0 w0Var12 = (p036e4.w0) objE;
                int iHashCode12 = Long.hashCode(p076m2.m.b(rVarH, i319));
                f3.m mVarE12 = f3.j.e(rVarH, mVarB12);
                p076m2.e0 e0VarT12 = rVarH.t();
                androidx.compose.ui.node.c.Companion companion114 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion114.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC12 = n6.c(rVarH);
                n6.i(rVarC12, w0Var12, companion114.d());
                n6.i(rVarC12, e0VarT12, companion114.f());
                n6.g(rVarC12, companion114.a());
                n6.i(rVarC12, mVarE12, companion114.e());
                n6.i(rVarC12, Integer.valueOf(iHashCode12), companion114.c());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                n1Var2 = n1Var3;
                f17 = f18;
                lVar3 = lVarE;
                cVar2 = cVarE;
                mVar3 = mVar16;
            } else {
                rVarH.O();
                cVar2 = cVar;
                n1Var2 = n1Var;
                mVar3 = mVar2;
                lVar3 = lVar2;
                f17 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: w0.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
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
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(n1Var)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        cVarE = f3.c.INSTANCE.e();
                    } else {
                        cVarE = cVar;
                    }
                    if (i25 != 0) {
                        lVarE = p036e4.l.INSTANCE.e();
                    } else {
                        lVarE = lVar2;
                    }
                    if (i27 != 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = f16;
                    }
                    if (i29 != 0) {
                        n1Var3 = null;
                    } else {
                        n1Var3 = n1Var;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        rVarH.X(1899222916);
                        f3.m.Companion companion115 = f3.m.INSTANCE;
                        if ((i17 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.l() { // from class: w0.f1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i1.e(str, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        i36 = 0;
                        mVarD = n4.v.d(companion115, false, (er.l) objE2, 1, null);
                        rVarH.R();
                    } else {
                        i36 = 0;
                        rVarH.X(1899381698);
                        rVarH.R();
                        mVarD = f3.m.INSTANCE;
                    }
                    int i3110 = i36;
                    f3.m mVar17 = mVar4;
                    f3.m mVarB13 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = a.f208956a;
                        rVarH.v(objE);
                    }
                    p036e4.w0 w0Var13 = (p036e4.w0) objE;
                    int iHashCode13 = Long.hashCode(p076m2.m.b(rVarH, i3110));
                    f3.m mVarE13 = f3.j.e(rVarH, mVarB13);
                    p076m2.e0 e0VarT13 = rVarH.t();
                    androidx.compose.ui.node.c.Companion companion116 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion116.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC13 = n6.c(rVarH);
                    n6.i(rVarC13, w0Var13, companion116.d());
                    n6.i(rVarC13, e0VarT13, companion116.f());
                    n6.g(rVarC13, companion116.a());
                    n6.i(rVarC13, mVarE13, companion116.e());
                    n6.i(rVarC13, Integer.valueOf(iHashCode13), companion116.c());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    n1Var2 = n1Var3;
                    f17 = f18;
                    lVar3 = lVarE;
                    cVar2 = cVarE;
                    mVar3 = mVar17;
                } else {
                    rVarH.O();
                    cVar2 = cVar;
                    n1Var2 = n1Var;
                    mVar3 = mVar2;
                    lVar3 = lVar2;
                    f17 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: w0.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            f16 = f15;
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(n1Var)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    cVarE = f3.c.INSTANCE.e();
                } else {
                    cVarE = cVar;
                }
                if (i25 != 0) {
                    lVarE = p036e4.l.INSTANCE.e();
                } else {
                    lVarE = lVar2;
                }
                if (i27 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (i29 != 0) {
                    n1Var3 = null;
                } else {
                    n1Var3 = n1Var;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    rVarH.X(1899222916);
                    f3.m.Companion companion117 = f3.m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    i36 = 0;
                    mVarD = n4.v.d(companion117, false, (er.l) objE2, 1, null);
                    rVarH.R();
                } else {
                    i36 = 0;
                    rVarH.X(1899381698);
                    rVarH.R();
                    mVarD = f3.m.INSTANCE;
                }
                int i3111 = i36;
                f3.m mVar18 = mVar4;
                f3.m mVarB14 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = a.f208956a;
                    rVarH.v(objE);
                }
                p036e4.w0 w0Var14 = (p036e4.w0) objE;
                int iHashCode14 = Long.hashCode(p076m2.m.b(rVarH, i3111));
                f3.m mVarE14 = f3.j.e(rVarH, mVarB14);
                p076m2.e0 e0VarT14 = rVarH.t();
                androidx.compose.ui.node.c.Companion companion118 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion118.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC14 = n6.c(rVarH);
                n6.i(rVarC14, w0Var14, companion118.d());
                n6.i(rVarC14, e0VarT14, companion118.f());
                n6.g(rVarC14, companion118.a());
                n6.i(rVarC14, mVarE14, companion118.e());
                n6.i(rVarC14, Integer.valueOf(iHashCode14), companion118.c());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                n1Var2 = n1Var3;
                f17 = f18;
                lVar3 = lVarE;
                cVar2 = cVarE;
                mVar3 = mVar18;
            } else {
                rVarH.O();
                cVar2 = cVar;
                n1Var2 = n1Var;
                mVar3 = mVar2;
                lVar3 = lVar2;
                f17 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: w0.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        lVar2 = lVar;
        i27 = i16 & 32;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                f16 = f15;
                if (rVarH.b(f16)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(n1Var)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    cVarE = f3.c.INSTANCE.e();
                } else {
                    cVarE = cVar;
                }
                if (i25 != 0) {
                    lVarE = p036e4.l.INSTANCE.e();
                } else {
                    lVarE = lVar2;
                }
                if (i27 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = f16;
                }
                if (i29 != 0) {
                    n1Var3 = null;
                } else {
                    n1Var3 = n1Var;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    rVarH.X(1899222916);
                    f3.m.Companion companion119 = f3.m.INSTANCE;
                    if ((i17 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.l() { // from class: w0.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i1.e(str, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    i36 = 0;
                    mVarD = n4.v.d(companion119, false, (er.l) objE2, 1, null);
                    rVarH.R();
                } else {
                    i36 = 0;
                    rVarH.X(1899381698);
                    rVarH.R();
                    mVarD = f3.m.INSTANCE;
                }
                int i3112 = i36;
                f3.m mVar19 = mVar4;
                f3.m mVarB15 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = a.f208956a;
                    rVarH.v(objE);
                }
                p036e4.w0 w0Var15 = (p036e4.w0) objE;
                int iHashCode15 = Long.hashCode(p076m2.m.b(rVarH, i3112));
                f3.m mVarE15 = f3.j.e(rVarH, mVarB15);
                p076m2.e0 e0VarT15 = rVarH.t();
                androidx.compose.ui.node.c.Companion companion1110 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion1110.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC15 = n6.c(rVarH);
                n6.i(rVarC15, w0Var15, companion1110.d());
                n6.i(rVarC15, e0VarT15, companion1110.f());
                n6.g(rVarC15, companion1110.a());
                n6.i(rVarC15, mVarE15, companion1110.e());
                n6.i(rVarC15, Integer.valueOf(iHashCode15), companion1110.c());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                n1Var2 = n1Var3;
                f17 = f18;
                lVar3 = lVarE;
                cVar2 = cVarE;
                mVar3 = mVar19;
            } else {
                rVarH.O();
                cVar2 = cVar;
                n1Var2 = n1Var;
                mVar3 = mVar2;
                lVar3 = lVar2;
                f17 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: w0.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        f16 = f15;
        i29 = i16 & 64;
        if (i29 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.W(n1Var)) {
                i35 = PKIFailureInfo.badCertTemplate;
            } else {
                i35 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i35;
        }
        if ((i17 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i37 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                cVarE = f3.c.INSTANCE.e();
            } else {
                cVarE = cVar;
            }
            if (i25 != 0) {
                lVarE = p036e4.l.INSTANCE.e();
            } else {
                lVarE = lVar2;
            }
            if (i27 != 0) {
                f18 = 1.0f;
            } else {
                f18 = f16;
            }
            if (i29 != 0) {
                n1Var3 = null;
            } else {
                n1Var3 = n1Var;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1142754848, i17, -1, "androidx.compose.foundation.Image (Image.kt:247)");
            }
            if (str != null) {
                rVarH.X(1899222916);
                f3.m.Companion companion1111 = f3.m.INSTANCE;
                if ((i17 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE2 = rVarH.E();
                if (z16) {
                    objE2 = new er.l() { // from class: w0.f1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i1.e(str, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.l() { // from class: w0.f1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i1.e(str, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                i36 = 0;
                mVarD = n4.v.d(companion1111, false, (er.l) objE2, 1, null);
                rVarH.R();
            } else {
                i36 = 0;
                rVarH.X(1899381698);
                rVarH.R();
                mVarD = f3.m.INSTANCE;
            }
            int i3113 = i36;
            f3.m mVar110 = mVar4;
            f3.m mVarB16 = androidx.compose.ui.draw.a.b(k3.f.b(mVar4.u(mVarD)), aVar, false, cVarE, lVarE, f18, n1Var3, 2, null);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = a.f208956a;
                rVarH.v(objE);
            }
            p036e4.w0 w0Var16 = (p036e4.w0) objE;
            int iHashCode16 = Long.hashCode(p076m2.m.b(rVarH, i3113));
            f3.m mVarE16 = f3.j.e(rVarH, mVarB16);
            p076m2.e0 e0VarT16 = rVarH.t();
            androidx.compose.ui.node.c.Companion companion1112 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion1112.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC16 = n6.c(rVarH);
            n6.i(rVarC16, w0Var16, companion1112.d());
            n6.i(rVarC16, e0VarT16, companion1112.f());
            n6.g(rVarC16, companion1112.a());
            n6.i(rVarC16, mVarE16, companion1112.e());
            n6.i(rVarC16, Integer.valueOf(iHashCode16), companion1112.c());
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            n1Var2 = n1Var3;
            f17 = f18;
            lVar3 = lVarE;
            cVar2 = cVarE;
            mVar3 = mVar110;
        } else {
            rVarH.O();
            cVar2 = cVar;
            n1Var2 = n1Var;
            mVar3 = mVar2;
            lVar3 = lVar2;
            f17 = f16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w0.g1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i1.f(aVar, str, mVar3, cVar2, lVar3, f17, n1Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(t3.d dVar, String str, f3.m mVar, f3.c cVar, p036e4.l lVar, float f15, n3.n1 n1Var, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 4) != 0) {
            mVar = f3.m.INSTANCE;
        }
        f3.m mVar2 = mVar;
        if ((i16 & 8) != 0) {
            cVar = f3.c.INSTANCE.e();
        }
        f3.c cVar2 = cVar;
        p036e4.l lVarE = (i16 & 16) != 0 ? p036e4.l.INSTANCE.e() : lVar;
        float f16 = (i16 & 32) != 0 ? 1.0f : f15;
        n3.n1 n1Var2 = (i16 & 64) != 0 ? null : n1Var;
        if (p076m2.t.k()) {
            p076m2.t.o(1595907091, i15, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        c(t3.q.g(dVar, rVar, i15 & 14), str, mVar2, cVar2, lVarE, f16, n1Var2, rVar, VectorPainter.f9984p | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(String str, n4.i0 i0Var) {
        n4.f0.c0(i0Var, str);
        n4.f0.r0(i0Var, n4.l.INSTANCE.e());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(androidx.compose.ui.graphics.painter.a aVar, String str, f3.m mVar, f3.c cVar, p036e4.l lVar, float f15, n3.n1 n1Var, int i15, int i16, p076m2.r rVar, int i17) {
        c(aVar, str, mVar, cVar, lVar, f15, n1Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void g(n3.b2 b2Var, String str, f3.m mVar, f3.c cVar, p036e4.l lVar, float f15, n3.n1 n1Var, int i15, p076m2.r rVar, int i16, int i17) {
        f3.m mVar2 = (i17 & 4) != 0 ? f3.m.INSTANCE : mVar;
        f3.c cVarE = (i17 & 8) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i17 & 16) != 0 ? p036e4.l.INSTANCE.e() : lVar;
        float f16 = (i17 & 32) != 0 ? 1.0f : f15;
        n3.n1 n1Var2 = (i17 & 64) != 0 ? null : n1Var;
        int iB = (i17 & 128) != 0 ? p3.f.INSTANCE.b() : i15;
        if (p076m2.t.k()) {
            p076m2.t.o(-1396260732, i16, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean zW = rVar.W(b2Var);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = r3.a.b(b2Var, 0L, 0L, iB, 6, null);
            rVar.v(objE);
        }
        c((BitmapPainter) objE, str, mVar2, cVarE, lVarE, f16, n1Var2, rVar, BitmapPainter.f9948q | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }
}
