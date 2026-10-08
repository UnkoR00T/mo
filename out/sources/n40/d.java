package n40;

import fu.r;
import p071kotlin.Metadata;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0004*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Ln40/c;", "", "b", "(Ln40/c;)Ljava/lang/String;", "", "c", "(Ln40/c;)Z", "showAddButton", "d", "showError", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(FilePickerData cVar) {
        return r.u1(s.O(cVar.getAddFileLabel()) + s.N(cVar.getRequirementsContentDescription()) + s.O(cVar.getErrorLabel())).toString();
    }

    public static final boolean c(FilePickerData cVar) {
        return cVar.g().size() < cVar.getMaxAllowedFiles();
    }

    public static final boolean d(FilePickerData cVar) {
        return cVar.getErrorLabel() != null;
    }
}
