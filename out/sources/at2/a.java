package at2;

import b30.AccordionData;
import b30.AccordionElement;
import ez.h;
import fr.t;
import i50.BaseScaffoldData;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import m70.TimelineData;
import m70.TimelineItemData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import ts0.Institution;
import ts0.PeselRestrictionAddress;
import ts0.RestrictionCheck;
import ts0.RestrictionCheckStatus;
import ts0.l;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import ys2.d;
import ys2.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0011*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u0011*\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u0011*\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u00020)*\u00020!2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00103¨\u00064"}, d2 = {"Lat2/a;", "Lxw/f;", "Lat2/a$a;", "Lys2/e$a;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/h;Lez/e;)V", "Lts0/g;", "restrictionCheck", "Ln50/b$a;", "i", "(Lts0/g;)Ln50/b$a;", "Lmx/a;", "h", "(Lts0/g;)Lmx/a;", "r", "Ln30/b;", "e", "(Lts0/g;)Ln30/b;", "Lts0/d;", "f", "(Lts0/d;)Lmx/a;", "q", "", "Lts0/h;", "Lm70/a;", "l", "(Ljava/util/List;)Lm70/a;", "Ljava/time/OffsetDateTime;", "m", "(Ljava/time/OffsetDateTime;)Lmx/a;", "Lts0/l;", "u", "(Lts0/l;)Lmx/a;", "Lfz/c;", "formatType", "", "c", "(Ljava/time/OffsetDateTime;Lfz/c;)Ljava/lang/String;", "params", "s", "(Lat2/a$a;)Lys2/e$a;", "a", "Lmx/c;", "b", "Lez/h;", "Lez/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: at2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lat2/a$a;", "", "Lys2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Lys2/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lys2/d;", "b", "()Lys2/d;", "Ler/a;", "()Ler/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Params(d dVar, er.a<i0> aVar) {
            this.state = dVar;
            this.onBackClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14511a;

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
            f14511a = iArr;
        }
    }

    public a(c cVar, h hVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
    }

    private final String c(OffsetDateTime offsetDateTime, fz.c cVar) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), cVar);
    }

    private final CardListData e(RestrictionCheck restrictionCheck) {
        DefaultSingleCardData defaultSingleCardData;
        PeselRestrictionAddress address;
        String krs;
        n50.b.StatusBadge statusBadgeI = i(restrictionCheck);
        DefaultSingleCardData defaultSingleCardData2 = statusBadgeI != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(rs2.a.f175912n), null, null, 3, null), statusBadgeI, null, 4, null), null, null, null, 3839, null) : null;
        String reason = restrictionCheck.getReason();
        DefaultSingleCardData defaultSingleCardData3 = reason != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(rs2.a.f175916p), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(reason, "reason"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        Institution institution = restrictionCheck.getInstitution();
        if (institution != null) {
            SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(rs2.a.S), null, null, 3, null);
            String nip = institution.getNip();
            if (nip == null) {
                nip = institution.getRegon();
            }
            if (nip == null) {
                nip = "";
            }
            DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(mx.b.b(nip, "nipOrRegon"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
            if (institution.getRegon() == null && institution.getNip() == null) {
                defaultSingleCardData4 = null;
            }
            defaultSingleCardData = defaultSingleCardData4;
        } else {
            defaultSingleCardData = null;
        }
        Institution institution2 = restrictionCheck.getInstitution();
        DefaultSingleCardData defaultSingleCardData5 = (institution2 == null || (krs = institution2.getKrs()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(rs2.a.R), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(krs, "krs"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        Institution institution3 = restrictionCheck.getInstitution();
        return new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData, defaultSingleCardData5, (institution3 == null || (address = institution3.getAddress()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(rs2.a.Q), null, null, 3, null), new n50.b.Title(n50.l.b(f(address), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(rs2.a.W), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(c0.e(restrictionCheck.getPesel()), "pesel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    private final Label f(PeselRestrictionAddress peselRestrictionAddress) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(peselRestrictionAddress.getCity());
        if (peselRestrictionAddress.getPostalCode().length() > 0) {
            sb5.append(", ");
        }
        sb5.append(peselRestrictionAddress.getPostalCode());
        String street = peselRestrictionAddress.getStreet();
        if (street != null) {
            if (street.length() > 0) {
                sb5.append(", ");
            }
            sb5.append(street);
        }
        if (peselRestrictionAddress.getBuildingNumber().length() > 0) {
            sb5.append(", ");
        }
        sb5.append(peselRestrictionAddress.getBuildingNumber());
        String apartmentNumber = peselRestrictionAddress.getApartmentNumber();
        if (apartmentNumber != null) {
            if (apartmentNumber.length() > 0) {
                sb5.append(" / ");
            }
            sb5.append(apartmentNumber);
        }
        return mx.b.b(sb5.toString(), "formattedAddress");
    }

    private final Label h(RestrictionCheck restrictionCheck) {
        String name;
        Label labelB;
        Institution institution = restrictionCheck.getInstitution();
        return (institution == null || (name = institution.getName()) == null || (labelB = mx.b.b(name, "institutionName")) == null) ? this.labelProvider.c(rs2.a.T) : labelB;
    }

    private final n50.b.StatusBadge i(RestrictionCheck restrictionCheck) {
        if (restrictionCheck.getVerifiedForDate() != null) {
            return new n50.b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175893d0), null, 0, false, g.INFORMATIVE, 13, null));
        }
        RestrictionCheckStatus restrictionCheckStatus = (RestrictionCheckStatus) v.n0(restrictionCheck.d());
        l status = restrictionCheckStatus != null ? restrictionCheckStatus.getStatus() : null;
        int i15 = status == null ? -1 : b.f14511a[status.ordinal()];
        if (i15 == 1) {
            return new n50.b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175904j), null, 0, false, g.POSITIVE, 13, null));
        }
        if (i15 != 2) {
            return null;
        }
        return new n50.b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175906k), null, 0, false, g.NOTICE, 13, null));
    }

    private final TimelineData l(List<RestrictionCheckStatus> list) {
        List<RestrictionCheckStatus> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (RestrictionCheckStatus restrictionCheckStatus : list2) {
            arrayList.add(new TimelineItemData(m(restrictionCheckStatus.getStatusStartDate()), u(restrictionCheckStatus.getStatus()), null, 4, null));
        }
        return new TimelineData(arrayList);
    }

    private final Label m(OffsetDateTime offsetDateTime) {
        Label labelB;
        return (offsetDateTime == null || (labelB = mx.b.b(c(this.timeProvider.b(offsetDateTime, fz.f.POLISH), fz.c.DOTTED_PLUS_HOUR), "dateTimeInPolishTimeZone")) == null) ? Label.INSTANCE.c() : labelB;
    }

    private final Label q(RestrictionCheck restrictionCheck) {
        LocalDate verifiedForDate = restrictionCheck.getVerifiedForDate();
        if (verifiedForDate != null) {
            return this.labelProvider.e(rs2.a.V, this.dateFormatter.d(new fz.b.LocalDate(verifiedForDate), fz.c.DOTTED));
        }
        return null;
    }

    private final Label r(RestrictionCheck restrictionCheck) {
        h hVar = this.timeProvider;
        fz.f fVar = fz.f.POLISH;
        return hVar.a(fVar) ? mx.b.b(c(restrictionCheck.getVerifiedAt(), fz.c.DOTTED_PLUS_HOUR), "verifiedAt") : this.labelProvider.e(rs2.a.f175908l, c(this.timeProvider.b(restrictionCheck.getVerifiedAt(), fVar), fz.c.DOTTED_PLUS_HOUR));
    }

    private final Label u(l lVar) {
        int i15 = lVar == null ? -1 : b.f14511a[lVar.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return this.labelProvider.c(rs2.a.f175904j);
            }
            if (i15 == 2) {
                return this.labelProvider.c(rs2.a.f175906k);
            }
            if (i15 != 3) {
                throw new p();
            }
        }
        return Label.INSTANCE.c();
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.a.f229230a)) {
            return e.a.C6153a.f229232a;
        }
        if (!(state instanceof d.Initialized)) {
            throw new p();
        }
        RestrictionCheck restrictionCheck = ((d.Initialized) params.getState()).getRestrictionCheck();
        Label labelH = h(restrictionCheck);
        Label labelR = r(restrictionCheck);
        CardListData cardListDataE = e(restrictionCheck);
        Label labelQ = q(restrictionCheck);
        return new e.a.Initialized(labelH, labelR, cardListDataE, labelQ != null ? new AccordionData(v.e(new AccordionElement(null, labelQ, null, false, null, false, new zs2.b(l(restrictionCheck.d())), 61, null))) : null, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(rs2.a.U), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
