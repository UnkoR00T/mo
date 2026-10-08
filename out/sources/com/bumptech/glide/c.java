package com.bumptech.glide;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import oe.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private be.k f28734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ce.d f28735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ce.b f28736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private de.h f28737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ee.a f28738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ee.a f28739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private de.a.InterfaceC0916a f28740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private de.i f28741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private oe.c f28742k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o.b f28745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ee.a f28746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<re.f<Object>> f28748q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f28732a = new r0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f28733b = new e.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28743l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.b.a f28744m = new a();

    class a implements com.bumptech.glide.b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public re.g build() {
            return new re.g();
        }
    }

    static final class b {
        b() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C0739c {
    }

    com.bumptech.glide.b a(Context context, List<pe.b> list, pe.a aVar) {
        if (this.f28738g == null) {
            this.f28738g = ee.a.E();
        }
        if (this.f28739h == null) {
            this.f28739h = ee.a.y();
        }
        if (this.f28746o == null) {
            this.f28746o = ee.a.r();
        }
        if (this.f28741j == null) {
            this.f28741j = new de.i.a(context).a();
        }
        if (this.f28742k == null) {
            this.f28742k = new oe.e();
        }
        if (this.f28735d == null) {
            int iB = this.f28741j.b();
            if (iB > 0) {
                this.f28735d = new ce.j(iB);
            } else {
                this.f28735d = new ce.e();
            }
        }
        if (this.f28736e == null) {
            this.f28736e = new ce.i(this.f28741j.a());
        }
        if (this.f28737f == null) {
            this.f28737f = new de.g(this.f28741j.d());
        }
        if (this.f28740i == null) {
            this.f28740i = new de.f(context);
        }
        if (this.f28734c == null) {
            this.f28734c = new be.k(this.f28737f, this.f28740i, this.f28739h, this.f28738g, ee.a.I(), this.f28746o, this.f28747p);
        }
        List<re.f<Object>> list2 = this.f28748q;
        if (list2 == null) {
            this.f28748q = Collections.EMPTY_LIST;
        } else {
            this.f28748q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f28734c, this.f28737f, this.f28735d, this.f28736e, new o(this.f28745n), this.f28742k, this.f28743l, this.f28744m, this.f28732a, this.f28748q, list, aVar, this.f28733b.b());
    }

    void b(o.b bVar) {
        this.f28745n = bVar;
    }
}
