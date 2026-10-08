package tb;

import io.sentry.android.core.c2;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import mr.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00072\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0007*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltb/a;", "", "<init>", "()V", "", "errorMessage", "Lkotlin/Function0;", "", "block", "e", "(Ljava/lang/String;Ler/a;)Z", "Ljava/lang/Class;", "classLoader", "a", "(Ler/a;)Z", "Ljava/lang/reflect/Method;", "Lmr/c;", "clazz", "c", "(Ljava/lang/reflect/Method;Lmr/c;)Z", "b", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "d", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f189388a = new a();

    private a() {
    }

    public static final boolean e(String errorMessage, er.a<Boolean> block) {
        try {
            boolean zBooleanValue = block.a().booleanValue();
            if (!zBooleanValue) {
                c2.e("ReflectionGuard", errorMessage);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            c2.e("ReflectionGuard", "ClassNotFound: " + errorMessage);
            return false;
        } catch (NoSuchFieldException unused2) {
            c2.e("ReflectionGuard", "NoSuchField: " + errorMessage);
            return false;
        } catch (NoSuchMethodException unused3) {
            c2.e("ReflectionGuard", "NoSuchMethod: " + errorMessage);
            return false;
        }
    }

    public final boolean a(er.a<? extends Class<?>> classLoader) {
        try {
            classLoader.a();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    public final boolean c(Method method, c<?> cVar) {
        return b(method, dr.a.b(cVar));
    }

    public final boolean d(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }
}
