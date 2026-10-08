package js2;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import er.p;
import ez.e;
import fr.k;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import qv0.Act;
import qv0.PenaltyPointsVehicle;
import qv0.Violation;
import qv0.ViolationPlace;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002 \u001eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ljs2/c;", "Lxw/f;", "Ljs2/c$b;", "Lhs2/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lqv0/g;", "", "Ln50/g;", "m", "(Lqv0/g;)Ljava/util/List;", "Lqv0/h;", "l", "(Lqv0/h;)Ljava/util/List;", "Lqv0/d;", "i", "(Lqv0/d;)Ljava/util/List;", "", AnnotatedPrivateKey.LABEL, "", "value", "f", "(ILjava/lang/String;)Ln50/g;", "params", "h", "(Ljs2/c$b;)Lhs2/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, hs2.f.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f105156c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105157d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljs2/c$a;", "", "<init>", "()V", "", "VALUE_TAG_POSTFIX", "Ljava/lang/String;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: js2.c$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljs2/c$b;", "", "Lhs2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onInfoClick", "<init>", "(Lhs2/e;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs2/e;", "c", "()Lhs2/e;", "b", "Ler/a;", "()Ler/a;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hs2.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoClick;

        public Params(hs2.e eVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.onInfoClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onInfoClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hs2.e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onInfoClick, params.onInfoClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onInfoClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onInfoClick=" + this.onInfoClick + ')';
        }
    }

    /* JADX INFO: renamed from: js2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2490c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2490c f105163a = new C2490c();

        C2490c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1826892842);
            if (p076m2.t.k()) {
                p076m2.t.o(1826892842, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.violationdetails.mappers.ViolationDetailsMapper.invoke.<anonymous> (ViolationDetailsMapper.kt:53)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData f(int label, String value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(label), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(Label.f(this.labelProvider.b(mx.b.d(value, "").getText(), label), "Value", null, 2, null), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final List<DefaultSingleCardData> i(PenaltyPointsVehicle penaltyPointsVehicle) {
        return v.q(f(zr2.a.R, penaltyPointsVehicle != null ? penaltyPointsVehicle.getRegistrationNumber() : null), f(zr2.a.F, penaltyPointsVehicle != null ? penaltyPointsVehicle.getBrand() : null), f(zr2.a.M, penaltyPointsVehicle != null ? penaltyPointsVehicle.getModel() : null), f(zr2.a.V, penaltyPointsVehicle != null ? penaltyPointsVehicle.getType() : null), f(zr2.a.J, penaltyPointsVehicle != null ? penaltyPointsVehicle.getCountryOfRegistration() : null));
    }

    private final List<DefaultSingleCardData> l(ViolationPlace violationPlace) {
        b0 street;
        return v.q(f(zr2.a.G, violationPlace != null ? violationPlace.getCity() : null), f(zr2.a.T, (violationPlace == null || (street = violationPlace.getStreet()) == null) ? null : c0.e(street)), f(zr2.a.S, violationPlace != null ? violationPlace.getRoadKilometer() : null), f(zr2.a.H, violationPlace != null ? violationPlace.getCommune() : null), f(zr2.a.K, violationPlace != null ? violationPlace.getDistrict() : null), f(zr2.a.O, violationPlace != null ? violationPlace.getProvince() : null));
    }

    private final List<DefaultSingleCardData> m(Violation violation) {
        OffsetDateTime violationDate;
        Integer penaltyPoints;
        List<Act> listA;
        List<Act> listA2;
        String strD = null;
        DefaultSingleCardData defaultSingleCardDataF = f(zr2.a.P, (violation == null || (listA2 = violation.a()) == null) ? null : v.v0(listA2, ", ", null, null, 0, null, new l() { // from class: js2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.q((Act) obj);
            }
        }, 30, null));
        DefaultSingleCardData defaultSingleCardDataF2 = f(zr2.a.L, (violation == null || (listA = violation.a()) == null) ? null : v.v0(listA, ", ", null, null, 0, null, new l() { // from class: js2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.r((Act) obj);
            }
        }, 30, null));
        DefaultSingleCardData defaultSingleCardDataF3 = f(zr2.a.N, (violation == null || (penaltyPoints = violation.getPenaltyPoints()) == null) ? null : String.valueOf(penaltyPoints.intValue()));
        DefaultSingleCardData defaultSingleCardDataF4 = f(zr2.a.I, violation != null ? violation.getConclusion() : null);
        DefaultSingleCardData defaultSingleCardDataF5 = f(zr2.a.Q, violation != null ? violation.getRegistrationAuthority() : null);
        int i15 = zr2.a.X;
        if (violation != null && (violationDate = violation.getViolationDate()) != null) {
            strD = this.dateFormatter.d(new fz.b.OffsetDateTime(violationDate), fz.c.DOTTED);
        }
        return v.q(defaultSingleCardDataF, defaultSingleCardDataF2, defaultSingleCardDataF3, defaultSingleCardDataF4, defaultSingleCardDataF5, f(i15, strD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(Act act) {
        return act.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(Act act) {
        return act.getLegalQualification();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public hs2.f.a b(Params params) {
        hs2.e state = params.getState();
        if (t.c(state, hs2.e.b.f86541a)) {
            return hs2.f.a.b.f86546a;
        }
        if (!(state instanceof hs2.e.DataSet)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(zr2.a.U), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, C2490c.f105163a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        List<DefaultSingleCardData> listM = m(((hs2.e.DataSet) params.getState()).getViolation());
        Label labelC = this.labelProvider.c(zr2.a.Y);
        Violation violation = ((hs2.e.DataSet) params.getState()).getViolation();
        AccordionData accordionData = new AccordionData(v.e(new AccordionElement(null, labelC, null, false, null, false, new is2.b(l(violation != null ? violation.getViolationPlace() : null)), 29, null)));
        Label labelC2 = this.labelProvider.c(zr2.a.W);
        Violation violation2 = ((hs2.e.DataSet) params.getState()).getViolation();
        return new hs2.f.a.DataLoaded(baseScaffoldData, listM, accordionData, new AccordionData(v.e(new AccordionElement(null, labelC2, null, false, null, false, new is2.b(i(violation2 != null ? violation2.getPenaltyPointsVehicle() : null)), 29, null))));
    }
}
