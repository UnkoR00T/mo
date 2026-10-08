package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0011\u0013B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lb5/u;", "", "Lb5/u$b;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLfr/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Z", "c", "()Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f16657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f16658e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int linearity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean subpixelTextPositioning;

    /* JADX INFO: renamed from: b5.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb5/u$a;", "", "<init>", "()V", "Lb5/u;", "Static", "Lb5/u;", "a", "()Lb5/u;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final u a() {
            return u.f16657d;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lb5/u$b;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f16662c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16663d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f16664e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: b5.u$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lb5/u$b$a;", "", "<init>", "()V", "Lb5/u$b;", "Linear", "I", "b", "()I", "FontHinting", "a", "None", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final int a() {
                return b.f16663d;
            }

            public final int b() {
                return b.f16662c;
            }

            public final int c() {
                return b.f16664e;
            }

            private Companion() {
            }
        }

        private /* synthetic */ b(int i15) {
            this.value = i15;
        }

        public static final /* synthetic */ b d(int i15) {
            return new b(i15);
        }

        public static int e(int i15) {
            return i15;
        }

        public static boolean f(int i15, Object obj) {
            return (obj instanceof b) && i15 == ((b) obj).getValue();
        }

        public static final boolean g(int i15, int i16) {
            return i15 == i16;
        }

        public static int h(int i15) {
            return Integer.hashCode(i15);
        }

        public static String i(int i15) {
            if (g(i15, f16662c)) {
                return "Linearity.Linear";
            }
            if (g(i15, f16663d)) {
                return "Linearity.FontHinting";
            }
            return g(i15, f16664e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
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

    static {
        fr.k kVar = null;
        INSTANCE = new Companion(kVar);
        b.Companion companion = b.INSTANCE;
        f16657d = new u(companion.a(), false, kVar);
        f16658e = new u(companion.b(), true, kVar);
    }

    public /* synthetic */ u(int i15, boolean z15, fr.k kVar) {
        this(i15, z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return b.g(this.linearity, uVar.linearity) && this.subpixelTextPositioning == uVar.subpixelTextPositioning;
    }

    public int hashCode() {
        return (b.h(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        if (fr.t.c(this, f16657d)) {
            return "TextMotion.Static";
        }
        return fr.t.c(this, f16658e) ? "TextMotion.Animated" : "Invalid";
    }

    private u(int i15, boolean z15) {
        this.linearity = i15;
        this.subpixelTextPositioning = z15;
    }
}
