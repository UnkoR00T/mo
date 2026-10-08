package nu2;

import b30.AccordionData;
import b30.AccordionElement;
import bu2.CompanyDetails;
import bu2.VerifiedStatus;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import ez.e;
import ez.h;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iu2.WizardResultData;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import m70.TimelineData;
import m70.TimelineItemData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import ts0.RestrictionVerification;
import ts0.l;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010#J\u0019\u0010(\u001a\u00020'*\b\u0012\u0004\u0012\u00020&0 H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u0013*\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020**\u00020*H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00107\u001a\u000206*\u0002032\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u000206*\u00020*2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lnu2/c;", "Lxw/f;", "Lnu2/c$a;", "Llu2/i$a;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/h;Lez/e;)V", "params", "Lq40/g;", "Llu2/i$b;", "Lq40/f;", "l", "(Lnu2/c$a;)Lq40/g;", "Llu2/h;", "Lmx/a;", "v", "(Llu2/h;)Lmx/a;", "Lq40/j;", "r", "(Llu2/h;)Lq40/j;", "i", "(Llu2/h;)Llu2/i$b;", "F", "", "z", "(Llu2/h;)Z", "Liu2/a;", "", "Ln50/g;", "E", "(Liu2/a;)Ljava/util/List;", "J", "I", "Lts0/p;", "Lm70/a;", "s", "(Ljava/util/List;)Lm70/a;", "Ljava/time/OffsetDateTime;", "date", "u", "(Ljava/time/OffsetDateTime;)Lmx/a;", "Lts0/l;", "G", "(Lts0/l;)Lmx/a;", i.f37087n, "(Ljava/time/OffsetDateTime;)Ljava/time/OffsetDateTime;", "Ljava/time/LocalDate;", "Lfz/c;", "formatType", "", "f", "(Ljava/time/LocalDate;Lfz/c;)Ljava/lang/String;", "h", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "x", "(Lnu2/c$a;)Llu2/i$a;", "a", "Lmx/c;", "b", "Lez/h;", "c", "Lez/e;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, lu2.i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: nu2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnu2/c$a;", "", "Llu2/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "onStartAnotherVerificationClick", "<init>", "(Llu2/h;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llu2/h;", "c", "()Llu2/h;", "b", "Ler/a;", "()Ler/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lu2.h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onStartAnotherVerificationClick;

        public Params(lu2.h hVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = hVar;
            this.onCloseClick = aVar;
            this.onStartAnotherVerificationClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.a<i0> b() {
            return this.onStartAnotherVerificationClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final lu2.h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onStartAnotherVerificationClick, params.onStartAnotherVerificationClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.onStartAnotherVerificationClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ", onStartAnotherVerificationClick=" + this.onStartAnotherVerificationClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138811a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f138811a = iArr;
        }
    }

    public c(mx.c cVar, h hVar, e eVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> E(WizardResultData wizardResultData) {
        return v.L0(J(wizardResultData), I(wizardResultData));
    }

    private final lu2.i.IconPageDataModel F(lu2.h hVar) {
        LocalDate pickedDate;
        lu2.h.StateData stateData = hVar.getStateData();
        if (stateData == null) {
            return null;
        }
        CardListData cardListData = new CardListData(E(stateData.getWizardResultData()), null, false, null, null, 30, null);
        VerifiedStatus verifiedStatus = stateData.getWizardResultData().getSummaryData().getVerifiedStatus();
        return new lu2.i.IconPageDataModel(cardListData, z(hVar) ? (verifiedStatus == null || (pickedDate = verifiedStatus.getPickedDate()) == null) ? null : new AccordionData(v.e(new AccordionElement(null, this.labelProvider.e(ut2.a.f201436x, f(pickedDate, fz.c.DOTTED)), null, false, null, false, new mu2.b(s(stateData.getWizardResultData().getRestrictionsVerificationList().a())), 61, null))) : null);
    }

    private final Label G(l lVar) {
        int i15 = lVar == null ? -1 : b.f138811a[lVar.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return this.labelProvider.c(ut2.a.f201418o);
            }
            if (i15 == 2) {
                return this.labelProvider.c(ut2.a.f201420p);
            }
            if (i15 != 3) {
                throw new p();
            }
        }
        return Label.INSTANCE.b();
    }

    private final OffsetDateTime H(OffsetDateTime offsetDateTime) {
        return this.timeProvider.b(offsetDateTime, fz.f.POLISH);
    }

    private final List<DefaultSingleCardData> I(WizardResultData wizardResultData) {
        List<DefaultSingleCardData> listQ;
        CompanyDetails companyDetails = wizardResultData.getSummaryData().getCompanyDetails();
        return (companyDetails == null || (listQ = v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.E), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(companyDetails.getName(), "verificatingCompanyName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(ou2.a.b(companyDetails.getCompanyIdType(), this.labelProvider), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(companyDetails.getIdNumber(), "verficatingCompanyIdNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.D), null, null, 3, null), new n50.b.Title(n50.l.b(ou2.a.a(companyDetails), null, null, 3, null)), null, 4, null), null, null, null, 3839, null))) == null) ? v.n() : listQ;
    }

    private final List<DefaultSingleCardData> J(WizardResultData wizardResultData) {
        SingleCardLabel singleCardLabelB;
        OffsetDateTime offsetDateTimeH;
        String strH;
        Label labelB;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.K), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(wizardResultData.getSummaryData().getVerificationCheckData().getPesel(), "verifiedCitizenPeselLabel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201400f), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(wizardResultData.getSummaryData().getVerificationCheckData().getIdNumber(), "verifiedCitizenIdNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201434w), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(wizardResultData.getSummaryData().getVerificationCheckData().getReason(), "verificationReason"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(ut2.a.f201398e), null, null, 3, null);
        OffsetDateTime verificationDate = wizardResultData.getRestrictionsVerificationList().getVerificationDate();
        if (verificationDate == null || (offsetDateTimeH = H(verificationDate)) == null || (strH = h(offsetDateTimeH, fz.c.FULL_MONTH_DATE_TIME_SEC_DOT)) == null || (labelB = mx.b.b(strH, "verificationDate")) == null || (singleCardLabelB = n50.l.b(labelB, null, null, 3, null)) == null) {
            singleCardLabelB = n50.l.b(Label.INSTANCE.c(), null, null, 3, null);
        }
        return v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(singleCardLabelB), null, 4, null), null, null, null, 3839, null));
    }

    private final String f(LocalDate localDate, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.LocalDate(localDate), cVar);
    }

    private final String h(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final lu2.i.IconPageDataModel i(lu2.h hVar) {
        if ((hVar instanceof lu2.h.Restricted) || (hVar instanceof lu2.h.StatusAtDate) || (hVar instanceof lu2.h.Unrestricted)) {
            return F(hVar);
        }
        if ((hVar instanceof lu2.h.NoData) || (hVar instanceof lu2.h.InvalidInputData) || t.c(hVar, lu2.h.a.f120491b)) {
            return null;
        }
        throw new p();
    }

    private final IconPageData<lu2.i.IconPageDataModel, IconPageBottomContentData> l(final Params params) {
        return new IconPageData<>(r(params.getState()), v(params.getState()), null, null, i(params.getState()), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ut2.a.B), null, 2, null), d.a.f107773a, null, new er.a() { // from class: nu2.a
            @Override // er.a
            public final Object a() {
                return c.m(params);
            }
        }, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ut2.a.f201404h), null, 2, null), new d.Secondary(null, 1, null), null, new er.a() { // from class: nu2.b
            @Override // er.a
            public final Object a() {
                return c.q(params);
            }
        }, 35, null), null, 4, null), true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    private final j r(lu2.h hVar) {
        if (hVar instanceof lu2.h.Restricted) {
            return j.b.d.f164690d;
        }
        if (hVar instanceof lu2.h.Unrestricted) {
            return j.b.c.f164688d;
        }
        if (!(hVar instanceof lu2.h.StatusAtDate) && !(hVar instanceof lu2.h.InvalidInputData) && !(hVar instanceof lu2.h.NoData)) {
            if (t.c(hVar, lu2.h.a.f120491b)) {
                return j.b.a.f164684d;
            }
            throw new p();
        }
        return j.b.C4090b.f164686d;
    }

    private final TimelineData s(List<RestrictionVerification> list) {
        List<RestrictionVerification> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (RestrictionVerification restrictionVerification : list2) {
            arrayList.add(new TimelineItemData(u(restrictionVerification.getStatusStartDate()), G(restrictionVerification.getStatus()), null, 4, null));
        }
        return new TimelineData(arrayList);
    }

    private final Label u(OffsetDateTime date) {
        Label labelB;
        return (date == null || (labelB = mx.b.b(h(H(date), fz.c.DOTTED_PLUS_HOUR), "dateInPolishTimeZone")) == null) ? this.labelProvider.c(ut2.a.H) : labelB;
    }

    private final Label v(lu2.h hVar) {
        if (hVar instanceof lu2.h.Restricted) {
            return this.labelProvider.c(ut2.a.f201418o);
        }
        if (hVar instanceof lu2.h.Unrestricted) {
            return this.labelProvider.c(ut2.a.f201420p);
        }
        if (hVar instanceof lu2.h.InvalidInputData) {
            return this.labelProvider.c(ut2.a.F);
        }
        if (hVar instanceof lu2.h.NoData) {
            return this.labelProvider.c(ut2.a.G);
        }
        if (hVar instanceof lu2.h.StatusAtDate) {
            return this.labelProvider.c(ut2.a.S);
        }
        if (t.c(hVar, lu2.h.a.f120491b)) {
            return Label.INSTANCE.c();
        }
        throw new p();
    }

    private final boolean z(lu2.h hVar) {
        return hVar instanceof lu2.h.StatusAtDate;
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public lu2.i.a b(Params params) {
        lu2.h state = params.getState();
        if ((state instanceof lu2.h.Restricted) || (state instanceof lu2.h.Unrestricted) || (state instanceof lu2.h.StatusAtDate) || (state instanceof lu2.h.NoData) || (state instanceof lu2.h.InvalidInputData)) {
            return new lu2.i.a.Initialized(l(params), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null));
        }
        if (t.c(state, lu2.h.a.f120491b)) {
            return lu2.i.a.C2940a.f120499a;
        }
        throw new p();
    }
}
