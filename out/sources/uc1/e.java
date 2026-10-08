package uc1;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import sc1.q;
import sc1.r;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Luc1/e;", "Lxw/f;", "Luc1/e$b;", "Lsc1/r$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "params", "i", "(Luc1/e$b;)Lsc1/r$a;", "a", "Lmx/c;", "b", "Lia1/a;", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, r.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f197454c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f197455d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luc1/e$a;", "", "<init>", "()V", "", "ENGLISH", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: uc1.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001a\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001e\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006'"}, d2 = {"Luc1/e$b;", "", "Lsc1/q;", "state", "Lkotlin/Function1;", "Lsc1/q$a;", "Loq/i0;", "onSelectAction", "Lkotlin/Function0;", "onInfoButtonAction", "onNextAction", "onBackAction", "onCloseAction", "", "onUrlAction", "<init>", "(Lsc1/q;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsc1/q;", "g", "()Lsc1/q;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "f", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<q.a, i0> onSelectAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoButtonAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q qVar, l<? super q.a, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super String, i0> lVar2) {
            this.state = qVar;
            this.onSelectAction = lVar;
            this.onInfoButtonAction = aVar;
            this.onNextAction = aVar2;
            this.onBackAction = aVar3;
            this.onCloseAction = aVar4;
            this.onUrlAction = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onInfoButtonAction;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final l<q.a, i0> e() {
            return this.onSelectAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectAction, params.onSelectAction) && t.c(this.onInfoButtonAction, params.onInfoButtonAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onUrlAction, params.onUrlAction);
        }

        public final l<String, i0> f() {
            return this.onUrlAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final q getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onSelectAction.hashCode()) * 31) + this.onInfoButtonAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onUrlAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAction=" + this.onSelectAction + ", onInfoButtonAction=" + this.onInfoButtonAction + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onUrlAction=" + this.onUrlAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197465a;

        static {
            int[] iArr = new int[q.a.values().length];
            try {
                iArr[q.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f197465a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f197466a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1365579142);
            if (p076m2.t.k()) {
                p076m2.t.o(-1365579142, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.mapper.IncomeTaxFormSelectionMapper.invoke.<anonymous> (IncomeTaxFormSelectionMapper.kt:55)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public e(mx.c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.e().b(q.a.GENERAL_TAX);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.e().b(q.a.FLAT_TAX);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.e().b(q.a.LUMP_TAX);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.e().b(q.a.NOT_DECLARED_YET);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public r.a b(final Params params) {
        q state = params.getState();
        if (!(state instanceof q.Initialized)) {
            if (state instanceof q.InfoPage) {
                return new r.a.InfoPage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ha1.a.f82359a4), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.V3), this.labelProvider.c(ha1.a.U3), this.labelProvider.c(ha1.a.X3), this.labelProvider.c(ha1.a.W3), this.labelProvider.c(ha1.a.Z3), this.labelProvider.c(ha1.a.Y3), this.labelProvider.c(ha1.a.f82375c4), new LinkData(null, this.labelProvider.c(ha1.a.J4), this.companyEndpoints.w(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null), params.a());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, d.f197466a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82431j4);
        Label labelC2 = this.labelProvider.c(ha1.a.f82423i4);
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(ha1.a.f82367b4), null, null, params.c(), 13, null);
        boolean z15 = true;
        if (((q.Initialized) params.getState()).getIncomeTaxForm() != q.a.GENERAL_TAX) {
            z15 = false;
        }
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, z15, false, 5, null), new er.a() { // from class: uc1.a
            @Override // er.a
            public final Object a() {
                return e.l(params);
            }
        }, this.labelProvider.c(ha1.a.f82383d4), null, null, 24, null);
        RadioButtonRow radioButtonRow2 = new RadioButtonRow(new RadioButtonItemData(false, ((q.Initialized) params.getState()).getIncomeTaxForm() == q.a.FLAT_TAX ? z15 : false, false, 5, null), new er.a() { // from class: uc1.b
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, this.labelProvider.c(ha1.a.f82391e4), null, null, 24, null);
        RadioButtonRow radioButtonRow3 = new RadioButtonRow(new RadioButtonItemData(false, ((q.Initialized) params.getState()).getIncomeTaxForm() == q.a.LUMP_TAX ? z15 : false, false, 5, null), new er.a() { // from class: uc1.c
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        }, this.labelProvider.c(ha1.a.f82399f4), null, null, 24, null);
        q.a incomeTaxForm = ((q.Initialized) params.getState()).getIncomeTaxForm();
        q.a aVar = q.a.NOT_DECLARED_YET;
        List listQ = v.q(radioButtonRow, radioButtonRow2, radioButtonRow3, new RadioButtonRow(new RadioButtonItemData(false, incomeTaxForm == aVar ? z15 : false, false, 5, null), new er.a() { // from class: uc1.d
            @Override // er.a
            public final Object a() {
                return e.r(params);
            }
        }, this.labelProvider.c(ha1.a.f82407g4), ((q.Initialized) params.getState()).getIncomeTaxForm() == aVar ? this.labelProvider.c(ha1.a.f82415h4) : null, null, 16, null));
        b50.e.a aVar2 = b50.e.a.f16684a;
        q.a incomeTaxForm2 = ((q.Initialized) params.getState()).getIncomeTaxForm();
        return new r.a.Initialized(baseScaffoldData, labelC, labelC2, buttonTextData, new RadioButtonData(listQ, aVar2, (incomeTaxForm2 == null ? -1 : c.f197465a[incomeTaxForm2.ordinal()]) == z15 ? new b50.d.Error(this.labelProvider.c(ha1.a.f82426j)) : b50.d.c.f16683a, null, null, null, null, 120, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
