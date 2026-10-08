package b7;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16958b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16959c = 0;

    /* JADX INFO: renamed from: b7.a$a, reason: collision with other inner class name */
    private static class C0419a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f16960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f16961b;

        C0419a(EditText editText, boolean z15) {
            this.f16960a = editText;
            g gVar = new g(editText, z15);
            this.f16961b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b7.b.getInstance());
        }

        @Override // b7.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // b7.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f16960a, inputConnection, editorInfo);
        }

        @Override // b7.a.b
        void c(boolean z15) {
            this.f16961b.c(z15);
        }
    }

    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z15) {
            throw null;
        }
    }

    public a(EditText editText, boolean z15) {
        i.h(editText, "editText cannot be null");
        this.f16957a = new C0419a(editText, z15);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f16957a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f16957a.b(inputConnection, editorInfo);
    }

    public void c(boolean z15) {
        this.f16957a.c(z15);
    }
}
