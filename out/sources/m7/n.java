package m7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lm2/b4;", "Landroidx/lifecycle/q;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<androidx.p016lifecycle.q> f124006a;

    static {
        Object objB;
        b4 b4Var;
        try {
            t.Companion companion = t.INSTANCE;
            Method method = androidx.p016lifecycle.q.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
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
        b4<androidx.p016lifecycle.q> b4VarJ = (b4) (t.f(objB) ? null : objB);
        if (b4VarJ == null) {
            b4VarJ = d0.j(new er.a() { // from class: m7.m
                @Override // er.a
                public final Object a() {
                    return n.b();
                }
            });
        }
        f124006a = b4VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.p016lifecycle.q b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final b4<androidx.p016lifecycle.q> c() {
        return f124006a;
    }
}
