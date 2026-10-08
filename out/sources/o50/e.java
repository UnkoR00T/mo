package o50;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import c5.h;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import w0.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\n\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lo50/a;", "smallCardData", "", "isVertical", "Loq/i0;", "d", "(Lo50/a;ZLm2/r;II)V", "Lo50/f;", "Landroidx/compose/ui/graphics/Color;", "j", "(Lo50/f;Lm2/r;I)J", "i", "Lc5/h;", "a", "F", "componentWidth", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f142470a = h.n(80);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SmallCardData f142471a;

        a(SmallCardData smallCardData) {
            this.f142471a = smallCardData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1242378410);
            if (t.k()) {
                t.o(-1242378410, i15, -1, "pl.gov.coi.common.ui.ds.smallcard.SmallCard.<anonymous>.<anonymous> (SmallCard.kt:87)");
            }
            long j15 = e.j(this.f142471a.getSmallCardState(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return j15;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f142472a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1086602132);
            if (t.k()) {
                t.o(1086602132, i15, -1, "pl.gov.coi.common.ui.ds.smallcard.SmallCard.<anonymous>.<anonymous> (SmallCard.kt:88)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x021b  */
    /* JADX WARN: Code duplicated, block: B:78:0x022d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0252  */
    /* JADX WARN: Code duplicated, block: B:84:0x0297  */
    /* JADX WARN: Code duplicated, block: B:86:0x029d  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x021b, please report this as an issue */
    public static final void d(final SmallCardData smallCardData, boolean z15, r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        boolean z17;
        d5 d5VarM;
        boolean z18;
        Object objE;
        r.Companion companion;
        m.Companion companion2;
        m mVarY;
        Object objE2;
        boolean z19;
        Object objE3;
        er.a<androidx.compose.ui.node.c> aVarB;
        m mVarH;
        String testTag;
        String str;
        String testTag2;
        String str2;
        Label contentDescription;
        r rVarH = rVar.h(-1999249773);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(smallCardData) : rVarH.G(smallCardData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (t.k()) {
                    t.o(-1999249773, i17, -1, "pl.gov.coi.common.ui.ds.smallcard.SmallCard (SmallCard.kt:45)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = k.a();
                    rVarH.v(objE);
                }
                l lVar = (l) objE;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                f3.c.b bVarG = f3.c.INSTANCE.g();
                companion2 = m.INSTANCE;
                if (z18) {
                    mVarY = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
                } else {
                    mVarY = androidx.compose.foundation.layout.d.y(companion2, f142470a);
                }
                m mVarU = companion2.u(mVarY);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: o50.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e.e((i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarD = v.d(mVarU, false, (er.l) objE2, 1, null);
                if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(smallCardData))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE3 = rVarH.E();
                if (z19 || objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: o50.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e.f(smallCardData, (i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                m mVarL = androidx.compose.foundation.b.l(v.d(mVarD, false, (er.l) objE3, 1, null), lVar, null, false, null, n4.l.j(n4.l.INSTANCE.a()), smallCardData.d(), 12, null);
                w0 w0VarA = e0.a(i.f39152a.k(), bVarG, rVarH, 48);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarL);
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
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                if (smallCardData.getHasBorder()) {
                    rVarH.X(-134585819);
                    mVarH = o.h(companion2, k70.a.f108864a.b(rVarH, k70.a.f108865b).getStrokeWidth(), i(smallCardData.getSmallCardState(), rVarH, 0), l1.h.i());
                    rVarH.R();
                } else {
                    rVarH.X(-134363549);
                    rVarH.R();
                    mVarH = companion2;
                }
                m mVarU2 = companion2.u(mVarH);
                d40.i.f fVar = d40.i.f.f39709e;
                m mVarF = s.F(s.o(mVarU2, f6VarA, h.j(fVar.getDimension())), lVar, fVar.getDimension(), rVarH, 48, 0);
                testTag = smallCardData.getTestTag();
                if (testTag != null) {
                    str = testTag + "Icon";
                } else {
                    str = null;
                }
                d40.h.f(mVarF, new d40.b.a(str, smallCardData.getIconResId(), fVar, new a(smallCardData), d40.i.C0865i.f39712e, b.f142472a, d40.a.C0863a.f39673a, Label.INSTANCE.c(), null, 256, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i19).getSpacing100()), rVarH, 0);
                testTag2 = smallCardData.getTestTag();
                if (testTag2 != null) {
                    str2 = testTag2 + "Text";
                } else {
                    str2 = null;
                }
                Label title = smallCardData.getTitle();
                TextStyle textStyleF = aVar.f(rVarH, i19).f();
                long jI = aVar.a(rVarH, i19).getNeutral().i();
                int iA = b5.j.INSTANCE.a();
                contentDescription = smallCardData.getContentDescription();
                if (contentDescription == null) {
                    contentDescription = smallCardData.getTitle();
                }
                j70.h.g(null, str2, title, contentDescription, null, jI, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 28831697);
                rVarH = rVarH;
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                z16 = z18;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: o50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.g(smallCardData, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i17 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (t.k()) {
                t.o(-1999249773, i17, -1, "pl.gov.coi.common.ui.ds.smallcard.SmallCard (SmallCard.kt:45)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar2 = (l) objE;
            f6<Boolean> f6VarA2 = b1.f.a(lVar2, rVarH, 6);
            f3.c.b bVarG2 = f3.c.INSTANCE.g();
            companion2 = m.INSTANCE;
            if (z18) {
                mVarY = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            } else {
                mVarY = androidx.compose.foundation.layout.d.y(companion2, f142470a);
            }
            m mVarU3 = companion2.u(mVarY);
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: o50.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.e((i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarD2 = v.d(mVarU3, false, (er.l) objE2, 1, null);
            if ((i17 & 14) != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            objE3 = rVarH.E();
            if (z19) {
                objE3 = new er.l() { // from class: o50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.f(smallCardData, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: o50.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.f(smallCardData, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarL2 = androidx.compose.foundation.b.l(v.d(mVarD2, false, (er.l) objE3, 1, null), lVar2, null, false, null, n4.l.j(n4.l.INSTANCE.a()), smallCardData.d(), 12, null);
            w0 w0VarA2 = e0.a(i.f39152a.k(), bVarG2, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarL2);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            if (smallCardData.getHasBorder()) {
                rVarH.X(-134585819);
                mVarH = o.h(companion2, k70.a.f108864a.b(rVarH, k70.a.f108865b).getStrokeWidth(), i(smallCardData.getSmallCardState(), rVarH, 0), l1.h.i());
                rVarH.R();
            } else {
                rVarH.X(-134363549);
                rVarH.R();
                mVarH = companion2;
            }
            m mVarU4 = companion2.u(mVarH);
            d40.i.f fVar2 = d40.i.f.f39709e;
            m mVarF2 = s.F(s.o(mVarU4, f6VarA2, h.j(fVar2.getDimension())), lVar2, fVar2.getDimension(), rVarH, 48, 0);
            testTag = smallCardData.getTestTag();
            if (testTag != null) {
                str = testTag + "Icon";
            } else {
                str = null;
            }
            d40.h.f(mVarF2, new d40.b.a(str, smallCardData.getIconResId(), fVar2, new a(smallCardData), d40.i.C0865i.f39712e, b.f142472a, d40.a.C0863a.f39673a, Label.INSTANCE.c(), null, 256, null), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
            k70.a aVar2 = k70.a.f108864a;
            int i110 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i110).getSpacing100()), rVarH, 0);
            testTag2 = smallCardData.getTestTag();
            if (testTag2 != null) {
                str2 = testTag2 + "Text";
            } else {
                str2 = null;
            }
            Label title2 = smallCardData.getTitle();
            TextStyle textStyleF2 = aVar2.f(rVarH, i110).f();
            long jI2 = aVar2.a(rVarH, i110).getNeutral().i();
            int iA2 = b5.j.INSTANCE.a();
            contentDescription = smallCardData.getContentDescription();
            if (contentDescription == null) {
                contentDescription = smallCardData.getTitle();
            }
            j70.h.g(null, str2, title2, contentDescription, null, jI2, 0L, null, null, null, 0L, null, b5.j.h(iA2), 0L, 0, false, 0, 0, null, textStyleF2, null, null, false, false, null, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 28831697);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            z16 = z18;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: o50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(smallCardData, z16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(SmallCardData smallCardData, i0 i0Var) {
        String testTag = smallCardData.getTestTag();
        if (testTag == null) {
            testTag = smallCardData.getTitle().getTag();
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(SmallCardData smallCardData, boolean z15, int i15, int i16, r rVar, int i17) {
        d(smallCardData, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final long i(f fVar, r rVar, int i15) {
        long jM20unboximpl;
        if (t.k()) {
            t.o(-44761722, i15, -1, "pl.gov.coi.common.ui.ds.smallcard.getBorderColorFromState (SmallCard.kt:115)");
        }
        if (fr.t.c(fVar, f.c.f142478a)) {
            rVar.X(-66338355);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            rVar.R();
        } else if (fr.t.c(fVar, f.b.f142477a)) {
            rVar.X(-66336302);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            if (!(fVar instanceof f.Custom)) {
                rVar.X(-66340180);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-66334757);
            jM20unboximpl = ((f.Custom) fVar).a().B(rVar, 0).m20unboximpl();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jM20unboximpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(f fVar, r rVar, int i15) {
        long jM20unboximpl;
        if (t.k()) {
            t.o(1574260313, i15, -1, "pl.gov.coi.common.ui.ds.smallcard.getIconColorFromState (SmallCard.kt:108)");
        }
        if (fr.t.c(fVar, f.c.f142478a)) {
            rVar.X(1035676064);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            rVar.R();
        } else if (fr.t.c(fVar, f.b.f142477a)) {
            rVar.X(1035678117);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            if (!(fVar instanceof f.Custom)) {
                rVar.X(1035674237);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(1035679660);
            jM20unboximpl = ((f.Custom) fVar).b().B(rVar, 0).m20unboximpl();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jM20unboximpl;
    }
}
