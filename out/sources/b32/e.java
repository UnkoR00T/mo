package b32;

import a12.SearchResultSingleCardData;
import a32.State;
import c32.DescriptionSectionData;
import eo0.Recipient;
import eo0.RecipientAddress;
import eo0.b1;
import eo0.p0;
import er.l;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.CustomSingleCardData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J[\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001e\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010!\u001a\u00020 2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u0004\u0018\u00010%*\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020**\u00020*2\u0006\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010*2\b\u00101\u001a\u0004\u0018\u00010*2\b\u00102\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u00105\u001a\u00020*H\u0002¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lb32/e;", "Lxw/f;", "Lb32/e$a;", "La32/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "isSearchActive", "Ldx/b;", "domainError", "", "Leo0/k0;", "recipients", "Lkotlin/Function1;", "Loq/i0;", "clickAction", "Lkotlin/Function0;", "advancedSearchAction", "showAdvancedSearch", "Lc32/a;", "l", "(ZLdx/b;Ljava/util/List;Ler/l;Ler/a;Z)Lc32/a;", "Lc32/b;", "q", "(Ler/a;Z)Lc32/b;", "Lk40/a;", "i", "(Ldx/b;Ljava/util/List;)Lk40/a;", "h", "(Ldx/b;Ler/a;Ljava/util/List;)Lk40/a;", "Ln30/b;", "u", "(Ljava/util/List;Ler/l;)Ln30/b;", "", "index", "Lr50/a$b;", "z", "(Leo0/k0;I)Lr50/a$b;", "Leo0/l0;", "address", "", "f", "(Leo0/l0;)Ljava/lang/String;", "readLetterByLetter", "x", "(Ljava/lang/String;Z)Ljava/lang/String;", "nip", "regon", "krs", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "details", "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "params", "e", "(Lb32/e$a;)La32/c$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, a32.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b32.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b$\u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Lb32/e$a;", "", "La32/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onQueryChanged", "", "onActiveChanged", "Lkotlin/Function0;", "clearAction", "closeAction", "Leo0/k0;", "clickRecipientAction", "advancedSearchAction", "<init>", "(La32/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "La32/b;", "g", "()La32/b;", "b", "Ler/l;", "f", "()Ler/l;", "c", "e", "d", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onActiveChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> clearAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Recipient, i0> clickRecipientAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> advancedSearchAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, l<? super Recipient, i0> lVar3, er.a<i0> aVar3) {
            this.state = state;
            this.onQueryChanged = lVar;
            this.onActiveChanged = lVar2;
            this.clearAction = aVar;
            this.closeAction = aVar2;
            this.clickRecipientAction = lVar3;
            this.advancedSearchAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.advancedSearchAction;
        }

        public final er.a<i0> b() {
            return this.clearAction;
        }

        public final l<Recipient, i0> c() {
            return this.clickRecipientAction;
        }

        public final er.a<i0> d() {
            return this.closeAction;
        }

        public final l<Boolean, i0> e() {
            return this.onActiveChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onQueryChanged, params.onQueryChanged) && t.c(this.onActiveChanged, params.onActiveChanged) && t.c(this.clearAction, params.clearAction) && t.c(this.closeAction, params.closeAction) && t.c(this.clickRecipientAction, params.clickRecipientAction) && t.c(this.advancedSearchAction, params.advancedSearchAction);
        }

        public final l<String, i0> f() {
            return this.onQueryChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onQueryChanged.hashCode()) * 31) + this.onActiveChanged.hashCode()) * 31) + this.clearAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.clickRecipientAction.hashCode()) * 31) + this.advancedSearchAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onQueryChanged=" + this.onQueryChanged + ", onActiveChanged=" + this.onActiveChanged + ", clearAction=" + this.clearAction + ", closeAction=" + this.closeAction + ", clickRecipientAction=" + this.clickRecipientAction + ", advancedSearchAction=" + this.advancedSearchAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16387a;

        static {
            int[] iArr = new int[p0.values().length];
            try {
                iArr[p0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.E_PUAP_AND_E_DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16387a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final String f(RecipientAddress address) {
        String buildingNumber;
        if (address == null) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        String street = address.getStreet();
        boolean z15 = true;
        if (street == null || r.t0(street)) {
            street = null;
        }
        if (street != null) {
            sb5.append(street);
        }
        String buildingNumber2 = address.getBuildingNumber();
        if (buildingNumber2 == null || r.t0(buildingNumber2)) {
            buildingNumber2 = null;
        }
        if (buildingNumber2 != null) {
            String street2 = address.getStreet();
            if (street2 != null && !r.t0(street2)) {
                sb5.append(" ");
            }
            sb5.append(buildingNumber2);
            String flatNumber = address.getFlatNumber();
            if (flatNumber == null || r.t0(flatNumber)) {
                flatNumber = null;
            }
            if (flatNumber != null) {
                sb5.append('-' + flatNumber);
            }
        }
        String postalCode = address.getPostalCode();
        if (postalCode == null || r.t0(postalCode)) {
            postalCode = null;
        }
        if (postalCode != null) {
            String street3 = address.getStreet();
            if ((street3 != null && !r.t0(street3)) || ((buildingNumber = address.getBuildingNumber()) != null && !r.t0(buildingNumber))) {
                sb5.append(", ");
            }
            sb5.append(postalCode);
        }
        String locality = address.getLocality();
        if (locality != null && !r.t0(locality)) {
            z15 = false;
        }
        String str = z15 ? null : locality;
        if (str != null) {
            String postalCode2 = address.getPostalCode();
            if (postalCode2 != null && !r.t0(postalCode2)) {
                sb5.append(" ");
            }
            sb5.append(str);
        }
        return sb5.toString();
    }

    private final EmptyStateData h(dx.b domainError, er.a<i0> advancedSearchAction, List<Recipient> recipients) {
        Label labelC;
        int i15;
        boolean z15 = domainError instanceof dx.b.Business;
        if (z15 && ((dx.b.Business) domainError).getType() == n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING) {
            labelC = this.labelProvider.c(e02.a.f46558k1);
        } else {
            labelC = (recipients == null || !recipients.isEmpty()) ? this.labelProvider.c(e02.a.f46576n1) : this.labelProvider.c(e02.a.f46558k1);
        }
        mx.c cVar = this.labelProvider;
        if (z15 && ((dx.b.Business) domainError).getType() == n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING) {
            i15 = e02.a.f46552j1;
        } else {
            i15 = (recipients == null || !recipients.isEmpty()) ? e02.a.f46570m1 : e02.a.f46552j1;
        }
        Label labelC2 = cVar.c(i15);
        ButtonData buttonData = null;
        if ((z15 && ((dx.b.Business) domainError).getType() == n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING) || (recipients != null && recipients.isEmpty())) {
            buttonData = new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46528f1), null, 2, null), k30.d.c.f107775a, null, advancedSearchAction, 35, null);
        }
        return new EmptyStateData(labelC, labelC2, buttonData);
    }

    private final EmptyStateData i(dx.b domainError, List<Recipient> recipients) {
        int i15;
        boolean z15 = domainError instanceof dx.b.Business;
        Label labelC = (!(z15 && ((dx.b.Business) domainError).getType() == n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING) && (recipients == null || !recipients.isEmpty())) ? this.labelProvider.c(e02.a.f46576n1) : null;
        mx.c cVar = this.labelProvider;
        if (z15 && ((dx.b.Business) domainError).getType() == n02.a.EDA_CONFIRMATION_REQUIRED_FIELD_MISSING) {
            i15 = e02.a.f46558k1;
        } else {
            i15 = (recipients == null || !recipients.isEmpty()) ? e02.a.f46570m1 : e02.a.f46558k1;
        }
        return new EmptyStateData(labelC, cVar.c(i15), null);
    }

    private final c32.a l(boolean isSearchActive, dx.b domainError, List<Recipient> recipients, l<? super Recipient, i0> clickAction, er.a<i0> advancedSearchAction, boolean showAdvancedSearch) {
        if (domainError != null || (recipients != null && recipients.isEmpty())) {
            return new c32.a.Empty(showAdvancedSearch ? h(domainError, advancedSearchAction, recipients) : i(domainError, recipients));
        }
        List<Recipient> list = recipients;
        return (list == null || list.isEmpty() || !isSearchActive) ? c32.a.C0609a.f22989a : new c32.a.Recipients(u(recipients, clickAction));
    }

    private final String m(String address, String details) {
        StringBuilder sb5 = new StringBuilder();
        String str = !(address == null || r.t0(address)) ? address : null;
        if (str != null) {
            sb5.append(str);
        }
        if (r.t0(details)) {
            details = null;
        }
        if (details != null) {
            if (address != null && !r.t0(address)) {
                sb5.append("\n");
            }
            sb5.append(details);
        }
        return sb5.toString();
    }

    private final DescriptionSectionData q(er.a<i0> advancedSearchAction, boolean showAdvancedSearch) {
        return new DescriptionSectionData(this.labelProvider.c(showAdvancedSearch ? e02.a.f46534g1 : e02.a.f46546i1), (showAdvancedSearch ? this : null) != null ? new ButtonTextData(null, this.labelProvider.c(e02.a.f46528f1), null, null, advancedSearchAction, 13, null) : null);
    }

    private final String r(String nip, String regon, String krs, boolean readLetterByLetter) {
        StringBuilder sb5 = new StringBuilder();
        boolean z15 = true;
        String str = !(nip == null || r.t0(nip)) ? nip : null;
        if (str != null) {
            sb5.append(this.labelProvider.e(e02.a.f46588p1, x(str, readLetterByLetter)).getText());
        }
        String str2 = !(regon == null || r.t0(regon)) ? regon : null;
        if (str2 != null) {
            String text = this.labelProvider.e(e02.a.f46594q1, x(str2, readLetterByLetter)).getText();
            if (nip != null && !r.t0(nip)) {
                sb5.append("\n");
            }
            sb5.append(text);
        }
        if (krs != null && !r.t0(krs)) {
            z15 = false;
        }
        if (z15) {
            krs = null;
        }
        if (krs != null) {
            String text2 = this.labelProvider.e(e02.a.f46582o1, x(krs, readLetterByLetter)).getText();
            if ((nip != null && !r.t0(nip)) || (regon != null && !r.t0(regon))) {
                sb5.append("\n");
            }
            sb5.append(text2);
        }
        return sb5.toString();
    }

    static /* synthetic */ String s(e eVar, String str, String str2, String str3, boolean z15, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        return eVar.r(str, str2, str3, z15);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0189  */
    /* JADX WARN: Code duplicated, block: B:42:0x018c A[SYNTHETIC] */
    private final CardListData u(List<Recipient> recipients, final l<? super Recipient, i0> clickAction) {
        List listN;
        String text;
        CustomSingleCardData customSingleCardData;
        if (recipients != null) {
            listN = new ArrayList();
            int i15 = 0;
            for (Object obj : recipients) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final Recipient recipient = (Recipient) obj;
                int i17 = b.f16387a[recipient.getServiceType().ordinal()];
                if (i17 == 1) {
                    text = this.labelProvider.c(e02.a.f46564l1).getText();
                } else if (i17 != 2) {
                    if (i17 == 3) {
                        text = v.v0(v.q(this.labelProvider.c(e02.a.f46540h1).getText(), this.labelProvider.c(e02.a.f46564l1).getText()), null, null, null, 0, null, null, 63, null);
                    } else {
                        if (i17 != 4) {
                            throw new p();
                        }
                        customSingleCardData = null;
                    }
                    if (customSingleCardData != null) {
                        listN.add(customSingleCardData);
                    }
                    i15 = i16;
                } else {
                    text = this.labelProvider.c(e02.a.f46540h1).getText();
                }
                Label labelB = mx.b.b(text, "info" + i15);
                String fullName = recipient.getFullName();
                String strF = f(recipient.getAddress());
                String strS = s(this, recipient.getNip(), recipient.getRegon(), recipient.getKrs(), false, 8, null);
                String strR = r(recipient.getNip(), recipient.getRegon(), recipient.getKrs(), true);
                String strM = m(strF, strS);
                if (r.t0(strM)) {
                    strM = null;
                }
                customSingleCardData = new CustomSingleCardData("recipientSearch" + i15, new a12.b(new SearchResultSingleCardData(labelB, strM != null ? mx.b.b(strM, "addressDetails_" + i15) : null, mx.b.b(fullName, "fullName_" + i15), z(recipient, i15), null, v.v0(v.s(labelB.getText(), fullName, m(strF, strR)), " ", null, null, 0, null, null, 62, null))), new er.a() { // from class: b32.d
                    @Override // er.a
                    public final Object a() {
                        return e.v(clickAction, recipient);
                    }
                }, false, null, null, false, null, 248, null);
                if (customSingleCardData != null) {
                    listN.add(customSingleCardData);
                }
                i15 = i16;
            }
        } else {
            listN = v.n();
        }
        return new CardListData(listN, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, Recipient recipient) {
        lVar.b(recipient);
        return i0.f148189a;
    }

    private final String x(String str, boolean z15) {
        return z15 ? dz.e.g(str, 1, " ") : str;
    }

    private final r50.a.WithIcon z(Recipient recipient, int i15) {
        g gVar;
        b1 warningType = recipient.getWarningType();
        if (warningType == null) {
            return null;
        }
        if (warningType instanceof b1.Blocking) {
            gVar = g.NEGATIVE;
        } else {
            if (!(warningType instanceof b1.NotBlocking)) {
                throw new p();
            }
            gVar = g.NOTICE;
        }
        g gVar2 = gVar;
        return new r50.a.WithIcon("recipientStatus" + i15, Label.INSTANCE.c(), null, 0, false, gVar2, 12, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a32.c.Data b(Params params) {
        i.Small small;
        State state = params.getState();
        if (state.getIsSearchActive()) {
            state = null;
        }
        if (state != null) {
            small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(e02.a.f46522e1), null, null, null, 28, null);
        } else {
            small = null;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, small, null, null, null, null, 61, null);
        String query = params.getState().getQuery();
        l<String, i0> lVarF = params.f();
        boolean isSearchActive = params.getState().getIsSearchActive();
        l<Boolean, i0> lVarE = params.e();
        er.a<i0> aVarB = params.b();
        Label labelC = this.labelProvider.c(e02.a.f46575n0);
        List<Recipient> listE = params.getState().e();
        return new a32.c.Data(baseScaffoldData, new SearchBarData(query, lVarF, isSearchActive, lVarE, aVarB, labelC, null, listE != null ? Integer.valueOf(listE.size()) : null, 64, null), params.d(), l(params.getState().getIsSearchActive(), params.getState().getDomainError(), params.getState().e(), params.c(), params.a(), params.getState().getUserHasActiveEdorInbox()), q(params.a(), params.getState().getUserHasActiveEdorInbox()));
    }
}
