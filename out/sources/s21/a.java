package s21;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import k30.d;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r21.g;
import r30.CheckBoxRowData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ls21/a;", "Lxw/f;", "Ls21/a$a;", "Lr21/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Ls21/a$a;)Lr21/g$a;", "a", "Lmx/c;", "", "Lt40/a$a;", "c", "()Ljava/util/List;", "bullets", "Lr21/f$a;", "Lr30/b;", "e", "(Lr21/f$a;)Lr30/b;", "checkboxType", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s21.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001b\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Ls21/a$a;", "", "Lr21/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onAgreementAccepted", "Lkotlin/Function0;", "onScrolledToAgreement", "onClose", "onNext", "<init>", "(Lr21/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lr21/f;", "e", "()Lr21/f;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "d", "()Ler/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r21.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onAgreementAccepted;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToAgreement;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(r21.f fVar, l<? super Boolean, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = fVar;
            this.onAgreementAccepted = lVar;
            this.onScrolledToAgreement = aVar;
            this.onClose = aVar2;
            this.onNext = aVar3;
        }

        public final l<Boolean, i0> a() {
            return this.onAgreementAccepted;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onNext;
        }

        public final er.a<i0> d() {
            return this.onScrolledToAgreement;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final r21.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onAgreementAccepted, params.onAgreementAccepted) && t.c(this.onScrolledToAgreement, params.onScrolledToAgreement) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onAgreementAccepted.hashCode()) * 31) + this.onScrolledToAgreement.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAgreementAccepted=" + this.onAgreementAccepted + ", onScrolledToAgreement=" + this.onScrolledToAgreement + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f177633a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2119889022);
            if (p076m2.t.k()) {
                p076m2.t.o(2119889022, i15, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.welcome.mapper.WelcomeMapper.invoke.<anonymous> (WelcomeMapper.kt:48)");
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
        public static final c f177634a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-151578723);
            if (p076m2.t.k()) {
                p076m2.t.o(-151578723, i15, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.welcome.mapper.WelcomeMapper.invoke.<anonymous> (WelcomeMapper.kt:49)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<t40.a.C4874a> c() {
        mx.c cVar = this.labelProvider;
        return v.q(new t40.a.C4874a(cVar.c(a21.a.f2086e0)), new t40.a.C4874a(cVar.c(a21.a.f2088f0)), new t40.a.C4874a(cVar.c(a21.a.f2090g0)), new t40.a.C4874a(cVar.c(a21.a.f2092h0)));
    }

    private final r30.b e(r21.f.Initialized initialized) {
        boolean showValidationError = initialized.getShowValidationError();
        if (showValidationError) {
            return new r30.b.Error(null, this.labelProvider.c(a21.a.f2118u0), 1, null);
        }
        if (showValidationError) {
            throw new oq.p();
        }
        return r30.b.a.f171263a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        r21.f state = params.getState();
        if (t.c(state, r21.f.b.f170872a)) {
            return g.a.b.f170883a;
        }
        if (!(state instanceof r21.f.Initialized)) {
            throw new oq.p();
        }
        return new g.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.S0, b.f177633a, c.f177634a, this.labelProvider.c(a21.a.f2096j0), this.labelProvider.c(a21.a.f2094i0), null, 32, null), new InfoRowListData(c()), new g.a.Initialized.AgreementData(this.labelProvider.c(a21.a.f2116t0), new CheckBoxSingleData(new CheckBoxRowData(null, ((r21.f.Initialized) params.getState()).getIsAgreementAccepted(), params.a(), this.labelProvider.c(a21.a.f2084d0), null, null, null, null, 241, null), e((r21.f.Initialized) params.getState()), null, false, null, 28, null)), ((r21.f.Initialized) params.getState()).getScrollToAgreement(), params.d(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(a21.a.f2110q0), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }
}
