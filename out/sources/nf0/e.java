package nf0;

import cf0.AsyncDocumentToGenerate;
import cf0.DownloadTaskData;
import fr.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnf0/e;", "Ldf0/e;", "Lmf0/a;", "downloadTaskDataRepository", "<init>", "(Lmf0/a;)V", "Ldf0/e$a;", "params", "Ldx/i;", "Ldx/b;", "Lcf0/f;", "d", "(Ldf0/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements df0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135582h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135583j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135584k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135585l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135586m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135587n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f135588p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135590r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135588p = obj;
            this.f135590r |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(mf0.a aVar) {
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
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.e.Params params, tq.e<? super dx.i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        df0.e.Params params2;
        ex.b bVar2;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f135590r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135590r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f135588p;
        Object objE = uq.b.e();
        ?? r15 = aVar.f135590r;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    mf0.a aVar3 = this.downloadTaskDataRepository;
                    aVar.f135578d = params;
                    aVar.f135579e = jVarA;
                    aVar.f135580f = vq.j.a(aVar2);
                    aVar.f135581g = aVar2;
                    aVar.f135582h = aVar2;
                    aVar.f135583j = 0;
                    aVar.f135584k = 0;
                    aVar.f135585l = 0;
                    aVar.f135586m = 0;
                    aVar.f135587n = 0;
                    aVar.f135590r = 1;
                    Object objA = aVar3.a(aVar);
                    if (objA == objE) {
                        return objE;
                    }
                    bVar = aVar2;
                    obj = objA;
                    params2 = params;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) aVar.f135582h;
                    bVar = (ex.b) aVar.f135581g;
                    params2 = (df0.e.Params) aVar.f135578d;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                Iterator it = ((Iterable) bVar2.a((dx.i) obj)).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    DownloadTaskData downloadTaskData = (DownloadTaskData) next;
                    if (!downloadTaskData.getTaskCompleted()) {
                        Collection<AsyncDocumentToGenerate> collectionValues = downloadTaskData.b().values();
                        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                            Iterator<T> it4 = collectionValues.iterator();
                            while (it4.hasNext()) {
                                if (t.c(((AsyncDocumentToGenerate) it4.next()).getPreviousDocumentId(), params2.getPreviousDocumentId())) {
                                    break loop0;
                                }
                            }
                        }
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
