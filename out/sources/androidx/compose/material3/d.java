package androidx.compose.material3;

import fr.t;
import p046f2.ColorScheme;
import p046f2.Shapes;
import p046f2.Typography;
import p046f2.g2;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/d;", "", "<init>", "()V", "Lf2/e2;", "a", "(Lm2/r;I)Lf2/e2;", "colorScheme", "Lf2/bs;", "e", "(Lm2/r;I)Lf2/bs;", "typography", "Lf2/si;", "d", "(Lm2/r;I)Lf2/si;", "shapes", "Landroidx/compose/material3/f;", "c", "(Lm2/r;I)Landroidx/compose/material3/f;", "motionScheme", "Lm2/z;", "Landroidx/compose/material3/d$a;", "b", "()Lm2/z;", "LocalMaterialTheme", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9816a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9817b = 0;

    /* JADX INFO: renamed from: androidx.compose.material3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"Landroidx/compose/material3/d$a;", "", "Lf2/e2;", "colorScheme", "Lf2/bs;", "typography", "Lf2/si;", "shapes", "Landroidx/compose/material3/f;", "motionScheme", "<init>", "(Lf2/e2;Lf2/bs;Lf2/si;Landroidx/compose/material3/f;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lf2/e2;", "()Lf2/e2;", "b", "Lf2/bs;", "d", "()Lf2/bs;", "c", "Lf2/si;", "()Lf2/si;", "Landroidx/compose/material3/f;", "()Landroidx/compose/material3/f;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Values {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ColorScheme colorScheme;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Typography typography;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Shapes shapes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f motionScheme;

        public Values() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ColorScheme getColorScheme() {
            return this.colorScheme;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f getMotionScheme() {
            return this.motionScheme;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Shapes getShapes() {
            return this.shapes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Typography getTypography() {
            return this.typography;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || Values.class != other.getClass()) {
                return false;
            }
            Values values = (Values) other;
            return t.c(this.colorScheme, values.colorScheme) && t.c(this.typography, values.typography) && t.c(this.shapes, values.shapes) && t.c(this.motionScheme, values.motionScheme);
        }

        public int hashCode() {
            return (((((this.colorScheme.hashCode() * 31) + this.typography.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.motionScheme.hashCode();
        }

        public String toString() {
            return "Values(colorScheme=" + this.colorScheme + ", typography=" + this.typography + ", shapes=" + this.shapes + ", motionScheme=" + this.motionScheme + ')';
        }

        public Values(ColorScheme colorScheme, Typography typography, Shapes shapes, f fVar) {
            this.colorScheme = colorScheme;
            this.typography = typography;
            this.shapes = shapes;
            this.motionScheme = fVar;
        }

        public /* synthetic */ Values(ColorScheme colorScheme, Typography typography, Shapes shapes, f fVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? g2.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : colorScheme, (i15 & 2) != 0 ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : typography, (i15 & 4) != 0 ? new Shapes(null, null, null, null, null, 31, null) : shapes, (i15 & 8) != 0 ? f.INSTANCE.a() : fVar);
        }
    }

    private d() {
    }

    public final ColorScheme a(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-561618718, i15, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:130)");
        }
        ColorScheme colorScheme = ((Values) rVar.N(b())).getColorScheme();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return colorScheme;
    }

    public final z<Values> b() {
        return e.f9823b;
    }

    public final f c(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-506613891, i15, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:150)");
        }
        f motionScheme = ((Values) rVar.N(b())).getMotionScheme();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return motionScheme;
    }

    public final Shapes d(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(419509830, i15, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:146)");
        }
        Shapes shapes = ((Values) rVar.N(b())).getShapes();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return shapes;
    }

    public final Typography e(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-942794935, i15, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:138)");
        }
        Typography typography = ((Values) rVar.N(b())).getTypography();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return typography;
    }
}
