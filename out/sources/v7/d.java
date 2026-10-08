package v7;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f204210a = o0.u0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f204211b = o0.u0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f204212c = o0.u0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f204213d = o0.u0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f204214e = o0.u0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i15, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f204210a, spanned.getSpanStart(obj));
        bundle2.putInt(f204211b, spanned.getSpanEnd(obj));
        bundle2.putInt(f204212c, spanned.getSpanFlags(obj));
        bundle2.putInt(f204213d, i15);
        if (bundle != null) {
            bundle2.putBundle(f204214e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i15 = bundle.getInt(f204210a);
        int i16 = bundle.getInt(f204211b);
        int i17 = bundle.getInt(f204212c);
        int i18 = bundle.getInt(f204213d, -1);
        Bundle bundle2 = bundle.getBundle(f204214e);
        if (i18 == 1) {
            spannable.setSpan(f.a((Bundle) p.q(bundle2)), i15, i16, i17);
            return;
        }
        if (i18 == 2) {
            spannable.setSpan(h.a((Bundle) p.q(bundle2)), i15, i16, i17);
        } else if (i18 == 3) {
            spannable.setSpan(new e(), i15, i16, i17);
        } else {
            if (i18 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) p.q(bundle2)), i15, i16, i17);
        }
    }
}
