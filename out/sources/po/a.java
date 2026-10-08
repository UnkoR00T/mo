package po;

/* JADX INFO: loaded from: classes4.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f161359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char f161360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f161361c;

    a(char c15, char c16, int i15) {
        this.f161359a = c15;
        this.f161360b = c16;
        this.f161361c = i15;
    }

    public boolean a(char c15, char c16, int i15) {
        char c17 = this.f161360b;
        if (c15 != c17 + 1 || i15 != ((this.f161361c + c17) - this.f161359a) + 1) {
            return false;
        }
        this.f161360b = c16;
        return true;
    }

    public int b(char c15) {
        char c16 = this.f161359a;
        if (c16 > c15 || c15 > this.f161360b) {
            return -1;
        }
        return this.f161361c + (c15 - c16);
    }
}
