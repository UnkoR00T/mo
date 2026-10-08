package p056h1;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import r0.g1;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh1/w2;", "", "<init>", "()V", CMSAttributeTableGenerator.CONTENT_TYPE, "Lh1/c;", "a", "(Ljava/lang/Object;)Lh1/c;", "Lr0/t0;", "Lr0/t0;", "averagesByContentType", "b", "Ljava/lang/Object;", "lastUsedContentType", "c", "Lh1/c;", "lastUsedAverage", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, c> averagesByContentType = g1.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object lastUsedContentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c lastUsedAverage;

    public final c a(Object contentType) {
        c cVar = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && cVar != null) {
            return cVar;
        }
        t0<Object, c> t0Var = this.averagesByContentType;
        c cVarE = t0Var.e(contentType);
        if (cVarE == null) {
            cVarE = new c();
            t0Var.x(contentType, cVarE);
        }
        c cVar2 = cVarE;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = cVar2;
        return cVar2;
    }
}
