package v82;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La82/a;", "Lv82/a;", "a", "(La82/a;)Lv82/a;", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204494a;

        static {
            int[] iArr = new int[a82.a.values().length];
            try {
                iArr[a82.a.VOIVODESHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a82.a.CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a82.a.STREET_BUILDING_AND_APARTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a82.a.ZIP_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f204494a = iArr;
        }
    }

    public static final v82.a a(a82.a aVar) {
        int i15 = a.f204494a[aVar.ordinal()];
        if (i15 == 1) {
            return v82.a.VOIVODESHIP;
        }
        if (i15 == 2) {
            return v82.a.CITY;
        }
        if (i15 == 3) {
            return v82.a.STREET_BUILDING_AND_APARTMENT;
        }
        if (i15 == 4) {
            return v82.a.ZIP_CODE;
        }
        throw new p();
    }
}
