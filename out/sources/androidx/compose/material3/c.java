package androidx.compose.material3;

import androidx.compose.material3.c;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import ju.d2;
import ju.p0;
import k3.e;
import l2.d0;
import l2.k0;
import n3.j2;
import n3.m2;
import n3.u0;
import n3.y2;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p046f2.hn;
import p046f2.of;
import p046f2.pn;
import p046f2.ui;
import p071kotlin.Metadata;
import p114t0.Function1;
import u0.m;
import u0.p;
import u0.s;
import u0.s3;
import z1.SelectionColors;
import z1.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R(\u00105\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/material3/c;", "Lg4/j;", "Lg4/e;", "", "enabled", "isError", "Lb1/j;", "interactionSource", "Lf2/hn;", "colors", "Ln3/y2;", "textFieldShape", "Lc5/h;", "focusedIndicatorWidth", "unfocusedIndicatorWidth", "<init>", "(ZZLb1/j;Lf2/hn;Ln3/y2;FFLfr/k;)V", "Loq/i0;", "M3", "(Ltq/e;)Ljava/lang/Object;", "K3", "()V", "N3", "(ZZLb1/j;Lf2/hn;Ln3/y2;FF)V", "W2", "v", "Z", "w", "x", "Lb1/j;", "y", "F", "z", "A", "focused", "Lju/d2;", "B", "Lju/d2;", "trackFocusStateJob", "C", "Lf2/hn;", "_colors", "Lu0/c;", "Landroidx/compose/ui/graphics/Color;", "Lu0/s;", ip.a.f96138c, "Lu0/c;", "colorAnimatable", "value", "E", "Ln3/y2;", "L3", "(Ln3/y2;)V", "_shape", "Lu0/p;", "widthAnimatable", "Lk3/c;", "G", "Lk3/c;", "drawWithCacheModifierNode", "I3", "()Lf2/hn;", "J3", "()Ln3/y2;", "shape", "R2", "()Z", "shouldAutoInvalidate", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends g4.j implements g4.e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private d2 trackFocusStateJob;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private hn _colors;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private u0.c<Color, s> colorAnimatable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private y2 _shape;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final u0.c<c5.h, p> widthAnimatable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final k3.c drawWithCacheModifierNode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isError;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private b1.j interactionSource;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float focusedIndicatorWidth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float unfocusedIndicatorWidth;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9806e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9806e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = c.this.colorAnimatable;
                if (cVar != null) {
                    Color colorM0boximpl = Color.m0boximpl(c.this.I3().h(c.this.enabled, c.this.isError, c.this.focused));
                    u0.l lVarA = c.this.enabled ? of.a(((androidx.compose.material3.d.Values) g4.f.a(c.this, androidx.compose.material3.d.f9816a.b())).getMotionScheme(), k0.FastEffects) : m.h(0, 1, null);
                    this.f9806e = 1;
                    obj = u0.c.f(cVar, colorM0boximpl, lVarA, null, null, this, 12, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9808e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9808e;
            if (i15 == 0) {
                u.b(obj);
                u0.c cVar = c.this.widthAnimatable;
                c5.h hVarJ = c5.h.j((c.this.focused && c.this.enabled) ? c.this.focusedIndicatorWidth : c.this.unfocusedIndicatorWidth);
                u0.l lVarA = c.this.enabled ? of.a(((androidx.compose.material3.d.Values) g4.f.a(c.this, androidx.compose.material3.d.f9816a.b())).getMotionScheme(), k0.FastSpatial) : m.h(0, 1, null);
                this.f9808e = 1;
                if (u0.c.f(cVar, hVarJ, lVarA, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new b(eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0201c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9810e;

        C0201c(tq.e<? super C0201c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9810e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = c.this;
                this.f9810e = 1;
                if (cVar.M3(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C0201c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new C0201c(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> implements mu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<b1.d> f9812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f9813b;

        d(List<b1.d> list, c cVar) {
            this.f9812a = list;
            this.f9813b = cVar;
        }

        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(b1.i iVar, tq.e<? super i0> eVar) {
            if (iVar instanceof b1.d) {
                this.f9812a.add(iVar);
            } else if (iVar instanceof b1.e) {
                this.f9812a.remove(((b1.e) iVar).getFocus());
            }
            boolean z15 = !this.f9812a.isEmpty();
            if (z15 != this.f9813b.focused) {
                this.f9813b.focused = z15;
                this.f9813b.K3();
            }
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9814e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9814e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = c.this;
                this.f9814e = 1;
                if (cVar.M3(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new e(eVar);
        }
    }

    public /* synthetic */ c(boolean z15, boolean z16, b1.j jVar, hn hnVar, y2 y2Var, float f15, float f16, fr.k kVar) {
        this(z15, z16, jVar, hnVar, y2Var, f15, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l G3(final c cVar, k3.e eVar) {
        float fL2 = eVar.l2(cVar.widthAnimatable.m().getValue());
        m2 m2VarA = u0.a();
        j2.a(m2VarA, cVar.J3().a(eVar.a(), eVar.getLayoutDirection(), eVar));
        m2 m2VarA2 = u0.a();
        m2.r(m2VarA2, new m3.g(0.0f, Float.intBitsToFloat((int) (eVar.a() & BodyPartID.bodyIdMax)) - fL2, Float.intBitsToFloat((int) (eVar.a() >> 32)), Float.intBitsToFloat((int) (eVar.a() & BodyPartID.bodyIdMax))), null, 2, null);
        final m2 m2VarP = m2VarA2.p(m2VarA);
        return eVar.e(new er.l() { // from class: f2.dd
            @Override // er.l
            public final Object b(Object obj) {
                return c.H3(m2VarP, cVar, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H3(m2 m2Var, c cVar, p3.c cVar2) {
        cVar2.H2();
        p3.f.M0(cVar2, m2Var, new SolidColor(cVar.colorAnimatable.m().m20unboximpl(), null), 0.0f, null, null, 0, 60, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hn I3() {
        hn hnVar = this._colors;
        return hnVar == null ? pn.f57316a.w(((androidx.compose.material3.d.Values) g4.f.a(this, androidx.compose.material3.d.f9816a.b())).getColorScheme(), (SelectionColors) g4.f.a(this, g3.c())) : hnVar;
    }

    private final y2 J3() {
        y2 y2Var = this._shape;
        return y2Var == null ? ui.g(((androidx.compose.material3.d.Values) g4.f.a(this, androidx.compose.material3.d.f9816a.b())).getShapes(), d0.f114374a.d()) : y2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3() {
        ju.k.d(M2(), null, null, new a(null), 3, null);
        ju.k.d(M2(), null, null, new b(null), 3, null);
    }

    private final void L3(y2 y2Var) {
        if (t.c(this._shape, y2Var)) {
            return;
        }
        this._shape = y2Var;
        this.drawWithCacheModifierNode.E1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M3(tq.e<? super i0> eVar) {
        this.focused = false;
        Object objA = this.interactionSource.c().a(new d(new ArrayList(), this), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    public final void N3(boolean enabled, boolean isError, b1.j interactionSource, hn colors, y2 textFieldShape, float focusedIndicatorWidth, float unfocusedIndicatorWidth) {
        boolean z15;
        boolean z16 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.isError != isError) {
            this.isError = isError;
            z15 = true;
        }
        if (this.interactionSource != interactionSource) {
            this.interactionSource = interactionSource;
            d2 d2Var = this.trackFocusStateJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.trackFocusStateJob = ju.k.d(M2(), null, null, new e(null), 3, null);
        }
        if (!t.c(this._colors, colors)) {
            this._colors = colors;
            z15 = true;
        }
        if (!t.c(this._shape, textFieldShape)) {
            L3(textFieldShape);
            z15 = true;
        }
        if (!c5.h.p(this.focusedIndicatorWidth, focusedIndicatorWidth)) {
            this.focusedIndicatorWidth = focusedIndicatorWidth;
            z15 = true;
        }
        if (c5.h.p(this.unfocusedIndicatorWidth, unfocusedIndicatorWidth)) {
            z16 = z15;
        } else {
            this.unfocusedIndicatorWidth = unfocusedIndicatorWidth;
        }
        if (z16) {
            K3();
        }
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // f3.m.c
    public void W2() {
        this.trackFocusStateJob = ju.k.d(M2(), null, null, new C0201c(null), 3, null);
        if (this.colorAnimatable == null) {
            long jH = I3().h(this.enabled, this.isError, this.focused);
            this.colorAnimatable = new u0.c<>(Color.m0boximpl(jH), Function1.a(Color.INSTANCE).b(Color.m14getColorSpaceimpl(jH)), null, null, 12, null);
        }
    }

    private c(boolean z15, boolean z16, b1.j jVar, hn hnVar, y2 y2Var, float f15, float f16) {
        this.enabled = z15;
        this.isError = z16;
        this.interactionSource = jVar;
        this.focusedIndicatorWidth = f15;
        this.unfocusedIndicatorWidth = f16;
        this._colors = hnVar;
        this._shape = y2Var;
        this.widthAnimatable = new u0.c<>(c5.h.j((this.focused && this.enabled) ? this.focusedIndicatorWidth : this.unfocusedIndicatorWidth), s3.L(c5.h.INSTANCE), null, null, 12, null);
        this.drawWithCacheModifierNode = (k3.c) n3(k3.k.a(new er.l() { // from class: f2.cd
            @Override // er.l
            public final Object b(Object obj) {
                return c.G3(this.f55489a, (e) obj);
            }
        }));
    }
}
