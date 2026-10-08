package ky3;

import androidx.compose.ui.graphics.Color;
import by3.BlikRequiredData;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import ly3.OneClickPaymentBottomSheetData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import ur0.BEAlias;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lky3/s;", "Lxw/f;", "Lky3/s$a;", "Lky3/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lky3/e$a$a;", "Lkotlin/Function1;", "Lur0/a;", "Loq/i0;", "onAliasClick", "Lkotlin/Function2;", "", "", "isAliasSelected", "", "Ln50/g;", "I", "(Lky3/e$a$a;Ler/l;Ler/p;)Ljava/util/List;", "Lmx/a;", "u", "(Lky3/e$a$a;)Lmx/a;", "params", "Lc30/b$c;", "r", "(Lky3/s$a;)Lc30/b$c;", "v", "(Lky3/s$a;)Lky3/j$a;", "a", "Lmx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements xw.f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ky3.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b-\u0010+R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b(\u0010+R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b$\u0010'R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b \u0010+¨\u00063"}, d2 = {"Lky3/s$a;", "", "Lky3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "onBlikCodeChanged", "toInterruptionDialog", "Lur0/a;", "onPayWithOneClick", "Lby3/b;", "onPayWithBlikCodeClick", "onAliasClick", "Lkotlin/Function2;", "", "isAliasSelected", "hideOneClickPaymentInfoAlert", "Lg30/v;", "bottomSheetVisibilityChange", "<init>", "(Lky3/e;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/l;Ler/p;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lky3/e;", "g", "()Lky3/e;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "getOnBlikCodeChanged", "()Ler/l;", "h", "e", "f", "Ler/p;", "i", "()Ler/p;", "j", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onBlikCodeChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toInterruptionDialog;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BEAlias, oq.i0> onPayWithOneClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BlikRequiredData, oq.i0> onPayWithBlikCodeClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BEAlias, oq.i0> onAliasClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<String, String, Boolean> isAliasSelected;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> hideOneClickPaymentInfoAlert;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<g30.v, oq.i0> bottomSheetVisibilityChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, er.a<oq.i0> aVar, er.l<? super String, oq.i0> lVar, er.a<oq.i0> aVar2, er.l<? super BEAlias, oq.i0> lVar2, er.l<? super BlikRequiredData, oq.i0> lVar3, er.l<? super BEAlias, oq.i0> lVar4, er.p<? super String, ? super String, Boolean> pVar, er.a<oq.i0> aVar3, er.l<? super g30.v, oq.i0> lVar5) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.onBlikCodeChanged = lVar;
            this.toInterruptionDialog = aVar2;
            this.onPayWithOneClick = lVar2;
            this.onPayWithBlikCodeClick = lVar3;
            this.onAliasClick = lVar4;
            this.isAliasSelected = pVar;
            this.hideOneClickPaymentInfoAlert = aVar3;
            this.bottomSheetVisibilityChange = lVar5;
        }

        public final er.l<g30.v, oq.i0> a() {
            return this.bottomSheetVisibilityChange;
        }

        public final er.a<oq.i0> b() {
            return this.hideOneClickPaymentInfoAlert;
        }

        public final er.l<BEAlias, oq.i0> c() {
            return this.onAliasClick;
        }

        public final er.a<oq.i0> d() {
            return this.onBackClick;
        }

        public final er.l<BlikRequiredData, oq.i0> e() {
            return this.onPayWithBlikCodeClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackClick, params.onBackClick) && fr.t.c(this.onBlikCodeChanged, params.onBlikCodeChanged) && fr.t.c(this.toInterruptionDialog, params.toInterruptionDialog) && fr.t.c(this.onPayWithOneClick, params.onPayWithOneClick) && fr.t.c(this.onPayWithBlikCodeClick, params.onPayWithBlikCodeClick) && fr.t.c(this.onAliasClick, params.onAliasClick) && fr.t.c(this.isAliasSelected, params.isAliasSelected) && fr.t.c(this.hideOneClickPaymentInfoAlert, params.hideOneClickPaymentInfoAlert) && fr.t.c(this.bottomSheetVisibilityChange, params.bottomSheetVisibilityChange);
        }

        public final er.l<BEAlias, oq.i0> f() {
            return this.onPayWithOneClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final e getState() {
            return this.state;
        }

        public final er.a<oq.i0> h() {
            return this.toInterruptionDialog;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onBlikCodeChanged.hashCode()) * 31) + this.toInterruptionDialog.hashCode()) * 31) + this.onPayWithOneClick.hashCode()) * 31) + this.onPayWithBlikCodeClick.hashCode()) * 31) + this.onAliasClick.hashCode()) * 31) + this.isAliasSelected.hashCode()) * 31) + this.hideOneClickPaymentInfoAlert.hashCode()) * 31) + this.bottomSheetVisibilityChange.hashCode();
        }

        public final er.p<String, String, Boolean> i() {
            return this.isAliasSelected;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onBlikCodeChanged=" + this.onBlikCodeChanged + ", toInterruptionDialog=" + this.toInterruptionDialog + ", onPayWithOneClick=" + this.onPayWithOneClick + ", onPayWithBlikCodeClick=" + this.onPayWithBlikCodeClick + ", onAliasClick=" + this.onAliasClick + ", isAliasSelected=" + this.isAliasSelected + ", hideOneClickPaymentInfoAlert=" + this.hideOneClickPaymentInfoAlert + ", bottomSheetVisibilityChange=" + this.bottomSheetVisibilityChange + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f113339a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(2007303001);
            if (p076m2.t.k()) {
                p076m2.t.o(2007303001, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.oneclickpayment.OneClickPaymentMapper.invoke.<anonymous> (OneClickPaymentMapper.kt:97)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public s(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(Params params) {
        params.a().b(g30.v.EXPANDED);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(Params params) {
        params.a().b(g30.v.HIDDEN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(Params params) {
        params.f().b(((e.a.Aliases) params.getState()).getSelectedAlias());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(Params params) {
        params.e().b(((e.a.Aliases) params.getState()).getPaymentData());
        return oq.i0.f148189a;
    }

    private final List<DefaultSingleCardData> I(e.a.Aliases aliases, final er.l<? super BEAlias, oq.i0> lVar, er.p<? super String, ? super String, Boolean> pVar) {
        DefaultSingleCardData defaultSingleCardData;
        List<BEAlias> listD = aliases.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        for (final BEAlias bEAlias : listD) {
            if (aliases.d().size() == 1) {
                defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEAlias.getAppLabel(), "alias"), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null);
            } else {
                LeadingSection leadingSection = new LeadingSection(false, new n50.d.RadioButton(pVar.B(bEAlias.getOneClickAliasId(), aliases.getSelectedAlias().getOneClickAliasId()).booleanValue(), false, 2, null), null, 5, null);
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: ky3.l
                    @Override // er.a
                    public final Object a() {
                        return s.J(lVar, bEAlias);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEAlias.getAppLabel(), "alias"), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection, null, null, 3325, null);
            }
            arrayList.add(defaultSingleCardData);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.l lVar, BEAlias bEAlias) {
        lVar.b(bEAlias);
        return oq.i0.f148189a;
    }

    private final c30.b.c r(final Params params) {
        return new c30.b.c(null, null, null, this.labelProvider.c(px3.b.P), params.b(), null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(px3.b.f163125e), null, null, new er.a() { // from class: ky3.k
            @Override // er.a
            public final Object a() {
                return s.s(params);
            }
        }, 13, null)), 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Params params) {
        params.a().b(g30.v.EXPANDED);
        return oq.i0.f148189a;
    }

    private final Label u(e.a.Aliases aliases) {
        return aliases.d().size() == 1 ? this.labelProvider.c(px3.b.V) : this.labelProvider.c(px3.b.Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(Params params, g30.v vVar) {
        params.a().b(vVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(Params params) {
        params.a().b(g30.v.HIDDEN);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j.a b(final Params params) {
        e state = params.getState();
        if (fr.t.c(state, d.f113257a)) {
            return new j.a.Initial(params.d());
        }
        if (state instanceof Error) {
            return new j.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (!(state instanceof e.a.Aliases)) {
            if ((state instanceof View) || (state instanceof View)) {
                return new j.a.Confirmation(this.labelProvider.c(px3.b.E), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.h()), Label.INSTANCE.c(), null, null, null, 28, null), null, null, null, null, 61, null));
            }
            if (state instanceof Error) {
                return new j.a.Error(((Error) params.getState()).getErrorVMS());
            }
            if (state instanceof Error) {
                return new j.a.Error(((Error) params.getState()).getErrorVMS());
            }
            throw new oq.p();
        }
        er.a<oq.i0> aVarD = params.d();
        Label labelC = this.labelProvider.c(px3.b.X);
        Label labelU = u((e.a.Aliases) params.getState());
        List<BEAlias> listD = ((e.a.Aliases) params.getState()).d();
        Label labelC2 = this.labelProvider.c(px3.b.Y);
        Label labelC3 = this.labelProvider.c(px3.b.W);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(((e.a.Aliases) params.getState()).getBottomSheetState(), true, new er.l() { // from class: ky3.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.x(params, (g30.v) obj);
            }
        }), this.labelProvider.c(px3.b.f163127f), new er.a() { // from class: ky3.n
            @Override // er.a
            public final Object a() {
                return s.z(params);
            }
        }, null, 8, null);
        OneClickPaymentBottomSheetData oneClickPaymentBottomSheetData = new OneClickPaymentBottomSheetData(this.labelProvider.c(px3.b.T), this.labelProvider.c(px3.b.R), this.labelProvider.c(px3.b.U), this.labelProvider.c(px3.b.S));
        List<DefaultSingleCardData> listI = I((e.a.Aliases) params.getState(), params.c(), params.i());
        c30.b.c cVarR = r(params);
        if (!((e.a.Aliases) params.getState()).getShouldShowOneClickPaymentInfoAlert()) {
            cVarR = null;
        }
        return new j.a.Aliases(aVarD, labelC, labelU, listD, labelC2, new er.a() { // from class: ky3.q
            @Override // er.a
            public final Object a() {
                return s.G(params);
            }
        }, labelC3, new er.a() { // from class: ky3.r
            @Override // er.a
            public final Object a() {
                return s.H(params);
            }
        }, modalBottomSheetData, oneClickPaymentBottomSheetData, listI, cVarR, new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(px3.b.f163140n), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, b.f113339a, null, new er.a() { // from class: ky3.o
            @Override // er.a
            public final Object a() {
                return s.E(params);
            }
        }, 4, null)), null, 20, null), null, pq.v0.f(oq.y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: ky3.p
            @Override // er.a
            public final Object a() {
                return s.F(params);
            }
        })), null, null, 53, null));
    }
}
