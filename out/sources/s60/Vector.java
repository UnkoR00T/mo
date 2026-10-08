package s60;

import fr.k;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s60.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Ls60/c;", "", "", "x", "y", "z", "<init>", "(FFF)V", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "c", "", "e", "()[F", "coordinates", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Vector {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Vector f178248e = new Vector(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Vector f178249f = new Vector(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float z;

    /* JADX INFO: renamed from: s60.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls60/c$a;", "", "<init>", "()V", "", "Ls60/c;", "vectors", "b", "([Ls60/c;)Ls60/c;", "ZERO_VECTOR", "Ls60/c;", "a", "()Ls60/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Vector a() {
            return Vector.f178248e;
        }

        public final Vector b(Vector... vectors) {
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            for (Vector vector : vectors) {
                f15 += vector.x;
                f17 += vector.y;
                f16 += vector.z;
            }
            return new Vector(f15, f17, f16);
        }

        private Companion() {
        }
    }

    public Vector(float f15, float f16, float f17) {
        this.x = f15;
        this.y = f16;
        this.z = f17;
    }

    public final float[] e() {
        return new float[]{this.x, this.y, this.z};
    }

    public String toString() {
        return "Vector( " + String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(this.x)}, 1)) + "f, " + String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(this.y)}, 1)) + "f, " + String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(this.z)}, 1)) + "f ),";
    }
}
