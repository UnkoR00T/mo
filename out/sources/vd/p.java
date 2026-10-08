package vd;

/* JADX INFO: loaded from: classes3.dex */
public class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f206217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd.b.a f206218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f206219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f206220d;

    public interface a {
        void a(u uVar);
    }

    public interface b<T> {
        void a(T t15);
    }

    private p(T t15, vd.b.a aVar) {
        this.f206220d = false;
        this.f206217a = t15;
        this.f206218b = aVar;
        this.f206219c = null;
    }

    public static <T> p<T> a(u uVar) {
        return new p<>(uVar);
    }

    public static <T> p<T> c(T t15, vd.b.a aVar) {
        return new p<>(t15, aVar);
    }

    public boolean b() {
        return this.f206219c == null;
    }

    private p(u uVar) {
        this.f206220d = false;
        this.f206217a = null;
        this.f206218b = null;
        this.f206219c = uVar;
    }
}
