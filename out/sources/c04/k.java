package c04;

import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lc04/k;", "Lwz3/j;", "Liy/a;", "base64Coder", "Lwz3/d;", "getBase64SignedValueUseCase", "<init>", "(Liy/a;Lwz3/d;)V", "Lwz3/j$a;", "params", "Ldx/i;", "Ldx/b;", "Lu04/d;", "d", "(Lwz3/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/a;", "b", "Lwz3/d;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements wz3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22505h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f22506j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f22507k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f22508l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f22509m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22510n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f22511p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f22513r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22511p = obj;
            this.f22513r |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, this);
        }
    }

    public k(iy.a aVar, wz3.d dVar) {
        this.base64Coder = aVar;
        this.getBase64SignedValueUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(wz3.j.Params params, tq.e<? super dx.i<? extends dx.b, u04.d>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f22513r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f22513r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f22511p;
        ?? E = uq.b.e();
        int i16 = aVar.f22513r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        wz3.d dVar = this.getBase64SignedValueUseCase;
                        wz3.d.Params params2 = new wz3.d.Params(c0.g(new String((byte[]) aVar2.a(iy.a.c(this.base64Coder, c0.e(params.getUnsignedBase64Xml()), null, 2, null)), fu.d.UTF_8)));
                        aVar.f22501d = vq.j.a(params);
                        aVar.f22502e = jVarA;
                        aVar.f22503f = vq.j.a(aVar2);
                        aVar.f22504g = vq.j.a(aVar2);
                        aVar.f22505h = aVar2;
                        aVar.f22506j = 0;
                        aVar.f22507k = 0;
                        aVar.f22508l = 0;
                        aVar.f22509m = 0;
                        aVar.f22510n = 0;
                        aVar.f22513r = 1;
                        Object objC = dVar.c(params2, aVar);
                        if (objC == E) {
                            return E;
                        }
                        obj = objC;
                        bVar = aVar2;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f22505h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(u04.d.a(u04.d.b(((ry.a) bVar.a((dx.i) obj)).getData())));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
