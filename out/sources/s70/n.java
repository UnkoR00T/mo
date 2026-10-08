package s70;

import er.p;
import ju.p0;
import mu.b0;
import mu.l0;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010)\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006*"}, d2 = {"Ls70/n;", "Ls70/l;", "Ls70/n$a;", "setup", "Lju/p0;", "scope", "<init>", "(Ls70/n$a;Lju/p0;)V", "", "index", "Loq/i0;", "c", "(ILtq/e;)Ljava/lang/Object;", "next", "()V", "previous", "a", "", "d", "()Z", "j", "Ls70/n$a;", "b", "Lju/p0;", "getScope", "()Lju/p0;", "Lmu/b0;", "Lmu/b0;", "_currentPage", "Lmu/p0;", "Lmu/p0;", "()Lmu/p0;", "currentPage", "Lkotlin/Function0;", "e", "Ler/a;", "()Ler/a;", "pageCount", "f", "I", "()I", "initialIndex", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a setup;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<Integer> _currentPage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<Integer> currentPage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.a<Integer> pageCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int initialIndex;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Ls70/n$a;", "", "", "pageCount", "initialPage", "<init>", "(II)V", "a", "I", "b", "()I", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int pageCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int initialPage;

        public a(int i15, int i16) {
            this.pageCount = i15;
            this.initialPage = i16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getInitialPage() {
            return this.initialPage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPageCount() {
            return this.pageCount;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178632e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178632e;
            if (i15 == 0) {
                u.b(obj);
                if (!n.this.d()) {
                    b0 b0Var = n.this._currentPage;
                    Integer numE = vq.b.e(((Number) n.this._currentPage.getValue()).intValue() + 1);
                    this.f178632e = 1;
                    if (b0Var.F(numE, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178634e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178634e;
            if (i15 == 0) {
                u.b(obj);
                if (!n.this.j()) {
                    b0 b0Var = n.this._currentPage;
                    Integer numE = vq.b.e(((Number) n.this._currentPage.getValue()).intValue() - 1);
                    this.f178634e = 1;
                    if (b0Var.F(numE, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178636e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178636e;
            if (i15 == 0) {
                u.b(obj);
                if (!n.this.d()) {
                    b0 b0Var = n.this._currentPage;
                    Integer numE = vq.b.e(n.this.setup.getPageCount() - 1);
                    this.f178636e = 1;
                    if (b0Var.F(numE, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new d(eVar);
        }
    }

    public n(a aVar, p0 p0Var) {
        this.setup = aVar;
        this.scope = p0Var;
        b0<Integer> b0VarA = r0.a(Integer.valueOf(aVar.getInitialPage()));
        this._currentPage = b0VarA;
        this.currentPage = mu.i.b0(b0VarA, p0Var, l0.Companion.b(l0.INSTANCE, 0L, 0L, 3, null), Integer.valueOf(aVar.getInitialPage()));
        this.pageCount = new er.a() { // from class: s70.m
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(n.k(this.f178623a));
            }
        };
        this.initialIndex = aVar.getInitialPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(n nVar) {
        return nVar.setup.getPageCount();
    }

    @Override // s70.l
    public void a() {
        ju.k.d(this.scope, null, null, new d(null), 3, null);
    }

    @Override // s70.l
    public mu.p0<Integer> b() {
        return this.currentPage;
    }

    @Override // s70.l
    public Object c(int i15, tq.e<? super i0> eVar) {
        Object objF = this._currentPage.F(vq.b.e(i15), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // s70.l
    public boolean d() {
        return this._currentPage.getValue().intValue() == this.setup.getPageCount() - 1;
    }

    @Override // s70.l
    public er.a<Integer> e() {
        return this.pageCount;
    }

    @Override // s70.l
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getInitialIndex() {
        return this.initialIndex;
    }

    public boolean j() {
        return this._currentPage.getValue().intValue() == 0;
    }

    @Override // s70.l
    public void next() {
        ju.k.d(this.scope, null, null, new b(null), 3, null);
    }

    @Override // s70.l
    public void previous() {
        ju.k.d(this.scope, null, null, new c(null), 3, null);
    }
}
