package ys;

import fr.k;
import fu.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lr.m;
import oq.p;
import pq.IndexedValue;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public class f implements ws.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f229099d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f229100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f229101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f229102g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f229103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f229104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<xs.a.e.c> f229105c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229106a;

        static {
            int[] iArr = new int[xs.a.e.c.EnumC5908c.values().length];
            try {
                iArr[xs.a.e.c.EnumC5908c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xs.a.e.c.EnumC5908c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xs.a.e.c.EnumC5908c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f229106a = iArr;
        }
    }

    static {
        String strV0 = v.v0(v.q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f229100e = strV0;
        List<String> listQ = v.q(strV0 + "/Any", strV0 + "/Nothing", strV0 + "/Unit", strV0 + "/Throwable", strV0 + "/Number", strV0 + "/Byte", strV0 + "/Double", strV0 + "/Float", strV0 + "/Int", strV0 + "/Long", strV0 + "/Short", strV0 + "/Boolean", strV0 + "/Char", strV0 + "/CharSequence", strV0 + "/String", strV0 + "/Comparable", strV0 + "/Enum", strV0 + "/Array", strV0 + "/ByteArray", strV0 + "/DoubleArray", strV0 + "/FloatArray", strV0 + "/IntArray", strV0 + "/LongArray", strV0 + "/ShortArray", strV0 + "/BooleanArray", strV0 + "/CharArray", strV0 + "/Cloneable", strV0 + "/Annotation", strV0 + "/collections/Iterable", strV0 + "/collections/MutableIterable", strV0 + "/collections/Collection", strV0 + "/collections/MutableCollection", strV0 + "/collections/List", strV0 + "/collections/MutableList", strV0 + "/collections/Set", strV0 + "/collections/MutableSet", strV0 + "/collections/Map", strV0 + "/collections/MutableMap", strV0 + "/collections/Map.Entry", strV0 + "/collections/MutableMap.MutableEntry", strV0 + "/collections/Iterator", strV0 + "/collections/MutableIterator", strV0 + "/collections/ListIterator", strV0 + "/collections/MutableListIterator");
        f229101f = listQ;
        Iterable<IndexedValue> iterableN1 = v.n1(listQ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(iterableN1, 10)), 16));
        for (IndexedValue indexedValue : iterableN1) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f229102g = linkedHashMap;
    }

    public f(String[] strArr, Set<Integer> set, List<xs.a.e.c> list) {
        this.f229103a = strArr;
        this.f229104b = set;
        this.f229105c = list;
    }

    @Override // ws.d
    public boolean a(int i15) {
        return this.f229104b.contains(Integer.valueOf(i15));
    }

    @Override // ws.d
    public String b(int i15) {
        return getString(i15);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // ws.d
    public String getString(int i15) {
        String strSubstring;
        xs.a.e.c cVar = this.f229105c.get(i15);
        if (cVar.V()) {
            strSubstring = cVar.M();
        } else if (cVar.T()) {
            List<String> list = f229101f;
            int size = list.size();
            int I = cVar.I();
            if (I < 0 || I >= size) {
                strSubstring = this.f229103a[i15];
            } else {
                strSubstring = list.get(cVar.I());
            }
        } else {
            strSubstring = this.f229103a[i15];
        }
        if (cVar.O() >= 2) {
            List<Integer> listQ = cVar.Q();
            Integer num = listQ.get(0);
            Integer num2 = listQ.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
            }
        }
        String strO = strSubstring;
        if (cVar.K() >= 2) {
            List<Integer> listL = cVar.L();
            strO = r.O(strO, (char) listL.get(0).intValue(), (char) listL.get(1).intValue(), false, 4, null);
        }
        String strSubstring2 = strO;
        xs.a.e.c.EnumC5908c enumC5908cH = cVar.H();
        if (enumC5908cH == null) {
            enumC5908cH = xs.a.e.c.EnumC5908c.NONE;
        }
        int i16 = b.f229106a[enumC5908cH.ordinal()];
        if (i16 == 1) {
            return strSubstring2;
        }
        if (i16 == 2) {
            return r.O(strSubstring2, '$', '.', false, 4, null);
        }
        if (i16 != 3) {
            throw new p();
        }
        if (strSubstring2.length() >= 2) {
            strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
        }
        return r.O(strSubstring2, '$', '.', false, 4, null);
    }
}
