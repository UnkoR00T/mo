package u4;

import android.graphics.Typeface;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu4/p0;", "Lu4/o0;", "<init>", "()V", "", "genericFontFamily", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Landroid/graphics/Typeface;", "c", "(Ljava/lang/String;Lu4/d0;I)Landroid/graphics/Typeface;", "b", "(Lu4/d0;I)Landroid/graphics/Typeface;", "Lu4/h0;", "name", "a", "(Lu4/h0;Lu4/d0;I)Landroid/graphics/Typeface;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p0 implements o0 {
    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        y.Companion companion = y.INSTANCE;
        if (y.f(fontStyle, companion.b()) && fr.t.c(fontWeight, FontWeight.INSTANCE.d()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.p(), y.f(fontStyle, companion.a()));
    }

    @Override // u4.o0
    public Typeface a(h0 name, FontWeight fontWeight, int fontStyle) {
        return c(name.getName(), fontWeight, fontStyle);
    }

    @Override // u4.o0
    public Typeface b(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }
}
