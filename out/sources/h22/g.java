package h22;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g22.State;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lh22/g;", "Lxw/f;", "Lh22/g$a;", "Lg22/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Lg22/d$a$a$a;", "i", "(Lh22/g$a;)Ljava/util/List;", "r", "(Lh22/g$a;)Lg22/d$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, g22.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h22.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001e\u0010 R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010 R+\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lh22/g$a;", "", "Lg22/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function2;", "Lg22/b;", "", "onFieldValueChanged", "nextAction", "onScrollToFieldAction", "", "onFocusChanged", "<init>", "(Lg22/c;Ler/a;Ler/a;Ler/p;Ler/a;Ler/a;Ler/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg22/c;", "g", "()Lg22/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/p;", "()Ler/p;", "e", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f80109h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<g22.b, String, i0> onFieldValueChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToFieldAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<g22.b, Boolean, i0> onFocusChanged;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f80109h = i15 | i15 | i16 | i15 | i16 | i16 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, p<? super g22.b, ? super String, i0> pVar, er.a<i0> aVar3, er.a<i0> aVar4, p<? super g22.b, ? super Boolean, i0> pVar2) {
            this.state = state;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.onFieldValueChanged = pVar;
            this.nextAction = aVar3;
            this.onScrollToFieldAction = aVar4;
            this.onFocusChanged = pVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final p<g22.b, String, i0> d() {
            return this.onFieldValueChanged;
        }

        public final p<g22.b, Boolean, i0> e() {
            return this.onFocusChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.onFieldValueChanged, params.onFieldValueChanged) && t.c(this.nextAction, params.nextAction) && t.c(this.onScrollToFieldAction, params.onScrollToFieldAction) && t.c(this.onFocusChanged, params.onFocusChanged);
        }

        public final er.a<i0> f() {
            return this.onScrollToFieldAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.onFieldValueChanged.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.onScrollToFieldAction.hashCode()) * 31) + this.onFocusChanged.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", onFieldValueChanged=" + this.onFieldValueChanged + ", nextAction=" + this.nextAction + ", onScrollToFieldAction=" + this.onScrollToFieldAction + ", onFocusChanged=" + this.onFocusChanged + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f80117a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1866467609);
            if (p076m2.t.k()) {
                p076m2.t.o(-1866467609, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.mapper.ContactDetailsMapper.invoke.<anonymous> (ContactDetailsMapper.kt:53)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<g22.d.Data.InterfaceC1577a.TextInput> i(final Params params) {
        g22.d.Data.b bVar = g22.d.Data.b.PHONE_NUMBER_WITH_PREFIX;
        Label labelC = this.labelProvider.c(e02.a.f46521e0);
        Label labelB = mx.b.b(c0.e(params.getState().g().d().getValue()), "phoneNumber");
        g22.d.Data.InterfaceC1577a.TextInput textInput = new g22.d.Data.InterfaceC1577a.TextInput(bVar, new v50.c.PhoneNumber(null, null, labelC, 0, null, null, mx.b.b(c0.e(params.getState().h().d().getValue()), "prefix"), 0, params.getState().h().getState(), new l() { // from class: h22.c
            @Override // er.l
            public final Object b(Object obj) {
                return g.l(params, (String) obj);
            }
        }, null, labelB, null, params.getState().g().getState(), new l() { // from class: h22.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.m(params, (String) obj);
            }
        }, null, 38075, null));
        g22.d.Data.b bVar2 = g22.d.Data.b.EMAIL;
        Label labelC2 = this.labelProvider.c(e02.a.f46628w);
        hz.b state = params.getState().c().getState();
        return v.s(textInput, new g22.d.Data.InterfaceC1577a.TextInput(bVar2, new v50.c.Text(null, labelC2, null, mx.b.b(c0.e(params.getState().c().d()), "email"), state, null, null, new l() { // from class: h22.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 917349, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.d().B(g22.b.PHONE_PREFIX, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.d().B(g22.b.PHONE_NUMBER, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.d().B(g22.b.EMAIL, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, g22.d.Data.InterfaceC1577a interfaceC1577a, boolean z15) {
        if (!(interfaceC1577a instanceof g22.d.Data.InterfaceC1577a.TextInput)) {
            throw new oq.p();
        }
        params.e().B(h.c(((g22.d.Data.InterfaceC1577a.TextInput) interfaceC1577a).getType()), Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g22.d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.f46562l), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f80117a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarF = params.f();
        g22.b fieldTypeToScroll = params.getState().getFieldTypeToScroll();
        return new g22.d.Data(baseScaffoldData, i(params), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(e02.a.L), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(c0.e(params.getState().getNameAndSurname()), "nameAndSurnameValue"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(e02.a.f46509c0), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(c0.e(params.getState().getPesel()), "peselNumberValue"), j70.a.LETTER_BY_LETTER, null, 2, null)), null, 4, null), null, null, null, 3839, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.X), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), fieldTypeToScroll != null ? h.d(fieldTypeToScroll) : null, aVarF, new p() { // from class: h22.f
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g.s(params, (g22.d.Data.InterfaceC1577a) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }
}
