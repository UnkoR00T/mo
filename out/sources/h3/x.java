package h3;

import android.view.autofill.AutofillValue;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh3/w$a;", "", "textValue", "Lh3/w;", "b", "(Lh3/w$a;Ljava/lang/CharSequence;)Lh3/w;", "", "booleanValue", "a", "(Lh3/w$a;Z)Lh3/w;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final w a(w.Companion companion, boolean z15) {
        return new h(AutofillValue.forToggle(z15));
    }

    public static final w b(w.Companion companion, CharSequence charSequence) {
        return new h(AutofillValue.forText(charSequence));
    }
}
