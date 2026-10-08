package x5;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    private static Typeface n(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // x5.t
    protected Font l(f6.g.b bVar) {
        Typeface typefaceN;
        Font fontJ;
        String strC = bVar.c();
        if (strC == null || (typefaceN = n(strC)) == null || (fontJ = p.j(typefaceN)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            c2.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
