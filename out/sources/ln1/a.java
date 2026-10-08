package ln1;

import androidx.p016lifecycle.t0;
import f00.j0;
import java.util.ArrayList;
import java.util.List;
import ju3.ChooseChildData;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import py3.OfficeSearchModel;
import py3.OfficeSelectionData;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lln1/a;", "Landroidx/lifecycle/t0;", "", "Lmn1/a;", "Lmx/c;", "labelProvider", "contract", "<init>", "(Lmx/c;Lmn1/a;)V", "Lpy3/b$b;", "office", "Loq/i0;", "b9", "(Lpy3/b$b;)V", "Lpy3/a;", "model", "Ltt3/b;", "a9", "(Lpy3/a;)Ltt3/b;", "Lju3/b;", "Z8", "()Lju3/b;", "b", "Lmx/c;", "c", "Lmn1/a;", "a", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mn1.a contract;

    /* JADX INFO: renamed from: ln1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lln1/a$a;", "", "Lmn1/a;", "Lln1/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2893a extends j0 {
    }

    public a(mx.c cVar, mn1.a aVar) {
        this.labelProvider = cVar;
        this.contract = aVar;
    }

    public final ChooseChildData Z8() {
        return new ChooseChildData(this.labelProvider.c(em1.a.R), this.labelProvider.c(em1.a.Q));
    }

    public final AddressSearchData a9(OfficeSearchModel model) {
        Label title = model.getTitle();
        Label placeholder = model.getPlaceholder();
        List<OfficeSearchModel.C4044a> listA = model.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (OfficeSearchModel.C4044a c4044a : listA) {
            arrayList.add(new AddressSearchItemData(c4044a.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, c4044a.getIsSelected(), c4044a.b()));
        }
        return new AddressSearchData(title, placeholder, arrayList, new AddressNoSearchResultsData(this.labelProvider.c(em1.a.f51990x), this.labelProvider.c(em1.a.K)));
    }

    public final void b9(OfficeSelectionData.Office office) {
        this.contract.e(office);
    }
}
