package nf2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import ff2.UserDocumentData;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mf2.d;
import mf2.e;
import mx.Label;
import mx.c;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import of2.SummarySectionCardListData;
import of2.SummarySectionSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import uf2.OperatorItem;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;
import zi0.InternetOperator;
import zi0.InternetSpeed;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnf2/b;", "Lxw/f;", "Lnf2/b$a;", "Lmf2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lff2/a;", "userData", "", "e", "(Lff2/a;)Ljava/lang/String;", "params", "f", "(Lnf2/b$a;)Lmf2/e$a;", "a", "Lmx/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: nf2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u001e\u0010!R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lnf2/b$a;", "", "Lmf2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSendAction", "onBackAction", "onCloseAction", "onCloseWithDialogAction", "goToSelectedProviders", "goToStatementFullText", "Lkotlin/Function1;", "", "onStatementCheckChange", "<init>", "(Lmf2/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmf2/d;", "h", "()Lmf2/d;", "b", "Ler/a;", "f", "()Ler/a;", "c", "d", "e", "g", "Ler/l;", "()Ler/l;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSelectedProviders;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToStatementFullText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementCheckChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super Boolean, i0> lVar) {
            this.state = dVar;
            this.onSendAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
            this.onCloseWithDialogAction = aVar4;
            this.goToSelectedProviders = aVar5;
            this.goToStatementFullText = aVar6;
            this.onStatementCheckChange = lVar;
        }

        public final er.a<i0> a() {
            return this.goToSelectedProviders;
        }

        public final er.a<i0> b() {
            return this.goToStatementFullText;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onCloseAction;
        }

        public final er.a<i0> e() {
            return this.onCloseWithDialogAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSendAction, params.onSendAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && t.c(this.goToSelectedProviders, params.goToSelectedProviders) && t.c(this.goToStatementFullText, params.goToStatementFullText) && t.c(this.onStatementCheckChange, params.onStatementCheckChange);
        }

        public final er.a<i0> f() {
            return this.onSendAction;
        }

        public final l<Boolean, i0> g() {
            return this.onStatementCheckChange;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onSendAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.goToSelectedProviders.hashCode()) * 31) + this.goToStatementFullText.hashCode()) * 31) + this.onStatementCheckChange.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSendAction=" + this.onSendAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", goToSelectedProviders=" + this.goToSelectedProviders + ", goToStatementFullText=" + this.goToStatementFullText + ", onStatementCheckChange=" + this.onStatementCheckChange + ')';
        }
    }

    /* JADX INFO: renamed from: nf2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3353b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3353b f135897a = new C3353b();

        C3353b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(854877337);
            if (p076m2.t.k()) {
                p076m2.t.o(854877337, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.formsummary.mappers.FormSummaryMapper.invoke.<anonymous> (FormSummaryMapper.kt:71)");
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

    private final String e(UserDocumentData userData) {
        return userData.getFirstName() + " " + userData.getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, boolean z15) {
        params.g().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        Label labelC;
        int i15;
        Label labelC2;
        Label labelC3;
        Label labelC4;
        Label labelC5;
        InternetOperator operator;
        String name;
        int i16;
        d state = params.getState();
        if (t.c(state, d.b.f126151a)) {
            return e.a.b.f126164a;
        }
        int i17 = 0;
        if (!(state instanceof d.c.DisplayingData) && !(state instanceof d.c.SendingApplication)) {
            if (state instanceof d.c.ProviderList) {
                BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(df2.a.S), null, null, null, 28, null), null, null, null, null, 61, null);
                d.c.ProviderList providerList = (d.c.ProviderList) state;
                List<OperatorItem> listD = providerList.getStateData().getFormData().d();
                ArrayList arrayList = new ArrayList(v.y(listD, 10));
                for (Object obj : listD) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        v.x();
                    }
                    OperatorItem operatorItem = (OperatorItem) obj;
                    arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(operatorItem.getOperator().getName(), "operatorName"), null, c70.a.f23835a.a().V(operatorItem.getOperator().getName(), i18, providerList.getStateData().getFormData().d().size()), 1, null)), null, 5, null), null, null, null, 3839, null));
                    i17 = i18;
                }
                return new e.a.ProviderList(baseScaffoldData, new CardListData(arrayList, null, false, new CardListAccessibilityData(this.labelProvider.c(df2.a.S), Boolean.FALSE), null, 22, null), params.c());
            }
            if (state instanceof d.c.Statement) {
                BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(df2.a.f41416y), null, null, null, 28, null), null, null, null, null, 61, null);
                Label labelC6 = this.labelProvider.c(df2.a.f41397o0);
                d.c.Statement statement = (d.c.Statement) state;
                if (!statement.getStateData().getFormData().getContactInfo().a() && !statement.getStateData().getFormData().getContactInfo().f()) {
                    labelC6 = null;
                }
                return new e.a.StatementFullText(baseScaffoldData2, (statement.getStateData().getFormData().getContactInfo().g() || statement.getStateData().getFormData().getContactInfo().f()) ? this.labelProvider.c(df2.a.f41399p0) : null, labelC6, params.c());
            }
            if (!(state instanceof d.Success)) {
                if (state instanceof d.Error) {
                    return new e.a.Error(((d.Error) state).getErrorVMS());
                }
                throw new oq.p();
            }
            BaseScaffoldData baseScaffoldData3 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
            j.b.c cVar = j.b.c.f164688d;
            Label labelC7 = this.labelProvider.c(df2.a.f41410v);
            Label labelC8 = this.labelProvider.c(df2.a.f41377e0);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(' ');
            d.Success success = (d.Success) state;
            sb5.append(success.getDemandId());
            Label labelO = labelC8.o(mx.b.b(sb5.toString(), "demandId"));
            c cVar2 = this.labelProvider;
            boolean zIsEmpty = success.c().isEmpty();
            if (zIsEmpty) {
                i16 = df2.a.f41375d0;
            } else {
                if (zIsEmpty) {
                    throw new oq.p();
                }
                i16 = df2.a.f41373c0;
            }
            return new e.a.Success(baseScaffoldData3, new IconPageData(cVar, labelC7, labelO, cVar2.c(i16), null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41382h), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), null, null, 6, null), true), params.d());
        }
        BaseScaffoldData baseScaffoldData4 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(df2.a.A), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, C3353b.f135897a, null, params.e(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC9 = this.labelProvider.c(df2.a.f41372c);
        d.c cVar3 = (d.c) state;
        SummarySectionSingleCardData summarySectionSingleCardData = new SummarySectionSingleCardData(this.labelProvider.c(df2.a.C), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(df2.a.f41390l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(e(cVar3.getStateData().getUserData()), "userData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        SummarySectionSingleCardData summarySectionSingleCardData2 = new SummarySectionSingleCardData(this.labelProvider.c(df2.a.f41383h0), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(df2.a.f41368a), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(cVar3.getStateData().getFormData().getAddressPoint().getDisplayAddress(), "addressPoint"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        Label labelC10 = this.labelProvider.c(df2.a.f41391l0);
        OperatorItem operatorItem2 = (OperatorItem) v.n0(cVar3.getStateData().getFormData().d());
        if (operatorItem2 == null || (operator = operatorItem2.getOperator()) == null || (name = operator.getName()) == null || (labelC = mx.b.b(name, "internetProvider")) == null) {
            labelC = this.labelProvider.c(df2.a.f41381g0);
        }
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null)), null, 5, null);
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(df2.a.f41400q), this.labelProvider.c(df2.a.f41405s0));
        k30.d.a aVar = k30.d.a.f107773a;
        SummarySectionSingleCardData summarySectionSingleCardData3 = new SummarySectionSingleCardData(labelC10, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, cVar3.getStateData().getFormData().d().size() > 1 ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, withText, aVar, null, params.a(), 35, null)) : null, null, 2815, null));
        Label labelC11 = this.labelProvider.c(df2.a.f41387j0);
        c cVar4 = this.labelProvider;
        boolean upgrade = cVar3.getStateData().getFormData().getParameters().getUpgrade();
        if (upgrade) {
            i15 = df2.a.f41385i0;
        } else {
            if (upgrade) {
                throw new oq.p();
            }
            i15 = df2.a.f41389k0;
        }
        SummarySectionSingleCardData summarySectionSingleCardData4 = new SummarySectionSingleCardData(labelC11, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar4.c(i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null));
        Label labelC12 = this.labelProvider.c(df2.a.f41393m0);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(df2.a.N), null, null, 0, 0, null, 62, null);
        InternetSpeed downlink = cVar3.getStateData().getFormData().getParameters().getDownlink();
        if (downlink == null || (labelC2 = downlink.b()) == null) {
            labelC2 = this.labelProvider.c(df2.a.f41379f0);
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(labelC2, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(df2.a.f41395n0), null, null, 0, 0, null, 62, null);
        InternetSpeed uplink = cVar3.getStateData().getFormData().getParameters().getUplink();
        if (uplink == null || (labelC3 = uplink.b()) == null) {
            labelC3 = this.labelProvider.c(df2.a.f41379f0);
        }
        SummarySectionCardListData summarySectionCardListData = new SummarySectionCardListData(labelC12, new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(labelC3, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
        Label labelC13 = this.labelProvider.c(df2.a.f41386j);
        SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(df2.a.f41406t), null, null, 0, 0, null, 62, null);
        String strF = new PhoneNumber(PhoneNumber.c.c(cVar3.getStateData().getFormData().getContactInfo().getCountryCode()), PhoneNumber.b.c(cVar3.getStateData().getFormData().getContactInfo().getPhoneNumber()), null).f();
        if (c0.e(cVar3.getStateData().getFormData().getContactInfo().getPhoneNumber()).length() <= 0) {
            strF = null;
        }
        if (strF == null || (labelC4 = mx.b.b(strF, "phoneNumber")) == null) {
            labelC4 = this.labelProvider.c(df2.a.f41379f0);
        }
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(labelC4, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel4 = new SingleCardLabel(this.labelProvider.c(df2.a.f41388k), null, null, 0, 0, null, 62, null);
        String strE = c0.e(cVar3.getStateData().getFormData().getContactInfo().getEmail());
        if (strE.length() <= 0) {
            strE = null;
        }
        if (strE == null || (labelC5 = mx.b.b(strE, "email")) == null) {
            labelC5 = this.labelProvider.c(df2.a.f41379f0);
        }
        return new e.a.SummaryData(baseScaffoldData4, labelC9, summarySectionSingleCardData, summarySectionSingleCardData2, summarySectionSingleCardData3, summarySectionSingleCardData4, summarySectionCardListData, new SummarySectionCardListData(labelC13, new CardListData(v.q(defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel4, new n50.b.Title(new SingleCardLabel(labelC5, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), this.labelProvider.c(df2.a.f41416y), new s50.a.b(null, cVar3.getStateData().getIsCheckedStatement(), this.labelProvider.c(cVar3.getStateData().getFormData().getContactInfo().g() ? df2.a.f41403r0 : df2.a.f41401q0), cVar3.getStateData().getIsValidStatement(), false, null, new l() { // from class: nf2.a
            @Override // er.l
            public final Object b(Object obj2) {
                return b.h(params, ((Boolean) obj2).booleanValue());
            }
        }, null, new s50.b.TextButton(new ButtonTextData(null, this.labelProvider.c(df2.a.f41392m), null, null, params.b(), 13, null)), this.labelProvider.c(df2.a.f41392m), 177, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41414x), null, 2, null), aVar, null, params.f(), 35, null));
    }
}
