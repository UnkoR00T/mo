package od4;

import gr0.DocumentSchemaLabel;
import gr0.s;
import gv1.DocumentSchemaBooleanTranslation;
import gv1.DocumentSchemaEnumTranslation;
import gv1.h;
import java.util.ArrayList;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\b\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004*\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\b\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgr0/s;", "Lgv1/s;", "e", "(Lgr0/s;)Lgv1/s;", "", "Lgr0/k;", "Lgv1/l;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lgr0/j;", "Lgv1/k;", "a", "Lgr0/n;", "Lgv1/o;", "d", "Lgr0/n$a;", "Lgv1/h;", "c", "(Lgr0/n$a;)Lgv1/h;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: od4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3595a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f144979b;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f144978a = iArr;
            int[] iArr2 = new int[DocumentSchemaLabel.a.values().length];
            try {
                iArr2[DocumentSchemaLabel.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentSchemaLabel.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentSchemaLabel.a.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f144979b = iArr2;
        }
    }

    public static final List<DocumentSchemaBooleanTranslation> a(List<gr0.DocumentSchemaBooleanTranslation> list) {
        List<gr0.DocumentSchemaBooleanTranslation> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (gr0.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation : list2) {
            arrayList.add(new DocumentSchemaBooleanTranslation(d(documentSchemaBooleanTranslation.b()), d(documentSchemaBooleanTranslation.a())));
        }
        return arrayList;
    }

    public static final List<DocumentSchemaEnumTranslation> b(List<gr0.DocumentSchemaEnumTranslation> list) {
        List<gr0.DocumentSchemaEnumTranslation> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (gr0.DocumentSchemaEnumTranslation documentSchemaEnumTranslation : list2) {
            arrayList.add(new DocumentSchemaEnumTranslation(documentSchemaEnumTranslation.getEnumValue(), d(documentSchemaEnumTranslation.a())));
        }
        return arrayList;
    }

    public static final h c(DocumentSchemaLabel.a aVar) {
        int i15 = C3595a.f144979b[aVar.ordinal()];
        if (i15 == 1) {
            return h.PL;
        }
        if (i15 == 2) {
            return h.EN;
        }
        if (i15 == 3) {
            return h.UK;
        }
        if (i15 == 4) {
            return h.UNKNOWN;
        }
        throw new p();
    }

    public static final List<gv1.DocumentSchemaLabel> d(List<DocumentSchemaLabel> list) {
        List<DocumentSchemaLabel> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (DocumentSchemaLabel documentSchemaLabel : list2) {
            arrayList.add(new gv1.DocumentSchemaLabel(c(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue()));
        }
        return arrayList;
    }

    public static final gv1.s e(s sVar) {
        switch (C3595a.f144978a[sVar.ordinal()]) {
            case 1:
                return gv1.s.DATE;
            case 2:
                return gv1.s.DATE_TIME;
            case 3:
                return gv1.s.TEXT;
            case 4:
                return gv1.s.NAME;
            case 5:
                return gv1.s.NUMBER;
            case 6:
                return gv1.s.NOTE;
            case 7:
                return gv1.s.ENUM;
            case 8:
                return gv1.s.BOOLEAN;
            case 9:
                return gv1.s.MULTILINE_TEXT;
            case 10:
                return gv1.s.UNKNOWN;
            default:
                throw new p();
        }
    }
}
