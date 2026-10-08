package qw3;

import fr.k;
import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qw3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lqw3/f;", "", "", "corners", "center", "initialCorners", "initialCenter", "<init>", "([F[F[F[F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "()[F", "b", "c", "d", "e", "([F[F[F[F)Lqw3/f;", "", "toString", "()Ljava/lang/String;", "[F", "g", "getCenter", "getInitialCorners", "getInitialCenter", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float[] corners;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float[] center;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float[] initialCorners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float[] initialCenter;

    public ImageData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ImageData f(ImageData imageData, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            fArr = imageData.corners;
        }
        if ((i15 & 2) != 0) {
            fArr2 = imageData.center;
        }
        if ((i15 & 4) != 0) {
            fArr3 = imageData.initialCorners;
        }
        if ((i15 & 8) != 0) {
            fArr4 = imageData.initialCenter;
        }
        return imageData.e(fArr, fArr2, fArr3, fArr4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getCorners() {
        return this.corners;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float[] getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float[] getInitialCorners() {
        return this.initialCorners;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float[] getInitialCenter() {
        return this.initialCenter;
    }

    public final ImageData e(float[] corners, float[] center, float[] initialCorners, float[] initialCenter) {
        return new ImageData(corners, center, initialCorners, initialCenter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!t.c(ImageData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        ImageData imageData = (ImageData) other;
        return Arrays.equals(this.corners, imageData.corners) && Arrays.equals(this.center, imageData.center) && Arrays.equals(this.initialCorners, imageData.initialCorners) && Arrays.equals(this.initialCenter, imageData.initialCenter);
    }

    public final float[] g() {
        return this.corners;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.corners) * 31) + Arrays.hashCode(this.center)) * 31) + Arrays.hashCode(this.initialCorners)) * 31) + Arrays.hashCode(this.initialCenter);
    }

    public String toString() {
        return "ImageData(corners=" + Arrays.toString(this.corners) + ", center=" + Arrays.toString(this.center) + ", initialCorners=" + Arrays.toString(this.initialCorners) + ", initialCenter=" + Arrays.toString(this.initialCenter) + ')';
    }

    public ImageData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.corners = fArr;
        this.center = fArr2;
        this.initialCorners = fArr3;
        this.initialCenter = fArr4;
    }

    public /* synthetic */ ImageData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i15, k kVar) {
        this((i15 & 1) != 0 ? new float[8] : fArr, (i15 & 2) != 0 ? new float[2] : fArr2, (i15 & 4) != 0 ? new float[8] : fArr3, (i15 & 8) != 0 ? new float[2] : fArr4);
    }
}
