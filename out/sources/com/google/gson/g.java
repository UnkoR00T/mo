package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
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
    private Excluder f36679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f36680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f36681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f36682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b0> f36683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<b0> f36684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f36692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private x f36694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private z f36696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z f36697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque<w> f36698t;

    public g() {
        this.f36679a = Excluder.f36700g;
        this.f36680b = v.f36862a;
        this.f36681c = c.f36635a;
        this.f36682d = new HashMap();
        this.f36683e = new ArrayList();
        this.f36684f = new ArrayList();
        this.f36685g = false;
        this.f36686h = f.B;
        this.f36687i = 2;
        this.f36688j = 2;
        this.f36689k = false;
        this.f36690l = false;
        this.f36691m = true;
        this.f36692n = f.A;
        this.f36693o = false;
        this.f36694p = f.f36648z;
        this.f36695q = true;
        this.f36696r = f.D;
        this.f36697s = f.E;
        this.f36698t = new ArrayDeque<>();
    }

    private static void a(String str, int i15, int i16, List<b0> list) {
        b0 b0VarB;
        b0 b0VarB2;
        boolean z15 = com.google.gson.internal.sql.a.f36850a;
        b0 b0VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            b0VarB = DefaultDateTypeAdapter.a.f36722b.b(str);
            if (z15) {
                b0VarA = com.google.gson.internal.sql.a.f36852c.b(str);
                b0VarB2 = com.google.gson.internal.sql.a.f36851b.b(str);
            } else {
                b0VarB2 = null;
            }
        } else {
            if (i15 == 2 && i16 == 2) {
                return;
            }
            b0 b0VarA2 = DefaultDateTypeAdapter.a.f36722b.a(i15, i16);
            if (z15) {
                b0VarA = com.google.gson.internal.sql.a.f36852c.a(i15, i16);
                b0 b0VarA3 = com.google.gson.internal.sql.a.f36851b.a(i15, i16);
                b0VarB = b0VarA2;
                b0VarB2 = b0VarA3;
            } else {
                b0VarB = b0VarA2;
                b0VarB2 = null;
            }
        }
        list.add(b0VarB);
        if (z15) {
            list.add(b0VarA);
            list.add(b0VarB2);
        }
    }

    private static boolean d(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f36683e.size() + this.f36684f.size() + 3);
        arrayList.addAll(this.f36683e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f36684f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f36686h, this.f36687i, this.f36688j, arrayList);
        return new f(this.f36679a, this.f36681c, new HashMap(this.f36682d), this.f36685g, this.f36689k, this.f36693o, this.f36691m, this.f36692n, this.f36694p, this.f36690l, this.f36695q, this.f36680b, this.f36686h, this.f36687i, this.f36688j, new ArrayList(this.f36683e), new ArrayList(this.f36684f), arrayList, this.f36696r, this.f36697s, new ArrayList(this.f36698t));
    }

    public g c() {
        this.f36689k = true;
        return this;
    }

    public g e(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z15 = obj instanceof t;
        if (!z15 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof a0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (d(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof h) {
            this.f36682d.put(type, (h) obj);
        }
        if (z15 || (obj instanceof k)) {
            this.f36683e.add(TreeTypeAdapter.g(com.google.gson.reflect.a.b(type), obj));
        }
        if (obj instanceof a0) {
            this.f36683e.add(TypeAdapters.a(com.google.gson.reflect.a.b(type), (a0) obj));
        }
        return this;
    }

    public g f(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f36683e.add(b0Var);
        return this;
    }

    public g g(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(obj);
        boolean z15 = obj instanceof t;
        if (!z15 && !(obj instanceof k) && !(obj instanceof a0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if ((obj instanceof k) || z15) {
            this.f36684f.add(TreeTypeAdapter.h(cls, obj));
        }
        if (obj instanceof a0) {
            this.f36683e.add(TypeAdapters.e(cls, (a0) obj));
        }
        return this;
    }

    public g h(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e15) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e15);
            }
        }
        this.f36686h = str;
        return this;
    }

    public g i(c cVar) {
        return j(cVar);
    }

    public g j(d dVar) {
        Objects.requireNonNull(dVar);
        this.f36681c = dVar;
        return this;
    }

    g(f fVar) {
        this.f36679a = Excluder.f36700g;
        this.f36680b = v.f36862a;
        this.f36681c = c.f36635a;
        HashMap map = new HashMap();
        this.f36682d = map;
        ArrayList arrayList = new ArrayList();
        this.f36683e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f36684f = arrayList2;
        this.f36685g = false;
        this.f36686h = f.B;
        this.f36687i = 2;
        this.f36688j = 2;
        this.f36689k = false;
        this.f36690l = false;
        this.f36691m = true;
        this.f36692n = f.A;
        this.f36693o = false;
        this.f36694p = f.f36648z;
        this.f36695q = true;
        this.f36696r = f.D;
        this.f36697s = f.E;
        ArrayDeque<w> arrayDeque = new ArrayDeque<>();
        this.f36698t = arrayDeque;
        this.f36679a = fVar.f36654f;
        this.f36681c = fVar.f36655g;
        map.putAll(fVar.f36656h);
        this.f36685g = fVar.f36657i;
        this.f36689k = fVar.f36658j;
        this.f36693o = fVar.f36659k;
        this.f36691m = fVar.f36660l;
        this.f36692n = fVar.f36661m;
        this.f36694p = fVar.f36662n;
        this.f36690l = fVar.f36663o;
        this.f36680b = fVar.f36668t;
        this.f36686h = fVar.f36665q;
        this.f36687i = fVar.f36666r;
        this.f36688j = fVar.f36667s;
        arrayList.addAll(fVar.f36669u);
        arrayList2.addAll(fVar.f36670v);
        this.f36695q = fVar.f36664p;
        this.f36696r = fVar.f36671w;
        this.f36697s = fVar.f36672x;
        arrayDeque.addAll(fVar.f36673y);
    }
}
