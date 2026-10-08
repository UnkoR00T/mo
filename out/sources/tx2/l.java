package tx2;

import al0.Adult;
import al0.Child;
import al0.Ward;
import al0.b0;
import al0.x0;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import rx2.State;
import ux2.Section;
import ux2.StatementSection;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u00020\u0016*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ltx2/l;", "Lxw/f;", "Ltx2/l$a;", "Lrx2/c$a;", "Lmx/c;", "labelProvider", "Ltx2/a;", "adultToSectionsMapper", "Ltx2/m;", "underLegalGuardianshipToSectionsMapper", "<init>", "(Lmx/c;Ltx2/a;Ltx2/m;)V", "params", "f", "(Ltx2/l$a;)Lrx2/c$a;", "a", "Lmx/c;", "b", "Ltx2/a;", "c", "Ltx2/m;", "Lal0/b0;", "Lal0/g;", "e", "(Lal0/b0;)Lal0/g;", "applicationOwnerWithAge", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, rx2.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a adultToSectionsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m underLegalGuardianshipToSectionsMapper;

    /* JADX INFO: renamed from: tx2.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Ltx2/l$a;", "", "Lrx2/b;", "state", "Lkotlin/Function1;", "Lal0/g;", "Loq/i0;", "onSendApplicationButtonClick", "", "onStatementChecked", "Lkotlin/Function0;", "onScrolledToStatement", "onBack", "onClose", "<init>", "(Lrx2/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrx2/b;", "f", "()Lrx2/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<al0.g, i0> onSendApplicationButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToStatement;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super al0.g, i0> lVar, er.l<? super Boolean, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onSendApplicationButtonClick = lVar;
            this.onStatementChecked = lVar2;
            this.onScrolledToStatement = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onScrolledToStatement;
        }

        public final er.l<al0.g, i0> d() {
            return this.onSendApplicationButtonClick;
        }

        public final er.l<Boolean, i0> e() {
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
            return t.c(this.state, params.state) && t.c(this.onSendApplicationButtonClick, params.onSendApplicationButtonClick) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onScrolledToStatement, params.onScrolledToStatement) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSendApplicationButtonClick.hashCode()) * 31) + this.onStatementChecked.hashCode()) * 31) + this.onScrolledToStatement.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSendApplicationButtonClick=" + this.onSendApplicationButtonClick + ", onStatementChecked=" + this.onStatementChecked + ", onScrolledToStatement=" + this.onScrolledToStatement + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public l(mx.c cVar, a aVar, m mVar) {
        this.labelProvider = cVar;
        this.adultToSectionsMapper = aVar;
        this.underLegalGuardianshipToSectionsMapper = mVar;
    }

    private final al0.g e(b0 b0Var) {
        if (b0Var instanceof Child) {
            return new al0.g.Child(((Child) b0Var).getChildData().getAge());
        }
        if (b0Var instanceof Adult) {
            return al0.g.b.f7359a;
        }
        if (b0Var instanceof Ward) {
            return new al0.g.Ward(((Ward) b0Var).getChildData().getAge());
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, al0.g gVar) {
        params.d().b(gVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rx2.c.Data b(final Params params) {
        List<Section> listB;
        final al0.g gVarE = e(params.getState().getData());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.M2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(gv2.a.f77266i0);
        Label labelC2 = this.labelProvider.c(gv2.a.L2);
        b0 data = params.getState().getData();
        if (data instanceof Adult) {
            listB = this.adultToSectionsMapper.b(new a.Params(gVarE, (Adult) data));
        } else {
            if (!(data instanceof x0)) {
                throw new p();
            }
            listB = this.underLegalGuardianshipToSectionsMapper.b(new m.Params(gVarE, (x0) data));
        }
        return new rx2.c.Data(baseScaffoldData, labelC, labelC2, listB, new StatementSection(this.labelProvider.c(gv2.a.f77251f0), new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getIsStatementChecked(), params.e(), this.labelProvider.c(gv2.a.R2), null, null, null, null, 241, null), params.getState().getShowStatementError() ? new r30.b.Error(null, this.labelProvider.c(gv2.a.f77256g0), 1, null) : r30.b.a.f171263a, null, false, null, 28, null)), new c30.b.c(null, null, null, this.labelProvider.c(gv2.a.Q2), null, null, null, 119, null), params.getState().getScrollToStatement(), params.c(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P2), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: tx2.k
            @Override // er.a
            public final Object a() {
                return l.h(params, gVarE);
            }
        }, 35, null));
    }
}
