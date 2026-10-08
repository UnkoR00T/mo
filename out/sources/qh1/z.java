package qh1;

import fr.q0;
import g64.GlobalSearchDocumentResult;
import g64.GlobalSearchEntry;
import g64.GlobalSearchResult;
import iq0.BESearchConfigSectionItem;
import iq0.BESearchSections;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ju.g1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008d\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u008e\u0001B¡\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J,\u00104\u001a\b\u0012\u0004\u0012\u00020/032\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b4\u00105J\u0018\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0082@¢\u0006\u0004\b9\u0010:J<\u0010A\u001a\b\u0012\u0004\u0012\u0002060;*\b\u0012\u0004\u0012\u00020<0;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0;H\u0082@¢\u0006\u0004\bA\u0010BJI\u0010F\u001a\b\u0012\u0004\u0012\u0002060;*\b\u0012\u0004\u0012\u00020C0;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0;2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0;H\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010M\u001a\u00020L*\u00020\u0002H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u0002082\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR'\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030{8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR'\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R%\u00100\u001a\t\u0012\u0004\u0012\u00020L0\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, d2 = {"Lqh1/z;", "Ll00/g;", "Lqh1/c;", "Lqh1/a;", "Lqh1/d;", "", "Lyy/a;", "stateMachineFactory", "Lsh1/f;", "mapper", "Lsh1/g;", "serviceInterruptionDialogMapper", "Lh64/r;", "loadServicesUseCase", "Lh64/j;", "getServiceTemporaryInterruptionUseCase", "Lug1/c;", "getDocumentNavigationUseCase", "Lch1/p;", "getDashboardSingleDocumentStatusUC", "Ldh1/a;", "getGlobalSearchVisibleDocumentsUC", "Lh64/h;", "getGlobalSearchSectionsUC", "Lh64/t;", "queryGlobalSearchUC", "Lh64/b;", "checkGlobalSearchTagsExistsUC", "Lib4/c;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lh64/s;", "monitorGlobalSearchLastOpenedSearchEntriesUC", "Lh64/v;", "saveOpenedGlobalSearchEntryUC", "Lac4/a;", "callActionWithLoaderUC", "Lyg1/a;", "dashboardContainersInteractor", "Lch1/k;", "getAvailableAppMenuItemsUC", "<init>", "(Lyy/a;Lsh1/f;Lsh1/g;Lh64/r;Lh64/j;Lug1/c;Lch1/p;Ldh1/a;Lh64/h;Lh64/t;Lh64/b;Lib4/c;Lhb4/d;Lcb4/j;Lh64/s;Lh64/v;Lac4/a;Lyg1/a;Lch1/k;)V", "Lk10/c0;", "Lqh1/c$b;", "state", "Lg64/e;", "searchResultByTags", "Lk10/l;", "W9", "(Lk10/c0;Lg64/e;Ltq/e;)Ljava/lang/Object;", "Lth1/a;", "searchItem", "Loq/i0;", "X9", "(Lth1/a;Ltq/e;)Ljava/lang/Object;", "", "Liq0/m;", "Lth1/a$c;", "servicesAllItems", "Lth1/a$a;", "documentsAllItems", "U9", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lg64/b;", "Lth1/a$b;", "appMenuItem", "V9", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Ldx/b;", "Ljb4/b;", "O9", "(Ldx/b;)Ljb4/b;", "Lqh1/d$a;", "Q9", "(Lqh1/c;)Lqh1/d$a;", "Lgx/b;", "globalEvent", "N9", "(Lgx/b;)V", "b", "Lsh1/f;", "c", "Lsh1/g;", "d", "Lh64/r;", "e", "Lh64/j;", "f", "Lug1/c;", "g", "Lch1/p;", "h", "Ldh1/a;", "j", "Lh64/h;", "k", "Lh64/t;", "l", "Lh64/b;", "m", "Lib4/c;", "n", "Lhb4/d;", "p", "Lcb4/j;", "q", "Lh64/s;", "r", "Lh64/v;", "s", "Lac4/a;", "t", "Lyg1/a;", "v", "Lch1/k;", "Lqh1/c$d;", "w", "Lqh1/c$d;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqh1/a$h;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "A", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<qh1.c, a> implements qh1.d, zx.d {
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sh1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sh1.g serviceInterruptionDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h64.j getServiceTemporaryInterruptionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ug1.c getDocumentNavigationUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ch1.p getDashboardSingleDocumentStatusUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final dh1.a getGlobalSearchVisibleDocumentsUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h64.h getGlobalSearchSectionsUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h64.t queryGlobalSearchUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h64.b checkGlobalSearchTagsExistsUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h64.s monitorGlobalSearchLastOpenedSearchEntriesUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final h64.v saveOpenedGlobalSearchEntryUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ch1.k getAvailableAppMenuItemsUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final qh1.c.d initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qh1.c, a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.h> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<qh1.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166574a;

        static {
            int[] iArr = new int[g64.c.values().length];
            try {
                iArr[g64.c.SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g64.c.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g64.c.MENU_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f166574a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lth1/a;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends th1.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<BESearchConfigSectionItem> f166576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<th1.a.ServiceItem> f166577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<th1.a.DocumentItem> f166578h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<BESearchConfigSectionItem> list, List<th1.a.ServiceItem> list2, List<th1.a.DocumentItem> list3, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f166576f = list;
            this.f166577g = list2;
            this.f166578h = list3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166575e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<BESearchConfigSectionItem> list = this.f166576f;
            List<th1.a.ServiceItem> list2 = this.f166577g;
            List<th1.a.DocumentItem> list3 = this.f166578h;
            ArrayList arrayList = new ArrayList();
            for (BESearchConfigSectionItem bESearchConfigSectionItem : list) {
                String serviceType = bESearchConfigSectionItem.getServiceType();
                Object obj2 = null;
                if (serviceType != null) {
                    for (Object obj3 : list2) {
                        if (fr.t.c(serviceType, ((th1.a.ServiceItem) obj3).getGlobalSearchType().getBackendName())) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    obj2 = (th1.a) obj2;
                } else {
                    String documentType = bESearchConfigSectionItem.getDocumentType();
                    if (documentType != null) {
                        for (Object obj4 : list3) {
                            th1.a.DocumentItem documentItem = (th1.a.DocumentItem) obj4;
                            if (fr.t.c(documentType, documentItem.getGlobalSearchType().getBackendName()) && fr.t.c(bESearchConfigSectionItem.getSubType(), documentItem.getDocumentConfig().getSubtype())) {
                                obj2 = obj4;
                                break;
                            }
                        }
                        obj2 = (th1.a) obj2;
                    }
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<? extends th1.a>> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f166576f, this.f166577g, this.f166578h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lk10/l;", "Lqh1/c$b;", "<anonymous>", "(Lju/p0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super k10.l<? extends qh1.c.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k10.c0<qh1.c.Initialized> f166580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GlobalSearchResult f166581g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.c0<qh1.c.Initialized> c0Var, GlobalSearchResult globalSearchResult, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f166580f = c0Var;
            this.f166581g = globalSearchResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(GlobalSearchResult globalSearchResult, qh1.c.Initialized initialized) {
            Set setK1 = pq.v.k1(globalSearchResult.c());
            List<th1.a.ServiceItem> listK = initialized.getData().k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (pq.v.c0(setK1, ((th1.a.ServiceItem) obj).getGlobalSearchType().getBackendName())) {
                    arrayList.add(obj);
                }
            }
            List<GlobalSearchDocumentResult> listA = globalSearchResult.a();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listA) {
                if (((GlobalSearchDocumentResult) obj2).getSubType() != null) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            }
            oq.r rVar = new oq.r(arrayList2, arrayList3);
            List list = (List) rVar.a();
            List list2 = (List) rVar.b();
            List<GlobalSearchDocumentResult> list3 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(list3, 10)), 16));
            for (GlobalSearchDocumentResult globalSearchDocumentResult : list3) {
                oq.r rVarA = oq.y.a(globalSearchDocumentResult.getSubType(), globalSearchDocumentResult.getType());
                linkedHashMap.put(rVarA.c(), rVarA.d());
            }
            List list4 = list2;
            ArrayList arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList4.add(((GlobalSearchDocumentResult) it.next()).getType());
            }
            Set setK2 = pq.v.k1(arrayList4);
            List<th1.a.DocumentItem> listD = initialized.getData().d();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : listD) {
                th1.a.DocumentItem documentItem = (th1.a.DocumentItem) obj3;
                String subtype = documentItem.getDocumentConfig().getSubtype();
                if (subtype != null ? fr.t.c(linkedHashMap.get(subtype), documentItem.getGlobalSearchType().getBackendName()) : pq.v.c0(setK2, documentItem.getGlobalSearchType().getBackendName())) {
                    arrayList5.add(obj3);
                }
            }
            Set setK3 = pq.v.k1(globalSearchResult.b());
            List<th1.a.SearchAppMenuItem> listC = initialized.getData().c();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : listC) {
                if (pq.v.c0(setK3, ((th1.a.SearchAppMenuItem) obj4).getGlobalSearchType().getBackendName())) {
                    arrayList6.add(obj4);
                }
            }
            return initialized.a(ContentData.b(initialized.getData(), null, false, false, null, null, null, null, null, pq.v.L0(pq.v.L0(arrayList, arrayList5), arrayList6), null, 763, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166579e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.c0<qh1.c.Initialized> c0Var = this.f166580f;
            final GlobalSearchResult globalSearchResult = this.f166581g;
            return c0Var.b(new er.l() { // from class: qh1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O(globalSearchResult, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super k10.l<qh1.c.Initialized>> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f166580f, this.f166581g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<qh1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f166583b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f166585b;

            /* JADX INFO: renamed from: qh1.z$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4183a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166586d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166587e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166588f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166590h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166591j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166592k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166593l;

                public C4183a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166586d = obj;
                    this.f166587e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f166584a = hVar;
                this.f166585b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4183a c4183a;
                if (eVar instanceof C4183a) {
                    c4183a = (C4183a) eVar;
                    int i15 = c4183a.f166587e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4183a.f166587e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4183a = new C4183a(eVar);
                    }
                } else {
                    c4183a = new C4183a(eVar);
                }
                Object obj2 = c4183a.f166586d;
                Object objE = uq.b.e();
                int i16 = c4183a.f166587e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f166584a;
                    qh1.d.a aVarQ9 = this.f166585b.Q9((qh1.c) obj);
                    c4183a.f166588f = vq.j.a(obj);
                    c4183a.f166590h = vq.j.a(c4183a);
                    c4183a.f166591j = vq.j.a(obj);
                    c4183a.f166592k = vq.j.a(hVar);
                    c4183a.f166593l = 0;
                    c4183a.f166587e = 1;
                    if (hVar.F(aVarQ9, c4183a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar, z zVar) {
            this.f166582a = gVar;
            this.f166583b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qh1.d.a> hVar, tq.e eVar) {
            Object objA = this.f166582a.a(new a(hVar, this.f166583b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh1/a$h;", "action", "Lqh1/c$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqh1/a$h;Lqh1/c$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.h, qh1.c.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166595f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.h hVar = (a.h) this.f166595f;
            Object objE = uq.b.e();
            int i15 = this.f166594e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = z.this.Y1();
                this.f166595f = vq.j.a(hVar);
                this.f166594e = 1;
                if (bVarY1.F(hVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, qh1.c.d dVar, tq.e<? super oq.i0> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f166595f = hVar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqh1/c$d;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<qh1.c.d>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166598f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqh1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qh1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f166600e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f166601f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f166602g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f166603h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f166604j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f166605k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f166606l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f166607m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f166608n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ z f166609p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<qh1.c.d> f166610q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<qh1.c.d> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f166609p = zVar;
                this.f166610q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qh1.c.LoadingError Z(z zVar, qh1.c.d dVar) {
                return new qh1.c.LoadingError(zVar.errorVMSFactory.a(zVar.O9(new dx.b.Generic(null, 1, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qh1.c.LoadingError a0(z zVar, dx.b bVar, qh1.c.d dVar) {
                return new qh1.c.LoadingError(zVar.errorVMSFactory.a(zVar.O9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qh1.c.LoadingError b0(z zVar, dx.b bVar, qh1.c.d dVar) {
                return new qh1.c.LoadingError(zVar.errorVMSFactory.a(zVar.O9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qh1.c.Initialized c0(List list, List list2, List list3, fr.p0 p0Var, fr.p0 p0Var2, qh1.c.d dVar) {
                return new qh1.c.Initialized(new ContentData(null, false, false, list, list2, list3, (List) p0Var.f66410a, (List) p0Var2.f66410a, null, null, 775, null));
            }

            /* JADX WARN: Code duplicated, block: B:18:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:23:0x00cf A[PHI: r1 r13
              0x00cf: PHI (r1v4 boolean) = (r1v2 boolean), (r1v5 boolean) binds: [B:21:0x00cb, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]
              0x00cf: PHI (r13v11 java.lang.Object) = (r13v68 java.lang.Object), (r13v69 java.lang.Object) binds: [B:21:0x00cb, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:28:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:34:0x0106  */
            /* JADX WARN: Code duplicated, block: B:38:0x0122 A[PHI: r1 r2 r13
              0x0122: PHI (r1v6 boolean) = (r1v4 boolean), (r1v7 boolean) binds: [B:36:0x011e, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
              0x0122: PHI (r2v5 java.util.List) = (r2v3 java.util.List), (r2v7 java.util.List) binds: [B:36:0x011e, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
              0x0122: PHI (r13v19 java.lang.Object) = (r13v66 java.lang.Object), (r13v67 java.lang.Object) binds: [B:36:0x011e, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x012c  */
            /* JADX WARN: Code duplicated, block: B:42:0x013e  */
            /* JADX WARN: Code duplicated, block: B:44:0x0142  */
            /* JADX WARN: Code duplicated, block: B:47:0x0163  */
            /* JADX WARN: Code duplicated, block: B:51:0x016e  */
            /* JADX WARN: Code duplicated, block: B:53:0x0172  */
            /* JADX WARN: Code duplicated, block: B:56:0x0191 A[LOOP:0: B:54:0x018b->B:56:0x0191, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
            /* JADX WARN: Code duplicated, block: B:67:0x01ea A[PHI: r1 r2 r3 r4 r13
              0x01ea: PHI (r1v10 boolean) = (r1v8 boolean), (r1v11 boolean) binds: [B:65:0x01e7, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
              0x01ea: PHI (r2v17 java.util.List) = (r2v12 java.util.List), (r2v20 java.util.List) binds: [B:65:0x01e7, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
              0x01ea: PHI (r3v18 java.util.List) = (r3v14 java.util.List), (r3v21 java.util.List) binds: [B:65:0x01e7, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
              0x01ea: PHI (r4v8 java.util.List) = (r4v6 java.util.List), (r4v11 java.util.List) binds: [B:65:0x01e7, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]
              0x01ea: PHI (r13v50 java.lang.Object) = (r13v63 java.lang.Object), (r13v64 java.lang.Object) binds: [B:65:0x01e7, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:69:0x0205  */
            /* JADX WARN: Code duplicated, block: B:72:0x0225  */
            /* JADX WARN: Code duplicated, block: B:76:0x0252  */
            /* JADX WARN: Code duplicated, block: B:78:0x0260  */
            /* JADX WARN: Code duplicated, block: B:81:0x0271  */
            /* JADX WARN: Code duplicated, block: B:83:0x0277  */
            /* JADX WARN: Code duplicated, block: B:85:0x027d  */
            /* JADX WARN: Code duplicated, block: B:88:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:91:0x00de A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v4, types: [T, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.List] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object obj2;
                boolean zBooleanValue;
                Object objC;
                List<DashboardServiceEntry> list;
                List listN;
                Object objA;
                ji1.c cVarA;
                g64.d dVarB;
                th1.a.ServiceItem serviceItem;
                Object obj3;
                dx.i iVar;
                k10.c0<qh1.c.d> c0Var;
                final z zVar;
                List list2;
                Object objA2;
                List list3;
                Object obj4;
                List list4;
                Object right;
                k10.c0<qh1.c.d> c0Var2;
                final z zVar2;
                List list5;
                Object objC2;
                ArrayList arrayList;
                Object obj5;
                BESearchSections bESearchSections;
                fr.p0 p0Var;
                fr.p0 p0Var2;
                final fr.p0 p0Var3;
                final List list6;
                final List list7;
                final List list8;
                final fr.p0 p0Var4;
                Object objU9;
                List list9;
                fr.p0 p0Var5;
                T t15;
                List list10;
                fr.p0 p0Var6;
                List list11;
                fr.p0 p0Var7;
                Object objU10;
                fr.p0 p0Var8;
                fr.p0 p0Var9;
                fr.p0 p0Var10;
                List list12;
                List list13;
                List list14;
                T t16;
                Object objE = uq.b.e();
                switch (this.f166608n) {
                    case 0:
                        oq.u.b(obj);
                        h64.b bVar = this.f166609p.checkGlobalSearchTagsExistsUC;
                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                        this.f166608n = 1;
                        Object objC3 = bVar.c(c1792a, this);
                        obj2 = objC3;
                        if (objC3 != objE) {
                            zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (!zBooleanValue) {
                                k10.c0<qh1.c.d> c0Var3 = this.f166610q;
                                final z zVar3 = this.f166609p;
                                return c0Var3.d(new er.l() { // from class: qh1.b0
                                    @Override // er.l
                                    public final Object b(Object obj6) {
                                        return z.g.a.Z(zVar3, (c.d) obj6);
                                    }
                                });
                            }
                            h64.r rVar = this.f166609p.loadServicesUseCase;
                            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                            this.f166600e = zBooleanValue;
                            this.f166608n = 2;
                            objC = rVar.c(c1792a2, this);
                            if (objC != objE) {
                                obj = objC;
                                list = (List) obj;
                                if (list != null) {
                                    listN = new ArrayList();
                                    for (DashboardServiceEntry dashboardServiceEntry : list) {
                                        cVarA = ji1.d.a(dashboardServiceEntry);
                                        dVarB = zg1.a.b(dashboardServiceEntry.getType());
                                        if (dVarB == null) {
                                            serviceItem = null;
                                        } else {
                                            serviceItem = new th1.a.ServiceItem(dVarB, dashboardServiceEntry, cVarA);
                                        }
                                        if (serviceItem != null) {
                                            listN.add(serviceItem);
                                        }
                                    }
                                } else {
                                    listN = pq.v.n();
                                }
                                dh1.a aVar = this.f166609p.getGlobalSearchVisibleDocumentsUC;
                                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                this.f166601f = listN;
                                this.f166600e = zBooleanValue;
                                this.f166608n = 3;
                                objA = aVar.a(c1792a3, this);
                                obj3 = objA;
                                if (objA != objE) {
                                    iVar = (dx.i) obj3;
                                    c0Var = this.f166610q;
                                    zVar = this.f166609p;
                                    if (iVar instanceof dx.i.Left) {
                                        final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                                        return c0Var.d(new er.l() { // from class: qh1.c0
                                            @Override // er.l
                                            public final Object b(Object obj6) {
                                                return z.g.a.a0(zVar, bVar2, (c.d) obj6);
                                            }
                                        });
                                    }
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    list2 = (List) ((dx.i.Right) iVar).b();
                                    ch1.k kVar = this.f166609p.getAvailableAppMenuItemsUC;
                                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                    this.f166601f = listN;
                                    this.f166602g = list2;
                                    this.f166600e = zBooleanValue;
                                    this.f166608n = 4;
                                    objA2 = kVar.a(c1792a4, this);
                                    if (objA2 != objE) {
                                        list3 = list2;
                                        obj4 = objA2;
                                        list4 = listN;
                                        right = (dx.i) obj4;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            List<ah1.a> list15 = (List) ((dx.i.Right) right).b();
                                            arrayList = new ArrayList(pq.v.y(list15, 10));
                                            for (ah1.a aVar2 : list15) {
                                                arrayList.add(new th1.a.SearchAppMenuItem(zg1.a.a(aVar2), aVar2));
                                            }
                                            right = new dx.i.Right(arrayList);
                                        }
                                        c0Var2 = this.f166610q;
                                        zVar2 = this.f166609p;
                                        if (right instanceof dx.i.Left) {
                                            final dx.b bVar3 = (dx.b) ((dx.i.Left) right).b();
                                            return c0Var2.d(new er.l() { // from class: qh1.d0
                                                @Override // er.l
                                                public final Object b(Object obj6) {
                                                    return z.g.a.b0(zVar2, bVar3, (c.d) obj6);
                                                }
                                            });
                                        }
                                        if (!(right instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        list5 = (List) ((dx.i.Right) right).b();
                                        h64.h hVar = this.f166609p.getGlobalSearchSectionsUC;
                                        gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                                        this.f166601f = list4;
                                        this.f166602g = list3;
                                        this.f166603h = list5;
                                        this.f166600e = zBooleanValue;
                                        this.f166608n = 5;
                                        objC2 = hVar.c(c1792a5, this);
                                        if (objC2 != objE) {
                                            obj5 = objC2;
                                            bESearchSections = (BESearchSections) obj5;
                                            p0Var = new fr.p0();
                                            p0Var.f66410a = pq.v.n();
                                            p0Var2 = new fr.p0();
                                            p0Var2.f66410a = pq.v.n();
                                            if (bESearchSections != null) {
                                                z zVar4 = this.f166609p;
                                                List<BESearchConfigSectionItem> listA = bESearchSections.a();
                                                this.f166601f = list4;
                                                this.f166602g = list3;
                                                this.f166603h = list5;
                                                this.f166604j = bESearchSections;
                                                this.f166605k = p0Var;
                                                this.f166606l = p0Var2;
                                                this.f166607m = p0Var;
                                                this.f166600e = zBooleanValue;
                                                this.f166608n = 6;
                                                objU9 = zVar4.U9(listA, list4, list3, this);
                                                if (objU9 != objE) {
                                                    list9 = list4;
                                                    p0Var5 = p0Var;
                                                    t15 = objU9;
                                                    list10 = list3;
                                                    p0Var6 = p0Var2;
                                                    list11 = list5;
                                                    p0Var7 = p0Var5;
                                                    p0Var7.f66410a = t15;
                                                    z zVar5 = this.f166609p;
                                                    List<BESearchConfigSectionItem> listB = bESearchSections.b();
                                                    this.f166601f = list9;
                                                    this.f166602g = list10;
                                                    this.f166603h = list11;
                                                    this.f166604j = vq.j.a(bESearchSections);
                                                    this.f166605k = p0Var5;
                                                    this.f166606l = p0Var6;
                                                    this.f166607m = p0Var6;
                                                    this.f166600e = zBooleanValue;
                                                    this.f166608n = 7;
                                                    objU10 = zVar5.U9(listB, list9, list10, this);
                                                    if (objU10 != objE) {
                                                        p0Var8 = p0Var6;
                                                        p0Var9 = p0Var8;
                                                        p0Var10 = p0Var5;
                                                        list12 = list11;
                                                        list13 = list10;
                                                        list14 = list9;
                                                        t16 = objU10;
                                                        p0Var8.f66410a = t16;
                                                        p0Var4 = p0Var9;
                                                        p0Var3 = p0Var10;
                                                        list6 = list12;
                                                        list7 = list13;
                                                        list8 = list14;
                                                    }
                                                }
                                            } else {
                                                p0Var3 = p0Var;
                                                list6 = list5;
                                                list7 = list3;
                                                list8 = list4;
                                                p0Var4 = p0Var2;
                                            }
                                            return this.f166610q.d(new er.l() { // from class: qh1.e0
                                                @Override // er.l
                                                public final Object b(Object obj6) {
                                                    return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj6);
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        }
                        obj = objC;
                        obj5 = objC2;
                        return objE;
                    case 1:
                        oq.u.b(obj);
                        obj2 = obj;
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (!zBooleanValue) {
                            k10.c0<qh1.c.d> c0Var4 = this.f166610q;
                            final z zVar6 = this.f166609p;
                            return c0Var4.d(new er.l() { // from class: qh1.b0
                                @Override // er.l
                                public final Object b(Object obj6) {
                                    return z.g.a.Z(zVar6, (c.d) obj6);
                                }
                            });
                        }
                        h64.r rVar2 = this.f166609p.loadServicesUseCase;
                        gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                        this.f166600e = zBooleanValue;
                        this.f166608n = 2;
                        objC = rVar2.c(c1792a6, this);
                        if (objC != objE) {
                            obj = objC;
                            list = (List) obj;
                            if (list != null) {
                                listN = new ArrayList();
                                while (r13.hasNext()) {
                                    cVarA = ji1.d.a(dashboardServiceEntry);
                                    dVarB = zg1.a.b(dashboardServiceEntry.getType());
                                    if (dVarB == null) {
                                        serviceItem = null;
                                    } else {
                                        serviceItem = new th1.a.ServiceItem(dVarB, dashboardServiceEntry, cVarA);
                                    }
                                    if (serviceItem != null) {
                                        listN.add(serviceItem);
                                    }
                                }
                            } else {
                                listN = pq.v.n();
                            }
                            dh1.a aVar3 = this.f166609p.getGlobalSearchVisibleDocumentsUC;
                            gz.b.a.C1792a c1792a7 = gz.b.a.C1792a.f78542a;
                            this.f166601f = listN;
                            this.f166600e = zBooleanValue;
                            this.f166608n = 3;
                            objA = aVar3.a(c1792a7, this);
                            obj3 = objA;
                            if (objA != objE) {
                                iVar = (dx.i) obj3;
                                c0Var = this.f166610q;
                                zVar = this.f166609p;
                                if (iVar instanceof dx.i.Left) {
                                    final dx.b bVar4 = (dx.b) ((dx.i.Left) iVar).b();
                                    return c0Var.d(new er.l() { // from class: qh1.c0
                                        @Override // er.l
                                        public final Object b(Object obj6) {
                                            return z.g.a.a0(zVar, bVar4, (c.d) obj6);
                                        }
                                    });
                                }
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                list2 = (List) ((dx.i.Right) iVar).b();
                                ch1.k kVar2 = this.f166609p.getAvailableAppMenuItemsUC;
                                gz.b.a.C1792a c1792a8 = gz.b.a.C1792a.f78542a;
                                this.f166601f = listN;
                                this.f166602g = list2;
                                this.f166600e = zBooleanValue;
                                this.f166608n = 4;
                                objA2 = kVar2.a(c1792a8, this);
                                if (objA2 != objE) {
                                    list3 = list2;
                                    obj4 = objA2;
                                    list4 = listN;
                                    right = (dx.i) obj4;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (!(right instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        List<ah1.a> list16 = (List) ((dx.i.Right) right).b();
                                        arrayList = new ArrayList(pq.v.y(list16, 10));
                                        while (r13.hasNext()) {
                                            arrayList.add(new th1.a.SearchAppMenuItem(zg1.a.a(aVar2), aVar2));
                                        }
                                        right = new dx.i.Right(arrayList);
                                    }
                                    c0Var2 = this.f166610q;
                                    zVar2 = this.f166609p;
                                    if (right instanceof dx.i.Left) {
                                        final dx.b bVar5 = (dx.b) ((dx.i.Left) right).b();
                                        return c0Var2.d(new er.l() { // from class: qh1.d0
                                            @Override // er.l
                                            public final Object b(Object obj6) {
                                                return z.g.a.b0(zVar2, bVar5, (c.d) obj6);
                                            }
                                        });
                                    }
                                    if (!(right instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    list5 = (List) ((dx.i.Right) right).b();
                                    h64.h hVar2 = this.f166609p.getGlobalSearchSectionsUC;
                                    gz.b.a.C1792a c1792a9 = gz.b.a.C1792a.f78542a;
                                    this.f166601f = list4;
                                    this.f166602g = list3;
                                    this.f166603h = list5;
                                    this.f166600e = zBooleanValue;
                                    this.f166608n = 5;
                                    objC2 = hVar2.c(c1792a9, this);
                                    if (objC2 != objE) {
                                        obj5 = objC2;
                                        bESearchSections = (BESearchSections) obj5;
                                        p0Var = new fr.p0();
                                        p0Var.f66410a = pq.v.n();
                                        p0Var2 = new fr.p0();
                                        p0Var2.f66410a = pq.v.n();
                                        if (bESearchSections != null) {
                                            z zVar7 = this.f166609p;
                                            List<BESearchConfigSectionItem> listA2 = bESearchSections.a();
                                            this.f166601f = list4;
                                            this.f166602g = list3;
                                            this.f166603h = list5;
                                            this.f166604j = bESearchSections;
                                            this.f166605k = p0Var;
                                            this.f166606l = p0Var2;
                                            this.f166607m = p0Var;
                                            this.f166600e = zBooleanValue;
                                            this.f166608n = 6;
                                            objU9 = zVar7.U9(listA2, list4, list3, this);
                                            if (objU9 != objE) {
                                                list9 = list4;
                                                p0Var5 = p0Var;
                                                t15 = objU9;
                                                list10 = list3;
                                                p0Var6 = p0Var2;
                                                list11 = list5;
                                                p0Var7 = p0Var5;
                                                p0Var7.f66410a = t15;
                                                z zVar8 = this.f166609p;
                                                List<BESearchConfigSectionItem> listB2 = bESearchSections.b();
                                                this.f166601f = list9;
                                                this.f166602g = list10;
                                                this.f166603h = list11;
                                                this.f166604j = vq.j.a(bESearchSections);
                                                this.f166605k = p0Var5;
                                                this.f166606l = p0Var6;
                                                this.f166607m = p0Var6;
                                                this.f166600e = zBooleanValue;
                                                this.f166608n = 7;
                                                objU10 = zVar8.U9(listB2, list9, list10, this);
                                                if (objU10 != objE) {
                                                    p0Var8 = p0Var6;
                                                    p0Var9 = p0Var8;
                                                    p0Var10 = p0Var5;
                                                    list12 = list11;
                                                    list13 = list10;
                                                    list14 = list9;
                                                    t16 = objU10;
                                                    p0Var8.f66410a = t16;
                                                    p0Var4 = p0Var9;
                                                    p0Var3 = p0Var10;
                                                    list6 = list12;
                                                    list7 = list13;
                                                    list8 = list14;
                                                }
                                            }
                                        } else {
                                            p0Var3 = p0Var;
                                            list6 = list5;
                                            list7 = list3;
                                            list8 = list4;
                                            p0Var4 = p0Var2;
                                        }
                                        return this.f166610q.d(new er.l() { // from class: qh1.e0
                                            @Override // er.l
                                            public final Object b(Object obj6) {
                                                return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj6);
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        obj = objC;
                        obj5 = objC2;
                        return objE;
                    case 2:
                        zBooleanValue = this.f166600e;
                        oq.u.b(obj);
                        Object obj6 = obj;
                        obj6 = objC;
                        list = (List) obj6;
                        if (list != null) {
                            listN = new ArrayList();
                            while (r13.hasNext()) {
                                cVarA = ji1.d.a(dashboardServiceEntry);
                                dVarB = zg1.a.b(dashboardServiceEntry.getType());
                                if (dVarB == null) {
                                    serviceItem = null;
                                } else {
                                    serviceItem = new th1.a.ServiceItem(dVarB, dashboardServiceEntry, cVarA);
                                }
                                if (serviceItem != null) {
                                    listN.add(serviceItem);
                                }
                            }
                        } else {
                            listN = pq.v.n();
                        }
                        dh1.a aVar4 = this.f166609p.getGlobalSearchVisibleDocumentsUC;
                        gz.b.a.C1792a c1792a10 = gz.b.a.C1792a.f78542a;
                        this.f166601f = listN;
                        this.f166600e = zBooleanValue;
                        this.f166608n = 3;
                        objA = aVar4.a(c1792a10, this);
                        obj3 = objA;
                        if (objA != objE) {
                            iVar = (dx.i) obj3;
                            c0Var = this.f166610q;
                            zVar = this.f166609p;
                            if (iVar instanceof dx.i.Left) {
                                final dx.b bVar6 = (dx.b) ((dx.i.Left) iVar).b();
                                return c0Var.d(new er.l() { // from class: qh1.c0
                                    @Override // er.l
                                    public final Object b(Object obj7) {
                                        return z.g.a.a0(zVar, bVar6, (c.d) obj7);
                                    }
                                });
                            }
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            list2 = (List) ((dx.i.Right) iVar).b();
                            ch1.k kVar3 = this.f166609p.getAvailableAppMenuItemsUC;
                            gz.b.a.C1792a c1792a11 = gz.b.a.C1792a.f78542a;
                            this.f166601f = listN;
                            this.f166602g = list2;
                            this.f166600e = zBooleanValue;
                            this.f166608n = 4;
                            objA2 = kVar3.a(c1792a11, this);
                            if (objA2 != objE) {
                                list3 = list2;
                                obj4 = objA2;
                                list4 = listN;
                                right = (dx.i) obj4;
                                if (!(right instanceof dx.i.Left)) {
                                    if (!(right instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    List<ah1.a> list17 = (List) ((dx.i.Right) right).b();
                                    arrayList = new ArrayList(pq.v.y(list17, 10));
                                    while (r13.hasNext()) {
                                        arrayList.add(new th1.a.SearchAppMenuItem(zg1.a.a(aVar2), aVar2));
                                    }
                                    right = new dx.i.Right(arrayList);
                                }
                                c0Var2 = this.f166610q;
                                zVar2 = this.f166609p;
                                if (right instanceof dx.i.Left) {
                                    final dx.b bVar7 = (dx.b) ((dx.i.Left) right).b();
                                    return c0Var2.d(new er.l() { // from class: qh1.d0
                                        @Override // er.l
                                        public final Object b(Object obj7) {
                                            return z.g.a.b0(zVar2, bVar7, (c.d) obj7);
                                        }
                                    });
                                }
                                if (!(right instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                list5 = (List) ((dx.i.Right) right).b();
                                h64.h hVar3 = this.f166609p.getGlobalSearchSectionsUC;
                                gz.b.a.C1792a c1792a12 = gz.b.a.C1792a.f78542a;
                                this.f166601f = list4;
                                this.f166602g = list3;
                                this.f166603h = list5;
                                this.f166600e = zBooleanValue;
                                this.f166608n = 5;
                                objC2 = hVar3.c(c1792a12, this);
                                if (objC2 != objE) {
                                    obj5 = objC2;
                                    bESearchSections = (BESearchSections) obj5;
                                    p0Var = new fr.p0();
                                    p0Var.f66410a = pq.v.n();
                                    p0Var2 = new fr.p0();
                                    p0Var2.f66410a = pq.v.n();
                                    if (bESearchSections != null) {
                                        z zVar9 = this.f166609p;
                                        List<BESearchConfigSectionItem> listA3 = bESearchSections.a();
                                        this.f166601f = list4;
                                        this.f166602g = list3;
                                        this.f166603h = list5;
                                        this.f166604j = bESearchSections;
                                        this.f166605k = p0Var;
                                        this.f166606l = p0Var2;
                                        this.f166607m = p0Var;
                                        this.f166600e = zBooleanValue;
                                        this.f166608n = 6;
                                        objU9 = zVar9.U9(listA3, list4, list3, this);
                                        if (objU9 != objE) {
                                            list9 = list4;
                                            p0Var5 = p0Var;
                                            t15 = objU9;
                                            list10 = list3;
                                            p0Var6 = p0Var2;
                                            list11 = list5;
                                            p0Var7 = p0Var5;
                                            p0Var7.f66410a = t15;
                                            z zVar10 = this.f166609p;
                                            List<BESearchConfigSectionItem> listB3 = bESearchSections.b();
                                            this.f166601f = list9;
                                            this.f166602g = list10;
                                            this.f166603h = list11;
                                            this.f166604j = vq.j.a(bESearchSections);
                                            this.f166605k = p0Var5;
                                            this.f166606l = p0Var6;
                                            this.f166607m = p0Var6;
                                            this.f166600e = zBooleanValue;
                                            this.f166608n = 7;
                                            objU10 = zVar10.U9(listB3, list9, list10, this);
                                            if (objU10 != objE) {
                                                p0Var8 = p0Var6;
                                                p0Var9 = p0Var8;
                                                p0Var10 = p0Var5;
                                                list12 = list11;
                                                list13 = list10;
                                                list14 = list9;
                                                t16 = objU10;
                                                p0Var8.f66410a = t16;
                                                p0Var4 = p0Var9;
                                                p0Var3 = p0Var10;
                                                list6 = list12;
                                                list7 = list13;
                                                list8 = list14;
                                            }
                                        }
                                    } else {
                                        p0Var3 = p0Var;
                                        list6 = list5;
                                        list7 = list3;
                                        list8 = list4;
                                        p0Var4 = p0Var2;
                                    }
                                    return this.f166610q.d(new er.l() { // from class: qh1.e0
                                        @Override // er.l
                                        public final Object b(Object obj7) {
                                            return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                                        }
                                    });
                                }
                            }
                        }
                        obj6 = objC;
                        obj5 = objC2;
                        return objE;
                    case 3:
                        zBooleanValue = this.f166600e;
                        listN = (List) this.f166601f;
                        oq.u.b(obj);
                        obj3 = obj;
                        iVar = (dx.i) obj3;
                        c0Var = this.f166610q;
                        zVar = this.f166609p;
                        if (iVar instanceof dx.i.Left) {
                            final dx.b bVar8 = (dx.b) ((dx.i.Left) iVar).b();
                            return c0Var.d(new er.l() { // from class: qh1.c0
                                @Override // er.l
                                public final Object b(Object obj7) {
                                    return z.g.a.a0(zVar, bVar8, (c.d) obj7);
                                }
                            });
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        list2 = (List) ((dx.i.Right) iVar).b();
                        ch1.k kVar4 = this.f166609p.getAvailableAppMenuItemsUC;
                        gz.b.a.C1792a c1792a13 = gz.b.a.C1792a.f78542a;
                        this.f166601f = listN;
                        this.f166602g = list2;
                        this.f166600e = zBooleanValue;
                        this.f166608n = 4;
                        objA2 = kVar4.a(c1792a13, this);
                        if (objA2 != objE) {
                            list3 = list2;
                            obj4 = objA2;
                            list4 = listN;
                            right = (dx.i) obj4;
                            if (!(right instanceof dx.i.Left)) {
                                if (!(right instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                List<ah1.a> list18 = (List) ((dx.i.Right) right).b();
                                arrayList = new ArrayList(pq.v.y(list18, 10));
                                while (r13.hasNext()) {
                                    arrayList.add(new th1.a.SearchAppMenuItem(zg1.a.a(aVar2), aVar2));
                                }
                                right = new dx.i.Right(arrayList);
                            }
                            c0Var2 = this.f166610q;
                            zVar2 = this.f166609p;
                            if (right instanceof dx.i.Left) {
                                final dx.b bVar9 = (dx.b) ((dx.i.Left) right).b();
                                return c0Var2.d(new er.l() { // from class: qh1.d0
                                    @Override // er.l
                                    public final Object b(Object obj7) {
                                        return z.g.a.b0(zVar2, bVar9, (c.d) obj7);
                                    }
                                });
                            }
                            if (!(right instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            list5 = (List) ((dx.i.Right) right).b();
                            h64.h hVar4 = this.f166609p.getGlobalSearchSectionsUC;
                            gz.b.a.C1792a c1792a14 = gz.b.a.C1792a.f78542a;
                            this.f166601f = list4;
                            this.f166602g = list3;
                            this.f166603h = list5;
                            this.f166600e = zBooleanValue;
                            this.f166608n = 5;
                            objC2 = hVar4.c(c1792a14, this);
                            if (objC2 != objE) {
                                obj5 = objC2;
                                bESearchSections = (BESearchSections) obj5;
                                p0Var = new fr.p0();
                                p0Var.f66410a = pq.v.n();
                                p0Var2 = new fr.p0();
                                p0Var2.f66410a = pq.v.n();
                                if (bESearchSections != null) {
                                    z zVar11 = this.f166609p;
                                    List<BESearchConfigSectionItem> listA4 = bESearchSections.a();
                                    this.f166601f = list4;
                                    this.f166602g = list3;
                                    this.f166603h = list5;
                                    this.f166604j = bESearchSections;
                                    this.f166605k = p0Var;
                                    this.f166606l = p0Var2;
                                    this.f166607m = p0Var;
                                    this.f166600e = zBooleanValue;
                                    this.f166608n = 6;
                                    objU9 = zVar11.U9(listA4, list4, list3, this);
                                    if (objU9 != objE) {
                                        list9 = list4;
                                        p0Var5 = p0Var;
                                        t15 = objU9;
                                        list10 = list3;
                                        p0Var6 = p0Var2;
                                        list11 = list5;
                                        p0Var7 = p0Var5;
                                        p0Var7.f66410a = t15;
                                        z zVar12 = this.f166609p;
                                        List<BESearchConfigSectionItem> listB4 = bESearchSections.b();
                                        this.f166601f = list9;
                                        this.f166602g = list10;
                                        this.f166603h = list11;
                                        this.f166604j = vq.j.a(bESearchSections);
                                        this.f166605k = p0Var5;
                                        this.f166606l = p0Var6;
                                        this.f166607m = p0Var6;
                                        this.f166600e = zBooleanValue;
                                        this.f166608n = 7;
                                        objU10 = zVar12.U9(listB4, list9, list10, this);
                                        if (objU10 != objE) {
                                            p0Var8 = p0Var6;
                                            p0Var9 = p0Var8;
                                            p0Var10 = p0Var5;
                                            list12 = list11;
                                            list13 = list10;
                                            list14 = list9;
                                            t16 = objU10;
                                            p0Var8.f66410a = t16;
                                            p0Var4 = p0Var9;
                                            p0Var3 = p0Var10;
                                            list6 = list12;
                                            list7 = list13;
                                            list8 = list14;
                                        }
                                    }
                                } else {
                                    p0Var3 = p0Var;
                                    list6 = list5;
                                    list7 = list3;
                                    list8 = list4;
                                    p0Var4 = p0Var2;
                                }
                                return this.f166610q.d(new er.l() { // from class: qh1.e0
                                    @Override // er.l
                                    public final Object b(Object obj7) {
                                        return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                                    }
                                });
                            }
                        }
                        obj6 = objC;
                        obj5 = objC2;
                        return objE;
                    case 4:
                        zBooleanValue = this.f166600e;
                        List list19 = (List) this.f166602g;
                        List list20 = (List) this.f166601f;
                        oq.u.b(obj);
                        list4 = list20;
                        list3 = list19;
                        obj4 = obj;
                        right = (dx.i) obj4;
                        if (!(right instanceof dx.i.Left)) {
                            if (!(right instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            List<ah1.a> list110 = (List) ((dx.i.Right) right).b();
                            arrayList = new ArrayList(pq.v.y(list110, 10));
                            while (r13.hasNext()) {
                                arrayList.add(new th1.a.SearchAppMenuItem(zg1.a.a(aVar2), aVar2));
                            }
                            right = new dx.i.Right(arrayList);
                        }
                        c0Var2 = this.f166610q;
                        zVar2 = this.f166609p;
                        if (right instanceof dx.i.Left) {
                            final dx.b bVar10 = (dx.b) ((dx.i.Left) right).b();
                            return c0Var2.d(new er.l() { // from class: qh1.d0
                                @Override // er.l
                                public final Object b(Object obj7) {
                                    return z.g.a.b0(zVar2, bVar10, (c.d) obj7);
                                }
                            });
                        }
                        if (!(right instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        list5 = (List) ((dx.i.Right) right).b();
                        h64.h hVar5 = this.f166609p.getGlobalSearchSectionsUC;
                        gz.b.a.C1792a c1792a15 = gz.b.a.C1792a.f78542a;
                        this.f166601f = list4;
                        this.f166602g = list3;
                        this.f166603h = list5;
                        this.f166600e = zBooleanValue;
                        this.f166608n = 5;
                        objC2 = hVar5.c(c1792a15, this);
                        if (objC2 != objE) {
                            obj5 = objC2;
                            bESearchSections = (BESearchSections) obj5;
                            p0Var = new fr.p0();
                            p0Var.f66410a = pq.v.n();
                            p0Var2 = new fr.p0();
                            p0Var2.f66410a = pq.v.n();
                            if (bESearchSections != null) {
                                z zVar13 = this.f166609p;
                                List<BESearchConfigSectionItem> listA5 = bESearchSections.a();
                                this.f166601f = list4;
                                this.f166602g = list3;
                                this.f166603h = list5;
                                this.f166604j = bESearchSections;
                                this.f166605k = p0Var;
                                this.f166606l = p0Var2;
                                this.f166607m = p0Var;
                                this.f166600e = zBooleanValue;
                                this.f166608n = 6;
                                objU9 = zVar13.U9(listA5, list4, list3, this);
                                if (objU9 != objE) {
                                    list9 = list4;
                                    p0Var5 = p0Var;
                                    t15 = objU9;
                                    list10 = list3;
                                    p0Var6 = p0Var2;
                                    list11 = list5;
                                    p0Var7 = p0Var5;
                                    p0Var7.f66410a = t15;
                                    z zVar14 = this.f166609p;
                                    List<BESearchConfigSectionItem> listB5 = bESearchSections.b();
                                    this.f166601f = list9;
                                    this.f166602g = list10;
                                    this.f166603h = list11;
                                    this.f166604j = vq.j.a(bESearchSections);
                                    this.f166605k = p0Var5;
                                    this.f166606l = p0Var6;
                                    this.f166607m = p0Var6;
                                    this.f166600e = zBooleanValue;
                                    this.f166608n = 7;
                                    objU10 = zVar14.U9(listB5, list9, list10, this);
                                    if (objU10 != objE) {
                                        p0Var8 = p0Var6;
                                        p0Var9 = p0Var8;
                                        p0Var10 = p0Var5;
                                        list12 = list11;
                                        list13 = list10;
                                        list14 = list9;
                                        t16 = objU10;
                                        p0Var8.f66410a = t16;
                                        p0Var4 = p0Var9;
                                        p0Var3 = p0Var10;
                                        list6 = list12;
                                        list7 = list13;
                                        list8 = list14;
                                    }
                                }
                            } else {
                                p0Var3 = p0Var;
                                list6 = list5;
                                list7 = list3;
                                list8 = list4;
                                p0Var4 = p0Var2;
                            }
                            return this.f166610q.d(new er.l() { // from class: qh1.e0
                                @Override // er.l
                                public final Object b(Object obj7) {
                                    return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                                }
                            });
                        }
                        obj6 = objC;
                        obj5 = objC2;
                        return objE;
                    case 5:
                        zBooleanValue = this.f166600e;
                        list5 = (List) this.f166603h;
                        list3 = (List) this.f166602g;
                        list4 = (List) this.f166601f;
                        oq.u.b(obj);
                        obj5 = obj;
                        obj5 = objC2;
                        bESearchSections = (BESearchSections) obj5;
                        p0Var = new fr.p0();
                        p0Var.f66410a = pq.v.n();
                        p0Var2 = new fr.p0();
                        p0Var2.f66410a = pq.v.n();
                        if (bESearchSections != null) {
                            z zVar15 = this.f166609p;
                            List<BESearchConfigSectionItem> listA6 = bESearchSections.a();
                            this.f166601f = list4;
                            this.f166602g = list3;
                            this.f166603h = list5;
                            this.f166604j = bESearchSections;
                            this.f166605k = p0Var;
                            this.f166606l = p0Var2;
                            this.f166607m = p0Var;
                            this.f166600e = zBooleanValue;
                            this.f166608n = 6;
                            objU9 = zVar15.U9(listA6, list4, list3, this);
                            if (objU9 != objE) {
                                list9 = list4;
                                p0Var5 = p0Var;
                                t15 = objU9;
                                list10 = list3;
                                p0Var6 = p0Var2;
                                list11 = list5;
                                p0Var7 = p0Var5;
                                p0Var7.f66410a = t15;
                                z zVar16 = this.f166609p;
                                List<BESearchConfigSectionItem> listB6 = bESearchSections.b();
                                this.f166601f = list9;
                                this.f166602g = list10;
                                this.f166603h = list11;
                                this.f166604j = vq.j.a(bESearchSections);
                                this.f166605k = p0Var5;
                                this.f166606l = p0Var6;
                                this.f166607m = p0Var6;
                                this.f166600e = zBooleanValue;
                                this.f166608n = 7;
                                objU10 = zVar16.U9(listB6, list9, list10, this);
                                if (objU10 != objE) {
                                    p0Var8 = p0Var6;
                                    p0Var9 = p0Var8;
                                    p0Var10 = p0Var5;
                                    list12 = list11;
                                    list13 = list10;
                                    list14 = list9;
                                    t16 = objU10;
                                    p0Var8.f66410a = t16;
                                    p0Var4 = p0Var9;
                                    p0Var3 = p0Var10;
                                    list6 = list12;
                                    list7 = list13;
                                    list8 = list14;
                                }
                            }
                            obj6 = objC;
                            obj5 = objC2;
                            return objE;
                        }
                        p0Var3 = p0Var;
                        list6 = list5;
                        list7 = list3;
                        list8 = list4;
                        p0Var4 = p0Var2;
                        return this.f166610q.d(new er.l() { // from class: qh1.e0
                            @Override // er.l
                            public final Object b(Object obj7) {
                                return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                            }
                        });
                    case 6:
                        zBooleanValue = this.f166600e;
                        p0Var7 = (fr.p0) this.f166607m;
                        p0Var6 = (fr.p0) this.f166606l;
                        p0Var5 = (fr.p0) this.f166605k;
                        bESearchSections = (BESearchSections) this.f166604j;
                        list11 = (List) this.f166603h;
                        list10 = (List) this.f166602g;
                        list9 = (List) this.f166601f;
                        oq.u.b(obj);
                        t15 = obj;
                        p0Var7.f66410a = t15;
                        z zVar17 = this.f166609p;
                        List<BESearchConfigSectionItem> listB7 = bESearchSections.b();
                        this.f166601f = list9;
                        this.f166602g = list10;
                        this.f166603h = list11;
                        this.f166604j = vq.j.a(bESearchSections);
                        this.f166605k = p0Var5;
                        this.f166606l = p0Var6;
                        this.f166607m = p0Var6;
                        this.f166600e = zBooleanValue;
                        this.f166608n = 7;
                        objU10 = zVar17.U9(listB7, list9, list10, this);
                        if (objU10 != objE) {
                            p0Var8 = p0Var6;
                            p0Var9 = p0Var8;
                            p0Var10 = p0Var5;
                            list12 = list11;
                            list13 = list10;
                            list14 = list9;
                            t16 = objU10;
                            p0Var8.f66410a = t16;
                            p0Var4 = p0Var9;
                            p0Var3 = p0Var10;
                            list6 = list12;
                            list7 = list13;
                            list8 = list14;
                            return this.f166610q.d(new er.l() { // from class: qh1.e0
                                @Override // er.l
                                public final Object b(Object obj7) {
                                    return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                                }
                            });
                        }
                        obj6 = objC;
                        obj5 = objC2;
                        return objE;
                    case 7:
                        p0Var8 = (fr.p0) this.f166607m;
                        p0Var9 = (fr.p0) this.f166606l;
                        p0Var10 = (fr.p0) this.f166605k;
                        list12 = (List) this.f166603h;
                        list13 = (List) this.f166602g;
                        list14 = (List) this.f166601f;
                        oq.u.b(obj);
                        t16 = obj;
                        p0Var8.f66410a = t16;
                        p0Var4 = p0Var9;
                        p0Var3 = p0Var10;
                        list6 = list12;
                        list7 = list13;
                        list8 = list14;
                        return this.f166610q.d(new er.l() { // from class: qh1.e0
                            @Override // er.l
                            public final Object b(Object obj7) {
                                return z.g.a.c0(list8, list7, list6, p0Var3, p0Var4, (c.d) obj7);
                            }
                        });
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public final tq.e<oq.i0> X(tq.e<?> eVar) {
                return new a(this.f166609p, this.f166610q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qh1.c>> eVar) {
                return ((a) X(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f166598f;
            Object objE = uq.b.e();
            int i15 = this.f166597e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUC;
            a aVar2 = new a(z.this, c0Var, null);
            this.f166598f = vq.j.a(c0Var);
            this.f166597e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<qh1.c.d> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f166598f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh1/a$h;", "action", "Lqh1/c$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqh1/a$h;Lqh1/c$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.h, qh1.c.LoadingError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166612f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.h hVar = (a.h) this.f166612f;
            Object objE = uq.b.e();
            int i15 = this.f166611e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.h> bVarY1 = z.this.Y1();
                this.f166612f = vq.j.a(hVar);
                this.f166611e = 1;
                if (bVarY1.F(hVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, qh1.c.LoadingError loadingError, tq.e<? super oq.i0> eVar) {
            h hVar2 = z.this.new h(eVar);
            hVar2.f166612f = hVar;
            return hVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqh1/a$b;", "<unused var>", "Lqh1/c$e;", "Loq/i0;", "<anonymous>", "(Lqh1/a$b;Lqh1/c$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.b, qh1.c.LoadingError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166614e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166614e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new a.h.GoToDocuments(null, 1, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, qh1.c.LoadingError loadingError, tq.e<? super oq.i0> eVar) {
            return z.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh1/a$d;", "action", "Lqh1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lqh1/a$d;Lqh1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.GoToAppMenuItem, qh1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166617f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.GoToAppMenuItem goToAppMenuItem = (a.GoToAppMenuItem) this.f166617f;
            Object objE = uq.b.e();
            int i15 = this.f166616e;
            if (i15 == 0) {
                oq.u.b(obj);
                ah1.a item = goToAppMenuItem.getItem();
                if (item instanceof ah1.a.b) {
                    z.this.d9(new a.h.GoToMore((ah1.a.b) goToAppMenuItem.getItem()));
                } else if (item instanceof ah1.a.EnumC0131a) {
                    z.this.d9(new a.h.GoToDocuments((ah1.a.EnumC0131a) goToAppMenuItem.getItem()));
                } else {
                    if (item != ah1.a.c.VERIFIER) {
                        throw new oq.p();
                    }
                    z zVar = z.this;
                    a.h.f fVar = a.h.f.f166461a;
                    this.f166617f = vq.j.a(goToAppMenuItem);
                    this.f166616e = 1;
                    if (zVar.F(fVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.GoToAppMenuItem goToAppMenuItem, qh1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f166617f = goToAppMenuItem;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lg64/b;", "list", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<List<? extends GlobalSearchEntry>, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166621g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(z zVar, List list, qh1.c.Initialized initialized) {
            return initialized.a(ContentData.b(initialized.getData(), null, false, false, null, null, null, null, null, null, zVar.V9(list, initialized.getData().k(), initialized.getData().d(), initialized.getData().c()), 511, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list = (List) this.f166620f;
            k10.c0 c0Var = (k10.c0) this.f166621g;
            uq.b.e();
            if (this.f166619e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.b(new er.l() { // from class: qh1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O(zVar, list, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<GlobalSearchEntry> list, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f166620f = list;
            kVar.f166621g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh1/a$h;", "action", "Lqh1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lqh1/a$h;Lqh1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.h, qh1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166625g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.h hVar = (a.h) this.f166624f;
            qh1.c.Initialized initialized = (qh1.c.Initialized) this.f166625g;
            Object objE = uq.b.e();
            int i15 = this.f166623e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(hVar, a.h.C4180a.f166456a) && initialized.getData().getSearchIsActive()) {
                    z.this.d9(new a.SetSearchActive(false));
                    return oq.i0.f148189a;
                }
                xw.b<a.h> bVarY1 = z.this.Y1();
                this.f166624f = vq.j.a(hVar);
                this.f166625g = vq.j.a(initialized);
                this.f166623e = 1;
                if (bVarY1.F(hVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, qh1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f166624f = hVar;
            lVar.f166625g = initialized;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$k;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.ShowDialog, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166629g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Dialog O(k10.c0 c0Var, z zVar, a.ShowDialog showDialog, qh1.c.Initialized initialized) {
            return new qh1.c.Dialog(((qh1.c.Initialized) c0Var.a()).getData(), zVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.ShowDialog showDialog = (a.ShowDialog) this.f166628f;
            final k10.c0 c0Var = (k10.c0) this.f166629g;
            uq.b.e();
            if (this.f166627e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.d(new er.l() { // from class: qh1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.m.O(c0Var, zVar, showDialog, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowDialog showDialog, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f166628f = showDialog;
            mVar.f166629g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$i;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.SetSearchActive, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166633g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(a.SetSearchActive setSearchActive, qh1.c.Initialized initialized) {
            return initialized.a(ContentData.b(initialized.getData(), setSearchActive.getIsActive() ? initialized.getData().getSearchQuery() : "", setSearchActive.getIsActive(), false, null, null, null, null, null, setSearchActive.getIsActive() ? initialized.getData().e() : pq.v.n(), null, 764, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetSearchActive setSearchActive = (a.SetSearchActive) this.f166632f;
            k10.c0 c0Var = (k10.c0) this.f166633g;
            uq.b.e();
            if (this.f166631e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qh1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O(setSearchActive, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetSearchActive setSearchActive, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f166632f = setSearchActive;
            nVar.f166633g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$j;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.SetSearchQuery, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166636g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(a.SetSearchQuery setSearchQuery, qh1.c.Initialized initialized) {
            return initialized.a(ContentData.b(initialized.getData(), setSearchQuery.getQuery(), false, !(setSearchQuery.getQuery().length() == 0), null, null, null, null, null, null, null, 1018, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SetSearchQuery setSearchQuery = (a.SetSearchQuery) this.f166635f;
            k10.c0 c0Var = (k10.c0) this.f166636g;
            uq.b.e();
            if (this.f166634e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new a.FindSearchTags(setSearchQuery.getQuery()));
            return c0Var.b(new er.l() { // from class: qh1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O(setSearchQuery, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SetSearchQuery setSearchQuery, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f166635f = setSearchQuery;
            oVar.f166636g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$c;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.FindSearchTags, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f166638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f166641h;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        
            if (r14 == r2) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v9, types: [T, g64.e] */
        /* JADX WARN: Type inference failed for: r7v0, types: [T, g64.e] */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f166640g
                qh1.a$c r0 = (qh1.a.FindSearchTags) r0
                java.lang.Object r1 = r13.f166641h
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r13.f166639f
                r4 = 2
                r5 = 1
                r6 = 3
                if (r3 == 0) goto L39
                if (r3 == r5) goto L31
                if (r3 == r4) goto L29
                if (r3 != r6) goto L21
                java.lang.Object r0 = r13.f166638e
                fr.p0 r0 = (fr.p0) r0
                oq.u.b(r14)
                return r14
            L21:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L29:
                java.lang.Object r3 = r13.f166638e
                fr.p0 r3 = (fr.p0) r3
                oq.u.b(r14)
                goto L8b
            L31:
                java.lang.Object r3 = r13.f166638e
                fr.p0 r3 = (fr.p0) r3
                oq.u.b(r14)
                goto L69
            L39:
                oq.u.b(r14)
                fr.p0 r14 = new fr.p0
                r14.<init>()
                g64.e r7 = new g64.e
                r11 = 7
                r12 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                r14.f66410a = r7
                java.lang.String r3 = r0.getQuery()
                int r3 = r3.length()
                if (r3 < r6) goto L92
                r13.f166640g = r0
                r13.f166641h = r1
                r13.f166638e = r14
                r13.f166639f = r5
                r7 = 200(0xc8, double:9.9E-322)
                java.lang.Object r3 = ju.z0.b(r7, r13)
                if (r3 != r2) goto L68
                goto Lb2
            L68:
                r3 = r14
            L69:
                qh1.z r14 = qh1.z.this
                h64.t r14 = qh1.z.E9(r14)
                h64.t$a r5 = new h64.t$a
                java.lang.String r7 = r0.getQuery()
                r5.<init>(r7)
                java.lang.Object r7 = vq.j.a(r0)
                r13.f166640g = r7
                r13.f166641h = r1
                r13.f166638e = r3
                r13.f166639f = r4
                java.lang.Object r14 = r14.c(r5, r13)
                if (r14 != r2) goto L8b
                goto Lb2
            L8b:
                g64.e r14 = (g64.GlobalSearchResult) r14
                if (r14 == 0) goto L91
                r3.f66410a = r14
            L91:
                r14 = r3
            L92:
                qh1.z r3 = qh1.z.this
                T r4 = r14.f66410a
                g64.e r4 = (g64.GlobalSearchResult) r4
                java.lang.Object r0 = vq.j.a(r0)
                r13.f166640g = r0
                java.lang.Object r0 = vq.j.a(r1)
                r13.f166641h = r0
                java.lang.Object r14 = vq.j.a(r14)
                r13.f166638e = r14
                r13.f166639f = r6
                java.lang.Object r14 = qh1.z.K9(r3, r1, r4, r13)
                if (r14 != r2) goto Lb3
            Lb2:
                return r2
            Lb3:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: qh1.z.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.FindSearchTags findSearchTags, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f166640g = findSearchTags;
            pVar.f166641h = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqh1/a$g;", "action", "Lqh1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lqh1/a$g;Lqh1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.HandleItemClick, qh1.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f166646h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<qh1.c.Initialized, qh1.c, a> f166647j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z f166648k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(k10.z<qh1.c.Initialized, qh1.c, a> zVar, z zVar2, tq.e<? super q> eVar) {
            super(3, eVar);
            this.f166647j = zVar;
            this.f166648k = zVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.HandleItemClick handleItemClick = (a.HandleItemClick) this.f166645g;
            qh1.c.Initialized initialized = (qh1.c.Initialized) this.f166646h;
            Object objE = uq.b.e();
            int i15 = this.f166644f;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = (!initialized.getData().getSearchIsActive() || initialized.getData().getSearchQuery().length() < 3) ? 0 : 1;
                th1.a searchItem = handleItemClick.getSearchItem();
                if (searchItem instanceof th1.a.ServiceItem) {
                    z zVar = this.f166648k;
                    if (((th1.a.ServiceItem) handleItemClick.getSearchItem()).getServiceTypeItem().getNavigationEvent() == null) {
                        return oq.i0.f148189a;
                    }
                    zVar.d9(new a.GoToService(((th1.a.ServiceItem) handleItemClick.getSearchItem()).getServiceTypeItem().getNavigationEvent(), ((th1.a.ServiceItem) handleItemClick.getSearchItem()).getDashboardServiceEntry().getType()));
                } else if (searchItem instanceof th1.a.DocumentItem) {
                    this.f166648k.d9(new a.GoToDocument(((th1.a.DocumentItem) handleItemClick.getSearchItem()).getDocumentConfig().getType()));
                } else {
                    if (!(searchItem instanceof th1.a.SearchAppMenuItem)) {
                        throw new oq.p();
                    }
                    this.f166648k.d9(new a.GoToAppMenuItem(((th1.a.SearchAppMenuItem) handleItemClick.getSearchItem()).getItem()));
                }
                if (i16 != 0) {
                    z zVar2 = this.f166648k;
                    th1.a searchItem2 = handleItemClick.getSearchItem();
                    this.f166645g = vq.j.a(handleItemClick);
                    this.f166646h = vq.j.a(initialized);
                    this.f166643e = i16;
                    this.f166644f = 1;
                    if (zVar2.X9(searchItem2, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.HandleItemClick handleItemClick, qh1.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            q qVar = new q(this.f166647j, this.f166648k, eVar);
            qVar.f166645g = handleItemClick;
            qVar.f166646h = initialized;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$f;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.GoToService, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166651g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.InitializedError O(z zVar, dx.b bVar, qh1.c.Initialized initialized) {
            return new qh1.c.InitializedError(initialized.getData(), zVar.errorVMSFactory.a(zVar.O9(bVar)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        
            if (r8 == r2) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f166650f
                qh1.a$f r0 = (qh1.a.GoToService) r0
                java.lang.Object r1 = r7.f166651g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f166649e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L26
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                oq.u.b(r8)
                goto L7e
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                oq.u.b(r8)
                goto L45
            L26:
                oq.u.b(r8)
                qh1.z r8 = qh1.z.this
                h64.j r8 = qh1.z.C9(r8)
                h64.j$a r3 = new h64.j$a
                rq0.c r6 = r0.getServiceType()
                r3.<init>(r6)
                r7.f166650f = r0
                r7.f166651g = r1
                r7.f166649e = r5
                java.lang.Object r8 = r8.c(r3, r7)
                if (r8 != r2) goto L45
                goto L7d
            L45:
                iq0.g0 r8 = (iq0.TemporaryInterruption) r8
                if (r8 == 0) goto L6b
                qh1.z r0 = qh1.z.this
                qh1.a$k r2 = new qh1.a$k
                sh1.g r3 = qh1.z.F9(r0)
                sh1.g$a r4 = new sh1.g$a
                qh1.a$a r5 = qh1.a.C4179a.f166448a
                er.a r5 = qh1.z.q9(r0, r5)
                r4.<init>(r8, r5)
                cb4.d r8 = r3.b(r4)
                r2.<init>(r8)
                qh1.z.r9(r0, r2)
                k10.l r8 = r1.c()
                return r8
            L6b:
                qh1.z r8 = qh1.z.this
                yg1.a r8 = qh1.z.u9(r8)
                r7.f166650f = r0
                r7.f166651g = r1
                r7.f166649e = r4
                java.lang.Object r8 = r8.d(r7)
                if (r8 != r2) goto L7e
            L7d:
                return r2
            L7e:
                dx.i r8 = (dx.i) r8
                qh1.z r2 = qh1.z.this
                boolean r3 = r8 instanceof dx.i.Left
                if (r3 == 0) goto L98
                dx.i$b r8 = (dx.i.Left) r8
                java.lang.Object r8 = r8.b()
                dx.b r8 = (dx.b) r8
                qh1.j0 r0 = new qh1.j0
                r0.<init>()
                k10.l r8 = r1.d(r0)
                return r8
            L98:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto Lb8
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                r8.getClass()
                qh1.a$h$d r8 = new qh1.a$h$d
                gx.b r0 = r0.getGlobalEvent()
                r8.<init>(r0)
                qh1.z.r9(r2, r8)
                k10.l r8 = r1.c()
                return r8
            Lb8:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: qh1.z.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.GoToService goToService, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            r rVar = z.this.new r(eVar);
            rVar.f166650f = goToService;
            rVar.f166651g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$e;", "action", "Lk10/c0;", "Lqh1/c$b;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<qh1.a.GoToDocument, k10.c0<qh1.c.Initialized>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f166653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f166655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f166656h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f166657j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166659a;

            static {
                int[] iArr = new int[lz3.h.values().length];
                try {
                    iArr[lz3.h.VALID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz3.h.REVOKED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f166659a = iArr;
            }
        }

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.InitializedError O(z zVar, dx.b bVar, qh1.c.Initialized initialized) {
            return new qh1.c.InitializedError(initialized.getData(), zVar.errorVMSFactory.a(zVar.O9(bVar)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        
            if (r9 == r2) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qh1.z.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qh1.a.GoToDocument goToDocument, k10.c0<qh1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            s sVar = z.this.new s(eVar);
            sVar.f166656h = goToDocument;
            sVar.f166657j = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$b;", "<unused var>", "Lk10/c0;", "Lqh1/c$c;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.b, k10.c0<qh1.c.InitializedError>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166661f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(k10.c0 c0Var, qh1.c.InitializedError initializedError) {
            return new qh1.c.Initialized(((qh1.c.InitializedError) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f166661f;
            uq.b.e();
            if (this.f166660e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qh1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.t.O(c0Var, (c.InitializedError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, k10.c0<qh1.c.InitializedError> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            t tVar = new t(eVar);
            tVar.f166661f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqh1/a$a;", "<unused var>", "Lk10/c0;", "Lqh1/c$a;", "state", "Lk10/l;", "Lqh1/c;", "<anonymous>", "(Lqh1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.C4179a, k10.c0<qh1.c.Dialog>, tq.e<? super k10.l<? extends qh1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166663f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qh1.c.Initialized O(k10.c0 c0Var, qh1.c.Dialog dialog) {
            return new qh1.c.Initialized(((qh1.c.Dialog) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f166663f;
            uq.b.e();
            if (this.f166662e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qh1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.u.O(c0Var, (c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C4179a c4179a, k10.c0<qh1.c.Dialog> c0Var, tq.e<? super k10.l<? extends qh1.c>> eVar) {
            u uVar = new u(eVar);
            uVar.f166663f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, sh1.f fVar, sh1.g gVar, h64.r rVar, h64.j jVar, ug1.c cVar, ch1.p pVar, dh1.a aVar2, h64.h hVar, h64.t tVar, h64.b bVar, ib4.c cVar2, hb4.d dVar, cb4.j jVar2, h64.s sVar, h64.v vVar, ac4.a aVar3, yg1.a aVar4, ch1.k kVar) {
        this.mapper = fVar;
        this.serviceInterruptionDialogMapper = gVar;
        this.loadServicesUseCase = rVar;
        this.getServiceTemporaryInterruptionUseCase = jVar;
        this.getDocumentNavigationUseCase = cVar;
        this.getDashboardSingleDocumentStatusUC = pVar;
        this.getGlobalSearchVisibleDocumentsUC = aVar2;
        this.getGlobalSearchSectionsUC = hVar;
        this.queryGlobalSearchUC = tVar;
        this.checkGlobalSearchTagsExistsUC = bVar;
        this.errorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar2;
        this.monitorGlobalSearchLastOpenedSearchEntriesUC = sVar;
        this.saveOpenedGlobalSearchEntryUC = vVar;
        this.callActionWithLoaderUC = aVar3;
        this.dashboardContainersInteractor = aVar4;
        this.getAvailableAppMenuItemsUC = kVar;
        qh1.c.d dVar2 = qh1.c.d.f166482a;
        this.initialState = dVar2;
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: qh1.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.Z9(this.f166543a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), Q9(dVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b O9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qh1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f166551a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(z zVar, ib4.c.b bVar) {
        zVar.d9(a.b.f166449a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qh1.d.a Q9(qh1.c cVar) {
        return this.mapper.b(new sh1.f.Params(cVar, b9(a.h.C4180a.f166456a), new er.l() { // from class: qh1.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9(this.f166545a, (th1.a) obj);
            }
        }, new er.l() { // from class: qh1.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.S9(this.f166546a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: qh1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(this.f166547a, (String) obj);
            }
        }, b9(new a.SetSearchQuery(""))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(z zVar, th1.a aVar) {
        zVar.d9(new a.HandleItemClick(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(z zVar, boolean z15) {
        zVar.d9(new a.SetSearchActive(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(z zVar, String str) {
        zVar.d9(new a.SetSearchQuery(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U9(List<BESearchConfigSectionItem> list, List<th1.a.ServiceItem> list2, List<th1.a.DocumentItem> list3, tq.e<? super List<? extends th1.a>> eVar) {
        return ju.i.g(g1.a(), new c(list, list2, list3, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<th1.a> V9(List<GlobalSearchEntry> list, List<th1.a.ServiceItem> list2, List<th1.a.DocumentItem> list3, List<th1.a.SearchAppMenuItem> list4) {
        Iterable iterable;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (GlobalSearchEntry globalSearchEntry : list) {
            int i15 = b.f166574a[globalSearchEntry.getMainType().ordinal()];
            if (i15 == 1) {
                iterable = list2;
            } else if (i15 == 2) {
                iterable = list3;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                iterable = list4;
            }
            Iterator it = iterable.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((th1.a) next).getGlobalSearchType() != globalSearchEntry.getType());
            th1.a aVar = (th1.a) next;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W9(k10.c0<qh1.c.Initialized> c0Var, GlobalSearchResult globalSearchResult, tq.e<? super k10.l<qh1.c.Initialized>> eVar) {
        return ju.i.g(g1.a(), new d(c0Var, globalSearchResult, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X9(th1.a aVar, tq.e<? super oq.i0> eVar) {
        Object objC = this.saveOpenedGlobalSearchEntryUC.c(new h64.v.Params(aVar.getMainType(), aVar.getGlobalSearchType()), eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(qh1.c.d.class), new er.l() { // from class: qh1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.aa(this.f166548a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qh1.c.LoadingError.class), new er.l() { // from class: qh1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.ba(this.f166549a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qh1.c.Initialized.class), new er.l() { // from class: qh1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.ca(this.f166550a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qh1.c.InitializedError.class), new er.l() { // from class: qh1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.da((k10.z) obj);
            }
        });
        vVar.c(q0.c(qh1.c.Dialog.class), new er.l() { // from class: qh1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.ea((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(z zVar, k10.z zVar2) {
        f fVar = zVar.new f(null);
        zVar2.x(q0.c(a.h.class), k10.o.CANCEL_PREVIOUS, fVar);
        zVar2.A(zVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(z zVar, k10.z zVar2) {
        h hVar = zVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(a.h.class), oVar, hVar);
        zVar2.x(q0.c(a.b.class), oVar, zVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(z zVar, k10.z zVar2) {
        k10.k.m(zVar2, (mu.g) zVar.monitorGlobalSearchLastOpenedSearchEntriesUC.a(gz.b.a.C1792a.f78542a), null, zVar.new k(null), 2, null);
        l lVar = zVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(a.h.class), oVar, lVar);
        zVar2.v(q0.c(a.ShowDialog.class), oVar, zVar.new m(null));
        zVar2.v(q0.c(a.SetSearchActive.class), oVar, new n(null));
        zVar2.v(q0.c(a.SetSearchQuery.class), oVar, zVar.new o(null));
        zVar2.v(q0.c(a.FindSearchTags.class), oVar, zVar.new p(null));
        zVar2.x(q0.c(a.HandleItemClick.class), oVar, new q(zVar2, zVar, null));
        zVar2.v(q0.c(a.GoToService.class), oVar, zVar.new r(null));
        zVar2.v(q0.c(a.GoToDocument.class), oVar, zVar.new s(null));
        zVar2.x(q0.c(a.GoToAppMenuItem.class), oVar, zVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(k10.z zVar) {
        t tVar = new t(null);
        zVar.v(q0.c(a.b.class), k10.o.CANCEL_PREVIOUS, tVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(k10.z zVar) {
        u uVar = new u(null);
        zVar.v(q0.c(a.C4179a.class), k10.o.CANCEL_PREVIOUS, uVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.h hVar, tq.e<? super oq.i0> eVar) {
        return super.F(hVar, eVar);
    }

    public void N9(gx.b globalEvent) {
        if (fr.t.c(globalEvent, tg1.a.c.f190067a)) {
            d9(new a.h.GoToDocuments(null, 1, null));
        }
    }

    @Override // zx.b
    public xw.b<a.h> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // l00.g
    protected k10.t<qh1.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<qh1.d.a> getState() {
        return this.state;
    }
}
