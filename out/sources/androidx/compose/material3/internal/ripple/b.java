package androidx.compose.material3.internal.ripple;

import c5.h;
import fr.k;
import fr.t;
import n3.p1;
import n3.y2;
import p071kotlin.Metadata;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0015\u0017\u001a\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u0013\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/internal/ripple/b;", "", "Landroidx/compose/material3/internal/ripple/b$d;", "press", "Landroidx/compose/material3/internal/ripple/b$b;", "focus", "Landroidx/compose/material3/internal/ripple/b$c;", "hover", "Landroidx/compose/material3/internal/ripple/b$a;", "drag", "<init>", "(Landroidx/compose/material3/internal/ripple/b$d;Landroidx/compose/material3/internal/ripple/b$b;Landroidx/compose/material3/internal/ripple/b$c;Landroidx/compose/material3/internal/ripple/b$a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/material3/internal/ripple/b$d;", "d", "()Landroidx/compose/material3/internal/ripple/b$d;", "b", "Landroidx/compose/material3/internal/ripple/b$b;", "()Landroidx/compose/material3/internal/ripple/b$b;", "c", "Landroidx/compose/material3/internal/ripple/b$c;", "()Landroidx/compose/material3/internal/ripple/b$c;", "Landroidx/compose/material3/internal/ripple/b$a;", "()Landroidx/compose/material3/internal/ripple/b$a;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d press;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC0207b focus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c hover;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a drag;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$a;", "", "<init>", "()V", "a", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$a$a;", "Landroidx/compose/material3/internal/ripple/b$a;", "<init>", "()V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0205a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0205a f9880a = new C0205a();

            private C0205a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$a$b;", "Landroidx/compose/material3/internal/ripple/b$a;", "", "alpha", "<init>", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "()F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0206b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final float alpha;

            public C0206b(float f15) {
                super(null);
                this.alpha = f15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C0206b) && this.alpha == ((C0206b) other).alpha;
            }

            public int hashCode() {
                return Float.hashCode(this.alpha);
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$b;", "", "<init>", "()V", "b", "c", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AbstractC0207b {

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$b$a */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001e\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u001a\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$b$a;", "Landroidx/compose/material3/internal/ripple/b$b;", "Ln3/y2;", "shape", "Lc5/h;", "outerStrokeInset", "outerStrokeWidth", "Ln3/p1;", "outerStrokeColor", "innerStrokeInset", "innerStrokeWidth", "innerStrokeColor", "Lu0/j0;", "", "focusingAnimationSpec", "unfocusingAnimationSpec", "<init>", "(Ln3/y2;FFLn3/p1;FFLn3/p1;Lu0/j0;Lu0/j0;Lfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ln3/y2;", "h", "()Ln3/y2;", "b", "F", "f", "()F", "c", "g", "d", "Ln3/p1;", "e", "()Ln3/p1;", "Lu0/j0;", "()Lu0/j0;", "i", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends AbstractC0207b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final y2 shape;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final float outerStrokeInset;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final float outerStrokeWidth;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final p1 outerStrokeColor;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final float innerStrokeInset;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final float innerStrokeWidth;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final p1 innerStrokeColor;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final j0<Float> focusingAnimationSpec;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final j0<Float> unfocusingAnimationSpec;

            public /* synthetic */ a(y2 y2Var, float f15, float f16, p1 p1Var, float f17, float f18, p1 p1Var2, j0 j0Var, j0 j0Var2, k kVar) {
                this(y2Var, f15, f16, p1Var, f17, f18, p1Var2, j0Var, j0Var2);
            }

            public final j0<Float> a() {
                return this.focusingAnimationSpec;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final p1 getInnerStrokeColor() {
                return this.innerStrokeColor;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getInnerStrokeInset() {
                return this.innerStrokeInset;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getInnerStrokeWidth() {
                return this.innerStrokeWidth;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final p1 getOuterStrokeColor() {
                return this.outerStrokeColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return t.c(this.shape, aVar.shape) && h.p(this.outerStrokeInset, aVar.outerStrokeInset) && h.p(this.outerStrokeWidth, aVar.outerStrokeWidth) && t.c(this.outerStrokeColor, aVar.outerStrokeColor) && h.p(this.innerStrokeInset, aVar.innerStrokeInset) && h.p(this.innerStrokeWidth, aVar.innerStrokeWidth) && t.c(this.innerStrokeColor, aVar.innerStrokeColor) && t.c(this.focusingAnimationSpec, aVar.focusingAnimationSpec) && t.c(this.unfocusingAnimationSpec, aVar.unfocusingAnimationSpec);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getOuterStrokeInset() {
                return this.outerStrokeInset;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getOuterStrokeWidth() {
                return this.outerStrokeWidth;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final y2 getShape() {
                return this.shape;
            }

            public int hashCode() {
                return (((((((((((((((this.shape.hashCode() * 31) + h.q(this.outerStrokeInset)) * 31) + h.q(this.outerStrokeWidth)) * 31) + this.outerStrokeColor.hashCode()) * 31) + h.q(this.innerStrokeInset)) * 31) + h.q(this.innerStrokeWidth)) * 31) + this.innerStrokeColor.hashCode()) * 31) + this.focusingAnimationSpec.hashCode()) * 31) + this.unfocusingAnimationSpec.hashCode();
            }

            public final j0<Float> i() {
                return this.unfocusingAnimationSpec;
            }

            private a(y2 y2Var, float f15, float f16, p1 p1Var, float f17, float f18, p1 p1Var2, j0<Float> j0Var, j0<Float> j0Var2) {
                super(null);
                this.shape = y2Var;
                this.outerStrokeInset = f15;
                this.outerStrokeWidth = f16;
                this.outerStrokeColor = p1Var;
                this.innerStrokeInset = f17;
                this.innerStrokeWidth = f18;
                this.innerStrokeColor = p1Var2;
                this.focusingAnimationSpec = j0Var;
                this.unfocusingAnimationSpec = j0Var2;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$b$b;", "Landroidx/compose/material3/internal/ripple/b$b;", "<init>", "()V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0208b extends AbstractC0207b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0208b f9891a = new C0208b();

            private C0208b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$b$c */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$b$c;", "Landroidx/compose/material3/internal/ripple/b$b;", "", "alpha", "<init>", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "()F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends AbstractC0207b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final float alpha;

            public c(float f15) {
                super(null);
                this.alpha = f15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && this.alpha == ((c) other).alpha;
            }

            public int hashCode() {
                return Float.hashCode(this.alpha);
            }
        }

        public /* synthetic */ AbstractC0207b(k kVar) {
            this();
        }

        private AbstractC0207b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$c;", "", "<init>", "()V", "a", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$c$a;", "Landroidx/compose/material3/internal/ripple/b$c;", "<init>", "()V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f9893a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$c$b;", "Landroidx/compose/material3/internal/ripple/b$c;", "", "alpha", "<init>", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "()F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0209b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final float alpha;

            public C0209b(float f15) {
                super(null);
                this.alpha = f15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C0209b) && this.alpha == ((C0209b) other).alpha;
            }

            public int hashCode() {
                return Float.hashCode(this.alpha);
            }
        }

        public /* synthetic */ c(k kVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$d;", "", "<init>", "()V", "a", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$d$a;", "Landroidx/compose/material3/internal/ripple/b$d;", "<init>", "()V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f9895a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/internal/ripple/b$d$b;", "Landroidx/compose/material3/internal/ripple/b$d;", "", "alpha", "<init>", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "()F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0210b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final float alpha;

            public C0210b(float f15) {
                super(null);
                this.alpha = f15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C0210b) && this.alpha == ((C0210b) other).alpha;
            }

            public int hashCode() {
                return Float.hashCode(this.alpha);
            }
        }

        public /* synthetic */ d(k kVar) {
            this();
        }

        private d() {
        }
    }

    public b(d dVar, AbstractC0207b abstractC0207b, c cVar, a aVar) {
        this.press = dVar;
        this.focus = abstractC0207b;
        this.hover = cVar;
        this.drag = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDrag() {
        return this.drag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC0207b getFocus() {
        return this.focus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getHover() {
        return this.hover;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getPress() {
        return this.press;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return t.c(this.press, bVar.press) && t.c(this.focus, bVar.focus) && t.c(this.hover, bVar.hover) && t.c(this.drag, bVar.drag);
    }

    public int hashCode() {
        return (((((this.press.hashCode() * 31) + this.focus.hashCode()) * 31) + this.hover.hashCode()) * 31) + this.drag.hashCode();
    }
}
