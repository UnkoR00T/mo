package s02;

import eo0.CentralTokens;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls02/e;", "", "Lgz/b$a;", "", "Lez/a;", "currentTimeProvider", "Lj02/b;", "electronicDeliveryTokensDataSource", "<init>", "(Lez/a;Lj02/b;)V", "params", "Ldx/i;", "Ldx/b;", "c", "(Lgz/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lez/a;", "b", "Lj02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j02.b electronicDeliveryTokensDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f177112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f177113h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f177115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f177116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f177117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177118n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f177119p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f177121r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177119p = obj;
            this.f177121r |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(ez.a aVar, j02.b bVar) {
        this.currentTimeProvider = aVar;
        this.electronicDeliveryTokensDataSource = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TRY_ENTER, TryCatch #3 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x008d, B:32:0x00ab, B:33:0x00b5, B:34:0x00c9, B:41:0x00d3, B:44:0x00e1), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TryCatch #3 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x008d, B:32:0x00ab, B:33:0x00b5, B:34:0x00c9, B:41:0x00d3, B:44:0x00e1), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    public Object c(gz.b.a aVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar2;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f177121r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f177121r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f177119p;
        ?? E = uq.b.e();
        int i16 = aVar2.f177121r;
        boolean z15 = true;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar2.f177113h;
                    try {
                        u.b(obj);
                        if (obj != null) {
                            bVar.b(new dx.b.Generic(new NullPointerException("CentralAccessToken is null")));
                            throw new oq.g();
                        }
                        gu.b.Companion companion = gu.b.INSTANCE;
                        if (gu.b.F(gu.d.r(this.currentTimeProvider.a(), gu.e.MILLISECONDS)) > ((CentralTokens.Access) obj).getExpirationTimeInSeconds()) {
                            z15 = false;
                        }
                        return new dx.i.Right(vq.b.a(z15));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar3 = new ex.a();
                    j02.b bVar2 = this.electronicDeliveryTokensDataSource;
                    aVar2.f177109d = vq.j.a(aVar);
                    aVar2.f177110e = jVarA;
                    aVar2.f177111f = vq.j.a(aVar3);
                    aVar2.f177112g = vq.j.a(aVar3);
                    aVar2.f177113h = aVar3;
                    aVar2.f177114j = 0;
                    aVar2.f177115k = 0;
                    aVar2.f177116l = 0;
                    aVar2.f177117m = 0;
                    aVar2.f177118n = 0;
                    aVar2.f177121r = 1;
                    Object objP = bVar2.P(aVar2);
                    if (objP == E) {
                        return E;
                    }
                    obj = objP;
                    bVar = aVar3;
                    if (obj != null) {
                        bVar.b(new dx.b.Generic(new NullPointerException("CentralAccessToken is null")));
                        throw new oq.g();
                    }
                    gu.b.Companion companion2 = gu.b.INSTANCE;
                    if (gu.b.F(gu.d.r(this.currentTimeProvider.a(), gu.e.MILLISECONDS)) > ((CentralTokens.Access) obj).getExpirationTimeInSeconds()) {
                        z15 = false;
                    }
                    return new dx.i.Right(vq.b.a(z15));
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
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
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
