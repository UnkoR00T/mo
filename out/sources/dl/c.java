package dl;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f43376b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f43378b = null;

        b(String str) {
            this.f43377a = str;
        }

        public c a() {
            return new c(this.f43377a, this.f43378b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f43378b)));
        }

        public <T extends Annotation> b b(T t15) {
            if (this.f43378b == null) {
                this.f43378b = new HashMap();
            }
            this.f43378b.put(t15.annotationType(), t15);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f43375a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f43376b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f43375a.equals(cVar.f43375a) && this.f43376b.equals(cVar.f43376b);
    }

    public int hashCode() {
        return (this.f43375a.hashCode() * 31) + this.f43376b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f43375a + ", properties=" + this.f43376b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f43375a = str;
        this.f43376b = map;
    }
}
