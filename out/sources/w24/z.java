package w24;

import f24.CertificateData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/z;", "Lk24/b;", "Lv24/a;", "certificateRepository", "<init>", "(Lv24/a;)V", "Lk24/b$a;", "params", "Ldx/i;", "Ldx/b;", "Lry/c;", "d", "(Lk24/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements k24.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f210059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f210060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f210061h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f210062j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f210063k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f210064l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f210065m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f210066n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f210067p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f210069r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210067p = obj;
            this.f210069r |= PKIFailureInfo.systemUnavail;
            return z.this.c(null, this);
        }
    }

    public z(v24.a aVar) {
        this.certificateRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k24.b.Params params, tq.e<? super dx.i<? extends dx.b, CertKeyPair>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f210069r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f210069r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f210067p;
        ?? E = uq.b.e();
        int i16 = aVar.f210069r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        v24.a aVar3 = this.certificateRepository;
                        f24.c certificateType = params.getCertificateType();
                        aVar.f210057d = vq.j.a(params);
                        aVar.f210058e = jVarA;
                        aVar.f210059f = vq.j.a(aVar2);
                        aVar.f210060g = vq.j.a(aVar2);
                        aVar.f210061h = aVar2;
                        aVar.f210062j = 0;
                        aVar.f210063k = 0;
                        aVar.f210064l = 0;
                        aVar.f210065m = 0;
                        aVar.f210066n = 0;
                        aVar.f210069r = 1;
                        Object objB2 = aVar3.b(certificateType, aVar);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
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
                    bVar = (ex.b) aVar.f210061h;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(((CertificateData) bVar.a((dx.i) obj)).getCertKeyPair());
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
