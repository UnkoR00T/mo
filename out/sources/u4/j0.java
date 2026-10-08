package u4;

import android.graphics.Typeface;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lu4/j0;", "", "<init>", "()V", "Lu4/x0;", "typefaceRequest", "Lu4/k0;", "platformFontLoader", "Lkotlin/Function1;", "Lu4/a1$b;", "Loq/i0;", "onAsyncCompletion", "createDefaultTypeface", "Lu4/a1;", "a", "(Lu4/x0;Lu4/k0;Ler/l;Ler/l;)Lu4/a1;", "Lu4/o0;", "Lu4/o0;", "platformTypefaceResolver", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0 platformTypefaceResolver = r0.a();

    public a1 a(TypefaceRequest typefaceRequest, k0 platformFontLoader, er.l<? super a1.b, oq.i0> onAsyncCompletion, er.l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceB;
        l fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof i)) {
            typefaceB = this.platformTypefaceResolver.b(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof h0) {
            typefaceB = this.platformTypefaceResolver.a((h0) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            typefaceB = ((y4.k) ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface()).a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new a1.b(typefaceB, false, 2, null);
    }
}
