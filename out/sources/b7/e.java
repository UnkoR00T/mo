package b7;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyListener f16971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16972b;

    public static class a {
        public boolean a(Editable editable, int i15, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.i(editable, i15, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i15) {
        this.f16971a.clearMetaKeyState(view, editable, i15);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f16971a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i15, KeyEvent keyEvent) {
        return this.f16972b.a(editable, i15, keyEvent) || this.f16971a.onKeyDown(view, editable, i15, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16971a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i15, KeyEvent keyEvent) {
        return this.f16971a.onKeyUp(view, editable, i15, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f16971a = keyListener;
        this.f16972b = aVar;
    }
}
