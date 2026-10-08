package b00;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lb00/f;", "", "d", "c", "a", "b", "Lb00/f$a;", "Lb00/f$b;", "Lb00/f$c;", "Lb00/f$d;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: b00.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb00/f$b;", "Lb00/f;", "Landroid/graphics/Matrix;", "matrix", "<init>", "(Landroid/graphics/Matrix;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Matrix implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final android.graphics.Matrix matrix;

        public Matrix(android.graphics.Matrix matrix) {
            this.matrix = matrix;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final android.graphics.Matrix getMatrix() {
            return this.matrix;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Matrix) && fr.t.c(this.matrix, ((Matrix) other).matrix);
        }

        public int hashCode() {
            return this.matrix.hashCode();
        }

        public String toString() {
            return "Matrix(matrix=" + this.matrix + ')';
        }
    }

    /* JADX INFO: renamed from: b00.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lb00/f$c;", "Lb00/f;", "", "maxSide", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReduceDimension implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxSide;

        public ReduceDimension(int i15) {
            this.maxSide = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getMaxSide() {
            return this.maxSide;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReduceDimension) && this.maxSide == ((ReduceDimension) other).maxSide;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxSide);
        }

        public String toString() {
            return "ReduceDimension(maxSide=" + this.maxSide + ')';
        }
    }

    /* JADX INFO: renamed from: b00.f$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb00/f$d;", "Lb00/f;", "", "degrees", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rotate implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float degrees;

        public Rotate(float f15) {
            this.degrees = f15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getDegrees() {
            return this.degrees;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rotate) && Float.compare(this.degrees, ((Rotate) other).degrees) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.degrees);
        }

        public String toString() {
            return "Rotate(degrees=" + this.degrees + ')';
        }
    }

    /* JADX INFO: renamed from: b00.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lb00/f$a;", "Lb00/f;", "", "left", "top", "width", "height", "Landroid/graphics/Matrix;", "matrix", "<init>", "(IIIILandroid/graphics/Matrix;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "c", "e", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Crop implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int left;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int top;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int width;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int height;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final android.graphics.Matrix matrix;

        public Crop(int i15, int i16, int i17, int i18, android.graphics.Matrix matrix) {
            this.left = i15;
            this.top = i16;
            this.width = i17;
            this.height = i18;
            this.matrix = matrix;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final android.graphics.Matrix getMatrix() {
            return this.matrix;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Crop)) {
                return false;
            }
            Crop crop = (Crop) other;
            return this.left == crop.left && this.top == crop.top && this.width == crop.width && this.height == crop.height && fr.t.c(this.matrix, crop.matrix);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.matrix.hashCode();
        }

        public String toString() {
            return "Crop(left=" + this.left + ", top=" + this.top + ", width=" + this.width + ", height=" + this.height + ", matrix=" + this.matrix + ')';
        }

        public /* synthetic */ Crop(int i15, int i16, int i17, int i18, android.graphics.Matrix matrix, int i19, fr.k kVar) {
            this(i15, i16, i17, i18, (i19 & 16) != 0 ? new android.graphics.Matrix() : matrix);
        }
    }
}
