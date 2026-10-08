package wa0;

import f30.BottomNavigationData;
import f30.BottomNavigationItem;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import va0.c;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwa0/a;", "Lxw/f;", "Lwa0/a$a;", "Lva0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lwa0/a$a;)Lva0/c$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: wa0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lwa0/a$a;", "", "Lva0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onMainTabClick", "onSchoolTabClick", "onSettingsTabClick", "<init>", "(Lva0/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lva0/b;", "e", "()Lva0/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final va0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMainTabClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSchoolTabClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSettingsTabClick;

        public Params(va0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onMainTabClick = aVar2;
            this.onSchoolTabClick = aVar3;
            this.onSettingsTabClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onMainTabClick;
        }

        public final er.a<i0> c() {
            return this.onSchoolTabClick;
        }

        public final er.a<i0> d() {
            return this.onSettingsTabClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final va0.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onMainTabClick, params.onMainTabClick) && t.c(this.onSchoolTabClick, params.onSchoolTabClick) && t.c(this.onSettingsTabClick, params.onSettingsTabClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onMainTabClick.hashCode()) * 31) + this.onSchoolTabClick.hashCode()) * 31) + this.onSettingsTabClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onMainTabClick=" + this.onMainTabClick + ", onSchoolTabClick=" + this.onSchoolTabClick + ", onSettingsTabClick=" + this.onSettingsTabClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211553a;

        static {
            int[] iArr = new int[ma0.a.values().length];
            try {
                iArr[ma0.a.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ma0.a.SCHOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ma0.a.SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f211553a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        va0.b state = params.getState();
        if (!(state instanceof va0.b.DashboardDisplayed)) {
            throw new p();
        }
        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem(null, this.labelProvider.c(ia0.a.f90634n), jz.a.R, jz.a.f106869t1, params.b(), 1, null);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem(null, this.labelProvider.c(ia0.a.f90652w), jz.a.K4, jz.a.L4, params.c(), 1, null);
        va0.b.DashboardDisplayed dashboardDisplayed = (va0.b.DashboardDisplayed) state;
        if (!dashboardDisplayed.getIsSchoolTabEnabled()) {
            bottomNavigationItem2 = null;
        }
        List listS = v.s(bottomNavigationItem, bottomNavigationItem2, new BottomNavigationItem(null, this.labelProvider.c(ia0.a.f90630l), jz.a.T, jz.a.G1, params.d(), 1, null));
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        int i15 = b.f211553a[dashboardDisplayed.getCurrentVisibleTab().ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            if (i15 != 3) {
                throw new p();
            }
            if (dashboardDisplayed.getIsSchoolTabEnabled()) {
                i16 = 2;
            }
        } else if (!dashboardDisplayed.getIsSchoolTabEnabled()) {
            i16 = -1;
        }
        return new c.a.MainData(baseScaffoldData, new BottomNavigationData(listS, i16), params.a());
    }
}
