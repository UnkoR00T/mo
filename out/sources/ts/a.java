package ts;

import fr.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import pq.n;
import pq.v;
import pq.v0;
import ws.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC5006a f191761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f191762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f191763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f191764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f191765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f191766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f191767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f191768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f191769i;

    /* JADX INFO: renamed from: ts.a$a, reason: collision with other inner class name */
    public enum EnumC5006a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map<Integer, EnumC5006a> f191771c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f191780a;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ wq.a f191779l = wq.b.a(b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C5007a f191770b = new C5007a(null);

        /* JADX INFO: renamed from: ts.a$a$a, reason: collision with other inner class name */
        public static final class C5007a {
            public /* synthetic */ C5007a(k kVar) {
                this();
            }

            public final EnumC5006a a(int i15) {
                EnumC5006a enumC5006a = (EnumC5006a) EnumC5006a.f191771c.get(Integer.valueOf(i15));
                return enumC5006a == null ? EnumC5006a.UNKNOWN : enumC5006a;
            }

            private C5007a() {
            }
        }

        static {
            EnumC5006a[] enumC5006aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(enumC5006aArrValues.length), 16));
            for (EnumC5006a enumC5006a : enumC5006aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC5006a.f191780a), enumC5006a);
            }
            f191771c = linkedHashMap;
        }

        EnumC5006a(int i15) {
            this.f191780a = i15;
        }

        public static final EnumC5006a g(int i15) {
            return f191770b.a(i15);
        }
    }

    public a(EnumC5006a enumC5006a, c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i15, String str2, byte[] bArr) {
        this.f191761a = enumC5006a;
        this.f191762b = cVar;
        this.f191763c = strArr;
        this.f191764d = strArr2;
        this.f191765e = strArr3;
        this.f191766f = str;
        this.f191767g = i15;
        this.f191768h = str2;
        this.f191769i = bArr;
    }

    private final boolean h(int i15, int i16) {
        return (i15 & i16) != 0;
    }

    public final String[] a() {
        return this.f191763c;
    }

    public final String[] b() {
        return this.f191764d;
    }

    public final EnumC5006a c() {
        return this.f191761a;
    }

    public final c d() {
        return this.f191762b;
    }

    public final String e() {
        String str = this.f191766f;
        if (this.f191761a == EnumC5006a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.f191763c;
        if (this.f191761a != EnumC5006a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listF = strArr != null ? n.f(strArr) : null;
        return listF == null ? v.n() : listF;
    }

    public final String[] g() {
        return this.f191765e;
    }

    public final boolean i() {
        return h(this.f191767g, 2);
    }

    public final boolean j() {
        return h(this.f191767g, 16) && !h(this.f191767g, 32);
    }

    public String toString() {
        return this.f191761a + " version=" + this.f191762b;
    }
}
