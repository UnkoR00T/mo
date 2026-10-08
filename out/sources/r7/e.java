package r7;

import androidx.p016lifecycle.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr7/e;", "", "<init>", "()V", "Landroidx/lifecycle/t0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f172248a = new e();

    private e() {
    }

    public final <T extends t0> T a(Class<T> modelClass) {
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                return declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e15) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e15);
            } catch (InstantiationException e16) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e16);
            }
        } catch (NoSuchMethodException e17) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e17);
        }
    }
}
