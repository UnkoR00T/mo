package p081n61;

import mx.Label;
import mx.c;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormData;
import w51.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln61/g;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/b;", "addressData", "Lst3/d;", "a", "(Lst3/b;)Lst3/d;", "Lmx/a;", "b", "()Lmx/a;", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    public g(c cVar) {
        this.labelProvider = cVar;
    }

    public final AddressFormData a(AddressData addressData) {
        return new AddressFormData(null, true, this.labelProvider.c(a.f210435u4), this.labelProvider.c(a.Y4), null, null, addressData, 49, null);
    }

    public final Label b() {
        return this.labelProvider.c(a.R3);
    }
}
