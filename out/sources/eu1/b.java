package eu1;

import du1.State;
import du1.d;
import er.l;
import ez.e;
import fr.t;
import fu.o;
import fu.r;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pv0.DriverQualifications;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u00020(*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0018\u0010+\u001a\u00020(*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Leu1/b;", "Lxw/f;", "Leu1/b$a;", "Ldu1/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lpv0/a$b;", "documentData", "", "", "reasonsOfChange", "", "isTemporaryDrivingLicence", "Ldu1/d$a$a;", "l", "(Lpv0/a$b;Ljava/util/List;Z)Ldu1/d$a$a;", "r", "(Ljava/lang/String;)Ljava/lang/String;", "Lpv0/a$a;", "data", "Ldu1/d$a$b;", "q", "(Ljava/util/List;)Ldu1/d$a$b;", "Lpv0/a$c;", "tag", "Lmx/a;", "i", "(Lpv0/a$c;Ljava/lang/String;)Lmx/a;", "params", "h", "(Leu1/b$a;)Ldu1/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lpv0/a$b$b;", "", "f", "(Lpv0/a$b$b;)I", "labelResId", "Lpv0/a$b$a;", "e", "(Lpv0/a$b$a;)I", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: eu1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Leu1/b$a;", "", "Ldu1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Ldu1/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldu1/c;", "b", "()Ldu1/c;", "Ler/a;", "()Ler/a;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    /* JADX INFO: renamed from: eu1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1261b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53581b;

        static {
            int[] iArr = new int[DriverQualifications.Document.EnumC4023b.values().length];
            try {
                iArr[DriverQualifications.Document.EnumC4023b.DRIVING_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DriverQualifications.Document.EnumC4023b.TEMPORARY_DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DriverQualifications.Document.EnumC4023b.TRAM_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53580a = iArr;
            int[] iArr2 = new int[DriverQualifications.Document.EnumC4022a.values().length];
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.RETAINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.INVALIDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DriverQualifications.Document.EnumC4022a.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f53581b = iArr2;
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final int e(DriverQualifications.Document.EnumC4022a enumC4022a) {
        switch (C1261b.f53581b[enumC4022a.ordinal()]) {
            case 1:
                return vt1.a.f208276l;
            case 2:
                return vt1.a.f208277m;
            case 3:
                return vt1.a.f208278n;
            case 4:
                return vt1.a.f208275k;
            case 5:
                return vt1.a.f208273i;
            case 6:
                return vt1.a.f208274j;
            default:
                throw new p();
        }
    }

    private final int f(DriverQualifications.Document.EnumC4023b enumC4023b) {
        int i15 = C1261b.f53580a[enumC4023b.ordinal()];
        if (i15 == 1) {
            return vt1.a.f208279o;
        }
        if (i15 == 2) {
            return vt1.a.f208280p;
        }
        if (i15 == 3) {
            return vt1.a.f208281q;
        }
        throw new p();
    }

    private final Label i(DriverQualifications.c data, String tag) {
        if (t.c(data, DriverQualifications.c.b.f162861a)) {
            return this.labelProvider.c(vt1.a.f208282r);
        }
        if (data instanceof DriverQualifications.c.Finitely) {
            return mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(((DriverQualifications.c.Finitely) data).getDate()), fz.c.DOTTED), tag);
        }
        throw new p();
    }

    private final d.Data.LicenceSectionData l(DriverQualifications.Document documentData, List<String> reasonsOfChange, boolean isTemporaryDrivingLicence) {
        Label labelC = this.labelProvider.c(f(documentData.getType()));
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(isTemporaryDrivingLicence ? vt1.a.f208290z : vt1.a.f208287w), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(documentData.getSeriesAndNumber(), "seriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(isTemporaryDrivingLicence ? vt1.a.A : vt1.a.f208288x), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(e(documentData.getState())), null, 0, false, documentData.getState() == DriverQualifications.Document.EnumC4022a.ISSUED ? g.POSITIVE : g.NEGATIVE, 13, null)), null, 4, null), null, null, null, 3839, null);
        List<String> list = reasonsOfChange;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r(r.u1((String) it.next()).toString()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!r.t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        String strV0 = v.v0(arrayList2, "\n", null, null, 0, null, new l() { // from class: eu1.a
            @Override // er.l
            public final Object b(Object obj2) {
                return b.m((String) obj2);
            }
        }, 30, null);
        if (r.t0(strV0)) {
            strV0 = null;
        }
        return new d.Data.LicenceSectionData(labelC, new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, strV0 != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(vt1.a.f208286v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(strV0, "reasonOfChange"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(vt1.a.f208285u), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(i(documentData.getExpireDate(), "licenceExpireDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(isTemporaryDrivingLicence ? vt1.a.B : vt1.a.f208289y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(documentData.getRegistrationAuthority(), "registrationAuthority"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(String str) {
        return str + '.';
    }

    private final d.Data.SectionData q(List<DriverQualifications.Category> data) {
        Label labelC = this.labelProvider.c(vt1.a.f208284t);
        List<DriverQualifications.Category> list = data;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DriverQualifications.Category category = (DriverQualifications.Category) obj;
            Label labelE = this.labelProvider.e(vt1.a.f208283s, category.getName());
            labelE.n("categoryName_" + i15);
            i0 i0Var = i0.f148189a;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(labelE, null, null, 0, 0, null, 62, null)), null, 5, null), null, null, new BottomSection(new SingleCardLabel(this.labelProvider.c(vt1.a.f208285u), null, null, 0, 0, null, 62, null), new SingleCardLabel(i(category.getExpireDate(), "qualificationsExpireDate_" + i15), null, null, 0, 0, null, 62, null)), 1791, null));
            i15 = i16;
        }
        return new d.Data.SectionData(labelC, arrayList);
    }

    private final String r(String str) {
        return new o("[.]+$").h(str, "");
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(vt1.a.D), null, null, null, 28, null), null, null, null, null, 61, null);
        List<String> listD = params.getState().getDriverQualifications().d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(new c30.b.C0606b(null, null, null, mx.b.b((String) obj, "alertMessage_" + i15), null, null, null, 119, null));
            i15 = i16;
        }
        return new d.Data(baseScaffoldData, arrayList, l(params.getState().getDriverQualifications().getDocument(), params.getState().getDriverQualifications().c(), params.getState().getDriverQualifications().getDocument().getType() == DriverQualifications.Document.EnumC4023b.TEMPORARY_DRIVING_LICENCE), q(params.getState().getDriverQualifications().a()), this.labelProvider.c(vt1.a.C));
    }
}
