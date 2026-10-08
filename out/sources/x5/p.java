package x5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.List;
import r0.c0;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v f216822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0<String, Typeface> f216823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Paint f216824c;

    public static class a extends f6.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w5.h.e f216825a;

        public a(w5.h.e eVar) {
            this.f216825a = eVar;
        }

        @Override // f6.g.c
        public void a(int i15) {
            w5.h.e eVar = this.f216825a;
            if (eVar != null) {
                eVar.f(i15);
            }
        }

        @Override // f6.g.c
        public void b(Typeface typeface) {
            w5.h.e eVar = this.f216825a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        eb.a.c("TypefaceCompat static init");
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            f216822a = new u();
        } else if (i15 >= 29) {
            f216822a = new t();
        } else if (i15 >= 28) {
            f216822a = new s();
        } else {
            f216822a = new r();
        }
        f216823b = new c0<>(16);
        f216824c = null;
        eb.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i15) {
        if (context != null) {
            return Typeface.create(typeface, i15);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f6.g.b[] bVarArr, int i15) {
        eb.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f216822a.b(context, cancellationSignal, bVarArr, i15);
        } finally {
            eb.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<f6.g.b[]> list, int i15) {
        eb.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f216822a.c(context, cancellationSignal, list, i15);
        } finally {
            eb.a.f();
        }
    }

    public static Typeface d(Context context, w5.e.b bVar, Resources resources, int i15, String str, int i16, int i17, w5.h.e eVar, Handler handler, boolean z15) {
        Typeface typefaceA;
        if (bVar instanceof w5.e.C5528e) {
            w5.e.C5528e c5528e = (w5.e.C5528e) bVar;
            Typeface typefaceI = i(c5528e);
            if (typefaceI != null) {
                if (eVar != null) {
                    eVar.d(typefaceI, handler);
                }
                f216823b.e(f(resources, i15, str, i16, i17), typefaceI);
                return typefaceI;
            }
            typefaceA = f6.g.c(context, c5528e.b(), i17, !z15 ? eVar != null : c5528e.a() != 0, z15 ? c5528e.d() : -1, w5.h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f216822a.a(context, (w5.e.c) bVar, resources, i17);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f216823b.e(f(resources, i15, str, i16, i17), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i15, String str, int i16, int i17) {
        Typeface typefaceD = f216822a.d(context, resources, i15, str, i17);
        if (typefaceD != null) {
            f216823b.e(f(resources, i15, str, i16, i17), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i15, String str, int i16, int i17) {
        return resources.getResourcePackageName(i15) + '-' + str + '-' + i16 + '-' + i15 + '-' + i17;
    }

    public static Typeface g(Resources resources, int i15, String str, int i16, int i17) {
        return f216823b.d(f(resources, i15, str, i16, i17));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    private static Typeface i(w5.e.C5528e c5528e) {
        FontFamily fontFamilyBuild;
        Typeface typefaceH;
        String strC = c5528e.c();
        if (!TextUtils.isEmpty(strC) && (typefaceH = h(strC)) != null) {
            return typefaceH;
        }
        List<f6.e> listB = c5528e.b();
        if (listB.size() == 1) {
            return h(listB.get(0).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i15 = 0; i15 < listB.size(); i15++) {
            if (h(listB.get(i15).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
        for (int i16 = 0; i16 < listB.size(); i16++) {
            f6.e eVar = listB.get(i16);
            if (i16 == listB.size() - 1 && TextUtils.isEmpty(eVar.i())) {
                customFallbackBuilderA.setSystemFallback(eVar.h());
                break;
            }
            Font fontJ = j(h(eVar.h()));
            if (fontJ == null) {
                c2.g("TypefaceCompat", "Unable identify the primary font for " + eVar.h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(eVar.i())) {
                try {
                    n.a();
                    o.a();
                    fontFamilyBuild = l.a(k.a(fontJ).setFontVariationSettings(eVar.i()).build()).build();
                } catch (IOException unused) {
                    c2.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                fontFamilyBuild = l.a(fontJ).build();
            }
            if (customFallbackBuilderA == null) {
                customFallbackBuilderA = m.a(fontFamilyBuild);
            } else {
                customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderA.build();
    }

    public static Font j(Typeface typeface) {
        if (f216824c == null) {
            f216824c = new Paint();
        }
        f216824c.setTextSize(10.0f);
        f216824c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f216824c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
