package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b7.a f8956b;

    m(EditText editText) {
        this.f8955a = editText;
        this.f8956b = new b7.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f8956b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i15) {
        TypedArray typedArrayObtainStyledAttributes = this.f8955a.getContext().obtainStyledAttributes(attributeSet, p007NuL.v.f468g0, i15, 0);
        try {
            boolean z15 = typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f537u0) ? typedArrayObtainStyledAttributes.getBoolean(p007NuL.v.f537u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z15);
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f8956b.b(inputConnection, editorInfo);
    }

    void e(boolean z15) {
        this.f8956b.c(z15);
    }
}
