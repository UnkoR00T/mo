package rb0;

import iy.b0;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import yf0.DocumentSchemaBooleanTranslation;
import yf0.DocumentSchemaEnumTranslation;
import yf0.DocumentSchemaLabel;
import yf0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007Jc\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lrb0/j;", "", "", "Lyf0/j;", AnnotatedPrivateKey.LABEL, "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Lyf0/n;", "fieldDataType", "fieldReference", "fieldsReference", "Lyf0/h;", "enumTranslations", "Liy/b0;", "jsonValue", "Lyf0/g;", "booleanTranslations", "b", "(Lyf0/n;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Liy/b0;Ljava/util/List;)Ljava/lang/String;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String c(j jVar, n nVar, String str, List list, List list2, b0 b0Var, List list3, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getValueByType");
        }
        if ((i15 & 4) != 0) {
            list = null;
        }
        if ((i15 & 8) != 0) {
            list2 = null;
        }
        if ((i15 & 32) != 0) {
            list3 = null;
        }
        return jVar.b(nVar, str, list, list2, b0Var, list3);
    }

    String a(List<DocumentSchemaLabel> label);

    String b(n fieldDataType, String fieldReference, List<String> fieldsReference, List<DocumentSchemaEnumTranslation> enumTranslations, b0 jsonValue, List<DocumentSchemaBooleanTranslation> booleanTranslations);
}
