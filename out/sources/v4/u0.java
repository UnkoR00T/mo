package v4;

import p071kotlin.Metadata;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv4/t0;", "", "maxChars", "Lq4/e;", "c", "(Lv4/t0;I)Lq4/e;", "b", "a", "(Lv4/t0;)Lq4/e;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u0 {
    public static final q4.e a(TextFieldValue textFieldValue) {
        return textFieldValue.getText().t(textFieldValue.getSelection());
    }

    public static final q4.e b(TextFieldValue textFieldValue, int i15) {
        q4.e text = textFieldValue.getText();
        int iK = z3.k(textFieldValue.getSelection());
        int iK2 = z3.k(textFieldValue.getSelection());
        int length = iK2 + i15;
        if (((i15 ^ length) & (iK2 ^ length)) < 0) {
            length = textFieldValue.m().length();
        }
        return text.subSequence(iK, Math.min(length, textFieldValue.m().length()));
    }

    public static final q4.e c(TextFieldValue textFieldValue, int i15) {
        q4.e text = textFieldValue.getText();
        int iL = z3.l(textFieldValue.getSelection());
        int i16 = iL - i15;
        if (((i15 ^ iL) & (iL ^ i16)) < 0) {
            i16 = 0;
        }
        return text.subSequence(Math.max(0, i16), z3.l(textFieldValue.getSelection()));
    }
}
