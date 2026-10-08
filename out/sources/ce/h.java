package ce;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements a<int[]> {
    @Override // ce.a
    public int a() {
        return 4;
    }

    @Override // ce.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // ce.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i15) {
        return new int[i15];
    }

    @Override // ce.a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
