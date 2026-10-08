package qr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f168159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f168160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oq.k f168161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oq.k f168162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f168163e;

    public d(Class cls, Map map, oq.k kVar, oq.k kVar2, List list) {
        this.f168159a = cls;
        this.f168160b = map;
        this.f168161c = kVar;
        this.f168162d = kVar2;
        this.f168163e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f168159a, this.f168160b, this.f168161c, this.f168162d, this.f168163e, obj, method, objArr);
    }
}
