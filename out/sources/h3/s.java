package h3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lh3/s;", "", "a", "Lh3/f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f80271a;

    /* JADX INFO: renamed from: h3.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, d2 = {"Lh3/s$a;", "", "<init>", "()V", "Lh3/s;", "b", "Lh3/s;", "getNone", "()Lh3/s;", "None", "c", "a", "Text", "d", "getList", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "e", "getDate", "Date", "f", "Toggle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f80271a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final s None = t.a(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final s Text = t.a(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final s List = t.a(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final s Date = t.a(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final s Toggle = t.a(2);

        private Companion() {
        }

        public final s a() {
            return Text;
        }

        public final s b() {
            return Toggle;
        }
    }
}
