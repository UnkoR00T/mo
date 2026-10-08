package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import jr0.NipipDataContainer;
import jr0.NipipScope;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfp3/i;", "Lxw/f;", "Lfp3/i$b;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "isNurseScope", "isPartiallyRestricted", "Lmx/a;", "e", "(ZZ)Lmx/a;", "Ljr0/i$c;", "restrictionType", "f", "(ZZLjr0/i$c;)Lmx/a;", "params", "c", "(Lfp3/i$b;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66086d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: fp3.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0016\u0010\f¨\u0006\u001b"}, d2 = {"Lfp3/i$b;", "", "", "scope", "Ljr0/j;", "data", "", "verificationTime", "picture", "<init>", "(ILjr0/j;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljr0/j;", "()Ljr0/j;", "Ljava/lang/String;", "d", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final NipipScope data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(int i15, NipipScope nipipScope, String str, String str2) {
            this.scope = i15;
            this.data = nipipScope;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NipipScope getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getScope() {
            return this.scope;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVerificationTime() {
            return this.verificationTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.scope == params.scope && t.c(this.data, params.data) && t.c(this.verificationTime, params.verificationTime) && t.c(this.picture, params.picture);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.scope) * 31) + this.data.hashCode()) * 31) + this.verificationTime.hashCode()) * 31;
            String str = this.picture;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(scope=" + this.scope + ", data=" + this.data + ", verificationTime=" + this.verificationTime + ", picture=" + this.picture + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66093a;

        static {
            int[] iArr = new int[NipipDataContainer.c.values().length];
            try {
                iArr[NipipDataContainer.c.FIXED_TERM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NipipDataContainer.c.RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NipipDataContainer.c.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NipipDataContainer.c.UNDER_SUPERVISION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66093a = iArr;
        }
    }

    public i(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(boolean isNurseScope, boolean isPartiallyRestricted) {
        int i15;
        if (isPartiallyRestricted) {
            i15 = isNurseScope ? un3.b.f199499v2 : un3.b.f199469p2;
        } else {
            i15 = isNurseScope ? un3.b.f199494u2 : un3.b.f199464o2;
        }
        return this.labelProvider.e(un3.b.f199497v0, this.labelProvider.c(i15).getText());
    }

    private final Label f(boolean isNurseScope, boolean isPartiallyRestricted, NipipDataContainer.c restrictionType) {
        if (isPartiallyRestricted) {
            if ((restrictionType != null ? c.f66093a[restrictionType.ordinal()] : -1) == 1) {
                return this.labelProvider.c(isNurseScope ? un3.b.X : un3.b.W);
            }
            return null;
        }
        int i15 = restrictionType != null ? c.f66093a[restrictionType.ordinal()] : -1;
        if (i15 == 1) {
            return this.labelProvider.c(isNurseScope ? un3.b.f199504w2 : un3.b.f199474q2);
        }
        if (i15 == 2) {
            return this.labelProvider.c(isNurseScope ? un3.b.f199514y2 : un3.b.f199484s2);
        }
        if (i15 == 3) {
            return this.labelProvider.c(isNurseScope ? un3.b.f199509x2 : un3.b.f199479r2);
        }
        if (i15 != 4) {
            return null;
        }
        return this.labelProvider.c(isNurseScope ? un3.b.f199519z2 : un3.b.f199489t2);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        NipipDataContainer dc5 = params.getData().getDc();
        boolean z15 = params.getScope() == 3000000;
        boolean z16 = dc5.getRestriction() == NipipDataContainer.b.PARTIAL;
        Label labelE = e(z15, z16);
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        Label labelF = f(z15, z16, dc5.getRestrictionType());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0.e(dc5.getName()));
        b0 secondName = dc5.getSecondName();
        if (secondName != null) {
            sb5.append(' ' + c0.e(secondName));
        }
        List<SingleCardData> listQ = v.q(new SingleCardData(this.labelProvider.c(un3.b.f199410d3), mx.b.b(c0.e(dc5.getSurname()), "surname")), new SingleCardData(this.labelProvider.c(un3.b.U1), mx.b.b(sb5.toString(), "names")), new SingleCardData(this.labelProvider.c(un3.b.A2), mx.b.d(dc5.getProfessionalTitle(), "professionalTitle")), new SingleCardData(this.labelProvider.c(z16 ? un3.b.f199454m2 : un3.b.f199449l2), mx.b.d(dc5.getDocumentNumber(), "documentNumber")), new SingleCardData(this.labelProvider.c(un3.b.f199459n2), mx.b.d(dc5.getIssuerName(), "issuerName")), new SingleCardData(this.labelProvider.c(z16 ? un3.b.f199444k2 : un3.b.f199439j2), mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(dc5.getCreationDate()), fz.c.DOTTED), "creationDate")), labelF != null ? new SingleCardData(this.labelProvider.c(un3.b.B2), labelF) : null);
        ArrayList arrayList = new ArrayList();
        for (SingleCardData singleCardData : listQ) {
            if (singleCardData != null) {
                arrayList.add(singleCardData);
            }
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, null, labelE2, null, arrayList, null, 68, null);
    }
}
