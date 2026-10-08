package rs3;

import androidx.compose.ui.graphics.Color;
import cb4.DialogData;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zr3.State;
import zr3.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrs3/d;", "Lxw/f;", "Lrs3/d$a;", "Lzr3/p$a;", "Lmx/c;", "labelProvider", "Lrs3/b;", "newVisitWizardExitDialogMapper", "<init>", "(Lmx/c;Lrs3/b;)V", "params", "e", "(Lrs3/d$a;)Lzr3/p$a;", "a", "Lmx/c;", "b", "Lrs3/b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, p.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rs3.b newVisitWizardExitDialogMapper;

    /* JADX INFO: renamed from: rs3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u0019\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, d2 = {"Lrs3/d$a;", "", "Lzr3/o;", "state", "Lss3/a;", "newVisitState", "Lkotlin/Function0;", "Loq/i0;", "close", "backClickAction", "Lkotlin/Function1;", "Lcb4/d;", "showExitDialogAction", "<init>", "(Lzr3/o;Lss3/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzr3/o;", "d", "()Lzr3/o;", "b", "Lss3/a;", "getNewVisitState", "()Lss3/a;", "c", "Ler/a;", "()Ler/a;", "e", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ss3.a newVisitState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backClickAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DialogData, i0> showExitDialogAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, ss3.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super DialogData, i0> lVar) {
            this.state = state;
            this.newVisitState = aVar;
            this.close = aVar2;
            this.backClickAction = aVar3;
            this.showExitDialogAction = lVar;
        }

        public final er.a<i0> a() {
            return this.backClickAction;
        }

        public final er.a<i0> b() {
            return this.close;
        }

        public final l<DialogData, i0> c() {
            return this.showExitDialogAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && this.newVisitState == params.newVisitState && t.c(this.close, params.close) && t.c(this.backClickAction, params.backClickAction) && t.c(this.showExitDialogAction, params.showExitDialogAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.newVisitState.hashCode()) * 31) + this.close.hashCode()) * 31) + this.backClickAction.hashCode()) * 31) + this.showExitDialogAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", newVisitState=" + this.newVisitState + ", close=" + this.close + ", backClickAction=" + this.backClickAction + ", showExitDialogAction=" + this.showExitDialogAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f175949a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-641290203);
            if (p076m2.t.k()) {
                p076m2.t.o(-641290203, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.mapper.NewVisitWizardScreenMapper.invoke.<anonymous> (NewVisitWizardScreenMapper.kt:56)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar, rs3.b bVar) {
        this.labelProvider = cVar;
        this.newVisitWizardExitDialogMapper = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, d dVar) {
        params.c().b(dVar.newVisitWizardExitDialogMapper.b(new rs3.b.Params(params.b())));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p.Data b(final Params params) {
        NavigationButtonData navigationButtonData;
        er.a aVar = new er.a() { // from class: rs3.c
            @Override // er.a
            public final Object a() {
                return d.f(params, this);
            }
        };
        Label labelC = this.labelProvider.c(ir3.a.f96815q0);
        boolean backNavigationVisible = params.getState().getBackNavigationVisible();
        if (backNavigationVisible) {
            navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        } else {
            if (backNavigationVisible) {
                throw new oq.p();
            }
            navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar);
        }
        return new p.Data(new BaseScaffoldData(null, params.getState().getTopContentVisible() ? new i.Small(navigationButtonData, labelC, null, params.getState().getBackNavigationVisible() ? new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f175949a, null, aVar, 4, null)) : null, null, 20, null) : null, null, null, null, null, 61, null), params.a());
    }
}
