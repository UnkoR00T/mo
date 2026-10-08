package j50;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.u1;
import d1.d3;
import d1.m3;
import d1.o2;
import d1.p3;
import d1.q3;
import d1.r3;
import i30.ButtonIconData;
import ju.p0;
import ju.z0;
import l3.l0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p030d20.Function0;
import p036e4.w0;
import p046f2.hn;
import p046f2.oi;
import p046f2.pn;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.w5;
import p079n1.KeyboardOptions;
import p079n1.k3;
import p079n1.l3;
import q4.TextStyle;
import q4.a4;
import q4.z3;
import u0.d1;
import v4.TextFieldValue;
import v4.e1;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lf3/m;", "modifier", "Lj50/e;", "data", "Lkotlin/Function0;", "Loq/i0;", "innerContent", "A", "(Lf3/m;Lj50/e;Ler/p;Lm2/r;II)V", "d0", "(Lf3/m;Lj50/e;Ler/p;Lm2/r;I)V", ip.a.f96138c, "(Lj50/e;Lm2/r;I)V", "focusOnInput", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lj50/e;Ler/a;Lm2/r;I)V", "Ld1/p3;", "Ll3/d0;", "inputFocusRequester", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ld1/p3;Lj50/e;Ll3/d0;Lm2/r;I)V", "", "shouldFocusOnInput", "detectedHardwareKeyboard", "hasUserStartedTyping", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99486a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(499780111);
            if (p076m2.t.k()) {
                p076m2.t.o(499780111, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarBackIcon.<anonymous>.<anonymous> (SearchBar.kt:207)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99487a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1497201107);
            if (p076m2.t.k()) {
                p076m2.t.o(-1497201107, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarClearIcon.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:231)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SearchBarData f99489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f99490g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SearchBarData searchBarData, a3<Boolean> a3Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f99489f = searchBarData;
            this.f99490g = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f99488e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!this.f99489f.getIsActive()) {
                f0.b0(this.f99490g, false);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f99489f, this.f99490g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f99492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l3.o f99493g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z15, l3.o oVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f99492f = z15;
            this.f99493g = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f99491e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f99492f) {
                l3.o.g(this.f99493g, false, 1, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f99492f, this.f99493g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f99495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yw.b f99496g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Integer num, yw.b bVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f99495f = num;
            this.f99496g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f99494e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f99495f == null) {
                    return i0.f148189a;
                }
                this.f99494e = 1;
                if (z0.b(750L, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f99496g.a((this.f99495f.intValue() == 0 ? c70.a.f23835a.a().p() : c70.a.f23835a.a().R0(this.f99495f.intValue())).getText());
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f99495f, this.f99496g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SearchBarData f99497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3.o f99498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f99499c;

        f(SearchBarData searchBarData, l3.o oVar, a3<Boolean> a3Var) {
            this.f99497a = searchBarData;
            this.f99498b = oVar;
            this.f99499c = a3Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z15 = true;
            if (t70.i.B(keyEvent)) {
                f0.b0(this.f99499c, true);
            }
            if (keyEvent.getAction() == 0 && y3.a.R(y3.d.a(keyEvent), y3.a.INSTANCE.J())) {
                this.f99498b.h(this.f99497a.getIsActive() ? l3.g.INSTANCE.e() : l3.g.INSTANCE.a());
            } else {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SearchBarData f99501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l3.d0 f99502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f99503h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SearchBarData searchBarData, l3.d0 d0Var, a3<Boolean> a3Var, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f99501f = searchBarData;
            this.f99502g = d0Var;
            this.f99503h = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f99500e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (f0.e0(this.f99503h) && this.f99501f.getIsActive()) {
                l3.d0.f(this.f99502g, 0, 1, null);
                f0.f0(this.f99503h, false);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f99501f, this.f99502g, this.f99503h, eVar);
        }
    }

    public static final void A(final f3.m mVar, final SearchBarData searchBarData, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-993827129);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(searchBarData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-993827129, i17, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBar (SearchBar.kt:96)");
            }
            Function0.c(y2.m.d(-844596065, true, new er.p() { // from class: j50.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.B(mVar, searchBarData, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        final f3.m mVar2 = mVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j50.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.C(mVar2, searchBarData, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f3.m mVar, SearchBarData searchBarData, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-844596065, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBar.<anonymous> (SearchBar.kt:98)");
            }
            d0(mVar, searchBarData, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(f3.m mVar, SearchBarData searchBarData, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        A(mVar, searchBarData, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void D(final SearchBarData searchBarData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-228970521);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(searchBarData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-228970521, i16, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarBackIcon (SearchBar.kt:196)");
            }
            if (searchBarData.getIsActive()) {
                rVarH.X(-852632433);
                f3.c cVarE = f3.c.INSTANCE.e();
                f3.m mVarT = androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                Object objE = rVarH.E();
                p076m2.r.Companion companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: j50.s
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f0.E((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarD = n4.v.d(mVarT, false, (er.l) objE, 1, null);
                w0 w0VarI = d1.r.i(cVarE, false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarD);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                d1.x xVar = d1.x.f39368a;
                int i17 = jz.a.U;
                Label labelR = c70.a.f23835a.a().R();
                a aVar = a.f99486a;
                boolean z15 = (i16 & 14) == 4;
                Object objE2 = rVarH.E();
                if (z15 || objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: j50.t
                        @Override // er.a
                        public final Object a() {
                            return f0.F(searchBarData);
                        }
                    };
                    rVarH.v(objE2);
                }
                i30.g.f(new ButtonIconData(null, i17, aVar, null, labelR, (er.a) objE2, 9, null), false, false, rVarH, 0, 6);
                rVarH.x();
            } else {
                rVarH.X(-859768261);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j50.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.G(searchBarData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(n4.i0 i0Var) {
        n4.f0.I0(i0Var, -2.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(SearchBarData searchBarData) {
        searchBarData.c().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(SearchBarData searchBarData, int i15, p076m2.r rVar, int i16) {
        D(searchBarData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void H(final SearchBarData searchBarData, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1174272975);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(searchBarData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1174272975, i16, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarClearIcon (SearchBar.kt:220)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: j50.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.I((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            if (!searchBarData.getIsActive() || searchBarData.getQuery().length() <= 0) {
                rVarH.X(1988568109);
            } else {
                rVarH.X(1996451998);
                f3.c cVarE = companion3.e();
                f3.m mVarT = androidx.compose.foundation.layout.d.t(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                w0 w0VarI2 = d1.r.i(cVarE, false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarT);
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
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                int i17 = jz.a.Y;
                Label labelC = c70.a.f23835a.a().C();
                b bVar = b.f99487a;
                boolean z15 = ((i16 & 14) == 4) | ((i16 & 112) == 32);
                Object objE2 = rVarH.E();
                if (z15 || objE2 == companion2.a()) {
                    objE2 = new er.a() { // from class: j50.p
                        @Override // er.a
                        public final Object a() {
                            return f0.J(searchBarData, aVar);
                        }
                    };
                    rVarH.v(objE2);
                }
                i30.g.f(new ButtonIconData(null, i17, bVar, null, labelC, (er.a) objE2, 9, null), false, false, rVarH, MLKEMEngine.KyberPolyBytes, 2);
                rVarH.x();
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j50.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.K(searchBarData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(n4.i0 i0Var) {
        n4.f0.I0(i0Var, 2.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(SearchBarData searchBarData, er.a aVar) {
        searchBarData.d().a();
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(SearchBarData searchBarData, er.a aVar, int i15, p076m2.r rVar, int i16) {
        H(searchBarData, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void L(final p3 p3Var, final SearchBarData searchBarData, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        w5 w5Var;
        f3.m mVarD;
        p076m2.r rVarH = rVar.h(990876979);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(p3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(searchBarData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(d0Var) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(990876979, i16, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInput (SearchBar.kt:250)");
            }
            final l3.o oVar = (l3.o) rVarH.N(g1.g());
            int i17 = i16 & 112;
            boolean z15 = i17 == 32;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: j50.c0
                    @Override // er.a
                    public final Object a() {
                        return f0.M(searchBarData);
                    }
                };
                rVarH.v(objE);
            }
            final er.a aVar = (er.a) objE;
            Object objE2 = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = b1.k.a();
                rVarH.v(objE2);
            }
            b1.l lVar = (b1.l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = b1.k.a();
                rVarH.v(objE3);
            }
            final b1.l lVar2 = (b1.l) objE3;
            f6<Boolean> f6VarA2 = b1.f.a(lVar2, rVarH, 6);
            yw.b bVarU = t70.i.u((Context) rVarH.N(AndroidCompositionLocals_androidKt.c()));
            final er.p<p076m2.r, Integer, i0> pVarE = j50.d.f99464a.e();
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE4);
            }
            a3 a3Var = (a3) objE4;
            Boolean boolValueOf = Boolean.valueOf(searchBarData.getIsActive());
            boolean z16 = i17 == 32;
            Object objE5 = rVarH.E();
            if (z16 || objE5 == companion.a()) {
                objE5 = new c(searchBarData, a3Var, null);
                rVarH.v(objE5);
            }
            p076m2.Function0.d(boolValueOf, (er.p) objE5, rVarH, 0);
            boolean z17 = !searchBarData.getIsActive() && f6VarA2.getValue().booleanValue();
            Boolean boolValueOf2 = Boolean.valueOf(searchBarData.getIsActive());
            boolean zA = rVarH.a(z17) | rVarH.G(oVar);
            Object objE6 = rVarH.E();
            if (zA || objE6 == companion.a()) {
                w5Var = null;
                objE6 = new d(z17, oVar, null);
                rVarH.v(objE6);
            } else {
                w5Var = null;
            }
            p076m2.Function0.d(boolValueOf2, (er.p) objE6, rVarH, 0);
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = c6.e(Boolean.FALSE, w5Var, 2, w5Var);
                rVarH.v(objE7);
            }
            final a3 a3Var2 = (a3) objE7;
            Integer searchResultsCount = (c0(a3Var2) && searchBarData.getIsActive() && searchBarData.getQuery().length() != 0) ? searchBarData.getSearchResultsCount() : null;
            boolean zW = rVarH.W(searchResultsCount) | rVarH.G(bVarU);
            Object objE8 = rVarH.E();
            if (zW || objE8 == companion.a()) {
                objE8 = new e(searchResultsCount, bVarU, null);
                rVarH.v(objE8);
            }
            p076m2.Function0.d(searchResultsCount, (er.p) objE8, rVarH, 0);
            boolean z18 = i17 == 32;
            Object objE9 = rVarH.E();
            if (z18 || objE9 == companion.a()) {
                objE9 = new er.l() { // from class: j50.e0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.O(searchBarData, a3Var2, (String) obj);
                    }
                };
                rVarH.v(objE9);
            }
            final er.l lVar3 = (er.l) objE9;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarC = p3.c(p3Var, companion2, 1.0f, false, 2, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarK = androidx.compose.foundation.layout.d.k(mVarC, aVar2.b(rVarH, i18).getSpacing700(), 0.0f, 2, null);
            Object objE10 = rVarH.E();
            if (objE10 == companion.a()) {
                objE10 = new er.l() { // from class: j50.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.P((n4.i0) obj);
                    }
                };
                rVarH.v(objE10);
            }
            f3.m mVarD2 = n4.v.d(mVarK, false, (er.l) objE10, 1, null);
            if (searchBarData.getIsActive()) {
                rVarH.X(-91596406);
                mVarD = t70.s.x(companion2, f6VarA2.getValue().booleanValue() && a0(a3Var), aVar2.b(rVarH, i18).getSpacing150(), 0.0f, 4, null);
                rVarH.R();
            } else {
                rVarH.X(-91392767);
                mVarD = w0.i.d(k3.f.a(t70.s.x(companion2, f6VarA.getValue().booleanValue(), aVar2.b(rVarH, i18).getSpacing400(), 0.0f, 4, null), oi.f57146a.a(rVarH, oi.f57153h)), aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null);
                rVarH.R();
            }
            f3.m mVarA = l3.g0.a(mVarD2.u(mVarD), d0Var);
            r1 r1VarE = t70.s.E(0.0f, rVarH, 0, 1);
            boolean zW2 = rVarH.W(aVar) | rVarH.G(oVar);
            Object objE11 = rVarH.E();
            if (zW2 || objE11 == companion.a()) {
                objE11 = new er.a() { // from class: j50.h
                    @Override // er.a
                    public final Object a() {
                        return f0.Q(aVar, oVar);
                    }
                };
                rVarH.v(objE11);
            }
            f3.m mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, false, null, null, (er.a) objE11, 28, null);
            boolean zW3 = rVarH.W(aVar);
            Object objE12 = rVarH.E();
            if (zW3 || objE12 == companion.a()) {
                objE12 = new er.l() { // from class: j50.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.R(aVar, (l0) obj);
                    }
                };
                rVarH.v(objE12);
            }
            f3.m mVarA2 = l3.e.a(mVarL, (er.l) objE12);
            boolean zG = rVarH.G(oVar) | (i17 == 32);
            Object objE13 = rVarH.E();
            if (zG || objE13 == companion.a()) {
                objE13 = new f(searchBarData, oVar, a3Var);
                rVarH.v(objE13);
            }
            f3.m mVarB = y3.f.b(mVarA2, (er.l) objE13);
            y2.f fVarD = y2.m.d(-193831440, true, new er.q() { // from class: j50.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.S(searchBarData, pVarE, lVar2, (er.p) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54);
            boolean zB = bVarU.b();
            if (zB) {
                rVarH.X(-88794936);
                String query = searchBarData.getQuery();
                TextStyle textStyleE = TextStyle.e(aVar2.f(rVarH, i18).b(), aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                SolidColor solidColor = new SolidColor(aVar2.a(rVarH, i18).getBase().getPrimary(), null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, v4.t.INSTANCE.g(), null, null, null, 119, null);
                Object objE14 = rVarH.E();
                if (objE14 == companion.a()) {
                    objE14 = new er.l() { // from class: j50.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f0.V((k3) obj);
                        }
                    };
                    rVarH.v(objE14);
                }
                l3 l3Var = new l3(null, null, null, null, (er.l) objE14, null, 47, null);
                boolean zW4 = rVarH.W(lVar3);
                Object objE15 = rVarH.E();
                if (zW4 || objE15 == companion.a()) {
                    objE15 = new er.l() { // from class: j50.l
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f0.W(lVar3, (String) obj);
                        }
                    };
                    rVarH.v(objE15);
                }
                p079n1.u.h(query, (er.l) objE15, mVarB, false, false, textStyleE, keyboardOptions, l3Var, true, 0, 0, null, null, lVar2, solidColor, fVarD, rVarH, 102236160, 199680, 7704);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVar2 = rVarH;
                if (zB) {
                    rVar2.X(-1249791806);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-88166783);
                TextFieldValue textFieldValue = new TextFieldValue(searchBarData.getQuery(), a4.a(searchBarData.getQuery().length()), (z3) null, 4, (fr.k) null);
                TextStyle textStyleE2 = TextStyle.e(aVar2.f(rVar2, i18).b(), aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                SolidColor solidColor2 = new SolidColor(aVar2.a(rVar2, i18).getBase().getPrimary(), null);
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, 0, v4.t.INSTANCE.g(), null, null, null, 119, null);
                Object objE16 = rVar2.E();
                if (objE16 == companion.a()) {
                    objE16 = new er.l() { // from class: j50.m
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f0.X((k3) obj);
                        }
                    };
                    rVar2.v(objE16);
                }
                l3 l3Var2 = new l3(null, null, null, null, (er.l) objE16, null, 47, null);
                boolean zW5 = rVar2.W(lVar3);
                Object objE17 = rVar2.E();
                if (zW5 || objE17 == companion.a()) {
                    objE17 = new er.l() { // from class: j50.n
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f0.Y(lVar3, (TextFieldValue) obj);
                        }
                    };
                    rVar2.v(objE17);
                }
                p079n1.u.i(textFieldValue, (er.l) objE17, mVarB, false, false, textStyleE2, keyboardOptions2, l3Var2, true, 0, 0, null, null, lVar2, solidColor2, fVarD, rVar2, 102236160, 199680, 7704);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j50.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.Z(p3Var, searchBarData, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(SearchBarData searchBarData) {
        searchBarData.c().b(Boolean.TRUE);
        return i0.f148189a;
    }

    private static final void N(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(SearchBarData searchBarData, a3 a3Var, String str) {
        N(a3Var, true);
        searchBarData.e().b(searchBarData.getQueryFormatter().b(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(n4.i0 i0Var) {
        n4.g0.a(i0Var, true);
        n4.f0.y0(i0Var, "SearchBarComponent");
        n4.f0.c0(i0Var, c70.a.f23835a.a().f0().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(er.a aVar, l3.o oVar) {
        aVar.a();
        oVar.h(l3.g.INSTANCE.e());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(er.a aVar, l0 l0Var) {
        if (l0Var.b()) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final SearchBarData searchBarData, er.p pVar, b1.l lVar, er.p pVar2, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(pVar2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-193831440, i16, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInput.<anonymous> (SearchBar.kt:370)");
            }
            pn pnVar = pn.f57316a;
            String query = searchBarData.getQuery();
            e1 e1VarC = e1.INSTANCE.c();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarV = pn.v(pnVar, aVar.b(rVar, i17).getSpacing50(), 0.0f, aVar.b(rVar, i17).getSpacing50(), 0.0f, 10, null);
            int i18 = i16;
            hn hnVarB = oi.f57146a.b(aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, aVar.a(rVar, i17).getBase().getPrimary(), null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, rVar, 0, 0, oi.f57153h << 9, 8388596);
            y2.f fVarD = null;
            final er.p pVar3 = !searchBarData.getIsActive() ? pVar : null;
            if (pVar3 == null) {
                rVar.X(-1995210299);
            } else {
                rVar.X(-1995210298);
                fVarD = y2.m.d(-1875971330, true, new er.p() { // from class: j50.v
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f0.T(pVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54);
            }
            rVar.R();
            pnVar.m(query, pVar2, true, true, e1VarC, lVar, false, null, y2.m.d(1357559736, true, new er.p() { // from class: j50.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.U(searchBarData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), fVarD, null, null, null, null, null, hnVarB, d3VarV, j50.d.f99464a.d(), rVar, ((i18 << 3) & 112) | 100887936, 113246208, 31936);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1875971330, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInput.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:402)");
            }
            f3.m mVarF = o2.f(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(SearchBarData searchBarData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1357559736, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInput.<anonymous>.<anonymous> (SearchBar.kt:387)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            j70.h.g(null, null, searchBarData.getPlaceholder(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, true, null, rVar, 0, 24576, 3072, 24625115);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(k3 k3Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(er.l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(k3 k3Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(er.l lVar, TextFieldValue textFieldValue) {
        lVar.b(textFieldValue.m());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(p3 p3Var, SearchBarData searchBarData, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        L(p3Var, searchBarData, d0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final boolean a0(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    private static final boolean c0(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void d0(final f3.m mVar, final SearchBarData searchBarData, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        f3.m mVarD;
        float zero;
        Object obj;
        p076m2.r rVarH = rVar.h(-139551836);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(searchBarData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-139551836, i16, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInternal (SearchBar.kt:111)");
            }
            Boolean bool = (Boolean) rVarH.N(u1.a());
            bool.booleanValue();
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l3.d0();
                rVarH.v(objE);
            }
            l3.d0 d0Var = (l3.d0) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(Boolean.TRUE, null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var = (a3) objE2;
            Boolean boolValueOf = Boolean.valueOf(e0(a3Var) || searchBarData.getIsActive());
            int i17 = i16 & 112;
            boolean z15 = i17 == 32;
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new g(searchBarData, d0Var, a3Var, null);
                rVarH.v(objE3);
            }
            p076m2.Function0.d(boolValueOf, (er.p) objE3, rVarH, 0);
            if (searchBarData.getIsActive()) {
                rVarH.X(140108188);
                mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
                rVarH.R();
            } else {
                rVarH.X(140209000);
                rVarH.R();
                mVarD = mVar;
            }
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            int i18 = i16;
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.c.InterfaceC1317c interfaceC1317cI = companion2.i();
            f3.m.Companion companion4 = f3.m.INSTANCE;
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new er.l() { // from class: j50.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.g0((n4.i0) obj2);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(n4.v.d(companion4, false, (er.l) objE4, 1, null), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarR = d1.a3.r(mVarH, 0.0f, aVar.b(rVarH, i19).getSpacing100(), 0.0f, 0.0f, 13, null);
            if (searchBarData.getIsActive()) {
                rVarH.X(780092017);
                zero = aVar.b(rVarH, i19).getSpacing50();
                rVarH.R();
            } else {
                rVarH.X(780152374);
                zero = aVar.b(rVarH, i19).getZero();
                rVarH.R();
            }
            f3.m mVarP = d1.a3.p(mVarR, zero, 0.0f, 2, null);
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            int i25 = (i18 >> 3) & 14;
            D(searchBarData, rVarH, i25);
            L(q3Var, searchBarData, d0Var, rVarH, 390 | i17);
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = new er.a() { // from class: j50.y
                    @Override // er.a
                    public final Object a() {
                        return f0.h0(a3Var);
                    }
                };
                rVarH.v(objE5);
            }
            H(searchBarData, (er.a) objE5, rVarH, i25 | 48);
            rVarH.x();
            if (searchBarData.getIsActive()) {
                rVarH.X(780524312);
                final int i26 = -hr.a.d(t70.s.H(c5.h.n(4), rVarH, 6));
                Object objE6 = rVarH.E();
                if (objE6 == companion.a()) {
                    obj = objE6;
                    d1 d1Var = new d1(bool);
                    d1Var.h(Boolean.TRUE);
                    rVarH.v(d1Var);
                    obj = d1Var;
                }
                obj = objE6;
                d1 d1Var2 = (d1) obj;
                boolean zC = rVarH.c(i26);
                Object objE7 = rVarH.E();
                if (zC || objE7 == companion.a()) {
                    objE7 = new er.l() { // from class: j50.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return Integer.valueOf(f0.i0(i26, ((Integer) obj2).intValue()));
                        }
                    };
                    rVarH.v(objE7);
                }
                p114t0.k.d(i0Var, d1Var2, null, p114t0.a0.D(null, (er.l) objE7, 1, null).c(p114t0.a0.n(u0.m.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6, null), 0.2f)), p114t0.a0.G(null, null, 3, null).c(p114t0.a0.A(null, null, false, null, 15, null)).c(p114t0.a0.q(null, 0.0f, 3, null)), null, y2.m.d(-1053772083, true, new er.q() { // from class: j50.a0
                    @Override // er.q
                    public final Object w(Object obj2, Object obj3, Object obj4) {
                        return f0.j0(pVar, (p114t0.l) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                    }
                }, rVarH, 54), rVarH, 1597446 | (d1.f193575d << 3), 18);
            } else {
                rVarH.X(774293064);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j50.b0
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return f0.k0(mVar, searchBarData, pVar, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        n4.g0.a(i0Var, true);
        n4.f0.y0(i0Var, "SearchBarComponentContainer");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(a3 a3Var) {
        f0(a3Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i0(int i15, int i16) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(er.p pVar, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1053772083, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.SearchBarInternal.<anonymous>.<anonymous> (SearchBar.kt:178)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, companion);
        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
        n6.i(rVarC, w0VarA, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        d1.i0 i0Var = d1.i0.f39176a;
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        d1.r.b(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(w0.i.d(d1.a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing100(), 0.0f, 0.0f, 13, null), aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), null, 2, null), 0.0f, 1, null), aVar.b(rVar, i16).getStrokeWidth()), rVar, 0);
        pVar.B(rVar, 0);
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(f3.m mVar, SearchBarData searchBarData, er.p pVar, int i15, p076m2.r rVar, int i16) {
        d0(mVar, searchBarData, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
