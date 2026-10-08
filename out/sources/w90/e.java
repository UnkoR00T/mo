package w90;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import u90.ActivationThemeColors;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw90/e;", "Lxw/f;", "Lw90/e$a;", "Lv90/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lw90/e$a;)Lv90/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onActivateAction", "onCancelAction", "Lcb4/d;", "e", "(Ler/a;Ler/a;)Lcb4/d;", "onTerminateAction", "onAbortTerminateDialogAction", "f", "a", "Lmx/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, v90.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: w90.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lw90/e$a;", "", "Lv90/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onTryAgainAction", "onShowTerminateDialogAction", "<init>", "(Lv90/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv90/b;", "d", "()Lv90/b;", "b", "Ler/a;", "()Ler/a;", "c", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v90.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTryAgainAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowTerminateDialogAction;

        public Params(v90.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onCloseAction = aVar;
            this.onTryAgainAction = aVar2;
            this.onShowTerminateDialogAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.onShowTerminateDialogAction;
        }

        public final er.a<i0> c() {
            return this.onTryAgainAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v90.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onTryAgainAction, params.onTryAgainAction) && t.c(this.onShowTerminateDialogAction, params.onShowTerminateDialogAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onTryAgainAction.hashCode()) * 31) + this.onShowTerminateDialogAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onTryAgainAction=" + this.onTryAgainAction + ", onShowTerminateDialogAction=" + this.onShowTerminateDialogAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f211155a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-792518909);
            if (p076m2.t.k()) {
                p076m2.t.o(-792518909, i15, -1, "pl.gov.coi.mjunior.feature.activation.presentation.screen.activation.mapper.ActivationMapper.invoke.<anonymous> (ActivationMapper.kt:50)");
            }
            long headerIconBackground = ((ActivationThemeColors) rVar.N(u90.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f211156a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(828289146);
            if (p076m2.t.k()) {
                p076m2.t.o(828289146, i15, -1, "pl.gov.coi.mjunior.feature.activation.presentation.screen.activation.mapper.ActivationMapper.invoke.<anonymous> (ActivationMapper.kt:65)");
            }
            long headerIconBackground = ((ActivationThemeColors) rVar.N(u90.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v90.c.a b(Params params) {
        Label labelC;
        v90.b state = params.getState();
        if ((state instanceof v90.b.InitActivation) || (state instanceof v90.b.GetActivationChallenge) || (state instanceof v90.b.StartActivation) || (state instanceof v90.b.g) || (state instanceof v90.b.InitAsyncDataDownload)) {
            return new v90.c.a.LoadingScreenData(new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106797j, null, b.f211155a, this.labelProvider.c(r90.a.f172440t), Label.INSTANCE.c(), null, 34, null), this.labelProvider.c(r90.a.f172439s), null, null, 24, null);
        }
        if (!(state instanceof v90.b.ObserveAsyncDataDownload)) {
            if (!(state instanceof v90.b.a)) {
                if (state instanceof v90.b.Error) {
                    return new v90.c.a.Error(((v90.b.Error) params.getState()).getErrorVMS());
                }
                throw new oq.p();
            }
            return new v90.c.a.FailureScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.a.f164684d, this.labelProvider.c(r90.a.f172427g), this.labelProvider.c(r90.a.f172437q), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r90.a.f172431k), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r90.a.f172424d), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.a(), 35, null), null, 4, null), true, 8, null));
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106797j, null, c.f211156a, this.labelProvider.c(r90.a.f172440t), Label.INSTANCE.c(), null, 34, null);
        boolean allowTermination = ((v90.b.ObserveAsyncDataDownload) params.getState()).getAllowTermination();
        if (allowTermination) {
            labelC = this.labelProvider.c(r90.a.f172426f).o(mx.b.b("\n", "")).o(this.labelProvider.c(r90.a.f172425e));
        } else {
            if (allowTermination) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(r90.a.f172439s);
        }
        Label label = labelC;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r90.a.f172423c), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        if (!((v90.b.ObserveAsyncDataDownload) params.getState()).getAllowTermination()) {
            buttonData = null;
        }
        return new v90.c.a.LoadingScreenData(baseScaffoldData, icon, label, buttonData, ((v90.b.ObserveAsyncDataDownload) params.getState()).getTerminationDialog());
    }

    public final DialogData e(er.a<i0> onActivateAction, er.a<i0> onCancelAction) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(r90.a.f172442v), this.labelProvider.c(r90.a.f172441u), new DialogButtonTextData(this.labelProvider.c(r90.a.f172421a), null, onActivateAction, 2, null), new DialogButtonTextData(this.labelProvider.c(r90.a.f172422b), null, onCancelAction, 2, null), null, null, 96, null);
    }

    public final DialogData f(er.a<i0> onTerminateAction, er.a<i0> onAbortTerminateDialogAction) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(r90.a.f172429i), this.labelProvider.c(r90.a.C), new DialogButtonTextData(this.labelProvider.c(r90.a.f172423c), null, onTerminateAction, 2, null), new DialogButtonTextData(this.labelProvider.c(r90.a.f172422b), null, onAbortTerminateDialogAction, 2, null), null, onAbortTerminateDialogAction, 32, null);
    }
}
