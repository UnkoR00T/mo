package jo;

import io.j;
import io.k;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import sn.y;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f103870c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f103871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f103872b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f103873a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f103874b = false;

        public b a(String str) {
            if (str == null) {
                this.f103873a.put("aud", null);
                return this;
            }
            this.f103873a.put("aud", Collections.singletonList(str));
            return this;
        }

        public b b(List<String> list) {
            this.f103873a.put("aud", list);
            return this;
        }

        public a c() {
            return new a(this.f103873a, this.f103874b);
        }

        public b d(String str, Object obj) {
            this.f103873a.put(str, obj);
            return this;
        }

        public b e(Date date) {
            this.f103873a.put("exp", date);
            return this;
        }

        public b f(Date date) {
            this.f103873a.put("iat", date);
            return this;
        }

        public b g(String str) {
            this.f103873a.put("iss", str);
            return this;
        }

        public b h(String str) {
            this.f103873a.put("jti", str);
            return this;
        }

        public b i(Date date) {
            this.f103873a.put("nbf", date);
            return this;
        }

        public b j(String str) {
            this.f103873a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f103870c = Collections.unmodifiableSet(hashSet);
    }

    public static a f(String str) {
        return g(k.m(str));
    }

    public static a g(Map<String, Object> map) throws ParseException {
        b bVar = new b();
        for (String str : map.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = map.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(k.h(map, "aud"));
                        bVar.b(arrayList);
                        break;
                    } else {
                        if (!(obj instanceof List)) {
                            if (obj != null) {
                                throw new ParseException("Illegal aud claim", 0);
                            }
                            bVar.a(null);
                        } else {
                            bVar.b(k.j(map, "aud"));
                        }
                        break;
                    }
                    break;
                case "exp":
                    bVar.e(k.c(map, "exp"));
                    break;
                case "iat":
                    bVar.f(k.c(map, "iat"));
                    break;
                case "iss":
                    bVar.g(k.h(map, "iss"));
                    break;
                case "jti":
                    bVar.h(k.h(map, "jti"));
                    break;
                case "nbf":
                    bVar.i(k.c(map, "nbf"));
                    break;
                case "sub":
                    Object obj2 = map.get("sub");
                    if (obj2 instanceof String) {
                        bVar.j(k.h(map, "sub"));
                        break;
                    } else {
                        if (!(obj2 instanceof Number)) {
                            if (obj2 != null) {
                                throw new ParseException("Illegal sub claim", 0);
                            }
                            bVar.j(null);
                        } else {
                            bVar.j(String.valueOf(obj2));
                        }
                        break;
                    }
                    break;
                default:
                    bVar.d(str, map.get(str));
                    break;
            }
        }
        return bVar.c();
    }

    public List<String> a() {
        Object objB = b("aud");
        if (objB instanceof String) {
            return Collections.singletonList((String) objB);
        }
        try {
            List<String> listE = e("aud");
            return listE != null ? listE : Collections.EMPTY_LIST;
        } catch (ParseException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public Object b(String str) {
        return this.f103871a.get(str);
    }

    public List<Object> c(String str) throws ParseException {
        if (b(str) == null) {
            return null;
        }
        try {
            return (List) b(str);
        } catch (ClassCastException unused) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public String[] d(String str) throws ParseException {
        List<Object> listC = c(str);
        if (listC == null) {
            return null;
        }
        int size = listC.size();
        String[] strArr = new String[size];
        for (int i15 = 0; i15 < size; i15++) {
            try {
                strArr[i15] = (String) listC.get(i15);
            } catch (ClassCastException unused) {
                throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
            }
        }
        return strArr;
    }

    public List<String> e(String str) throws ParseException {
        String[] strArrD = d(str);
        if (strArrD == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArrD));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Objects.equals(this.f103871a, ((a) obj).f103871a);
        }
        return false;
    }

    public Map<String, Object> h() {
        return i(this.f103872b);
    }

    public int hashCode() {
        return Objects.hash(this.f103871a);
    }

    public Map<String, Object> i(boolean z15) {
        Map<String, Object> mapL = k.l();
        for (Map.Entry<String, Object> entry : this.f103871a.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapL.put(entry.getKey(), Long.valueOf(ko.a.b((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> listA = a();
                if (listA == null || listA.isEmpty()) {
                    if (z15) {
                        mapL.put("aud", null);
                    }
                } else if (listA.size() == 1) {
                    mapL.put("aud", listA.get(0));
                } else {
                    List<Object> listA2 = j.a();
                    listA2.addAll(listA);
                    mapL.put("aud", listA2);
                }
            } else if (entry.getValue() != null) {
                mapL.put(entry.getKey(), entry.getValue());
            } else if (z15) {
                mapL.put(entry.getKey(), null);
            }
        }
        return mapL;
    }

    public y j() {
        return new y(i(this.f103872b));
    }

    public String toString() {
        return k.o(h());
    }

    private a(Map<String, Object> map, boolean z15) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f103871a = linkedHashMap;
        linkedHashMap.putAll(map);
        this.f103872b = z15;
    }
}
