package z1;

import androidx.compose.ui.graphics.Color;
import d1.m3;
import d1.q3;
import d1.r3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0001¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lz1/w;", "offsetProvider", "", "isStartHandle", "Lb5/i;", "direction", "handlesCrossed", "Lc5/k;", "minTouchTargetSize", "", "lineHeight", "Lf3/m;", "modifier", "Loq/i0;", "n", "(Lz1/w;ZLb5/i;ZJFLf3/m;Lm2/r;II)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "o", "(Lf3/m;Ler/a;ZLm2/r;I)V", "x", "(Lf3/m;Ler/a;Z)Lf3/m;", "Lk3/e;", "radius", "Ln3/b2;", "w", "(Lk3/e;F)Ln3/b2;", "positionProvider", "Lf3/c;", "handleReferencePoint", "content", "l", "(Lz1/w;Lf3/c;Ler/p;Lm2/r;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(er.a aVar, boolean z15, n3.b2 b2Var, n3.n1 n1Var, p3.c cVar) {
        cVar.H2();
        if (!((Boolean) aVar.a()).booleanValue()) {
            return oq.i0.f148189a;
        }
        if (z15) {
            long jY2 = cVar.y2();
            p3.d drawContext = cVar.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().h(-1.0f, 1.0f, jY2);
                p3.f.V0(cVar, b2Var, 0L, 0.0f, null, n1Var, 0, 46, null);
            } finally {
                drawContext.f().j();
                drawContext.g(jA);
            }
        } else {
            p3.f.V0(cVar, b2Var, 0L, 0.0f, null, n1Var, 0, 46, null);
        }
        return oq.i0.f148189a;
    }

    public static final void l(final w wVar, final f3.c cVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1090171650);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(wVar) : rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1090171650, i16, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z16 = (i16 & 112) == 32;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.W(wVar))) {
                z15 = true;
            }
            boolean z17 = z16 | z15;
            Object objE = rVarH.E();
            if (z17 || objE == p076m2.r.INSTANCE.a()) {
                objE = new t(cVar, wVar);
                rVarH.v(objE);
            }
            androidx.compose.ui.window.b.a((t) objE, null, new androidx.compose.ui.window.u(false, false, false, (androidx.compose.ui.window.v) null, true, false, 15, (fr.k) null), pVar, rVarH, ((i16 << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(wVar, cVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(w wVar, f3.c cVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        l(wVar, cVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final w wVar, final boolean z15, final b5.i iVar, final boolean z16, long j15, final float f15, final f3.m mVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        long jA;
        p076m2.r rVarH = rVar.h(-466280168);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(wVar) : rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(iVar.ordinal()) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.a(z16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            jA = j15;
            i17 |= ((i16 & 16) == 0 && rVarH.d(jA)) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            jA = j15;
        }
        if ((1572864 & i15) == 0) {
            i17 |= rVarH.W(mVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((533651 & i17) != 533650, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                }
            } else if ((i16 & 16) != 0) {
                jA = c5.k.INSTANCE.a();
                i17 &= -57345;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-466280168, i17, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
            }
            final boolean zF = c1.f(z15, iVar, z16);
            f3.a aVar = f3.a.f58675a;
            f3.c cVarD = zF ? aVar.d() : aVar.c();
            int i18 = i17 & 14;
            boolean zA = ((i17 & 112) == 32) | (i18 == 4 || ((i17 & 8) != 0 && rVarH.G(wVar))) | rVarH.a(zF);
            Object objE = rVarH.E();
            if (zA || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: z1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.q(wVar, z15, zF, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            final f3.m mVarD = n4.v.d(mVar, false, (er.l) objE, 1, null);
            final androidx.compose.ui.platform.f3 f3Var = (androidx.compose.ui.platform.f3) rVarH.N(androidx.compose.ui.platform.g1.u());
            final long j16 = jA;
            l(wVar, cVarD, y2.m.d(1365123137, true, new er.p() { // from class: z1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.r(f3Var, j16, zF, mVarD, wVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, i18 | MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            jA = j16;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final long j17 = jA;
            d5VarM.a(new er.p() { // from class: z1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.v(wVar, z15, iVar, z16, j17, f15, mVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void o(final f3.m mVar, final er.a<Boolean> aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2111672474);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2111672474, i16, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            r3.a(x(androidx.compose.foundation.layout.d.v(mVar, c1.c(), c1.b()), aVar, z15), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(mVar, aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(f3.m mVar, er.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        o(mVar, aVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(w wVar, boolean z15, boolean z16, n4.i0 i0Var) {
        long jA = wVar.a();
        i0Var.e(c1.d(), new SelectionHandleInfo(z15 ? p079n1.q2.SelectionStart : p079n1.q2.SelectionEnd, jA, z16 ? a1.Left : a1.Right, (9223372034707292159L & jA) != 9205357640488583168L, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(androidx.compose.ui.platform.f3 f3Var, final long j15, final boolean z15, final f3.m mVar, final w wVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1365123137, i15, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            p076m2.d0.c(androidx.compose.ui.platform.g1.u().d(f3Var), y2.m.d(1260045569, true, new er.p() { // from class: z1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(j15, z15, mVar, wVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(long j15, boolean z15, f3.m mVar, final w wVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1260045569, i15, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
            }
            if (j15 != 9205357640488583168L) {
                rVar.X(3458246);
                d1.i.e eVarB = z15 ? d1.i.a.f39161a.b() : d1.i.a.f39161a.a();
                f3.m mVarR = androidx.compose.foundation.layout.d.r(mVar, c5.k.j(j15), c5.k.i(j15), 0.0f, 0.0f, 12, null);
                p036e4.w0 w0VarB = m3.b(eVarB, f3.c.INSTANCE.l(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarR);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC = n6.c(rVar);
                n6.i(rVarC, w0VarB, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                q3 q3Var = q3.f39261a;
                f3.m.Companion companion2 = f3.m.INSTANCE;
                boolean zG = rVar.G(wVar);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: z1.g
                        @Override // er.a
                        public final Object a() {
                            return Boolean.valueOf(l.t(wVar));
                        }
                    };
                    rVar.v(objE);
                }
                o(companion2, (er.a) objE, z15, rVar, 6);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(4389176);
                boolean zG2 = rVar.G(wVar);
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: z1.h
                        @Override // er.a
                        public final Object a() {
                            return Boolean.valueOf(l.u(wVar));
                        }
                    };
                    rVar.v(objE2);
                }
                o(mVar, (er.a) objE2, z15, rVar, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(w wVar) {
        return (wVar.a() & 9223372034707292159L) != 9205357640488583168L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(w wVar) {
        return (wVar.a() & 9223372034707292159L) != 9205357640488583168L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(w wVar, boolean z15, b5.i iVar, boolean z16, long j15, float f15, f3.m mVar, int i15, int i16, p076m2.r rVar, int i17) {
        n(wVar, z15, iVar, z16, j15, f15, mVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final n3.b2 w(k3.e eVar, float f15) {
        int iCeil = ((int) Math.ceil(f15)) * 2;
        s sVar = s.f232190a;
        n3.b2 b2VarC = sVar.c();
        n3.h1 h1VarA = sVar.a();
        p3.a aVarB = sVar.b();
        if (b2VarC == null || h1VarA == null || iCeil > b2VarC.l() || iCeil > b2VarC.getHeight()) {
            b2VarC = n3.d2.b(iCeil, iCeil, n3.c2.INSTANCE.a(), false, null, 24, null);
            sVar.f(b2VarC);
            h1VarA = n3.j1.a(b2VarC);
            sVar.d(h1VarA);
        }
        n3.b2 b2Var = b2VarC;
        n3.h1 h1Var = h1VarA;
        if (aVarB == null) {
            aVarB = new p3.a();
            sVar.e(aVarB);
        }
        p3.a aVar = aVarB;
        c5.t layoutDirection = eVar.getLayoutDirection();
        float fL = b2Var.l();
        long jD = m3.k.d((((long) Float.floatToRawIntBits(b2Var.getHeight())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL) << 32));
        p3.a.DrawParams drawParams = aVar.getDrawParams();
        c5.d density = drawParams.getDensity();
        c5.t layoutDirection2 = drawParams.getLayoutDirection();
        n3.h1 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        p3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(eVar);
        drawParams2.k(layoutDirection);
        drawParams2.i(h1Var);
        drawParams2.l(jD);
        h1Var.q();
        p3.f.c2(aVar, Color.INSTANCE.a(), 0L, aVar.a(), 0.0f, null, null, n3.a1.INSTANCE.a(), 58, null);
        p3.f.c2(aVar, n3.o1.d(4278190080L), m3.e.INSTANCE.c(), m3.k.d((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax)), 0.0f, null, null, 0, 120, null);
        p3.f.x2(aVar, n3.o1.d(4278190080L), f15, m3.e.e((((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32)), 0.0f, null, null, 0, 120, null);
        h1Var.j();
        p3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size);
        return b2Var;
    }

    public static final f3.m x(f3.m mVar, final er.a<Boolean> aVar, final boolean z15) {
        return f3.j.c(mVar, null, new er.q() { // from class: z1.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l.y(aVar, z15, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m y(final er.a aVar, final boolean z15, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(-196777734);
        if (p076m2.t.k()) {
            p076m2.t.o(-196777734, i15, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
        }
        final long selectionHandleColor = ((SelectionColors) rVar.N(g3.c())).getSelectionHandleColor();
        boolean zD = rVar.d(selectionHandleColor) | rVar.W(aVar) | rVar.a(z15);
        Object objE = rVar.E();
        if (zD || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: z1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return l.z(selectionHandleColor, aVar, z15, (k3.e) obj);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarC = k3.k.c(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return mVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l z(long j15, final er.a aVar, final boolean z15, k3.e eVar) {
        final n3.b2 b2VarW = w(eVar, Float.intBitsToFloat((int) (eVar.a() >> 32)) / 2.0f);
        final n3.n1 n1VarB = n3.n1.Companion.b(n3.n1.INSTANCE, j15, 0, 2, null);
        return eVar.e(new er.l() { // from class: z1.b
            @Override // er.l
            public final Object b(Object obj) {
                return l.A(aVar, z15, b2VarW, n1VarB, (p3.c) obj);
            }
        });
    }
}
