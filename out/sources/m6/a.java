package m6;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import i6.i;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f123818a = new String[0];

    /* JADX INFO: renamed from: m6.a$a, reason: collision with other inner class name */
    private static class C3030a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i15) {
            editorInfo.setInitialSurroundingSubText(charSequence, i15);
        }
    }

    private static class b {
        static void a(EditorInfo editorInfo, boolean z15) {
            editorInfo.setStylusHandwritingEnabled(z15);
        }
    }

    private static boolean a(CharSequence charSequence, int i15, int i16) {
        if (i16 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i15));
        }
        if (i16 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i15));
    }

    private static boolean b(int i15) {
        int i16 = i15 & 4095;
        return i16 == 129 || i16 == 225 || i16 == 18;
    }

    public static void c(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence, int i15) {
        i.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C3030a.a(editorInfo, charSequence, i15);
            return;
        }
        int i16 = editorInfo.initialSelStart;
        int i17 = editorInfo.initialSelEnd;
        int i18 = i16 > i17 ? i17 - i15 : i16 - i15;
        int i19 = i16 > i17 ? i16 - i15 : i17 - i15;
        int length = charSequence.length();
        if (i15 < 0 || i18 < 0 || i19 > length) {
            g(editorInfo, null, 0, 0);
            return;
        }
        if (b(editorInfo.inputType)) {
            g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i18, i19);
        } else {
            h(editorInfo, charSequence, i18, i19);
        }
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3030a.a(editorInfo, charSequence, 0);
        } else {
            d(editorInfo, charSequence, 0);
        }
    }

    public static void f(EditorInfo editorInfo, boolean z15) {
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(editorInfo, z15);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z15);
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i15, int i16) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i15);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i16);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i15, int i16) {
        int i17 = i16 - i15;
        int i18 = i17 > 1024 ? 0 : i17;
        int i19 = 2048 - i18;
        int iMin = Math.min(charSequence.length() - i16, i19 - Math.min(i15, (int) (((double) i19) * 0.8d)));
        int iMin2 = Math.min(i15, i19 - iMin);
        int i25 = i15 - iMin2;
        if (a(charSequence, i25, 0)) {
            i25++;
            iMin2--;
        }
        if (a(charSequence, (i16 + iMin) - 1, 1)) {
            iMin--;
        }
        g(editorInfo, i18 != i17 ? TextUtils.concat(charSequence.subSequence(i25, i25 + iMin2), charSequence.subSequence(i16, iMin + i16)) : charSequence.subSequence(i25, iMin2 + i18 + iMin + i25), iMin2, i18 + iMin2);
    }
}
