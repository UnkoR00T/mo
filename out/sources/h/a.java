package h;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/a;", "", "", "value", "e", "(I)I", "", "i", "(I)Z", "", "j", "(I)Ljava/lang/String;", "h", "other", "f", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f78796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f78797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f78798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f78799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f78800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f78801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f78802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<a> f78803j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh/a$a;", "", "<init>", "()V", "", "value", "Lh/a;", "a", "(I)Lh/a;", "OFF", "I", "b", "()I", "ON", "c", "", "values", "Ljava/util/List;", "d", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final a a(int value) {
            Object next;
            Iterator<T> it = d().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((a) next).getValue() == value) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        public final int b() {
            return a.f78796c;
        }

        public final int c() {
            return a.f78797d;
        }

        public final List<a> d() {
            return a.f78803j;
        }

        private Companion() {
        }
    }

    static {
        int iE = e(0);
        f78796c = iE;
        int iE2 = e(1);
        f78797d = iE2;
        int iE3 = e(3);
        f78798e = iE3;
        int iE4 = e(2);
        f78799f = iE4;
        int iE5 = e(4);
        f78800g = iE5;
        int iE6 = e(5);
        f78801h = iE6;
        int iE7 = e(6);
        f78802i = iE7;
        f78803j = pq.v.q(d(iE), d(iE2), d(iE4), d(iE3), d(iE5), d(iE6), d(iE7));
    }

    private /* synthetic */ a(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ a d(int i15) {
        return new a(i15);
    }

    public static int e(int i15) {
        return i15;
    }

    public static boolean f(int i15, Object obj) {
        return (obj instanceof a) && i15 == ((a) obj).getValue();
    }

    public static final boolean g(int i15, int i16) {
        return i15 == i16;
    }

    public static int h(int i15) {
        return Integer.hashCode(i15);
    }

    public static final boolean i(int i15) {
        return i15 != 0;
    }

    public static String j(int i15) {
        return "AeMode(value=" + i15 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.value, obj);
    }

    public int hashCode() {
        return h(this.value);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return j(this.value);
    }
}
