package ji1;

import ay0.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lay0/e;", "Lji1/a;", "a", "(Lay0/e;)Lji1/a;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103338a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f103338a = iArr;
        }
    }

    public static final ji1.a a(e eVar) {
        switch (a.f103338a[eVar.ordinal()]) {
            case 1:
                return ji1.a.A;
            case 2:
                return ji1.a.B;
            case 3:
                return ji1.a.C;
            case 4:
                return ji1.a.D;
            case 5:
                return ji1.a.E;
            case 6:
                return ji1.a.F;
            default:
                return ji1.a.UNKNOWN;
        }
    }
}
