package nl1;

import androidx.p016lifecycle.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju3.ChooseChildData;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import py3.OfficeSearchModel;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnl1/a;", "Landroidx/lifecycle/t0;", "Lmx/c;", "labelProvider", "Lrk1/a;", "getChooseChildInitialDataUC", "<init>", "(Lmx/c;Lrk1/a;)V", "Lpy3/a$a;", "Ltt3/e;", "b9", "(Lpy3/a$a;)Ltt3/e;", "Lpy3/a;", "model", "Ltt3/b;", "a9", "(Lpy3/a;)Ltt3/b;", "Lju3/b;", "Z8", "()Lju3/b;", "b", "Lmx/c;", "c", "Lrk1/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rk1.a getChooseChildInitialDataUC;

    public a(mx.c cVar, rk1.a aVar) {
        this.labelProvider = cVar;
        this.getChooseChildInitialDataUC = aVar;
    }

    private final AddressSearchItemData b9(OfficeSearchModel.C4044a c4044a) {
        return new AddressSearchItemData(c4044a.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, c4044a.getIsSelected(), c4044a.b());
    }

    public final ChooseChildData Z8() {
        return this.getChooseChildInitialDataUC.b(gz.b.a.C1792a.f78542a);
    }

    public final AddressSearchData a9(OfficeSearchModel model) {
        Label title = model.getTitle();
        Label placeholder = model.getPlaceholder();
        List<OfficeSearchModel.C4044a> listA = model.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b9((OfficeSearchModel.C4044a) it.next()));
        }
        return new AddressSearchData(title, placeholder, arrayList, new AddressNoSearchResultsData(this.labelProvider.c(gk1.a.T), this.labelProvider.c(gk1.a.f73438j0)));
    }
}
