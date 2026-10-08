package nf0;

import cf0.DownloadTaskData;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lnf0/d;", "Ldf0/d;", "Lmf0/a;", "downloadTaskDataRepository", "<init>", "(Lmf0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lcf0/f;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements df0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135568h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135569j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135570k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135571l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135572m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135573n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f135574p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135576r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135574p = obj;
            this.f135576r |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(mf0.a aVar) {
        this.downloadTaskDataRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f135576r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135576r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f135574p;
        Object objE = uq.b.e();
        ?? r15 = aVar.f135576r;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    mf0.a aVar3 = this.downloadTaskDataRepository;
                    aVar.f135564d = vq.j.a(c1792a);
                    aVar.f135565e = jVarA;
                    aVar.f135566f = vq.j.a(aVar2);
                    aVar.f135567g = aVar2;
                    aVar.f135568h = aVar2;
                    aVar.f135569j = 0;
                    aVar.f135570k = 0;
                    aVar.f135571l = 0;
                    aVar.f135572m = 0;
                    aVar.f135573n = 0;
                    aVar.f135576r = 1;
                    Object objA = aVar3.a(aVar);
                    if (objA == objE) {
                        return objE;
                    }
                    bVar = aVar2;
                    obj = objA;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) aVar.f135568h;
                    bVar = (ex.b) aVar.f135567g;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                Iterator it = ((Iterable) bVar2.a((dx.i) obj)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    DownloadTaskData downloadTaskData = (DownloadTaskData) next;
                    if (!downloadTaskData.getTaskCompleted() && downloadTaskData.getDocumentDownloadMethod() == cf0.e.FIRST_DOWNLOAD && downloadTaskData.b().containsKey(cf0.c.JUNIOR_STUDENT_CARD)) {
                        break;
                    }
                }
                DownloadTaskData downloadTaskData2 = (DownloadTaskData) next;
                if (downloadTaskData2 != null) {
                    return new dx.i.Right(downloadTaskData2);
                }
                bVar.b(new dx.b.Generic(new NoSuchElementException("There is no matching download task")));
                throw new oq.g();
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                dx.i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
