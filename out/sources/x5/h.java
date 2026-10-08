package x5;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f216812e = new h(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f216813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f216814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f216815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f216816d;

    static class a {
        static Insets a(int i15, int i16, int i17, int i18) {
            return Insets.of(i15, i16, i17, i18);
        }
    }

    private h(int i15, int i16, int i17, int i18) {
        this.f216813a = i15;
        this.f216814b = i16;
        this.f216815c = i17;
        this.f216816d = i18;
    }

    public static h a(h hVar, h hVar2) {
        return c(Math.max(hVar.f216813a, hVar2.f216813a), Math.max(hVar.f216814b, hVar2.f216814b), Math.max(hVar.f216815c, hVar2.f216815c), Math.max(hVar.f216816d, hVar2.f216816d));
    }

    public static h b(h hVar, h hVar2) {
        return c(Math.min(hVar.f216813a, hVar2.f216813a), Math.min(hVar.f216814b, hVar2.f216814b), Math.min(hVar.f216815c, hVar2.f216815c), Math.min(hVar.f216816d, hVar2.f216816d));
    }

    public static h c(int i15, int i16, int i17, int i18) {
        return (i15 == 0 && i16 == 0 && i17 == 0 && i18 == 0) ? f216812e : new h(i15, i16, i17, i18);
    }

    public static h d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static h e(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f216816d == hVar.f216816d && this.f216813a == hVar.f216813a && this.f216815c == hVar.f216815c && this.f216814b == hVar.f216814b;
    }

    public Insets f() {
        return a.a(this.f216813a, this.f216814b, this.f216815c, this.f216816d);
    }

    public int hashCode() {
        return (((((this.f216813a * 31) + this.f216814b) * 31) + this.f216815c) * 31) + this.f216816d;
    }

    public String toString() {
        return "Insets{left=" + this.f216813a + ", top=" + this.f216814b + ", right=" + this.f216815c + ", bottom=" + this.f216816d + '}';
    }
}
