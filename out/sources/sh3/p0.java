package sh3;

import ja.PagingState;
import ja.x0;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import sv0.ProcessId;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R0\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.¨\u0006/"}, d2 = {"Lsh3/p0;", "Lja/x0;", "", "Ltv0/k;", "Lsv0/y;", "processId", "Ltv0/m;", "pages", "Law0/v;", "getParticipantVehiclesByPageIdUC", "Lvm3/a;", "vehicleTypeMapper", "Lkotlin/Function1;", "Ltv0/m$a;", "Loq/i0;", "onDownloadedPage", "Lkotlin/Function2;", "Ldx/b;", "Ltq/e;", "", "onLoadPageError", "<init>", "(Lsv0/y;Ltv0/m;Law0/v;Lvm3/a;Ler/l;Ler/p;)V", "page", "k", "(Ltv0/m$a;)V", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/String;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "b", "Lsv0/y;", "c", "Law0/v;", "d", "Lvm3/a;", "e", "Ler/l;", "f", "Ler/p;", "", "Ljava/util/Map;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends x0<String, BEVehicleDataWithType> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProcessId processId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.v getParticipantVehiclesByPageIdUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vm3.a vehicleTypeMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<BEVehiclesPages.BEVehiclesPageWithTypes, oq.i0> onDownloadedPage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final er.p<dx.b, tq.e<? super oq.i0>, Object> onLoadPageError;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, BEVehiclesPages.BEVehiclesPageWithTypes> pages;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f181897h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181898j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f181899k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f181900l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f181902n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181900l = obj;
            this.f181902n |= PKIFailureInfo.systemUnavail;
            return p0.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(ProcessId processId, BEVehiclesPages bEVehiclesPages, aw0.v vVar, vm3.a aVar, er.l<? super BEVehiclesPages.BEVehiclesPageWithTypes, oq.i0> lVar, er.p<? super dx.b, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        this.processId = processId;
        this.getParticipantVehiclesByPageIdUC = vVar;
        this.vehicleTypeMapper = aVar;
        this.onDownloadedPage = lVar;
        this.onLoadPageError = pVar;
        this.pages = v0.w(bEVehiclesPages.c());
    }

    private final void k(BEVehiclesPages.BEVehiclesPageWithTypes page) {
        this.pages.put(page.getKey(), page);
        this.onDownloadedPage.b(page);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0154, code lost:
    
        if (r6.B(r3, r0) == r1) goto L44;
     */
    @Override // ja.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(ja.x0.a<java.lang.String> r12, tq.e<? super ja.x0.b<java.lang.String, tv0.BEVehicleDataWithType>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.p0.g(ja.x0$a, tq.e):java.lang.Object");
    }

    @Override // ja.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String d(PagingState<String, BEVehicleDataWithType> state) {
        x0.b.C2395b<String, BEVehicleDataWithType> c2395bC;
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition == null || (c2395bC = state.c(anchorPosition.intValue())) == null) {
            return null;
        }
        return c2395bC.h();
    }
}
