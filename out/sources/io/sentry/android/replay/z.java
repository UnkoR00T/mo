package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/z;", "", "<init>", "()V", "Landroid/view/View;", "maybeDecorView", "Landroid/view/Window;", "d", "(Landroid/view/View;)Landroid/view/Window;", "Ljava/lang/Class;", "b", "Loq/k;", "()Ljava/lang/Class;", "decorViewClass", "Ljava/lang/reflect/Field;", "c", "()Ljava/lang/reflect/Field;", "windowField", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PrivateApi"})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f94621a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final oq.k decorViewClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final oq.k windowField;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94624d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;"}, k = 3, mv = {1, 9, 0})
    static final class a extends fr.w implements er.a<Class<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f94625b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Class<?> a() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Field;", "c", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 9, 0})
    static final class b extends fr.w implements er.a<Field> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f94626b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Field a() {
            Class clsB = z.f94621a.b();
            if (clsB == null) {
                return null;
            }
            try {
                Field declaredField = clsB.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                clsB.toString();
                return null;
            }
        }
    }

    static {
        oq.o oVar = oq.o.NONE;
        decorViewClass = oq.l.b(oVar, a.f94625b);
        windowField = oq.l.b(oVar, b.f94626b);
        f94624d = 8;
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> b() {
        return (Class) decorViewClass.getValue();
    }

    private final Field c() {
        return (Field) windowField.getValue();
    }

    public final Window d(View maybeDecorView) {
        Field fieldC;
        Class<?> clsB = b();
        if (clsB == null || !clsB.isInstance(maybeDecorView) || (fieldC = f94621a.c()) == null) {
            return null;
        }
        return (Window) fieldC.get(maybeDecorView);
    }
}
