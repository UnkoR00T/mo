package b74;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lb74/o;", "Lv64/l;", "La74/a;", "userRepository", "Lb74/k;", "clearUserDataUC", "Lv64/f;", "clearSessionDataUC", "Luh0/d;", "beDeactivateAppUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lmz3/d;", "cancelAllAsyncDownloadWorkersUC", "Lmz0/b;", "resetChosenThemeUC", "Lug1/a;", "clearFavouriteServicesUseCase", "Li13/a;", "clearEmergencyBackpackAddedItemsUseCase", "Ly51/a;", "clearChildPassportApplicationDraftTimestampUC", "Lz64/c;", "userDashboardInteractor", "<init>", "(La74/a;Lb74/k;Lv64/f;Luh0/d;Lac4/a;Lmz3/d;Lmz0/b;Lug1/a;Li13/a;Ly51/a;Lz64/c;)V", "Lv64/l$a;", "params", "Loq/i0;", "n", "(Lv64/l$a;Ltq/e;)Ljava/lang/Object;", "a", "La74/a;", "b", "Lb74/k;", "c", "Lv64/f;", "d", "Luh0/d;", "e", "Lac4/a;", "f", "Lmz3/d;", "g", "Lmz0/b;", "h", "Lug1/a;", "i", "Li13/a;", "j", "Ly51/a;", "k", "Lz64/c;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements v64.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a74.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k clearUserDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v64.f clearSessionDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uh0.d beDeactivateAppUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mz3.d cancelAllAsyncDownloadWorkersUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz0.b resetChosenThemeUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ug1.a clearFavouriteServicesUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final i13.a clearEmergencyBackpackAddedItemsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final y51.a clearChildPassportApplicationDraftTimestampUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final z64.c userDashboardInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17198e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17200g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17198e = obj;
            this.f17200g |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v64.l.Params f17202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f17203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v64.l.Params params, o oVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f17202f = params;
            this.f17203g = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x0068  */
        /* JADX WARN: Code duplicated, block: B:25:0x007a  */
        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
        
            if (r4.c(r1, r3) == r0) goto L39;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r4) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b74.o.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new b(this.f17202f, this.f17203g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public o(a74.a aVar, k kVar, v64.f fVar, uh0.d dVar, ac4.a aVar2, mz3.d dVar2, mz0.b bVar, ug1.a aVar3, i13.a aVar4, y51.a aVar5, z64.c cVar) {
        this.userRepository = aVar;
        this.clearUserDataUC = kVar;
        this.clearSessionDataUC = fVar;
        this.beDeactivateAppUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.cancelAllAsyncDownloadWorkersUC = dVar2;
        this.resetChosenThemeUC = bVar;
        this.clearFavouriteServicesUseCase = aVar3;
        this.clearEmergencyBackpackAddedItemsUseCase = aVar4;
        this.clearChildPassportApplicationDraftTimestampUC = aVar5;
        this.userDashboardInteractor = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // gz.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object c(v64.l.Params params, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f17200g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f17200g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f17198e;
        Object objE = uq.b.e();
        int i16 = aVar2.f17200g;
        if (i16 == 0) {
            oq.u.b(obj);
            ac4.a aVar3 = this.callActionWithLoaderUseCase;
            b bVar = new b(params, this, null);
            aVar2.f17197d = vq.j.a(params);
            aVar2.f17200g = 1;
            if (ac4.a.a(aVar3, null, bVar, aVar2, 1, null) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return i0.f148189a;
    }
}
