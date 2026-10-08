package rh3;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import ph3.State;
import ph3.g;
import pq.v;
import sv0.v0;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yd3.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u001a2\b\b\u0001\u0010+\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lrh3/c;", "Lxw/f;", "Lrh3/c$a;", "Lph3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lph3/f;", "state", "Lhz/b;", "r", "(Lph3/f;)Lhz/b;", "Lkotlin/Function1;", "Lsv0/v0;", "Loq/i0;", "onDamageButtonClick", "", "Lh30/a;", "q", "(Lph3/f;Ler/l;)Ljava/util/Map;", "vehicleDamageType", "i", "(Lph3/f;Lsv0/v0;Ler/l;)Lh30/a;", "", "isDamageSelected", "Lmx/a;", "h", "(Lsv0/v0;Z)Lmx/a;", "Lyd3/h;", "vehicleDamageDetailsType", "", "s", "(Lyd3/h;)Ljava/util/List;", "f", "()Ljava/util/List;", "", "u", "(Lyd3/h;)Ljava/lang/Integer;", "x", "(Lyd3/h;)Z", "E", "(Lph3/f;)Z", "stringId", "z", "(I)Lmx/a;", "params", "v", "(Lrh3/c$a;)Lph3/g$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: rh3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010\"¨\u0006#"}, d2 = {"Lrh3/c$a;", "", "Lph3/f;", "state", "Lkotlin/Function1;", "Lsv0/v0;", "Loq/i0;", "onDamageButtonClick", "Lkotlin/Function0;", "onGoToNextStep", "onBackAction", "onExitAction", "<init>", "(Lph3/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lph3/f;", "e", "()Lph3/f;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "d", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v0, i0> onDamageButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super v0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onDamageButtonClick = lVar;
            this.onGoToNextStep = aVar;
            this.onBackAction = aVar2;
            this.onExitAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<v0, i0> b() {
            return this.onDamageButtonClick;
        }

        public final er.a<i0> c() {
            return this.onExitAction;
        }

        public final er.a<i0> d() {
            return this.onGoToNextStep;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onDamageButtonClick, params.onDamageButtonClick) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onDamageButtonClick.hashCode()) * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDamageButtonClick=" + this.onDamageButtonClick + ", onGoToNextStep=" + this.onGoToNextStep + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173892a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.StandardCar.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.TruckRigid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.Bus.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.Truck.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.Motorcycle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f173892a = iArr;
        }
    }

    /* JADX INFO: renamed from: rh3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4444c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4444c f173893a = new C4444c();

        C4444c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2094641566);
            if (p076m2.t.k()) {
                p076m2.t.o(2094641566, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.mapper.VehicleDamageDetailsScreenMapper.invoke.<anonymous> (VehicleDamageDetailsScreenMapper.kt:53)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final boolean E(State state) {
        if (state.getShowValidation()) {
            return state.c().isEmpty();
        }
        return false;
    }

    private final List<v0> f() {
        return v.q(v0.FRONT_DAMAGE, v0.BACK_DAMAGE, v0.TOP_DAMAGE, v0.LEFT_FRONT_DAMAGE, v0.RIGHT_FRONT_DAMAGE, v0.LEFT_SIDE_DAMAGE, v0.RIGHT_SIDE_DAMAGE, v0.LEFT_BACK_DAMAGE, v0.RIGHT_BACK_DAMAGE);
    }

    private final Label h(v0 vehicleDamageType, boolean isDamageSelected) {
        Label labelZ;
        Label labelZ2 = z(ie3.a.e(vehicleDamageType));
        if (isDamageSelected) {
            labelZ = z(md3.b.H0);
        } else {
            if (isDamageSelected) {
                throw new oq.p();
            }
            labelZ = z(md3.b.I0);
        }
        Label.Companion companion = Label.INSTANCE;
        return labelZ2.o(companion.d()).o(companion.b()).o(companion.d()).o(labelZ);
    }

    private final ButtonData i(State state, final v0 vehicleDamageType, final l<? super v0, i0> onDamageButtonClick) {
        boolean zContains = state.c().contains(vehicleDamageType);
        if (zContains) {
            return new ButtonData(null, null, new k30.a.Large(false), new k30.c.WithIcon(jz.a.f106783h, h(vehicleDamageType, true)), k30.d.a.f107773a, null, new er.a() { // from class: rh3.a
                @Override // er.a
                public final Object a() {
                    return c.l(onDamageButtonClick, vehicleDamageType);
                }
            }, 35, null);
        }
        if (zContains) {
            throw new oq.p();
        }
        return new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithIcon(jz.a.f106760e0, h(vehicleDamageType, false)), new k30.d.Secondary(null, 1, null), state.getShowValidation() ? k30.b.a.f107766a : k30.b.c.f107768a, new er.a() { // from class: rh3.b
            @Override // er.a
            public final Object a() {
                return c.m(onDamageButtonClick, vehicleDamageType);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, v0 v0Var) {
        lVar.b(v0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, v0 v0Var) {
        lVar.b(v0Var);
        return i0.f148189a;
    }

    private final Map<v0, ButtonData> q(State state, l<? super v0, i0> onDamageButtonClick) {
        List<v0> listS = s(state.getVehicleDamageDetailsType());
        if (listS == null) {
            return null;
        }
        List<v0> list = listS;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(pq.v0.e(v.y(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, i(state, (v0) obj, onDamageButtonClick));
        }
        return linkedHashMap;
    }

    private final hz.b r(State state) {
        boolean zE = E(state);
        if (zE) {
            return new hz.b.Invalid(z(md3.b.L5));
        }
        if (zE) {
            throw new oq.p();
        }
        return hz.b.d.f86848c;
    }

    private final List<v0> s(h vehicleDamageDetailsType) {
        switch (vehicleDamageDetailsType == null ? -1 : b.f173892a[vehicleDamageDetailsType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return f();
            case 4:
            case 5:
                return v.I0(f(), v0.TOP_DAMAGE);
            case 6:
                return v.I0(v.I0(f(), v0.FRONT_DAMAGE), v0.TOP_DAMAGE);
            case 7:
                return v.q(v0.FRONT_DAMAGE, v0.BACK_DAMAGE, v0.LEFT_SIDE_DAMAGE, v0.RIGHT_SIDE_DAMAGE);
            default:
                return f();
        }
    }

    private final Integer u(h vehicleDamageDetailsType) {
        switch (vehicleDamageDetailsType == null ? -1 : b.f173892a[vehicleDamageDetailsType.ordinal()]) {
            case -1:
                return Integer.valueOf(md3.a.f125665b);
            case 0:
            default:
                throw new oq.p();
            case 1:
                return Integer.valueOf(md3.a.f125665b);
            case 2:
                return Integer.valueOf(md3.a.f125669f);
            case 3:
                return Integer.valueOf(md3.a.f125664a);
            case 4:
                return Integer.valueOf(md3.a.f125670g);
            case 5:
                return Integer.valueOf(md3.a.f125667d);
            case 6:
                return Integer.valueOf(md3.a.f125668e);
            case 7:
                return Integer.valueOf(md3.a.f125666c);
        }
    }

    private final boolean x(h vehicleDamageDetailsType) {
        return vehicleDamageDetailsType != h.Trailer;
    }

    private final Label z(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        Label labelC = this.labelProvider.c(md3.b.f125847v3);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), labelC, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, C4444c.f173893a, null, params.c(), 4, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().d(), false, false, 6, null), 29, null);
        Label labelZ = z(md3.b.V5);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(z(md3.b.K), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
        return new g.Data(baseScaffoldData, labelZ, u(params.getState().getVehicleDamageDetailsType()), x(params.getState().getVehicleDamageDetailsType()), q(params.getState(), params.b()), r(params.getState()), buttonData);
    }
}
