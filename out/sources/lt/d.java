package lt;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f120091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f120092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f120093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f120094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f120095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f120096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f120097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f120098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f120099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f120100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f120101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f120102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f120103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f120104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f120105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f120106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f120107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f120108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f120109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f120110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f120111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f120112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List<a.C2931a> f120113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List<a.C2931a> f120114z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f120115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120116b;

    public static final class a {

        /* JADX INFO: renamed from: lt.d$a$a, reason: collision with other inner class name */
        private static final class C2931a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f120117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f120118b;

            public C2931a(int i15, String str) {
                this.f120117a = i15;
                this.f120118b = str;
            }

            public final int a() {
                return this.f120117a;
            }

            public final String b() {
                return this.f120118b;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i15 = d.f120092d;
            d.f120092d <<= 1;
            return i15;
        }

        public final int b() {
            return d.f120099k;
        }

        public final int c() {
            return d.f120100l;
        }

        public final int d() {
            return d.f120097i;
        }

        public final int e() {
            return d.f120093e;
        }

        public final int f() {
            return d.f120096h;
        }

        public final int g() {
            return d.f120094f;
        }

        public final int h() {
            return d.f120095g;
        }

        public final int i() {
            return d.f120098j;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a aVar = new a(null);
        f120091c = aVar;
        f120092d = 1;
        int iJ = aVar.j();
        f120093e = iJ;
        int iJ2 = aVar.j();
        f120094f = iJ2;
        int iJ3 = aVar.j();
        f120095g = iJ3;
        int iJ4 = aVar.j();
        f120096h = iJ4;
        int iJ5 = aVar.j();
        f120097i = iJ5;
        int iJ6 = aVar.j();
        f120098j = iJ6;
        int iJ7 = aVar.j() - 1;
        f120099k = iJ7;
        int i15 = iJ | iJ2 | iJ3;
        f120100l = i15;
        int i16 = iJ2 | iJ5 | iJ6;
        f120101m = i16;
        int i17 = iJ5 | iJ6;
        f120102n = i17;
        int i18 = 2;
        f120103o = new d(iJ7, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120104p = new d(i17, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120105q = new d(iJ, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120106r = new d(iJ2, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120107s = new d(iJ3, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120108t = new d(i15, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120109u = new d(iJ4, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120110v = new d(iJ5, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120111w = new d(iJ6, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        f120112x = new d(i16, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            a.C2931a c2931a = dVar != null ? new a.C2931a(dVar.f120116b, field2.getName()) : null;
            if (c2931a != null) {
                arrayList2.add(c2931a);
            }
        }
        f120113y = arrayList2;
        Field[] fields2 = d.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (fr.t.c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            int iIntValue = ((Integer) field4.get(null)).intValue();
            a.C2931a c2931a2 = iIntValue == ((-iIntValue) & iIntValue) ? new a.C2931a(iIntValue, field4.getName()) : null;
            if (c2931a2 != null) {
                arrayList5.add(c2931a2);
            }
        }
        f120114z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i15, List<? extends c> list) {
        this.f120115a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i15 &= ~((c) it.next()).a();
        }
        this.f120116b = i15;
    }

    public final boolean a(int i15) {
        return (i15 & this.f120116b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fr.t.c(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        d dVar = (d) obj;
        return fr.t.c(this.f120115a, dVar.f120115a) && this.f120116b == dVar.f120116b;
    }

    public int hashCode() {
        return (this.f120115a.hashCode() * 31) + this.f120116b;
    }

    public final List<c> l() {
        return this.f120115a;
    }

    public final int m() {
        return this.f120116b;
    }

    public final d n(int i15) {
        int i16 = i15 & this.f120116b;
        if (i16 == 0) {
            return null;
        }
        return new d(i16, this.f120115a);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f120113y.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a.C2931a) next).a() != this.f120116b);
        a.C2931a c2931a = (a.C2931a) next;
        String strB = c2931a != null ? c2931a.b() : null;
        if (strB == null) {
            List<a.C2931a> list = f120114z;
            ArrayList arrayList = new ArrayList();
            for (a.C2931a c2931a2 : list) {
                String strB2 = a(c2931a2.a()) ? c2931a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = pq.v.v0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f120115a + ')';
    }

    public /* synthetic */ d(int i15, List list, int i16, fr.k kVar) {
        this(i15, (i16 & 2) != 0 ? pq.v.n() : list);
    }
}
