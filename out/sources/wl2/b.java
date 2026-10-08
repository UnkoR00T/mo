package wl2;

import androidx.compose.ui.graphics.Color;
import c20.d;
import dz.e;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r50.g;
import sq0.BENationalCourtRegisterEntry;
import sq0.BESubscription;
import vl2.Entry;
import vl2.Header;
import vl2.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lwl2/b;", "Lxw/f;", "Lwl2/b$a;", "Lvl2/c$a;", "Lmx/c;", "labelProvider", "Lez/b;", "dateCalculator", "<init>", "(Lmx/c;Lez/b;)V", "", "testTag", "Lmx/a;", "listHeader", "", "Lsq0/h;", "entries", "Lkotlin/Function1;", "Loq/i0;", "onClickEntry", "", "e", "(Ljava/lang/String;Lmx/a;Ljava/util/List;Ler/l;)Ljava/util/List;", "params", "i", "(Lwl2/b$a;)Lvl2/c$a;", "entry", "Lr50/a;", "h", "(Lsq0/h;)Lr50/a;", "a", "Lmx/c;", "b", "Lez/b;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: wl2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lwl2/b$a;", "", "Lvl2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lsq0/h;", "onClickEntry", "<init>", "(Lvl2/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvl2/b;", "c", "()Lvl2/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vl2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BENationalCourtRegisterEntry, i0> onClickEntry;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(vl2.b bVar, er.a<i0> aVar, l<? super BENationalCourtRegisterEntry, i0> lVar) {
            this.state = bVar;
            this.onBack = aVar;
            this.onClickEntry = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<BENationalCourtRegisterEntry, i0> b() {
            return this.onClickEntry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final vl2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClickEntry, params.onClickEntry);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClickEntry.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClickEntry=" + this.onClickEntry + ')';
        }
    }

    /* JADX INFO: renamed from: wl2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5664b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5664b f214070a = new C5664b();

        C5664b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1009467833);
            if (p076m2.t.k()) {
                p076m2.t.o(-1009467833, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.mapper.WelcomeScreenMapper.invoke.<anonymous> (WelcomeScreenMapper.kt:61)");
            }
            long jA = ((ol2.a) rVar.N(ol2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(mx.c cVar, ez.b bVar) {
        this.labelProvider = cVar;
        this.dateCalculator = bVar;
    }

    private final List<Object> e(String testTag, Label listHeader, List<BENationalCourtRegisterEntry> entries, final l<? super BENationalCourtRegisterEntry, i0> onClickEntry) {
        List listE = v.e(new Header(listHeader));
        List<BENationalCourtRegisterEntry> list = entries;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final BENationalCourtRegisterEntry bENationalCourtRegisterEntry = (BENationalCourtRegisterEntry) obj;
            Label labelE = this.labelProvider.e(hl2.a.f85273r, bENationalCourtRegisterEntry.getNumber());
            Label labelE2 = this.labelProvider.e(hl2.a.f85273r, e.h(bENationalCourtRegisterEntry.getNumber(), 1, Label.INSTANCE.d()));
            String str = "EntryCard_" + testTag + '_' + i15;
            x0.Icon iconB = x0.Icon.INSTANCE.b();
            r50.a aVarH = h(bENationalCourtRegisterEntry);
            arrayList.add(new Entry(new DefaultSingleCardData(str, new er.a() { // from class: wl2.a
                @Override // er.a
                public final Object a() {
                    return b.f(onClickEntry, bENationalCourtRegisterEntry);
                }
            }, false, null, null, false, null, aVarH != null ? new w0.StatusBadge(aVarH) : null, new BodySection(null, new n50.b.Title(new SingleCardLabel(labelE, labelE2, null, 0, 0, null, 60, null)), new SingleCardLabel(mx.b.b(bENationalCourtRegisterEntry.getName(), "name"), null, null, 0, 0, null, 62, null), 1, null), null, iconB, null, 2684, null)));
            i15 = i16;
        }
        return v.L0(listE, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, BENationalCourtRegisterEntry bENationalCourtRegisterEntry) {
        lVar.b(bENationalCourtRegisterEntry);
        return i0.f148189a;
    }

    public final r50.a h(BENationalCourtRegisterEntry entry) {
        fz.b.OffsetDateTime endDate;
        int iB;
        BESubscription subscription = entry.getSubscription();
        if (subscription == null || (endDate = subscription.getEndDate()) == null || (iB = (int) this.dateCalculator.b(endDate)) > 7) {
            return null;
        }
        return new r50.a.WithIcon(null, mx.b.b(this.labelProvider.c(hl2.a.D).getText() + ' ' + this.labelProvider.a(d.f22742c, iB, String.valueOf(iB)).getText(), "status"), null, 0, false, g.NOTICE, 29, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        List<Object> listE;
        vl2.b state = params.getState();
        if (t.c(state, vl2.b.c.f207263a)) {
            return new c.a.Loading(params.a());
        }
        if (state instanceof vl2.b.Error) {
            return new c.a.Error(params.a(), ((vl2.b.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof vl2.b.Content)) {
            throw new oq.p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hl2.a.G), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106802j4, null, C5664b.f214070a, this.labelProvider.c(hl2.a.E), this.labelProvider.c(hl2.a.F), null, 32, null);
        vl2.b.Content content = (vl2.b.Content) state;
        if (!content.getNationalCourtRegister().i().isEmpty() && !content.getNationalCourtRegister().j().isEmpty()) {
            listE = v.L0(e("entries_with_subscription", this.labelProvider.c(hl2.a.B), content.getNationalCourtRegister().i(), params.b()), e("entries_without_subscription", this.labelProvider.c(hl2.a.C), content.getNationalCourtRegister().j(), params.b()));
        } else if (content.getNationalCourtRegister().i().isEmpty()) {
            listE = !content.getNationalCourtRegister().j().isEmpty() ? e("entries_without_subscription", this.labelProvider.c(hl2.a.A), content.getNationalCourtRegister().j(), params.b()) : v.e(new c.a.Content.InterfaceC5432a.Empty(new EmptyStateData(null, this.labelProvider.c(hl2.a.f85281z), null, 5, null)));
        } else {
            listE = e("entries_with_subscription", this.labelProvider.c(hl2.a.B), content.getNationalCourtRegister().i(), params.b());
        }
        return new c.a.Content(aVarA, baseScaffoldData, icon, listE);
    }
}
