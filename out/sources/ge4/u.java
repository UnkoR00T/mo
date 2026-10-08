package ge4;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
class u {

    @TargetApi(24)
    @IgnoreJRERequirement
    static final class a extends u {
        a() {
        }

        @Override // ge4.u
        Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // ge4.u
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    static class b extends u {
        b() {
        }

        @Override // ge4.u
        String a(Method method, int i15) {
            Parameter parameter = method.getParameters()[i15];
            if (!parameter.isNamePresent()) {
                return super.a(method, i15);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // ge4.u
        Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // ge4.u
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    u() {
    }

    String a(Method method, int i15) {
        return "parameter #" + (i15 + 1);
    }

    Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    boolean c(Method method) {
        return false;
    }
}
