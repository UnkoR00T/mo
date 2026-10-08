package gx1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import fx1.State;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import l3.o;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p079n1.k3;
import p079n1.l3;
import v4.a0;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgx1/d;", "Lxw/f;", "Lgx1/d$a;", "Lfx1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lgx1/d$a;)Lfx1/c$a;", "a", "Lmx/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, fx1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gx1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lgx1/d$a;", "", "Lfx1/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPukValueChanged", "Lkotlin/Function0;", "onInterruptProcess", "onBackAction", "onCloseAction", "onNextAction", "<init>", "(Lfx1/b;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfx1/b;", "f", "()Lfx1/b;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f78206g = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPukValueChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInterruptProcess;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onPukValueChanged = lVar;
            this.onInterruptProcess = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
            this.onNextAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onInterruptProcess;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final l<b0, i0> e() {
            return this.onPukValueChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPukValueChanged, params.onPukValueChanged) && t.c(this.onInterruptProcess, params.onInterruptProcess) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onNextAction, params.onNextAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onPukValueChanged.hashCode()) * 31) + this.onInterruptProcess.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPukValueChanged=" + this.onPukValueChanged + ", onInterruptProcess=" + this.onInterruptProcess + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78213a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-451661163);
            if (p076m2.t.k()) {
                p076m2.t.o(-451661163, i15, -1, "pl.gov.coi.mobywatel.feature.eidservices.common.presentation.puk.mapper.EdoPukMapper.invoke.<anonymous> (EdoPukMapper.kt:50)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
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
    public static final l3 l(final Params params, final o oVar) {
        return new l3(new l() { // from class: gx1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.d().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public fx1.c.Data b(final Params params) {
        er.a<i0> aVarB;
        Label topBarTitle = params.getState().getPukScreenData().getTopBarTitle();
        NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        x50.a.MenuButtonData.b bVar = x50.a.MenuButtonData.b.f216847c;
        b bVar2 = b.f78213a;
        boolean zM = params.getState().getPukScreenData().getProcessInterruptDialogTitle().m();
        if (zM) {
            aVarB = params.c();
        } else {
            if (zM) {
                throw new oq.p();
            }
            aVarB = params.b();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(navigationButtonData, topBarTitle, null, !params.getState().getPukScreenData().getFirstScreenInFlow() ? new x50.a.Icon(new x50.a.MenuButtonData(bVar, bVar2, null, aVarB, 4, null)) : null, null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(j0.f120709c3);
        Label labelC2 = this.labelProvider.c(j0.f120699a3);
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j0.f120765o), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
        Label labelC3 = this.labelProvider.c(j0.f120704b3);
        Label labelB = mx.b.b(c0.e(params.getState().getPuk()), "puk");
        int iB = v4.t.INSTANCE.b();
        return new fx1.c.Data(baseScaffoldData, labelC, labelC2, aVarA, buttonData, new v50.c.Password(null, labelC3, null, labelB, params.getState().getPukValidationState(), null, null, new l() { // from class: gx1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, (String) obj);
            }
        }, null, false, iB, new l() { // from class: gx1.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (o) obj);
            }
        }, false, null, false, a0.INSTANCE.e(), null, null, new v50.c.Password.IconContentDescription(this.labelProvider.c(j0.f120700b), this.labelProvider.c(j0.f120710d)), null, 750437, null));
    }
}
