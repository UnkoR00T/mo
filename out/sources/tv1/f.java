package tv1;

import gv1.s;
import mv1.DynamicDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltv1/f;", "Ltv1/e;", "Lev1/a;", "dynamicDecoder", "<init>", "(Lev1/a;)V", "Lmv1/c;", "documentData", "", "b", "(Lmv1/c;)Ljava/lang/String;", "c", "a", "d", "Lev1/a;", "getDynamicDecoder", "()Lev1/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f192468c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDecoder;

    public f(ev1.a aVar) {
        this.dynamicDecoder = aVar;
    }

    @Override // tv1.e
    public String a(DynamicDocumentData documentData) {
        return ev1.a.f(this.dynamicDecoder, s.TEXT, "container.schoolName", null, null, documentData.getScope(), null, 32, null);
    }

    @Override // tv1.e
    public String b(DynamicDocumentData documentData) {
        return ev1.a.f(this.dynamicDecoder, s.TEXT, "container.firstName", null, null, documentData.getScope(), null, 32, null);
    }

    @Override // tv1.e
    public String c(DynamicDocumentData documentData) {
        return ev1.a.f(this.dynamicDecoder, s.TEXT, "container.lastName", null, null, documentData.getScope(), null, 32, null);
    }

    @Override // tv1.e
    public String d(DynamicDocumentData documentData) {
        String strF;
        String sourceContainerRef = documentData.getSchema().getPicture().getSourceContainerRef();
        return (sourceContainerRef == null || (strF = ev1.a.f(this.dynamicDecoder, s.TEXT, sourceContainerRef, null, null, documentData.getScope(), null, 44, null)) == null) ? documentData.getMainDocumentPhoto() : strF;
    }
}
