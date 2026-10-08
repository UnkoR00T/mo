package qk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f167012b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f167013a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f167014a = new HashMap<>();

        public a a() {
            if (this.f167014a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f167014a));
            this.f167014a = null;
            return aVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f167013a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f167013a.equals(((a) obj).f167013a);
        }
        return false;
    }

    public int hashCode() {
        return this.f167013a.hashCode();
    }

    public String toString() {
        return this.f167013a.toString();
    }

    private a(Map<String, String> map) {
        this.f167013a = map;
    }
}
