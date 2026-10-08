package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u00060\u0010R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lja/r;", "", "<init>", "()V", "Lja/y;", "loadType", "Lmu/g;", "Lja/p1;", "f", "(Lja/y;)Lmu/g;", "viewportHint", "Loq/i0;", "c", "(Lja/y;Lja/p1;)V", "g", "(Lja/p1;)V", "Lja/r$b;", "a", "Lja/r$b;", "state", "Lja/p1$a;", "e", "()Lja/p1$a;", "lastAccessHint", "b", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b state = new b();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Lja/r$a;", "", "<init>", "(Lja/r;)V", "Lja/p1;", "value", "a", "Lja/p1;", "b", "()Lja/p1;", "c", "(Lja/p1;)V", "Lmu/a0;", "Lmu/a0;", "_flow", "Lmu/g;", "()Lmu/g;", "flow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private p1 value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mu.a0<p1> _flow = mu.h0.b(1, 0, lu.a.DROP_OLDEST, 2, null);

        public a() {
        }

        public final mu.g<p1> a() {
            return this._flow;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final p1 getValue() {
            return this.value;
        }

        public final void c(p1 p1Var) {
            this.value = p1Var;
            if (p1Var != null) {
                this._flow.f(p1Var);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042 \u0010\n\u001a\u001c\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c¨\u0006\u001f"}, d2 = {"Lja/r$b;", "", "<init>", "(Lja/r;)V", "Lja/p1$a;", "accessHint", "Lkotlin/Function2;", "Lja/r$a;", "Lja/r;", "Loq/i0;", "block", "d", "(Lja/p1$a;Ler/p;)V", "a", "Lja/r$a;", "prepend", "b", "append", "value", "c", "Lja/p1$a;", "()Lja/p1$a;", "lastAccessHint", "Lla/b;", "Lla/b;", "lock", "Lmu/g;", "Lja/p1;", "()Lmu/g;", "prependFlow", "appendFlow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a prepend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a append;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private p1.a lastAccessHint;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final la.b lock = new la.b();

        public b() {
            this.prepend = r.this.new a();
            this.append = r.this.new a();
        }

        public final mu.g<p1> a() {
            return this.append.a();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final p1.a getLastAccessHint() {
            return this.lastAccessHint;
        }

        public final mu.g<p1> c() {
            return this.prepend.a();
        }

        public final void d(p1.a accessHint, er.p<? super a, ? super a, oq.i0> block) {
            synchronized (this.lock) {
                if (accessHint != null) {
                    try {
                        this.lastAccessHint = accessHint;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                block.B(this.prepend, this.append);
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101148a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101148a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(y yVar, p1 p1Var, a aVar, a aVar2) {
        if (yVar == y.PREPEND) {
            aVar.c(p1Var);
        } else {
            aVar2.c(p1Var);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(p1 p1Var, a aVar, a aVar2) {
        if (s.a(p1Var, aVar.getValue(), y.PREPEND)) {
            aVar.c(p1Var);
        }
        if (s.a(p1Var, aVar2.getValue(), y.APPEND)) {
            aVar2.c(p1Var);
        }
        return oq.i0.f148189a;
    }

    public final void c(final y loadType, final p1 viewportHint) {
        if (loadType == y.PREPEND || loadType == y.APPEND) {
            this.state.d(null, new er.p() { // from class: ja.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.d(loadType, viewportHint, (r.a) obj, (r.a) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public final p1.a e() {
        return this.state.getLastAccessHint();
    }

    public final mu.g<p1> f(y loadType) {
        int i15 = c.f101148a[loadType.ordinal()];
        if (i15 == 1) {
            return this.state.c();
        }
        if (i15 == 2) {
            return this.state.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void g(final p1 viewportHint) {
        this.state.d(viewportHint instanceof p1.a ? (p1.a) viewportHint : null, new er.p() { // from class: ja.p
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return r.h(viewportHint, (r.a) obj, (r.a) obj2);
            }
        });
    }
}
