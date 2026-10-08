package t63;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import s63.State;
import s63.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt63/c;", "Lxw/f;", "Lt63/c$a;", "Ls63/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lt63/c$a;)Ls63/d$a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: t63.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006%"}, d2 = {"Lt63/c$a;", "", "Ls63/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Liy/b0;", "inputOnValueChanged", "onScrolledToError", "onNextClick", "onDeleteEmailClick", "<init>", "(Ls63/c;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls63/c;", "f", "()Ls63/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f188014g = b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> inputOnValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onNextClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteEmailClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b0, i0> lVar, er.a<i0> aVar2, l<? super b0, i0> lVar2, er.a<i0> aVar3) {
            this.state = state;
            this.backAction = aVar;
            this.inputOnValueChanged = lVar;
            this.onScrolledToError = aVar2;
            this.onNextClick = lVar2;
            this.onDeleteEmailClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<b0, i0> b() {
            return this.inputOnValueChanged;
        }

        public final er.a<i0> c() {
            return this.onDeleteEmailClick;
        }

        public final l<b0, i0> d() {
            return this.onNextClick;
        }

        public final er.a<i0> e() {
            return this.onScrolledToError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.inputOnValueChanged, params.inputOnValueChanged) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onDeleteEmailClick, params.onDeleteEmailClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.inputOnValueChanged.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onDeleteEmailClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", inputOnValueChanged=" + this.inputOnValueChanged + ", onScrolledToError=" + this.onScrolledToError + ", onNextClick=" + this.onNextClick + ", onDeleteEmailClick=" + this.onDeleteEmailClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f188021a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1478756782);
            if (p076m2.t.k()) {
                p076m2.t.o(-1478756782, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.change.mapper.ChangeEmailScreenMapper.invoke.<anonymous> (ChangeEmailScreenMapper.kt:61)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    /* JADX INFO: renamed from: t63.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4891c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4891c f188022a = new C4891c();

        C4891c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(269532530);
            if (p076m2.t.k()) {
                p076m2.t.o(269532530, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.change.mapper.ChangeEmailScreenMapper.invoke.<anonymous> (ChangeEmailScreenMapper.kt:68)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.d().b(params.getState().getEmail());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        hz.b invalid;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c53.a.f23684e), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(c53.a.f23679c0);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(c53.a.f23676b0), null, b.f188021a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106727a, null, C4891c.f188022a, null, null, 26, null), 3, null), null, null, 3325, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: t63.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, 35, null);
        Label labelC2 = this.labelProvider.c(c53.a.f23684e);
        if (!params.getState().getEmailValidationState().a() || params.getState().getIsSameError()) {
            invalid = params.getState().getIsSameError() ? new hz.b.Invalid(this.labelProvider.c(c53.a.P)) : params.getState().getEmailValidationState();
        } else {
            invalid = hz.b.d.f86848c;
        }
        return new d.Data(baseScaffoldData, aVarA, labelC, new v50.c.Text(null, labelC2, null, mx.b.b(c0.e(params.getState().getEmail()), "email"), invalid, null, null, new l() { // from class: t63.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 917345, null), defaultSingleCardData, params.getState().getScrollToError(), params.e(), buttonData);
    }
}
