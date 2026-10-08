package hp;

/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f86143a;

    public d() {
        this.f86143a = new bp.d();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f86143a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f86143a.equals(((d) obj).f86143a);
        }
        return false;
    }

    public int hashCode() {
        return this.f86143a.hashCode();
    }

    public d(bp.d dVar) {
        this.f86143a = dVar;
    }
}
