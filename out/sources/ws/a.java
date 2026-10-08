package ws;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5701a f214713f = new C5701a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f214714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f214715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f214716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f214717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Integer> f214718e;

    /* JADX INFO: renamed from: ws.a$a, reason: collision with other inner class name */
    public static final class C5701a {
        public /* synthetic */ C5701a(fr.k kVar) {
            this();
        }

        private C5701a() {
        }
    }

    public a(int... iArr) {
        List<Integer> listN;
        this.f214714a = iArr;
        Integer numX0 = n.x0(iArr, 0);
        this.f214715b = numX0 != null ? numX0.intValue() : -1;
        Integer numX1 = n.x0(iArr, 1);
        this.f214716c = numX1 != null ? numX1.intValue() : -1;
        Integer numX2 = n.x0(iArr, 2);
        this.f214717d = numX2 != null ? numX2.intValue() : -1;
        if (iArr.length <= 3) {
            listN = v.n();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listN = v.f1(n.e(iArr).subList(3, iArr.length));
        }
        this.f214718e = listN;
    }

    public final int a() {
        return this.f214715b;
    }

    public final int b() {
        return this.f214716c;
    }

    public final boolean c(int i15, int i16, int i17) {
        int i18 = this.f214715b;
        if (i18 > i15) {
            return true;
        }
        if (i18 < i15) {
            return false;
        }
        int i19 = this.f214716c;
        if (i19 > i16) {
            return true;
        }
        return i19 >= i16 && this.f214717d >= i17;
    }

    public final boolean d(a aVar) {
        return c(aVar.f214715b, aVar.f214716c, aVar.f214717d);
    }

    public final boolean e(int i15, int i16, int i17) {
        int i18 = this.f214715b;
        if (i18 < i15) {
            return true;
        }
        if (i18 > i15) {
            return false;
        }
        int i19 = this.f214716c;
        if (i19 < i16) {
            return true;
        }
        return i19 <= i16 && this.f214717d <= i17;
    }

    public boolean equals(Object obj) {
        if (obj == null || !t.c(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f214715b == aVar.f214715b && this.f214716c == aVar.f214716c && this.f214717d == aVar.f214717d && t.c(this.f214718e, aVar.f214718e);
    }

    protected final boolean f(a aVar) {
        int i15 = this.f214715b;
        if (i15 == 0) {
            return aVar.f214715b == 0 && this.f214716c == aVar.f214716c;
        }
        return i15 == aVar.f214715b && this.f214716c <= aVar.f214716c;
    }

    public final int[] g() {
        return this.f214714a;
    }

    public int hashCode() {
        int i15 = this.f214715b;
        int i16 = i15 + (i15 * 31) + this.f214716c;
        int i17 = i16 + (i16 * 31) + this.f214717d;
        return i17 + (i17 * 31) + this.f214718e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i15 : iArrG) {
            if (i15 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i15));
        }
        return arrayList.isEmpty() ? "unknown" : v.v0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
