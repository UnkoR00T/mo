package v4;

import android.view.inputmethod.ExtractedText;
import p071kotlin.Metadata;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv4/t0;", "Landroid/view/inputmethod/ExtractedText;", "a", "(Lv4/t0;)Landroid/view/inputmethod/ExtractedText;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.m();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.m().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = z3.l(textFieldValue.getSelection());
        extractedText.selectionEnd = z3.k(textFieldValue.getSelection());
        extractedText.flags = !fu.r.c0(textFieldValue.m(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
