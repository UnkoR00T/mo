package p036e4;

import er.p;
import fr.q;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Le4/a;", "", "position1", "position2", "c", "(Le4/a;II)I", "Le4/q;", "a", "Le4/q;", "()Le4/q;", "FirstBaseline", "b", "LastBaseline", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f47196a = new q(a.f47198j);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f47197b = new q(C1084b.f47199j);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f47198j = new a();

        a() {
            super(2, hr.a.class, "min", "min(II)I", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Integer B(Integer num, Integer num2) {
            return E(num.intValue(), num2.intValue());
        }

        public final Integer E(int i15, int i16) {
            return Integer.valueOf(Math.min(i15, i16));
        }
    }

    /* JADX INFO: renamed from: e4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class C1084b extends q implements p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C1084b f47199j = new C1084b();

        C1084b() {
            super(2, hr.a.class, "max", "max(II)I", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Integer B(Integer num, Integer num2) {
            return E(num.intValue(), num2.intValue());
        }

        public final Integer E(int i15, int i16) {
            return Integer.valueOf(Math.max(i15, i16));
        }
    }

    public static final q a() {
        return f47196a;
    }

    public static final q b() {
        return f47197b;
    }

    public static final int c(p036e4.a aVar, int i15, int i16) {
        return aVar.a().B(Integer.valueOf(i15), Integer.valueOf(i16)).intValue();
    }
}
