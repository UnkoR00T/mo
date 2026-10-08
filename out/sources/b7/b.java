package b7;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes3.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f16962a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f16963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f16964c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f16964c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f16963b == null) {
            synchronized (f16962a) {
                try {
                    if (f16963b == null) {
                        f16963b = new b();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f16963b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f16964c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
