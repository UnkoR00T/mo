package bs;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21221a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f21222b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f21224b;

        public a(Method method, Method method2) {
            this.f21223a = method;
            this.f21224b = method2;
        }

        public final Method a() {
            return this.f21224b;
        }

        public final Method b() {
            return this.f21223a;
        }
    }

    private c() {
    }

    public final a a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List<String> b(Member member) {
        Method methodA;
        a aVarA = f21222b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f21222b;
                if (aVarA == null) {
                    aVarA = f21221a.a(member);
                    f21222b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object[] objArr = (Object[]) methodB.invoke(member, null);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add((String) methodA.invoke(obj, null));
        }
        return arrayList;
    }
}
