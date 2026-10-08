package b7;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f16965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16966b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i15, int i16, boolean z15) {
            return androidx.emoji2.text.e.h(inputConnection, editable, i15, i16, z15);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.k()) {
                androidx.emoji2.text.e.c().x(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable b() {
        return this.f16965a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i15, int i16) {
        return this.f16966b.a(this, b(), i15, i16, false) || super.deleteSurroundingText(i15, i16);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i15, int i16) {
        return this.f16966b.a(this, b(), i15, i16, true) || super.deleteSurroundingTextInCodePoints(i15, i16);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f16965a = textView;
        this.f16966b = aVar;
        aVar.b(editorInfo);
    }
}
