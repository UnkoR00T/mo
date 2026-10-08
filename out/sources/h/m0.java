package h;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lh/m0;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f78965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f78966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f78967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<m0> f78968f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: h.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh/m0$a;", "", "<init>", "()V", "Lh/m0;", "OFF", "I", "a", "()I", "TORCH", "b", "", "values", "Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return m0.f78965c;
        }

        public final int b() {
            return m0.f78967e;
        }

        private Companion() {
        }
    }

    static {
        int iD = d(0);
        f78965c = iD;
        int iD2 = d(1);
        f78966d = iD2;
        int iD3 = d(2);
        f78967e = iD3;
        f78968f = pq.v.q(c(iD), c(iD2), c(iD3));
    }

    private /* synthetic */ m0(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ m0 c(int i15) {
        return new m0(i15);
    }

    public static int d(int i15) {
        return i15;
    }

    public static boolean e(int i15, Object obj) {
        return (obj instanceof m0) && i15 == ((m0) obj).getValue();
    }

    public static int f(int i15) {
        return Integer.hashCode(i15);
    }

    public static String g(int i15) {
        return "FlashMode(value=" + i15 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return f(this.value);
    }

    public String toString() {
        return g(this.value);
    }
}
