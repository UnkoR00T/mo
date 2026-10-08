package v4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lv4/i0;", "", "", "offset", "e", "(I)I", "b", "o0", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i0 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f203663a;

    /* JADX INFO: renamed from: v4.i0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lv4/i0$a;", "", "<init>", "()V", "Lv4/i0;", "b", "Lv4/i0;", "a", "()Lv4/i0;", "Identity", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f203663a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final i0 Identity = new C5301a();

        /* JADX INFO: renamed from: v4.i0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"v4/i0$a$a", "Lv4/i0;", "", "offset", "e", "(I)I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C5301a implements i0 {
            C5301a() {
            }

            @Override // v4.i0
            public int b(int offset) {
                return offset;
            }

            @Override // v4.i0
            public int e(int offset) {
                return offset;
            }
        }

        private Companion() {
        }

        public final i0 a() {
            return Identity;
        }
    }

    int b(int offset);

    int e(int offset);
}
