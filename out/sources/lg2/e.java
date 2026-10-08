package lg2;

import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import tq0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llg2/e;", "Llg2/d;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ltq0/k;", "param", "Lmx/a;", "c", "(Ltq0/k;)Lmx/a;", "a", "Lmx/c;", "b", "Lez/e;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    public e(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Label b(k param) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (param instanceof k.Generating) {
            i15 = xf2.a.f218348b1;
        } else if (param instanceof k.ToDownload) {
            i15 = xf2.a.f218357e1;
        } else if (param instanceof k.AboutToExpire) {
            i15 = xf2.a.Y0;
        } else if (param instanceof k.Expired) {
            i15 = xf2.a.f218345a1;
        } else if (param instanceof k.Rejected) {
            i15 = xf2.a.f218354d1;
        } else if (param instanceof k.GenericError) {
            i15 = xf2.a.Z0;
        } else {
            if (!(param instanceof k.PaymentError)) {
                throw new p();
            }
            i15 = xf2.a.f218351c1;
        }
        Label labelC = cVar.c(i15);
        if (!(param instanceof k.AboutToExpire)) {
            return labelC;
        }
        fz.b.OffsetDateTime documentDownloadValidUntil = ((k.AboutToExpire) param).getDocumentDownloadValidUntil();
        if (documentDownloadValidUntil == null) {
            return this.labelProvider.c(xf2.a.f218357e1);
        }
        return mx.b.b(labelC.getText() + ' ' + this.dateFormatter.d(documentDownloadValidUntil, fz.c.DOTTED_PLUS_HOUR), "land_registry_ordered_documents_status_about_to_expire_title");
    }
}
