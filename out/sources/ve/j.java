package ve;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f206293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f206294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f206295c;

    public j() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f206293a = cls;
        this.f206294b = cls2;
        this.f206295c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f206293a.equals(jVar.f206293a) && this.f206294b.equals(jVar.f206294b) && l.d(this.f206295c, jVar.f206295c);
    }

    public int hashCode() {
        int iHashCode = ((this.f206293a.hashCode() * 31) + this.f206294b.hashCode()) * 31;
        Class<?> cls = this.f206295c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f206293a + ", second=" + this.f206294b + '}';
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
