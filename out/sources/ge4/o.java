package ge4;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f72338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f72339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f72340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<?> f72341d;

    o(Class<?> cls, Object obj, Method method, List<?> list) {
        this.f72338a = cls;
        this.f72339b = obj;
        this.f72340c = method;
        this.f72341d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f72340c;
    }

    public Class<?> b() {
        return this.f72338a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f72338a.getName(), this.f72340c.getName(), this.f72341d);
    }
}
