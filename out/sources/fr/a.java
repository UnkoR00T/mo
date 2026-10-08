package fr;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class a implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f66376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f66377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f66378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f66379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f66380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f66381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f66382g;

    public a(int i15, Class cls, String str, String str2, int i16) {
        this(i15, f.f66389g, cls, str, str2, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66380e == aVar.f66380e && this.f66381f == aVar.f66381f && this.f66382g == aVar.f66382g && t.c(this.f66376a, aVar.f66376a) && t.c(this.f66377b, aVar.f66377b) && this.f66378c.equals(aVar.f66378c) && this.f66379d.equals(aVar.f66379d);
    }

    public int hashCode() {
        Object obj = this.f66376a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f66377b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f66378c.hashCode()) * 31) + this.f66379d.hashCode()) * 31) + (this.f66380e ? 1231 : 1237)) * 31) + this.f66381f) * 31) + this.f66382g;
    }

    @Override // fr.o
    /* JADX INFO: renamed from: p */
    public int getArity() {
        return this.f66381f;
    }

    public String toString() {
        return q0.l(this);
    }

    public a(int i15, Object obj, Class cls, String str, String str2, int i16) {
        this.f66376a = obj;
        this.f66377b = cls;
        this.f66378c = str;
        this.f66379d = str2;
        this.f66380e = (i16 & 1) == 1;
        this.f66381f = i15;
        this.f66382g = i16 >> 1;
    }
}
