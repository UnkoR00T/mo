package y44;

import dx.i;
import dx.j;
import es0.f;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import yr0.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly44/c;", "Lr44/d;", "Lx44/a;", "ePaymentsRepository", "Les0/f;", "getPaymentsUseCase", "<init>", "(Lx44/a;Les0/f;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lx44/a;", "b", "Les0/f;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements r44.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x44.a ePaymentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f getPaymentsUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f224226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f224227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f224228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f224229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f224230h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f224231j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f224232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f224233l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f224234m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f224235n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f224236p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f224237q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f224239s;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f224237q = obj;
            this.f224239s |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(x44.a aVar, f fVar) {
        this.ePaymentsRepository = aVar;
        this.getPaymentsUseCase = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:30:0x009f, B:40:0x00c9, B:41:0x00d3, B:33:0x00a6, B:35:0x00aa, B:39:0x00bf, B:38:0x00ba, B:42:0x00dd, B:43:0x00e2, B:50:0x00ec, B:53:0x00fa), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:30:0x009f, B:40:0x00c9, B:41:0x00d3, B:33:0x00a6, B:35:0x00aa, B:39:0x00bf, B:38:0x00ba, B:42:0x00dd, B:43:0x00e2, B:50:0x00ec, B:53:0x00fa), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:30:0x009f, B:40:0x00c9, B:41:0x00d3, B:33:0x00a6, B:35:0x00aa, B:39:0x00bf, B:38:0x00ba, B:42:0x00dd, B:43:0x00e2, B:50:0x00ec, B:53:0x00fa), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[Catch: Exception -> 0x003e, c -> 0x0041, CancellationException -> 0x0044, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:30:0x009f, B:40:0x00c9, B:41:0x00d3, B:33:0x00a6, B:35:0x00aa, B:39:0x00bf, B:38:0x00ba, B:42:0x00dd, B:43:0x00e2, B:50:0x00ec, B:53:0x00fa), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        i right;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f224239s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f224239s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f224237q;
        ?? E = uq.b.e();
        int i16 = aVar.f224239s;
        boolean zBooleanValue = true;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        boolean zK = this.ePaymentsRepository.K();
                        if (!zK) {
                            f fVar = this.getPaymentsUseCase;
                            f.Params params = new f.Params(g.ALL, 0);
                            aVar.f224226d = vq.j.a(c1792a);
                            aVar.f224227e = jVarA;
                            aVar.f224228f = vq.j.a(aVar2);
                            aVar.f224229g = vq.j.a(aVar2);
                            aVar.f224230h = aVar2;
                            aVar.f224231j = 0;
                            aVar.f224232k = 0;
                            aVar.f224233l = 0;
                            aVar.f224234m = 0;
                            aVar.f224235n = 0;
                            aVar.f224236p = zK;
                            aVar.f224239s = 1;
                            Object objC = fVar.c(params, aVar);
                            if (objC == E) {
                                return E;
                            }
                            obj = objC;
                            bVar = aVar2;
                            right = (i) obj;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new p();
                                }
                                if (((List) ((i.Right) right).b()).isEmpty()) {
                                    zBooleanValue = false;
                                } else {
                                    this.ePaymentsRepository.Q(true);
                                }
                                right = new i.Right(vq.b.a(zBooleanValue));
                            }
                            zBooleanValue = ((Boolean) bVar.a(right)).booleanValue();
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f224230h;
                    try {
                        u.b(obj);
                        right = (i) obj;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            if (((List) ((i.Right) right).b()).isEmpty()) {
                                zBooleanValue = false;
                            } else {
                                this.ePaymentsRepository.Q(true);
                            }
                            right = new i.Right(vq.b.a(zBooleanValue));
                        }
                        zBooleanValue = ((Boolean) bVar.a(right)).booleanValue();
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(vq.b.a(zBooleanValue));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
