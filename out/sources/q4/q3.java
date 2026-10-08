package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lq4/q3;", "", "Lm3/g;", "textBounds", "rect", "", "a", "(Lm3/g;Lm3/g;)Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f164574a;

    /* JADX INFO: renamed from: q4.q3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lq4/q3$a;", "", "<init>", "()V", "Lq4/q3;", "b", "Lq4/q3;", "g", "()Lq4/q3;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", "d", "h", "ContainsCenter", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f164574a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final q3 AnyOverlap = new q3() { // from class: q4.n3
            @Override // q4.q3
            public final boolean a(m3.g gVar, m3.g gVar2) {
                return q3.Companion.d(gVar, gVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final q3 ContainsAll = new q3() { // from class: q4.o3
            @Override // q4.q3
            public final boolean a(m3.g gVar, m3.g gVar2) {
                return q3.Companion.e(gVar, gVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final q3 ContainsCenter = new q3() { // from class: q4.p3
            @Override // q4.q3
            public final boolean a(m3.g gVar, m3.g gVar2) {
                return q3.Companion.f(gVar, gVar2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(m3.g gVar, m3.g gVar2) {
            return gVar.s(gVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(m3.g gVar, m3.g gVar2) {
            return !gVar2.r() && gVar.getLeft() >= gVar2.getLeft() && gVar.getRight() <= gVar2.getRight() && gVar.getTop() >= gVar2.getTop() && gVar.getBottom() <= gVar2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(m3.g gVar, m3.g gVar2) {
            return gVar2.b(gVar.g());
        }

        public final q3 g() {
            return AnyOverlap;
        }

        public final q3 h() {
            return ContainsCenter;
        }
    }

    boolean a(m3.g textBounds, m3.g rect);
}
