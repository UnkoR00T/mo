package lb;

import java.lang.reflect.Method;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Llb/d;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "", "e", "()Z", "h", "a", "Ljava/lang/ClassLoader;", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "windowExtensionsProviderClass", "c", "windowExtensionsClass", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    public d(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    private final Class<?> d() {
        return this.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    private final boolean e() {
        return tb.a.f189388a.a(new er.a() { // from class: lb.c
            @Override // er.a
            public final Object a() {
                return d.f(this.f117448a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class f(d dVar) {
        return dVar.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(d dVar) throws NoSuchMethodException {
        Method declaredMethod = dVar.d().getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsC = dVar.c();
        tb.a aVar = tb.a.f189388a;
        return aVar.b(declaredMethod, clsC) && aVar.d(declaredMethod);
    }

    public final Class<?> c() {
        return this.loader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final boolean h() {
        return e() && tb.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new er.a() { // from class: lb.b
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(d.g(this.f117447a));
            }
        });
    }
}
