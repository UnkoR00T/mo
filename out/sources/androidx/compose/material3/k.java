package androidx.compose.material3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/k;", "", "Landroidx/compose/material3/k$a;", "focus", "<init>", "(Landroidx/compose/material3/k$a;)V", "a", "Landroidx/compose/material3/k$a;", "()Landroidx/compose/material3/k$a;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a focus;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/k$a;", "", "<init>", "()V", "b", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.compose.material3.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/k$a$a;", "Landroidx/compose/material3/k$a;", "Lc5/h;", "outerStrokeInset", "outerStrokeWidth", "innerStrokeInset", "innerStrokeWidth", "<init>", "(FFFFLfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "c", "()F", "b", "d", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0211a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final float outerStrokeInset;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final float outerStrokeWidth;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final float innerStrokeInset;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final float innerStrokeWidth;

            public /* synthetic */ C0211a(float f15, float f16, float f17, float f18, fr.k kVar) {
                this(f15, f16, f17, f18);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getInnerStrokeInset() {
                return this.innerStrokeInset;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getInnerStrokeWidth() {
                return this.innerStrokeWidth;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getOuterStrokeInset() {
                return this.outerStrokeInset;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getOuterStrokeWidth() {
                return this.outerStrokeWidth;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0211a)) {
                    return false;
                }
                C0211a c0211a = (C0211a) other;
                return c5.h.p(this.outerStrokeInset, c0211a.outerStrokeInset) && c5.h.p(this.outerStrokeWidth, c0211a.outerStrokeWidth) && c5.h.p(this.innerStrokeInset, c0211a.innerStrokeInset) && c5.h.p(this.innerStrokeWidth, c0211a.innerStrokeWidth);
            }

            public int hashCode() {
                return (((((c5.h.q(this.outerStrokeInset) * 31) + c5.h.q(this.outerStrokeWidth)) * 31) + c5.h.q(this.innerStrokeInset)) * 31) + c5.h.q(this.innerStrokeWidth);
            }

            private C0211a(float f15, float f16, float f17, float f18) {
                super(null);
                this.outerStrokeInset = f15;
                this.outerStrokeWidth = f16;
                this.innerStrokeInset = f17;
                this.innerStrokeWidth = f18;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/k$a$b;", "Landroidx/compose/material3/k$a;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {
            public b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public k(a aVar) {
        this.focus = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getFocus() {
        return this.focus;
    }
}
