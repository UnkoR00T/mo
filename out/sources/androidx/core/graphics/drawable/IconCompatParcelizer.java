package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f11833a = aVar.p(iconCompat.f11833a, 1);
        iconCompat.f11835c = aVar.j(iconCompat.f11835c, 2);
        iconCompat.f11836d = aVar.r(iconCompat.f11836d, 3);
        iconCompat.f11837e = aVar.p(iconCompat.f11837e, 4);
        iconCompat.f11838f = aVar.p(iconCompat.f11838f, 5);
        iconCompat.f11839g = (ColorStateList) aVar.r(iconCompat.f11839g, 6);
        iconCompat.f11841i = aVar.t(iconCompat.f11841i, 7);
        iconCompat.f11842j = aVar.t(iconCompat.f11842j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.l(aVar.f());
        int i15 = iconCompat.f11833a;
        if (-1 != i15) {
            aVar.F(i15, 1);
        }
        byte[] bArr = iconCompat.f11835c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f11836d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i16 = iconCompat.f11837e;
        if (i16 != 0) {
            aVar.F(i16, 4);
        }
        int i17 = iconCompat.f11838f;
        if (i17 != 0) {
            aVar.F(i17, 5);
        }
        ColorStateList colorStateList = iconCompat.f11839g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f11841i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f11842j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
