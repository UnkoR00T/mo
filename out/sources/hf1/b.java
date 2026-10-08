package hf1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import ff1.h;
import ff1.i;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhf1/b;", "Lxw/f;", "Lhf1/b$a;", "Lff1/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lhf1/b$a;)Lff1/i$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: hf1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006$"}, d2 = {"Lhf1/b$a;", "", "Lff1/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onFullStatementAction", "Lkotlin/Function1;", "", "onCheckboxChanged", "onNextAction", "onBackAction", "onCloseAction", "<init>", "(Lff1/h;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lff1/h;", "f", "()Lff1/h;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f84145g = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFullStatementAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCheckboxChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = hVar;
            this.onFullStatementAction = aVar;
            this.onCheckboxChanged = lVar;
            this.onNextAction = aVar2;
            this.onBackAction = aVar3;
            this.onCloseAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<Boolean, i0> b() {
            return this.onCheckboxChanged;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final er.a<i0> d() {
            return this.onFullStatementAction;
        }

        public final er.a<i0> e() {
            return this.onNextAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFullStatementAction, params.onFullStatementAction) && t.c(this.onCheckboxChanged, params.onCheckboxChanged) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onFullStatementAction.hashCode()) * 31) + this.onCheckboxChanged.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFullStatementAction=" + this.onFullStatementAction + ", onCheckboxChanged=" + this.onCheckboxChanged + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: hf1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1938b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1938b f84152a = new C1938b();

        C1938b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1391349303);
            if (p076m2.t.k()) {
                p076m2.t.o(1391349303, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.statement.mapper.StatementMapper.invoke.<anonymous> (StatementMapper.kt:66)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, boolean z15) {
        params.b().b(Boolean.valueOf(!((h.Initialized) params.getState()).getFormData().getStatementAccepted()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        r30.b error;
        h state = params.getState();
        if (state instanceof h.InfoPage) {
            return new i.a.InfoPage(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ha1.a.f82395f0), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.Z2), params.a());
        }
        if (!(state instanceof h.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, C1938b.f84152a, null, params.c(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82390e3);
        InfoRowListData infoRowListData = new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.f82366b3)), new t40.a.C4874a(this.labelProvider.c(ha1.a.f82374c3)), new t40.a.C4874a(this.labelProvider.c(ha1.a.f82382d3))));
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(ha1.a.f82358a3), null, null, params.d(), 13, null);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, ((h.Initialized) params.getState()).getFormData().getStatementAccepted(), new l() { // from class: hf1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, ((Boolean) obj).booleanValue());
            }
        }, this.labelProvider.c(ha1.a.Y2), null, null, null, null, 241, null);
        boolean z15 = ((h.Initialized) params.getState()).getFormData().getValidationState() instanceof hz.b.Invalid;
        if (z15) {
            error = new r30.b.Error(null, this.labelProvider.c(ha1.a.f82403g0), 1, null);
        } else {
            if (z15) {
                throw new oq.p();
            }
            error = r30.b.a.f171263a;
        }
        return new i.a.Initialized(baseScaffoldData, labelC, infoRowListData, buttonTextData, new CheckBoxSingleData(checkBoxRowData, error, null, false, null, 28, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), d.a.f107773a, null, params.e(), 35, null));
    }
}
