package yk;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f227470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f227471b;

    private @interface a {
    }

    public d0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f227470a = cls;
        this.f227471b = cls2;
    }

    public static <T> d0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new d0<>(cls, cls2);
    }

    public static <T> d0<T> b(Class<T> cls) {
        return new d0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f227471b.equals(d0Var.f227471b)) {
            return this.f227470a.equals(d0Var.f227470a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f227471b.hashCode() * 31) + this.f227470a.hashCode();
    }

    public String toString() {
        if (this.f227470a == a.class) {
            return this.f227471b.getName();
        }
        return "@" + this.f227470a.getName() + " " + this.f227471b.getName();
    }
}
