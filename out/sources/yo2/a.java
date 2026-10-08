package yo2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xo2.State;
import xo2.h;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyo2/a;", "Lxw/f;", "Lyo2/a$a;", "Lxo2/h$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "c", "(Lyo2/a$a;)Lxo2/h$a;", "a", "Lmx/c;", "b", "Lu04/a;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: yo2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001f\u0010\"R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lyo2/a$a;", "", "Lxo2/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "onNextButtonClicked", "Lkotlin/Function1;", "", "onRegulationsSwitchChanged", "onPrivacyPolicySwitchChanged", "", "openUrlAction", "<init>", "(Lxo2/g;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxo2/g;", "f", "()Lxo2/g;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f228342g = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onRegulationsSwitchChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onPrivacyPolicySwitchChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super Boolean, i0> lVar, l<? super Boolean, i0> lVar2, l<? super String, i0> lVar3) {
            this.state = state;
            this.onBackPressed = aVar;
            this.onNextButtonClicked = aVar2;
            this.onRegulationsSwitchChanged = lVar;
            this.onPrivacyPolicySwitchChanged = lVar2;
            this.openUrlAction = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClicked;
        }

        public final l<Boolean, i0> c() {
            return this.onPrivacyPolicySwitchChanged;
        }

        public final l<Boolean, i0> d() {
            return this.onRegulationsSwitchChanged;
        }

        public final l<String, i0> e() {
            return this.openUrlAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onNextButtonClicked, params.onNextButtonClicked) && t.c(this.onRegulationsSwitchChanged, params.onRegulationsSwitchChanged) && t.c(this.onPrivacyPolicySwitchChanged, params.onPrivacyPolicySwitchChanged) && t.c(this.openUrlAction, params.openUrlAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackPressed.hashCode()) * 31) + this.onNextButtonClicked.hashCode()) * 31) + this.onRegulationsSwitchChanged.hashCode()) * 31) + this.onPrivacyPolicySwitchChanged.hashCode()) * 31) + this.openUrlAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackPressed=" + this.onBackPressed + ", onNextButtonClicked=" + this.onNextButtonClicked + ", onRegulationsSwitchChanged=" + this.onRegulationsSwitchChanged + ", onPrivacyPolicySwitchChanged=" + this.onPrivacyPolicySwitchChanged + ", openUrlAction=" + this.openUrlAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f228349a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-400419597);
            if (p076m2.t.k()) {
                p076m2.t.o(-400419597, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.regulations.mapper.RegulationsScreenMapper.invoke.<anonymous>.<anonymous> (RegulationsScreenMapper.kt:49)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f228350a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(372622354);
            if (p076m2.t.k()) {
                p076m2.t.o(372622354, i15, -1, "pl.gov.coi.mobywatel.feature.onboarding.presentation.screen.regulations.mapper.RegulationsScreenMapper.invoke.<anonymous>.<anonymous> (RegulationsScreenMapper.kt:50)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public a(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, cVar.c(oo2.b.f147869z), null, 45, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.M0, b.f228349a, c.f228350a, cVar.c(oo2.b.f147869z), cVar.c(oo2.b.f147868y), null, 32, null);
        boolean regulationsSwitchChecked = params.getState().getRegulationsSwitchChecked();
        hz.b regulationsSwitchValidationState = params.getState().getRegulationsSwitchValidationState();
        if (!params.getState().getShowValidation()) {
            regulationsSwitchValidationState = yo2.b.b(regulationsSwitchValidationState);
        }
        hz.b bVar = regulationsSwitchValidationState;
        Label labelC = cVar.c(oo2.b.R);
        Label labelC2 = cVar.c(oo2.b.f147867x);
        String strT = this.commonEndpoints.T();
        l<String, i0> lVarE = params.e();
        LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
        s50.a.b bVar2 = new s50.a.b("regulationInput", regulationsSwitchChecked, labelC, bVar, false, null, params.d(), null, new s50.b.Link(new LinkData(null, labelC2, strT, enumC5775a, false, lVarE, 17, null)), cVar.c(oo2.b.f147844a), 176, null);
        boolean privacyPolicySwitchChecked = params.getState().getPrivacyPolicySwitchChecked();
        hz.b privacyPolicyValidationState = params.getState().getPrivacyPolicyValidationState();
        if (!params.getState().getShowValidation()) {
            privacyPolicyValidationState = yo2.b.b(privacyPolicyValidationState);
        }
        hz.b bVar3 = privacyPolicyValidationState;
        s50.a.b bVar4 = new s50.a.b("privacyPolicyInput", privacyPolicySwitchChecked, cVar.c(oo2.b.Q), bVar3, false, null, params.c(), null, new s50.b.Link(new LinkData(null, cVar.c(oo2.b.f147866w), this.commonEndpoints.p0(), enumC5775a, false, params.e(), 17, null)), cVar.c(oo2.b.f147845b), 176, null);
        d.a aVar = d.a.f107773a;
        return new h.Data(baseScaffoldData, icon, bVar2, bVar4, new ButtonData(null, null, new k30.a.Large(true), new k30.c.WithText(cVar.c(oo2.b.f147855l), null, 2, null), aVar, null, params.b(), 35, null), params.a());
    }
}
