package hc4;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhc4/a;", "Lbc4/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lbc4/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Lbc4/a$a;)Ldx/i;", "a", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements bc4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b, i0> a(bc4.a.Params params) {
        return params.getUploadedFilesSizeLimit().getCurrentSizeInBytes() + params.getCurrentFileSize() > params.getUploadedFilesSizeLimit().getMaxAllowedSizeInBytes() ? new dx.i.Left(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217914l), this.labelProvider.e(xb4.a.f217913k, yb4.a.a(params.getUploadedFilesSizeLimit().getMaxAllowedSizeInBytes() / 1000000.0f)), null, this.labelProvider.c(xb4.a.f217904b), null, 83, null)) : new dx.i.Right(i0.f148189a);
    }
}
