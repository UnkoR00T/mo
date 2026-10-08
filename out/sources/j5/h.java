package j5;

/* JADX INFO: loaded from: classes.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99457c;

    public h(String str, c cVar) {
        super(str);
        this.f99455a = str;
        if (cVar != null) {
            this.f99457c = cVar.n();
            this.f99456b = cVar.l();
        } else {
            this.f99457c = "unknown";
            this.f99456b = 0;
        }
    }

    public String a() {
        return this.f99455a + " (" + this.f99457c + " at line " + this.f99456b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
