package ty3;

import al0.CommunityOffice;
import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import py3.OfficeSearchModel;
import sy3.Loading;
import sy3.i;
import sy3.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001cB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u00020\n*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\r0\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lty3/e;", "Lxw/f;", "Lty3/e$b;", "Lsy3/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lsy3/d$d;", "Lkotlin/Function1;", "Lpy3/a;", "Loq/i0;", "onOfficeFieldClicked", "Lal0/v;", "onOfficeSelected", "Lj40/a;", "i", "(Lsy3/d$d;Ler/l;Ler/l;)Lj40/a;", "officeSelected", "s", "(Lsy3/d$d;Lal0/v;Ler/l;)Lpy3/a;", "", "Lpy3/a$a;", "q", "(Ljava/util/List;Lal0/v;Ler/l;)Ljava/util/List;", "params", "h", "(Lty3/e$b;)Lsy3/i$a;", "a", "Lmx/c;", "b", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, i.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f192645b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f192646c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lty3/e$a;", "", "<init>", "()V", "", "NO_SUCH_ELEMENT_INDEX", "I", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ty3.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b\u001b\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Lty3/e$b;", "", "Lsy3/d;", "state", "Lkotlin/Function1;", "Lpy3/a;", "Loq/i0;", "onOfficeFieldClicked", "Lal0/v;", "onOfficeSelected", "Lkotlin/Function0;", "onScrolledToDropdownField", "onNextButtonClicked", "onBack", "onClose", "<init>", "(Lsy3/d;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy3/d;", "g", "()Lsy3/d;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "f", "()Ler/a;", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sy3.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<OfficeSearchModel, i0> onOfficeFieldClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CommunityOffice, i0> onOfficeSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToDropdownField;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sy3.d dVar, l<? super OfficeSearchModel, i0> lVar, l<? super CommunityOffice, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.onOfficeFieldClicked = lVar;
            this.onOfficeSelected = lVar2;
            this.onScrolledToDropdownField = aVar;
            this.onNextButtonClicked = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClicked;
        }

        public final l<OfficeSearchModel, i0> d() {
            return this.onOfficeFieldClicked;
        }

        public final l<CommunityOffice, i0> e() {
            return this.onOfficeSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onOfficeFieldClicked, params.onOfficeFieldClicked) && t.c(this.onOfficeSelected, params.onOfficeSelected) && t.c(this.onScrolledToDropdownField, params.onScrolledToDropdownField) && t.c(this.onNextButtonClicked, params.onNextButtonClicked) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onScrolledToDropdownField;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final sy3.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onOfficeFieldClicked.hashCode()) * 31) + this.onOfficeSelected.hashCode()) * 31) + this.onScrolledToDropdownField.hashCode()) * 31) + this.onNextButtonClicked.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOfficeFieldClicked=" + this.onOfficeFieldClicked + ", onOfficeSelected=" + this.onOfficeSelected + ", onScrolledToDropdownField=" + this.onScrolledToDropdownField + ", onNextButtonClicked=" + this.onNextButtonClicked + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((OfficeSearchModel.C4044a) t16).getIsSelected()), Boolean.valueOf(((OfficeSearchModel.C4044a) t15).getIsSelected()));
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    private final DropDownButtonData i(final sy3.d.InterfaceC4804d interfaceC4804d, final l<? super OfficeSearchModel, i0> lVar, final l<? super CommunityOffice, i0> lVar2) {
        m error;
        Integer num;
        CommunityOffice office;
        sy3.d.Data data = interfaceC4804d.getData();
        int i15 = 0;
        boolean z15 = data.getElementToAutoFocus() == j.OfficeDropDown;
        Label label = data.getSetupData().getFieldData().getLabel();
        Label placeholder = data.getSetupData().getFieldData().getPlaceholder();
        if (interfaceC4804d instanceof Loading) {
            error = new m.Disabled(null, 1, null);
        } else {
            if (!(interfaceC4804d instanceof sy3.Loading) && !(interfaceC4804d instanceof sy3.d.Initialized)) {
                throw new p();
            }
            boolean isValid = interfaceC4804d.getIsValid();
            if (isValid) {
                error = new m.Enabled(null, 1, null);
            } else {
                if (isValid) {
                    throw new p();
                }
                error = new m.Error(this.labelProvider.c(oy3.a.f150699a));
            }
        }
        m mVar = error;
        List<CommunityOffice> listB = interfaceC4804d.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((CommunityOffice) obj).getName(), "officeName_" + i15));
            i15 = i16;
        }
        sy3.d.InterfaceC4804d.SelectedOffice selectedOffice = interfaceC4804d.getSelectedOffice();
        if (selectedOffice == null || (office = selectedOffice.getOffice()) == null) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(interfaceC4804d.b().indexOf(office));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            } else {
                num = null;
            }
        }
        return new DropDownButtonData(label, arrayList, num, mVar, placeholder, z15, null, new l() { // from class: ty3.d
            @Override // er.l
            public final Object b(Object obj2) {
                return e.l(lVar, this, interfaceC4804d, lVar2, (DropDownButtonData) obj2);
            }
        }, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, e eVar, sy3.d.InterfaceC4804d interfaceC4804d, final l lVar2, DropDownButtonData dropDownButtonData) {
        sy3.d.InterfaceC4804d.SelectedOffice selectedOffice = interfaceC4804d.getSelectedOffice();
        lVar.b(eVar.s(interfaceC4804d, selectedOffice != null ? selectedOffice.getOffice() : null, new l() { // from class: ty3.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.m(lVar2, (CommunityOffice) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, CommunityOffice communityOffice) {
        lVar.b(communityOffice);
        return i0.f148189a;
    }

    private final List<OfficeSearchModel.C4044a> q(List<CommunityOffice> list, CommunityOffice communityOffice, final l<? super CommunityOffice, i0> lVar) {
        List<CommunityOffice> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final CommunityOffice communityOffice2 = (CommunityOffice) obj;
            arrayList.add(new OfficeSearchModel.C4044a(mx.b.b(communityOffice2.getName(), "officeName_" + i15), t.c(communityOffice != null ? communityOffice.getName() : null, communityOffice2.getName()), new er.a() { // from class: ty3.c
                @Override // er.a
                public final Object a() {
                    return e.r(lVar, communityOffice2);
                }
            }));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, CommunityOffice communityOffice) {
        lVar.b(communityOffice);
        return i0.f148189a;
    }

    private final OfficeSearchModel s(sy3.d.InterfaceC4804d interfaceC4804d, CommunityOffice communityOffice, l<? super CommunityOffice, i0> lVar) {
        return new OfficeSearchModel(interfaceC4804d.getData().getSetupData().getFieldData().getPlaceholder(), this.labelProvider.c(oy3.a.f150702d), v.U0(q(interfaceC4804d.b(), communityOffice, lVar), new c()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        sy3.d state = params.getState();
        if (state instanceof sy3.d.b) {
            return new i.a.Error(((sy3.d.b) state).getVmsAdapter());
        }
        if (!(state instanceof sy3.d.InterfaceC4804d)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), state.getData().getSetupData().getTitle(), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label header = state.getData().getSetupData().getHeader();
        Label description = state.getData().getSetupData().getDescription();
        DropDownButtonData dropDownButtonDataI = i((sy3.d.InterfaceC4804d) state, params.d(), params.e());
        sy3.d.Initialized initialized = state instanceof sy3.d.Initialized ? (sy3.d.Initialized) state : null;
        return new i.a.Initialized(baseScaffoldData, header, description, dropDownButtonDataI, initialized != null ? initialized.getScrollToDropdownField() : false, params.f(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oy3.a.f150700b), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
