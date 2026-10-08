package as;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14292a = new m();

    private m() {
    }

    public final String a(Constructor<?> constructor) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("(");
        for (Class<?> cls : constructor.getParameterTypes()) {
            sb5.append(bs.f.f(cls));
        }
        sb5.append(")V");
        return sb5.toString();
    }

    public final String b(Field field) {
        return bs.f.f(field.getType());
    }

    public final String c(Method method) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb5.append(bs.f.f(cls));
        }
        sb5.append(")");
        sb5.append(bs.f.f(method.getReturnType()));
        return sb5.toString();
    }
}
