package q83;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq83/a;", "Lxw/f;", "Lq83/a$a;", "Lp83/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lq83/a$a;)Lp83/c$a;", "a", "Lmx/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, p83.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q83.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001a"}, d2 = {"Lq83/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "openQuestionsAndAnswersUrl", "goToReportError", "dialHotline", "<init>", "(Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "d", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openQuestionsAndAnswersUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToReportError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> dialHotline;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.onBackAction = aVar;
            this.openQuestionsAndAnswersUrl = aVar2;
            this.goToReportError = aVar3;
            this.dialHotline = aVar4;
        }

        public final er.a<i0> a() {
            return this.dialHotline;
        }

        public final er.a<i0> b() {
            return this.goToReportError;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.openQuestionsAndAnswersUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onBackAction, params.onBackAction) && t.c(this.openQuestionsAndAnswersUrl, params.openQuestionsAndAnswersUrl) && t.c(this.goToReportError, params.goToReportError) && t.c(this.dialHotline, params.dialHotline);
        }

        public int hashCode() {
            return (((((this.onBackAction.hashCode() * 31) + this.openQuestionsAndAnswersUrl.hashCode()) * 31) + this.goToReportError.hashCode()) * 31) + this.dialHotline.hashCode();
        }

        public String toString() {
            return "Params(onBackAction=" + this.onBackAction + ", openQuestionsAndAnswersUrl=" + this.openQuestionsAndAnswersUrl + ", goToReportError=" + this.goToReportError + ", dialHotline=" + this.dialHotline + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f165356a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(223313748);
            if (p076m2.t.k()) {
                p076m2.t.o(223313748, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.main.mapper.TechnicalSupportMapper.invoke.<anonymous> (TechnicalSupportMapper.kt:49)");
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
        public static final c f165357a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1508376277);
            if (p076m2.t.k()) {
                p076m2.t.o(1508376277, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.main.mapper.TechnicalSupportMapper.invoke.<anonymous> (TechnicalSupportMapper.kt:50)");
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

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p83.c.Data b(Params params) {
        return new p83.c.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(l83.a.O0), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106752d0, b.f165356a, c.f165357a, this.labelProvider.c(l83.a.O0), this.labelProvider.c(l83.a.f116994n), null, 32, null), new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(l83.a.S0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(l83.a.R0), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null), new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(l83.a.U0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(l83.a.T0), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null), new c30.b.c(null, null, this.labelProvider.c(l83.a.Q0), this.labelProvider.c(l83.a.P0), null, null, new c30.a.ButtonText(new ButtonTextData(null, mx.b.b("+48 42 253 54 74", "hotlinePhoneNumber"), null, null, params.a(), 13, null)), 51, null), params.c());
    }
}
