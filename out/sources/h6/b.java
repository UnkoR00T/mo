package h6;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class b {

    static class a {
        static Spanned a(String str, int i15) {
            return Html.fromHtml(str, i15);
        }
    }

    public static Spanned a(String str, int i15) {
        return a.a(str, i15);
    }
}
