package g5;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f70661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70662b;

    g(int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f70661a = new Object[i15];
    }

    @Override // g5.f
    public boolean A(T t15) {
        int i15 = this.f70662b;
        Object[] objArr = this.f70661a;
        if (i15 >= objArr.length) {
            return false;
        }
        objArr[i15] = t15;
        this.f70662b = i15 + 1;
        return true;
    }

    @Override // g5.f
    public void B(T[] tArr, int i15) {
        if (i15 > tArr.length) {
            i15 = tArr.length;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            T t15 = tArr[i16];
            int i17 = this.f70662b;
            Object[] objArr = this.f70661a;
            if (i17 < objArr.length) {
                objArr[i17] = t15;
                this.f70662b = i17 + 1;
            }
        }
    }

    @Override // g5.f
    public T z() {
        int i15 = this.f70662b;
        if (i15 <= 0) {
            return null;
        }
        int i16 = i15 - 1;
        Object[] objArr = this.f70661a;
        T t15 = (T) objArr[i16];
        objArr[i16] = null;
        this.f70662b = i15 - 1;
        return t15;
    }
}
