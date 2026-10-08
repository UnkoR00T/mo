# Paczka 206 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `tv1/d.java`

## tv1/d.java

```java
package tv1;

import ay.i;
import eu.k;
import fr.t;
import fu.r;
import gv1.DocumentSchemaAttribute;
import gv1.DocumentSchemaBooleanTranslation;
import gv1.DocumentSchemaEnumTranslation;
import gv1.DocumentSchemaLabel;
import gv1.MissingDocumentAttribute;
import gv1.s;
import iy.b0;
import iy.c0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONObject;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J7\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0004\u0018\u00010\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\fH\u0016¢\u0006\u0004\b!\u0010\"J]\u0010'\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fH\u0016¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010&\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106¨\u00067"}, d2 = {"Ltv1/d;", "Lev1/a;", "Lez/e;", "dateFormatter", "Lvv1/a;", "documentRemoteResourcesMapper", "Lay/i;", "jsonFieldParser", "<init>", "(Lez/e;Lvv1/a;Lay/i;)V", "", "enumKey", "", "Lgv1/l;", "enumTranslations", "m", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "booleanKey", "Lgv1/k;", "booleanTranslations", "l", "fieldReference", "Lgv1/t;", "data", "Lgv1/u;", "onMissingAttribute", "Lkotlin/Function0;", "Loq/i0;", "filterCallback", "i", "(Ljava/lang/String;Liy/b0;Lgv1/u;Ler/a;)V", "Lgv1/o;", AnnotatedPrivateKey.LABEL, "a", "(Ljava/util/List;)Ljava/lang/String;", "Lgv1/s;", "fieldDataType", "fieldsReference", "jsonValue", "c", "(Lgv1/s;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Liy/b0;Ljava/util/List;)Ljava/lang/String;", "documentPeselFieldReference", "Liy/b0;", "e", "(Ljava/lang/String;Liy/b0;)Liy/b0;", "Lgv1/j;", "documentSchemaAttributes", "b", "(Ljava/util/List;Liy/b0;)Ljava/util/List;", "", "d", "(Ljava/lang/String;Liy/b0;)Z", "Lez/e;", "Lvv1/a;", "Lay/i;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements ev1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f192462e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vv1.a documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i jsonFieldParser;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192466a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.DATE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.MULTILINE_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f192466a = iArr;
        }
    }

    public d(ez.e eVar, vv1.a aVar, i iVar) {
        this.dateFormatter = eVar;
        this.documentRemoteResourcesMapper = aVar;
        this.jsonFieldParser = iVar;
    }

    private final void i(String fieldReference, b0 data, MissingDocumentAttribute onMissingAttribute, er.a<i0> filterCallback) {
        if (d((String) v.x0(r.V0(fieldReference, new String[]{"."}, false, 0, 6, null)), data)) {
            filterCallback.a();
        } else {
            if (onMissingAttribute == null || onMissingAttribute.getOnMissing() != MissingDocumentAttribute.a.DEFAULT_VALUE) {
                return;
            }
            filterCallback.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(Set set, DocumentSchemaAttribute documentSchemaAttribute) {
        set.add(documentSchemaAttribute);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(Set set, DocumentSchemaAttribute documentSchemaAttribute) {
        set.add(documentSchemaAttribute);
        return i0.f148189a;
    }

    private final String l(String booleanKey, List<DocumentSchemaBooleanTranslation> booleanTranslations) {
        if (booleanTranslations.isEmpty()) {
            return null;
        }
        DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation = booleanTranslations.get(0);
        return Boolean.parseBoolean(booleanKey) ? a(documentSchemaBooleanTranslation.b()) : a(documentSchemaBooleanTranslation.a());
    }

    private final String m(String enumKey, List<DocumentSchemaEnumTranslation> enumTranslations) {
        for (DocumentSchemaEnumTranslation documentSchemaEnumTranslation : enumTranslations) {
            if (t.c(documentSchemaEnumTranslation.getEnumValue(), enumKey)) {
                return a(documentSchemaEnumTranslation.a());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // ev1.a
    public String a(List<DocumentSchemaLabel> label) {
        if (label != null) {
            return this.documentRemoteResourcesMapper.a(label);
        }
        return null;
    }

    @Override // ev1.a
    public List<DocumentSchemaAttribute> b(List<DocumentSchemaAttribute> documentSchemaAttributes, b0 data) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (final DocumentSchemaAttribute documentSchemaAttribute : documentSchemaAttributes) {
            String fieldReference = documentSchemaAttribute.getFieldReference();
            if (fieldReference != null) {
                i(fieldReference, data, documentSchemaAttribute.getOnMissingAttribute(), new er.a() { // from class: tv1.b
                    @Override // er.a
                    public final Object a() {
                        return d.j(linkedHashSet, documentSchemaAttribute);
                    }
                });
            } else {
                List<String> listE = documentSchemaAttribute.e();
                if (listE != null) {
                    Iterator<T> it = listE.iterator();
                    while (it.hasNext()) {
                        i((String) it.next(), data, documentSchemaAttribute.getOnMissingAttribute(), new er.a() { // from class: tv1.c
                            @Override // er.a
                            public final Object a() {
                                return d.k(linkedHashSet, documentSchemaAttribute);
                            }
                        });
                    }
                }
            }
        }
        return v.f1(linkedHashSet);
    }

    @Override // ev1.a
    public String c(s fieldDataType, String fieldReference, List<String> fieldsReference, List<DocumentSchemaEnumTranslation> enumTranslations, b0 jsonValue, List<DocumentSchemaBooleanTranslation> booleanTranslations) {
        switch (b.f192466a[fieldDataType.ordinal()]) {
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
                return m(strB5 != null ? strB5 : "", enumTranslations == null ? v.n() : enumTranslations);
            case 5:
                String strB6 = this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                return l(strB6 != null ? strB6 : "", booleanTranslations == null ? v.n() : booleanTranslations);
            case 6:
                List<String> listC = this.jsonFieldParser.c(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
                if (listC != null) {
                    return v.v0(listC, "\n", null, null, 0, null, null, 62, null);
                }
                return null;
            case 7:
                return null;
            default:
                return this.jsonFieldParser.b(fieldReference, jsonValue != null ? c0.e(jsonValue) : null);
        }
    }

    @Override // ev1.a
    public boolean d(String fieldReference, b0 data) {
        Object next;
        JSONObject jSONObject = new JSONObject(c0.e(data));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Iterator it = k.g(jSONObject.getJSONObject(itKeys.next()).keys()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c((String) next, fieldReference));
            if (((String) next) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ev1.a
    public b0 e(String documentPeselFieldReference, b0 jsonValue) {
        String strF = ev1.a.f(this, s.TEXT, documentPeselFieldReference, null, null, jsonValue, null, 44, null);
        if (strF != null) {
            return c0.g(strF);
        }
        return null;
    }
}

```
