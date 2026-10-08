package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lb5/e;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16570c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16571d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16572e = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b5.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lb5/e$a;", "", "<init>", "()V", "", "value", "Lb5/e;", "d", "(I)I", "None", "I", "b", "()I", "Auto", "a", "Unspecified", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return e.f16571d;
        }

        public final int b() {
            return e.f16570c;
        }

        public final int c() {
            return e.f16572e;
        }

        public final int d(int value) {
            boolean z15 = false;
            if (value >= 0 && value < 3) {
                z15 = true;
            }
            if (!z15) {
                w4.a.a("The given value=" + value + " is not recognized by Hyphens.");
            }
            return e.e(value);
        }

        private Companion() {
        }
    }

    private /* synthetic */ e(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ e d(int i15) {
        return new e(i15);
    }

    public static int e(int i15) {
        return i15;
    }

    public static boolean f(int i15, Object obj) {
        return (obj instanceof e) && i15 == ((e) obj).getValue();
    }

    public static final boolean g(int i15, int i16) {
        return i15 == i16;
    }

    public static int h(int i15) {
        return Integer.hashCode(i15);
    }

    public static String i(int i15) {
        if (g(i15, f16570c)) {
            return "Hyphens.None";
        }
        if (g(i15, f16571d)) {
            return "Hyphens.Auto";
        }
        return g(i15, f16572e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object other) {
        return f(this.value, other);
    }

    public int hashCode() {
        return h(this.value);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
