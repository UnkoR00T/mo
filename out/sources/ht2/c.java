package ht2;

import er.l;
import fr.t;
import gt2.e;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import ts0.RestrictionCheck;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lht2/c;", "Lxw/f;", "Lht2/c$a;", "Lgt2/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lit2/a;", "Ly30/n$b$b;", "l", "(Lit2/a;)Ly30/n$b$b;", "Lmx/a;", "h", "(Lit2/a;)Lmx/a;", "Lq40/g;", "Loq/i0;", "e", "(Lit2/a;)Lq40/g;", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "", "f", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Ljava/lang/String;", "c", "(Ljava/time/LocalDate;)Ljava/lang/String;", "params", "i", "(Lht2/c$a;)Lgt2/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ht2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lht2/c$a;", "", "Lgt2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "Lkotlin/Function1;", "Ly30/n$b$b;", "changedSelectedControllerItemAction", "navigateToFilterScreen", "Lts0/g;", "navigateToRestrictionCheckDetails", "<init>", "(Lgt2/d;Ler/a;Ler/l;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgt2/d;", "d", "()Lgt2/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "getNavigateToRestrictionCheckDetails", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gt2.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> changedSelectedControllerItemAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateToFilterScreen;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RestrictionCheck, i0> navigateToRestrictionCheckDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(gt2.d dVar, er.a<i0> aVar, l<? super n.Switch.EnumC5973b, i0> lVar, er.a<i0> aVar2, l<? super RestrictionCheck, i0> lVar2) {
            this.state = dVar;
            this.navigateBack = aVar;
            this.changedSelectedControllerItemAction = lVar;
            this.navigateToFilterScreen = aVar2;
            this.navigateToRestrictionCheckDetails = lVar2;
        }

        public final l<n.Switch.EnumC5973b, i0> a() {
            return this.changedSelectedControllerItemAction;
        }

        public final er.a<i0> b() {
            return this.navigateBack;
        }

        public final er.a<i0> c() {
            return this.navigateToFilterScreen;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final gt2.d getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.navigateBack, params.navigateBack) && t.c(this.changedSelectedControllerItemAction, params.changedSelectedControllerItemAction) && t.c(this.navigateToFilterScreen, params.navigateToFilterScreen) && t.c(this.navigateToRestrictionCheckDetails, params.navigateToRestrictionCheckDetails);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.navigateBack.hashCode()) * 31) + this.changedSelectedControllerItemAction.hashCode()) * 31) + this.navigateToFilterScreen.hashCode()) * 31) + this.navigateToRestrictionCheckDetails.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", navigateBack=" + this.navigateBack + ", changedSelectedControllerItemAction=" + this.changedSelectedControllerItemAction + ", navigateToFilterScreen=" + this.navigateToFilterScreen + ", navigateToRestrictionCheckDetails=" + this.navigateToRestrictionCheckDetails + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86643a;

        static {
            int[] iArr = new int[it2.a.values().length];
            try {
                iArr[it2.a.CHECKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[it2.a.STATUS_CHANGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86643a = iArr;
        }
    }

    public c(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String c(LocalDate localDate) {
        return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
    }

    private final IconPageData<i0, i0> e(it2.a aVar) {
        int i15;
        j.a aVar2 = new j.a(jz.a.f106754d2);
        mx.c cVar = this.labelProvider;
        int i16 = b.f86643a[aVar.ordinal()];
        if (i16 == 1) {
            i15 = rs2.a.f175889b0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = rs2.a.N;
        }
        return new IconPageData<>(aVar2, cVar.c(i15), null, null, null, null, false, 76, null);
    }

    private final String f(LocalDate filterDateFrom, LocalDate filterDateTo) {
        if (filterDateFrom == null || filterDateTo == null) {
            return this.labelProvider.c(rs2.a.E).getText();
        }
        return c(filterDateFrom) + " - " + c(filterDateTo);
    }

    private final Label h(it2.a aVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f86643a[aVar.ordinal()];
        if (i16 == 1) {
            i15 = rs2.a.f175891c0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = rs2.a.O;
        }
        return cVar.c(i15);
    }

    private final n.Switch.EnumC5973b l(it2.a aVar) {
        int i15 = b.f86643a[aVar.ordinal()];
        if (i15 == 1) {
            return n.Switch.EnumC5973b.LEFT;
        }
        if (i15 == 2) {
            return n.Switch.EnumC5973b.RIGHT;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        gt2.d state = params.getState();
        if (t.c(state, gt2.d.a.f76784a)) {
            return e.a.C1736a.f76792a;
        }
        if (!(state instanceof gt2.d.Initialized)) {
            throw new p();
        }
        gt2.d.Initialized initialized = (gt2.d.Initialized) params.getState();
        return new e.a.Initialized(new n.Switch(new n.Switch.TabItem(this.labelProvider.c(rs2.a.D), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(rs2.a.P), n.Switch.EnumC5973b.RIGHT), l(((gt2.d.Initialized) params.getState()).getPeselRestrictionHistoryControllerState()), true, params.a()), h(((gt2.d.Initialized) params.getState()).getPeselRestrictionHistoryControllerState()), new InputDateTimeData(null, this.labelProvider.c(rs2.a.F), f(initialized.getFilterDateFrom(), initialized.getFilterDateTo()), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, params.c(), 1009, null), e(((gt2.d.Initialized) params.getState()).getPeselRestrictionHistoryControllerState()), (((gt2.d.Initialized) params.getState()).getFilterDateFrom() == null || ((gt2.d.Initialized) params.getState()).getFilterDateTo() == null) ? false : true, new EmptyStateData(this.labelProvider.c(rs2.a.f175887a0), this.labelProvider.c(rs2.a.Z), null, 4, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(rs2.a.f175898g), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
