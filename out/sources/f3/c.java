package f3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\n\u000b\bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lf3/c;", "", "Lc5/r;", "size", "space", "Lc5/t;", "layoutDirection", "Lc5/n;", "a", "(JJLc5/t;)J", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f58685a;

    /* JADX INFO: renamed from: f3.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u0005\u0010\bR \u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010+\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b,\u0010\u0003\u001a\u0004\b\u001f\u0010)R \u00100\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010'\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010)R \u00105\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00102\u0012\u0004\b4\u0010\u0003\u001a\u0004\b&\u00103R \u00107\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b6\u0010\u0003\u001a\u0004\b\u001a\u00103R \u0010:\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00102\u0012\u0004\b9\u0010\u0003\u001a\u0004\b\"\u00103¨\u0006;"}, d2 = {"Lf3/c$a;", "", "<init>", "()V", "Lf3/c;", "b", "Lf3/c;", "o", "()Lf3/c;", "getTopStart$annotations", "TopStart", "c", "m", "getTopCenter$annotations", "TopCenter", "d", "n", "getTopEnd$annotations", "TopEnd", "e", "h", "getCenterStart$annotations", "CenterStart", "f", "getCenter$annotations", "Center", "g", "getCenterEnd$annotations", "CenterEnd", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd$annotations", "BottomEnd", "Lf3/c$c;", "k", "Lf3/c$c;", "l", "()Lf3/c$c;", "getTop$annotations", "Top", "getCenterVertically$annotations", "CenterVertically", "a", "getBottom$annotations", "Bottom", "Lf3/c$b;", "Lf3/c$b;", "()Lf3/c$b;", "getStart$annotations", "Start", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd$annotations", "End", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f58685a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final c TopStart = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final c TopCenter = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final c TopEnd = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final c CenterStart = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final c Center = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final c CenterEnd = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final c BottomStart = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final c BottomCenter = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final c BottomEnd = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC1317c Top = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC1317c CenterVertically = new BiasAlignment.Vertical(0.0f);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC1317c Bottom = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private static final b Start = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final b CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private static final b End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        public final InterfaceC1317c a() {
            return Bottom;
        }

        public final c b() {
            return BottomCenter;
        }

        public final c c() {
            return BottomEnd;
        }

        public final c d() {
            return BottomStart;
        }

        public final c e() {
            return Center;
        }

        public final c f() {
            return CenterEnd;
        }

        public final b g() {
            return CenterHorizontally;
        }

        public final c h() {
            return CenterStart;
        }

        public final InterfaceC1317c i() {
            return CenterVertically;
        }

        public final b j() {
            return End;
        }

        public final b k() {
            return Start;
        }

        public final InterfaceC1317c l() {
            return Top;
        }

        public final c m() {
            return TopCenter;
        }

        public final c n() {
            return TopEnd;
        }

        public final c o() {
            return TopStart;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lf3/c$b;", "", "", "size", "space", "Lc5/t;", "layoutDirection", "a", "(IILc5/t;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        int a(int size, int space, c5.t layoutDirection);
    }

    /* JADX INFO: renamed from: f3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lf3/c$c;", "", "", "size", "space", "a", "(II)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InterfaceC1317c {
        int a(int size, int space);
    }

    long a(long size, long space, c5.t layoutDirection);
}
