package yy1;

import androidx.compose.ui.graphics.Color;
import az1.ElectoralPersonalModel;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import wy1.ElectoralEventDetailsModel;
import x50.NavigationButtonData;
import yi0.Citizen;
import yi0.District;
import yi0.ElectionsArea;
import yi0.RegisteredArea;
import yi0.ResidenceAddress;
import yi0.Statement;
import zy1.Displayed;
import zy1.FindOutMoreData;
import zy1.FindOutMoreSectionData;
import zy1.NoDataAvailable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lyy1/j;", "Lxw/f;", "Lyy1/j$a;", "Lyy1/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "Lg30/v;", "E", "(Z)Lg30/v;", "u", "(Lg30/v;)Z", "Lyi0/i;", "Ln30/b;", "z", "(Lyi0/i;)Ln30/b;", "shouldShow", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lc30/b;", "v", "(ZLer/a;)Lc30/b;", "onRegisterAddressClick", "onTemporaryAddressClick", "onFillDataClick", "Lzy1/c;", "i", "(Ler/a;Ler/a;Ler/a;)Lzy1/c;", "Lyi0/h;", "Lmx/a;", "x", "(Lyi0/h;)Lmx/a;", "params", "l", "(Lyy1/j$a;)Lyy1/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, yy1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: yy1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b)\u0010$R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u001d\u0010'¨\u0006,"}, d2 = {"Lyy1/j$a;", "", "Lyy1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClickAction", "Lkotlin/Function1;", "Lwy1/e;", "onElectionsAreasSectionClickAction", "Laz1/t;", "onCitizenDataSectionClickAction", "onAlertButtonClickAction", "onRegisterAddressButtonClickAction", "onTemporaryAddressButtonClickAction", "onFillDataButtonClickAction", "", "changeBottomSheetVisibilityAction", "<init>", "(Lyy1/b;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyy1/b;", "i", "()Lyy1/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "e", "()Ler/l;", "d", "f", "g", "h", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yy1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClickAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ElectoralEventDetailsModel, i0> onElectionsAreasSectionClickAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ElectoralPersonalModel, i0> onCitizenDataSectionClickAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAlertButtonClickAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRegisterAddressButtonClickAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTemporaryAddressButtonClickAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFillDataButtonClickAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> changeBottomSheetVisibilityAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(yy1.b bVar, er.a<i0> aVar, er.l<? super ElectoralEventDetailsModel, i0> lVar, er.l<? super ElectoralPersonalModel, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.l<? super Boolean, i0> lVar3) {
            this.state = bVar;
            this.onBackClickAction = aVar;
            this.onElectionsAreasSectionClickAction = lVar;
            this.onCitizenDataSectionClickAction = lVar2;
            this.onAlertButtonClickAction = aVar2;
            this.onRegisterAddressButtonClickAction = aVar3;
            this.onTemporaryAddressButtonClickAction = aVar4;
            this.onFillDataButtonClickAction = aVar5;
            this.changeBottomSheetVisibilityAction = lVar3;
        }

        public final er.l<Boolean, i0> a() {
            return this.changeBottomSheetVisibilityAction;
        }

        public final er.a<i0> b() {
            return this.onAlertButtonClickAction;
        }

        public final er.a<i0> c() {
            return this.onBackClickAction;
        }

        public final er.l<ElectoralPersonalModel, i0> d() {
            return this.onCitizenDataSectionClickAction;
        }

        public final er.l<ElectoralEventDetailsModel, i0> e() {
            return this.onElectionsAreasSectionClickAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackClickAction, params.onBackClickAction) && fr.t.c(this.onElectionsAreasSectionClickAction, params.onElectionsAreasSectionClickAction) && fr.t.c(this.onCitizenDataSectionClickAction, params.onCitizenDataSectionClickAction) && fr.t.c(this.onAlertButtonClickAction, params.onAlertButtonClickAction) && fr.t.c(this.onRegisterAddressButtonClickAction, params.onRegisterAddressButtonClickAction) && fr.t.c(this.onTemporaryAddressButtonClickAction, params.onTemporaryAddressButtonClickAction) && fr.t.c(this.onFillDataButtonClickAction, params.onFillDataButtonClickAction) && fr.t.c(this.changeBottomSheetVisibilityAction, params.changeBottomSheetVisibilityAction);
        }

        public final er.a<i0> f() {
            return this.onFillDataButtonClickAction;
        }

        public final er.a<i0> g() {
            return this.onRegisterAddressButtonClickAction;
        }

        public final er.a<i0> h() {
            return this.onTemporaryAddressButtonClickAction;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClickAction.hashCode()) * 31) + this.onElectionsAreasSectionClickAction.hashCode()) * 31) + this.onCitizenDataSectionClickAction.hashCode()) * 31) + this.onAlertButtonClickAction.hashCode()) * 31) + this.onRegisterAddressButtonClickAction.hashCode()) * 31) + this.onTemporaryAddressButtonClickAction.hashCode()) * 31) + this.onFillDataButtonClickAction.hashCode()) * 31) + this.changeBottomSheetVisibilityAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final yy1.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClickAction=" + this.onBackClickAction + ", onElectionsAreasSectionClickAction=" + this.onElectionsAreasSectionClickAction + ", onCitizenDataSectionClickAction=" + this.onCitizenDataSectionClickAction + ", onAlertButtonClickAction=" + this.onAlertButtonClickAction + ", onRegisterAddressButtonClickAction=" + this.onRegisterAddressButtonClickAction + ", onTemporaryAddressButtonClickAction=" + this.onTemporaryAddressButtonClickAction + ", onFillDataButtonClickAction=" + this.onFillDataButtonClickAction + ", changeBottomSheetVisibilityAction=" + this.changeBottomSheetVisibilityAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f230762b;

        static {
            int[] iArr = new int[g30.v.values().length];
            try {
                iArr[g30.v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g30.v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g30.v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f230761a = iArr;
            int[] iArr2 = new int[yi0.h.values().length];
            try {
                iArr2[yi0.h.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[yi0.h.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[yi0.h.MINOR_AGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[yi0.h.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f230762b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((ElectionsArea) t15).getElectionsDate(), ((ElectionsArea) t16).getElectionsDate());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f230763a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1652410181);
            if (p076m2.t.k()) {
                p076m2.t.o(-1652410181, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterMapper.invoke.<anonymous> (ElectoralRegisterMapper.kt:93)");
            }
            long jA = ((vy1.a) rVar.N(vy1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public j(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final g30.v E(boolean z15) {
        if (z15) {
            return g30.v.EXPANDED;
        }
        if (z15) {
            throw new oq.p();
        }
        return g30.v.HIDDEN;
    }

    private final FindOutMoreData i(er.a<i0> onRegisterAddressClick, er.a<i0> onTemporaryAddressClick, er.a<i0> onFillDataClick) {
        return new FindOutMoreData(this.labelProvider.c(qy1.a.f169496b), pq.v.q(new FindOutMoreSectionData(this.labelProvider.c(qy1.a.C), this.labelProvider.c(qy1.a.B), new ButtonTextData(null, this.labelProvider.c(qy1.a.A), null, null, onRegisterAddressClick, 13, null)), new FindOutMoreSectionData(this.labelProvider.c(qy1.a.E), this.labelProvider.c(qy1.a.D), new ButtonTextData(null, this.labelProvider.c(qy1.a.A), null, null, onTemporaryAddressClick, 13, null)), new FindOutMoreSectionData(this.labelProvider.c(qy1.a.f169528z), this.labelProvider.c(qy1.a.f169527y), new ButtonTextData(null, this.labelProvider.c(qy1.a.A), null, null, onFillDataClick, 13, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, yy1.b bVar, ElectionsArea electionsArea) {
        er.l<ElectoralEventDetailsModel, i0> lVarE = params.e();
        List<ResidenceAddress> listJ = ((yy1.b.InterfaceC6199b.Displayed) bVar).getCitizenElectoralData().getCitizen().j();
        ResidenceAddress residenceAddress = null;
        Object obj = null;
        if (listJ != null) {
            for (Object obj2 : listJ) {
                if (fr.t.c(((ResidenceAddress) obj2).getElectionsName(), electionsArea.getElectionsName())) {
                    obj = obj2;
                    break;
                }
            }
            residenceAddress = (ResidenceAddress) obj;
        }
        lVarE.b(new ElectoralEventDetailsModel(residenceAddress, electionsArea));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, yy1.b bVar) {
        ElectionsArea electionsArea;
        er.l<ElectoralPersonalModel, i0> lVarD = params.d();
        yy1.b.InterfaceC6199b.Displayed displayed = (yy1.b.InterfaceC6199b.Displayed) bVar;
        Citizen citizen = displayed.getCitizenElectoralData().getCitizen();
        List<District> listB = displayed.getCitizenElectoralData().b();
        RegisteredArea registeredArea = displayed.getCitizenElectoralData().getRegisteredArea();
        List<ElectionsArea> listC = displayed.getCitizenElectoralData().c();
        lVarD.b(new ElectoralPersonalModel(citizen, listB, registeredArea, (listC == null || (electionsArea = (ElectionsArea) pq.v.n0(listC)) == null) ? null : electionsArea.getNumber(), displayed.getCitizenElectoralData().getVoteRight().getRightType() == yi0.h.INACTIVE));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, j jVar, g30.v vVar) {
        params.a().b(Boolean.valueOf(jVar.u(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.a().b(Boolean.FALSE);
        return i0.f148189a;
    }

    private final boolean u(g30.v vVar) {
        int i15 = b.f230761a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    private final c30.b v(boolean shouldShow, er.a<i0> onClick) {
        c30.b.C0606b c0606b = new c30.b.C0606b(null, null, this.labelProvider.c(qy1.a.f169526x), this.labelProvider.c(qy1.a.f169525w), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(qy1.a.f169524v), null, null, onClick, 13, null)), 51, null);
        if (shouldShow) {
            return c0606b;
        }
        return null;
    }

    private final Label x(yi0.h hVar) {
        int i15 = b.f230762b[hVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(qy1.a.f169507g0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(qy1.a.f169505f0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(qy1.a.f169511i0);
        }
        if (i15 != 4) {
            throw new oq.p();
        }
        throw new IllegalStateException("UNKNOWN case");
    }

    private final CardListData z(Statement statement) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169503e0), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(statement.getSignature(), "signature"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169501d0), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(statement.getOrgan(), "organ"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(qy1.a.Z), null, null, 3, null);
        LocalDate creationDate = statement.getCreationDate();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(mx.b.d(creationDate != null ? this.dateFormatter.d(new fz.b.LocalDate(creationDate), fz.c.DOTTED) : null, "creationDate"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169495a0), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.d(statement.getDeprivationPeriod(), "deprivationPeriod"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(qy1.a.f169497b0), null, null, 3, null);
        LocalDate finalDate = statement.getFinalDate();
        return new CardListData(pq.v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(n50.l.b(mx.b.d(finalDate != null ? this.dateFormatter.d(new fz.b.LocalDate(finalDate), fz.c.DOTTED) : null, "finalDate"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public yy1.c.a b(final Params params) {
        yy1.b.InterfaceC6199b.Displayed displayed;
        CardListData cardListData;
        Statement statement;
        List listU0;
        final yy1.b state = params.getState();
        if (fr.t.c(state, yy1.b.a.f230670a)) {
            return yy1.c.a.C6202a.f230726a;
        }
        if (fr.t.c(state, yy1.b.InterfaceC6199b.C6200b.f230673a)) {
            return new NoDataAvailable(new NoDataAvailable(new IconPageData(new q40.j.a(jz.a.f106754d2), this.labelProvider.c(qy1.a.f169504f), this.labelProvider.c(qy1.a.f169502e), null, null, null, false, 72, null)), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(qy1.a.f169508h), null, null, null, 28, null), null, null, null, null, 61, null));
        }
        if (!(state instanceof yy1.b.InterfaceC6199b.Displayed)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(qy1.a.f169508h), null, null, null, 28, null), null, null, null, null, 61, null);
        yy1.b.InterfaceC6199b.Displayed displayed2 = (yy1.b.InterfaceC6199b.Displayed) state;
        o40.a.Icon icon = new o40.a.Icon(jz.a.J3, null, d.f230763a, x(displayed2.getCitizenElectoralData().getVoteRight().getRightType()), displayed2.getCitizenElectoralData().getVoteRight().getRightType() == yi0.h.MINOR_AGE ? this.labelProvider.c(qy1.a.f169509h0) : null, null, 34, null);
        c30.b bVarV = v(displayed2.getCitizenElectoralData().getVoteRight().getRightType() != yi0.h.INACTIVE && displayed2.getCitizenElectoralData().getRegisteredArea() == null, params.b());
        FindOutMoreData findOutMoreDataI = i(params.g(), params.h(), params.f());
        er.a<i0> aVarC = params.c();
        Label labelC = this.labelProvider.c(qy1.a.Y);
        List<ElectionsArea> listC = displayed2.getCitizenElectoralData().c();
        int i15 = 3;
        if (listC == null || (listU0 = pq.v.U0(listC, new c())) == null) {
            displayed = displayed2;
            cardListData = null;
        } else {
            List<ElectionsArea> list = listU0;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            for (final ElectionsArea electionsArea : list) {
                arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: yy1.f
                    @Override // er.a
                    public final Object a() {
                        return j.m(params, state, electionsArea);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(electionsArea.getElectionsName(), "electionName"), null, null, i15, null)), n50.l.b(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(electionsArea.getElectionsDate()), fz.c.DOTTED), "electionsDate"), null, null, 3, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
                displayed2 = displayed2;
                i15 = 3;
            }
            displayed = displayed2;
            cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        }
        Label labelC2 = this.labelProvider.c(qy1.a.f169499c0);
        List<Statement> listB = displayed.getCitizenElectoralData().getVoteRight().b();
        return new Displayed(baseScaffoldData, icon, bVarV, findOutMoreDataI, aVarC, new ModalBottomSheetData(new ModalSheetState(E(displayed.getIsBottomSheetVisible()), true, new er.l() { // from class: yy1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.r(params, this, (g30.v) obj);
            }
        }), null, new er.a() { // from class: yy1.i
            @Override // er.a
            public final Object a() {
                return j.s(params);
            }
        }, null, 10, null), new Displayed(labelC, cardListData, labelC2, (listB == null || (statement = (Statement) pq.v.n0(listB)) == null) ? null : z(statement), this.labelProvider.c(qy1.a.F), new CardListData(pq.v.e(new DefaultSingleCardData(null, new er.a() { // from class: yy1.g
            @Override // er.a
            public final Object a() {
                return j.q(params, state);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(qy1.a.H), null, null, 3, null)), n50.l.b(this.labelProvider.c(qy1.a.G), null, null, 3, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null)), null, false, null, null, 30, null)));
    }
}
