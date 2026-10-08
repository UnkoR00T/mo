package pl.gov.coi.common.network;

import ay.ResponseWithHeaders;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0015\"\u0004\b\u0000\u0010\u000f2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/common/network/q;", "Lpl/gov/coi/common/network/g0;", "Lpl/gov/coi/common/network/i0;", "exceptionParser", "Lpl/gov/coi/common/network/l;", "errorPayloadHandler", "<init>", "(Lpl/gov/coi/common/network/i0;Lpl/gov/coi/common/network/l;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "Ldx/b;", "c", "(Ljava/lang/Exception;)Ldx/i$b;", "T", "Lkotlin/Function1;", "Ltq/e;", "Lge4/x;", "", "networkCall", "Ldx/i;", "b", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Lay/m;", "a", "Lpl/gov/coi/common/network/i0;", "Lpl/gov/coi/common/network/l;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 exceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l errorPayloadHandler;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f158167e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158169g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158167e = obj;
            this.f158169g |= PKIFailureInfo.systemUnavail;
            return q.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f158171e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158173g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158171e = obj;
            this.f158173g |= PKIFailureInfo.systemUnavail;
            return q.this.a(null, this);
        }
    }

    public q(i0 i0Var, l lVar) {
        this.exceptionParser = i0Var;
        this.errorPayloadHandler = lVar;
    }

    private final dx.i.Left<dx.b> c(Exception e15) throws Exception {
        px.f.f163100a.d("call", e15, px.c.a(this));
        if (e15 instanceof CancellationException) {
            throw e15;
        }
        dx.i<Exception, dx.b.g> iVarA = this.exceptionParser.a(e15);
        if (iVarA instanceof dx.i.Right) {
            return new dx.i.Left<>(((dx.i.Right) iVarA).b());
        }
        if (!(iVarA instanceof dx.i.Left)) {
            throw new oq.p();
        }
        Exception exc = (Exception) ((dx.i.Left) iVarA).b();
        return exc instanceof o00.a ? new dx.i.Left<>(this.errorPayloadHandler.a(((o00.a) exc).getDomainError())) : new dx.i.Left<>(new dx.b.Generic(e15));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.common.network.g0
    public <T> Object a(er.l<? super tq.e<? super ge4.x<T>>, ? extends Object> lVar, tq.e<? super dx.i<? extends dx.b, ResponseWithHeaders<T>>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f158173g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f158173g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f158171e;
        Object objE = uq.b.e();
        int i16 = bVar.f158173g;
        try {
            if (i16 == 0) {
                oq.u.b(objB);
                bVar.f158170d = vq.j.a(lVar);
                bVar.f158173g = 1;
                objB = lVar.b(bVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objB);
            }
            ge4.x xVar = (ge4.x) objB;
            if (!xVar.f()) {
                return this.errorPayloadHandler.b(m00.b.b(xVar));
            }
            Object objA = xVar.a();
            return objA != null ? new dx.i.Right(new ResponseWithHeaders(objA, xVar.e().i())) : new dx.i.Left(dx.b.g.c.f45047a);
        } catch (Exception e15) {
            return c(e15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.common.network.g0
    public <T> Object b(er.l<? super tq.e<? super ge4.x<T>>, ? extends Object> lVar, tq.e<? super dx.i<? extends dx.b, ? extends T>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f158169g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f158169g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f158167e;
        Object objE = uq.b.e();
        int i16 = aVar.f158169g;
        try {
            if (i16 == 0) {
                oq.u.b(objB);
                aVar.f158166d = vq.j.a(lVar);
                aVar.f158169g = 1;
                objB = lVar.b(aVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objB);
            }
            ge4.x xVar = (ge4.x) objB;
            if (!xVar.f()) {
                return this.errorPayloadHandler.b(m00.b.b(xVar));
            }
            Object objA = xVar.a();
            return objA != null ? new dx.i.Right(objA) : new dx.i.Left(dx.b.g.c.f45047a);
        } catch (Exception e15) {
            return c(e15);
        }
    }
}
