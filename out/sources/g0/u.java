package g0;

/* JADX INFO: loaded from: classes.dex */
public class u<T> implements i6.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i6.a<T> f69132a;

    public void a(i6.a<T> aVar) {
        this.f69132a = aVar;
    }

    @Override // i6.a
    public void accept(T t15) {
        this.f69132a.accept(t15);
    }
}
