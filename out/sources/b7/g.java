package b7;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f16978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.e.f f16980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16981d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16982e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16983f = true;

    static class a extends androidx.emoji2.text.e.f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f16984a;

        a(EditText editText) {
            this.f16984a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.f16984a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.b(this.f16984a.get(), 1);
        }
    }

    g(EditText editText, boolean z15) {
        this.f16978a = editText;
        this.f16979b = z15;
    }

    static void b(EditText editText, int i15) {
        if (i15 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f16983f) {
            return (this.f16979b || androidx.emoji2.text.e.k()) ? false : true;
        }
        return true;
    }

    androidx.emoji2.text.e.f a() {
        if (this.f16980c == null) {
            this.f16980c = new a(this.f16978a);
        }
        return this.f16980c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
    }

    public void c(boolean z15) {
        if (this.f16983f != z15) {
            if (this.f16980c != null) {
                androidx.emoji2.text.e.c().w(this.f16980c);
            }
            this.f16983f = z15;
            if (z15) {
                b(this.f16978a, androidx.emoji2.text.e.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        if (this.f16978a.isInEditMode() || d() || i16 > i17 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = androidx.emoji2.text.e.c().g();
        if (iG != 0) {
            if (iG == 1) {
                androidx.emoji2.text.e.c().u((Spannable) charSequence, i15, i15 + i17, this.f16981d, this.f16982e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().v(a());
    }
}
