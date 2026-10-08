package lc3;

import androidx.compose.ui.graphics.Color;
import er.p;
import ez.e;
import fr.t;
import fz.FormattedRangeDate;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc3.Error;
import kc3.Fetching;
import kc3.h;
import kc3.k;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import xw.f;
import z93.Travel;
import z93.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\u0016*\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u001c*\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u00020(*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\u0004\u0018\u00010(*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0018\u00101\u001a\u00020.*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Llc3/d;", "Lxw/f;", "Llc3/d$a;", "Lkc3/k$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lzw/a;", "accessibilityFormatter", "<init>", "(Lmx/c;Lez/e;Lzw/a;)V", "Lkc3/f$a;", "Lkc3/k$a$b$a$a;", "m", "(Lkc3/f$a;)Lkc3/k$a$b$a$a;", "Lkc3/f$c;", "Lkotlin/Function2;", "Lz93/r;", "Lz93/i;", "Loq/i0;", "onTravelClick", "Lkc3/k$a$b$a$b;", "q", "(Lkc3/f$c;Ler/p;)Lkc3/k$a$b$a$b;", "", "index", "Lkotlin/Function0;", "Ln50/g;", "l", "(Lz93/i;Ljava/lang/String;Ler/a;)Ln50/g;", "params", "i", "(Llc3/d$a;)Lkc3/k$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lzw/a;", "Lmx/a;", "h", "(Lkc3/f$a;)Lmx/a;", "title", "e", "description", "", "f", "(Lz93/r;)I", "labelResId", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zw.a accessibilityFormatter;

    /* JADX INFO: renamed from: lc3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Llc3/d$a;", "", "Lkc3/f;", "state", "Lkotlin/Function2;", "Lz93/r;", "Lz93/i;", "Loq/i0;", "onTravelClick", "Lkotlin/Function0;", "onBack", "onRegisterNewTravel", "<init>", "(Lkc3/f;Ler/p;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc3/f;", "d", "()Lkc3/f;", "b", "Ler/p;", "c", "()Ler/p;", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kc3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Travel, i0> onTravelClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRegisterNewTravel;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(kc3.f fVar, p<? super r, ? super Travel, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = fVar;
            this.onTravelClick = pVar;
            this.onBack = aVar;
            this.onRegisterNewTravel = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onRegisterNewTravel;
        }

        public final p<r, Travel, i0> c() {
            return this.onTravelClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final kc3.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onTravelClick, params.onTravelClick) && t.c(this.onBack, params.onBack) && t.c(this.onRegisterNewTravel, params.onRegisterNewTravel);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onTravelClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onRegisterNewTravel.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTravelClick=" + this.onTravelClick + ", onBack=" + this.onBack + ", onRegisterNewTravel=" + this.onRegisterNewTravel + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117816a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.PLANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117816a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f117817a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-919553458);
            if (p076m2.t.k()) {
                p076m2.t.o(-919553458, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.mapper.YourTripsMapper.toSingleCard.<anonymous> (YourTripsMapper.kt:155)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public d(mx.c cVar, e eVar, zw.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.accessibilityFormatter = aVar;
    }

    private final Label e(kc3.f.a aVar) {
        if (aVar instanceof kc3.f.a.C2630a) {
            return this.labelProvider.c(r93.a.I1);
        }
        if (aVar instanceof kc3.f.a.ProhibitedAccess) {
            return ((kc3.f.a.ProhibitedAccess) aVar).getMessage();
        }
        throw new oq.p();
    }

    private final int f(r rVar) {
        int i15 = b.f117816a[rVar.ordinal()];
        if (i15 == 1) {
            return r93.a.N1;
        }
        if (i15 == 2) {
            return r93.a.M1;
        }
        if (i15 == 3) {
            return r93.a.K1;
        }
        throw new oq.p();
    }

    private final Label h(kc3.f.a aVar) {
        if (aVar instanceof kc3.f.a.C2630a) {
            return this.labelProvider.c(r93.a.J1);
        }
        if (aVar instanceof kc3.f.a.ProhibitedAccess) {
            return ((kc3.f.a.ProhibitedAccess) aVar).getTitle();
        }
        throw new oq.p();
    }

    private final DefaultSingleCardData l(Travel travel, String str, er.a<i0> aVar) {
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(travel.getDestination(), "destination#" + str), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(FormattedRangeDate.b(this.dateFormatter.a(travel.getDateRange()), null, 1, null), "daterange#" + str), this.accessibilityFormatter.a(travel.getDateRange().getStart(), travel.getDateRange().getEnd()), null, 0, 0, null, 60, null), 1, null), new LeadingSection(false, null, new i.RoundedSquareIcon(jz.a.f106753d1, null, null, null, c.f117817a, null, null, null, 238, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final k.a.Initialized.InterfaceC2632a.EmptyState m(kc3.f.a aVar) {
        return new k.a.Initialized.InterfaceC2632a.EmptyState(new IconPageData(new j.a(jz.a.f106863s2), h(aVar), e(aVar), null, null, null, false, 72, null));
    }

    private final k.a.Initialized.InterfaceC2632a.Trips q(kc3.f.Initialized initialized, final p<? super r, ? super Travel, i0> pVar) {
        Set<Map.Entry<r, List<Travel>>> setEntrySet = initialized.b().entrySet();
        ArrayList arrayList = new ArrayList(v.y(setEntrySet, 10));
        int i15 = 0;
        for (Object obj : setEntrySet) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final Map.Entry entry = (Map.Entry) obj;
            Label labelC = this.labelProvider.c(f((r) entry.getKey()));
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(v.y(iterable, 10));
            int i17 = 0;
            for (Object obj2 : iterable) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                final Travel travel = (Travel) obj2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(i15);
                sb5.append(i17);
                arrayList2.add(l(travel, sb5.toString(), new er.a() { // from class: lc3.c
                    @Override // er.a
                    public final Object a() {
                        return d.r(pVar, entry, travel);
                    }
                }));
                i17 = i18;
            }
            arrayList.add(new k.a.Initialized.InterfaceC2632a.Trips.Section(labelC, new CardListData(arrayList2, null, false, null, null, 30, null)));
            i15 = i16;
        }
        return new k.a.Initialized.InterfaceC2632a.Trips(arrayList, this.labelProvider.c(r93.a.L1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p pVar, Map.Entry entry, Travel travel) {
        pVar.B(entry.getKey(), travel);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        kc3.f state = params.getState();
        if ((state instanceof Error) || (state instanceof kc3.Error)) {
            return new k.a.Error(((kc3.f.b) params.getState()).getVmsAdapter());
        }
        if ((state instanceof h) || (state instanceof Fetching)) {
            return k.a.c.f110096a;
        }
        boolean z15 = state instanceof kc3.f.a;
        if (!z15 && !(state instanceof kc3.f.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.O1), null, null, false, null, 60, null), null, null, null, null, 60, null);
        k.a.Initialized.InterfaceC2632a interfaceC2632aM = z15 ? m((kc3.f.a) params.getState()) : q((kc3.f.Initialized) params.getState(), params.c());
        ButtonData buttonData = null;
        if (!(state instanceof kc3.f.Initialized) && !(state instanceof kc3.f.a.C2630a)) {
            state = null;
        }
        if (state != null) {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r93.a.J0), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        }
        return new k.a.Initialized(baseScaffoldData, interfaceC2632aM, buttonData);
    }
}
