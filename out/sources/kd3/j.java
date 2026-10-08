package kd3;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import hd3.RailwayCardData;
import j30.ButtonTextData;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import ld3.UutCardBottomSheetData;
import mx.Label;
import mz3.z;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001#BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lkd3/j;", "Lxw/f;", "Lkd3/j$a;", "Lo20/k;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lp20/c;", "giloshScreenMapper", "Lv20/a;", "documentValidityBannerMapper", "<init>", "(Lmx/c;Lez/e;Lez/c;Lrz/a;Liy/a;Lp20/c;Lv20/a;)V", "Lhd3/e;", "selectedCard", "", "showExpirationDateBanner", "params", "s", "(Lhd3/e;ZLkd3/j$a;)Lo20/k;", "Lmx/a;", "title", "value", "Ln50/g;", "r", "(Lmx/a;Lmx/a;)Ln50/g;", "q", "(Lkd3/j$a;)Lo20/k;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lez/c;", "d", "Lrz/a;", "e", "Liy/a;", "f", "Lp20/c;", "g", "Lv20/a;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, BaseDocumentData> {

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

    /* JADX INFO: renamed from: kd3.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b.\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b \u0010*R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010/R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010*R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b'\u0010/¨\u00061"}, d2 = {"Lkd3/j$a;", "", "Ln20/b;", "Ljd3/n;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function1;", "", "Loq/i0;", "onConfirmYourDataClicked", "Lmz3/z$b;", "onRefreshUutDataClicked", "Lkotlin/Function0;", "onDeleteClicked", "Ln20/a;", "dispatchAction", "onCloseExpirationDateBanner", "Lld3/a;", "onShowQrCodeClicked", "onBottomSheetClose", "<init>", "(Ln20/b;Lo20/s2;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "i", "()Ln20/b;", "b", "Lo20/s2;", "()Lo20/s2;", "c", "Ler/l;", "e", "()Ler/l;", "d", "g", "Ler/a;", "f", "()Ler/a;", "h", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<jd3.n> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onConfirmYourDataClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<z.b, i0> onRefreshUutDataClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseExpirationDateBanner;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<UutCardBottomSheetData, i0> onShowQrCodeClicked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<jd3.n> state, s2 s2Var, er.l<? super String, i0> lVar, er.l<? super z.b, i0> lVar2, er.a<i0> aVar, er.l<? super n20.a, i0> lVar3, er.a<i0> aVar2, er.l<? super UutCardBottomSheetData, i0> lVar4, er.a<i0> aVar3) {
            this.state = state;
            this.documentVMS = s2Var;
            this.onConfirmYourDataClicked = lVar;
            this.onRefreshUutDataClicked = lVar2;
            this.onDeleteClicked = aVar;
            this.dispatchAction = lVar3;
            this.onCloseExpirationDateBanner = aVar2;
            this.onShowQrCodeClicked = lVar4;
            this.onBottomSheetClose = aVar3;
        }

        public final er.l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBottomSheetClose;
        }

        public final er.a<i0> d() {
            return this.onCloseExpirationDateBanner;
        }

        public final er.l<String, i0> e() {
            return this.onConfirmYourDataClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.documentVMS, params.documentVMS) && fr.t.c(this.onConfirmYourDataClicked, params.onConfirmYourDataClicked) && fr.t.c(this.onRefreshUutDataClicked, params.onRefreshUutDataClicked) && fr.t.c(this.onDeleteClicked, params.onDeleteClicked) && fr.t.c(this.dispatchAction, params.dispatchAction) && fr.t.c(this.onCloseExpirationDateBanner, params.onCloseExpirationDateBanner) && fr.t.c(this.onShowQrCodeClicked, params.onShowQrCodeClicked) && fr.t.c(this.onBottomSheetClose, params.onBottomSheetClose);
        }

        public final er.a<i0> f() {
            return this.onDeleteClicked;
        }

        public final er.l<z.b, i0> g() {
            return this.onRefreshUutDataClicked;
        }

        public final er.l<UutCardBottomSheetData, i0> h() {
            return this.onShowQrCodeClicked;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.onConfirmYourDataClicked.hashCode()) * 31) + this.onRefreshUutDataClicked.hashCode()) * 31) + this.onDeleteClicked.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onCloseExpirationDateBanner.hashCode()) * 31) + this.onShowQrCodeClicked.hashCode()) * 31) + this.onBottomSheetClose.hashCode();
        }

        public final State<jd3.n> i() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", onConfirmYourDataClicked=" + this.onConfirmYourDataClicked + ", onRefreshUutDataClicked=" + this.onRefreshUutDataClicked + ", onDeleteClicked=" + this.onDeleteClicked + ", dispatchAction=" + this.dispatchAction + ", onCloseExpirationDateBanner=" + this.onCloseExpirationDateBanner + ", onShowQrCodeClicked=" + this.onShowQrCodeClicked + ", onBottomSheetClose=" + this.onBottomSheetClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f110192b;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f110191a = iArr;
            int[] iArr2 = new int[hd3.c.values().length];
            try {
                iArr2[hd3.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f110192b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f110193a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(p076m2.r rVar, int i15) {
            rVar.X(2114089927);
            if (p076m2.t.k()) {
                p076m2.t.o(2114089927, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.mapper.UutCardDocumentMapper.mapToUutCardDocumentState.<anonymous>.<anonymous> (UutCardDocumentMapper.kt:107)");
            }
            long jE = Color.INSTANCE.e();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f110194a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(p076m2.r rVar, int i15) {
            rVar.X(1096838904);
            if (p076m2.t.k()) {
                p076m2.t.o(1096838904, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.mapper.UutCardDocumentMapper.mapToUutCardDocumentState.<anonymous>.<anonymous> (UutCardDocumentMapper.kt:117)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jC);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f110195a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(p076m2.r rVar, int i15) {
            rVar.X(-1808780662);
            if (p076m2.t.k()) {
                p076m2.t.o(-1808780662, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.mapper.UutCardDocumentMapper.mapToUutCardDocumentState.<anonymous>.<anonymous> (UutCardDocumentMapper.kt:163)");
            }
            long jI = Color.INSTANCE.i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f110196a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(p076m2.r rVar, int i15) {
            rVar.X(743962793);
            if (p076m2.t.k()) {
                p076m2.t.o(743962793, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.mapper.UutCardDocumentMapper.mapToUutCardDocumentState.<anonymous>.<anonymous> (UutCardDocumentMapper.kt:164)");
            }
            long jI = Color.INSTANCE.i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    public j(mx.c cVar, ez.e eVar, ez.c cVar2, rz.a aVar, iy.a aVar2, p20.c cVar3, v20.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.giloshScreenMapper = cVar3;
        this.documentValidityBannerMapper = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, RailwayCardData railwayCardData) {
        params.e().b(railwayCardData.getScope().getData().getBatch() + railwayCardData.getScope().getData().getNumber());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, RailwayCardData railwayCardData) {
        params.g().b(z.b.UPDATE);
        i0 i0Var = i0.f148189a;
        railwayCardData.getScope().getData().l();
        return i0.f148189a;
    }

    private final DefaultSingleCardData r(Label title, Label value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(title, null, null, 3, null), new n50.b.Title(n50.l.b(value, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final BaseDocumentData s(final RailwayCardData selectedCard, boolean showExpirationDateBanner, final Params params) {
        Bitmap bitmapA;
        Object objB;
        Object objB2;
        ez.e eVar = this.dateFormatter;
        String expiryDate = selectedCard.getScope().getData().getExpiryDate();
        fz.c cVar = fz.c.BLANK_REVERSED;
        fz.b.String string = new fz.b.String(expiryDate, cVar, false, 4, null);
        fz.c cVar2 = fz.c.DOTTED;
        String strD = eVar.d(string, cVar2);
        p20.c cVar3 = this.giloshScreenMapper;
        List listQ = v.q(new u2.Flag(e20.k.Poland, this.labelProvider.c(ed3.a.f49500g)), new u2.Hologram(null, c.f110193a, 1, null));
        State<jd3.n> stateI = params.i();
        o20.p.q0 q0Var = o20.p.q0.f140935c;
        String photo = selectedCard.getPhoto();
        if (photo != null) {
            rz.a aVar = this.bitmapDecoder;
            dx.i iVarC = iy.a.c(this.base64Coder, photo, null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                objB2 = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB2 = ((dx.i.Right) iVarC).b();
            }
            bitmapA = aVar.a((byte[]) objB2);
        } else {
            bitmapA = null;
        }
        Label labelC = this.labelProvider.c(ed3.a.f49507n);
        d dVar = d.f110194a;
        Color colorM0boximpl = Color.m0boximpl(Color.INSTANCE.g());
        boolean zE = selectedCard.getDocumentStatus().e();
        Label labelC2 = this.labelProvider.c(b.f110192b[selectedCard.getDocumentStatus().ordinal()] == 1 ? ed3.a.f49505l : ed3.a.f49502i);
        Label labelC3 = selectedCard.getScope().getData().l() ? this.labelProvider.c(ed3.a.f49499f) : null;
        er.a aVar2 = new er.a() { // from class: kd3.c
            @Override // er.a
            public final Object a() {
                return j.u(params);
            }
        };
        String strM = selectedCard.getScope().getData().m();
        Locale locale = Locale.ROOT;
        KeyValueData keyValueData = new KeyValueData(mx.b.b(strM.toUpperCase(locale), "names"), this.labelProvider.c(ed3.a.f49506m), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.b(selectedCard.getScope().getData().getLastName().toUpperCase(locale), "lastName"), this.labelProvider.c(ed3.a.f49508o), false, 4, null);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.b(selectedCard.getScope().getData().getOuCategory().getValue().toUpperCase(locale), "ouCategory"), this.labelProvider.c(ed3.a.f49514u), false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.b(selectedCard.getScope().getData().getTrainClass(), "trainClass"), this.labelProvider.c(ed3.a.J), false, 4, null);
        KeyValueData keyValueData5 = new KeyValueData(mx.b.d(selectedCard.getScope().getData().getConcession(), "concession"), this.labelProvider.c(ed3.a.f49515v), false, 4, null);
        i0 i0Var = i0.f148189a;
        DocumentGiloshData documentGiloshDataB = cVar3.b(new p20.c.Params(listQ, stateI, q0Var, bitmapA, labelC, dVar, colorM0boximpl, zE, labelC2, labelC3, aVar2, v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, keyValueData5, new KeyValueData(mx.b.b(selectedCard.getScope().getData().getBatch() + selectedCard.getScope().getData().getNumber(), "batchNumber"), this.labelProvider.c(ed3.a.E), false, 4, null), new KeyValueData(mx.b.b(strD, "expirationDate"), this.labelProvider.c(ed3.a.C), false, 4, null)), e.f110195a, f.f110196a, params.a(), params.getDocumentVMS(), null));
        c30.b.C0606b c0606bB = this.documentValidityBannerMapper.b(new v20.a.Params(this.dateConverter.e(selectedCard.getScope().getData().getExpiryDate(), cVar), ed3.a.f49519z, ed3.a.f49518y, ed3.a.A, ed3.a.B, new er.a() { // from class: kd3.e
            @Override // er.a
            public final Object a() {
                return j.x(params);
            }
        }, new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(ed3.a.f49499f), null, null, new er.a() { // from class: kd3.d
            @Override // er.a
            public final Object a() {
                return j.v(params);
            }
        }, 13, null))));
        if (!selectedCard.getScope().getData().l() || !showExpirationDateBanner || v.q(hd3.c.INACTIVE, hd3.c.REVOKED).contains(selectedCard.getDocumentStatus())) {
            c0606bB = null;
        }
        List listR = v.r(c0606bB);
        rz.a aVar3 = this.bitmapDecoder;
        dx.i iVarC2 = iy.a.c(this.base64Coder, selectedCard.getScope().getData().getQrCode(), null, 2, null);
        if (iVarC2 instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC2).b();
        }
        final Bitmap bitmapA2 = aVar3.a((byte[]) objB);
        o20.l.SingleCardImageButton singleCardImageButton = new o20.l.SingleCardImageButton(bitmapA2, this.labelProvider.c(ed3.a.F), new er.a() { // from class: kd3.f
            @Override // er.a
            public final Object a() {
                return j.z(params, bitmapA2, this);
            }
        });
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(new SmallCardData(null, this.labelProvider.c(ed3.a.f49511r), null, jz.a.f106785h1, o50.f.c.f142478a, false, new er.a() { // from class: kd3.g
            @Override // er.a
            public final Object a() {
                return j.E(params, selectedCard);
            }
        }, 37, null), selectedCard.getScope().getData().l() ? new SmallCardData(null, this.labelProvider.c(ed3.a.f49501h), null, jz.a.f106727a, o50.f.b.f142477a, false, params.f(), 37, null) : null), new ShortcutMoreData(Label.INSTANCE.c(), new er.l() { // from class: kd3.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.F((List) obj);
            }
        })));
        o20.l.Section section = new o20.l.Section(null, v.s(r(this.labelProvider.c(ed3.a.f49517x), mx.b.b(selectedCard.getScope().getData().getEmployer(), "employer")), r(this.labelProvider.c(ed3.a.f49516w), mx.b.b(selectedCard.getScope().getData().getEmployerCode(), "employerCode"))), 1, null);
        Label labelC4 = this.labelProvider.c(ed3.a.f49503j);
        String ts4 = selectedCard.getScope().getDataHeader().getTs();
        return new BaseDocumentData(null, null, null, documentGiloshDataB, v.s(singleCardImageButton, shortcuts, section, new o20.l.UpdateDataItem(labelC4, mx.b.d(ts4 != null ? this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), cVar2) : null, "lastUpdateValue"), selectedCard.getScope().getData().l() ? this.labelProvider.c(ed3.a.f49504k) : null, null, new er.a() { // from class: kd3.i
            @Override // er.a
            public final Object a() {
                return j.G(params, selectedCard);
            }
        }, 8, null)), listR, v.e(new c30.b.c(null, null, null, this.labelProvider.c(ed3.a.G), null, null, null, 119, null)), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.g().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.g().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, Bitmap bitmap, j jVar) {
        params.h().b(new UutCardBottomSheetData(bitmap, jVar.labelProvider.c(ed3.a.f49496c), params.c()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public BaseDocumentData b(Params params) {
        boolean showExpirationDateBannerPackageI;
        jd3.n nVarD = params.i().d();
        if (fr.t.c(nVarD, jd3.n.b.f102094a)) {
            return null;
        }
        if (nVarD instanceof jd3.n.DataLoaded) {
            jd3.n.DataLoaded dataLoaded = (jd3.n.DataLoaded) nVarD;
            return s(dataLoaded.getSelectedCard(), dataLoaded.getShowExpirationDateBanner(), params);
        }
        if (!(nVarD instanceof jd3.n.PackageDataLoaded)) {
            throw new oq.p();
        }
        jd3.n.PackageDataLoaded packageDataLoaded = (jd3.n.PackageDataLoaded) nVarD;
        RailwayCardData selectedCard = packageDataLoaded.getSelectedCard();
        int i15 = b.f110191a[packageDataLoaded.getSelectedItem().ordinal()];
        if (i15 == 1) {
            showExpirationDateBannerPackageI = packageDataLoaded.getShowExpirationDateBannerPackageI();
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            showExpirationDateBannerPackageI = packageDataLoaded.getShowExpirationDateBannerPackageII();
        }
        return s(selectedCard, showExpirationDateBannerPackageI, params);
    }
}
