package k2;

import h2.h1;
import l2.k0;
import n3.a3;
import n3.m2;
import n3.o2;
import n3.u0;
import n4.ProgressBarRangeInfo;
import n4.f0;
import n4.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.of;
import p046f2.qd;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p3.Stroke;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u0081\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aC\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010&\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001fH\u0002¢\u0006\u0004\b(\u0010)\u001aC\u0010-\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100\"\u001a\u00107\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00106\"\u001a\u0010:\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00106\"\u0014\u0010<\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00100\"\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100\"\u001a\u0010A\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u00106\"\u001a\u0010C\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\bB\u00106¨\u0006E²\u0006\f\u0010D\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"", "isRefreshing", "Lkotlin/Function0;", "Loq/i0;", "onRefresh", "Lf3/m;", "modifier", "Lk2/v;", "state", "Lf3/c;", "contentAlignment", "Lkotlin/Function1;", "Ld1/w;", "indicator", "enabled", "Lc5/h;", "threshold", "content", "o", "(ZLer/a;Lf3/m;Lk2/v;Lf3/c;Ler/q;ZFLer/q;Lm2/r;II)V", "x", "(Lf3/m;ZLk2/v;ZFLer/a;)Lf3/m;", "y", "(Lm2/r;I)Lk2/v;", "Lh2/h1;", "progress", "Landroidx/compose/ui/graphics/Color;", "color", "i", "(Lh2/h1;JLm2/r;I)V", "Lp3/f;", "", "alpha", "Lk2/a;", "values", "Lm3/g;", "arcBounds", "strokeWidth", "u", "(Lp3/f;JFLk2/a;Lm3/g;F)V", "h", "(F)Lk2/a;", "Ln3/m2;", "arrow", "bounds", "t", "(Lp3/f;Ln3/m2;Lm3/g;JFLk2/a;F)V", "a", "F", "StrokeWidth", "b", "ArcRadius", "c", "w", "()F", "SpinnerSize", "d", "v", "SpinnerContainerSize", "e", "ArrowWidth", "f", "ArrowHeight", "g", "getLoaderIndicatorHeight", "LoaderIndicatorHeight", "getLoaderIndicatorWidth", "LoaderIndicatorWidth", "targetAlpha", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f107535a = c5.h.n((float) 2.5d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f107536b = c5.h.n((float) 5.5d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f107537c = c5.h.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f107538d = c5.h.n(40);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f107539e = c5.h.n(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f107540f = c5.h.n(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f107541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f107542h;

    static {
        qd qdVar = qd.f57397a;
        f107541g = qdVar.a();
        f107542h = qdVar.b();
    }

    private static final a h(float f15) {
        float fMax = (Math.max(Math.min(1.0f, f15) - 0.4f, 0.0f) * 5) / 3;
        float fM = lr.m.m(Math.abs(f15) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fM - (((float) Math.pow(fM, 2)) / 4))) * 0.5f;
        float f16 = 360;
        return new a(fPow, fPow * f16, ((0.8f * fMax) + fPow) * f16, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final h1 h1Var, final long j15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1353562852);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(h1Var) : rVarH.G(h1Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.d(j15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1353562852, i16, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:777)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            Object obj = objE;
            if (objE == companion.a()) {
                m2 m2VarA = u0.a();
                m2VarA.i(o2.INSTANCE.a());
                rVarH.v(m2VarA);
                obj = m2VarA;
            }
            final m2 m2Var = (m2) obj;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = x5.d(new er.a() { // from class: k2.p
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(t.j(h1Var));
                    }
                });
                rVarH.v(objE2);
            }
            final f6<Float> f6VarE = u0.f.e(k((f6) objE2), of.b(k0.DefaultEffects, rVarH, 6), 0.0f, null, null, rVarH, 0, 28);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            int i17 = i16 & 14;
            boolean z15 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(h1Var));
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: k2.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.l(h1Var, (i0) obj2);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarT = androidx.compose.foundation.layout.d.t(n4.v.a(companion2, (er.l) objE3), f107537c);
            boolean zW = rVarH.W(f6VarE) | (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(h1Var))) | ((i16 & 112) == 32) | rVarH.G(m2Var);
            Object objE4 = rVarH.E();
            if (zW || objE4 == companion.a()) {
                er.l lVar = new er.l() { // from class: k2.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.m(h1Var, f6VarE, j15, m2Var, (p3.f) obj2);
                    }
                };
                rVarH.v(lVar);
                objE4 = lVar;
            }
            z.b(mVarT, (er.l) objE4, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k2.s
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return t.n(h1Var, j15, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(h1 h1Var) {
        return h1Var.a() >= 1.0f ? 1.0f : 0.3f;
    }

    private static final float k(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(h1 h1Var, i0 i0Var) {
        if (h1Var.a() > 0.0f) {
            f0.q0(i0Var, new ProgressBarRangeInfo(h1Var.a(), lr.m.b(0.0f, 1.0f), 0));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(h1 h1Var, f6 f6Var, long j15, m2 m2Var, p3.f fVar) {
        a aVarH = h(h1Var.a());
        float fFloatValue = ((Number) f6Var.getValue()).floatValue();
        float rotation = aVarH.getRotation();
        long jY2 = fVar.y2();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().i(rotation, jY2);
            float fL2 = fVar.l2(f107536b);
            float f15 = f107535a;
            m3.g gVarB = m3.h.b(m3.l.b(fVar.a()), fL2 + (fVar.l2(f15) / 2.0f));
            u(fVar, j15, fFloatValue, aVarH, gVarB, f15);
            t(fVar, m2Var, gVarB, j15, fFloatValue, aVarH, f15);
            return oq.i0.f148189a;
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(h1 h1Var, long j15, int i15, p076m2.r rVar, int i16) {
        i(h1Var, j15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215  */
    /* JADX WARN: Code duplicated, block: B:136:0x021f  */
    /* JADX WARN: Code duplicated, block: B:139:0x022e  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void o(final boolean z15, final er.a<oq.i0> aVar, f3.m mVar, v vVar, f3.c cVar, er.q<? super d1.w, ? super p076m2.r, ? super Integer, oq.i0> qVar, boolean z16, float f15, final er.q<? super d1.w, ? super p076m2.r, ? super Integer, oq.i0> qVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        v vVar2;
        int i18;
        f3.c cVarO;
        int i19;
        int i25;
        er.q<? super d1.w, ? super p076m2.r, ? super Integer, oq.i0> qVarD;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        boolean z17;
        final float f16;
        final v vVar3;
        final boolean z18;
        final f3.m mVar3;
        final f3.c cVar2;
        final er.q<? super d1.w, ? super p076m2.r, ? super Integer, oq.i0> qVar3;
        d5 d5VarM;
        final v vVarY;
        boolean z19;
        float fW;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i36;
        p076m2.r rVarH = rVar.h(492221845);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i37 = i16 & 4;
        if (i37 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    vVar2 = vVar;
                    int i38 = rVarH.W(vVar2) ? 2048 : 1024;
                    i17 |= i38;
                } else {
                    vVar2 = vVar;
                }
                i17 |= i38;
            } else {
                vVar2 = vVar;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    cVarO = cVar;
                    if (rVarH.W(cVarO)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        qVarD = qVar;
                        if (rVarH.G(qVarD)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.b(f15)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.G(qVar2)) {
                                i36 = 67108864;
                            } else {
                                i36 = 33554432;
                            }
                            i17 |= i36;
                        }
                        if ((i17 & 38347923) != 38347922) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i37 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if ((i16 & 8) != 0) {
                                    vVarY = y(rVarH, 0);
                                    i17 &= -7169;
                                } else {
                                    vVarY = vVar2;
                                }
                                if (i18 != 0) {
                                    cVarO = f3.c.INSTANCE.o();
                                }
                                if (i25 != 0) {
                                    qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                        @Override // er.q
                                        public final Object w(Object obj, Object obj2, Object obj3) {
                                            return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, rVarH, 54);
                                }
                                z19 = i27 == 0 ? z16 : true;
                                if (i29 != 0) {
                                    fW = k.f107501a.w();
                                } else {
                                    fW = f15;
                                }
                            } else {
                                rVarH.O();
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                z19 = z16;
                                fW = f15;
                                vVarY = vVar2;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                            }
                            float f17 = fW;
                            v vVar4 = vVarY;
                            boolean z25 = z19;
                            f3.m mVar4 = mVar2;
                            f3.m mVarX = x(mVar4, z15, vVar4, z25, f17, aVar);
                            mVar2 = mVar4;
                            vVar3 = vVar4;
                            w0 w0VarI = d1.r.i(cVarO, false);
                            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                            e0 e0VarT = rVarH.t();
                            f3.m mVarE = f3.j.e(rVarH, mVarX);
                            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                            aVarB = companion.b();
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
                            int i39 = i17;
                            n6.i(rVarC, w0VarI, companion.d());
                            n6.i(rVarC, e0VarT, companion.f());
                            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                            n6.g(rVarC, companion.a());
                            n6.i(rVarC, mVarE, companion.e());
                            d1.x xVar = d1.x.f39368a;
                            qVar2.w(xVar, rVarH, Integer.valueOf(((i39 >> 21) & 112) | 6));
                            qVarD.w(xVar, rVarH, Integer.valueOf(((i39 >> 12) & 112) | 6));
                            rVarH.x();
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            f16 = f17;
                            z18 = z25;
                        } else {
                            rVarH.O();
                            f16 = f15;
                            vVar3 = vVar2;
                            z18 = z16;
                        }
                        mVar3 = mVar2;
                        cVar2 = cVarO;
                        qVar3 = qVarD;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new er.p() { // from class: k2.n
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 12582912;
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.G(qVar2)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                        }
                        float f18 = fW;
                        v vVar5 = vVarY;
                        boolean z26 = z19;
                        f3.m mVar5 = mVar2;
                        f3.m mVarX2 = x(mVar5, z15, vVar5, z26, f18, aVar);
                        mVar2 = mVar5;
                        vVar3 = vVar5;
                        w0 w0VarI2 = d1.r.i(cVarO, false);
                        int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT2 = rVarH.t();
                        f3.m mVarE2 = f3.j.e(rVarH, mVarX2);
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
                        p076m2.r rVarC2 = n6.c(rVarH);
                        int i310 = i17;
                        n6.i(rVarC2, w0VarI2, companion2.d());
                        n6.i(rVarC2, e0VarT2, companion2.f());
                        n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                        n6.g(rVarC2, companion2.a());
                        n6.i(rVarC2, mVarE2, companion2.e());
                        d1.x xVar2 = d1.x.f39368a;
                        qVar2.w(xVar2, rVarH, Integer.valueOf(((i310 >> 21) & 112) | 6));
                        qVarD.w(xVar2, rVarH, Integer.valueOf(((i310 >> 12) & 112) | 6));
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f16 = f18;
                        z18 = z26;
                    } else {
                        rVarH.O();
                        f16 = f15;
                        vVar3 = vVar2;
                        z18 = z16;
                    }
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    qVar3 = qVarD;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: k2.n
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                qVarD = qVar;
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.G(qVar2)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                        }
                        float f19 = fW;
                        v vVar6 = vVarY;
                        boolean z27 = z19;
                        f3.m mVar6 = mVar2;
                        f3.m mVarX3 = x(mVar6, z15, vVar6, z27, f19, aVar);
                        mVar2 = mVar6;
                        vVar3 = vVar6;
                        w0 w0VarI3 = d1.r.i(cVarO, false);
                        int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT3 = rVarH.t();
                        f3.m mVarE3 = f3.j.e(rVarH, mVarX3);
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
                        p076m2.r rVarC3 = n6.c(rVarH);
                        int i311 = i17;
                        n6.i(rVarC3, w0VarI3, companion3.d());
                        n6.i(rVarC3, e0VarT3, companion3.f());
                        n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                        n6.g(rVarC3, companion3.a());
                        n6.i(rVarC3, mVarE3, companion3.e());
                        d1.x xVar3 = d1.x.f39368a;
                        qVar2.w(xVar3, rVarH, Integer.valueOf(((i311 >> 21) & 112) | 6));
                        qVarD.w(xVar3, rVarH, Integer.valueOf(((i311 >> 12) & 112) | 6));
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f16 = f19;
                        z18 = z27;
                    } else {
                        rVarH.O();
                        f16 = f15;
                        vVar3 = vVar2;
                        z18 = z16;
                    }
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    qVar3 = qVarD;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: k2.n
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f110 = fW;
                    v vVar7 = vVarY;
                    boolean z28 = z19;
                    f3.m mVar7 = mVar2;
                    f3.m mVarX4 = x(mVar7, z15, vVar7, z28, f110, aVar);
                    mVar2 = mVar7;
                    vVar3 = vVar7;
                    w0 w0VarI4 = d1.r.i(cVarO, false);
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT4 = rVarH.t();
                    f3.m mVarE4 = f3.j.e(rVarH, mVarX4);
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
                    p076m2.r rVarC4 = n6.c(rVarH);
                    int i312 = i17;
                    n6.i(rVarC4, w0VarI4, companion4.d());
                    n6.i(rVarC4, e0VarT4, companion4.f());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                    n6.g(rVarC4, companion4.a());
                    n6.i(rVarC4, mVarE4, companion4.e());
                    d1.x xVar4 = d1.x.f39368a;
                    qVar2.w(xVar4, rVarH, Integer.valueOf(((i312 >> 21) & 112) | 6));
                    qVarD.w(xVar4, rVarH, Integer.valueOf(((i312 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f110;
                    z18 = z28;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            cVarO = cVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    qVarD = qVar;
                    if (rVarH.G(qVarD)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.G(qVar2)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                        }
                        float f111 = fW;
                        v vVar8 = vVarY;
                        boolean z29 = z19;
                        f3.m mVar8 = mVar2;
                        f3.m mVarX5 = x(mVar8, z15, vVar8, z29, f111, aVar);
                        mVar2 = mVar8;
                        vVar3 = vVar8;
                        w0 w0VarI5 = d1.r.i(cVarO, false);
                        int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT5 = rVarH.t();
                        f3.m mVarE5 = f3.j.e(rVarH, mVarX5);
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
                        p076m2.r rVarC5 = n6.c(rVarH);
                        int i313 = i17;
                        n6.i(rVarC5, w0VarI5, companion5.d());
                        n6.i(rVarC5, e0VarT5, companion5.f());
                        n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
                        n6.g(rVarC5, companion5.a());
                        n6.i(rVarC5, mVarE5, companion5.e());
                        d1.x xVar5 = d1.x.f39368a;
                        qVar2.w(xVar5, rVarH, Integer.valueOf(((i313 >> 21) & 112) | 6));
                        qVarD.w(xVar5, rVarH, Integer.valueOf(((i313 >> 12) & 112) | 6));
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f16 = f111;
                        z18 = z29;
                    } else {
                        rVarH.O();
                        f16 = f15;
                        vVar3 = vVar2;
                        z18 = z16;
                    }
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    qVar3 = qVarD;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: k2.n
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f112 = fW;
                    v vVar9 = vVarY;
                    boolean z210 = z19;
                    f3.m mVar9 = mVar2;
                    f3.m mVarX6 = x(mVar9, z15, vVar9, z210, f112, aVar);
                    mVar2 = mVar9;
                    vVar3 = vVar9;
                    w0 w0VarI6 = d1.r.i(cVarO, false);
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT6 = rVarH.t();
                    f3.m mVarE6 = f3.j.e(rVarH, mVarX6);
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
                    p076m2.r rVarC6 = n6.c(rVarH);
                    int i314 = i17;
                    n6.i(rVarC6, w0VarI6, companion6.d());
                    n6.i(rVarC6, e0VarT6, companion6.f());
                    n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
                    n6.g(rVarC6, companion6.a());
                    n6.i(rVarC6, mVarE6, companion6.e());
                    d1.x xVar6 = d1.x.f39368a;
                    qVar2.w(xVar6, rVarH, Integer.valueOf(((i314 >> 21) & 112) | 6));
                    qVarD.w(xVar6, rVarH, Integer.valueOf(((i314 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f112;
                    z18 = z210;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            qVarD = qVar;
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f113 = fW;
                    v vVar10 = vVarY;
                    boolean z211 = z19;
                    f3.m mVar10 = mVar2;
                    f3.m mVarX7 = x(mVar10, z15, vVar10, z211, f113, aVar);
                    mVar2 = mVar10;
                    vVar3 = vVar10;
                    w0 w0VarI7 = d1.r.i(cVarO, false);
                    int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT7 = rVarH.t();
                    f3.m mVarE7 = f3.j.e(rVarH, mVarX7);
                    androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
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
                    p076m2.r rVarC7 = n6.c(rVarH);
                    int i315 = i17;
                    n6.i(rVarC7, w0VarI7, companion7.d());
                    n6.i(rVarC7, e0VarT7, companion7.f());
                    n6.i(rVarC7, Integer.valueOf(iHashCode7), companion7.c());
                    n6.g(rVarC7, companion7.a());
                    n6.i(rVarC7, mVarE7, companion7.e());
                    d1.x xVar7 = d1.x.f39368a;
                    qVar2.w(xVar7, rVarH, Integer.valueOf(((i315 >> 21) & 112) | 6));
                    qVarD.w(xVar7, rVarH, Integer.valueOf(((i315 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f113;
                    z18 = z211;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(qVar2)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                }
                float f114 = fW;
                v vVar11 = vVarY;
                boolean z212 = z19;
                f3.m mVar11 = mVar2;
                f3.m mVarX8 = x(mVar11, z15, vVar11, z212, f114, aVar);
                mVar2 = mVar11;
                vVar3 = vVar11;
                w0 w0VarI8 = d1.r.i(cVarO, false);
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT8 = rVarH.t();
                f3.m mVarE8 = f3.j.e(rVarH, mVarX8);
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
                p076m2.r rVarC8 = n6.c(rVarH);
                int i316 = i17;
                n6.i(rVarC8, w0VarI8, companion8.d());
                n6.i(rVarC8, e0VarT8, companion8.f());
                n6.i(rVarC8, Integer.valueOf(iHashCode8), companion8.c());
                n6.g(rVarC8, companion8.a());
                n6.i(rVarC8, mVarE8, companion8.e());
                d1.x xVar8 = d1.x.f39368a;
                qVar2.w(xVar8, rVarH, Integer.valueOf(((i316 >> 21) & 112) | 6));
                qVarD.w(xVar8, rVarH, Integer.valueOf(((i316 >> 12) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f114;
                z18 = z212;
            } else {
                rVarH.O();
                f16 = f15;
                vVar3 = vVar2;
                z18 = z16;
            }
            mVar3 = mVar2;
            cVar2 = cVarO;
            qVar3 = qVarD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                vVar2 = vVar;
                if (rVarH.W(vVar2)) {
                }
                i17 |= i38;
            } else {
                vVar2 = vVar;
            }
            i17 |= i38;
        } else {
            vVar2 = vVar;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                cVarO = cVar;
                if (rVarH.W(cVarO)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    qVarD = qVar;
                    if (rVarH.G(qVarD)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.G(qVar2)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i17 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i16 & 8) != 0) {
                                vVarY = y(rVarH, 0);
                                i17 &= -7169;
                            } else {
                                vVarY = vVar2;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i25 != 0) {
                                qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54);
                            }
                            if (i27 == 0) {
                            }
                            if (i29 != 0) {
                                fW = k.f107501a.w();
                            } else {
                                fW = f15;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                        }
                        float f115 = fW;
                        v vVar12 = vVarY;
                        boolean z213 = z19;
                        f3.m mVar12 = mVar2;
                        f3.m mVarX9 = x(mVar12, z15, vVar12, z213, f115, aVar);
                        mVar2 = mVar12;
                        vVar3 = vVar12;
                        w0 w0VarI9 = d1.r.i(cVarO, false);
                        int iHashCode9 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT9 = rVarH.t();
                        f3.m mVarE9 = f3.j.e(rVarH, mVarX9);
                        androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
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
                        p076m2.r rVarC9 = n6.c(rVarH);
                        int i317 = i17;
                        n6.i(rVarC9, w0VarI9, companion9.d());
                        n6.i(rVarC9, e0VarT9, companion9.f());
                        n6.i(rVarC9, Integer.valueOf(iHashCode9), companion9.c());
                        n6.g(rVarC9, companion9.a());
                        n6.i(rVarC9, mVarE9, companion9.e());
                        d1.x xVar9 = d1.x.f39368a;
                        qVar2.w(xVar9, rVarH, Integer.valueOf(((i317 >> 21) & 112) | 6));
                        qVarD.w(xVar9, rVarH, Integer.valueOf(((i317 >> 12) & 112) | 6));
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f16 = f115;
                        z18 = z213;
                    } else {
                        rVarH.O();
                        f16 = f15;
                        vVar3 = vVar2;
                        z18 = z16;
                    }
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    qVar3 = qVarD;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: k2.n
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 12582912;
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f116 = fW;
                    v vVar13 = vVarY;
                    boolean z214 = z19;
                    f3.m mVar13 = mVar2;
                    f3.m mVarX10 = x(mVar13, z15, vVar13, z214, f116, aVar);
                    mVar2 = mVar13;
                    vVar3 = vVar13;
                    w0 w0VarI10 = d1.r.i(cVarO, false);
                    int iHashCode10 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT10 = rVarH.t();
                    f3.m mVarE10 = f3.j.e(rVarH, mVarX10);
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
                    p076m2.r rVarC10 = n6.c(rVarH);
                    int i318 = i17;
                    n6.i(rVarC10, w0VarI10, companion10.d());
                    n6.i(rVarC10, e0VarT10, companion10.f());
                    n6.i(rVarC10, Integer.valueOf(iHashCode10), companion10.c());
                    n6.g(rVarC10, companion10.a());
                    n6.i(rVarC10, mVarE10, companion10.e());
                    d1.x xVar10 = d1.x.f39368a;
                    qVar2.w(xVar10, rVarH, Integer.valueOf(((i318 >> 21) & 112) | 6));
                    qVarD.w(xVar10, rVarH, Integer.valueOf(((i318 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f116;
                    z18 = z214;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            qVarD = qVar;
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f117 = fW;
                    v vVar14 = vVarY;
                    boolean z215 = z19;
                    f3.m mVar14 = mVar2;
                    f3.m mVarX11 = x(mVar14, z15, vVar14, z215, f117, aVar);
                    mVar2 = mVar14;
                    vVar3 = vVar14;
                    w0 w0VarI11 = d1.r.i(cVarO, false);
                    int iHashCode11 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT11 = rVarH.t();
                    f3.m mVarE11 = f3.j.e(rVarH, mVarX11);
                    androidx.compose.ui.node.c.Companion companion11 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion11.b();
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
                    int i319 = i17;
                    n6.i(rVarC11, w0VarI11, companion11.d());
                    n6.i(rVarC11, e0VarT11, companion11.f());
                    n6.i(rVarC11, Integer.valueOf(iHashCode11), companion11.c());
                    n6.g(rVarC11, companion11.a());
                    n6.i(rVarC11, mVarE11, companion11.e());
                    d1.x xVar11 = d1.x.f39368a;
                    qVar2.w(xVar11, rVarH, Integer.valueOf(((i319 >> 21) & 112) | 6));
                    qVarD.w(xVar11, rVarH, Integer.valueOf(((i319 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f117;
                    z18 = z215;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(qVar2)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                }
                float f118 = fW;
                v vVar15 = vVarY;
                boolean z216 = z19;
                f3.m mVar15 = mVar2;
                f3.m mVarX12 = x(mVar15, z15, vVar15, z216, f118, aVar);
                mVar2 = mVar15;
                vVar3 = vVar15;
                w0 w0VarI12 = d1.r.i(cVarO, false);
                int iHashCode12 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT12 = rVarH.t();
                f3.m mVarE12 = f3.j.e(rVarH, mVarX12);
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
                p076m2.r rVarC12 = n6.c(rVarH);
                int i3110 = i17;
                n6.i(rVarC12, w0VarI12, companion12.d());
                n6.i(rVarC12, e0VarT12, companion12.f());
                n6.i(rVarC12, Integer.valueOf(iHashCode12), companion12.c());
                n6.g(rVarC12, companion12.a());
                n6.i(rVarC12, mVarE12, companion12.e());
                d1.x xVar12 = d1.x.f39368a;
                qVar2.w(xVar12, rVarH, Integer.valueOf(((i3110 >> 21) & 112) | 6));
                qVarD.w(xVar12, rVarH, Integer.valueOf(((i3110 >> 12) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f118;
                z18 = z216;
            } else {
                rVarH.O();
                f16 = f15;
                vVar3 = vVar2;
                z18 = z16;
            }
            mVar3 = mVar2;
            cVar2 = cVarO;
            qVar3 = qVarD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        cVarO = cVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                qVarD = qVar;
                if (rVarH.G(qVarD)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(qVar2)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i16 & 8) != 0) {
                            vVarY = y(rVarH, 0);
                            i17 &= -7169;
                        } else {
                            vVarY = vVar2;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i25 != 0) {
                            qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            fW = k.f107501a.w();
                        } else {
                            fW = f15;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                    }
                    float f119 = fW;
                    v vVar16 = vVarY;
                    boolean z217 = z19;
                    f3.m mVar16 = mVar2;
                    f3.m mVarX13 = x(mVar16, z15, vVar16, z217, f119, aVar);
                    mVar2 = mVar16;
                    vVar3 = vVar16;
                    w0 w0VarI13 = d1.r.i(cVarO, false);
                    int iHashCode13 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT13 = rVarH.t();
                    f3.m mVarE13 = f3.j.e(rVarH, mVarX13);
                    androidx.compose.ui.node.c.Companion companion13 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion13.b();
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
                    int i3111 = i17;
                    n6.i(rVarC13, w0VarI13, companion13.d());
                    n6.i(rVarC13, e0VarT13, companion13.f());
                    n6.i(rVarC13, Integer.valueOf(iHashCode13), companion13.c());
                    n6.g(rVarC13, companion13.a());
                    n6.i(rVarC13, mVarE13, companion13.e());
                    d1.x xVar13 = d1.x.f39368a;
                    qVar2.w(xVar13, rVarH, Integer.valueOf(((i3111 >> 21) & 112) | 6));
                    qVarD.w(xVar13, rVarH, Integer.valueOf(((i3111 >> 12) & 112) | 6));
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f119;
                    z18 = z217;
                } else {
                    rVarH.O();
                    f16 = f15;
                    vVar3 = vVar2;
                    z18 = z16;
                }
                mVar3 = mVar2;
                cVar2 = cVarO;
                qVar3 = qVarD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: k2.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 12582912;
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(qVar2)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                }
                float f1110 = fW;
                v vVar17 = vVarY;
                boolean z218 = z19;
                f3.m mVar17 = mVar2;
                f3.m mVarX14 = x(mVar17, z15, vVar17, z218, f1110, aVar);
                mVar2 = mVar17;
                vVar3 = vVar17;
                w0 w0VarI14 = d1.r.i(cVarO, false);
                int iHashCode14 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT14 = rVarH.t();
                f3.m mVarE14 = f3.j.e(rVarH, mVarX14);
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
                p076m2.r rVarC14 = n6.c(rVarH);
                int i3112 = i17;
                n6.i(rVarC14, w0VarI14, companion14.d());
                n6.i(rVarC14, e0VarT14, companion14.f());
                n6.i(rVarC14, Integer.valueOf(iHashCode14), companion14.c());
                n6.g(rVarC14, companion14.a());
                n6.i(rVarC14, mVarE14, companion14.e());
                d1.x xVar14 = d1.x.f39368a;
                qVar2.w(xVar14, rVarH, Integer.valueOf(((i3112 >> 21) & 112) | 6));
                qVarD.w(xVar14, rVarH, Integer.valueOf(((i3112 >> 12) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f1110;
                z18 = z218;
            } else {
                rVarH.O();
                f16 = f15;
                vVar3 = vVar2;
                z18 = z16;
            }
            mVar3 = mVar2;
            cVar2 = cVarO;
            qVar3 = qVarD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        qVarD = qVar;
        i27 = i16 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.a(z16)) {
                i28 = PKIFailureInfo.badCertTemplate;
            } else {
                i28 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i28;
        }
        i29 = i16 & 128;
        if (i29 != 0) {
            if ((i15 & 12582912) == 0) {
                if (rVarH.b(f15)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(qVar2)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i16 & 8) != 0) {
                        vVarY = y(rVarH, 0);
                        i17 &= -7169;
                    } else {
                        vVarY = vVar2;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i25 != 0) {
                        qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        fW = k.f107501a.w();
                    } else {
                        fW = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
                }
                float f1111 = fW;
                v vVar18 = vVarY;
                boolean z219 = z19;
                f3.m mVar18 = mVar2;
                f3.m mVarX15 = x(mVar18, z15, vVar18, z219, f1111, aVar);
                mVar2 = mVar18;
                vVar3 = vVar18;
                w0 w0VarI15 = d1.r.i(cVarO, false);
                int iHashCode15 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT15 = rVarH.t();
                f3.m mVarE15 = f3.j.e(rVarH, mVarX15);
                androidx.compose.ui.node.c.Companion companion15 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion15.b();
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
                int i3113 = i17;
                n6.i(rVarC15, w0VarI15, companion15.d());
                n6.i(rVarC15, e0VarT15, companion15.f());
                n6.i(rVarC15, Integer.valueOf(iHashCode15), companion15.c());
                n6.g(rVarC15, companion15.a());
                n6.i(rVarC15, mVarE15, companion15.e());
                d1.x xVar15 = d1.x.f39368a;
                qVar2.w(xVar15, rVarH, Integer.valueOf(((i3113 >> 21) & 112) | 6));
                qVarD.w(xVar15, rVarH, Integer.valueOf(((i3113 >> 12) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f1111;
                z18 = z219;
            } else {
                rVarH.O();
                f16 = f15;
                vVar3 = vVar2;
                z18 = z16;
            }
            mVar3 = mVar2;
            cVar2 = cVarO;
            qVar3 = qVarD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: k2.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 12582912;
        if ((i15 & 100663296) == 0) {
            if (rVarH.G(qVar2)) {
                i36 = 67108864;
            } else {
                i36 = 33554432;
            }
            i17 |= i36;
        }
        if ((i17 & 38347923) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 8) != 0) {
                    vVarY = y(rVarH, 0);
                    i17 &= -7169;
                } else {
                    vVarY = vVar2;
                }
                if (i18 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i25 != 0) {
                    qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    fW = k.f107501a.w();
                } else {
                    fW = f15;
                }
            } else {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i16 & 8) != 0) {
                    vVarY = y(rVarH, 0);
                    i17 &= -7169;
                } else {
                    vVarY = vVar2;
                }
                if (i18 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i25 != 0) {
                    qVarD = y2.m.d(419143791, true, new er.q() { // from class: k2.m
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return t.p(vVarY, z15, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    fW = k.f107501a.w();
                } else {
                    fW = f15;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(492221845, i17, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:149)");
            }
            float f1112 = fW;
            v vVar19 = vVarY;
            boolean z2110 = z19;
            f3.m mVar19 = mVar2;
            f3.m mVarX16 = x(mVar19, z15, vVar19, z2110, f1112, aVar);
            mVar2 = mVar19;
            vVar3 = vVar19;
            w0 w0VarI16 = d1.r.i(cVarO, false);
            int iHashCode16 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT16 = rVarH.t();
            f3.m mVarE16 = f3.j.e(rVarH, mVarX16);
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
            p076m2.r rVarC16 = n6.c(rVarH);
            int i3114 = i17;
            n6.i(rVarC16, w0VarI16, companion16.d());
            n6.i(rVarC16, e0VarT16, companion16.f());
            n6.i(rVarC16, Integer.valueOf(iHashCode16), companion16.c());
            n6.g(rVarC16, companion16.a());
            n6.i(rVarC16, mVarE16, companion16.e());
            d1.x xVar16 = d1.x.f39368a;
            qVar2.w(xVar16, rVarH, Integer.valueOf(((i3114 >> 21) & 112) | 6));
            qVarD.w(xVar16, rVarH, Integer.valueOf(((i3114 >> 12) & 112) | 6));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            f16 = f1112;
            z18 = z2110;
        } else {
            rVarH.O();
            f16 = f15;
            vVar3 = vVar2;
            z18 = z16;
        }
        mVar3 = mVar2;
        cVar2 = cVarO;
        qVar3 = qVarD;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(z15, aVar, mVar3, vVar3, cVar2, qVar3, z18, f16, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(v vVar, boolean z15, d1.w wVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(wVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(419143791, i16, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:140)");
            }
            k.f107501a.j(vVar, z15, wVar.d(f3.m.INSTANCE, f3.c.INSTANCE.m()), 0L, 0L, 0.0f, rVar, 1572864, 56);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(boolean z15, er.a aVar, f3.m mVar, v vVar, f3.c cVar, er.q qVar, boolean z16, float f15, er.q qVar2, int i15, int i16, p076m2.r rVar, int i17) {
        o(z15, aVar, mVar, vVar, cVar, qVar, z16, f15, qVar2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void t(p3.f fVar, m2 m2Var, m3.g gVar, long j15, float f15, a aVar, float f16) {
        m2Var.reset();
        m2Var.s(0.0f, 0.0f);
        float f17 = f107539e;
        m2Var.x((fVar.l2(f17) * aVar.getScale()) / 2, fVar.l2(f107540f) * aVar.getScale());
        m2Var.x(fVar.l2(f17) * aVar.getScale(), 0.0f);
        float fMin = ((Math.min(gVar.getRight() - gVar.getLeft(), gVar.getBottom() - gVar.getTop()) / 2.0f) + Float.intBitsToFloat((int) (gVar.g() >> 32))) - ((fVar.l2(f17) * aVar.getScale()) / 2.0f);
        m2Var.m(m3.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gVar.g() & BodyPartID.bodyIdMax)) - fVar.l2(f16))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMin) << 32)));
        float endAngle = aVar.getEndAngle() - fVar.l2(f16);
        long jY2 = fVar.y2();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().i(endAngle, jY2);
            p3.f.e2(fVar, m2Var, j15, f15, new Stroke(fVar.l2(f16), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    private static final void u(p3.f fVar, long j15, float f15, a aVar, m3.g gVar, float f16) {
        p3.f.n0(fVar, j15, aVar.getStartAngle(), aVar.getEndAngle() - aVar.getStartAngle(), false, gVar.n(), gVar.l(), f15, new Stroke(fVar.l2(f16), 0.0f, a3.INSTANCE.a(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final float v() {
        return f107538d;
    }

    public static final float w() {
        return f107537c;
    }

    public static final f3.m x(f3.m mVar, boolean z15, v vVar, boolean z16, float f15, er.a<oq.i0> aVar) {
        return mVar.u(new l(z15, aVar, z16, vVar, f15, null));
    }

    public static final v y(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(318623070, i15, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:731)");
        }
        Object[] objArr = new Object[0];
        b3.x<y, Float> xVarA = y.INSTANCE.a();
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: k2.o
                @Override // er.a
                public final Object a() {
                    return t.z();
                }
            };
            rVar.v(objE);
        }
        y yVar = (y) b3.f.i(objArr, xVarA, (er.a) objE, rVar, MLKEMEngine.KyberPolyBytes);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y z() {
        return new y();
    }
}
