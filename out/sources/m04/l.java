package m04;

import g04.p;
import iy.a0;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lm04/l;", "Lg04/l;", "Liy/c;", "bytesConverter", "Lg04/p;", "xorPasswordWithPinUseCase", "<init>", "(Liy/c;Lg04/p;)V", "Lg04/l$a;", "params", "Ldx/i;", "Ldx/b;", "Liy/b0;", "f", "(Lg04/l$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/c;", "b", "Lg04/p;", "c", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements g04.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p xorPasswordWithPinUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122293h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f122294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f122298n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122300q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122298n = obj;
            this.f122300q |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Liy/b0;", "<anonymous>", "(Lju/p0;)Liy/b0;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super b0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g04.l.Params f122304h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ l f122305j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f122306k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g04.l.Params params, l lVar, ex.b<? super dx.b> bVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f122304h = params;
            this.f122305j = lVar;
            this.f122306k = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122303g;
            if (i15 == 0) {
                u.b(obj);
                byte[] data = this.f122304h.getBiometricResult().getData();
                a0 a0VarF = c0.f(pq.n.t(data, 12, data.length));
                p pVar = this.f122305j.xorPasswordWithPinUseCase;
                p.a.Bytes bytes = new p.a.Bytes(a0VarF, c0.f(iy.c.b(this.f122305j.bytesConverter, this.f122304h.getCurrentPin().getData(), null, 2, null)));
                this.f122301e = vq.j.a(data);
                this.f122302f = vq.j.a(a0VarF);
                this.f122303g = 1;
                obj = pVar.c(bytes, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0.h((char[]) this.f122306k.a(this.f122305j.bytesConverter.c(((a0) obj).getData(), new iy.b.Standard(null, 1, null))));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super b0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f122304h, this.f122305j, this.f122306k, eVar);
        }
    }

    public l(iy.c cVar, p pVar) {
        this.bytesConverter = cVar;
        this.xorPasswordWithPinUseCase = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [g04.l$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(g04.l.Params params, tq.e<? super dx.i<? extends dx.b, b0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f122300q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f122300q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f122298n;
        Object objE = uq.b.e();
        int i16 = bVar.f122300q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarA = g1.a();
                        c cVar = new c(params, this, aVar, null);
                        bVar.f122289d = vq.j.a(params);
                        bVar.f122290e = jVarA;
                        bVar.f122291f = vq.j.a(aVar);
                        bVar.f122292g = vq.j.a(aVar);
                        bVar.f122293h = 0;
                        bVar.f122294j = 0;
                        bVar.f122295k = 0;
                        bVar.f122296l = 0;
                        bVar.f122297m = 0;
                        bVar.f122300q = 1;
                        Object objG = ju.i.g(l0VarA, cVar, bVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        params = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(params));
                        dx.i iVarA = params.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((b0) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
