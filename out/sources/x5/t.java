package x5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t extends v {
    private Font h(FontFamily fontFamily, int i15) {
        FontStyle fontStyle = new FontStyle((i15 & 1) != 0 ? 700 : 400, (i15 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM = m(fontStyle, font.getStyle());
        for (int i16 = 1; i16 < fontFamily.getSize(); i16++) {
            Font font2 = fontFamily.getFont(i16);
            int iM2 = m(fontStyle, font2.getStyle());
            if (iM2 < iM) {
                font = font2;
                iM = iM2;
            }
        }
        return font;
    }

    private Font i(CancellationSignal cancellationSignal, f6.g.b bVar, ContentResolver contentResolver) {
        return bVar.i() ? l(bVar) : k(cancellationSignal, bVar, contentResolver);
    }

    private Font k(CancellationSignal cancellationSignal, f6.g.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.g()).setSlant(bVar.h() ? 1 : 0).setTtcIndex(bVar.d());
                if (!TextUtils.isEmpty(bVar.f())) {
                    ttcIndex.setFontVariationSettings(bVar.f());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            c2.h("TypefaceCompatApi29Impl", "Font load failed", e15);
            return null;
        }
    }

    private static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // x5.v
    public Typeface a(Context context, w5.e.c cVar, Resources resources, int i15) {
        try {
            FontFamily.Builder builder = null;
            for (w5.e.d dVar : cVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i15).getStyle()).build();
        } catch (Exception e15) {
            c2.h("TypefaceCompatApi29Impl", "Font load failed", e15);
            return null;
        }
    }

    @Override // x5.v
    public Typeface b(Context context, CancellationSignal cancellationSignal, f6.g.b[] bVarArr, int i15) {
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyJ).setStyle(h(fontFamilyJ, i15).getStyle()).build();
        } catch (Exception e15) {
            c2.h("TypefaceCompatApi29Impl", "Font load failed", e15);
            return null;
        }
    }

    @Override // x5.v
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<f6.g.b[]> list, int i15) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            for (int i16 = 1; i16 < list.size(); i16++) {
                FontFamily fontFamilyJ2 = j(cancellationSignal, list.get(i16), contentResolver);
                if (fontFamilyJ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyJ2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyJ, i15).getStyle()).build();
        } catch (Exception e15) {
            c2.h("TypefaceCompatApi29Impl", "Font load failed", e15);
            return null;
        }
    }

    @Override // x5.v
    public Typeface d(Context context, Resources resources, int i15, String str, int i16) {
        try {
            Font fontBuild = new Font.Builder(resources, i15).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e15) {
            c2.h("TypefaceCompatApi29Impl", "Font load failed", e15);
            return null;
        }
    }

    @Override // x5.v
    protected f6.g.b g(f6.g.b[] bVarArr, int i15) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    protected FontFamily j(CancellationSignal cancellationSignal, f6.g.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (f6.g.b bVar : bVarArr) {
            Font fontI = i(cancellationSignal, bVar, contentResolver);
            if (fontI != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontI);
                } else {
                    builder.addFont(fontI);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    protected Font l(f6.g.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
