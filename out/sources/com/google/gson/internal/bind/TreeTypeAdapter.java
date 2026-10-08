package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.util.Objects;
import wl.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t<T> f36772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k<T> f36773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f36774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f36775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f36776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f36777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f36778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile a0<T> f36779h;

    private static final class SingleTypeFactory implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f36780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f36782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t<?> f36783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k<?> f36784e;

        SingleTypeFactory(Object obj, com.google.gson.reflect.a<?> aVar, boolean z15, Class<?> cls) {
            t<?> tVar = obj instanceof t ? (t) obj : null;
            this.f36783d = tVar;
            k<?> kVar = obj instanceof k ? (k) obj : null;
            this.f36784e = kVar;
            if (tVar != null || kVar != null) {
                this.f36780a = aVar;
                this.f36781b = z15;
                this.f36782c = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            boolean zIsAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f36780a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.f36781b && this.f36780a.d() == aVar.c());
            } else {
                zIsAssignableFrom = this.f36782c.isAssignableFrom(aVar.c());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.f36783d, this.f36784e, fVar, aVar, this);
            }
            return null;
        }
    }

    private final class b implements s, j {
        private b() {
        }

        @Override // com.google.gson.s
        public l a(Object obj) {
            return TreeTypeAdapter.this.f36774c.z(obj);
        }
    }

    public TreeTypeAdapter(t<T> tVar, k<T> kVar, f fVar, com.google.gson.reflect.a<T> aVar, b0 b0Var, boolean z15) {
        this.f36777f = new b();
        this.f36772a = tVar;
        this.f36773b = kVar;
        this.f36774c = fVar;
        this.f36775d = aVar;
        this.f36776e = b0Var;
        this.f36778g = z15;
    }

    private a0<T> f() {
        a0<T> a0Var = this.f36779h;
        if (a0Var != null) {
            return a0Var;
        }
        a0<T> a0VarN = this.f36774c.n(this.f36776e, this.f36775d);
        this.f36779h = a0VarN;
        return a0VarN;
    }

    public static b0 g(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.d() == aVar.c(), null);
    }

    public static b0 h(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.a0
    public T b(zl.a aVar) {
        if (this.f36773b == null) {
            return f().b(aVar);
        }
        l lVarA = g0.a(aVar);
        if (this.f36778g && lVarA.k()) {
            return null;
        }
        return this.f36773b.a(lVarA, this.f36775d.d(), this.f36777f);
    }

    @Override // com.google.gson.a0
    public void d(zl.c cVar, T t15) throws IOException {
        t<T> tVar = this.f36772a;
        if (tVar == null) {
            f().d(cVar, t15);
        } else if (this.f36778g && t15 == null) {
            cVar.M();
        } else {
            g0.b(tVar.b(t15, this.f36775d.d(), this.f36777f), cVar);
        }
    }

    @Override // com.google.gson.internal.bind.d
    public a0<T> e() {
        return this.f36772a != null ? this : f();
    }

    public TreeTypeAdapter(t<T> tVar, k<T> kVar, f fVar, com.google.gson.reflect.a<T> aVar, b0 b0Var) {
        this(tVar, kVar, fVar, aVar, b0Var, true);
    }
}
