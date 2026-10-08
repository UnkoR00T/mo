package oz;

import ju.d2;
import ju.p0;
import mu.b0;
import mu.r0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Loz/r;", "Loz/q;", "Landroidx/lifecycle/n;", "<init>", "()V", "Lnx/c;", "viewVisibility", "Lju/d2;", "d", "(Lnx/c;)Lju/d2;", "Lnx/a;", "viewLifecycle", "c", "(Lnx/a;)Lju/d2;", "Landroidx/lifecycle/q;", "lifecycleOwner", "Loq/i0;", "R", "(Landroidx/lifecycle/q;)V", "Lmu/g;", "G2", "()Lmu/g;", "x8", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "Lmu/b0;", "a", "Lmu/b0;", "visibility", "b", "lifecycle", "Landroidx/lifecycle/q;", "_lifecycleOwner", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements q, androidx.p016lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<nx.c> visibility = r0.a(nx.c.BACKGROUND);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0<nx.a> lifecycle = r0.a(nx.a.DESTROYED);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.q _lifecycleOwner;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150749a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f150749a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f150751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f150752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ nx.a f150753h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r f150754j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(nx.a aVar, r rVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f150753h = aVar;
            this.f150754j = rVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150752g;
            if (i15 == 0) {
                oq.u.b(obj);
                nx.a aVar = this.f150753h;
                if (aVar != null) {
                    b0 b0Var = this.f150754j.lifecycle;
                    this.f150750e = vq.j.a(aVar);
                    this.f150751f = 0;
                    this.f150752g = 1;
                    if (b0Var.F(aVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
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
            return new b(this.f150753h, this.f150754j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150755e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ nx.c f150757g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(nx.c cVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f150757g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150755e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = r.this.visibility;
                nx.c cVar = this.f150757g;
                this.f150755e = 1;
                if (b0Var.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
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
            return r.this.new c(this.f150757g, eVar);
        }
    }

    private final d2 c(nx.a viewLifecycle) {
        androidx.p016lifecycle.k kVarA;
        androidx.p016lifecycle.q qVar = this._lifecycleOwner;
        if (qVar == null || (kVarA = androidx.p016lifecycle.r.a(qVar)) == null) {
            return null;
        }
        return ju.k.d(kVarA, null, null, new b(viewLifecycle, this, null), 3, null);
    }

    private final d2 d(nx.c viewVisibility) {
        androidx.p016lifecycle.k kVarA;
        androidx.p016lifecycle.q qVar = this._lifecycleOwner;
        if (qVar == null || (kVarA = androidx.p016lifecycle.r.a(qVar)) == null) {
            return null;
        }
        return ju.k.d(kVarA, null, null, new c(viewVisibility, null), 3, null);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.visibility;
    }

    @Override // oz.q, oz.j
    public void R(androidx.p016lifecycle.q lifecycleOwner) {
        if (fr.t.c(this._lifecycleOwner, lifecycleOwner)) {
            return;
        }
        this._lifecycleOwner = lifecycleOwner;
        lifecycleOwner.getLifecycle().d(this);
        lifecycleOwner.getLifecycle().a(this);
    }

    @Override // androidx.p016lifecycle.n
    public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
        nx.a aVar;
        switch (a.f150749a[event.ordinal()]) {
            case 1:
                aVar = nx.a.CREATED;
                break;
            case 2:
                aVar = nx.a.STARTED;
                break;
            case 3:
                aVar = nx.a.RESUMED;
                break;
            case 4:
                aVar = nx.a.PAUSED;
                break;
            case 5:
                aVar = nx.a.STOPPED;
                break;
            case 6:
                aVar = nx.a.DESTROYED;
                break;
            case 7:
                aVar = null;
                break;
            default:
                throw new oq.p();
        }
        c(aVar);
        if (event == androidx.lifecycle.j.a.ON_RESUME) {
            d(nx.c.FOREGROUND);
        } else if (event == androidx.lifecycle.j.a.ON_PAUSE) {
            d(nx.c.BACKGROUND);
        }
        if (event == androidx.lifecycle.j.a.ON_DESTROY) {
            this._lifecycleOwner = null;
        }
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.lifecycle;
    }
}
