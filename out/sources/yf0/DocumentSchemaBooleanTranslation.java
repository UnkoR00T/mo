package yf0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yf0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyf0/g;", "", "", "Lyf0/j;", "trueTranslations", "falseTranslations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaBooleanTranslation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> trueTranslations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> falseTranslations;

    public DocumentSchemaBooleanTranslation(List<DocumentSchemaLabel> list, List<DocumentSchemaLabel> list2) {
        this.trueTranslations = list;
        this.falseTranslations = list2;
    }

    public final List<DocumentSchemaLabel> a() {
        return this.falseTranslations;
    }

    public final List<DocumentSchemaLabel> b() {
        return this.trueTranslations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaBooleanTranslation)) {
            return false;
        }
        DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation = (DocumentSchemaBooleanTranslation) other;
        return t.c(this.trueTranslations, documentSchemaBooleanTranslation.trueTranslations) && t.c(this.falseTranslations, documentSchemaBooleanTranslation.falseTranslations);
    }

    public int hashCode() {
        return (this.trueTranslations.hashCode() * 31) + this.falseTranslations.hashCode();
    }

    public String toString() {
        return "DocumentSchemaBooleanTranslation(trueTranslations=" + this.trueTranslations + ", falseTranslations=" + this.falseTranslations + ")";
    }
}
