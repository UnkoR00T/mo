package p086nu;

import er.p;
import ju.d2;
import ju.g2;
import ju.p0;
import lu.w;
import lu.y;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import su.l;
import tq.e;
import tq.i;
import tq.j;
import uq.b;
import vq.d;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnu/g;", "T", "Lnu/e;", "Lmu/g;", "flow", "", "concurrency", "Ltq/i;", "context", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lmu/g;ILtq/i;ILlu/a;)V", "h", "(Ltq/i;ILlu/a;)Lnu/e;", "Lju/p0;", "scope", "Llu/y;", "l", "(Lju/p0;)Llu/y;", "Llu/w;", "Loq/i0;", "g", "(Llu/w;Ltq/e;)Ljava/lang/Object;", "", "d", "()Ljava/lang/String;", "Lmu/g;", "e", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mu.g<mu.g<T>> flow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int concurrency;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d2 f138720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ su.h f138721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w<T> f138722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0<T> f138723d;

        /* JADX INFO: renamed from: nu.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C3427a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f138724e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ mu.g<T> f138725f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a0<T> f138726g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ su.h f138727h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C3427a(mu.g<? extends T> gVar, a0<T> a0Var, su.h hVar, e<? super C3427a> eVar) {
                super(2, eVar);
                this.f138725f = gVar;
                this.f138726g = a0Var;
                this.f138727h = hVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f138724e;
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        mu.g<T> gVar = this.f138725f;
                        a0<T> a0Var = this.f138726g;
                        this.f138724e = 1;
                        if (gVar.a(a0Var, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    this.f138727h.b();
                    return i0.f148189a;
                } catch (Throwable th4) {
                    this.f138727h.b();
                    throw th4;
                }
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C3427a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C3427a(this.f138725f, this.f138726g, this.f138727h, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b extends d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f138728d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f138729e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f138730f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a<T> f138731g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f138732h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, e<? super b> eVar) {
                super(eVar);
                this.f138731g = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f138730f = obj;
                this.f138732h |= PKIFailureInfo.systemUnavail;
                return this.f138731g.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(d2 d2Var, su.h hVar, w<? super T> wVar, a0<T> a0Var) {
            this.f138720a = d2Var;
            this.f138721b = hVar;
            this.f138722c = wVar;
            this.f138723d = a0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(mu.g<? extends T> gVar, e<? super i0> eVar) throws Throwable {
            b bVar;
            a<T> aVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f138732h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f138732h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(this, eVar);
                }
            } else {
                bVar = new b(this, eVar);
            }
            Object obj = bVar.f138730f;
            Object objE = uq.b.e();
            int i16 = bVar.f138732h;
            if (i16 == 0) {
                u.b(obj);
                d2 d2Var = this.f138720a;
                if (d2Var != null) {
                    g2.i(d2Var);
                }
                su.h hVar = this.f138721b;
                bVar.f138728d = this;
                bVar.f138729e = gVar;
                bVar.f138732h = 1;
                if (hVar.c(bVar) == objE) {
                    return objE;
                }
                aVar = this;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (mu.g) bVar.f138729e;
                aVar = (a) bVar.f138728d;
                u.b(obj);
            }
            ju.k.d(aVar.f138722c, null, null, new C3427a(gVar, aVar.f138723d, aVar.f138721b, null), 3, null);
            return i0.f148189a;
        }
    }

    public /* synthetic */ g(mu.g gVar, int i15, i iVar, int i16, lu.a aVar, int i17, fr.k kVar) {
        this(gVar, i15, (i17 & 4) != 0 ? j.f191408a : iVar, (i17 & 8) != 0 ? -2 : i16, (i17 & 16) != 0 ? lu.a.SUSPEND : aVar);
    }

    @Override // p086nu.e
    protected String d() {
        return "concurrency=" + this.concurrency;
    }

    @Override // p086nu.e
    protected Object g(w<? super T> wVar, e<? super i0> eVar) {
        Object objA = this.flow.a(new a((d2) eVar.getContext().m(d2.INSTANCE), l.b(this.concurrency, 0, 2, null), wVar, new a0(wVar)), eVar);
        return objA == b.e() ? objA : i0.f148189a;
    }

    @Override // p086nu.e
    protected e<T> h(i context, int capacity, lu.a onBufferOverflow) {
        return new g(this.flow, this.concurrency, context, capacity, onBufferOverflow);
    }

    @Override // p086nu.e
    public y<T> l(p0 scope) {
        return lu.u.e(scope, this.context, this.capacity, j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(mu.g<? extends mu.g<? extends T>> gVar, int i15, i iVar, int i16, lu.a aVar) {
        super(iVar, i16, aVar);
        this.flow = gVar;
        this.concurrency = i15;
    }
}
