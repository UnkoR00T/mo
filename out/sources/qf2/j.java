package qf2;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pf2.s0;
import pq.v;
import rf2.InternetSpeedConfigData;
import st3.AddressFormData;
import x50.NavigationButtonData;
import zi0.InternetSpeed;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqf2/j;", "Lxw/f;", "Lqf2/j$a;", "Lpf2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lpf2/b$c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDownlinkSpeedsClick", "onUplinkSpeedsClick", "Lrf2/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lpf2/b$c;Ler/a;Ler/a;)Lrf2/a;", "params", "s", "(Lqf2/j$a;)Lpf2/c$a;", "a", "Lmx/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, pf2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qf2.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001e\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b+\u0010*R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b&\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b\"\u0010*R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b,\u0010%¨\u0006-"}, d2 = {"Lqf2/j$a;", "", "Lpf2/b;", "state", "Lkotlin/Function1;", "Lrf2/b;", "Loq/i0;", "reportingReasonChanged", "Lrf2/c;", "internetSpeedSpecifyChanged", "Lkotlin/Function0;", "selectDownlinkSpeeds", "selectUplinkSpeeds", "Lst3/d;", "onNextClick", "onCloseWithDialogAction", "onBackAction", "", "selectedItem", "<init>", "(Lpf2/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpf2/b;", "i", "()Lpf2/b;", "b", "Ler/l;", "e", "()Ler/l;", "c", "d", "Ler/a;", "f", "()Ler/a;", "g", "h", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final pf2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<rf2.b, i0> reportingReasonChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<rf2.c, i0> internetSpeedSpecifyChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> selectDownlinkSpeeds;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> selectUplinkSpeeds;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AddressFormData, i0> onNextClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> selectedItem;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(pf2.b bVar, l<? super rf2.b, i0> lVar, l<? super rf2.c, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, l<? super AddressFormData, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4, l<? super Integer, i0> lVar4) {
            this.state = bVar;
            this.reportingReasonChanged = lVar;
            this.internetSpeedSpecifyChanged = lVar2;
            this.selectDownlinkSpeeds = aVar;
            this.selectUplinkSpeeds = aVar2;
            this.onNextClick = lVar3;
            this.onCloseWithDialogAction = aVar3;
            this.onBackAction = aVar4;
            this.selectedItem = lVar4;
        }

        public final l<rf2.c, i0> a() {
            return this.internetSpeedSpecifyChanged;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onCloseWithDialogAction;
        }

        public final l<AddressFormData, i0> d() {
            return this.onNextClick;
        }

        public final l<rf2.b, i0> e() {
            return this.reportingReasonChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.reportingReasonChanged, params.reportingReasonChanged) && t.c(this.internetSpeedSpecifyChanged, params.internetSpeedSpecifyChanged) && t.c(this.selectDownlinkSpeeds, params.selectDownlinkSpeeds) && t.c(this.selectUplinkSpeeds, params.selectUplinkSpeeds) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.selectedItem, params.selectedItem);
        }

        public final er.a<i0> f() {
            return this.selectDownlinkSpeeds;
        }

        public final er.a<i0> g() {
            return this.selectUplinkSpeeds;
        }

        public final l<Integer, i0> h() {
            return this.selectedItem;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.reportingReasonChanged.hashCode()) * 31) + this.internetSpeedSpecifyChanged.hashCode()) * 31) + this.selectDownlinkSpeeds.hashCode()) * 31) + this.selectUplinkSpeeds.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.selectedItem.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final pf2.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", reportingReasonChanged=" + this.reportingReasonChanged + ", internetSpeedSpecifyChanged=" + this.internetSpeedSpecifyChanged + ", selectDownlinkSpeeds=" + this.selectDownlinkSpeeds + ", selectUplinkSpeeds=" + this.selectUplinkSpeeds + ", onNextClick=" + this.onNextClick + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", onBackAction=" + this.onBackAction + ", selectedItem=" + this.selectedItem + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f166334a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(919060247);
            if (p076m2.t.k()) {
                p076m2.t.o(919060247, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.parameters.mappers.InternetParametersMapper.invoke.<anonymous> (InternetParametersMapper.kt:68)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f166335a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-716274860);
            if (p076m2.t.k()) {
                p076m2.t.o(-716274860, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.parameters.mappers.InternetParametersMapper.invoke.<anonymous>.<anonymous>.<anonymous> (InternetParametersMapper.kt:172)");
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
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f166336a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-452577835);
            if (p076m2.t.k()) {
                p076m2.t.o(-452577835, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.parameters.mappers.InternetParametersMapper.invoke.<anonymous>.<anonymous>.<anonymous> (InternetParametersMapper.kt:215)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, j jVar) {
        params.d().b(new AddressFormData(null, true, jVar.labelProvider.c(df2.a.f41368a), jVar.labelProvider.c(df2.a.I), null, null, null, 113, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, int i15) {
        params.h().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, int i15) {
        params.h().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    private final InternetSpeedConfigData H(pf2.b.Initialized state, final er.a<i0> onDownlinkSpeedsClick, final er.a<i0> onUplinkSpeedsClick) {
        Label labelC = this.labelProvider.c(df2.a.N);
        Label labelC2 = this.labelProvider.c(df2.a.f41374d);
        m error = !state.getData().getIsValidDownlinkSpeeds() ? new m.Error(this.labelProvider.c(df2.a.f41378f)) : new m.Enabled(this.labelProvider.c(df2.a.M));
        List<InternetSpeed> listC = state.getData().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternetSpeed) it.next()).b());
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC, arrayList, state.getData().getSelectedDownlinkSpeeds(), error, labelC2, false, null, new l() { // from class: qf2.a
            @Override // er.l
            public final Object b(Object obj) {
                return j.I(onDownlinkSpeedsClick, (DropDownButtonData) obj);
            }
        }, 96, null);
        Label labelC3 = this.labelProvider.c(df2.a.X);
        Label labelC4 = this.labelProvider.c(df2.a.f41374d);
        m.Enabled enabled = new m.Enabled(this.labelProvider.c(df2.a.W));
        List<InternetSpeed> listH = state.getData().h();
        ArrayList arrayList2 = new ArrayList(v.y(listH, 10));
        Iterator<T> it4 = listH.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((InternetSpeed) it4.next()).b());
        }
        return new InternetSpeedConfigData(dropDownButtonData, new DropDownButtonData(labelC3, arrayList2, state.getData().getSelectedUplinkSpeeds(), enabled, labelC4, false, null, new l() { // from class: qf2.b
            @Override // er.l
            public final Object b(Object obj) {
                return j.J(onUplinkSpeedsClick, (DropDownButtonData) obj);
            }
        }, 96, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(er.a aVar, DropDownButtonData dropDownButtonData) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.a aVar, DropDownButtonData dropDownButtonData) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.e().b(rf2.b.ACCESS);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.e().b(rf2.b.IMPROVEMENT);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.a().b(rf2.c.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.a().b(rf2.c.YES);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public pf2.c.a b(final Params params) {
        b50.d error;
        b50.d error2;
        pf2.b state = params.getState();
        if (t.c(state, pf2.b.C3891b.f157229a)) {
            return pf2.c.a.b.f157245a;
        }
        if (state instanceof pf2.b.Initialized) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(df2.a.V), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f166334a, null, params.c(), 4, null)), null, 20, null), null, null, null, null, 61, null);
            Label labelC = this.labelProvider.c(df2.a.f41408u);
            pf2.b.Initialized initialized = (pf2.b.Initialized) state;
            boolean z15 = true;
            if (initialized.getData().getReason() != rf2.b.ACCESS) {
                z15 = false;
            }
            List listQ = v.q(new RadioButtonRow(new RadioButtonItemData(false, z15, false, 5, null), new er.a() { // from class: qf2.c
                @Override // er.a
                public final Object a() {
                    return j.u(params);
                }
            }, this.labelProvider.c(df2.a.O), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, initialized.getData().getReason() == rf2.b.IMPROVEMENT, false, 5, null), new er.a() { // from class: qf2.d
                @Override // er.a
                public final Object a() {
                    return j.v(params);
                }
            }, this.labelProvider.c(df2.a.Y), null, null, 24, null));
            boolean isValidReason = initialized.getData().getIsValidReason();
            if (isValidReason == z15) {
                error = b50.d.c.f16683a;
            } else {
                if (isValidReason) {
                    throw new oq.p();
                }
                error = new b50.d.Error(this.labelProvider.c(df2.a.f41380g));
            }
            RadioButtonData radioButtonData = new RadioButtonData(listQ, b50.e.a.f16684a, error, null, null, null, null, 120, null);
            Label labelC2 = this.labelProvider.c(df2.a.Z);
            List listQ2 = v.q(new RadioButtonRow(new RadioButtonItemData(false, initialized.getData().getInternetSpeed() == rf2.c.NO ? z15 : false, false, 5, null), new er.a() { // from class: qf2.e
                @Override // er.a
                public final Object a() {
                    return j.x(params);
                }
            }, this.labelProvider.c(df2.a.f41404s), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, initialized.getData().getInternetSpeed() == rf2.c.YES ? z15 : false, false, 5, null), new er.a() { // from class: qf2.f
                @Override // er.a
                public final Object a() {
                    return j.z(params);
                }
            }, this.labelProvider.c(df2.a.B), null, new s0(H((pf2.b.Initialized) params.getState(), params.f(), params.g())), 8, null));
            boolean isValidInternetSpeed = initialized.getData().getIsValidInternetSpeed();
            if (isValidInternetSpeed) {
                error2 = b50.d.c.f16683a;
            } else {
                if (isValidInternetSpeed) {
                    throw new oq.p();
                }
                error2 = new b50.d.Error(this.labelProvider.c(df2.a.f41380g));
            }
            return new pf2.c.a.Initialized(baseScaffoldData, labelC, radioButtonData, labelC2, new RadioButtonData(listQ2, b50.e.b.f16685a, error2, null, null, null, null, 120, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41402r), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: qf2.g
                @Override // er.a
                public final Object a() {
                    return j.E(params, this);
                }
            }, 35, null));
        }
        final int i15 = 0;
        if (state instanceof pf2.b.SelectingDownlinkSpeeds) {
            BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(df2.a.f41369a0), null, null, null, 28, null), null, null, null, null, 61, null);
            pf2.b.SelectingDownlinkSpeeds selectingDownlinkSpeeds = (pf2.b.SelectingDownlinkSpeeds) state;
            List<InternetSpeed> listC = selectingDownlinkSpeeds.getData().c();
            ArrayList arrayList = new ArrayList(v.y(listC, 10));
            for (Object obj : listC) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                InternetSpeed internetSpeed = (InternetSpeed) obj;
                er.a aVar = new er.a() { // from class: qf2.h
                    @Override // er.a
                    public final Object a() {
                        return j.F(params, i15);
                    }
                };
                Label labelB = internetSpeed.b();
                c70.a aVar2 = c70.a.f23835a;
                BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(labelB, aVar2.a().V(internetSpeed.b().getText(), i16, selectingDownlinkSpeeds.getData().c().size()), null, 0, 0, null, 60, null)), null, 5, null);
                Integer selectedDownlinkSpeeds = selectingDownlinkSpeeds.getData().getSelectedDownlinkSpeeds();
                if (selectedDownlinkSpeeds == null || i15 != selectedDownlinkSpeeds.intValue()) {
                    internetSpeed = null;
                }
                arrayList.add(new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, bodySection, null, internetSpeed != null ? new x0.Icon(jz.a.f106783h, aVar2.a().B(), c.f166335a) : null, null, 2813, null));
                i15 = i16;
            }
            return new pf2.c.a.LinkSpeedSelector(baseScaffoldData2, new CardListData(arrayList, null, false, new CardListAccessibilityData(this.labelProvider.c(df2.a.f41369a0), Boolean.FALSE), null, 22, null), params.h(), params.b());
        }
        if (!(state instanceof pf2.b.SelectingUplinkSpeeds)) {
            if (state instanceof pf2.b.Error) {
                return new pf2.c.a.Error(((pf2.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData3 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(df2.a.f41369a0), null, null, null, 28, null), null, null, null, null, 61, null);
        pf2.b.SelectingUplinkSpeeds selectingUplinkSpeeds = (pf2.b.SelectingUplinkSpeeds) state;
        List<InternetSpeed> listH = selectingUplinkSpeeds.getData().h();
        ArrayList arrayList2 = new ArrayList(v.y(listH, 10));
        for (Object obj2 : listH) {
            int i17 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            InternetSpeed internetSpeed2 = (InternetSpeed) obj2;
            er.a aVar3 = new er.a() { // from class: qf2.i
                @Override // er.a
                public final Object a() {
                    return j.G(params, i15);
                }
            };
            Label labelB2 = internetSpeed2.b();
            c70.a aVar4 = c70.a.f23835a;
            BodySection bodySection2 = new BodySection(null, new n50.b.Title(new SingleCardLabel(labelB2, aVar4.a().V(internetSpeed2.b().getText(), i17, selectingUplinkSpeeds.getData().h().size()), null, 0, 0, null, 60, null)), null, 5, null);
            Integer selectedUplinkSpeeds = selectingUplinkSpeeds.getData().getSelectedUplinkSpeeds();
            if (selectedUplinkSpeeds == null || i15 != selectedUplinkSpeeds.intValue()) {
                internetSpeed2 = null;
            }
            arrayList2.add(new DefaultSingleCardData(null, aVar3, false, null, null, false, null, null, bodySection2, null, internetSpeed2 != null ? new x0.Icon(jz.a.f106783h, aVar4.a().B(), d.f166336a) : null, null, 2813, null));
            i15 = i17;
        }
        return new pf2.c.a.LinkSpeedSelector(baseScaffoldData3, new CardListData(arrayList2, null, false, new CardListAccessibilityData(this.labelProvider.c(df2.a.f41369a0), Boolean.FALSE), null, 22, null), params.h(), params.b());
    }
}
