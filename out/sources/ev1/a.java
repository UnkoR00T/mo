package ev1;

import gv1.DocumentSchemaAttribute;
import gv1.DocumentSchemaBooleanTranslation;
import gv1.DocumentSchemaEnumTranslation;
import gv1.DocumentSchemaLabel;
import gv1.s;
import iy.b0;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007Jc\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u001a\u001a\u00020\u000eH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lev1/a;", "", "", "Lgv1/o;", AnnotatedPrivateKey.LABEL, "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Lgv1/s;", "fieldDataType", "fieldReference", "fieldsReference", "Lgv1/l;", "enumTranslations", "Lgv1/t;", "jsonValue", "Lgv1/k;", "booleanTranslations", "c", "(Lgv1/s;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Liy/b0;Ljava/util/List;)Ljava/lang/String;", "documentPeselFieldReference", "Liy/b0;", "e", "(Ljava/lang/String;Liy/b0;)Liy/b0;", "Lgv1/j;", "documentSchemaAttributes", "data", "b", "(Ljava/util/List;Liy/b0;)Ljava/util/List;", "", "d", "(Ljava/lang/String;Liy/b0;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String f(a aVar, s sVar, String str, List list, List list2, b0 b0Var, List list3, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getValueByType-WBlUfug");
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
        return aVar.c(sVar, str, list, list2, b0Var, list3);
    }

    String a(List<DocumentSchemaLabel> label);

    List<DocumentSchemaAttribute> b(List<DocumentSchemaAttribute> documentSchemaAttributes, b0 data);

    String c(s fieldDataType, String fieldReference, List<String> fieldsReference, List<DocumentSchemaEnumTranslation> enumTranslations, b0 jsonValue, List<DocumentSchemaBooleanTranslation> booleanTranslations);

    boolean d(String fieldReference, b0 data);

    b0 e(String documentPeselFieldReference, b0 jsonValue);
}
