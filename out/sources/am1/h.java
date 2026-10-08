package am1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import yl1.Generating;
import yl1.Submitting;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lam1/h;", "Lxw/f;", "Lam1/h$a;", "Lyl1/i$a;", "Lmx/c;", "labelProvider", "Lam1/i;", "summaryModelMapper", "<init>", "(Lmx/c;Lam1/i;)V", "Lyl1/d$c;", "Lkotlin/Function1;", "", "Loq/i0;", "onChecked", "Lw30/a;", "f", "(Lyl1/d$c;Ler/l;)Lw30/a;", "params", "e", "(Lam1/h$a;)Lyl1/i$a;", "a", "Lmx/c;", "b", "Lam1/i;", "Lkk1/a;", "", "c", "(Lkk1/a;)I", "applyForNewIdAlertResId", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, yl1.i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i summaryModelMapper;

    /* JADX INFO: renamed from: am1.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0018\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Lam1/h$a;", "", "Lyl1/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onStatementChecked", "Lkotlin/Function0;", "onScrolledToError", "backAction", "closeAction", "nextAction", "<init>", "(Lyl1/d;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyl1/d;", "f", "()Lyl1/d;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "d", "()Ler/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yl1.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(yl1.d dVar, l<? super Boolean, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.onStatementChecked = lVar;
            this.onScrolledToError = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
            this.nextAction = aVar4;
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

        public final er.a<i0> d() {
            return this.onScrolledToError;
        }

        public final l<Boolean, i0> e() {
            return this.onStatementChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onScrolledToError, params.onScrolledToError) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final yl1.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onStatementChecked.hashCode()) * 31) + this.onScrolledToError.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onStatementChecked=" + this.onStatementChecked + ", onScrolledToError=" + this.onScrolledToError + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7798a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7798a = iArr;
        }
    }

    public h(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.summaryModelMapper = iVar;
    }

    private final int c(kk1.a aVar) {
        int i15 = b.f7798a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.C0;
        }
        if (i15 == 2) {
            return gk1.a.D0;
        }
        throw new p();
    }

    private final CheckBoxSingleData f(yl1.d.StatementData statementData, l<? super Boolean, i0> lVar) {
        r30.b error;
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, statementData.getIsChecked(), lVar, this.labelProvider.c(gk1.a.f73445n), null, null, null, null, 241, null);
        boolean showError = statementData.getShowError();
        if (showError) {
            error = new r30.b.Error(null, this.labelProvider.c(gk1.a.f73432g0), 1, null);
        } else {
            if (showError) {
                throw new p();
            }
            error = r30.b.a.f171263a;
        }
        return new CheckBoxSingleData(checkBoxRowData, error, null, false, null, 28, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yl1.i.a b(Params params) {
        yl1.d state = params.getState();
        if (state instanceof yl1.d.a) {
            return new yl1.i.a.Error(((yl1.d.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof Generating) && !(state instanceof Submitting) && !(state instanceof yl1.d.Initialized)) {
            throw new p();
        }
        return new yl1.i.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gk1.a.E0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(gk1.a.f73427e), new yl1.i.a.Initialized.Alerts(new c30.b.e(null, null, null, this.labelProvider.c(c(params.getState().getType())), null, null, null, 119, null), new c30.b.c(null, null, null, this.labelProvider.c(gk1.a.f73436i0), null, null, null, 119, null)), this.summaryModelMapper.b(new i.Params(params.getState().getType(), params.getState().getModel())), new yl1.i.a.Initialized.Statement(this.labelProvider.c(gk1.a.f73430f0), f(params.getState().getStatementData(), params.e()), params.getState().getStatementData().getScrollTo(), params.d()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gk1.a.f73426d0), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
