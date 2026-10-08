package xg;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f218462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f218463b;

    private r(Class cls, Object obj) {
        this.f218462a = cls;
        this.f218463b = obj;
    }

    public static r a(Class cls, Object obj) {
        return new r(cls, obj);
    }

    public final Class b() {
        return this.f218462a;
    }

    public final Object c() {
        return this.f218463b;
    }

    /* synthetic */ r(Class cls, Object obj, byte[] bArr) {
        this(cls, obj);
    }
}
