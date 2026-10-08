package nf0;

import cf0.DownloadTaskData;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnf0/a;", "Ldf0/a;", "Ljf0/a;", "documentDownloadRepository", "Lmf0/a;", "downloadTaskDataRepository", "Lof0/a;", "asyncDownloadDocumentsManager", "<init>", "(Ljf0/a;Lmf0/a;Lof0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljf0/a;", "b", "Lmf0/a;", "c", "Lof0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements df0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final of0.a asyncDownloadDocumentsManager;

    /* JADX INFO: renamed from: nf0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3351a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135557n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f135558p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135560r;

        C3351a(tq.e<? super C3351a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135558p = obj;
            this.f135560r |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(jf0.a aVar, mf0.a aVar2, of0.a aVar3) {
        this.documentDownloadRepository = aVar;
        this.downloadTaskDataRepository = aVar2;
        this.asyncDownloadDocumentsManager = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        C3351a c3351a;
        Object objB;
        ex.b bVar;
        if (eVar instanceof C3351a) {
            c3351a = (C3351a) eVar;
            int i15 = c3351a.f135560r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3351a.f135560r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3351a = new C3351a(eVar);
            }
        } else {
            c3351a = new C3351a(eVar);
        }
        Object obj = c3351a.f135558p;
        ?? E = uq.b.e();
        int i16 = c3351a.f135560r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        mf0.a aVar2 = this.downloadTaskDataRepository;
                        c3351a.f135548d = vq.j.a(c1792a);
                        c3351a.f135549e = jVarA;
                        c3351a.f135550f = vq.j.a(aVar);
                        c3351a.f135551g = vq.j.a(aVar);
                        c3351a.f135552h = aVar;
                        c3351a.f135553j = 0;
                        c3351a.f135554k = 0;
                        c3351a.f135555l = 0;
                        c3351a.f135556m = 0;
                        c3351a.f135557n = 0;
                        c3351a.f135560r = 1;
                        Object objA = aVar2.a(c3351a);
                        if (objA == E) {
                            return E;
                        }
                        obj = objA;
                        bVar = aVar;
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
                    bVar = (ex.b) c3351a.f135552h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                Iterable iterable = (Iterable) bVar.a((dx.i) obj);
                ArrayList<DownloadTaskData> arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (!((DownloadTaskData) obj2).getTaskCompleted()) {
                        arrayList.add(obj2);
                    }
                }
                for (DownloadTaskData downloadTaskData : arrayList) {
                    this.documentDownloadRepository.a(downloadTaskData.getTaskId());
                    this.asyncDownloadDocumentsManager.a(downloadTaskData.getTaskId());
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
