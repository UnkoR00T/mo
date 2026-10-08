package td;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f189586a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f189587b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f189588c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f189589d = 0;

    public void a(String str) {
        int i15 = this.f189588c;
        if (i15 == 5) {
            this.f189589d++;
            return;
        }
        this.f189586a[i15] = str;
        this.f189587b[i15] = System.nanoTime();
        e6.l.a(str);
        this.f189588c++;
    }

    public float b(String str) {
        int i15 = this.f189589d;
        if (i15 > 0) {
            this.f189589d = i15 - 1;
            return 0.0f;
        }
        int i16 = this.f189588c - 1;
        this.f189588c = i16;
        if (i16 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f189586a[i16])) {
            e6.l.b();
            return (System.nanoTime() - this.f189587b[this.f189588c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f189586a[this.f189588c] + ".");
    }
}
