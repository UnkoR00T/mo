package ch1;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lch1/g;", "Lch1/f;", "Lbh1/b;", "documentsSettingsDataStoreRepository", "<init>", "(Lbh1/b;)V", "Lch1/f$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lch1/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbh1/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.b documentsSettingsDataStoreRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26832h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26833j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26834k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f26835l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f26836m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f26837n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f26839q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26837n = obj;
            this.f26839q |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(bh1.b bVar) {
        this.documentsSettingsDataStoreRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ch1.f$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(f.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f26839q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f26839q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f26837n;
        Object objE = uq.b.e();
        int i16 = aVar.f26839q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        bh1.b bVar = this.documentsSettingsDataStoreRepository;
                        String documentTypeName = params.getDocumentTypeName();
                        aVar.f26828d = vq.j.a(params);
                        aVar.f26829e = jVarA;
                        aVar.f26830f = vq.j.a(aVar2);
                        aVar.f26831g = vq.j.a(aVar2);
                        aVar.f26832h = 0;
                        aVar.f26833j = 0;
                        aVar.f26834k = 0;
                        aVar.f26835l = 0;
                        aVar.f26836m = 0;
                        aVar.f26839q = 1;
                        if (bVar.b(documentTypeName, aVar) == objE) {
                            return objE;
                        }
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
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }
}
