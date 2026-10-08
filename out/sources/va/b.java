package va;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import ua.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lm2/b4;", "Lua/j;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalSavedStateRegistryOwner", "savedstate-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<j> f205642a;

    static {
        Object objB;
        b4 b4Var;
        try {
            t.Companion companion = t.INSTANCE;
            Method method = j.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof b4) {
                        b4Var = (b4) objInvoke;
                        break;
                    }
                } else if (!(annotations[i15] instanceof oq.a)) {
                    i15++;
                }
                b4Var = null;
                break;
            }
            objB = t.b(b4Var);
        } catch (Throwable th4) {
            t.Companion companion2 = t.INSTANCE;
            objB = t.b(u.a(th4));
        }
        b4<j> b4VarJ = (b4) (t.f(objB) ? null : objB);
        if (b4VarJ == null) {
            b4VarJ = d0.j(new er.a() { // from class: va.a
                @Override // er.a
                public final Object a() {
                    return b.b();
                }
            });
        }
        f205642a = b4VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j b() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    public static final b4<j> c() {
        return f205642a;
    }
}
