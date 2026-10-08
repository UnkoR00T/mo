package o14;

import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lo14/f;", "La14/f;", "Laz/f;", "fileManager", "<init>", "(Laz/f;)V", "La14/f$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(La14/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Laz/f;", "getFileManager", "()Laz/f;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements a14.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f140597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f140598f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f140599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f140600h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f140601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f140602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f140603l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f140604m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f140605n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f140606p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f140608r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140606p = obj;
            this.f140608r |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(az.f fVar) {
        this.fileManager = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(a14.f.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f140608r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f140608r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f140606p;
        ?? E = uq.b.e();
        int i16 = aVar.f140608r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        az.f fVar = this.fileManager;
                        az.g.Path path = new az.g.Path(params.getFilePath());
                        aVar.f140596d = vq.j.a(params);
                        aVar.f140597e = jVarA;
                        aVar.f140598f = vq.j.a(aVar2);
                        aVar.f140599g = vq.j.a(aVar2);
                        aVar.f140600h = aVar2;
                        aVar.f140601j = 0;
                        aVar.f140602k = 0;
                        aVar.f140603l = 0;
                        aVar.f140604m = 0;
                        aVar.f140605n = 0;
                        aVar.f140608r = 1;
                        Object objE = fVar.e(path, aVar);
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
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
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
                    bVar = (ex.b) aVar.f140600h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                bVar.a((dx.i) obj);
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
