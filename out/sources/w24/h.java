package w24;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import u24.EncryptedScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw24/h;", "Lw24/g;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "<init>", "(Liy/j;Liy/a;Lay/j;)V", "Lw24/g$a;", "params", "Ldx/i;", "Ldx/b;", "Lw24/g$b;", "g", "(Lw24/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j;", "b", "Liy/a;", "c", "Lay/j;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lw24/g$b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends g.Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209624e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g.Params f209626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.Params params, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f209626g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f209624e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h hVar = h.this;
            g.Params params = this.f209626g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        List<EncryptedScope> list = (List) hVar.jsonSerializer.a(new String(hVar.cmsManager.b((byte[]) aVar.a(iy.a.c(hVar.base64Coder, params.getScopesData(), null, 2, null)), new CertKeyPair(params.getCertificateKeyPair().getCertificate(), params.getCertificateKeyPair().getPrivateKey())), fu.d.UTF_8), fr.q0.o(List.class, mr.r.INSTANCE.d(fr.q0.n(EncryptedScope.class))));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(list, 10)), 16));
                        for (EncryptedScope encryptedScope : list) {
                            oq.r rVarA = oq.y.a(encryptedScope.getId(), new CMSSignedData((byte[]) aVar.a(iy.a.c(hVar.base64Coder, encryptedScope.getContent(), null, 2, null))));
                            linkedHashMap.put(rVarA.c(), rVarA.d());
                        }
                        return new dx.i.Right(new g.Result(linkedHashMap));
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                        } else {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) objA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, g.Result>> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new a(this.f209626g, eVar);
        }
    }

    public h(iy.j jVar, iy.a aVar, ay.j jVar2) {
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.jsonSerializer = jVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(g.Params params, tq.e<? super dx.i<? extends dx.b, g.Result>> eVar) {
        return ju.i.g(ju.g1.b(), new a(params, null), eVar);
    }
}
