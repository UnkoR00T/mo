package u93;

import oq.p;
import p071kotlin.Metadata;
import v93.WarningLevel;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv93/m;", "Lbb3/a;", "a", "(Lv93/m;)Lbb3/a;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: u93.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5115a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196638a;

        static {
            int[] iArr = new int[WarningLevel.a.values().length];
            try {
                iArr[WarningLevel.a.LEVEL_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WarningLevel.a.LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WarningLevel.a.LEVEL_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WarningLevel.a.LEVEL_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WarningLevel.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f196638a = iArr;
        }
    }

    public static final bb3.a a(WarningLevel warningLevel) {
        int i15 = C5115a.f196638a[warningLevel.getType().ordinal()];
        if (i15 == 1) {
            return bb3.a.LEVEL_1;
        }
        if (i15 == 2) {
            return bb3.a.LEVEL_2;
        }
        if (i15 == 3) {
            return bb3.a.LEVEL_3;
        }
        if (i15 == 4) {
            return bb3.a.LEVEL_4;
        }
        if (i15 == 5) {
            return null;
        }
        throw new p();
    }
}
