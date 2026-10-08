package vh1;

import f30.BottomNavigationData;
import f30.BottomNavigationItem;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvh1/h;", "Lxw/f;", "Lvh1/h$a;", "Luh1/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "showGlobalSearch", "", "Lf30/b;", "q", "(Lvh1/h$a;Z)Ljava/util/List;", "z", "(Lvh1/h$a;)Ljava/util/List;", "G", "(Lvh1/h$a;)Luh1/j$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, uh1.j.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vh1.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lvh1/h$a;", "", "Luh1/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDocumentsButtonClick", "onServicesButtonClick", "onScannerButtonClick", "onGlobalSearchButtonClick", "onMoreButtonClick", "<init>", "(Luh1/i;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luh1/i;", "f", "()Luh1/i;", "b", "Ler/a;", "()Ler/a;", "c", "e", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final uh1.i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDocumentsButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onServicesButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScannerButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGlobalSearchButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreButtonClick;

        public Params(uh1.i iVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = iVar;
            this.onDocumentsButtonClick = aVar;
            this.onServicesButtonClick = aVar2;
            this.onScannerButtonClick = aVar3;
            this.onGlobalSearchButtonClick = aVar4;
            this.onMoreButtonClick = aVar5;
        }

        public final er.a<i0> a() {
            return this.onDocumentsButtonClick;
        }

        public final er.a<i0> b() {
            return this.onGlobalSearchButtonClick;
        }

        public final er.a<i0> c() {
            return this.onMoreButtonClick;
        }

        public final er.a<i0> d() {
            return this.onScannerButtonClick;
        }

        public final er.a<i0> e() {
            return this.onServicesButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onDocumentsButtonClick, params.onDocumentsButtonClick) && t.c(this.onServicesButtonClick, params.onServicesButtonClick) && t.c(this.onScannerButtonClick, params.onScannerButtonClick) && t.c(this.onGlobalSearchButtonClick, params.onGlobalSearchButtonClick) && t.c(this.onMoreButtonClick, params.onMoreButtonClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final uh1.i getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onDocumentsButtonClick.hashCode()) * 31) + this.onServicesButtonClick.hashCode()) * 31) + this.onScannerButtonClick.hashCode()) * 31) + this.onGlobalSearchButtonClick.hashCode()) * 31) + this.onMoreButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDocumentsButtonClick=" + this.onDocumentsButtonClick + ", onServicesButtonClick=" + this.onServicesButtonClick + ", onScannerButtonClick=" + this.onScannerButtonClick + ", onGlobalSearchButtonClick=" + this.onGlobalSearchButtonClick + ", onMoreButtonClick=" + this.onMoreButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206871a;

        static {
            int[] iArr = new int[uh1.g.values().length];
            try {
                iArr[uh1.g.DOCUMENT_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uh1.g.DOCUMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uh1.g.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uh1.g.SCANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uh1.g.GLOBAL_SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uh1.g.MORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f206871a = iArr;
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    private final List<BottomNavigationItem> q(final Params params, boolean showGlobalSearch) {
        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem(null, this.labelProvider.c(sg1.a.R), jz.a.A4, jz.a.F4, new er.a() { // from class: vh1.a
            @Override // er.a
            public final Object a() {
                return h.r(params);
            }
        }, 1, null);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem(null, this.labelProvider.c(sg1.a.U), jz.a.B4, jz.a.G4, new er.a() { // from class: vh1.b
            @Override // er.a
            public final Object a() {
                return h.s(params);
            }
        }, 1, null);
        mx.c cVar = this.labelProvider;
        ah1.a.c cVar2 = ah1.a.c.VERIFIER;
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem(null, cVar.c(cVar2.getTitle()), cVar2.getIcon(), jz.a.I4, new er.a() { // from class: vh1.c
            @Override // er.a
            public final Object a() {
                return h.u(params);
            }
        }, 1, null);
        BottomNavigationItem bottomNavigationItem4 = new BottomNavigationItem(null, this.labelProvider.c(sg1.a.M).n("DashboardBottomNavigationMenuSearchLabel"), jz.a.C4, jz.a.H4, new er.a() { // from class: vh1.d
            @Override // er.a
            public final Object a() {
                return h.v(params);
            }
        }, 1, null);
        if (!showGlobalSearch) {
            bottomNavigationItem4 = null;
        }
        return v.s(bottomNavigationItem, bottomNavigationItem2, bottomNavigationItem3, bottomNavigationItem4, new BottomNavigationItem(null, this.labelProvider.c(sg1.a.S), jz.a.E4, jz.a.J4, new er.a() { // from class: vh1.e
            @Override // er.a
            public final Object a() {
                return h.x(params);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    private final List<BottomNavigationItem> z(final Params params) {
        return v.q(new BottomNavigationItem(null, this.labelProvider.c(sg1.a.R), jz.a.A4, jz.a.F4, new er.a() { // from class: vh1.f
            @Override // er.a
            public final Object a() {
                return h.E(params);
            }
        }, 1, null), new BottomNavigationItem(null, this.labelProvider.c(sg1.a.S), jz.a.E4, jz.a.J4, new er.a() { // from class: vh1.g
            @Override // er.a
            public final Object a() {
                return h.F(params);
            }
        }, 1, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0163  */
    /* JADX WARN: Code duplicated, block: B:108:0x0167  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    @Override // er.l
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public uh1.j.Data b(Params params) {
        boolean z15;
        List<BottomNavigationItem> listN;
        uh1.i state = params.getState();
        uh1.i.Initialized initialized = state instanceof uh1.i.Initialized ? (uh1.i.Initialized) state : null;
        int i15 = 0;
        boolean isGlobalSearchTabEnabled = initialized != null ? initialized.getIsGlobalSearchTabEnabled() : false;
        uh1.i state2 = params.getState();
        uh1.i.Initialized initialized2 = state2 instanceof uh1.i.Initialized ? (uh1.i.Initialized) state2 : null;
        if (initialized2 == null || !initialized2.getIsImeVisible()) {
            uh1.i state3 = params.getState();
            uh1.i.InitializedWithoutDocuments initializedWithoutDocuments = state3 instanceof uh1.i.InitializedWithoutDocuments ? (uh1.i.InitializedWithoutDocuments) state3 : null;
            if (initializedWithoutDocuments == null || !initializedWithoutDocuments.getIsImeVisible()) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = true;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        uh1.i state4 = params.getState();
        uh1.i.h hVar = uh1.i.h.f198429a;
        if (t.c(state4, hVar) || t.c(state4, uh1.i.a.f198422a) || (state4 instanceof uh1.i.CheckAndRegisterDeviceToNotifications) || t.c(state4, uh1.i.d.f198425a) || t.c(state4, uh1.i.e.f198426a) || (state4 instanceof uh1.i.GetExpiredIdentityType) || t.c(state4, uh1.i.b.f198423a) || t.c(state4, uh1.i.k.f198435a) || t.c(state4, uh1.i.l.f198436a) || (state4 instanceof uh1.i.LoadRemoteSettingsError) || t.c(state4, uh1.i.n.f198438a) || t.c(state4, uh1.i.q.f198442a) || (state4 instanceof uh1.i.MigrateOldUserServicesToFavouritesAndInitialize) || (state4 instanceof uh1.i.MigrateToNewLocalNotifications) || t.c(state4, uh1.i.f.f198427a)) {
            listN = v.n();
        } else if (state4 instanceof uh1.i.Initialized) {
            listN = q(params, isGlobalSearchTabEnabled);
        } else {
            if (!(state4 instanceof uh1.i.InitializedWithoutDocuments)) {
                throw new p();
            }
            listN = z(params);
        }
        uh1.i state5 = params.getState();
        if (!t.c(state5, hVar) && !t.c(state5, uh1.i.a.f198422a) && !(state5 instanceof uh1.i.CheckAndRegisterDeviceToNotifications) && !t.c(state5, uh1.i.d.f198425a) && !t.c(state5, uh1.i.e.f198426a) && !(state5 instanceof uh1.i.GetExpiredIdentityType) && !t.c(state5, uh1.i.b.f198423a) && !t.c(state5, uh1.i.k.f198435a) && !t.c(state5, uh1.i.l.f198436a) && !(state5 instanceof uh1.i.LoadRemoteSettingsError) && !t.c(state5, uh1.i.n.f198438a) && !(state5 instanceof uh1.i.MigrateOldUserServicesToFavouritesAndInitialize) && !(state5 instanceof uh1.i.MigrateToNewLocalNotifications) && !t.c(state5, uh1.i.q.f198442a) && !t.c(state5, uh1.i.f.f198427a)) {
            if (state5 instanceof uh1.i.Initialized) {
                switch (b.f206871a[((uh1.i.Initialized) params.getState()).getSelectedTab().ordinal()]) {
                    case 1:
                    case 2:
                        break;
                    case 3:
                        i15 = 1;
                        break;
                    case 4:
                        i15 = 2;
                        break;
                    case 5:
                        i15 = 3;
                        break;
                    case 6:
                        if (!isGlobalSearchTabEnabled) {
                            i15 = 3;
                        } else {
                            i15 = 4;
                        }
                        break;
                    default:
                        throw new p();
                }
            } else {
                if (!(state5 instanceof uh1.i.InitializedWithoutDocuments)) {
                    throw new p();
                }
                int i16 = b.f206871a[((uh1.i.InitializedWithoutDocuments) params.getState()).getSelectedTab().ordinal()];
                if (i16 != 1 && i16 != 2 && i16 == 6) {
                    i15 = 1;
                }
            }
        }
        return new uh1.j.Data(baseScaffoldData, new BottomNavigationData(listN, i15), z15);
    }
}
