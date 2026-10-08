package rb0;

import fr.t;
import iy.b0;
import iy.c0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import yf0.DocumentSchemaBooleanTranslation;
import yf0.DocumentSchemaEnumTranslation;
import yf0.DocumentSchemaLabel;
import yf0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J!\u0010\u0017\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J]\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lrb0/k;", "Lrb0/j;", "Lez/e;", "dateFormatter", "Lrb0/i;", "documentRemoteResourcesMapper", "Lay/i;", "jsonFieldParser", "<init>", "(Lez/e;Lrb0/i;Lay/i;)V", "", "enumKey", "", "Lyf0/h;", "enumTranslations", "e", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "booleanKey", "Lyf0/g;", "booleanTranslations", "d", "Lyf0/j;", AnnotatedPrivateKey.LABEL, "a", "(Ljava/util/List;)Ljava/lang/String;", "Lyf0/n;", "fieldDataType", "fieldReference", "fieldsReference", "Liy/b0;", "jsonValue", "b", "(Lyf0/n;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Liy/b0;Ljava/util/List;)Ljava/lang/String;", "Lez/e;", "Lrb0/i;", "c", "Lay/i;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f172907e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.i jsonFieldParser;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172911a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.DATE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f172911a = iArr;
        }
    }

    public k(ez.e eVar, i iVar, ay.i iVar2) {
        this.dateFormatter = eVar;
        this.documentRemoteResourcesMapper = iVar;
        this.jsonFieldParser = iVar2;
    }

    private final String d(String booleanKey, List<DocumentSchemaBooleanTranslation> booleanTranslations) {
        if (booleanTranslations.isEmpty()) {
            return null;
        }
        DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation = booleanTranslations.get(0);
        return Boolean.parseBoolean(booleanKey) ? a(documentSchemaBooleanTranslation.b()) : a(documentSchemaBooleanTranslation.a());
    }

    private final String e(String enumKey, List<DocumentSchemaEnumTranslation> enumTranslations) {
        for (DocumentSchemaEnumTranslation documentSchemaEnumTranslation : enumTranslations) {
            if (t.c(documentSchemaEnumTranslation.getEnumValue(), enumKey)) {
                return a(documentSchemaEnumTranslation.a());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // rb0.j
    public String a(List<DocumentSchemaLabel> label) {
        if (label != null) {
            return this.documentRemoteResourcesMapper.a(label);
        }
        return null;
    }

    @Override // rb0.j
    public String b(n fieldDataType, String fieldReference, List<String> fieldsReference, List<DocumentSchemaEnumTranslation> enumTranslations, b0 jsonValue, List<DocumentSchemaBooleanTranslation> booleanTranslations) {
        String str;
        switch (b.f172911a[fieldDataType.ordinal()]) {
            case 1:
                StringBuilder sb5 = new StringBuilder();
                if (fieldsReference != null) {
                    Iterator<T> it = fieldsReference.iterator();
                    while (it.hasNext()) {
                        String strB = this.jsonFieldParser.b((String) it.next(), jsonValue != null ? c0.e(jsonValue) : null);
                        if (strB != null) {
                            sb5.append(strB + ' ');
                        }
                    }
                } else {
                    String strB2 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                    if (strB2 != null) {
                        sb5.append(strB2);
                    }
                }
                return sb5.toString();
            case 2:
                String strB3 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                if (strB3 != null) {
                    return this.dateFormatter.d(new fz.b.String(strB3, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
                }
                return null;
            case 3:
                String strB4 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                if (strB4 != null) {
                    return this.dateFormatter.d(new fz.b.String(strB4, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
                }
                return null;
            case 4:
                String strB5 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                str = strB5 != null ? strB5 : "";
                if (enumTranslations == null) {
                    enumTranslations = v.n();
                }
                return e(str, enumTranslations);
            case 5:
                String strB6 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                str = strB6 != null ? strB6 : "";
                if (booleanTranslations == null) {
                    booleanTranslations = v.n();
                }
                return d(str, booleanTranslations);
            case 6:
                return null;
            default:
                return this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
        }
    }
}
