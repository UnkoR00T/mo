package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t22\u0010\b\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/x;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "swap", "Loq/i0;", "e", "(Ler/l;)V", "Ljava/lang/Class;", "b", "Loq/k;", "c", "()Ljava/lang/Class;", "windowManagerClass", "d", "()Ljava/lang/Object;", "windowManagerInstance", "Ljava/lang/reflect/Field;", "()Ljava/lang/reflect/Field;", "mViewsField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f94592a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final oq.k windowManagerClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final oq.k windowManagerInstance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final oq.k mViewsField;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94596e;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Field;", "c", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 9, 0})
    static final class a extends fr.w implements er.a<Field> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f94597b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Field a() throws NoSuchFieldException {
            Class clsC = x.f94592a.c();
            if (clsC == null) {
                return null;
            }
            Field declaredField = clsC.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;"}, k = 3, mv = {1, 9, 0})
    static final class b extends fr.w implements er.a<Class<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f94598b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Class<?> a() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class c extends fr.w implements er.a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f94599b = new c();

        c() {
            super(0);
        }

        @Override // er.a
        public final Object a() {
            Method method;
            Class clsC = x.f94592a.c();
            if (clsC == null || (method = clsC.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        oq.o oVar = oq.o.NONE;
        windowManagerClass = oq.l.b(oVar, b.f94598b);
        windowManagerInstance = oq.l.b(oVar, c.f94599b);
        mViewsField = oq.l.b(oVar, a.f94597b);
        f94596e = 8;
    }

    private x() {
    }

    private final Field b() {
        return (Field) mViewsField.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> c() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object d() {
        return windowManagerInstance.getValue();
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void e(er.l<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field fieldB;
        try {
            Object objD = d();
            if (objD == null || (fieldB = f94592a.b()) == null) {
                return;
            }
            fieldB.set(objD, swap.b((ArrayList) fieldB.get(objD)));
        } catch (Throwable unused) {
        }
    }
}
