package w7;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f210678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f210680d = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f210677a = new int[8];

    private void c() {
        int[] iArr = this.f210677a;
        int length = iArr.length;
        int i15 = this.f210678b;
        int i16 = length - i15;
        int i17 = length << 1;
        int[] iArr2 = new int[i17];
        System.arraycopy(iArr, i15, iArr2, 0, i16);
        System.arraycopy(this.f210677a, 0, iArr2, i16, this.f210678b);
        this.f210677a = iArr2;
        this.f210678b = 0;
        this.f210679c = length;
        this.f210680d = i17 - 1;
    }

    public void a(int i15) {
        int[] iArr = this.f210677a;
        int i16 = this.f210679c;
        iArr[i16] = i15;
        int i17 = this.f210680d & (i16 + 1);
        this.f210679c = i17;
        if (i17 == this.f210678b) {
            c();
        }
    }

    public void b() {
        this.f210679c = this.f210678b;
    }

    public boolean d() {
        return this.f210678b == this.f210679c;
    }

    public int e() {
        int i15 = this.f210678b;
        if (i15 == this.f210679c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i16 = this.f210677a[i15];
        this.f210678b = (i15 + 1) & this.f210680d;
        return i16;
    }
}
