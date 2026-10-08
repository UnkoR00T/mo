package a44;

import java.util.concurrent.CancellationException;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"La44/d2;", "Lq34/c2;", "Lwz3/g;", "isCurrentUserPeselUC", "<init>", "(Lwz3/g;)V", "Lq34/c2$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lq34/c2$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwz3/g;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d2 implements q34.c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wz3.g isCurrentUserPeselUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3042h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3043j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3044k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3045l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3046m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3047n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3049q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3047n = obj;
            this.f3049q |= PKIFailureInfo.systemUnavail;
            return d2.this.c(null, this);
        }
    }

    public d2(wz3.g gVar) {
        this.isCurrentUserPeselUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[Catch: Exception -> 0x0039, c -> 0x003d, CancellationException -> 0x0041, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008d, B:29:0x0095, B:30:0x009e, B:31:0x00be, B:38:0x00cb, B:41:0x00da), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: Exception -> 0x0039, c -> 0x003d, CancellationException -> 0x0041, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x008d, B:29:0x0095, B:30:0x009e, B:31:0x00be, B:38:0x00cb, B:41:0x00da), top: B:56:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.c2.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3049q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3049q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f3047n;
        Object objE = uq.b.e();
        int i16 = aVar.f3049q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f3041g;
                    try {
                        oq.u.b(obj);
                        if (!fr.t.c(obj, wz3.g.b.a.f216119a)) {
                            return new dx.i.Right(oq.i0.f148189a);
                        }
                        n34.a aVar2 = n34.a.PESEL_NOT_VALID;
                        Label.Companion companion = Label.INSTANCE;
                        bVar.b(new dx.b.Business(aVar2, null, companion.c(), null, null, companion.c(), null, 90, null));
                        throw new oq.g();
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar3 = new ex.a();
                    wz3.g gVar = this.isCurrentUserPeselUC;
                    wz3.g.Params params2 = new wz3.g.Params(params.getNewX509Certificate());
                    aVar.f3038d = vq.j.a(params);
                    aVar.f3039e = jVarA;
                    aVar.f3040f = vq.j.a(aVar3);
                    aVar.f3041g = aVar3;
                    aVar.f3042h = 0;
                    aVar.f3043j = 0;
                    aVar.f3044k = 0;
                    aVar.f3045l = 0;
                    aVar.f3046m = 0;
                    aVar.f3049q = 1;
                    Object objC = gVar.c(params2, aVar);
                    if (objC == objE) {
                        return objE;
                    }
                    obj = objC;
                    bVar = aVar3;
                    if (!fr.t.c(obj, wz3.g.b.a.f216119a)) {
                        return new dx.i.Right(oq.i0.f148189a);
                    }
                    n34.a aVar4 = n34.a.PESEL_NOT_VALID;
                    Label.Companion companion2 = Label.INSTANCE;
                    bVar.b(new dx.b.Business(aVar4, null, companion2.c(), null, null, companion2.c(), null, 90, null));
                    throw new oq.g();
                } catch (ex.c e17) {
                    cVar = e17;
                    return new dx.i.Left((dx.b) ex.d.a(cVar));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    exc = e19;
                    r15 = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, exc, px.c.a(r15));
                    dx.i iVarA = r15.a(exc);
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
            } catch (Exception e25) {
                exc = e25;
                r15 = objE;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
