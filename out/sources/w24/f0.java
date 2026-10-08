package w24;

import f24.DocumentScope;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw24/f0;", "Lw24/e0;", "Lv24/b;", "documentsContainerRepository", "Liy/a;", "base64Coder", "<init>", "(Lv24/b;Liy/a;)V", "Lw24/e0$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lw24/e0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Liy/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209599h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209600j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209601k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209602l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209603m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209604n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f209605p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209607r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209605p = obj;
            this.f209607r |= PKIFailureInfo.systemUnavail;
            return f0.this.c(null, this);
        }
    }

    public f0(v24.b bVar, iy.a aVar) {
        this.documentsContainerRepository = bVar;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(e0.Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209607r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209607r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f209605p;
        ?? E = uq.b.e();
        int i16 = aVar.f209607r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        v24.b bVar2 = this.documentsContainerRepository;
                        String documentId = params.getDocumentId();
                        aVar.f209595d = vq.j.a(params);
                        aVar.f209596e = jVarA;
                        aVar.f209597f = vq.j.a(aVar2);
                        aVar.f209598g = vq.j.a(aVar2);
                        aVar.f209599h = aVar2;
                        aVar.f209600j = 0;
                        aVar.f209601k = 0;
                        aVar.f209602l = 0;
                        aVar.f209603m = 0;
                        aVar.f209604n = 0;
                        aVar.f209607r = 1;
                        Object objE = bVar2.e(documentId, aVar);
                        if (objE == E) {
                            return E;
                        }
                        obj = objE;
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
                    bVar = (ex.b) aVar.f209599h;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(iy.a.e(this.base64Coder, ((DocumentScope) bVar.a((dx.i) obj)).getScopeData(), null, 2, null));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
