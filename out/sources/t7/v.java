package t7;

import ak.n0;
import java.util.Arrays;
import java.util.List;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f188641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f188642b;

    public interface a {
        default p a() {
            return null;
        }

        default byte[] b() {
            return null;
        }

        default void c(u.b bVar) {
        }
    }

    public v(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    private <T extends a> T d(a aVar, Class<T> cls, zj.q<T> qVar) {
        if (!cls.isAssignableFrom(aVar.getClass())) {
            return null;
        }
        T tCast = cls.cast(aVar);
        if (qVar.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public v a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new v(this.f188642b, (a[]) o0.N0(this.f188641a, aVarArr));
    }

    public v b(v vVar) {
        return vVar == null ? this : a(vVar.f188641a);
    }

    public v c(long j15) {
        return this.f188642b == j15 ? this : new v(j15, this.f188641a);
    }

    public a e(int i15) {
        return this.f188641a[i15];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (Arrays.equals(this.f188641a, vVar.f188641a) && this.f188642b == vVar.f188642b) {
                return true;
            }
        }
        return false;
    }

    public <T extends a> n0<T> f(Class<T> cls) {
        n0.a aVarS = n0.s();
        for (a aVar : this.f188641a) {
            if (cls.isAssignableFrom(aVar.getClass())) {
                aVarS.a(cls.cast(aVar));
            }
        }
        return aVarS.k();
    }

    public <T extends a> T g(Class<T> cls) {
        return (T) h(cls, zj.r.b());
    }

    public <T extends a> T h(Class<T> cls, zj.q<T> qVar) {
        for (a aVar : this.f188641a) {
            T t15 = (T) d(aVar, cls, qVar);
            if (t15 != null) {
                return t15;
            }
        }
        return null;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f188641a) * 31) + ek.i.c(this.f188642b);
    }

    public <T extends a> n0<T> i(Class<T> cls, zj.q<T> qVar) {
        n0.a aVarS = n0.s();
        for (a aVar : this.f188641a) {
            a aVarD = d(aVar, cls, qVar);
            if (aVarD != null) {
                aVarS.a(aVarD);
            }
        }
        return aVarS.k();
    }

    public int j() {
        return this.f188641a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("entries=");
        sb5.append(Arrays.toString(this.f188641a));
        if (this.f188642b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f188642b;
        }
        sb5.append(str);
        return sb5.toString();
    }

    public v(long j15, a... aVarArr) {
        this.f188642b = j15;
        this.f188641a = aVarArr;
    }

    public v(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public v(long j15, List<? extends a> list) {
        this(j15, (a[]) list.toArray(new a[0]));
    }
}
