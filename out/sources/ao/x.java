package ao;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements yn.a0, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f13938g = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f13939a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13940b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13941c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<yn.a> f13943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<yn.a> f13944f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends yn.z<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile yn.z<T> f13945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yn.f f13948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ go.a f13949e;

        a(boolean z15, boolean z16, yn.f fVar, go.a aVar) {
            this.f13946b = z15;
            this.f13947c = z16;
            this.f13948d = fVar;
            this.f13949e = aVar;
        }

        private yn.z<T> e() {
            yn.z<T> zVar = this.f13945a;
            if (zVar != null) {
                return zVar;
            }
            yn.z<T> zVarM = this.f13948d.m(x.this, this.f13949e);
            this.f13945a = zVarM;
            return zVarM;
        }

        @Override // yn.z
        public T b(ho.a aVar) throws IOException {
            if (!this.f13946b) {
                return e().b(aVar);
            }
            aVar.G0();
            return null;
        }

        @Override // yn.z
        public void d(ho.c cVar, T t15) throws IOException {
            if (this.f13947c) {
                cVar.M();
            } else {
                e().d(cVar, t15);
            }
        }
    }

    public x() {
        List<yn.a> list = Collections.EMPTY_LIST;
        this.f13943e = list;
        this.f13944f = list;
    }

    private static boolean i(Class<?> cls) {
        return cls.isMemberClass() && !eo.a.n(cls);
    }

    private boolean j(zn.d dVar) {
        if (dVar != null) {
            return this.f13939a >= dVar.value();
        }
        return true;
    }

    private boolean l(zn.e eVar) {
        if (eVar != null) {
            return this.f13939a < eVar.value();
        }
        return true;
    }

    private boolean m(zn.d dVar, zn.e eVar) {
        return j(dVar) && l(eVar);
    }

    @Override // yn.a0
    public <T> yn.z<T> b(yn.f fVar, go.a<T> aVar) {
        Class<? super T> clsD = aVar.d();
        boolean zE = e(clsD, true);
        boolean zE2 = e(clsD, false);
        if (zE || zE2) {
            return new a(zE2, zE, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x clone() {
        try {
            return (x) super.clone();
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    public boolean e(Class<?> cls, boolean z15) {
        if (this.f13939a != -1.0d && !m((zn.d) cls.getAnnotation(zn.d.class), (zn.e) cls.getAnnotation(zn.e.class))) {
            return true;
        }
        if (!this.f13941c && i(cls)) {
            return true;
        }
        if (!z15 && !Enum.class.isAssignableFrom(cls) && eo.a.l(cls)) {
            return true;
        }
        Iterator<yn.a> it = (z15 ? this.f13943e : this.f13944f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z15) {
        zn.a aVar;
        if ((this.f13940b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f13939a != -1.0d && !m((zn.d) field.getAnnotation(zn.d.class), (zn.e) field.getAnnotation(zn.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f13942d && ((aVar = (zn.a) field.getAnnotation(zn.a.class)) == null || (!z15 ? aVar.deserialize() : aVar.serialize()))) || e(field.getType(), z15)) {
            return true;
        }
        List<yn.a> list = z15 ? this.f13943e : this.f13944f;
        if (list.isEmpty()) {
            return false;
        }
        yn.b bVar = new yn.b(field);
        Iterator<yn.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
