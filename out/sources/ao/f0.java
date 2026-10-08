package ao;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
