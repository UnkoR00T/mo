package bx3;

import androidx.compose.ui.graphics.Color;
import cw3.IdentityPhotoData;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mx.Label;
import o50.SmallCardData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v0;
import x40.LinkData;
import x50.NavigationButtonData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u0017*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u00020\u001f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u00020\u001f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0018\u0010)\u001a\u00020&*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lbx3/i;", "Lxw/f;", "Lbx3/i$a;", "Lax3/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lax3/e$b;", "Lkotlin/Function0;", "Loq/i0;", "enlargePhotoAction", "adjustPhotoAction", "", "Lo50/a;", "s", "(Lax3/e$b;Ler/a;Ler/a;)Ljava/util/List;", "E", "(Lbx3/i$a;)Ler/a;", "", "url", "Lkotlin/Function1;", "onUrlClick", "Lc30/b;", "m", "(Lax3/e$b;Ljava/lang/String;Ler/l;)Lc30/b;", "params", "x", "(Lbx3/i$a;)Lax3/f$a;", "a", "Lmx/c;", "Lh30/a;", "u", "(Lbx3/i$a;)Lh30/a;", "primaryButton", "v", "secondaryButton", "Lcw3/a$c;", "", "r", "(Lcw3/a$c;)I", "labelResId", "Lz30/a;", "q", "(Lbx3/i$a;)Ljava/util/List;", "bottomSheetContent", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, ax3.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: bx3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b\u001d\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b)\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b+\u0010$R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b%\u0010\u0016¨\u0006."}, d2 = {"Lbx3/i$a;", "", "Lax3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onUsePhotoAction", "Lkotlin/Function1;", "Lg30/v;", "toggleBottomSheet", "", "onPickNewPhotoAction", "enlargePhotoAction", "adjustPhotoAction", "onBackClick", "onCloseClick", "", "onLinkClick", "linkUrl", "<init>", "(Lax3/e;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/e;", "i", "()Lax3/e;", "b", "Ler/a;", "h", "()Ler/a;", "c", "Ler/l;", "j", "()Ler/l;", "d", "g", "e", "f", "Ljava/lang/String;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ax3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUsePhotoAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> toggleBottomSheet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onPickNewPhotoAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> enlargePhotoAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> adjustPhotoAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String linkUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ax3.e eVar, er.a<i0> aVar, l<? super v, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super String, i0> lVar3, String str) {
            this.state = eVar;
            this.onUsePhotoAction = aVar;
            this.toggleBottomSheet = lVar;
            this.onPickNewPhotoAction = lVar2;
            this.enlargePhotoAction = aVar2;
            this.adjustPhotoAction = aVar3;
            this.onBackClick = aVar4;
            this.onCloseClick = aVar5;
            this.onLinkClick = lVar3;
            this.linkUrl = str;
        }

        public final er.a<i0> a() {
            return this.adjustPhotoAction;
        }

        public final er.a<i0> b() {
            return this.enlargePhotoAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        public final er.a<i0> e() {
            return this.onCloseClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onUsePhotoAction, params.onUsePhotoAction) && t.c(this.toggleBottomSheet, params.toggleBottomSheet) && t.c(this.onPickNewPhotoAction, params.onPickNewPhotoAction) && t.c(this.enlargePhotoAction, params.enlargePhotoAction) && t.c(this.adjustPhotoAction, params.adjustPhotoAction) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.linkUrl, params.linkUrl);
        }

        public final l<String, i0> f() {
            return this.onLinkClick;
        }

        public final l<Boolean, i0> g() {
            return this.onPickNewPhotoAction;
        }

        public final er.a<i0> h() {
            return this.onUsePhotoAction;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onUsePhotoAction.hashCode()) * 31) + this.toggleBottomSheet.hashCode()) * 31) + this.onPickNewPhotoAction.hashCode()) * 31) + this.enlargePhotoAction.hashCode()) * 31) + this.adjustPhotoAction.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onLinkClick.hashCode()) * 31) + this.linkUrl.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ax3.e getState() {
            return this.state;
        }

        public final l<v, i0> j() {
            return this.toggleBottomSheet;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUsePhotoAction=" + this.onUsePhotoAction + ", toggleBottomSheet=" + this.toggleBottomSheet + ", onPickNewPhotoAction=" + this.onPickNewPhotoAction + ", enlargePhotoAction=" + this.enlargePhotoAction + ", adjustPhotoAction=" + this.adjustPhotoAction + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onLinkClick=" + this.onLinkClick + ", linkUrl=" + this.linkUrl + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21958a;

        static {
            int[] iArr = new int[IdentityPhotoData.c.values().length];
            try {
                iArr[IdentityPhotoData.c.FACE_IN_MASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentityPhotoData.c.PROPORTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentityPhotoData.c.NOT_TILTED_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentityPhotoData.c.NO_SMILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentityPhotoData.c.OPEN_EYES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentityPhotoData.c.SINGLE_PERSON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentityPhotoData.c.DETECT_FACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentityPhotoData.c.FACE_FACING_THE_LENS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f21958a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21959a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1997746767);
            if (p076m2.t.k()) {
                p076m2.t.o(1997746767, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.verification.mapper.VerificationMapper.invoke.<anonymous>.<anonymous>.<anonymous> (VerificationMapper.kt:89)");
            }
            long jF = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jF;
        }
    }

    public i(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final er.a<i0> E(final Params params) {
        return new er.a() { // from class: bx3.e
            @Override // er.a
            public final Object a() {
                return i.F(params);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params) {
        params.j().b(v.EXPANDED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.j().b(v.HIDDEN);
        params.g().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.j().b(v.HIDDEN);
        params.g().b(Boolean.FALSE);
        return i0.f148189a;
    }

    private final c30.b m(ax3.e.b bVar, String str, l<? super String, i0> lVar) {
        mx.c cVar = this.labelProvider;
        if (bVar.getStateData().getFaceValidationState() instanceof jw3.a.b) {
            return new c30.b.c(null, null, cVar.c(bw3.a.f21889p0), cVar.c(bw3.a.f21895s0), null, null, new c30.a.Link(new LinkData(null, cVar.c(bw3.a.f21871g0), str, LinkData.EnumC5775a.WEBSITE, false, lVar, 17, null)), 51, null);
        }
        return bVar.c() ? new c30.b.e(null, null, cVar.c(bw3.a.f21865d0), cVar.c(bw3.a.f21867e0), null, null, null, 115, null) : new c30.b.C0606b(null, null, cVar.c(bw3.a.V), cVar.c(bw3.a.U), null, null, null, 115, null);
    }

    private final List<FileBottomSheetItemData> q(final Params params) {
        mx.c cVar = this.labelProvider;
        return pq.v.q(new FileBottomSheetItemData(jz.a.f106760e0, cVar.c(bw3.a.f21868f), new er.a() { // from class: bx3.f
            @Override // er.a
            public final Object a() {
                return i.i(params);
            }
        }), new FileBottomSheetItemData(jz.a.f106818m, cVar.c(bw3.a.f21870g), new er.a() { // from class: bx3.g
            @Override // er.a
            public final Object a() {
                return i.l(params);
            }
        }));
    }

    private final int r(IdentityPhotoData.c cVar) {
        switch (b.f21958a[cVar.ordinal()]) {
            case 1:
                return bw3.a.f21875i0;
            case 2:
                return bw3.a.f21885n0;
            case 3:
                return bw3.a.f21877j0;
            case 4:
                return bw3.a.f21881l0;
            case 5:
                return bw3.a.f21883m0;
            case 6:
                return bw3.a.f21887o0;
            case 7:
                return bw3.a.f21879k0;
            case 8:
                return bw3.a.f21873h0;
            default:
                throw new oq.p();
        }
    }

    private final List<SmallCardData> s(ax3.e.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
        Label labelC = this.labelProvider.c(bw3.a.f21864d);
        int i15 = jz.a.f106791i0;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, aVar, 37, null);
        boolean isAdjustmentEnabled = bVar.getStateData().getIsAdjustmentEnabled();
        Boolean boolValueOf = Boolean.valueOf(isAdjustmentEnabled);
        if (!isAdjustmentEnabled) {
            boolValueOf = null;
        }
        return pq.v.s(smallCardData, boolValueOf != null ? new SmallCardData(null, this.labelProvider.c(bw3.a.f21858a), null, jz.a.f106819m0, cVar, false, aVar2, 37, null) : null);
    }

    private final ButtonData u(Params params) {
        int i15;
        er.a<i0> aVarE;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        mx.c cVar = this.labelProvider;
        boolean zD = ((ax3.e.b) params.getState()).d();
        if (zD) {
            i15 = bw3.a.X;
        } else {
            if (zD) {
                throw new oq.p();
            }
            i15 = bw3.a.W;
        }
        k30.c.WithText withText = new k30.c.WithText(cVar.c(i15), null, 2, null);
        boolean zD2 = ((ax3.e.b) params.getState()).d();
        if (zD2) {
            aVarE = params.h();
        } else {
            if (zD2) {
                throw new oq.p();
            }
            aVarE = E(params);
        }
        return new ButtonData(null, null, large, withText, aVar, null, aVarE, 35, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ButtonData v(Params params) {
        int i15;
        er.a<i0> aVarH;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.Secondary secondary = new k30.d.Secondary(null, 1, 0 == true ? 1 : 0);
        mx.c cVar = this.labelProvider;
        boolean zD = ((ax3.e.b) params.getState()).d();
        if (zD) {
            i15 = bw3.a.W;
        } else {
            if (zD) {
                throw new oq.p();
            }
            i15 = bw3.a.X;
        }
        k30.c.WithText withText = new k30.c.WithText(cVar.c(i15), null, 2, null);
        boolean zD2 = ((ax3.e.b) params.getState()).d();
        if (zD2) {
            aVarH = E(params);
        } else {
            if (zD2) {
                throw new oq.p();
            }
            aVarH = params.h();
        }
        return new ButtonData(null, null, large, withText, secondary, null, aVarH, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.j().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ax3.f.a b(final Params params) {
        ax3.f.a.Initialized.UnfulfilledRequirementsData dVar;
        ax3.e state = params.getState();
        if (state instanceof ax3.e.a) {
            return new ax3.f.a.Error(((ax3.e.a) state).getVmsAdapter());
        }
        if (state instanceof ax3.e.c) {
            return ax3.f.a.c.f14979a;
        }
        if (!(state instanceof ax3.e.b)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(bw3.a.f21869f0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.e(), 6, null)), null, 20, 0 == true ? 1 : 0), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: bx3.h
            @Override // er.a
            public final Object a() {
                return i.z(params);
            }
        })), null, null, 53, null);
        ax3.e.b bVar = (ax3.e.b) state;
        c30.b bVarM = m(bVar, params.getLinkUrl(), params.f());
        ax3.f.a.Initialized.PictureData cVar = new ax3.f.a.Initialized.PictureData(tw3.a.a(bVar.getStateData().getScaleType()), bVar.getStateData().getImageData().getBitmap(), s(bVar, params.b(), params.a()));
        er.a<i0> aVarD = params.d();
        jw3.a faceValidationState = bVar.getStateData().getFaceValidationState();
        jw3.a.Invalid invalid = faceValidationState instanceof jw3.a.Invalid ? (jw3.a.Invalid) faceValidationState : null;
        if (invalid != null) {
            Label labelC = this.labelProvider.c(bw3.a.f21893r0);
            Set<IdentityPhotoData.c> setA = invalid.a();
            ArrayList arrayList = new ArrayList(pq.v.y(setA, 10));
            Iterator<T> it = setA.iterator();
            while (it.hasNext()) {
                arrayList.add(new ax3.f.a.Initialized.UnfulfilledRequirementsData.Item(new d40.b.C0864b(null, jz.a.I1, d40.i.f.f39709e, c.f21959a, null, null, 33, null), this.labelProvider.c(r((IdentityPhotoData.c) it.next()))));
            }
            dVar = new ax3.f.a.Initialized.UnfulfilledRequirementsData(labelC, arrayList);
        } else {
            dVar = null;
        }
        ButtonData buttonDataU = u(params);
        Params params2 = bVar.c() ? params : null;
        ax3.f.a.Initialized.ButtonsData c0347b = new ax3.f.a.Initialized.ButtonsData(buttonDataU, params2 != null ? v(params2) : null);
        ax3.f.a.Initialized.BottomSheetData c0346a = new ax3.f.a.Initialized.BottomSheetData(new ModalBottomSheetData(new ModalSheetState(((ax3.e.b) params.getState()).getStateData().getBottomSheetValue(), false, params.j(), 2, null), null, null, null, 14, null), q(params));
        ax3.e state2 = params.getState();
        ax3.e.b.Dialog dialog = state2 instanceof ax3.e.b.Dialog ? (ax3.e.b.Dialog) state2 : null;
        return new ax3.f.a.Initialized(baseScaffoldData, bVarM, cVar, dVar, aVarD, c0347b, c0346a, dialog != null ? dialog.getDialogAdapter() : null);
    }
}
