package y03;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.Locale;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x03.State;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ly03/d;", "Lxw/f;", "Ly03/d$a;", "Lx03/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ly03/d$a;)Lx03/d$a;", "a", "Lmx/c;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, x03.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: y03.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b&\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b#\u0010\"¨\u0006("}, d2 = {"Ly03/d$a;", "", "Lx03/c;", "state", "", "isFeatureFlagEnabled", "Lkotlin/Function0;", "Loq/i0;", "onTopBarIconMainClick", "Lkotlin/Function1;", "Luv0/d;", "inputValueChangeAction", "scanPlateAction", "verifyAction", "<init>", "(Lx03/c;ZLer/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lx03/c;", "c", "()Lx03/c;", "b", "Z", "e", "()Z", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "getScanPlateAction", "f", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFeatureFlagEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopBarIconMainClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<uv0.d, i0> inputValueChangeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> scanPlateAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> verifyAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, boolean z15, er.a<i0> aVar, l<? super uv0.d, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.isFeatureFlagEnabled = z15;
            this.onTopBarIconMainClick = aVar;
            this.inputValueChangeAction = lVar;
            this.scanPlateAction = aVar2;
            this.verifyAction = aVar3;
        }

        public final l<uv0.d, i0> a() {
            return this.inputValueChangeAction;
        }

        public final er.a<i0> b() {
            return this.onTopBarIconMainClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.verifyAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsFeatureFlagEnabled() {
            return this.isFeatureFlagEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.isFeatureFlagEnabled == params.isFeatureFlagEnabled && t.c(this.onTopBarIconMainClick, params.onTopBarIconMainClick) && t.c(this.inputValueChangeAction, params.inputValueChangeAction) && t.c(this.scanPlateAction, params.scanPlateAction) && t.c(this.verifyAction, params.verifyAction);
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + Boolean.hashCode(this.isFeatureFlagEnabled)) * 31) + this.onTopBarIconMainClick.hashCode()) * 31) + this.inputValueChangeAction.hashCode()) * 31) + this.scanPlateAction.hashCode()) * 31) + this.verifyAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", isFeatureFlagEnabled=" + this.isFeatureFlagEnabled + ", onTopBarIconMainClick=" + this.onTopBarIconMainClick + ", inputValueChangeAction=" + this.inputValueChangeAction + ", scanPlateAction=" + this.scanPlateAction + ", verifyAction=" + this.verifyAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223028a;

        static {
            int[] iArr = new int[m03.a.values().length];
            try {
                iArr[m03.a.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m03.a.INCORRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m03.a.CORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f223028a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f223029a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(859914938);
            if (p076m2.t.k()) {
                p076m2.t.o(859914938, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.plate.mapper.SafeBusPlateScreenMapper.invoke.<anonymous> (SafeBusPlateScreenMapper.kt:47)");
            }
            long jA = ((s03.a) rVar.N(s03.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, String str) {
        params.a().b(uv0.d.b(uv0.d.c(str.toUpperCase(Locale.ROOT))));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x03.d.Data b(final Params params) {
        hz.b invalid;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(k03.a.M), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.O3, null, c.f223029a, this.labelProvider.c(k03.a.I), this.labelProvider.c(k03.a.H), null, 34, null);
        Label labelC = this.labelProvider.c(k03.a.G);
        Label labelC2 = this.labelProvider.c(params.getIsFeatureFlagEnabled() ? k03.a.F : k03.a.E);
        Label labelB = mx.b.b(params.getState().getPlate(), "plateValue");
        int i15 = b.f223028a[params.getState().getPlateCorrectness().ordinal()];
        if (i15 == 1) {
            invalid = new hz.b.Invalid(this.labelProvider.c(k03.a.f107198c));
        } else if (i15 == 2) {
            invalid = new hz.b.Invalid(this.labelProvider.c(k03.a.D));
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            invalid = hz.b.d.f86848c;
        }
        return new x03.d.Data(baseScaffoldData, icon, new v50.c.Text(null, labelC, labelC2, labelB, invalid, null, null, new l() { // from class: y03.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048417, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(k03.a.C), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
