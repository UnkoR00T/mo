package h3;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh3/a;", "Landroid/view/ViewStructure;", "root", "Loq/i0;", "b", "(Lh3/a;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Lh3/a;Landroid/util/SparseArray;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void a(a aVar, SparseArray<AutofillValue> sparseArray) {
        if (aVar.getAutofillTree().a().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iKeyAt = sparseArray.keyAt(i15);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            j jVar = j.f80238a;
            if (jVar.f(autofillValue)) {
                aVar.getAutofillTree().b(iKeyAt, jVar.C(autofillValue).toString());
            } else {
                if (jVar.d(autofillValue)) {
                    throw new oq.q("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (jVar.e(autofillValue)) {
                    throw new oq.q("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (jVar.g(autofillValue)) {
                    throw new oq.q("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(a aVar, ViewStructure viewStructure) {
        if (aVar.getAutofillTree().a().isEmpty()) {
            return;
        }
        int iA = j.f80238a.a(viewStructure, aVar.getAutofillTree().a().size());
        for (Map.Entry<Integer, o> entry : aVar.getAutofillTree().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            o value = entry.getValue();
            j jVar = j.f80238a;
            ViewStructure viewStructureH = jVar.h(viewStructure, iA);
            jVar.j(viewStructureH, aVar.getRootAutofillId(), iIntValue);
            jVar.w(viewStructureH, iIntValue, aVar.getView().getContext().getPackageName(), null, null);
            jVar.k(viewStructureH, t.b(s.INSTANCE.a()));
            List<q> listA = value.a();
            ArrayList arrayList = new ArrayList(listA.size());
            int size = listA.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(d.a(listA.get(i15)));
            }
            jVar.i(viewStructureH, (String[]) arrayList.toArray(new String[0]));
            m3.g boundingBox = value.getBoundingBox();
            if (boundingBox == null) {
                c2.g("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.getRight());
                j.f80238a.s(viewStructureH, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
            }
            iA++;
        }
    }
}
