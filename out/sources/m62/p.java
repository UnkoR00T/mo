package m62;

import android.graphics.Bitmap;
import fr.t;
import fu.r;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j62.FamilyCardData;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l60.KeyValueData;
import mx.Label;
import mz3.z;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import n62.FamilyCardBottomSheetData;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u0018*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lm62/p;", "Lxw/f;", "Lm62/p$a;", "Ll62/o$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lp20/c;", "giloshScreenMapper", "Lv20/a;", "documentValidityBannerMapper", "<init>", "(Lmx/c;Lez/e;Lez/c;Lrz/a;Liy/a;Lp20/c;Lv20/a;)V", "Ll62/n$a;", "params", "Landroid/graphics/Bitmap;", "cardNumberQrBitmap", "Lo20/k;", "K", "(Ll62/n$a;Lm62/p$a;Landroid/graphics/Bitmap;)Lo20/k;", "", "z", "(Ljava/lang/String;)Ljava/lang/String;", "x", "F", "(Lm62/p$a;)Ll62/o$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lez/c;", "d", "Lrz/a;", "e", "Liy/a;", "f", "Lp20/c;", "g", "Lv20/a;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements xw.f<Params, l62.o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v20.a documentValidityBannerMapper;

    /* JADX INFO: renamed from: m62.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b-\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b3\u00100R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b%\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b)\u00107R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b8\u0010,R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b5\u0010,R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b1\u0010,R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100¨\u0006;"}, d2 = {"Lm62/p$a;", "", "Ln20/b;", "Ll62/n;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onConfirmYourDataClicked", "Lkotlin/Function0;", "onShowCardPartnersClicked", "Lmz3/z$b;", "onRefreshFamilyDataClicked", "onDeleteClicked", "onBack", "onCloseExpirationDateBanner", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "Ly30/n$b$b;", "onSwitchItemChanged", "Lj62/e;", "onSelectedCard", "", "onChangeBottomSheetVisibility", "onTerminateDownloadClick", "<init>", "(Ln20/b;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Lo20/s2;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "l", "()Ln20/b;", "b", "Ler/l;", "f", "()Ler/l;", "c", "Ler/a;", "j", "()Ler/a;", "d", "h", "e", "g", "i", "Lo20/s2;", "()Lo20/s2;", "k", "m", "getOnTerminateDownloadClick", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<l62.n> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onConfirmYourDataClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowCardPartnersClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<z.b, i0> onRefreshFamilyDataClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseExpirationDateBanner;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<y30.n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<FamilyCardData, i0> onSelectedCard;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onChangeBottomSheetVisibility;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTerminateDownloadClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<l62.n> state, er.l<? super String, i0> lVar, er.a<i0> aVar, er.l<? super z.b, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super n20.a, i0> lVar3, s2 s2Var, er.l<? super y30.n.Switch.EnumC5973b, i0> lVar4, er.l<? super FamilyCardData, i0> lVar5, er.l<? super Boolean, i0> lVar6, er.a<i0> aVar5) {
            this.state = state;
            this.onConfirmYourDataClicked = lVar;
            this.onShowCardPartnersClicked = aVar;
            this.onRefreshFamilyDataClicked = lVar2;
            this.onDeleteClicked = aVar2;
            this.onBack = aVar3;
            this.onCloseExpirationDateBanner = aVar4;
            this.dispatchAction = lVar3;
            this.documentVMS = s2Var;
            this.onSwitchItemChanged = lVar4;
            this.onSelectedCard = lVar5;
            this.onChangeBottomSheetVisibility = lVar6;
            this.onTerminateDownloadClick = aVar5;
        }

        public final er.l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.l<Boolean, i0> d() {
            return this.onChangeBottomSheetVisibility;
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
            return t.c(this.state, params.state) && t.c(this.onConfirmYourDataClicked, params.onConfirmYourDataClicked) && t.c(this.onShowCardPartnersClicked, params.onShowCardPartnersClicked) && t.c(this.onRefreshFamilyDataClicked, params.onRefreshFamilyDataClicked) && t.c(this.onDeleteClicked, params.onDeleteClicked) && t.c(this.onBack, params.onBack) && t.c(this.onCloseExpirationDateBanner, params.onCloseExpirationDateBanner) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.documentVMS, params.documentVMS) && t.c(this.onSwitchItemChanged, params.onSwitchItemChanged) && t.c(this.onSelectedCard, params.onSelectedCard) && t.c(this.onChangeBottomSheetVisibility, params.onChangeBottomSheetVisibility) && t.c(this.onTerminateDownloadClick, params.onTerminateDownloadClick);
        }

        public final er.l<String, i0> f() {
            return this.onConfirmYourDataClicked;
        }

        public final er.a<i0> g() {
            return this.onDeleteClicked;
        }

        public final er.l<z.b, i0> h() {
            return this.onRefreshFamilyDataClicked;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.onConfirmYourDataClicked.hashCode()) * 31) + this.onShowCardPartnersClicked.hashCode()) * 31) + this.onRefreshFamilyDataClicked.hashCode()) * 31) + this.onDeleteClicked.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCloseExpirationDateBanner.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.documentVMS.hashCode()) * 31) + this.onSwitchItemChanged.hashCode()) * 31) + this.onSelectedCard.hashCode()) * 31) + this.onChangeBottomSheetVisibility.hashCode()) * 31) + this.onTerminateDownloadClick.hashCode();
        }

        public final er.l<FamilyCardData, i0> i() {
            return this.onSelectedCard;
        }

        public final er.a<i0> j() {
            return this.onShowCardPartnersClicked;
        }

        public final er.l<y30.n.Switch.EnumC5973b, i0> k() {
            return this.onSwitchItemChanged;
        }

        public final State<l62.n> l() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirmYourDataClicked=" + this.onConfirmYourDataClicked + ", onShowCardPartnersClicked=" + this.onShowCardPartnersClicked + ", onRefreshFamilyDataClicked=" + this.onRefreshFamilyDataClicked + ", onDeleteClicked=" + this.onDeleteClicked + ", onBack=" + this.onBack + ", onCloseExpirationDateBanner=" + this.onCloseExpirationDateBanner + ", dispatchAction=" + this.dispatchAction + ", documentVMS=" + this.documentVMS + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ", onSelectedCard=" + this.onSelectedCard + ", onChangeBottomSheetVisibility=" + this.onChangeBottomSheetVisibility + ", onTerminateDownloadClick=" + this.onTerminateDownloadClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f123878b;

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
            f123877a = iArr;
            int[] iArr2 = new int[j62.c.values().length];
            try {
                iArr2[j62.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f123878b = iArr2;
        }
    }

    public p(mx.c cVar, ez.e eVar, ez.c cVar2, rz.a aVar, iy.a aVar2, p20.c cVar3, v20.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.giloshScreenMapper = cVar3;
        this.documentValidityBannerMapper = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(p pVar, String str) {
        return pVar.x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params) {
        params.d().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params) {
        params.h().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, FamilyCardData familyCardData) {
        params.i().b(familyCardData);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, v vVar) {
        int i15 = b.f123877a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.d().b(Boolean.FALSE);
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0245  */
    /* JADX WARN: Code duplicated, block: B:34:0x0248  */
    /* JADX WARN: Code duplicated, block: B:37:0x0283  */
    /* JADX WARN: Code duplicated, block: B:38:0x0296  */
    /* JADX WARN: Code duplicated, block: B:41:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0356  */
    private final BaseDocumentData K(l62.n.DataLoaded dataLoaded, final Params params, Bitmap bitmap) {
        Bitmap bitmapA;
        char c15;
        SmallCardData smallCardData;
        SmallCardData smallCardData2;
        String ts4;
        String strD;
        Label labelC;
        Label label;
        String ed5;
        Date dateE;
        c30.b.C0606b c0606b;
        Object objB;
        final FamilyCardData selectedCard = dataLoaded.getSelectedCard();
        p20.c cVar = this.giloshScreenMapper;
        List listQ = pq.v.q(new u2.Logo(g62.a.f70894a, this.labelProvider.c(g62.b.f70901g)), new u2.Hologram(null, null, 3, null));
        State<l62.n> stateL = params.l();
        o20.p.u uVar = o20.p.u.f140955c;
        String photo = selectedCard.getScope().getData().getPhoto();
        if (photo != null) {
            rz.a aVar = this.bitmapDecoder;
            dx.i iVarC = iy.a.c(this.base64Coder, photo, null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarC).b();
            }
            bitmapA = aVar.a((byte[]) objB);
        } else {
            bitmapA = null;
        }
        Label labelC2 = this.labelProvider.c(g62.b.f70908n);
        boolean zE = selectedCard.getDocumentStatus().e();
        Label labelC3 = this.labelProvider.c(b.f123878b[selectedCard.getDocumentStatus().ordinal()] == 1 ? g62.b.f70906l : g62.b.f70903i);
        Label labelC4 = selectedCard.getScope().getData().g() ? this.labelProvider.c(g62.b.f70900f) : null;
        er.a aVar2 = new er.a() { // from class: m62.j
            @Override // er.a
            public final Object a() {
                return p.O(params);
            }
        };
        KeyValueData keyValueData = new KeyValueData(mx.b.b(selectedCard.getScope().getData().h(), "names"), this.labelProvider.c(g62.b.f70907m), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.b(selectedCard.getScope().getData().getLastName(), "lastName"), this.labelProvider.c(g62.b.f70910p), false, 4, null);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(selectedCard.getScope().getData().getP(), "pesel"), this.labelProvider.c(g62.b.f70909o), false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.b(selectedCard.getScope().getData().getNumber(), "number"), this.labelProvider.c(g62.b.f70914t), false, 4, null);
        String ed6 = selectedCard.getScope().getData().getED();
        if (ed6 != null) {
            c15 = 0;
            String strD2 = this.dateFormatter.d(new fz.b.String(ed6, fz.c.BLANK_REVERSED, false, 4, null), fz.c.DOTTED);
            if (strD2 == null || (labelB = mx.b.b(strD2, "expirationDate")) == null) {
            }
            DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, stateL, uVar, bitmapA, labelC2, null, null, zE, labelC3, labelC4, aVar2, pq.v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(labelB, this.labelProvider.c(g62.b.f70920z), false, 4, null)), null, null, params.a(), params.getDocumentVMS(), 12384, null));
            o20.l.SingleCardImageButton singleCardImageButton = new o20.l.SingleCardImageButton(bitmap, this.labelProvider.c(g62.b.E), new er.a() { // from class: m62.k
                @Override // er.a
                public final Object a() {
                    return p.P(params);
                }
            });
            Label labelC5 = this.labelProvider.c(g62.b.f70915u);
            int i15 = jz.a.f106785h1;
            o50.f.c cVar2 = o50.f.c.f142478a;
            SmallCardData smallCardData3 = new SmallCardData(null, labelC5, null, i15, cVar2, false, new er.a() { // from class: m62.l
                @Override // er.a
                public final Object a() {
                    return p.Q(params, selectedCard);
                }
            }, 37, null);
            SmallCardData smallCardData4 = new SmallCardData(null, this.labelProvider.c(g62.b.D), null, jz.a.f106895x, cVar2, false, params.j(), 37, null);
            smallCardData = new SmallCardData(null, this.labelProvider.c(g62.b.f70902h), null, jz.a.f106727a, o50.f.b.f142477a, false, params.g(), 37, null);
            if (selectedCard.getScope().getData().g()) {
                smallCardData2 = smallCardData;
            } else {
                smallCardData2 = null;
            }
            o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(pq.v.s(smallCardData3, smallCardData4, smallCardData2), new ShortcutMoreData(this.labelProvider.c(g62.b.f70911q), new er.l() { // from class: m62.m
                @Override // er.l
                public final Object b(Object obj) {
                    return p.R((List) obj);
                }
            })));
            Label labelC6 = this.labelProvider.c(g62.b.f70904j);
            ts4 = selectedCard.getScope().getDataHeader().getTs();
            if (ts4 != null) {
                strD = this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED);
            } else {
                strD = null;
            }
            Label labelD = mx.b.d(strD, "lastUpdateDate");
            labelC = this.labelProvider.c(g62.b.f70905k);
            if (selectedCard.getScope().getData().g()) {
                label = labelC;
            } else {
                label = null;
            }
            o20.l.UpdateDataItem updateDataItem = new o20.l.UpdateDataItem(labelC6, labelD, label, null, new er.a() { // from class: m62.n
                @Override // er.a
                public final Object a() {
                    return p.L(params, selectedCard);
                }
            }, 8, null);
            o20.l[] lVarArr = new o20.l[3];
            lVarArr[c15] = singleCardImageButton;
            lVarArr[1] = shortcuts;
            lVarArr[2] = updateDataItem;
            List listS = pq.v.s(lVarArr);
            v20.a aVar3 = this.documentValidityBannerMapper;
            ed5 = selectedCard.getScope().getData().getED();
            if (ed5 != null) {
                dateE = this.dateConverter.e(ed5, fz.c.BLANK_REVERSED);
            } else {
                dateE = null;
            }
            c30.b.C0606b c0606bB = aVar3.b(new v20.a.Params(dateE, g62.b.f70917w, g62.b.f70916v, g62.b.f70918x, g62.b.f70919y, new er.a() { // from class: m62.e
                @Override // er.a
                public final Object a() {
                    return p.N(params);
                }
            }, new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(g62.b.f70900f), null, null, new er.a() { // from class: m62.o
                @Override // er.a
                public final Object a() {
                    return p.M(params);
                }
            }, 13, null))));
            if (selectedCard.getScope().getData().g() || !dataLoaded.getShowExpirationDateBanner() || pq.v.q(j62.c.INACTIVE, j62.c.REVOKED).contains(selectedCard.getDocumentStatus())) {
                c0606b = null;
            } else {
                c0606b = c0606bB;
            }
            return new BaseDocumentData(null, null, null, documentGiloshDataB, listS, pq.v.r(c0606b), null, 71, null);
        }
        c15 = 0;
        Label labelB = mx.b.b(this.labelProvider.c(g62.b.C).getText().toUpperCase(Locale.ROOT), "infiniteExpirationDate");
        DocumentGiloshData documentGiloshDataB2 = cVar.b(new p20.c.Params(listQ, stateL, uVar, bitmapA, labelC2, null, null, zE, labelC3, labelC4, aVar2, pq.v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(labelB, this.labelProvider.c(g62.b.f70920z), false, 4, null)), null, null, params.a(), params.getDocumentVMS(), 12384, null));
        o20.l.SingleCardImageButton singleCardImageButton2 = new o20.l.SingleCardImageButton(bitmap, this.labelProvider.c(g62.b.E), new er.a() { // from class: m62.k
            @Override // er.a
            public final Object a() {
                return p.P(params);
            }
        });
        Label labelC7 = this.labelProvider.c(g62.b.f70915u);
        int i16 = jz.a.f106785h1;
        o50.f.c cVar3 = o50.f.c.f142478a;
        SmallCardData smallCardData5 = new SmallCardData(null, labelC7, null, i16, cVar3, false, new er.a() { // from class: m62.l
            @Override // er.a
            public final Object a() {
                return p.Q(params, selectedCard);
            }
        }, 37, null);
        SmallCardData smallCardData6 = new SmallCardData(null, this.labelProvider.c(g62.b.D), null, jz.a.f106895x, cVar3, false, params.j(), 37, null);
        smallCardData = new SmallCardData(null, this.labelProvider.c(g62.b.f70902h), null, jz.a.f106727a, o50.f.b.f142477a, false, params.g(), 37, null);
        if (selectedCard.getScope().getData().g()) {
            smallCardData2 = smallCardData;
        } else {
            smallCardData2 = null;
        }
        o20.l.Shortcuts shortcuts2 = new o20.l.Shortcuts(new ShortcutsLayoutData(pq.v.s(smallCardData5, smallCardData6, smallCardData2), new ShortcutMoreData(this.labelProvider.c(g62.b.f70911q), new er.l() { // from class: m62.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.R((List) obj);
            }
        })));
        Label labelC8 = this.labelProvider.c(g62.b.f70904j);
        ts4 = selectedCard.getScope().getDataHeader().getTs();
        if (ts4 != null) {
            strD = this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED);
        } else {
            strD = null;
        }
        Label labelD2 = mx.b.d(strD, "lastUpdateDate");
        labelC = this.labelProvider.c(g62.b.f70905k);
        if (selectedCard.getScope().getData().g()) {
            label = labelC;
        } else {
            label = null;
        }
        o20.l.UpdateDataItem updateDataItem2 = new o20.l.UpdateDataItem(labelC8, labelD2, label, null, new er.a() { // from class: m62.n
            @Override // er.a
            public final Object a() {
                return p.L(params, selectedCard);
            }
        }, 8, null);
        o20.l[] lVarArr2 = new o20.l[3];
        lVarArr2[c15] = singleCardImageButton2;
        lVarArr2[1] = shortcuts2;
        lVarArr2[2] = updateDataItem2;
        List listS2 = pq.v.s(lVarArr2);
        v20.a aVar4 = this.documentValidityBannerMapper;
        ed5 = selectedCard.getScope().getData().getED();
        if (ed5 != null) {
            dateE = this.dateConverter.e(ed5, fz.c.BLANK_REVERSED);
        } else {
            dateE = null;
        }
        c30.b.C0606b c0606bB2 = aVar4.b(new v20.a.Params(dateE, g62.b.f70917w, g62.b.f70916v, g62.b.f70918x, g62.b.f70919y, new er.a() { // from class: m62.e
            @Override // er.a
            public final Object a() {
                return p.N(params);
            }
        }, new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(g62.b.f70900f), null, null, new er.a() { // from class: m62.o
            @Override // er.a
            public final Object a() {
                return p.M(params);
            }
        }, 13, null))));
        if (selectedCard.getScope().getData().g()) {
            c0606b = null;
        } else {
            c0606b = null;
        }
        return new BaseDocumentData(null, null, null, documentGiloshDataB2, listS2, pq.v.r(c0606b), null, 71, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(Params params, FamilyCardData familyCardData) {
        params.h().b(z.b.UPDATE);
        i0 i0Var = i0.f148189a;
        familyCardData.getScope().getData().g();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.h().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params) {
        params.h().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params) {
        params.d().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params, FamilyCardData familyCardData) {
        params.f().b(familyCardData.getScope().getData().getNumber());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(List list) {
        return i0.f148189a;
    }

    private final String x(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        return ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
    }

    private final String z(String str) {
        return pq.v.v0(r.V0(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new er.l() { // from class: m62.f
            @Override // er.l
            public final Object b(Object obj) {
                return p.E(this.f123845a, (String) obj);
            }
        }, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public l62.o.a b(final Params params) {
        Label labelN;
        l62.n nVarD = params.l().d();
        if (nVarD instanceof l62.n.b) {
            return l62.o.a.b.f116556a;
        }
        if (!(nVarD instanceof l62.n.DataLoaded)) {
            throw new oq.p();
        }
        l62.n.DataLoaded dataLoaded = (l62.n.DataLoaded) nVarD;
        Bitmap bitmap = dataLoaded.c().get(dataLoaded.getSelectedCard().getScope().getData().getNumber());
        String documentShortName = dataLoaded.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(g62.b.F).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: m62.d
            @Override // er.a
            public final Object a() {
                return p.G(params);
            }
        })), null, null, 53, null);
        Label labelC = this.labelProvider.c(g62.b.G);
        er.a aVar = new er.a() { // from class: m62.g
            @Override // er.a
            public final Object a() {
                return p.H(params);
            }
        };
        y30.n.Switch r15 = (dataLoaded.getFamilyCardData().c().isEmpty() || !dataLoaded.getSelectedCard().getScope().getData().g()) ? null : new y30.n.Switch(new y30.n.Switch.TabItem(this.labelProvider.c(g62.b.B), y30.n.Switch.EnumC5973b.LEFT), new y30.n.Switch.TabItem(this.labelProvider.c(g62.b.A), y30.n.Switch.EnumC5973b.RIGHT), dataLoaded.getSelectedItem(), false, params.k(), 8, null);
        Map<String, FamilyCardData> mapC = dataLoaded.getFamilyCardData().c();
        ArrayList arrayList = new ArrayList(mapC.size());
        Iterator<Map.Entry<String, FamilyCardData>> it = mapC.entrySet().iterator();
        while (it.hasNext()) {
            final FamilyCardData value = it.next().getValue();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: m62.h
                @Override // er.a
                public final Object a() {
                    return p.I(params, value);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(z(value.getScope().getData().a()), "fullName"), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new l62.o.a.DataLoaded(baseScaffoldData, labelC, aVar, r15, arrayList, K(dataLoaded, params, bitmap), new ModalBottomSheetData(new ModalSheetState(dataLoaded.getIsBottomSheetVisible() ? v.EXPANDED : v.HIDDEN, false, new er.l() { // from class: m62.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.J(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(g62.b.f70895a), null, null, 12, null), new FamilyCardBottomSheetData(bitmap, this.labelProvider.c(g62.b.f70897c)), params.d());
    }
}
