package ao;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13911a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f13912b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f13912b = method;
            }

            @Override // ao.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f13912b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e15) {
                    throw new RuntimeException("Failed invoking canAccess", e15);
                }
            }
        }

        /* JADX INFO: renamed from: ao.g0$b$b, reason: collision with other inner class name */
        class C0299b extends b {
            C0299b() {
                super();
            }

            @Override // ao.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (y.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0299b();
            }
            f13911a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f13911a.a(accessibleObject, obj);
    }

    public static yn.v.a b(List<yn.v> list, Class<?> cls) {
        Iterator<yn.v> it = list.iterator();
        while (it.hasNext()) {
            yn.v.a aVarA = it.next().a(cls);
            if (aVarA != yn.v.a.INDECISIVE) {
                return aVarA;
            }
        }
        return yn.v.a.ALLOW;
    }
}
