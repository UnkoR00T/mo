package zf;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f234961g = new a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f234962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f234963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f234964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f234965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f234966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f234967f;

    public a(int i15, int i16, int i17, int i18, int i19, Typeface typeface) {
        this.f234962a = i15;
        this.f234963b = i16;
        this.f234964c = i17;
        this.f234965d = i18;
        this.f234966e = i19;
        this.f234967f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return bg.c.f19281a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f234961g.f234962a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f234961g.f234963b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f234961g.f234964c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f234961g.f234965d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f234961g.f234966e, captionStyle.getTypeface());
    }
}
