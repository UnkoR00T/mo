package h;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lh/d;", "", "", "value", "c", "(I)I", "", "f", "(I)Z", "", "g", "(I)Ljava/lang/String;", "e", "other", "d", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f78837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f78838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f78839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f78840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f78841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f78842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f78843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f78844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List<d> f78845k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: h.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh/d$a;", "", "<init>", "()V", "", "value", "Lh/d;", "a", "(I)Lh/d;", "", "values", "Ljava/util/List;", "b", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final d a(int value) {
            Object next;
            Iterator<T> it = b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((d) next).getValue() == value) {
                    return (d) next;
                }
            }
            next = null;
            return (d) next;
        }

        public final List<d> b() {
            return d.f78845k;
        }

        private Companion() {
        }
    }

    static {
        int iC = c(0);
        f78837c = iC;
        int iC2 = c(1);
        f78838d = iC2;
        int iC3 = c(6);
        f78839e = iC3;
        int iC4 = c(5);
        f78840f = iC4;
        int iC5 = c(2);
        f78841g = iC5;
        int iC6 = c(3);
        f78842h = iC6;
        int iC7 = c(8);
        f78843i = iC7;
        int iC8 = c(7);
        f78844j = iC8;
        f78845k = pq.v.q(b(iC), b(iC2), b(iC3), b(iC4), b(iC5), b(iC6), b(iC7), b(iC8));
    }

    private /* synthetic */ d(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ d b(int i15) {
        return new d(i15);
    }

    public static int c(int i15) {
        return i15;
    }

    public static boolean d(int i15, Object obj) {
        return (obj instanceof d) && i15 == ((d) obj).getValue();
    }

    public static int e(int i15) {
        return Integer.hashCode(i15);
    }

    public static final boolean f(int i15) {
        return i15 != 0;
    }

    public static String g(int i15) {
        return "AwbMode(value=" + i15 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.value, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return e(this.value);
    }

    public String toString() {
        return g(this.value);
    }
}
