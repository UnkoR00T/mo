package com.google.gson.internal;

import com.google.gson.a0;
import com.google.gson.b;
import com.google.gson.b0;
import com.google.gson.f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vl.d;
import vl.e;
import zl.c;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements b0, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Excluder f36700g = new Excluder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f36701a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36702b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36703c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f36705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f36706f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile a0<T> f36707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f36710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f36711e;

        a(boolean z15, boolean z16, f fVar, com.google.gson.reflect.a aVar) {
            this.f36708b = z15;
            this.f36709c = z16;
            this.f36710d = fVar;
            this.f36711e = aVar;
        }

        private a0<T> e() {
            a0<T> a0Var = this.f36707a;
            if (a0Var != null) {
                return a0Var;
            }
            a0<T> a0VarN = this.f36710d.n(Excluder.this, this.f36711e);
            this.f36707a = a0VarN;
            return a0VarN;
        }

        @Override // com.google.gson.a0
        public T b(zl.a aVar) throws IOException {
            if (!this.f36708b) {
                return e().b(aVar);
            }
            aVar.G0();
            return null;
        }

        @Override // com.google.gson.a0
        public void d(c cVar, T t15) throws IOException {
            if (this.f36709c) {
                cVar.M();
            } else {
                e().d(cVar, t15);
            }
        }
    }

    public Excluder() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f36705e = list;
        this.f36706f = list;
    }

    private static boolean i(Class<?> cls) {
        return cls.isMemberClass() && !yl.a.n(cls);
    }

    private boolean j(d dVar) {
        if (dVar != null) {
            return this.f36701a >= dVar.value();
        }
        return true;
    }

    private boolean l(e eVar) {
        if (eVar != null) {
            return this.f36701a < eVar.value();
        }
        return true;
    }

    private boolean m(d dVar, e eVar) {
        return j(dVar) && l(eVar);
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zE = e(clsC, true);
        boolean zE2 = e(clsC, false);
        if (zE || zE2) {
            return new a(zE2, zE, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    public boolean e(Class<?> cls, boolean z15) {
        if (this.f36701a != -1.0d && !m((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return true;
        }
        if (!this.f36703c && i(cls)) {
            return true;
        }
        if (!z15 && !Enum.class.isAssignableFrom(cls) && yl.a.l(cls)) {
            return true;
        }
        Iterator<com.google.gson.a> it = (z15 ? this.f36705e : this.f36706f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z15) {
        vl.a aVar;
        if ((this.f36702b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f36701a != -1.0d && !m((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f36704d && ((aVar = (vl.a) field.getAnnotation(vl.a.class)) == null || (!z15 ? aVar.deserialize() : aVar.serialize()))) || e(field.getType(), z15)) {
            return true;
        }
        List<com.google.gson.a> list = z15 ? this.f36705e : this.f36706f;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
