package b00;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxx/b;", "", "", "a", "(Lxx/b;)Ljava/util/List;", "media_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15652a;

        static {
            int[] iArr = new int[xx.b.values().length];
            try {
                iArr[xx.b.DateTime.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xx.b.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xx.b.DIMENSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15652a = iArr;
        }
    }

    public static final List<String> a(xx.b bVar) {
        int i15 = a.f15652a[bVar.ordinal()];
        if (i15 == 1) {
            return pq.v.q("DateTime", "DateTimeOriginal", "DateTimeDigitized");
        }
        if (i15 == 2) {
            return pq.v.q("GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "T");
        }
        if (i15 == 3) {
            return pq.v.q("ImageWidth", "ImageLength");
        }
        throw new oq.p();
    }
}
