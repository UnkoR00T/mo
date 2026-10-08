package yu1;

import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import mx.Label;
import oq.i0;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceScope;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import zu1.DrivingLicenceBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyu1/g;", "Lxw/f;", "Lyu1/g$a;", "Lzu1/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lyu1/g$a;)Lzu1/a;", "a", "Lmx/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, DrivingLicenceBottomSheetData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yu1.g$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lyu1/g$a;", "", "Lxu1/w$a$a;", "bottomSheetState", "Lkotlin/Function1;", "Loq/i0;", "onSetBottomSheetState", "Lou1/f;", "scope", "<init>", "(Lxu1/w$a$a;Ler/l;Lou1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxu1/w$a$a;", "()Lxu1/w$a$a;", "b", "Ler/l;", "()Ler/l;", "c", "Lou1/f;", "()Lou1/f;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final xu1.w.Initialized.InterfaceC5918a bottomSheetState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<xu1.w.Initialized.InterfaceC5918a, i0> onSetBottomSheetState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceData scope;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(xu1.w.Initialized.InterfaceC5918a interfaceC5918a, er.l<? super xu1.w.Initialized.InterfaceC5918a, i0> lVar, DrivingLicenceData drivingLicenceData) {
            this.bottomSheetState = interfaceC5918a;
            this.onSetBottomSheetState = lVar;
            this.scope = drivingLicenceData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final xu1.w.Initialized.InterfaceC5918a getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final er.l<xu1.w.Initialized.InterfaceC5918a, i0> b() {
            return this.onSetBottomSheetState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DrivingLicenceData getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.bottomSheetState, params.bottomSheetState) && fr.t.c(this.onSetBottomSheetState, params.onSetBottomSheetState) && fr.t.c(this.scope, params.scope);
        }

        public int hashCode() {
            int iHashCode = ((this.bottomSheetState.hashCode() * 31) + this.onSetBottomSheetState.hashCode()) * 31;
            DrivingLicenceData drivingLicenceData = this.scope;
            return iHashCode + (drivingLicenceData == null ? 0 : drivingLicenceData.hashCode());
        }

        public String toString() {
            return "Params(bottomSheetState=" + this.bottomSheetState + ", onSetBottomSheetState=" + this.onSetBottomSheetState + ", scope=" + this.scope + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229558a;

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
            f229558a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<g30.v, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f229559j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params) {
            super(1, fr.t.a.class, "onValueChange", "invoke$onValueChange(Lpl/gov/coi/mobywatel/feature/drivinglicence/presentation/main/mapper/DrivingLicenceMainBottomSheetMapper$Params;Lpl/gov/coi/common/ui/ds/bottomsheet/ModalSheetValue;)V", 0);
            this.f229559j = params;
        }

        public final void E(g30.v vVar) {
            g.s(this.f229559j, vVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g30.v vVar) {
            E(vVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<g30.v, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f229560j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Params params) {
            super(1, fr.t.a.class, "onValueChange", "invoke$onValueChange(Lpl/gov/coi/mobywatel/feature/drivinglicence/presentation/main/mapper/DrivingLicenceMainBottomSheetMapper$Params;Lpl/gov/coi/common/ui/ds/bottomsheet/ModalSheetValue;)V", 0);
            this.f229560j = params;
        }

        public final void E(g30.v vVar) {
            g.s(this.f229560j, vVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g30.v vVar) {
            E(vVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<g30.v, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f229561j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Params params) {
            super(1, fr.t.a.class, "onValueChange", "invoke$onValueChange(Lpl/gov/coi/mobywatel/feature/drivinglicence/presentation/main/mapper/DrivingLicenceMainBottomSheetMapper$Params;Lpl/gov/coi/common/ui/ds/bottomsheet/ModalSheetValue;)V", 0);
            this.f229561j = params;
        }

        public final void E(g30.v vVar) {
            g.s(this.f229561j, vVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g30.v vVar) {
            E(vVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.l<g30.v, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f229562j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Params params) {
            super(1, fr.t.a.class, "onValueChange", "invoke$onValueChange(Lpl/gov/coi/mobywatel/feature/drivinglicence/presentation/main/mapper/DrivingLicenceMainBottomSheetMapper$Params;Lpl/gov/coi/common/ui/ds/bottomsheet/ModalSheetValue;)V", 0);
            this.f229562j = params;
        }

        public final void E(g30.v vVar) {
            g.s(this.f229562j, vVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g30.v vVar) {
            E(vVar);
            return i0.f148189a;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        r(params);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.b().b(xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        r(params);
        return i0.f148189a;
    }

    private static final void r(Params params) {
        params.b().b(xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Params params, g30.v vVar) {
        int i15 = b.f229558a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return;
        }
        if (i15 != 3) {
            throw new oq.p();
        }
        r(params);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0177  */
    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public DrivingLicenceBottomSheetData b(final Params params) {
        Label labelC;
        DrivingLicenceScope scope;
        DrivingLicenceContainerData data;
        String strH;
        xu1.w.Initialized.InterfaceC5918a bottomSheetState = params.getBottomSheetState();
        if (fr.t.c(bottomSheetState, xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a)) {
            return new DrivingLicenceBottomSheetData(new ModalBottomSheetData(new ModalSheetState(g30.v.HIDDEN, false, new c(params), 2, null), null, null, null, 14, null), null);
        }
        if (bottomSheetState == xu1.w.Initialized.InterfaceC5918a.b.TEMPORARY_DRIVING_LICENCE_VALIDITY) {
            ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(g30.v.EXPANDED, false, new d(params), 2, null), this.labelProvider.c(iu1.a.Y), new er.a() { // from class: yu1.d
                @Override // er.a
                public final Object a() {
                    return g.l(params);
                }
            }, null, 8, null);
            mx.c cVar = this.labelProvider;
            return new DrivingLicenceBottomSheetData(modalBottomSheetData, new DrivingLicenceBottomSheetData.InterfaceC6414a.TemporaryDrivingLicenceValidity(new InfoRowListData(pq.v.q(new t40.a.C4874a(cVar.c(iu1.a.C0)), new t40.a.C4874a(cVar.c(iu1.a.D0)), new t40.a.C4874a(cVar.c(iu1.a.E0)), new t40.a.C4874a(cVar.c(iu1.a.F0)), new t40.a.C4874a(cVar.c(iu1.a.G0)), new t40.a.C4874a(cVar.c(iu1.a.H0))))));
        }
        if (bottomSheetState == xu1.w.Initialized.InterfaceC5918a.b.DIFFERENCES_BETWEEN_DIGITAL_AND_PHYSICAL) {
            ModalBottomSheetData modalBottomSheetData2 = new ModalBottomSheetData(new ModalSheetState(g30.v.EXPANDED, false, new e(params), 2, null), this.labelProvider.c(iu1.a.Y), new er.a() { // from class: yu1.e
                @Override // er.a
                public final Object a() {
                    return g.m(params);
                }
            }, null, 8, null);
            mx.c cVar2 = this.labelProvider;
            return new DrivingLicenceBottomSheetData(modalBottomSheetData2, new DrivingLicenceBottomSheetData.InterfaceC6414a.DifferencesBetweenDigitalAndPhysical(cVar2.c(iu1.a.T), new InfoRowListData(pq.v.q(new t40.a.C4874a(cVar2.c(iu1.a.U)), new t40.a.C4874a(cVar2.c(iu1.a.V)), new t40.a.C4874a(cVar2.c(iu1.a.W)))), cVar2.c(iu1.a.X)));
        }
        if (bottomSheetState != xu1.w.Initialized.InterfaceC5918a.b.STATUS_CHANGE_INFO) {
            throw new oq.p();
        }
        ModalBottomSheetData modalBottomSheetData3 = new ModalBottomSheetData(new ModalSheetState(g30.v.EXPANDED, false, new f(params), 2, null), this.labelProvider.c(iu1.a.f97145h0), new er.a() { // from class: yu1.f
            @Override // er.a
            public final Object a() {
                return g.q(params);
            }
        }, null, 8, null);
        DrivingLicenceData scope2 = params.getScope();
        if (scope2 == null || (scope = scope2.getScope()) == null || (data = scope.getData()) == null || (strH = data.h()) == null) {
            labelC = this.labelProvider.c(iu1.a.f97143g0);
        } else {
            String str = strH.length() > 0 ? strH : null;
            if (str == null || (labelC = mx.b.b(str, "bottomsheetContentDescription")) == null) {
                labelC = this.labelProvider.c(iu1.a.f97143g0);
            }
        }
        return new DrivingLicenceBottomSheetData(modalBottomSheetData3, new DrivingLicenceBottomSheetData.InterfaceC6414a.StatusChangeInfo(labelC));
    }
}
