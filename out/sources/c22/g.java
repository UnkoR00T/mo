package c22;

import a12.SearchResultSingleCardData;
import eo0.RecipientInfo;
import eo0.RecipientResult;
import eo0.SearchAddressResult;
import eo0.b1;
import eo0.r0;
import eo0.u0;
import er.l;
import fr.t;
import fu.r;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.CustomSingleCardData;
import n50.k;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002:8B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u001d*\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00010\u001d*\u00020%2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u0004\u0018\u00010\u001d*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u0004\u0018\u00010\u001d*\u00020(H\u0002¢\u0006\u0004\b+\u0010*J%\u0010.\u001a\u0004\u0018\u00010\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b.\u0010/JA\u00103\u001a\u0004\u0018\u00010\u001d2.\u00102\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001d0100\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001d01H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lc22/g;", "Lxw/f;", "Lc22/g$b;", "Ln50/k;", "Lmx/c;", "labelProvider", "Lc22/b;", "referenceRegistryStringResourceProvider", "<init>", "(Lmx/c;Lc22/b;)V", "Leo0/n0;", "recipientResult", "", "index", "Lkotlin/Function1;", "Leo0/m0;", "Loq/i0;", "goToResultDetails", "La12/e;", "m", "(Leo0/n0;ILer/l;)La12/e;", "Lj30/a;", "z", "(Leo0/n0;Ler/l;I)Lj30/a;", "Lr50/a$b;", "G", "(Leo0/n0;I)Lr50/a$b;", "", "readLetterByLetter", "", "s", "(Leo0/n0;Z)Ljava/lang/String;", "x", "(Leo0/m0;)Ljava/lang/String;", "recipientInfo", "q", "(Leo0/m0;)Z", "Leo0/r0;", "F", "(Leo0/r0;Z)Ljava/lang/String;", "Leo0/t0;", "v", "(Leo0/t0;)Ljava/lang/String;", "r", "buildingNumber", "flatNumber", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Loq/r;", "partsWithDelimiters", "l", "([Loq/r;)Ljava/lang/String;", "params", "h", "(Lc22/g$b;)Ln50/k;", "a", "Lmx/c;", "b", "Lc22/b;", "c", "Ljava/lang/String;", "eDeliveryInfoString", "d", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22766e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b referenceRegistryStringResourceProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String eDeliveryInfoString;

    /* JADX INFO: renamed from: c22.g$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001f"}, d2 = {"Lc22/g$b;", "", "Leo0/n0;", "result", "Lkotlin/Function1;", "Leo0/m0;", "Loq/i0;", "goToResultDetails", "onResultClick", "", "index", "<init>", "(Leo0/n0;Ler/l;Ler/l;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/n0;", "d", "()Leo0/n0;", "b", "Ler/l;", "()Ler/l;", "c", "I", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RecipientResult result;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RecipientInfo, i0> goToResultDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RecipientResult, i0> onResultClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(RecipientResult recipientResult, l<? super RecipientInfo, i0> lVar, l<? super RecipientResult, i0> lVar2, int i15) {
            this.result = recipientResult;
            this.goToResultDetails = lVar;
            this.onResultClick = lVar2;
            this.index = i15;
        }

        public final l<RecipientInfo, i0> a() {
            return this.goToResultDetails;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final l<RecipientResult, i0> c() {
            return this.onResultClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RecipientResult getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.result, params.result) && t.c(this.goToResultDetails, params.goToResultDetails) && t.c(this.onResultClick, params.onResultClick) && this.index == params.index;
        }

        public int hashCode() {
            return (((((this.result.hashCode() * 31) + this.goToResultDetails.hashCode()) * 31) + this.onResultClick.hashCode()) * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "Params(result=" + this.result + ", goToResultDetails=" + this.goToResultDetails + ", onResultClick=" + this.onResultClick + ", index=" + this.index + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22774a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.CORRESPONDENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.HEADQUARTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22774a = iArr;
        }
    }

    public g(mx.c cVar, b bVar) {
        this.labelProvider = cVar;
        this.referenceRegistryStringResourceProvider = bVar;
        this.eDeliveryInfoString = cVar.c(e02.a.f46540h1).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(RecipientResult recipientResult, l lVar) {
        RecipientInfo recipientInfo = recipientResult.getRecipientInfo();
        if (recipientInfo != null) {
            lVar.b(recipientInfo);
        }
        return i0.f148189a;
    }

    private final String F(r0 r0Var, boolean z15) {
        String text;
        Integer numA = this.referenceRegistryStringResourceProvider.a(r0Var);
        if (numA == null) {
            return null;
        }
        Label labelC = this.labelProvider.c(numA.intValue());
        if (labelC == null || (text = labelC.getText()) == null) {
            return null;
        }
        if (z15) {
            return text + ": " + dz.e.g(r0Var.getRegistryId(), 1, " ");
        }
        return text + ": " + r0Var.getRegistryId();
    }

    private final r50.a.WithIcon G(RecipientResult recipientResult, int i15) {
        b1 warningType;
        r50.g gVar;
        RecipientInfo recipientInfo = recipientResult.getRecipientInfo();
        if (recipientInfo == null || (warningType = recipientInfo.getWarningType()) == null) {
            return null;
        }
        if (warningType instanceof b1.Blocking) {
            gVar = r50.g.NEGATIVE;
        } else {
            if (!(warningType instanceof b1.NotBlocking)) {
                throw new p();
            }
            gVar = r50.g.NOTICE;
        }
        r50.g gVar2 = gVar;
        return new r50.a.WithIcon("recipientStatus" + i15, Label.INSTANCE.c(), null, 0, false, gVar2, 12, null);
    }

    private final String f(String buildingNumber, String flatNumber) {
        if (buildingNumber != null && !r.t0(buildingNumber) && flatNumber != null && !r.t0(flatNumber)) {
            return buildingNumber + '/' + flatNumber;
        }
        if (buildingNumber != null && !r.t0(buildingNumber)) {
            return String.valueOf(buildingNumber);
        }
        if (flatNumber == null || r.t0(flatNumber)) {
            return null;
        }
        return String.valueOf(flatNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.c().b(params.getResult());
        return i0.f148189a;
    }

    private final String l(oq.r<String, String>... partsWithDelimiters) {
        StringBuilder sb5 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (oq.r<String, String> rVar : partsWithDelimiters) {
            String strC = rVar.c();
            if (strC != null && !r.t0(strC)) {
                arrayList.add(rVar);
            }
        }
        for (Object obj : arrayList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            oq.r rVar2 = (oq.r) obj;
            String str = (String) rVar2.a();
            String str2 = (String) rVar2.b();
            if (str != null && !r.t0(str)) {
                sb5.append(str);
                if (i15 < v.p(arrayList)) {
                    sb5.append(str2);
                }
            }
            i15 = i16;
        }
        if (sb5.length() == 0) {
            return null;
        }
        return sb5.toString();
    }

    private final SearchResultSingleCardData m(RecipientResult recipientResult, int index, l<? super RecipientInfo, i0> goToResultDetails) {
        Label labelB;
        Label labelB2;
        String strX;
        RecipientInfo recipientInfo = recipientResult.getRecipientInfo();
        if (recipientInfo == null || (strX = x(recipientInfo)) == null) {
            labelB = null;
        } else {
            labelB = mx.b.b(strX, "recipientInfo" + index);
        }
        Label labelB3 = mx.b.b(recipientResult.getFullName(), "recipientTitle" + index);
        String strU = u(this, recipientResult, false, 1, null);
        if (strU != null) {
            labelB2 = mx.b.b(strU, "recipientDesc" + index);
        } else {
            labelB2 = null;
        }
        return new SearchResultSingleCardData(labelB, labelB2, labelB3, G(recipientResult, index), z(recipientResult, goToResultDetails, index), v.v0(v.s(labelB != null ? labelB.getText() : null, labelB3.getText(), s(recipientResult, true)), " ", null, null, 0, null, null, 62, null));
    }

    private final boolean q(RecipientInfo recipientInfo) {
        if ((recipientInfo != null ? recipientInfo.getAdditionalServiceActivationDates() : null) != null) {
            return true;
        }
        if ((recipientInfo != null ? recipientInfo.getDateOfEnteringToBAE() : null) == null) {
            return (recipientInfo != null ? recipientInfo.getDateOfRemovalFromBAE() : null) != null;
        }
        return true;
    }

    private final String r(SearchAddressResult searchAddressResult) {
        return l(y.a(searchAddressResult.getStreet(), " "), y.a(f(searchAddressResult.getBuildingNumber(), searchAddressResult.getFlatNumber()), ", "), y.a(searchAddressResult.getPostalCode(), " "), y.a(searchAddressResult.getCity(), ""));
    }

    private final String s(RecipientResult recipientResult, boolean z15) {
        String strV0;
        List<SearchAddressResult> listA = recipientResult.a();
        String strV1 = null;
        if (listA != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                String strV = v((SearchAddressResult) it.next());
                if (strV != null) {
                    arrayList.add(strV);
                }
            }
            strV0 = v.v0(arrayList, "\n", null, null, 0, null, null, 62, null);
        } else {
            strV0 = null;
        }
        oq.r rVarA = y.a(strV0, "\n");
        List<r0> listE = recipientResult.e();
        if (listE != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = listE.iterator();
            while (it4.hasNext()) {
                String strF = F((r0) it4.next(), z15);
                if (strF != null) {
                    arrayList2.add(strF);
                }
            }
            strV1 = v.v0(arrayList2, ", ", null, null, 0, null, null, 62, null);
        }
        return l(rVarA, y.a(strV1, ""));
    }

    static /* synthetic */ String u(g gVar, RecipientResult recipientResult, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return gVar.s(recipientResult, z15);
    }

    private final String v(SearchAddressResult searchAddressResult) {
        Label labelE;
        String strR = r(searchAddressResult);
        if (strR != null) {
            u0 addressType = searchAddressResult.getAddressType();
            int i15 = addressType == null ? -1 : c.f22774a[addressType.ordinal()];
            if (i15 == -1) {
                labelE = null;
            } else if (i15 == 1) {
                labelE = this.labelProvider.e(e02.a.f46648z1, strR);
            } else if (i15 != 2) {
                if (i15 != 3) {
                    throw new p();
                }
                labelE = null;
            } else {
                labelE = this.labelProvider.e(e02.a.B1, strR);
            }
            if (labelE != null) {
                return labelE.getText();
            }
        }
        return null;
    }

    private final String x(RecipientInfo recipientInfo) {
        return this.eDeliveryInfoString + " • " + recipientInfo.getServiceCategoryDescription();
    }

    private final ButtonTextData z(final RecipientResult recipientResult, final l<? super RecipientInfo, i0> lVar, int i15) {
        if (!q(recipientResult.getRecipientInfo())) {
            return null;
        }
        return new ButtonTextData("moreButton" + i15, this.labelProvider.c(e02.a.f46630w1), null, null, new er.a() { // from class: c22.e
            @Override // er.a
            public final Object a() {
                return g.E(recipientResult, lVar);
            }
        }, 12, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k b(final Params params) {
        return new CustomSingleCardData("advancedSearch" + params.getIndex(), new a12.b(m(params.getResult(), params.getIndex(), params.a())), new er.a() { // from class: c22.f
            @Override // er.a
            public final Object a() {
                return g.i(params);
            }
        }, false, null, null, false, null, 248, null);
    }
}
