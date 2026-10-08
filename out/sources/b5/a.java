package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lb5/a;", "", "", "multiplier", "d", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getMultiplier", "()F", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f16561c = d(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f16562d = d(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f16563e = d(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f16564f = d(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    /* JADX INFO: renamed from: b5.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lb5/a$a;", "", "<init>", "()V", "Lb5/a;", "None", "F", "a", "()F", "getNone-y9eOQZs$annotations", "Unspecified", "b", "getUnspecified-y9eOQZs$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final float a() {
            return a.f16563e;
        }

        public final float b() {
            return a.f16564f;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(float f15) {
        this.multiplier = f15;
    }

    public static final /* synthetic */ a c(float f15) {
        return new a(f15);
    }

    public static float d(float f15) {
        return f15;
    }

    public static boolean e(float f15, Object obj) {
        return (obj instanceof a) && Float.compare(f15, ((a) obj).getMultiplier()) == 0;
    }

    public static final boolean f(float f15, float f16) {
        return Float.compare(f15, f16) == 0;
    }

    public static int g(float f15) {
        return Float.hashCode(f15);
    }

    public static String h(float f15) {
        return "BaselineShift(multiplier=" + f15 + ')';
    }

    public boolean equals(Object other) {
        return e(this.multiplier, other);
    }

    public int hashCode() {
        return g(this.multiplier);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public String toString() {
        return h(this.multiplier);
    }
}
