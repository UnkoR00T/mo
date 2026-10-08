package tf2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import sf2.d;
import sf2.e;
import uf2.OperatorItem;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltf2/b;", "Lxw/f;", "Ltf2/b$a;", "Lsf2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ltf2/b$a;)Lsf2/e$a;", "a", "Lmx/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: tf2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001a\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006'"}, d2 = {"Ltf2/b$a;", "", "Lsf2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onCloseWithDialogAction", "onNextAction", "onBackAction", "Lkotlin/Function1;", "Luf2/a;", "onSelectedChange", "onChangeStateSelectAll", "<init>", "(Lsf2/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsf2/d;", "g", "()Lsf2/d;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "f", "Ler/l;", "()Ler/l;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<OperatorItem, i0> onSelectedChange;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeStateSelectAll;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super OperatorItem, i0> lVar, er.a<i0> aVar5) {
            this.state = dVar;
            this.onCloseAction = aVar;
            this.onCloseWithDialogAction = aVar2;
            this.onNextAction = aVar3;
            this.onBackAction = aVar4;
            this.onSelectedChange = lVar;
            this.onChangeStateSelectAll = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onChangeStateSelectAll;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final er.a<i0> d() {
            return this.onCloseWithDialogAction;
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onSelectedChange, params.onSelectedChange) && t.c(this.onChangeStateSelectAll, params.onChangeStateSelectAll);
        }

        public final l<OperatorItem, i0> f() {
            return this.onSelectedChange;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onSelectedChange.hashCode()) * 31) + this.onChangeStateSelectAll.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onSelectedChange=" + this.onSelectedChange + ", onChangeStateSelectAll=" + this.onChangeStateSelectAll + ')';
        }
    }

    /* JADX INFO: renamed from: tf2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4951b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4951b f190052a = new C4951b();

        C4951b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-981351829);
            if (p076m2.t.k()) {
                p076m2.t.o(-981351829, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.serviceproviders.mapper.ServiceProvidersMapper.invoke.<anonymous> (ServiceProvidersMapper.kt:60)");
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
    public static final i0 f(Params params, OperatorItem operatorItem) {
        params.f().b(operatorItem);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        j0 error;
        d state = params.getState();
        if (t.c(state, d.c.f181239a)) {
            return e.a.c.f181248a;
        }
        if (!(state instanceof d.Initialized)) {
            if (!t.c(state, d.a.f181237a)) {
                if (state instanceof d.Error) {
                    return new e.a.Error(((d.Error) state).getErrorVMS());
                }
                throw new oq.p();
            }
            return new e.a.Empty(new BaseScaffoldData(null, null, null, null, null, null, 63, null), new IconPageData(j.b.C4090b.f164686d, this.labelProvider.c(df2.a.R), this.labelProvider.c(df2.a.Q), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41394n), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41382h), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.c(), 35, null), null, 4, null), false, 72, null));
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(df2.a.S), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, C4951b.f190052a, null, params.d(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(df2.a.U);
        Label labelC2 = this.labelProvider.c(df2.a.P);
        d.Initialized initialized = (d.Initialized) state;
        boolean isValid = initialized.getIsValid();
        if (isValid) {
            error = j0.a.f132074a;
        } else {
            if (isValid) {
                throw new oq.p();
            }
            error = new j0.Error(this.labelProvider.c(df2.a.f41376e));
        }
        j0 j0Var = error;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(df2.a.T), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.CheckBox(initialized.getSelectedAll()), null, 5, null), null, null, 3325, null);
        if (initialized.c().size() <= 1) {
            defaultSingleCardData = null;
        }
        List listR = v.r(defaultSingleCardData);
        List<OperatorItem> listC = initialized.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        for (final OperatorItem operatorItem : listC) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: tf2.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, operatorItem);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(operatorItem.getOperator().getName(), "operator_" + operatorItem.getOperator().getName()), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.CheckBox(operatorItem.getIsSelected()), null, 5, null), null, null, 3325, null));
        }
        return new e.a.Initialized(baseScaffoldData, labelC, labelC2, new CardListData(v.L0(listR, arrayList), j0Var, false, null, null, 28, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41402r), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null));
    }
}
