package p079n1;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import c5.d;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import fr.w;
import k3.f;
import m3.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p143z0.C6466x2;
import p143z0.a2;
import p143z0.h2;
import p143z0.n2;
import p143z0.v2;
import q4.TextLayoutResult;
import tq.e;
import v4.TextFieldValue;
import v4.TransformedText;
import v4.e1;
import w0.g2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001e\u001a\u00020\u001d*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lf3/m;", "Ln1/a6;", "scrollerPosition", "Lb1/l;", "interactionSource", "", "enabled", "Lw0/g2;", "overscrollEffect", "f", "(Lf3/m;Ln1/a6;Lb1/l;ZLw0/g2;)Lf3/m;", "Lv4/t0;", "textFieldValue", "Lv4/e1;", "visualTransformation", "Lkotlin/Function0;", "Ln1/k6;", "textLayoutResultProvider", "d", "(Lf3/m;Ln1/a6;Lv4/t0;Lv4/e1;Ler/a;)Lf3/m;", "Lc5/d;", "", "cursorOffset", "Lv4/c1;", "transformedText", "Lq4/t3;", "textLayoutResult", "rtl", "textFieldWidth", "Lm3/g;", "e", "(Lc5/d;ILv4/c1;Lq4/t3;ZI)Lm3/g;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u5 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130480a;

        static {
            int[] iArr = new int[a2.values().length];
            try {
                iArr[a2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130480a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a6 f130481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1.l f130482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f130483d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a6 a6Var, b1.l lVar, boolean z15) {
            super(1);
            this.f130481b = a6Var;
            this.f130482c = lVar;
            this.f130483d = z15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("textFieldScrollable");
            v1Var.getProperties().b("scrollerPosition", this.f130481b);
            v1Var.getProperties().b("interactionSource", this.f130482c);
            v1Var.getProperties().b("enabled", Boolean.valueOf(this.f130483d));
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"n1/u5$c", "Lz0/v2;", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/h2;", "Ltq/e;", "Loq/i0;", "", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "", "Lm2/f6;", "e", "()Z", "canScrollForward", "c", "d", "canScrollBackward", "isScrollInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ v2 f130484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f6 canScrollForward;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final f6 canScrollBackward;

        c(v2 v2Var, final a6 a6Var) {
            this.f130484a = v2Var;
            this.canScrollForward = x5.d(new er.a() { // from class: n1.v5
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(u5.c.j(a6Var));
                }
            });
            this.canScrollBackward = x5.d(new er.a() { // from class: n1.w5
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(u5.c.i(a6Var));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(a6 a6Var) {
            return a6Var.h() > 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(a6 a6Var) {
            return a6Var.h() < a6Var.g();
        }

        @Override // p143z0.v2
        public Object b(z1 z1Var, p<? super h2, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) {
            return this.f130484a.b(z1Var, pVar, eVar);
        }

        @Override // p143z0.v2
        public boolean c() {
            return this.f130484a.c();
        }

        @Override // p143z0.v2
        public boolean d() {
            return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
        }

        @Override // p143z0.v2
        public boolean e() {
            return ((Boolean) this.canScrollForward.getValue()).booleanValue();
        }

        @Override // p143z0.v2
        public float f(float delta) {
            return this.f130484a.f(delta);
        }
    }

    public static final m d(m mVar, a6 a6Var, TextFieldValue textFieldValue, e1 e1Var, er.a<k6> aVar) {
        m o7Var;
        a2 a2VarJ = a6Var.j();
        int i15 = a6Var.i(textFieldValue.getSelection());
        a6Var.m(textFieldValue.getSelection());
        TransformedText transformedTextC = m7.c(e1Var, textFieldValue.getText());
        int i16 = a.f130480a[a2VarJ.ordinal()];
        if (i16 == 1) {
            o7Var = new o7(a6Var, i15, transformedTextC, aVar);
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            o7Var = new a3(a6Var, i15, transformedTextC, aVar);
        }
        return f.b(mVar).u(o7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g e(d dVar, int i15, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z15, int i16) {
        g gVarA;
        if (textLayoutResult == null || (gVarA = textLayoutResult.e(transformedText.getOffsetMapping().e(i15))) == null) {
            gVarA = g.INSTANCE.a();
        }
        g gVar = gVarA;
        int iX0 = dVar.X0(p4.a());
        return g.d(gVar, z15 ? (i16 - gVar.getLeft()) - iX0 : gVar.getLeft(), 0.0f, z15 ? i16 - gVar.getLeft() : iX0 + gVar.getLeft(), 0.0f, 10, null);
    }

    public static final m f(m mVar, final a6 a6Var, final b1.l lVar, final boolean z15, final g2 g2Var) {
        return j.b(mVar, t1.b() ? new b(a6Var, lVar, z15) : t1.a(), new q() { // from class: n1.s5
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u5.g(a6Var, z15, g2Var, lVar, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m g(final a6 a6Var, boolean z15, g2 g2Var, b1.l lVar, m mVar, r rVar, int i15) {
        rVar.X(-2137546592);
        if (t.k()) {
            t.o(-2137546592, i15, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
        }
        boolean z16 = a6Var.j() == a2.Vertical || !(rVar.N(g1.l()) == c5.t.Rtl);
        boolean zW = rVar.W(a6Var);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: n1.t5
                @Override // er.l
                public final Object b(Object obj) {
                    return Float.valueOf(u5.h(a6Var, ((Float) obj).floatValue()));
                }
            };
            rVar.v(objE);
        }
        v2 v2VarC = C6466x2.c((l) objE, rVar, 0);
        boolean zW2 = rVar.W(v2VarC) | rVar.W(a6Var);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            objE2 = new c(v2VarC, a6Var);
            rVar.v(objE2);
        }
        m mVarK = n2.k(m.INSTANCE, (c) objE2, a6Var.j(), g2Var, z15 && a6Var.g() != 0.0f, z16, null, lVar, null, 160, null);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(a6 a6Var, float f15) {
        float fH = a6Var.h() + f15;
        if (fH > a6Var.g()) {
            f15 = a6Var.g() - a6Var.h();
        } else if (fH < 0.0f) {
            f15 = -a6Var.h();
        }
        a6Var.l(a6Var.h() + f15);
        return f15;
    }
}
