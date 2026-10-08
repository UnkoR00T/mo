package r50;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.q3;
import d1.x;
import d40.h;
import d40.i;
import er.l;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import w0.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\rH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lr50/a;", "data", "", "ignoreForAccessibility", "", "zIndex", "accessibilityAddStatusPrefix", "Loq/i0;", "f", "(Lr50/a;ZLjava/lang/Float;ZLm2/r;II)V", "Lr50/a$a;", "d", "(Lr50/a$a;Lm2/r;I)V", "Lr50/g;", "", "m", "(Lr50/g;)I", "Landroidx/compose/ui/graphics/Color;", "l", "(Lr50/g;Lm2/r;I)J", "Lr50/f;", "k", "(Lr50/f;Lm2/r;I)J", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r50.a.WithDot f171890a;

        a(r50.a.WithDot withDot) {
            this.f171890a = withDot;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1726751563);
            if (t.k()) {
                t.o(-1726751563, i15, -1, "pl.gov.coi.common.ui.ds.statusbadge.DotIcon.<anonymous>.<anonymous> (StatusBadge.kt:113)");
            }
            long jK = e.k(this.f171890a.getStatus(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jK;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r50.a f171891a;

        b(r50.a aVar) {
            this.f171891a = aVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1482479760);
            if (t.k()) {
                t.o(1482479760, i15, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge.<anonymous>.<anonymous> (StatusBadge.kt:75)");
            }
            long jL = e.l(((r50.a.WithIcon) this.f171891a).getStatus(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jL;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f171893b;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.INFORMATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.NOTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.MINUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f171892a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.INFORMATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[f.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[f.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f171893b = iArr2;
        }
    }

    public static final void d(final r50.a.WithDot withDot, r rVar, final int i15) {
        int i16;
        String str;
        r rVarH = rVar.h(763297346);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(withDot) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(763297346, i16, -1, "pl.gov.coi.common.ui.ds.statusbadge.DotIcon (StatusBadge.kt:103)");
            }
            m mVarT = androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarT);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            String testTag = withDot.getTestTag();
            if (testTag != null) {
                str = testTag + "Icon";
            } else {
                str = null;
            }
            h.f(null, new d40.b.C0864b(str, jz.a.R1, i.m.f39716e, new a(withDot), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: r50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.e(withDot, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(r50.a.WithDot withDot, int i15, r rVar, int i16) {
        d(withDot, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0276  */
    /* JADX WARN: Code duplicated, block: B:102:0x028a  */
    /* JADX WARN: Code duplicated, block: B:105:0x02de  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0302  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x023d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0250  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x01d9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x023d, please report this as an issue */
    public static final void f(final r50.a aVar, boolean z15, Float f15, boolean z16, r rVar, final int i15, final int i16) {
        int i17;
        boolean z17;
        int i18;
        Float f16;
        int i19;
        int i25;
        boolean z18;
        int i26;
        boolean z19;
        final boolean z25;
        final Float f17;
        final boolean z26;
        d5 d5VarM;
        Float f18;
        boolean z27;
        m mVarN;
        Object objE;
        m mVarC;
        m mVarA;
        k70.a aVar2;
        int i27;
        er.a<androidx.compose.ui.node.c> aVarB;
        String testTag;
        String str;
        TextStyle textStyleF;
        String testTag2;
        String str2;
        r rVarH = rVar.h(-954406541);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i28 = i16 & 2;
        if (i28 == 0) {
            if ((i15 & 48) == 0) {
                z17 = z15;
                i17 |= rVarH.a(z17) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    f16 = f15;
                    if (rVarH.W(f16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        z18 = z16;
                        if (rVarH.a(z18)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i17 & 1171) != 1170) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        if (i28 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            f18 = null;
                        } else {
                            f18 = f16;
                        }
                        if (i25 != 0) {
                            z27 = true;
                        } else {
                            z27 = z18;
                        }
                        if (t.k()) {
                            t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                        }
                        if (aVar.getWithBorder()) {
                            rVarH.X(-41553942);
                            m.Companion companion = m.INSTANCE;
                            k70.a aVar3 = k70.a.f108864a;
                            int i29 = k70.a.f108865b;
                            mVarN = a3.n(w0.i.c(o.h(companion, aVar3.b(rVarH, i29).getStrokeWidth(), aVar3.a(rVarH, i29).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar3.e(rVarH, i29).getRadius300()), aVar3.a(rVarH, i29).getSurface().a(), aVar3.e(rVarH, i29).getRadius300()), aVar3.b(rVarH, i29).getSpacing100());
                            rVarH.R();
                        } else {
                            rVarH.X(-41204355);
                            rVarH.R();
                            mVarN = m.INSTANCE;
                        }
                        if (z17) {
                            rVarH.X(-41105775);
                            rVarH.R();
                            mVarC = m.INSTANCE;
                        } else {
                            rVarH.X(-41068885);
                            m.Companion companion2 = m.INSTANCE;
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: r50.c
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return e.g((n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            mVarC = v.c(companion2, true, (l) objE);
                            rVarH.R();
                        }
                        m mVarU = mVarN.u(mVarC);
                        if (f18 != null) {
                            mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                        } else {
                            mVarA = m.INSTANCE;
                        }
                        m mVarU2 = mVarU.u(mVarA);
                        d1.i iVar = d1.i.f39152a;
                        aVar2 = k70.a.f108864a;
                        i27 = k70.a.f108865b;
                        w0 w0VarB = m3.b(iVar.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT = rVarH.t();
                        m mVarE = j.e(rVarH, mVarU2);
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
                        n6.i(rVarC, w0VarB, companion3.d());
                        n6.i(rVarC, e0VarT, companion3.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                        n6.g(rVarC, companion3.a());
                        n6.i(rVarC, mVarE, companion3.e());
                        q3 q3Var = q3.f39261a;
                        if (aVar instanceof r50.a.WithIcon) {
                            rVarH.X(1036405802);
                            r50.a.WithIcon withIcon = (r50.a.WithIcon) aVar;
                            testTag2 = withIcon.getTestTag();
                            if (testTag2 != null) {
                                str2 = testTag2 + "Icon";
                            } else {
                                str2 = null;
                            }
                            h.f(null, new d40.b.C0864b(str2, m(withIcon.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                            rVarH.R();
                        } else {
                            if (aVar instanceof r50.a.WithDot) {
                                rVarH.X(1036404285);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1036416803);
                            d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                            rVarH.R();
                        }
                        String strA = aVar.a(z27);
                        testTag = aVar.getTestTag();
                        if (testTag != null) {
                            str = testTag + "Text";
                        } else {
                            str = null;
                        }
                        int maxLines = aVar.getMaxLines();
                        Label label = aVar.getLabel();
                        long jI = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                        textStyleF = aVar.getWithBorder() ? aVar2.f(rVarH, i27).f() : null;
                        if (textStyleF == null) {
                            rVarH.X(1036431294);
                            textStyleF = aVar2.f(rVarH, i27).a();
                            rVarH.R();
                        } else {
                            rVarH.X(1036428349);
                            rVarH.R();
                        }
                        boolean z28 = z27;
                        j70.h.g(null, str, label, mx.b.b(strA, ""), null, jI, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                        rVarH = rVarH;
                        rVarH.x();
                        if (t.k()) {
                            t.n();
                        }
                        boolean z29 = z17;
                        z26 = z28;
                        z25 = z29;
                        f17 = f18;
                    } else {
                        rVarH.O();
                        z25 = z17;
                        f17 = f16;
                        z26 = z18;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: r50.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                z18 = z16;
                if ((i17 & 1171) != 1170) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i28 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        f18 = null;
                    } else {
                        f18 = f16;
                    }
                    if (i25 != 0) {
                        z27 = true;
                    } else {
                        z27 = z18;
                    }
                    if (t.k()) {
                        t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                    }
                    if (aVar.getWithBorder()) {
                        rVarH.X(-41553942);
                        m.Companion companion4 = m.INSTANCE;
                        k70.a aVar4 = k70.a.f108864a;
                        int i210 = k70.a.f108865b;
                        mVarN = a3.n(w0.i.c(o.h(companion4, aVar4.b(rVarH, i210).getStrokeWidth(), aVar4.a(rVarH, i210).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar4.e(rVarH, i210).getRadius300()), aVar4.a(rVarH, i210).getSurface().a(), aVar4.e(rVarH, i210).getRadius300()), aVar4.b(rVarH, i210).getSpacing100());
                        rVarH.R();
                    } else {
                        rVarH.X(-41204355);
                        rVarH.R();
                        mVarN = m.INSTANCE;
                    }
                    if (z17) {
                        rVarH.X(-41105775);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    } else {
                        rVarH.X(-41068885);
                        m.Companion companion5 = m.INSTANCE;
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: r50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return e.g((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarC = v.c(companion5, true, (l) objE);
                        rVarH.R();
                    }
                    m mVarU3 = mVarN.u(mVarC);
                    if (f18 != null) {
                        mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                    } else {
                        mVarA = m.INSTANCE;
                    }
                    m mVarU4 = mVarU3.u(mVarA);
                    d1.i iVar2 = d1.i.f39152a;
                    aVar2 = k70.a.f108864a;
                    i27 = k70.a.f108865b;
                    w0 w0VarB2 = m3.b(iVar2.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = j.e(rVarH, mVarU4);
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
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarB2, companion6.d());
                    n6.i(rVarC2, e0VarT2, companion6.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
                    n6.g(rVarC2, companion6.a());
                    n6.i(rVarC2, mVarE2, companion6.e());
                    q3 q3Var2 = q3.f39261a;
                    if (aVar instanceof r50.a.WithIcon) {
                        rVarH.X(1036405802);
                        r50.a.WithIcon withIcon2 = (r50.a.WithIcon) aVar;
                        testTag2 = withIcon2.getTestTag();
                        if (testTag2 != null) {
                            str2 = testTag2 + "Icon";
                        } else {
                            str2 = null;
                        }
                        h.f(null, new d40.b.C0864b(str2, m(withIcon2.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                        rVarH.R();
                    } else {
                        if (aVar instanceof r50.a.WithDot) {
                            rVarH.X(1036404285);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1036416803);
                        d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                        rVarH.R();
                    }
                    String strA2 = aVar.a(z27);
                    testTag = aVar.getTestTag();
                    if (testTag != null) {
                        str = testTag + "Text";
                    } else {
                        str = null;
                    }
                    int maxLines2 = aVar.getMaxLines();
                    Label label2 = aVar.getLabel();
                    long jI2 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                    if (aVar.getWithBorder()) {
                    }
                    if (textStyleF == null) {
                        rVarH.X(1036431294);
                        textStyleF = aVar2.f(rVarH, i27).a();
                        rVarH.R();
                    } else {
                        rVarH.X(1036428349);
                        rVarH.R();
                    }
                    boolean z210 = z27;
                    j70.h.g(null, str, label2, mx.b.b(strA2, ""), null, jI2, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines2, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                    rVarH = rVarH;
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    boolean z211 = z17;
                    z26 = z210;
                    z25 = z211;
                    f17 = f18;
                } else {
                    rVarH.O();
                    z25 = z17;
                    f17 = f16;
                    z26 = z18;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: r50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            f16 = f15;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i28 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        f18 = null;
                    } else {
                        f18 = f16;
                    }
                    if (i25 != 0) {
                        z27 = true;
                    } else {
                        z27 = z18;
                    }
                    if (t.k()) {
                        t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                    }
                    if (aVar.getWithBorder()) {
                        rVarH.X(-41553942);
                        m.Companion companion7 = m.INSTANCE;
                        k70.a aVar5 = k70.a.f108864a;
                        int i211 = k70.a.f108865b;
                        mVarN = a3.n(w0.i.c(o.h(companion7, aVar5.b(rVarH, i211).getStrokeWidth(), aVar5.a(rVarH, i211).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar5.e(rVarH, i211).getRadius300()), aVar5.a(rVarH, i211).getSurface().a(), aVar5.e(rVarH, i211).getRadius300()), aVar5.b(rVarH, i211).getSpacing100());
                        rVarH.R();
                    } else {
                        rVarH.X(-41204355);
                        rVarH.R();
                        mVarN = m.INSTANCE;
                    }
                    if (z17) {
                        rVarH.X(-41105775);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    } else {
                        rVarH.X(-41068885);
                        m.Companion companion8 = m.INSTANCE;
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: r50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return e.g((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarC = v.c(companion8, true, (l) objE);
                        rVarH.R();
                    }
                    m mVarU5 = mVarN.u(mVarC);
                    if (f18 != null) {
                        mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                    } else {
                        mVarA = m.INSTANCE;
                    }
                    m mVarU6 = mVarU5.u(mVarA);
                    d1.i iVar3 = d1.i.f39152a;
                    aVar2 = k70.a.f108864a;
                    i27 = k70.a.f108865b;
                    w0 w0VarB3 = m3.b(iVar3.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVarU6);
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
                    r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarB3, companion9.d());
                    n6.i(rVarC3, e0VarT3, companion9.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion9.c());
                    n6.g(rVarC3, companion9.a());
                    n6.i(rVarC3, mVarE3, companion9.e());
                    q3 q3Var3 = q3.f39261a;
                    if (aVar instanceof r50.a.WithIcon) {
                        rVarH.X(1036405802);
                        r50.a.WithIcon withIcon3 = (r50.a.WithIcon) aVar;
                        testTag2 = withIcon3.getTestTag();
                        if (testTag2 != null) {
                            str2 = testTag2 + "Icon";
                        } else {
                            str2 = null;
                        }
                        h.f(null, new d40.b.C0864b(str2, m(withIcon3.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                        rVarH.R();
                    } else {
                        if (aVar instanceof r50.a.WithDot) {
                            rVarH.X(1036404285);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1036416803);
                        d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                        rVarH.R();
                    }
                    String strA3 = aVar.a(z27);
                    testTag = aVar.getTestTag();
                    if (testTag != null) {
                        str = testTag + "Text";
                    } else {
                        str = null;
                    }
                    int maxLines3 = aVar.getMaxLines();
                    Label label3 = aVar.getLabel();
                    long jI3 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                    if (aVar.getWithBorder()) {
                    }
                    if (textStyleF == null) {
                        rVarH.X(1036431294);
                        textStyleF = aVar2.f(rVarH, i27).a();
                        rVarH.R();
                    } else {
                        rVarH.X(1036428349);
                        rVarH.R();
                    }
                    boolean z212 = z27;
                    j70.h.g(null, str, label3, mx.b.b(strA3, ""), null, jI3, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines3, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                    rVarH = rVarH;
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    boolean z213 = z17;
                    z26 = z212;
                    z25 = z213;
                    f17 = f18;
                } else {
                    rVarH.O();
                    z25 = z17;
                    f17 = f16;
                    z26 = z18;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: r50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z18 = z16;
            if ((i17 & 1171) != 1170) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i28 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    f18 = null;
                } else {
                    f18 = f16;
                }
                if (i25 != 0) {
                    z27 = true;
                } else {
                    z27 = z18;
                }
                if (t.k()) {
                    t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                }
                if (aVar.getWithBorder()) {
                    rVarH.X(-41553942);
                    m.Companion companion10 = m.INSTANCE;
                    k70.a aVar6 = k70.a.f108864a;
                    int i212 = k70.a.f108865b;
                    mVarN = a3.n(w0.i.c(o.h(companion10, aVar6.b(rVarH, i212).getStrokeWidth(), aVar6.a(rVarH, i212).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar6.e(rVarH, i212).getRadius300()), aVar6.a(rVarH, i212).getSurface().a(), aVar6.e(rVarH, i212).getRadius300()), aVar6.b(rVarH, i212).getSpacing100());
                    rVarH.R();
                } else {
                    rVarH.X(-41204355);
                    rVarH.R();
                    mVarN = m.INSTANCE;
                }
                if (z17) {
                    rVarH.X(-41105775);
                    rVarH.R();
                    mVarC = m.INSTANCE;
                } else {
                    rVarH.X(-41068885);
                    m.Companion companion11 = m.INSTANCE;
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: r50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return e.g((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarC = v.c(companion11, true, (l) objE);
                    rVarH.R();
                }
                m mVarU7 = mVarN.u(mVarC);
                if (f18 != null) {
                    mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                } else {
                    mVarA = m.INSTANCE;
                }
                m mVarU8 = mVarU7.u(mVarA);
                d1.i iVar4 = d1.i.f39152a;
                aVar2 = k70.a.f108864a;
                i27 = k70.a.f108865b;
                w0 w0VarB4 = m3.b(iVar4.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = j.e(rVarH, mVarU8);
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
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarB4, companion12.d());
                n6.i(rVarC4, e0VarT4, companion12.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion12.c());
                n6.g(rVarC4, companion12.a());
                n6.i(rVarC4, mVarE4, companion12.e());
                q3 q3Var4 = q3.f39261a;
                if (aVar instanceof r50.a.WithIcon) {
                    rVarH.X(1036405802);
                    r50.a.WithIcon withIcon4 = (r50.a.WithIcon) aVar;
                    testTag2 = withIcon4.getTestTag();
                    if (testTag2 != null) {
                        str2 = testTag2 + "Icon";
                    } else {
                        str2 = null;
                    }
                    h.f(null, new d40.b.C0864b(str2, m(withIcon4.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                    rVarH.R();
                } else {
                    if (aVar instanceof r50.a.WithDot) {
                        rVarH.X(1036404285);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1036416803);
                    d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                    rVarH.R();
                }
                String strA4 = aVar.a(z27);
                testTag = aVar.getTestTag();
                if (testTag != null) {
                    str = testTag + "Text";
                } else {
                    str = null;
                }
                int maxLines4 = aVar.getMaxLines();
                Label label4 = aVar.getLabel();
                long jI4 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                if (aVar.getWithBorder()) {
                }
                if (textStyleF == null) {
                    rVarH.X(1036431294);
                    textStyleF = aVar2.f(rVarH, i27).a();
                    rVarH.R();
                } else {
                    rVarH.X(1036428349);
                    rVarH.R();
                }
                boolean z214 = z27;
                j70.h.g(null, str, label4, mx.b.b(strA4, ""), null, jI4, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines4, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                rVarH = rVarH;
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                boolean z215 = z17;
                z26 = z214;
                z25 = z215;
                f17 = f18;
            } else {
                rVarH.O();
                z25 = z17;
                f17 = f16;
                z26 = z18;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: r50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z17 = z15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                f16 = f15;
                if (rVarH.W(f16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i28 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        f18 = null;
                    } else {
                        f18 = f16;
                    }
                    if (i25 != 0) {
                        z27 = true;
                    } else {
                        z27 = z18;
                    }
                    if (t.k()) {
                        t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                    }
                    if (aVar.getWithBorder()) {
                        rVarH.X(-41553942);
                        m.Companion companion13 = m.INSTANCE;
                        k70.a aVar7 = k70.a.f108864a;
                        int i213 = k70.a.f108865b;
                        mVarN = a3.n(w0.i.c(o.h(companion13, aVar7.b(rVarH, i213).getStrokeWidth(), aVar7.a(rVarH, i213).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar7.e(rVarH, i213).getRadius300()), aVar7.a(rVarH, i213).getSurface().a(), aVar7.e(rVarH, i213).getRadius300()), aVar7.b(rVarH, i213).getSpacing100());
                        rVarH.R();
                    } else {
                        rVarH.X(-41204355);
                        rVarH.R();
                        mVarN = m.INSTANCE;
                    }
                    if (z17) {
                        rVarH.X(-41105775);
                        rVarH.R();
                        mVarC = m.INSTANCE;
                    } else {
                        rVarH.X(-41068885);
                        m.Companion companion14 = m.INSTANCE;
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: r50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return e.g((n4.i0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarC = v.c(companion14, true, (l) objE);
                        rVarH.R();
                    }
                    m mVarU9 = mVarN.u(mVarC);
                    if (f18 != null) {
                        mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                    } else {
                        mVarA = m.INSTANCE;
                    }
                    m mVarU10 = mVarU9.u(mVarA);
                    d1.i iVar5 = d1.i.f39152a;
                    aVar2 = k70.a.f108864a;
                    i27 = k70.a.f108865b;
                    w0 w0VarB5 = m3.b(iVar5.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT5 = rVarH.t();
                    m mVarE5 = j.e(rVarH, mVarU10);
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
                    r rVarC5 = n6.c(rVarH);
                    n6.i(rVarC5, w0VarB5, companion15.d());
                    n6.i(rVarC5, e0VarT5, companion15.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion15.c());
                    n6.g(rVarC5, companion15.a());
                    n6.i(rVarC5, mVarE5, companion15.e());
                    q3 q3Var5 = q3.f39261a;
                    if (aVar instanceof r50.a.WithIcon) {
                        rVarH.X(1036405802);
                        r50.a.WithIcon withIcon5 = (r50.a.WithIcon) aVar;
                        testTag2 = withIcon5.getTestTag();
                        if (testTag2 != null) {
                            str2 = testTag2 + "Icon";
                        } else {
                            str2 = null;
                        }
                        h.f(null, new d40.b.C0864b(str2, m(withIcon5.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                        rVarH.R();
                    } else {
                        if (aVar instanceof r50.a.WithDot) {
                            rVarH.X(1036404285);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1036416803);
                        d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                        rVarH.R();
                    }
                    String strA5 = aVar.a(z27);
                    testTag = aVar.getTestTag();
                    if (testTag != null) {
                        str = testTag + "Text";
                    } else {
                        str = null;
                    }
                    int maxLines5 = aVar.getMaxLines();
                    Label label5 = aVar.getLabel();
                    long jI5 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                    if (aVar.getWithBorder()) {
                    }
                    if (textStyleF == null) {
                        rVarH.X(1036431294);
                        textStyleF = aVar2.f(rVarH, i27).a();
                        rVarH.R();
                    } else {
                        rVarH.X(1036428349);
                        rVarH.R();
                    }
                    boolean z216 = z27;
                    j70.h.g(null, str, label5, mx.b.b(strA5, ""), null, jI5, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines5, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                    rVarH = rVarH;
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    boolean z217 = z17;
                    z26 = z216;
                    z25 = z217;
                    f17 = f18;
                } else {
                    rVarH.O();
                    z25 = z17;
                    f17 = f16;
                    z26 = z18;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: r50.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z18 = z16;
            if ((i17 & 1171) != 1170) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i28 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    f18 = null;
                } else {
                    f18 = f16;
                }
                if (i25 != 0) {
                    z27 = true;
                } else {
                    z27 = z18;
                }
                if (t.k()) {
                    t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                }
                if (aVar.getWithBorder()) {
                    rVarH.X(-41553942);
                    m.Companion companion16 = m.INSTANCE;
                    k70.a aVar8 = k70.a.f108864a;
                    int i214 = k70.a.f108865b;
                    mVarN = a3.n(w0.i.c(o.h(companion16, aVar8.b(rVarH, i214).getStrokeWidth(), aVar8.a(rVarH, i214).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar8.e(rVarH, i214).getRadius300()), aVar8.a(rVarH, i214).getSurface().a(), aVar8.e(rVarH, i214).getRadius300()), aVar8.b(rVarH, i214).getSpacing100());
                    rVarH.R();
                } else {
                    rVarH.X(-41204355);
                    rVarH.R();
                    mVarN = m.INSTANCE;
                }
                if (z17) {
                    rVarH.X(-41105775);
                    rVarH.R();
                    mVarC = m.INSTANCE;
                } else {
                    rVarH.X(-41068885);
                    m.Companion companion17 = m.INSTANCE;
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: r50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return e.g((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarC = v.c(companion17, true, (l) objE);
                    rVarH.R();
                }
                m mVarU11 = mVarN.u(mVarC);
                if (f18 != null) {
                    mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                } else {
                    mVarA = m.INSTANCE;
                }
                m mVarU12 = mVarU11.u(mVarA);
                d1.i iVar6 = d1.i.f39152a;
                aVar2 = k70.a.f108864a;
                i27 = k70.a.f108865b;
                w0 w0VarB6 = m3.b(iVar6.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVarU12);
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
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarB6, companion18.d());
                n6.i(rVarC6, e0VarT6, companion18.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion18.c());
                n6.g(rVarC6, companion18.a());
                n6.i(rVarC6, mVarE6, companion18.e());
                q3 q3Var6 = q3.f39261a;
                if (aVar instanceof r50.a.WithIcon) {
                    rVarH.X(1036405802);
                    r50.a.WithIcon withIcon6 = (r50.a.WithIcon) aVar;
                    testTag2 = withIcon6.getTestTag();
                    if (testTag2 != null) {
                        str2 = testTag2 + "Icon";
                    } else {
                        str2 = null;
                    }
                    h.f(null, new d40.b.C0864b(str2, m(withIcon6.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                    rVarH.R();
                } else {
                    if (aVar instanceof r50.a.WithDot) {
                        rVarH.X(1036404285);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1036416803);
                    d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                    rVarH.R();
                }
                String strA6 = aVar.a(z27);
                testTag = aVar.getTestTag();
                if (testTag != null) {
                    str = testTag + "Text";
                } else {
                    str = null;
                }
                int maxLines6 = aVar.getMaxLines();
                Label label6 = aVar.getLabel();
                long jI6 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                if (aVar.getWithBorder()) {
                }
                if (textStyleF == null) {
                    rVarH.X(1036431294);
                    textStyleF = aVar2.f(rVarH, i27).a();
                    rVarH.R();
                } else {
                    rVarH.X(1036428349);
                    rVarH.R();
                }
                boolean z218 = z27;
                j70.h.g(null, str, label6, mx.b.b(strA6, ""), null, jI6, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines6, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                rVarH = rVarH;
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                boolean z219 = z17;
                z26 = z218;
                z25 = z219;
                f17 = f18;
            } else {
                rVarH.O();
                z25 = z17;
                f17 = f16;
                z26 = z18;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: r50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        f16 = f15;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                z18 = z16;
                if (rVarH.a(z18)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i17 & 1171) != 1170) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i28 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    f18 = null;
                } else {
                    f18 = f16;
                }
                if (i25 != 0) {
                    z27 = true;
                } else {
                    z27 = z18;
                }
                if (t.k()) {
                    t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
                }
                if (aVar.getWithBorder()) {
                    rVarH.X(-41553942);
                    m.Companion companion19 = m.INSTANCE;
                    k70.a aVar9 = k70.a.f108864a;
                    int i215 = k70.a.f108865b;
                    mVarN = a3.n(w0.i.c(o.h(companion19, aVar9.b(rVarH, i215).getStrokeWidth(), aVar9.a(rVarH, i215).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar9.e(rVarH, i215).getRadius300()), aVar9.a(rVarH, i215).getSurface().a(), aVar9.e(rVarH, i215).getRadius300()), aVar9.b(rVarH, i215).getSpacing100());
                    rVarH.R();
                } else {
                    rVarH.X(-41204355);
                    rVarH.R();
                    mVarN = m.INSTANCE;
                }
                if (z17) {
                    rVarH.X(-41105775);
                    rVarH.R();
                    mVarC = m.INSTANCE;
                } else {
                    rVarH.X(-41068885);
                    m.Companion companion110 = m.INSTANCE;
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: r50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return e.g((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarC = v.c(companion110, true, (l) objE);
                    rVarH.R();
                }
                m mVarU13 = mVarN.u(mVarC);
                if (f18 != null) {
                    mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
                } else {
                    mVarA = m.INSTANCE;
                }
                m mVarU14 = mVarU13.u(mVarA);
                d1.i iVar7 = d1.i.f39152a;
                aVar2 = k70.a.f108864a;
                i27 = k70.a.f108865b;
                w0 w0VarB7 = m3.b(iVar7.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = j.e(rVarH, mVarU14);
                androidx.compose.ui.node.c.Companion companion111 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion111.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarB7, companion111.d());
                n6.i(rVarC7, e0VarT7, companion111.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion111.c());
                n6.g(rVarC7, companion111.a());
                n6.i(rVarC7, mVarE7, companion111.e());
                q3 q3Var7 = q3.f39261a;
                if (aVar instanceof r50.a.WithIcon) {
                    rVarH.X(1036405802);
                    r50.a.WithIcon withIcon7 = (r50.a.WithIcon) aVar;
                    testTag2 = withIcon7.getTestTag();
                    if (testTag2 != null) {
                        str2 = testTag2 + "Icon";
                    } else {
                        str2 = null;
                    }
                    h.f(null, new d40.b.C0864b(str2, m(withIcon7.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                    rVarH.R();
                } else {
                    if (aVar instanceof r50.a.WithDot) {
                        rVarH.X(1036404285);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1036416803);
                    d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                    rVarH.R();
                }
                String strA7 = aVar.a(z27);
                testTag = aVar.getTestTag();
                if (testTag != null) {
                    str = testTag + "Text";
                } else {
                    str = null;
                }
                int maxLines7 = aVar.getMaxLines();
                Label label7 = aVar.getLabel();
                long jI7 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                if (aVar.getWithBorder()) {
                }
                if (textStyleF == null) {
                    rVarH.X(1036431294);
                    textStyleF = aVar2.f(rVarH, i27).a();
                    rVarH.R();
                } else {
                    rVarH.X(1036428349);
                    rVarH.R();
                }
                boolean z2110 = z27;
                j70.h.g(null, str, label7, mx.b.b(strA7, ""), null, jI7, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines7, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
                rVarH = rVarH;
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                boolean z2111 = z17;
                z26 = z2110;
                z25 = z2111;
                f17 = f18;
            } else {
                rVarH.O();
                z25 = z17;
                f17 = f16;
                z26 = z18;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: r50.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z18 = z16;
        if ((i17 & 1171) != 1170) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            if (i28 != 0) {
                z17 = false;
            }
            if (i18 != 0) {
                f18 = null;
            } else {
                f18 = f16;
            }
            if (i25 != 0) {
                z27 = true;
            } else {
                z27 = z18;
            }
            if (t.k()) {
                t.o(-954406541, i17, -1, "pl.gov.coi.common.ui.ds.statusbadge.StatusBadge (StatusBadge.kt:34)");
            }
            if (aVar.getWithBorder()) {
                rVarH.X(-41553942);
                m.Companion companion112 = m.INSTANCE;
                k70.a aVar10 = k70.a.f108864a;
                int i216 = k70.a.f108865b;
                mVarN = a3.n(w0.i.c(o.h(companion112, aVar10.b(rVarH, i216).getStrokeWidth(), aVar10.a(rVarH, i216).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k(), aVar10.e(rVarH, i216).getRadius300()), aVar10.a(rVarH, i216).getSurface().a(), aVar10.e(rVarH, i216).getRadius300()), aVar10.b(rVarH, i216).getSpacing100());
                rVarH.R();
            } else {
                rVarH.X(-41204355);
                rVarH.R();
                mVarN = m.INSTANCE;
            }
            if (z17) {
                rVarH.X(-41105775);
                rVarH.R();
                mVarC = m.INSTANCE;
            } else {
                rVarH.X(-41068885);
                m.Companion companion113 = m.INSTANCE;
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: r50.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return e.g((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarC = v.c(companion113, true, (l) objE);
                rVarH.R();
            }
            m mVarU15 = mVarN.u(mVarC);
            if (f18 != null) {
                mVarA = f3.v.a(m.INSTANCE, f18.floatValue());
            } else {
                mVarA = m.INSTANCE;
            }
            m mVarU16 = mVarU15.u(mVarA);
            d1.i iVar8 = d1.i.f39152a;
            aVar2 = k70.a.f108864a;
            i27 = k70.a.f108865b;
            w0 w0VarB8 = m3.b(iVar8.r(aVar2.b(rVarH, i27).getSpacing50()), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT8 = rVarH.t();
            m mVarE8 = j.e(rVarH, mVarU16);
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
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarB8, companion114.d());
            n6.i(rVarC8, e0VarT8, companion114.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion114.c());
            n6.g(rVarC8, companion114.a());
            n6.i(rVarC8, mVarE8, companion114.e());
            q3 q3Var8 = q3.f39261a;
            if (aVar instanceof r50.a.WithIcon) {
                rVarH.X(1036405802);
                r50.a.WithIcon withIcon8 = (r50.a.WithIcon) aVar;
                testTag2 = withIcon8.getTestTag();
                if (testTag2 != null) {
                    str2 = testTag2 + "Icon";
                } else {
                    str2 = null;
                }
                h.f(null, new d40.b.C0864b(str2, m(withIcon8.getStatus()), i.d.f39707e, new b(aVar), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
                rVarH.R();
            } else {
                if (aVar instanceof r50.a.WithDot) {
                    rVarH.X(1036404285);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1036416803);
                d((r50.a.WithDot) aVar, rVarH, i17 & 14);
                rVarH.R();
            }
            String strA8 = aVar.a(z27);
            testTag = aVar.getTestTag();
            if (testTag != null) {
                str = testTag + "Text";
            } else {
                str = null;
            }
            int maxLines8 = aVar.getMaxLines();
            Label label8 = aVar.getLabel();
            long jI8 = aVar2.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            if (aVar.getWithBorder()) {
            }
            if (textStyleF == null) {
                rVarH.X(1036431294);
                textStyleF = aVar2.f(rVarH, i27).a();
                rVarH.R();
            } else {
                rVarH.X(1036428349);
                rVarH.R();
            }
            boolean z2112 = z27;
            j70.h.g(null, str, label8, mx.b.b(strA8, ""), null, jI8, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, maxLines8, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 24576, MLKEMEngine.KyberPolyBytes, 28753873);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            boolean z2113 = z17;
            z26 = z2112;
            z25 = z2113;
            f17 = f18;
        } else {
            rVarH.O();
            z25 = z17;
            f17 = f16;
            z26 = z18;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: r50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.h(aVar, z25, f17, z26, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(r50.a aVar, boolean z15, Float f15, boolean z16, int i15, int i16, r rVar, int i17) {
        f(aVar, z15, f15, z16, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(f fVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(1669415030, i15, -1, "pl.gov.coi.common.ui.ds.statusbadge.getIconColor (StatusBadge.kt:141)");
        }
        int i16 = c.f171893b[fVar.ordinal()];
        if (i16 == 1) {
            rVar.X(-2009920924);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            rVar.R();
        } else if (i16 == 2) {
            rVar.X(-2009918335);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
            rVar.R();
        } else if (i16 == 3) {
            rVar.X(-2009915934);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            if (i16 != 4) {
                rVar.X(-2009923078);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-2009913532);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(g gVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(592822296, i15, -1, "pl.gov.coi.common.ui.ds.statusbadge.getIconColor (StatusBadge.kt:131)");
        }
        switch (c.f171892a[gVar.ordinal()]) {
            case 1:
                rVar.X(-1528419898);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
                rVar.R();
                break;
            case 2:
                rVar.X(-1528417277);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                rVar.R();
                break;
            case 3:
                rVar.X(-1528414844);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
                break;
            case 4:
                rVar.X(-1528413021);
                rVar.R();
                jD = Color.INSTANCE.h();
                break;
            case 5:
                rVar.X(-1528410686);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
                break;
            case 6:
                rVar.X(-1528408315);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().e();
                rVar.R();
                break;
            default:
                rVar.X(-1528421953);
                rVar.R();
                throw new oq.p();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }

    private static final int m(g gVar) {
        switch (c.f171892a[gVar.ordinal()]) {
            case 1:
                return jz.a.B1;
            case 2:
                return jz.a.A1;
            case 3:
                return jz.a.C1;
            case 4:
                return jz.a.D1;
            case 5:
                return jz.a.f106911z1;
            case 6:
                return jz.a.f106911z1;
            default:
                throw new oq.p();
        }
    }
}
