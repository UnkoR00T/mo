package bf;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lf.a f19096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lf.a f19097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19098d;

    c(Context context, lf.a aVar, lf.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f19095a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f19096b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f19097c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f19098d = str;
    }

    @Override // bf.h
    public Context b() {
        return this.f19095a;
    }

    @Override // bf.h
    public String c() {
        return this.f19098d;
    }

    @Override // bf.h
    public lf.a d() {
        return this.f19097c;
    }

    @Override // bf.h
    public lf.a e() {
        return this.f19096b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f19095a.equals(hVar.b()) && this.f19096b.equals(hVar.e()) && this.f19097c.equals(hVar.d()) && this.f19098d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f19095a.hashCode() ^ 1000003) * 1000003) ^ this.f19096b.hashCode()) * 1000003) ^ this.f19097c.hashCode()) * 1000003) ^ this.f19098d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f19095a + ", wallClock=" + this.f19096b + ", monotonicClock=" + this.f19097c + ", backendName=" + this.f19098d + "}";
    }
}
