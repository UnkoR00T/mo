package xw;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lxw/a;", "", "", "value", "b", "(F)F", "", "f", "(F)Ljava/lang/String;", "", "e", "(F)I", "other", "", "c", "(FLjava/lang/Object;)Z", "a", "F", "getValue", "()F", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float value;

    private /* synthetic */ a(float f15) {
        this.value = f15;
    }

    public static final /* synthetic */ a a(float f15) {
        return new a(f15);
    }

    public static float b(float f15) {
        return f15;
    }

    public static boolean c(float f15, Object obj) {
        return (obj instanceof a) && Float.compare(f15, ((a) obj).getValue()) == 0;
    }

    public static final boolean d(float f15, float f16) {
        return Float.compare(f15, f16) == 0;
    }

    public static int e(float f15) {
        return Float.hashCode(f15);
    }

    public static String f(float f15) {
        return "Bytes(value=" + f15 + ")";
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public int hashCode() {
        return e(this.value);
    }

    public String toString() {
        return f(this.value);
    }
}
