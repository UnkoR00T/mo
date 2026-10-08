package u10;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu10/c;", "Lu10/b;", "<init>", "()V", "", "text", "Landroid/text/Spanned;", "parse", "(Ljava/lang/String;)Landroid/text/Spanned;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {
    @Override // u10.a
    public Spanned parse(String text) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h6.b.a(text, 63));
        int length = r.w1(spannableStringBuilder.toString(), '\n').length();
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }
}
