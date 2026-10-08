package fe;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f61656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f61657d;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f61658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map<String, List<j>> f61659e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f61660a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f61661b = f61659e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61662c = true;

        static {
            String strB = b();
            f61658d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f61659e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb5 = new StringBuilder(property.length());
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = property.charAt(i15);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb5.append(cCharAt);
                } else {
                    sb5.append('?');
                }
            }
            return sb5.toString();
        }

        public k a() {
            this.f61660a = true;
            return new k(this.f61661b);
        }
    }

    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f61663a;

        b(String str) {
            this.f61663a = str;
        }

        @Override // fe.j
        public String a() {
            return this.f61663a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f61663a.equals(((b) obj).f61663a);
            }
            return false;
        }

        public int hashCode() {
            return this.f61663a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f61663a + "'}";
        }
    }

    k(Map<String, List<j>> map) {
        this.f61656c = Collections.unmodifiableMap(map);
    }

    private String b(List<j> list) {
        StringBuilder sb5 = new StringBuilder();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            String strA = list.get(i15).a();
            if (!TextUtils.isEmpty(strA)) {
                sb5.append(strA);
                if (i15 != list.size() - 1) {
                    sb5.append(',');
                }
            }
        }
        return sb5.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f61656c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // fe.i
    public Map<String, String> a() {
        if (this.f61657d == null) {
            synchronized (this) {
                try {
                    if (this.f61657d == null) {
                        this.f61657d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f61657d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f61656c.equals(((k) obj).f61656c);
        }
        return false;
    }

    public int hashCode() {
        return this.f61656c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f61656c + '}';
    }
}
