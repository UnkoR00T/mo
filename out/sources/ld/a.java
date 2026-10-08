package ld;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import md.c;
import md.i;
import td.e;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f117822d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<String> f117819a = new i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f117820b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f117821c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f117823e = ".ttf";

    public a(Drawable.Callback callback, fd.b bVar) {
        if (callback instanceof View) {
            this.f117822d = ((View) callback).getContext().getAssets();
        } else {
            e.c("LottieDrawable must be inside of a view for images to work.");
            this.f117822d = null;
        }
    }

    private Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = this.f117821c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f117822d, "fonts/" + strA + this.f117823e);
        this.f117821c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        int i15;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i15 = 3;
        } else if (zContains) {
            i15 = 2;
        } else {
            i15 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i15 ? typeface : Typeface.create(typeface, i15);
    }

    public Typeface b(c cVar) {
        this.f117819a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f117820b.get(this.f117819a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceD = d(a(cVar), cVar.c());
        this.f117820b.put(this.f117819a, typefaceD);
        return typefaceD;
    }

    public void c(String str) {
        this.f117823e = str;
    }
}
