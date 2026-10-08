package u4;

import android.graphics.Typeface;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lu4/q0;", "Lu4/o0;", "<init>", "()V", "", "familyName", "Lu4/d0;", "weight", "Lu4/y;", "style", "Landroid/graphics/Typeface;", "d", "(Ljava/lang/String;Lu4/d0;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "c", "b", "(Lu4/d0;I)Landroid/graphics/Typeface;", "Lu4/h0;", "name", "a", "(Lu4/h0;Lu4/d0;I)Landroid/graphics/Typeface;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0 implements o0 {
    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (y.f(fontStyle, y.INSTANCE.b()) && fr.t.c(fontWeight, FontWeight.INSTANCE.d()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = f.c(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(genericFontFamily, iC);
    }

    private final Typeface d(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(familyName, weight, style);
        if (fr.t.c(typefaceC, Typeface.create(Typeface.DEFAULT, f.c(weight, style))) || fr.t.c(typefaceC, c(null, weight, style))) {
            return null;
        }
        return typefaceC;
    }

    @Override // u4.o0
    public Typeface a(h0 name, FontWeight fontWeight, int fontStyle) {
        Typeface typefaceD = d(r0.b(name.getName(), fontWeight), fontWeight, fontStyle);
        return typefaceD == null ? c(name.getName(), fontWeight, fontStyle) : typefaceD;
    }

    @Override // u4.o0
    public Typeface b(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }
}
