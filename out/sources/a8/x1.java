package a8;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4774a;

    public x1(int i15) {
        super(a(i15));
        this.f4774a = i15;
    }

    private static String a(int i15) {
        if (i15 == 1) {
            return "Player release timed out.";
        }
        if (i15 != 2) {
            return i15 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
