package iv1;

import dx.b;
import dx.i;
import mv1.DynamicMultiDocumentFullData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Liv1/a;", "Lnv1/a;", "<init>", "()V", "Lmv1/d;", "dynamicMultiDocumentData", "Loq/i0;", "c", "(Lmv1/d;)V", "Ldx/i;", "Ldx/b$e;", "b", "()Ldx/i;", "a", "Lmv1/d;", "multiDocumentData", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements nv1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private DynamicMultiDocumentFullData multiDocumentData;

    @Override // nv1.a
    public void a() {
        this.multiDocumentData = null;
    }

    @Override // nv1.a
    public i<b.Generic, DynamicMultiDocumentFullData> b() {
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData = this.multiDocumentData;
        return dynamicMultiDocumentFullData != null ? new i.Right(dynamicMultiDocumentFullData) : new i.Left(new b.Generic(new Exception("Document data is unitialized")));
    }

    @Override // nv1.a
    public void c(DynamicMultiDocumentFullData dynamicMultiDocumentData) {
        this.multiDocumentData = dynamicMultiDocumentData;
    }
}
