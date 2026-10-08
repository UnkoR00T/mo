package h63;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g63.State;
import g63.d;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh63/b;", "Lxw/f;", "Lh63/b$a;", "Lg63/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lh63/b$a;)Lg63/d$a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h63.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u001fR)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, d2 = {"Lh63/b$a;", "", "Lg63/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "", "inputOnValueChanged", "onScrolledToError", "Lkotlin/Function2;", "Li63/b;", "onButtonClick", "<init>", "(Lg63/c;Ler/a;Ler/l;Ler/a;Ler/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg63/c;", "e", "()Lg63/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "Ler/p;", "()Ler/p;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f81274f = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> inputOnValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, i63.b, i0> onButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar, er.a<i0> aVar2, p<? super String, ? super i63.b, i0> pVar) {
            this.state = state;
            this.closeAction = aVar;
            this.inputOnValueChanged = lVar;
            this.onScrolledToError = aVar2;
            this.onButtonClick = pVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final l<String, i0> b() {
            return this.inputOnValueChanged;
        }

        public final p<String, i63.b, i0> c() {
            return this.onButtonClick;
        }

        public final er.a<i0> d() {
            return this.onScrolledToError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.inputOnValueChanged, params.inputOnValueChanged) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.onButtonClick, params.onButtonClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.inputOnValueChanged.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.onButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", inputOnValueChanged=" + this.inputOnValueChanged + ", onScrolledToError=" + this.onScrolledToError + ", onButtonClick=" + this.onButtonClick + ')';
        }
    }

    /* JADX INFO: renamed from: h63.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1874b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1874b f81280a = new C1874b();

        C1874b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-520316608);
            if (p076m2.t.k()) {
                p076m2.t.o(-520316608, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.code.mapper.CodeContactDetailsMapper.invoke.<anonymous> (CodeContactDetailsMapper.kt:49)");
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
        public static final c f81281a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1733975583);
            if (p076m2.t.k()) {
                p076m2.t.o(1733975583, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.code.mapper.CodeContactDetailsMapper.invoke.<anonymous> (CodeContactDetailsMapper.kt:50)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params) {
        params.c().B(params.getState().getCode(), params.getState().getType());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        int i15;
        int i16;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(c53.a.f23727s0), null, null, null, 28, null), null, null, null, null, 61, null);
        int i17 = jz.a.f106799j1;
        C1874b c1874b = C1874b.f81280a;
        c cVar = c.f81281a;
        mx.c cVar2 = this.labelProvider;
        i63.b type = params.getState().getType();
        if (type instanceof i63.b.a) {
            i15 = c53.a.Y;
        } else {
            if (!(type instanceof i63.b.Phone)) {
                throw new oq.p();
            }
            i15 = c53.a.f23718p0;
        }
        Label labelC = cVar2.c(i15);
        mx.c cVar3 = this.labelProvider;
        i63.b type2 = params.getState().getType();
        if (type2 instanceof i63.b.a) {
            i16 = c53.a.T;
        } else {
            if (!(type2 instanceof i63.b.Phone)) {
                throw new oq.p();
            }
            i16 = c53.a.f23715o0;
        }
        return new d.Data(baseScaffoldData, new o40.a.Icon(i17, c1874b, cVar, labelC, cVar3.e(i16, c0.e(params.getState().getType().getContact())), null, 32, null), new v50.c.Number(null, this.labelProvider.c(c53.a.f23727s0), null, mx.b.b(params.getState().getCode(), "code"), params.getState().getCodeValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null), params.getState().getScrollToError(), params.d(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23678c), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: h63.a
            @Override // er.a
            public final Object a() {
                return b.f(params);
            }
        }, 35, null), params.a());
    }
}
