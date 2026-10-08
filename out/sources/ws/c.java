package ws;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ws.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f214748h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f214749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f214750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f214751k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f214752g;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        c cVar = new c(2, 2, 0);
        f214749i = cVar;
        f214750j = cVar.m();
        f214751k = new c(new int[0]);
    }

    public c(int[] iArr, boolean z15) {
        super(Arrays.copyOf(iArr, iArr.length));
        this.f214752g = z15;
    }

    private final boolean i(c cVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(cVar);
    }

    private final boolean l(c cVar) {
        if (a() > cVar.a()) {
            return true;
        }
        return a() >= cVar.a() && b() > cVar.b();
    }

    public final boolean h(c cVar) {
        return i(cVar.k(this.f214752g));
    }

    public final boolean j() {
        return this.f214752g;
    }

    public final c k(boolean z15) {
        c cVar = z15 ? f214749i : f214750j;
        return cVar.l(this) ? cVar : this;
    }

    public final c m() {
        return (a() == 1 && b() == 9) ? new c(2, 0, 0) : new c(a(), b() + 1, 0);
    }

    public c(int... iArr) {
        this(iArr, false);
    }
}
