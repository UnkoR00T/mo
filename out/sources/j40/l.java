package j40;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import ju.p0;
import ju.z0;
import l3.d0;
import l3.g0;
import l3.o;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\r\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Lj40/a;", "data", "Loq/i0;", "m", "(Lj40/a;Lm2/r;I)V", "k", "Lmx/a;", "helperText", "y", "(Lmx/a;Lm2/r;I)V", "Lj40/m;", "Landroidx/compose/ui/graphics/Color;", "G", "(Lj40/m;Lm2/r;I)J", "F", "E", ip.a.f96138c, "", "initialCompositionFinished", "r", "(Lj40/a;ZLm2/r;I)V", "", "C", "(Lj40/a;)Ljava/lang/String;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f99383f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a3<Boolean> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f99383f = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f99382e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.o(this.f99383f, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f99383f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f99385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f99386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d0 f99387h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z15, o oVar, d0 d0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f99385f = z15;
            this.f99386g = oVar;
            this.f99387h = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f99384e;
            if (i15 == 0) {
                u.b(obj);
                if (this.f99385f) {
                    this.f99384e = 1;
                    if (z0.b(30L, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.g(this.f99386g, false, 1, null);
            d0.f(this.f99387h, 0, 1, null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f99385f, this.f99386g, this.f99387h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DropDownButtonData f99388a;

        c(DropDownButtonData dropDownButtonData) {
            this.f99388a = dropDownButtonData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1404474622);
            if (t.k()) {
                t.o(-1404474622, i15, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.DropDownClickableRow.<anonymous>.<anonymous> (DropDownButton.kt:234)");
            }
            long jF = l.F(this.f99388a.getButtonType(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jF;
        }
    }

    private static final String C(DropDownButtonData dropDownButtonData) {
        Label placeholder;
        Label helperText;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(s.O(dropDownButtonData.getLabel()));
        if (dropDownButtonData.getInitialSelectedItem() == null || (placeholder = dropDownButtonData.g().get(dropDownButtonData.getInitialSelectedItem().intValue())) == null) {
            placeholder = dropDownButtonData.getPlaceholder();
        }
        sb5.append(s.O(placeholder));
        m buttonType = dropDownButtonData.getButtonType();
        if (buttonType instanceof m.Error) {
            helperText = ((m.Error) dropDownButtonData.getButtonType()).getErrorText();
        } else if (buttonType instanceof m.Disabled) {
            helperText = ((m.Disabled) dropDownButtonData.getButtonType()).getHelperText();
        } else {
            if (!(buttonType instanceof m.Enabled)) {
                throw new oq.p();
            }
            helperText = ((m.Enabled) dropDownButtonData.getButtonType()).getHelperText();
        }
        sb5.append(fu.r.u1(s.O(helperText)).toString());
        return sb5.toString();
    }

    private static final long D(m mVar, r rVar, int i15) {
        long jG;
        if (t.k()) {
            t.o(1440850320, i15, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.getBorderStroke (DropDownButton.kt:144)");
        }
        if (mVar instanceof m.Disabled) {
            rVar.X(1677692153);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().g();
            rVar.R();
        } else if (mVar instanceof m.Enabled) {
            rVar.X(1677694457);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().a();
            rVar.R();
        } else {
            if (!(mVar instanceof m.Error)) {
                rVar.X(1677689915);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(1677696700);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jG;
    }

    private static final long E(m mVar, r rVar, int i15) {
        long jI;
        if (t.k()) {
            t.o(874734192, i15, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.getFilledTextColor (DropDownButton.kt:137)");
        }
        if (mVar instanceof m.Disabled) {
            rVar.X(-1194027462);
            jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
            rVar.R();
        } else {
            rVar.X(-1194025958);
            jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(m mVar, r rVar, int i15) {
        long jB;
        if (t.k()) {
            t.o(1078582714, i15, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.getIconColor (DropDownButton.kt:130)");
        }
        if (mVar instanceof m.Disabled) {
            rVar.X(1430873667);
            jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
            rVar.R();
        } else {
            rVar.X(1430875140);
            jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jB;
    }

    private static final long G(m mVar, r rVar, int i15) {
        long jB;
        if (t.k()) {
            t.o(2112012453, i15, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.getLabelColor (DropDownButton.kt:123)");
        }
        if (mVar instanceof m.Disabled) {
            rVar.X(-1875559793);
            jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
            rVar.R();
        } else {
            rVar.X(-1875558289);
            jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jB;
    }

    public static final void k(final DropDownButtonData dropDownButtonData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1635854441);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dropDownButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1635854441, i16, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.DropDownBottomText (DropDownButton.kt:97)");
            }
            m buttonType = dropDownButtonData.getButtonType();
            if (buttonType instanceof m.Error) {
                rVarH.X(-1254110768);
                if (((m.Error) dropDownButtonData.getButtonType()).getErrorText() == null) {
                    rVarH.X(-1254110769);
                    rVarH.R();
                } else {
                    rVarH.X(-1254110768);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, 0);
                    l40.d.d(null, ((m.Error) dropDownButtonData.getButtonType()).getErrorText(), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                    rVarH.R();
                    i0 i0Var = i0.f148189a;
                }
                rVarH.R();
            } else if (buttonType instanceof m.Disabled) {
                rVarH.X(-1253871448);
                if (((m.Disabled) dropDownButtonData.getButtonType()).getHelperText() == null) {
                    rVarH.X(-1253871449);
                    rVarH.R();
                } else {
                    rVarH.X(-1253871448);
                    y(((m.Disabled) dropDownButtonData.getButtonType()).getHelperText(), rVarH, 0);
                    rVarH.R();
                    i0 i0Var2 = i0.f148189a;
                }
                rVarH.R();
            } else {
                if (!(buttonType instanceof m.Enabled)) {
                    rVarH.X(98089723);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1253723764);
                if (((m.Enabled) dropDownButtonData.getButtonType()).getHelperText() == null) {
                    rVarH.X(-1253723765);
                    rVarH.R();
                } else {
                    rVarH.X(-1253723764);
                    y(((m.Enabled) dropDownButtonData.getButtonType()).getHelperText(), rVarH, 0);
                    rVarH.R();
                    i0 i0Var3 = i0.f148189a;
                }
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(dropDownButtonData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(DropDownButtonData dropDownButtonData, int i15, r rVar, int i16) {
        k(dropDownButtonData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final DropDownButtonData dropDownButtonData, r rVar, final int i15) {
        int i16;
        final DropDownButtonData dropDownButtonData2;
        r rVarH = rVar.h(147283107);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dropDownButtonData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(147283107, i16, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.DropDownButton (DropDownButton.kt:62)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            a3 a3Var = (a3) objE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarC = androidx.compose.foundation.layout.d.C(companion2, null, false, 3, null);
            boolean zG = rVarH.G(dropDownButtonData);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: j40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.p(dropDownButtonData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarE = d60.m.e(v.d(mVarC, false, (er.l) objE2, 1, null), dropDownButtonData.getFieldIndex(), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarE);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            long jG = G(dropDownButtonData.getButtonType(), rVarH, 0);
            Label label = dropDownButtonData.getLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, jG, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, true, null, rVarH, 0, 0, 3072, 24641499);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            boolean zN = n(a3Var);
            int i18 = i16 & 14;
            dropDownButtonData2 = dropDownButtonData;
            r(dropDownButtonData2, zN, rVarH, i18);
            k(dropDownButtonData2, rVarH, i18);
            rVarH.x();
            i0 i0Var2 = i0.f148189a;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new a(a3Var, null);
                rVarH.v(objE3);
            }
            Function0.d(i0Var2, (p) objE3, rVarH, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            dropDownButtonData2 = dropDownButtonData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(dropDownButtonData2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean n(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(DropDownButtonData dropDownButtonData, n4.i0 i0Var) {
        if ((dropDownButtonData.getButtonType() instanceof m.Error) && ((m.Error) dropDownButtonData.getButtonType()).getErrorText() != null) {
            f0.l0(i0Var, n4.i.INSTANCE.b());
            f0.x0(i0Var, Label.INSTANCE.d().getText());
            f0.m(i0Var, ((m.Error) dropDownButtonData.getButtonType()).getErrorText().getText());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(DropDownButtonData dropDownButtonData, int i15, r rVar, int i16) {
        m(dropDownButtonData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(DropDownButtonData dropDownButtonData, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVar2;
        int i17;
        f3.m mVarD;
        int i18;
        int i19;
        r rVar3;
        final DropDownButtonData dropDownButtonData2 = dropDownButtonData;
        r rVarH = rVar.h(-1638915475);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dropDownButtonData2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1638915475, i16, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.DropDownClickableRow (DropDownButton.kt:154)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new d0();
                rVarH.v(objE2);
            }
            d0 d0Var = (d0) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = b1.k.a();
                rVarH.v(objE3);
            }
            b1.l lVar = (b1.l) objE3;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            boolean z16 = !(dropDownButtonData2.getButtonType() instanceof m.Disabled);
            boolean z17 = dropDownButtonData2.getAutoFocus() && z15;
            o oVar = (o) rVarH.N(g1.g());
            Boolean boolValueOf = Boolean.valueOf(z17);
            boolean zA = rVarH.a(z17) | rVarH.G(oVar);
            Object objE4 = rVarH.E();
            f3.c.b bVar = null;
            if (zA || objE4 == companion.a()) {
                objE4 = new b(z17, oVar, d0Var, null);
                rVarH.v(objE4);
            }
            Function0.d(boolValueOf, (p) objE4, rVarH, 0);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarH = iVar.h();
            f3.m.Companion companion3 = f3.m.INSTANCE;
            if (z17) {
                rVarH.X(1255254153);
                Object objE5 = rVarH.E();
                if (objE5 == companion.a()) {
                    objE5 = new er.l() { // from class: j40.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l.s((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                i17 = 1;
                bVar = null;
                mVarD = v.d(companion3, false, (er.l) objE5, 1, null);
                rVarH.R();
            } else {
                i17 = 1;
                rVarH.X(1255255221);
                rVarH.R();
                mVarD = companion3;
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(g0.a(companion3.u(mVarD), d0Var), 0.0f, i17, bVar);
            boolean zG = rVarH.G(dropDownButtonData2);
            Object objE6 = rVarH.E();
            if (zG || objE6 == companion.a()) {
                objE6 = new er.l() { // from class: j40.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.t(dropDownButtonData2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE6);
            }
            f3.m mVarC = v.c(mVarH, true, (er.l) objE6);
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            f3.c.b bVar2 = bVar;
            f3.m mVarW = s.w(mVarC, f6VarA, aVar2.b(rVarH, i25).getSpacing150(), 0.0f, 4, null);
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
            boolean zG2 = rVarH.G(aVar) | rVarH.G(dropDownButtonData2);
            Object objE7 = rVarH.E();
            if (zG2 || objE7 == companion.a()) {
                objE7 = new er.a() { // from class: j40.g
                    @Override // er.a
                    public final Object a() {
                        return l.u(aVar, dropDownButtonData2);
                    }
                };
                rVarH.v(objE7);
            }
            f3.m mVarN = d1.a3.n(w0.i.c(w0.o.h(k3.f.a(androidx.compose.foundation.b.l(mVarW, lVar, r1VarE, z16, null, lVarJ, (er.a) objE7, 8, null), aVar2.e(rVarH, i25).getRadius150()), aVar2.b(rVarH, i25).getStrokeWidth(), D(dropDownButtonData2.getButtonType(), rVarH, 0), aVar2.e(rVarH, i25).getRadius150()), aVar2.a(rVarH, i25).getSurface().a(), aVar2.e(rVarH, i25).getRadius50()), aVar2.b(rVarH, i25).getSpacing200());
            w0 w0VarB = m3.b(fVarH, interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarA = q3.f39261a.a(companion3, 1.0f, false);
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = new er.l() { // from class: j40.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.w((n4.i0) obj);
                    }
                };
                rVarH.v(objE8);
            }
            f3.m mVarD2 = v.d(mVarA, false, (er.l) objE8, 1, bVar2);
            w0 w0VarB2 = m3.b(iVar.j(), companion2.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            if (dropDownButtonData2.getInitialSelectedItem() != null) {
                rVarH.X(-303766747);
                f3.m mVarG = androidx.compose.foundation.layout.d.G(companion3, bVar2, false, 3, bVar2);
                long jE = E(dropDownButtonData2.getButtonType(), rVarH, 0);
                i19 = i25;
                i18 = 0;
                j70.h.g(mVarG, null, dropDownButtonData2.g().get(dropDownButtonData2.getInitialSelectedItem().intValue()), null, null, jE, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i25).b(), null, null, false, true, null, rVarH, 6, 0, 3072, 24641498);
                rVar3 = rVarH;
                rVar3.R();
            } else {
                i18 = 0;
                rVarH.X(-303465861);
                i19 = i25;
                j70.h.g(androidx.compose.foundation.layout.d.G(companion3, bVar2, false, 3, bVar2), null, dropDownButtonData.getPlaceholder(), null, null, aVar2.a(rVarH, i25).getNeutral().d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i25).b(), null, null, false, true, null, rVarH, 6, 0, 3072, 24641498);
                rVar3 = rVarH;
                rVar3.R();
            }
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar2.b(rVar3, i19).getSpacing100()), rVar3, i18);
            rVar3.x();
            dropDownButtonData2 = dropDownButtonData;
            d40.h.f(null, new d40.b.C0864b(null, jz.a.X, d40.i.f.f39709e, new c(dropDownButtonData2), Label.INSTANCE.c(), null, 33, null), false, rVar3, 0, 5);
            rVar2 = rVar3;
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j40.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.x(dropDownButtonData2, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(n4.i0 i0Var) {
        f0.i0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(DropDownButtonData dropDownButtonData, n4.i0 i0Var) {
        f0.c0(i0Var, C(dropDownButtonData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(cx.a aVar, final DropDownButtonData dropDownButtonData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: j40.j
            @Override // er.a
            public final Object a() {
                return l.v(dropDownButtonData);
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(DropDownButtonData dropDownButtonData) {
        dropDownButtonData.i().b(dropDownButtonData);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(DropDownButtonData dropDownButtonData, boolean z15, int i15, r rVar, int i16) {
        r(dropDownButtonData, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void y(Label label, r rVar, final int i15) {
        int i16;
        final Label label2;
        r rVarH = rVar.h(-1266878271);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1266878271, i16, -1, "pl.gov.coi.common.ui.ds.dropdownbutton.DropDownHelperText (DropDownButton.kt:116)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, 0);
            label2 = label;
            p40.b.b(null, label2, true, rVarH, ((i16 << 3) & 112) | MLKEMEngine.KyberPolyBytes, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            label2 = label;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j40.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.z(label2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Label label, int i15, r rVar, int i16) {
        y(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
