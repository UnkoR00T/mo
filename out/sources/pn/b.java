package pn;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f161123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f161124b;

    b(int[] iArr, int i15) {
        this.f161123a = iArr;
        this.f161124b = i15;
    }

    public int e() {
        return this.f161124b;
    }

    public int g(c cVar) {
        char c15;
        int iF = cVar.f();
        if (iF <= 9) {
            c15 = 0;
        } else {
            c15 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.f161123a[c15];
    }
}
