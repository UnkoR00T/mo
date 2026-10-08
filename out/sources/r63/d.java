package r63;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import q63.State;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lr63/d;", "Lxw/f;", "Lr63/d$a;", "Lq63/d$a$b;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "i", "(Lr63/d$a;)Lq63/d$a$b;", "a", "Lmx/c;", "b", "Lu04/a;", "Lq63/c;", "Lr30/b;", "h", "(Lq63/c;)Lr30/b;", "checkboxType", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, q63.d.a.Initialized> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: r63.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b%\u0010 R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001e\u0010$R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lr63/d$a;", "", "Lq63/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "", "onGdprChecked", "onScrolledToError", "Liy/b0;", "onAddEmailClick", "inputOnValueChanged", "", "onMoreButtonClick", "<init>", "(Lq63/c;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lq63/c;", "g", "()Lq63/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "f", "e", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f172236h = b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onGdprChecked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onAddEmailClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> inputOnValueChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onMoreButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super Boolean, i0> lVar, er.a<i0> aVar2, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super String, i0> lVar4) {
            this.state = state;
            this.backAction = aVar;
            this.onGdprChecked = lVar;
            this.onScrolledToError = aVar2;
            this.onAddEmailClick = lVar2;
            this.inputOnValueChanged = lVar3;
            this.onMoreButtonClick = lVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<b0, i0> b() {
            return this.inputOnValueChanged;
        }

        public final l<b0, i0> c() {
            return this.onAddEmailClick;
        }

        public final l<Boolean, i0> d() {
            return this.onGdprChecked;
        }

        public final l<String, i0> e() {
            return this.onMoreButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.onGdprChecked, params.onGdprChecked) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onAddEmailClick, params.onAddEmailClick) && t.c(this.inputOnValueChanged, params.inputOnValueChanged) && t.c(this.onMoreButtonClick, params.onMoreButtonClick);
        }

        public final er.a<i0> f() {
            return this.onScrolledToError;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.onGdprChecked.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onAddEmailClick.hashCode()) * 31) + this.inputOnValueChanged.hashCode()) * 31) + this.onMoreButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", onGdprChecked=" + this.onGdprChecked + ", onScrolledToError=" + this.onScrolledToError + ", onAddEmailClick=" + this.onAddEmailClick + ", inputOnValueChanged=" + this.inputOnValueChanged + ", onMoreButtonClick=" + this.onMoreButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f172244a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1466187801);
            if (p076m2.t.k()) {
                p076m2.t.o(-1466187801, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.mapper.AddEmailScreenMapper.invoke.<anonymous> (AddEmailScreenMapper.kt:59)");
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
        public static final c f172245a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1900151482);
            if (p076m2.t.k()) {
                p076m2.t.o(-1900151482, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.mapper.AddEmailScreenMapper.invoke.<anonymous> (AddEmailScreenMapper.kt:60)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public d(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final r30.b h(State state) {
        boolean showCheckBoxValidationError = state.getShowCheckBoxValidationError();
        if (showCheckBoxValidationError) {
            return new r30.b.Error(null, this.labelProvider.c(c53.a.f23714o), 1, null);
        }
        if (showCheckBoxValidationError) {
            throw new oq.p();
        }
        return r30.b.a.f171263a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, boolean z15) {
        params.d().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().b(params.getState().getEmail());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public q63.d.a.Initialized b(final Params params) {
        CheckBoxSingleData checkBoxSingleData;
        hz.b invalid;
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.f23684e), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.V0, b.f172244a, c.f172245a, this.labelProvider.c(c53.a.S), this.labelProvider.c(c53.a.R), null, 32, null);
        boolean isGdprCheckboxVisible = params.getState().getIsGdprCheckboxVisible();
        Boolean boolValueOf = Boolean.valueOf(isGdprCheckboxVisible);
        if (!isGdprCheckboxVisible) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            checkBoxSingleData = new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getIsGdprCheckboxChecked(), new l() { // from class: r63.a
                @Override // er.l
                public final Object b(Object obj) {
                    return d.l(params, ((Boolean) obj).booleanValue());
                }
            }, this.labelProvider.c(c53.a.Q), null, null, new r30.d.Link(new LinkData(null, this.labelProvider.c(c53.a.O), this.commonEndpoints.L(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null)), null, 177, null), h(params.getState()), null, false, null, 28, null);
        } else {
            checkBoxSingleData = null;
        }
        Label labelC = this.labelProvider.c(c53.a.f23684e);
        int iD = v4.t.INSTANCE.d();
        Label labelB = mx.b.b(c0.e(params.getState().getEmail()), "email");
        if (!params.getState().getEmailValidationState().a() || params.getState().getIsSameError()) {
            invalid = params.getState().getIsSameError() ? new hz.b.Invalid(this.labelProvider.c(c53.a.P)) : params.getState().getEmailValidationState();
        } else {
            invalid = hz.b.d.f86848c;
        }
        return new q63.d.a.Initialized(aVarA, baseScaffoldData, icon, new q63.d.a.Initialized.ContentData(new v50.c.Text(null, labelC, null, labelB, invalid, null, null, new l() { // from class: r63.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (String) obj);
            }
        }, null, false, iD, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 916325, null), params.b(), this.labelProvider.c(c53.a.f23711n), checkBoxSingleData), params.getState().getScrollToError(), params.f(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: r63.c
            @Override // er.a
            public final Object a() {
                return d.q(params);
            }
        }, 35, null));
    }
}
