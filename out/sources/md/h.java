package md;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f125643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f125644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f125645c;

    public h(String str, float f15, float f16) {
        this.f125643a = str;
        this.f125645c = f16;
        this.f125644b = f15;
    }

    public boolean a(String str) {
        if (this.f125643a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f125643a.endsWith("\r")) {
            String str2 = this.f125643a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
