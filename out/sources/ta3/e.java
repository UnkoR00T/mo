package ta3;

import android.graphics.Bitmap;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ra3.Changing;
import ra3.Error;
import ra3.Fetching;
import ra3.k;
import ra3.l;
import sa3.OnlyDescriptionSingleCardCustom;
import v93.CountryDetailsFormatted;
import v93.InfoItem;
import v93.h;
import v93.n;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0012*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lta3/e;", "Lxw/f;", "Lta3/e$a;", "Lra3/l$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lv93/e$a;", "", "tagSuffix", "Lkotlin/Function1;", "Loq/i0;", "onUrlClick", "Ln30/b;", "m", "(Lv93/e$a;Ljava/lang/String;Ler/l;)Ln30/b;", "Lv93/g;", "", "index", "onClick", "Ln50/g;", "r", "(Lv93/g;ILer/l;)Ln50/g;", "Lv93/h;", "q", "(Lv93/h;)I", "params", "h", "(Lta3/e$a;)Lra3/l$a;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, l.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ta3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010 R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010#R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lta3/e$a;", "", "Lra3/k;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lv93/g;", "onInfoItemClick", "onSubscriptionSwitchChange", "Landroid/graphics/Bitmap;", "onMapClick", "", "onUrlClick", "<init>", "(Lra3/k;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lra3/k;", "f", "()Lra3/k;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<InfoItem, i0> onInfoItemClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSubscriptionSwitchChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Bitmap, i0> onMapClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onUrlClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(k kVar, er.a<i0> aVar, er.l<? super InfoItem, i0> lVar, er.a<i0> aVar2, er.l<? super Bitmap, i0> lVar2, er.l<? super String, i0> lVar3) {
            this.state = kVar;
            this.onBack = aVar;
            this.onInfoItemClick = lVar;
            this.onSubscriptionSwitchChange = aVar2;
            this.onMapClick = lVar2;
            this.onUrlClick = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.l<InfoItem, i0> b() {
            return this.onInfoItemClick;
        }

        public final er.l<Bitmap, i0> c() {
            return this.onMapClick;
        }

        public final er.a<i0> d() {
            return this.onSubscriptionSwitchChange;
        }

        public final er.l<String, i0> e() {
            return this.onUrlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onInfoItemClick, params.onInfoItemClick) && t.c(this.onSubscriptionSwitchChange, params.onSubscriptionSwitchChange) && t.c(this.onMapClick, params.onMapClick) && t.c(this.onUrlClick, params.onUrlClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onInfoItemClick.hashCode()) * 31) + this.onSubscriptionSwitchChange.hashCode()) * 31) + this.onMapClick.hashCode()) * 31) + this.onUrlClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onInfoItemClick=" + this.onInfoItemClick + ", onSubscriptionSwitchChange=" + this.onSubscriptionSwitchChange + ", onMapClick=" + this.onMapClick + ", onUrlClick=" + this.onUrlClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f189383b;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f189382a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.TRAVELLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.LAW_AND_CUSTOMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.EMERGENCY_CONTACTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f189383b = iArr2;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, boolean z15) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, Bitmap bitmap) {
        params.c().b(bitmap);
        return i0.f148189a;
    }

    private final CardListData m(CountryDetailsFormatted.WarningFormatted warningFormatted, String str, er.l<? super String, i0> lVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f189382a[warningFormatted.getType().ordinal()];
        if (i16 == 1) {
            i15 = r93.a.f172525w0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = r93.a.f172522v0;
        }
        BodySection bodySection = new BodySection(new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(warningFormatted.getWarningLevel().getDescription(), str + "_warningLevelDescription"), null, null, 0, 0, null, 62, null)), null, 4, null);
        bb3.a aVarA = u93.a.a(warningFormatted.getWarningLevel());
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, aVarA != null ? new LeadingSection(false, null, new i.Icon(aVarA.getIconResId(), null, aVarA.e(), null, null, 26, null), 3, null) : null, null, null, 3327, null), new CustomSingleCardData(str + "_warningDescriptionCard", new OnlyDescriptionSingleCardCustom(warningFormatted.getDescription(), lVar), null, false, null, null, false, null, 252, null)), null, false, null, null, 30, null);
    }

    private final int q(h hVar) {
        switch (b.f189383b[hVar.ordinal()]) {
            case 1:
                return jz.a.F;
            case 2:
                return jz.a.f106753d1;
            case 3:
                return jz.a.f106848q1;
            case 4:
                return jz.a.f106840p0;
            case 5:
                return jz.a.f106820m1;
            case 6:
                return jz.a.H1;
            default:
                throw new p();
        }
    }

    private final DefaultSingleCardData r(final InfoItem infoItem, int i15, final er.l<? super InfoItem, i0> lVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: ta3.b
            @Override // er.a
            public final Object a() {
                return e.s(lVar, infoItem);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(infoItem.getTitle(), "infoItemTitle_" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(q(infoItem.getType()), null, null, null, null, 30, null), 3, null), new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.l lVar, InfoItem infoItem) {
        lVar.b(infoItem);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l.a b(final Params params) {
        ArrayList arrayList;
        k state = params.getState();
        if (state instanceof Fetching) {
            return l.a.c.f172634a;
        }
        if (state instanceof Error) {
            return new l.a.Error(((Error) state).getErrorVMSAdapter());
        }
        if (state instanceof k.a.InterfaceC4401a.Error) {
            return new l.a.Error(((k.a.InterfaceC4401a.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof Changing) && !(state instanceof ra3.Error) && !(state instanceof k.a.InterfaceC4401a) && !(state instanceof k.a.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        k.a aVar = (k.a) state;
        Bitmap flagBitmap = aVar.getCountryDetails().getFlagBitmap();
        Label labelB = mx.b.b(aVar.getCountryDetails().getName(), "countryName");
        Label labelC = this.labelProvider.c(r93.a.f172495m0);
        boolean isSubscribed = state.getIsSubscribed();
        k.a aVar2 = (k.a) state;
        s50.a.c cVar = new s50.a.c(null, isSubscribed, this.labelProvider.e(r93.a.f172492l0, Integer.valueOf(aVar2.getCountryDetails().getExpiryMonths())), null, false, null, new er.l() { // from class: ta3.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.i(params, ((Boolean) obj).booleanValue());
            }
        }, null, 185, null);
        String updatedDateFormatted = aVar2.getCountryDetails().getUpdatedDateFormatted();
        Label labelE = updatedDateFormatted != null ? this.labelProvider.e(r93.a.f172516t0, updatedDateFormatted) : null;
        CountryDetailsFormatted.WarningFormatted countryWarning = aVar2.getCountryDetails().getCountryWarning();
        CardListData cardListDataM = countryWarning != null ? m(countryWarning, "country", params.e()) : null;
        final Bitmap mapBitmap = aVar2.getCountryDetails().getMapBitmap();
        l.a.Initialized.MapImageData mapImageData = mapBitmap != null ? new l.a.Initialized.MapImageData(mapBitmap, this.labelProvider.c(r93.a.f172468d0), new er.a() { // from class: ta3.d
            @Override // er.a
            public final Object a() {
                return e.l(params, mapBitmap);
            }
        }) : null;
        List<CountryDetailsFormatted.WarningFormatted> listH = aVar2.getCountryDetails().h();
        if (listH != null) {
            List<CountryDetailsFormatted.WarningFormatted> list = listH;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                arrayList2.add(m((CountryDetailsFormatted.WarningFormatted) obj, "regional_" + i15, params.e()));
                aVar2 = aVar2;
                i15 = i16;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        k.a aVar3 = aVar2;
        Label labelC2 = this.labelProvider.c(r93.a.C);
        List<InfoItem> listD = aVar3.getCountryDetails().d();
        ArrayList arrayList3 = new ArrayList(v.y(listD, 10));
        int i17 = 0;
        for (Object obj2 : listD) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            arrayList3.add(r((InfoItem) obj2, i17, params.b()));
            i17 = i18;
            labelC2 = labelC2;
        }
        Label label = labelC2;
        CardListData cardListData = new CardListData(arrayList3, null, false, null, null, 30, null);
        k state2 = params.getState();
        k.a.InterfaceC4401a.Dialog dialog = state2 instanceof k.a.InterfaceC4401a.Dialog ? (k.a.InterfaceC4401a.Dialog) state2 : null;
        return new l.a.Initialized(baseScaffoldData, aVarA, flagBitmap, labelB, labelC, cVar, labelE, cardListDataM, mapImageData, arrayList, label, cardListData, dialog != null ? dialog.getDialogVmsAdapter() : null);
    }
}
