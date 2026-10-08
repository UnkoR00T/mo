package i32;

import androidx.compose.ui.graphics.Color;
import eo0.Directory;
import eo0.EmptyState;
import eo0.UrlData;
import eo0.r;
import eo0.t;
import er.l;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r70.BaseFloatingActionButtonData;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Li32/b;", "Lxw/f;", "Li32/b$a;", "Lh32/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "isAlertInfoVisible", "Leo0/z;", "emptyState", "Lkotlin/Function0;", "Loq/i0;", "onCloseBannerInfo", "Lkotlin/Function1;", "", "onLinkClick", "Lc30/b$c;", "f", "(ZLeo0/z;Ler/a;Ler/l;)Lc30/b$c;", "Leo0/q;", "Lkotlin/Function3;", "Leo0/r;", "Leo0/t;", "onItemClick", "Ln50/g;", "i", "(Leo0/q;Ler/q;)Ln50/g;", "", "h", "(Leo0/t;)I", "params", "e", "(Li32/b$a;)Lh32/c$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h32.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: i32.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010#R/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010#R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b'\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b,\u0010#¨\u0006-"}, d2 = {"Li32/b$a;", "", "Lh32/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onSettingsClick", "onFaqClick", "Lkotlin/Function3;", "Leo0/r;", "", "Leo0/t;", "onItemClick", "onCloseBannerInfo", "Lkotlin/Function1;", "onLinkClick", "writeMessageAction", "<init>", "(Lh32/b;Ler/a;Ler/a;Ler/a;Ler/q;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh32/b;", "g", "()Lh32/b;", "b", "Ler/a;", "()Ler/a;", "c", "f", "d", "e", "Ler/q;", "()Ler/q;", "Ler/l;", "()Ler/l;", "h", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h32.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSettingsClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFaqClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<r, String, t, i0> onItemClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseBannerInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> writeMessageAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h32.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, q<? super r, ? super String, ? super t, i0> qVar, er.a<i0> aVar4, l<? super String, i0> lVar, er.a<i0> aVar5) {
            this.state = bVar;
            this.onBack = aVar;
            this.onSettingsClick = aVar2;
            this.onFaqClick = aVar3;
            this.onItemClick = qVar;
            this.onCloseBannerInfo = aVar4;
            this.onLinkClick = lVar;
            this.writeMessageAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCloseBannerInfo;
        }

        public final er.a<i0> c() {
            return this.onFaqClick;
        }

        public final q<r, String, t, i0> d() {
            return this.onItemClick;
        }

        public final l<String, i0> e() {
            return this.onLinkClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBack, params.onBack) && fr.t.c(this.onSettingsClick, params.onSettingsClick) && fr.t.c(this.onFaqClick, params.onFaqClick) && fr.t.c(this.onItemClick, params.onItemClick) && fr.t.c(this.onCloseBannerInfo, params.onCloseBannerInfo) && fr.t.c(this.onLinkClick, params.onLinkClick) && fr.t.c(this.writeMessageAction, params.writeMessageAction);
        }

        public final er.a<i0> f() {
            return this.onSettingsClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final h32.b getState() {
            return this.state;
        }

        public final er.a<i0> h() {
            return this.writeMessageAction;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onSettingsClick.hashCode()) * 31) + this.onFaqClick.hashCode()) * 31) + this.onItemClick.hashCode()) * 31) + this.onCloseBannerInfo.hashCode()) * 31) + this.onLinkClick.hashCode()) * 31) + this.writeMessageAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onSettingsClick=" + this.onSettingsClick + ", onFaqClick=" + this.onFaqClick + ", onItemClick=" + this.onItemClick + ", onCloseBannerInfo=" + this.onCloseBannerInfo + ", onLinkClick=" + this.onLinkClick + ", writeMessageAction=" + this.writeMessageAction + ')';
        }
    }

    /* JADX INFO: renamed from: i32.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2093b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88983a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.TRASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.INBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.DRAFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.SENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.OUTBOX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.CUSTOM_DEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f88983a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f88984a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(235018981);
            if (p076m2.t.k()) {
                p076m2.t.o(235018981, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.personalinbox.mapper.PersonalInboxScreenMapper.toSingleCard.<anonymous> (PersonalInboxScreenMapper.kt:137)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final c30.b.c f(boolean isAlertInfoVisible, EmptyState emptyState, er.a<i0> onCloseBannerInfo, l<? super String, i0> onLinkClick) {
        if (emptyState != null) {
            Label label = new Label(emptyState.getTitle(), "electronicDeliveryAlertTitle");
            Label label2 = new Label(emptyState.getBody(), "electronicDeliveryAlertDescription");
            UrlData urlData = emptyState.getUrlData();
            c30.b.c cVar = new c30.b.c(null, null, label, label2, onCloseBannerInfo, null, urlData != null ? new c30.a.Link(new LinkData(null, new Label(urlData.getTitle(), "electronicDeliveryInfoBannerLinkTitle"), urlData.getValue(), LinkData.EnumC5775a.WEBSITE, false, onLinkClick, 17, null)) : null, 35, null);
            if (isAlertInfoVisible) {
                return cVar;
            }
        }
        return null;
    }

    private final int h(t tVar) {
        switch (C2093b.f88983a[tVar.ordinal()]) {
            case 1:
                return jz.a.f106727a;
            case 2:
                return jz.a.f106751d;
            case 3:
                return jz.a.f106768f0;
            case 4:
                return jz.a.f106743c;
            case 5:
                return jz.a.f106784h0;
            case 6:
                return jz.a.f106833o0;
            case 7:
                return jz.a.f106833o0;
            default:
                throw new oq.p();
        }
    }

    private final DefaultSingleCardData i(final Directory directory, final q<? super r, ? super String, ? super t, i0> qVar) {
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(new Label(directory.getDisplayName(), "directory_name"), null, null, 0, 0, null, 62, null)), null, 5, null);
        x0.Icon icon = new x0.Icon(jz.a.V, null, null, 6, null);
        return new DefaultSingleCardData(null, new er.a() { // from class: i32.a
            @Override // er.a
            public final Object a() {
                return b.l(qVar, directory);
            }
        }, false, null, null, false, null, null, bodySection, new LeadingSection(false, null, new i.Icon(h(directory.getType()), null, c.f88984a, null, null, 26, null), 3, null), icon, null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(q qVar, Directory directory) {
        qVar.w(r.a(directory.getId()), directory.getDisplayName(), directory.getType());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h32.c.a b(Params params) {
        h32.b state = params.getState();
        if (fr.t.c(state, h32.b.a.f80518a)) {
            return h32.c.a.C1840a.f80523a;
        }
        if (!(state instanceof h32.b.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.F2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216851g, null, null, params.f(), 6, null)), null, 20, null), v.e(new BaseFloatingActionButtonData(jz.a.f106768f0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(e02.a.X1)), params.h())), null, null, null, 57, null);
        List<Directory> listC = ((h32.b.Initialized) params.getState()).c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(i((Directory) it.next(), params.d()));
        }
        return new h32.c.a.Initialized(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), this.labelProvider.c(e02.a.E2), params.a(), params.f(), new ButtonTextData(null, this.labelProvider.c(e02.a.f46539h0), null, null, params.c(), 13, null), f(((h32.b.Initialized) params.getState()).getIsAlertInfoVisible(), ((h32.b.Initialized) params.getState()).getOwnerAddress().getEmptyState(), params.b(), params.e()));
    }
}
