package ja;

import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lja/i1;", "T", "Lja/h1;", "Lju/p0;", "Llu/z;", "scope", "channel", "<init>", "(Lju/p0;Llu/z;)V", "Lkotlin/Function0;", "Loq/i0;", "block", "a0", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "element", "l", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Llu/k;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "n", "(Ljava/lang/Throwable;)Z", "b", "Llu/z;", "getChannel", "()Llu/z;", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "coroutineContext", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1<T> implements h1<T>, ju.p0, lu.z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ju.p0 f100944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lu.z<T> channel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f100946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i1<T> f100949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100950h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1<T> i1Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f100949g = i1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100948f = obj;
            this.f100950h |= PKIFailureInfo.systemUnavail;
            return this.f100949g.a0(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<oq.i0> f100951a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super oq.i0> nVar) {
            this.f100951a = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            ju.n<oq.i0> nVar = this.f100951a;
            oq.t.Companion companion = oq.t.INSTANCE;
            nVar.i(oq.t.b(oq.i0.f148189a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1(ju.p0 p0Var, lu.z<? super T> zVar) {
        this.f100944a = p0Var;
        this.channel = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ja.h1
    public Object a0(er.a<oq.i0> aVar, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f100950h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f100950h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(this, eVar);
            }
        } else {
            aVar2 = new a(this, eVar);
        }
        Object obj = aVar2.f100948f;
        Object objE = uq.b.e();
        int i16 = aVar2.f100950h;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                tq.i.b bVarM = getCoroutineContext().m(d2.INSTANCE);
                if (bVarM == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                d2 d2Var = (d2) bVarM;
                aVar2.f100946d = aVar;
                aVar2.f100947e = d2Var;
                aVar2.f100950h = 1;
                ju.p pVar = new ju.p(uq.b.c(aVar2), 1);
                pVar.D();
                d2Var.C0(new b(pVar));
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(aVar2);
                }
                if (objX == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (er.a) aVar2.f100946d;
                oq.u.b(obj);
            }
            aVar.a();
            return oq.i0.f148189a;
        } catch (Throwable th4) {
            aVar.a();
            throw th4;
        }
    }

    @Override // lu.z
    public Object d(T element) {
        return this.channel.d(element);
    }

    @Override // ju.p0
    public tq.i getCoroutineContext() {
        return this.f100944a.getCoroutineContext();
    }

    @Override // lu.z
    public Object l(T t15, tq.e<? super oq.i0> eVar) {
        return this.channel.l(t15, eVar);
    }

    @Override // lu.z
    public boolean n(Throwable cause) {
        return this.channel.n(cause);
    }
}
