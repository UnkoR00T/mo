package b7;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f16967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.emoji2.text.e.f f16968b;

    static class a extends androidx.emoji2.text.e.f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f16969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Reference<d> f16970b;

        a(TextView textView, d dVar) {
            this.f16969a = new WeakReference(textView);
            this.f16970b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            Handler handler;
            super.b();
            TextView textView = this.f16969a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceR;
            TextView textView = this.f16969a.get();
            if (c(textView, this.f16970b.get()) && textView.isAttachedToWindow() && text != (charSequenceR = androidx.emoji2.text.e.c().r((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceR);
                int selectionEnd = Selection.getSelectionEnd(charSequenceR);
                textView.setText(charSequenceR);
                if (charSequenceR instanceof Spannable) {
                    d.b((Spannable) charSequenceR, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f16967a = textView;
    }

    static void b(Spannable spannable, int i15, int i16) {
        if (i15 >= 0 && i16 >= 0) {
            Selection.setSelection(spannable, i15, i16);
        } else if (i15 >= 0) {
            Selection.setSelection(spannable, i15);
        } else if (i16 >= 0) {
            Selection.setSelection(spannable, i16);
        }
    }

    androidx.emoji2.text.e.f a() {
        if (this.f16968b == null) {
            this.f16968b = new a(this.f16967a, this);
        }
        return this.f16968b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i15, int i16, Spanned spanned, int i17, int i18) {
        if (this.f16967a.isInEditMode()) {
            return charSequence;
        }
        int iG = androidx.emoji2.text.e.c().g();
        if (iG != 0) {
            if (iG == 1) {
                if ((i18 == 0 && i17 == 0 && spanned.length() == 0 && charSequence == this.f16967a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i15 != 0 || i16 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i15, i16);
                }
                return androidx.emoji2.text.e.c().s(charSequence, 0, charSequence.length());
            }
            if (iG != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.c().v(a());
        return charSequence;
    }
}
