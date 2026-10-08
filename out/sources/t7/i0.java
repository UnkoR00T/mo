package t7;

import ak.n0;
import java.util.Arrays;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f188292b = new i0(n0.C());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f188293c = o0.u0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0<a> f188294a;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f188295f = o0.u0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f188296g = o0.u0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f188297h = o0.u0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f188298i = o0.u0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f188299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f188300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f188301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f188302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f188303e;

        public a(f0 f0Var, boolean z15, int[] iArr, boolean[] zArr) {
            int i15 = f0Var.f188177a;
            this.f188299a = i15;
            boolean z16 = false;
            zj.p.d(i15 == iArr.length && i15 == zArr.length);
            this.f188300b = f0Var;
            if (z15 && i15 > 1) {
                z16 = true;
            }
            this.f188301c = z16;
            this.f188302d = (int[]) iArr.clone();
            this.f188303e = (boolean[]) zArr.clone();
        }

        public p a(int i15) {
            return this.f188300b.a(i15);
        }

        public int b() {
            return this.f188300b.f188179c;
        }

        public boolean c() {
            return ek.a.a(this.f188303e, true);
        }

        public boolean d(int i15) {
            return this.f188303e[i15];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f188301c == aVar.f188301c && this.f188300b.equals(aVar.f188300b) && Arrays.equals(this.f188302d, aVar.f188302d) && Arrays.equals(this.f188303e, aVar.f188303e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f188300b.hashCode() * 31) + (this.f188301c ? 1 : 0)) * 31) + Arrays.hashCode(this.f188302d)) * 31) + Arrays.hashCode(this.f188303e);
        }
    }

    public i0(List<a> list) {
        this.f188294a = n0.v(list);
    }

    public n0<a> a() {
        return this.f188294a;
    }

    public boolean b(int i15) {
        for (int i16 = 0; i16 < this.f188294a.size(); i16++) {
            a aVar = this.f188294a.get(i16);
            if (aVar.c() && aVar.b() == i15) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        return this.f188294a.equals(((i0) obj).f188294a);
    }

    public int hashCode() {
        return this.f188294a.hashCode();
    }
}
