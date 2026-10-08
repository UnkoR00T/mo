package rn3;

import androidx.compose.ui.graphics.Color;
import bn3.VehicleDocumentContainerData;
import bn3.VehicleDocumentData;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pn3.o;
import pn3.p;
import pq.v;
import q40.IconPageData;
import q40.j;
import sn3.VehicleItemModel;
import tn3.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020$¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020$¢\u0006\u0004\b,\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lrn3/d;", "Lxw/f;", "Lrn3/d$a;", "Lpn3/p$a;", "Lmx/c;", "labelProvider", "Ltn3/e;", "Ldn3/a$a;", "insuranceValidityResolver", "Ldn3/a$b;", "technicalExaminationValidityResolver", "Lxm3/a;", "getVehicleIconUseCase", "<init>", "(Lmx/c;Ltn3/e;Ltn3/e;Lxm3/a;)V", "", "Lbn3/h;", "params", "Lsn3/a;", "x", "(Ljava/util/List;Lrn3/d$a;)Ljava/util/List;", "", "shortName", "Lkotlin/Function0;", "Loq/i0;", "onDeleteData", "onBackPressed", "Li50/a;", "l", "(Ljava/lang/String;Ler/a;Ler/a;)Li50/a;", "onUpdateDataClick", "Lh30/a;", "m", "(Ler/a;)Lh30/a;", "a", "b", "Lmx/a;", "r", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "s", "(Lrn3/d$a;)Lpn3/p$a;", "i", "()Lmx/a;", "h", "q", "Lmx/c;", "Ltn3/e;", "c", "d", "Lxm3/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e<dn3.a.Insurance> insuranceValidityResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e<dn3.a.TechnicalExamination> technicalExaminationValidityResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xm3.a getVehicleIconUseCase;

    /* JADX INFO: renamed from: rn3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lrn3/d$a;", "", "Lpn3/o;", "vehicleListState", "Lkotlin/Function1;", "Lbn3/h;", "Loq/i0;", "onVehicleClick", "Lkotlin/Function0;", "onBackPressed", "onUpdateDataClick", "onDeleteDataClick", "onReportErrorClick", "<init>", "(Lpn3/o;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpn3/o;", "f", "()Lpn3/o;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o vehicleListState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<VehicleDocumentData, i0> onVehicleClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateDataClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteDataClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReportErrorClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o oVar, l<? super VehicleDocumentData, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.vehicleListState = oVar;
            this.onVehicleClick = lVar;
            this.onBackPressed = aVar;
            this.onUpdateDataClick = aVar2;
            this.onDeleteDataClick = aVar3;
            this.onReportErrorClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onDeleteDataClick;
        }

        public final er.a<i0> c() {
            return this.onReportErrorClick;
        }

        public final er.a<i0> d() {
            return this.onUpdateDataClick;
        }

        public final l<VehicleDocumentData, i0> e() {
            return this.onVehicleClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.vehicleListState, params.vehicleListState) && t.c(this.onVehicleClick, params.onVehicleClick) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onUpdateDataClick, params.onUpdateDataClick) && t.c(this.onDeleteDataClick, params.onDeleteDataClick) && t.c(this.onReportErrorClick, params.onReportErrorClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final o getVehicleListState() {
            return this.vehicleListState;
        }

        public int hashCode() {
            return (((((((((this.vehicleListState.hashCode() * 31) + this.onVehicleClick.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onUpdateDataClick.hashCode()) * 31) + this.onDeleteDataClick.hashCode()) * 31) + this.onReportErrorClick.hashCode();
        }

        public String toString() {
            return "Params(vehicleListState=" + this.vehicleListState + ", onVehicleClick=" + this.onVehicleClick + ", onBackPressed=" + this.onBackPressed + ", onUpdateDataClick=" + this.onUpdateDataClick + ", onDeleteDataClick=" + this.onDeleteDataClick + ", onReportErrorClick=" + this.onReportErrorClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f175346a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(570266837);
            if (p076m2.t.k()) {
                p076m2.t.o(570266837, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehiclelist.mapper.VehicleListMapper.getScaffoldData.<anonymous> (VehicleListMapper.kt:135)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar, e<dn3.a.Insurance> eVar, e<dn3.a.TechnicalExamination> eVar2, xm3.a aVar) {
        this.labelProvider = cVar;
        this.insuranceValidityResolver = eVar;
        this.technicalExaminationValidityResolver = eVar2;
        this.getVehicleIconUseCase = aVar;
    }

    private final BaseScaffoldData l(String shortName, er.a<i0> onDeleteData, er.a<i0> onBackPressed) {
        Label labelN;
        if (shortName == null || (labelN = mx.b.b(shortName, "title")) == null) {
            labelN = this.labelProvider.c(um3.b.f199271v1).n("title");
        }
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackPressed), labelN, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216850f, b.f175346a, null, onDeleteData, 4, null)), null, 20, null), null, null, null, null, 61, null);
    }

    private final ButtonData m(er.a<i0> onUpdateDataClick) {
        k30.d.a aVar = k30.d.a.f107773a;
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(um3.b.f199233j), null, 2, null), aVar, k30.b.c.f107768a, onUpdateDataClick, 3, null);
    }

    private final Label r(String a15, String b15) {
        return mx.b.d(v.v0(v.s(a15, b15), " ", null, null, 0, null, null, 62, null), "VehicleListScreenVehicleNameLabel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    private final List<VehicleItemModel> x(List<VehicleDocumentData> list, final Params params) {
        bn3.l vehicleType;
        List<VehicleDocumentData> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final VehicleDocumentData vehicleDocumentData : list2) {
            xm3.a aVar = this.getVehicleIconUseCase;
            VehicleDocumentContainerData data = vehicleDocumentData.getScope().getData();
            int iIntValue = aVar.a(new xm3.a.Params((data == null || (vehicleType = data.getVehicleType()) == null) ? null : an3.a.a(vehicleType))).intValue();
            VehicleDocumentContainerData data2 = vehicleDocumentData.getScope().getData();
            String make = data2 != null ? data2.getMake() : null;
            VehicleDocumentContainerData data3 = vehicleDocumentData.getScope().getData();
            Label labelR = r(make, data3 != null ? data3.getModel() : null);
            VehicleDocumentContainerData data4 = vehicleDocumentData.getScope().getData();
            arrayList.add(new VehicleItemModel(iIntValue, labelR, mx.b.d(data4 != null ? data4.getRegistrationNumber() : null, "VehicleListScreenVehicleRegistrationNumber"), (dn3.a.Insurance) e.a(this.insuranceValidityResolver, vehicleDocumentData.getScope().getData(), false, 2, null), (dn3.a.TechnicalExamination) e.a(this.technicalExaminationValidityResolver, vehicleDocumentData.getScope().getData(), false, 2, null), new er.a() { // from class: rn3.c
                @Override // er.a
                public final Object a() {
                    return d.z(params, vehicleDocumentData);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, VehicleDocumentData vehicleDocumentData) {
        params.e().b(vehicleDocumentData);
        return i0.f148189a;
    }

    public final Label h() {
        return this.labelProvider.c(um3.b.f199212c);
    }

    public final Label i() {
        return this.labelProvider.c(um3.b.f199215d);
    }

    public final Label q() {
        return this.labelProvider.c(um3.b.f199257r);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p.a b(final Params params) {
        o vehicleListState = params.getVehicleListState();
        if (t.c(vehicleListState, o.c.f161275a)) {
            return p.a.c.f161286a;
        }
        if (!(vehicleListState instanceof o.DataLoaded)) {
            if (!(vehicleListState instanceof o.Empty)) {
                throw new oq.p();
            }
            return new p.a.Empty(l(((o.Empty) vehicleListState).getShortName(), params.b(), params.a()), new IconPageData(new j.a(jz.a.f106888w), this.labelProvider.c(um3.b.f199262s1), this.labelProvider.c(um3.b.f199259r1), null, null, null, false, 72, null), m(new er.a() { // from class: rn3.b
                @Override // er.a
                public final Object a() {
                    return d.v(params);
                }
            }));
        }
        return new p.a.DataLoaded(l(((o.DataLoaded) vehicleListState).getShortName(), params.b(), params.a()), this.labelProvider.c(um3.b.f199265t1), this.labelProvider.c(um3.b.f199268u1), x(((o.DataLoaded) params.getVehicleListState()).getVehicles().a(), params), new c30.b.c(null, null, this.labelProvider.c(um3.b.f199270v0), this.labelProvider.c(um3.b.f199267u0), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(um3.b.f199227h), null, null, params.c(), 13, null)), 51, null), m(new er.a() { // from class: rn3.a
            @Override // er.a
            public final Object a() {
                return d.u(params);
            }
        }));
    }
}
