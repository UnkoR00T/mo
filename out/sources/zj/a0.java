package zj;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f235375a = new a();

    class a extends a0 {
        a() {
        }

        @Override // zj.a0
        public long a() {
            return System.nanoTime();
        }
    }

    protected a0() {
    }

    public static a0 b() {
        return f235375a;
    }

    public abstract long a();
}
