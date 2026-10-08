package wl;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f0 {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f214029a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f214030b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f214030b = method;
            }

            @Override // wl.f0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f214030b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e15) {
                    throw new RuntimeException("Failed invoking canAccess", e15);
                }
            }
        }

        /* JADX INFO: renamed from: wl.f0$b$b, reason: collision with other inner class name */
        class C5663b extends b {
            C5663b() {
                super();
            }

            @Override // wl.f0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (x.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C5663b();
            }
            f214029a = aVar;
        }

        private b() {
        }

        abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f214029a.a(accessibleObject, obj);
    }

    public static com.google.gson.w.a b(List<com.google.gson.w> list, Class<?> cls) {
        Iterator<com.google.gson.w> it = list.iterator();
        while (it.hasNext()) {
            com.google.gson.w.a aVarA = it.next().a(cls);
            if (aVarA != com.google.gson.w.a.INDECISIVE) {
                return aVarA;
            }
        }
        return com.google.gson.w.a.ALLOW;
    }
}
