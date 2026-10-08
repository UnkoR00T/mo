package rb0;

import fr.t;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import yf0.DocumentSchemaLabel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrb0/i;", "", "Ljx/g;", "systemInfo", "<init>", "(Ljx/g;)V", "", "Lyf0/j;", AnnotatedPrivateKey.LABEL, "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Ljx/g;", "getSystemInfo", "()Ljx/g;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    public i(jx.g gVar) {
        this.systemInfo = gVar;
    }

    public final String a(List<DocumentSchemaLabel> label) {
        DocumentSchemaLabel documentSchemaLabel;
        try {
            try {
                for (Object obj : label) {
                    if (t.c(((DocumentSchemaLabel) obj).getLanguage().getValue(), this.systemInfo.n())) {
                        documentSchemaLabel = (DocumentSchemaLabel) obj;
                        if (documentSchemaLabel != null) {
                            return documentSchemaLabel.getValue();
                        }
                        return null;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                documentSchemaLabel = (DocumentSchemaLabel) v.n0(label);
            }
        } catch (NoSuchElementException unused2) {
            for (Object obj2 : label) {
                if (((DocumentSchemaLabel) obj2).getLanguage() == DocumentSchemaLabel.a.PL) {
                    documentSchemaLabel = (DocumentSchemaLabel) obj2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
