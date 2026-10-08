package d40;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.x;
import er.l;
import er.p;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p012a2.h2;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.y;
import w0.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/m;", "modifier", "Ld40/b;", "data", "", "invisibleToUser", "Loq/i0;", "f", "(Lf3/m;Ld40/b;ZLm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    /* JADX WARN: Code duplicated, block: B:100:0x026c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0271  */
    /* JADX WARN: Code duplicated, block: B:104:0x028b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0291  */
    /* JADX WARN: Code duplicated, block: B:109:0x029c  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0247  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    public static final void f(m mVar, final b bVar, boolean z15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        boolean z16;
        boolean z17;
        final m mVar3;
        final boolean z18;
        d5 d5VarM;
        m mVar4;
        boolean z19;
        final Context context;
        Object objE;
        r.Companion companion;
        int i18;
        boolean z25;
        boolean zG;
        Object objE2;
        Label contentDescription;
        String text;
        r rVar2;
        int i19;
        m mVarO;
        er.a<androidx.compose.ui.node.c> aVarB;
        p<r, Integer, Color> pVarB;
        Color colorM0boximpl;
        long jH;
        b.a aVar;
        final long jM20unboximpl;
        m mVarA;
        boolean z26;
        boolean zD;
        Object objE3;
        Object objE4;
        r rVarH = rVar.h(-1381372319);
        int i25 = i16 & 1;
        if (i25 != 0) {
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
            i17 |= rVarH.W(bVar) ? 32 : 16;
        }
        int i26 = i16 & 4;
        if (i26 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i26 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-1381372319, i17, -1, "pl.gov.coi.common.ui.ds.custom.icon.Icon (Icon.kt:30)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                m mVarA2 = k3.a.a(mVar4, bVar.getIconState().getAlphaValue());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new l() { // from class: d40.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.g((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD = v.d(mVarA2, false, (l) objE, 1, null);
                i18 = i17 & 112;
                if (i18 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zG = z25 | rVarH.G(context);
                objE2 = rVarH.E();
                if (zG || objE2 == companion.a()) {
                    objE2 = new l() { // from class: d40.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.h(bVar, context, (i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarD2 = v.d(mVarD, false, (l) objE2, 1, null);
                if (z19) {
                    rVarH.X(1914303706);
                    m.Companion companion2 = m.INSTANCE;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = new l() { // from class: d40.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.i((i0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    mVarO = v.d(companion2, false, (l) objE4, 1, null);
                    rVarH.R();
                    i19 = i18;
                    rVar2 = rVarH;
                } else {
                    rVarH.X(1914381857);
                    m.Companion companion3 = m.INSTANCE;
                    contentDescription = bVar.getContentDescription();
                    if (contentDescription != null) {
                        text = contentDescription.getText();
                    } else {
                        text = null;
                    }
                    rVar2 = rVarH;
                    i19 = i18;
                    mVarO = t70.i.O(companion3, text, false, null, rVar2, 6, 6);
                    rVar2.R();
                }
                m mVarU = mVarD2.u(mVarO);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT = rVar2.t();
                m mVarE = f3.j.e(rVar2, mVarU);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
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
                n6.i(rVarC, w0VarI, companion4.d());
                n6.i(rVarC, e0VarT, companion4.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
                n6.g(rVarC, companion4.a());
                n6.i(rVarC, mVarE, companion4.e());
                x xVar = x.f39368a;
                if (bVar instanceof b.a) {
                    rVar2.X(776370949);
                    aVar = (b.a) bVar;
                    jM20unboximpl = aVar.g().B(rVar2, 0).m20unboximpl();
                    mVarA = m.INSTANCE;
                    m mVarT = androidx.compose.foundation.layout.d.t(mVarA, aVar.getBackgroundSize().getDimension());
                    if (aVar.getBackgroundShape() instanceof a.b) {
                        rVar2.X(776586430);
                        mVarA = k3.f.a(mVarA, ((a.b) aVar.getBackgroundShape()).a().B(rVar2, 0));
                        rVar2.R();
                    } else {
                        rVar2.X(776663713);
                        rVar2.R();
                    }
                    m mVarU2 = mVarT.u(mVarA);
                    if (i19 == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zD = rVar2.d(jM20unboximpl) | z26;
                    objE3 = rVar2.E();
                    if (zD || objE3 == companion.a()) {
                        objE3 = new l() { // from class: d40.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.j(bVar, jM20unboximpl, (p3.f) obj);
                            }
                        };
                        rVar2.v(objE3);
                    }
                    z.b(mVarU2, (l) objE3, rVar2, 0);
                } else {
                    rVar2.X(774496007);
                }
                rVar2.R();
                m mVarV = androidx.compose.foundation.layout.d.v(m.INSTANCE, bVar.getIconSize().getWidth(), bVar.getIconSize().getHeight());
                androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(bVar.getIconResId(), rVar2, 0);
                pVarB = bVar.b();
                if (pVarB == null) {
                    rVar2.X(777332382);
                    rVar2.R();
                    colorM0boximpl = null;
                } else {
                    rVar2.X(994906563);
                    long jM20unboximpl2 = pVarB.B(rVar2, 0).m20unboximpl();
                    rVar2.R();
                    colorM0boximpl = Color.m0boximpl(jM20unboximpl2);
                }
                if (colorM0boximpl != null) {
                    jH = colorM0boximpl.m20unboximpl();
                } else {
                    jH = Color.INSTANCE.h();
                }
                rVarH = rVar2;
                h2.c(aVarC, null, mVarV, jH, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: d40.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.k(mVar3, bVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i25 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i26 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-1381372319, i17, -1, "pl.gov.coi.common.ui.ds.custom.icon.Icon (Icon.kt:30)");
            }
            context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            m mVarA3 = k3.a.a(mVar4, bVar.getIconState().getAlphaValue());
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l() { // from class: d40.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.g((i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD3 = v.d(mVarA3, false, (l) objE, 1, null);
            i18 = i17 & 112;
            if (i18 == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            zG = z25 | rVarH.G(context);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new l() { // from class: d40.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.h(bVar, context, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new l() { // from class: d40.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.h(bVar, context, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarD4 = v.d(mVarD3, false, (l) objE2, 1, null);
            if (z19) {
                rVarH.X(1914303706);
                m.Companion companion5 = m.INSTANCE;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new l() { // from class: d40.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.i((i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                mVarO = v.d(companion5, false, (l) objE4, 1, null);
                rVarH.R();
                i19 = i18;
                rVar2 = rVarH;
            } else {
                rVarH.X(1914381857);
                m.Companion companion6 = m.INSTANCE;
                contentDescription = bVar.getContentDescription();
                if (contentDescription != null) {
                    text = contentDescription.getText();
                } else {
                    text = null;
                }
                rVar2 = rVarH;
                i19 = i18;
                mVarO = t70.i.O(companion6, text, false, null, rVar2, 6, 6);
                rVar2.R();
            }
            m mVarU3 = mVarD4.u(mVarO);
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT2 = rVar2.t();
            m mVarE2 = f3.j.e(rVar2, mVarU3);
            androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion7.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI2, companion7.d());
            n6.i(rVarC2, e0VarT2, companion7.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion7.c());
            n6.g(rVarC2, companion7.a());
            n6.i(rVarC2, mVarE2, companion7.e());
            x xVar2 = x.f39368a;
            if (bVar instanceof b.a) {
                rVar2.X(776370949);
                aVar = (b.a) bVar;
                jM20unboximpl = aVar.g().B(rVar2, 0).m20unboximpl();
                mVarA = m.INSTANCE;
                m mVarT2 = androidx.compose.foundation.layout.d.t(mVarA, aVar.getBackgroundSize().getDimension());
                if (aVar.getBackgroundShape() instanceof a.b) {
                    rVar2.X(776586430);
                    mVarA = k3.f.a(mVarA, ((a.b) aVar.getBackgroundShape()).a().B(rVar2, 0));
                    rVar2.R();
                } else {
                    rVar2.X(776663713);
                    rVar2.R();
                }
                m mVarU4 = mVarT2.u(mVarA);
                if (i19 == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zD = rVar2.d(jM20unboximpl) | z26;
                objE3 = rVar2.E();
                if (zD) {
                    objE3 = new l() { // from class: d40.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.j(bVar, jM20unboximpl, (p3.f) obj);
                        }
                    };
                    rVar2.v(objE3);
                } else {
                    objE3 = new l() { // from class: d40.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.j(bVar, jM20unboximpl, (p3.f) obj);
                        }
                    };
                    rVar2.v(objE3);
                }
                z.b(mVarU4, (l) objE3, rVar2, 0);
            } else {
                rVar2.X(774496007);
            }
            rVar2.R();
            m mVarV2 = androidx.compose.foundation.layout.d.v(m.INSTANCE, bVar.getIconSize().getWidth(), bVar.getIconSize().getHeight());
            androidx.compose.ui.graphics.painter.a aVarC2 = l4.c.c(bVar.getIconResId(), rVar2, 0);
            pVarB = bVar.b();
            if (pVarB == null) {
                rVar2.X(777332382);
                rVar2.R();
                colorM0boximpl = null;
            } else {
                rVar2.X(994906563);
                long jM20unboximpl3 = pVarB.B(rVar2, 0).m20unboximpl();
                rVar2.R();
                colorM0boximpl = Color.m0boximpl(jM20unboximpl3);
            }
            if (colorM0boximpl != null) {
                jH = colorM0boximpl.m20unboximpl();
            } else {
                jH = Color.INSTANCE.h();
            }
            rVarH = rVar2;
            h2.c(aVarC2, null, mVarV2, jH, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
            z18 = z19;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d40.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(mVar3, bVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(b bVar, Context context, i0 i0Var) {
        String testTag = bVar.getTestTag();
        if (testTag == null) {
            testTag = "icon" + y.a(Integer.valueOf(bVar.getIconResId()), context);
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(b bVar, long j15, p3.f fVar) {
        a backgroundShape = ((b.a) bVar).getBackgroundShape();
        if (fr.t.c(backgroundShape, a.C0863a.f39673a)) {
            p3.f.x2(fVar, j15, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        } else {
            if (!fr.t.c(backgroundShape, a.c.f39675a) && !(backgroundShape instanceof a.b)) {
                throw new oq.p();
            }
            p3.f.w2(fVar, j15, 0L, 0L, 0L, null, 0.0f, null, 0, 254, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(m mVar, b bVar, boolean z15, int i15, int i16, r rVar, int i17) {
        f(mVar, bVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
