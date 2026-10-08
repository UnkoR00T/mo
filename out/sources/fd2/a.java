package fd2;

import al0.c0;
import androidx.compose.ui.graphics.Color;
import dd2.State;
import er.p;
import fr.t;
import gd2.SummaryModel;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u00020\u0014*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00020\u0014*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lfd2/a;", "Lxw/f;", "Lfd2/a$a;", "Ldd2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liy/b0;", "", "tag", "Lmx/a;", "i", "(Liy/b0;Ljava/lang/String;)Lmx/a;", "params", "h", "(Lfd2/a$a;)Ldd2/c$a;", "a", "Lmx/c;", "Lal0/c0;", "", "f", "(Lal0/c0;)I", "titleResId", "Lgd2/a;", "c", "(Lgd2/a;)I", "alertTextResId", "e", "descriptionResId", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, dd2.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: fd2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfd2/a$a;", "", "Ldd2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseClick", "onConfirmButtonClick", "<init>", "(Ldd2/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldd2/b;", "d", "()Ldd2/b;", "b", "Ler/a;", "()Ler/a;", "c", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f61558e = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmButtonClick;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onConfirmButtonClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onConfirmButtonClick;
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onConfirmButtonClick, params.onConfirmButtonClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onConfirmButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onConfirmButtonClick=" + this.onConfirmButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61563a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.UNSUSPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61563a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f61564a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-383529911);
            if (p076m2.t.k()) {
                p076m2.t.o(-383529911, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardsuspension.presentation.summary.mapper.SummaryMapper.invoke.<anonymous> (SummaryMapper.kt:51)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(SummaryModel summaryModel) {
        int i15 = b.f61563a[summaryModel.getAction().ordinal()];
        if (i15 == 1) {
            return uc2.a.f197482p;
        }
        if (i15 == 2) {
            return uc2.a.f197491y;
        }
        throw new oq.p();
    }

    private final int e(c0 c0Var) {
        int i15 = b.f61563a[c0Var.ordinal()];
        if (i15 == 1) {
            return uc2.a.f197483q;
        }
        if (i15 == 2) {
            return uc2.a.f197492z;
        }
        throw new oq.p();
    }

    private final int f(c0 c0Var) {
        int i15 = b.f61563a[c0Var.ordinal()];
        if (i15 == 1) {
            return uc2.a.f197484r;
        }
        if (i15 == 2) {
            return uc2.a.A;
        }
        throw new oq.p();
    }

    private final Label i(b0 b0Var, String str) {
        return mx.b.b(iy.c0.e(b0Var), str);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public dd2.c.Data b(Params params) {
        return new dd2.c.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(uc2.a.f197474h), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f61564a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(f(params.getState().getModel().getAction())), this.labelProvider.c(e(params.getState().getModel().getAction())), new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(uc2.a.f197469c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(params.getState().getModel().getUserEdorAddress(), "communicationAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(uc2.a.f197488v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(params.getState().getModel().getIdCardSeriesAndNumber(), "idCardSeriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new c30.b.c(null, null, null, this.labelProvider.c(c(params.getState().getModel())), null, null, null, 119, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uc2.a.f197468b), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }
}
