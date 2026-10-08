package k2;

import androidx.compose.ui.graphics.Color;
import h2.h1;
import l2.k0;
import n3.m1;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.m0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p046f2.C6457hh;
import p046f2.of;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010/\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0011\u00102\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lk2/k;", "", "<init>", "()V", "Lk2/v;", "state", "", "isRefreshing", "Lf3/m;", "modifier", "Lc5/h;", "maxDistance", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "elevation", "Lkotlin/Function1;", "Ld1/w;", "Loq/i0;", "content", "k", "(Lk2/v;ZLf3/m;FLn3/y2;JFLer/q;Lm2/r;II)V", "color", "j", "(Lk2/v;ZLf3/m;JJFLm2/r;II)V", "b", "Ln3/y2;", "getShape", "()Ln3/y2;", "getShape$annotations", "c", "getIndicatorShape", "indicatorShape", "d", "F", "w", "()F", "PositionalThreshold", "e", "getIndicatorMaxDistance-D9Ej5fM", "IndicatorMaxDistance", "f", "getElevation-D9Ej5fM", "Elevation", "g", "getLoadingIndicatorElevation-D9Ej5fM", "LoadingIndicatorElevation", "v", "(Lm2/r;I)J", "indicatorContainerColor", "u", "indicatorColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f107501a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final y2 shape = l1.h.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final y2 indicatorShape = l1.h.i();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float PositionalThreshold;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float IndicatorMaxDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float LoadingIndicatorElevation;

    static {
        float fN = c5.h.n(80);
        PositionalThreshold = fN;
        IndicatorMaxDistance = fN;
        l2.t tVar = l2.t.f115244a;
        Elevation = tVar.c();
        LoadingIndicatorElevation = tVar.a();
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(p3.c cVar) {
        int iB = m1.INSTANCE.b();
        p3.d drawContext = cVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().c(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
            cVar.H2();
            return i0.f148189a;
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 m(final v vVar, final boolean z15, final float f15, final float f16, final y2 y2Var, y0 y0Var, v0 v0Var, c5.b bVar) {
        final a2 a2VarO0 = v0Var.o0(bVar.getValue());
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: k2.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.n(a2VarO0, vVar, z15, f15, f16, y2Var, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a2 a2Var, final v vVar, final boolean z15, final float f15, final float f16, final y2 y2Var, a2.a aVar) {
        a2.a.d0(aVar, a2Var, 0, 0, 0.0f, new er.l() { // from class: k2.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.o(vVar, z15, f15, f16, y2Var, (n3.a2) obj);
            }
        }, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(v vVar, boolean z15, float f15, float f16, y2 y2Var, n3.a2 a2Var) {
        boolean z16 = vVar.a() > 0.0f || z15;
        a2Var.j((vVar.a() * a2Var.X0(f15)) - Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax)));
        a2Var.B(z16 ? a2Var.l2(f16) : 0.0f);
        a2Var.k0(y2Var);
        a2Var.u(true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(k kVar, v vVar, boolean z15, f3.m mVar, float f15, y2 y2Var, long j15, float f16, er.q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        kVar.k(vVar, z15, mVar, f15, y2Var, j15, f16, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(boolean z15, final long j15, final v vVar, d1.w wVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(298232649, i15, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:590)");
            }
            p114t0.w.a(Boolean.valueOf(z15), null, of.b(k0.DefaultEffects, rVar, 6), null, y2.m.d(-2064098104, true, new er.q() { // from class: k2.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.r(j15, vVar, ((Boolean) obj).booleanValue(), (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 24576, 10);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(long j15, final v vVar, boolean z15, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.a(z15) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2064098104, i16, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:594)");
            }
            if (z15) {
                rVar.X(-499763759);
                C6457hh.j(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, t.w()), j15, t.f107535a, 0L, 0, 0.0f, rVar, 390, 56);
                rVar.R();
            } else {
                rVar.X(-499540745);
                boolean zW = rVar.W(vVar);
                Object objE = rVar.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new h1() { // from class: k2.h
                        @Override // h2.h1
                        public final float a() {
                            return k.s(vVar);
                        }
                    };
                    rVar.v(objE);
                }
                t.i((h1) objE, j15, rVar, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s(v vVar) {
        return vVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(k kVar, v vVar, boolean z15, f3.m mVar, long j15, long j16, float f15, int i15, int i16, p076m2.r rVar, int i17) {
        kVar.j(vVar, z15, mVar, j15, j16, f15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0174  */
    /* JADX WARN: Code duplicated, block: B:113:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    public final void j(final v vVar, final boolean z15, f3.m mVar, long j15, long j16, float f15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        long j17;
        long jU;
        final float f16;
        boolean z16;
        final f3.m mVar3;
        final long j18;
        final long j19;
        d5 d5VarM;
        f3.m mVar4;
        long jV;
        int i18;
        float f17;
        final long j25;
        int i19;
        int i25;
        int i26;
        p076m2.r rVarH = rVar.h(-1076870256);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(vVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        int i27 = i16 & 4;
        if (i27 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    j17 = j15;
                    int i28 = rVarH.d(j17) ? 2048 : 1024;
                    i17 |= i28;
                } else {
                    j17 = j15;
                }
                i17 |= i28;
            } else {
                j17 = j15;
            }
            if ((i15 & 24576) == 0) {
                jU = j16;
                if ((i16 & 16) == 0 || !rVarH.d(jU)) {
                    i26 = PKIFailureInfo.certRevoked;
                } else {
                    i26 = 16384;
                }
                i17 |= i26;
            } else {
                jU = j16;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i25 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i25;
                } else {
                    f16 = f15;
                }
                i25 = PKIFailureInfo.notAuthorized;
                i17 |= i25;
            } else {
                f16 = f15;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.W(this)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i19;
            }
            if ((599187 & i17) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i27 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 8) != 0) {
                        jV = v(rVarH, (i17 >> 18) & 14);
                        i17 &= -7169;
                    } else {
                        jV = j17;
                    }
                    if ((i16 & 16) != 0) {
                        jU = u(rVarH, (i17 >> 18) & 14);
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        i18 = i17 & (-458753);
                        f17 = IndicatorMaxDistance;
                    } else {
                        i18 = i17;
                        f17 = f16;
                    }
                    j25 = jU;
                } else {
                    rVarH.O();
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                    }
                    mVar4 = mVar2;
                    jV = j17;
                    j25 = jU;
                    i18 = i17;
                    f17 = f16;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1076870256, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:581)");
                }
                int i29 = (i18 & 14) | 12582912 | (i18 & 112) | (i18 & 896) | ((i18 >> 6) & 7168);
                int i35 = i18 << 6;
                int i36 = i29 | (458752 & i35) | (i35 & 234881024);
                f3.m mVar5 = mVar4;
                k(vVar, z15, mVar5, f17, null, jV, 0.0f, y2.m.d(298232649, true, new er.q() { // from class: k2.b
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.q(z15, j25, vVar, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, i36, 80);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f17;
                j18 = jV;
                j19 = j25;
                mVar3 = mVar5;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j18 = j17;
                j19 = jU;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.t(this.f107462a, vVar, z15, mVar3, j18, j19, f16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                j17 = j15;
                if (rVarH.d(j17)) {
                }
                i17 |= i28;
            } else {
                j17 = j15;
            }
            i17 |= i28;
        } else {
            j17 = j15;
        }
        if ((i15 & 24576) == 0) {
            jU = j16;
            if ((i16 & 16) == 0) {
                i26 = PKIFailureInfo.certRevoked;
            } else {
                i26 = PKIFailureInfo.certRevoked;
            }
            i17 |= i26;
        } else {
            jU = j16;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                f16 = f15;
                if (rVarH.b(f16)) {
                    i25 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i25;
            } else {
                f16 = f15;
            }
            i25 = PKIFailureInfo.notAuthorized;
            i17 |= i25;
        } else {
            f16 = f15;
        }
        if ((1572864 & i15) == 0) {
            if (rVarH.W(this)) {
                i19 = PKIFailureInfo.badCertTemplate;
            } else {
                i19 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i19;
        }
        if ((599187 & i17) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i27 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    jV = v(rVarH, (i17 >> 18) & 14);
                    i17 &= -7169;
                } else {
                    jV = j17;
                }
                if ((i16 & 16) != 0) {
                    jU = u(rVarH, (i17 >> 18) & 14);
                    i17 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    i18 = i17 & (-458753);
                    f17 = IndicatorMaxDistance;
                } else {
                    i18 = i17;
                    f17 = f16;
                }
                j25 = jU;
            } else {
                if (i27 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 8) != 0) {
                    jV = v(rVarH, (i17 >> 18) & 14);
                    i17 &= -7169;
                } else {
                    jV = j17;
                }
                if ((i16 & 16) != 0) {
                    jU = u(rVarH, (i17 >> 18) & 14);
                    i17 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    i18 = i17 & (-458753);
                    f17 = IndicatorMaxDistance;
                } else {
                    i18 = i17;
                    f17 = f16;
                }
                j25 = jU;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-1076870256, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:581)");
            }
            int i210 = (i18 & 14) | 12582912 | (i18 & 112) | (i18 & 896) | ((i18 >> 6) & 7168);
            int i37 = i18 << 6;
            int i38 = i210 | (458752 & i37) | (i37 & 234881024);
            f3.m mVar6 = mVar4;
            k(vVar, z15, mVar6, f17, null, jV, 0.0f, y2.m.d(298232649, true, new er.q() { // from class: k2.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.q(z15, j25, vVar, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, i38, 80);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            f16 = f17;
            j18 = jV;
            j19 = j25;
            mVar3 = mVar6;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            j18 = j17;
            j19 = jU;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k2.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.t(this.f107462a, vVar, z15, mVar3, j18, j19, f16, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x019a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:164:0x024b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0257  */
    /* JADX WARN: Code duplicated, block: B:168:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    public final void k(final v vVar, final boolean z15, f3.m mVar, float f15, y2 y2Var, long j15, float f16, final er.q<? super d1.w, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        boolean z16;
        f3.m mVar2;
        float f17;
        y2 y2Var2;
        int i18;
        long jH;
        int i19;
        float f18;
        boolean z17;
        boolean z18;
        final f3.m mVar3;
        final float f19;
        final float f25;
        final y2 y2Var3;
        final long j16;
        d5 d5VarM;
        Object objE;
        p076m2.r.Companion companion;
        boolean z19;
        boolean z25;
        boolean z26;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i25;
        int i26;
        int i27;
        int i28;
        p076m2.r rVarH = rVar.h(-1341144489);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(vVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            z16 = z15;
            i17 |= rVarH.a(z16) ? 32 : 16;
        } else {
            z16 = z15;
        }
        int i29 = i16 & 4;
        if (i29 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    f17 = f15;
                    int i35 = rVarH.b(f17) ? 2048 : 1024;
                    i17 |= i35;
                } else {
                    f17 = f15;
                }
                i17 |= i35;
            } else {
                f17 = f15;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    y2Var2 = y2Var;
                    if (rVarH.W(y2Var2)) {
                        i28 = 16384;
                    }
                    i17 |= i28;
                } else {
                    y2Var2 = y2Var;
                }
                i28 = PKIFailureInfo.certRevoked;
                i17 |= i28;
            } else {
                y2Var2 = y2Var;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                if ((i15 & 196608) == 0) {
                    jH = j15;
                    if (rVarH.d(jH)) {
                        i19 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i19 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i19;
                }
                if ((i15 & 1572864) == 0) {
                    f18 = f16;
                    if ((i16 & 64) == 0 || !rVarH.b(f18)) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i27;
                } else {
                    f18 = f16;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i17 |= i26;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(this)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i17 |= i25;
                }
                z17 = true;
                if ((i17 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i29 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            f17 = IndicatorMaxDistance;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                            y2Var2 = indicatorShape;
                        }
                        if (i18 != 0) {
                            jH = Color.INSTANCE.h();
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                            f18 = Elevation;
                        }
                    } else {
                        rVarH.O();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1341144489, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:522)");
                    }
                    f3.m mVarT = androidx.compose.foundation.layout.d.t(mVar2, t.v());
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new er.l() { // from class: k2.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return k.l((p3.c) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    f3.m mVarD = k3.k.d(mVarT, (er.l) objE);
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z27 = z19;
                    if ((i17 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z28 = z27 | z25 | ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.b(f17)) || (i17 & 3072) == 2048) | ((((3670016 & i17) ^ 1572864) <= 1048576 && rVarH.b(f18)) || (i17 & 1572864) == 1048576);
                    if ((((57344 & i17) ^ 24576) > 16384 || !rVarH.W(y2Var2)) && (i17 & 24576) != 16384) {
                    }
                    z26 = z28 | z17;
                    objE2 = rVarH.E();
                    if (z26 || objE2 == companion.a()) {
                        final boolean z29 = z16;
                        final float f26 = f17;
                        final float f27 = f18;
                        final y2 y2Var4 = y2Var2;
                        objE2 = new er.q() { // from class: k2.f
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return k.m(vVar, z29, f26, f27, y2Var4, (y0) obj, (v0) obj2, (c5.b) obj3);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    f3.m mVarC = w0.i.c(m0.a(mVarD, (er.q) objE2), jH, y2Var2);
                    int i36 = ((i17 >> 12) & 7168) | 48;
                    w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, mVarC);
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
                    n6.i(rVarC, w0VarI, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    qVar.w(d1.x.f39368a, rVarH, Integer.valueOf(((i36 >> 6) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                mVar3 = mVar2;
                f19 = f17;
                f25 = f18;
                y2Var3 = y2Var2;
                j16 = jH;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return k.p(this.f107478a, vVar, z15, mVar3, f19, y2Var3, j16, f25, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            jH = j15;
            if ((i15 & 1572864) == 0) {
                f18 = f16;
                if ((i16 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            } else {
                f18 = f16;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i17 |= i25;
            }
            z17 = true;
            if ((i17 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        f17 = IndicatorMaxDistance;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        y2Var2 = indicatorShape;
                    }
                    if (i18 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        f18 = Elevation;
                    }
                } else {
                    if (i29 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        f17 = IndicatorMaxDistance;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        y2Var2 = indicatorShape;
                    }
                    if (i18 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        f18 = Elevation;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1341144489, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:522)");
                }
                f3.m mVarT2 = androidx.compose.foundation.layout.d.t(mVar2, t.v());
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: k2.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.l((p3.c) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarD2 = k3.k.d(mVarT2, (er.l) objE);
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z210 = z19;
                if ((i17 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z211 = z210 | z25 | ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.b(f17)) || (i17 & 3072) == 2048) | ((((3670016 & i17) ^ 1572864) <= 1048576 && rVarH.b(f18)) || (i17 & 1572864) == 1048576);
                z17 = ((57344 & i17) ^ 24576) > 16384 ? false : false;
                z26 = z211 | z17;
                objE2 = rVarH.E();
                if (z26) {
                    final boolean z212 = z16;
                    final float f28 = f17;
                    final float f29 = f18;
                    final y2 y2Var5 = y2Var2;
                    objE2 = new er.q() { // from class: k2.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.m(vVar, z212, f28, f29, y2Var5, (y0) obj, (v0) obj2, (c5.b) obj3);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    final boolean z213 = z16;
                    final float f210 = f17;
                    final float f211 = f18;
                    final y2 y2Var6 = y2Var2;
                    objE2 = new er.q() { // from class: k2.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.m(vVar, z213, f210, f211, y2Var6, (y0) obj, (v0) obj2, (c5.b) obj3);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarC2 = w0.i.c(m0.a(mVarD2, (er.q) objE2), jH, y2Var2);
                int i37 = ((i17 >> 12) & 7168) | 48;
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarC2);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                qVar.w(d1.x.f39368a, rVarH, Integer.valueOf(((i37 >> 6) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            mVar3 = mVar2;
            f19 = f17;
            f25 = f18;
            y2Var3 = y2Var2;
            j16 = jH;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.p(this.f107478a, vVar, z15, mVar3, f19, y2Var3, j16, f25, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                f17 = f15;
                if (rVarH.b(f17)) {
                }
                i17 |= i35;
            } else {
                f17 = f15;
            }
            i17 |= i35;
        } else {
            f17 = f15;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                y2Var2 = y2Var;
                if (rVarH.W(y2Var2)) {
                    i28 = 16384;
                }
                i17 |= i28;
            } else {
                y2Var2 = y2Var;
            }
            i28 = PKIFailureInfo.certRevoked;
            i17 |= i28;
        } else {
            y2Var2 = y2Var;
        }
        i18 = i16 & 32;
        if (i18 != 0) {
            if ((i15 & 196608) == 0) {
                jH = j15;
                if (rVarH.d(jH)) {
                    i19 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i19 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i19;
            }
            if ((i15 & 1572864) == 0) {
                f18 = f16;
                if ((i16 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            } else {
                f18 = f16;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i17 |= i25;
            }
            z17 = true;
            if ((i17 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        f17 = IndicatorMaxDistance;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        y2Var2 = indicatorShape;
                    }
                    if (i18 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        f18 = Elevation;
                    }
                } else {
                    if (i29 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        f17 = IndicatorMaxDistance;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        y2Var2 = indicatorShape;
                    }
                    if (i18 != 0) {
                        jH = Color.INSTANCE.h();
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        f18 = Elevation;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1341144489, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:522)");
                }
                f3.m mVarT3 = androidx.compose.foundation.layout.d.t(mVar2, t.v());
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: k2.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.l((p3.c) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarD3 = k3.k.d(mVarT3, (er.l) objE);
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z214 = z19;
                if ((i17 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z215 = z214 | z25 | ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.b(f17)) || (i17 & 3072) == 2048) | ((((3670016 & i17) ^ 1572864) <= 1048576 && rVarH.b(f18)) || (i17 & 1572864) == 1048576);
                if (((57344 & i17) ^ 24576) > 16384) {
                }
                z26 = z215 | z17;
                objE2 = rVarH.E();
                if (z26) {
                    final boolean z216 = z16;
                    final float f212 = f17;
                    final float f213 = f18;
                    final y2 y2Var7 = y2Var2;
                    objE2 = new er.q() { // from class: k2.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.m(vVar, z216, f212, f213, y2Var7, (y0) obj, (v0) obj2, (c5.b) obj3);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    final boolean z217 = z16;
                    final float f214 = f17;
                    final float f215 = f18;
                    final y2 y2Var8 = y2Var2;
                    objE2 = new er.q() { // from class: k2.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.m(vVar, z217, f214, f215, y2Var8, (y0) obj, (v0) obj2, (c5.b) obj3);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarC3 = w0.i.c(m0.a(mVarD3, (er.q) objE2), jH, y2Var2);
                int i38 = ((i17 >> 12) & 7168) | 48;
                w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarC3);
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
                p076m2.r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI3, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                qVar.w(d1.x.f39368a, rVarH, Integer.valueOf(((i38 >> 6) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            mVar3 = mVar2;
            f19 = f17;
            f25 = f18;
            y2Var3 = y2Var2;
            j16 = jH;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.p(this.f107478a, vVar, z15, mVar3, f19, y2Var3, j16, f25, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        jH = j15;
        if ((i15 & 1572864) == 0) {
            f18 = f16;
            if ((i16 & 64) == 0) {
                i27 = PKIFailureInfo.signerNotTrusted;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        } else {
            f18 = f16;
        }
        if ((i15 & 12582912) == 0) {
            if (rVarH.G(qVar)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i17 |= i26;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.W(this)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i17 |= i25;
        }
        z17 = true;
        if ((i17 & 38347923) != 38347922) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVarH.r(z18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i29 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    f17 = IndicatorMaxDistance;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    y2Var2 = indicatorShape;
                }
                if (i18 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    f18 = Elevation;
                }
            } else {
                if (i29 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    f17 = IndicatorMaxDistance;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    y2Var2 = indicatorShape;
                }
                if (i18 != 0) {
                    jH = Color.INSTANCE.h();
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    f18 = Elevation;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-1341144489, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:522)");
            }
            f3.m mVarT4 = androidx.compose.foundation.layout.d.t(mVar2, t.v());
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: k2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.l((p3.c) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD4 = k3.k.d(mVarT4, (er.l) objE);
            if ((i17 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z218 = z19;
            if ((i17 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z219 = z218 | z25 | ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.b(f17)) || (i17 & 3072) == 2048) | ((((3670016 & i17) ^ 1572864) <= 1048576 && rVarH.b(f18)) || (i17 & 1572864) == 1048576);
            if (((57344 & i17) ^ 24576) > 16384) {
            }
            z26 = z219 | z17;
            objE2 = rVarH.E();
            if (z26) {
                final boolean z2110 = z16;
                final float f216 = f17;
                final float f217 = f18;
                final y2 y2Var9 = y2Var2;
                objE2 = new er.q() { // from class: k2.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.m(vVar, z2110, f216, f217, y2Var9, (y0) obj, (v0) obj2, (c5.b) obj3);
                    }
                };
                rVarH.v(objE2);
            } else {
                final boolean z2111 = z16;
                final float f218 = f17;
                final float f219 = f18;
                final y2 y2Var10 = y2Var2;
                objE2 = new er.q() { // from class: k2.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.m(vVar, z2111, f218, f219, y2Var10, (y0) obj, (v0) obj2, (c5.b) obj3);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarC4 = w0.i.c(m0.a(mVarD4, (er.q) objE2), jH, y2Var2);
            int i39 = ((i17 >> 12) & 7168) | 48;
            w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarC4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
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
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI4, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            qVar.w(d1.x.f39368a, rVarH, Integer.valueOf(((i39 >> 6) & 112) | 6));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        mVar3 = mVar2;
        f19 = f17;
        f25 = f18;
        y2Var3 = y2Var2;
        j16 = jH;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(this.f107478a, vVar, z15, mVar3, f19, y2Var3, j16, f25, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final long u(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1441334156, i15, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:472)");
        }
        long onSurfaceVariant = androidx.compose.material3.d.f9816a.a(rVar, 6).getOnSurfaceVariant();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return onSurfaceVariant;
    }

    public final long v(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-80510850, i15, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:462)");
        }
        long surfaceContainerHigh = androidx.compose.material3.d.f9816a.a(rVar, 6).getSurfaceContainerHigh();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return surfaceContainerHigh;
    }

    public final float w() {
        return PositionalThreshold;
    }
}
