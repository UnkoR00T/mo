package yn;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ao.x f228048a = ao.x.f13938g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f228049b = u.f228072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f228050c = c.f228004a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f228051d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<a0> f228052e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<a0> f228053f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f228054g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f228055h = f.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f228056i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f228057j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f228058k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f228059l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f228060m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f228061n = f.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f228062o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w f228063p = f.f228017z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f228064q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y f228065r = f.D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f228066s = f.E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque<v> f228067t = new ArrayDeque<>();

    private static void a(String str, int i15, int i16, List<a0> list) {
        a0 a0VarB;
        a0 a0VarB2;
        boolean z15 = fo.d.f65539a;
        a0 a0VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            a0VarB = bo.c.b.f20467b.b(str);
            if (z15) {
                a0VarA = fo.d.f65541c.b(str);
                a0VarB2 = fo.d.f65540b.b(str);
            } else {
                a0VarB2 = null;
            }
        } else {
            if (i15 == 2 && i16 == 2) {
                return;
            }
            a0 a0VarA2 = bo.c.b.f20467b.a(i15, i16);
            if (z15) {
                a0VarA = fo.d.f65541c.a(i15, i16);
                a0 a0VarA3 = fo.d.f65540b.a(i15, i16);
                a0VarB = a0VarA2;
                a0VarB2 = a0VarA3;
            } else {
                a0VarB = a0VarA2;
                a0VarB2 = null;
            }
        }
        list.add(a0VarB);
        if (z15) {
            list.add(a0VarA);
            list.add(a0VarB2);
        }
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f228052e.size() + this.f228053f.size() + 3);
        arrayList.addAll(this.f228052e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f228053f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f228055h, this.f228056i, this.f228057j, arrayList);
        return new f(this.f228048a, this.f228050c, new HashMap(this.f228051d), this.f228054g, this.f228058k, this.f228062o, this.f228060m, this.f228061n, this.f228063p, this.f228059l, this.f228064q, this.f228049b, this.f228055h, this.f228056i, this.f228057j, new ArrayList(this.f228052e), new ArrayList(this.f228053f), arrayList, this.f228065r, this.f228066s, new ArrayList(this.f228067t));
    }

    public g c() {
        this.f228060m = false;
        return this;
    }

    public g d() {
        this.f228054g = true;
        return this;
    }

    public g e(y yVar) {
        Objects.requireNonNull(yVar);
        this.f228065r = yVar;
        return this;
    }

    public g f(w wVar) {
        Objects.requireNonNull(wVar);
        this.f228063p = wVar;
        return this;
    }
}
