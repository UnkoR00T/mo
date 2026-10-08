package y30;

import androidx.compose.ui.graphics.Color;
import er.p;
import ju.p0;
import l1.RoundedCornerShape;
import l3.d0;
import l3.g0;
import mx.Label;
import n4.f0;
import oq.i0;
import oq.u;
import p046f2.en;
import p046f2.rm;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v;
import q4.TextStyle;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Ly30/n$b;", "data", "Loq/i0;", "g", "(Ly30/n$b;Lm2/r;I)V", "", "initialCompositionFinished", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f223684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0 f223685g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, d0 d0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f223684f = z15;
            this.f223685g = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f223683e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (this.f223684f) {
                d0.f(this.f223685g, 0, 1, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f223684f, this.f223685g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f223687f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a3<Boolean> a3Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f223687f = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f223686e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.i(this.f223687f, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f223687f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223688a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f223688a = iArr;
        }
    }

    public static final void g(final n.Switch r17, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1160264716);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(r17) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1160264716, i16, -1, "pl.gov.coi.common.ui.ds.controllers.ControllerSwitch (ControllerSwitch.kt:40)");
            }
            final RoundedCornerShape roundedCornerShapeI = l1.h.i();
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) objE;
            int tabIndex = r17.getSelectedItemType().getTabIndex();
            f3.m mVarC = w0.i.c(f3.m.INSTANCE, k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), roundedCornerShapeI);
            long jG = Color.INSTANCE.g();
            y30.c cVar = y30.c.f223658a;
            en.h(tabIndex, mVarC, jG, 0L, cVar.d(), cVar.c(), y2.m.d(-1137126004, true, new p() { // from class: y30.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.j(r17, roundedCornerShapeI, a3Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 1794432, 8);
            i0 i0Var = i0.f148189a;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new b(a3Var, null);
                rVarH.v(objE2);
            }
            Function0.d(i0Var, (p) objE2, rVarH, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: y30.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(r17, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean h(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r25v0, types: [m2.r] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [yw.a] */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    public static final i0 j(final n.Switch r25, RoundedCornerShape roundedCornerShape, a3 a3Var, r rVar, int i15) {
        f3.m mVarD;
        float spacing50;
        int i16;
        float spacing25;
        float level0;
        long jG;
        ?? r15 = 0;
        ?? r16 = 1;
        int i17 = 2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1137126004, i15, -1, "pl.gov.coi.common.ui.ds.controllers.ControllerSwitch.<anonymous> (ControllerSwitch.kt:55)");
            }
            for (final n.Switch.TabItem tabItem : v.q(r25.getLeftItem(), r25.getRightItem())) {
                Object objE = rVar.E();
                r.Companion companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = b1.k.a();
                    rVar.v(objE);
                }
                b1.l lVar = (b1.l) objE;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVar, 6);
                ?? r17 = r25.getSelectedItemType().getTabIndex() == tabItem.getType().getTabIndex() ? r16 : r15;
                ?? r18 = (r25.getAutoFocusOnSelectedTab() && r17 != 0 && h(a3Var)) ? r16 : r15;
                Object objE2 = rVar.E();
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVar.v(objE2);
                }
                d0 d0Var = (d0) objE2;
                final String text = c70.a.f23835a.a().x0(tabItem.getLabel().getText(), tabItem.getType().getTabIndex() + r16, r17, i17).getText();
                Boolean boolValueOf = Boolean.valueOf((boolean) r18);
                boolean zA = rVar.a(r18);
                Object objE3 = rVar.E();
                if (zA || objE3 == companion.a()) {
                    objE3 = new a(r18, d0Var, null);
                    rVar.v(objE3);
                }
                Function0.d(boolValueOf, (p) objE3, rVar, r15);
                f3.m.Companion companion2 = f3.m.INSTANCE;
                if (r18 != 0) {
                    rVar.X(-1426741735);
                    Object objE4 = rVar.E();
                    if (objE4 == companion.a()) {
                        objE4 = new er.l() { // from class: y30.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return m.k((n4.i0) obj);
                            }
                        };
                        rVar.v(objE4);
                    }
                    mVarD = n4.v.d(companion2, r15, (er.l) objE4, r16, null);
                    rVar.R();
                } else {
                    rVar.X(-1426740667);
                    rVar.R();
                    mVarD = companion2;
                }
                f3.m mVarU = companion2.u(mVarD);
                boolean zW = rVar.W(text);
                Object objE5 = rVar.E();
                if (zW || objE5 == companion.a()) {
                    objE5 = new er.l() { // from class: y30.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return m.l(text, (n4.i0) obj);
                        }
                    };
                    rVar.v(objE5);
                }
                f3.m mVarB = s.B(androidx.compose.foundation.layout.d.f(g0.a(n4.v.a(mVarU, (er.l) objE5), d0Var), 0.0f, r16, null), f6VarA, roundedCornerShape, rVar, r15);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                float spacing51 = aVar.b(rVar, i18).getSpacing50();
                float spacing52 = aVar.b(rVar, i18).getSpacing50();
                n.Switch.EnumC5973b type = tabItem.getType();
                int[] iArr = c.f223688a;
                int i19 = iArr[type.ordinal()];
                if (i19 == r16) {
                    rVar.X(-1426724762);
                    spacing50 = aVar.b(rVar, i18).getSpacing50();
                    rVar.R();
                } else {
                    if (i19 != 2) {
                        rVar.X(-1426727519);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1426722170);
                    spacing50 = aVar.b(rVar, i18).getSpacing25();
                    rVar.R();
                }
                int i25 = iArr[tabItem.getType().ordinal()];
                if (i25 != r16) {
                    i16 = 2;
                    if (i25 != 2) {
                        rVar.X(-1426720607);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1426715258);
                    spacing25 = aVar.b(rVar, i18).getSpacing50();
                    rVar.R();
                } else {
                    i16 = 2;
                    rVar.X(-1426717850);
                    spacing25 = aVar.b(rVar, i18).getSpacing25();
                    rVar.R();
                }
                f3.m mVarQ = d1.a3.q(mVarB, spacing50, spacing52, spacing25, spacing51);
                if (r17 == r16) {
                    rVar.X(-1426709757);
                    level0 = aVar.c(rVar, i18).getLevel1();
                    rVar.R();
                } else {
                    if (r17 != 0) {
                        rVar.X(-1426711615);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1426708157);
                    level0 = aVar.c(rVar, i18).getLevel0();
                    rVar.R();
                }
                int i26 = i16;
                final ?? r19 = r17;
                f3.m mVarB2 = k3.u.b(mVarQ, level0, roundedCornerShape, false, 0L, 0L, 28, null);
                if (r19 == r16) {
                    rVar.X(-1426703579);
                    jG = aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
                    rVar.R();
                } else {
                    if (r19 != 0) {
                        rVar.X(-1426705570);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1426702360);
                    rVar.R();
                    jG = Color.INSTANCE.g();
                }
                f3.m mVarC = w0.i.c(mVarB2, jG, roundedCornerShape);
                boolean zW2 = rVar.W(r25) | rVar.W(tabItem);
                Object objE6 = rVar.E();
                if (zW2 || objE6 == companion.a()) {
                    objE6 = new er.a() { // from class: y30.k
                        @Override // er.a
                        public final Object a() {
                            return m.m(r25, tabItem);
                        }
                    };
                    rVar.v(objE6);
                }
                rm.j(r19, (er.a) objE6, mVarC, false, y2.m.d(-1998366813, r16, new p() { // from class: y30.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.n(tabItem, r19, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), null, 0L, 0L, lVar, rVar, 100687872, 232);
                r16 = r16 == true ? 1 : 0;
                i17 = i26;
                r15 = 0;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(n4.i0 i0Var) {
        f0.i0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(String str, n4.i0 i0Var) {
        f0.c0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n.Switch r15, n.Switch.TabItem tabItem) {
        r15.c().b(tabItem.getType());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n.Switch.TabItem tabItem, boolean z15, r rVar, int i15) {
        TextStyle textStyleD;
        long jB;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1998366813, i15, -1, "pl.gov.coi.common.ui.ds.controllers.ControllerSwitch.<anonymous>.<anonymous>.<anonymous> (ControllerSwitch.kt:119)");
            }
            Label label = tabItem.getLabel();
            int iA = b5.j.INSTANCE.a();
            if (z15) {
                rVar.X(-580118733);
                textStyleD = k70.a.f108864a.f(rVar, k70.a.f108865b).c();
                rVar.R();
            } else {
                if (z15) {
                    rVar.X(-580120580);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-580116812);
                textStyleD = k70.a.f108864a.f(rVar, k70.a.f108865b).d();
                rVar.R();
            }
            TextStyle textStyle = textStyleD;
            if (z15) {
                rVar.X(-580113110);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
                rVar.R();
            } else {
                if (z15) {
                    rVar.X(-580114991);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-580111347);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            }
            j70.h.g(null, null, label, null, null, jB, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 3, 0, null, textStyle, null, null, false, true, null, rVar, 0, 1572864, 3072, 24571867);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(n.Switch r15, int i15, r rVar, int i16) {
        g(r15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
