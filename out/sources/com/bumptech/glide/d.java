package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final m<?, ?> f28750k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f28751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ve.f.b<i> f28752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se.f f28753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f28754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<re.f<Object>> f28755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f28756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final be.k f28757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f28758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private re.g f28760j;

    public d(Context context, ce.b bVar, ve.f.b<i> bVar2, se.f fVar, b.a aVar, Map<Class<?>, m<?, ?>> map, List<re.f<Object>> list, be.k kVar, e eVar, int i15) {
        super(context.getApplicationContext());
        this.f28751a = bVar;
        this.f28753c = fVar;
        this.f28754d = aVar;
        this.f28755e = list;
        this.f28756f = map;
        this.f28757g = kVar;
        this.f28758h = eVar;
        this.f28759i = i15;
        this.f28752b = ve.f.a(bVar2);
    }

    public <X> se.i<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f28753c.a(imageView, cls);
    }

    public ce.b b() {
        return this.f28751a;
    }

    public List<re.f<Object>> c() {
        return this.f28755e;
    }

    public synchronized re.g d() {
        try {
            if (this.f28760j == null) {
                this.f28760j = this.f28754d.build().a0();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f28760j;
    }

    public <T> m<?, T> e(Class<T> cls) {
        m<?, T> mVar = (m) this.f28756f.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : this.f28756f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? (m<?, T>) f28750k : mVar;
    }

    public be.k f() {
        return this.f28757g;
    }

    public e g() {
        return this.f28758h;
    }

    public int h() {
        return this.f28759i;
    }

    public i i() {
        return this.f28752b.get();
    }
}
