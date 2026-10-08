package x5;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class s extends r {
    @Override // x5.r
    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f216831g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f216837m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    @Override // x5.r
    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
