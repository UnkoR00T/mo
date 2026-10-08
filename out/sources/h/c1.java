package h;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lh/c1;", "", "", "value", "b", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    private /* synthetic */ c1(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ c1 a(int i15) {
        return new c1(i15);
    }

    public static int b(int i15) {
        return i15;
    }

    public static boolean c(int i15, Object obj) {
        return (obj instanceof c1) && i15 == ((c1) obj).getValue();
    }

    public static final boolean d(int i15, int i16) {
        return i15 == i16;
    }

    public static int e(int i15) {
        return Integer.hashCode(i15);
    }

    public static String f(int i15) {
        return "Output-" + i15;
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return e(this.value);
    }

    public String toString() {
        return f(this.value);
    }
}
