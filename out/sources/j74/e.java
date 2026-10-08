package j74;

import dx.i;
import dx.j;
import er.p;
import iy.c0;
import java.util.concurrent.CancellationException;
import ju.p0;
import ky.JweHeader;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import ry.EC;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lj74/e;", "Ld74/d;", "Lxw/d;", "dispatcherProvider", "Ljy/a;", "jweEncrypterStrategy", "Liy/a;", "base64Coder", "<init>", "(Lxw/d;Ljy/a;Liy/a;)V", "Ld74/d$a;", "params", "Ldx/i;", "Ldx/b;", "Lny/a;", "f", "(Ld74/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lxw/d;", "b", "Ljy/a;", "c", "Liy/a;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d74.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jy.a jweEncrypterStrategy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lny/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends ny.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f99970e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d74.d.Params f99972g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d74.d.Params params, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f99972g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f99970e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            e eVar = e.this;
            d74.d.Params params = this.f99972g;
            j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        return new i.Right(ny.a.a(ny.a.b(c0.g((String) aVar.a(eVar.jweEncrypterStrategy.a(new EC((byte[]) aVar.a(iy.a.c(eVar.base64Coder, c0.e(params.getEncryptionKey()), null, 2, null))), new JweHeader(ky.d.ECDH_ES_A256KW.getAlg(), ky.a.A256GCM.getEnc(), null, null, c0.e(params.getEncryptionKeyId()), "JWT", null, 76, null), new ky.c.JwsObject(c0.e(params.getJwsToken()))))))));
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                        } else {
                            if (!(objA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) objA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, ny.a>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new a(this.f99972g, eVar);
        }
    }

    public e(xw.d dVar, jy.a aVar, iy.a aVar2) {
        this.dispatcherProvider = dVar;
        this.jweEncrypterStrategy = aVar;
        this.base64Coder = aVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(d74.d.Params params, tq.e<? super i<? extends dx.b, ny.a>> eVar) {
        return this.dispatcherProvider.d(new a(params, null), eVar);
    }
}
