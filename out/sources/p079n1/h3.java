package p079n1;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B1\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0088\u0001\n\u0092\u0001\u00020\t¨\u0006\u0011"}, d2 = {"Ln1/h3;", "", "", "isAltPressed", "isCtrlPressed", "isMetaPressed", "isShiftPressed", "i", "(ZZZZ)I", "", "flags", "h", "(I)I", "other", "k", "(II)I", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130064b = h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f130070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f130071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f130072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f130073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f130074l;

    /* JADX INFO: renamed from: n1.h3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006¨\u0006!"}, d2 = {"Ln1/h3$a;", "", "<init>", "()V", "Ln1/h3;", "None", "I", "e", "()I", "getNone-AuQ4EfA$annotations", "Alt", "a", "getAlt-AuQ4EfA$annotations", "Ctrl", "c", "getCtrl-AuQ4EfA$annotations", "Shift", "f", "getShift-AuQ4EfA$annotations", "AltShift", "b", "getAltShift-AuQ4EfA$annotations", "CtrlShift", "d", "getCtrlShift-AuQ4EfA$annotations", "ShiftMeta", "g", "getShiftMeta-AuQ4EfA$annotations", "", "ALT_FLAG", "CTRL_FLAG", "META_FLAG", "SHIFT_FLAG", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a() {
            return h3.f130065c;
        }

        public final int b() {
            return h3.f130069g;
        }

        public final int c() {
            return h3.f130066d;
        }

        public final int d() {
            return h3.f130070h;
        }

        public final int e() {
            return h3.f130064b;
        }

        public final int f() {
            return h3.f130068f;
        }

        public final int g() {
            return h3.f130071i;
        }

        private Companion() {
        }
    }

    static {
        int iH = h(1);
        f130065c = iH;
        int iH2 = h(2);
        f130066d = iH2;
        int iH3 = h(4);
        f130067e = iH3;
        int iH4 = h(8);
        f130068f = iH4;
        f130069g = k(iH, iH4);
        f130070h = k(iH2, iH4);
        f130071i = k(iH3, iH4);
        f130072j = k(iH2, iH);
        f130073k = k(iH2, iH3);
        f130074l = k(iH3, iH4);
    }

    private static int h(int i15) {
        return i15;
    }

    public static int i(boolean z15, boolean z16, boolean z17, boolean z18) {
        return h((z15 ? 1 : 0) | (z16 ? 2 : 0) | (z17 ? 4 : 0) | (z18 ? 8 : 0));
    }

    public static final boolean j(int i15, int i16) {
        return i15 == i16;
    }

    public static final int k(int i15, int i16) {
        return h(i15 | i16);
    }
}
