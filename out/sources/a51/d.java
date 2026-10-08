package a51;

import d60.ScrollControllerData;
import er.l;
import er.p;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;
import v40.InputDateTimeData;
import wi0.CitizenshipDictionary;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015*\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J/\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00152\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"La51/d;", "Lxw/f;", "La51/d$a;", "Ly41/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lb51/a$c;", "Lxw/e;", "parentGender", "", "h", "(Lb51/a$c;Lxw/e;)Ljava/lang/Integer;", "i", "(Lb51/a$c;)I", "Lmx/a;", "u", "(I)Lmx/a;", "", "Lwi0/a;", "selectedCitizenship", "Lkotlin/Function1;", "Loq/i0;", "onCitizenshipSelected", "Ltt3/e;", "v", "(Ljava/util/List;Lwi0/a;Ler/l;)Ljava/util/List;", "params", "l", "(La51/d$a;)Ly41/c$a;", "Ly41/b$c;", "state", "Ly41/c$b;", "s", "(La51/d$a;Ly41/b$c;)Ljava/util/List;", "Lb51/a;", "section", "Ly41/c$c;", "m", "(La51/d$a;Ly41/b$c;Lb51/a;)Ljava/util/List;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, y41.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: a51.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010%R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\"\u0010-R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010%¨\u0006."}, d2 = {"La51/d$a;", "", "Ly41/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "Lkotlin/Function2;", "Lb51/a$c;", "", "onFieldValueChanged", "onDateClicked", "Lkotlin/Function1;", "Ltt3/b;", "onDropDownClicked", "Lwi0/a;", "onCitizenshipSelected", "onClose", "onBack", "<init>", "(Ly41/b;Ler/a;Ler/p;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly41/b;", "h", "()Ly41/b;", "b", "Ler/a;", "g", "()Ler/a;", "c", "Ler/p;", "f", "()Ler/p;", "d", "e", "Ler/l;", "()Ler/l;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y41.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b51.a.c, String, i0> onFieldValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AddressSearchData, i0> onDropDownClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CitizenshipDictionary, i0> onCitizenshipSelected;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(y41.b bVar, er.a<i0> aVar, p<? super b51.a.c, ? super String, i0> pVar, er.a<i0> aVar2, l<? super AddressSearchData, i0> lVar, l<? super CitizenshipDictionary, i0> lVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onNextButtonClick = aVar;
            this.onFieldValueChanged = pVar;
            this.onDateClicked = aVar2;
            this.onDropDownClicked = lVar;
            this.onCitizenshipSelected = lVar2;
            this.onClose = aVar3;
            this.onBack = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<CitizenshipDictionary, i0> b() {
            return this.onCitizenshipSelected;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onDateClicked;
        }

        public final l<AddressSearchData, i0> e() {
            return this.onDropDownClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onFieldValueChanged, params.onFieldValueChanged) && t.c(this.onDateClicked, params.onDateClicked) && t.c(this.onDropDownClicked, params.onDropDownClicked) && t.c(this.onCitizenshipSelected, params.onCitizenshipSelected) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public final p<b51.a.c, String, i0> f() {
            return this.onFieldValueChanged;
        }

        public final er.a<i0> g() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final y41.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onFieldValueChanged.hashCode()) * 31) + this.onDateClicked.hashCode()) * 31) + this.onDropDownClicked.hashCode()) * 31) + this.onCitizenshipSelected.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onFieldValueChanged=" + this.onFieldValueChanged + ", onDateClicked=" + this.onDateClicked + ", onDropDownClicked=" + this.onDropDownClicked + ", onCitizenshipSelected=" + this.onCitizenshipSelected + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3506a;

        static {
            int[] iArr = new int[xw.e.values().length];
            try {
                iArr[xw.e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xw.e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3506a = iArr;
        }
    }

    public d(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Integer h(b51.a.c cVar, xw.e eVar) {
        int i15;
        if (cVar == b51.a.SecondDataParent.EnumC0405a.NextName) {
            return Integer.valueOf(j31.a.f99233x0);
        }
        if (cVar != b51.a.SecondDataParent.EnumC0405a.PESEL) {
            return null;
        }
        int i16 = b.f3506a[eVar.ordinal()];
        if (i16 == 1) {
            i15 = j31.a.f99241z0;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = j31.a.f99237y0;
        }
        return Integer.valueOf(i15);
    }

    private final int i(b51.a.c cVar) {
        if (cVar == b51.a.SecondDataParent.EnumC0405a.FirstName) {
            return j31.a.f99221u2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.SecondName) {
            return j31.a.U2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.NextName) {
            return j31.a.f99243z2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.LastName) {
            return j31.a.f99231w2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.FamilyName) {
            return j31.a.f99216t2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.PESEL) {
            return j31.a.G2;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.DateOfBirth) {
            return j31.a.V1;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.PlaceOfBirth) {
            return j31.a.X1;
        }
        if (cVar == b51.a.SecondDataParent.EnumC0405a.Citizenship) {
            return j31.a.f99156h2;
        }
        if (cVar == b51.a.FatherName.EnumC0399a.Name) {
            return j31.a.C0;
        }
        if (cVar == b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Place) {
            return j31.a.I2;
        }
        if (cVar == b51.a.FatherPlaceOfBirthCertificate.EnumC0400a.Number) {
            return j31.a.f99121a2;
        }
        if (cVar == b51.a.MarriageCertificate.EnumC0403a.Place) {
            return j31.a.I2;
        }
        if (cVar == b51.a.MarriageCertificate.EnumC0403a.Number) {
            return j31.a.f99121a2;
        }
        if (cVar == b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Place) {
            return j31.a.I2;
        }
        if (cVar == b51.a.MotherPlaceOfBirthCertificate.EnumC0404a.Number) {
            return j31.a.f99121a2;
        }
        if (cVar == b51.a.YourBirthCertificate.EnumC0406a.Place) {
            return j31.a.I2;
        }
        if (cVar == b51.a.YourBirthCertificate.EnumC0406a.Number) {
            return j31.a.f99121a2;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, d dVar, y41.b.Initialized initialized, b51.a.FieldData.InterfaceC0401a interfaceC0401a, DropDownButtonData dropDownButtonData) {
        params.e().b(new AddressSearchData(dVar.labelProvider.c(j31.a.V2), dVar.labelProvider.c(j31.a.S2), dVar.v(initialized.c(), ((b51.a.FieldData.InterfaceC0401a.DropDown) interfaceC0401a).getData(), params.b()), new AddressNoSearchResultsData(dVar.labelProvider.c(j31.a.B2), dVar.labelProvider.c(j31.a.f99137d3))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 r(Params params, Map.Entry entry, String str) {
        params.f().B(entry.getKey(), str);
        return i0.f148189a;
    }

    private final Label u(int i15) {
        return this.labelProvider.c(i15);
    }

    private final List<AddressSearchItemData> v(List<CitizenshipDictionary> list, CitizenshipDictionary citizenshipDictionary, final l<? super CitizenshipDictionary, i0> lVar) {
        List<CitizenshipDictionary> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final CitizenshipDictionary citizenshipDictionary2 : list2) {
            arrayList.add(new AddressSearchItemData(mx.b.b(citizenshipDictionary2.getName().toLowerCase(Locale.ROOT), "description"), null, t.c(citizenshipDictionary != null ? citizenshipDictionary.getName() : null, citizenshipDictionary2.getName()), new er.a() { // from class: a51.a
                @Override // er.a
                public final Object a() {
                    return d.x(lVar, citizenshipDictionary2);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar, CitizenshipDictionary citizenshipDictionary) {
        lVar.b(citizenshipDictionary);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public y41.c.a b(Params params) {
        mx.c cVar = this.labelProvider;
        y41.b state = params.getState();
        if (t.c(state, y41.b.C5985b.f223890a)) {
            return y41.c.a.b.f223898a;
        }
        if (!(state instanceof y41.b.Initialized)) {
            if (state instanceof y41.b.Error) {
                return new y41.c.a.Error(((y41.b.Error) params.getState()).getErrorVMS());
            }
            throw new oq.p();
        }
        return new y41.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.E2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(((y41.b.Initialized) params.getState()).e(), false, false, 6, null), 29, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null), s(params, (y41.b.Initialized) params.getState()), params.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<y41.c.InterfaceC5990c> m(final Params params, final y41.b.Initialized state, b51.a<?> section) {
        Object text;
        Object date;
        Label labelC;
        Label labelC2;
        m enabled;
        String name;
        String lowerCase;
        String name2;
        Set<Map.Entry> setEntrySet = section.b().entrySet();
        ArrayList arrayList = new ArrayList(v.y(setEntrySet, 10));
        for (final Map.Entry entry : setEntrySet) {
            final b51.a.FieldData.InterfaceC0401a value = ((b51.a.FieldData) entry.getValue()).getValue();
            if (value instanceof b51.a.FieldData.InterfaceC0401a.Date) {
                Label labelU = u(i((b51.a.c) entry.getKey()));
                fz.b.LocalDate data = ((b51.a.FieldData.InterfaceC0401a.Date) value).getData();
                date = new y41.c.InterfaceC5990c.Date(new InputDateTimeData(null, labelU, data != null ? this.dateFormatter.d(data, fz.c.DOTTED) : null, InputDateTimeData.b.C5303a.f203783c, ((b51.a.FieldData) entry.getValue()).getValidationState(), null, null, null, ((b51.a.FieldData) entry.getValue()).getEnabled(), (b51.a.c) entry.getKey(), params.d(), 225, null), (b51.a.c) entry.getKey());
            } else {
                if (value instanceof b51.a.FieldData.InterfaceC0401a.DropDown) {
                    Label labelU2 = u(i((b51.a.c) entry.getKey()));
                    b51.a.FieldData.InterfaceC0401a.DropDown dropDown = (b51.a.FieldData.InterfaceC0401a.DropDown) value;
                    CitizenshipDictionary data2 = dropDown.getData();
                    if (data2 == null || (name2 = data2.getName()) == null || (labelC = mx.b.b(name2, "citizenshipPlaceHolder")) == null) {
                        labelC = this.labelProvider.c(j31.a.V2);
                    }
                    Label label = labelC;
                    CitizenshipDictionary data3 = dropDown.getData();
                    if (data3 == null || (name = data3.getName()) == null || (lowerCase = name.toLowerCase(Locale.ROOT)) == null || (labelC2 = mx.b.b(lowerCase, "citizenship")) == null) {
                        labelC2 = Label.INSTANCE.c();
                    }
                    List listE = v.e(labelC2);
                    hz.b validationState = ((b51.a.FieldData) entry.getValue()).getValidationState();
                    if (validationState instanceof hz.b.Invalid) {
                        enabled = new m.Error(((hz.b.Invalid) validationState).getMessage());
                    } else {
                        if (!t.c(validationState, hz.b.d.f86848c) && !t.c(validationState, hz.b.C2039b.f86846c)) {
                            throw new oq.p();
                        }
                        enabled = new m.Enabled(null, 1, null);
                    }
                    text = new y41.c.InterfaceC5990c.DropDown(new DropDownButtonData(labelU2, listE, null, enabled, label, false, (b51.a.c) entry.getKey(), new l() { // from class: a51.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.q(params, this, state, value, (DropDownButtonData) obj);
                        }
                    }, 36, null), (b51.a.c) entry.getKey());
                } else {
                    if (!(value instanceof b51.a.FieldData.InterfaceC0401a.Text)) {
                        throw new oq.p();
                    }
                    Label labelU3 = u(i((b51.a.c) entry.getKey()));
                    b51.a.FieldData.InterfaceC0401a.Text text2 = (b51.a.FieldData.InterfaceC0401a.Text) value;
                    Label labelB = mx.b.b(c0.e(text2.getText()), mx.b.c(entry.getKey().toString()));
                    Integer numH = h((b51.a.c) entry.getKey(), state.getParentGender());
                    text = new y41.c.InterfaceC5990c.Text(new v50.c.Text(null, labelU3, null, labelB, ((b51.a.FieldData) entry.getValue()).getValidationState(), numH != null ? u(numH.intValue()) : null, null, new l() { // from class: a51.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.r(params, entry, (String) obj);
                        }
                    }, null, ((b51.a.FieldData) entry.getValue()).getEnabled(), 0, null, false, null, false, null, null, null, text2.getAccessibilityReadMode(), (b51.a.c) entry.getKey(), 261445, null), (b51.a.c) entry.getKey());
                }
                date = text;
            }
            arrayList.add(date);
        }
        return arrayList;
    }

    public final List<y41.c.b> s(Params params, y41.b.Initialized state) {
        Object certificate;
        Label labelU;
        List<b51.a<?>> listF = state.f();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        for (b51.a<?> aVar : listF) {
            if (aVar instanceof b51.a.SecondDataParent) {
                int i15 = b.f3506a[state.getParentGender().ordinal()];
                if (i15 == 1) {
                    labelU = u(j31.a.f99229w0);
                } else {
                    if (i15 != 2) {
                        throw new oq.p();
                    }
                    labelU = u(j31.a.f99224v0);
                }
                certificate = new y41.c.b.Parent(labelU, m(params, state, aVar));
            } else if (aVar instanceof b51.a.FatherName) {
                certificate = new y41.c.b.Father(u(j31.a.D0), u(j31.a.B0), m(params, state, aVar));
            } else if (aVar instanceof b51.a.FatherPlaceOfBirthCertificate) {
                certificate = new y41.c.b.Certificate(u(j31.a.A0), m(params, state, aVar));
            } else if (aVar instanceof b51.a.MarriageCertificate) {
                certificate = new y41.c.b.Certificate(u(j31.a.E0), m(params, state, aVar));
            } else if (aVar instanceof b51.a.MotherPlaceOfBirthCertificate) {
                certificate = new y41.c.b.Certificate(u(j31.a.F0), m(params, state, aVar));
            } else {
                if (!(aVar instanceof b51.a.YourBirthCertificate)) {
                    throw new oq.p();
                }
                certificate = new y41.c.b.Certificate(u(j31.a.H0), m(params, state, aVar));
            }
            arrayList.add(certificate);
        }
        return arrayList;
    }
}
