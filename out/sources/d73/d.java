package d73;

import androidx.compose.ui.graphics.Color;
import c73.State;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld73/d;", "Lxw/f;", "Ld73/d$a;", "Lc73/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ld73/d$a;)Lc73/d$a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, c73.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d73.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b'\u0010!R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\"\u0010)¨\u0006*"}, d2 = {"Ld73/d$a;", "", "Lc73/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Liy/b0;", "onPrefixInputValueChange", "onPhoneNumberInputValueChange", "onDeletePhoneClick", "onScrolledToError", "Lkotlin/Function2;", "onNextClick", "<init>", "(Lc73/c;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc73/c;", "g", "()Lc73/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "f", "Ler/p;", "()Ler/p;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f40165h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPrefixInputValueChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPhoneNumberInputValueChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeletePhoneClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, b0, i0> onNextClick;

        static {
            int i15 = PhoneNumber.f221634d;
            int i16 = b0.f97726c;
            int i17 = i15 | i16 | i16 | i16 | i16;
            int i18 = hz.b.f86845b;
            f40165h = i17 | i18 | i18;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, p<? super b0, ? super b0, i0> pVar) {
            this.state = state;
            this.backAction = aVar;
            this.onPrefixInputValueChange = lVar;
            this.onPhoneNumberInputValueChange = lVar2;
            this.onDeletePhoneClick = aVar2;
            this.onScrolledToError = aVar3;
            this.onNextClick = pVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.onDeletePhoneClick;
        }

        public final p<b0, b0, i0> c() {
            return this.onNextClick;
        }

        public final l<b0, i0> d() {
            return this.onPhoneNumberInputValueChange;
        }

        public final l<b0, i0> e() {
            return this.onPrefixInputValueChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.onPrefixInputValueChange, params.onPrefixInputValueChange) && t.c(this.onPhoneNumberInputValueChange, params.onPhoneNumberInputValueChange) && t.c(this.onDeletePhoneClick, params.onDeletePhoneClick) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onNextClick, params.onNextClick);
        }

        public final er.a<i0> f() {
            return this.onScrolledToError;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.onPrefixInputValueChange.hashCode()) * 31) + this.onPhoneNumberInputValueChange.hashCode()) * 31) + this.onDeletePhoneClick.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onNextClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", onPrefixInputValueChange=" + this.onPrefixInputValueChange + ", onPhoneNumberInputValueChange=" + this.onPhoneNumberInputValueChange + ", onDeletePhoneClick=" + this.onDeletePhoneClick + ", onScrolledToError=" + this.onScrolledToError + ", onNextClick=" + this.onNextClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40173a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2028024802);
            if (p076m2.t.k()) {
                p076m2.t.o(-2028024802, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.phonenumber.change.mapper.ChangePhoneNumberScreenMapper.invoke.<anonymous> (ChangePhoneNumberScreenMapper.kt:82)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40174a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-510844248);
            if (p076m2.t.k()) {
                p076m2.t.o(-510844248, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.phonenumber.change.mapper.ChangePhoneNumberScreenMapper.invoke.<anonymous> (ChangePhoneNumberScreenMapper.kt:89)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.c().B(params.getState().getPrefix(), params.getState().getNumber());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c73.d.Data b(final Params params) {
        return new c73.d.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.f23702k), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), this.labelProvider.c(c53.a.f23694h0), new v50.c.PhoneNumber(null, null, this.labelProvider.c(c53.a.f23702k), 0, null, null, mx.b.b(c0.e(params.getState().getPrefix()), "prefix"), 0, params.getState().getPrefixValidationState(), new l() { // from class: d73.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, (String) obj);
            }
        }, null, mx.b.b(c0.e(params.getState().getNumber()), "phone"), null, params.getState().getIsSameError() ? new hz.b.Invalid(this.labelProvider.c(c53.a.U)) : params.getState().getNumberValidationState(), new l() { // from class: d73.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (String) obj);
            }
        }, null, 38075, null), new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(c53.a.f23691g0), null, b.f40173a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106727a, null, c.f40174a, null, null, 26, null), 3, null), null, null, 3325, null), params.getState().getScrollToError(), params.f(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: d73.c
            @Override // er.a
            public final Object a() {
                return d.m(params);
            }
        }, 35, null));
    }
}
