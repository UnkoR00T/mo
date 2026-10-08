package ax2;

import al0.BEContactDetailsData;
import androidx.p016lifecycle.t0;
import p071kotlin.Metadata;
import ru3.ContactDetailsFormData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lax2/a;", "Landroidx/lifecycle/t0;", "Lrv2/a;", "createContactDetailsDataUC", "<init>", "(Lrv2/a;)V", "Lal0/j;", "initialData", "Lru3/c;", "Z8", "(Lal0/j;)Lru3/c;", "b", "Lrv2/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rv2.a createContactDetailsDataUC;

    public a(rv2.a aVar) {
        this.createContactDetailsDataUC = aVar;
    }

    public final ContactDetailsFormData Z8(BEContactDetailsData initialData) {
        return this.createContactDetailsDataUC.b(new rv2.a.Params(initialData));
    }
}
