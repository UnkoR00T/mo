package es3;

import cj0.AccessibleZusEVisitDepartments;
import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitTopic;
import er.l;
import fr.t;
import fu.r;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import k30.d;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"$B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0018\u001a\u00020\u0017*\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Les3/c;", "Lxw/f;", "Les3/c$b;", "Lds3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lds3/b$b;", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "Lkotlin/Function1;", "Liy/b0;", "changePostCode", "Lds3/c$a$b;", "m", "(Lds3/b$b;Ler/a;Ler/l;)Lds3/c$a$b;", "Lds3/b$a;", "Lcj0/h;", "onNextButtonToDateClick", "onChangeDepartmentClick", "onEnterDepartmentSelect", "Lds3/c$a$a;", "l", "(Lds3/b$a;Ler/l;Ler/a;Ler/a;)Lds3/c$a$a;", "department", "Lmx/a;", "h", "(Lcj0/h;)Lmx/a;", "f", "params", "i", "(Les3/c$b;)Lds3/c$a;", "a", "Lmx/c;", "b", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, ds3.c.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53360c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: es3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006&"}, d2 = {"Les3/c$b;", "", "Lds3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "Lkotlin/Function1;", "Liy/b0;", "changePostalCode", "onEnterDepartmentSelect", "Lcj0/h;", "onNextButtonToDateClick", "onChangeDepartmentClick", "<init>", "(Lds3/b;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lds3/b;", "f", "()Lds3/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ds3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> changePostalCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterDepartmentSelect;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ZusEVisitDepartment, i0> onNextButtonToDateClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeDepartmentClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ds3.b bVar, er.a<i0> aVar, l<? super b0, i0> lVar, er.a<i0> aVar2, l<? super ZusEVisitDepartment, i0> lVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onNextButtonClick = aVar;
            this.changePostalCode = lVar;
            this.onEnterDepartmentSelect = aVar2;
            this.onNextButtonToDateClick = lVar2;
            this.onChangeDepartmentClick = aVar3;
        }

        public final l<b0, i0> a() {
            return this.changePostalCode;
        }

        public final er.a<i0> b() {
            return this.onChangeDepartmentClick;
        }

        public final er.a<i0> c() {
            return this.onEnterDepartmentSelect;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        public final l<ZusEVisitDepartment, i0> e() {
            return this.onNextButtonToDateClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.changePostalCode, params.changePostalCode) && t.c(this.onEnterDepartmentSelect, params.onEnterDepartmentSelect) && t.c(this.onNextButtonToDateClick, params.onNextButtonToDateClick) && t.c(this.onChangeDepartmentClick, params.onChangeDepartmentClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ds3.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.changePostalCode.hashCode()) * 31) + this.onEnterDepartmentSelect.hashCode()) * 31) + this.onNextButtonToDateClick.hashCode()) * 31) + this.onChangeDepartmentClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", changePostalCode=" + this.changePostalCode + ", onEnterDepartmentSelect=" + this.onEnterDepartmentSelect + ", onNextButtonToDateClick=" + this.onNextButtonToDateClick + ", onChangeDepartmentClick=" + this.onChangeDepartmentClick + ')';
        }
    }

    /* JADX INFO: renamed from: es3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1259c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53369b;

        static {
            int[] iArr = new int[ZusEVisitTopic.a.values().length];
            try {
                iArr[ZusEVisitTopic.a.FIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZusEVisitTopic.a.UIU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53368a = iArr;
            int[] iArr2 = new int[AccessibleZusEVisitDepartments.EnumC0702a.values().length];
            try {
                iArr2[AccessibleZusEVisitDepartments.EnumC0702a.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND_VISIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartments.EnumC0702a.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartments.EnumC0702a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f53369b = iArr2;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label f(ZusEVisitDepartment department) {
        String street;
        String buildingNumber;
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        String str = null;
        if (department == null || (street = department.getStreet()) == null) {
            street = null;
        } else if (r.t0(street)) {
            street = "-";
        }
        sb6.append(street);
        sb6.append(' ');
        sb5.append(sb6.toString());
        if (department != null && (buildingNumber = department.getBuildingNumber()) != null) {
            str = r.t0(buildingNumber) ? "-" : buildingNumber;
        }
        sb5.append(str);
        return mx.b.d(sb5.toString(), "departmentAddressValue");
    }

    private final Label h(ZusEVisitDepartment department) {
        String postcode;
        String city;
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        String str = null;
        if (department == null || (postcode = department.getPostcode()) == null) {
            postcode = null;
        } else if (r.t0(postcode)) {
            postcode = "-";
        }
        sb6.append(postcode);
        sb6.append(' ');
        sb5.append(sb6.toString());
        if (department != null && (city = department.getCity()) != null) {
            str = r.t0(city) ? "-" : city;
        }
        sb5.append(str);
        return mx.b.d(sb5.toString(), "departmentPostalCodeValue");
    }

    private final ds3.c.a.DisplayedDepartment l(final ds3.b.FoundDepartment foundDepartment, final l<? super ZusEVisitDepartment, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
        Label labelC;
        c30.b.c cVar;
        Label labelC2 = this.labelProvider.c(ir3.a.W0);
        AccessibleZusEVisitDepartments.EnumC0702a status = foundDepartment.getAccessibleDepartments().getStatus();
        int[] iArr = C1259c.f53369b;
        int i15 = iArr[status.ordinal()];
        if (i15 == 1) {
            labelC = foundDepartment.getIsForceOpenedWithDefaultPostcode() ? this.labelProvider.c(ir3.a.f96783f1) : this.labelProvider.c(ir3.a.f96780e1);
        } else if (i15 == 2) {
            labelC = this.labelProvider.c(ir3.a.f96807n1);
        } else {
            if (i15 != 3 && i15 != 4) {
                if (i15 != 5) {
                    throw new p();
                }
                throw new IllegalStateException("UNKNOWN case");
            }
            labelC = this.labelProvider.c(ir3.a.f96786g1);
        }
        int i16 = iArr[foundDepartment.getAccessibleDepartments().getStatus().ordinal()];
        if (i16 == 1 || i16 == 2) {
            cVar = null;
        } else if (i16 == 3) {
            cVar = new c30.b.c(null, null, this.labelProvider.c(ir3.a.f96777d1), this.labelProvider.c(ir3.a.f96771b1), null, null, null, 115, null);
        } else {
            if (i16 != 4) {
                if (i16 != 5) {
                    throw new p();
                }
                throw new IllegalStateException("UNKNOWN case");
            }
            cVar = new c30.b.c(null, null, this.labelProvider.c(ir3.a.f96777d1), this.labelProvider.c(ir3.a.f96774c1), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(ir3.a.f96768a1), null, null, aVar2, 13, null)), 51, null);
        }
        k30.a.Large large = new k30.a.Large(false, 1, null);
        d.a aVar3 = d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, large, new k30.c.WithText(this.labelProvider.c(ir3.a.f96820s), null, 2, null), aVar3, null, new er.a() { // from class: es3.a
            @Override // er.a
            public final Object a() {
                return c.r(foundDepartment, lVar);
            }
        }, 35, null);
        x0.Button button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ir3.a.f96781f), null, 2, null), aVar3, null, aVar, 35, null));
        ZusEVisitDepartment department = foundDepartment.getAccessibleDepartments().getDepartment();
        return new ds3.c.a.DisplayedDepartment(labelC2, labelC, cVar, buttonData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(department != null ? department.getName() : null, "departmentNameValue"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(h(foundDepartment.getAccessibleDepartments().getDepartment()).o(mx.b.b("\n", "newLine")).o(f(foundDepartment.getAccessibleDepartments().getDepartment())), null, null, 0, 0, null, 62, null), 1, null), null, button, null, 2815, null));
    }

    private final ds3.c.a.DisplayedInput m(ds3.b.InitializedInput initializedInput, er.a<i0> aVar, final l<? super b0, i0> lVar) {
        Label labelC = this.labelProvider.c(ir3.a.W0);
        Label labelC2 = this.labelProvider.c(ir3.a.V0);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.D), null, 2, null), d.a.f107773a, null, aVar, 35, null);
        Label labelC3 = this.labelProvider.c(ir3.a.f96810o1);
        ZusEVisitTopic topic = initializedInput.getTopic();
        ZusEVisitTopic.a code = topic != null ? topic.getCode() : null;
        int i15 = code == null ? -1 : C1259c.f53368a[code.ordinal()];
        return new ds3.c.a.DisplayedInput(labelC, labelC2, new v50.c.Masked(null, labelC3, mx.b.b(c0.e(initializedInput.getInputValue()), "inputValue"), this.labelProvider.c(ir3.a.f96795j1), initializedInput.getInputState(), (i15 == 1 || i15 == 2) ? this.labelProvider.c(ir3.a.f96792i1) : this.labelProvider.c(ir3.a.f96789h1), null, new l() { // from class: es3.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.q(lVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, w50.a.POST_CODE, 524097, null), buttonData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(ds3.b.FoundDepartment foundDepartment, l lVar) {
        ZusEVisitDepartment department = foundDepartment.getAccessibleDepartments().getDepartment();
        if (department != null) {
            lVar.b(department);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ds3.c.a b(Params params) {
        ds3.b state = params.getState();
        if (state instanceof ds3.b.InitializedInput) {
            return m((ds3.b.InitializedInput) params.getState(), params.d(), params.a());
        }
        if (!(state instanceof ds3.b.FoundDepartment)) {
            throw new p();
        }
        return l((ds3.b.FoundDepartment) params.getState(), params.e(), params.b(), params.c());
    }
}
