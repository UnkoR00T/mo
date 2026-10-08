package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lb5/v;", "", "", "value", "f", "(I)I", "", "i", "(I)Ljava/lang/String;", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16667b = f(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16668c = f(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16669d = f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16670e = f(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16671f = f(5);

    /* JADX INFO: renamed from: b5.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lb5/v$a;", "", "<init>", "()V", "Lb5/v;", "Clip", "I", "a", "()I", "getClip-gIe3tQ8$annotations", "Ellipsis", "b", "getEllipsis-gIe3tQ8$annotations", "Visible", "e", "getVisible-gIe3tQ8$annotations", "StartEllipsis", "d", "getStartEllipsis-gIe3tQ8$annotations", "MiddleEllipsis", "c", "getMiddleEllipsis-gIe3tQ8$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return v.f16667b;
        }

        public final int b() {
            return v.f16668c;
        }

        public final int c() {
            return v.f16671f;
        }

        public final int d() {
            return v.f16670e;
        }

        public final int e() {
            return v.f16669d;
        }

        private Companion() {
        }
    }

    public static int f(int i15) {
        return i15;
    }

    public static final boolean g(int i15, int i16) {
        return i15 == i16;
    }

    public static int h(int i15) {
        return Integer.hashCode(i15);
    }

    public static String i(int i15) {
        if (g(i15, f16667b)) {
            return "Clip";
        }
        if (g(i15, f16668c)) {
            return "Ellipsis";
        }
        if (g(i15, f16671f)) {
            return "MiddleEllipsis";
        }
        if (g(i15, f16669d)) {
            return "Visible";
        }
        return g(i15, f16670e) ? "StartEllipsis" : "Invalid";
    }
}
