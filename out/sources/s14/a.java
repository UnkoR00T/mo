package s14;

import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import wx.FileContent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls14/a;", "Ld14/a;", "Lz04/a;", "fileStorageRepository", "<init>", "(Lz04/a;)V", "Ld14/a$a;", "params", "Ldx/i;", "Ldx/b;", "Ld14/a$b;", "d", "(Ld14/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lz04/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements d14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z04.a fileStorageRepository;

    /* JADX INFO: renamed from: s14.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4529a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f177474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f177475h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f177477k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f177478l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f177479m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177480n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f177481p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f177483r;

        C4529a(e<? super C4529a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177481p = obj;
            this.f177483r |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(z04.a aVar) {
        this.fileStorageRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(d14.a.Params params, e<? super i<? extends dx.b, d14.a.Result>> eVar) throws Throwable {
        C4529a c4529a;
        Object objB;
        ex.b bVar;
        if (eVar instanceof C4529a) {
            c4529a = (C4529a) eVar;
            int i15 = c4529a.f177483r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4529a.f177483r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4529a = new C4529a(eVar);
            }
        } else {
            c4529a = new C4529a(eVar);
        }
        Object obj = c4529a.f177481p;
        ?? E = uq.b.e();
        int i16 = c4529a.f177483r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        z04.a aVar2 = this.fileStorageRepository;
                        String name = params.getFile().getMetadata().getName();
                        c4529a.f177471d = vq.j.a(params);
                        c4529a.f177472e = jVarA;
                        c4529a.f177473f = vq.j.a(aVar);
                        c4529a.f177474g = vq.j.a(aVar);
                        c4529a.f177475h = aVar;
                        c4529a.f177476j = 0;
                        c4529a.f177477k = 0;
                        c4529a.f177478l = 0;
                        c4529a.f177479m = 0;
                        c4529a.f177480n = 0;
                        c4529a.f177483r = 1;
                        Object objB2 = aVar2.b(name, c4529a);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
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
                    bVar = (ex.b) c4529a.f177475h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(new d14.a.Result((FileContent) bVar.a((i) obj)));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
