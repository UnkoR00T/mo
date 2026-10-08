package gx2;

import androidx.p016lifecycle.t0;
import f00.j0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import py3.OfficeSearchModel;
import py3.OfficeSelectionData;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001eB#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgx2/a;", "Landroidx/lifecycle/t0;", "", "Lhx2/a;", "Lmx/c;", "labelProvider", "Ltv2/a;", "createOfficeSelectionDataUC", "contract", "<init>", "(Lmx/c;Ltv2/a;Lhx2/a;)V", "Lpy3/a;", "data", "Ltt3/b;", "a9", "(Lpy3/a;)Ltt3/b;", "Lpy3/b;", "Z8", "()Lpy3/b;", "Lpy3/b$b;", "office", "Loq/i0;", "b9", "(Lpy3/b$b;)V", "b", "Lmx/c;", "c", "Ltv2/a;", "d", "Lhx2/a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tv2.a createOfficeSelectionDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hx2.a contract;

    /* JADX INFO: renamed from: gx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lgx2/a$a;", "", "Lhx2/a;", "Lgx2/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1773a extends j0 {
    }

    public a(mx.c cVar, tv2.a aVar, hx2.a aVar2) {
        this.labelProvider = cVar;
        this.createOfficeSelectionDataUC = aVar;
        this.contract = aVar2;
    }

    public final OfficeSelectionData Z8() {
        return this.createOfficeSelectionDataUC.b(new tv2.a.Params(this.contract.u()));
    }

    public final AddressSearchData a9(OfficeSearchModel data) {
        Label title = data.getTitle();
        Label placeholder = data.getPlaceholder();
        List<OfficeSearchModel.C4044a> listA = data.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (OfficeSearchModel.C4044a c4044a : listA) {
            arrayList.add(new AddressSearchItemData(c4044a.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, c4044a.getIsSelected(), c4044a.b()));
        }
        return new AddressSearchData(title, placeholder, arrayList, new AddressNoSearchResultsData(this.labelProvider.c(gv2.a.R), this.labelProvider.c(gv2.a.f77275k0)));
    }

    public final void b9(OfficeSelectionData.Office office) {
        this.contract.x(office);
    }
}
