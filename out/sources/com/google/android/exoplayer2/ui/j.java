package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class j extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f28980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f28981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<wf.a> f28982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zf.a f28983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f28984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f28986g;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28988a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f28988a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28988a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28988a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int b(int i15) {
        if (i15 != 1) {
            return i15 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i15 = b.f28988a[alignment.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String d(zf.a aVar) {
        int i15 = aVar.f234965d;
        if (i15 == 1) {
            return bg.c.b("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(aVar.f234966e));
        }
        if (i15 == 2) {
            return bg.c.b("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f234966e));
        }
        if (i15 != 3) {
            return i15 != 4 ? "unset" : bg.c.b("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f234966e));
        }
        return bg.c.b("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(aVar.f234966e));
    }

    private String e(int i15, float f15) {
        float f16 = i.f(i15, f15, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f16 == -3.4028235E38f ? "unset" : bg.c.b("%.2fpx", Float.valueOf(f16 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i15) {
        if (i15 != 1) {
            return i15 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(wf.a aVar) {
        float f15 = aVar.f212961q;
        if (f15 == 0.0f) {
            return "";
        }
        int i15 = aVar.f212960p;
        return bg.c.b("%s(%.2fdeg)", (i15 == 2 || i15 == 1) ? "skewY" : "skewX", Float.valueOf(f15));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0109  */
    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x013e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fa  */
    private void i() {
        float f15;
        String strB;
        int iB;
        boolean z15;
        String str;
        float f16;
        String strB2;
        int i15;
        int i16;
        String str2;
        String str3;
        Object obj;
        String str4;
        c.b bVarA;
        Layout.Alignment alignment;
        String str5;
        boolean z16;
        StringBuilder sb5 = new StringBuilder();
        float f17 = 1.2f;
        sb5.append(bg.c.b("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", com.google.android.exoplayer2.ui.b.b(this.f28983d.f234962a), e(this.f28985f, this.f28984e), Float.valueOf(1.2f), d(this.f28983d)));
        HashMap map = new HashMap();
        map.put(com.google.android.exoplayer2.ui.b.a("default_bg"), bg.c.b("background-color:%s;", com.google.android.exoplayer2.ui.b.b(this.f28983d.f234963b)));
        int i17 = 0;
        while (i17 < this.f28982c.size()) {
            wf.a aVar = this.f28982c.get(i17);
            float f18 = aVar.f212952h;
            float f19 = f18 != -3.4028235E38f ? f18 * 100.0f : 50.0f;
            int iB2 = b(aVar.f212953i);
            float f25 = aVar.f212949e;
            float f26 = f17;
            if (f25 != -3.4028235E38f) {
                if (aVar.f212950f != 1) {
                    String strB3 = bg.c.b("%.2f%%", Float.valueOf(f25 * 100.0f));
                    iB = aVar.f212960p == 1 ? -b(aVar.f212951g) : b(aVar.f212951g);
                    f15 = -3.4028235E38f;
                    str = strB3;
                    z15 = false;
                } else {
                    f15 = -3.4028235E38f;
                    if (f25 >= 0.0f) {
                        strB = bg.c.b("%.2fem", Float.valueOf(f25 * f26));
                        z15 = false;
                        iB = 0;
                    } else {
                        strB = bg.c.b("%.2fem", Float.valueOf(((-f25) - 1.0f) * f26));
                        iB = 0;
                        z15 = true;
                    }
                }
                f16 = aVar.f212954j;
                if (f16 != f15) {
                    strB2 = bg.c.b("%.2f%%", Float.valueOf(f16 * 100.0f));
                } else {
                    strB2 = "fit-content";
                }
                String str6 = strB2;
                String strC = c(aVar.f212946b);
                String strF = f(aVar.f212960p);
                String strE = e(aVar.f212958n, aVar.f212959o);
                if (aVar.f212956l) {
                    i15 = aVar.f212957m;
                } else {
                    i15 = this.f28983d.f234964c;
                }
                String strB4 = com.google.android.exoplayer2.ui.b.b(i15);
                i16 = aVar.f212960p;
                str2 = "right";
                if (i16 != 1) {
                    if (z15) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                } else if (i16 != 2) {
                    str3 = z15 ? "bottom" : "top";
                    obj = "left";
                } else {
                    if (!z15) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                }
                if (i16 != 2 || i16 == 1) {
                    str4 = "height";
                    int i18 = iB;
                    iB = iB2;
                    iB2 = i18;
                } else {
                    str4 = "width";
                }
                String str7 = str4;
                bVarA = c.a(aVar.f212945a, getContext().getResources().getDisplayMetrics().density);
                for (String str8 : map.keySet()) {
                    str5 = (String) map.put(str8, (String) map.get(str8));
                    if (str5 != null || str5.equals(map.get(str8))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    bg.a.c(z16);
                }
                sb5.append(bg.c.b("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i17), obj, Float.valueOf(f19), str3, str, str7, str6, strC, strF, strE, strB4, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
                sb5.append(bg.c.b("<span class='%s'>", "default_bg"));
                alignment = aVar.f212947c;
                if (alignment != null) {
                    sb5.append(bg.c.b("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb5.append(bVarA.f28944a);
                    sb5.append("</span>");
                } else {
                    sb5.append(bVarA.f28944a);
                }
                sb5.append("</span>");
                sb5.append("</div>");
                i17++;
                f17 = f26;
            } else {
                f15 = -3.4028235E38f;
                strB = bg.c.b("%.2f%%", Float.valueOf((1.0f - this.f28986g) * 100.0f));
                iB = -100;
                z15 = false;
            }
            str = strB;
            f16 = aVar.f212954j;
            if (f16 != f15) {
                strB2 = bg.c.b("%.2f%%", Float.valueOf(f16 * 100.0f));
            } else {
                strB2 = "fit-content";
            }
            String str9 = strB2;
            String strC2 = c(aVar.f212946b);
            String strF2 = f(aVar.f212960p);
            String strE2 = e(aVar.f212958n, aVar.f212959o);
            if (aVar.f212956l) {
                i15 = aVar.f212957m;
            } else {
                i15 = this.f28983d.f234964c;
            }
            String strB5 = com.google.android.exoplayer2.ui.b.b(i15);
            i16 = aVar.f212960p;
            str2 = "right";
            if (i16 != 1) {
                if (z15) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            } else if (i16 != 2) {
                str3 = z15 ? "bottom" : "top";
                obj = "left";
            } else {
                if (!z15) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            }
            if (i16 != 2) {
                str4 = "height";
                int i19 = iB;
                iB = iB2;
                iB2 = i19;
            } else {
                str4 = "height";
                int i110 = iB;
                iB = iB2;
                iB2 = i110;
            }
            String str10 = str4;
            bVarA = c.a(aVar.f212945a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str8, (String) map.get(str8));
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                bg.a.c(z16);
            }
            sb5.append(bg.c.b("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i17), obj, Float.valueOf(f19), str3, str, str10, str9, strC2, strF2, strE2, strB5, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
            sb5.append(bg.c.b("<span class='%s'>", "default_bg"));
            alignment = aVar.f212947c;
            if (alignment != null) {
                sb5.append(bg.c.b("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb5.append(bVarA.f28944a);
                sb5.append("</span>");
            } else {
                sb5.append(bVarA.f28944a);
            }
            sb5.append("</span>");
            sb5.append("</div>");
            i17++;
            f17 = f26;
        }
        sb5.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("<html><head><style>");
        for (String str11 : map.keySet()) {
            sb6.append(str11);
            sb6.append("{");
            sb6.append((String) map.get(str11));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb5.insert(0, sb6.toString());
        this.f28981b.loadData(Base64.encodeToString(sb5.toString().getBytes(zj.e.f235400c), 1), "text/html", "base64");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<wf.a> list, zf.a aVar, float f15, int i15, float f16) {
        this.f28983d = aVar;
        this.f28984e = f15;
        this.f28985f = i15;
        this.f28986g = f16;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            wf.a aVar2 = list.get(i16);
            if (aVar2.f212948d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f28982c.isEmpty() || !arrayList2.isEmpty()) {
            this.f28982c = arrayList2;
            i();
        }
        this.f28980a.a(arrayList, aVar, f15, i15, f16);
        invalidate();
    }

    public void g() {
        this.f28981b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        if (!z15 || this.f28982c.isEmpty()) {
            return;
        }
        i();
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28982c = Collections.EMPTY_LIST;
        this.f28983d = zf.a.f234961g;
        this.f28984e = 0.0533f;
        this.f28985f = 0;
        this.f28986g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f28980a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f28981b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
