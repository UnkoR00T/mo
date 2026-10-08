package j4;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f99358a;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i15, int i16, int i17, int i18, int i19, int i25) {
            viewStructure.setDimens(i15, i16, i17, i18, i19, i25);
        }

        static void e(ViewStructure viewStructure, int i15, String str, String str2, String str3) {
            viewStructure.setId(i15, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f15, int i15, int i16, int i17) {
            viewStructure.setTextStyle(f15, i15, i16, i17);
        }
    }

    private e(ViewStructure viewStructure) {
        this.f99358a = viewStructure;
    }

    public static e i(ViewStructure viewStructure) {
        return new e(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f99358a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.f99358a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.f99358a, charSequence);
    }

    public void d(int i15, int i16, int i17, int i18, int i19, int i25) {
        a.d((ViewStructure) this.f99358a, i15, i16, i17, i18, i19, i25);
    }

    public void e(int i15, String str, String str2, String str3) {
        a.e((ViewStructure) this.f99358a, i15, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.f99358a, charSequence);
    }

    public void g(float f15, int i15, int i16, int i17) {
        a.g((ViewStructure) this.f99358a, f15, i15, i16, i17);
    }

    public ViewStructure h() {
        return (ViewStructure) this.f99358a;
    }
}
