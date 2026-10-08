package p012a2;

import androidx.compose.foundation.layout.d;
import c5.h;
import d1.a3;
import d1.c4;
import d1.d3;
import d1.f4;
import d1.g4;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import er.a;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import n3.t2;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001aU\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016\"\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lf3/m;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lc5/h;", "elevation", "Ld1/d3;", "contentPadding", "Lkotlin/Function1;", "Ld1/p3;", "Loq/i0;", "content", "i", "(Lf3/m;JJFLd1/d3;Ler/q;Lm2/r;II)V", "Ln3/y2;", "shape", "Ld1/c4;", "windowInsets", "e", "(JJFLd1/d3;Ln3/y2;Ld1/c4;Lf3/m;Ler/q;Lm2/r;II)V", "a", "F", "AppBarHeight", "b", "AppBarHorizontalPadding", "c", "Lf3/m;", "TitleInsetWithoutIcon", "d", "TitleIconModifier", "BottomAppBarCutoutOffset", "f", "BottomAppBarRoundedEdgeRadius", "g", "Ld1/c4;", "ZeroInsets", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1875a = h.n(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m f1877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m f1878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f1879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f1880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c4 f1881g;

    static {
        float f15 = 4;
        float fN = h.n(f15);
        f1876b = fN;
        m.Companion companion = m.INSTANCE;
        f1877c = d.y(companion, h.n(h.n(16) - fN));
        f1878d = d.y(d.d(companion, 0.0f, 1, null), h.n(h.n(72) - fN));
        f1879e = h.n(8);
        f1880f = h.n(f15);
        f1881g = f4.d(h.n(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    private static final void e(final long j15, final long j16, final float f15, final d3 d3Var, final y2 y2Var, final c4 c4Var, m mVar, final er.q<? super p3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        float f16;
        y2 y2Var2;
        m mVar2;
        boolean z15;
        r rVar2;
        final m mVar3;
        d5 d5VarM;
        m mVar4;
        int i18;
        r rVarH = rVar.h(1222317265);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.d(j16) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            f16 = f15;
            i17 |= rVarH.b(f16) ? 256 : 128;
        } else {
            f16 = f15;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.W(d3Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            y2Var2 = y2Var;
            i17 |= rVarH.W(y2Var2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            y2Var2 = y2Var;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.W(c4Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        int i19 = i16 & 64;
        if (i19 == 0) {
            if ((i15 & 1572864) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i17 |= i18;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i19 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(1222317265, i17, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
                }
                int i25 = i17 << 6;
                rVar2 = rVarH;
                f5.f(mVar4, y2Var2, j15, j16, null, f16, y2.m.d(-1628734195, true, new p() { // from class: a2.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.f(c4Var, d3Var, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, ((i17 >> 18) & 14) | 1572864 | ((i17 >> 9) & 112) | (i25 & 896) | (i25 & 7168) | ((i17 << 9) & 458752), 16);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.o
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.h(j15, j16, f15, d3Var, y2Var, c4Var, mVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        mVar2 = mVar;
        if ((i15 & 12582912) == 0) {
            if (rVarH.G(qVar)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i17 |= i18;
        }
        if ((i17 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i19 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (t.k()) {
                t.o(1222317265, i17, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
            }
            int i26 = i17 << 6;
            rVar2 = rVarH;
            f5.f(mVar4, y2Var2, j15, j16, null, f16, y2.m.d(-1628734195, true, new p() { // from class: a2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.f(c4Var, d3Var, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, ((i17 >> 18) & 14) | 1572864 | ((i17 >> 9) & 112) | (i26 & 896) | (i26 & 7168) | ((i17 << 9) & 458752), 16);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.h(j15, j16, f15, d3Var, y2Var, c4Var, mVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final c4 c4Var, final d3 d3Var, final er.q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1628734195, i15, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:707)");
            }
            d0.c(l1.c().d(Float.valueOf(j1.f1722a.d(rVar, 6))), y2.m.d(597057613, true, new p() { // from class: a2.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.g(c4Var, d3Var, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, p076m2.c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c4 c4Var, d3 d3Var, er.q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(597057613, i15, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:708)");
            }
            m mVarI = d.i(a3.l(g4.c(d.h(m.INSTANCE, 0.0f, 1, null), c4Var), d3Var), f1875a);
            w0 w0VarB = m3.b(i.f39152a.j(), c.INSTANCE.i(), rVar, 54);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarI);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.f()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = companion.c();
            if (rVarC.f() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion.e());
            qVar.w(q3.f39261a, rVar, 6);
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
    public static final i0 h(long j15, long j16, float f15, d3 d3Var, y2 y2Var, c4 c4Var, m mVar, er.q qVar, int i15, int i16, r rVar, int i17) {
        e(j15, j16, f15, d3Var, y2Var, c4Var, mVar, qVar, rVar, p076m2.g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:108:0x0186  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    public static final void i(m mVar, long j15, long j16, float f15, d3 d3Var, final er.q<? super p3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        long jF;
        long j17;
        float fB;
        int i18;
        d3 d3Var2;
        int i19;
        boolean z15;
        r rVar2;
        final m mVar3;
        final long j18;
        final long j19;
        final float f16;
        final d3 d3Var3;
        d5 d5VarM;
        m mVar4;
        m mVar5;
        long j25;
        float f17;
        d3 d3VarA;
        long j26;
        int i25;
        r rVarH = rVar.h(-2030536439);
        int i26 = i16 & 1;
        if (i26 != 0) {
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
                jF = j15;
                int i27 = rVarH.d(jF) ? 32 : 16;
                i17 |= i27;
            } else {
                jF = j15;
            }
            i17 |= i27;
        } else {
            jF = j15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                j17 = j16;
                int i28 = rVarH.d(j17) ? 256 : 128;
                i17 |= i28;
            } else {
                j17 = j16;
            }
            i17 |= i28;
        } else {
            j17 = j16;
        }
        int i29 = i16 & 8;
        if (i29 == 0) {
            if ((i15 & 3072) == 0) {
                fB = f15;
                i17 |= rVarH.b(fB) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    d3Var2 = d3Var;
                    if (rVarH.W(d3Var2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                if ((196608 & i15) != 0) {
                    if (rVarH.G(qVar)) {
                        i25 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i25 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i25;
                }
                if ((74899 & i17) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i26 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 2) != 0) {
                            i17 &= -113;
                            jF = c1.f(m2.f1788a.a(rVarH, 6));
                        }
                        if ((i16 & 4) != 0) {
                            long jD = c1.d(jF, rVarH, (i17 >> 3) & 14);
                            i17 &= -897;
                            j17 = jD;
                        }
                        if (i29 != 0) {
                            fB = l.f1763a.b();
                        }
                        if (i18 != 0) {
                            mVar5 = mVar4;
                            j25 = j17;
                            f17 = fB;
                            d3VarA = l.f1763a.a();
                            j26 = jF;
                        } else {
                            mVar5 = mVar4;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-2030536439, i17, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                        }
                        int i35 = i17 >> 3;
                        rVar2 = rVarH;
                        e(j26, j25, f17, d3VarA, t2.a(), f1881g, mVar5, qVar, rVar2, (i35 & 7168) | (i35 & 14) | 221184 | (i35 & 112) | (i35 & 896) | ((i17 << 18) & 3670016) | ((i17 << 6) & 29360128), 0);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j26;
                        j19 = j25;
                        f16 = f17;
                        d3Var3 = d3VarA;
                        mVar3 = mVar5;
                    } else {
                        rVarH.O();
                        if ((i16 & 2) != 0) {
                            i17 &= -113;
                        }
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                        }
                        mVar5 = mVar2;
                    }
                    f17 = fB;
                    j26 = jF;
                    d3VarA = d3Var2;
                    j25 = j17;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-2030536439, i17, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                    }
                    int i36 = i17 >> 3;
                    rVar2 = rVarH;
                    e(j26, j25, f17, d3VarA, t2.a(), f1881g, mVar5, qVar, rVar2, (i36 & 7168) | (i36 & 14) | 221184 | (i36 & 112) | (i36 & 896) | ((i17 << 18) & 3670016) | ((i17 << 6) & 29360128), 0);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j26;
                    j19 = j25;
                    f16 = f17;
                    d3Var3 = d3VarA;
                    mVar3 = mVar5;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    j18 = jF;
                    j19 = j17;
                    f16 = fB;
                    d3Var3 = d3Var2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.m
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return q.j(mVar3, j18, j19, f16, d3Var3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d3Var2 = d3Var;
            if ((196608 & i15) != 0) {
                if (rVarH.G(qVar)) {
                    i25 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i25 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i25;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                        jF = c1.f(m2.f1788a.a(rVarH, 6));
                    }
                    if ((i16 & 4) != 0) {
                        long jD2 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                        i17 &= -897;
                        j17 = jD2;
                    }
                    if (i29 != 0) {
                        fB = l.f1763a.b();
                    }
                    if (i18 != 0) {
                        mVar5 = mVar4;
                        j25 = j17;
                        f17 = fB;
                        d3VarA = l.f1763a.a();
                        j26 = jF;
                    } else {
                        mVar5 = mVar4;
                        f17 = fB;
                        j26 = jF;
                        d3VarA = d3Var2;
                        j25 = j17;
                    }
                } else {
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                        jF = c1.f(m2.f1788a.a(rVarH, 6));
                    }
                    if ((i16 & 4) != 0) {
                        long jD3 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                        i17 &= -897;
                        j17 = jD3;
                    }
                    if (i29 != 0) {
                        fB = l.f1763a.b();
                    }
                    if (i18 != 0) {
                        mVar5 = mVar4;
                        j25 = j17;
                        f17 = fB;
                        d3VarA = l.f1763a.a();
                        j26 = jF;
                    } else {
                        mVar5 = mVar4;
                        f17 = fB;
                        j26 = jF;
                        d3VarA = d3Var2;
                        j25 = j17;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2030536439, i17, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                }
                int i37 = i17 >> 3;
                rVar2 = rVarH;
                e(j26, j25, f17, d3VarA, t2.a(), f1881g, mVar5, qVar, rVar2, (i37 & 7168) | (i37 & 14) | 221184 | (i37 & 112) | (i37 & 896) | ((i17 << 18) & 3670016) | ((i17 << 6) & 29360128), 0);
                if (t.k()) {
                    t.n();
                }
                j18 = j26;
                j19 = j25;
                f16 = f17;
                d3Var3 = d3VarA;
                mVar3 = mVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                j18 = jF;
                j19 = j17;
                f16 = fB;
                d3Var3 = d3Var2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.j(mVar3, j18, j19, f16, d3Var3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        fB = f15;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                d3Var2 = d3Var;
                if (rVarH.W(d3Var2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((196608 & i15) != 0) {
                if (rVarH.G(qVar)) {
                    i25 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i25 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i25;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                        jF = c1.f(m2.f1788a.a(rVarH, 6));
                    }
                    if ((i16 & 4) != 0) {
                        long jD4 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                        i17 &= -897;
                        j17 = jD4;
                    }
                    if (i29 != 0) {
                        fB = l.f1763a.b();
                    }
                    if (i18 != 0) {
                        mVar5 = mVar4;
                        j25 = j17;
                        f17 = fB;
                        d3VarA = l.f1763a.a();
                        j26 = jF;
                    } else {
                        mVar5 = mVar4;
                        f17 = fB;
                        j26 = jF;
                        d3VarA = d3Var2;
                        j25 = j17;
                    }
                } else {
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                        jF = c1.f(m2.f1788a.a(rVarH, 6));
                    }
                    if ((i16 & 4) != 0) {
                        long jD5 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                        i17 &= -897;
                        j17 = jD5;
                    }
                    if (i29 != 0) {
                        fB = l.f1763a.b();
                    }
                    if (i18 != 0) {
                        mVar5 = mVar4;
                        j25 = j17;
                        f17 = fB;
                        d3VarA = l.f1763a.a();
                        j26 = jF;
                    } else {
                        mVar5 = mVar4;
                        f17 = fB;
                        j26 = jF;
                        d3VarA = d3Var2;
                        j25 = j17;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-2030536439, i17, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                }
                int i38 = i17 >> 3;
                rVar2 = rVarH;
                e(j26, j25, f17, d3VarA, t2.a(), f1881g, mVar5, qVar, rVar2, (i38 & 7168) | (i38 & 14) | 221184 | (i38 & 112) | (i38 & 896) | ((i17 << 18) & 3670016) | ((i17 << 6) & 29360128), 0);
                if (t.k()) {
                    t.n();
                }
                j18 = j26;
                j19 = j25;
                f16 = f17;
                d3Var3 = d3VarA;
                mVar3 = mVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                j18 = jF;
                j19 = j17;
                f16 = fB;
                d3Var3 = d3Var2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.j(mVar3, j18, j19, f16, d3Var3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        d3Var2 = d3Var;
        if ((196608 & i15) != 0) {
            if (rVarH.G(qVar)) {
                i25 = PKIFailureInfo.unsupportedVersion;
            } else {
                i25 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i25;
        }
        if ((74899 & i17) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                    jF = c1.f(m2.f1788a.a(rVarH, 6));
                }
                if ((i16 & 4) != 0) {
                    long jD6 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                    i17 &= -897;
                    j17 = jD6;
                }
                if (i29 != 0) {
                    fB = l.f1763a.b();
                }
                if (i18 != 0) {
                    mVar5 = mVar4;
                    j25 = j17;
                    f17 = fB;
                    d3VarA = l.f1763a.a();
                    j26 = jF;
                } else {
                    mVar5 = mVar4;
                    f17 = fB;
                    j26 = jF;
                    d3VarA = d3Var2;
                    j25 = j17;
                }
            } else {
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                    jF = c1.f(m2.f1788a.a(rVarH, 6));
                }
                if ((i16 & 4) != 0) {
                    long jD7 = c1.d(jF, rVarH, (i17 >> 3) & 14);
                    i17 &= -897;
                    j17 = jD7;
                }
                if (i29 != 0) {
                    fB = l.f1763a.b();
                }
                if (i18 != 0) {
                    mVar5 = mVar4;
                    j25 = j17;
                    f17 = fB;
                    d3VarA = l.f1763a.a();
                    j26 = jF;
                } else {
                    mVar5 = mVar4;
                    f17 = fB;
                    j26 = jF;
                    d3VarA = d3Var2;
                    j25 = j17;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-2030536439, i17, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
            }
            int i39 = i17 >> 3;
            rVar2 = rVarH;
            e(j26, j25, f17, d3VarA, t2.a(), f1881g, mVar5, qVar, rVar2, (i39 & 7168) | (i39 & 14) | 221184 | (i39 & 112) | (i39 & 896) | ((i17 << 18) & 3670016) | ((i17 << 6) & 29360128), 0);
            if (t.k()) {
                t.n();
            }
            j18 = j26;
            j19 = j25;
            f16 = f17;
            d3Var3 = d3VarA;
            mVar3 = mVar5;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            j18 = jF;
            j19 = j17;
            f16 = fB;
            d3Var3 = d3Var2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.j(mVar3, j18, j19, f16, d3Var3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(m mVar, long j15, long j16, float f15, d3 d3Var, er.q qVar, int i15, int i16, r rVar, int i17) {
        i(mVar, j15, j16, f15, d3Var, qVar, rVar, p076m2.g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
