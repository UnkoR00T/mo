package com.google.android.exoplayer2.ui;

import ak.p0;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f28943a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f28945b;

        private b(String str, Map<String, String> map) {
            this.f28944a = str;
            this.f28945b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$c, reason: collision with other inner class name */
    static final class C0741c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<C0741c> f28946e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.C0741c.a((c.C0741c) obj, (c.C0741c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<C0741c> f28947f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.C0741c.b((c.C0741c) obj, (c.C0741c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f28951d;

        public static /* synthetic */ int a(C0741c c0741c, C0741c c0741c2) {
            int iCompare = Integer.compare(c0741c2.f28949b, c0741c.f28949b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = c0741c.f28950c.compareTo(c0741c2.f28950c);
            return iCompareTo != 0 ? iCompareTo : c0741c.f28951d.compareTo(c0741c2.f28951d);
        }

        public static /* synthetic */ int b(C0741c c0741c, C0741c c0741c2) {
            int iCompare = Integer.compare(c0741c2.f28948a, c0741c.f28948a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = c0741c2.f28950c.compareTo(c0741c.f28950c);
            return iCompareTo != 0 ? iCompareTo : c0741c2.f28951d.compareTo(c0741c.f28951d);
        }

        private C0741c(int i15, int i16, String str, String str2) {
            this.f28948a = i15;
            this.f28949b = i16;
            this.f28950c = str;
            this.f28951d = str2;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0741c> f28952a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<C0741c> f28953b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f15) {
        if (charSequence == null) {
            return new b("", p0.m());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), p0.m());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i15 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(com.google.android.exoplayer2.ui.b.a("bg_" + iIntValue), bg.c.b("background-color:%s;", com.google.android.exoplayer2.ui.b.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f15);
        StringBuilder sb5 = new StringBuilder(spanned.length());
        int i16 = 0;
        while (i15 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i15);
            sb5.append(b(spanned.subSequence(i16, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f28953b, C0741c.f28947f);
            Iterator it4 = dVar.f28953b.iterator();
            while (it4.hasNext()) {
                sb5.append(((C0741c) it4.next()).f28951d);
            }
            Collections.sort(dVar.f28952a, C0741c.f28946e);
            Iterator it5 = dVar.f28952a.iterator();
            while (it5.hasNext()) {
                sb5.append(((C0741c) it5.next()).f28950c);
            }
            i15++;
            i16 = iKeyAt;
        }
        sb5.append(b(spanned.subSequence(i16, spanned.length())));
        return new b(sb5.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f28943a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f15) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f15);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                bg.a.b(strD);
                C0741c c0741c = new C0741c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f28952a.add(c0741c);
                f(sparseArray, spanEnd).f28953b.add(c0741c);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof xf.c)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof xf.b) {
                return "<rt>" + b(((xf.b) obj).f218294a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f15) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return bg.c.b("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return bg.c.b("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return bg.c.b("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f15));
        }
        if (obj instanceof RelativeSizeSpan) {
            return bg.c.b("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return bg.c.b("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof xf.b)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof xf.c)) {
                return null;
            }
            xf.c cVar = (xf.c) obj;
            return bg.c.b("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(cVar.f218296a, cVar.f218297b), g(cVar.f218298c));
        }
        int i15 = ((xf.b) obj).f218295b;
        if (i15 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i15 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i15 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i15) {
        d dVar = sparseArray.get(i15);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i15, dVar2);
        return dVar2;
    }

    private static String g(int i15) {
        return i15 != 2 ? "over right" : "under left";
    }

    private static String h(int i15, int i16) {
        StringBuilder sb5 = new StringBuilder();
        if (i16 == 1) {
            sb5.append("filled ");
        } else if (i16 == 2) {
            sb5.append("open ");
        }
        if (i15 == 0) {
            sb5.append("none");
        } else if (i15 == 1) {
            sb5.append("circle");
        } else if (i15 == 2) {
            sb5.append("dot");
        } else if (i15 != 3) {
            sb5.append("unset");
        } else {
            sb5.append("sesame");
        }
        return sb5.toString();
    }
}
