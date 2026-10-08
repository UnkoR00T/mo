package uh3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import ja.n0;
import java.util.ArrayList;
import java.util.List;
import mu.g;
import mu.h;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import pq.IndexedValue;
import pq.v;
import t70.s;
import tv0.BEVehicleDataWithType;
import vh3.VehicleListAddedByPaging;
import vh3.VehicleListAddedManually;
import vq.j;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Luh3/f;", "Lxw/f;", "Luh3/f$a;", "Lsh3/f$a;", "Lmx/c;", "labelProvider", "Lxm3/a;", "getVehicleIconByTypeUseCase", "<init>", "(Lmx/c;Lxm3/a;)V", "Ltv0/k;", "", "testTag", "params", "Lhe3/d;", "i", "(Ltv0/k;Ljava/lang/String;Luh3/f$a;)Lhe3/d;", "", "Lmx/a;", "h", "(I)Lmx/a;", "f", "(Luh3/f$a;)Lsh3/f$a;", "a", "Lmx/c;", "b", "Lxm3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, sh3.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xm3.a getVehicleIconByTypeUseCase;

    /* JADX INFO: renamed from: uh3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Luh3/f$a;", "", "Lsh3/e;", "state", "Lkotlin/Function1;", "Ltv0/k;", "Loq/i0;", "onSelectVehicle", "Lkotlin/Function0;", "onAddVehicle", "onExitAction", "<init>", "(Lsh3/e;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsh3/e;", "d", "()Lsh3/e;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sh3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEVehicleDataWithType, i0> onSelectVehicle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddVehicle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sh3.e eVar, l<? super BEVehicleDataWithType, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = eVar;
            this.onSelectVehicle = lVar;
            this.onAddVehicle = aVar;
            this.onExitAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onAddVehicle;
        }

        public final er.a<i0> b() {
            return this.onExitAction;
        }

        public final l<BEVehicleDataWithType, i0> c() {
            return this.onSelectVehicle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final sh3.e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectVehicle, params.onSelectVehicle) && t.c(this.onAddVehicle, params.onAddVehicle) && t.c(this.onExitAction, params.onExitAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSelectVehicle.hashCode()) * 31) + this.onAddVehicle.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectVehicle=" + this.onSelectVehicle + ", onAddVehicle=" + this.onAddVehicle + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements g<n0<he3.d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f198503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f198504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Params f198505c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f198506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f198507b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Params f198508c;

            /* JADX INFO: renamed from: uh3.f$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5164a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198509d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198510e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198511f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198513h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198514j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198515k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198516l;

                public C5164a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198509d = obj;
                    this.f198510e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, f fVar, Params params) {
                this.f198506a = hVar;
                this.f198507b = fVar;
                this.f198508c = params;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5164a c5164a;
                if (eVar instanceof C5164a) {
                    c5164a = (C5164a) eVar;
                    int i15 = c5164a.f198510e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5164a.f198510e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5164a = new C5164a(eVar);
                    }
                } else {
                    c5164a = new C5164a(eVar);
                }
                Object obj2 = c5164a.f198509d;
                Object objE = uq.b.e();
                int i16 = c5164a.f198510e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f198506a;
                    IndexedValue indexedValue = (IndexedValue) obj;
                    n0 n0VarJ = s.J((n0) indexedValue.d(), this.f198507b.new c(indexedValue, this.f198508c));
                    c5164a.f198511f = j.a(obj);
                    c5164a.f198513h = j.a(c5164a);
                    c5164a.f198514j = j.a(obj);
                    c5164a.f198515k = j.a(hVar);
                    c5164a.f198516l = 0;
                    c5164a.f198510e = 1;
                    if (hVar.F(n0VarJ, c5164a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(g gVar, f fVar, Params params) {
            this.f198503a = gVar;
            this.f198504b = fVar;
            this.f198505c = params;
        }

        @Override // mu.g
        public Object a(h<? super n0<he3.d>> hVar, tq.e eVar) {
            Object objA = this.f198503a.a(new a(hVar, this.f198504b, this.f198505c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<Integer, BEVehicleDataWithType, he3.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IndexedValue<n0<BEVehicleDataWithType>> f198518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Params f198519c;

        c(IndexedValue<n0<BEVehicleDataWithType>> indexedValue, Params params) {
            this.f198518b = indexedValue;
            this.f198519c = params;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ he3.d B(Integer num, BEVehicleDataWithType bEVehicleDataWithType) {
            return c(num.intValue(), bEVehicleDataWithType);
        }

        public final he3.d c(int i15, BEVehicleDataWithType bEVehicleDataWithType) {
            return f.this.i(bEVehicleDataWithType, "VehicleCardPaging" + this.f198518b.c() + '_' + i15, this.f198519c);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f198520a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(859666694);
            if (p076m2.t.k()) {
                p076m2.t.o(859666694, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.mapper.VehicleListScreenMapper.invoke.<anonymous> (VehicleListScreenMapper.kt:134)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f198521a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1793003450);
            if (p076m2.t.k()) {
                p076m2.t.o(1793003450, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.mapper.VehicleListScreenMapper.invoke.<anonymous> (VehicleListScreenMapper.kt:141)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public f(mx.c cVar, xm3.a aVar) {
        this.labelProvider = cVar;
        this.getVehicleIconByTypeUseCase = aVar;
    }

    private final Label h(int i15) {
        return this.labelProvider.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final he3.d i(final BEVehicleDataWithType bEVehicleDataWithType, String str, final Params params) {
        return new he3.d(str, bEVehicleDataWithType.getVehicleData().m(), this.getVehicleIconByTypeUseCase.a(new xm3.a.Params(xd3.a.f(bEVehicleDataWithType.getType()))).intValue(), new he3.d.Description(h(md3.b.A5).getText(), c0.e(bEVehicleDataWithType.getVehicleData().getRegistrationNumber())), new he3.d.Description(h(md3.b.G5).getText(), c0.e(bEVehicleDataWithType.getVehicleData().getVin())), new er.a() { // from class: uh3.e
            @Override // er.a
            public final Object a() {
                return f.l(params, bEVehicleDataWithType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, BEVehicleDataWithType bEVehicleDataWithType) {
        params.c().b(bEVehicleDataWithType);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public sh3.f.a b(Params params) {
        sh3.e state = params.getState();
        if (t.c(state, sh3.e.c.f181754a)) {
            return new sh3.f.a.Loader(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null), h(md3.b.f125881z5), x70.a.C5796a.f217280c);
        }
        if (!(state instanceof sh3.e.List)) {
            if (!t.c(state, sh3.e.a.f181749a)) {
                throw new oq.p();
            }
            return new sh3.f.a.Empty(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null), h(md3.b.B5), h(md3.b.f125857w5), new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(h(md3.b.f125865x5), null, e.f198521a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, d.f198520a, null, null, 26, null), 3, null), null, null, 3325, null));
        }
        sh3.e.List list = (sh3.e.List) state;
        int i15 = 0;
        boolean z15 = list.getIsAnyVehicleFromBackend() && !list.c().isEmpty();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelH = h(md3.b.B5);
        Label labelH2 = h(md3.b.f125857w5);
        ButtonData buttonData = new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(h(md3.b.f125675a), this.labelProvider.c(md3.b.f125865x5)), k30.d.a.f107773a, null, params.a(), 35, null);
        Label labelH3 = z15 ? h(md3.b.F5) : null;
        List<BEVehicleDataWithType> listC = list.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(i((BEVehicleDataWithType) obj, "VehicleCardManuallyAdded" + i15, params));
            i15 = i16;
        }
        return new sh3.f.a.List(baseScaffoldData, labelH, labelH2, buttonData, new VehicleListAddedManually(labelH3, arrayList), new VehicleListAddedByPaging(z15 ? h(md3.b.H5) : null, new b(mu.i.e0(list.e()), this, params)), list.d());
    }
}
