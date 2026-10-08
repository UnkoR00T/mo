package bs3;

import androidx.compose.ui.graphics.Color;
import cb4.DialogData;
import cj0.ZusEVisitHours;
import cj0.ZusEVisitTerm;
import cs3.CarouselSegmentData;
import cs3.SelectedTermSegmentData;
import er.l;
import er.p;
import ez.e;
import fr.t;
import i30.ButtonIconData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageData;
import q40.j;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002)+B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ]\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lbs3/c;", "Lxw/f;", "Lbs3/c$b;", "Las3/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lnr3/f;", "formatDateWithEmphasizedNearestDayUseCase", "Lrs3/b;", "newVisitWizardExitDialogMapper", "<init>", "(Lmx/c;Lez/e;Lnr3/f;Lrs3/b;)V", "Las3/e$b;", "Lkotlin/Function1;", "", "Loq/i0;", "onSelectTerm", "onHourClick", "Lcb4/d;", "showExitDialogAction", "Lkotlin/Function0;", "onCloseAction", "Las3/f$a$a;", "h", "(Las3/e$b;Ler/l;Ler/l;Ler/l;Ler/a;)Las3/f$a$a;", "", "Lcj0/m;", "zusEVisitTerms", "Lcs3/a;", "l", "(Ljava/util/List;)Ljava/util/List;", "term", "selectedTerm", "Lcs3/b;", "m", "(Lcj0/m;ILer/l;)Lcs3/b;", "params", "f", "(Lbs3/c$b;)Las3/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lnr3/f;", "d", "Lrs3/b;", "e", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, as3.f.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21369f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nr3.f formatDateWithEmphasizedNearestDayUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rs3.b newVisitWizardExitDialogMapper;

    /* JADX INFO: renamed from: bs3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Lbs3/c$b;", "", "Las3/e;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onSelectTerm", "onHourClick", "Lcb4/d;", "showExitDialogAction", "Lkotlin/Function0;", "onCloseAction", "<init>", "(Las3/e;Ler/l;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Las3/e;", "e", "()Las3/e;", "b", "Ler/l;", "c", "()Ler/l;", "d", "Ler/a;", "()Ler/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final as3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onSelectTerm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onHourClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DialogData, i0> showExitDialogAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(as3.e eVar, l<? super Integer, i0> lVar, l<? super Integer, i0> lVar2, l<? super DialogData, i0> lVar3, er.a<i0> aVar) {
            this.state = eVar;
            this.onSelectTerm = lVar;
            this.onHourClick = lVar2;
            this.showExitDialogAction = lVar3;
            this.onCloseAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        public final l<Integer, i0> b() {
            return this.onHourClick;
        }

        public final l<Integer, i0> c() {
            return this.onSelectTerm;
        }

        public final l<DialogData, i0> d() {
            return this.showExitDialogAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final as3.e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectTerm, params.onSelectTerm) && t.c(this.onHourClick, params.onHourClick) && t.c(this.showExitDialogAction, params.showExitDialogAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onSelectTerm.hashCode()) * 31) + this.onHourClick.hashCode()) * 31) + this.showExitDialogAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectTerm=" + this.onSelectTerm + ", onHourClick=" + this.onHourClick + ", showExitDialogAction=" + this.showExitDialogAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    /* JADX INFO: renamed from: bs3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0556c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0556c f21379a = new C0556c();

        C0556c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1435589088);
            if (p076m2.t.k()) {
                p076m2.t.o(-1435589088, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedate.mapper.ChooseDateScreenMapper.map.<anonymous> (ChooseDateScreenMapper.kt:80)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar, e eVar, nr3.f fVar, rs3.b bVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.formatDateWithEmphasizedNearestDayUseCase = fVar;
        this.newVisitWizardExitDialogMapper = bVar;
    }

    private final as3.f.a.InterfaceC0313a h(as3.e.LoadedTerms loadedTerms, l<? super Integer, i0> lVar, l<? super Integer, i0> lVar2, final l<? super DialogData, i0> lVar3, final er.a<i0> aVar) {
        boolean zIsEmpty = loadedTerms.d().isEmpty();
        if (zIsEmpty) {
            return new as3.f.a.InterfaceC0313a.Empty(new IconPageData(j.b.d.f164690d, this.labelProvider.c(ir3.a.f96821s0), this.labelProvider.c(ir3.a.f96818r0), null, null, null, true, 8, null), new ButtonIconData(null, jz.a.Y, C0556c.f21379a, null, null, new er.a() { // from class: bs3.b
                @Override // er.a
                public final Object a() {
                    return c.i(lVar3, this, aVar);
                }
            }, 25, null));
        }
        if (zIsEmpty) {
            throw new oq.p();
        }
        return new as3.f.a.InterfaceC0313a.LoadedTerms(this.labelProvider.c(ir3.a.f96827u0), this.labelProvider.e(ir3.a.f96824t0, ""), l(loadedTerms.d()), m(loadedTerms.d().get(loadedTerms.getSelectedTermIndex()), loadedTerms.getSelectedTermIndex(), lVar2), loadedTerms.getSelectedTermIndex(), lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, c cVar, er.a aVar) {
        lVar.b(cVar.newVisitWizardExitDialogMapper.b(new rs3.b.Params(aVar)));
        return i0.f148189a;
    }

    private final List<CarouselSegmentData> l(List<ZusEVisitTerm> zusEVisitTerms) {
        List<ZusEVisitTerm> list = zusEVisitTerms;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            ZusEVisitTerm zusEVisitTerm = (ZusEVisitTerm) obj;
            String strB = this.formatDateWithEmphasizedNearestDayUseCase.b(new nr3.f.Param(zusEVisitTerm.getVisitDate(), nr3.f.b.c.f138011a));
            String strD = this.dateFormatter.d(new fz.b.LocalDate(zusEVisitTerm.getVisitDate()), fz.c.DOTTED);
            arrayList.add(new CarouselSegmentData(ZusEVisitTerm.INSTANCE.a(zusEVisitTerm, this.dateFormatter), mx.b.b(strB, "carouselDayOfWeekValue" + i15), mx.b.b(strD, "carouselDateValue" + i15), mx.b.b(String.valueOf(zusEVisitTerm.a().size()), "carouselFreeTermsValueValue" + i15)));
            i15 = i16;
        }
        return arrayList;
    }

    private final SelectedTermSegmentData m(ZusEVisitTerm term, int selectedTerm, final l<? super Integer, i0> onHourClick) {
        Label labelB = mx.b.b(this.formatDateWithEmphasizedNearestDayUseCase.b(new nr3.f.Param(term.getVisitDate(), nr3.f.b.a.f138009a)), "dateValue" + selectedTerm);
        List<ZusEVisitHours> listA = term.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        final int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: bs3.a
                @Override // er.a
                public final Object a() {
                    return c.q(onHourClick, i15);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(((ZusEVisitHours) obj).getTimeFrom(), "timeValue" + selectedTerm + '_' + i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
            i15 = i16;
        }
        return new SelectedTermSegmentData(labelB, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public as3.f.a b(Params params) {
        return params.getState() instanceof as3.e.LoadedTerms ? h((as3.e.LoadedTerms) params.getState(), params.c(), params.b(), params.d(), params.a()) : as3.f.a.b.f14358a;
    }
}
