package u9;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f196529f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f196531h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f196538o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f196524a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f196525b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f196526c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f196527d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f196528e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f196530g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f196532i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f196533j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f196534k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f196535l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f196536m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f196537n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f196539p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f196540q = false;

    private static int B(int i15, String str, String str2, int i16) {
        if (str.isEmpty() || i15 == -1) {
            return i15;
        }
        if (str.equals(str2)) {
            return i15 + i16;
        }
        return -1;
    }

    public c A(boolean z15) {
        this.f196534k = z15 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f196532i) {
            return this.f196531h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f196540q;
    }

    public int c() {
        if (this.f196530g) {
            return this.f196529f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f196528e;
    }

    public float e() {
        return this.f196538o;
    }

    public int f() {
        return this.f196537n;
    }

    public int g() {
        return this.f196539p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f196524a.isEmpty() && this.f196525b.isEmpty() && this.f196526c.isEmpty() && this.f196527d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f196524a, str, 1073741824), this.f196525b, str2, 2), this.f196527d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f196526c)) {
            return 0;
        }
        return iB + (this.f196526c.size() * 4);
    }

    public int i() {
        int i15 = this.f196535l;
        if (i15 == -1 && this.f196536m == -1) {
            return -1;
        }
        return (i15 == 1 ? 1 : 0) | (this.f196536m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f196532i;
    }

    public boolean k() {
        return this.f196530g;
    }

    public boolean l() {
        return this.f196533j == 1;
    }

    public boolean m() {
        return this.f196534k == 1;
    }

    public c n(int i15) {
        this.f196531h = i15;
        this.f196532i = true;
        return this;
    }

    public c o(boolean z15) {
        this.f196535l = z15 ? 1 : 0;
        return this;
    }

    public c p(boolean z15) {
        this.f196540q = z15;
        return this;
    }

    public c q(int i15) {
        this.f196529f = i15;
        this.f196530g = true;
        return this;
    }

    public c r(String str) {
        this.f196528e = str == null ? null : zj.c.f(str);
        return this;
    }

    public c s(float f15) {
        this.f196538o = f15;
        return this;
    }

    public c t(int i15) {
        this.f196537n = i15;
        return this;
    }

    public c u(boolean z15) {
        this.f196536m = z15 ? 1 : 0;
        return this;
    }

    public c v(int i15) {
        this.f196539p = i15;
        return this;
    }

    public void w(String[] strArr) {
        this.f196526c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f196524a = str;
    }

    public void y(String str) {
        this.f196525b = str;
    }

    public void z(String str) {
        this.f196527d = str;
    }
}
