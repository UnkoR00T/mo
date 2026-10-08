package y34;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly34/a;", "Lj34/a;", "Lmx/c;", "labelProvider", "Lg34/b;", "documentRemoteResourcesMapper", "<init>", "(Lmx/c;Lg34/b;)V", "Lj34/a$a;", "params", "Lcb4/d;", "c", "(Lj34/a$a;)Lcb4/d;", "a", "Lmx/c;", "b", "Lg34/b;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements j34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g34.b documentRemoteResourcesMapper;

    public a(mx.c cVar, g34.b bVar) {
        this.labelProvider = cVar;
        this.documentRemoteResourcesMapper = bVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(j34.a.Params params) {
        h.b bVar = h.b.f24985a;
        String strA = this.documentRemoteResourcesMapper.a(params.getMaintenanceBreak().b());
        if (strA == null) {
            strA = "";
        }
        Label labelB = mx.b.b(strA, "title");
        String strA2 = this.documentRemoteResourcesMapper.a(params.getMaintenanceBreak().a());
        return new DialogData(bVar, labelB, strA2 != null ? mx.b.b(strA2, "body") : null, new DialogButtonTextData(this.labelProvider.c(f34.a.f59004b), null, params.b(), 2, null), null, null, params.b(), 48, null);
    }
}
