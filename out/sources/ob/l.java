package ob;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fr.q0;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0018\u0010'\u001a\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lob/l;", "", "Ljava/lang/ClassLoader;", "loader", "Lmb/d;", "consumerAdapter", "<init>", "(Ljava/lang/ClassLoader;Lmb/d;)V", "", "h", "()Z", ip.a.f96138c, "s", "w", "y", "q", "A", "u", "C", "n", "o", "p", "a", "Ljava/lang/ClassLoader;", "b", "Lmb/d;", "Llb/d;", "c", "Llb/d;", "safeWindowExtensionsProvider", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "displayFoldFeatureClass", "k", "supportedWindowFeaturesClass", "j", "foldingFeatureClass", "m", "windowLayoutComponentClass", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "l", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mb.d consumerAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lb.d safeWindowExtensionsProvider;

    public l(ClassLoader classLoader, mb.d dVar) {
        this.loader = classLoader;
        this.consumerAdapter = dVar;
        this.safeWindowExtensionsProvider = new lb.d(classLoader);
    }

    private final boolean A() {
        return tb.a.e("SupportedWindowFeatures is not valid", new er.a() { // from class: ob.g
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.B(this.f144172a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(l lVar) throws NoSuchMethodException {
        Method method = lVar.k().getMethod("getDisplayFoldFeatures", null);
        Class cls = (Class) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
        tb.a aVar = tb.a.f189388a;
        return aVar.d(method) && aVar.b(method, List.class) && fr.t.c(cls, lVar.i());
    }

    private final boolean D() {
        return tb.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new er.a() { // from class: ob.e
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.E(this.f144170a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(l lVar) throws NoSuchMethodException {
        Method method = lVar.safeWindowExtensionsProvider.c().getMethod("getWindowLayoutComponent", null);
        Class<?> clsM = lVar.m();
        tb.a aVar = tb.a.f189388a;
        return aVar.d(method) && aVar.b(method, clsM);
    }

    private final boolean h() {
        int iA;
        if (!C() || (iA = mb.e.f125202a.a()) < 1) {
            return false;
        }
        if (iA == 1) {
            return n();
        }
        return iA < 5 ? o() : p();
    }

    private final Class<?> i() {
        return this.loader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
    }

    private final Class<?> j() {
        return this.loader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final Class<?> k() {
        return this.loader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
    }

    private final Class<?> m() {
        return this.loader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    private final boolean q() {
        return tb.a.e("DisplayFoldFeature is not valid", new er.a() { // from class: ob.h
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.r(this.f144173a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(l lVar) throws NoSuchMethodException {
        Class<?> clsI = lVar.i();
        Method method = clsI.getMethod("getType", null);
        Class<?> cls = Integer.TYPE;
        Method method2 = clsI.getMethod("hasProperty", cls);
        Method method3 = clsI.getMethod("hasProperties", int[].class);
        tb.a aVar = tb.a.f189388a;
        if (!aVar.d(method) || !aVar.b(method, cls) || !aVar.d(method2)) {
            return false;
        }
        Class<?> cls2 = Boolean.TYPE;
        return aVar.b(method2, cls2) && aVar.d(method3) && aVar.b(method3, cls2);
    }

    private final boolean s() {
        return tb.a.e("FoldingFeature class is not valid", new er.a() { // from class: ob.f
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.t(this.f144171a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(l lVar) throws NoSuchMethodException {
        Class<?> clsJ = lVar.j();
        Method method = clsJ.getMethod("getBounds", null);
        Method method2 = clsJ.getMethod("getType", null);
        Method method3 = clsJ.getMethod("getState", null);
        tb.a aVar = tb.a.f189388a;
        if (!aVar.c(method, q0.c(Rect.class)) || !aVar.d(method)) {
            return false;
        }
        Class cls = Integer.TYPE;
        return aVar.c(method2, q0.c(cls)) && aVar.d(method2) && aVar.c(method3, q0.c(cls)) && aVar.d(method3);
    }

    private final boolean u() {
        return tb.a.e("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new er.a() { // from class: ob.i
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.v(this.f144174a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(l lVar) throws NoSuchMethodException {
        Method method = lVar.m().getMethod("getSupportedWindowFeatures", null);
        tb.a aVar = tb.a.f189388a;
        return aVar.d(method) && aVar.b(method, lVar.k());
    }

    private final boolean w() {
        return tb.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new er.a() { // from class: ob.j
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.x(this.f144175a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(l lVar) throws NoSuchMethodException {
        Class<?> clsB = lVar.consumerAdapter.b();
        if (clsB == null) {
            return false;
        }
        Class<?> clsM = lVar.m();
        Method method = clsM.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
        Method method2 = clsM.getMethod("removeWindowLayoutInfoListener", clsB);
        tb.a aVar = tb.a.f189388a;
        return aVar.d(method) && aVar.d(method2);
    }

    private final boolean y() {
        return tb.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new er.a() { // from class: ob.k
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(l.z(this.f144176a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(l lVar) throws NoSuchMethodException {
        Class<?> clsM = lVar.m();
        Method method = clsM.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsM.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        tb.a aVar = tb.a.f189388a;
        return aVar.d(method) && aVar.d(method2);
    }

    public final boolean C() {
        return this.safeWindowExtensionsProvider.h() && D() && s();
    }

    public final WindowLayoutComponent l() {
        if (!h()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean n() {
        return w();
    }

    public final boolean o() {
        return n() && y();
    }

    public final boolean p() {
        return o() && q() && A() && u();
    }
}
