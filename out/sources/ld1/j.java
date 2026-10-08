package ld1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld1/i;", "", "a", "(Lld1/i;)Ljava/lang/String;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final String a(KrusOfficeModel krusOfficeModel) {
        return krusOfficeModel.getStreetName() + ' ' + krusOfficeModel.getBuildingNumber() + ", " + krusOfficeModel.getPostalCode() + ' ' + krusOfficeModel.getCity();
    }
}
