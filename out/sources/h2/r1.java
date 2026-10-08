package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lh2/r1;", "", "<init>", "()V", "", "offset", "Lh2/r1$a;", "j", "(I)Lh2/r1$a;", "i", "e", "f", "margin", "g", "h", "Lh2/r1$b;", "k", "(I)Lh2/r1$b;", "l", "b", "a", "d", "m", "c", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f79975a = new r1();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lh2/r1$a;", "", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "", "menuWidth", "Lc5/t;", "layoutDirection", "a", "(Lc5/p;JILc5/t;)I", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        int a(c5.p anchorBounds, long windowSize, int menuWidth, c5.t layoutDirection);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lh2/r1$b;", "", "Lc5/p;", "anchorBounds", "Lc5/r;", "windowSize", "", "menuHeight", "a", "(Lc5/p;JI)I", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        int a(c5.p anchorBounds, long windowSize, int menuHeight);
    }

    private r1() {
    }

    public final b a(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Vertical(companion.a(), companion.a(), offset);
    }

    public final b b(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Vertical(companion.a(), companion.l(), offset);
    }

    public final b c(int margin) {
        return new Vertical(f3.c.INSTANCE.a(), margin);
    }

    public final b d(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Vertical(companion.i(), companion.l(), offset);
    }

    public final a e(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Horizontal(companion.j(), companion.j(), offset);
    }

    public final a f(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Horizontal(companion.j(), companion.k(), offset);
    }

    public final a g(int margin) {
        return new Horizontal(f3.a.f58675a.a(), margin);
    }

    public final a h(int margin) {
        return new Horizontal(f3.a.f58675a.b(), margin);
    }

    public final a i(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Horizontal(companion.k(), companion.j(), offset);
    }

    public final a j(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Horizontal(companion.k(), companion.k(), offset);
    }

    public final b k(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Vertical(companion.l(), companion.a(), offset);
    }

    public final b l(int offset) {
        f3.c.Companion companion = f3.c.INSTANCE;
        return new Vertical(companion.l(), companion.l(), offset);
    }

    public final b m(int margin) {
        return new Vertical(f3.c.INSTANCE.l(), margin);
    }
}
