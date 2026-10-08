package tr;

import fr.k;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f191729c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f191730d = new g(v.q(f.a.f191725f, f.d.f191728f, f.b.f191726f, f.c.f191727f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f191731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<zs.c, List<f>> f191732b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final g a() {
            return g.f191730d;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f191733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f191734b;

        public b(f fVar, int i15) {
            this.f191733a = fVar;
            this.f191734b = i15;
        }

        public final f a() {
            return this.f191733a;
        }

        public final int b() {
            return this.f191734b;
        }

        public final f c() {
            return this.f191733a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f191733a, bVar.f191733a) && this.f191734b == bVar.f191734b;
        }

        public int hashCode() {
            return (this.f191733a.hashCode() * 31) + Integer.hashCode(this.f191734b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f191733a + ", arity=" + this.f191734b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends f> list) {
        this.f191731a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            zs.c cVarB = ((f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f191732b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int iCharAt = str.charAt(i16) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i15 = (i15 * 10) + iCharAt;
        }
        return Integer.valueOf(i15);
    }

    public final f b(zs.c cVar, String str) {
        b bVarC = c(cVar, str);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(zs.c cVar, String str) {
        Integer numD;
        List<f> list = this.f191732b.get(cVar);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (r.V(str, fVar.a(), false, 2, null) && (numD = d(str.substring(fVar.a().length()))) != null) {
                return new b(fVar, numD.intValue());
            }
        }
        return null;
    }
}
