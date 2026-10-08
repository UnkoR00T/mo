package r12;

import ja.PagingState;
import ja.x0;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006&"}, d2 = {"Lr12/m0;", "Lja/x0;", "", "Lfo0/c;", "Lp02/j;", "fetchMessagesUseCase", "Leo0/r;", "directoryId", "Lkotlin/Function2;", "Ldx/b;", "Loq/i0;", "loadingFailed", "Lkotlin/Function0;", "firstPageOrRetrySucceed", "emptyPageLoaded", "<init>", "(Lp02/j;Ljava/lang/String;Ler/p;Ler/a;Ler/a;Lfr/k;)V", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/String;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "b", "Lp02/j;", "c", "Ljava/lang/String;", "d", "Ler/p;", "e", "Ler/a;", "f", "lastFailedKey", "h", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 extends x0<String, fo0.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f170575i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Void f170576j = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p02.j fetchMessagesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String directoryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.p<String, dx.b, oq.i0> loadingFailed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> firstPageOrRetrySucceed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> emptyPageLoaded;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String lastFailedKey;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f170584e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f170586g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170584e = obj;
            this.f170586g |= PKIFailureInfo.systemUnavail;
            return m0.this.g(null, this);
        }
    }

    public /* synthetic */ m0(p02.j jVar, String str, er.p pVar, er.a aVar, er.a aVar2, fr.k kVar) {
        this(jVar, str, pVar, aVar, aVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ja.x0
    public Object g(x0.a<String> aVar, tq.e<? super x0.b<String, fo0.c>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f170586g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f170586g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f170584e;
        Object objE2 = uq.b.e();
        int i16 = bVar.f170586g;
        if (i16 == 0) {
            oq.u.b(objE);
            p02.j jVar = this.fetchMessagesUseCase;
            p02.j.Params params = new p02.j.Params(this.directoryId, aVar.a(), null);
            bVar.f170583d = aVar;
            bVar.f170586g = 1;
            objE = jVar.e(params, bVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (x0.a) bVar.f170583d;
            oq.u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            this.lastFailedKey = aVar.a();
            this.loadingFailed.B(aVar.a(), bVar2);
            return new x0.b.a(new Throwable());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        if (fr.t.c(aVar.a(), f170576j) && list.isEmpty()) {
            this.emptyPageLoaded.a();
        } else if (fr.t.c(this.lastFailedKey, aVar.a())) {
            this.firstPageOrRetrySucceed.a();
        }
        fo0.c cVar = (fo0.c) pq.v.n0(list);
        return new x0.b.C2395b(list, null, cVar != null ? cVar.getNextPageId() : null);
    }

    @Override // ja.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String d(PagingState<String, fo0.c> state) {
        return (String) f170576j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m0(p02.j jVar, String str, er.p<? super String, ? super dx.b, oq.i0> pVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
        this.fetchMessagesUseCase = jVar;
        this.directoryId = str;
        this.loadingFailed = pVar;
        this.firstPageOrRetrySucceed = aVar;
        this.emptyPageLoaded = aVar2;
    }
}
