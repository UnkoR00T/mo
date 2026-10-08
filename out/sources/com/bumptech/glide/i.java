package com.bumptech.glide;

import be.t;
import be.v;
import com.bumptech.glide.load.ImageHeaderParser;
import fe.o;
import fe.p;
import fe.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f28774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qe.a f28775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qe.e f28776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qe.f f28777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f28778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ne.f f28779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qe.b f28780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qe.d f28781h = new qe.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final qe.c f28782i = new qe.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i6.f<List<Throwable>> f28783j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m15, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m15);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        i6.f<List<Throwable>> fVarE = we.a.e();
        this.f28783j = fVarE;
        this.f28774a = new q(fVarE);
        this.f28775b = new qe.a();
        this.f28776c = new qe.e();
        this.f28777d = new qe.f();
        this.f28778e = new com.bumptech.glide.load.data.f();
        this.f28779f = new ne.f();
        this.f28780g = new qe.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<be.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f28776c.d(cls, cls2)) {
            for (Class cls5 : this.f28779f.b(cls4, cls3)) {
                arrayList.add(new be.i(cls, cls4, cls5, this.f28776c.b(cls, cls4), this.f28779f.a(cls4, cls5), this.f28783j));
            }
        }
        return arrayList;
    }

    public <Model, Data> i a(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f28774a.a(cls, cls2, pVar);
        return this;
    }

    public <Data, TResource> i b(Class<Data> cls, Class<TResource> cls2, zd.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Data> i c(Class<Data> cls, zd.d<Data> dVar) {
        this.f28775b.a(cls, dVar);
        return this;
    }

    public <TResource> i d(Class<TResource> cls, zd.k<TResource> kVar) {
        this.f28777d.a(cls, kVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, zd.j<Data, TResource> jVar) {
        this.f28776c.a(str, jVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f28780g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        t<Data, TResource, Transcode> tVarA = this.f28782i.a(cls, cls2, cls3);
        t<Data, TResource, Transcode> tVar = null;
        if (this.f28782i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List<be.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t<>(cls4, cls5, cls6, listF, this.f28783j);
        }
        this.f28782i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f28774a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.f28781h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f28774a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f28776c.d(it.next(), cls2)) {
                    if (!this.f28779f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f28781h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> zd.k<X> k(v<X> vVar) {
        zd.k<X> kVarB = this.f28777d.b(vVar.d());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.d());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x15) {
        return this.f28778e.a(x15);
    }

    public <X> zd.d<X> m(X x15) {
        zd.d<X> dVarB = this.f28775b.b(x15.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(x15.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f28777d.b(vVar.d()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f28780g.a(imageHeaderParser);
        return this;
    }

    public i p(com.bumptech.glide.load.data.e.a<?> aVar) {
        this.f28778e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, ne.e<TResource, Transcode> eVar) {
        this.f28779f.c(cls, cls2, eVar);
        return this;
    }

    public final i r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f28776c.e(arrayList);
        return this;
    }
}
