package od;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f144719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.h f144720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.d f144721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f144722d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, nd.h hVar, nd.d dVar, boolean z15) {
        this.f144719a = aVar;
        this.f144720b = hVar;
        this.f144721c = dVar;
        this.f144722d = z15;
    }

    public a a() {
        return this.f144719a;
    }

    public nd.h b() {
        return this.f144720b;
    }

    public nd.d c() {
        return this.f144721c;
    }

    public boolean d() {
        return this.f144722d;
    }
}
