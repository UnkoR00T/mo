package he1;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import b50.e;
import er.l;
import er.p;
import fr.t;
import ge1.State;
import ge1.m;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhe1/c;", "Lxw/f;", "Lhe1/c$a;", "Lge1/m$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "params", "f", "(Lhe1/c$a;)Lge1/m$a;", "a", "Lmx/c;", "b", "Lia1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, m.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: he1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u0019\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Lhe1/c$a;", "", "Lge1/l;", "state", "Lkotlin/Function1;", "Lde1/b;", "Loq/i0;", "onSelectAnswer", "", "onGoToGovPlClick", "Lkotlin/Function0;", "nextAction", "backAction", "closeAction", "<init>", "(Lge1/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lge1/l;", "f", "()Lge1/l;", "b", "Ler/l;", "e", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<de1.b, i0> onSelectAnswer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGoToGovPlClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super de1.b, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onSelectAnswer = lVar;
            this.onGoToGovPlClick = lVar2;
            this.nextAction = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
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

        public final l<String, i0> d() {
            return this.onGoToGovPlClick;
        }

        public final l<de1.b, i0> e() {
            return this.onSelectAnswer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectAnswer, params.onSelectAnswer) && t.c(this.onGoToGovPlClick, params.onGoToGovPlClick) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSelectAnswer.hashCode()) * 31) + this.onGoToGovPlClick.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAnswer=" + this.onSelectAnswer + ", onGoToGovPlClick=" + this.onGoToGovPlClick + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83976a;

        static {
            int[] iArr = new int[de1.b.values().length];
            try {
                iArr[de1.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f83976a = iArr;
        }
    }

    /* JADX INFO: renamed from: he1.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1932c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1932c f83977a = new C1932c();

        C1932c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(76293893);
            if (p076m2.t.k()) {
                p076m2.t.o(76293893, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.incometaxexceededcertificate.mapper.IncomeTaxExceededCertificateMapper.invoke.<anonymous> (IncomeTaxExceededCertificateMapper.kt:53)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.e().b(de1.b.SUBMIT_STATEMENT);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.e().b(de1.b.OWN_STATEMENT);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, C1932c.f83977a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82520v5);
        Label labelC2 = this.labelProvider.c(ha1.a.f82513u5);
        List listQ = v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getIncomeTaxExceededCertificateAnswer() == de1.b.SUBMIT_STATEMENT, false, 5, null), new er.a() { // from class: he1.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(ha1.a.f82499s5), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getIncomeTaxExceededCertificateAnswer() == de1.b.OWN_STATEMENT, false, 5, null), new er.a() { // from class: he1.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, this.labelProvider.c(ha1.a.f82506t5), null, null, 24, null));
        e.a aVar = e.a.f16684a;
        de1.b incomeTaxExceededCertificateAnswer = params.getState().getIncomeTaxExceededCertificateAnswer();
        return new m.Data(baseScaffoldData, labelC, labelC2, new RadioButtonData(listQ, aVar, (incomeTaxExceededCertificateAnswer == null ? -1 : b.f83976a[incomeTaxExceededCertificateAnswer.ordinal()]) == 1 ? new d.Error(this.labelProvider.c(ha1.a.f82426j)) : d.c.f16683a, null, null, null, null, 120, null), new c30.b.c(null, null, null, this.labelProvider.c(ha1.a.f82492r5), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(ha1.a.D), this.companyEndpoints.t(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
