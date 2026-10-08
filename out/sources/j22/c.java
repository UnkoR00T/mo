package j22;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.e;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i22.State;
import i22.d;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj22/c;", "Lxw/f;", "Lj22/c$a;", "Li22/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lj22/c$a;)Li22/d$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j22.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001d\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0019\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lj22/c$a;", "", "Li22/c;", "state", "Lkotlin/Function1;", "Li22/b;", "Loq/i0;", "onMethodSelected", "Lkotlin/Function0;", "onNextClick", "closeAction", "backAction", "openFullStatement", "<init>", "(Li22/c;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li22/c;", "f", "()Li22/c;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "d", "()Ler/a;", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<i22.b, i0> onMethodSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openFullStatement;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super i22.b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onMethodSelected = lVar;
            this.onNextClick = aVar;
            this.closeAction = aVar2;
            this.backAction = aVar3;
            this.openFullStatement = aVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<i22.b, i0> c() {
            return this.onMethodSelected;
        }

        public final er.a<i0> d() {
            return this.onNextClick;
        }

        public final er.a<i0> e() {
            return this.openFullStatement;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onMethodSelected, params.onMethodSelected) && t.c(this.onNextClick, params.onNextClick) && t.c(this.closeAction, params.closeAction) && t.c(this.backAction, params.backAction) && t.c(this.openFullStatement, params.openFullStatement);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onMethodSelected.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.openFullStatement.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onMethodSelected=" + this.onMethodSelected + ", onNextClick=" + this.onNextClick + ", closeAction=" + this.closeAction + ", backAction=" + this.backAction + ", openFullStatement=" + this.openFullStatement + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99021a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(252841951);
            if (p076m2.t.k()) {
                p076m2.t.o(252841951, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactmethod.selection.mapper.ContactMethodSelectionMapper.invoke.<anonymous> (ContactMethodSelectionMapper.kt:49)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.c().b(i22.b.EPUAP);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.c().b(i22.b.MAILING_ADDRESS);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        er.a<i0> aVarA = params.a();
        return new d.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.f46637x2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f99021a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(e02.a.f46607s2), new ButtonTextData(null, this.labelProvider.c(e02.a.f46601r2), null, null, params.e(), 13, null), aVarA, new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedMethod() == i22.b.EPUAP, false, 5, null), new er.a() { // from class: j22.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(e02.a.f46619u2), this.labelProvider.c(e02.a.f46613t2), null, 16, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedMethod() == i22.b.MAILING_ADDRESS, false, 5, null), new er.a() { // from class: j22.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, this.labelProvider.c(e02.a.f46631w2), this.labelProvider.c(e02.a.f46625v2), null, 16, null)), e.b.f16685a, null, null, null, null, null, 124, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(e02.a.X), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
