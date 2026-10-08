package vm1;

import androidx.p016lifecycle.t0;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;
import ru3.ContactDetailsFormData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvm1/a;", "Landroidx/lifecycle/t0;", "Lmx/c;", "labelProvider", "Llm1/a;", "createContactDetailsFormDataUC", "<init>", "(Lmx/c;Llm1/a;)V", "Lru3/b;", "initialData", "Lru3/c;", "Z8", "(Lru3/b;)Lru3/c;", "b", "Lmx/c;", "c", "Llm1/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lm1.a createContactDetailsFormDataUC;

    public a(mx.c cVar, lm1.a aVar) {
        this.labelProvider = cVar;
        this.createContactDetailsFormDataUC = aVar;
    }

    public final ContactDetailsFormData Z8(ContactDetailsData initialData) {
        return this.createContactDetailsFormDataUC.b(new lm1.a.Params(initialData));
    }
}
