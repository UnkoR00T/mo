package kd3;

import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import hd3.RailwayCardData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import ld3.UutCardBottomSheetData;
import mx.Label;
import mz3.z;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o20.s2;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkd3/t;", "Lxw/f;", "Lkd3/t$a;", "Ljd3/o$a;", "Lmx/c;", "labelProvider", "Lkd3/j;", "uutCardDocumentMapper", "<init>", "(Lmx/c;Lkd3/j;)V", "Ljd3/n$a;", "state", "params", "Ljd3/o$a$a;", "z", "(Ljd3/n$a;Lkd3/t$a;)Ljd3/o$a$a;", "Lg30/v;", "bottomSheetValue", "Lkotlin/Function0;", "Loq/i0;", "onBottomSheetClose", "Lg30/n;", "r", "(Lg30/v;Ler/a;)Lg30/n;", "Ljd3/n$c;", "v", "(Ljd3/n$c;Lkd3/t$a;)Ljd3/o$a$a;", "", "m", "(Ljava/lang/String;)Ljava/lang/String;", "l", "u", "(Lkd3/t$a;)Ljd3/o$a;", "a", "Lmx/c;", "b", "Lkd3/j;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements xw.f<Params, jd3.o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j uutCardDocumentMapper;

    /* JADX INFO: renamed from: kd3.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b4\u0010/R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b6\u00108R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b%\u0010/R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b2\u00108R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b,\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b0\u00108¨\u00069"}, d2 = {"Lkd3/t$a;", "", "Ln20/b;", "Ljd3/n;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function1;", "Ly30/n$b$b;", "Loq/i0;", "onSwitchItemChanged", "Lmz3/z$b;", "onRefreshUutDataClicked", "Lhd3/e;", "onSelectedCard", "Lld3/a;", "onShowQrCodeClicked", "", "onConfirmYourDataClicked", "Lkotlin/Function0;", "onDeleteClicked", "Ln20/a;", "dispatchAction", "onCloseExpirationDateBanner", "onBackClick", "onBottomSheetClose", "<init>", "(Ln20/b;Lo20/s2;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "l", "()Ln20/b;", "b", "Lo20/s2;", "()Lo20/s2;", "c", "Ler/l;", "k", "()Ler/l;", "d", "h", "e", "i", "f", "j", "g", "Ler/a;", "()Ler/a;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<jd3.n> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<y30.n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<z.b, i0> onRefreshUutDataClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<RailwayCardData, i0> onSelectedCard;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<UutCardBottomSheetData, i0> onShowQrCodeClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onConfirmYourDataClicked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClicked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseExpirationDateBanner;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<jd3.n> state, s2 s2Var, er.l<? super y30.n.Switch.EnumC5973b, i0> lVar, er.l<? super z.b, i0> lVar2, er.l<? super RailwayCardData, i0> lVar3, er.l<? super UutCardBottomSheetData, i0> lVar4, er.l<? super String, i0> lVar5, er.a<i0> aVar, er.l<? super n20.a, i0> lVar6, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.documentVMS = s2Var;
            this.onSwitchItemChanged = lVar;
            this.onRefreshUutDataClicked = lVar2;
            this.onSelectedCard = lVar3;
            this.onShowQrCodeClicked = lVar4;
            this.onConfirmYourDataClicked = lVar5;
            this.onDeleteClicked = aVar;
            this.dispatchAction = lVar6;
            this.onCloseExpirationDateBanner = aVar2;
            this.onBackClick = aVar3;
            this.onBottomSheetClose = aVar4;
        }

        public final er.l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final er.a<i0> d() {
            return this.onBottomSheetClose;
        }

        public final er.a<i0> e() {
            return this.onCloseExpirationDateBanner;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.documentVMS, params.documentVMS) && fr.t.c(this.onSwitchItemChanged, params.onSwitchItemChanged) && fr.t.c(this.onRefreshUutDataClicked, params.onRefreshUutDataClicked) && fr.t.c(this.onSelectedCard, params.onSelectedCard) && fr.t.c(this.onShowQrCodeClicked, params.onShowQrCodeClicked) && fr.t.c(this.onConfirmYourDataClicked, params.onConfirmYourDataClicked) && fr.t.c(this.onDeleteClicked, params.onDeleteClicked) && fr.t.c(this.dispatchAction, params.dispatchAction) && fr.t.c(this.onCloseExpirationDateBanner, params.onCloseExpirationDateBanner) && fr.t.c(this.onBackClick, params.onBackClick) && fr.t.c(this.onBottomSheetClose, params.onBottomSheetClose);
        }

        public final er.l<String, i0> f() {
            return this.onConfirmYourDataClicked;
        }

        public final er.a<i0> g() {
            return this.onDeleteClicked;
        }

        public final er.l<z.b, i0> h() {
            return this.onRefreshUutDataClicked;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.onSwitchItemChanged.hashCode()) * 31) + this.onRefreshUutDataClicked.hashCode()) * 31) + this.onSelectedCard.hashCode()) * 31) + this.onShowQrCodeClicked.hashCode()) * 31) + this.onConfirmYourDataClicked.hashCode()) * 31) + this.onDeleteClicked.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onCloseExpirationDateBanner.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onBottomSheetClose.hashCode();
        }

        public final er.l<RailwayCardData, i0> i() {
            return this.onSelectedCard;
        }

        public final er.l<UutCardBottomSheetData, i0> j() {
            return this.onShowQrCodeClicked;
        }

        public final er.l<y30.n.Switch.EnumC5973b, i0> k() {
            return this.onSwitchItemChanged;
        }

        public final State<jd3.n> l() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ", onRefreshUutDataClicked=" + this.onRefreshUutDataClicked + ", onSelectedCard=" + this.onSelectedCard + ", onShowQrCodeClicked=" + this.onShowQrCodeClicked + ", onConfirmYourDataClicked=" + this.onConfirmYourDataClicked + ", onDeleteClicked=" + this.onDeleteClicked + ", dispatchAction=" + this.dispatchAction + ", onCloseExpirationDateBanner=" + this.onCloseExpirationDateBanner + ", onBackClick=" + this.onBackClick + ", onBottomSheetClose=" + this.onBottomSheetClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110230a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f110230a = iArr;
        }
    }

    public t(mx.c cVar, j jVar) {
        this.labelProvider = cVar;
        this.uutCardDocumentMapper = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params) {
        params.h().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, RailwayCardData railwayCardData) {
        params.i().b(railwayCardData);
        return i0.f148189a;
    }

    private final String l(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        return ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
    }

    private final String m(String str) {
        return pq.v.v0(fu.r.V0(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new er.l() { // from class: kd3.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.q(this.f110215a, (String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(t tVar, String str) {
        return tVar.l(str);
    }

    private final ModalBottomSheetData r(v bottomSheetValue, final er.a<i0> onBottomSheetClose) {
        return new ModalBottomSheetData(new ModalSheetState(bottomSheetValue, false, new er.l() { // from class: kd3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.s(onBottomSheetClose, (v) obj);
            }
        }, 2, null), this.labelProvider.c(ed3.a.f49494a), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.a aVar, v vVar) {
        int i15 = b.f110230a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    private final jd3.o.a.DataLoaded v(jd3.n.PackageDataLoaded state, final Params params) {
        Label labelN;
        String documentShortName = state.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(ed3.a.H).n("title");
        }
        return new jd3.o.a.DataLoaded(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ed3.a.K), new er.a() { // from class: kd3.o
            @Override // er.a
            public final Object a() {
                return t.x(params);
            }
        }, (state.getAnotherOwnCard().getScope().getData().l() && state.getSelectedCard().getScope().getData().l()) ? new y30.n.Switch(new y30.n.Switch.TabItem(this.labelProvider.c(ed3.a.D), y30.n.Switch.EnumC5973b.LEFT), new y30.n.Switch.TabItem(this.labelProvider.c(ed3.a.I), y30.n.Switch.EnumC5973b.RIGHT), state.getSelectedItem(), false, params.k(), 8, null) : null, pq.v.n(), this.uutCardDocumentMapper.b(new j.Params(params.l(), params.getDocumentVMS(), params.f(), params.h(), params.g(), params.a(), params.e(), params.j(), params.d())), r(state.getBottomSheetValue(), params.d()), state.getBottomSheetContentData(), params.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.h().b(z.b.UPDATE);
        return i0.f148189a;
    }

    private final jd3.o.a.DataLoaded z(jd3.n.DataLoaded state, final Params params) {
        Label labelN;
        String documentShortName = state.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(ed3.a.H).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ed3.a.K);
        er.a aVar = new er.a() { // from class: kd3.p
            @Override // er.a
            public final Object a() {
                return t.E(params);
            }
        };
        y30.n.Switch r15 = (state.getUutCardData().c().isEmpty() || !state.getSelectedCard().getScope().getData().l()) ? null : new y30.n.Switch(new y30.n.Switch.TabItem(this.labelProvider.c(ed3.a.M), y30.n.Switch.EnumC5973b.LEFT), new y30.n.Switch.TabItem(this.labelProvider.c(ed3.a.L), y30.n.Switch.EnumC5973b.RIGHT), state.getSelectedItem(), false, params.k(), 8, null);
        Collection<RailwayCardData> collectionValues = state.getUutCardData().c().values();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionValues, 10));
        for (final RailwayCardData railwayCardData : collectionValues) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: kd3.q
                @Override // er.a
                public final Object a() {
                    return t.F(params, railwayCardData);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(m(railwayCardData.getScope().getData().a()), "fullName"), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new jd3.o.a.DataLoaded(baseScaffoldData, labelC, aVar, r15, arrayList, this.uutCardDocumentMapper.b(new j.Params(params.l(), params.getDocumentVMS(), params.f(), params.h(), params.g(), params.a(), params.e(), params.j(), params.d())), r(state.getBottomSheetValue(), params.d()), state.getBottomSheetContentData(), params.c());
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public jd3.o.a b(Params params) {
        jd3.n nVarD = params.l().d();
        if (fr.t.c(nVarD, jd3.n.b.f102094a)) {
            return jd3.o.a.b.f102116a;
        }
        if (nVarD instanceof jd3.n.DataLoaded) {
            return z((jd3.n.DataLoaded) nVarD, params);
        }
        if (nVarD instanceof jd3.n.PackageDataLoaded) {
            return v((jd3.n.PackageDataLoaded) nVarD, params);
        }
        throw new oq.p();
    }
}
