package il1;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llk1/a;", "Lil1/a;", "a", "(Llk1/a;)Lil1/a;", "dependentidinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93278a;

        static {
            int[] iArr = new int[lk1.a.values().length];
            try {
                iArr[lk1.a.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lk1.a.SECOND_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lk1.a.LAST_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lk1.a.FAMILY_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lk1.a.BIRTH_PLACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[lk1.a.BIRTH_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[lk1.a.ID_SERIES_AND_NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f93278a = iArr;
        }
    }

    public static final il1.a a(lk1.a aVar) {
        switch (a.f93278a[aVar.ordinal()]) {
            case 1:
                return il1.a.FIRST_NAME;
            case 2:
                return il1.a.SECOND_NAME;
            case 3:
                return il1.a.LAST_NAME;
            case 4:
                return il1.a.FAMILY_NAME;
            case 5:
                return il1.a.BIRTH_PLACE;
            case 6:
                return il1.a.BIRTH_DATE;
            case 7:
                return il1.a.ID_SERIES_AND_NUMBER;
            default:
                throw new p();
        }
    }
}
