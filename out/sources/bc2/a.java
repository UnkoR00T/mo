package bc2;

import androidx.p016lifecycle.t0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import py3.OfficeSearchModel;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbc2/a;", "Landroidx/lifecycle/t0;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lpy3/a;", "model", "Ltt3/b;", "Z8", "(Lpy3/a;)Ltt3/b;", "b", "Lmx/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public final AddressSearchData Z8(OfficeSearchModel model) {
        Label title = model.getTitle();
        Label placeholder = model.getPlaceholder();
        List<OfficeSearchModel.C4044a> listA = model.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (OfficeSearchModel.C4044a c4044a : listA) {
            arrayList.add(new AddressSearchItemData(c4044a.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, c4044a.getIsSelected(), c4044a.b()));
        }
        return new AddressSearchData(title, placeholder, arrayList, new AddressNoSearchResultsData(this.labelProvider.c(hb2.b.E), this.labelProvider.c(hb2.b.R)));
    }
}
