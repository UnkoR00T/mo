package fb;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0 f60567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f60568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f60569c;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(b0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f15) {
            b0.e(view, f15.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f60567a = new g0();
        } else {
            f60567a = new f0();
        }
        f60568b = new a(Float.class, "translationAlpha");
        f60569c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f60567a.a(view);
    }

    static float b(View view) {
        return f60567a.b(view);
    }

    static void c(View view) {
        f60567a.c(view);
    }

    static void d(View view, int i15, int i16, int i17, int i18) {
        f60567a.d(view, i15, i16, i17, i18);
    }

    static void e(View view, float f15) {
        f60567a.e(view, f15);
    }

    static void f(View view, int i15) {
        f60567a.f(view, i15);
    }

    static void g(View view, Matrix matrix) {
        f60567a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f60567a.h(view, matrix);
    }
}
