package lx0;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import kx0.State;
import kx0.h;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llx0/a;", "Lxw/f;", "Llx0/a$a;", "Lkx0/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Llx0/a$a;)Lkx0/h$a;", "a", "Lmx/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lx0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Llx0/a$a;", "", "Lkx0/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onGoToAddIdentityCard", "onGoToAddDiiaCard", "onGoToAddStudentCard", "<init>", "(Lkx0/g;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkx0/g;", "e", "()Lkx0/g;", "b", "Ler/a;", "()Ler/a;", "c", "d", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToAddIdentityCard;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToAddDiiaCard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToAddStudentCard;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onBackAction = aVar;
            this.onGoToAddIdentityCard = aVar2;
            this.onGoToAddDiiaCard = aVar3;
            this.onGoToAddStudentCard = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onGoToAddDiiaCard;
        }

        public final er.a<i0> c() {
            return this.onGoToAddIdentityCard;
        }

        public final er.a<i0> d() {
            return this.onGoToAddStudentCard;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onGoToAddIdentityCard, params.onGoToAddIdentityCard) && t.c(this.onGoToAddDiiaCard, params.onGoToAddDiiaCard) && t.c(this.onGoToAddStudentCard, params.onGoToAddStudentCard);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onGoToAddIdentityCard.hashCode()) * 31) + this.onGoToAddDiiaCard.hashCode()) * 31) + this.onGoToAddStudentCard.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onGoToAddIdentityCard=" + this.onGoToAddIdentityCard + ", onGoToAddDiiaCard=" + this.onGoToAddDiiaCard + ", onGoToAddStudentCard=" + this.onGoToAddStudentCard + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f121059a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1213900577);
            if (p076m2.t.k()) {
                p076m2.t.o(-1213900577, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.main.mapper.AddMainDocumentScreenMapper.invoke.<anonymous> (AddMainDocumentScreenMapper.kt:45)");
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
        public static final c f121060a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-50319392);
            if (p076m2.t.k()) {
                p076m2.t.o(-50319392, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.main.mapper.AddMainDocumentScreenMapper.invoke.<anonymous> (AddMainDocumentScreenMapper.kt:46)");
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
    public h.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(params.getState().getCanNavigateBack() ? new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()) : null, null, null, null, null, 30, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.L0, b.f121059a, c.f121060a, this.labelProvider.c(yw0.a.R), this.labelProvider.c(yw0.a.Q), null, 32, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(jz.a.K2, null, 2, null), null, null, 6, null), 3, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new h.Data(baseScaffoldData, icon, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yw0.a.f229993v), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yw0.a.f229992u), null, null, 0, 0, null, 62, null), 1, null), leadingSection, companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yw0.a.f229986o), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yw0.a.f229985n), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(jz.a.U2, null, 2, null), null, null, 6, null), 3, null), companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yw0.a.f229995x), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yw0.a.f229994w), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(jz.a.Q2, null, 2, null), null, null, 6, null), 3, null), companion.b(), null, 2301, null), params.a());
    }
}
