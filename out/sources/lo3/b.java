package lo3;

import eo3.DocumentConfigLabel;
import eo3.DocumentSchemaLabel;
import fr.t;
import java.util.List;
import java.util.NoSuchElementException;
import jx.g;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo3/b;", "", "Ljx/g;", "systemInfo", "<init>", "(Ljx/g;)V", "", "Leo3/a;", AnnotatedPrivateKey.LABEL, "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Ljx/g;", "getSystemInfo", "()Ljx/g;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g systemInfo;

    public b(g gVar) {
        this.systemInfo = gVar;
    }

    public final String a(List<DocumentConfigLabel> label) {
        DocumentConfigLabel documentConfigLabel;
        try {
            try {
                for (Object obj : label) {
                    DocumentSchemaLabel.a language = ((DocumentConfigLabel) obj).getLanguage();
                    if (t.c(language != null ? language.getValue() : null, this.systemInfo.n())) {
                        documentConfigLabel = (DocumentConfigLabel) obj;
                        if (documentConfigLabel != null) {
                            return documentConfigLabel.getValue();
                        }
                        return null;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                documentConfigLabel = (DocumentConfigLabel) v.n0(label);
            }
        } catch (NoSuchElementException unused2) {
            for (Object obj2 : label) {
                if (((DocumentConfigLabel) obj2).getLanguage() == DocumentSchemaLabel.a.PL) {
                    documentConfigLabel = (DocumentConfigLabel) obj2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
