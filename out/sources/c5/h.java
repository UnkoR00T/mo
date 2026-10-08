package c5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lc5/h;", "", "", "value", "n", "(F)F", "other", "", "l", "(FF)I", "", "r", "(F)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getValue", "()F", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23397c = n(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f23398d = n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f23399e = n(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float value;

    /* JADX INFO: renamed from: c5.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lc5/h$a;", "", "<init>", "()V", "Lc5/h;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final float a() {
            return h.f23397c;
        }

        public final float b() {
            return h.f23398d;
        }

        public final float c() {
            return h.f23399e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ h(float f15) {
        this.value = f15;
    }

    public static final /* synthetic */ h j(float f15) {
        return new h(f15);
    }

    public static int l(float f15, float f16) {
        if (Float.isNaN(f15) || Float.isNaN(f16)) {
            return 0;
        }
        return Float.compare(f15, f16);
    }

    public static float n(float f15) {
        return f15;
    }

    public static boolean o(float f15, Object obj) {
        return (obj instanceof h) && Float.compare(f15, ((h) obj).getValue()) == 0;
    }

    public static final boolean p(float f15, float f16) {
        return Float.compare(f15, f16) == 0;
    }

    public static int q(float f15) {
        return Float.hashCode(f15);
    }

    public static String r(float f15) {
        if (Float.isNaN(f15)) {
            return "Dp.Unspecified";
        }
        return f15 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return k(hVar.getValue());
    }

    public boolean equals(Object other) {
        return o(this.value, other);
    }

    public int hashCode() {
        return q(this.value);
    }

    public int k(float f15) {
        return l(this.value, f15);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public String toString() {
        return r(this.value);
    }
}
