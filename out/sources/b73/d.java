package b73;

import a73.State;
import a73.k;
import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb73/d;", "Lxw/f;", "Lb73/d$a;", "La73/k$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "i", "(Lb73/d$a;)La73/k$a;", "a", "Lmx/c;", "b", "Lu04/a;", "La73/j;", "Lr30/b;", "h", "(La73/j;)Lr30/b;", "checkBoxType", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, k.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: b73.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b(\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010!R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b&\u0010%¨\u0006)"}, d2 = {"Lb73/d$a;", "", "La73/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Liy/b0;", "onPrefixInputValueChange", "onPhoneNumberInputValueChange", "", "onGdprChecked", "onScrolledToError", "onAddPhoneNumberClick", "", "onMoreButtonClick", "<init>", "(La73/j;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "La73/j;", "h", "()La73/j;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "d", "e", "g", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f17027i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPrefixInputValueChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPhoneNumberInputValueChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onGdprChecked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddPhoneNumberClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onMoreButtonClick;

        static {
            int i15 = PhoneNumber.f221634d;
            int i16 = b0.f97726c;
            int i17 = i15 | i16 | i16 | i16 | i16;
            int i18 = hz.b.f86845b;
            f17027i = i17 | i18 | i18;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super Boolean, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar4) {
            this.state = state;
            this.backAction = aVar;
            this.onPrefixInputValueChange = lVar;
            this.onPhoneNumberInputValueChange = lVar2;
            this.onGdprChecked = lVar3;
            this.onScrolledToError = aVar2;
            this.onAddPhoneNumberClick = aVar3;
            this.onMoreButtonClick = lVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.onAddPhoneNumberClick;
        }

        public final l<Boolean, i0> c() {
            return this.onGdprChecked;
        }

        public final l<String, i0> d() {
            return this.onMoreButtonClick;
        }

        public final l<b0, i0> e() {
            return this.onPhoneNumberInputValueChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.onPrefixInputValueChange, params.onPrefixInputValueChange) && t.c(this.onPhoneNumberInputValueChange, params.onPhoneNumberInputValueChange) && t.c(this.onGdprChecked, params.onGdprChecked) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onAddPhoneNumberClick, params.onAddPhoneNumberClick) && t.c(this.onMoreButtonClick, params.onMoreButtonClick);
        }

        public final l<b0, i0> f() {
            return this.onPrefixInputValueChange;
        }

        public final er.a<i0> g() {
            return this.onScrolledToError;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.onPrefixInputValueChange.hashCode()) * 31) + this.onPhoneNumberInputValueChange.hashCode()) * 31) + this.onGdprChecked.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onAddPhoneNumberClick.hashCode()) * 31) + this.onMoreButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", onPrefixInputValueChange=" + this.onPrefixInputValueChange + ", onPhoneNumberInputValueChange=" + this.onPhoneNumberInputValueChange + ", onGdprChecked=" + this.onGdprChecked + ", onScrolledToError=" + this.onScrolledToError + ", onAddPhoneNumberClick=" + this.onAddPhoneNumberClick + ", onMoreButtonClick=" + this.onMoreButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17036a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(252759557);
            if (p076m2.t.k()) {
                p076m2.t.o(252759557, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.phonenumber.add.mapper.AddPhoneNumberMapper.invoke.<anonymous> (AddPhoneNumberMapper.kt:60)");
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
        public static final c f17037a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1762781382);
            if (p076m2.t.k()) {
                p076m2.t.o(1762781382, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.phonenumber.add.mapper.AddPhoneNumberMapper.invoke.<anonymous> (AddPhoneNumberMapper.kt:61)");
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
    public static final i0 l(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, boolean z15) {
        params.c().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k.Data b(final Params params) {
        CheckBoxSingleData checkBoxSingleData;
        b0 phoneNumber = params.getState().getPhoneNumber();
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.f23702k), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106874u, b.f17036a, c.f17037a, this.labelProvider.c(c53.a.W), this.labelProvider.c(c53.a.V), null, 32, null);
        v50.c.PhoneNumber phoneNumber2 = new v50.c.PhoneNumber(null, null, this.labelProvider.c(c53.a.f23702k), 0, null, null, mx.b.b(c0.e(params.getState().getPrefix()), "countryCodeValue"), 0, params.getState().getPrefixValidationState(), new l() { // from class: b73.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (String) obj);
            }
        }, null, mx.b.b(c0.e(params.getState().getPhoneNumber()), "phoneNumberValue"), null, params.getState().getIsSameError() ? new hz.b.Invalid(this.labelProvider.c(c53.a.U)) : params.getState().getNumberValidationState(), new l() { // from class: b73.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (String) obj);
            }
        }, null, 38075, null);
        boolean isGdprCheckboxVisible = params.getState().getIsGdprCheckboxVisible();
        Boolean boolValueOf = Boolean.valueOf(isGdprCheckboxVisible);
        if (!isGdprCheckboxVisible) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            checkBoxSingleData = new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getIsGdprCheckboxChecked(), new l() { // from class: b73.c
                @Override // er.l
                public final Object b(Object obj) {
                    return d.q(params, ((Boolean) obj).booleanValue());
                }
            }, this.labelProvider.c(c53.a.Q), null, null, new r30.d.Link(new LinkData(null, this.labelProvider.c(c53.a.O), this.commonEndpoints.L(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), null, 177, null), h(params.getState()), null, false, null, 28, null);
        } else {
            checkBoxSingleData = null;
        }
        return new k.Data(phoneNumber, aVarA, baseScaffoldData, icon, new k.Data.ContentData(phoneNumber2, this.labelProvider.c(c53.a.f23711n), checkBoxSingleData), params.getState().getScrollToError(), params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
